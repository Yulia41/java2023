package education;

import lombok.*;

@Getter
@Setter
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
    public int hardTeacher(){//оценув зависит от жёсткости преподователя
        int hard=(int)(Math.random()*2);//может попасться жёсткий преподаватель
        if(hard==0){//попался жёсткий преподаватель
            return 0;//оценка 2, награждения нет
        }
        else {//попался добрый преподаватель
            int money=(int)(Math.random()*2);//вероятность получить 4 или 5
            if(money==0){//поставили 4
                return 500;
            }
            else//поставили 5
                return 1000;
        }

    }
}

