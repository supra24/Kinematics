package com.example.damian.kinematics.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.damian.kinematics.R;
import com.example.damian.kinematics.adapters.CustomArrayListAdapter;

import java.util.ArrayList;

/**
 * Created by Damian on 2016-07-29.
 */
public class SimpleDeclarationListView extends FragmentParent{

    String[] members = {
            "Rotary Perpendicular", "Rotary Horizontal", "Rotary Perpendicular", "Rotary Horizontal", "Rotary Perpendicular", "Rotary Horizontal", "Rotary Perpendicular", "Rotary Horizontal"
    };

    int[] images = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher
    };


    public SimpleDeclarationListView() {
        layoutid = R.layout.simple_declaration_navigation;
    }

    @Override
    public void init(View view) {
        CustomArrayListAdapter customArrayListAdapter =  new CustomArrayListAdapter(this.getContext(), members, images);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(customArrayListAdapter);

    }
}
