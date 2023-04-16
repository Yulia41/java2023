package education;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarkTest {
Mark mark;
@BeforeEach
void data(){
    mark=new Mark("Имя","дисциплина",new ArrayList<Task>());
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