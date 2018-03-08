package creational.factory;
/**
 * Created by GuoJianFeng on 11/2/17.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside factory.Green::fill() method.");
    }
}
