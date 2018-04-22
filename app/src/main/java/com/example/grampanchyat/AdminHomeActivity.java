package com.example.grampanchyat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomeActivity extends AppCompatActivity {

    Button register,imageup,notification,certi,videoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        notification=(Button)findViewById(R.id.notification);
        videoup=(Button)findViewById(R.id.videoup);
        videoup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHomeActivity.this,MainupActivity.class));
            }
        });
        certi=(Button)findViewById(R.id.certi);
        certi.setOnClickListener(new View.OnClickListener() {
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
        imageup=(Button)findViewById(R.id.imageupload);
        imageup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(AdminHomeActivity.this,MainupActivity.class));
            }
        });
    register=(Button)findViewById(R.id.userreg);
    register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           startActivity(new Intent(AdminHomeActivity.this,RegisterNewActivity.class));

        }
    });
    }


}
