package seminars.third.coverage;

public class SomeService {
    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        if (fizz && buzz) {
            return "FizzBuzz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else {
            // Я тут разделил что бы красивее было. Или так неправильно?
            String exceptionMessage = "Number %d is not divisible by 3 and 5!";
            throw new IllegalArgumentException(String.format(exceptionMessage, number));
        }
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и
     * false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        return true;
    }

    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
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

    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму.
     * Однако, если одно из значений равно 13,то оно не учитывается в сумме.
     * Так, например, если b равно 13, то считается сумма только a и c.
     */
    public int calculatingSummary() {
        return 0;
    }

    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    public boolean numberInInterval(int n) {
        return true;
    }
}
