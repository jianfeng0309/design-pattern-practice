package creational.builder;

/**
 * Created by GuoJianFeng on 11/2/17.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
