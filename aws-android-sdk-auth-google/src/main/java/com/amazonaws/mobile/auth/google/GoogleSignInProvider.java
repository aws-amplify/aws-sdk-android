/*
  * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobile.auth.google;

import android.Manifest;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;

import com.amazonaws.mobile.config.AWSConfiguration;

import com.amazonaws.mobile.auth.core.signin.SignInPermissionsHandler;
import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
import com.amazonaws.mobile.auth.core.signin.SignInProvider;
import com.amazonaws.mobile.auth.core.internal.util.ThreadUtils;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * Sign in Provider for Google.
 */
public class GoogleSignInProvider implements SignInProvider, SignInPermissionsHandler {

    /** Log tag. */
    private static final String LOG_TAG = GoogleSignInProvider.class.getSimpleName();

    /** The Cognito login key for Google+ to be used in the Cognito login Map. */
    public static final String COGNITO_LOGIN_KEY_GOOGLE = "accounts.google.com";

    /** 
     * Arbitrary activity request ID. You can handle this in the main activity,
     * if you want to take action when a google services result is received.
     */
    private static final int REQUEST_GOOGLE_PLAY_SERVICES = 1363;

    /** Request code used to invoke sign in user interactions. */
    private static final int RC_SIGN_IN = 16723;

    /** Permission Request Code (Must be < 256). */
    private static final int GET_ACCOUNTS_PERMISSION_REQUEST_CODE = 93;

    /** Client used to interact with Google APIs. */
    private GoogleApiClient mGoogleApiClient;

    /** Android context. */
    private Context context;

    /** Flag indicating sign-in is in progress. */
    private boolean signingIn = false;

    /** The sign-in results adapter from the SignInManager. */
    private SignInProviderResultHandler resultsHandler;

    /** When signed in, the signed in account, otherwise null. */
    private volatile GoogleSignInAccount signedInAccount = null;

    /** 
     * The auth token retrieved when signed-in.
     *  It is good for 6-months from the last service call.
     */
    private volatile String authToken = null;

    /** Weak reference to the sign-in activity, needed during the obtain permissions flow. */
    private WeakReference<Activity> activityWeakReference = null;

    /** AWSConfiguration object. */
    private AWSConfiguration awsConfiguration = null;

    /** list to store permissions. **/
    private static ArrayList<String> loginScopeList = new ArrayList<String>();

    /**
     * Constructor. Builds the Google Api Client.
     * @param context context.
     * @param configuration the AWS Configuration.
     */
    @Override
    public void initialize(@NonNull final Context activityContext, 
                           final AWSConfiguration awsConfig) {
        this.context = activityContext;
        this.awsConfiguration = awsConfig;
        Log.d(LOG_TAG, "Initializing Google SDK...");

        try {
            GoogleSignInProvider.setPermissions(
                this.awsConfiguration
                    .optJsonObject("GoogleSignIn")
                    .getString("Permissions")
                    .split(",")
            );
        } catch (final Exception exception) {
                Log.e(LOG_TAG, "Failed to register the permissions with GoogleSignInProvider. "
                    + "Use GoogleSignInProvider.setPermissions() to register the permissions. "
                    + "Check if GoogleSignIn is present in `awsconfiguration.json`.");
        }

        GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN);
        synchronized (GoogleSignInProvider.loginScopeList) {
            for (String loginScope : loginScopeList) {
                builder = builder.requestScopes(new Scope(loginScope));
            }
        }
        final GoogleSignInOptions gso = builder.requestEmail().requestProfile().build();
        Log.d(LOG_TAG, "Created Google SignInOptions.");

        // Build GoogleApiClient with access to basic profile
        mGoogleApiClient = new GoogleApiClient.Builder(context)
            .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
            .build();
        mGoogleApiClient.connect();
        Log.d(LOG_TAG, "Connected to the Google SignIn API Client.");
    }

    /** {@inheritDoc} */
    @Override
    public String getDisplayName() {
        return "Google";
    }

    /** {@inheritDoc} */
    @Override
    public boolean refreshUserSignInState() {
        final OptionalPendingResult<GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);

        if (opr.isDone()) {
            // If the user's cached credentials are valid, the OptionalPendingResult will be "done"
            // and the GoogleSignInResult will be available instantly.

            final GoogleSignInResult result = opr.get();
            if (result == null) {
                Log.d(LOG_TAG, "GoogleSignInResult is null. Not signed-in with Google.");
                return false;
            }

            return handleGoogleSignInResultForIsUserSignedIn(result);
        }

        final GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        final int code = api.isGooglePlayServicesAvailable(context.getApplicationContext());
        if (ConnectionResult.SUCCESS == code) {
            // If the user has not previously signed in on this device or the sign-in has expired,
            // this asynchronous branch will attempt to sign in the user silently.  Cross-device
            // single sign-on will occur in this branch.
            final GoogleSignInResult googleSignInResult = opr.await();
            return handleGoogleSignInResultForIsUserSignedIn(googleSignInResult);
        }

        Log.w(LOG_TAG, "Google Play Services are not available. Assuming not signed-in with Google.");
        return false;
    }

    /**
     * Add the login permisisons needed by the application.
     * The input has to be a list of strings, where each
     * string represents a permisison.
     *
     * Eg:
     *  GoogleSignInProvider.setPermissions(Scopes.EMAIL);
     *  GoogleSignInProvider.setPermissions(Scopes.EMAIL,
     *                                      Scopes.PROFILE);
     * @param loginScopes The list of permissions required
     */
    public static void setPermissions(final String... loginScopes) {
        synchronized (GoogleSignInProvider.loginScopeList) {
            GoogleSignInProvider.loginScopeList.clear();
            for (String scope : loginScopes) {
                GoogleSignInProvider.loginScopeList.add(scope);
            }
        }
    }

    /** {@inheritDoc} */
    @Override
    public String getCognitoLoginKey() {
        return COGNITO_LOGIN_KEY_GOOGLE;
    }

    /** {@inheritDoc} */
    @Override
    public String getToken() {
        return authToken;
    }

    /** {@inheritDoc} */
    @Override
    public String refreshToken() {
        Log.d(LOG_TAG, "Google provider refreshing token...");

        try {
            authToken = getGoogleAuthToken(signedInAccount.getEmail());
        } catch (final Exception ex) {
            Log.w(LOG_TAG, "Failed to update Google token", ex);
            authToken = null;
        }
        return authToken;
    }

    /** {@inheritDoc} */
    @Override
    public void signOut() {
        Log.d(LOG_TAG, "Google provider signing out...");

        final Status status = Auth.GoogleSignInApi.signOut(mGoogleApiClient).await();
        Log.d(LOG_TAG, "signOut:onResult:" + status);
        authToken = null;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isRequestCodeOurs(final int requestCode) {
        return (requestCode == RC_SIGN_IN);
    }

    /** {@inheritDoc} */
    @Override
    public void handleActivityResult(final int requestCode,
                                     final int resultCode,
                                     final Intent data) {
        if (requestCode == RC_SIGN_IN) {
            signingIn = false;

            // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
            final GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if (result == null) {
                // This should not happen based on Google's documentation.
                final String errMsg = "GoogleSignInResult was null.";
                Log.wtf(LOG_TAG, errMsg);
                resultsHandler.onError(GoogleSignInProvider.this, new IllegalStateException(errMsg));
                return;
            }

            if (!result.isSuccess()) {
                // if the user canceled
                if (GoogleSignInStatusCodes.SIGN_IN_CANCELLED == result.getStatus().getStatusCode()) {
                    resultsHandler.onCancel(GoogleSignInProvider.this);
                    return;
                }

                // If there was a failure, forward it along.
                resultsHandler.onError(GoogleSignInProvider.this,
                    new GoogleSignInException(result));
            }

            Log.i(LOG_TAG, "Successful GoogleSignInResult, status=" + result.getStatus().toString());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        handleGoogleSignInSuccessResult(result);
                        Log.d(LOG_TAG, "Google provider sign-in succeeded!");
                        ThreadUtils.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                resultsHandler.onSuccess(GoogleSignInProvider.this);
                            }
                        });
                    } catch (final Exception ex) {
                        final String errMsg = "Error retrieving Google token.";
                        Log.e(LOG_TAG, errMsg);
                        ThreadUtils.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                resultsHandler.onError(GoogleSignInProvider.this, ex);
                            }
                        });
                    }
                }
            }).start();
        }
    }

    /** {@inheritDoc} */
    @Override
    public View.OnClickListener initializeSignInButton(final Activity signInActivity,
                                                       final View buttonView,
                                                       final SignInProviderResultHandler providerResultsHandler) {
        this.resultsHandler = providerResultsHandler;
        final GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        final int code = api.isGooglePlayServicesAvailable(context.getApplicationContext());

        if (ConnectionResult.SUCCESS != code) {
            if (api.isUserResolvableError(code)) {
                Log.w(LOG_TAG, "Google Play services recoverable error.");
                api.showErrorDialogFragment(signInActivity, code, REQUEST_GOOGLE_PLAY_SERVICES);
            } else {
                final boolean isDebugBuild =
                        (0 != (signInActivity
                                .getApplicationContext()
                                .getApplicationInfo()
                                .flags & ApplicationInfo.FLAG_DEBUGGABLE));

                if (!isDebugBuild) {
                    buttonView.setVisibility(View.GONE);
                } else {
                    Log.w(LOG_TAG, "Google Play Services are not available, "
                        + "but we are showing the Google Sign-in Button, anyway, "
                        + "because this is a debug build.");
                }
            }
            return null;
        }

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (!signingIn) {
                    signingIn = true;
                    if (getPermissionsIfNecessary(signInActivity)) {
                        return;
                    }

                    initiateGoogleSignIn(signInActivity);
                }
            }
        };
        buttonView.setOnClickListener(listener);
        return listener;
    }

    /**
     * Get reference to the SignedIn Account.
     * @return the Google SignIn Account
     */
    public GoogleSignInAccount getSignedInAccount() {
        return signedInAccount;
    }

     /** {@inheritDoc} */
    @Override
    public int getPermissionRequestCode() {
        return GET_ACCOUNTS_PERMISSION_REQUEST_CODE;
    }

     /** {@inheritDoc} */
    @Override
    public void handleRequestPermissionsResult(final int requestCode,
                                               final String[] permissions,
                                               final int[] grantResults) {
        try {
            if (requestCode == GET_ACCOUNTS_PERMISSION_REQUEST_CODE) {
                if (grantResults.length > 0 &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // The activity will always still be available when the permissions result is returned since
                    // it will come back on the main thread to the containing activity.
                    Activity activity = activityWeakReference.get();
                    if (activity == null) {
                        throw new Exception("Cannot initiate GoogleSignIn."
                            + " Activity context is null");
                    }
                    initiateGoogleSignIn(activity);
                } else {
                    Log.i(LOG_TAG, "Permissions not granted for Google sign-in.");
                    signingIn = false;
                }
            }
        } catch (final Exception exception) {
            Log.e(LOG_TAG, "Cannot initiate GoogleSignIn. Check your permissions.", exception);
        }
    }

    private boolean handleGoogleSignInResultForIsUserSignedIn(@NonNull final GoogleSignInResult result) {
        final String accountEmail;
        signedInAccount = result.getSignInAccount();
        if (signedInAccount != null) {
            accountEmail = signedInAccount.getEmail();
        } else {
            Log.i(LOG_TAG, "GoogleSignInResult indicates not signed in with an account: "
                + result.getStatus().toString());
            authToken = null;
            return false;
        }

        Log.d(LOG_TAG, "Google sign-in was cached, attempting to retrieve auth token.");
        try {
            authToken = getGoogleAuthToken(accountEmail);
            return true;
        } catch (final Exception ex) {
            Log.w(LOG_TAG, "Couldn't obtain Google Auth token for account.", ex);
            return false;
        }
    }

    private boolean getPermissionsIfNecessary(final Activity activity) {
        if (ContextCompat.checkSelfPermission(activity.getApplicationContext(),
            Manifest.permission.GET_ACCOUNTS) != PackageManager.PERMISSION_GRANTED) {
            this.activityWeakReference = new WeakReference<Activity>(activity);
            ActivityCompat.requestPermissions(activity,
                new String[]{Manifest.permission.GET_ACCOUNTS},
                GET_ACCOUNTS_PERMISSION_REQUEST_CODE);
            return true;
        }

        return false;
    }

    private void initiateGoogleSignIn(final Activity signInActivity) {
        Log.d(LOG_TAG, "Launching sign-in activity.");
        final Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        signInActivity.startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    private void handleGoogleSignInSuccessResult(@NonNull final GoogleSignInResult result) throws
        IOException, GoogleAuthException, GoogleSignInException {

        final String accountEmail;
        signedInAccount = result.getSignInAccount();
        if (signedInAccount != null) {
            accountEmail = signedInAccount.getEmail();
        } else {
            Log.i(LOG_TAG, "GoogleSignInResult indicates not signed in with an account.");
            final GoogleSignInException ex = new GoogleSignInException(result);
            Log.d(LOG_TAG, ex.getMessage(), ex);

            authToken = null;
            throw ex;
        }

        authToken = getGoogleAuthToken(accountEmail);
    }

    private String getGoogleClientId() throws IOException {
        Log.d(LOG_TAG, "Getting Google Client Id from AWSConfiguration...");
        final String clientId;

        try {
            clientId = awsConfiguration.optJsonObject("GoogleSignIn").getString("ClientId-WebApp");
            Log.d(LOG_TAG, "clientId=" + clientId);
            return clientId;
        } catch (Exception exception) {
            throw new IllegalArgumentException("Couldn't find Google ClientId from the AWSConfiguration."
                        + "Please check the awsconfiguration.json file", exception);
        }
    }

    private String getGoogleAuthToken(final String accountEmail) throws GoogleAuthException, IOException {
        Log.d(LOG_TAG, "Google provider getting token...");

        final Account googleAccount = new Account(accountEmail, GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE);
        final String scopes = "audience:server:client_id:" + getGoogleClientId();

        // Retrieve the Google token.
        final String token = GoogleAuthUtil.getToken(context, googleAccount, scopes);
        // UserRecoverableAuthException will be thrown from GoogleAuthUtil.getToken() if not signed in.

        if (token != null) {
            Log.d(LOG_TAG, "Google Token is OK. Token hashcode = " + token.hashCode());
        } else {
            Log.d(LOG_TAG, "Google Token is NULL.");
        }

        return token;
    }
}
