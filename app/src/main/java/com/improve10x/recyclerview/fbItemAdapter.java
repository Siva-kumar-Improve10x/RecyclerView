package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class fbItemAdapter extends RecyclerView.Adapter<FacebookRv> {
    public Facebook_items[] items;
    public fbItemAdapter(Facebook_items[] fb){
        items = fb;
    }

    @NonNull
    @Override
    public FacebookRv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fb_items,parent,false);
        FacebookRv viewHolder = new FacebookRv(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FacebookRv holder, int position) {
      Facebook_items item = items[position];
      holder.message.setText(item.message);
      holder.hours.setText(item.hours);
      Picasso.get().load(item.profile).into(holder.profile);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
