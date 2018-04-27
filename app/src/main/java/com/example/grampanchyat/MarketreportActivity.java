package com.example.grampanchyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class MarketreportActivity extends AppCompatActivity {
    private WebView mWebView2;
    ProgressBar progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketreport);
        mWebView2 = (WebView) findViewById(R.id.activity_main_webview);

        progressBar2 = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView2.loadUrl("agmarknet.gov.in");
    }
}
