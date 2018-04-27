package com.example.grampanchyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class WheatherActivity extends AppCompatActivity {
    private WebView mWebView6;
    ProgressBar progressBar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheather);

        mWebView6 = (WebView) findViewById(R.id.activity_main_webview);

        progressBar6 = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView6.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView6.loadUrl("http://www.imd.gov.in/Welcome%20To%20IMD/Welcome.php");
    }
}
