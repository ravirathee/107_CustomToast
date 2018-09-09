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
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button CustomToast1;
    Button AlertDialog1;
    Button DatePicker1;

    AlertDialog.Builder builder; //Required for AlertDialog


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomToast1 = findViewById(R.id.CustomToast);
        CustomToast1.setOnClickListener(this);

        DatePicker1 = findViewById(R.id.DatePicker);
        DatePicker1.setOnClickListener(this);


        AlertDialog1 = findViewById(R.id.AlertDialog);


        builder = new AlertDialog.Builder(this); //Just like onclicklistner for Button
                                                        //this is required for AlertDialo

        AlertDialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Toast from 2nd button",Toast.LENGTH_SHORT).show();

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Hello from cancel",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });

                builder.setMessage("Do you want to continue");

                builder.setCancelable(true);
                //If we click somewhere else on screen it goes away(1) or not(0)
                //set true to make it able to go away
                //set false to make it able to not go away


                AlertDialog a = builder.create();
                a.setTitle("qwe");
                a.show();
            }
        });

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
        }else if(v.getId()==R.id.AlertDialog){




        }



    }
}
