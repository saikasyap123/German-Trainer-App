package com.example.graspwithkasyap_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView)findViewById(R.id.text_numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this, ComputerClass.class);
                startActivity(numIntent);
            }
        });
        TextView relations = (TextView)findViewById(R.id.text_relations);
        relations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relationsIntent = new Intent(MainActivity.this, ElectronicsClass.class);
                startActivity(relationsIntent);
            }
        });
        TextView colors = (TextView)findViewById(R.id.text_colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, GeneralClass.class);
                startActivity(colorIntent);
            }
        });
        TextView phrases = (TextView)findViewById(R.id.text_phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, About.class);
                startActivity(phrasesIntent);
            }
        });

    }

}