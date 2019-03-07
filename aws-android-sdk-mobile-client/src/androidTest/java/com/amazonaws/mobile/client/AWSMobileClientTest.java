package com.amazonaws.mobile.client;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.SignInState;
import com.amazonaws.mobile.client.results.SignUpResult;
import com.amazonaws.mobile.client.results.Token;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobile.client.results.UserCodeDeliveryDetails;
import com.amazonaws.mobile.config.AWSConfiguration;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Userpool and identity pool were create with Amplify CLI 0.1.23 Default configuration
 */
@RunWith(AndroidJUnit4.class)
public class AWSMobileClientTest extends AWSMobileClientTestBase {
    private static final String TAG = AWSMobileClientTest.class.getSimpleName();

    public static final String BLURRED_EMAIL = "r***@a***.com";
    public static final String PASSWORD = "Test@123";
    public static final String NEW_PASSWORD = "Test@123";
    public static final int THROTTLED_DELAY = 5000;

    Context appContext;
    AWSMobileClient auth;
    UserStateListener listener;

    @BeforeClass
    public static void setup() throws Exception {
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

        assertNotNull(awsConfiguration.optJsonObject("CognitoUserPool"));
        try {
            assertEquals("us-east-1", awsConfiguration.optJsonObject("CognitoUserPool").getString("Region"));
        } catch (JSONException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Before
    public void cleanUp() {
        appContext = InstrumentationRegistry.getTargetContext();
        auth = AWSMobileClient.getInstance();
        auth.signOut();
    }

    @After
    public void cleanAfter() {
        auth.removeUserStateListener(listener);
        auth.listeners.clear();
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        final AWSConfiguration awsConfiguration = new AWSConfiguration(appContext);

        assertNotNull(awsConfiguration.optJsonObject("CognitoUserPool"));
        assertEquals("us-east-1", awsConfiguration.optJsonObject("CognitoUserPool").getString("Region"));

        assertEquals("com.amazonaws.mobile.client.test", appContext.getPackageName());
    }

    @Test
    public void testGetConfiguration() throws JSONException {
        final AWSConfiguration awsConfiguration = AWSMobileClient.getInstance().getConfiguration();

        assertNotNull(awsConfiguration.optJsonObject("CognitoUserPool"));
        try {
            assertEquals("us-east-1", awsConfiguration.optJsonObject("CognitoUserPool").getString("Region"));
        } catch (JSONException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test(expected = com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException.class)
    public void testSignUp() throws Exception {
        final HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", getPackageConfigure().getString("email"));
        final String username = getPackageConfigure().getString("username") + System.currentTimeMillis();
        final SignUpResult signUpResult = auth.signUp(username, PASSWORD, userAttributes, null);
        if (signUpResult.getConfirmationState()) {
            // Done
        } else {
            final UserCodeDeliveryDetails details = signUpResult.getUserCodeDeliveryDetails();
            assertEquals(BLURRED_EMAIL, details.getDestination());
            assertEquals("email", details.getAttributeName());
            assertEquals("EMAIL", details.getDeliveryMedium());
        }
        final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
        if (signInResult.getSignInState() == SignInState.DONE) {
            // Done
        } else {
            fail("Cannot support MFA in tests");
        }

        // Cleanup user, however needs admin action to delete
//        final CognitoUserPool userPool = new CognitoUserPool(appContext, new AWSConfiguration(appContext));
//        userPool.getUser(username).deleteUser(...);
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

        final SignInResult signInResult = auth.signIn(getPackageConfigure().getString("username"), PASSWORD, null);
        if (signInResult.getSignInState() == SignInState.DONE) {
            // Done
        } else {
            fail("Cannot support MFA in tests");
        }

        assertTrue("isSignedIn is true", auth.isSignedIn());

        assertEquals(getPackageConfigure().getString("username"), auth.getUsername());

        // Test identity id hasn't changed
        assertEquals(getPackageConfigure().getString("identity_id"), auth.getIdentityId());

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
    }

    @Ignore
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

    @Ignore
    public void testSignInWaitOIDC() throws Exception {
        final AtomicReference<Boolean> hasWaited = new AtomicReference<Boolean>();
        hasWaited.set(false);
       // writeUserpoolsTokens(appContext, auth.getConfiguration().optJsonObject("CognitoUserPool").getString("AppClientId"), USERNAME, 3600L);
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
                            auth.signIn(getPackageConfigure().getString("username"), PASSWORD, null);
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
        final SignInResult signInResult = auth.signIn(getPackageConfigure().getString("username"), PASSWORD, null);
        if (signInResult.getSignInState() == SignInState.DONE) {
            // Done
        } else {
            fail("Cannot support MFA in tests");
        }

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

    @Test(expected = com.amazonaws.services.cognitoidentityprovider.model.NotAuthorizedException.class)
    public void testSignInWrongPassword() throws Exception {
        AWSMobileClient.getInstance().signIn(getPackageConfigure().getString("username"), "wrong", null);
    }

    @Test
    public void testFederate() {

    }

    // Changing a password tends to have a rate limit that exceeds test timeout
//    @Test
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
        auth.signIn(getPackageConfigure().getString("username"), PASSWORD, null);
        countDownLatch.await(5, TimeUnit.SECONDS);
        assertFalse(triggered.get());
    }
    @Ignore("This test case may cause crash on some emulators")
    @Test
    public void testGetTokensStress() throws Exception {
        final SignInResult signInResult = auth.signIn(getPackageConfigure().getString("username"), PASSWORD, null);
        if (signInResult.getSignInState() == SignInState.DONE) {
            // Done
        } else {
            fail("Cannot support MFA in tests");
        }
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
        final SignInResult signInResult = auth.signIn(getPackageConfigure().getString("username"), PASSWORD, null);
        if (signInResult.getSignInState() == SignInState.DONE) {
            // Done
        } else {
            fail("Cannot support MFA in tests");
        }
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

}
