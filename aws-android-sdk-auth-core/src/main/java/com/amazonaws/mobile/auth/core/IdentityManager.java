/*
  * Copyright 2017-2017 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobile.auth.core;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalConfiguration;

import com.amazonaws.auth.AWSBasicCognitoIdentityProvider;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobile.auth.core.signin.AuthException;
import com.amazonaws.mobile.auth.core.signin.CognitoAuthException;
import com.amazonaws.mobile.auth.core.signin.ProviderAuthException;
import com.amazonaws.mobile.auth.core.signin.SignInManager;
import com.amazonaws.mobile.auth.core.signin.SignInProvider;
import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
import com.amazonaws.mobile.auth.core.internal.util.ThreadUtils;
import com.amazonaws.mobile.config.AWSConfiguration;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * The identity manager keeps track of the current sign-in provider and is responsible
 * for caching credentials.
 *
 * <pre>
 * // Create IdentityManager and set it as the default instance.
 * IdentityManager idm = new IdentityManager(getApplicationContext(),
 *                                           new AWSConfiguration(getApplicationContext()));
 * IdentityManager.setDefaultIdentityManager(idm);
 *
 * // Use IdentityManager to retrieve the {@link com.amazonaws.auth.CognitoCachingCredentialsProvider}
 * // object.
 * IdentityManager.getDefaultIdentityManager().getUnderlyingProvider();
 *
 * </pre>
 */
public class IdentityManager {

    /** Holder for the credentials provider, allowing the underlying provider to be swapped when necessary. */
    private class AWSCredentialsProviderHolder implements AWSCredentialsProvider {

        /** Reference to the credentials provider. */
        private volatile CognitoCachingCredentialsProvider underlyingProvider;

        @Override
        public AWSCredentials getCredentials() {
            return underlyingProvider.getCredentials();
        }

        @Override
        public void refresh() {
            underlyingProvider.refresh();
        }

        private CognitoCachingCredentialsProvider getUnderlyingProvider() {
            return underlyingProvider;
        }

        private void setUnderlyingProvider(final CognitoCachingCredentialsProvider underlyingProvider) {
            // if the current underlyingProvider is not null
            this.underlyingProvider = underlyingProvider;
        }
    }

    /** Log tag. */
    private static final String LOG_TAG = IdentityManager.class.getSimpleName();

    /** AWS Configuration json file */
    private static final String AWS_CONFIGURATION_FILE = "awsconfiguration.json";

    /** Holder for the credentials provider, allowing the underlying provider to be swapped when necessary. */
    private final AWSCredentialsProviderHolder credentialsProviderHolder;

    /** Application context. */
    private final Context appContext;

    /** Configuration for the mobile helper. */
    private AWSConfiguration awsConfiguration;

    /* SDK Client configuration. */
    private final ClientConfiguration clientConfiguration;

    /** Executor service for obtaining credentials in a background thread. */
    private final ExecutorService executorService = Executors.newFixedThreadPool(4);

    /** Timeout CountdownLatch for doStartupAuth(). */
    private final CountDownLatch startupAuthTimeoutLatch = new CountDownLatch(1);

    /** Keep track of the registered sign-in providers. */
    private final List<Class<? extends SignInProvider>> signInProviderClasses
        = new LinkedList<Class<? extends SignInProvider>>();

    /** Current provider beingIdentityProviderType used to obtain a Cognito access token. */
    private volatile IdentityProvider currentIdentityProvider = null;

    /** Results adapter for adapting results that came from logging in with a provider. */
    private SignInProviderResultAdapter resultsAdapter;

    /** Keep track of the currently registered SignInStateChangeListeners. */
    private final HashSet<SignInStateChangeListener> signInStateChangeListeners
        = new HashSet<SignInStateChangeListener>();

    /** Reference to the default identity manager */
    private static IdentityManager defaultIdentityManager = null;

    /**
     * SharedPreferences key name used to store the short-lived AWS Credentials
     * by the CognitoCachingCredentialsProvider.
     */
    private static final String SHARED_PREF_NAME = "com.amazonaws.android.auth";

    /**
     * SharedPreferences key name used to store the expiration date for the
     * short-lived AWS Credentials.
     */
    private static final String EXPIRATION_KEY = "expirationDate";

    /**
     * Instance of AWSKeyValueStorageUtility that provides access
     * to secure storage of credentials in SharedPreferences.
     */
    private AWSKeyValueStore awsKeyValueStore;

    /**
     * Flag if true indicates that secure storage is used to
     * access information. Flag if false keeps the information
     * in memory.
     */
    private boolean isPersistenceEnabled = true;

    boolean shouldFederate = true;

    /**
     * Custom Amazon Cognito Identity Provider to handle refreshing the sign-in provider's token.
     */
    private class AWSRefreshingCognitoIdentityProvider extends AWSBasicCognitoIdentityProvider {

        /** Log tag. */
        private final String LOG_TAG = AWSRefreshingCognitoIdentityProvider.class.getSimpleName();

        public AWSRefreshingCognitoIdentityProvider(final String accountId,
                                                    final String identityPoolId,
                                                    final ClientConfiguration clientConfiguration,
                                                    final Regions regions) {
            super(accountId, identityPoolId, clientConfiguration);
            // Force refreshing Identity provider to use same region as
            // CognitoCachingCredentialsProvider
            this.cib.setRegion(Region.getRegion(regions));
        }

        @Override
        public String refresh() {

            if (currentIdentityProvider != null) {
                Log.d(LOG_TAG, "Storing the Refresh token in the loginsMap.");
                final String newToken = currentIdentityProvider.refreshToken();
                getLogins().put(currentIdentityProvider.getCognitoLoginKey(), newToken);
            }
            return super.refresh();
        }
    }

    /**
     * Constructor that takes in the application context.
     *
     * @param context the application context.
     */
    public IdentityManager(final Context context) {
        this.appContext = context.getApplicationContext();
        this.awsConfiguration = null;
        this.clientConfiguration = null;
        this.credentialsProviderHolder = null;
        this.awsKeyValueStore = new AWSKeyValueStore(appContext, SHARED_PREF_NAME, isPersistenceEnabled);
    }

    /**
     * Constructor.
     * Initializes with the application context and the AWSConfiguration passed in.
     * Creates a default ClientConfiguration with the user agent from AWSConfiguration.
     *
     * @param context the application context.
     * @param awsConfiguration the aws configuration.
     */
    public IdentityManager(final Context context,
                           final AWSConfiguration awsConfiguration) {
        this.appContext = context.getApplicationContext();
        this.awsConfiguration = awsConfiguration;
        this.clientConfiguration = new ClientConfiguration().withUserAgent(awsConfiguration.getUserAgent());
        this.credentialsProviderHolder = new AWSCredentialsProviderHolder();
        createCredentialsProvider(this.appContext, this.clientConfiguration);
        this.awsKeyValueStore = new AWSKeyValueStore(appContext, SHARED_PREF_NAME, isPersistenceEnabled);
    }

    /**
     * Constructor.
     * Initializes with the application context, the AWSConfiguration
     * and the ClientConfiguration passed in.
     * Read the UserAgent from AWSConfiguration and set in ClientConfiguration.
     *
     * @param context the application context.
     * @param awsConfiguration the aws configuration.
     * @param clientConfiguration the client configuration options such as retries and timeouts.
     */
    public IdentityManager(final Context context,
                           final AWSConfiguration awsConfiguration,
                           final ClientConfiguration clientConfiguration) {
        this.appContext = context.getApplicationContext();
        this.awsConfiguration = awsConfiguration;
        this.clientConfiguration = clientConfiguration;

        final String userAgent = this.awsConfiguration.getUserAgent();
        String currentUserAgent = this.clientConfiguration.getUserAgent();
        currentUserAgent = currentUserAgent != null ? currentUserAgent : "";

        if (userAgent != null && userAgent != currentUserAgent) {
            this.clientConfiguration.setUserAgent(currentUserAgent.trim() + " " + userAgent);
        }

        this.credentialsProviderHolder = new AWSCredentialsProviderHolder();
        createCredentialsProvider(this.appContext, this.clientConfiguration);
        this.awsKeyValueStore = new AWSKeyValueStore(appContext, SHARED_PREF_NAME, isPersistenceEnabled);
    }

    /**
     * Constructor.
     * @param context application context
     * @param credentialsProvider credentials provider to talk with Cognito Identity
     * @param clientConfiguration the client configuration options such as retries and timeouts
     */
    public IdentityManager(final Context context,
                           final CognitoCachingCredentialsProvider credentialsProvider,
                           final ClientConfiguration clientConfiguration) {
        this.appContext = context.getApplicationContext();
        this.clientConfiguration = clientConfiguration;
        this.credentialsProviderHolder = new AWSCredentialsProviderHolder();
        credentialsProviderHolder.setUnderlyingProvider(credentialsProvider);
        this.awsKeyValueStore = new AWSKeyValueStore(appContext, SHARED_PREF_NAME, isPersistenceEnabled);
    }

    /**
     * Set the flag that indicates if persistence is enabled or not.
     * @param persistenceEnabled the flag that indicates if persistence is enabled or not.
     */
    public void setPersistenceEnabled(boolean persistenceEnabled) {
        isPersistenceEnabled = persistenceEnabled;
        this.awsKeyValueStore.setPersistenceEnabled(isPersistenceEnabled);
    }

    /**
     * Set the flag that indicates if tokens will be
     * federated into Cognito Identity pool
     * @param enabled Flag that indicates if tokens will
     *                be federated into Cognito Identity pool
     */
    public void enableFederation(final boolean enabled) {
        shouldFederate = enabled;
    }

    /**
     * Return the default instance of the IdentityManager
     *
     * @return defaultIdentityManager The default IdentityManager object
     */
    public static IdentityManager getDefaultIdentityManager() {
        return defaultIdentityManager;
    }

    /**
     * Set the IdentityManager object passed in as the default instance
     *
     * @param identityManager The IdentityManager object to be set as the default
     */
    public static void setDefaultIdentityManager(IdentityManager identityManager) {
        defaultIdentityManager = null;
        defaultIdentityManager = identityManager;
    }

    /**
     * Retrieve the AWSConfiguration object that represents the `awsconfiguration.json`.
     *
     * @return AWSConfiguration Return the reference to the AWSConfiguration object
     */
    public AWSConfiguration getConfiguration() {
        return this.awsConfiguration;
    }

    /**
     * Set the AWSConfiguration.
     * @param configuration
     */
    public void setConfiguration(AWSConfiguration configuration) {
        this.awsConfiguration = configuration;
    }

    /**
     * Check if the short-lived AWS Credentials are expired.
     *
     * @return true if the cached short-lived AWS credentials are expired, otherwise false.
     */
    public boolean areCredentialsExpired() {

        if (!shouldFederate) {
            throw new IllegalStateException("Federation is not enabled and does not support credentials");
        }

        final Date credentialsExpirationDate =
            credentialsProviderHolder.getUnderlyingProvider().getSessionCredentitalsExpiration();

        if (credentialsExpirationDate == null) {
            Log.d(LOG_TAG, "Credentials are EXPIRED.");
            return true;
        }

        long currentTime = System.currentTimeMillis() -
                (long)(SDKGlobalConfiguration.getGlobalTimeOffset() * 1000);

        final boolean credsAreExpired =
                (credentialsExpirationDate.getTime() - currentTime) < 0;

        Log.d(LOG_TAG, "Credentials are " + (credsAreExpired ? "EXPIRED." : "OK"));

        return credsAreExpired;
    }

    /**
     * Retrieve the reference to AWSCredentialsProvider object.
     *
     * @return the holder to the CognitoCachingCredentialsProvider.
     */
    public AWSCredentialsProvider getCredentialsProvider() {
        return this.credentialsProviderHolder;
    }

    /**
     * Retrieve the reference to CognitoCachingCredentialsProvider object.
     *
     * @return the Cognito Caching Credentials Provider
     */
    public CognitoCachingCredentialsProvider getUnderlyingProvider() {
        return this.credentialsProviderHolder.getUnderlyingProvider();
    }

    /**
     * Gets the cached unique identifier for the user.
     *
     * @return the cached unique identifier for the user.
     */
    public String getCachedUserID() {
        if (!shouldFederate) {
            throw new IllegalStateException("Federation is not enabled and does not support user id");
        }
        return credentialsProviderHolder.getUnderlyingProvider().getCachedIdentityId();
    }

    /**
     * Gets the user's unique identifier. This method can be called from
     * any thread.
     *
     * @param handler handles the unique identifier for the user
     */
    public void getUserID(final IdentityHandler handler) {
        if (!shouldFederate) {
            throw new IllegalStateException("Federation is not enabled and does not support user id");
        }

        executorService.submit(new Runnable() {
            Exception exception = null;

            @Override
            public void run() {
                String identityId = null;

                try {
                    // Retrieve the user identity on the background thread.
                    identityId = credentialsProviderHolder.getUnderlyingProvider().getIdentityId();
                } catch (final Exception exception) {
                    this.exception = exception;
                    Log.e(LOG_TAG, exception.getMessage(), exception);
                } finally {
                    final String result = identityId;
                    Log.d(LOG_TAG, "Got Amazon Cognito Federated Identity ID: " + identityId);

                    if (handler != null) {
                        ThreadUtils.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (exception != null) {
                                    handler.handleError(exception);
                                } else {
                                    handler.onIdentityId(result);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    /**
     * The adapter to handle results that come back from Cognito as well as handle the result from
     * any login providers.
     */
    private class SignInProviderResultAdapter implements SignInProviderResultHandler {
        final private SignInProviderResultHandler handler;

        private SignInProviderResultAdapter(final SignInProviderResultHandler handler) {
            this.handler = handler;
        }

        @Override
        public void onSuccess(final IdentityProvider provider) {
            Log.d(LOG_TAG,
                    String.format("SignInProviderResultAdapter.onSuccess(): %s provider sign-in succeeded.",
                            provider.getDisplayName()));
            // Update Cognito login with the token.
            federateWithProvider(provider);
        }

        private void onCognitoSuccess() {
            Log.d(LOG_TAG, "SignInProviderResultAdapter.onCognitoSuccess()");
            handler.onSuccess(currentIdentityProvider);
        }

        private void onCognitoError(final Exception ex) {
            Log.d(LOG_TAG, "SignInProviderResultAdapter.onCognitoError()", ex);
            final IdentityProvider provider = currentIdentityProvider;
            // Sign out of parent provider. This clears the currentIdentityProvider.
            IdentityManager.this.signOut();
            handler.onError(provider, new CognitoAuthException(provider, ex));
        }

        @Override
        public void onCancel(final IdentityProvider provider) {
            Log.d(LOG_TAG, String.format(
                "SignInProviderResultAdapter.onCancel(): %s provider sign-in canceled.",
                provider.getDisplayName()));
            handler.onCancel(provider);
        }

        @Override
        public void onError(final IdentityProvider provider, final Exception ex) {
            Log.e(LOG_TAG,
                String.format("SignInProviderResultAdapter.onError(): %s provider error. %s",
                              provider.getDisplayName(), ex.getMessage()), ex);
            handler.onError(provider, new ProviderAuthException(provider, ex));
        }
    }

    /**
     * Add a listener to receive callbacks when sign-in or sign-out occur.  The listener
     * methods will always be called on a background thread.
     *
     * @param listener the sign-in state change listener.
     */
    public void addSignInStateChangeListener(final SignInStateChangeListener listener) {
        synchronized (signInStateChangeListeners) {
            signInStateChangeListeners.add(listener);
        }
    }

    /**
     * Remove a listener from receiving callbacks when sign-in or sign-out occur.
     *
     * @param listener the sign-in state change listener.
     */
    public void removeSignInStateChangeListener(final SignInStateChangeListener listener) {
        synchronized (signInStateChangeListeners) {
            signInStateChangeListeners.remove(listener);
        }
    }

    /**
     * Call getResultsAdapter to get the IdentityManager's handler that adapts results before
     * sending them back to the handler set by {@link #setProviderResultsHandler(SignInProviderResultHandler)}
     *
     * @return the Identity Manager's results adapter.
     */
    public SignInProviderResultAdapter getResultsAdapter() {
        return resultsAdapter;
    }

    /**
     * Sign out of the current identity provider, and clear Cognito credentials.
     * Note: This call does not attempt to obtain un-auth credentials. To obtain an unauthenticated
     * anonymous (guest) identity, call {@link #getUserID(IdentityHandler)}.
     */
    public void signOut() {
        Log.d(LOG_TAG, "Signing out...");

        if (currentIdentityProvider != null) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    currentIdentityProvider.signOut();
                    if (shouldFederate) {
                        credentialsProviderHolder.getUnderlyingProvider().clear();
                    }
                    currentIdentityProvider = null;

                    // Notify state change listeners of sign out.
                    synchronized (signInStateChangeListeners) {
                        for (final SignInStateChangeListener listener : signInStateChangeListeners) {
                            listener.onUserSignedOut();
                        }
                    }
                }
            });
        }
    }

    /**
     * Set the loginMap of the CognitoCachingCredentialsProvider
     * and invoke refresh. This retrieves the AWS Identity and the
     * short-lived AWS Credentials to access other AWS resources.
     *
     * @param loginMap the map with a key-value pair of
     *                 sign-in provider key and the token
     */
    private void refreshCredentialWithLogins(final Map<String, String> loginMap) {

        final CognitoCachingCredentialsProvider credentialsProvider =
            credentialsProviderHolder.getUnderlyingProvider();

        if (!shouldFederate) {
            return;
        }

        credentialsProvider.clear();
        credentialsProvider.withLogins(loginMap);

        // Calling refresh is equivalent to calling getIdentityId() + getCredentials().
        Log.d(LOG_TAG, "refresh credentials");
        credentialsProvider.refresh();

        // Set the expiration key of the Credentials Provider to 8 minutes, 30 seconds.
        awsKeyValueStore.put(credentialsProvider.getIdentityPoolId() + "." + EXPIRATION_KEY,
                String.valueOf(System.currentTimeMillis() + (510 * 1000)));
    }

    /**
     * Set the results handler that will be used for results when calling federateWithProvider.
     *
     * @param signInProviderResultHandler the results handler.
     */
    public void setProviderResultsHandler(final SignInProviderResultHandler signInProviderResultHandler) {
        if (signInProviderResultHandler == null) {
            throw new IllegalArgumentException("signInProviderResultHandler cannot be null.");
        }
        this.resultsAdapter = new SignInProviderResultAdapter(signInProviderResultHandler);
    }

    /**
     * Fetch the token from the SignIn provider and insert into the loginMap
     * and then invoke {@link #refreshCredentialWithLogins(Map)} to set the
     * loginsMap with the CredentialsProvider object in-order to federate
     * the token with Amazon Cognito Federated Identities.
     *
     * @param provider A sign-in provider.
     */
    public void federateWithProvider(final IdentityProvider provider) {
        Log.d(LOG_TAG, "federate with provider: Populate loginsMap with token.");
        final Map<String, String> loginMap = new HashMap<String, String>();
        loginMap.put(provider.getCognitoLoginKey(), provider.getToken());
        currentIdentityProvider = provider;

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    if (shouldFederate) {
                        refreshCredentialWithLogins(loginMap);
                    }
                } catch (Exception ex) {
                    resultsAdapter.onCognitoError(ex);
                    return;
                }

                resultsAdapter.onCognitoSuccess();

                // Notify state change listeners of sign out.
                synchronized (signInStateChangeListeners) {
                    for (final SignInStateChangeListener listener : signInStateChangeListeners) {
                        listener.onUserSignedIn();
                    }
                }
            }
        });
    }

    /**
     * Gets the current provider.
     *
     * @return current provider or null if not signed-in
     */
    public IdentityProvider getCurrentIdentityProvider() {
        return currentIdentityProvider;
    }

    /**
     * Add a supported identity provider to your app.
     * The provider will be presented as option to sign in to your app.
     *
     * @param providerClass the provider class for the identity provider.
     */
    public void addSignInProvider(final Class<? extends SignInProvider> providerClass) {
        signInProviderClasses.add(providerClass);
    }

    /**
     * Gets the list of SignInProvider classes
     *
     * @return list of the signInProvider classes
     */
    public Collection<Class<? extends SignInProvider>> getSignInProviderClasses() {
        return signInProviderClasses;
    }

    /**
     * Check if user is signed in.
     *
     * @return true if Cognito credentials have been obtained with at least one provider.
     */
    public boolean isUserSignedIn() {
        final Map<String, String> logins = credentialsProviderHolder.getUnderlyingProvider().getLogins();
        if (logins == null || logins.size() == 0)
            return false;
        return true;
    }

    /**
     * Invoke the onComplete method on the {@link StartupAuthResultHandler}
     * callback object.
     *
     * @param callingActivity the activity context
     * @param startupAuthResultHandler the callback object
     * @param ex the exception if raised during the resume session
     */
    private void completeHandler(final Activity callingActivity,
                                 final StartupAuthResultHandler startupAuthResultHandler,
                                 final AuthException ex) {
        runAfterStartupAuthDelay(callingActivity, new Runnable() {
            @Override
            public void run() {
                startupAuthResultHandler.onComplete(new StartupAuthResult(IdentityManager.this,
                    new StartupAuthErrorDetails(ex, null)));
            }
        });
    }

    /**
     * Invoke the completeHandler after the resume session timeout
     * by running the Runnable on th UI thread. This method is
     * currently being called from a background thread.
     *
     * @param runnable runnable to run after the splash timeout expires.
     */
    private void runAfterStartupAuthDelay(final Activity callingActivity,
                                          final Runnable runnable) {
        executorService.submit(new Runnable() {
            public void run() {
                // Wait for the startupAuthTimeoutLatch to go to zero.
                try {
                    startupAuthTimeoutLatch.await();
                } catch (InterruptedException e) {
                    Log.d(LOG_TAG, "Interrupted while waiting for startup auth minimum delay.");
                }

                // Notify user by invoking the callback on the UI thread
                callingActivity.runOnUiThread(runnable);
            }
        });
    }

    /**
     * This should be called from your app's activity upon start-up. If the user was previously
     * signed-in, this will attempt to refresh their identity using the previously signed-in provider.
     * If the user was not previously signed in or their identity could not be refreshed with the
     * previously signed-in provider, it will attempt to obtain an unauthenticated identity.
     *
     * @param callingActivity the calling activity.
     * @param startupAuthResultHandler a handler for returning results.
     * @param minimumDelay the minimum delay to wait before returning the sign-in result.
     */
    public void resumeSession(final Activity callingActivity,
                              final StartupAuthResultHandler startupAuthResultHandler,
                              final long minimumDelay) {

        Log.d(LOG_TAG, "Resume Session called.");

        executorService.submit(new Runnable() {
            public void run() {
                Log.d(LOG_TAG, "Looking for a previously signed-in session.");
                final SignInManager signInManager =
                        SignInManager.getInstance(callingActivity.getApplicationContext());

                final SignInProvider signInProvider =
                        signInManager.getPreviouslySignedInProvider();

                // if the user was previously signed-in with an sign-in provider and
                // we are able to verify with the sign-in provider.
                if (signInProvider != null) {
                    Log.d(LOG_TAG, "Refreshing credentials with sign-in provider "
                        + signInProvider.getDisplayName());

                    // Use the token from the previously signed-in session to
                    // get a AWS Identity using Cognito Federated Identities
                    // The AWS Identity will be wrapped into the CredentialsProvider
                    // which will contain short-lived AWS Credentials to access
                    // AWS resources.
                    signInManager.refreshCredentialsWithProvider(callingActivity,
                            signInProvider,
                            new SignInProviderResultHandler() {

                                @Override
                                public void onSuccess(final IdentityProvider provider) {
                                    Log.d(LOG_TAG, "Successfully got AWS Credentials.");

                                    runAfterStartupAuthDelay(callingActivity, new Runnable() {
                                        @Override
                                        public void run() {
                                            startupAuthResultHandler.onComplete(new StartupAuthResult(IdentityManager.this, null));
                                        }
                                    });
                                }

                                @Override
                                public void onCancel(final IdentityProvider provider) {
                                    Log.wtf(LOG_TAG, "Cancel can't happen when handling a previously signed-in user.");
                                }

                                @Override
                                public void onError(final IdentityProvider provider, final Exception ex) {
                                    Log.e(LOG_TAG,
                                            String.format("Federate with Cognito with %s Sign-in provider failed. Error: %s",
                                                    provider.getDisplayName(), ex.getMessage()), ex);

                                    if (ex instanceof AuthException) {
                                        completeHandler(callingActivity, startupAuthResultHandler,
                                                (AuthException) ex);
                                    } else {
                                        completeHandler(callingActivity, startupAuthResultHandler,
                                                new AuthException(provider, ex));
                                    }
                                }
                            });
                } else {
                    // No previously signed-in provider found. No session to resume.
                    // Notify the user by executing the callback handler.
                    completeHandler(callingActivity, startupAuthResultHandler, null);
                }

                if (minimumDelay > 0) {
                    // Wait for the expiration timeout.
                    try {
                        Thread.sleep(minimumDelay);
                    } catch (final InterruptedException ex) {
                        Log.i(LOG_TAG, "Interrupted while waiting for resume session timeout.");
                    }
                }

                // Expire the resume session timeout.
                startupAuthTimeoutLatch.countDown();
            }
        });
    }

    /**
     * This should be called from your app's splash activity upon start-up. If the user was previously
     * signed in, this will attempt to refresh their identity using the previously sign-ed in provider.
     * If the user was not previously signed in or their identity could not be refreshed with the
     * previously signed in provider and sign-in is optional, it will attempt to obtain an unauthenticated (guest)
     * identity.
     *
     * @param callingActivity the calling activity.
     * @param startupAuthResultHandler a handler for returning results.
     */
    public void resumeSession(final Activity callingActivity,
                              final StartupAuthResultHandler startupAuthResultHandler) {
        resumeSession(callingActivity, startupAuthResultHandler, 0);
    }

    /**
     * This should be called from your app's splash activity upon start-up. If the user was previously
     * signed in, this will attempt to refresh their identity using the previously sign-ed in provider.
     * If the user was not previously signed in or their identity could not be refreshed with the
     * previously signed in provider and sign-in is optional, it will attempt to obtain an unauthenticated (guest)
     * identity.
     *
     * @param callingActivity the calling activity.
     * @param startupAuthResultHandler a handler for returning results.
     * @deprecated Please use {@link #resumeSession(Activity, StartupAuthResultHandler)} method instead.
     */
    @Deprecated
    public void doStartupAuth(final Activity callingActivity,
                              final StartupAuthResultHandler startupAuthResultHandler) {
        resumeSession(callingActivity, startupAuthResultHandler, 0);
    }

    /**
     * This should be called from your app's splash activity upon start-up. If the user was previously
     * signed in, this will attempt to refresh their identity using the previously sign-ed in provider.
     * If the user was not previously signed in or their identity could not be refreshed with the
     * previously signed in provider and sign-in is optional, it will attempt to obtain an unauthenticated (guest)
     * identity.
     *
     * @param callingActivity the calling activity.
     * @param startupAuthResultHandler a handler for returning results.
     * @deprecated Please use {@link #resumeSession(Activity, StartupAuthResultHandler, long)} method instead.
     */
    @Deprecated
    public void doStartupAuth(final Activity callingActivity,
                              final StartupAuthResultHandler startupAuthResultHandler,
                              final long minimumDelay) {
        resumeSession(callingActivity, startupAuthResultHandler, minimumDelay);
    }

    /**
     * Call this to ignore waiting for the remaining timeout delay.
     */
    public void expireSignInTimeout() {
        startupAuthTimeoutLatch.countDown();
    }

    /**
     * Call setUpToAuthenticate to initiate sign-in with a provider.
     *
     * Note: This should not be called when already signed in with a provider.
     *
     * @param context context.
     * @param signInResultHandler the results handler.
     * @deprecated Please use {@link #login(Context, SignInResultHandler)} method instead.
     */
    @Deprecated
    public void setUpToAuthenticate(final Context context,
                                    final SignInResultHandler signInResultHandler) {
        this.login(context, signInResultHandler);
    }

    /**
     * Call login to initiate sign-in with a provider.
     *
     * Note: This should not be called when already signed in with a provider.
     *
     * @param context context.
     * @param signInResultHandler the results handler.
     */
    public void login(final Context context,
                      final SignInResultHandler signInResultHandler) {
        // Start the sign-in activity.
        // We do not finish the calling activity allowing the user to navigate back.
        try {
            SignInManager
                .getInstance(context.getApplicationContext())
                .setResultHandler(signInResultHandler);
        } catch (final Exception exception) {
            Log.e(LOG_TAG, "Error in instantiating SignInManager. " +
                           "Check the context and completion handler.", exception);
        }
    }

    /**
     *   The CognitoCachingCredentialProvider loads cached credentials when it is
     *   instantiated, however, it does not reload the login map, which must be reloaded
     *   in order to refresh the credentials.  Therefore, currently cached credentials are
     *   only useful for unauthenticated users.
     */
    private void createCredentialsProvider(final Context context,
                                           final ClientConfiguration clientConfiguration) {

        Log.d(LOG_TAG, "Creating the Cognito Caching Credentials Provider "
                + "with a refreshing Cognito Identity Provider.");

        if (!shouldFederate) {
            return;
        }

        final JSONObject cognitoIdentityConfig = getCognitoIdentityPoolConfig();
        final String region;
        final String poolId;
        try {
            region = cognitoIdentityConfig.getString("Region");
            poolId = cognitoIdentityConfig.getString("PoolId");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Failed to read configuration for CognitoIdentity", e);
        }

        final Regions cognitoIdentityRegion = Regions.fromName(region);

        final AWSRefreshingCognitoIdentityProvider refreshingCredentialsProvider =
            new AWSRefreshingCognitoIdentityProvider(null, poolId,
                clientConfiguration, cognitoIdentityRegion);

        final CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider = new CognitoCachingCredentialsProvider(context, refreshingCredentialsProvider,
                cognitoIdentityRegion, clientConfiguration);
        cognitoCachingCredentialsProvider.setPersistenceEnabled(isPersistenceEnabled);
        credentialsProviderHolder.setUnderlyingProvider(cognitoCachingCredentialsProvider);
    }

    /**
     * Retrieve the Cognito IdentityPoold configuration
     *
     * @return PoolId
     * @throws IllegalArgumentException
     */
    private JSONObject getCognitoIdentityPoolConfig() throws IllegalArgumentException {
        try {
            return this.awsConfiguration
                .optJsonObject("CredentialsProvider")
                .getJSONObject("CognitoIdentity")
                .getJSONObject(this.awsConfiguration.getConfiguration());
        } catch (Exception exception) {
            throw new IllegalArgumentException("Cannot access Cognito IdentityPoolId from the "
                    + AWS_CONFIGURATION_FILE + " file.", exception);
        }
    }
}
