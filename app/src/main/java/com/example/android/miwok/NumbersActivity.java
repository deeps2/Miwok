package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new NumbersFragment())  //a new NumbersFragment is created and inserted it into the container view, using a FragmentTransaction
                .commit();                                      //Since the container has “match_parent” for width and height, the NumbersFragment will take up the whole width and height of the screen.
    }

    //To clarify, the NumbersActivity used to display the word_list.xml layout.
    // Now, the NumbersActivity displays the activity_category.xml layout, and the NumbersFragment displays the word_list.xml layout.

}