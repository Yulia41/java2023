package education;

public interface TaskBuilder {
    TaskBuilder condition(String condition);
    TaskBuilder complexity(Complexity complexity);
    TaskBuilder type(String type);
    TaskBuilder answer(String answer);
    Task build();
}
