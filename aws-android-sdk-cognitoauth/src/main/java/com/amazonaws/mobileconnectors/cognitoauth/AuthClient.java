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

package com.amazonaws.mobileconnectors.cognitoauth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import android.text.TextUtils;
import android.util.Log;

import com.amazonaws.cognito.clientcontext.data.UserContextDataProvider;
import com.amazonaws.mobileconnectors.cognitoauth.activities.CustomTabsManagerActivity;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthClientException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidGrantException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthNavigationException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthServiceException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.BrowserNotInstalledException;
import com.amazonaws.mobileconnectors.cognitoauth.util.AuthHttpResponseParser;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.AuthHttpClient;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;

import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION;

/**
 * Local client for {@link Auth}.
 * <p>
 *     Encapsulates user level operations, tokens {@link AuthUserSession}, handles
 *     token caching, and token refresh.
 *     Manages Cognito-Web user screens.
 * </p>
 */

@SuppressWarnings("checkstyle:javadocmethod")
public class AuthClient {
    /**
     * A random code the custom tabs activity is launched under.
     * This is needed by clients to listen for the result.
     */
    public static final int CUSTOM_TABS_ACTIVITY_CODE = 49281;

    /**
     * Namespace for logging client activities
     */
    private static final String TAG = AuthClient.class.getSimpleName();

    /**
     * Name of redirect activity in charge of handling auth responses.
     */
    private static final String REDIRECT_ACTIVITY_NAME = "HostedUIRedirectActivity";

    /**
     * Default timeout duration for auth redirects.
     */
    private static final long REDIRECT_TIMEOUT_SECONDS = 10;

    /**
     * Android application context.
     */
    private final Context context;

    /**
     * Reference to the parent pool.
     */
    private final Auth pool;

    /**
     * Username used to instantiate this class.
     */
    private String userId;

    /**
     * Generated proof-key for PKCE.
     */
    private String proofKey;

    /**
     * SHA256 hash of the generated proof-key.
     */
    private String proofKeyHash;

    /**
     * Session state - stores the unique string generated for to set state query parameter.
     */
    private String state;

    /**
     * Callback handler.
     */
    private AuthHandler userHandler;

    /**
     * Remembers whether redirect activity was found in manifest or not.
     */
    private boolean isRedirectActivityDeclared;

    /**
     * Cache whether browser is installed on the device.
     */
    private boolean isBrowserInstalled;

    /**
     * Cache whether there is browser that supports custom tabs on the device.
     */
    private boolean isCustomTabSupported;

    /**
     * Cache the packageName of the custom-tabs-service that should be used.
     */
    private String customTabsPackageName;

    // - Chrome Custom Tabs Controls
    private CustomTabsClient mCustomTabsClient;
    private CustomTabsSession mCustomTabsSession;
    private CustomTabsIntent mCustomTabsIntent;
    private CustomTabsServiceConnection mCustomTabsServiceConnection;

    private CountDownLatch cookiesCleared;

    /**
     * Constructs {@link AuthClient} with no user name.
     * @param context Required: The android application {@link Context}.
     * @param pool Required: A reference to the parent, {@link Auth}.
     */
    protected AuthClient(final Context context, final Auth pool) {
        this(context, pool, null);
    }

    /**
     * Constructs an instance of the Cognito User with username.
     * @param context Required: The android application {@link Context}.
     * @param pool Required:  A reference to the parent, {@link Auth}.
     * @param username Required: The username of the user in the Cognito User-Pool.
     */
    protected AuthClient(final Context context, final Auth pool, final String username) {
        this.context = context;
        this.pool = pool;
        this.userId = username;
        this.isRedirectActivityDeclared = false;
        this.isBrowserInstalled = false;
        this.isCustomTabSupported = false;
        if (isCustomTabSupported()) {
            preWarmCustomTabs();
        }
    }

    /**
     * Set callback handler for {@link AuthClient}.
     * @param handler Required: {@link AuthHandler}.
     */
    protected void setUserHandler(final AuthHandler handler) {
        if (handler == null) {
            throw new InvalidParameterException("Callback handler cannot be null");
        }
        userHandler = handler;
    }

    /**
     * Sets username.
     * @param username Required: Username as a {@link String}.
     */
    protected void setUsername(final String username) {
        this.userId = username;
    }

    /**
     * Launches user authentication screen and returns a redirect Uri through an {@link Intent}.
     * <p>
     *     Checks for cached, valid tokens and launches the Cognito Web UI if no valid tokens are
     *     found. This method uses PKCE for authentication. This SDK, therefore, uses code-grant flow
     *     to authenticate user. The proof-key and a state is generated and its hash is used in added
     *     as query parameters to create the authentication FQDN.
     *     The state value set this method is used to temporarily cache the proof-key on the device.
     *     To exchange the code for tokens, the {@link Auth#getTokens(Uri)} method will use the
     *     state in the redirect uri to fetch the stored proof-key.
     * </p>
     * @param showSignInIfExpired true if the web UI should launch when the session is expired
     * @param activity The activity to launch the sign in experience from.
     *                 This must not be null when showSignInIfExpired is true.
     */
    protected void getSession(final boolean showSignInIfExpired, final Activity activity) {
        getSession(showSignInIfExpired, activity, null);
    }

    /**
     * Launches user authentication screen and returns a redirect Uri through an {@link Intent}.
     * <p>
     *     Checks for cached, valid tokens and launches the Cognito Web UI if no valid tokens are
     *     found. This method uses PKCE for authentication. This SDK, therefore, uses code-grant flow
     *     to authenticate user. The proof-key and a state is generated and its hash is used in added
     *     as query parameters to create the authentication FQDN.
     *     The state value set this method is used to temporarily cache the proof-key on the device.
     *     To exchange the code for tokens, the {@link Auth#getTokens(Uri)} method will use the
     *     state in the redirect uri to fetch the stored proof-key.
     * </p>
     * @param showSignInIfExpired true if the web UI should launch when the session is expired
     * @param activity The activity to launch the sign in experience from.
     *                 This must not be null when showSignInIfExpired is true.
     * @param browserPackage String specifying the browser package to launch the specified url.
     */
    protected void getSession(final boolean showSignInIfExpired, final Activity activity, final String browserPackage) {
        try {
            proofKey = Pkce.generateRandom();
            proofKeyHash = Pkce.generateHash(proofKey);
            state = Pkce.generateRandom();
        } catch (Exception e) {
            userHandler.onFailure(e);
        }

        // Look for cached tokens
        AuthUserSession session =
                LocalDataManager.getCachedSession(pool.awsKeyValueStore, context, pool.getAppId(), userId, pool.getScopes());

        // Check if the session is valid and returns tokens
        if (session.isValidForThreshold()) {
            userHandler.onSuccess(session);
            return;
        }

        // Try refreshing the tokens
        if (session.getRefreshToken() != null && session.getRefreshToken().getToken() != null) {
            refreshSession(
                    session,
                    pool.getSignInRedirectUri(),
                    pool.getScopes(),
                    userHandler,
                    showSignInIfExpired,
                    browserPackage,
                    activity);
        } else if (showSignInIfExpired) {
            launchCognitoAuth(pool.getSignInRedirectUri(), pool.getScopes(), activity, browserPackage);
        } else {
            userHandler.onFailure(new Exception("No cached session"));
        }
    }

    /**
     * @return Current Username.
     */
    protected String getUsername() {
        return userId;
    }

    /**
     * Signs-out a user.
     * <p>
     *     Clears cached tokens for the user. Launches the sign-out Cognito web end-point to
     *     clear all Cognito Auth cookies stored by Chrome.
     * </p>
     */
    public void signOut() {
        signOut(null);
    }

    /**
     * Signs-out a user.
     * <p>
     *     Clears cached tokens for the user. Launches the sign-out Cognito web end-point to
     *     clear all Cognito Auth cookies stored by Chrome.
     * </p>
     *
     * @param browserPackage String specifying the browser package to launch the specified url.
     */
    public void signOut(String browserPackage) {
        signOut(false, browserPackage);
    }

    /**
     * Signs-out a user.
     * <p>
     *     Clears cached tokens for the user. Launches the sign-out Cognito web end-point to
     *     clear all Cognito Auth cookies stored by Chrome.
     * </p>
     *
     * @param clearLocalTokensOnly true if signs out the user from the client,
     *                             but the session may still be alive from the browser.
     */
    public void signOut(final boolean clearLocalTokensOnly) {
        signOut(clearLocalTokensOnly, null);
    }

    /**
     * Signs-out a user.
     * <p>
     *     Launches the sign-out Cognito web end-point to clear all Cognito Auth cookies stored
     *     by Chrome. Cached tokens will be deleted if sign-out redirect is completed.
     * </p>
     *
     * @param clearLocalTokensOnly true if signs out the user from the client,
     *                             but the session may still be alive from the browser.
     * @param browserPackage String specifying the browser package to launch the specified url.
     */
    public void signOut(final boolean clearLocalTokensOnly, final String browserPackage) {
        if (!clearLocalTokensOnly) {
            endSession(browserPackage);
        }

        // Delete local cache
        LocalDataManager.clearCache(pool.awsKeyValueStore, context, pool.getAppId(), userId);
    }

    /**
     * Ends current browser session.
     * @param browserPackage browser package to launch sign-out endpoint from.
     * @throws AuthClientException if sign-out redirect fails to resolve.
     */
    private void endSession(final String browserPackage) throws AuthClientException {
        boolean redirectReceived;
        try {
            cookiesCleared = new CountDownLatch(1);
            launchSignOut(pool.getSignOutRedirectUri(), browserPackage);
            if (!isRedirectActivityDeclared()) {
                cookiesCleared.countDown();
            }
            redirectReceived = cookiesCleared.await(REDIRECT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new AuthNavigationException("User cancelled sign-out.");
        }
        if (!redirectReceived) {
            throw new AuthServiceException("Timed out while waiting for sign-out redirect response.");
        }
    }

    /**
     * @return {@code true} if valid tokens are available for the user.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public boolean isAuthenticated() {
        AuthUserSession session =
                LocalDataManager.getCachedSession(pool.awsKeyValueStore, context, pool.getAppId(), userId, pool.getScopes());
        return session.isValidForThreshold();
    }

    /**
     * Exchanges code in the Uri for with Cognito JWT.
     * <p>Checks if the Uri passed to this method is valid. We can avoid a function </p>
     * @param uri Required: The redirect {@link Uri}.
     */
    public void getTokens(final Uri uri) {
        if (uri == null) {
            return;
        }
        getTokens(uri, userHandler);
    }

    /**
     * Properly handles the event where the user cancels out of the custom tabs auth flow either by closing it
     * or navigating back away from it.
     */
    public void handleCustomTabsCancelled() {
        userHandler.onFailure(new AuthNavigationException("user cancelled"));
    }

    /**
     * Unbind {@link AuthClient#mCustomTabsServiceConnection}
     */
    public void unbindServiceConnection() {
        if(mCustomTabsServiceConnection != null)
            context.unbindService(mCustomTabsServiceConnection);
    }

    /**
     * Internal method to exchange code for tokens.
     * <p>
     *     Checks if the Uri contains a <b>state</b> query parameter. The FQDN for Cognito UI
     *     Web-Page contains a state. This method considers Uri's without a state parameter as
     *     <b><logout</b> redirect.
     *     Checks if the value of the contained state variable is valid. This is necessary to ensure
     *     that the SDK is parsing response from a known source. The SDK reads cache for proof-key
     *     stored with the value of the state in the Uri. If a stored proof-key is found, the Uri
     *     contains response from a request it generated.
     *     Checks if the Uri contains an error query parameter. An error query parameter indicates
     *     that the last request failed. This method invokes
     *     {@link AuthHandler#onFailure(Exception)} callback to report failure.
     *     When the above tests succeed, this method makes an http call to Amazon Cognito token
     *     end-point to exchange code for tokens.
     * </p>
     * @param uri Required: The redirect uri from the service.
     * @param callback Required: {@link AuthHandler}.
     */
    private void getTokens(final Uri uri, final AuthHandler callback) {
        new Thread(new Runnable() {
            final Handler handler = new Handler(context.getMainLooper());
            Runnable returnCallback = new Runnable() {
                @Override
                public void run() {
                    callback.onFailure(new InvalidParameterException());
                }
            };
            @Override
            public void run() {
                final Uri fqdn = new Uri.Builder()
                        .scheme(ClientConstants.DOMAIN_SCHEME)
                        .authority(pool.getAppWebDomain())
                        .appendPath(ClientConstants.DOMAIN_PATH_OAUTH2)
                        .appendPath(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT)
                        .build();

                String callbackState =
                        uri.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_STATE);

                if (callbackState != null) {
                    Set<String> tokenScopes = LocalDataManager.getCachedScopes(pool.awsKeyValueStore, context, callbackState);
                    String proofKeyPlain = LocalDataManager.getCachedProofKey(pool.awsKeyValueStore, context, callbackState);

                    if (proofKeyPlain == null) {
                        // The state value is unknown, exit.
                        return;
                    }

                    final String errorText =
                            uri.getQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_ERROR);

                    if (errorText != null) {
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                callback.onFailure(new AuthServiceException(errorText));
                            }
                        };
                    } else {
                        // Make http POST call
                        final AuthHttpClient httpClient = new AuthHttpClient();
                        Map<String, String> httpHeaderParams = getHttpHeader();
                        Map<String, String> httpBodyParams = generateTokenExchangeRequest(uri, proofKeyPlain);

                        try {
                            String response =
                                    httpClient.httpPost(new URL(fqdn.toString()), httpHeaderParams, httpBodyParams);
                            final AuthUserSession session = AuthHttpResponseParser.parseHttpResponse(response);
                            userId = session.getUsername();

                            // Cache tokens if successful
                            LocalDataManager.cacheSession(pool.awsKeyValueStore, context, pool.getAppId(), userId, session, tokenScopes);

                            // Return tokens
                            returnCallback = new Runnable() {
                                @Override
                                public void run() {
                                    callback.onSuccess(session);
                                }
                            };
                        } catch (final Exception e) {
                            returnCallback = new Runnable() {
                                @Override
                                public void run() {
                                    callback.onFailure(e);
                                }
                            };
                        }
                    }
                } else {
                    if (cookiesCleared != null) {
                        cookiesCleared.countDown();
                        Log.d(TAG, "Sign-out was successful.");
                    }

                    // User sign-out.
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSignout();
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Internal method to refresh tokens.
     * <p>
     *     Makes an http call to Amazon Cognito token end-point to refresh token. On successful
     *     token refresh, the refresh tokens is retained.
     * </p>
     * @param session Required: The android application {@link Context}.
     * @param redirectUri Required: The redirect Uri, which will be launched after authentication.
     * @param tokenScopes Required: A {@link Set<String>} specifying all scopes for the tokens.
     * @param callback Required: {@link AuthHandler}.
     * @param showSignInIfExpired true if the web UI should launch when the refresh token is expired
     * @param browserPackage String specifying the browser package to launch the specified url.
     * @param activity The activity to launch the sign in experience from.
     *                 This must not be null if showSignInIfExpired is true.
     */
    private void refreshSession(final AuthUserSession session,
                                final String redirectUri,
                                final Set<String> tokenScopes,
                                final AuthHandler callback,
                                final boolean showSignInIfExpired,
                                final String browserPackage,
                                final Activity activity) {
        new Thread(new Runnable() {
            final Handler handler = new Handler(context.getMainLooper());
            Runnable returnCallback;

            @Override
            public void run() {
                final Uri fqdn = new Uri.Builder()
                        .scheme(ClientConstants.DOMAIN_SCHEME)
                        .authority(pool.getAppWebDomain())
                        .appendPath(ClientConstants.DOMAIN_PATH_OAUTH2)
                        .appendPath(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT)
                        .build();

                // Make http POST call
                final AuthHttpClient httpClient = new AuthHttpClient();
                Map<String, String> httpHeaderParams = getHttpHeader();
                Map<String, String> httpBodyParams = generateTokenRefreshRequest(redirectUri, session);

                try {
                    String response =
                            httpClient.httpPost(new URL(fqdn.toString()), httpHeaderParams, httpBodyParams);
                    AuthUserSession parsedSession = AuthHttpResponseParser.parseHttpResponse(response);
                    final AuthUserSession refreshedSession = new AuthUserSession(
                            parsedSession.getIdToken(),
                            parsedSession.getAccessToken(),
                            session.getRefreshToken());
                    final String username = refreshedSession.getUsername();

                    // Cache session
                    LocalDataManager.cacheSession(pool.awsKeyValueStore, context, pool.getAppId(), username, refreshedSession, pool.getScopes());

                    // Return tokens
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(refreshedSession);
                        }
                    };
                } catch (final AuthInvalidGrantException invg) {
                    if (showSignInIfExpired) {
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                launchCognitoAuth(redirectUri, tokenScopes, activity, browserPackage);
                            }
                        };
                    } else {
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                userHandler.onFailure(invg);
                            }
                        };
                    }
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Generates header for the http request.
     * @return Header parameters as a {@link Map<String, String>}.
     */
    private Map<String, String> getHttpHeader() {
        Map<String, String> httpHeaderParams = new HashMap<String, String>();
        httpHeaderParams.put(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE,
                ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT);

        // Add authorization header if the App Id has an associated Secret
        if (pool.getAppSecret() != null) {
            StringBuilder builder = new StringBuilder();
            builder.append(pool.getAppId()).append(":").append(pool.getAppSecret());
            httpHeaderParams.put(ClientConstants.HTTP_HEADER_TYPE_AUTHORIZE, "Basic "
                    + Pkce.encodeBase64(builder.toString()));
        }
        return httpHeaderParams;
    }

    /**
     * Generates http body for token exchange.
     * @param redirectUri Required: redirect_uri for token exchange.
     * @param proofKey Required: The proof key for tokens.
     * @return Http request as a {@link Map<String, String>}.
     */
    private Map<String, String> generateTokenExchangeRequest(final Uri redirectUri,
                                                             final String proofKey) {
        Map<String, String> httpBodyParams = new HashMap<String, String>();
        httpBodyParams.put(ClientConstants.TOKEN_GRANT_TYPE,
                ClientConstants.TOKEN_GRANT_TYPE_AUTH_CODE);
        httpBodyParams.put(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, pool.getAppId());
        httpBodyParams.put(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, pool.getSignInRedirectUri());
        httpBodyParams.put(ClientConstants.DOMAIN_QUERY_PARAM_CODE_VERIFIER, proofKey);
        httpBodyParams.put(ClientConstants.TOKEN_AUTH_TYPE_CODE,
                redirectUri.getQueryParameter(ClientConstants.TOKEN_AUTH_TYPE_CODE));
        return httpBodyParams;
    }

    /**
     * Generates http body for token refresh.
     * @param redirectUri Required: redirect_uri for token refresh.
     * @param session Required: User session containing the refresh token.
     * @return Http request as a {@link Map<String, String>}.
     */
    private Map<String, String> generateTokenRefreshRequest(final String redirectUri,
                                                            final AuthUserSession session) {
        Map<String, String> httpBodyParams = new HashMap<String, String>();
        httpBodyParams.put(ClientConstants.TOKEN_GRANT_TYPE, ClientConstants.HTTP_REQUEST_REFRESH_TOKEN);
        httpBodyParams.put(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, redirectUri);
        httpBodyParams.put(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, pool.getAppId());
        httpBodyParams.put(ClientConstants.HTTP_REQUEST_REFRESH_TOKEN, session.getRefreshToken().getToken());
        final String userContextData = getUserContextData();
        if (userContextData != null) {
            httpBodyParams.put(ClientConstants.DOMAIN_QUERY_PARAM_USERCONTEXTDATA, userContextData);
        }
        return httpBodyParams;
    }

    /**
     * Creates the FQDM for Cognito's authentication endpoint and launches Cognito Auth web-domain.
     * @param redirectUri Required: The redirect Uri, which will be launched after authentication.
     * @param tokenScopes Required: A {@link Set<String>} specifying all scopes for the tokens.
     * @param activity The activity to launch the sign in experience from.
     *                 This must not be null if showSignInIfExpired is true.
     * @param browserPackage String specifying the browser package to launch the specified url.
     */
    private void launchCognitoAuth(
            final String redirectUri,
            final Set<String> tokenScopes,
            final Activity activity,
            final String browserPackage) {
        // Build the complete web domain to launch the login screen
        Uri.Builder builder = new Uri.Builder()
                .scheme(ClientConstants.DOMAIN_SCHEME)
                .authority(pool.getAppWebDomain())
                .appendPath(ClientConstants.DOMAIN_PATH_OAUTH2)
                .appendPath(ClientConstants.DOMAIN_PATH_SIGN_IN)
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, pool.getAppId())
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, redirectUri)
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_RESPONSE_TYPE,
                        ClientConstants.AUTH_RESPONSE_TYPE_CODE)
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, proofKeyHash)
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD,
                        ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD_SHA256)
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_STATE, state)
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_USERCONTEXTDATA, getUserContextData());;

        //check if identity provider set as param.
        if (!TextUtils.isEmpty(pool.getIdentityProvider())) {
            builder.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER, pool.getIdentityProvider());
        }
        //check if idp identifier set as param.
        if (!TextUtils.isEmpty(pool.getIdpIdentifier())) {
            builder.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_IDP_IDENTIFIER, pool.getIdpIdentifier());
        }

        // Convert scopes into a string of comma separated values.
        final int noOfScopes = tokenScopes.size();
        if (noOfScopes > 0) {
            StringBuilder strBuilder = new StringBuilder();
             int index = 0;
            for (String scope: tokenScopes) {
                strBuilder.append(scope);
                if (index++ < noOfScopes - 1) {
                    strBuilder.append(" ");
                }
            }
            final String scopesStr = strBuilder.toString();
            builder.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, scopesStr);
        }

        final Uri fqdn = builder.build();
        LocalDataManager.cacheState(pool.awsKeyValueStore, context, state, proofKey, tokenScopes);
        launchCustomTabs(fqdn, activity, browserPackage);
    }

    /**
     * Creates the FQDM for Cognito's sign-out endpoint and launches Cognito Auth Web-Domain to
     * sign-out.
     * @param redirectUri Required: The redirect Uri, which will be launched after authentication.
     * @param browserPackage String specifying the browser package to launch the specified url.
     */
    private void launchSignOut(final String redirectUri, final String browserPackage) {
        Uri.Builder builder = new Uri.Builder()
                .scheme(ClientConstants.DOMAIN_SCHEME)
                .authority(pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_SIGN_OUT)
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, pool.getAppId())
                .appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_LOGOUT_URI, redirectUri);
        final Uri fqdn = builder.build();
        launchCustomTabs(fqdn, null, browserPackage);
    }

    /***
     * Check if a browser is installed on the device to launch HostedUI.
     * @return true if a browser exists else false.
     */
    private boolean isBrowserInstalled() {
        if (isBrowserInstalled) {
            return true;
        }
        String url = "https://docs.amplify.aws/";
        Uri webAddress = Uri.parse(url);
        Intent intentWeb = new Intent(Intent.ACTION_VIEW, webAddress);
        if (intentWeb.resolveActivity(context.getPackageManager()) != null) {
            isBrowserInstalled = true;
            return true;
        }
        return false;
    }

    /**
     * Get list of packages that support Custom Tabs Service.
     * @return list of package names that support Custom Tabs.
     */
    private List<String> getSupportedCustomTabsPackages() {
        PackageManager packageManager = context.getPackageManager();
        Intent serviceIntent = new Intent()
                .setAction(ACTION_CUSTOM_TABS_CONNECTION);

        // Get all services that can handle ACTION_CUSTOM_TABS_CONNECTION intents.
        List<ResolveInfo> resolvedServicesList = packageManager.queryIntentServices(serviceIntent, 0);
        List<String> packageNamesSupportingCustomTabs = new ArrayList<>();
        for (ResolveInfo info : resolvedServicesList) {
            packageNamesSupportingCustomTabs.add(info.serviceInfo.packageName);
        }
        return packageNamesSupportingCustomTabs;
    }

    /***
     * Check if there are any browsers on the device that support custom tabs.
     * @return true if custom tabs is supported by any browsers on the device else false.
     */
    private boolean isCustomTabSupported() {
        if (isCustomTabSupported) {
            return true;
        }
        List<String> supportedCustomTabsPackages = getSupportedCustomTabsPackages();
        if (supportedCustomTabsPackages.size() > 0) {
            isCustomTabSupported = true;
            // get the preferred Custom Tabs package
            customTabsPackageName = CustomTabsClient.getPackageName(
                    context,
                    supportedCustomTabsPackages
            );
            return true;
        }
        return false;
    }

    /**
     * Launches the HostedUI webpage on a Custom Tab.
     * @param uri Required: {@link Uri}.
     * @param activity Activity to launch custom tabs from and which will listen for the intent completion.
     * @param browserPackage Optional string specifying the browser package to launch the specified url.
     *                       Launches intent chooser if set to null.
     */
    private void launchCustomTabs(final Uri uri, final Activity activity, final String browserPackage) {
    	try {
            if(!isBrowserInstalled()) {
                userHandler.onFailure(new BrowserNotInstalledException("No browsers installed."));
                return;
            }
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(mCustomTabsSession);
            mCustomTabsIntent = builder.build();
            if(pool.getCustomTabExtras() != null) {
                mCustomTabsIntent.intent.putExtras(pool.getCustomTabExtras());
            }
            if(browserPackage != null) {
                mCustomTabsIntent.intent.setPackage(browserPackage);
            } else if (customTabsPackageName != null) {
                mCustomTabsIntent.intent.setPackage(customTabsPackageName);
            }
            mCustomTabsIntent.intent.setData(uri);
            if (activity != null) {
                activity.startActivityForResult(
                    CustomTabsManagerActivity.createStartIntent(context, mCustomTabsIntent.intent),
                    CUSTOM_TABS_ACTIVITY_CODE
                );
            } else {
                Intent startIntent = CustomTabsManagerActivity.createStartIntent(context, mCustomTabsIntent.intent);
                startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
                context.startActivity(startIntent);
            }
    	} catch (final Exception e) {
            userHandler.onFailure(e);
        }
    }

    private String getUserContextData() {
        String userContextData = null;
        if (pool.isAdvancedSecurityDataCollectionEnabled()) {
            UserContextDataProvider dataProvider = UserContextDataProvider.getInstance();
            userContextData = dataProvider.getEncodedContextData(this.context, userId, pool.getUserPoolId(),
                    pool.getAppId());
        }
        return userContextData;
    }

    /**
     * Connects to Custom Tabs Service on the device.
     */
    private void preWarmCustomTabs() {
        if (customTabsPackageName == null) {
            return;
        }
        mCustomTabsServiceConnection = new CustomTabsServiceConnection() {
            @Override
            public void onCustomTabsServiceConnected(final ComponentName name, final CustomTabsClient client) {
                mCustomTabsClient = client;
                mCustomTabsClient.warmup(0L);
                mCustomTabsSession = mCustomTabsClient.newSession(null);
            }

            @Override
            public void onServiceDisconnected(final ComponentName name) {
                mCustomTabsClient = null;
            }
        };
        CustomTabsClient.bindCustomTabsService(
                context,
                customTabsPackageName,
                mCustomTabsServiceConnection
        );
    }

    // Inspects context to determine whether HostedUIRedirectActivity is declared in
    // customer's AndroidManifest.xml.
    private boolean isRedirectActivityDeclared() {
        // If the activity was found at least once, then don't bother searching again.
        if (isRedirectActivityDeclared) {
            return true;
        }
        if (context == null) {
            Log.w(TAG, "Context is null. Failed to inspect packages.");
            return false;
        }
        try {
            List<PackageInfo> packages = context.getPackageManager()
                    .getInstalledPackages(PackageManager.GET_ACTIVITIES);
            for (PackageInfo packageInfo : packages) {
                if (packageInfo.activities == null) {
                    continue;
                }
                for (ActivityInfo activityInfo : packageInfo.activities) {
                    if (activityInfo.name.contains(REDIRECT_ACTIVITY_NAME)) {
                        isRedirectActivityDeclared = true;
                        return true;
                    }
                }
            }
            Log.w(TAG, REDIRECT_ACTIVITY_NAME + " is not declared in AndroidManifest.");
        } catch (Exception error) {
            Log.w(TAG, "Failed to inspect packages.");
        }
        return false;
    }
}
