package seminars.first.Shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        if (products == null) {
            return new ArrayList<>();
        }

        List<Product> sortedProducts = new ArrayList<>(products);

        int size = sortedProducts.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sortedProducts.get(j).getCost() > sortedProducts.get(j + 1).getCost()) {
                    Product temp = sortedProducts.get(j);
                    sortedProducts.set(j, sortedProducts.get(j + 1));
                    sortedProducts.set(j + 1, temp);
                }
            }
        }

        return sortedProducts;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products == null || products.isEmpty()) {
            return null;
        }

        Product maxProduct = products.get(0);
        for (Product product : products) {
            if (product.getCost() > maxProduct.getCost()) {
                maxProduct = product;
            }
        }

        return maxProduct;
    }

}