package com.example.birdsgridview;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    private ImageView mImage;
    private ItemClickListner itemClickListner;
    public Holder(@NonNull View itemView, ItemClickListner itemClickListner) {
        super(itemView);
        this.itemClickListner=itemClickListner;
        initview(itemView);
    }

    private void initview(View itemview) {
        mImage=itemview.findViewById(R.id.ivImage);
    }
    public void setData(Bird bird)
    {
        mImage.setImageResource(bird.getmImage());
        mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListner.onItemClick(bird);
            }
        });
    }
}
