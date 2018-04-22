package com.example.grampanchyat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserHomeActivity extends AppCompatActivity {
    Button about;
    Button aboutgr,certificate,viewp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        viewp=(Button)findViewById(R.id.viewp);
        viewp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, ImageListActivity.class));
            }
        });
        certificate=(Button)findViewById(R.id.certificate);
        certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, generalnews.class));
            }
        });
        about = (Button) findViewById(R.id.aboutvillage);
        aboutgr = (Button) findViewById(R.id.aboutgra);
        aboutgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, AboutGrampActivity.class));
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, AboutVillageActivity.class));
            }
        });


    }
}
