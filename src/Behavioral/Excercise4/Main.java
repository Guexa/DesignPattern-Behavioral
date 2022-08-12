
package Behavioral.Excercise4;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Iterator Pattern
 */
public class Main {
    public static void main(String[] args) {
        
        Item pens = new Item("Pens", 175);
        Item pencils = new Item("Pencil", 0);
        Item paper = new Item("Paper", 500);
        
        Inventory inventory = new Inventory(pens, pencils, paper);
        
        StockIterator stockIterator = inventory.iterator();
        
        while(stockIterator.hasNext()){
            Item item = (Item) stockIterator.next();
            System.out.println(item.getName());
        }
                
    }
    
}
