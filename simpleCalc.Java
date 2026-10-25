public class SimpleCalculator {
    public static void main(String[] args) {
        double firstNumber = 16;
        double secondNumber = 16;
        String operator = "+";

        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            default:
                System.out.println("Unsupported operator");
        }
    }
}
