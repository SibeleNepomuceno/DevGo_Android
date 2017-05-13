package com.example.sibele.devgo_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CadastrarProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_produto);

        Button botaoSalvar = (Button) findViewById(R.id.cadastrarproduto_salvar);
        botaoSalvar.setBackgroundResource(R.color.colorPrimary);

        botaoSalvar.setOnClickListener(new View.OnClickListener()  {
                @Override
                public void onClick (View v) {
                    Toast.makeText(CadastrarProdutoActivity.this, "Produto cadastrado", Toast.LENGTH_SHORT).show();


                }
            });
    }

}
