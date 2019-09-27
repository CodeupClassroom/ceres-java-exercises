package abstraction;

public class Dev extends Employee implements WritesCode, Sass {

    @Override
    public String beingSassy(String msg) {
        return null;
    }

    @Override
    public String work() {
        return "write code";
    }

    @Override
    public boolean debug(String bug) {
        return false;
    }

    @Override
    public void drinkCoffee() {
        System.out.println("sips");
    }
}
