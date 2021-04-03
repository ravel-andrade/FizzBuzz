import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    @Test
    public void testFizzBuzz(){
        Assertions.assertEquals(FizzBuzz.getValues(), "1\n2\nFizz");
    }
}
