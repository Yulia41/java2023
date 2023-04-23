package education;

public class MarkModule extends  Mark implements TaskImp{
    @Override
    public String toString() {
        return "MarkModule"+super.toString();
    }
    @Override
    public void addTaskList(Task task) {
        if(getTaskList().size() < 2){
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
