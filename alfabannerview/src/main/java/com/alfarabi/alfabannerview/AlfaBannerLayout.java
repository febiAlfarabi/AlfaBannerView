package com.alfarabi.alfabannerview;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import java.util.List;

/**
 * Created by Alfarabi on 6/23/17.
 */

public class AlfaBannerLayout<ROOT extends FragmentActivity> extends RelativeLayout {

    AlfaImageView alfaImageView ;
    RecyclerView recyclerView ;

    public AlfaBannerLayout(Context context) {
        super(context);
        if(getChildCount()==0){
            addView(LayoutInflater.from(context).inflate(R.layout.alfa_banner_content_layout, this, false));
        }
        initView();

    }

    public AlfaBannerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(getChildCount()==0){
            addView(LayoutInflater.from(context).inflate(R.layout.alfa_banner_content_layout, this, false));
        }
        initView();
    }

    public AlfaBannerLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if(getChildCount()==0){
            addView(LayoutInflater.from(context).inflate(R.layout.alfa_banner_content_layout, this, false));
        }
        initView();
    }


    private void initView(){
        alfaImageView = findViewById(R.id.alfa_imageview);
        recyclerView = findViewById(R.id.recyclerview);
    }

    public void renderBanner(ROOT root, List<String> imageUrls){
        if(alfaImageView==null ||recyclerView==null){
            initView();
        }
        alfaImageView.setImageUrls(root, imageUrls);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new DotAdapter(getContext(), imageUrls.size()));
        recyclerView.getAdapter().notifyDataSetChanged();
    }

}
