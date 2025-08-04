import java.util.LinkedHashSet;

public class FirstUniqueProduct {
    /**
     * This function loops through all products adding them to a set. A linkedhashset is used for order.
     * If a product was previously added, then remove it if not, add it.
     * Return the first element or null;
     *
     * @param products - products to select the first
     * @return - The first unique product.
     */
    public static String firstUniqueProduct(String[] products) {
        LinkedHashSet<String> uniqueProducts = new LinkedHashSet<>();
        for (String product : products) {
            if (uniqueProducts.contains(product)) {
                uniqueProducts.remove(product);
            } else {
                uniqueProducts.add(product);
            }
        }
        return uniqueProducts.stream().findFirst().orElse(null);
    }

    public static void main(String[] args) {
        String[] products = {"Apple", "Computer", "Apple", "Bag"};
        String result = firstUniqueProduct(products);
        System.out.println("First unique product: " + result);
    }

}
