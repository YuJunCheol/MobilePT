package Socket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import DAO.Select;
import VO.Message;



public class MobilePT implements Runnable{
	
	private Socket socket;
	private ObjectInputStream inMessage;
	private ObjectOutputStream out;
	
	
	public MobilePT(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		try {
			Recv recv = new Recv(socket);
			Send send = new Send(socket);
			//Select select = new Select();
			switch(recv.getMessage()) {
			case Login:
				System.out.println("로그인 시도");
				break;
				
			}
		}catch (Exception e) {
			System.out.println("(ERROR)getMessage.run : "+e.getMessage());
		}
		
	}

}
