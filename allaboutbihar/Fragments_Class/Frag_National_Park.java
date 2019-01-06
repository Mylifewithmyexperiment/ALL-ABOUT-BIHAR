package ca.blogspot.sjatyourservice.allaboutbihar.Fragments_Class;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import ca.blogspot.sjatyourservice.allaboutbihar.R;

public class Frag_National_Park extends Fragment {


	public Frag_National_Park() {
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


				"National Park \t Location",
				"Valmiki Tiger Reserve -  \t Bettiah ",
				"Udaypur Wildlife Santuary - \t Bettiah ",
				"Kanwar Lake Bird Santuary- \t  Begusarai ",
				"Sanjay Gandhi Zoological Park-  \t  Patna ",

				};



		ListView listViewX= (ListView) v.findViewById(R.id.frag_gen_listview);

		ArrayAdapter<String> abc= new ArrayAdapter<String>(getActivity(),android.R.layout
				.simple_list_item_1,details);
		listViewX.setAdapter(abc);


		return v;

	}


}
