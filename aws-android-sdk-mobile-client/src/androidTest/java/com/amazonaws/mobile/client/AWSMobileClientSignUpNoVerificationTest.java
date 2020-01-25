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
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.SignInState;
import com.amazonaws.mobile.client.results.SignUpResult;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.AdminConfirmSignUpRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AdminDeleteUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ListUsersRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ListUsersResult;
import com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException;
import com.amazonaws.services.cognitoidentityprovider.model.UserType;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * This class tests {@link AWSMobileClient#signUp(String, String, Map, Map)}
 * with a {@link com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool} that has
 * No MFA and No other verification mechanisms
 * which will send a {@link com.amazonaws.mobile.client.results.SignUpResult} with no
 * {@link com.amazonaws.mobile.client.results.UserCodeDeliveryDetails}
 */
public class AWSMobileClientSignUpNoVerificationTest extends AWSMobileClientTestBase {
    private static final String TAG = AWSMobileClientTest.class.getSimpleName();

    private static final String EMAIL = "somebody@email.com";
    private static final String USERNAME = "somebody";
    private static final String PASSWORD = "1234Password!";
    private static final long THREAD_WAIT_DURATION = 60;

    private static AmazonCognitoIdentityProvider userPoolLowLevelClient;

    // Populated from awsconfiguration.json
    private static Regions clientRegion = Regions.US_WEST_2;
    private static String userPoolId;

    private Context appContext;
    private AWSMobileClient auth;
    private String username;

    private static synchronized AmazonCognitoIdentityProvider getUserPoolLowLevelClient() {
        if (userPoolLowLevelClient == null) {
            userPoolLowLevelClient = new AmazonCognitoIdentityProviderClient(credentials);
            userPoolLowLevelClient.setRegion(Region.getRegion(clientRegion));
        }
        return userPoolLowLevelClient;
    }

    private static void createUser(final AWSMobileClient auth,
                                  final String userPoolId,
                                  final String username,
                                  final String password,
                                  final String email) throws Exception {
        HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", email);
        auth.signUp(username, password, userAttributes,null);

        AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
        adminConfirmSignUpRequest.withUsername(username).withUserPoolId(userPoolId);
        getUserPoolLowLevelClient().adminConfirmSignUp(adminConfirmSignUpRequest);
    }

    private static void deleteAllUsers(final String userPoolId) {
        ListUsersResult listUsersResult;
        do {
            ListUsersRequest listUsersRequest = new ListUsersRequest()
                    .withUserPoolId(userPoolId)
                    .withLimit(60);
            listUsersResult = getUserPoolLowLevelClient().listUsers(listUsersRequest);
            for (UserType user : listUsersResult.getUsers()) {
                if (USERNAME.equals(user.getUsername())
                        || "bimin".equals(user.getUsername()) || "customAuthTestUser".equals(user.getUsername())) {
                    // This user is saved to test the identity id permanence
                    continue;
                }
                boolean retryConfirmSignUp = false;
                do {
                    try {
                        Log.d(TAG, "deleteAllUsers: " + user.getUsername());
                        getUserPoolLowLevelClient().adminDeleteUser(
                                new AdminDeleteUserRequest()
                                        .withUsername(user.getUsername())
                                        .withUserPoolId(userPoolId));
                    } catch (UserNotConfirmedException e) {
                        if (!retryConfirmSignUp) {
                            AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
                            adminConfirmSignUpRequest
                                    .withUsername(user.getUsername())
                                    .withUserPoolId(userPoolId);
                            getUserPoolLowLevelClient().adminConfirmSignUp(adminConfirmSignUpRequest);
                            retryConfirmSignUp = true;
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        } else {
                            retryConfirmSignUp = false;
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "deleteAllUsers: Some error trying to delete user", e);
                    }
                } while (retryConfirmSignUp);
            }
        } while (listUsersResult.getPaginationToken() != null);
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        setUpCredentials();
        Context appContext = InstrumentationRegistry.getTargetContext();

        final CountDownLatch waitUntilInitialized = new CountDownLatch(1);
        final AWSConfiguration awsConfiguration = new AWSConfiguration(appContext);
        AWSMobileClient.getInstance().initialize(appContext,
                awsConfiguration,
                new Callback<UserStateDetails>() {
                    @Override
                    public void onResult(UserStateDetails result) {
                        waitUntilInitialized.countDown();
                    }

                    @Override
                    public void onError(Exception e) {
                        waitUntilInitialized.countDown();
                    }
                });
        waitUntilInitialized.await();

        JSONObject userPoolConfig = awsConfiguration.optJsonObject("CognitoUserPool");
        assertNotNull(userPoolConfig);
        clientRegion = Regions.fromName(userPoolConfig.getString("Region"));
        userPoolId = userPoolConfig.getString("PoolId");

        JSONObject identityPoolConfig =
                awsConfiguration.optJsonObject("CredentialsProvider").getJSONObject(
                        "CognitoIdentity").getJSONObject("Default");
        assertNotNull(identityPoolConfig);

        deleteAllUsers(userPoolId);
    }

    @Before
    public void before() throws Exception {
        appContext = InstrumentationRegistry.getTargetContext();
        auth = AWSMobileClient.getInstance();
        auth.signOut();

        username = "testUser" + System.currentTimeMillis() + new Random().nextInt();
        createUser(auth, userPoolId, username, PASSWORD, EMAIL);
    }

    @After
    public void after() {
        auth.signOut();

        appContext.getSharedPreferences(AWSMobileClient.SHARED_PREFERENCES_KEY,
                Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
        deleteAllEncryptionKeys();
    }

    @Test(expected = com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException.class)
    public void testSignUpSyncNoVerification() throws Exception {
        final String username = "testUser" + System.currentTimeMillis() + new Random().nextInt();
        assertNotEquals("generated usernames are the same", this.username, username);

        final HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", EMAIL);

        final SignUpResult signUpResult = auth.signUp(username, PASSWORD, userAttributes, null);
        assertNotNull(signUpResult.getUserSub());
        assertFalse(signUpResult.getConfirmationState());
        assertNull(signUpResult.getUserCodeDeliveryDetails());
        assertNotNull(signUpResult.getUserSub());

        final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
        assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());
    }

    @Test(expected = com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException.class)
    public void testSignUpAsyncNoVerification() throws Exception {
        final String username = "testUser" + System.currentTimeMillis() + new Random().nextInt();
        assertNotEquals("generated usernames are the same", this.username, username);

        final HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", EMAIL);

        final CountDownLatch waitForSignUpResult = new CountDownLatch(1);
        auth.signUp(username, PASSWORD, userAttributes, null, new Callback<SignUpResult>() {
            @Override
            public void onResult(SignUpResult signUpResult) {
                assertNotNull(signUpResult.getUserSub());
                assertFalse(signUpResult.getConfirmationState());
                assertNull(signUpResult.getUserCodeDeliveryDetails());
                assertNotNull(signUpResult.getUserSub());
                waitForSignUpResult.countDown();
            }

            @Override
            public void onError(Exception e) {
                waitForSignUpResult.countDown();
            }
        });
        waitForSignUpResult.await(THREAD_WAIT_DURATION, TimeUnit.SECONDS);

        final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
        assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());
    }
}
