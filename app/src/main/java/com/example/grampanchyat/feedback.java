package com.example.grampanchyat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class feedback extends AppCompatActivity {
       private EditText txtFeedback;
       private Button submitfeeback;
    DatabaseReference databaseReference;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        txtFeedback=(EditText)findViewById(R.id.txtFeedback);
        submitfeeback=(Button)findViewById(R.id.submitfeedback);


        // inilazing firbase object
        mAuth= FirebaseAuth.getInstance();
        //if user not loged in
        if (mAuth.getCurrentUser()== null)
        {
            finish();
            startActivity(new Intent(this,LoginActivity.class));
        }
        databaseReference= FirebaseDatabase.getInstance().getReference("feedback");
        FirebaseUser user=mAuth.getCurrentUser();
        submitfeeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addfeed();
            }
        });
    }

    private void addfeed() {
        String Feedback=txtFeedback.getText().toString().trim();
        if (!TextUtils.isEmpty(Feedback))
        {
            Feed feed=new Feed(Feedback);
            FirebaseUser user=mAuth.getCurrentUser();

            databaseReference.child(user.getUid()).setValue(feed);
            Toast.makeText(this,"submitted sucess",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(feedback.this, User_home_activity.class));
        }
        else
            Toast.makeText(this,"enter feedback",Toast.LENGTH_SHORT).show();
    }
}
