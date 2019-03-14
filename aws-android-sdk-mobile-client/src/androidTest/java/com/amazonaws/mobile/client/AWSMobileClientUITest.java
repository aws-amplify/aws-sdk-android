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

import org.json.JSONObject;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withParentIndex;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.amazonaws.mobile.client.AWSMobileClientTest.deleteAllUsers;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AWSMobileClientUITest extends AWSMobileClientTestBase {

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
        auth = AWSMobileClient.getInstance();

        final AWSConfiguration awsConfiguration = auth.getConfiguration();

        JSONObject userPoolConfig = awsConfiguration.optJsonObject("CognitoUserPool");
        assertNotNull(userPoolConfig);
        clientRegion = Regions.fromName(userPoolConfig.getString("Region"));
        userPoolId = userPoolConfig.getString("PoolId");

        JSONObject identityPoolConfig =
                awsConfiguration.optJsonObject("CredentialsProvider").getJSONObject(
                        "CognitoIdentity").getJSONObject("Default");
        assertNotNull(identityPoolConfig);
        identityPoolId = identityPoolConfig.getString("PoolId");

        deleteAllUsers(userPoolId);
    }

    @Before
    public void before() throws Exception {
        auth.signOut();
    }

    @Test
    public void testShowSignInDropInUI() throws Exception {
        final CountDownLatch signInLatch = new CountDownLatch(1);
        final SignInUIOptions signInUIOptions = SignInUIOptions.builder().build();
        auth.showSignIn(mActivityTestRule.getActivity(), signInUIOptions, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                Log.d(TAG, "onResult: ");
                assertEquals(UserState.SIGNED_IN, auth.getUserStateDetails(false).getUserState());
                signInLatch.countDown();
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "onError: ", e);
                fail("Drop-in UI sign-in failed");
            }
        });
        Thread.sleep(1000);
        onView(allOf(withClassName(endsWith("EditText")), withText(is("")), withParentIndex(1))).perform(replaceText("somebody"));
        onView(allOf(withClassName(endsWith("EditText")), withText(is("")), withParentIndex(0))).perform(replaceText("1234Password!"));
        onView(allOf(withClassName(endsWith("Button")))).perform(click());
        signInLatch.await();
        assertEquals(UserState.SIGNED_IN, auth.getUserStateDetails(false).getUserState());
        assertNotNull(auth.getTokens().getAccessToken());
    }

    @Ignore("Full automation of this scenario is not supported, manual intervention is needed")
    @Test
    public void testShowSignInHostedUIWithUserpools() throws Exception {
        auth.signOut();
        final CountDownLatch signInLatch = new CountDownLatch(1);
        final HostedUIOptions hostedUIOptions = HostedUIOptions.builder()
                .build();
        final SignInUIOptions signInUIOptions = SignInUIOptions.builder()
                .hostedUIOptions(hostedUIOptions)
                .build();
        auth.showSignIn(mActivityTestRule.getActivity(), signInUIOptions, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                Log.d(TAG, "onResult: testShowSignInHostedUIWithUserpools");
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
//        try {
//            uiDevice.findObjects(By.clazz("android.widget.EditText")).get(0).setText("somebody");
//            uiDevice.findObjects(By.clazz("android.widget.EditText")).get(1).setText("1234Password!");
//            uiDevice.findObject(By.text("Sign in")).click();
//        } catch (Exception e) {
//            Log.e(TAG, "testShowSignInHostedUIWithUserpools: the user may already be signed-in in the browser", e);
//        }
        while (AWSMobileClientUITestActivity.intents.size() == 0) {
            Log.e(TAG, "testShowSignInAuth0: Waiting on intent");
            Thread.sleep(50);
        }
        Log.e(TAG, "testShowSignInAuth0: intent != 0");
        auth.handleAuthResponse(AWSMobileClientUITestActivity.intents.get(0));
        signInLatch.await();

        assertNotNull(auth.getTokens());
        auth.signOut();
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
