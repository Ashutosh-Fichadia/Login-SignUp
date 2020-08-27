package com.example.layout_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    public Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button) findViewById(R.id.btndown1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        button2=(Button) findViewById(R.id.btndown2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openrev();
            }
        });

        button3 =(Button) findViewById(R.id.btndown3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlay();
            }
        });
    }
    public void openlay(){
        i = new Intent(this,pg4.class);
        startActivity(i);
    }
    public void openrev() {
         i =new Intent(this, pg3.class);
        startActivity(i);
    }
    public void openLogin()
    {
        i = new Intent(this, Page2.class);
        startActivity(i);
    }
}