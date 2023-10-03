package ie.atu.hello;

public class CalculatorAnswer {
    private int num1;
    private int num2;
    private int total;
    private String symbol;
    private String operation;

    public CalculatorAnswer(String operation, int num1, String symbol, int num2, int answer) {
        this.operation = operation;
        this.num1 = num1;
        this.symbol = symbol;
        this.num2 = num2;
        this.total = answer;
    }

     public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }


}
