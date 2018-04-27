package com.example.grampanchyat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class UserHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button about,empgra,ration,taxpay,video;
    Button aboutgr,certificate,viewp,payment;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        about=(Button)findViewById(R.id.aboutvillage);
        aboutgr=(Button)findViewById(R.id.aboutgra);
        empgra=(Button)findViewById(R.id.empgramp);
        payment=(Button)findViewById(R.id.payment);
        ration=(Button)findViewById(R.id.rationc);
        certificate=(Button)findViewById(R.id.certificate);
        taxpay=(Button)findViewById(R.id.taxpay);
        viewp=(Button)findViewById(R.id.viewp);
        video=(Button)findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video();
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, TaxpaActivity.class));

            }
        });

        viewp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this,ImageListActivity.class));

            }
        });
        taxpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, TaxpaActivity.class));

            }
        });
        certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, certificate_activity.class));

            }
        });

        ration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, RationActivity.class));

            }
        });

        empgra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this,EmpGraActivity.class));

            }
        });

        aboutgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this,AboutGrampActivity.class));

            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, AboutVillageActivity.class));
            }
        });
        setSupportActionBar(toolbar);
        fab=(FloatingActionButton)findViewById(R.id.fab) ;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserHomeActivity.this, feedback.class));

            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void video() {
        Toast.makeText(getApplicationContext(), "Not available", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_user_home_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_myVillage) {
            startActivity(new Intent(UserHomeActivity.this, AboutVillageActivity.class));

        } else if (id == R.id.nav_school) {
            startActivity(new Intent(UserHomeActivity.this, SchoolActivity.class));

        } else if (id == R.id.nav_hospital) {
            startActivity(new Intent(UserHomeActivity.this, HospitalActivity.class));


        } else if (id == R.id.nav_yojana) {
            startActivity(new Intent(UserHomeActivity.this, YojanaActivity.class));


        } else if (id == R.id.nav_weather) {
            startActivity(new Intent(UserHomeActivity.this,WheatherActivity.class));


        } else if (id == R.id.nav_marketReport) {
            startActivity(new Intent(UserHomeActivity.this, MarketreportActivity.class));


        }
        else if(id == R.id.nav_news)
        {
            startActivity(new Intent(UserHomeActivity.this, generalnews.class));
        }
        else if(id == R.id.nav_setting)
        {
            startActivity(new Intent(UserHomeActivity.this, ProfileActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
