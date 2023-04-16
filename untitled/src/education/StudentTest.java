package education;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
Student student;
@BeforeEach
    void data(){
    student=new Student("Имя","Фамилия","группа",20,
            new ArrayList<Mark>(Arrays.asList(new MarkExam())));
}
//    @Test
//    void addMarc() {
//
//    }

//    @Test
//    void progress() {
//    }



    @Test
    void getFirstName() {
        assertEquals("Имя",student.getFirstName());
    }

    @Test
    void getSecondName() {
        assertEquals("Фамилия",student.getSecondName());
    }

    @Test
    void getGroup() {
        assertEquals("группа",student.getGroup());
    }

    @Test
    void getAge() {
        assertEquals(20,student.getAge());
    }

//    @Test
//    void getMarkList() {
//        assertEquals(Arrays.asList(new MarkExam()),student.getMarkList());
//    }
}