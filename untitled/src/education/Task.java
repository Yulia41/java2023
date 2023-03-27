package education;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
        int hard=(int)(Math.random()*4);//сложность задания(может попасть любое из трёх уровней сложности
        if(hard==0){//задание лёгкое, всегда решается
            return 100;//награждается 100 рублями
        }
        else if(hard==1){//задание средней сложности
            int a=(int)(Math.random()*2);//вероятность решения 50%
            if (a==1){//задание решено
                return 500;//награждение
            }
            else//задание не решено
                return 0;
        }
        else {//сложное задание
            int b=(int)(Math.random()*3);//вероятность решения 33%
            if (b==2){//задание решено
                return 1000;//вознаграждение
            }
            else//задание не решено
                return 0;
        }

    }
}
