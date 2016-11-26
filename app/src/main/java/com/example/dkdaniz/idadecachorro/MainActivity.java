package com.example.dkdaniz.idadecachorro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnIdade;
    private TextView txtIdade;
    private TextView txtIdadeHumano;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIdade = (Button) findViewById(R.id.btnIdade);
        txtIdade = (TextView) findViewById(R.id.txtIdade);
        txtIdadeHumano = (TextView) findViewById(R.id.txtIdadeHumano);

        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PIdade = txtIdade.getText().toString();

                if(PIdade.isEmpty())
                {
                    //Mensagem de erro.
                    Context context = getApplicationContext();
                    CharSequence text = "Por favor, Insira a idade do seu cachorro!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    alertdialog

                    txtIdadeHumano.setText("");
                }
                else
                {
                    int PValorDigitado =  Integer.parseInt(PIdade);
                    int PIdadeHumano =   PValorDigitado * 7;
                    txtIdadeHumano.setText("Idade humano do seu cachorro é: " + PIdadeHumano);
                }
            }
        });
    }
}
