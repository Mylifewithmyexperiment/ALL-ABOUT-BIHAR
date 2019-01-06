package ca.blogspot.sjatyourservice.allaboutbihar.Fragments_Class;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import ca.blogspot.sjatyourservice.allaboutbihar.R;

public class Frag_rivers extends Fragment {


    public Frag_rivers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      ;



		View v = inflater.inflate(R.layout.frag_gen_listview, container, false);



		String[] details={
				"River name -\t Originate from",
				"Gandak - \t  Dhaulagiri in Tibet near Nepal  ",
				" Ganga - \t  Chausa",
				" Kamla- \t Mahabharta range of Hills in Nepal  ",
				" Mahananda -\t Sikkim  ",
				" Sone-\t Amarkantak Hills in Madhya Pradesh  ",
				"Kosi -\t Saptakoshi"
				 };


		ListView listViewX= (ListView) v.findViewById(R.id.frag_gen_listview);

		ArrayAdapter<String> abc= new ArrayAdapter<String>(getActivity(),android.R.layout
				.simple_list_item_1,details);
		listViewX.setAdapter(abc);


		return v;



    }

}
