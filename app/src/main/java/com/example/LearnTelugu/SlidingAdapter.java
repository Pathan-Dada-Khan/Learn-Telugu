package com.example.LearnTelugu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlidingAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SlidingAdapter(Context context){
        this.context=context;
    }

    public int[] images={
            R.drawable.bording_numbers,
            R.drawable.bording_family,
            R.drawable.bording_color,
            R.drawable.bording_phrases
    };
    public int[] head ={
            R.string.nums,
            R.string.fm,
            R.string.colors,
            R.string.phrases
    };
    public String[] des={
            "Learn 0 to 50 number in telugu through english",
            "Learn family members names in telugu through english",
            "Learn all types of colors in telugu through english",
            "Learn sentences in telugu which are translated from english"
    };
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(View view,Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView img = (ImageView) view.findViewById(R.id.board_img);
        TextView boardHead = (TextView) view.findViewById(R.id.board_head);
        TextView boardDes = (TextView) view.findViewById(R.id.board_des);

        img.setImageResource(images[position]);
        boardHead.setText(head[position]);
        boardDes.setText(des[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
