package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ridorianto.bangun_datar.Layanglayang;


public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_sgt (View view){
        Intent sgt = new Intent(Dashboard.this, Segitiga.class);
        startActivity(sgt);
    }
    public void btn_jjg (View view){
        Intent jjg = new Intent(Dashboard.this, Jajargenjang.class);
        startActivity(jjg);
    }
    public void btn_bkt (View view){
        Intent bkt = new Intent(Dashboard.this, Belahketupat.class);
        startActivity(bkt);
    }
    public void btn_lyly (View view){
        Intent lyly = new Intent(Dashboard.this, Layanglayang.class);
        startActivity(lyly);
    }
}
