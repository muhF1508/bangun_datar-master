package com.example.ridorianto.bangun_datar;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Layanglayang extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText D1, D2;
    Button u;
    TextView ini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_layanglayang);

        //Deklarasi yang dikaitkan dengan id file xml
        D1 = (EditText) findViewById(R.id.Diagonal1);
        D2 = (EditText) findViewById(R.id.Diagonal2);
        u= (Button) findViewById(R.id.button8);
        ini = (TextView) findViewById(R.id.txt_hasil);

        //aksi jika tombol button di klik
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(D1.length()== 0 && D2.length()== 0){
                    // ini namanya toast, ok
                    Toast.makeText(getApplication(),"Diagonal1 dan Diagonnal2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(D1.length() == 0){
                    Toast.makeText(getApplication(), "Diagonal1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(D2.length() == 0){
                    Toast.makeText(getApplication(), "Diagonal2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiAlas = D1.getText().toString();
                    // ini komen
                    String isiTinggi = D2.getText().toString();
                    double a = Double.parseDouble(isiAlas);
                    double t = Double.parseDouble(isiTinggi);
                    double hs = Layanglayang (a,t);
                    String output = String.valueOf(hs);
                    ini.setText(output.toString());
                }
            }
        });
    }
    public double Layanglayang(double D1, double D2){
        return D1*D2/2;
    }
}



