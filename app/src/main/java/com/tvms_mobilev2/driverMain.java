package com.tvms_mobilev2;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class driverMain extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_main);
        mDrawerLayout=findViewById(R.id.driverDrawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navView=findViewById(R.id.nav_driver);
        navView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return  super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int i=menuItem.getItemId();
        if(i== R.id.nav_vr){
            Toast.makeText(this,"VIOLATION RECORD SHIT",Toast.LENGTH_LONG).show();
        }
        if(i== R.id.nav_vp){
            Toast.makeText(this,"penalties SHIT",Toast.LENGTH_LONG).show();
        }
        if(i== R.id.nav_inquire){
            Toast.makeText(this,"INQUIRESHIT",Toast.LENGTH_LONG).show();
        }
        if(i== R.id.nav_eh){
            Toast.makeText(this,"emergency shits",Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
