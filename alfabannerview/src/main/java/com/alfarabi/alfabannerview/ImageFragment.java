package com.alfarabi.alfabannerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



/**
 * Created by Alfarabi on 6/23/17.
 */

public class ImageFragment extends Fragment {

    String imageUrl ;
    int position ;
    private ImageView imageView ;

    public static ImageFragment instance(String imageUrl, int position){
        ImageFragment imageFragment = new ImageFragment() ;
        imageFragment.setImageUrl(imageUrl);
        imageFragment.setPosition(position);
        return imageFragment ;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.imageview);
        GlideApp.with(this).load(imageUrl).placeholder(R.drawable.banner_placeholder).into(imageView);
//        imageView.setTag(imageUrl);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getActivity() instanceof OnBannerClickListener){
                    ((OnBannerClickListener)getActivity()).onImageClick(view, position);
                }
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_image_layout, container, false);
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
