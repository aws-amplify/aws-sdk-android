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

package com.amazonaws.mobile.auth.core.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

import com.amazonaws.mobile.auth.core.IdentityManager;
import com.amazonaws.mobile.auth.core.IdentityProvider;
import com.amazonaws.mobile.auth.core.SignInResultHandler;
import com.amazonaws.mobile.auth.core.internal.util.ThreadUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The SignInManager is a singleton component, which orchestrates sign-in and sign-up flows. It is responsible for
 * discovering the previously signed-in provider and that provider's credentials, as well as initializing sign-in
 * buttons with the providers.
 */
public class SignInManager {
    /** Log Tag */
    private static final String LOG_TAG = SignInManager.class.getSimpleName();

    /** This map holds the class and the object of the sign-in providers */
    private final Map<Class<? extends SignInProvider>, SignInProvider> signInProviders 
        = new HashMap<Class<? extends SignInProvider>, SignInProvider>();

    /** Holds the Singleton instance */
    private volatile static SignInManager singleton = null;

    /** Reference to user's completion handler */
    private volatile SignInResultHandler signInResultHandler;

    /** permissions handler */
    private final SparseArray<SignInPermissionsHandler> providersHandlingPermissions 
        = new SparseArray<SignInPermissionsHandler>();

    /**
     * Constructor.
     */
    private SignInManager(final Context context) {

        for (Class<? extends SignInProvider> providerClass : IdentityManager.getDefaultIdentityManager().getSignInProviderClasses()) {
            final SignInProvider provider;
            try {
                provider = providerClass.newInstance();  
                if (provider != null) {
	                provider.initialize(context, IdentityManager.getDefaultIdentityManager().getConfiguration());
	                signInProviders.put(providerClass, provider);
	                if (provider instanceof SignInPermissionsHandler) {
	                    final SignInPermissionsHandler handler = (SignInPermissionsHandler) provider;
	                    providersHandlingPermissions.put(handler.getPermissionRequestCode(), handler);
	                }
                }
            } catch (final IllegalAccessException ex) {
                Log.e(LOG_TAG, "Unable to instantiate " + providerClass.getSimpleName() + " . Skipping this provider.");       
            } catch (final InstantiationException ex) {
            	Log.e(LOG_TAG, "Unable to instantiate " + providerClass.getSimpleName() + " . Skipping this provider.");
            }
            
        }

        singleton = this;
    }

    /**
     * Gets the singleton instance of this class.
     *
     * @return instance
     */
    public synchronized static SignInManager getInstance() {
        return singleton;
    }

    /**
     * Gets the singleton instance of this class.
     *
     * @return instance
     */
    public synchronized static SignInManager getInstance(final Context context) {
        if (singleton == null) {
            singleton = new SignInManager(context);
        }
        return singleton;
    }

    /**
     * Set the passed in SignInResultHandler
     *
     * @param signInResultHandler
     */
    public void setResultHandler(final SignInResultHandler signInResultHandler) {
        this.signInResultHandler = signInResultHandler;
    }

    /**
     * Retrieve the reference to SignInResultHandler
     *
     * @return SignInResultHandler
     */
    public SignInResultHandler getResultHandler() {
        return signInResultHandler;
    }

    /**
     * Dispose the SignInManager
     */
    public synchronized static void dispose() {
        singleton = null;
    }

    /**
     * Call getPreviouslySignedInProvider to determine if the user was left signed-in when the app
     * was last running.  This should be called on a background thread since it may perform file
     * i/o.  If the user is signed in with a provider, this will return the provider for which the
     * user is signed in.  Subsequently, refreshCredentialsWithProvider should be called with the
     * provider returned from this method.
     *
     * @return false if not already signed in, true if the user was signed in with a provider.
     */
    public SignInProvider getPreviouslySignedInProvider() {
    	
    	Log.d(LOG_TAG, "Providers: " + Collections.singletonList(signInProviders)); 

        for (final SignInProvider provider : signInProviders.values()) {
            // Note: This method may block. This loop could potentially be sped
            // up by running these calls in parallel using an executorService.
            if (provider.refreshUserSignInState()) {
            	Log.d(LOG_TAG, "Refreshing provider: " + provider.getDisplayName());
                return provider;
            }
        }
        return null;
    }

    private class SignInProviderResultAdapter implements SignInProviderResultHandler {
        final private SignInProviderResultHandler handler;
        final private Activity activity;

        private SignInProviderResultAdapter(final Activity activity,
                                            final SignInProviderResultHandler handler) {
            this.handler = handler;
            this.activity = activity;
        }

        private Activity getActivity() {
            return activity;
        }

        /** {@inheritDoc} */
        @Override
        public void onSuccess(final IdentityProvider provider) {
            ThreadUtils.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    handler.onSuccess(provider);
                }
            });
        }

        /** {@inheritDoc} */
        @Override
        public void onCancel(final IdentityProvider provider) {
            ThreadUtils.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    handler.onCancel(provider);
                }
            });
        }

        /** {@inheritDoc} */
        @Override
        public void onError(final IdentityProvider provider, final Exception ex) {
            ThreadUtils.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    handler.onError(provider, ex);
                }
            });
        }
    }

    private SignInProviderResultAdapter resultsAdapter;

    /**
     * Federate the token in the Sign-in Provider with Amazon Cognito
     * Federated Identities to get an identity that can be used to 
     * access AWS resources.
     * 
     * This involves retrieving the token from the Sign-in Provider and putting
     * into the loginsMap and setting it with the CredentialsProvider.
     * After setting it, a refresh operation is made to get an identity from Cognito.
     * 
     * @param activity the calling activity.
     * @param signInProvider the sign-in provider that was previously signed-in.
     * @param resultsHandler the handler to receive results for credential refresh.
     */
    public void refreshCredentialsWithProvider(final Activity activity,
                                               final IdentityProvider signInProvider,
                                               final SignInProviderResultHandler resultsHandler) {

        if (signInProvider == null) {
            throw new IllegalArgumentException("The sign-in provider cannot be null.");
        }

        if (signInProvider.getToken() == null) {
            resultsHandler.onError(signInProvider,
                new IllegalArgumentException("Given provider not previously logged in."));
        }

        resultsAdapter = new SignInProviderResultAdapter(activity, resultsHandler);
        IdentityManager.getDefaultIdentityManager().setProviderResultsHandler(resultsAdapter);
        IdentityManager.getDefaultIdentityManager().federateWithProvider(signInProvider);
    }

    /**
     * Sets the results handler results from sign-in with a provider. Results handlers are
     * always called on the UI thread.
     *
     * @param activity the calling activity.
     * @param resultsHandler the handler for results from sign-in with a provider.
     */
    public void setProviderResultsHandler(final Activity activity,
                                          final SignInProviderResultHandler resultsHandler) {
        resultsAdapter = new SignInProviderResultAdapter(activity, resultsHandler);
        // Set the final results handler with the identity manager.
        IdentityManager.getDefaultIdentityManager().setProviderResultsHandler(resultsAdapter);
    }

    /**
     * Call initializeSignInButton to initialize the logic for sign-in for a specific provider.
     *
     * @param providerType the SignInProvider class.
     * @param buttonView the view for the button associated with this provider.
     * @return the onClickListener for the button to be able to override the listener.
     */
    public View.OnClickListener initializeSignInButton(final Class<? extends SignInProvider> providerClass,
                                                       final View buttonView) {
        final SignInProvider provider = findProvider(providerClass);

        // Initialize the sign in button with the identity manager's results adapter.
        return provider.initializeSignInButton(resultsAdapter.getActivity(),
            buttonView, IdentityManager.getDefaultIdentityManager().getResultsAdapter());
    }

    private SignInProvider findProvider(final Class<? extends SignInProvider> providerClass) {

        final SignInProvider provider = signInProviders.get(providerClass);

        if (provider == null) {
            throw new IllegalArgumentException("No such provider : " + providerClass.getName());
        }

        return provider;
    }

    /**
     * Handle the Activity result for login providers.
     *
     * @param requestCode the request code.
     * @param resultCode the result code.
     * @param data result intent.
     * @return true if the sign-in manager handle the result, otherwise false.
     */
    public boolean handleActivityResult(final int requestCode, 
                                        final int resultCode, 
                                        final Intent data) {
        for (final SignInProvider provider : signInProviders.values()) {
            if (provider.isRequestCodeOurs(requestCode)) {
                provider.handleActivityResult(requestCode, resultCode, data);
                return true;
            }
        }

        return false;
    }

    /**
     * Handle the Activity request permissions result for sign-in providers.
     *
     * @param requestCode the request code.
     * @param permissions the permissions requested.
     * @param grantResults the grant results.
     */
    public void handleRequestPermissionsResult(final int requestCode, 
                                               final String permissions[],
                                               final int[] grantResults) {
        final SignInPermissionsHandler handler = providersHandlingPermissions.get(requestCode);
        if (handler != null) {
            handler.handleRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}
