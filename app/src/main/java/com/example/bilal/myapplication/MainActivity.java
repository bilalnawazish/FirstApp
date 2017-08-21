package com.example.bilal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnOk;
    private Button btnNext;
    private TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btnok);
        tvName = (TextView) findViewById(R.id.tvname);
        btnNext =(Button) findViewById(R.id.btnnext);

        btnOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tvName.setText("HAHAHAHAHA");
                    }
                }
        );

        btnNext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Layout.class);
                        startActivity(intent);

                    }
                }
        );
    }
}
