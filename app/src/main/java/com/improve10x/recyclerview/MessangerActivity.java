package com.improve10x.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MessangerActivity extends AppCompatActivity {
    MessangerItems[] messangerItems;
    MessangerAdapter adapter;
    RecyclerView messangerRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messanger);
        initViews();
        addDataOfAUser();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        messangerRv.setLayoutManager(new LinearLayoutManager(this));
        messangerRv.setAdapter(adapter);

    }

    private void setUpAdapter() {
        adapter = new MessangerAdapter(messangerItems);
    }

    private void addDataOfAUser() {
        messangerItems = new MessangerItems[6];
        MessangerItems item1 = new MessangerItems();
        item1.dp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.user = "Sam Scotty";
        item1.userMessage = "Hey how's it going";
        messangerItems[0] = item1;

        MessangerItems item2 = new MessangerItems();
        item2.dp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.user = "Mai Tran";
        item2.userMessage = "Mai sent a sticker";
        messangerItems[1] = item2;

        MessangerItems item3 = new MessangerItems();
        item3.dp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.user = "Emmie Baros";
        item3.userMessage = "Hi again :)                                                             🔹";
        messangerItems[2] = item3;

        MessangerItems item4 = new MessangerItems();
        item4.dp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.user = "Jorge Torres";
        item4.userMessage = "Can't wait";
        messangerItems[3] = item4;

        MessangerItems item5 = new MessangerItems();
        item5.dp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.user = "Maria & Soumya";
        item5.userMessage = "Nice";
        messangerItems[4] = item5;

        MessangerItems item6 = new MessangerItems();
        item6.dp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.user = "Mark Zuckerberg";
        item6.userMessage = "Nice,Work Hard";
        messangerItems[5] = item6;





    }

    private void initViews() {
        messangerRv = findViewById(R.id.messanger_rv);
    }
}