package com.mt_hotfix.robust;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.meituan.robust.patch.annotaion.Modify;
import com.mt_hotfix.R;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    @Modify
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        textView.setText("11111111222222");
        textView.setTextColor(Color.GREEN);
    }
}
