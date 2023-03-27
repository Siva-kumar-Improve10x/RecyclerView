package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class TwitterAdpater extends RecyclerView.Adapter<TwitterRv> {
    public Twitter_items[] twitterItems;
    public TwitterAdpater(Twitter_items[] items ){
        twitterItems = items ;
    }
    @NonNull
    @Override
    public TwitterRv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.twitter_items,parent,false);
        TwitterRv twitterRv = new TwitterRv(view);
        return twitterRv;
    }

    @Override
    public void onBindViewHolder(@NonNull TwitterRv holder, int position) {
        Twitter_items items = twitterItems[position];
        holder.tSliverTxt.setText(items.tSliver);
        holder.tUsernameTxt.setText(items.tUsername);
        holder.tSubNameTxt.setText(items.tSubName);
        holder.tMessageTxt.setText(items.tMessage);
        holder.tCommentTxt.setText(items.tComment);
        holder.tRetweetTxt.setText(items.tRetweet);
        holder.tLikeTxt.setText(items.tLike);
//        Picasso.get().load(items.tprofileIv).into(holder.tProfileIv);

    }

    @Override
    public int getItemCount() {
        return twitterItems.length;
    }
}
