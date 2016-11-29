package com.rohan.user.myespresso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView txt;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
        btn= (Button) findViewById(R.id.btn);
    }

    public void btn(View view) {
        txt.setText("Hi, How r u");
        Intent intent = new Intent(this,MyService.class);

        startService(intent);
    }
}
