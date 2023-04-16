package education;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
Task task;
@BeforeEach
void data(){
    task=new Task("Условие",Complexity.HARD,"математика","ответ",10);
}

    @Test
    void getCondition() {
        assertEquals("Условие",task.getCondition());
    }

    @Test
    void getComplexity() {
        assertEquals(Complexity.HARD,task.getComplexity());
    }

    @Test
    void getType() {
        assertEquals("математика",task.getType());
    }

    @Test
    void getAnswer() {
        assertEquals("ответ",task.getAnswer());
    }
}