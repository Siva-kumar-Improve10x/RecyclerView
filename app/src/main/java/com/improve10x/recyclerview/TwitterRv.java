package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TwitterRv extends RecyclerView.ViewHolder {
    public TextView tSliverTxt;
    public TextView tUsernameTxt;
    public TextView tSubNameTxt;
    public TextView tMessageTxt;
    public TextView tCommentTxt;
    public TextView tRetweetTxt;
    public TextView tLikeTxt;
    public ImageView tProfileIv;

    public TwitterRv(@NonNull View itemView) {
        super(itemView);
        tSliverTxt = itemView.findViewById(R.id.tsliver_txt);
        tUsernameTxt = itemView.findViewById(R.id.tusername_txt);
        tSubNameTxt = itemView.findViewById(R.id.tsubname_txt);
        tMessageTxt = itemView.findViewById(R.id.tmessage_txt);
        tCommentTxt = itemView.findViewById(R.id.tcomment_txt);
        tRetweetTxt = itemView.findViewById(R.id.tretweet_txt);
        tLikeTxt = itemView.findViewById(R.id.tlike_txt);
        tProfileIv = itemView.findViewById(R.id.tprofile_iv);
    }
}
