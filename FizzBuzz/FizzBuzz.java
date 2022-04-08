package David_Aufgaben.FizzBuzz;

public class FizzBuzz {

    //Attributes
    private Integer startCount;
    private Integer endCount;
    private Integer isDivisorNr1;
    private Integer isDivisorNr2;
    private Expression expression;          //contains a set of two strings

    //Constructor
    public FizzBuzz() {             //default
        this.startCount = 1;
        this.endCount = 100;
        this.isDivisorNr1 = 3;
        this.isDivisorNr2 = 5;
        this.expression = new Expression("fizz", "buzz");
    }

    public FizzBuzz(Integer startCount, Integer endCount, Integer isDivisorNr1, Integer isDivisorNr2, Expression expression) {
        this.startCount = startCount;
        this.endCount = endCount;
        this.isDivisorNr1 = isDivisorNr1;
        this.isDivisorNr2= isDivisorNr2;
        this.expression = expression;
    }

    /**
     * Counts up to from 'startCount' to 'endCount'.
     * Replaces numbers dividable by 'isDivisorNr1' with 'DivisorExpression_Nr1' from class 'expression'. 'isDivisorNr2' is analogous.
     * If a number is dividable by both divisors, 'combinedExpression' is printed out.
     */
    public String replaceNumbers() {
        String result = new String();
        for (int i = this.startCount; i <= this.endCount; i++) {
            if (i % isDivisorNr1 == 0) {
                result += this.expression.getDivisorExpression_Nr1();
                if (i % isDivisorNr2 == 0) {
                    result += this.expression.getDivisorExpression_Nr2();
                }
            }
            else if (i % isDivisorNr2 == 0) {
                result += this.expression.getDivisorExpression_Nr2();
                }
            else {
                result += i;
            }
        }
        return result;
    }
}
