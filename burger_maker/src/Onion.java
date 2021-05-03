public class Onion extends ToppingDecorator{

    public Onion(Burger newBurger) {
        super(newBurger);
        System.out.println("Adding onion slices");
    }

    public String getDescription() {
        return tempBurger.getDescription() + ", onion";
    }

    public double getCost() {
        return tempBurger.getCost() + 0.35;
    }
}
