package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class InstagramActivity extends AppCompatActivity {
    public InstagramItems[] instagram;
    public RecyclerView fovtIv;
    public InstaAdpater adpater;
    public InstaAdpater instaAdpater;
    public RecyclerView suggestRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        initView();
        addData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        fovtIv.setLayoutManager(new LinearLayoutManager(this));
        fovtIv.setAdapter(adpater);
        suggestRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        suggestRv.setAdapter(instaAdpater);



    }

    private void setUpAdapter() {
        adpater = new InstaAdpater(instagram);
        instaAdpater = new InstaAdpater(instagram);
    }

    private void addData() {
        instagram = new InstagramItems[4];
        InstagramItems items = new InstagramItems();
        items.profile = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        items.userId = "lil_wyatt838";
        items.subText = "Wyatt Torres";
        instagram[0] = items;

        InstagramItems item1 = new InstagramItems();
        item1.profile = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item1.userId = "sprinkles_bby19";
        item1.subText = "Gabriela Perez";
        instagram[1] = item1;

        InstagramItems item2 = new InstagramItems();
        item2.profile = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item2.userId = "xander.the.great178";
        item2.subText = "Alex Koch";
        instagram[2] = item2;

        InstagramItems item3 = new InstagramItems();
        item3.profile = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item3.userId = "kyia_kayaks ";
        item3.subText = "Kyra Marie";
        instagram[3] = item3;

    }

    private void initView() {
        fovtIv = findViewById(R.id.fovt_rv);
        suggestRv = findViewById(R.id.suggest_rv);

    }
}