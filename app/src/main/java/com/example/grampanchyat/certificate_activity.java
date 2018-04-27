package com.example.grampanchyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class certificate_activity extends AppCompatActivity {
    private WebView mWebView4;
    ProgressBar progressBar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate_activity);

        mWebView4 = (WebView) findViewById(R.id.activity_main_webview);

        progressBar4 = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView4.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView4.loadUrl("https://aaplesarkar.mahaonline.gov.in");
    }
}
