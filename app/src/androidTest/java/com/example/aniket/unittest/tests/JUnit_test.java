package com.example.aniket.unittest.tests;

import android.support.annotation.MainThread;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.aniket.unittest.MainActivity;
import com.example.aniket.unittest.R;

/**
 * Created by Aniket on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
