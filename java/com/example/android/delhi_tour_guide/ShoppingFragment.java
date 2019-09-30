package com.example.android.delhi_tour_guide;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        // Create a list of words
        final ArrayList<Attractions> words = new ArrayList<Attractions>();
        words.add(new Attractions(R.string.ShoppingNameA, R.string.ShoppingDetailsA, R.drawable.chandni_chowk));
        words.add(new Attractions(R.string.ShoppingNameB, R.string.ShoppingDetailsB, R.drawable.lajpat_nagar));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), words, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
                Attractions Attractions = words.get(position);
            }
        });

        return rootView;
    }

}
