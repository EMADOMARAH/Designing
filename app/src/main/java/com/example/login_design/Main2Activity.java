package com.example.login_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
   // public Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

      //  login = (Button) findViewById(R.id.login_btn);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       /* login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();
            }
        });*/
    }

    public void open1(){
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}
