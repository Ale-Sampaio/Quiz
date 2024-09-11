package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rd1a, rd1b, rd1c, rd1d, rd1e;
    RadioButton rd2a, rd2b, rd2c, rd2d, rd2e;
    RadioButton rd3a, rd3b, rd3c, rd3d, rd3e;
    Button btnEnviar, btnReiniciar, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarComponentes();
        configurarListeners();
    }

    private void iniciarComponentes() {
        rd1a = findViewById(R.id.rd1a);
        rd1b = findViewById(R.id.rd1b);
        rd1c = findViewById(R.id.rd1c);
        rd1d = findViewById(R.id.rd1d);
        rd1e = findViewById(R.id.rd1e);

        rd2a = findViewById(R.id.rd2a);
        rd2b = findViewById(R.id.rd2b);
        rd2c = findViewById(R.id.rd2c);
        rd2d = findViewById(R.id.rd2d);
        rd2e = findViewById(R.id.rd2e);

        rd3a = findViewById(R.id.rd3a);
        rd3b = findViewById(R.id.rd3b);
        rd3c = findViewById(R.id.rd3c);
        rd3d = findViewById(R.id.rd3d);
        rd3e = findViewById(R.id.rd3e);

        btnEnviar = findViewById(R.id.btnEnviar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnReiniciar = findViewById(R.id.btnReiniciar);
    }

    private void configurarListeners() {
        btnEnviar.setOnClickListener(view -> {
            StringBuilder resultado = new StringBuilder();

            // Questão 1
            if (rd1e.isChecked()) {
                resultado.append("Questão 1: Correto! (Júpiter)\n");
            } else {
                resultado.append("Questão 1: Incorreto. A resposta correta é e) Júpiter.\n");
            }

            // Questão 2
            if (rd2c.isChecked()) {
                resultado.append("Questão 2: Correto! (Oxigênio)\n");
            } else {
                resultado.append("Questão 2: Incorreto. A resposta correta é c) Oxigênio.\n");
            }

            // Questão 3
            if (rd3e.isChecked()) {
                resultado.append("Questão 3: Correto! (Paris)\n");
            } else {
                resultado.append("Questão 3: Incorreto. A resposta correta é e) Paris.\n");
            }

            Toast.makeText(this, resultado.toString(), Toast.LENGTH_LONG).show();
        });

        btnLimpar.setOnClickListener(v -> limparRespostas());

        btnReiniciar.setOnClickListener(v -> reiniciarQuiz());
    }

    private void limparRespostas() {
        rd1a.setChecked(false);
        rd1b.setChecked(false);
        rd1c.setChecked(false);
        rd1d.setChecked(false);
        rd1e.setChecked(false);

        rd2a.setChecked(false);
        rd2b.setChecked(false);
        rd2c.setChecked(false);
        rd2d.setChecked(false);
        rd2e.setChecked(false);

        rd3a.setChecked(false);
        rd3b.setChecked(false);
        rd3c.setChecked(false);
        rd3d.setChecked(false);
        rd3e.setChecked(false);
    }

    private void reiniciarQuiz() {
        limparRespostas();
        Toast.makeText(this, "Quiz reiniciado", Toast.LENGTH_SHORT).show();
    }
}
