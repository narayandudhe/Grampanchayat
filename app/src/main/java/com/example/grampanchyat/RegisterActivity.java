package com.example.grampanchyat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    EditText fname,mname,lname,email,mobile,password,hno,dob;
    Button submit;
    DatabaseReference databaseReference;
    FirebaseAuth mAuth;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        textView=(TextView)findViewById(R.id.imagetxt);
        SharedPreferences pre= getSharedPreferences("pre",MODE_PRIVATE);
        boolean firststart=pre.getBoolean("firststart",true);

        // inilazing firbase object
       mAuth= FirebaseAuth.getInstance();
        //if user not loged in
        if (mAuth.getCurrentUser()== null)
        {
            finish();
            startActivity(new Intent(this,LoginActivity.class));
        }
        databaseReference= FirebaseDatabase.getInstance().getReference("user");


        fname=(EditText)findViewById(R.id.fname);
        mname=(EditText)findViewById(R.id.mname);
        lname=(EditText)findViewById(R.id.lname);
        email=(EditText)findViewById(R.id.email);
        mobile=(EditText)findViewById(R.id.mobile);
        password=(EditText)findViewById(R.id.password);
        hno=(EditText)findViewById(R.id.hno);
        dob=(EditText)findViewById(R.id.dob);
        submit=(Button)findViewById(R.id.submit);
        FirebaseUser user=mAuth.getCurrentUser();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adduser();
            }
        });
    }
    private void adduser()
    {
        String First=fname.getText().toString().trim();
        String Middle=mname.getText().toString().trim();
        String Last=lname.getText().toString().trim();
        String Email=email.getText().toString().trim();
        String Mobile=mobile.getText().toString().trim();
        String Password=password.getText().toString().trim();
        String Hno=hno.getText().toString().trim();
        String Dob=dob.getText().toString().trim();

    if (!TextUtils.isEmpty(First))
    {

        user user1=new user(First,Middle,Last,Email,Mobile,Password,Hno,Dob);
        FirebaseUser user=mAuth.getCurrentUser();

        databaseReference.child(user.getUid()).setValue(user1);
        Toast.makeText(this,"information saved",Toast.LENGTH_LONG).show()



                        ;
        finish();
        startActivity(new Intent(RegisterActivity.this, User_home_activity.class));

        SharedPreferences pre=getSharedPreferences("pre",MODE_PRIVATE);
        SharedPreferences.Editor editor=pre.edit();
        editor.putBoolean("firststart",false);
        editor.apply();
finish();

    }
    else {Toast.makeText(this,"enter name",Toast.LENGTH_SHORT).show();
    }
       /* if (!TextUtils.isEmpty(Middle)
        {}
        else {Toast.makeText(this,"enter Middle",Toast.LENGTH_SHORT).show();}
        if (!TextUtils.isEmpty(Last))
        {}
        else {Toast.makeText(this,"enter last",Toast.LENGTH_SHORT).show();}
        if (!TextUtils.isEmpty(Email))
        {}
        else {Toast.makeText(this,"enter email",Toast.LENGTH_SHORT).show();}
        if (!TextUtils.isEmpty(Mobile))
        {}
        else {Toast.makeText(this,"enter mobile",Toast.LENGTH_SHORT).show();}
        if (!TextUtils.isEmpty(Password))
        {}
        else {Toast.makeText(this,"enter password",Toast.LENGTH_SHORT).show();}
        if (!TextUtils.isEmpty(Hno))
        {}
        else {Toast.makeText(this,"enter hno",Toast.LENGTH_SHORT).show();}
        if (!TextUtils.isEmpty(Dob))
        {}
        else {Toast.makeText(this,"enter dob",Toast.LENGTH_SHORT).show();}

*/







    }

    @Override
    public void onClick(View view) {

    }


}