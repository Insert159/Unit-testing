package main.java.Homework1.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ShopTest {
    Shop shop;
    List<Product> products;
    @BeforeEach
    void prepareData() {
        products = new ArrayList<>();
        products.add(new Product("Butter", 120));
        products.add(new Product("Milk", 80));
        products.add(new Product("Cream", 200));
        shop = new Shop(products);
    }

    @Test
    void getProductsCountTest() {
        assertThat(shop.getProducts()).hasSize(3);
    }

    @Test
    void getProductsListTest() {
        assertThat(shop.getProducts()).isEqualTo(products);
    }

    @Test
    void sortProductsByPriceTest() {
        assertThat(shop.sortProductsByPrice().toString())
                .isEqualTo("[Milk - 80 e.u., Butter - 120 e.u., Cream - 200 e.u.]");
    }

    @Test
    void getMostExpensiveProductTest() {
        assertThat(shop.getMostExpensiveProduct().toString()).isEqualTo("Cream - 200 e.u.");
    }
}