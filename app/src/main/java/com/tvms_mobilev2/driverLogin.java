package com.tvms_mobilev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class driverLogin extends AppCompatActivity implements View.OnClickListener{
    Button btn_loginDriver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        btn_loginDriver=findViewById(R.id.btn_loginDriver);
        btn_loginDriver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btn_loginDriver){
            startActivity(new Intent(this, driverMain.class));
        }
    }
}
