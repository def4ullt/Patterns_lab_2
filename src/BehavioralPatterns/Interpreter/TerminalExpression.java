package BehavioralPatterns.Interpreter;

class TerminalExpression implements Expression {
    private String data;

    TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        return context.contains(data);
    }
}
