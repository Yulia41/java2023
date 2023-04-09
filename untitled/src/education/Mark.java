package education;

import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Mark {


    private int grade;
    private String teacher;
    private String discipline;


    @Override
    public String toString() {
        return "{" +
                "grade=" + grade +
                ", teacher='" + teacher + '\'' +
                ", discipline='" + discipline + '\'' +
                '}';
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

