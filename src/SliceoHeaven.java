public class SliceoHeaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;

    public void takeOrder(String id, String ingredients, String sideItems, String drinkItems) {
        orderID = id;
        pizzaIngredients = ingredients;
        sides = sideItems;
        drinks = drinkItems;
        orderTotal = pizzaPrice;

        if (sides != null && !sides.isEmpty()) {
            // Here we assume a fixed side price for simplicity, can be adjusted
            orderTotal += 5; 
        }
        if (drinks != null && !drinks.isEmpty()) {
            // Here we assume a fixed drink price for simplicity, can be adjusted
            orderTotal += 3; 
        }

        System.out.println("Order accepted!");
        makePizza();
        System.out.println("Your order is ready!");
        printReceipt();
    }

    public void makePizza() {
        System.out.println("Pizza with " + pizzaIngredients + " is being prepared.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("There was an issue while making the pizza.");
        }
    }

    private void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        if (sides != null && !sides.isEmpty()) {
            System.out.println("Sides: " + sides);
        }
        if (drinks != null && !drinks.isEmpty()) {
            System.out.println("Drinks: " + drinks);
        }
        System.out.println("Order Total: $" + orderTotal);
    }
}