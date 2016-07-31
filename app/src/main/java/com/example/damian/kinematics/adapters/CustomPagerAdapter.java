package com.example.damian.kinematics.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.damian.kinematics.fragments.FragmentParent;

public class CustomPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private FragmentParent[] arrayList;

    public CustomPagerAdapter(Context context, FragmentManager fragmentManager, FragmentParent[] arrayList) {
        super(fragmentManager);
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.length;
    }

    @Override
    public Fragment getItem(int position) {
        return arrayList[position];
    }
}
