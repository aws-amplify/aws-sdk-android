/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates.
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

import android.util.Log;

import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowLog;

import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
public class AWSMobileClientAuthFlowSettingTest {
    private static final String TAG = AWSMobileClientAuthFlowSettingTest.class.getSimpleName();
    private CountDownLatch initLatch;
    private CountDownLatch signinLatch;
    private CountDownLatch continuationLatch;
    private AtomicBoolean initComplete;
    private AtomicBoolean signInComplete;
    private AtomicBoolean continuationComplete;
    private AWSMobileClient mobileClient;

    @Before
    public void beforeEachTest() {
        ShadowLog.stream = System.out;
        initLatch = new CountDownLatch(1);
        signinLatch = new CountDownLatch(1);
        continuationLatch = new CountDownLatch(1);
        initComplete = new AtomicBoolean(false);
        signInComplete = new AtomicBoolean(false);
        continuationComplete = new AtomicBoolean(false);
        try {
            mobileClient = AWSMobileClient.getInstance(true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void testUserPasswordAuth() throws JSONException, InterruptedException {
        String flowFromConfig = "USER_PASSWORD_AUTH";
        String expectedAuthType = "USER_PASSWORD";
        verifyScenario(flowFromConfig, expectedAuthType);
    }

    @Test
    public void testUserSrpAuth() throws JSONException, InterruptedException {
        String flowFromConfig = "USER_SRP_AUTH";
        String expectedAuthType = "PASSWORD_VERIFIER";
        verifyScenario(flowFromConfig, expectedAuthType);
    }

    @Test
    public void testCustomAuth() throws JSONException, InterruptedException {
        String flowFromConfig = "CUSTOM_AUTH";
        String expectedAuthType = "CUSTOM_CHALLENGE";
        verifyScenario(flowFromConfig, expectedAuthType);
    }

    @Test
    public void testNoAuthFlowInConfig() throws JSONException, InterruptedException {
        String flowFromConfig = null;
        String expectedAuthType = "PASSWORD_VERIFIER";
        verifyScenario(flowFromConfig, expectedAuthType);
    }

    /**
     * Verify that the correct auth type (aka challenge name) is passed in based on the
     * auth flow type from the config file.
     * @param authFlowType The auth flow type from the config.
     * @param expectedAuthType The auth type expected.
     * @throws JSONException Not expected.
     * @throws InterruptedException Not expected.
     */
    private void verifyScenario(String authFlowType, String expectedAuthType) throws JSONException, InterruptedException {
        AuthenticationContinuation mockContinuation = setupMockContinuation();
        CognitoUserPool mockUserPool = setupMockUserPool(mockContinuation);
        initMobileClientAndWait(authFlowType, mockUserPool);
        signinAndWait();
        ArgumentCaptor<AuthenticationDetails> argumentCaptor = ArgumentCaptor.forClass(AuthenticationDetails.class);
        verify(mockContinuation).setAuthenticationDetails(argumentCaptor.capture());
        AuthenticationDetails actualAuthDetails = argumentCaptor.getValue();
        assertEquals(expectedAuthType, actualAuthDetails.getAuthenticationType());
    }

    private void signinAndWait() throws InterruptedException {
        mobileClient.signIn("test",
                            "fakepassword",
                            Collections.emptyMap(),
                            Collections.emptyMap(),
                            new Callback<SignInResult>() {
                                @Override
                                public void onResult(SignInResult result) {
                                    signInComplete.set(true);
                                    signinLatch.countDown();
                                }

                                @Override
                                public void onError(Exception e) {
                                    e.printStackTrace();
                                    signinLatch.countDown();
                                }
                            });

        signinLatch.await(5, TimeUnit.SECONDS);
        continuationLatch.await(5, TimeUnit.SECONDS);
    }

    private void initMobileClientAndWait(String authFlowType, CognitoUserPool mockUserPool) throws JSONException, InterruptedException {
        JSONObject awsConfig = getAWSConfig(authFlowType);
        mobileClient.initialize(getApplicationContext(), new AWSConfiguration(awsConfig), new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                mobileClient.setUserPool(mockUserPool);
                Log.i(TAG, "Mobile client initialized. Mock user pool injected.");
                initComplete.set(true);
                initLatch.countDown();
            }

            @Override
            public void onError(Exception exception) {
                Log.e(TAG, "Mobile client failed to initialize.", exception);
                initLatch.countDown();
            }
        });
        initLatch.await(5, TimeUnit.SECONDS);
        assertTrue(initComplete.get());
    }

    private AuthenticationContinuation setupMockContinuation() {
        AuthenticationContinuation mockContinuation = mock(AuthenticationContinuation.class);

        doAnswer(invocation -> {
            Log.i(TAG, "Counting down continuation latch.");
            continuationLatch.countDown();
            continuationComplete.set(true);
            return null;
        }).when(mockContinuation).continueTask();
        return mockContinuation;
    }

    private CognitoUserPool setupMockUserPool(AuthenticationContinuation mockContinuation) {
        CognitoUserPool mockUserPool = mock(CognitoUserPool.class);
        CognitoUser mockUser = mock(CognitoUser.class);

        doAnswer(invocation -> {
            int indexOfHandler = 1;
            AuthenticationHandler handler = invocation.getArgument(indexOfHandler, AuthenticationHandler.class);
            handler.getAuthenticationDetails(mockContinuation, "FAKE_USER_ID");
            return null;
        }).when(mockUser).getSession(any(), any());
        when(mockUserPool.getUser(anyString())).thenReturn(mockUser);
        return mockUserPool;
    }

    private JSONObject getAWSConfig(String expectedAuthFlow) throws JSONException {
        return new JSONObject()
            .put("Auth", new JSONObject()
                .put("Default", new JSONObject()
                    .put("authenticationFlowType", expectedAuthFlow)
                    .put("Persistence", false)
                )
            )
            .put("CognitoUserPool", new JSONObject()
                .put("Default", new JSONObject()
                    .put("PoolId", "TEST_POOL_ID")
                    .put("Region", "us-east-1")
                    .put("AppClientId", "TEST_CLIENT_ID")
                )
            );
    }
}
