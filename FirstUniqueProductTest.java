import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstUniqueProductTest {

    @Test
    void testEmptyArray() {
        String[] products = {};
        assertNull(FirstUniqueProduct.firstUniqueProduct(products));
    }

    @Test
    void testSingleProduct() {
        String[] products = {"Apple" };
        assertEquals("Apple", FirstUniqueProduct.firstUniqueProduct(products));
    }

    @Test
    void testNoUniqueProducts() {
        String[] products = {"Apple", "Orange", "Apple", "Orange" };
        assertNull(FirstUniqueProduct.firstUniqueProduct(products));
    }

    @Test
    void testFirstUniqueInMiddle() {
        String[] products = {"Apple", "Apple", "Orange", "Banana", "Orange" };
        assertEquals("Banana", FirstUniqueProduct.firstUniqueProduct(products));
    }

    @Test
    void testAllUnique() {
        String[] products = {"Apple", "Orange", "Banana" };
        assertEquals("Apple", FirstUniqueProduct.firstUniqueProduct(products));
    }
}
