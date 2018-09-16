package com.ravirathee.a107_customtoast;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button CustomToast1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomToast1 = findViewById(R.id.CustomToast);
        CustomToast1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.CustomToast){
            LayoutInflater i = getLayoutInflater();
            View view = i.inflate(R.layout.custom, (ViewGroup)findViewById(R.id.custom_layout1));
            Toast t = new Toast(getApplicationContext());
            t.setDuration(Toast.LENGTH_SHORT);
            t.setView(view);
            t.setGravity(Gravity.FILL_HORIZONTAL,0,0);
            t.show();
        }



    }
}
