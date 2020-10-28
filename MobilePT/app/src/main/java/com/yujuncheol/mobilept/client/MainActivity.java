package com.yujuncheol.mobilept.client;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.yujuncheol.mobilept.client.login.LoginActivity;
import com.yujuncheol.mobilept.client.ui.main.PagerAdapter;


import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Context mcontext;
    ProgressBar pbar;
    private Animation fab_open, fab_close;
    private Boolean isFabOpen = false;
    private FloatingActionButton fab, fab1, fab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontext = getApplicationContext();

        PagerAdapter sectionsPagerAdapter = new PagerAdapter(this, getSupportFragmentManager(),3);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        //플로팅 버튼 Animi
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);

        //플로팅 버튼 활성화
        fab = findViewById(R.id.fab);
        fab1 = findViewById(R.id.fab1);
        fab2 = findViewById(R.id.fab2);
        // OnClick
        fab.setOnClickListener(this);
        fab1.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.fab:
                anim();
                break;
            case R.id.fab1:
                anim();
                Intent login = new Intent(this, LoginActivity.class);
                startActivity(login);
                break;
            case R.id.fab2:
                anim();
                break;
        }
    }

    public void anim() {

        if (isFabOpen) {
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            isFabOpen = false;
        } else {
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            isFabOpen = true;
        }
    }
}