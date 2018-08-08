package com.example.vivek.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OneFragment extends android.support.v4.app.Fragment {

    String loc;
    Uri uri;
    int var = 0;

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

        // add places to the list
        places.add(new tour(R.drawable.juhu, R.string.juhu));
        places.add(new tour(R.drawable.aj, R.string.ajanta));
        places.add(new tour(R.drawable.gate, R.string.gateway));
        places.add(new tour(R.drawable.haj, R.string.haji_ali));
        places.add(new tour(R.drawable.tad, R.string.taodba));
        places.add(new tour(R.drawable.kal, R.string.kalsubai));
        places.add(new tour(R.drawable.hang, R.string.hanging));

        tourAdapter adapter = new tourAdapter(getActivity(), places, R.color.backish);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        // detailed activity screen on click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(OneFragment.this.getActivity(), details1.class);
                Toast toast = Toast.makeText(getContext(), R.string.toast, Toast.LENGTH_SHORT);
                toast.show();
                switch (position) {
                    case 0:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var), var);
                        intent.putExtra(getString(R.string.name), R.string.juhu);
                        intent.putExtra(getString(R.string.img), R.drawable.juhu);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var), var);
                        intent.putExtra(getString(R.string.name), R.string.ajanta);
                        intent.putExtra(getString(R.string.img), R.drawable.aj);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var), var);
                        intent.putExtra(getString(R.string.name), R.string.gateway);
                        intent.putExtra(getString(R.string.img), R.drawable.gate);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var), var);
                        intent.putExtra(getString(R.string.name), R.string.haji_ali);
                        intent.putExtra(getString(R.string.img), R.drawable.haj);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var), var);
                        intent.putExtra(getString(R.string.name), R.string.taodba);
                        intent.putExtra(getString(R.string.img), R.drawable.tad);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var), var);
                        intent.putExtra(getString(R.string.name), R.string.kalsubai);
                        intent.putExtra(getString(R.string.img), R.drawable.kal);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra(getString(R.string.score), position);
                        intent.putExtra(getString(R.string.var), var);
                        intent.putExtra(getString(R.string.name), R.string.hanging);
                        intent.putExtra(getString(R.string.img), R.drawable.hang);
                        startActivity(intent);
                        break;
                }
            }
        });

        // maps firing on long Press
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        loc = getString(R.string.juhu);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent);
                        break;
                    case 1:
                        loc = getString(R.string.ajanta);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent0 = new Intent(Intent.ACTION_VIEW, uri);
                        intent0.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent0);
                        break;
                    case 2:
                        loc = getString(R.string.gateway);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                        intent1.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent1);
                        break;
                    case 3:
                        loc = getString(R.string.haji_ali);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                        intent2.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent2);
                        break;
                    case 4:
                        loc = getString(R.string.taodba);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                        intent3.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent3);
                        break;
                    case 5:
                        loc = getString(R.string.kalsubai);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, uri);
                        intent5.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent5);
                        break;
                    case 6:
                        loc = getString(R.string.hanging);
                        uri = Uri.parse(getString(R.string.maps) + Uri.encode(loc));
                        Intent intent6 = new Intent(Intent.ACTION_VIEW, uri);
                        intent6.setClassName(getString(R.string.package_name), getString(R.string.class_name));
                        startActivity(intent6);
                        break;
                }
                return true;
            }
        });
        return rootView;
    }
}
