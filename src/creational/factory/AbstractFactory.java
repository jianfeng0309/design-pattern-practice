package creational.factory;
/**
 * Created by GuoJianFeng on 11/2/17.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
