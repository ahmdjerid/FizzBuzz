package FizzBuzz;

/**
 * @author Ahmed Jerid <ahmed.jerid@olbati.com>
 *         Date: 14/09/2017
 */
public class FizzBuzz {
    public String run(int number) {

        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
