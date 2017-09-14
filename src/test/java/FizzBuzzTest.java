import FizzBuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ahmed Jerid <ahmed.jerid@olbati.com>
 *         Date: 14/09/2017
 */
public class FizzBuzzTest {


    private FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }


    @Test
    public void should_return_input_number() {
        //when
        String result = fizzBuzz.run(2);
        //then
        Assert.assertEquals(result, "2");

    }

    @Test
    public void should_return_fizz_when_input_number_is_divisible_by_three() {
        //when
        String result = fizzBuzz.run(3);
        //then
        Assert.assertEquals(result, "Fizz");

    }

    @Test
    public void should_return_buzz_when_input_number_is_divisible_by_five() {
        //when
        String result = fizzBuzz.run(5);
        //then
        Assert.assertEquals(result, "Buzz");

    }



}
