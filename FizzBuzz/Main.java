package David_Aufgaben.FizzBuzz;

public class Main {

    public static void main(String[] args) {
        Expression expression = new Expression("Fizzle", "Buzzle");
        FizzBuzz  fizzleBuzzle = new FizzBuzz(-100, 50, 4, 6, expression);
        System.out.println(fizzleBuzzle.replaceNumbers());

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.replaceNumbers());
    }
}
