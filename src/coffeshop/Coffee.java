/*
This is coffe class for coffe object that implements Serialiazable interface
for manipulating with files
 */
package coffeshop;

import java.io.Serializable;

public class Coffee implements Serializable {

    private String coffeName;
    private double coffeePrice;
    private String coffeDescription;
    
    public Coffee(String coffeName, double coffeePrice, String coffeDescription) {
        this.coffeName = coffeName;
        this.coffeePrice = coffeePrice;
        this.coffeDescription = coffeDescription;
    }
    
//    setters
    public void setCoffeeName(String coffeeName) {
        this.coffeName = coffeeName;
    }
    public void setCoffeePrice(double coffeePrice) {
        this.coffeePrice = coffeePrice;
    }
    public void setCoffeeDescription(String coffeeDescription) {
        this.coffeDescription = coffeeDescription;
    }
    
//    getters
    public String getCoffeeName() {
        return coffeName;
    }
    public double getCoffeePrice() {
        return coffeePrice;
    }
    public String getCoffeeDescription() {
        return coffeDescription;
    }
}
