import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void testCreateInstanceOfClassCorrectly(){
        Stack<String> stack = new Stack<>();
        assertNotNull(stack);
    }

}