import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<String> stackString;
    private Stack<Integer> stackInt;

    @Test
    public void testCreateInstanceOfClassCorrectly(){
        this.stackString = new Stack<>();

        assertNotNull(stackString);
    }

    @Test
    public void testAddElementToList(){
        this.stackString = new Stack<>();
        stackString.push("test1");
        String expected = "test1";

        assertEquals(expected, this.stackString.peek());
    }

    @Test
    void testPopReturnCorrectElement(){
        this.stackString = new Stack<>();
        String expected = "test1";
        String expected2 = "test2";

        this.stackString.push(expected);
        this.stackString.push(expected2);

        assertEquals(expected2, stackString.pop());
    }

    @Test
    void testPeekMethodReturnNumber499(){
        this.stackInt = new Stack<>();
        IntStream.range(0,500)
                .forEach(i -> this.stackInt.push(i));

        int expected = 499;
        int actual = this.stackInt.pop();

        assertEquals(expected, actual);
    }

    @Test
    void testSizeMethodReturnNumbersOfElementsInStack(){
        this.stackInt = new Stack<>();
        IntStream.range(0,200)
                .forEach(i -> this.stackInt.push(i));

        int expected = 200;
        int actual = this.stackInt.size();

        assertEquals(expected, actual);
    }

    @Test
    void testMaxSizeMethodReturnMaximumCapacityOfStack(){
        this.stackInt = new Stack<>();
        int expected = 500;
        int actual = this.stackInt.maxSize();

        assertEquals(expected, actual);
    }

    @Test
    void testSpaceLeftReturn300Elements(){
        this.stackInt = new Stack<>();
        IntStream.range(0,200)
                .forEach(i -> this.stackInt.push(i));

        int expected = 300;
        int actual = this.stackInt.spaceLeft();

        assertEquals(expected, actual);
    }

    @Test
    void testStackOutOfMemoryExceptionIsThrowIfThereIsNoAnyFreeSpace(){
        this.stackInt = new Stack<>();
        IntStream.range(0,500)
                .forEach(i -> this.stackInt.push(i));

        assertThrows(StackOutOfMemoryException.class, () -> stackInt.push(1));
    }

    @Test
    void testStackThrowEmptyExceptionIfThereIsNoAnyElementInStack(){
        this.stackInt = new Stack<>();
        assertThrows(StackIsEmptyException.class, () -> stackInt.pop());
    }


}