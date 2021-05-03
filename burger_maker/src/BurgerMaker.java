public class BurgerMaker {

    public static void main(String[] args) {
        Burger basicBurger = new Lettuce(new Tomato(new Onion(new PlainBurger())));

        System.out.println("Ingredients: " + basicBurger.getDescription());
        System.out.format("Total: $%.2f", basicBurger.getCost());
    }
}
