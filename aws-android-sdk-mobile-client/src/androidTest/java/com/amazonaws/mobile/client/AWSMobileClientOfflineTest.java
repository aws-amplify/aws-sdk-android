package com.amazonaws.mobile.client;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.test.InstrumentationRegistry;

import com.amazonaws.mobile.config.AWSConfiguration;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

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
public class AWSMobileClientOfflineTest extends AWSMobileClientTestBase {
    public static final String EMAIL = "somebody@email.com";
    public static final String BLURRED_EMAIL = "b***@a***.com";
    public static final String USERNAME = "somebody";
    public static final String PASSWORD = "1234Password!";
    public static final String IDENTITY_ID = "redacted";
    public static final String NEW_PASSWORD = "new1234Password!";
    public static final int THROTTLED_DELAY = 5000;

    Context appContext;
    AWSMobileClient auth;
    UserStateListener listener;

    public static void setWifi(final Context appContext, final boolean state) {
        WifiManager wifiManager = (WifiManager)appContext.getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(state);
    }

    @BeforeClass
    public static void setup() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        setWifi(appContext, false);
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

    @Test
    public void testSignInWaitOIDCOffline() throws Exception {
        final Queue<UserStateDetails> allChanges = new ConcurrentLinkedQueue<UserStateDetails>();

        setTokensDirectly(appContext, AWSMobileClient.getInstance().getLoginKey(), "fakeToken", "someIdentityId");
        listener = new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                allChanges.add(details);
            }
        };
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
