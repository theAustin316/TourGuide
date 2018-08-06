package com.example.vivek.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FourFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<native_to> cuisine = new ArrayList<native_to>();

        cuisine.add(new native_to(R.drawable.basic, R.string.diet));
        cuisine.add(new native_to(R.drawable.ganesh, R.string.ganeh));
        cuisine.add(new native_to(R.drawable.nav, R.string.tam));
        cuisine.add(new native_to(R.drawable.tadoba_reserve, R.string.tadoba));
        cuisine.add(new native_to(R.drawable.times, R.string.media));
        cuisine.add(new native_to(R.drawable.pav, R.string.pav_bhaji));
        cuisine.add(new native_to(R.drawable.vada, R.string.vada));

        nativeAdapter adapter = new nativeAdapter(getActivity(), cuisine, R.color.backish);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}