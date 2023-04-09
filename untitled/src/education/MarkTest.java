package education;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarkTest {
Mark mark;
@BeforeEach
void data(){
    mark=new Mark(3,"Имя","дисциплина");
}



    @Test
    void getGrade() {
        assertEquals(3,mark.getGrade());

    }

    @Test
    void getTeacher() {
        assertEquals("Имя",mark.getTeacher());

    }

    @Test
    void getDiscipline() {
        assertEquals("дисциплина",mark.getDiscipline());

    }
}