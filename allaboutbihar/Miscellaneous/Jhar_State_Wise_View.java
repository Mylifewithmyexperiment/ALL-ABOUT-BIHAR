package ca.blogspot.sjatyourservice.allaboutbihar.Miscellaneous;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import ca.blogspot.sjatyourservice.allaboutbihar.R;

public class Jhar_State_Wise_View extends AppCompatActivity {

private WebView MAP;
private Toolbar toolbar;
private AdView mAdView;
	private InterstitialAd interstitialAd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jhar__state__wise__view);

		MAP =(WebView)findViewById(R.id.webViewJharkhand_map);
		//this.MAP.loadUrl("file:///android_res/drawable/home_bg_jhar.png");
		MAP.getSettings().setAllowFileAccessFromFileURLs(true);
		MAP.getSettings().setAllowUniversalAccessFromFileURLs(true);
		MAP.setWebViewClient(new myWebClient());
		MAP.loadUrl("file:///android_asset/home_bg_jhar.png");
		MAP.setHorizontalScrollBarEnabled(false);
		MAP.getSettings().setJavaScriptEnabled(true);
		MAP.getSettings().setBuiltInZoomControls(true);
		MAP.getSettings().setSupportZoom(true);
		MAP.getSettings().setDisplayZoomControls(true);
		toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		/** ad codes are here **/
		interstitialAd = new InterstitialAd(this);
		interstitialAd.setAdUnitId("ca-app-pub-5278704802151871/7088089475");
		interstitialAd.loadAd(new AdRequest.Builder().build());


	}

	@Override
	public boolean onCreateOptionsMenu(final android.view.Menu menu)
	{


		interstitialAd.loadAd(new AdRequest.Builder().build());
		interstitialAd.setAdListener(new AdListener()
									 {
										 @Override
										 public void onAdClosed()
										 {
											 MenuInflater inflater = getMenuInflater();
											 inflater.inflate(R.menu.homeoption, menu);
											 interstitialAd.loadAd(new AdRequest.Builder().build());
										 }

									 }


		);
		if(interstitialAd.isLoaded())
		{
			interstitialAd.show();
		}

		else
		{
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.homeoption, menu);
		}

		return super.onCreateOptionsMenu(menu);

	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			default:
				finish();
				break;

			case R.id.item1:

				interstitialAd.loadAd(new AdRequest.Builder().build());
				interstitialAd.setAdListener(new AdListener() {
					@Override
					public void onAdClosed() {

						Intent localIntent = new Intent("android.intent.action.SEND");
						localIntent.setType("text/plain");
						//  localIntent.addFlags(524288);
						localIntent.putExtra("android.intent.extra.SUBJECT", "ALL ABOUT BIHAR");
						localIntent.putExtra("android.intent.extra.TEXT", "Now know your BIHAR 	with " +
								"more updated information on its demographic and non-demographic " +
								"information.Also u can play quiz on BIHAR information get " +
								"location map.U can give your feedback to government or can ask " +
								"query, just click here to visit app " +
								"https://play.google.com/store/apps/details?id=ca.blogspot.sjatyourservice.allaboutbihar"
						);
						startActivity(Intent.createChooser(localIntent, "ALL ABOUT BIHAR!"));

						interstitialAd.loadAd(new AdRequest.Builder().build());
					}
				});
				if(interstitialAd.isLoaded())
				{
					interstitialAd.show();
				}
				else
				{
					Intent localIntent = new Intent("android.intent.action.SEND");
					localIntent.setType("text/plain");
					//  localIntent.addFlags(524288);
					localIntent.putExtra("android.intent.extra.SUBJECT", "ALL ABOUT BIHAR");
					localIntent.putExtra("android.intent.extra.TEXT", "Now know your BIHAR 	with " +
							"more updated information on its demographic and non-demographic " +
							"information.Also u can play quiz on BIHAR information get " +
							"location map.U can give your feedback to government or can ask " +
							"query, just click here to visit app " +
							"https://play.google.com/store/apps/details?id=ca.blogspot.sjatyourservice.allaboutbihar"
					);
					startActivity(Intent.createChooser(localIntent, "ALL ABOUT BIHAR!"));
				}
				break;

			case R.id.item2:

				interstitialAd.loadAd(new AdRequest.Builder().build());
				interstitialAd.setAdListener(new AdListener() {
					@Override
					public void onAdClosed() {
						Intent localIntent1 = new Intent("android.intent.action.VIEW");
						localIntent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=ca.blogspot.sjatyourservice.allaboutbihar"));
						startActivity(localIntent1);

						interstitialAd.loadAd(new AdRequest.Builder().build());
					}
				});

				if(interstitialAd.isLoaded())

				{
					interstitialAd.show();
				}
				else
				{
					Intent localIntent1 = new Intent("android.intent.action.VIEW");
					localIntent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=ca.blogspot.sjatyourservice.allaboutbihar"));
					startActivity(localIntent1);
				}

				break;


			case R.id.item3:

				interstitialAd.loadAd(new AdRequest.Builder().build());
				interstitialAd.setAdListener(new AdListener()

											 {

												 @Override
												 public void onAdClosed()
												 {
													 Intent i = new Intent(Jhar_State_Wise_View.this,
															 About_Developer.class);
													 startActivity(i);
													 interstitialAd.loadAd(new AdRequest.Builder()
															 .build());
												 }

											 }

				);


				if(interstitialAd.isLoaded())
				{
					interstitialAd.show();
				}
				else
				{
					Intent i = new Intent(this,
							About_Developer.class);
					startActivity(i);
					interstitialAd.loadAd(new AdRequest.Builder()
							.build());
				}
				break;

			case R.id.item4:
				interstitialAd.loadAd(new AdRequest.Builder().build());
				interstitialAd.setAdListener(new AdListener()
											 {
												 @Override
												 public void onAdClosed()
												 {
													 Toast.makeText( Jhar_State_Wise_View.this,"WELCOME " +
															 "TO " +
															 "APP " +
															 "INFORMATION",Toast
															 .LENGTH_LONG).show();
													 Intent i1 = new Intent(Jhar_State_Wise_View.this,
															 About_App
																	 .class);
													 startActivity(i1);
													 interstitialAd.loadAd(new AdRequest.Builder
															 ().build());
												 }
											 }

				);

				if(interstitialAd.isLoaded())

				{
					interstitialAd.show();
				}
				else
				{
					Toast.makeText(this,"WELCOME TO APP INFORMATION",Toast
							.LENGTH_LONG).show();
					Intent i1 = new Intent(this,About_App
							.class);
					startActivity(i1);
					interstitialAd.loadAd(new AdRequest.Builder
							().build());
				}

				break;

			case R.id.item5:

				interstitialAd.loadAd(new AdRequest.Builder().build());
				interstitialAd.setAdListener(new AdListener()
											 {
												 @Override
												 public void onAdClosed()
												 {
													 finishAffinity();
													 interstitialAd.loadAd(new AdRequest.Builder().build());
												 }
											 }

				);
				if(interstitialAd.isLoaded())
				{
					interstitialAd.show();
				}
				else
				{
					finishAffinity();
				}
				break;
		}
		return super.onOptionsItemSelected(item);



	}





	private class myWebClient extends WebViewClient {
		public myWebClient() {

	}
		public void onPageFinished(WebView paramWebView,String paramString){
			super.onPageFinished(paramWebView, paramString);


		}



		public void onPageStarted (WebView paramWebView,String paramString,Bitmap paramBitmap  )
	{
		super.onPageStarted(paramWebView, paramString ,paramBitmap);
	}


	public boolean shouldOverrideUrlLoading (WebView paramWebView, String paramString)
	{
		paramWebView.loadUrl(paramString);
		return true;
	}


}

}
