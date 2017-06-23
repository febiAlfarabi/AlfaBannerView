package com.alfarabi.alfabannerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by Alfarabi on 6/23/17.
 */

public class DotAdapter extends RecyclerView.Adapter<DotViewHolder> {

    private Context context ;
    private int size ;

    public DotAdapter(Context context, int size){
        this.context = context ;
        this.size = size ;
    }

    @Override
    public DotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DotViewHolder(LayoutInflater.from(context).inflate(R.layout.dot_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(DotViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return size;
    }
}
