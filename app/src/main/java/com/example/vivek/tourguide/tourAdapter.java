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
import android.widget.Toast;

import java.util.ArrayList;

public class tourAdapter extends ArrayAdapter<tour> {
    private int colorID;
    public tourAdapter(@NonNull Context context, ArrayList<tour> places, int resource) {
        super(context, 0,places);
        colorID = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        tour currentImage = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentImage.getPlace());

        TextView textView = listItemView.findViewById(R.id.name);
        textView.setText(currentImage.getAttract());

        View textContainer = listItemView.findViewById(R.id.card_view);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
