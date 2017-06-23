package com.alfarabi.alfabannersample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.alfarabi.alfabannerview.AlfaBannerLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    AlfaBannerLayout alfaBannerLayout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alfaBannerLayout = findViewById(R.id.alfabanner_layout);
        List<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRX-7zh6OyyBnBFJPAZWzRjoBueCUJ1txtKX074LMFy7JYf-jjJ");
        imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRX-7zh6OyyBnBFJPAZWzRjoBueCUJ1txtKX074LMFy7JYf-jjJ");
        imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRX-7zh6OyyBnBFJPAZWzRjoBueCUJ1txtKX074LMFy7JYf-jjJ");
        imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRX-7zh6OyyBnBFJPAZWzRjoBueCUJ1txtKX074LMFy7JYf-jjJ");
        alfaBannerLayout.renderBanner(this, imageUrls);

    }
}
