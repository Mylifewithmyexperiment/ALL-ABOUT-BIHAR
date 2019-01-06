package ca.blogspot.sjatyourservice.allaboutbihar.Fragments_Class;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ca.blogspot.sjatyourservice.allaboutbihar.R;


public class frag_colleges extends Fragment {



    public frag_colleges() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.frag_gen_listview, container, false);



		String[] details={
				"Aligarh Muslim University- \t Kishanganj, 2013    ",
				"Bihar Agricultural University- \tBhagalpur, 2009  ",
				"B. R. Ambedkar Bihar University- \t Muzaffarpur,1952 ",
				"\tIndian Institute of Technology- \tPatna,2008  ",
				"Magadh University- \tBodhgaya,1962 ",
				" Nalanda Open University-\tPatna,1995  ",
				" Munger University-\tMunger,t2016  ",

				 };



		ListView listViewX= (ListView) v.findViewById(R.id.frag_gen_listview);

		ArrayAdapter<String> abc= new ArrayAdapter<String>(getActivity(),android.R.layout
				.simple_list_item_1,details);
		listViewX.setAdapter(abc);


		return v;

	}

}
