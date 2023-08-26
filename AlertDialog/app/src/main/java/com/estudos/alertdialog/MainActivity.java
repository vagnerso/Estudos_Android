package com.estudos.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Título do Diálogo");
        dialog.setMessage("Mensagem do diálogo");
        dialog.setCancelable(false);
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(
                         getApplicationContext(),
                         "Executar ação ao clicar no botão SIM",
                         Toast.LENGTH_SHORT).show();

            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão NÃO",
                        Toast.LENGTH_SHORT).show();

            }
        });

        dialog.create();
        dialog.show();

    }

}