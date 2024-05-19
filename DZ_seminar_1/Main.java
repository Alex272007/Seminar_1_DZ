package DZ_seminar_1;

public class Main {
    public static void main(String[] args) {
        HotDrink product = new HotDrink("Кофе черный", 200, 250, 85);
        HotDrink product1 = new HotDrink("Чай", 100, 300,80);
        HotDrink product2 = new HotDrink("Капучино", 250, 170,75);
        

        VendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.addProduct(product);
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);

        System.out.println(vendingMachine.getProduct("Кофе черный"));
        System.out.println(vendingMachine.getProduct("Чай"));
        System.out.println(vendingMachine.getProduct("Капучино"));

    }

}
