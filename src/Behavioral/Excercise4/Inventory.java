
package Behavioral.Excercise4;

import java.util.Iterator;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Iterator Pattern
 */
public class Inventory implements Iterable {
    
    private Item[] items;
    
    public Inventory(Item...items){
        this.items = items;
    }

    public Item[] getItems (){
        return items;
    }
    
    @Override
    public StockIterator iterator() {
        return new StockIterator(this);
    }

}
