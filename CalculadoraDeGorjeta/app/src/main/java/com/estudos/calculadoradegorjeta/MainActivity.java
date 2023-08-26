package com.estudos.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textPorcentagem;
    private TextView textGorjeta;
    private TextView textTotal;
    private SeekBar seekBarGorjeta;

    private double porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editValor       = findViewById(R.id.editValor);
        textGorjeta     = findViewById(R.id.textGorjeta);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        textTotal       = findViewById(R.id.textTotal);
        seekBarGorjeta  = findViewById(R.id.seekBarGorjeta);

        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = i;
                textPorcentagem.setText(Math.round(porcentagem) + "%");
                calcular();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void calcular(){
        String valorRecuperado = editValor.getText().toString();
        if (valorRecuperado == null || valorRecuperado.equals("")){

            Toast.makeText(getApplicationContext(), "Digite um valor primeiro!", Toast.LENGTH_LONG).show();

        }else{
            // coveter string de valor recuperado para double
            double valorDigitado = Double.parseDouble(valorRecuperado);
            double gorjeta = valorDigitado * (porcentagem/100);
            double total = Math.round(gorjeta + valorDigitado);
            double valorTeste = Math.round(1205.6358);

            //textGorjeta.setText("R$ " + Math.round(gorjeta));
            textGorjeta.setText("R$ " + gorjeta);
            textTotal.setText("R$ " + total);


            // DecimalFormat, default is RoundingMode.HALF_EVEN
            textTotal.setText("R$ " + valorTeste);      //1205.64




            //double input = 3.14159265359;
            //double input = 1205.6358;
            double input = 16.055;
            textTotal.setText("double : " + input);

            // convert double to BigDecimal
            BigDecimal salary = new BigDecimal(input);
            textTotal.setText("BigDecimal: " + salary);

            // round to 2 decimal places
            BigDecimal salary2 = salary.setScale(2, RoundingMode.HALF_UP);
            textTotal.setText("BigDecimal: " + salary2);

            // one line
            BigDecimal salary3 = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
            textTotal.setText("BigDecimal: " + salary3);

            // convert BigDecimal back to double
            double salary4 = salary3.doubleValue();
            textTotal.setText("double : " + salary4);

            // para cima
            BigDecimal salary5 = salary.setScale(2, RoundingMode.UP);
            textTotal.setText("BigDecimal: " + salary2);

        }
    }
}