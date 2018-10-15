package com.example.holly.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Bmi extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
    }

    public void bmi(View view){
        Log.d("Bmi","bmi");

       String w = edWeight.getText().toString();
       String h = edHeight.getText().toString();
       Log.d("Bmi",w+"/"+h);
       float weight = Float.parseFloat(w);
       float height = Float.parseFloat(h);
       float bmi = weight/(height*height);
       Log.d("Bmi",bmi+" ");
        Toast.makeText(this,"Your Bmi is"+ bmi,Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this).setMessage("Your BMI is" + bmi)
                .setTitle("BMI")
                .setPositiveButton("OK",null)
                .setNegativeButton("Clear", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edHeight.setText(" ");
                        edWeight.setText(" ");
                    }
                })
                .show();



    }


}
