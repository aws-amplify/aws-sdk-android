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

package com.amazonaws.mobile.auth.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalConfiguration;

import com.amazonaws.mobile.config.AWSConfiguration;

import com.amazonaws.auth.AWSBasicCognitoIdentityProvider;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;

import com.amazonaws.mobile.auth.core.signin.AuthException;
import com.amazonaws.mobile.auth.core.signin.CognitoAuthException;
import com.amazonaws.mobile.auth.core.signin.ProviderAuthException;
import com.amazonaws.mobile.auth.core.signin.SignInManager;
import com.amazonaws.mobile.auth.core.signin.SignInProvider;
import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
import com.amazonaws.mobile.auth.core.internal.util.ThreadUtils;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

import java.io.IOException;
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

/**
 * The identity manager keeps track of the current sign-in provider and is responsible
 * for caching credentials.
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

    /* Cognito client configuration. */
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
     * Shared Preferences Name 
     * This key is used to store credentials in SharedPreferences
     * and used by CognitoCachingCredentialsProvider
     */
    private static final String SHARED_PREF_NAME = "com.amazonaws.android.auth";
    
    /** Shared Preferences Key */
    private static final String EXPIRATION_KEY = "expirationDate";

    /**
     * Custom Cognito Identity Provider to handle refreshing the individual provider's tokens.
     */
    private class AWSRefreshingCognitoIdentityProvider extends AWSBasicCognitoIdentityProvider {

        /** Log tag. */
        private final String LOG_TAG = AWSRefreshingCognitoIdentityProvider.class.getSimpleName();

        public AWSRefreshingCognitoIdentityProvider(final String accountId,
                                                    final String identityPoolId,
                                                    final ClientConfiguration clientConfiguration,
                                                    final Regions regions) {
            super(accountId, identityPoolId, clientConfiguration);
            // Force refreshing ID provider to use same region as caching credentials provider
            this.cib.setRegion(Region.getRegion(regions));
        }

        @Override
        public String refresh() {

            Log.d(LOG_TAG, "Refreshing token...");

            if (currentIdentityProvider != null) {
                final String newToken = currentIdentityProvider.refreshToken();

                getLogins().put(currentIdentityProvider.getCognitoLoginKey(), newToken);
            }
            return super.refresh();
        }
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
        initializeCognito(this.appContext, this.clientConfiguration);
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
        initializeCognito(this.appContext, this.clientConfiguration);
    }

    /**
     * Constructor.
     * Initializes with the activity context, application's credentials provider
     * that provides the identity and the client configuration.
     *
     * @param context the application context.
     * @param awsConfiguration the aws configuration.
     * @param clientConfiguration the client configuration options such as retries and timeouts.
     */
    public IdentityManager(final Context context,
                           final CognitoCachingCredentialsProvider credentialsProvider,
                           final ClientConfiguration clientConfiguration) {
        this.appContext = context.getApplicationContext();
        this.clientConfiguration = clientConfiguration;
        this.credentialsProviderHolder = new AWSCredentialsProviderHolder();
        setCredentialsProvider(context, credentialsProvider);
    }

    /**
     * Return the default IdentityManager
     *
     * @return defaultIdentityManager The default IdentityManager object
     */
    public static IdentityManager getDefaultIdentityManager() {
        return defaultIdentityManager;
    }

    /**
     * Set the IdentityManager object created as the default
     *
     * @param identityManager The IdentityManager object to be set as the default
     */
    public static void setDefaultIdentityManager(IdentityManager identityManager) {
        defaultIdentityManager = null;
        defaultIdentityManager = identityManager;
    }

    /**
     * Retrieve the AWSConfiguration object
     *
     * @return AWSConfiguration Return the reference to the AWSConfiguration object
     */
    public AWSConfiguration getConfiguration() {
        return this.awsConfiguration;
    }

    /**
     * Check if the credentials are expired.
     *
     * @return true if the cached Cognito credentials are expired, otherwise false.
     */
    public boolean areCredentialsExpired() {

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
     * @return the Cognito credentials provider.
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
        return credentialsProviderHolder.getUnderlyingProvider().getCachedIdentityId();
    }

    /**
     * Gets the user's unique identifier. This method can be called from
     * any thread.
     *
     * @param handler handles the unique identifier for the user
     */
    public void getUserID(final IdentityHandler handler) {

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
                    Log.d(LOG_TAG, "Got user ID: " + identityId);

                    // Lint doesn't like early return inside a finally block, so nesting further inside the if here.
                    if (handler != null) {
                        ThreadUtils.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (exception != null) {
                                    handler.handleError(exception);
                                    return;
                                }

                                handler.onIdentityId(result);
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
                    credentialsProviderHolder.getUnderlyingProvider().clear();
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

    private void refreshCredentialWithLogins(final Map<String, String> loginMap) {
      
        final CognitoCachingCredentialsProvider credentialsProvider =
            credentialsProviderHolder.getUnderlyingProvider();
        credentialsProvider.clear();
        credentialsProvider.withLogins(loginMap);
      
        // Calling refresh is equivalent to calling getIdentityId() + getCredentials().
        Log.d(LOG_TAG, "refresh credentials");
        credentialsProvider.refresh();

        // expire credentials in 2 minutes.
        appContext.getSharedPreferences(SHARED_PREF_NAME,
            Context.MODE_PRIVATE).edit()
                .putLong(credentialsProvider.getIdentityPoolId() + "." + EXPIRATION_KEY, System.currentTimeMillis() + (510*1000))
                .commit();

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
     * Login with an identity provider (ie. Facebook, Twitter, etc.).
     *
     * @param provider A sign-in provider.
     */
    public void federateWithProvider(final IdentityProvider provider) {
        Log.d(LOG_TAG, "federateWithProvider");
        final Map<String, String> loginMap = new HashMap<String, String>();
        loginMap.put(provider.getCognitoLoginKey(), provider.getToken());
        currentIdentityProvider = provider;
        initializeCognito(this.appContext, this.clientConfiguration);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    refreshCredentialWithLogins(loginMap);
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

    private void handleStartupAuthResult(final Activity callingActivity,
                                         final StartupAuthResultHandler startupAuthResultHandler,
                                         final AuthException authException,
                                         final Exception unAuthException) {
        runAfterStartupAuthDelay(callingActivity, new Runnable() {
            @Override
            public void run() {
                startupAuthResultHandler.onComplete(new StartupAuthResult(IdentityManager.this,
                    new StartupAuthErrorDetails(authException, unAuthException)));
            }
        });
    }

    private void handleUnauthenticated(final Activity callingActivity,
                                       final StartupAuthResultHandler startupAuthResultHandler,
                                       final AuthException ex) {
        // Optional Sign-in can dispose the sign-in manager right away here, while mandatory sign-in, needs
        // it to stay around a bit longer, since it will be required to call sign-in or sign-up.

        SignInManager.dispose();

        if (getCachedUserID() != null) {
            handleStartupAuthResult(callingActivity, startupAuthResultHandler, ex, null);
        }

        getUserID(new IdentityHandler() {
            @Override
            public void onIdentityId(final String identityId) {
                handleStartupAuthResult(callingActivity, startupAuthResultHandler, ex, null);
            }

            @Override
            public void handleError(final Exception exception) {
                handleStartupAuthResult(callingActivity, startupAuthResultHandler, ex, exception);
            }
        });
        handleStartupAuthResult(callingActivity, startupAuthResultHandler, ex, null);
    }

    /**
     * Starts an activity after the splash timeout.
     *
     * @param runnable runnable to run after the splash timeout expires.
     */
    private void runAfterStartupAuthDelay(final Activity callingActivity, final Runnable runnable) {
        executorService.submit(new Runnable() {
            public void run() {
                // Wait for the splash timeout expiry or for the user to tap.
                try {
                    startupAuthTimeoutLatch.await();
                } catch (InterruptedException e) {
                    Log.d(LOG_TAG, "Interrupted while waiting for startup auth minimum delay.");
                }

                callingActivity.runOnUiThread(runnable);
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
     * @param minimumDelay the minimum delay to wait before returning the sign-in result.
     */
    public void doStartupAuth(final Activity callingActivity,
                              final StartupAuthResultHandler startupAuthResultHandler,
                              final long minimumDelay) {

        executorService.submit(new Runnable() {
            public void run() {
                Log.d(LOG_TAG, "Starting up authentication...");
                final SignInManager signInManager = SignInManager.getInstance(
                    callingActivity.getApplicationContext());

                if (signInManager == null) {
                    throw new IllegalStateException("You cannot pass null for identityManager.");
                }

                final SignInProvider provider = signInManager.getPreviouslySignedInProvider();

                // if the user was already previously signed-in to a provider.
                if (provider != null) {
                    Log.d(LOG_TAG, "Refreshing credentials with identity provider " + provider.getDisplayName());
                    // asynchronously handle refreshing credentials and call our handler.
                    signInManager.refreshCredentialsWithProvider(callingActivity,
                        provider, new SignInProviderResultHandler() {

                            @Override
                            public void onSuccess(final IdentityProvider provider) {
                                // The sign-in manager is no longer needed once signed in.
                                SignInManager.dispose();

                                Log.d(LOG_TAG, "Successfully got credentials from identity provider '"
                                    + provider.getDisplayName());

                                runAfterStartupAuthDelay(callingActivity, new Runnable() {
                                     @Override
                                     public void run() {
                                         startupAuthResultHandler.onComplete(new StartupAuthResult(IdentityManager.this, null));
                                     }
                                });
                            }

                            @Override
                            public void onCancel(final IdentityProvider provider) {
                                // Should never happen.
                                Log.wtf(LOG_TAG, "Cancel can't happen when handling a previously signed-in user.");
                            }

                            @Override
                            public void onError(final IdentityProvider provider, final Exception ex) {
                                Log.e(LOG_TAG,
                                    String.format("Cognito credentials refresh with %s provider failed. Error: %s",
                                        provider.getDisplayName(), ex.getMessage()), ex);

                                if (ex instanceof AuthException) {
                                    handleUnauthenticated(callingActivity, startupAuthResultHandler,
                                        (AuthException) ex);
                                } else {
                                    handleUnauthenticated(callingActivity, startupAuthResultHandler,
                                        new AuthException(provider, ex));
                                }
                            }
                        });
                } else {
                    handleUnauthenticated(callingActivity, startupAuthResultHandler, null);
                }

                if (minimumDelay > 0) {
                    // Wait for the splash timeout.
                    try {
                        Thread.sleep(minimumDelay);
                    } catch (final InterruptedException ex) {
                        Log.i(LOG_TAG, "Interrupted while waiting for startup auth timeout.");
                    }
                }

                // Expire the splash page delay.
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
    public void doStartupAuth(final Activity callingActivity,
                              final StartupAuthResultHandler startupAuthResultHandler) {
        doStartupAuth(callingActivity, startupAuthResultHandler, 0);
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
     */
    public void setUpToAuthenticate(final Context context,
                                    final SignInResultHandler signInResultHandler) {
        // Start the sign-in activity. We do not finish the calling activity allowing the user to navigate back.
        final SignInManager signInManager = SignInManager.getInstance(
            context.getApplicationContext());
        signInManager.setResultHandler(signInResultHandler);
    }

    private void setCredentialsProvider(final Context context,
                                        final CognitoCachingCredentialsProvider cachingCredentialsProvider) {
        credentialsProviderHolder.setUnderlyingProvider(cachingCredentialsProvider);
    }

    /**
     *   The CognitoCachingCredentialProvider loads cached credentials when it is
     *   instantiated, however, it does not reload the login map, which must be reloaded
     *   in order to refresh the credentials.  Therefore, currently cached credentials are
     *   only useful for unauthenticated users.
     */
    private void initializeCognito(final Context context,
                                   final ClientConfiguration clientConfiguration) {

        Log.d(LOG_TAG, "Initializing Cognito");

        final String region = getCognitoIdentityRegion();
        Regions cognitoIdentityRegion = Regions.fromName(region);
        
        setCredentialsProvider(context,
            new CognitoCachingCredentialsProvider(context, getCognitoIdentityPoolId(),
                cognitoIdentityRegion, clientConfiguration));

        final AWSRefreshingCognitoIdentityProvider refreshingCredentialsProvider =
            new AWSRefreshingCognitoIdentityProvider(null, getCognitoIdentityPoolId(),
                clientConfiguration, cognitoIdentityRegion);

        setCredentialsProvider(context,
            new CognitoCachingCredentialsProvider(context, refreshingCredentialsProvider,
                    cognitoIdentityRegion, clientConfiguration));
    }

    /**
     * Retrieve the Cognito IdentityPooldId from CognitoIdentity -> PoolId key
     *
     * @return PoolId
     * @throws IllegalArgumentException
     */
    private String getCognitoIdentityPoolId() throws IllegalArgumentException {
        try {
            return this.awsConfiguration
                .optJsonObject("CredentialsProvider")
                .getJSONObject("CognitoIdentity")
                .getJSONObject(this.awsConfiguration.getConfiguration())
                .getString("PoolId");
        } catch (Exception exception) {
            throw new IllegalArgumentException("Cannot access Cognito IdentityPoolId from the "
                    + AWS_CONFIGURATION_FILE + " file.", exception);
        }
    }

    /**
     * Retrieve the Cognito Region from CognitoIdentity -> Region key
     *
     * @return CognitoIdentity Region
     * @throws IllegalArgumentException
     */
    private String getCognitoIdentityRegion() throws IllegalArgumentException {
        try {
            return this.awsConfiguration
                  .optJsonObject("CredentialsProvider")
                  .getJSONObject("CognitoIdentity")
                  .getJSONObject(this.awsConfiguration.getConfiguration())
                  .getString("Region");
        } catch (Exception exception) {
            throw new IllegalArgumentException("Cannot find the Cognito Region from the "
                    + AWS_CONFIGURATION_FILE + " file.", exception);
        }
    }
}
