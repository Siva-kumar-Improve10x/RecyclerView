package com.improve10x.recyclerview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GmailScreenActivity extends AppCompatActivity {
    public Gmail_items[] gmail_items;
    RecyclerView gmailRv;
    public gmailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail_screen);
        initViews();
        gmailData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        gmailRv.setLayoutManager(new GridLayoutManager(this,2));
        gmailRv.setAdapter(adapter);

    }

    private void setUpAdapter() {
        adapter = new gmailAdapter(gmail_items);
    }

    private void gmailData() {
        gmail_items = new Gmail_items[5];

        Gmail_items item1 = new Gmail_items();
        item1.Name = "Lisa Paik";
        item1.subHeading = "Volunteer at the Lakestones student art Hi Julia! Thank you for your interest in volun...";
        item1.time = "3:43 PM";
        item1.imageUrl = "https://o.remove.bg/downloads/8e1a38ec-9ef1-44f6-9dbe-c268088c5522/images-removebg-preview.png";
        gmail_items[0] = item1;

        Gmail_items item2 = new Gmail_items();
        item2.Name = "Elena Casaronsa";
        item2.subHeading = "▶Portrait specail We'd like to announce  a holiday portrait spe.....";
        item2.time = "11:24 AM";
        item2.imageUrl = "https://o.remove.bg/downloads/0c13c190-d85f-47fb-83c3-f4409962057b/146005-removebg-preview.png";
        gmail_items[1] = item2;

        Gmail_items item3 = new Gmail_items();
        item3.Name = "Medium Daily Digest";
        item3.subHeading = "7 Drawing to make you feel better.public Medium Daily Digest Get Medium For IOS or ..........";
        item3.time = "11:24 AM";
        item3.imageUrl = "https://o.remove.bg/downloads/10e681fc-4ca8-4350-8092-e6ee3e76cef6/main-thumb-78969562-100-wwitgpgcasfcfrbuklkcypqkffulntvw-removebg-preview.png";
        gmail_items[2] = item3;

        Gmail_items item4 = new Gmail_items();
        item4.Name = "Henri Rousseau";
        item4.subHeading = "▶Niagra falls pictures  Julia ,here";
        item4.time = "11:24 AM";
        item4.imageUrl = "https://o.remove.bg/downloads/10e681fc-4ca8-4350-8092-e6ee3e76cef6/main-thumb-78969562-100-wwitgpgcasfcfrbuklkcypqkffulntvw-removebg-preview.png";
        gmail_items[3] = item4;

        Gmail_items item5 = new Gmail_items();
        item5.Name = "Olenna Masson";
        item5.subHeading = "▶Lakestons Students art Exhibition";
        item5.time = "11:24 AM";
        item5.imageUrl = "https://o.remove.bg/downloads/10e681fc-4ca8-4350-8092-e6ee3e76cef6/main-thumb-78969562-100-wwitgpgcasfcfrbuklkcypqkffulntvw-removebg-preview.png";
        gmail_items[4] = item5;

    }

    private void initViews() {
        gmailRv = findViewById(R.id.gmail_rv);
    }
}