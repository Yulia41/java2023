package education;

public interface StudentBuilder {
    StudentBuilder FirstName(String firstName);
    StudentBuilder SecondName(String secondName);
    StudentBuilder Group(String group);
    StudentBuilder Age(int age);
    Student build();
}

