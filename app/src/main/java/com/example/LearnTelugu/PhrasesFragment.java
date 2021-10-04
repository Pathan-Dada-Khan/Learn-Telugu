package com.example.LearnTelugu;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class PhrasesFragment extends Fragment {

    public PhrasesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container, false);
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Where are you going ?","మీరు ఎక్కడికి వెళుతున్నారు ?"));
        words.add(new Word("What is your name ?","నీ పేరు ఏమిటి ?"));
        words.add(new Word("My name is...","నా పేరు..."));
        words.add(new Word("How are you feeling?","నీ అనుభూతి ఎలా ఉంది ?"));
        words.add(new Word("I'm feeling good.","నేను బాగున్నాను."));
        words.add(new Word("Are you coming ?","మీరు వస్తున్నారా ?"));
        words.add(new Word("Yes,I'm coming.","అవును, నేను వస్తున్నాను?"));
        words.add(new Word("I'm going","నేను వెళ్తున్నాను ?"));
        words.add(new Word("Let's go.","వెళ్దాం"));
        words.add(new Word("Come here.","ఇక్కడికి రండి."));

        WordAdapter adapter=new WordAdapter(getActivity(),words);
        ListView lv=(ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(adapter);
        return rootView;
    }
}