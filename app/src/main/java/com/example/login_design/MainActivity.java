package com.example.login_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // public Button regbtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

     //   regbtn =(Button) findViewById(R.id.register_btn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   /* regbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            open();
        }
    });*/


    }
    public int open(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        return 0;
    }

}
