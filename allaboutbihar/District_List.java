package ca.blogspot.sjatyourservice.allaboutbihar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayArwal;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayAurangabad;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayBanka;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayBegusarai;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayBhagalpur;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayBhojpur;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayBuxar;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayDarbhanga;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayGaya;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayGopalganj;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayJamui;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayJehanabad;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayKaimur;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayKatihar;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayKhagaria;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayKishanganj;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayAraria;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayNawada;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayPashchimChamparan;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayPatna;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayLakhisarai;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayMadhepura;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayMadhubani;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayMunger;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayMuzaffarpur;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayNalanda;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayPurbaChamparan;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayPurnia;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayRohtas;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplaySaharsa;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplaySamastipur;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplaySaran;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplaySheikhpura;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplaySheohar;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplaySupaul;
import ca.blogspot.sjatyourservice.allaboutbihar.District_Class.DisplayVaishali;
import ca.blogspot.sjatyourservice.allaboutbihar.Miscellaneous.About_App;
import ca.blogspot.sjatyourservice.allaboutbihar.Miscellaneous.About_Developer;

public class District_List extends AppCompatActivity {
private Toolbar toolbar;
	private AdView mAdView;
private InterstitialAd interstitialAd;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_district__list);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
													 Intent i = new Intent(District_List.this,
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
													 Toast.makeText( District_List.this,"WELCOME " +
															 "TO " +
															 "APP " +
															 "INFORMATION",Toast
															 .LENGTH_LONG).show();
													 Intent i1 = new Intent(District_List.this,
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







	public void ArariaActivity(View view) {

		startActivity(new Intent( this, DisplayAraria.class));
	}

	public void ArwalActivity(View view) {
		startActivity(new Intent(this, DisplayArwal.class));
	}
	public void AurangabadActivity(View view) {
		startActivity(new Intent(this, DisplayAurangabad.class));
	}

	public void BankaActivity(View view) {
		startActivity(new Intent(this, DisplayBanka.class));
	}

	public void BegusaraiActivity(View view) {
		startActivity(new Intent(this, DisplayBegusarai.class));
	}

	public void BhagalpurActivity(View view) {
		startActivity(new Intent(this, DisplayBhagalpur.class));
	}

	public void BhojpurActivity(View view) {
		startActivity(new Intent(this, DisplayBhojpur.class));
	}
	public void BuxarActivity(View view) {
		startActivity(new Intent(this, DisplayBuxar.class));
	}

	public void DarbhangaActivity(View view) {
		startActivity(new Intent(this, DisplayDarbhanga.class));
	}

	public void GayaActivity(View view) {
		startActivity(new Intent(this, DisplayGaya.class));
	}

	public void GopalganjActivity(View view) {
		startActivity(new Intent(this, DisplayGopalganj.class));
	}

	public void JamuiActivity(View view) {
		startActivity(new Intent(this, DisplayJamui.class));
	}
   public void JehanabadActivity(View view) {
		startActivity(new Intent(this, DisplayJehanabad.class));
	}

	public void KaimurActivity(View view) {
		startActivity(new Intent(this, DisplayKaimur.class));
	}




	public void KatiharActivity(View view) {
		startActivity(new Intent(this, DisplayKatihar.class));
	}

	public void KhagariaActivity(View view) {
		startActivity(new Intent(this, DisplayKhagaria.class));
	}

	public void KishanganjActivity(View view) {
		startActivity(new Intent(this, DisplayKishanganj.class));
	}

	public void LakhisaraiActivity(View view) {
		startActivity(new Intent(this, DisplayLakhisarai.class));
	}


	public void MadhepuraActivity(View view) {
		startActivity(new Intent(this, DisplayMadhepura.class));
	}


	public void MadhubaniActivity(View view) {
		startActivity(new Intent(this, DisplayMadhubani.class));
	}

	public void MungerActivity(View view) {
		startActivity(new Intent(this, DisplayMunger.class));
	}

	public void MuzaffarpurActivity(View view) {
		startActivity(new Intent(this, DisplayMuzaffarpur.class));
	}

	public void NalandaActivity(View view) {
		startActivity(new Intent(this, DisplayNalanda.class));
	}

	public void NawadaActivity(View view) {startActivity(new Intent(this, DisplayNawada.class));
	}
/***/
	public void  PashchimChamparanActivity(View view) {startActivity(new Intent(this, DisplayPashchimChamparan.class));
	}


	public void  PatnaActivity(View view) {startActivity(new Intent(this, DisplayPatna.class));
	}public void  PurbaChamparanActivity(View view) {startActivity(new Intent(this, DisplayPurbaChamparan.class));
	}public void  PurniaActivity(View view) {startActivity(new Intent(this, DisplayPurnia.class));
	}public void  RohtasActivity(View view) {startActivity(new Intent(this, DisplayRohtas.class));
	}public void  SaharsaActivity(View view) {startActivity(new Intent(this, DisplaySaharsa.class));
	}public void  SamastipurActivity(View view) {startActivity(new Intent(this, DisplaySamastipur.class));
	}public void  SaranActivity(View view) {startActivity(new Intent(this, DisplaySaran.class));
	}public void  SheikhpuraActivity(View view) {startActivity(new Intent(this, DisplaySheikhpura.class));
	}public void  SheoharActivity(View view) {startActivity(new Intent(this, DisplaySheohar.class));
	}public void  SupaulActivity(View view) {startActivity(new Intent(this, DisplaySupaul.class));
	}
	public void  VaishaliActivity(View view) {startActivity(new Intent(this, DisplayVaishali.class));
	}










}
