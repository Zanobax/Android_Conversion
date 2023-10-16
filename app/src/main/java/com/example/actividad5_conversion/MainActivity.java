package com.example.actividad5_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.actividad5_conversion.models.*;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fare=findViewById(R.id.farenheitt),
        cel=findViewById(R.id.celsiuss),
        kel=findViewById(R.id.kelvinn);
        kel.setOnClickListener(this);
        cel.setOnClickListener(this);
        fare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText grado=findViewById(R.id.grados);
        double g=Double.parseDouble(grado.getText().toString());
        celsius c= new celsius(g);
        farenheit f= new farenheit(g);
        kelvin k=new kelvin(g);
        TextView resu1=findViewById(R.id.izquierda),
                resu2=findViewById(R.id.derecha);
        if (v.getId()==R.id.celsiuss) {
        resu1.setText(""+f.parse(c));
        resu2.setText(""+k.parse(c));
        }else if (v.getId()==R.id.farenheitt) {
        resu1.setText(""+c.parse(f));
        resu2.setText(""+k.parse(f));
        }else if (v.getId()==R.id.kelvinn) {
            resu1.setText(""+c.parse(k));
            resu2.setText(""+f.parse(k));
        }

    }
}