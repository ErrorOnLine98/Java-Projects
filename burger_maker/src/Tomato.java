public class Tomato extends ToppingDecorator{

    public Tomato(Burger newBurger) {
        super(newBurger);
        System.out.println("Adding tomato slices");
    }

    public String getDescription() {
        return tempBurger.getDescription() + ", tomato";
    }

    public double getCost() {
        return tempBurger.getCost() + 0.35;
    }
}
