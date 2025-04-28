package ET;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckoutSystemTest {

    @Test
    public void testNegativeQuantity() {
        assertEquals("Invalid Order", CheckoutSystem.processOrder(10.0, -1));
    }

    @Test
    public void testZeroQuantity() {
        assertEquals("Invalid Order", CheckoutSystem.processOrder(10.0, 0));
    }

    @Test
    public void testLowTotalPrice() {
        assertEquals("Total Payable: $6.00", CheckoutSystem.processOrder(2.0, 2)); // Below $10, add $2 shipping
    }

    @Test
    public void testDiscountApplication() {
        assertEquals("Total Payable: $90.00", CheckoutSystem.processOrder(10.0, 10)); // $100 total, 10% discount
    }

    @Test
    public void testNoDiscount() {
        assertEquals("Total Payable: $50.00", CheckoutSystem.processOrder(10.0, 5)); // $50, no discount
    }

    @Test
    public void testExactDiscountThreshold() {
        assertEquals("Total Payable: $90.00", CheckoutSystem.processOrder(25.0, 4)); // $100 total, 10% discount
    }

    @Test
    public void testFreeShippingThreshold() {
        assertEquals("Total Payable: $10.00", CheckoutSystem.processOrder(5.0, 2)); // $10 total, no shipping fee
    }

    @Test
    public void testLargeOrder() {
        assertEquals("Total Payable: $900.00", CheckoutSystem.processOrder(50.0, 20)); // $1000 total, 10% discount
    }
}
