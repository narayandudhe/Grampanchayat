package com.example.grampanchyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class YojanaActivity extends AppCompatActivity {
    private WebView mWebView5;
    ProgressBar progressBar5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yojana);

        mWebView5 = (WebView) findViewById(R.id.activity_main_webview);

        progressBar5 = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView5.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView5.loadUrl("panchayatsgoa.gov.in/schemes.php");
    }
}
