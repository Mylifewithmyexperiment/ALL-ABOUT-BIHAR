package ca.blogspot.sjatyourservice.allaboutbihar.Fragments_Class;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ca.blogspot.sjatyourservice.allaboutbihar.R;


public class Frag_Geo_Intro extends Fragment {

	public Frag_Geo_Intro() {
		// Required empty public constructor
	}


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment

		View v = inflater.inflate(R.layout.frag_gen_listview, container, false);


		String[] details={


				" Area    \t- 94,163.00 sq. kms ",
				"Rular area  \t - 92,257.51 sq. kms ",
				"Urban area   \t -1,095.49 sq. kms ",
				"Area wise rank of Bihar in India   \t-  13th "
				,};


		ListView listViewX= (ListView) v.findViewById(R.id.frag_gen_listview);

		ArrayAdapter<String> abc= new ArrayAdapter<String>(getActivity(),android.R.layout
				.simple_list_item_1,details);
		listViewX.setAdapter(abc);


		return v;

	}


}
