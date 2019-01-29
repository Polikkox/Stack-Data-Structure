import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<String> stackString;
    private Stack<Integer> stackInt;

    @BeforeEach
    public void createInstanceOfClass(){
        this.stackString = new Stack<>();
        this.stackInt = new Stack<>();
    }

    @Test
    public void testCreateInstanceOfClassCorrectly(){
        assertNotNull(stackString);
    }

    @Test
    public void testAddElementToList(){
        stackString.push("test1");
    }

    @Test
    void testPopReturnCorrectElement(){
        String expected = "test1";
        String expected2 = "test2";

        this.stackString.push(expected);
        this.stackString.push(expected2);

        assertEquals(expected2, stackString.pop());
    }

    @Test
    void testPeekMethodReturnCorrectValue(){
        IntStream.range(0,501)
                .forEach(i -> this.stackInt.push(i));

        int expected = 500;
        int actual = this.stackInt.pop();

        assertEquals(expected, actual);
    }

    @Test
    void testSizeMethodReturnNumbersOfElementsInStack(){
        IntStream.range(0,200)
                .forEach(i -> this.stackInt.push(i));

        int expected = 199;
        int actual = this.stackInt.size();

        assertEquals(expected, actual);
    }


}