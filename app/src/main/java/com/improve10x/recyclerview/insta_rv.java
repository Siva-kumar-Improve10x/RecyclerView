package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class insta_rv extends RecyclerView.ViewHolder {
    public ImageView profile;
    public TextView userId;
    public TextView subText;

    public insta_rv(@NonNull View itemView) {
        super(itemView);
        profile = itemView.findViewById(R.id.insta_proflie_iv);
        userId = itemView.findViewById(R.id.instauser_id_txt);
        subText = itemView.findViewById(R.id.subtext_txt);
    }
}
