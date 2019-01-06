package ca.blogspot.sjatyourservice.allaboutbihar.District_Class;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import ca.blogspot.sjatyourservice.allaboutbihar.R;

/**
 * Created by SHASHI on 03-Nov-17.
 */

public class DisplayNalanda extends AppCompatActivity {


	GridView lv2;
	Toolbar toolbar;
	String[] data = { "Headquarter\t-Bihar Sharif ",

					  "Total Population\t- 2877653",

					  "Area\t-   2354sq.km",

					  "Population Density\t-1006  ",

					  "Sex Ratio\t- 922	",

					  "Total Literacy\t- 64.43 %	",
					  };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_west__singhbhum);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		lv2 = (GridView) findViewById(R.id.lv2);
		MyAdapter adapter = new MyAdapter(this,data);
		lv2.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.homeoption, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			default:
				finish();
				break;
			case R.id.item1:
				Intent localIntent = new Intent("android.intent.action.SEND");
				localIntent.setType("text/plain");

				localIntent.putExtra("android.intent.extra.SUBJECT", "ALL ABOUT Bihar");
				localIntent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=ca.blogspot.sjatyourservice.allaboutbihar");
				startActivity(Intent.createChooser(localIntent, "Share ALL ABOUT Bihar "));
				break;

			case R.id.item2:
				Intent localIntent1 = new Intent("android.intent.action.VIEW");
				localIntent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=ca.blogspot.sjatyourservice.allaboutbihar"));
				startActivity(localIntent1);
				break;

			case R.id.item3:
				Toast.makeText(this,"About Developer Clicked",Toast.LENGTH_SHORT).show();
				break;

			case R.id.item4:
				Toast.makeText(this,"About App Clicked",Toast.LENGTH_SHORT).show();
				break;

			case R.id.item5:
				finishAffinity();
				break;
		}
		return super.onOptionsItemSelected(item);
	}

	class MyAdapter extends ArrayAdapter {
		String[] titleArray;

		public MyAdapter(Context c, String[] sem1) {
			super(c, R.layout.list1, R.id.textView, sem1);
			this.titleArray = sem1;
		}

		@NonNull
		@Override
		public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View v = inflater.inflate(R.layout.list1, parent, false);
			TextView tv = (TextView) v.findViewById(R.id.textView);
			tv.setText(titleArray[position]);
			return v;

		}
	}



}


