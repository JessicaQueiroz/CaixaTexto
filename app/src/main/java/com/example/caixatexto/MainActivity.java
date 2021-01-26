package com.example.caixatexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText et_nome;
    private TextInputEditText et_email;
    private TextView tv_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        et_nome = findViewById(R.id.et_nome);
        et_email = findViewById(R.id.et_email);
        tv_resultado = findViewById(R.id.tv_resultado);

        String nome = et_nome.getText().toString();
        String email = et_email.getText().toString();

        tv_resultado.setText("Nome: " + nome + " E-mail: " + email);
    }

    public void limpar(View view){
        et_nome.setText("");
        et_email.setText("");
    }
}
