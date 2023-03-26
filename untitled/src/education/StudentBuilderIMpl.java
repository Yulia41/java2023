package education;

public class StudentBuilderIMpl  implements StudentBuilder{
    private String firstName;
    private String secondName;
    private String group;
    private int age;
    @Override
    public StudentBuilder FirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public StudentBuilder SecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    @Override
    public StudentBuilder Group(String group) {
      this.group = group;
        return this;
    }

    @Override
    public StudentBuilder Age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Student build() {
        return new Student(firstName,secondName,group,age);
    }
}
