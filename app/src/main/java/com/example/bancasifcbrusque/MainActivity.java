package com.example.bancasifcbrusque;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTcc (View v) {
        Intent mudarTela = new Intent();
        mudarTela.setClass(this, TccActivity.class);
        startActivity(mudarTela);
    }

    public void onClickSubsDid (View v) {
        Intent mudarTela = new Intent();
        mudarTela.setClass(this, SubsDidaticaActivity.class);
        startActivity(mudarTela);
    }

    public void onClickSubsTit (View v) {
        String mensagem = "Função ainda não implementada";
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    public void onClickApagarPrefs (View v) {
        SharedPreferences.Editor editorPrefs = getSharedPreferences("prefsSeekBar", MODE_PRIVATE).edit();
        editorPrefs.clear();
        editorPrefs.apply();

        SharedPreferences.Editor editorSubsDid = getSharedPreferences("prefsSubsDid", MODE_PRIVATE).edit();
        editorSubsDid.clear();
        editorSubsDid.apply();

        Toast.makeText(this, "As notas salvas da banca de TCC foram apagadas", Toast.LENGTH_SHORT).show();
    }
}