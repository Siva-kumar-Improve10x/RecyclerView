package com.improve10x.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FaceBookActivity extends AppCompatActivity {
    public Facebook_items[] facebookItems;
    public fbItemAdapter adapter;
    RecyclerView fbRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_book);
        initViews();
        facebookData();
        setUpAdpater();
        connectAdpater();

    }

    private void connectAdpater() {
        fbRv.setAdapter(adapter);
        fbRv.setLayoutManager(new GridLayoutManager(this,6));
    }

    private void setUpAdpater() {
        adapter = new fbItemAdapter(facebookItems);
    }

    private void facebookData() {
        facebookItems = new Facebook_items[7];
        Facebook_items items = new Facebook_items();
        items.profile = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        items.hours = "1 hour ago";
        items.message = "Angela jaemi Favorite Huit reacted to your story";
        facebookItems[0] = items;

        Facebook_items item1 = new Facebook_items();
        item1.profile = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.hours = "1 hour ago";
        item1.message = "Kimwana Michael, Linh An and Channell Boxley asked to join I Love Still Life Painting!..";
        facebookItems[1] = item1;

        Facebook_items item2 = new Facebook_items();
        item2.profile = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.hours = "5 minutes ago";
        item2.message = "Lloyed Cafe Candena is live now: 'LAPIT NA MAG END OF SEASON!!!' ";
        facebookItems[2] = item2;

        Facebook_items item3 = new Facebook_items();
        item3.profile = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.hours = "1 hour ago";
        item3.message = "Sia Ellise Mejorada commented on a post in Hachi's BUy and Sell Group";
        facebookItems[3] = item3;

        Facebook_items item4 = new Facebook_items();
        item4.profile = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.hours = "2 hours ago";
        item4.message = "Mavreen Anee Romero and Others Added to their stories";
        facebookItems[4] = item4;

        Facebook_items item5 = new Facebook_items();
        item5.profile = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.hours = "2 hours ago";
        item5.message = "Sosy Sophie,Rampage TravelandTours and LetsircEcargNodner Nillillam listed in CAMSUR..";
        facebookItems[5] = item5;

        Facebook_items item6 = new Facebook_items();
        item6.profile = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.hours = "2 hours ago";
        item6.message = "Sosy Sophie,Rampage TravelandTours and LetsircEcargNodner Nillillam listed in CAMSUR..";
        facebookItems[6] = item6;
    }

    private void initViews() {
        fbRv = findViewById(R.id.fbrecyleview_rv);
    }
}