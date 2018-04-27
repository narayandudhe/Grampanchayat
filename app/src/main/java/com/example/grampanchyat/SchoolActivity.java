package com.example.grampanchyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class SchoolActivity extends AppCompatActivity {
    private WebView mWebView3;
    ProgressBar progressBar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        mWebView3 = (WebView) findViewById(R.id.activity_main_webview);

        progressBar3 = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView3.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView3.loadUrl("www.savtacollege.org");
    }
}
