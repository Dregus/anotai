package com.example.h239079.anotai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GeradoraDeComanda extends AppCompatActivity {

    private EditText edtNumeroMesa;
    private Button btnInicarComanda;
    String idCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geradora_de_comanda);

        Bundle bundle = getIntent().getExtras();
        idCliente = bundle.getString("idCliente");

        edtNumeroMesa = (EditText) findViewById(R.id.edtNumeroMesa);
        btnInicarComanda = (Button) findViewById(R.id.btnIniciarComanda);
    }

    public void ChamarMenu (View v)
    {
        String numeroComanda = edtNumeroMesa.getText().toString();
        Intent it = new Intent (this, MenuUsuario.class);
        it.putExtra("comanda", numeroComanda);
        it.putExtra("idUsuario", idCliente);
        startActivity(it);
    }
}
