public class Lettuce extends ToppingDecorator{

    public Lettuce(Burger newBurger) {
        super(newBurger);
        System.out.println("Adding lettuce");
    }

    public String getDescription() {
        return tempBurger.getDescription() + ", lettuce";
    }

    public double getCost() {
        return tempBurger.getCost() + 0.30;
    }
}
