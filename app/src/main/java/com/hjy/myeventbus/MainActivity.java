package com.hjy.myeventbus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.hjy.myeventbus.fragment.HistoryFragment;
import com.hjy.myeventbus.fragment.MapFragment;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_clear).setOnClickListener(this);
        findViewById(R.id.btn_move).setOnClickListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.view_group_map,new MapFragment());
        transaction.replace(R.id.view_group_history,new HistoryFragment());
        transaction.commitNow();

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_clear) {//清除

        } else {//添加

        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
