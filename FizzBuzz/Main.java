package David_Aufgaben.FizzBuzz;

public class Main {

    public static void main(String[] args) {
        Expression fizzleBuzzle = new Expression("Fizzle", "Buzzle");
        FizzBuzz  fizzBuzz = new FizzBuzz(-100, 50, 4, 6, fizzleBuzzle);
        fizzBuzz.replaceNumbers();
    }
}
