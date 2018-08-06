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

public class ThreeFragment extends Fragment {

    String loc;
    Uri uri;
    int var =1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<tour> places = new ArrayList<tour>();

        places.add(new tour(R.drawable.jw, R.string.jw_cafe));
        places.add(new tour(R.drawable.oberoi, R.string.ober));
        places.add(new tour(R.drawable.leela, R.string.lel));
        places.add(new tour(R.drawable.hyatt, R.string.the_hyatt));
        places.add(new tour(R.drawable.ren, R.string.renaissance));
        places.add(new tour(R.drawable.taj, R.string.taj_hotel));

        tourAdapter adapter = new tourAdapter(getActivity(), places, R.color.backish);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ThreeFragment.this.getActivity(), details1.class);
                switch (position) {
                    case 0:
                        intent.putExtra("score", position);
                        intent.putExtra("name", R.string.jw_cafe);
                        intent.putExtra("var",var);
                        intent.putExtra("img", R.drawable.jw);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("score", position);
                        intent.putExtra("name", R.string.ober);
                        intent.putExtra("var",var);
                        intent.putExtra("img", R.drawable.oberoi);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("score", position);
                        intent.putExtra("name", R.string.lel);
                        intent.putExtra("var",var);
                        intent.putExtra("img", R.drawable.leela);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("score", position);
                        intent.putExtra("var",var);
                        intent.putExtra("name", R.string.the_hyatt);
                        intent.putExtra("img", R.drawable.hyatt);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("score", position);
                        intent.putExtra("var",var);
                        intent.putExtra("name", R.string.renaissance);
                        intent.putExtra("img", R.drawable.ren);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("score", position);
                        intent.putExtra("var",var);
                        intent.putExtra("name", R.string.taj_hotel);
                        intent.putExtra("img", R.drawable.taj);
                        startActivity(intent);
                        break;
                }
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        loc = getString(R.string.jw_cafe);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                        break;
                    case 1:
                        loc = getString(R.string.ober);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent0 = new Intent(Intent.ACTION_VIEW, uri);
                        intent0.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent0);
                        break;
                    case 2:
                        loc = getString(R.string.lel);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                        intent1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent1);
                        break;
                    case 3:
                        loc = getString(R.string.the_hyatt);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                        intent2.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent2);
                        break;
                    case 4:
                        loc = getString(R.string.renaissance);
                        uri = Uri.parse("http://maps.google.co.in/maps?q=" + Uri.encode(loc));
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                        intent3.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent3);
                        break;
                    case 5:
                        loc = getString(R.string.taj_hotel);
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