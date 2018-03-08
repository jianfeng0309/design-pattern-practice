package creational.singleton;

/**
 * Created by GuoJianFeng on 3/7/18.
 */
public abstract class SystemMessage implements Message{
    String message;

    @Override
    public void printMessage() {
        System.out.println(message);
    }
}
