package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TwitterActivity extends AppCompatActivity {
    Twitter_items [] twitterItems;
    RecyclerView twitterRv;
    TwitterAdpater adpater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        initViews();
        twitterData();
        setUpAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        twitterRv.setLayoutManager(new LinearLayoutManager(this));
        twitterRv .setAdapter(adpater);
    }

    private void setUpAdapter() {
        adpater = new TwitterAdpater(twitterItems);

    }

    private void twitterData() {
        twitterItems = new Twitter_items[6];
        Twitter_items items = new Twitter_items();
//        items.tSliver = "";
        items.tprofileIv = "";
        items.tUsername = "Silvia";
        items.tSubName = "@machadocomida-1m";
        items.tMessage = "ppl keep saying hot girl summer but i'm just trying to stay out of the humidity";
        items.tComment = "5";
        items.tRetweet = "8";
        items.tLike = "12";
        twitterItems[0] = items;

        Twitter_items items1 = new Twitter_items();
        items1.tSliver = "";
        items1.tprofileIv = "";
        items1.tUsername = "Jasi ";
        items1.tSubName = "@k9lover85.20m";
        items1.tMessage = "Pop songs just hit different when you're driving";
        items1.tComment = "2";
        items1.tRetweet = "3";
        items1.tLike = "20";
        twitterItems[1] = items1;

        Twitter_items items2 = new Twitter_items();
        items2.tSliver = "";
        items2.tprofileIv = "";
        items2.tUsername = "Vera";
        items2.tSubName = "@Veracordeiro20-1h";
        items2.tMessage = "Help i can't stop canceling meetings";
        items2.tComment = "2";
        items2.tRetweet = "1";
        items2.tLike = "6";
        twitterItems[2] = items2;

        Twitter_items items3 = new Twitter_items();
        items3.tSliver = " 🔄 🔃 Silver Jones Retweeted";
        items3.tprofileIv = "";
        items3.tUsername = "Twitter";
        items3.tSubName = "@Twitter-2/8/21";
        items3.tMessage = "memes have expiration dates";
        items3.tComment = "135K";
        items3.tRetweet = "32.9K";
        items3.tLike = "269K";
        twitterItems[3] = items3;

        Twitter_items items4 = new Twitter_items();
        items4.tSliver = "";
        items4.tprofileIv = "";
        items4.tUsername = "Harold";
        items4.tSubName = "@h_wang84.3h";
        items4.tMessage = "There are too many people outside";
        items4.tComment = "4";
        items4.tRetweet = "8";
        items4.tLike = "25";
        twitterItems[4] = items4;

        Twitter_items items5 = new Twitter_items();
        items5.tSliver = "";
        items5.tprofileIv = "";
        items5.tUsername = "Allen";
        items5.tSubName = "@grayhamsays-12h";
        items5.tMessage = " if you want you orderfast";
        items5.tComment = "7";
        items5.tRetweet = "7";
        items5.tLike = "7";
        twitterItems[5] = items5;

    }

    private void initViews() {
        twitterRv = findViewById(R.id.twitter_rv);

    }
}