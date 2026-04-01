package calculator2;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType(char s) {
        this.symbol = s;
    }

    public static OperatorType fromSymbol(char inputsymbol) {
        for (OperatorType type : OperatorType.values()) {
            if(type.symbol == inputsymbol) {
                return type;
            }
        }
        return null;
    }
}
