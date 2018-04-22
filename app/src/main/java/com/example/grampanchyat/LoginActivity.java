
package com.example.grampanchyat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private EditText username;
    private EditText password1;
    private Button login1;
    private FirebaseAuth firebaseAuth;
    private TextView sup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        firebaseAuth = FirebaseAuth.getInstance();
        sup=(TextView)findViewById(R.id.sup);
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, PasswordActivity.class));
                finish();
            }
        });
        username = (EditText) findViewById(R.id.usernametxt);
        password1 = (EditText) findViewById(R.id.passwordtxt);

        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user != null) {
            finish();
            startActivity(new Intent(LoginActivity.this, UserHomeActivity.class));
        }
        login1 = (Button) findViewById(R.id.login);
        login1.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         if(username.getText().toString().isEmpty() )
                                         {
                                             Toast.makeText(getApplicationContext(), "वापरकर्तानाव आवश्यक", Toast.LENGTH_SHORT).show();
                                         }
                                         else if(password1.getText().toString().isEmpty())
                                         {
                                             Toast.makeText(getApplicationContext(), "पासवर्ड आवश्यक", Toast.LENGTH_SHORT).show();
                                         }
                                         else if(username.getText().toString().isEmpty() || password1.getText().toString().isEmpty())
                                         {
                                             Toast.makeText(getApplicationContext(), "वापरकर्तानाव आवश्यक || पासवर्ड आवश्यक", Toast.LENGTH_SHORT).show();
                                         }
                                         loginuser(username.getText().toString().trim(),  password1.getText().toString().trim());
                                     }

                                 }


        );


    }

    private void loginuser(final String username, String password1) {

        firebaseAuth.signInWithEmailAndPassword(username, password1)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful() && username.equals("admin@gmail.com")) {
                            Toast.makeText(getApplicationContext(), "लॉगिन प्रशासक यशस्वी", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(LoginActivity.this, AdminHomeActivity.class));
                            finish();
                        } else  {
                            Toast.makeText(getApplicationContext(), "लॉगिन वापरकर्ता यशस्वी", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                        finish();
                        }

                    }

                });


    }
}