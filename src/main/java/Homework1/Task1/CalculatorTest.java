package main.java.Homework1.Task1;


import main.java.Homework1.Task1.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CalculatorTest {
    public static void main(String[] args) {

        assertThat(Calculator.calculateDiscount(200, 25)).isEqualTo(150);

        assertThatThrownBy(() -> Calculator.calculateDiscount(-1, 50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Purchase amount can not be zero or negative!");

        assertThatThrownBy(() -> Calculator.calculateDiscount(0, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Purchase amount can not be zero or negative!");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Discount amount must be between 0 and 100!");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Discount amount must be between 0 and 100!");

    }
}