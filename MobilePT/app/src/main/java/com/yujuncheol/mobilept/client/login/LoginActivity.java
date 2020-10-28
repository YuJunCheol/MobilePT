package com.yujuncheol.mobilept.client.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.yujuncheol.mobilept.client.R;

import Socket.MPTClient;
import VO.Message;
import VO.Resource;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, Resource {

    //
    private EditText id,pw;
    private Button add,search,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // 선언
        id = findViewById(R.id.edt_id);
        pw = findViewById(R.id.edt_pw);
        add = findViewById(R.id.btn_add_member);
        search = findViewById(R.id.btn_search_member);
        login = findViewById(R.id.btn_login);

        // OnClickListener
        add.setOnClickListener(this);
        search.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                new MPTClient(Message.Login);
                break;
            case R.id.btn_add_member:
                Intent add_member = new Intent(this,AddUserActivity.class);
                startActivity(add_member);
                break;
        }
    }
}