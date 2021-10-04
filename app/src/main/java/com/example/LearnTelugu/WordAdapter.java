package com.example.LearnTelugu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.*;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity content,ArrayList<Word> words){
        super(content,0,words);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View rowView=convertView;
        if(rowView==null){
            rowView= LayoutInflater.from(getContext()).inflate(R.layout.activity_category,parent,false);
        }

        Word current = getItem(position);

        TextView telugu=rowView.findViewById(R.id.teluguWord);
        telugu.setText(current.getTeluguWord());

        TextView eng=rowView.findViewById(R.id.englishWord);
        eng.setText(current.getEnglishWord());

        if(current.hasImage()){
            ImageView img=rowView.findViewById(R.id.listimg);
            img.setImageResource(current.getImage());
            img.setVisibility(View.VISIBLE);
        }
        else{
            ImageView img=rowView.findViewById(R.id.listimg);
            img.setVisibility(View.GONE);
        }
        return rowView;
    }
}
