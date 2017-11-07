package com.jim.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //String s = new String(" ");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        Button b_help = (Button) findViewById(R.id.b_help);
        b_help.setOnClickListener(listener);
    }
    public void bmi(View view){
        System.out.println("hello");
        Log.d("MainActivity","testing the method");
        Log.e("hello","quit");
        EditText edWeight = (EditText) findViewById(R.id.editWeight);
        EditText edheight = (EditText) findViewById(R.id.editHeight);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        float bmi = weight/(height*height);
        Log.d("Bmi",String.valueOf(bmi));
        //Toast.makeText(this, String.valueOf(bmi), Toast.LENGTH_SHORT).show();
        new AlertDialog.Builder(this).setMessage(getString(R.string.your_bmi_is)+bmi).setTitle("Bmi ").setPositiveButton("OK!",null).show();


    }
}
