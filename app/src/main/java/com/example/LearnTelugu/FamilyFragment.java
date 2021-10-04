package com.example.LearnTelugu;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilyFragment extends Fragment {

    public FamilyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container, false);
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Father","తండ్రి",R.drawable.father));
        words.add(new Word("Mother","తల్లి",R.drawable.mother));
        words.add(new Word("Son","కొడుకు",R.drawable.sondaugter));
        words.add(new Word("Daughter","కుమార్తె",R.drawable.sondaugter));
        words.add(new Word("Bother","అన్నయ్య",R.drawable.sisbro));
        words.add(new Word("Sister","చల్లి",R.drawable.sisbro));
        words.add(new Word("Husband","భర్త",R.drawable.wifehus));
        words.add(new Word("Wife","భార్య",R.drawable.wifehus));
        words.add(new Word("Grandmother","తాత",R.drawable.grandfather));
        words.add(new Word("Grandfather","అమ్మమ్మ",R.drawable.grandmother));

        WordAdapter adapter=new WordAdapter(getActivity(),words);
        ListView lv=(ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(adapter);
        return rootView;
    }
}