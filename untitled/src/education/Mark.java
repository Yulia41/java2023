package education;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mark {



    private String teacher;
    private String discipline;

    private List<Task> taskList = new ArrayList<Task>();

    public void addTaskList(Task task){

    }

    public int Grade(){
        int grade = 0;
        for(Task task : taskList){
            grade+= task.getScore();
        }
        return grade;
    }

    //оценка зависит от жёсткости преподователя
    public int hardTeacher(){
        //может попасться жёсткий преподаватель
        int hard=(int)(Math.random()*2);
        //попался жёсткий преподаватель
        if(hard==0){
            //оценка 2, награждения нет
            return 0;
        }
        //попался добрый преподаватель
        else {
            //вероятность получить 4 или 5
            int money=(int)(Math.random()*2);
            //поставили 4
            if(money==0){
                return 500;
            }
            //поставили 5
            else
                return 1000;
        }

    }
}

