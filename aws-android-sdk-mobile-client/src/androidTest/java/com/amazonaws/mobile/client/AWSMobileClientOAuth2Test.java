package com.amazonaws.mobile.client;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.util.Log;

import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.regions.Regions;

import org.json.JSONException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class AWSMobileClientOAuth2Test extends AWSMobileClientTestBase {

    public static final String TAG = AWSMobileClientUITest.class.getSimpleName();

    @Rule
    public ActivityTestRule<AWSMobileClientUITestActivity> mActivityTestRule =
            new ActivityTestRule<AWSMobileClientUITestActivity>(AWSMobileClientUITestActivity.class);

    private static Context appContext;
    private static Regions clientRegion;
    private static String userPoolId;
    private static String identityPoolId;
    private static AWSMobileClient auth;

    @BeforeClass
    public static void beforeClass() throws Exception {
        appContext = InstrumentationRegistry.getTargetContext();
        final CountDownLatch latch = new CountDownLatch(1);
        final AWSConfiguration awsConfiguration = new AWSConfiguration(appContext);
        awsConfiguration.setConfiguration("Auth0");
        assert awsConfiguration.optJsonObject("Auth").getJSONObject("OAuth").has("AppClientId");
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

    @Before
    public void before() throws Exception {
        auth.signOut();
    }

    @Ignore("Full automation of this scenario is not supported, manual intervention is needed")
    @Test
    public void testShowSignInSignOutAuth0() throws InterruptedException, JSONException {
        AWSMobileClientUITestActivity.intents.clear();
        assert auth.getConfiguration().optJsonObject("Auth").getJSONObject("OAuth").has("AppClientId");
//        assertNull(auth.getConfiguration().optJsonObject("CognitoUserPool"));
        final CountDownLatch signInLatch = new CountDownLatch(1);
        final HostedUIOptions hostedUIOptions = HostedUIOptions.builder()
                .federationProviderName("minbi.auth0.com")
                .build();
        final SignInUIOptions signInUIOptions = SignInUIOptions.builder()
                .hostedUIOptions(hostedUIOptions)
                .build();
        assertNotNull(auth.mOAuth2Client);
        auth.showSignIn(mActivityTestRule.getActivity(), signInUIOptions, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                Log.d(TAG, "onResult: testShowSignInAuth0");
                assertEquals(UserState.SIGNED_IN, auth.getUserStateDetails(false).getUserState());
                signInLatch.countDown();
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "onError: ", e);
//                fail("Hosted UI sign-in failed");
            }
        });

        /// The UI automation code is not finalized, do the steps manually, the code will wait for
        /// success indicators

//        final UiDevice uiDevice =
//                UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
//        final UiObject2 acceptButton = waitForObject(By.text("Accept & continue"), false);
//        if (acceptButton != null) {
//            acceptButton.click();
//        }
//        final UiObject2 noThanksButton = waitForObject(By.text("No Thanks"), false);
//        if (noThanksButton != null) {
//            noThanksButton.click();
//        }
        while (AWSMobileClientUITestActivity.intents.size() == 0) {
            Log.e(TAG, "testShowSignInAuth0: Waiting on intent");
            Thread.sleep(500);
        }
        Log.e(TAG, "testShowSignInAuth0: intent != 0");
        auth.handleAuthResponse(AWSMobileClientUITestActivity.intents.get(0));
        signInLatch.await();

        assertNotNull(auth.getCredentials());
        assertNotNull(auth.getIdentityId());

        /// Sign-out of same session

        AWSMobileClientUITestActivity.intents.clear();
        final CountDownLatch latch = new CountDownLatch(1);
        auth.signOut(SignOutOptions.builder().invalidateTokens(true).build(), new Callback<Void>() {
            @Override
            public void onResult(Void result) {
                Log.d(TAG, "onResult: ");
                latch.countDown();
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "onError: ", e);
                latch.countDown();
            }
        });
        while (AWSMobileClientUITestActivity.intents.size() == 0) {
            Log.e(TAG, "testShowSignInAuth0: Waiting on intent");
            Thread.sleep(500);
        }
        Log.e(TAG, "testShowSignInAuth0: intent != 0");
        auth.handleAuthResponse(AWSMobileClientUITestActivity.intents.get(0));
        latch.await();
        assertEquals(UserState.SIGNED_OUT, auth.currentUserState().getUserState());
        Log.e(TAG, "before: Finished sign-out and other before activities");
    }

    private UiObject2 waitForObject(BySelector selector, boolean failIfNotFound) throws InterruptedException {
        UiObject2 object = null;
        int timeout = 3 * 1000;
        int delay = 100;
        long time = System.currentTimeMillis();
        while (object == null) {
            object = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).findObject(selector);
            Thread.sleep(delay);
            if (System.currentTimeMillis() - timeout > time) {
                if (failIfNotFound) {
                    fail("Wait for object failed");
                }
                return null;
            }
        }
        return object;
    }

}
