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
import com.amazonaws.mobile.client.results.ForgotPasswordResult;
import com.amazonaws.mobile.client.results.ForgotPasswordState;
import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.SignInState;
import com.amazonaws.mobile.client.results.SignUpResult;
import com.amazonaws.mobile.client.results.Token;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobile.client.results.UserCodeDeliveryDetails;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GetDetailsHandler;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.AdminConfirmSignUpRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AdminCreateUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AdminDeleteUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AdminGetDeviceRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AdminGetDeviceResult;
import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import com.amazonaws.services.cognitoidentityprovider.model.DeviceRememberedStatusType;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.services.cognitoidentityprovider.model.ListUsersRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ListUsersResult;
import com.amazonaws.services.cognitoidentityprovider.model.MessageActionType;
import com.amazonaws.services.cognitoidentityprovider.model.NotAuthorizedException;
import com.amazonaws.services.cognitoidentityprovider.model.ResourceNotFoundException;
import com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException;
import com.amazonaws.services.cognitoidentityprovider.model.UserType;
import com.amazonaws.services.cognitoidentityprovider.model.UsernameExistsException;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static com.amazonaws.mobile.client.AWSMobileClient.CHALLENGE_RESPONSE_NEW_PASSWORD_KEY;
import static com.amazonaws.mobile.client.AWSMobileClient.CHALLENGE_RESPONSE_USER_ATTRIBUTES_PREFIX_KEY;
import static com.amazonaws.mobile.client.UserState.SIGNED_IN;
import static com.amazonaws.mobile.client.results.SignInState.DONE;
import static com.amazonaws.mobile.client.results.SignInState.NEW_PASSWORD_REQUIRED;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Amazon Cognito UserPools and Amazon Cognito Identity Pools
 * were created with Amplify CLI 0.1.23 - Default configuration.
 */
public class AWSMobileClientTest extends AWSMobileClientTestBase {
    private static final String TAG = AWSMobileClientTest.class.getSimpleName();

    private static final String EMAIL = "success+user@simulator.amazonses.com";
    private static final String EMAIL_ADMIN_API_USER = "success+admin@simulator.amazonses.com";
    private static final String USERNAME = "somebody";
    private static final String USERNAME_ADMIN_API_USER = "somebody-temp";
    private static final String PASSWORD = "1234Password!";
    private static final String TEMP_PASSWORD = "Password1234!";
    private static String IDENTITY_ID;
    private static final String NEW_PASSWORD = "new1234Password!";
    private static final int THROTTLED_DELAY = 5000;

    static AmazonCognitoIdentityProvider userpoolLL;
    static CognitoUserPool userPool;

    static {
        try {
            IDENTITY_ID = getPackageConfigure().getString("identity_id");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Populated from awsconfiguration.json
    static Regions clientRegion = Regions.US_WEST_2;
    static String userPoolId;
    static String identityPoolId;
    static String clientId;
    static String clientSecret;

    Context appContext;
    AWSMobileClient auth;
    UserStateListener listener;
    String username;

    public static synchronized AmazonCognitoIdentityProvider getUserpoolLL() {
        if (userpoolLL == null) {
            userpoolLL = new AmazonCognitoIdentityProviderClient(credentials);
            userpoolLL.setRegion(Region.getRegion(clientRegion));
        }
        return userpoolLL;
    }

    public static void createUser(final AWSMobileClient auth,
                                  final String userpoolId,
                                  final String username,
                                  final String password,
                                  final String email) throws Exception {
        HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", email);
        auth.signUp(username, password, userAttributes,null);

        AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
        adminConfirmSignUpRequest.withUsername(username).withUserPoolId(userpoolId);
        getUserpoolLL().adminConfirmSignUp(adminConfirmSignUpRequest);
    }

    private static void createUserViaAdminAPI(final String userpoolId,
                                              final String username,
                                              final String email) {
        AdminCreateUserRequest request = new AdminCreateUserRequest()
                .withUsername(username)
                .withTemporaryPassword(TEMP_PASSWORD)
                .withUserPoolId(userpoolId)
                .withMessageAction(MessageActionType.SUPPRESS)
                .withForceAliasCreation(true)
                .withUserAttributes(
                        new AttributeType().withName("email").withValue(email),
                        new AttributeType().withName("email_verified").withValue("true")
                );
        getUserpoolLL().adminCreateUser(request);
    }

    public static void deleteAllUsers(final String userpoolId) {
        ListUsersResult listUsersResult;
        do {
            ListUsersRequest listUsersRequest = new ListUsersRequest()
                    .withUserPoolId(userpoolId)
                    .withLimit(60);
            listUsersResult = getUserpoolLL().listUsers(listUsersRequest);
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
                        getUserpoolLL().adminDeleteUser(new AdminDeleteUserRequest().withUsername(user.getUsername()).withUserPoolId(userpoolId));
                    } catch (UserNotConfirmedException e) {
                        if (!retryConfirmSignUp) {
                            AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
                            adminConfirmSignUpRequest.withUsername(user.getUsername()).withUserPoolId(userpoolId);
                            getUserpoolLL().adminConfirmSignUp(adminConfirmSignUpRequest);
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
        Context appContext = ApplicationProvider.getApplicationContext();

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
        clientId = userPoolConfig.getString("AppClientId");
        clientSecret = userPoolConfig.optString("AppClientSecret");

        JSONObject identityPoolConfig =
                awsConfiguration.optJsonObject("CredentialsProvider").getJSONObject(
                        "CognitoIdentity").getJSONObject("Default");
        assertNotNull(identityPoolConfig);
        identityPoolId = identityPoolConfig.getString("PoolId");

        userPool = new CognitoUserPool(appContext, userPoolId, clientId, clientSecret, clientRegion);

        deleteAllUsers(userPoolId);
        createUserViaAdminAPI(userPoolId, USERNAME_ADMIN_API_USER, EMAIL_ADMIN_API_USER);
    }

    @Before
    public void before() throws Exception {
        appContext = ApplicationProvider.getApplicationContext();
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

        appContext.getSharedPreferences(AWSMobileClient.SHARED_PREFERENCES_KEY,
                Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
        deleteAllEncryptionKeys();
    }

    @Test
    public void testAWSConfigurationForCognitoUserPool() throws Exception {
        // Context of the app under test.
        Context appContext = ApplicationProvider.getApplicationContext();

        final AWSConfiguration awsConfiguration = new AWSConfiguration(appContext);

        assertNotNull(awsConfiguration.optJsonObject("CognitoUserPool"));
        assertEquals("us-west-2", awsConfiguration.optJsonObject("CognitoUserPool").getString("Region"));

        assertEquals("com.amazonaws.mobile.client.test", appContext.getPackageName());
    }

    @Test
    public void testGetConfiguration() {
        final AWSConfiguration awsConfiguration = AWSMobileClient.getInstance().getConfiguration();

        assertNotNull(awsConfiguration.optJsonObject("CognitoUserPool"));
        try {
            assertEquals("us-west-2", awsConfiguration.optJsonObject("CognitoUserPool").getString("Region"));
        } catch (JSONException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test(expected = com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException.class)
    public void testSignUp() throws Exception {
        final String username = "testUser" + System.currentTimeMillis() + new Random().nextInt();
        assertNotEquals("generated usernames are the same", this.username, username);

        final HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", EMAIL);

        final SignUpResult signUpResult = auth.signUp(username, PASSWORD, userAttributes, null);
        // Check for non-null user sub in the SignUpResult
        String userSub = signUpResult.getUserSub();
        assertNotNull(userSub);
        // Validate that the userSub is a valid UUID
        assertEquals(36, userSub.length());
        assertEquals(5, userSub.split("-").length);
        assertEquals(8,  userSub.split("-")[0].length());
        assertEquals(4,  userSub.split("-")[1].length());
        assertEquals(4,  userSub.split("-")[2].length());
        assertEquals(4,  userSub.split("-")[3].length());
        assertEquals(12,  userSub.split("-")[4].length());

        final UserCodeDeliveryDetails details = signUpResult.getUserCodeDeliveryDetails();
        if (details != null) {
            assertEquals("s***@s***.com", details.getDestination());
            assertEquals("email", details.getAttributeName());
            assertEquals("EMAIL", details.getDeliveryMedium());
        }
        assertNotNull(signUpResult.getUserSub());
        final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
        assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());
    }

    /**
     * When the user signs in with temporary credentials, they should be prompted to set a new password.
     * To do this, they can supply a map of attributes to {@link confirmSignIn(....)},
     * including the challenge response (key = NEW_PASSWORD), as well as
     * user attributes (key = userAttributes.<attribute name>) to be
     * set as part of the update. The ability to pass additional attributes is
     * needed so the caller can pass in any required attributes
     * other than email and/or mobile.
     */
    @Test
    public void testSignInForceChangePassword() throws Exception{
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
        //Sign-in using the temporary password
        final SignInResult signInResult = auth.signIn(USERNAME_ADMIN_API_USER, TEMP_PASSWORD, null);
        //Assert we're receiving challenge to change password
        assertEquals(NEW_PASSWORD_REQUIRED, signInResult.getSignInState());

        HashMap<String, String> inputAttributes = new HashMap<String, String>();
        //Add attribute to set new password
        inputAttributes.put(CHALLENGE_RESPONSE_NEW_PASSWORD_KEY, PASSWORD);
        //Set some extra attributes
        inputAttributes.put(CHALLENGE_RESPONSE_USER_ATTRIBUTES_PREFIX_KEY + "name", "dummy-name");
        inputAttributes.put(CHALLENGE_RESPONSE_USER_ATTRIBUTES_PREFIX_KEY + "nickname", "dummy-nickname");

        //Confirm sign-in using the challenge response + attributes
        SignInResult signInResultAfterConfirm = auth.confirmSignIn(inputAttributes);
        assertEquals(DONE, signInResultAfterConfirm.getSignInState());

        //Get the user attributes and assert the extra attributes were set
        Map<String, String> userAttributes = auth.getUserAttributes();
        assertEquals("dummy-name", userAttributes.get("name"));
        assertEquals("dummy-nickname", userAttributes.get("nickname"));
    }

    @Test
    public void testSignIn() throws Exception {
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
        assertEquals(userStateDetails.getUserState(), SIGNED_IN);
        Map<String, String> details = userStateDetails.getDetails();
        assertNotEquals(getPackageConfigure().getString("identity_id"), details.toString());
    }

    @Test
    public void testRevokeTokenWithSignedInUser() throws Exception {
        auth.signIn(username, PASSWORD, null);
        assertTrue("isSignedIn is true", auth.isSignedIn());

        final AtomicReference<Boolean> tokenRevoked = new AtomicReference<Boolean>(false);
        final CountDownLatch revokeTokenLatch = new CountDownLatch(2);
        final CognitoUser user = userPool.getCurrentUser();
        user.getSession(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                revokeTokenLatch.countDown();
            }

            @Override
            public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId) {

            }

            @Override
            public void getMFACode(MultiFactorAuthenticationContinuation continuation) {

            }

            @Override
            public void authenticationChallenge(ChallengeContinuation continuation) {

            }

            @Override
            public void onFailure(Exception exception) {
                exception.printStackTrace();
                fail("Sign in failed.");
            }
        });

        user.getDetails(new GetDetailsHandler() {
            @Override
            public void onSuccess(CognitoUserDetails cognitoUserDetails) {
                revokeTokenLatch.countDown();
            }

            @Override
            public void onFailure(Exception exception) {
                exception.printStackTrace();
                fail("Get user details failed.");
            }
        });

        try {
            user.revokeTokens();
            tokenRevoked.set(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        revokeTokenLatch.await(5, TimeUnit.SECONDS);
        assertTrue(tokenRevoked.get());

        user.getDetails(new GetDetailsHandler() {
            @Override
            public void onSuccess(CognitoUserDetails cognitoUserDetails) {
                fail("Request to get user details should fail with NotAuthorizedException after token is revoked.");
            }

            @Override
            public void onFailure(Exception exception) {
                assertTrue(exception instanceof NotAuthorizedException);
            }
        });
    }

    @Test
    public void testRevokeTokenWithSignedOutUser() throws Exception {
        auth.signIn(username, PASSWORD, null);
        assertTrue("isSignedIn is true", auth.isSignedIn());

        final CountDownLatch revokeTokenLatch = new CountDownLatch(1);
        final CognitoUser user = userPool.getCurrentUser();
        user.getSession(new AuthenticationHandler() {
            @Override
            public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                revokeTokenLatch.countDown();
            }

            @Override
            public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId) {

            }

            @Override
            public void getMFACode(MultiFactorAuthenticationContinuation continuation) {

            }

            @Override
            public void authenticationChallenge(ChallengeContinuation continuation) {

            }

            @Override
            public void onFailure(Exception exception) {
                exception.printStackTrace();
                fail("Sign in failed.");
            }
        });
        revokeTokenLatch.await(5, TimeUnit.SECONDS);

        auth.signOut();
        assertFalse("isSignedIn is false", auth.isSignedIn());

        try {
            user.revokeTokens();
        } catch (Exception e) {
            assertTrue(e instanceof InvalidParameterException);
        }
    }

    @Test
    public void testIdentityId() throws Exception {
        try {
            createUser(AWSMobileClient.getInstance(), userPoolId, USERNAME, PASSWORD, EMAIL);
            fail("The user should already exist in the userpool. Otherwise this test cannot determine whether the identity id was changed.");
        } catch (UsernameExistsException e) {
            // If the person exists, this is expected.
        }

        auth.signIn(USERNAME, PASSWORD, null);
        // Populate the identity id
        auth.getCredentials();
        assertEquals("Identity id should not change between SDK releases", IDENTITY_ID, auth.getIdentityId());
    }

    @Test
    public void testSignInWaitFederated() throws Exception {
        final AtomicReference<Boolean> hasWaited = new AtomicReference<Boolean>();
        hasWaited.set(false);
        setTokensDirectly(appContext, "fakeProvider", "fakeToken", "someIdentityId");
        listener = new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                switch (details.getUserState()) {
                    case SIGNED_OUT_FEDERATED_TOKENS_INVALID:
                        try {
                            hasWaited.set(true);
                            auth.signIn(getPackageConfigure().getString("username"), PASSWORD, null);
                        } catch (Exception e) {
                            e.printStackTrace();
                            fail("Sign-in failed, but not expected.");
                        }
                        break;
                }
            }
        };
        auth.addUserStateListener(listener);

        AWSCredentials credentials = auth.getCredentials();
        assertNotNull(credentials);
        assertNotNull(credentials.getAWSAccessKeyId());
        assertNotNull(credentials.getAWSSecretKey());
        assertTrue("Should have waited, but didn't", hasWaited.get());
    }

    @Test
    public void testSignInWaitOIDC() throws Exception {
        final AtomicReference<Boolean> hasWaited = new AtomicReference<Boolean>();
        hasWaited.set(false);
       // writeUserPoolsTokens(appContext, auth.getConfiguration().optJsonObject("CognitoUserPool").getString("AppClientId"), USERNAME, 3600L);
        setTokensDirectly(appContext, AWSMobileClient.getInstance().getLoginKey(), "fakeToken", "someIdentityId");
        listener = new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                switch (details.getUserState()) {
                    case SIGNED_OUT_USER_POOLS_TOKENS_INVALID:
                        try {
                            if (hasWaited.get()) {
                                fail("Multiple calls to state change");
                            }
                            hasWaited.set(true);
                            auth.signIn(username, PASSWORD, null);
                        } catch (Exception e) {
                            e.printStackTrace();
                            fail("Sign-in failed, but not expected.");
                        }
                        break;
                    default:
                        if (!hasWaited.get()) {
                            fail("Sign-in before waiting");
                        }
                }
            }
        };
        auth.addUserStateListener(listener);
        assertTrue("User is online and tokens are invalid", auth.isSignedIn());

        auth.getTokens();
        assertTrue("Should have waited, but didn't", hasWaited.get());
    }

    @Test
    public void testSignOut() throws Exception {
        final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
        assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());

        AWSCredentials credentials1 = auth.getCredentials();
        auth.signOut();

        // Test identity id has been cleared
        assertNull(auth.getIdentityId());

        // Test username has been cleared
        assertNull(auth.getUsername());

        // Check credentials need to be fetched
        try {
            AWSCredentials credentials = auth.getCredentials();
            fail("Unauthenticated access is not supported for this identity pool in this test\n" + credentials.getAWSAccessKeyId() + "\n" + credentials1.getAWSAccessKeyId());
        } catch (RuntimeException e) {
            assertTrue(e.getCause() instanceof com.amazonaws.services.cognitoidentity.model.NotAuthorizedException);
        }

        // Check tokens are gone
        try {
            assertNull(auth.getTokens());
        } catch (Exception e) {
            assertEquals("getTokens does not support retrieving tokens while signed-out", e.getMessage());
        }
    }

    @Test
    public void testSignedOutWithRevokeToken() throws Exception {
        auth.signIn(username, PASSWORD, null);
        assertTrue("isSignedIn is true", auth.isSignedIn());

        String tokenWithOriginJTI = "eyJraWQiOiIwTmxhQUhzbmtwQW5zbHBzUFhHWkJKcVJoR3E5WTkwckwweXpaWUV1OTJZPSIsImFsZyI6IlJTMjU2In0.eyJvcmlnaW5fanRpIjoiMzM2MWFkZDMtMDIwNS00NTY1LTk0MjQtMDQ3YWQ2N2Y0MjhmZWwifQ.a";
        setAccessToken(appContext, clientId, username, tokenWithOriginJTI);
        auth.signOut();
        assertFalse("isSignedIn is false", auth.isSignedIn());
    }

    @Test
    public void testSignedOutWithoutRevokeToken() throws Exception {
        auth.signIn(username, PASSWORD, null);
        assertTrue("isSignedIn is true", auth.isSignedIn());

        String tokenWithSub = "eyJraWQiOiJzU01EYmZyQ21pb3FrbEVRZFprNXl6UmszekxSTlo4aGlGMnlxdVFZbVM0PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI3YTQyNTFmMS04MmEyLTQxNzgtOWZhOS1mNmE3MTc1RCJ9.a";
        setAccessToken(appContext, clientId, username, tokenWithSub);
        auth.signOut();
        assertFalse("isSignedIn is false", auth.isSignedIn());
    }

    @Test(expected = com.amazonaws.services.cognitoidentityprovider.model.NotAuthorizedException.class)
    public void testSignInWrongPassword() throws Exception {
        AWSMobileClient.getInstance().signIn(getPackageConfigure().getString("username"), "wrong", null);
    }

    @Test
    public void testFederatedSignInFail() {
        try {
            auth.federatedSignIn(IdentityProvider.GOOGLE.toString(), "fakeToken");
        } catch (Exception e) {
            assertEquals("Error in federating the token.", e.getMessage());
        }
    }

    @Ignore("Changing a password tends to have a rate limit that exceeds test timeout")
    @Test
    public void testChangePassword() throws Exception {
        Thread.sleep(THROTTLED_DELAY);
        auth.changePassword(PASSWORD, NEW_PASSWORD);
        auth.signOut();
        Thread.sleep(THROTTLED_DELAY);
        auth.signIn("bimin", NEW_PASSWORD, null);
        Thread.sleep(THROTTLED_DELAY);
        auth.changePassword(NEW_PASSWORD, PASSWORD);
        auth.signOut();
        Thread.sleep(THROTTLED_DELAY);
        auth.signIn("bimin", PASSWORD, null);
    }

    @Test
    public void testAddRemoveListeners() throws Exception {
        final AtomicReference<Boolean> triggered = new AtomicReference<Boolean>();
        triggered.set(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        UserStateListener listenerA = new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                triggered.set(true);
                countDownLatch.countDown();
            }
        };
        UserStateListener listenerB = new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {

            }
        };
        auth.addUserStateListener(listenerA);
        auth.addUserStateListener(listenerB);
        assertEquals(2, auth.listeners.size());
        auth.removeUserStateListener(listenerA);
        auth.signIn(username, PASSWORD, null);
        countDownLatch.await(5, TimeUnit.SECONDS);
        assertFalse(triggered.get());
    }

    @Ignore("Developer authentication is an undocumented edge case so ignoring this for now. Needs resource setup.")
    @Test
    public void testFederatedSignInWithDeveloperAuthenticatedIdentities() throws Exception {
        AmazonCognitoIdentity identityClient = new AmazonCognitoIdentityClient(credentials);
        identityClient.setRegion(Region.getRegion("us-west-2"));

        GetOpenIdTokenForDeveloperIdentityRequest request =
                new GetOpenIdTokenForDeveloperIdentityRequest();
        request.setIdentityPoolId(identityPoolId);

        HashMap<String,String> logins = new HashMap<String, String>();
        logins.put("foo.bar","john.doe");
        request.setLogins(logins);

        GetOpenIdTokenForDeveloperIdentityResult response =
                identityClient.getOpenIdTokenForDeveloperIdentity(request);

        final String identityId = response.getIdentityId();
        final String token = response.getToken();

        FederatedSignInOptions options =
                FederatedSignInOptions.builder().cognitoIdentityId(identityId).build();

        UserStateDetails userStateDetails =
                auth.federatedSignIn(IdentityProvider.DEVELOPER.toString(), token, options);

        assertEquals(SIGNED_IN, userStateDetails.getUserState());

        assertNotNull("Credentials from federated sign-in should not be null", auth.getCredentials());
    }

    @Ignore("This test case may cause crash on some emulators")
    @Test
    public void testGetTokensStress() throws Exception {
        final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
        assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());

        auth.addUserStateListener(new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                Log.d(TAG, "onUserStateChanged: " + details.getUserState());
            }
        });

        ArrayList<Thread> threads = new ArrayList<Thread>(10);
        final AtomicReference<Boolean> stop = new AtomicReference<Boolean>(false);
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    String lastMessage = "";
                    while (!stop.get()) {
                        try {
                            auth.getTokens();
                        } catch (Exception e) {
                            if (!lastMessage.equals(e.getMessage())) {
                                lastMessage = e.getMessage();

                                if (!lastMessage.equals("No cached session.")
                                        && !lastMessage.equals("getTokens does not support retrieving tokens while signed-out")) {
                                    fail("Unexpected error message: " + lastMessage);
                                }
                            }
                        }
                    }
                }
            });
            thread.start();
            threads.add(thread);
        }

        Thread.sleep(2 * 1000);
        Log.d(TAG, "testStress: signOut");
        auth.signOut();
        Thread.sleep(1 * 1000);
        stop.set(true);
        for (Thread t : threads) {
            t.join();
        }
    }

    @Test
    public void testGetCredentialsStress() throws Exception {
        final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
        assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());

        auth.addUserStateListener(new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                Log.d(TAG, "onUserStateChanged: " + details.getUserState());
            }
        });

        ArrayList<Thread> threads = new ArrayList<Thread>(10);
        final AtomicReference<Boolean> stop = new AtomicReference<Boolean>(false);
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    String lastMessage = "";
                    while (!stop.get()) {
                        try {
                            auth.getCredentials();
                        } catch (Exception e) {
                            if (!lastMessage.equals(e.getMessage())) {
                                lastMessage = e.getMessage();

                                if (!lastMessage.equals("Failed to get credentials from Cognito Identity")) {
                                    fail("Unexpected error message: " + lastMessage);
                                }
                            }
                        }
                    }
                }
            });
            thread.start();
            threads.add(thread);
        }

        Thread.sleep(2 * 1000);
        Log.d(TAG, "testStress: signOut");
        auth.signOut();
        Thread.sleep(1 * 1000);
        stop.set(true);
        for (Thread t : threads) {
            t.join();
        }
    }

    @Test
    public void testRememberDevice() throws Exception {
        auth.signIn(username, PASSWORD, null);

        for (int i = 0; i < 2; ++i) {
            assertEquals(0, auth.getDeviceOperations().list().getDevices().size());
            auth.getDeviceOperations().updateStatus(true);
            final String deviceKey = auth.getDeviceOperations().get().getDeviceKey();
            assertEquals(1, auth.getDeviceOperations().list().getDevices().size());

            checkDeviceAttribute(deviceKey, auth.getUsername(), "dev:device_remembered_status",
                    DeviceRememberedStatusType.Remembered.toString());

            auth.getDeviceOperations().updateStatus(false);

            try {
                auth.getDeviceOperations().get();
                fail("Expected the device not the be found because it is not remembered");
            } catch (ResourceNotFoundException e) {
            }

            checkDeviceAttribute(deviceKey, auth.getUsername(), "dev:device_remembered_status",
                    DeviceRememberedStatusType.Not_remembered.toString());
        }
    }

    @Test
    public void testForgetDevice() throws Exception {
        auth.signIn(username, PASSWORD, null);

        assertEquals(0, auth.getDeviceOperations().list().getDevices().size());
        auth.getDeviceOperations().updateStatus(true);
        final String deviceKey = auth.getDeviceOperations().get().getDeviceKey();
        assertEquals(1, auth.getDeviceOperations().list().getDevices().size());

        auth.getDeviceOperations().forget();

        assertEquals(0, auth.getDeviceOperations().list().getDevices().size());
        try {
            auth.getDeviceOperations().updateStatus(true);
            fail("Expected ResourceNotFoundException: Device does not exist.");
        } catch (ResourceNotFoundException e) { }

        auth.signOut();

        auth.signIn(username, PASSWORD, null);
        auth.getDeviceOperations().updateStatus(true);
        assertEquals(1, auth.getDeviceOperations().list().getDevices().size());
    }

    /**
     * Utility function that calls admin API to check the certain device attribute values.
     *
     * @param deviceKey the device that holds the attributes to be checked
     * @param username the user that has the device
     * @param attributeName the name of the attribute that will be checked
     * @param attributeValue the value the named attribute should be set to when checked
     */
    private void checkDeviceAttribute(final String deviceKey,
                                      final String username,
                                      final String attributeName,
                                      final String attributeValue) {
        final AdminGetDeviceRequest adminGetDeviceRequest = new AdminGetDeviceRequest()
                .withDeviceKey(deviceKey)
                .withUsername(username)
                .withUserPoolId(userPoolId);
        final AdminGetDeviceResult adminGetDeviceResult =
                getUserpoolLL().adminGetDevice(adminGetDeviceRequest);

        final List<AttributeType> deviceAttributes =
                adminGetDeviceResult.getDevice().getDeviceAttributes();
        for (AttributeType attributeType : deviceAttributes) {
            if (attributeType.getName().equals(attributeName)) {
                assertEquals(attributeValue, attributeType.getValue());
                return;
            }
        }
    }

    @Test
    public void testGlobalSignOut() throws Exception {
        auth.signIn(username, PASSWORD, null);
        auth.getUserAttributes();

        final String accessTokenA = auth.getTokens().getAccessToken().getTokenString();
        final String idTokenA = auth.getTokens().getIdToken().getTokenString();
        final String refreshTokenA = auth.getTokens().getRefreshToken().getTokenString();
        final String clientId = auth.getConfiguration().optJsonObject("CognitoUserPool").getString("AppClientId");

        auth.signOut();

        writeUserPoolsTokens(appContext, clientId, username, accessTokenA, idTokenA, refreshTokenA);
        auth.mStore.set(AWSMobileClient.PROVIDER_KEY, auth.userpoolsLoginKey);
        auth.mStore.set(AWSMobileClient.TOKEN_KEY, accessTokenA);

        auth.getUserAttributes();

        auth.signOut(SignOutOptions.builder().signOutGlobally(true).build());

        writeUserPoolsTokens(appContext, clientId, username, accessTokenA, idTokenA, refreshTokenA);
        auth.mStore.set(AWSMobileClient.PROVIDER_KEY, auth.userpoolsLoginKey);
        auth.mStore.set(AWSMobileClient.TOKEN_KEY, accessTokenA);

        try {
            auth.getUserAttributes();
            fail("Global sign-out should make the access token invalid");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testForgotPassword() throws Exception {
        // USERNAME user is a confirmed account with a confirmed email
        final ForgotPasswordResult forgotPasswordResult = auth.forgotPassword(USERNAME);
        assertEquals(ForgotPasswordState.CONFIRMATION_CODE, forgotPasswordResult.getState());
    }

    @Test(expected = InvalidParameterException.class)
    public void testForgotPasswordWithNewUser() throws Exception {
        // username user is a confirmed account without a confirmed email or phone
        final ForgotPasswordResult forgotPasswordResult = auth.forgotPassword(username);
        assertEquals(ForgotPasswordState.CONFIRMATION_CODE, forgotPasswordResult.getState());
    }

    @Test
    public void testAWSMobileClientInitialize() throws Exception {
        auth.signIn(username, PASSWORD, null);

        // Expect the UserState to be SIGNED_IN
        final CountDownLatch waitForAWSMobileClientToBeInitialized = new CountDownLatch(1);
        AWSMobileClient.getInstance().initialize(appContext, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                assertEquals(SIGNED_IN,
                        result.getUserState());
                waitForAWSMobileClientToBeInitialized.countDown();
            }

            @Override
            public void onError(Exception e) {
                fail(e.getMessage());
                waitForAWSMobileClientToBeInitialized.countDown();
            }
        });

        try {
            waitForAWSMobileClientToBeInitialized.await(30, TimeUnit.SECONDS);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        verifyTokens(auth.getTokens());
    }
}
