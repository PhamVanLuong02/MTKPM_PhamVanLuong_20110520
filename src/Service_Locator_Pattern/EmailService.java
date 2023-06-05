package Service_Locator_Pattern;

public class EmailService implements MessagingService {

    public String getMessageBody() {
        return "This is message body of Email message";
    }

    public String getServiceName() {
        return "EmailService";
    }
}
