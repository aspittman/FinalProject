package com.udacity.gradle.builditbigger.backend;

import com.affinityapps.javajokes.JokesActivity;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new JokesActivity().jokesList();
        return myData;
    }


}