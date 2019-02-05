package com.amazonaws.testutils;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import android.util.Log;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleInstrumentedTest extends  AWSTestBase{
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        String PackageName = appContext.getPackageName();
        Log.e("ExampleInstrumentedTest getPackageName",  PackageName);

        assertEquals("com.amazonaws.testutils.test", appContext.getPackageName());
    }
    @Test 
    public void checkJsonConfiguration() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();

            JSONObject credentials = getJsonConfiguration(appContext)
                    .getJSONObject("Credentials");
            String  accessKey = credentials.getString("accessKey");
         Log.e("checkJsonConfiguration accessKey", accessKey);

    }
}
