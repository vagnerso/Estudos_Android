package br.com.livrokotlin.calculoaposentadoria

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val spinnerSexo = findViewById<Spinner>(R.id.spinner_sexo)

        val editTextIdade = findViewById<EditText>(R.id.edit_text_idade)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        val textViewResultado = findViewById<TextView>(R.id.text_view_resultado)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listOf("Masculino", "Feminino")
        )

        spinnerSexo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
        listOf("Masculino", "Feminino")
        )

        spinnerSexo.adapter = adapter

        buttonCalcular.setOnClickListener(){
            val sexoSelecionado = spinnerSexo.selectedItem as String
            val idade = editTextIdade.text.toString().toInt()
            var resultado = 0

            if (sexoSelecionado == "Masculino"){
                resultado = 65 - idade
            } else {
                resultado = 62 - idade
            }

            textViewResultado.text = "Faltam $resultado anos para você se aposentar."




        }

    }



}