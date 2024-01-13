package seminars.first.Shop;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    public static void main(String[] args) {
        ShopTest tests = new ShopTest();
        tests.expensiveTest();
        tests.sortingTest();
        tests.emptyTest();
        tests.oneProductTest();
    }

    public void expensiveTest() {
        Product product1 = new Product();
        product1.setCost(50);

        Product product2 = new Product();
        product2.setCost(30);

        Product product3 = new Product();
        product3.setCost(70);

        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product1, product2, product3));

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        assertThat(mostExpensiveProduct).isEqualTo(product3);
    }

    public void sortingTest() {
        Product product1 = new Product();
        product1.setCost(50);

        Product product2 = new Product();
        product2.setCost(30);

        Product product3 = new Product();
        product3.setCost(70);

        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product1, product2, product3));

        List<Product> sortedProducts = shop.sortProductsByPrice();

        assertThat(sortedProducts).containsExactly(product2, product1, product3);
    }

    public void emptyTest() {
        Shop emptyShop = new Shop();
        assertThat(emptyShop.getMostExpensiveProduct()).isNull();
        assertThat(emptyShop.sortProductsByPrice()).isEmpty();
    }

    public void oneProductTest() {
        Product product = new Product();
        product.setCost(50);

        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product));

        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product);
        assertThat(shop.sortProductsByPrice()).containsExactly(product);
    }
}
