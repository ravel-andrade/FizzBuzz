import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    @Test
    public void testBasicFizzBuzz(){
        Assertions.assertEquals(FizzBuzz.getValues(), "1\n2\nFizz\n");
    }

    @Test
    public void testAdvancedFizzBuzz(){
        Assertions.assertEquals(FizzBuzz.getValues(), "1\n2\nFizz\n4\nBuzz\nFizz\n7" +
                "\n8\nFizz\nBuzz\n11\nFizz\nFizz");
    }
}
