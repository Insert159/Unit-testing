//Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки
//        и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с
//        использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы,
//        он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

package main.java.Homework1.Task1;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Purchase amount with discount: " + calculateDiscount(0, 10)
                + " c.u.");
    }

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0)
            throw new ArithmeticException("Purchase amount can not be zero or negative!");
        if (discountAmount < 0 || discountAmount > 100)
            throw new ArithmeticException("Discount amount must be between 0 and 100!");

        double result = purchaseAmount - (purchaseAmount / 100 * discountAmount);
        return result;
    }
}