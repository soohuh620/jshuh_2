package com.example.release.jshuh_2;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.BLACK;

/**
 * Created by release on 2017. 5. 26..
 */

public class ListAdapter extends BaseAdapter {
    Context c;
    ListView listview;
    ArrayList<CModel> user;

    public ListAdapter(Context c, ListView listview, ArrayList<CModel> user){

        this.c = c;
        this.listview = listview;
        this.user = user;
    }

    @Override
    public int getCount() {
        return user.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        switch(user.get(i).getType()){
            case 1:
                view = LayoutInflater.from(c).inflate(R.layout.i_talk,null);
                ImageView imgView1 = (ImageView)view.findViewById(R.id.user1_img);
                TextView nameView1 = (TextView)view.findViewById(R.id.user1_name);
                TextView textView1 = (TextView)view.findViewById(R.id.user1_text);
                nameView1.setText(user.get(i).getUser_text());
                textView1.setText(user.get(i).getUser_name());
                break;

            case 2:
                view = LayoutInflater.from(c).inflate(R.layout.you_talk,null);
                ImageView imgView2 = (ImageView)view.findViewById(R.id.user2_img);
                TextView nameView2 = (TextView)view.findViewById(R.id.user2_name);
                TextView textView2 = (TextView)view.findViewById(R.id.user2_text);
                nameView2.setText(user.get(i).getUser_text());
                textView2.setText(user.get(i).getUser_name());
                break;

            case 3:
                TextView byebye = new TextView(c);
                byebye.setGravity(Gravity.CENTER);
                byebye.setTextColor(Color.BLUE);
                view = byebye;

                break;

        }
        return view;
    }
}

