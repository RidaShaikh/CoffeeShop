/*
 This is our main CoffeShop class that will run our
application form main() method
 */
package coffeshop;

public class CoffeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdminLogin login = new AdminLogin();
        login.setLocationRelativeTo(null);
        login.setTitle("Admin Login");
        login.setVisible(true);
    }
    
}
