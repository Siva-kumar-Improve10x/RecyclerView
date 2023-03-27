package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CallsLogRvViewHolder extends RecyclerView.ViewHolder {
    public TextView nameTxt;
    public TextView detailsTxt;
    public ImageView imageIdIv;

    public CallsLogRvViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTxt = itemView.findViewById(R.id.name_txt);
        detailsTxt = itemView.findViewById(R.id.details_txt);
        imageIdIv = itemView.findViewById(R.id.image_id_iv);
    }
}
