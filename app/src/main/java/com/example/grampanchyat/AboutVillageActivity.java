package com.example.grampanchyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AboutVillageActivity extends AppCompatActivity {

    TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_village);
    info=(TextView)findViewById(R.id.infov);
    info.setText("सुल्तानवाडी फुलंबरी तालुक्यात एक गाव आहे. सुलतानवाडी हे येरला नदीच्या काठावर आणि औरंगाबाद-जळगाव महामार्गावर एक लहान शहर आहे. हे गाव कमी मजल्यावर वसलेले आहे आणि नैसर्गिक संसाधने विपुल आहेत. यरलाला नदीची एक नैसर्गिक सीमा व भरपूर वन संसाधने आहेत. येथे जमीन सपाट, टिकाऊ आणि पाण्याचा निचरा आहे आणि माती काळ्या आणि मुरुम आहे. गावात वसलेली लागवड, विहीर, लेन, कोल्हापुरी प्रणाली आणि येरलाळा धरणांसाठी पाणी स्ट्रोकचा वापर केला जातो");
    }
}
