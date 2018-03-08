package creational.builder;

/**
 * Created by GuoJianFeng on 11/2/17.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
