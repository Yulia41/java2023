package education;

public class TaskBuilderIMpl implements TaskBuilder {

    private String condition;
    private Complexity complexity;
    private String type;
    private String answer;

    @Override
    public TaskBuilder condition(String condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public TaskBuilder complexity(Complexity complexity) {
        this.complexity = complexity;
        return this;
    }

    @Override
    public TaskBuilder type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public TaskBuilder answer(String answer) {
        this.answer = answer;
        return this;
    }

    @Override
    public Task build() {
        return new Task(condition,complexity,type,answer);

    }
}
