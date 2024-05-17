package DZ_seminar_1;


import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    
    private List<BottleOfWater> listHotDrink = new ArrayList<>();

    @Override
    public void addProduct(BottleOfWater drink){
        listHotDrink.add(drink);
    }

    @Override
    public void initProducts(List<BottleOfWater> listHotDrinks){
        listHotDrink = listHotDrinks;
    }
    
    @Override
    public BottleOfWater getProduct(String name){
        for(BottleOfWater drink : listHotDrink){
            if(drink.getName().equals(name)){
                return drink;
            }
        }
            return null;
    }

    public BottleOfWater getProduct(String name, int volume, int temperature){
        for(BottleOfWater drink : listHotDrink) {
            if(drink.getName().equals(name) && drink.getVolume() == volume && ((HotDrink)drink).getTemperature() == temperature){
                return drink;
            }
        }
        return null;
    }
}