package com.example.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tvRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignar componentes de interfaz a los valores
        et1=(EditText) findViewById(R.id.etNumero1);
        et2=(EditText) findViewById(R.id.etNumero2);
        tvRest= (TextView) findViewById(R.id.tvResultado);

    }
    public void sumar(View view){
        String valor1= et1.getText().toString();
        String valor2= et2.getText().toString();

        int num1= Integer.parseInt(valor1);
        int num2= Integer.parseInt(valor2);
        int suma= num1+num2;

        String resultado= String.valueOf(suma);
        tvRest.setText(resultado);
    }
}