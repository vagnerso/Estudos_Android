package com.estudos.arredondamentos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    private EditText editArredondar;
    private EditText edit1;
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private EditText edit5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editArredondar = findViewById(R.id.editArredondar);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 = findViewById(R.id.edit4);
        edit5 = findViewById(R.id.edit5);


    }

    public void calcular(View view){
        //double input = 1205.6358;
        double input;

        String valorArredondar  = editArredondar.getText().toString();
        input = Double.parseDouble(valorArredondar);

        edit1.setText("double : " + input);

        // convert double to BigDecimal
        BigDecimal valor = new BigDecimal(input);
        edit1.setText("BigDecimal: " + valor);

        // round to 2 decimal places
        BigDecimal valor2 = valor.setScale(2, RoundingMode.HALF_UP);
        edit2.setText("BigDecimal: " + valor2);

        // one line
        BigDecimal valor3 = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
        edit3.setText("BigDecimal: " + valor3);

        // convert BigDecimal back to double
        double valor4 = valor3.doubleValue();
        edit4.setText("double : " + valor4);

        // para cima
        BigDecimal valor5 = valor.setScale(2, RoundingMode.UP);
        edit5.setText("BigDecimal: " + valor5);
    }
}