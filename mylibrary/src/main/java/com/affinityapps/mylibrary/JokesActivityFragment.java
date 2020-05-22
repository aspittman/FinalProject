package com.affinityapps.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class JokesActivityFragment extends Fragment {


    public JokesActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_jokes, container, false);
        Intent intent = getActivity().getIntent();

//        String jokes = intent.getIntExtra("jokes");
//        TextView textView = view.findViewById(R.id.jokes_textview);
//        textView.setText(jokes);


        return inflater.inflate(R.layout.fragment_activity_jokes, container, false);
    }

}
