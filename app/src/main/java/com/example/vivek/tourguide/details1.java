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
    String social[] = {"https://en.wikipedia.org/wiki/Juhu", "https://whc.unesco.org/en/list/242",
            "https://www.culturalindia.net/monuments/gateway-of-india.html", "http://hajialidargah.in/",
            "https://en.wikipedia.org/wiki/Hanging_Gardens_of_Mumbai", "https://en.wikipedia.org/wiki/Kalsubai",
            "https://en.wikipedia.org/wiki/Hanging_Gardens_of_Mumbai"};
    String soc[] = {"https://www.zomato.com/mumbai/jw-caf%C3%A9-jw-marriott-mumbai-sahar-chakala", "https://twitter.com/OberoiHotels",
            "https://twitter.com/TheLeelaHotels", "https://twitter.com/hyattregency", "https://twitter.com/RenaissanceMum",
            "https://twitter.com/TajHotels"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detaisl1);

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        // get corresponding name
        name = getIntent().getIntExtra("name", 0);
        // get corresponding image
        img = getIntent().getIntExtra("img", 0);
        // get listItem position
        score = getIntent().getIntExtra("score", 0);
        var = getIntent().getIntExtra("var", 0);

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
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(soc[score]));
                    startActivity(intent);
                }
            });
        } else if (var == 0) {
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(social[score]));
                    startActivity(intent);
                }
            });
        }
    }
}
