package stack.polish_notation;

public enum BasicOperation implements Operation{
    PLUS("+"){
        public int apply(int x, int y){
            return x + y;
        }
    },
    MINUS("-"){
        public int apply(int x, int y){
            return y - x;
        }
    },
    MULIPLY("*"){
        public int apply(int x, int y){
            return x * y;
        }
    },
    DIVIDE("/"){
        public int apply(int x, int y){
            return y / x;
        }
    };

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    BasicOperation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
