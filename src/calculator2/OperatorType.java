package calculator2;

/**
 * 사칙연산 기호를 관리하는 Enum(열거형) 클래스입니다.
 * 각 연산자는 고유의 기호(char)를 가집니다.
 */
public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    /**
     * 연산자를 나타내는 문자 기호
     */
    private final char symbol;

    /**
     * 생성자 : 각 연산자 타입(PLUS, MINUS 등)에 맞는 기호('+', '-' 등)를 보냅니다.
     * @param s 외부에서 전달받은 연산자 기호(char)
     */
    OperatorType(char s) {
        this.symbol = s;
    }

    /**
     *
     * @param inputsymbol 찾고자 하는 연산 기호('+', '-')
     * @return 일치하는 OperatorType 상수를 반환하며, 찾지 못할 경우 null을 반환합니다.
     */
    public static OperatorType fromSymbol(char inputsymbol) {
        for (OperatorType type : OperatorType.values()) {
            if(type.symbol == inputsymbol) {
                return type;
            }
        }
        return null;
    }
}
