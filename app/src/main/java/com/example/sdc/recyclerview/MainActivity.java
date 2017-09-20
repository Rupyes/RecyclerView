package com.example.sdc.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] imagesId = {
                R.drawable.facebook_circle,
                R.drawable.goodreads,
                R.drawable.goodreadsaa,
                R.drawable.homw,
                R.drawable.iconsa,
                R.drawable.lincircl,
                R.drawable.images,
                R.drawable.logo,
                R.drawable.lock_solid,
                R.drawable.search,
                R.drawable.question,
                R.drawable.twitter_circle
        };

        String stringNames[] = {
                "Facebook",
                "Good Reads",
                "Good Reads1",
                "Home",
                "Icons",
                "LinkedIn",
                "Call Icon",
                "Logo",
                "Lock",
                "Search",
                "Question",
                "Twitter"
        };

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(new MyAdapter(this, imagesId, stringNames));
    }

}
