package DZ_seminar_1;

import java.util.List;

/**
 * VendingMachine
 */
public interface VendingMachine {

    void initProducts(List<BottleOfWater>listHotDrinks);
    void addProduct(BottleOfWater drink);  
    BottleOfWater getProduct(String name);
    
}
