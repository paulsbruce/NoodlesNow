package io.paulsbruce.dev.noodlesnowpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        setTitle(R.string.app_name + " - " + getIntent().getStringExtra("logonid"));
    }
}
