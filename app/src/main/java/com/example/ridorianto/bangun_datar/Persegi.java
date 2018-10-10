package com.example.ridorianto.bangun_datar;

/**
 * Created by Rido Rianto on 10/8/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText p, l;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_persegi);

        //Deklarasi yang dikaitkan dengan id file xml
        p = (EditText) findViewById(R.id.panjang);
        l = (EditText) findViewById(R.id.lebar);
        b = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.txt_hasil);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(p.length()== 0 && l.length()== 0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(p.length() == 0){
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(l.length() == 0){
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiPanjang = p.getText().toString();
                    String isiLebar = l.getText().toString();
                    double p = Double.parseDouble(isiPanjang);
                    double l = Double.parseDouble(isiLebar);
                    double hs = persegi (p,l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double persegi(double p, double l){
        return p*l;
    }
}
