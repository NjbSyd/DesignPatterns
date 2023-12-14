package GangOfFour.Interpreter.LogicalOperators_Interpreter.Expression;

public class DaughterExpression implements Expression{
    private Expression exp1, exp2;

    public DaughterExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
