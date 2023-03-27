package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FacebookRv extends RecyclerView.ViewHolder {
    public ImageView profile;
    public TextView message;
    public TextView hours;

    public FacebookRv(@NonNull View itemView) {
        super(itemView);
        profile = itemView.findViewById(R.id.ImageFb_iv);
        message = itemView.findViewById(R.id.name1_txt);
        hours = itemView.findViewById(R.id.name2_txt);
    }
}
