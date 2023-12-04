package Calculator;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double num) {
        if(num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
            return Math.sqrt(num);
    }

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if(purchaseAmount <= 0){
            throw new ArithmeticException("Price can't be zero or negative.");
        }
        
        if(discountAmount <= 0){
            throw new ArithmeticException("Discount can't be zero or negative.");
        }

        if(discountAmount > 100){
            throw new ArithmeticException("Shop won't pay you for buying stuff, sorry.");
        }

        return (purchaseAmount - (discountAmount * purchaseAmount) / 100);
    }
}
