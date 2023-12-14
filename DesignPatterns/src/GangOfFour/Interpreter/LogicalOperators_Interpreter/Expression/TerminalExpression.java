package GangOfFour.Interpreter.LogicalOperators_Interpreter.Expression;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data) && !context.contains("not");
    }
}
