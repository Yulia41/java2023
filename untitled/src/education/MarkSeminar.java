package education;

public class MarkSeminar extends Mark implements TaskImp {

    @Override
    public String toString() {
        return "MarkSeminar"+super.toString();
    }
    @Override
    public void addTaskList(Task task) {
        if(getTaskList().size() < 1){
            getTaskList().add(task);
        }
    }

    @Override
    public int Grade() {
        int grade = 0;
        for(Task task : getTaskList()){
            grade+= task.getScore();
        }
        return grade;
    }
}