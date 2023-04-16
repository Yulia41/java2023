package education;

public class MarkExam extends Mark{


    @Override
    public String toString() {
        return "MarkExam"+super.toString();
    }
    @Override
    public void addTaskList(Task task) {
        if(getTaskList().size() < 3){
            getTaskList().add(task);
        }
    }

}
