package education;

public class MarkSeminar extends Mark{

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
}
