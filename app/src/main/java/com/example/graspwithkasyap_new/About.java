package com.example.graspwithkasyap_new;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class About extends AppCompatActivity{
    ListView listView;
    ArrayList<content> topics = new ArrayList<content>();
    WordAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);
        topics.add(new content("Happy Birthday","Alles Gute zum Geburtstag"));
        topics.add(new content("My Name Is Kasyap","Ich heiße Kasyap"));
        topics.add(new content("I am Studying Btech","Ich studiere Btech"));
        topics.add(new content("I Live In India","Ich lebe in Indien"));
        topics.add(new content("Sun Rises In East","Die Sonne geht im Osten auf"));
        topics.add(new content("I Like Studying","Ich mag lernen"));
        topics.add(new content("Stay Safe, Stay Healthy","Bleib sicher, bleib gesund"));
        topics.add(new content("I Like You","Ich mag dich"));
        topics.add(new content("I Hate You","Ich hasse dich"));



        adapter = new WordAdapter(this, topics);
        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
