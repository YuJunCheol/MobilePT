package com.yujuncheol.mobilept.client.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yujuncheol.mobilept.client.R;

import Socket.MPTClient;
import VO.Message;

public class AddUserActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText id,pw;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        // 선언부
        id = findViewById(R.id.edt_add_id);
        pw = findViewById(R.id.edt_add_pw);
        add = findViewById(R.id.btn_add_member);

        add.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.btn_add_member:
                new MPTClient(Message.AddMember);
                break;
        }
    }
}