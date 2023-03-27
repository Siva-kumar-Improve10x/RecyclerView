package com.improve10x.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CallLogActivity extends AppCompatActivity {
    public CallsItems[] items;
    CallLogItemAdapter adapter;
    RecyclerView callLogsRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_log);
        initViews();
        myCallLog();
        setUpAdapter();
        connectAdapter();
        setUpAdapterClickListener();
    }

    private void setUpAdapterClickListener() {
        adapter.clickListener = new OnCallLogItemClickListener() {
            @Override
            public void onCallClick(CallsItems call) {
                Toast.makeText(CallLogActivity.this, call.number, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CallLogActivity.this,InstagramActivity.class);
                startActivity(intent);
            }
        };
    }

    private void connectAdapter() {
        callLogsRv.setLayoutManager(new LinearLayoutManager(this));
        callLogsRv.setAdapter(adapter);

    }

    private void setUpAdapter() {
        adapter = new CallLogItemAdapter(items);
    }

    private void myCallLog() {
        items = new CallsItems[5];
        CallsItems items1 = new CallsItems();
        items1.profile = "https://icons.veryicon.com/png/o/miscellaneous/google_material_offical/person-21.png";
        items1.details = "↙ India, 46 min.ago";
        items1.number = "Viswa";
        items[0] = items1;

        CallsItems items2 = new CallsItems();
        items2.profile = "https://icons.veryicon.com/png/o/miscellaneous/google_material_offical/person-21.png";
        items2.details = "↩ Mobile, 1 hr.ago";
        items2.number = "WiFi";
        items[1] = items2;

        CallsItems items3 = new CallsItems();
        items3.profile = "https://icons.veryicon.com/png/o/miscellaneous/google_material_offical/person-21.png";
        items3.details = "↗ Mobile, 1 hr.ago";
        items3.number = "Viswa";
        items[2] = items3;

        CallsItems items4 = new CallsItems();
        items4.profile = "https://icons.veryicon.com/png/o/miscellaneous/google_material_offical/person-21.png";
        items4.details = "↗ India, 22 hrs.ago";
        items4.number = "Renuka CEO(2)";
        items[3] = items4;

        CallsItems items5 = new CallsItems();
        items5.profile = "https://icons.veryicon.com/png/o/miscellaneous/google_material_offical/person-21.png";
        items5.details = "↩ India, 1d.ago";
        items5.number = "Pani ledhu vediki(7)";
        items[4] = items5;

    }

    private void initViews() {
        callLogsRv = findViewById(R.id.calllogs_rv);
    }
}