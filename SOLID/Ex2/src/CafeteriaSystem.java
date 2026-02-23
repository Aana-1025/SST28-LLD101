import java.util.*;

public class CafeteriaSystem {

    private final Map<String, MenuItem> menu = new HashMap<>();
    private final TaxRules taxRules;

    public CafeteriaSystem(TaxRules taxRules) {
        this.taxRules = taxRules;
    }

    public void addToMenu(MenuItem item) {
        menu.put(item.id, item);
    }

    public void checkout(List<OrderLine> order) {

        double subtotal = 0.0;

        for (OrderLine line : order) {
            MenuItem item = menu.get(line.itemId);
            subtotal += item.price * line.qty;
        }

        double tax = subtotal * taxRules.taxPercent() / 100.0;
        double total = subtotal + tax;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
}