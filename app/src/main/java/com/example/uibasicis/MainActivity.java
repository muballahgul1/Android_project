package com.example.uibasicis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txtHello;
    private EditText editTxtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button helloBtnClick=findViewById(R.id.helloBtnClick);
        helloBtnClick.setOnClickListener(this);
         editTxtName=findViewById(R.id.ediTxtName);
         txtHello=findViewById(R.id.txtHello);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.helloBtnClick:
                Toast.makeText(this, "Hello button is clicked", Toast.LENGTH_SHORT).show();
                txtHello.setText("Hello"+editTxtName.getText().toString());
                break;
            default:
                break;
        }
    }
}