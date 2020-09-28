package com.example.graspwithkasyap_new;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<content> {

    public WordAdapter(Activity context, ArrayList<content> contents){
        super(context,0, contents);


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.cse_main, parent, false);
        }
        content currentContent = getItem(position);
        TextView queTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        queTextView.setText(currentContent.getQuestion());
        TextView ansTextView = (TextView) listItemView.findViewById(R.id.german_text_view);
        ansTextView.setText(currentContent.getAnswer());
        return listItemView;
    }
}
