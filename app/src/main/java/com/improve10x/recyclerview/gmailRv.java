package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class gmailRv extends RecyclerView.ViewHolder {
    public ImageView imagesUrl;
    public TextView Name;
    public TextView subHeading;
    public TextView time;
    public gmailRv(@NonNull View itemView) {
        super(itemView);
        imagesUrl = itemView.findViewById(R.id.imageurl_iv);
        Name = itemView.findViewById(R.id.heading_txt);
        subHeading = itemView.findViewById(R.id.subheading_txt);
        time = itemView.findViewById(R.id.time_txt);

    }
}
