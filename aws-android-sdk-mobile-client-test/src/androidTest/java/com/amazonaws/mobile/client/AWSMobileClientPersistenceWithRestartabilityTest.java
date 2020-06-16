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
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.SignInState;
import com.amazonaws.mobile.client.results.Token;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.AccessToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.IdToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.RefreshToken;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;
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

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static com.amazonaws.mobile.client.AWSMobileClient.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class AWSMobileClientPersistenceWithRestartabilityTest extends AWSMobileClientTestBase {
    private static final String TAG = AWSMobileClientPersistenceTest.class.getSimpleName();

    private static final String EMAIL = "success+user@simulator.amazonses.com";
    private static final String USERNAME = "somebody";
    private static final String PASSWORD = "1234Password!";

    private static AmazonCognitoIdentityProvider cognitoUserPoolLowLevelClient;

    // Populated from awsconfiguration.json
    private static Regions clientRegion = Regions.US_WEST_2;
    private static String userPoolId;

    private Context appContext;
    private AWSMobileClient auth;
    private UserStateListener listener;
    private String username;

    public static synchronized AmazonCognitoIdentityProvider getCognitoUserPoolLowLevelClient() {
        if (cognitoUserPoolLowLevelClient == null) {
            cognitoUserPoolLowLevelClient = new AmazonCognitoIdentityProviderClient(credentials);
            cognitoUserPoolLowLevelClient.setRegion(Region.getRegion(clientRegion));
        }
        return cognitoUserPoolLowLevelClient;
    }

    public static void createUser(final AWSMobileClient auth,
                                  final String userPoolId,
                                  final String username,
                                  final String password,
                                  final String email) throws Exception {
        HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", email);
        auth.signUp(username, password, userAttributes,null);

        AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
        adminConfirmSignUpRequest.withUsername(username).withUserPoolId(userPoolId);
        getCognitoUserPoolLowLevelClient().adminConfirmSignUp(adminConfirmSignUpRequest);
    }

    public static void deleteAllUsers(final String userPoolId) {
        ListUsersResult listUsersResult;
        do {
            ListUsersRequest listUsersRequest = new ListUsersRequest()
                    .withUserPoolId(userPoolId)
                    .withLimit(60);
            listUsersResult = getCognitoUserPoolLowLevelClient().listUsers(listUsersRequest);
            for (UserType user : listUsersResult.getUsers()) {
                if (USERNAME.equals(user.getUsername())
                        || "bimin".equals(user.getUsername())) {
                    // This user is saved to test the identity id permanence
                    continue;
                }
                boolean retryConfirmSignUp = false;
                do {
                    try {
                        Log.d(TAG, "deleteAllUsers: " + user.getUsername());
                        getCognitoUserPoolLowLevelClient().adminDeleteUser(new AdminDeleteUserRequest().withUsername(user.getUsername()).withUserPoolId(userPoolId));
                    } catch (UserNotConfirmedException e) {
                        if (!retryConfirmSignUp) {
                            AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
                            adminConfirmSignUpRequest.withUsername(user.getUsername()).withUserPoolId(userPoolId);
                            getCognitoUserPoolLowLevelClient().adminConfirmSignUp(adminConfirmSignUpRequest);
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

        final CountDownLatch latch = new CountDownLatch(1);
        AWSMobileClient.getInstance().initialize(appContext, new Callback<UserStateDetails>() {
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

        final AWSConfiguration awsConfiguration = AWSMobileClient.getInstance().getConfiguration();

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
        auth.removeUserStateListener(listener);
        auth.listeners.clear();
        auth.signOut();
        auth.mStore.clear();

        appContext.getSharedPreferences(AWSMobileClient.SHARED_PREFERENCES_KEY,
                Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
        deleteAllEncryptionKeys();
    }

    // When the encryption keys are lost and retrieval of
    // tokens from persistent store fails, calling getTokens()
    // will throw an exception and the UserStateListener will
    // be triggered the userState as SIGNED_OUT. Followed by a
    // SignIn operation, getTokens() will retrieve
    // the tokens successfully and trigger the userState as
    // SIGNED_IN.
    @Test
    public void testGetTokens() throws Exception {
        signInAndVerifySignIn();

        final CountDownLatch stateNotificationLatch = new CountDownLatch(1);
        final AtomicReference<UserStateDetails> userState = new AtomicReference<UserStateDetails>();
        listener = new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                userState.set(details);
                stateNotificationLatch.countDown();
            }
        };
        auth.addUserStateListener(listener);

        deleteAllEncryptionKeys();

        initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);

        try {
            auth.getTokens();
        } catch (Exception ex) {
            assertEquals("getTokens does not support retrieving tokens while signed-out", ex.getMessage());
        }

        stateNotificationLatch.await(10, TimeUnit.SECONDS);
        assertEquals(UserState.SIGNED_OUT, userState.get().getUserState());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        Tokens tokens = auth.getTokens();
        verifyTokens(tokens);

        assertEquals(UserState.SIGNED_IN, userState.get().getUserState());
    }

    @Test
    public void testGetUserName() {
        signInAndVerifySignIn();
        assertNotNull(auth.getUsername());

        deleteAllEncryptionKeys();

        assertNull(auth.getUsername());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        assertNotNull(auth.getUsername());
    }

    @Test
    public void testGetUserAttributes() throws Exception {
        signInAndVerifySignIn();

        Map<String, String> userAttributes = auth.getUserAttributes();
        assertNotNull(userAttributes);
        assertEquals(getPackageConfigure().getString("email"),
                userAttributes.get("email"));

        deleteAllEncryptionKeys();

        initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);

        try {
            auth.getUserAttributes();
        } catch (Exception ex) {
            assertEquals("Operation requires a signed-in state",
                    ex.getMessage());
        }

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }


        userAttributes = auth.getUserAttributes();
        assertNotNull(userAttributes);
        assertEquals(getPackageConfigure().getString("email"),
                userAttributes.get("email"));
    }

    @Test
    public void testIsSignedIn() {
        signInAndVerifySignIn();

        assertTrue(auth.isSignedIn());
        deleteAllEncryptionKeys();

        initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        assertFalse(auth.isSignedIn());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        assertTrue(auth.isSignedIn());
    }

    @Test
    public void testGetCredentials() {
        signInAndVerifySignIn();

        AWSCredentials awsCredentialsBeforeEncryptionKeysAreLost = auth.getCredentials();
        assertNotNull(awsCredentialsBeforeEncryptionKeysAreLost);

        deleteAllEncryptionKeys();

        initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        AWSCredentials awsCredentialsAfterEncryptionKeysAreLost = auth.getCredentials();
        assertNotNull(awsCredentialsAfterEncryptionKeysAreLost);

        assertEquals(awsCredentialsBeforeEncryptionKeysAreLost.getAWSAccessKeyId(),
                awsCredentialsAfterEncryptionKeysAreLost.getAWSAccessKeyId());
        assertEquals(awsCredentialsBeforeEncryptionKeysAreLost.getAWSSecretKey(),
                awsCredentialsAfterEncryptionKeysAreLost.getAWSSecretKey());
    }

    @Test
    public void testGetIdentityId() {
        signInAndVerifySignIn();

        String identityId = auth.getIdentityId();
        assertNotNull(identityId);
        deleteAllEncryptionKeys();

        initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        assertNull(auth.getIdentityId());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        String identityIdAfterSecondSignIn = auth.getIdentityId();
        assertNotNull(identityIdAfterSecondSignIn);

        assertEquals(identityId, identityIdAfterSecondSignIn);
    }

    // -- Hosted UI based tests

    @Test
    public void testHostedUIObjectNotNullAfterInitialize() {
        auth = initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        assertNotNull(auth.hostedUI);
    }

    @Test
    public void testHostedUIObjectNotNullAfterSignOut() {
        auth = initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        auth.signOut();
        assertNotNull(auth.hostedUI);
    }

    @Test
    public void testHostedUIObjectNotNullAfterAppRestarted() {
        auth = initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        auth.signOut();
        mockRestartingApp(UserState.SIGNED_OUT);
        assertNotNull(auth.hostedUI);
    }

    @Test
    public void testHostedUIGetTokens() throws Exception {
        auth = initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        mockHostedUISignIn();
        Tokens tokens = auth.getTokens(false);
        assertNotNull(tokens);
    }

    @Test
    public void testHostedUIGetTokensAfterAppRestarted() throws Exception {
        auth = initializeAWSMobileClient(appContext, UserState.SIGNED_OUT);
        mockHostedUISignIn();
        mockRestartingApp(UserState.SIGNED_IN);
        Tokens tokens = auth.getTokens(false);
        assertNotNull(tokens);
    }

    private void signInAndVerifySignIn() {
        try {
            final CountDownLatch stateNotificationLatch = new CountDownLatch(1);
            final AtomicReference<UserStateDetails> userState = new AtomicReference<UserStateDetails>();
            listener = new UserStateListener() {
                @Override
                public void onUserStateChanged(UserStateDetails details) {
                    userState.set(details);
                    auth.removeUserStateListener(listener);
                    stateNotificationLatch.countDown();
                }
            };
            auth.addUserStateListener(listener);

            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());

            assertTrue("isSignedIn is true", auth.isSignedIn());

            assertEquals(username, auth.getUsername());

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

            // Check one attribute
            final Map<String, String> userAttributes = auth.getUserAttributes();
            assertEquals(getPackageConfigure().getString("email"), userAttributes.get("email"));
            stateNotificationLatch.await(5, TimeUnit.SECONDS);

            UserStateDetails userStateDetails = userState.get();
            assertEquals(userStateDetails.getUserState(), UserState.SIGNED_IN);
            Map<String, String> details = userStateDetails.getDetails();
            assertNotEquals(getPackageConfigure().getString("identity_id"), details.toString());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    // Note that most tests create valid JWT tokens with expiry dates in the past. However, because
    // we want to assert that HostedUI can get tokens, without making a network call to refresh a
    // session, we're going to mock up valid session data, and ensure we call `getTokens` with
    // `waitForSignIn = false`.
    private void mockHostedUISignIn() throws JSONException {
        AuthUserSession authUserSession = new AuthUserSession(
                new IdToken(getValidJWT(3600L)),
                new AccessToken(getValidJWT(3600L)),
                new RefreshToken(getValidJWT(360000L)));

        Context targetContext = InstrumentationRegistry.getTargetContext();

        AWSKeyValueStore storeForHostedUI = new AWSKeyValueStore(
                targetContext,
                "CognitoIdentityProviderCache",
                true);

        final Set<String> scopes = new HashSet<String>(Arrays.asList("profile", "openid", "email"));

        LocalDataManager.cacheSession(storeForHostedUI,
                targetContext,
                getPackageConfigure("cognitoauth").getString("AppClientId"),
                getPackageConfigure("cognitoauth").getString("Username"),
                authUserSession,
                scopes);

        // Set the AWSMobileClient metadata that is specific to HostedUI
        auth.mStore.set(FEDERATION_ENABLED_KEY, "true");
        auth.mStore.set(HOSTED_UI_KEY, "dummyJson");
        auth.mStore.set(SIGN_IN_MODE, SignInMode.HOSTED_UI.toString());
        auth.mStore.set(PROVIDER_KEY, auth.getLoginKey());
        auth.mStore.set(TOKEN_KEY, getValidJWT(3600L));
    }

    private void mockRestartingApp(UserState expectedUserState) {
        auth = null;
        auth = initializeAWSMobileClient(appContext, expectedUserState);
    }
}
