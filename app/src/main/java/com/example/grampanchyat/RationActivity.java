package com.example.grampanchyat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class RationActivity extends AppCompatActivity {
    private WebView mWebView7;
    ProgressBar progressBar7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ration);
        mWebView7 = (WebView) findViewById(R.id.activity_main_webview);

        progressBar7 = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView7.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView7.loadUrl("http://mahafood.gov.in/website/english/Download.aspx");
    }
}
