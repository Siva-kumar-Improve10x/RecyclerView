package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class gmailAdapter extends RecyclerView.Adapter<gmailRv> {
    public  Gmail_items[] items;
    public gmailAdapter(Gmail_items[] gmail_items){
        items = gmail_items;
    }
    @NonNull
    @Override
    public gmailRv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.gmailitems,parent,false);
        gmailRv viewHolder = new gmailRv(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull gmailRv holder, int position) {
        Gmail_items gmailItems = items[position];
        holder.Name.setText(gmailItems.Name);
        holder.subHeading.setText(gmailItems.subHeading);
        holder.time.setText(gmailItems.time);
        Picasso.get().load(gmailItems.imageUrl).into(holder.imagesUrl);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
