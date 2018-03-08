package creational.singleton;

import java.util.Random;

/**
 * Created by GuoJianFeng on 11/2/17.
 */
public class SingleObject {

    private static SingleObject instance;
    Message message;

    private SingleObject(Message message) {
        this.message = message;
    }

    public static SingleObject getInstance(){
        synchronized(SingleObject.class){
            if(instance == null){
                Random random = new Random();
                int rand = random.nextInt(2);
                if(rand == 0) {
                    instance = new SingleObject(new ErrorMessage());
                } else {
                    instance = new SingleObject(new TimingMessage());
                }

            }
        }
        return instance;
    }

    public void showMessage(){
        this.message.printMessage();
    }
}
