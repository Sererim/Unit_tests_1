package Shop;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import Product.Product;

public class Shop {
    private ArrayList<Product> products;

    // Геттеры, сеттеры:
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void AddSpecificProduct(Integer cost, String title) {
        Product product = new Product();
        product.setCost(cost);
        product.setTitle(title);
        products.add(product);
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public ArrayList<Product> sortProductsByPrice() {
        return Collections.sort(this.products, Comparator.comparing(Product::getCost));;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return sortProductsByPrice().get(sortProductsByPrice().size() - 1);
    }
}