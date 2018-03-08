package creational.singleton;

/**
 * Created by GuoJianFeng on 3/7/18.
 */
public class ErrorMessage extends SystemMessage {

    public ErrorMessage(){
        this.message = "this is a errorMessage";
    }
    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
