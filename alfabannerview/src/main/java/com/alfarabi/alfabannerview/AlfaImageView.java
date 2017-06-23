package com.alfarabi.alfabannerview;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alfarabi on 6/23/17.
 */

public class AlfaImageView<ROOT extends FragmentActivity> extends ViewPager {

    private ROOT root ;
    private ImagePagerAdapter imagePagerAdapter ;

    public AlfaImageView(Context context) {
        super(context);
    }

    public AlfaImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setImageUrls(ROOT root, List<String> imageUrls) {
        this.root = root ;
        imagePagerAdapter = new ImagePagerAdapter(root.getSupportFragmentManager());
        imagePagerAdapter.setImageUrls(imageUrls);
        setAdapter(imagePagerAdapter);
        imagePagerAdapter.notifyDataSetChanged();
    }
    public int getBannerSize(){
        return imagePagerAdapter.getImageUrls().size();
    }
}
