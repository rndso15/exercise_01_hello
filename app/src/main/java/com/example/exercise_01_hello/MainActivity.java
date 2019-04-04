package com.example.exercise_01_hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText4);
        final EditText editText2 = (EditText) findViewById(R.id.editText5);
        Button button = (Button) findViewById(R.id.button2);
        final TextView textView = (TextView) findViewById(R.id.textView3);

        // 해당 버튼에서 오류나는중중
       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = (Integer.parseInt(editText.getText().toString()) + Integer.parseInt(editText2.getText().toString()));
                textView.setText(String.valueOf(i));
            }
        });

    }
}
