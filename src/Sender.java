
public class Sender {
	
	IMessageService messageService;
	
	public Sender(IMessageService messageService) {
		this.messageService = messageService;
	}
	
	public void processMessages(String msg, String rec) {
		messageService.sendMessage(msg, rec);
	}
}

