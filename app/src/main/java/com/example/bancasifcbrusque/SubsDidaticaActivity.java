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

public class SubsDidaticaActivity extends AppCompatActivity {
    SeekBar sb11, sb12, sb13, sb14, sb15;
    SeekBar sb21, sb22, sb23, sb24, sb25, sb26, sb27, sb28, sb29, sb210;
    EditText et11, et12, et13, et14, et15;
    EditText et21, et22, et23, et24, et25, et26, et27, et28, et29, et210;
    EditText etNotaFinal;
    TextView tvValMP1, tvValMP2;
    Locale idioma;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subs_didatica);

        idioma = new Locale("portuguese");

        sb11 = findViewById(R.id.sbCritSubsDid11);
        sb12 = findViewById(R.id.sbCritSubsDid12);
        sb13 = findViewById(R.id.sbCritSubsDid13);
        sb14 = findViewById(R.id.sbCritSubsDid14);
        sb15 = findViewById(R.id.sbCritSubsDid15);
        sb21 = findViewById(R.id.sbCritSubsDid21);
        sb22 = findViewById(R.id.sbCritSubsDid22);
        sb23 = findViewById(R.id.sbCritSubsDid23);
        sb24 = findViewById(R.id.sbCritSubsDid24);
        sb25 = findViewById(R.id.sbCritSubsDid25);
        sb26 = findViewById(R.id.sbCritSubsDid26);
        sb27 = findViewById(R.id.sbCritSubsDid27);
        sb28 = findViewById(R.id.sbCritSubsDid28);
        sb29 = findViewById(R.id.sbCritSubsDid29);
        sb210 = findViewById(R.id.sbCritSubsDid210);
        et11 = findViewById(R.id.etCritSubsDid11);
        et12 = findViewById(R.id.etCritSubsDid12);
        et13 = findViewById(R.id.etCritSubsDid13);
        et14 = findViewById(R.id.etCritSubsDid14);
        et15 = findViewById(R.id.etCritSubsDid15);
        et21 = findViewById(R.id.etCritSubsDid21);
        et22 = findViewById(R.id.etCritSubsDid22);
        et23 = findViewById(R.id.etCritSubsDid23);
        et24 = findViewById(R.id.etCritSubsDid24);
        et25 = findViewById(R.id.etCritSubsDid25);
        et26 = findViewById(R.id.etCritSubsDid26);
        et27 = findViewById(R.id.etCritSubsDid27);
        et28 = findViewById(R.id.etCritSubsDid28);
        et29 = findViewById(R.id.etCritSubsDid29);
        et210 = findViewById(R.id.etCritSubsDid210);
        tvValMP1 = findViewById(R.id.tvValMP1SubsDid);
        tvValMP2 = findViewById(R.id.tvValMP2SubsDid);
        etNotaFinal = findViewById(R.id.etNotaFinalSubsDid);

        carregarNotasSalvas();

        sb11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                et11.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et12.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et13.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et14.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et15.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et21.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et22.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et23.setText(String.valueOf(seekBar.getProgress()));

                somar();
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
                et24.setText(String.valueOf(seekBar.getProgress()));

                somar();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb25.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                et25.setText(String.valueOf(seekBar.getProgress()));

                somar();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb26.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                et26.setText(String.valueOf(seekBar.getProgress()));

                somar();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb27.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                et27.setText(String.valueOf(seekBar.getProgress()));

                somar();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb28.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                et28.setText(String.valueOf(seekBar.getProgress()));

                somar();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb29.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                et29.setText(String.valueOf(seekBar.getProgress()));

                somar();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb210.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                et210.setText(String.valueOf(seekBar.getProgress()));

                somar();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void somar () {
        double soma1, soma2;

        soma1 = Double.parseDouble(et11.getText().toString()) +
                Double.parseDouble(et12.getText().toString()) +
                Double.parseDouble(et13.getText().toString()) +
                Double.parseDouble(et14.getText().toString()) +
                Double.parseDouble(et15.getText().toString());
        tvValMP1.setText(String.format(idioma, "%.1f", soma1));

        soma2 = Double.parseDouble(et21.getText().toString()) +
                Double.parseDouble(et22.getText().toString()) +
                Double.parseDouble(et23.getText().toString()) +
                Double.parseDouble(et24.getText().toString()) +
                Double.parseDouble(et25.getText().toString()) +
                Double.parseDouble(et26.getText().toString()) +
                Double.parseDouble(et27.getText().toString()) +
                Double.parseDouble(et28.getText().toString()) +
                Double.parseDouble(et29.getText().toString()) +
                Double.parseDouble(et210.getText().toString()) ;
        tvValMP2.setText(String.format(idioma, "%.1f", soma2));

        etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
    }

    public void onClickVoltar (View v) {
        finish();
    }

    protected void onDestroy() {
        SharedPreferences.Editor prefs = getSharedPreferences("prefsSubsDid", MODE_PRIVATE).edit();

        prefs.putInt("sb11", sb11.getProgress());
        prefs.putInt("sb12", sb12.getProgress());
        prefs.putInt("sb13", sb13.getProgress());
        prefs.putInt("sb14", sb14.getProgress());
        prefs.putInt("sb15", sb15.getProgress());
        prefs.putInt("sb21", sb21.getProgress());
        prefs.putInt("sb22", sb22.getProgress());
        prefs.putInt("sb23", sb23.getProgress());
        prefs.putInt("sb24", sb24.getProgress());
        prefs.putInt("sb25", sb25.getProgress());
        prefs.putInt("sb26", sb26.getProgress());
        prefs.putInt("sb27", sb27.getProgress());
        prefs.putInt("sb28", sb28.getProgress());
        prefs.putInt("sb29", sb29.getProgress());
        prefs.putInt("sb210", sb210.getProgress());

        prefs.apply();

        //Toast.makeText(this, "Notas Salvas", Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    private void carregarNotasSalvas () {
        double soma1, soma2;
        prefs = getSharedPreferences("prefsSubsDid", MODE_PRIVATE);

        sb11.setProgress(prefs.getInt("sb11", 0));
        sb12.setProgress(prefs.getInt("sb12", 0));
        sb13.setProgress(prefs.getInt("sb13", 0));
        sb14.setProgress(prefs.getInt("sb14", 0));
        sb15.setProgress(prefs.getInt("sb15", 0));
        sb21.setProgress(prefs.getInt("sb21", 0));
        sb22.setProgress(prefs.getInt("sb22", 0));
        sb23.setProgress(prefs.getInt("sb23", 0));
        sb24.setProgress(prefs.getInt("sb24", 0));
        sb25.setProgress(prefs.getInt("sb25", 0));
        sb26.setProgress(prefs.getInt("sb26", 0));
        sb27.setProgress(prefs.getInt("sb27", 0));
        sb28.setProgress(prefs.getInt("sb28", 0));
        sb29.setProgress(prefs.getInt("sb29", 0));
        sb210.setProgress(prefs.getInt("sb210", 0));

        et11.setText(String.valueOf(sb11.getProgress() ));
        et12.setText(String.valueOf(sb12.getProgress() ));
        et13.setText(String.valueOf(sb13.getProgress() ));
        et14.setText(String.valueOf(sb14.getProgress() ));
        et15.setText(String.valueOf(sb15.getProgress() ));
        et21.setText(String.valueOf(sb21.getProgress() ));
        et22.setText(String.valueOf(sb22.getProgress() ));
        et23.setText(String.valueOf(sb23.getProgress() ));
        et24.setText(String.valueOf(sb24.getProgress() ));
        et25.setText(String.valueOf(sb25.getProgress() ));
        et26.setText(String.valueOf(sb26.getProgress() ));
        et27.setText(String.valueOf(sb27.getProgress() ));
        et28.setText(String.valueOf(sb28.getProgress() ));
        et29.setText(String.valueOf(sb29.getProgress() ));
        et210.setText(String.valueOf(sb210.getProgress() ));

        soma1 = Double.parseDouble(et11.getText().toString()) +
                Double.parseDouble(et12.getText().toString()) +
                Double.parseDouble(et13.getText().toString()) +
                Double.parseDouble(et14.getText().toString()) +
                Double.parseDouble(et15.getText().toString());
        tvValMP1.setText(String.format(idioma, "%.1f", soma1));

        soma2 = Double.parseDouble(et21.getText().toString()) +
                Double.parseDouble(et22.getText().toString()) +
                Double.parseDouble(et23.getText().toString()) +
                Double.parseDouble(et24.getText().toString()) +
                Double.parseDouble(et25.getText().toString()) +
                Double.parseDouble(et26.getText().toString()) +
                Double.parseDouble(et27.getText().toString()) +
                Double.parseDouble(et28.getText().toString()) +
                Double.parseDouble(et29.getText().toString()) +
                Double.parseDouble(et210.getText().toString()) ;
        tvValMP2.setText(String.format(idioma, "%.1f", soma2));

        etNotaFinal.setText(String.format(idioma, "%.1f", soma1+soma2));
    }
}
