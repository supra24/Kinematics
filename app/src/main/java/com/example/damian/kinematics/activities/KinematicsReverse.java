package com.example.damian.kinematics.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.damian.kinematics.R;
import com.example.damian.kinematics.adapters.CustomPagerAdapter;
import com.example.damian.kinematics.adapters.CustomViewPager;
import com.example.damian.kinematics.fragments.FragmentParent;
import com.example.damian.kinematics.fragments.KinematicsReverseDeclaration;
import com.example.damian.kinematics.fragments.KinematicsReverseView;

/**
 * Created by Damian on 2016-07-24.
 */
public class KinematicsReverse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kinematics_reverse);

        CustomViewPager customViewPager = (CustomViewPager ) findViewById(R.id.viewpagerKinematicsReverse);

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
        FragmentParent kinematicsReverseDeclaration = new KinematicsReverseDeclaration();
        FragmentParent kinematicsReverseView = new KinematicsReverseView();

        return new FragmentParent[]{kinematicsReverseDeclaration, kinematicsReverseView};
    }
}
