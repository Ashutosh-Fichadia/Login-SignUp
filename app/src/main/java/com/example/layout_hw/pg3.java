package com.example.layout_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.Button;

public class pg3 extends AppCompatActivity {
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg3);
        btn = (Button) findViewById(R.id.btnhome);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotohome();
            }
        });

    }
    public void gotohome(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}