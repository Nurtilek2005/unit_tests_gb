package seminars.third.coverage;

public class SomeService {
    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int number) throws IllegalArgumentException {
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
    public boolean firstLast6(int[] nums) throws IllegalArgumentException {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is Empty!");
        }

        return true;
    }

    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double discountedAmount = 0; // Сумма со скидкой (первоначальная сумма - скидка%)
        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException( "Скидка должна быть в диапазоне от 0 до 100%");
            }
        } else {
            // Сумма покупки не может быть отрицательной
            throw new ArithmeticException( "Сумма покупки не может быть отрицательной");
        }
        return discountedAmount; // Метод должен возвращать сумму покупки со скидкой
    }

    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму.
     * Однако, если одно из значений равно 13,то оно не учитывается в сумме.
     * Так, например, если b равно 13, то считается сумма только a и c.
     */
    public int luckySum(int a, int b, int c) {
        return 0;
    }

    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    public boolean numberInInterval(int number) {
        return number >= 25 && number <= 100;
    }
}
