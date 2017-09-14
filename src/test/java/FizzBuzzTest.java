import FizzBuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ahmed Jerid <ahmed.jerid@olbati.com>
 *         Date: 14/09/2017
 */
public class FizzBuzzTest {

    @Test
    public void should_return_input_number() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.run(2);
        //then
        Assert.assertEquals(result, "2");

    }

}
