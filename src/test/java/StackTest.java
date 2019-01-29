import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<String> stack;

    @BeforeEach
    public void createInstanceOfClass(){
        this.stack = new Stack<>();
    }

    @Test
    public void testCreateInstanceOfClassCorrectly(){
        assertNotNull(stack);
    }

    @Test
    public void testAddElementToList(){
        stack.push("test1");
    }

    @Test void  testPopReturnCorrectElement(){
        String expected = "test1";
        String expected2 = "test2";
        stack.push(expected);
        stack.push(expected2);
        assertEquals(expected2, stack.pop());
    }




}