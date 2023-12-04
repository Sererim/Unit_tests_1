import static org.assertj.core.api.Assertions.*;
import Shop.*;
import Product.*;
import java.util.ArrayList;

public class ShopTest {

    private Shop.Shop shop = new Shop();

    //1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    @Test
    public void testCorrectAmountIsStoredInList() {
        shop.AddSpecificProduct(10, "Beer");
        shop.AddSpecificProduct(25, "Mineral water");
        shop.AddSpecificProduct(5, "Snak");

        assertThat(shop.getProducts()).isEqualTo(3);
        
        ArrayList<Product> arr = new ArrayList<>();
        arr = shop.getProducts();
        assertThat(arr.get(0).getTitle).isEqualTo("Beer");
        assertThat(arr.get(0).getCost).isEqualTo(10);
    }
    //2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    @Test
    public void testGetMostExpensiveProduct() {
        shop.AddSpecificProduct(10, "Beer");
        shop.AddSpecificProduct(25, "Mineral water");
        shop.AddSpecificProduct(5, "Snak");

        assertThat(shop.getMostExpensiveProduct().getTitle).isEqualTo("Mineral water");

   }
    //3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
    @Test
    public void testSortProductsByPrice() {
        shop.AddSpecificProduct(10, "Beer");
        shop.AddSpecificProduct(25, "Mineral water");
        shop.AddSpecificProduct(5, "Snak");

        let arr = shop.sortProductsByPrice();
        
        assertThat(arr.get(0).getCost).isEqualTo(25);
        assertThat(arr.get(1).getCost).isEqualTo(10);
        assertThat(arr.get(2).getCost).isEqualTo(5);
    }
}