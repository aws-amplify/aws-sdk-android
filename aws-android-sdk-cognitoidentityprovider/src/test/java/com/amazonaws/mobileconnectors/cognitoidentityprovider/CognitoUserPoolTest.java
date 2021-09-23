/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import android.util.Base64;
import android.util.Log;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.model.AuthenticationResultType;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthRequest;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthResult;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeResult;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RunWith(RobolectricTestRunner.class)
@Config(manifest= Config.NONE, sdk = 27)
public class CognitoUserPoolTest {
    private static final String USER1 = "user1";
    private static final String USER2 = "user2";
    private CognitoUserPool cognitoUserPool;
    private AmazonCognitoIdentityProvider mockProvider;
    @Before
    public void setup() {
        ShadowLog.stream = System.out;
        mockProvider = mock(AmazonCognitoIdentityProvider.class);
        cognitoUserPool = new CognitoUserPool(getApplicationContext(), "us-east-1_xxxxx", "dummyclientid", "dummysecret", Regions.US_EAST_1);
        cognitoUserPool.setAdvancedSecurityDataCollectionFlag(false);
        cognitoUserPool.setIdentityProvider(mockProvider);
    }

    /**
     * Verify that the last auth user is saved when a previous session is read from cache.
     *
     * @throws InterruptedException
     */
    @Test
    public void verifyLastAuthUserWithMultipleLogins() throws InterruptedException {
        // First login of user1 should result in the session getting cached
        setupMock(USER1);
        CountDownLatch loginLatch = new CountDownLatch(1);
        cognitoUserPool.getUser(USER1).getSession(new LatchedAuthenticationHandler(loginLatch));
        loginLatch.await(5, TimeUnit.SECONDS);
        CognitoUser currentUser1 = cognitoUserPool.getCurrentUser();
        assertEquals(USER1, currentUser1.getUserId());

        // First login of user2 should result in the session getting cached
        setupMock(USER2);
        loginLatch = new CountDownLatch(1);
        cognitoUserPool.getUser(USER2).getSession(new LatchedAuthenticationHandler(loginLatch));
        loginLatch.await(5, TimeUnit.SECONDS);
        CognitoUser currentUser2 = cognitoUserPool.getCurrentUser();
        assertEquals(USER2, currentUser2.getUserId());

        // Second login of user1 should read cached session and save the last auth user.
        loginLatch = new CountDownLatch(1);
        cognitoUserPool.getUser(USER1).getSession(new LatchedAuthenticationHandler(loginLatch));
        loginLatch.await(5, TimeUnit.SECONDS);
        currentUser1 = cognitoUserPool.getCurrentUser();
        assertEquals(USER1, currentUser1.getUserId());
    }

    static final class LatchedAuthenticationHandler implements AuthenticationHandler {
        private final CountDownLatch loginLatch;

        public LatchedAuthenticationHandler(CountDownLatch loginLatch) {
            this.loginLatch = loginLatch;
        }
        @Override
        public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
            loginLatch.countDown();
        }

        @Override
        public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId) {
            authenticationContinuation.setAuthenticationDetails(new AuthenticationDetails(userId, "test", Collections.emptyMap()));
            authenticationContinuation.continueTask();
        }

        @Override
        public void getMFACode(MultiFactorAuthenticationContinuation continuation) {

        }

        @Override
        public void authenticationChallenge(ChallengeContinuation continuation) {

        }

        @Override
        public void onFailure(Exception exception) {
            Log.e("Test", "Login failed.", exception);
        }
    }

    private void setupMock(String userName) {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put(CognitoServiceConstants.CHLG_PARAM_USERNAME, userName);
        parameters.put(CognitoServiceConstants.CHLG_PARAM_SRP_B, "1");
        parameters.put(CognitoServiceConstants.CHLG_PARAM_SALT, "1234");
        parameters.put(CognitoServiceConstants.CHLG_PARAM_USER_ID_FOR_SRP, userName);
        when(mockProvider.initiateAuth(any(InitiateAuthRequest.class))).thenAnswer(answer -> {
            Log.i("Test", "Inside mock initiateAuth");
            return new InitiateAuthResult()
                .withChallengeName(CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER)
                .withChallengeParameters(parameters);
        });
        when(mockProvider.respondToAuthChallenge(any(RespondToAuthChallengeRequest.class))).thenAnswer(answer -> {
            String validJWT = getValidJWT(360);
            return new RespondToAuthChallengeResult()
               .withAuthenticationResult(new AuthenticationResultType()
                                             .withAccessToken(validJWT)
                                             .withIdToken(validJWT));
        });
    }

    private String getValidJWT(long expiryInSecs){
        long epoch = System.currentTimeMillis()/1000L;
        epoch = epoch + expiryInSecs;
        String accessToken_p1_Base64 = "eyJ0eXAiOiAiSldUIiwgImFsZyI6IlJTMjU2In0=";
        String accessToken_p3_Base64 = "e0VuY3J5cHRlZF9LZXl9";
        String accessToken_p2_Str = "{\"iss\": \"userPoolId\",\"sub\": \"my@email.com\",\"aud\": \"https:aws.cognito.com\",\"exp\": \"" + String.valueOf(epoch).toString() + "\"}";
        byte[] accessToken_p2_UTF8 = accessToken_p2_Str.getBytes(StringUtils.UTF8);
        //String accessToken_p2_Base64 = Base64.encodeToString(accessToken_p2_UTF8, Base64.DEFAULT);
        String accessToken_p2_Base64 = new String(Base64.encode(accessToken_p2_UTF8, Base64.DEFAULT));
        String validAccessToken = accessToken_p1_Base64+"."+accessToken_p2_Base64+"."+accessToken_p3_Base64;
        return validAccessToken;
    }
}
