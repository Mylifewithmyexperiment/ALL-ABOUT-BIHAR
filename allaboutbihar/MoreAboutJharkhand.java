package ca.blogspot.sjatyourservice.allaboutbihar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MoreAboutJharkhand extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_more_about_jharkhand);

		WebView webView_More_about_jharkhand=(WebView) findViewById(R.id.webView_More_about_jharkhand);
        webView_More_about_jharkhand.getSettings().setJavaScriptEnabled(true);
        webView_More_about_jharkhand.setWebViewClient(new WebViewClient());
		webView_More_about_jharkhand.loadUrl("http://gov.bih.nic.in/");

	}






}
