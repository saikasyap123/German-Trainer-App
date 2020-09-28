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

public class GeneralClass extends AppCompatActivity{
    ListView listView;
    ArrayList<content> topics = new ArrayList<content>();
    WordAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        topics.add(new content("White","weiß " ));
        topics.add(new content("Black","schwarz  " ));
        topics.add(new content("Red","rot" ));
        topics.add(new content("Yellow","gelb" ));
        topics.add(new content("Blue","blau" ));
        topics.add(new content("Green","grün" ));
        topics.add(new content("Brown","braun" ));
        topics.add(new content("Pink","rosa" ));
        topics.add(new content("Grey","grau" ));
        topics.add(new content("Purple","lila" ));



        adapter = new WordAdapter(this, topics);
        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
