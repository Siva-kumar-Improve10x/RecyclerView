package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessangerRv extends RecyclerView.ViewHolder {
    public ImageView dp;
    public TextView user;
    public TextView userMessage;
    public MessangerRv(@NonNull View itemView) {
        super(itemView);
        dp = itemView.findViewById(R.id.dp_iv);
        user = itemView.findViewById(R.id.user_txt);
        userMessage = itemView.findViewById(R.id.usermessage_txt);
    }
}
