import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){
        int streakGoal = 10;
        return streakGoal;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;

        for(int i =0; i < prices.length; i++){
            total += prices[i];
        }

        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){

        for(String item : menuItems ){
            int idx = menuItems.indexOf(item);
            System.out.println(idx + " " + item);
        }

    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s. ", userName);
        System.out.printf("There are %d people in front of you. \n", customers.size());
        customers.add(userName);

        System.out.println(customers);
    }
}