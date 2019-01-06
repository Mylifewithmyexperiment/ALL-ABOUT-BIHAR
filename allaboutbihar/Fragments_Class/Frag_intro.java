package ca.blogspot.sjatyourservice.allaboutbihar.Fragments_Class;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import ca.blogspot.sjatyourservice.allaboutbihar.R;

public class Frag_intro extends Fragment {

	public Frag_intro() {
		// Required empty public constructor
	}


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {


		View v = inflater.inflate(R.layout.frag_gen_listview, container, false);


		String[] details=

				{
				          "Administrative Name \t -Bihar",
						  "Formed On \t- 31 march, 1936",

		                  "Official Language (Jharkhand) \t - Hindi ",
						  "capital \t -Patna",
						  "Second capital \t- Muzaffarpur",
						  "High Court  \t- Patna High Court ",
						  "Official language  \t-  Hindi ",
						  "Second official language \t - Urdu  ",
		};


		ListView listViewX= (ListView) v.findViewById(R.id.frag_gen_listview);

		ArrayAdapter<String> abc= new ArrayAdapter<String>(getActivity(),android.R.layout
				.simple_list_item_1,details);
		listViewX.setAdapter(abc);


		return v;

	}

}

