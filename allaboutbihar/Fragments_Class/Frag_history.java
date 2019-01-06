package ca.blogspot.sjatyourservice.allaboutbihar.Fragments_Class;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import ca.blogspot.sjatyourservice.allaboutbihar.R;

public class Frag_history extends Fragment {

    public Frag_history() {
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



		String[] details={
				"The name Bihar is derived from the Sanskrit word  \t -Pali word, Vihara ",
				"Bihar consists of three distinct regions  \t-  Magadh, Mithila and Bhojpur  ",
				" The region of modern-day southwestern Bihar called     \t - Magadha  ",
				"The history of the land mass currently known as  \t -  Bihar   ",
				"The ancient land of Buddha, has witnessed golden period of Indian history in    " +
						"\t - Bihar ",
				};


		ListView listViewX= (ListView) v.findViewById(R.id.frag_gen_listview);

		ArrayAdapter<String> abc= new ArrayAdapter<String>(getActivity(),android.R.layout
				.simple_list_item_1,details);
		listViewX.setAdapter(abc);


		return v;

	}

}

