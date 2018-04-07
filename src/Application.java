
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender = new Sender(new EmailService());
		Sender sender2 = new Sender(new SmsService());
		sender.processMessages("Selam", "c.armagancaglar@gmail.com");
		sender2.processMessages("Selam", "5555555");
	}
}
