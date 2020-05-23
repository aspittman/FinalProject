package com.affinityapps.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class JokesLibraryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_jokes);

        JokesActivityFragment jokesActivityFragment = new JokesActivityFragment();

        if(savedInstanceState == null) {
            getSupportFragmentManager().
                    beginTransaction().
                    add(R.id.container, jokesActivityFragment).
                    commit();
        }

        Intent intent = getIntent();
        String jokes = intent.getStringExtra("jokes");

        Bundle bundle = new Bundle();
        bundle.putString("jokesTransfer", jokes);
        jokesActivityFragment.setArguments(bundle);
    }



}
