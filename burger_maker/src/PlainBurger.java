public class PlainBurger implements Burger {

    @Override
    public String getDescription() {
        return "Buns, hamburger meat";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
