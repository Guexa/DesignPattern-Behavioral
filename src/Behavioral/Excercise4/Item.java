
package Behavioral.Excercise4;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Iterator Pattern
 */
public class Item {
    
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
