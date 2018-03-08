package creational.builder;

/**
 * Created by GuoJianFeng on 11/2/17.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
