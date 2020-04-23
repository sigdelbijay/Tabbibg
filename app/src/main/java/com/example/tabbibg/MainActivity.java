package com.example.tabbibg;

import android.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ActionBar.Tab tab1, tab2, tab3;
    Fragment fragment1 = new TabFragment1();
    Fragment fragment2 = new TabFragment2();
    Fragment fragment3 = new TabFragment3();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tab1 = actionBar.newTab().setText("Tab1");
        tab2 = actionBar.newTab().setText("Tab2");
        tab3 = actionBar.newTab().setText("Tab3");

        tab1.setTabListener(new TabListener(fragment1));
        tab2.setTabListener(new TabListener(fragment2));
        tab3.setTabListener(new TabListener(fragment3));

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);



    }
}
