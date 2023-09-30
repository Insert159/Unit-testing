package main.java.Homework3;

public class Main {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(10));
        System.out.println(isNumberInInterval(21));
    }
    /**
     * Напишите тесты, покрывающие на 100% метод isEvenNumber, который проверяет, является ли переданное
     * число четным или нечетным.
     */
    public static boolean isEvenNumber(int x) {
        return x % 2 == 0;
    }

    /**
     * Разработайте и протестируйте метод isNumberInInterval, который проверяет, попадает ли переданное
     * число в интервал (25;100).
     */
    public static boolean isNumberInInterval(int x) {
        return x > 25 && x < 100;
    }
}
