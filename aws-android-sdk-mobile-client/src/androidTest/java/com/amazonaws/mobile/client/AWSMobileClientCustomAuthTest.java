package com.amazonaws.mobile.client;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
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

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AWSMobileClientCustomAuthTest extends AWSMobileClientTestBase {

    private static Context appContext;
    private static AWSMobileClient auth;

    private static final CountDownLatch signUpLatch = new CountDownLatch(1);
    private static final String USERNAME = "roskumr@amazon.com";
    private static final String PASSWORD = "Test@123";
    private static final String TAG = AWSMobileClientCustomAuthTest.class.getSimpleName();

    @BeforeClass
    public static void beforeClass() throws Exception {
        appContext = InstrumentationRegistry.getTargetContext();
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
                            case DONE: signUpLatch.countDown();
                                break;
                            case CUSTOM_CHALLENGE: confirmSignIn();
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
            signUpLatch.await();
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void confirmSignIn() {
        final Map<String, String> res = new HashMap<String, String>();
        res.put(CognitoServiceConstants.CHLG_RESP_ANSWER, "1133");
        auth.confirmSignIn(res, new Callback<SignInResult>() {
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
            signUpLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}