
public class EmailService implements IMessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to "+receiver+" with Message = "+message);
	}

	
}
