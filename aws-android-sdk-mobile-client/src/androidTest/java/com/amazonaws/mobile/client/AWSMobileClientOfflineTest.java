/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.mobile.client;

import com.amazonaws.mobile.client.test.R;
import com.amazonaws.mobile.config.AWSConfiguration;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static com.amazonaws.testutils.util.InternetConnectivity.goOffline;
import static com.amazonaws.testutils.util.InternetConnectivity.goOnline;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * User pool and identity pool were create with Amplify CLI 0.1.23 Default configuration
 */
public final class AWSMobileClientOfflineTest extends AWSMobileClientTestBase {
    private static AWSMobileClient auth;
    private UserStateListener listener;

    @BeforeClass
    public static void beforeSuite() throws Exception {
        goOffline();
        CountDownLatch latch = new CountDownLatch(1);
        auth = AWSMobileClient.getInstance();
        AWSConfiguration config = new AWSConfiguration(getApplicationContext(), R.raw.fakeawsconfiguration);
        auth.initialize(getApplicationContext(), config, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                latch.countDown();
            }

            @Override
            public void onError(Exception e) {
                latch.countDown();
            }
        });
        latch.await();

        AWSConfiguration awsConfiguration = auth.getConfiguration();
        JSONObject userPoolConfig = awsConfiguration.optJsonObject("CognitoUserPool");
        assertNotNull(userPoolConfig);
        assertEquals("us-west-2", userPoolConfig.getString("Region"));
    }

    @Before
    public void beforeTest() {
        auth.signOut();
    }

    @After
    public void afterTest() {
        auth.removeUserStateListener(listener);
        auth.listeners.clear();
    }

    @AfterClass
    public static void afterSuite() {
        goOnline();
    }

    @Test
    public void useAppContext() throws JSONException {
        AWSConfiguration awsConfiguration = new AWSConfiguration(getApplicationContext(), R.raw.fakeawsconfiguration);
        JSONObject userPoolConfig = awsConfiguration.optJsonObject("CognitoUserPool");
        assertNotNull(userPoolConfig);
        assertEquals("us-west-2", userPoolConfig.getString("Region"));
        assertEquals(
            "com.amazonaws.mobile.client.test",
            getApplicationContext().getPackageName()
        );
    }

    @Test
    public void testGetConfiguration() throws JSONException {
        AWSConfiguration awsConfiguration = auth.getConfiguration();
        JSONObject userPoolConfig = awsConfiguration.optJsonObject("CognitoUserPool");
        assertNotNull(userPoolConfig);
        assertEquals(
            "us-west-2",
            userPoolConfig.getString("Region")
        );
    }

    @Test
    public void testSignInWaitOIDCOffline() {
        Queue<UserStateDetails> allChanges = new ConcurrentLinkedQueue<>();
        setTokensDirectly(getApplicationContext(), auth.getLoginKey(), "fakeToken", "someIdentityId");
        listener = allChanges::add;
        auth.addUserStateListener(listener);
        assertTrue("User is offline and tokens are invalid", auth.isSignedIn());

        try {
            auth.getTokens();
        } catch (final Exception e) {
            assertEquals("No cached session.", e.getMessage());
        }
        assertEquals("1 signed-in events should not have been triggered, because tokens swapped underneath", 1, allChanges.size());
        assertEquals(UserState.SIGNED_IN, allChanges.remove().getUserState());
   }
}
