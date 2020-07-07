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

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;
import android.util.Log;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.Token;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AWSMobileClientCustomAuthTest extends AWSMobileClientTestBase {

    private static final String USERNAME = "somebody";
    private static final String PASSWORD = "1234Password!";

    private static Context appContext;
    private static AWSMobileClient auth;

    private static final CountDownLatch signUpLatch = new CountDownLatch(1);
    private static final String TAG = AWSMobileClientCustomAuthTest.class.getSimpleName();

    @BeforeClass
    public static void beforeClass() throws Exception {
        appContext = ApplicationProvider.getApplicationContext();
        final CountDownLatch latch = new CountDownLatch(1);
        final AWSConfiguration awsConfiguration = new AWSConfiguration(appContext);
        awsConfiguration.setConfiguration("Auth1");
        assert awsConfiguration.optJsonObject("Auth").has("authenticationFlowType");
        AWSMobileClient.getInstance().initialize(appContext, awsConfiguration, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                latch.countDown();
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "onError: ", e);
                latch.countDown();
            }
        });
        latch.await();
        auth = AWSMobileClient.getInstance();
    }

    /**
     * This test needs following backend set up to complete successfully :
     *
     * User - This test assumes presence of a user named `customAuthTestUser` in the test user pool
     * App Client - There should be an app client with "Only allow Custom Authentication (CUSTOM_AUTH_FLOW_ONLY)" enabled.
     * Lambda Triggers - It needs following lambda triggers set in the test userpool:
     *   Define Auth Lambda Trigger :
     *     ```
     *     exports.handler = function(event, context) {
     *         if (event.request.session.length == 1 && event.request.session[0].challengeName == 'SRP_A') {
     *             event.response.issueTokens = false;
     *             event.response.failAuthentication = false;
     *             event.response.challengeName = 'CUSTOM_CHALLENGE';
     *         } else if (event.request.session.length == 2 && event.request.session[1].challengeName == 'CUSTOM_CHALLENGE' && event.request.session[1].challengeResult == true) {
     *             event.response.issueTokens = true;
     *             event.response.failAuthentication = false;
     *             event.response.challengeName = 'CUSTOM_CHALLENGE';
     *         } else {
     *             event.response.issueTokens = false;
     *             event.response.failAuthentication = true;
     *         }
     *         context.done(null, event);
     *     }
     *     ```
     *
     *   Create Auth Lambda Trigger :
     *     ```
     *     function createAuthChallenge(event) {
     *         if (event.request.challengeName === 'CUSTOM_CHALLENGE') {
     *             event.response.publicChallengeParameters = {};
     *             event.response.privateChallengeParameters = {};
     *             event.response.privateChallengeParameters.answer = '1133';
     *         }
     *     }
     *
     *     exports.handler = (event, context, callback) => {
     *         console.log(JSON.stringify(event));
     *         createAuthChallenge(event);
     *
     *         console.log(JSON.stringify(event));
     *         callback(null, event);
     *     };
     *     ```
     *
     *   Verify Auth Lambda Trigger :
     *     ```
     *     function verifyAuthChallengeResponse(event) {
     *         if (event.request.privateChallengeParameters.answer === event.request.challengeAnswer) {
     *             event.response.answerCorrect = true;
     *         } else {
     *             event.response.answerCorrect = false;
     *         }
     *     }
     *
     *     exports.handler = (event, context, callback) => {
     *         console.log(JSON.stringify(event));
     *             verifyAuthChallengeResponse(event);
     *
     *         console.log(JSON.stringify(event));
     *         callback(null, event);
     *     };
     *     ```
     * awsconfiguration.json - Should set authenticationFlowType to 'CUSTOM_AUTH' in Auth section as follows :
     *
     *     ```
     *     "Auth": {
     *         "Default": {
     *             "authenticationFlowType": "CUSTOM_AUTH"
     *         }
     *     }
     *     ```
     *
     *
     * @throws Exception
     */
    @Test
    public void testCustomAuth() throws Exception {
        // Check successful sign In
        assertTrue("SignIn successful", signIn());

        // Check credentials are available
        final AWSCredentials credentials = auth.getCredentials();
        assertNotNull("Credentials are null", credentials);
        assertNotNull("Access key is null", credentials.getAWSAccessKeyId());
        assertNotNull("Secret key is null", credentials.getAWSSecretKey());

        Tokens tokens = auth.getTokens();
        assertNotNull(tokens);

        Token accessToken = tokens.getAccessToken();
        assertNotNull(accessToken);
        assertTrue("Access token should not be expired", accessToken.getExpiration().after(new Date()));
        Token idToken = tokens.getIdToken();
        assertNotNull(idToken);
        assertTrue("Id token should not be expired", idToken.getExpiration().after(new Date()));
        Token refreshToken = tokens.getRefreshToken();
        assertNotNull(refreshToken);

    }

    private boolean signIn() {
        auth.signIn(USERNAME, PASSWORD, null, new Callback<SignInResult>() {
            @Override
            public void onResult(final SignInResult signInResult) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d(TAG, "Sign-in callback state: " + signInResult.getSignInState());
                        switch (signInResult.getSignInState()) {
                            case DONE:
                                signUpLatch.countDown();
                                break;
                            case CUSTOM_CHALLENGE:
                                confirmSignIn();
                                break;
                            default:
                                Log.e("APP", "Unexpected sign-in confirmation state: " + signInResult.getSignInState());
                                break;
                        }
                    }
                });
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "Sign-in error", e);
            }
        });

        try {
            signUpLatch.await(20, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void confirmSignIn() {
        final Map<String, String> res = new HashMap<String, String>();
        final Map<String, String> clientMetaData = new HashMap<String, String>();
        clientMetaData.put("challengeResponseAnswer", "1133");
        res.put(CognitoServiceConstants.CHLG_RESP_ANSWER, "1133");
        auth.confirmSignIn(res, clientMetaData, new Callback<SignInResult>() {
            @Override
            public void onResult(final SignInResult signInResult) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d(TAG, "Sign-in callback state: " + signInResult.getSignInState());
                        switch (signInResult.getSignInState()) {
                            default:
                                Log.e(TAG, "Unexpected sign-in confirmation call: " + signInResult.getSignInState());
                                signUpLatch.countDown();
                                break;
                        }
                    }
                });
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "Confirm sign-in error", e);
                signUpLatch.countDown();
            }
        });

        try {
            signUpLatch.await(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}