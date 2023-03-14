package com.example.aula01_primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
Repositório GitHub: https://github.com/udofritzke/Aula01-Primeiroapp
 */
public class MainActivity extends AppCompatActivity {
    private Button botaoApaga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
           Tratador do evento do botão associado por uma classe anônima
        */
        botaoApaga = (Button) findViewById(R.id.botaoApaga);
        botaoApaga.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                TextView texto = (TextView) findViewById(R.id.textView);
                texto.setVisibility(View.INVISIBLE);
            }
        });
    }
    /*
    Tratador do evento do botão associado em "activity_main.xml"
     */
    public void botaoEscreve(View view) {
        TextView texto = (TextView) findViewById(R.id.textView);
        texto.setVisibility(View.VISIBLE);
        texto.setText("Nova mensagem de texto");
    }
}