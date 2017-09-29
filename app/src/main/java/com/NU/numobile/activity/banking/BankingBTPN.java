package com.NU.numobile.activity.banking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.NU.numobile.R;

public class BankingBTPN extends AppCompatActivity {

    private WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking_btpn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        view = (WebView) this.findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.getSettings().setLoadsImagesAutomatically(true);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setDisplayZoomControls(false);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
        view.loadUrl("https://btpnwow.btpn.com/");

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            //ketika disentuh tombol back
            if ((keyCode == KeyEvent.KEYCODE_BACK) && view.canGoBack()) {
                view.goBack(); //method goback(),untuk kembali ke halaman sebelumnya
                return true;
            }
            // Jika tidak ada halaman yang pernah dibuka
            // maka akan keluar dari activity (tutup aplikasi)
            return super.onKeyDown(keyCode, event);
        }
    }
