import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class AlphaSender {

    public static void main(String[] args) {

        Twilio.init(
            System.getenv("TWILIO_ACCOUNT_SID"),
            System.getenv("TWILIO_AUTH_TOKEN"));

        Message.creator(
            new PhoneNumber(System.getenv("DESTINATION_NUMBER")),
            System.getenv("MSG_SVC_SID"),
            "Hello from your Alpha sender 😊")
            .create();
    }
}
