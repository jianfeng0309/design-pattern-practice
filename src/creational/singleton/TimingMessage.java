package creational.singleton;

/**
 * Created by GuoJianFeng on 3/7/18.
 */
public class TimingMessage extends SystemMessage {

    public TimingMessage(){
        this.message = "this is a timingMessage";
    }
    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
