package com.example.sumeet.kalwardirectorytry1;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sumeet on 05-07-2017.
 */

public class MembersListAdapter extends ArrayAdapter<Member_Pojo> {

    private Activity context;
    private List<Member_Pojo> memberList;
    // CustomFilter filter;
  //  ArrayList<Member_Pojo> filterlist;


    public MembersListAdapter(Activity context, List<Member_Pojo> memberList) {
        super(context, R.layout.home_listview_display, memberList);
        this.context = context;
        this.memberList = memberList;
        //this.filterlist = (ArrayList<Member_Pojo>) memberList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.home_listview_display, null, true);

        TextView name_tv = (TextView) listViewItem.findViewById(R.id.tv_name_display);
        TextView town_tv = (TextView) listViewItem.findViewById(R.id.tv_town_display);
        TextView id = (TextView) listViewItem.findViewById(R.id.textViewID);
        Member_Pojo member = memberList.get(position);

        name_tv.setText(member.getName());
        town_tv.setText(member.getTownP());
        id.setText(member.getId());

        return listViewItem;

    }

}

