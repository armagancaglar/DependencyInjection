
public class SmsService implements IMessageService{

	@Override
	public void sendMessage(String message, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("Sms sent to number: "+receiver+" with message = "+message);
	}

}
