package Socket;

import java.io.ObjectInputStream;
import java.net.Socket;

import VO.Member;
import VO.Message;


public class Recv {
	Socket socket;
	ObjectInputStream inObject;
	
	public Recv(Socket socket) {
		this.socket = socket;
		if(socket == null) {
			System.out.println("(ERROR)Recv");
		}
	}
	
	public Message getMessage() {
		try {
			inObject = new ObjectInputStream(socket.getInputStream());
			Message message = (Message)inObject.readObject();
			return message;
		}catch(Exception e) {
			System.out.println("(ERROR)Recv.getMessage : ");
			e.printStackTrace();
		}
		return null;
	}
	
	public Member getMember() {
		try {
		inObject = new ObjectInputStream(socket.getInputStream());
		Member user = (Member)inObject.readObject();
		return user;
		}catch(Exception e) {
			System.out.println("(ERROR)Recv.getMessage : ");
			e.printStackTrace();
		}
		return null;
	}
}