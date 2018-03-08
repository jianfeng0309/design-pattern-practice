package creational.singleton;

/**
 * Created by GuoJianFeng on 11/2/17.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        //SingleObject object = SingleObject.getInstance();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                SingleObject object = SingleObject.getInstance();
                object.showMessage();
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                SingleObject object = SingleObject.getInstance();
                object.showMessage();
            }
        };

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                SingleObject object = SingleObject.getInstance();
                object.showMessage();
            }
        };

        Thread thread4 = new Thread() {
            @Override
            public void run() {
                SingleObject object = SingleObject.getInstance();
                object.showMessage();
            }
        };

        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
    }
}
