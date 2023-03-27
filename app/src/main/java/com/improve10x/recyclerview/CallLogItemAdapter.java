package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CallLogItemAdapter extends RecyclerView.Adapter<CallsLogRvViewHolder> {
    public CallsItems[] items;
    OnCallLogItemClickListener clickListener;

    public CallLogItemAdapter(CallsItems[] callsItems) {
        items = callsItems;

    }

    @NonNull
    @Override
    public CallsLogRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.callitems,parent,false);
        CallsLogRvViewHolder viewHolder = new CallsLogRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CallsLogRvViewHolder holder, int position) {
        CallsItems item = items[position];
        holder.nameTxt.setText(item.number);
        holder.detailsTxt.setText(item.details);
        Picasso.get().load(item.profile).into(holder.imageIdIv);
        holder.itemView.setOnClickListener(v -> {
            clickListener.onCallClick(item);
        });

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}

