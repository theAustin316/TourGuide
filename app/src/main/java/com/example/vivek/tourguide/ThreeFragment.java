package com.example.vivek.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.name), R.string.jw_cafe);
                        intent.putExtra(getString(R.string.var),var);
                        intent.putExtra(getString(R.string.img), R.drawable.jw);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.name), R.string.ober);
                        intent.putExtra(getString(R.string.var),var);
                        intent.putExtra(getString(R.string.img), R.drawable.oberoi);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.name), R.string.lel);
                        intent.putExtra(getString(R.string.var),var);
                        intent.putExtra(getString(R.string.img), R.drawable.leela);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var),var);
                        intent.putExtra(getString(R.string.name), R.string.the_hyatt);
                        intent.putExtra(getString(R.string.img), R.drawable.hyatt);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var),var);
                        intent.putExtra(getString(R.string.name), R.string.renaissance);
                        intent.putExtra(getString(R.string.img), R.drawable.ren);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var),var);
                        intent.putExtra(getString(R.string.name), R.string.taj_hotel);
                        intent.putExtra(getString(R.string.img), R.drawable.taj);
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
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent);
                        break;
                    case 1:
                        loc = getString(R.string.ober);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent0 = new Intent(Intent.ACTION_VIEW, uri);
                        intent0.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent0);
                        break;
                    case 2:
                        loc = getString(R.string.lel);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                        intent1.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent1);
                        break;

                    case 3:
                        loc = getString(R.string.the_hyatt);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                        intent2.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent2);
                        break;
                    case 4:
                        loc = getString(R.string.renaissance);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                        intent3.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent3);
                        break;
                    case 5:
                        loc = getString(R.string.taj_hotel);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                        intent4.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
        return rootView;
    }
}