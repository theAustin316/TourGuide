package com.example.vivek.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class details1 extends AppCompatActivity {

    int name;
    int img;
    int score;
    int var;
    // list of all social channels of restaurants and sites to visit
    int social[] = {R.string.info_juhu, R.string.info_ajanta, R.string.info_gateway, R.string.info_haji, R.string.info_hanging,
            R.string.info_kalsu, R.string.info_tadoba};
    int soc[] = {R.string.info_jw, R.string.info_oberoi, R.string.info_leela, R.string.info_hyatt, R.string.info_rena, R.string.info_taj};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detaisl1);

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        // get corresponding name
        name = getIntent().getIntExtra(getString(R.string.name), 0);
        // get corresponding image
        img = getIntent().getIntExtra(getString(R.string.img), 0);
        // get listItem position
        score = getIntent().getIntExtra(getString(R.string.score), 0);
        var = getIntent().getIntExtra(getString(R.string.var), 0);

        ImageView image = findViewById(R.id.collap_img);
        image.setImageResource(img);

        FloatingActionButton share = findViewById(R.id.floating);

        TextView textView = findViewById(R.id.about);
        textView.setText(name);

        // setting action of floating action button
        if (var == 1) {
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(soc[score])));
                    startActivity(intent);
                }
            });
        } else if (var == 0) {
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(social[score])));
                    startActivity(intent);
                }
            });
        }
    }
}
