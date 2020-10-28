package Controller;

import java.net.Socket;
import Socket.*;

import VO.Message;
import VO.Resource;

public class Controller implements Resource {
    Send send = new Send();
    public Controller(Message message, Socket socket){
        Recv recv = new Recv(socket);
        switch (message) {
            case Login:
                send.SendMessage(socket,message);
                send.SendObject(socket,member);
            return;
        }
    }

}
