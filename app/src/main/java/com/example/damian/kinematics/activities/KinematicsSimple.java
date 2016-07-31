package com.example.damian.kinematics.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.damian.kinematics.R;
import com.example.damian.kinematics.adapters.CustomPagerAdapter;
import com.example.damian.kinematics.adapters.CustomViewPager;
import com.example.damian.kinematics.fragments.FragmentParent;
import com.example.damian.kinematics.fragments.KinematicsSimpleDeclaration;
import com.example.damian.kinematics.fragments.KinematicsSimpleView;

/**
 * Created by Damian on 2016-07-24.
 */
public class KinematicsSimple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kinematics_simple);

        CustomViewPager customViewPager = (CustomViewPager ) findViewById(R.id.viewpagerKinematicsSimple);

        assert customViewPager != null;
        customViewPager.setAdapter(new CustomPagerAdapter(this, getSupportFragmentManager(), getFragmentParetnt()));


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public FragmentParent[] getFragmentParetnt() {
        FragmentParent kinematicsSimpleDeclaration = new KinematicsSimpleDeclaration();
        FragmentParent kinematicsSimpleView = new KinematicsSimpleView();

        return new FragmentParent[]{kinematicsSimpleDeclaration, kinematicsSimpleView};
    }
}
