package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class MessangerAdapter extends RecyclerView.Adapter<MessangerRv> {
    public MessangerItems[] messangerItems;
    public MessangerAdapter(MessangerItems[] items){
        messangerItems = items;
    }
    @NonNull
    @Override
    public MessangerRv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.messangeritem,parent,false);
        MessangerRv i = new MessangerRv(view);
        return i;
    }

    @Override
    public void onBindViewHolder(@NonNull MessangerRv holder, int position) {
        MessangerItems items = messangerItems[position];
        holder.user.setText(items.user);
        holder.userMessage.setText(items.userMessage);
        Picasso.get().load(items.dp).into(holder.dp);

    }

    @Override
    public int getItemCount() {
        return messangerItems.length;
    }
}
