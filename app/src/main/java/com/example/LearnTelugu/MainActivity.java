package com.example.LearnTelugu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences onBoardingPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onBoardingPreferences = getSharedPreferences("onBoarding",MODE_PRIVATE);
        boolean isFirstTime = onBoardingPreferences.getBoolean("firstTime",true);

        if(isFirstTime){
            SharedPreferences.Editor editor = onBoardingPreferences.edit();
            editor.putBoolean("firstTime",false);
            editor.commit();
            startActivity(new Intent(this,Boarding.class));
            finish();
        }


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        BottomNavigationView bnv = findViewById(R.id.bottomNavigation);

        CategoryAdapter adapter = new CategoryAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bnv.getMenu().findItem(R.id.numbers).setChecked(true);
                        break;
                    case 1:
                        bnv.getMenu().findItem(R.id.family).setChecked(true);
                        break;
                    case 2:
                        bnv.getMenu().findItem(R.id.colors).setChecked(true);
                        break;
                    case 3:
                        bnv.getMenu().findItem(R.id.phrases).setChecked(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.numbers:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.family:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.colors:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.phrases:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });

    }
}