package com.example.ridorianto.bangun_datar;





import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Jajargenjang extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText a, t;
    Button d;
    TextView jadi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_jajargenjang);

        //Deklarasi yang dikaitkan dengan id file xml
        a = (EditText) findViewById(R.id.Alas);
        t = (EditText) findViewById(R.id.Tinggi);
        d= (Button) findViewById(R.id.button4);
        jadi = (TextView) findViewById(R.id.txt_hasil);

        //aksi jika tombol button di klik
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(a.length()== 0 && t.length()== 0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(a.length() == 0){
                    Toast.makeText(getApplication(), "Alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(t.length() == 0){
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiAlas = a.getText().toString();
                    String isiTinggi = t.getText().toString();
                    double a = Double.parseDouble(isiAlas);
                    double t = Double.parseDouble(isiTinggi);
                    double hs = Jajargenjang (a,t);
                    String output = String.valueOf(hs);
                    jadi.setText(output.toString());
                }
            }
        });
    }
    public double Jajargenjang(double a, double t){
        return a*t;
    }
}

