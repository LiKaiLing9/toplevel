package com.likailing.android.toplevel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这是MainAcitivity,是程序的入口
        //这里需要做修改，2016.06.27
        textView= (TextView) findViewById(R.id.tv_first);
        textView.setText("Git使用");
    }
}
