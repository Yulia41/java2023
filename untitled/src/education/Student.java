package education;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@ToString
@Builder
public class Student {
    //коэффициент прогресса
    // за 4 года 8 сессий, 1 сессия=12,5% от общего количества всех сессий
    private final double PROGRESS_RATE=12.5;
    private String firstName;
    private String secondName;
    private String group;
    private int age;
    private List<Mark> markList=new ArrayList<Mark>();


    public void addMarc(Mark mark){
        this.markList.add(mark);
    }


    public String progress(){
        int countMarcExam = 0;
        for(Mark mark: markList){
            if(mark instanceof MarkExam){
                countMarcExam++;
            }
        }

        double result = PROGRESS_RATE*countMarcExam;
        return result+"%";
    }

    public Student(String firstName, String secondName, String group, int age, List<Mark> markList) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.group = group;
        this.age = age;
        this.markList = markList;
    }

    public  int money(){
        //Вероятность решить задание хорошо=1/5
        int number =(int)(Math.random()*6);
        //Выбираем любое число от 1 до 5(вероятность одинакова)
        if (number==4){
            //настроение преподователя
            int teacher=(int)(Math.random()*2);
            //настроение преподавателя хорошее, следовательно за задание получено отлично
            if (teacher==1){
                return 1000;
            }
            //настроение преподователя плохое, следовательно за задание получено хорошо
            else
                return 100;
        }
        //задание не решено
        else
            return 0;
    }
}
