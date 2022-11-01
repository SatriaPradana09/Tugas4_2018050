package com.example.tugas4_2018050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_soto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto);
    }
    public void activity_goreng(View view){
        Intent a = new Intent(activity_soto.this,
                indomie_goreng.class);
        startActivity(a);
    }
    public void ayam_bawang(View view){
        Intent b = new Intent(activity_soto.this,
                activity_ayam_bawang.class);
        startActivity(b);
    }
    public void rendang(View view){
        Intent c = new Intent(activity_soto.this,
                activity_rendang.class);
        startActivity(c);
    }
}