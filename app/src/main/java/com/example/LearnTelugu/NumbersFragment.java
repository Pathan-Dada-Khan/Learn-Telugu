package com.example.LearnTelugu;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.util.ArrayList;

public class NumbersFragment extends Fragment {

    public NumbersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container, false);

        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Zero","సున్నా",R.drawable.img0));
        words.add(new Word("One","ఒకటి",R.drawable.img1));
        words.add(new Word("Two","రెండు",R.drawable.img2));
        words.add(new Word("Three","మూడు",R.drawable.img3));
        words.add(new Word("Four","నాలుగు",R.drawable.img4));
        words.add(new Word("Five","ఐదు",R.drawable.img5));
        words.add(new Word("Six","ఆరు",R.drawable.img6));
        words.add(new Word("Seven","ఏడు",R.drawable.img7));
        words.add(new Word("Eight","ఎనిమిది",R.drawable.img8));
        words.add(new Word("Nine","తొమ్మిది",R.drawable.img9));
        words.add(new Word("Ten","పది",R.drawable.img10));
        words.add(new Word("Eleven","పదకొండు",R.drawable.img11));
        words.add(new Word("Twelve","పన్నెండు",R.drawable.img12));
        words.add(new Word("Thirteen","పదమూడు",R.drawable.img13));
        words.add(new Word("Fourteen","పద్నాలుగు",R.drawable.img14));
        words.add(new Word("Fifteen","పదిహేను",R.drawable.img15));
        words.add(new Word("Sixteen","పదహారు",R.drawable.img16));
        words.add(new Word("Seventeen","పదిహేడు",R.drawable.img17));
        words.add(new Word("Eighteen","పద్దెనిమిది",R.drawable.img18));
        words.add(new Word("Nineteen","పంతొమ్మిది",R.drawable.img19));
        words.add(new Word("Twenty","ఇరవై",R.drawable.img20));
        words.add(new Word("Twenty-One","ఇరవై ఒకటి",R.drawable.img21));
        words.add(new Word("Twenty-Two","ఇరవై రెండు",R.drawable.img22));
        words.add(new Word("Twenty-Three","ఇరువై మూడు",R.drawable.img23));
        words.add(new Word("Twenty-Four","ఇరవై నాలుగు",R.drawable.img24));
        words.add(new Word("Twenty-Five","పాతికా / ఇరవై ఐదు",R.drawable.img25));
        words.add(new Word("Thirty","ముప్పై",R.drawable.img30));
        words.add(new Word("Forty","నలభై",R.drawable.img40));
        words.add(new Word("Fifty","యాభై",R.drawable.img50));

        WordAdapter adp=new WordAdapter(getActivity(),words);
        ListView lv=(ListView) rootView.findViewById(R.id.list);
        lv.setAdapter(adp);
        return rootView;
    }
}