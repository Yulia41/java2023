package education;

import lombok.Data;

import java.util.Comparator;
import java.util.List;

@Data
public class Group {
    private String ID;
    private List<Student> stGroup;

    public void addStGroup(Student student){
        stGroup.add(student);
    }

    public void sortGroup(SortType sortType) {
        switch (sortType) {
            case AGE -> {
                stGroup.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });
                break;
            }
            case FIRSTNAME -> {
                stGroup.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getFirstName().compareTo(o2.getFirstName());
                    }
                });
                break;
            }
            case SECONDNAME -> {
                stGroup.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getSecondName().compareTo(o2.getSecondName());
                    }
                });
                break;
            }

        }

    }

}