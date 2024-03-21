package com.leynnnnnn.helloandroid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final Integer[] imgs;

    public MyListAdapter(@NonNull Context context, int resource, Activity context1, String[] mainTitle, String[] description, Integer[] imgs) {
        super(context, resource);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.imgs = imgs;

    }

//    public View getView(int position, View view, ViewGroup parent) {
//        LayoutInflater inflater = context.getLayoutInflater();
//        View rowView = inflater.inflate(R.layout.activity_custom_list_view, null, true);
//
//
//    };

}
