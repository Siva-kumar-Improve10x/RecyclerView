package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class InstaAdpater extends RecyclerView.Adapter<insta_rv> {
    public InstagramItems[] items;
    public InstaAdpater(InstagramItems[] instagramItems){
        items = instagramItems;
    }

    @NonNull
    @Override
    public insta_rv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.insta_item,parent,false);
        insta_rv instaRv = new insta_rv(view);
        return instaRv;
    }

    @Override
    public void onBindViewHolder(@NonNull insta_rv holder, int position) {
        InstagramItems instagramItems = items[position];
        holder.userId.setText(instagramItems.userId);
        holder.subText.setText(instagramItems.subText);
        Picasso.get().load(instagramItems.profile).into(holder.profile);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
