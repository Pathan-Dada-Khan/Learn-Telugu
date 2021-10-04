package com.example.LearnTelugu;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ColorsFragment extends Fragment {

    public ColorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Red","ఎరుపు",R.drawable.red));
        words.add(new Word("Green","ఆకుపచ్చ",R.drawable.green));
        words.add(new Word("Blue","నీలం",R.drawable.blue));
        words.add(new Word("Yellow","పసుపు",R.drawable.yellow));
        words.add(new Word("Orange","నరిన్జా",R.drawable.orange));
        words.add(new Word("White","తెలుపు",R.drawable.white));
        words.add(new Word("Black","నలుపు",R.drawable.black));
        words.add(new Word("Violet","త్సామనము",R.drawable.violet));
        words.add(new Word("Pink","చంద్రకావి",R.drawable.pink));
        words.add(new Word("Brown","పాల",R.drawable.brown));


        WordAdapter adapter=new WordAdapter(getActivity(),words);
        ListView lv=(ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(adapter);
        return rootView;
    }
}