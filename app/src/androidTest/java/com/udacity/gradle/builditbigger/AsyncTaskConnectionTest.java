package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;

import androidx.test.filters.SmallTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4ClassRunner.class)
@SmallTest
public class AsyncTaskConnectionTest {

    @Test
    public void TestAsyncTaskResponse() {

        new EndpointsAsyncTask();
        AsyncTask.execute((Runnable) this);

    }
}



