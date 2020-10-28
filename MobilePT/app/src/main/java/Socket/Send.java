package Socket;

import android.util.Log;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import VO.Message;

public class Send extends MPTClient{
    ObjectOutputStream outObject,outMessage;
    public Send(){   }

    public void SendMessage(Socket socket, Message message) {
        try {
            outMessage = new ObjectOutputStream(socket.getOutputStream());
            outMessage.writeObject(message);
        } catch (Exception e) {
            Log.w("ERROR: "," " + e.getMessage());
        }
    }

    public void SendObject(Socket socket, Object object) {
        try {
            outObject = new ObjectOutputStream(socket.getOutputStream());
            outObject.writeObject(object);
            //outObject.close();
        } catch (IOException e) {
            Log.w("ERROR: ","SendObject");
        }

    }
}
