package com.example.darker.mydaylianxi.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.darker.mydaylianxi.R;

import java.util.ArrayList;
import java.util.List;

public class Myadapter extends BaseAdapter {
    private Context context;
    private List<Integer> list;

    public Myadapter(Context context, List<Integer> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

           view=View.inflate(context,R.layout.xlist_view,null);
        TextView viewById = view.findViewById(R.id.text_view);
        Integer integer = list.get(i);
        viewById.setText(integer+"");
        return view;
    }
}
