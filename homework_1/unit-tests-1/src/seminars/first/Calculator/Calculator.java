package seminars.first.Calculator;

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

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        double result;
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }

        result = num / 2.0;
        for (int i = 0; i < 100; i++) {
            result = 0.5 * (result + num / result);
        }
        return result;
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0) {
            throw new IllegalArgumentException("Purchase amount percentage must be non-negative!");
        }
        if (discountAmount < 0) {
            throw new IllegalArgumentException("Discount percentage must be non-negative!");
        }
        if (discountAmount > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100!");
        }
        double discount = purchaseAmount * discountAmount / 100.0;
        return purchaseAmount - discount;
    }
}