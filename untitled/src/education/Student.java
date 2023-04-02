package education;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Student {
    private String firstName;
    private String secondName;
    private String group;
    private int age;
    private List<Mark> markList;

    public void addMarc(Mark mark){
        markList = new ArrayList<>();
        this.markList.add(mark);
    }


    public String progress(){
        int countMarcExam = 0;
        for(Mark mark: markList){
            if(mark instanceof MarkExam){
                countMarcExam++;
            }
        }
        double result = 12.5*countMarcExam;
        return result+"%";
    }
    public Student(String firstName, String secondName, String group, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.group = group;
        this.age = age;
    }




    public  int money(){//Вероятность решить задание хорошо=1/5
        int number =(int)(Math.random()*6);
        if (number==4){//Выбираем любое число от 1 до 5(вероятность одинакова)
            int teacher=(int)(Math.random()*2);//настроение преподователя
            if (teacher==1){//настроение преподавателя хорошее, следовательно за задание получено отлично
                return 1000;
            }
            else//настроение преподователя плохое, следовательно за задание получено хорошо
                return 100;
        }
        else//задание не решено
            return 0;
    }
}
