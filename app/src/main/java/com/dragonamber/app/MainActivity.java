package com.dragonamber.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setStatusBarColor(Color.rgb(16,23,19));
    getWindow().setNavigationBarColor(Color.rgb(16,23,19));
    LinearLayout root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setBackgroundColor(Color.rgb(16,23,19));
    TextView title = new TextView(this);
    title.setText("💎  ARK DRAGON AMBER");
    title.setTextColor(Color.rgb(244,185,66));
    title.setTextSize(18);
    title.setPadding(16,14,16,14);
    root.addView(title, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    WebView web = new WebView(this);
    web.setBackgroundColor(Color.rgb(16,23,19));
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    s.setAllowContentAccess(false);
    web.setWebViewClient(new WebViewClient());
    root.addView(web, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1));
    setContentView(root);
    web.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() {
    super.onBackPressed();
  }
}
