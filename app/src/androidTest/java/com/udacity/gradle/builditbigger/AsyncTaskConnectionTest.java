package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;

import androidx.test.espresso.ViewAssertion;
import androidx.test.filters.LargeTest;
import androidx.test.filters.SmallTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class AsyncTaskConnectionTest {
    @Rule
    public ActivityTestRule activityRule =
            new ActivityTestRule(MainActivity.class);


    @Test
    public void jokesLoaderTest() {

        onView(withId(R.id.tell_joke_button))
                .perform(click());

        onView(withId(R.id.jokes_textview))
                .check(matches(isDisplayed()));
    }
}



