package com.example.ridorianto.bangun_datar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Belahketupat extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText d1, d2;
    // ini button
    Button e;
    TextView anu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_belahketupat);

        //Deklarasi yang dikaitkan dengan id file xml
        d1 = (EditText) findViewById(R.id.Diagonal1);
        d2 = (EditText) findViewById(R.id.Diagonal2);
        e= (Button) findViewById(R.id.button6);
        anu = (TextView) findViewById(R.id.txt_hasil);

        //aksi jika tombol button di klik
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(d1.length()== 0 && d2.length()== 0){
                    Toast.makeText(getApplication(),"Diagonal1 dan Diagonal2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(d1.length() == 0){
                    Toast.makeText(getApplication(), "Diagonal1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(d2.length() == 0){
                    Toast.makeText(getApplication(), "Diagonal2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiAlas = d1.getText().toString();
                    String isiTinggi = d2.getText().toString();
                    double a = Double.parseDouble(isiAlas);
                    double t = Double.parseDouble(isiTinggi);
                    double hs = Belahketupat (a,t);
                    String output = String.valueOf(hs);
                    anu.setText(output.toString());
                }
            }
        });
    }
    public double Belahketupat(double d1, double d2){
        return d1*d2/2;
    }
}


