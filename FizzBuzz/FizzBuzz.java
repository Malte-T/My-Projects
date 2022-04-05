package FizzBuzz;

public class FizzBuzz {

    /**
     * Counts from 1 to 100.
     * Replaces every number dividable by 3 with 'Fizz' and every number dividable by 5 with 'Buzz'.
     * If a number can be divided by 3 and 5, it is replaced with 'FizzBuzz'.
     */
    public void counting() {
        for (int increasingNumber = 1; increasingNumber <= 100; increasingNumber++) {
            if (increasingNumber % 3 == 0 & increasingNumber % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (increasingNumber % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (increasingNumber % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(increasingNumber);
            }
        }
    }
}
