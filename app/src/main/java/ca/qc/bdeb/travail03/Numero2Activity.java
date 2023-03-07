package ca.qc.bdeb.travail03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Numero2Activity extends AppCompatActivity {

    Button btn_11, btn_12, btn_13;
    Button btn_21, btn_22, btn_23;
    Button btn_31, btn_32, btn_33;
    List<Button> buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero2);
        setTitle("Numéro 2");
        //init
        btn_11 = findViewById(R.id.num2_btn_11);btn_12 = findViewById(R.id.num2_btn_12);btn_13 = findViewById(R.id.num2_btn_13);
        btn_21 = findViewById(R.id.num2_btn_21);btn_22 = findViewById(R.id.num2_btn_22);btn_23 = findViewById(R.id.num2_btn_23);
        btn_31 = findViewById(R.id.num2_btn_31);btn_32 = findViewById(R.id.num2_btn_32);btn_33 = findViewById(R.id.num2_btn_33);

        buttons = new ArrayList<Button>();
        buttons.add(btn_11);buttons.add(btn_12);buttons.add(btn_13);
        buttons.add(btn_21);buttons.add(btn_22);buttons.add(btn_23);
        buttons.add(btn_31);buttons.add(btn_32);buttons.add(btn_33);
    }

    public void reset(View view) {
        for (Button btn:
             buttons) {
            btn.setText("");
        }
    }

    public void clickButtonByUser(View view) {
        switch (view.getId()){
            case R.id.num2_btn_11: btn_11.setText("X"); break;
            case R.id.num2_btn_12: btn_12.setText("X"); break;
            case R.id.num2_btn_13: btn_13.setText("X"); break;

            case R.id.num2_btn_21: btn_21.setText("X"); break;
            case R.id.num2_btn_22: btn_22.setText("X"); break;
            case R.id.num2_btn_23: btn_23.setText("X"); break;

            case R.id.num2_btn_31: btn_31.setText("X"); break;
            case R.id.num2_btn_32: btn_32.setText("X"); break;
            case R.id.num2_btn_33: btn_33.setText("X"); break;
            default: break;
        }
        computerEvent();
    }

    private void computerEvent(){
        for (Button btn:
             buttons) {
            if(btn.getText().toString().equals("")){
                btn.setText("O");
                break;
            }
        }
    }
}