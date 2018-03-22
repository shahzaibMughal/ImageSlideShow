package com.example.shahzaib.imageslideshow;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;



public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    SlideshowAdapter slideshowAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        viewPager = findViewById(R.id.viewPager);
        slideshowAdapter = new SlideshowAdapter(this);

        viewPager.setAdapter(slideshowAdapter);
        
    }
}
