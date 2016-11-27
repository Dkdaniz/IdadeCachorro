package com.example.dkdaniz.idadecachorro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private Button btnIdade;
    private EditText edtIdade;
    private EditText edtIdadeHumana;
    private TextView txtFrases;
    private ImageView imgIdade;
    private String Mensagem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializando Variaveis
        btnIdade = (Button) findViewById(R.id.btnIdade);
        edtIdade = (EditText) findViewById(R.id.edtIdade);
        edtIdadeHumana = (EditText) findViewById(R.id.edtIdadeHumana);
        txtFrases = (TextView) findViewById(R.id.txtFrases);
        imgIdade = (ImageView) findViewById(R.id.imgIdade);

        Mensagem = getResources().getString(R.string.idade_cachorro);
        edtIdadeHumana.setText(Mensagem);
        btnIdade.findFocus();

        Mensagem = "";
        Mensagem = getResources().getString(R.string.Frase_inicial);
        txtFrases.setText(Mensagem);

        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PIdade = edtIdade.getText().toString();
                if(PIdade.isEmpty())
                {
                    //Mensagem de erro.
                    Mensagem = "";
                    Mensagem = getResources().getString(R.string.Erro_Preencher_Idade);
                    edtIdadeHumana.setText(Mensagem);
                }
                else
                {
                    int PValorDigitado =  Integer.parseInt(PIdade);
                    int PIdadeHumano =   PValorDigitado * 7;
                    edtIdadeHumana.setText("Idade humano do seu cachorro é: " + PIdadeHumano);

                    if(PIdadeHumano <= 2)
                    {
                        Mensagem = "";
                        Mensagem = getResources().getString(R.string.dois_anos);
                        txtFrases.setText(Mensagem);
                        imgIdade.setImageResource(R.drawable.dois_anos);
                    }
                    else if(PIdadeHumano > 2 && PIdadeHumano <= 10 )
                    {
                        Mensagem = "";
                        Mensagem = getResources().getString(R.string.dez_anos);
                        txtFrases.setText(Mensagem);
                        imgIdade.setImageResource(R.drawable.dez_anos);
                    }
                    else if(PIdadeHumano > 10 && PIdadeHumano <= 20)
                    {
                        Mensagem = "";
                        Mensagem = getResources().getString(R.string.quinze_anos);
                        txtFrases.setText(Mensagem);
                        imgIdade.setImageResource(R.drawable.quinze_anos);
                    }
                    else if(PIdadeHumano > 20 && PIdadeHumano <= 40)
                    {
                        Mensagem = "";
                        Mensagem = getResources().getString(R.string.vinte_anos);
                        txtFrases.setText(Mensagem);
                        imgIdade.setImageResource(R.drawable.vinte_anos);
                    }
                    else if(PIdadeHumano > 40 && PIdadeHumano <= 60)
                    {
                        Mensagem = "";
                        Mensagem = getResources().getString(R.string.quarenta_anos);
                        txtFrases.setText(Mensagem);
                        imgIdade.setImageResource(R.drawable.quarenta_anos);
                    }
                    else if(PIdadeHumano >= 60)
                    {
                        Mensagem = "";
                        Mensagem = getResources().getString(R.string.sessenta_anos);
                        txtFrases.setText(Mensagem);
                        imgIdade.setImageResource(R.drawable.sessenta_anos);
                    }
                }
            }
        });
    }
}
