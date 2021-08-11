package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_n1;
    EditText et_n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_n1 = findViewById(R.id.et_n1);
        et_n2 = findViewById(R.id.et_n2);

    }
    public void ClickOk(View view){
      Intent intent = new Intent(this,second.class);
      String num1 = et_n1.getText().toString();
      String num2 = et_n2.getText().toString();

      intent.putExtra("n1",num1);
      intent.putExtra("n2",num2);
      startActivity(intent);

    }
}