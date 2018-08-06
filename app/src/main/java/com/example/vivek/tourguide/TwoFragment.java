package com.example.vivek.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TwoFragment extends Fragment {

    String loc;
    Uri uri;

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

        cuisine.add(new native_to(R.drawable.bhim, R.string.bhima));
        cuisine.add(new native_to(R.drawable.shani, R.string.shani));
        cuisine.add(new native_to(R.drawable.gan, R.string.pule));
        cuisine.add(new native_to(R.drawable.sidh, R.string.siddhi));
        cuisine.add(new native_to(R.drawable.trim, R.string.trim));
        cuisine.add(new native_to(R.drawable.shir, R.string.shirdi));

        nativeAdapter adapter = new nativeAdapter(getActivity(), cuisine, R.color.backish);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        loc = getString(R.string.bhima);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                        break;
                    case 1:
                        loc = getString(R.string.shani);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent0 = new Intent(Intent.ACTION_VIEW, uri);
                        intent0.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent0);
                        break;
                    case 2:
                        loc = getString(R.string.pule);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                        intent1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent1);
                        break;
                    case 3:
                        loc = getString(R.string.siddhi);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                        intent2.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent2);
                        break;
                    case 4:
                        loc = getString(R.string.trim);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                        intent3.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent3);
                        break;
                    case 5:
                        loc = getString(R.string.shirdi);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                        intent4.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
        return rootView;
    }
}
