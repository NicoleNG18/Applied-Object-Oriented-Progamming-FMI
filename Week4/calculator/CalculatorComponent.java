package calculator;

public class CalculatorComponent {

    private double firstInput;
    private double secondInput;
    private double result;
    private double memory;

    CalculatorComponent() {}

    public void setFirstInput(double firstInput) { this.firstInput = firstInput; }
    public void setSecondInput(double secondInput) { this.secondInput = secondInput; }

    public double getCalculatorResult() { return result; }

    public void add() { result = firstInput + secondInput; }
    public void subtract() { result = firstInput - secondInput; }
    public void multiply() { result = firstInput * secondInput; }
    public void divide() {
        if (secondInput != 0) result = firstInput / secondInput;
        else result = Double.NaN;
    }

    public void memoryStore(double value) { memory = value; }
    public void memoryAdd(double value) { memory += value; }
    public void memorySubtract(double value) { memory -= value; }
    public void memoryClear() { memory = 0; }
    public double getMemory() { return memory; }
}