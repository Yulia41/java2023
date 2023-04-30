package education;

import lombok.*;

import java.util.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Student {
    //коэффициент прогресса
    // за 4 года 8 сессий, 1 сессия=12,5% от общего количества всех сессий
    private final double PROGRESS_RATE = 12.5;
    private String firstName;
    private String secondName;
    private String group;
    private int age;
    private List<Mark> markList = new ArrayList<Mark>();


    public void addMarc(Mark mark) {
        this.markList.add(mark);
    }

    public String progress() {
        int countMarcExam = 0;
        for (Mark mark : markList) {
            if (mark instanceof MarkExam) {
                countMarcExam++;
            }
        }

        double result = PROGRESS_RATE * countMarcExam;
        return result + "%";
    }

    public void info() {
        Map<String, Integer> map = new HashMap<>();
        for (Mark mark : markList) {
            map.put(mark.getDiscipline(), 0);
        }

        for (String item : map.keySet()) {
            int score = 0;
            for (Mark mark : markList) {
                if (mark.getDiscipline().equals(item)) {
                    score += mark.Grade();
                }
            }
            map.put(item, score);
        }

        for (Map.Entry<String, Integer> maps : map.entrySet()) {
            System.out.println(maps.getKey() + " " + maps.getValue());
        }

    }


//    public Student(String firstName, String secondName, String group, int age, List<Mark> markList) {
//        this.firstName = firstName;
//        this.secondName = secondName;
//        this.group = group;
//        this.age = age;
//        this.markList = markList;
//    }

    public int money() {
        //Вероятность решить задание хорошо=1/5
        int number = (int) (Math.random() * 6);
        //Выбираем любое число от 1 до 5(вероятность одинакова)
        if (number == 4) {
            //настроение преподователя
            int teacher = (int) (Math.random() * 2);
            //настроение преподавателя хорошее, следовательно за задание получено отлично
            if (teacher == 1) {
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

    public static void main(String[] args) {
        Student student = new Student();
        Mark mark = new MarkFactory().createMark(MarkType.EXAM);
        mark.setDiscipline("Matematica");
        mark.addTaskList(new Task(null, null, null, null, 20));
        mark.addTaskList(new Task(null, null, null, null, 20));
        mark.addTaskList(new Task(null, null, null, null, 20));
        student.addMarc(mark);
        Mark mark1 = new MarkFactory().createMark(MarkType.SEMINAR);
        mark1.setDiscipline("Matematica");
        mark1.addTaskList(new Task(null, null, null, null, 20));
        mark1.addTaskList(new Task(null, null, null, null, 20));
        mark1.addTaskList(new Task(null, null, null, null, 20));
        student.addMarc(mark1);
        Mark mark2 = new MarkFactory().createMark(MarkType.EXAM);
        mark2.setDiscipline("Info");
        mark2.addTaskList(new Task(null, null, null, null, 20));
        mark2.addTaskList(new Task(null, null, null, null, 20));
        mark2.addTaskList(new Task(null, null, null, null, 20));
        student.addMarc(mark2);
        Mark mark3 = new MarkFactory().createMark(MarkType.SEMINAR);
        mark3.setDiscipline("Info");
        mark3.addTaskList(new Task(null, null, null, null, 20));
        mark3.addTaskList(new Task(null, null, null, null, 20));
        mark3.addTaskList(new Task(null, null, null, null, 20));
        student.addMarc(mark3);
        student.info();


//        Mark mark2 = new MarkFactory().createMark(MarkType.EXAM);
//        mark.setDiscipline("Informatica");
//        mark.addTaskList(new Task(null,null,null,null,20));
//        mark.addTaskList(new Task(null,null,null,null,20));
//        mark.addTaskList(new Task(null,null,null,null,20));
//        student.addMarc(mark);
//        Mark mark2 = new MarkFactory().createMark(MarkType.SEMINAR);
//        mark.setDiscipline("Informatica");
//        mark.addTaskList(new Task(null,null,null,null,20));
//        mark.addTaskList(new Task(null,null,null,null,20));
//        mark.addTaskList(new Task(null,null,null,null,20));
//        student.addMarc(mark);
//        student.info();

    }
}