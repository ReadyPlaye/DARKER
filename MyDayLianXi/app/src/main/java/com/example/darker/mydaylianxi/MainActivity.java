package com.example.darker.mydaylianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.darker.mydaylianxi.adapter.Myadapter;
import com.example.darker.mydaylianxi.view.XListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private XListView xListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xListView = findViewById(R.id.xlist_view);
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i <40 ; i++) {
            lis.add(i);
        }
        Myadapter  myadapter=new Myadapter(this,lis);
        xListView.setAdapter(myadapter);
    }
}
