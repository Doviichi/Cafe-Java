import java.util.ArrayList;
public class CafeUtil{lic int getStreakGoal(){
        int sum = 0;
        for ( int week = 1; week <= 10; week++){
            sum+= week;
        }
        return sum;
    }
    public double getOrderTotal(){
        double[] items = {2.50, 3.50, 5.75};
        double sum = 0;
        for (double price : items){
            sum+= price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int id = 0; id < menuItems.size(); id++){
            System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }
    public void addCustomer(ArrayList<String> customerList){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!" , userName);
        System.out.printf("There are %s people ahead of you. \n", customerList.size());
        customerList.add(userName);
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> priceIndex){
        if (menuItems.size() != priceIndex.size()){
            return false;
        }
        for (int id = 0; id < menuItems.size(); id++){
            System.out.printf("%s %s $ %.2f \n", id, menuItems.get(id), priceIndex.get(id));
        }
        return true;
    }
}