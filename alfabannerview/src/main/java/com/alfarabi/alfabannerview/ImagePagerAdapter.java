package com.alfarabi.alfabannerview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Alfarabi on 6/23/17.
 */

public class ImagePagerAdapter extends FragmentStatePagerAdapter {

    List<String> imageUrls = new ArrayList<>();

    public ImagePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ImageFragment.instance(imageUrls.get(position), position);
    }

    @Override
    public int getCount() {
        return imageUrls.size();
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}
