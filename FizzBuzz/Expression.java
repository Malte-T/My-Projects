package David_Aufgaben.FizzBuzz;

public class Expression {

    //Attributes
    private String divisorExpression_Nr1;
    private String divisorExpression_Nr2;
    private String combinedExpression;

    //Constructor
    public Expression(String fizz, String buzz) {
        this.divisorExpression_Nr1 = fizz;
        this.divisorExpression_Nr2 = buzz;
        this.combinedExpression = fizz + "" + buzz;
    }

    //Getter and Setter
    public String getDivisorExpression_Nr1() {
        return this.divisorExpression_Nr1;
    }
    public void setDivisorExpression_Nr1(String divisorExpression_Nr1) {
        this.divisorExpression_Nr1 = divisorExpression_Nr1;
    }

    public String getDivisorExpression_Nr2() {
        return this.divisorExpression_Nr2;
    }
    public void setDivisorExpression_Nr2(String divisorExpression_Nr2) {
        this.divisorExpression_Nr2 = divisorExpression_Nr2;
    }

    public String getCombinedExpression() {
        return this.combinedExpression;
    }
    public void setCombinedExpression(String combinedExpression) {
        this.combinedExpression = combinedExpression;
    }
}
