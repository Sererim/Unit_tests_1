package Calculator;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountWithValidInput() {
        double purchaseAmount = 100;
        int discountAmount = 10;

        double expectedDiscountedAmount = 90.0;

        double discountedAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        assertThat(discountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountWithZeroDiscount() {
        double purchaseAmount = 100;
        int discountAmount = 0;

        double expectedDiscountedAmount = 100.0;

        double discountedAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        assertThat(discountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscount() {
        double purchaseAmount = 100;
        int discountAmount = -10;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Shop won't pay you for buying stuff, sorry.");
    }

    @Test
    public void testCalculateDiscountWithPurchaseAmountLessThan100() {
        double purchaseAmount = 50;
        int discountAmount = 10;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Shop won't pay you for buying stuff, sorry.");
    }
}