package ca.qc.bdeb.travail03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Numero3Activity extends AppCompatActivity {

    TextView lblAmende;
    EditText txtVitesse;
    Spinner spinnerLimites;
    RadioButton rbAutoroute, rbMunicipal;
    int limiteChoisi = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero3);
        setTitle("Numéro 3");
        //init
        lblAmende = findViewById(R.id.num3_lbl_amende);
        txtVitesse = findViewById(R.id.num3_txt_vitesse);
        spinnerLimites = findViewById(R.id.num3_spinner_limites);
        rbAutoroute = findViewById(R.id.num3_rb_autoroute);
        rbMunicipal = findViewById(R.id.num3_rb_municipal);

        //event change to spinner
        spinnerLimites.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: limiteChoisi = 30; break;
                    case 1: limiteChoisi = 50; break;
                    case 2: limiteChoisi = 70; break;
                    case 3: limiteChoisi = 100; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void calculerAmende(View view) {
        float amende = 25.00f;
        int vitesse = Integer.parseInt(txtVitesse.getText().toString());
        int nbKmExcedant = vitesse - limiteChoisi;
        //calcul
        if(rbMunicipal.isChecked()){
            if(nbKmExcedant < 25)
                amende += nbKmExcedant * 15.00f;
            else
                amende += nbKmExcedant * 20.00f;
        }else if(rbAutoroute.isChecked())
            amende += nbKmExcedant * 20.00f;

        //affichage
        lblAmende.setText(amende+" $");
    }
}