package com.example.grampanchyat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminHomeActivity extends AppCompatActivity {

    Button register,imageup,notification,certificate,videoupload,taxpay,payment,userdel,ration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        notification=(Button)findViewById(R.id.empgramp);
        videoupload=(Button)findViewById(R.id.videoup);
        imageup=(Button)findViewById(R.id.imageupload);
        certificate=(Button)findViewById(R.id.certificate);
        register=(Button)findViewById(R.id.userreg);
        taxpay=(Button)findViewById(R.id.taxpay);
        payment=(Button)findViewById(R.id.payment);
        ration=(Button)findViewById(R.id.ration);
        userdel=(Button)findViewById(R.id.userdel);
        userdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.print("not available");
            }
        });

        ration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHomeActivity.this,RationActivity.class));

            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHomeActivity.this,TaxpaActivity.class));

            }
        });
        taxpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHomeActivity.this,TaxpaActivity.class));

            }
        });



        videoupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AdminHomeActivity.this,MainupActivity.class));
              video();
            }
        });

        certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHomeActivity.this,certificate_activity.class));
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHomeActivity.this,MainNotificationActivity.class));
            }
        });

        imageup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i= new Intent(AdminHomeActivity.this,MainupActivity.class);
               startActivity(i);
            }
        });

    register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           startActivity(new Intent(AdminHomeActivity.this,RegisterNewActivity.class));

        }
    });
    }
public void video()
{
    Toast.makeText(getApplicationContext(), "not available", Toast.LENGTH_SHORT).show();

}

}
