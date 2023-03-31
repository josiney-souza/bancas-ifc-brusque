package com.example.bancasifcbrusque;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class TccActivity extends AppCompatActivity {
    SeekBar sb11, sb12, sb13, sb14, sb15, sb16, sb17;
    SeekBar sb21, sb22, sb23, sb24;
    EditText et11, et12, et13, et14, et15, et16, et17;
    EditText et21, et22, et23, et24;
    EditText etNotaFinal;
    TextView tvValMP1, tvValMP2;
    Locale idioma;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcc);

        idioma = new Locale("portuguese");

        sb11 = findViewById(R.id.sbCritTcc11);
        sb12 = findViewById(R.id.sbCritTcc12);
        sb13 = findViewById(R.id.sbCritTcc13);
        sb14 = findViewById(R.id.sbCritTcc14);
        sb15 = findViewById(R.id.sbCritTcc15);
        sb16 = findViewById(R.id.sbCritTcc16);
        sb17 = findViewById(R.id.sbCritTcc17);
        sb21 = findViewById(R.id.sbCritTcc21);
        sb22 = findViewById(R.id.sbCritTcc22);
        sb23 = findViewById(R.id.sbCritTcc23);
        sb24 = findViewById(R.id.sbCritTcc24);
        et11 = findViewById(R.id.etCritTcc11);
        et12 = findViewById(R.id.etCritTcc12);
        et13 = findViewById(R.id.etCritTcc13);
        et14 = findViewById(R.id.etCritTcc14);
        et15 = findViewById(R.id.etCritTcc15);
        et16 = findViewById(R.id.etCritTcc16);
        et17 = findViewById(R.id.etCritTcc17);
        et21 = findViewById(R.id.etCritTcc21);
        et22 = findViewById(R.id.etCritTcc22);
        et23 = findViewById(R.id.etCritTcc23);
        et24 = findViewById(R.id.etCritTcc24);
        tvValMP1 = findViewById(R.id.tvValMP1SubsDid);
        tvValMP2 = findViewById(R.id.tvValMP2SubsDid);
        etNotaFinal = findViewById(R.id.etNotaFinalSubsDid);

        carregarNotasSalvas();

        sb11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et11.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et12.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb13.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et13.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb14.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et14.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb15.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et15.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb16.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et16.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb17.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et17.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb21.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et21.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb22.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et22.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb23.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et23.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb24.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int maximo;
                double nota, soma1, soma2;

                maximo = seekBar.getProgress();
                nota = maximo / 10.0;
                et24.setText(String.valueOf(nota));

                soma1 = Double.parseDouble(et11.getText().toString()) +
                        Double.parseDouble(et12.getText().toString()) +
                        Double.parseDouble(et13.getText().toString()) +
                        Double.parseDouble(et14.getText().toString()) +
                        Double.parseDouble(et15.getText().toString()) +
                        Double.parseDouble(et16.getText().toString()) +
                        Double.parseDouble(et17.getText().toString());
                tvValMP1.setText(String.format(idioma, "%.1f", soma1));

                soma2 = Double.parseDouble(et21.getText().toString()) +
                        Double.parseDouble(et22.getText().toString()) +
                        Double.parseDouble(et23.getText().toString()) +
                        Double.parseDouble(et24.getText().toString()) ;
                tvValMP2.setText(String.format(idioma, "%.1f", soma2));

                etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void onClickVoltar (View v) {
        finish();
    }

    protected void onDestroy() {
        SharedPreferences.Editor prefs = getSharedPreferences("prefsSeekBar", MODE_PRIVATE).edit();

        prefs.putInt("sb11", sb11.getProgress());
        prefs.putInt("sb12", sb12.getProgress());
        prefs.putInt("sb13", sb13.getProgress());
        prefs.putInt("sb14", sb14.getProgress());
        prefs.putInt("sb15", sb15.getProgress());
        prefs.putInt("sb16", sb16.getProgress());
        prefs.putInt("sb17", sb17.getProgress());
        prefs.putInt("sb21", sb21.getProgress());
        prefs.putInt("sb22", sb22.getProgress());
        prefs.putInt("sb23", sb23.getProgress());
        prefs.putInt("sb24", sb24.getProgress());

        prefs.apply();

        //Toast.makeText(this, "Notas Salvas", Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    private void carregarNotasSalvas () {
        double soma1, soma2;
        prefs = getSharedPreferences("prefsSeekBar", MODE_PRIVATE);

        sb11.setProgress(prefs.getInt("sb11", 0));
        sb12.setProgress(prefs.getInt("sb12", 0));
        sb13.setProgress(prefs.getInt("sb13", 0));
        sb14.setProgress(prefs.getInt("sb14", 0));
        sb15.setProgress(prefs.getInt("sb15", 0));
        sb16.setProgress(prefs.getInt("sb16", 0));
        sb17.setProgress(prefs.getInt("sb17", 0));
        sb21.setProgress(prefs.getInt("sb21", 0));
        sb22.setProgress(prefs.getInt("sb22", 0));
        sb23.setProgress(prefs.getInt("sb23", 0));
        sb24.setProgress(prefs.getInt("sb24", 0));

        et11.setText(String.valueOf(sb11.getProgress() / 10.0));
        et12.setText(String.valueOf(sb12.getProgress() / 10.0));
        et13.setText(String.valueOf(sb13.getProgress() / 10.0));
        et14.setText(String.valueOf(sb14.getProgress() / 10.0));
        et15.setText(String.valueOf(sb15.getProgress() / 10.0));
        et16.setText(String.valueOf(sb16.getProgress() / 10.0));
        et17.setText(String.valueOf(sb17.getProgress() / 10.0));
        et21.setText(String.valueOf(sb21.getProgress() / 10.0));
        et22.setText(String.valueOf(sb22.getProgress() / 10.0));
        et23.setText(String.valueOf(sb23.getProgress() / 10.0));
        et24.setText(String.valueOf(sb24.getProgress() / 10.0));

        soma1 = Double.parseDouble(et11.getText().toString()) +
                Double.parseDouble(et12.getText().toString()) +
                Double.parseDouble(et13.getText().toString()) +
                Double.parseDouble(et14.getText().toString()) +
                Double.parseDouble(et15.getText().toString()) +
                Double.parseDouble(et16.getText().toString()) +
                Double.parseDouble(et17.getText().toString());
        tvValMP1.setText(String.format(idioma, "%.1f", soma1));

        soma2 = Double.parseDouble(et21.getText().toString()) +
                Double.parseDouble(et22.getText().toString()) +
                Double.parseDouble(et23.getText().toString()) +
                Double.parseDouble(et24.getText().toString()) ;
        tvValMP2.setText(String.format(idioma, "%.1f", soma2));

        etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
    }
}
