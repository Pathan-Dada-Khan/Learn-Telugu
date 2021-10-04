package com.example.LearnTelugu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Boarding extends AppCompatActivity {
    private ViewPager mSliderPager;
    private LinearLayout mLayout;
    private SlidingAdapter slidingAdapter;
    private Button next;
    private Button skip;
    private int CurrentPage;
    private TextView[] mDots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding);

        next =(Button)findViewById(R.id.next);
        skip =(Button)findViewById(R.id.skip);

        mSliderPager = (ViewPager) findViewById(R.id.slider);
        mLayout = (LinearLayout) findViewById(R.id.linear);
        slidingAdapter=new SlidingAdapter(this);
        mSliderPager.setAdapter(slidingAdapter);

        addDots(0);
        mSliderPager.addOnPageChangeListener(viewListener);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CurrentPage==3){
                    Intent i = new Intent (Boarding.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    mSliderPager.setCurrentItem(CurrentPage+1);
                }
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSliderPager.setCurrentItem(3);
            }
        });
    }
    public void addDots(int position){
        mDots = new TextView[4];
        mLayout.removeAllViews();
        for(int i=0;i<4;i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);

            mLayout.addView(mDots[i]);
        }
        if(mDots.length>0){
            mDots[position].setTextSize(35);
            mDots[position].setTextColor(getResources().getColor(R.color.red));
        }
    }
    ViewPager.OnPageChangeListener viewListener =new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
            CurrentPage=position;
            if(position==0){
                next.setText("");
            }else if(position==mDots.length-1){
                next.setText("FINISH");
            }
            else{
                next.setText("");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}