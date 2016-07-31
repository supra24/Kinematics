package com.example.damian.kinematics.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.damian.kinematics.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button bKinematicsSimple = (Button) findViewById(R.id.kinematicsSimple);
        kinematicsSimple(bKinematicsSimple);

        Button bKinematicsReverse = (Button) findViewById(R.id.kinematicsReverse);
        kinematicsReverse(bKinematicsReverse);
    }

    private void kinematicsReverse(Button button) {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), KinematicsReverse.class);
                startActivity(intent);
            }
        });
    }

    private void kinematicsSimple(Button button) {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), KinematicsSimple.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
