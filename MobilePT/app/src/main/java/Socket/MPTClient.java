package Socket;

import android.util.Log;

import java.net.Socket;
import Controller.*;

import VO.Message;

public class MPTClient implements Runnable {

    private Socket socket = null;
    private Message msg;

    public MPTClient(){

    }

    public MPTClient(Message message) {
        Thread work = new Thread(this);
        this.msg = message;
        work.start();
    }

    //192.168.42.85 핫스팟

    @Override
    public void run(){
        try{
            socket = new Socket("192.168.42.85",8030);
            //Log.w("NETWORK","서버 접속 시도");
            new Controller(msg, socket);
            socket.close();
        }catch(Exception e) {
            Log.w("ERROR","CLIENT : " + e);
        }
    }
}
