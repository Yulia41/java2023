package education;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Task {
    private String condition;
    private Complexity complexity;
    private String type;
    private String answer;

    public Task(String condition, Complexity complexity, String type, String answer) {
        this.condition = condition;
        this.complexity = complexity;
        this.type = type;
        this.answer = answer;
    }

    public int task() {
        //сложность задания(может попасть любое из трёх уровней сложности
        int hard=(int)(Math.random()*4);
        //задание лёгкое, всегда решается
        if(hard==0){
            //награждается 100 рублями
            return 100;
        }
        //задание средней сложности
        else if(hard==1){
            //вероятность решения 50%
            int a=(int)(Math.random()*2);
            //задание решено
            if (a==1){
                //награждение
                return 500;
            }
            //задание не решено
            else
                return 0;
        }
        //сложное задание
        else {
            //вероятность решения 33%
            int b=(int)(Math.random()*3);
            //задание решено
            if (b==2){
                //вознаграждение
                return 1000;
            }
            //задание не решено
            else
                return 0;
        }

    }
}
