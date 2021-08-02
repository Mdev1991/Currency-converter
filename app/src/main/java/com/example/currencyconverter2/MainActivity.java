package com.example.currencyconverter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickConvert(View view)
    {
        //SAVE VALUE OF TEXTFIELD
        EditText editDolarText = findViewById(R.id.editDolarText);
        EditText editRealText = findViewById(R.id.editRealText);
        EditText editPoundText = findViewById(R.id.editPoundText);

        //SHOW VALUE IN TERMINAL
        Log.i("Info", "Button Clicked!");
        Log.i("Info", editDolarText.getText().toString());
        Log.i("Info", editRealText.getText().toString());
        Log.i("Info", editPoundText.getText().toString());

        //CONVERT VALUE TO STRING
        String amountInDolars = editDolarText.getText().toString();
        String amountInReais = editRealText.getText().toString();
        String amountInPounds = editPoundText.getText().toString();

        //CONVERT STRING TO DOUBLE
        double amountInDolarsDouble = Double.parseDouble(amountInDolars);
        double amountInReaisDouble = Double.parseDouble(amountInReais);
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);

        //CONVERSION BY COIN
        double dolarsOperation = amountInDolarsDouble * 0.85;
        double reaisOperation = amountInReaisDouble * 0.17;
        double poundsOperation = amountInPoundsDouble * 1.17;

        //CONVERT DOUBLE TO STRING
        String dolarsOperationValue = Double.toString(dolarsOperation);
        String reaisOperationValue = Double.toString(reaisOperation);
        String poundsOperationValue = Double.toString(poundsOperation);

        //FORMAT STRING VALUES
        String dolarsValueText = String.format("%.2f", dolarsOperation);
        String reaisValueText = String.format("%.2f", reaisOperation);
        String poundsValueText = String.format("%.2f", poundsOperation);

        //SHOW RESULT ON SCREEN
        Toast.makeText(this,"$: " + amountInDolars + " = " + "€: " + dolarsValueText, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "R$: " + amountInReais + " = " + "€: " + reaisValueText, Toast.LENGTH_LONG).show();
        Toast.makeText(this,"£: " + amountInPounds + " = " + "€: " + poundsValueText, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}