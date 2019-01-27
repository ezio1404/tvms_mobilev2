package com.tvms_mobilev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_driverLog,btn_enforcerLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_driverLog=findViewById(R.id.btn_driverLogin);
        btn_enforcerLog=findViewById(R.id.btn_enforcerLogin);

        btn_enforcerLog.setOnClickListener(this);
        btn_driverLog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_driverLogin){
            startActivity(new Intent(this, driverLogin.class));
        }
        if(v.getId() == R.id.btn_enforcerLogin){
            startActivity(new Intent(this, enforcerLogin.class));
        }
    }
}
