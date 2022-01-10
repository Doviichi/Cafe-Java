import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    public static void main(String[] args){
        CafeUtil cafeTest = new CafeUtil();

        System.out.println("\n---Streak Goal---");
        System.out.println("Purchases needed: " + cafeTest.getStreakGoal());

        System.out.println("\n---Order total---");
        System.out.println("Order Total: $" + cafeTest.getOrderTotal());

        System.out.println("\n---menu---");
        List<String> loadMenu = Arrays.asList(
            "coffee",
            "cappuccino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        cafeTest.displayMenu(menu);
        
        System.out.println("\n---Full menu---");
        List<Double> loadPrices = Arrays.asList(1.50, 2.75, 3.25, 4.95);
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.addAll(loadPrices);
        cafeTest.displayMenu(menu, prices);

        System.out.println("\n---Add Customer---");
        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 4; i++){
            cafeTest.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
