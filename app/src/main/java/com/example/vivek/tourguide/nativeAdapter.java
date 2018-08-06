package com.example.vivek.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class nativeAdapter extends ArrayAdapter<native_to> {
    private int colorID;
    public nativeAdapter(@NonNull Context context, ArrayList<native_to> cuisine, int resource) {
        super(context, 0,cuisine);
        colorID = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_four, parent, false);
        }

        native_to currentImage = getItem(position);

        ImageView imageView1 = listItemView.findViewById(R.id.nat1);
        imageView1.setImageResource(currentImage.getPlace());

        ImageView imageView2 = listItemView.findViewById(R.id.natfoc);
        imageView2.setImageResource(currentImage.getPlace());

        TextView textView = listItemView.findViewById(R.id.cuis);
        textView.setText(currentImage.getAttract());

        View textContainer = listItemView.findViewById(R.id.linear1);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

