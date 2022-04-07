package David_Aufgaben.FizzBuzz;

public class FizzBuzz {
    
    private Integer startCount;
    private Integer endCount;
    private Integer isDivisorNr1;
    private Integer isDivisorNr2;
    private Expression expression;          //contains a set of two strings

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
    public void replaceNumbers() {
        for (int i = this.startCount; i <= this.endCount; i++) {
            if (i % isDivisorNr1 == 0) {
                if (i % isDivisorNr2 == 0) {
                    System.out.println(this.expression.getCombinedExpression());
                }
                else {
                    System.out.println(this.expression.getDivisorExpression_Nr1());
                }
            }
            else if (i % isDivisorNr2 == 0) {
                if (i % isDivisorNr1 == 0) {
                    System.out.println(this.expression.getCombinedExpression());
                }
                else {
                    System.out.println(this.expression.getDivisorExpression_Nr2());
                }
            }
            else {
                System.out.println(i);
            }
        }
    }
}
