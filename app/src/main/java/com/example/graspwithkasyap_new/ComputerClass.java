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

public class ComputerClass extends AppCompatActivity{
    ListView listView;
    ArrayList<content> topics = new ArrayList<content>();
    WordAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        topics.add(new content("Zero", "Null"));
        topics.add(new content("One","Eins"));
        topics.add(new content("Two","Zwei"));
        topics.add(new content("Three","Drei"));
        topics.add(new content("Four","Vier"));
        topics.add(new content("Five","Fünf"));
        topics.add(new content("Six","Sechs"));
        topics.add(new content("Seven","Sieben"));
        topics.add(new content("Eight","Acht"));
        topics.add(new content("Nine","Neun"));
        topics.add(new content("Ten","Zehn"));



        adapter = new WordAdapter(this, topics);
        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
