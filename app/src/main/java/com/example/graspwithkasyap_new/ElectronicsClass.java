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

public class ElectronicsClass extends AppCompatActivity{
    ListView listView;
    ArrayList<content> topics = new ArrayList<content>();
    WordAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);
        topics.add(new content("Family","Familie"));
        topics.add(new content("Father","Vater"));
        topics.add(new content("Mother","Mutter"));
        topics.add(new content("Brother","Bruder"));
        topics.add(new content("Sister","Schwester"));
        topics.add(new content("Son","Sohn"));
        topics.add(new content("Daughter","Tochter"));
        topics.add(new content("Husband","Mann"));
        topics.add(new content("Wife","Ehefrau"));



        adapter = new WordAdapter(this, topics);
        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
