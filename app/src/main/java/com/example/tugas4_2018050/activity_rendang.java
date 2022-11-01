package com.example.tugas4_2018050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_rendang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendang);
    }
    public void activity_goreng(View view){
        Intent a = new Intent(activity_rendang.this,
                indomie_goreng.class);
        startActivity(a);
    }
    public void rendang(View view){
        Intent b = new Intent(activity_rendang.this,
                activity_rendang.class);
        startActivity(b);
    }
    public void soto(View view){
        Intent c = new Intent(activity_rendang.this,
                activity_soto.class);
        startActivity(c);
    }
}