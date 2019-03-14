/*
 * Copyright 2017-2019 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobile.client;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsCallback;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSAbstractCognitoIdentityProvider;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobile.auth.core.IdentityManager;
import com.amazonaws.mobile.auth.core.SignInStateChangeListener;
import com.amazonaws.mobile.auth.core.StartupAuthResult;
import com.amazonaws.mobile.auth.core.StartupAuthResultHandler;
import com.amazonaws.mobile.auth.core.signin.SignInProvider;
import com.amazonaws.mobile.auth.facebook.FacebookButton;
import com.amazonaws.mobile.auth.facebook.FacebookSignInProvider;
import com.amazonaws.mobile.auth.google.GoogleButton;
import com.amazonaws.mobile.auth.google.GoogleSignInProvider;
import com.amazonaws.mobile.auth.ui.AuthUIConfiguration;
import com.amazonaws.mobile.auth.ui.SignInUI;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobile.client.internal.InternalCallback;
import com.amazonaws.mobile.client.internal.ReturningRunnable;
import com.amazonaws.mobile.client.internal.oauth2.AuthorizeResponse;
import com.amazonaws.mobile.client.internal.oauth2.OAuth2Client;
import com.amazonaws.mobile.client.internal.oauth2.OAuth2Tokens;
import com.amazonaws.mobile.client.results.ForgotPasswordResult;
import com.amazonaws.mobile.client.results.ForgotPasswordState;
import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.SignInState;
import com.amazonaws.mobile.client.results.SignUpResult;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobile.client.results.UserCodeDeliveryDetails;
import com.amazonaws.mobile.config.AWSConfigurable;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoauth.Auth;
import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserAttributes;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.CognitoIdentityProviderContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ForgotPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.NewPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GetDetailsHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.UpdateAttributesHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.VerificationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoPinpointSharedContext;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.NotAuthorizedException;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.GlobalSignOutRequest;
import com.amazonaws.util.StringUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * The AWSMobileClient provides client APIs and building blocks for developers who want to create
 * user authentication experiences. This includes declarative methods for performing
 * authentication actions, a simple “drop-in auth” UI for performing common tasks, automatic
 * token and credentials management, and state tracking with notifications for performing
 * workflows in your application when users have authenticated.
 *
 * The following demonstrates a simple sample usage inside of MainActivity.java onCreate method.
 * <pre>
 * {@code
 * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback<UserStateDetails>() {
 *     public void onResult(UserStateDetails userStateDetails) {
 *         switch (userStateDetails.getUserState()) {
 *             case SIGNED_IN:
 *                 break;
 *             case SIGNED_OUT:
 *                 try {
 *                     AWSMobileClient.getInstance().showSignIn(MainActivity.this);
 *                 } catch (Exception e) {
 *                     Log.e("TAG", "", e);
 *                 }
 *                 break;
 *             default:
 *                 Log.w("Unhandled state see UserState for a list of states");
 *                 break;
 *         }
 *     }
 * })
 * }
 * </pre>
 */
public final class AWSMobileClient implements AWSCredentialsProvider {
    /**
     * Log Tag.
     */
    private static final String TAG = AWSMobileClient.class.getSimpleName();
    public static final String USER_AGENT = "AWSMobileClient";

    static final String SHARED_PREFERENCES_KEY = "com.amazonaws.mobile.client";
    static final String PROVIDER_KEY = "provider";
    static final String TOKEN_KEY = "token";
    static final String IDENTITY_ID_KEY = "cognitoIdentityId";
    static final String SIGN_IN_MODE = "signInMode";
    public static final String HOSTED_UI_KEY = "hostedUI";

    /// This value is a boolean stored as a String 'true' 'false'
    static final String FEDERATION_ENABLED_KEY = "isFederationEnabled";
    private static final String CUSTOM_ROLE_ARN_KEY = "customRoleArn";
    /**
     * Configuration keys for SignInProviders in awsconfiguration.json.
     */
    private static final String USER_POOLS = "CognitoUserPool";
    private static final String FACEBOOK = "FacebookSignIn";
    private static final String GOOGLE = "GoogleSignIn";
    private static final String GOOGLE_WEBAPP_CONFIG_KEY = "ClientId-WebApp";
    /**
     * Singleton instance for AWSMobileClient.
     */
    private static volatile AWSMobileClient singleton = null;
    /**
     * Map of SDK Client Class and object.
     */
    private final LinkedHashMap<Class<? extends AWSConfigurable>, AWSConfigurable> clientMap;
    /**
     * AWSConfiguration object that represents the `awsconfiguration.json` file.
     */
    private AWSConfiguration awsConfiguration;
    /**
     * Federation into this identity pool
     */
    CognitoCachingCredentialsProvider cognitoIdentity;
    /**
     * Object that encapuslates the high-level Cognito UserPools client
     */
    CognitoUserPool userpool;
    String userpoolsLoginKey;
    Context mContext;
    Map<String, String> mFederatedLoginsMap;
    private UserStateDetails userStateDetails;
    private Lock mWaitForSignInLock;
    private volatile CountDownLatch mSignedOutWaitLatch;
    CognitoUserSession mCognitoUserSession;
    // Sign-in continuation callbacks given by customer
    private Callback<SignInResult> signInCallback;
    // Internal tracking continuation
    private MultiFactorAuthenticationContinuation signInMfaContinuation;
    private ChallengeContinuation signInChallengeContinuation;
    private SignInState signInState;
    // Forgot password continuation callbacks given by customer
    private Callback<ForgotPasswordResult> forgotPasswordCallback;
    // Forgot password continuation
    private ForgotPasswordContinuation forgotPasswordContinuation;
    // Sign-up user
    private CognitoUser signUpUser;
    // Setup TOTP callback given by customer
//    private Callback<SetupTotpResult> totpCallback;
    // Internal tracking setup TOTP
//    private String totpSessionToken;
//    private VerifyMfaContinuation totpContinuation;
    /**
     * CredentialsProvider created by the IdentityManager.
     */
    private AWSCredentialsProvider awsCredentialsProvider;
    /**
     * Config of SignInProviders: class and permissions.
     */
    private SignInProviderConfig[] signInProviderConfig;
    /**
     * Callback for resuming auth session.
     */
    private StartupAuthResultHandler startupAuthResultHandler;
    /**
     * Callback for initalizing the SDK with AWSMobileClient.
     */
    private AWSStartupHandler awsStartupHandler;
    /**
     * Flag to use default config automatically.
     * Use the default configuration information if TRUE.
     */
    private boolean mIsLegacyMode;
    List<UserStateListener> listeners;
    private Object showSignInLockObject;
    private volatile CountDownLatch showSignInWaitLatch;
    private Object federateWithCognitoIdentityLockObject;
    private Object initLockObject;
    AWSMobileClientStore mStore;
    AWSMobileClientCognitoIdentityProvider provider;
    DeviceOperations mDeviceOperations;
    AmazonCognitoIdentityProvider userpoolLL;
    private Auth hostedUIJSONConfigured;
    private Auth hostedUI;
    OAuth2Client mOAuth2Client;
    String mUserPoolPoolId;

    enum SignInMode {
        SIGN_IN("0"),
        FEDERATED_SIGN_IN("1"),
        HOSTED_UI("2"),
        OAUTH2("3"),
        UNKNOWN("-1"),
        ;

        String encode;

        SignInMode(final String encode) {
            this.encode = encode;
        }

        public String toString() {
            return encode;
        }

        static SignInMode fromString(final String str) {
            if ("0".equals(str)) {
                return SIGN_IN;
            } else if ("1".equals(str)) {
                return FEDERATED_SIGN_IN;
            } else if ("2".equals(str)) {
                return HOSTED_UI;
            } else if ("3".equals(str)) {
                return OAUTH2;
            }
            return UNKNOWN;
        }
    }

    /**
     * Flag that indicates if the tokens would be persisted in SharedPreferences.
     * By default, this is set to true. If set to false, the tokens would be
     * kept in memory.
     */
    boolean mIsPersistenceEnabled = true;

    /**
     * Constructor invoked by getInstance.
     *
     * @throws AssertionError when this is called with context more than once.
     */
    private AWSMobileClient() {
        if (singleton != null) {
            throw new AssertionError();
        }
        this.clientMap = new LinkedHashMap<Class<? extends AWSConfigurable>, AWSConfigurable>();
        userpoolsLoginKey = "";
        mWaitForSignInLock = new ReentrantLock();
        mFederatedLoginsMap = new HashMap<String, String>();
        listeners = new ArrayList<UserStateListener>();
        showSignInLockObject = new Object();
        federateWithCognitoIdentityLockObject = new Object();
        showSignInWaitLatch = new CountDownLatch(1);
        initLockObject = new Object();
    }

    /**
     * Gets the singleton instance of this class.
     *
     * @return singleton instance
     */
    public static synchronized AWSMobileClient getInstance() {
        if (singleton == null) {
            singleton = new AWSMobileClient();
        }
        return singleton;
    }

    /**
     * Retrieve the AWSConfiguration object that represents
     * the awsconfiguration.json file.
     *
     * @return the AWSConfiguration object
     */
    public AWSConfiguration getConfiguration() {
        return this.awsConfiguration;
    }

    @Override
    public AWSCredentials getCredentials() {
        if (isLegacyMode()) {
            return IdentityManager.getDefaultIdentityManager().getCredentialsProvider().getCredentials();
        }

        if (cognitoIdentity == null) {
            throw new AmazonClientException("Cognito Identity not configured");
        }

        try {
            if (waitForSignIn()) {
                Log.d(TAG, "getCredentials: Validated user is signed-in");
            }

            AWSSessionCredentials credentials = cognitoIdentity.getCredentials();
            mStore.set(IDENTITY_ID_KEY, cognitoIdentity.getIdentityId());
            return credentials;
        } catch (NotAuthorizedException e) {
            Log.w(TAG, "getCredentials: Failed to getCredentials from Cognito Identity", e);
            throw new AmazonClientException("Failed to get credentials from Cognito Identity", e);
        } catch (Exception e) {
            throw new AmazonClientException("Failed to get credentials from Cognito Identity", e);
        }
    }

    @Override
    public void refresh() {
        if (isLegacyMode()) {
            IdentityManager.getDefaultIdentityManager().getCredentialsProvider().refresh();
            return;
        }

        if (cognitoIdentity == null) {
            throw new AmazonClientException("Cognito Identity not configured");
        }

        cognitoIdentity.refresh();
        mStore.set(IDENTITY_ID_KEY, cognitoIdentity.getIdentityId());
    }

    /**
     * Returns AWSCredentials obtained from Cognito Identity
     * @return AWSCredentials obtained from Cognito Identity
     * @throws Exception
     */
    public AWSCredentials getAWSCredentials() throws Exception {
        return _getAWSCredentials().await();
    }

    public void getAWSCredentials(final Callback<AWSCredentials> callback) {
        _getAWSCredentials().async(callback);
    }

    private ReturningRunnable<AWSCredentials> _getAWSCredentials() {
        return new ReturningRunnable<AWSCredentials>() {
            @Override
            public AWSCredentials run() {
                return getCredentials();
            }
        };
    }

    public String getIdentityId() {
        if (isLegacyMode()) {
            return IdentityManager.getDefaultIdentityManager().getCachedUserID();
        }

        if (cognitoIdentity == null) {
            throw new RuntimeException("Cognito Identity not configured");
        }

        final String cachedIdentityId = cognitoIdentity.getCachedIdentityId();
        if (cachedIdentityId == null) {
            return mStore.get(IDENTITY_ID_KEY);
        }

        return cachedIdentityId;
    }

    boolean isLegacyMode() {
        return mIsLegacyMode;
    }

    public void initialize(final Context context, final Callback<UserStateDetails> callback) {
        final Context applicationContext = context.getApplicationContext();
        initialize(applicationContext, new AWSConfiguration(applicationContext), callback);
    }

    public void initialize(final Context context, final AWSConfiguration awsConfig, final Callback<UserStateDetails> callback) {
        final InternalCallback internalCallback = new InternalCallback<UserStateDetails>(callback);
        internalCallback.async(_initialize(context, awsConfig, internalCallback));
    }

    CountDownLatch getSignInUILatch() {
        return showSignInWaitLatch;
    }

    protected Runnable _initialize(final Context context, final AWSConfiguration awsConfig, final Callback<UserStateDetails> callback) {
        return new Runnable() {
            public void run() {
                synchronized (initLockObject) {
                    if (mContext != null) {
                        callback.onResult(getUserStateDetails(true));
                        return;
                    }

                    awsConfiguration = awsConfig;

                    mIsPersistenceEnabled = true; // Default value
                    // Read Persistence key from the awsconfiguration.json and set the flag
                    // appropriately.
                    try {
                        if (awsConfiguration.optJsonObject("Auth") != null &&
                                awsConfiguration.optJsonObject("Auth").has("Persistence")) {
                            mIsPersistenceEnabled = awsConfiguration
                                    .optJsonObject("Auth")
                                    .getBoolean("Persistence");
                        }
                    } catch (final Exception ex) {
                        // If reading from awsconfiguration.json fails, invoke callback.
                        callback.onError(new RuntimeException("Failed to initialize AWSMobileClient; please check your awsconfiguration.json", ex));
                        return;
                    }

                    mContext = context.getApplicationContext();
                    mStore = new AWSMobileClientStore(AWSMobileClient.this);

                    final IdentityManager identityManager = new IdentityManager(mContext);
                    identityManager.enableFederation(false);
                    identityManager.setConfiguration(awsConfiguration);
                    identityManager.setPersistenceEnabled(mIsPersistenceEnabled);
                    IdentityManager.setDefaultIdentityManager(identityManager);
                    registerConfigSignInProviders();
                    identityManager.addSignInStateChangeListener(new SignInStateChangeListener() {
                        @Override
                        public void onUserSignedIn() {
                            Log.d(TAG, "onUserSignedIn: Updating user state from drop-in UI");
                            signInState = SignInState.DONE;
                            com.amazonaws.mobile.auth.core.IdentityProvider currentIdentityProvider = identityManager.getCurrentIdentityProvider();
                            String token = currentIdentityProvider.getToken();
                            String providerKey = currentIdentityProvider.getCognitoLoginKey();
                            federatedSignInWithoutAssigningState(providerKey, token, new Callback<UserStateDetails>() {
                                @Override
                                public void onResult(UserStateDetails result) {
                                    Log.d(TAG, "onResult: showSignIn federated");
                                    setUserState(getUserStateDetails(false));
                                    getSignInUILatch().countDown();
                                }

                                @Override
                                public void onError(Exception e) {
                                    Log.w(TAG, "onError: User sign-in had errors from drop-in UI", e);
                                    setUserState(getUserStateDetails(false));
                                    getSignInUILatch().countDown();
                                }
                            });
                        }

                        @Override
                        public void onUserSignedOut() {
                            Log.d(TAG, "onUserSignedOut: Updating user state from drop-in UI");
                            setUserState(getUserStateDetails(false));
                            showSignInWaitLatch.countDown();
                        }
                    });

                    if (awsConfiguration.optJsonObject("CredentialsProvider") != null
                            && awsConfiguration.optJsonObject("CredentialsProvider").optJSONObject("CognitoIdentity") != null) {
                        try {
                            JSONObject identityPoolJSON = awsConfiguration.optJsonObject(
                                    "CredentialsProvider").getJSONObject("CognitoIdentity").getJSONObject(awsConfiguration.getConfiguration());
                            final String poolId = identityPoolJSON.getString("PoolId");
                            final String regionStr = identityPoolJSON.getString("Region");
                            final ClientConfiguration clientConfig = new ClientConfiguration();
                            clientConfig.setUserAgent(USER_AGENT + " " + awsConfiguration.getUserAgent());
                            AmazonCognitoIdentityClient cibClient =
                                    new AmazonCognitoIdentityClient(new AnonymousAWSCredentials());
                            cibClient.setRegion(Region.getRegion(regionStr));
                            provider = new AWSMobileClientCognitoIdentityProvider(
                                    null, poolId, cibClient);
                            cognitoIdentity = new CognitoCachingCredentialsProvider(
                                    mContext, provider, Regions.fromName(regionStr));
                            cognitoIdentity.setPersistenceEnabled(mIsPersistenceEnabled);
                        } catch (Exception e) {
                            callback.onError(new RuntimeException("Failed to initialize Cognito Identity; please check your awsconfiguration.json", e));
                            return;
                        }
                    }

                    final JSONObject userPoolJSON = awsConfiguration.optJsonObject("CognitoUserPool");
                    if (userPoolJSON != null) {
                        try {
                            mUserPoolPoolId = userPoolJSON.getString("PoolId");
                            final String clientId = userPoolJSON.getString("AppClientId");
                            final String clientSecret = userPoolJSON.optString("AppClientSecret");
                            final String pinpointEndpointId = CognitoPinpointSharedContext.getPinpointEndpoint(context, userPoolJSON.optString("PinpointAppId"));

                            final ClientConfiguration clientConfig = new ClientConfiguration();
                            clientConfig.setUserAgent(USER_AGENT + " " + awsConfiguration.getUserAgent());
                            userpoolLL =
                                    new AmazonCognitoIdentityProviderClient(new AnonymousAWSCredentials(), clientConfig);
                            userpoolLL.setRegion(com.amazonaws.regions.Region.getRegion(Regions.fromName(userPoolJSON.getString("Region"))));

                            userpoolsLoginKey = String.format("cognito-idp.%s.amazonaws.com/%s", userPoolJSON.getString("Region"), userPoolJSON.getString("PoolId"));

                            userpool = new CognitoUserPool(mContext, mUserPoolPoolId, clientId, clientSecret, userpoolLL, pinpointEndpointId);
                            userpool.setPersistenceEnabled(mIsPersistenceEnabled);

                            mDeviceOperations = new DeviceOperations(AWSMobileClient.this, userpoolLL);

                        } catch (Exception e) {
                            callback.onError(new RuntimeException("Failed to initialize Cognito Userpool; please check your awsconfiguration.json", e));
                            return;
                        }
                    }

                    JSONObject hostedUIJSON = getHostedUIJSON();
                    if (hostedUIJSON != null) {
                        try {
                            // Pre-warm the Custom Tabs based on
                            if (hostedUIJSON.has("TokenURI")) {
                                Log.d(TAG, "initialize: OAuth2 client detected");
                                mOAuth2Client = new OAuth2Client(mContext, AWSMobileClient.this);
                                mOAuth2Client.setPersistenceEnabled(mIsPersistenceEnabled);
                            } else {
                                Log.d(TAG, "initialize: Cognito HostedUI client detected");
                                final JSONArray scopesJSONArray = hostedUIJSON.getJSONArray("Scopes");
                                final Set<String> scopes = new HashSet<String>();
                                for (int i = 0; i < scopesJSONArray.length(); i++) {
                                    scopes.add(scopesJSONArray.getString(i));
                                }

                                if (mUserPoolPoolId == null) {
                                    throw new IllegalStateException("User pool Id must be available through user pool setting");
                                }

                                hostedUIJSONConfigured = getHostedUI(hostedUIJSON)
                                        .setPersistenceEnabled(mIsPersistenceEnabled)
                                        .setAuthHandler(new AuthHandler() {
                                            @Override
                                            public void onSuccess(AuthUserSession session) {
                                                // Ignored because this is used to pre-warm the session
                                            }

                                            @Override
                                            public void onSignout() {
                                                // Ignored because this is used to pre-warm the session
                                            }

                                            @Override
                                            public void onFailure(Exception e) {
                                                // Ignored because this is used to pre-warm the session
                                            }
                                        })
                                        .build();
                            }
                        } catch (Exception e) {
                            callback.onError(new RuntimeException("Failed to initialize OAuth, please check your awsconfiguration.json", e));
                        }
                    }

                    if (cognitoIdentity == null && userpool == null) {
                        callback.onError(new RuntimeException(
                                "Neither Cognito Identity or Cognito UserPool was used." +
                                " At least one must be present to use AWSMobileClient."));
                        return;
                    }

                    final UserStateDetails userStateDetails = getUserStateDetails(true);
                    callback.onResult(userStateDetails);
                    setUserState(userStateDetails);
                }
            }
        };
    }

    JSONObject getHostedUIJSONFromJSON() {
        final JSONObject mobileClientJSON = awsConfiguration.optJsonObject("Auth");
        if (mobileClientJSON != null && mobileClientJSON.has("OAuth")) {
            try {
                JSONObject hostedUIJSONFromJSON = mobileClientJSON.getJSONObject("OAuth");

                return hostedUIJSONFromJSON;
            } catch (Exception e) {
                Log.w(TAG, "getHostedUIJSONFromJSON: Failed to read config", e);
            }
        }
        return null;
    }

    JSONObject getHostedUIJSON() {
        try {
            JSONObject hostedUIJSONFromJSON = getHostedUIJSONFromJSON();
            if (hostedUIJSONFromJSON == null) {
                return null;
            }

            final String hostedUIString = mStore.get(HOSTED_UI_KEY);
            JSONObject hostedUIJSON = null;
            try {
                hostedUIJSON = new JSONObject(hostedUIString);
            } catch (Exception e) {
                Log.w(TAG,
                        "Failed to parse HostedUI settings from store. Defaulting to awsconfiguration.json", e);
            }
            if (hostedUIJSON == null && hostedUIJSONFromJSON != null) {
                hostedUIJSON = new JSONObject(hostedUIJSONFromJSON.toString());
                mStore.set(HOSTED_UI_KEY, hostedUIJSON.toString());
            }
            return hostedUIJSON;
        } catch (Exception e) {
            Log.d(TAG, "getHostedUIJSON: Failed to read config", e);
        }
        return null;
    }

    Auth.Builder getHostedUI(final JSONObject hostedUIJSON) throws JSONException {
        final JSONArray scopesJSONArray = hostedUIJSON.getJSONArray("Scopes");
        final Set<String> scopes = new HashSet<String>();
        for (int i = 0; i < scopesJSONArray.length(); i++) {
            scopes.add(scopesJSONArray.getString(i));
        }

        return new Auth.Builder()
                .setApplicationContext(mContext)
                .setUserPoolId(mUserPoolPoolId)
                .setAppClientId(hostedUIJSON.getString("AppClientId"))
                .setAppClientSecret(hostedUIJSON.optString("AppClientSecret", null))
                .setAppCognitoWebDomain(hostedUIJSON.getString("WebDomain"))
                .setSignInRedirect(hostedUIJSON.getString("SignInRedirectURI"))
                .setSignOutRedirect(hostedUIJSON.getString("SignOutRedirectURI"))
                .setScopes(scopes)
                .setAdvancedSecurityDataCollection(false)
                .setIdentityProvider(hostedUIJSON.optString("IdentityProvider"))
                .setIdpIdentifier(hostedUIJSON.optString("IdpIdentifier"));
    }

    /**
     * Retrieve a handle to perform device related operations.
     * This is only available for Cognito User Pools and it must be configured in the client.
     *
     * @return a handle for device operations
     */
    public DeviceOperations getDeviceOperations() {
        if (mDeviceOperations == null) {
            throw new AmazonClientException("Please check if userpools is configured.");
        }
        return mDeviceOperations;
    }

    /**
     * Release the wait for tokens to be refreshed
     * Doing this fails all pending operations that were
     * waiting for sign-in.
     */
    public void releaseSignInWait() {
        if (mSignedOutWaitLatch != null) {
            mSignedOutWaitLatch.countDown();
        }
    }

    protected void setUserState(final UserStateDetails details) {
        final boolean hasChanged = !details.equals(this.userStateDetails);
        this.userStateDetails = details;

        if (hasChanged) {
            synchronized (listeners) {
                for (final UserStateListener listener : listeners) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            listener.onUserStateChanged(details);
                        }
                    }).start();
                }
            }
        }
    }

    /**
     * Uses Android system commands to determine if the device is online.
     * Requires ACCESS_NETWORK_STATE.
     *
     * @param context application context
     * @return true if permission to access network state is granted and network is connected.
     */
    protected boolean isNetworkAvailable(final Context context) {
        try {
            Class.forName("android.support.v4.content.ContextCompat");
            int hasReadExternalStoragePermission = ContextCompat.checkSelfPermission(context,
                    Manifest.permission.ACCESS_NETWORK_STATE);
            if (hasReadExternalStoragePermission != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        } catch (ClassNotFoundException e) {
            Log.w(TAG, "Could not check if ACCESS_NETWORK_STATE permission is available.", e);
        }

        try {
            ConnectivityManager manager =
                    (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnected()) {
                return true;
            }
        } catch (Exception e) {
            Log.w(TAG, "Could not access network state", e);
        }

        return false;
    }

    boolean isUserpoolsSignedIn() {
        return userpoolsLoginKey.equals(mStore.get(PROVIDER_KEY));
    }

    /**
     * Returns the signed-in user's username obtained from the access token.
     * @return signed-in user's username
     */
    public String getUsername() {
        try {
            if (userpoolsLoginKey.equals(mStore.get(PROVIDER_KEY))) {
                return userpool.getCurrentUser().getUserId();
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public UserStateDetails currentUserState() {
        return getUserStateDetails(false);
    }

    /**
     * Adds a listener to be notified of state changes
     * @param listener
     */
    public void addUserStateListener(final UserStateListener listener) {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    /**
     * Removes a listener. This will hold onto references.
     * Remove when a lifecycle ends to prevent memory leaks.
     * @param listener
     * @return true if removed
     */
    public boolean removeUserStateListener(final UserStateListener listener) {
        synchronized (listeners) {
            int index = listeners.indexOf(listener);
            if (index != -1) {
                this.listeners.remove(index);
                return true;
            }
            return false;
        }
    }

    String getLoginKey() {
        return userpoolsLoginKey;
    }

    public boolean isSignedIn() {
        final UserStateDetails userStateDetails = getUserStateDetails(true);
        switch (userStateDetails.getUserState()) {
            case SIGNED_IN:
            case SIGNED_OUT_USER_POOLS_TOKENS_INVALID:
            case SIGNED_OUT_FEDERATED_TOKENS_INVALID:
                return true;
            case GUEST:
            case SIGNED_OUT:
                return false;
            default:
                throw new IllegalStateException("Unknown user state, please report this exception");
        }
    }

    /**
     * This method checks the current state of the user.
     * If the user's session is determined to be expired, then the {@link UserStateListener} will be
     * notified with @{@link UserState#SIGNED_OUT_USER_POOLS_TOKENS_INVALID} or
     * @{link UserState#SIGNED_OUT_FEDERATED_TOKENS_INVALID}.
     * @return true if user is signed-in, false otherwise
     */
    protected boolean waitForSignIn() {
        try {
            mWaitForSignInLock.lock();
            mSignedOutWaitLatch = new CountDownLatch(1);
            final UserStateDetails userStateDetails = getUserStateDetails(false);
            Log.d(TAG, "waitForSignIn: userState:" + userStateDetails.getUserState());
            setUserState(userStateDetails);
            switch (userStateDetails.getUserState()) {
                case SIGNED_IN:
                    return true;
                case GUEST:
                case SIGNED_OUT:
                    return false;
                case SIGNED_OUT_USER_POOLS_TOKENS_INVALID:
                case SIGNED_OUT_FEDERATED_TOKENS_INVALID:
                    mSignedOutWaitLatch.await();
                    return getUserStateDetails(false).getUserState().equals(UserState.SIGNED_IN);
            }
        } catch (Exception e) {
            Log.w(TAG, "Exception when waiting for sign-in", e);
        } finally {
            mWaitForSignInLock.unlock();
        }
        return false;
    }

    Map<String, String> getSignInDetailsMap() {
        return mStore.get(PROVIDER_KEY, TOKEN_KEY);
    }

    String _getCachedIdentityId() {
        return mStore.get(IDENTITY_ID_KEY);
    }

    /**
     * Has side-effect of attempting to alert developer to try and sign-in user
     * when required to be signed-in and will mutate the user's state.
     *
     * @param offlineCheck true, will determine if the tokens are expired or the credentials are expired and block for refresh
     * @return the current state of the user
     */
    protected UserStateDetails getUserStateDetails(final boolean offlineCheck) {
        final Map<String, String> details = getSignInDetailsMap();
        final String providerKey = details.get(PROVIDER_KEY);
        final String token = details.get(TOKEN_KEY);
        final SignInMode signInMode = getSignInMode();
        final String identityId = _getCachedIdentityId();

        final boolean federationEnabled = isFederationEnabled();
        Log.d(TAG, "Inspecting user state details");

        final boolean hasUsefulToken = providerKey != null && token != null;

        // Offline state detection
        if (offlineCheck || !isNetworkAvailable(mContext)) {
            if (hasUsefulToken) {
                return new UserStateDetails(UserState.SIGNED_IN, details);
            } else {
                if (identityId != null) {
                    return new UserStateDetails(UserState.GUEST, details);
                } else {
                    return new UserStateDetails(UserState.SIGNED_OUT, null);
                }
            }
        }

        // Online state detection
        if (hasUsefulToken && !userpoolsLoginKey.equals(providerKey)) {
            // TODO enhancement: check if token is expired
            try {
                if (!federationEnabled) {
                    // Do nothing, you are signed-in by having the token
                }
                // If token has already been federated
                else if (hasFederatedToken(providerKey, token)) {
                    Log.d(TAG, "getUserStateDetails: token already federated just fetch credentials");
                    if (cognitoIdentity != null) {
                        cognitoIdentity.getCredentials();
                    }
                } else {
                    federateWithCognitoIdentity(providerKey, token);
                }
                return new UserStateDetails(UserState.SIGNED_IN, details);
            } catch (Exception e) {
                Log.w(TAG, "Failed to federate the tokens.", e);
                if (e instanceof NotAuthorizedException) {
                    return new UserStateDetails(UserState.SIGNED_OUT_FEDERATED_TOKENS_INVALID, details);
                } else {
                    return new UserStateDetails(UserState.SIGNED_IN, details);
                }
            }
        } else if (hasUsefulToken && userpool != null) {
            Tokens tokens = null;
            String idToken = null;
            try {
                tokens = getTokens(false);
                idToken = tokens.getIdToken().getTokenString();
                details.put(TOKEN_KEY, idToken);
                if (!federationEnabled) {
                    // Do nothing, you are signed-in by having the token
                }
                // If token has already been federated
                else if (hasFederatedToken(providerKey, idToken)) {
                    try {
                        if (cognitoIdentity != null) {
                            cognitoIdentity.getCredentials();
                        }
                    } catch (Exception e) {
                        Log.w(TAG, "Failed to get or refresh credentials from Cognito Identity", e);
                    }
                } else {
                    if (cognitoIdentity != null) {
                        federateWithCognitoIdentity(providerKey, idToken);
                    }
                }
            } catch (Exception e) {
                Log.w(TAG, tokens == null ? "Tokens are invalid, please sign-in again." :
                        "Failed to federate the tokens", e);
            } finally {
                if (tokens != null && idToken != null) {
                    return new UserStateDetails(UserState.SIGNED_IN, details);
                } else {
                    return new UserStateDetails(UserState.SIGNED_OUT_USER_POOLS_TOKENS_INVALID, details);
                }
            }
        } else {
            if (cognitoIdentity == null) {
                return new UserStateDetails(UserState.SIGNED_OUT, details);
            } else if (identityId != null) {
                return new UserStateDetails(UserState.GUEST, details);
            } else {
                return new UserStateDetails(UserState.SIGNED_OUT, null);
            }
        }
    }

    boolean isFederationEnabled() {
        final String federationEnabledString = mStore.get(FEDERATION_ENABLED_KEY);
        final boolean federationEnabled;
        if (federationEnabledString != null) {
            federationEnabled = federationEnabledString.equals("true");
        } else {
            federationEnabled = true;
        }
        return federationEnabled;
    }

    SignInMode getSignInMode() {
        return SignInMode.fromString(mStore.get(SIGN_IN_MODE));
    }

    private boolean hasFederatedToken(final String providerKey,
                                      final String token) {
        if (token == null || token.isEmpty()) {
            return false;
        }
        boolean hasFederatedToken = token.equals(mFederatedLoginsMap.get(providerKey));
        Log.d(TAG, "hasFederatedToken: " + hasFederatedToken + " provider: " + providerKey);
        return hasFederatedToken;
    }

    public void signIn(final String username,
                       final String password,
                       final Map<String, String> validationData,
                       final Callback<SignInResult> callback) {

        final InternalCallback<SignInResult> internalCallback = new InternalCallback<SignInResult>(callback);
        internalCallback.async(_signIn(username, password, validationData, internalCallback));
    }

    public SignInResult signIn(final String username,
                               final String password,
                               final Map<String, String> validationData) throws Exception {

        final InternalCallback<SignInResult> internalCallback = new InternalCallback<SignInResult>();
        return internalCallback.await(_signIn(username, password, validationData, internalCallback));
    }

    private Runnable _signIn(final String username,
                             final String password,
                             final Map<String, String> validationData,
                             final Callback<SignInResult> callback) {

        this.signInCallback = callback;
        signInState = null;

        return new Runnable() {
            @Override
            public void run() {
                try {
                    userpool.getUser(username).getSession(new AuthenticationHandler() {

                        @Override
                        public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                            try {
                                mCognitoUserSession = userSession;
                                signInState = SignInState.DONE;
                            } catch (Exception e) {
                                signInCallback.onError(e);
                                signInCallback = null;
                            }

                            try {
                                if (isFederationEnabled()) {
                                    federatedSignInWithoutAssigningState(userpoolsLoginKey, mCognitoUserSession.getIdToken().getJWTToken(), new Callback<UserStateDetails>() {
                                        @Override
                                        public void onResult(UserStateDetails result) {
                                            // Ignore because the result does not matter until getAWSCredentials is called
                                        }

                                        @Override
                                        public void onError(Exception e) {
                                            // Ignore because the result does not matter until getAWSCredentials is called
                                        }
                                    });
                                }

                                releaseSignInWait();
                            } catch (Exception e) {
                                Log.w(TAG, "Failed to federate tokens during sign-in", e);
                            } finally {
                                setUserState(new UserStateDetails(UserState.SIGNED_IN, getSignInDetailsMap()));
                            }

                            signInCallback.onResult(SignInResult.DONE);
                        }

                        @Override
                        public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId) {
                            Log.d(TAG, "Sending password.");
                            authenticationContinuation.setAuthenticationDetails(new AuthenticationDetails(username, password, validationData));
                            authenticationContinuation.continueTask();
                        }

                        @Override
                        public void getMFACode(MultiFactorAuthenticationContinuation continuation) {
                            signInMfaContinuation = continuation;
                            CognitoUserCodeDeliveryDetails parameters = continuation.getParameters();
                            signInState = SignInState.SMS_MFA;
                            signInCallback.onResult(
                                    new SignInResult(
                                            SignInState.SMS_MFA,
                                            new UserCodeDeliveryDetails(
                                                    parameters.getDestination(),
                                                    parameters.getDeliveryMedium(),
                                                    parameters.getAttributeName()
                                            )
                                    )
                            );
                        }

                        @Override
                        public void authenticationChallenge(ChallengeContinuation continuation) {
                            try {
                                signInState = SignInState.valueOf(continuation.getChallengeName());
                                signInChallengeContinuation = continuation;

                                signInCallback.onResult(new SignInResult(
                                        signInState,
                                        continuation.getParameters()));
                            } catch (IllegalArgumentException e) {
                                signInCallback.onError(e);
                            }
                        }

                        @Override
                        public void onFailure(Exception exception) {
                            signInCallback.onError(exception);
                        }
                    });
                } catch (Exception e) {
                    callback.onError(e);
                }
            }
        };
    }

    /**
     * Clears local tokens so that the client is in a signed-out state.
     */
    public void signOut() {
        mCognitoUserSession = null;
        if (userpool != null) {
            userpool.getCurrentUser().signOut();
            userpool.getUser().signOut();
        }
        if (cognitoIdentity != null) {
            cognitoIdentity.clear();
        }
        if (IdentityManager.getDefaultIdentityManager() != null) {
            IdentityManager.getDefaultIdentityManager().signOut();
        }
        mStore.clear();
        String hostedUIJSON = null;
        if (awsConfiguration.optJsonObject("Auth") != null && awsConfiguration.optJsonObject("Auth").has("OAuth")) {
            try {
                hostedUIJSON = awsConfiguration.optJsonObject("Auth").getJSONObject("OAuth").toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (hostedUI != null) {
                hostedUI.signOut(true);
            }
            if (mOAuth2Client != null) {
                mOAuth2Client.signOut();
            }
            hostedUI = null;
        }
        mStore.set(HOSTED_UI_KEY, hostedUIJSON);
        setUserState(getUserStateDetails(false));
        releaseSignInWait();
    }

    /**
     * Sign-out the user with more options.
     * <pre>
     * {@code
     * SignOutOptions.builder()
     *                  .signOutGlobally(true) // Sign-out user from all sessions across devices
     *                  .build();
     * }
     * </pre>
     * @param signOutOptions options
     */
    public void signOut(final SignOutOptions signOutOptions) throws Exception {
        _signOut(signOutOptions).await();
    }

    /**
     * Sign-out the user with more options.
     * <pre>
     * {@code
     * SignOutOptions.builder()
     *                  .signOutGlobally(true) // Sign-out user from all sessions across devices
     *                  .build();
     * }
     * </pre>
     * @param signOutOptions options
     */
    public void signOut(final SignOutOptions signOutOptions, final Callback<Void> callback) {
        _signOut(signOutOptions).async(callback);
    }

    private ReturningRunnable<Void> _signOut(final SignOutOptions signOutOptions) {
        return new ReturningRunnable<Void>() {
            @Override
            public Void run() throws Exception {
                if (signOutOptions.isSignOutGlobally()) {
                    final GlobalSignOutRequest globalSignOutRequest = new GlobalSignOutRequest();
                    globalSignOutRequest.setAccessToken(getTokens().getAccessToken().getTokenString());

                    userpoolLL.globalSignOut(globalSignOutRequest);
                }
                if (signOutOptions.isInvalidateTokens()) {
                    if (hostedUI != null) {
                        hostedUI.signOut();
                    } else if (mOAuth2Client != null) {
                        final CountDownLatch latch = new CountDownLatch(1);
                        final JSONObject hostedUIJSON = getHostedUIJSON();
                        final String signOutUriString = hostedUIJSON.getString("SignOutURI");
                        final Uri.Builder uriBuilder = Uri.parse(signOutUriString).buildUpon();
                        if (getHostedUIJSON().optString("SignOutRedirectURI", null) != null) {
                            uriBuilder.appendQueryParameter("redirect_uri", getHostedUIJSON().getString(
                                    "SignOutRedirectURI"));
                        }
                        final JSONObject signOutQueryParametersJSON = hostedUIJSON.getJSONObject(
                                "SignOutQueryParameters");
                        if (signOutQueryParametersJSON != null) {
                            final Iterator<String> keysIterator = signOutQueryParametersJSON.keys();
                            while (keysIterator.hasNext()) {
                                String key = keysIterator.next();
                                uriBuilder.appendQueryParameter(key, signOutQueryParametersJSON.getString(key));
                            }
                        }
                        final Exception[] signOutError = new Exception[1];
                        mOAuth2Client.signOut(uriBuilder.build(), new Callback<Void>() {
                            @Override
                            public void onResult(Void result) {
                                latch.countDown();
                            }

                            @Override
                            public void onError(Exception e) {
                                signOutError[0] = e;
                                latch.countDown();
                            }
                        });
                        latch.await();
                        if (signOutError[0] != null) {
                            throw signOutError[0];
                        }
                    }
                }
                signOut();
                return null;
            }
        };
    }

    /**
     * Federate tokens from custom identity providers into Cognito Identity Pool by providing the
     * logins key and token
     * <p>
     * The logins key can be specified with {@link IdentityProvider#AMAZON#toString()}
     *
     * @param providerKey Custom provider key i.e. Google sign-in's key is accounts.google.com
     * @param token       the JWT token vended by the third-party
     */
    public void federatedSignIn(final String providerKey,
                                final String token,
                                final Callback<UserStateDetails> callback) {
        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>(callback);
        internalCallback.async(_federatedSignIn(providerKey, token, null, internalCallback, true));
    }

    /**
     * Federate tokens from custom identity providers into Cognito Identity Pool by providing the
     * logins key and token
     * <p>
     * The logins key can be specified with {@link IdentityProvider#AMAZON}
     *
     * @param providerKey Custom provider key i.e. Google sign-in's key is accounts.google.com
     * @param token       the JWT token vended by the third-party
     */
    public UserStateDetails federatedSignIn(final String providerKey, final String token) throws Exception {
        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>();
        return internalCallback.await(_federatedSignIn(providerKey, token, null, internalCallback, true));
    }

    /**
     * Federate tokens from custom identity providers by providing the
     * logins key and token
     * <p>
     * The logins key can be specified with {@link IdentityProvider#AMAZON#toString()}
     *
     * @param providerKey Custom provider key i.e. Google sign-in's key is accounts.google.com
     * @param token       the JWT token vended by the third-party
     */
    public void federatedSignIn(final String providerKey,
                                final String token,
                                final FederatedSignInOptions options,
                                final Callback<UserStateDetails> callback) {
        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>(callback);
        internalCallback.async(_federatedSignIn(providerKey, token, options, internalCallback, true));
    }

    /**
     * Federate tokens from custom identity providers by providing the
     * logins key and token
     * <p>
     * The logins key can be specified with {@link IdentityProvider#AMAZON}
     *
     * @param providerKey Custom provider key i.e. Google sign-in's key is accounts.google.com
     * @param token       the JWT token vended by the third-party
     */
    public UserStateDetails federatedSignIn(final String providerKey,
                                final String token,
                                final FederatedSignInOptions options) throws Exception {
        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>();
        return internalCallback.await(_federatedSignIn(providerKey, token, options, internalCallback, true));
    }

    protected void federatedSignInWithoutAssigningState(final String providerKey, final String token) throws Exception {
        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>();
        internalCallback.await(_federatedSignIn(providerKey, token, null, internalCallback, false));
    }

    protected void federatedSignInWithoutAssigningState(final String providerKey,
                                                        final String token,
                                                        final Callback<UserStateDetails> callback) {
        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>(callback);
        internalCallback.async(_federatedSignIn(providerKey, token, null, internalCallback, false));
    }

    private Runnable _federatedSignIn(final String providerKey,
                                      final String token,
                                      final FederatedSignInOptions options,
                                      final Callback<UserStateDetails> callback,
                                      final boolean assignState) {

        final Map<String, String> loginsMap = new HashMap<String, String>();
        try {
            loginsMap.put(providerKey, token);

            Log.d(TAG, String.format("_federatedSignIn: Putting provider and token in store"));
            HashMap<String, String> details = new HashMap<String, String>();
            details.put(PROVIDER_KEY, providerKey);
            details.put(TOKEN_KEY, token);
            details.put(FEDERATION_ENABLED_KEY, "true");
            if (IdentityProvider.DEVELOPER.equals(providerKey)) {
                if (options == null) {
                    callback.onError(new Exception("Developer authenticated identities require the" +
                            "identity id to be specified in FederatedSignInOptions"));
                }
                details.put(IDENTITY_ID_KEY, options.getCognitoIdentityId());
            }
            if (options != null && !StringUtils.isBlank(options.getCustomRoleARN())) {
                details.put(CUSTOM_ROLE_ARN_KEY, options.getCustomRoleARN());
            }
            mStore.set(details);
        } catch (Exception e) {
            callback.onError(e);
        }

        return new Runnable() {
            @Override
            public void run() {
                try {
                    if (cognitoIdentity == null) {
                        callback.onError(new Exception("Federation is not enabled, " +
                                "please check if you have CognitoIdentity configured."));
                        return;
                    }

                    if (!token.equals(mFederatedLoginsMap.get(providerKey))) {
                        cognitoIdentity.clear();
                        cognitoIdentity.setLogins(loginsMap);
                    }

                    UserStateDetails userStateDetails = getUserStateDetails(true);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                federateWithCognitoIdentity(providerKey, token);
                            } catch (Exception e) {
                                Log.w(TAG, "Failed to federate with Cognito Identity in the background", e);
                            }
                        }
                    }).start();

                    callback.onResult(userStateDetails);
                    end(userStateDetails);
                } catch (final Exception exception) {
                    callback.onError(new RuntimeException("Error in federating the token.", exception));
                    return;
                }
            }

            private void end(final UserStateDetails details) {
                if (assignState) {
                    setUserState(details);
                }
            }
        };
    }

    protected void federateWithCognitoIdentity(final String providerKey,
                                               final String token) {
        synchronized (federateWithCognitoIdentityLockObject) {
            if (!hasFederatedToken(providerKey, token)) {
                if (IdentityProvider.DEVELOPER.equals(providerKey)) {
                    provider.setDeveloperAuthenticated(mStore.get(IDENTITY_ID_KEY), token);
                } else {
                    provider.setNotDeveloperAuthenticated();
                }

                final String customRoleArn = mStore.get(CUSTOM_ROLE_ARN_KEY);
                if (!StringUtils.isBlank(customRoleArn)) {
                    cognitoIdentity.setCustomRoleArn(customRoleArn);
                }

                HashMap<String, String> logins = new HashMap<String, String>();
                logins.put(providerKey, token);
                cognitoIdentity.setLogins(logins);
                cognitoIdentity.refresh();
                // Ensure cognitoIdentityId and credentials can be retrieved.
                mStore.set(IDENTITY_ID_KEY, cognitoIdentity.getIdentityId());
                mFederatedLoginsMap = cognitoIdentity.getLogins();
            }
        }
    }

    /**
     * Returns the tokens obtained from Cognito Userpools sign-in.
     * Federated sign-in tokens are not supported.
     *
     * @return tokens from Cognito Userpools
     * @throws Exception
     */
    public Tokens getTokens() throws Exception {
        final InternalCallback<Tokens> internalCallback = new InternalCallback<Tokens>();
        return internalCallback.await(_getTokens(internalCallback, true));
    }

    /**
     * Returns the tokens obtained from Cognito Userpools sign-in.
     * Federated sign-in tokens are not supported.
     *
     * @return tokens from Cognito Userpools
     * @throws Exception
     */
    public void getTokens(final Callback<Tokens> callback) {
        final InternalCallback<Tokens> internalCallback = new InternalCallback<Tokens>(callback);
        internalCallback.async(_getTokens(internalCallback, true));
    }

    protected Tokens getTokens(boolean waitForSignIn) throws Exception {
        final InternalCallback<Tokens> internalCallback = new InternalCallback<Tokens>();
        return internalCallback.await(_getTokens(internalCallback, waitForSignIn));
    }

    private Runnable _getTokens(final Callback<Tokens> callback, final boolean waitForSignIn) {

        return new Runnable() {
            @Override
            public void run() {
                String providerKey = getSignInDetailsMap().get(PROVIDER_KEY);
                if (providerKey == null) {
                } else if (!userpoolsLoginKey.equals(providerKey)) {
                    callback.onError(new Exception("getTokens does not support retrieving tokens for federated sign-in"));
                    return;
                }

                if (waitForSignIn) {
                    if (!waitForSignIn()) {
                        callback.onError(new Exception("getTokens does not support retrieving tokens while signed-out"));
                        return;
                    }
                }
                if (!isUserpoolsSignedIn()) {
                    callback.onError(new Exception("You must be signed-in with Cognito Userpools to be able to use getTokens"));
                }

                if (getSignInMode().equals(SignInMode.HOSTED_UI)) {
//                    final AuthUserSession cachedSession =
//                            LocalDataManager.getCachedSession(mContext, hostedUIJSONConfigured.getAppId(),
//                            LocalDataManager.getLastAuthUser(mContext,
//                                    hostedUIJSONConfigured.getAppId()),
//                            hostedUI.getScopes());
//                    callback.onResult(new Tokens(
//                            cachedSession.getAccessToken().getJWTToken(),
//                            cachedSession.getIdToken().getJWTToken(),
//                            cachedSession.getRefreshToken().getToken()
//                    ));
//                    return;

                    hostedUI.setAuthHandler(new AuthHandler() {
                        @Override
                        public void onSuccess(AuthUserSession session) {
                            callback.onResult(new Tokens(
                                    session.getAccessToken().getJWTToken(),
                                    session.getIdToken().getJWTToken(),
                                    session.getRefreshToken().getToken()
                            ));
                        }

                        @Override
                        public void onSignout() {
                            callback.onError(new Exception("No cached session."));
                        }

                        @Override
                        public void onFailure(Exception e) {
                            callback.onError(new Exception("No cached session.", e));
                        }
                    });
                    hostedUI.getSession(false);
                    return;
                } else if (getSignInMode().equals(SignInMode.OAUTH2)) {
                    callback.onError(new Exception("Tokens are not supported for OAuth2"));
                    return;
                }

                try {
                    userpool.getCurrentUser().getSession(new AuthenticationHandler() {

                        @Override
                        public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice) {
                            try {
                                mCognitoUserSession = userSession;
                                callback.onResult(new Tokens(
                                        userSession.getAccessToken().getJWTToken(),
                                        userSession.getIdToken().getJWTToken(),
                                        userSession.getRefreshToken().getToken()
                                ));
                            } catch (Exception e) {
                                callback.onError(e);
                            }
                        }

                        @Override
                        public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId) {
                            signalTokensNotAvailable(null);
                        }

                        @Override
                        public void getMFACode(MultiFactorAuthenticationContinuation continuation) {
                            signalTokensNotAvailable(null);
                        }

                        @Override
                        public void authenticationChallenge(ChallengeContinuation continuation) {
                            signalTokensNotAvailable(null);
                        }

                        @Override
                        public void onFailure(Exception exception) {
                            signalTokensNotAvailable(exception);
                        }

                        private void signalTokensNotAvailable(final Exception e) {
                            Log.w(TAG, "signalTokensNotAvailable");
                            callback.onError(new Exception("No cached session.", e));
                        }
                    });
                } catch (Exception e) {
                    callback.onError(e);
                }
            }
        };
    }

    /**
     * Sign-up users. The {@link SignUpResult} will contain next steps if necessary.
     * Call confirmSignUp with the necessary next step code obtained from user.
     *
     * @param username username/email address/handle
     * @param password user's password
     * @param userAttributes attributes associated with user
     * @param validationData optional, set of data to validate the sign-up request
     * @param callback callback
     */
    public void signUp(final String username,
                       final String password,
                       final Map<String, String> userAttributes,
                       final Map<String, String> validationData,
                       final Callback<SignUpResult> callback) {

        final InternalCallback internalCallback = new InternalCallback<SignUpResult>(callback);
        internalCallback.async(_signUp(username, password, userAttributes, validationData, internalCallback));
    }

    /**
     * Sign-up users. The {@link SignUpResult} will contain next steps if necessary.
     * Call confirmSignUp with the necessary next step code obtained from user.
     *
     * @param username username/email address/handle
     * @param password user's password
     * @param userAttributes attributes associated with user
     * @param validationData optional, set of data to validate the sign-up request
     * @return result of the operation, potentially with next steps
     * @throws Exception
     */
    public SignUpResult signUp(final String username,
                               final String password,
                               final Map<String, String> userAttributes,
                               final Map<String, String> validationData) throws Exception {

        final InternalCallback<SignUpResult> internalCallback = new InternalCallback<SignUpResult>();
        return internalCallback.await(_signUp(username, password, userAttributes, validationData, internalCallback));
    }

    private Runnable _signUp(final String username,
                             final String password,
                             final Map<String, String> userAttributes,
                             final Map<String, String> validationData,
                             final Callback<SignUpResult> callback) {

        return new Runnable() {
            @Override
            public void run() {
                final CognitoUserAttributes cognitoUserAttr = new CognitoUserAttributes();
                for (final String key : userAttributes.keySet()) {
                    cognitoUserAttr.addAttribute(key, userAttributes.get(key));
                }

                userpool.signUp(username, password, cognitoUserAttr, validationData, new SignUpHandler() {
                    @Override
                    public void onSuccess(final CognitoUser user,
                                          final boolean signUpConfirmationState,
                                          final CognitoUserCodeDeliveryDetails cognitoUserCodeDeliveryDetails) {

                        signUpUser = user;
                        UserCodeDeliveryDetails userCodeDeliveryDetails = new UserCodeDeliveryDetails(
                                cognitoUserCodeDeliveryDetails.getDestination(),
                                cognitoUserCodeDeliveryDetails.getDeliveryMedium(),
                                cognitoUserCodeDeliveryDetails.getAttributeName()
                        );
                        callback.onResult(new SignUpResult(signUpConfirmationState, userCodeDeliveryDetails));
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        callback.onError(exception);
                    }
                });
            }
        };
    }

    /**
     * Confirm the sign-up request with follow-up information
     *
     * @param username
     * @param signUpChallengeResponse
     * @param callback
     */
    public void confirmSignUp(final String username,
                              final String signUpChallengeResponse,
                              final Callback<SignUpResult> callback) {

        final InternalCallback internalCallback = new InternalCallback<SignUpResult>(callback);
        internalCallback.async(_confirmSignUp(username, signUpChallengeResponse, internalCallback));
    }

    public SignUpResult confirmSignUp(final String username,
                                      final String signUpChallengeResponse) throws Exception {

        final InternalCallback<SignUpResult> internalCallback = new InternalCallback<SignUpResult>();
        return internalCallback.await(_confirmSignUp(username, signUpChallengeResponse, internalCallback));
    }

    private Runnable _confirmSignUp(final String username,
                                    final String signUpChallengeResponse,
                                    final Callback<SignUpResult> callback) {

        return new Runnable() {
            @Override
            public void run() {
                userpool.getUser(username).confirmSignUp(signUpChallengeResponse, true, new GenericHandler() {
                    @Override
                    public void onSuccess() {
                        callback.onResult(new SignUpResult(
                                true,
                                null
                        ));
                        signUpUser = null;
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        callback.onError(exception);
                    }
                });
            }
        };
    }

    public void resendSignUp(final String username,
                             final Callback<SignUpResult> callback) {
        final InternalCallback internalCallback = new InternalCallback<SignUpResult>(callback);
        internalCallback.async(_resendSignUp(username, internalCallback));
    }

    public SignUpResult resendSignUp(final String username) throws Exception {
        final InternalCallback<SignUpResult> internalCallback = new InternalCallback<SignUpResult>();
        return internalCallback.await(_resendSignUp(username, internalCallback));
    }

    private Runnable _resendSignUp(final String username,
                                   final Callback<SignUpResult> callback) {
        return new Runnable() {
            @Override
            public void run() {
                userpool.getUser(username).resendConfirmationCodeInBackground(new VerificationHandler() {
                    @Override
                    public void onSuccess(CognitoUserCodeDeliveryDetails verificationCodeDeliveryMedium) {
                        UserCodeDeliveryDetails userCodeDeliveryDetails = new UserCodeDeliveryDetails(
                                verificationCodeDeliveryMedium.getDestination(),
                                verificationCodeDeliveryMedium.getDeliveryMedium(),
                                verificationCodeDeliveryMedium.getAttributeName()
                        );
                        callback.onResult(new SignUpResult(
                                false,
                                userCodeDeliveryDetails
                        ));
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        callback.onError(exception);
                    }
                });
            }
        };
    }

    public void forgotPassword(final String username,
                               final Callback<ForgotPasswordResult> callback) {

        final InternalCallback internalCallback = new InternalCallback<ForgotPasswordResult>(callback);
        internalCallback.async(_forgotPassword(username, internalCallback));
    }

    public ForgotPasswordResult forgotPassword(final String username) throws Exception {

        final InternalCallback<ForgotPasswordResult> internalCallback = new InternalCallback<ForgotPasswordResult>();
        return internalCallback.await(_forgotPassword(username, internalCallback));
    }

    private Runnable _forgotPassword(final String username,
                                     final Callback<ForgotPasswordResult> callback) {

        return new Runnable() {
            @Override
            public void run() {
                forgotPasswordCallback = new InternalCallback<ForgotPasswordResult>(callback);
                userpool.getUser(username).forgotPasswordInBackground(new ForgotPasswordHandler() {
                    @Override
                    public void onSuccess() {
                        forgotPasswordCallback
                                .onResult(new ForgotPasswordResult(ForgotPasswordState.DONE));
                    }

                    @Override
                    public void getResetCode(ForgotPasswordContinuation continuation) {
                        forgotPasswordContinuation = continuation;
                        ForgotPasswordResult result = new ForgotPasswordResult(ForgotPasswordState.CONFIRMATION_CODE);
                        CognitoUserCodeDeliveryDetails parameters = continuation.getParameters();
                        result.setParameters(new UserCodeDeliveryDetails(
                                parameters.getDestination(),
                                parameters.getDeliveryMedium(),
                                parameters.getAttributeName())
                        );
                        forgotPasswordCallback.onResult(result);
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        forgotPasswordCallback.onError(exception);
                    }
                });
            }
        };
    }

    public void confirmForgotPassword(final String password,
                                      final String forgotPasswordChallengeResponse,
                                      final Callback<ForgotPasswordResult> callback) {

        final InternalCallback internalCallback = new InternalCallback<ForgotPasswordResult>(callback);
        internalCallback.async(_confirmForgotPassword(password, forgotPasswordChallengeResponse, internalCallback));
    }

    public ForgotPasswordResult confirmForgotPassword(final String password,
                                                      final String forgotPasswordChallengeResponse) throws Exception {

        final InternalCallback<ForgotPasswordResult> internalCallback = new InternalCallback<ForgotPasswordResult>();
        return internalCallback.await(_confirmForgotPassword(password, forgotPasswordChallengeResponse, internalCallback));
    }

    private Runnable _confirmForgotPassword(final String password,
                                            final String forgotPasswordChallengeResponse,
                                            final Callback<ForgotPasswordResult> callback) {

        return new Runnable() {
            @Override
            public void run() {
                if (forgotPasswordContinuation == null) {
                    callback.onError(new IllegalStateException("confirmForgotPassword called before initiating forgotPassword"));
                    return;
                }

                forgotPasswordContinuation.setPassword(password);
                forgotPasswordContinuation.setVerificationCode(forgotPasswordChallengeResponse);

                forgotPasswordCallback = new InternalCallback<ForgotPasswordResult>(callback);
                forgotPasswordContinuation.continueTask();
            }
        };
    }

    public void changePassword(final String oldPassword,
                               final String newPassword,
                               final Callback<Void> callback) {

        final InternalCallback internalCallback = new InternalCallback<Void>(callback);
        internalCallback.async(_changePassword(oldPassword, newPassword, internalCallback));
    }

    public void changePassword(final String oldPassword,
                               final String newPassword) throws Exception {

        final InternalCallback internalCallback = new InternalCallback<Void>();
        internalCallback.await(_changePassword(oldPassword, newPassword, internalCallback));
    }

    private Runnable _changePassword(final String oldPassword,
                                     final String newPassword,
                                     final Callback<Void> callback) {

        return new Runnable() {
            @Override
            public void run() {
                userpool.getCurrentUser().changePassword(
                        oldPassword,
                        newPassword,
                        new GenericHandler() {
                            @Override
                            public void onSuccess() {
                                callback.onResult(null);
                            }

                            @Override
                            public void onFailure(Exception exception) {
                                callback.onError(exception);
                            }
                        }
                );
            }
        };
    }

    public void confirmSignIn(final String signInChallengeResponse,
                              final Callback<SignInResult> callback) {

        final InternalCallback internalCallback = new InternalCallback<SignInResult>(callback);
        internalCallback.async(_confirmSignIn(signInChallengeResponse, internalCallback));
    }

    public SignInResult confirmSignIn(final String signInChallengeResponse) throws Exception {

        final InternalCallback<SignInResult> internalCallback = new InternalCallback<SignInResult>();
        return internalCallback.await(_confirmSignIn(signInChallengeResponse, internalCallback));
    }

    private Runnable _confirmSignIn(final String signInChallengeResponse,
                                    final Callback<SignInResult> callback) {

        return new Runnable() {
            @Override
            public void run() {
                if (signInState == null) {
                    callback.onError(new IllegalStateException("Cannot call confirmMFA(String, Callback) " +
                            "without initiating sign-in. This call is used for SMS_MFA and NEW_PASSWORD_REQUIRED" +
                            "sign-in state."));
                    return;
                }

                final CognitoIdentityProviderContinuation detectedContinuation;
                switch (signInState) {
                    case SMS_MFA:
                        signInMfaContinuation.setMfaCode(signInChallengeResponse);
                        detectedContinuation = signInMfaContinuation;
                        signInCallback = new InternalCallback<SignInResult>(callback);
                        break;
                    case NEW_PASSWORD_REQUIRED:
                        ((NewPasswordContinuation) signInChallengeContinuation)
                                .setPassword(signInChallengeResponse);
                        detectedContinuation = signInChallengeContinuation;
                        signInCallback = new InternalCallback<SignInResult>(callback);
                        break;
                    case DONE:
                        callback.onError(new IllegalStateException("confirmSignIn called after signIn has succeeded"));
                        return;
                    default:
                        callback.onError(new IllegalStateException("confirmSignIn called on unsupported operation, " +
                                "please file a feature request"));
                        return;
                }

                if (detectedContinuation != null) {
                    detectedContinuation.continueTask();
                }
            }
        };
    }

    /**
     * The counter part to {@link #signIn}.
     * Call with the user's response to the sign-in challenge.
     *
     * @param signInChallengeResponse obtained from user
     * @param callback callback
     */
    public void confirmSignIn(final Map<String, String> signInChallengeResponse,
                              final Callback<SignInResult> callback) {

        final InternalCallback internalCallback = new InternalCallback<SignInResult>(callback);
        internalCallback.async(_confirmSignIn(signInChallengeResponse, internalCallback));
    }

    /**
     * The counter part to {@link #signIn}.
     * Call with the user's response to the sign-in challenge.
     *
     * @param signInChallengeResponse obtained from user
     * @return the result containing next steps or done.
     * @throws Exception
     */
    public SignInResult confirmSignIn(final Map<String, String> signInChallengeResponse) throws Exception {

        final InternalCallback<SignInResult> internalCallback = new InternalCallback<SignInResult>();
        return internalCallback.await(_confirmSignIn(signInChallengeResponse, internalCallback));
    }

    private Runnable _confirmSignIn(final Map<String, String> signInChallengeResponse,
                                    final Callback<SignInResult> callback) {

        return new Runnable() {
            @Override
            public void run() {
                if (signInState == null) {
                    callback.onError(new IllegalStateException("Cannot call confirmMFA(Map<String, String>, Callback) " +
                            "without initiating sign-in. This call is used for CUSTOM_CHALLENGE sign-in state."));
                    return;
                }

                final CognitoIdentityProviderContinuation detectedContinuation;
                switch (signInState) {
                    case SMS_MFA:
                    case NEW_PASSWORD_REQUIRED:
                        callback.onError(new IllegalStateException(
                                "Please use confirmSignIn(String, Callback) " +
                                        "for SMS_MFA and NEW_PASSWORD_REQUIRED challenges"));
                    case CUSTOM_CHALLENGE:
                        for (final String key : signInChallengeResponse.keySet()) {
                            signInChallengeContinuation.setChallengeResponse(key, signInChallengeResponse.get(key));
                        }
                        detectedContinuation = signInChallengeContinuation;
                        signInCallback = new InternalCallback<SignInResult>(callback);
                        break;
                    case DONE:
                        detectedContinuation = null;
                        Log.d(TAG, "confirmSignIn called after signIn has succeeded");
                        break;
                    default:
                        callback.onError(new IllegalStateException("confirmSignIn called on unsupported operation, " +
                                "please file a feature request"));
                        return;
                }

                if (detectedContinuation != null) {
                    detectedContinuation.continueTask();
                }
            }
        };
    }

    public void getUserAttributes(final Callback<Map<String, String>> callback) {
        InternalCallback<Map<String, String>> internalCallback = new InternalCallback<Map<String, String>>(callback);
        internalCallback.async(_getUserAttributes(internalCallback));
    }

    public Map<String, String> getUserAttributes() throws Exception {
        InternalCallback<Map<String, String>> internalCallback = new InternalCallback<Map<String, String>>();
        return internalCallback.await(_getUserAttributes(internalCallback));
    }

    private Runnable _getUserAttributes(final Callback<Map<String, String>> callback) {
        return new Runnable() {
            @Override
            public void run() {
                if (!waitForSignIn()) {
                    callback.onError(new Exception("Operation requires a signed-in state"));
                    return;
                }

                userpool.getCurrentUser().getDetails(new GetDetailsHandler() {
                    @Override
                    public void onSuccess(CognitoUserDetails cognitoUserDetails) {
                        callback.onResult(cognitoUserDetails.getAttributes().getAttributes());
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        callback.onError(exception);
                    }
                });
            }
        };
    }

    /**
     * Sends a map of user attributes to update. If an attribute needs to
     * be verified, then the verification delivery information is returned.
     * @param userAttributes the attributes i.e. email
     * @param callback verification delivery information
     */
    public void updateUserAttributes(final Map<String, String> userAttributes,
                                     final Callback<List<UserCodeDeliveryDetails>> callback) {

        InternalCallback internalCallback = new InternalCallback<List<UserCodeDeliveryDetails>>(callback);
        internalCallback.async(_updateUserAttributes(userAttributes, internalCallback));
    }

    /**
     * Sends a map of user attributes to update. If an attribute needs to
     * be verified, then the verification delivery information is returned.
     * @param userAttributes the attributes i.e. email
     * @return verification delivery information
     * @throws Exception
     */
    public List<UserCodeDeliveryDetails> updateUserAttributes(final Map<String, String> userAttributes) throws Exception {

        InternalCallback<List<UserCodeDeliveryDetails>> internalCallback = new InternalCallback<List<UserCodeDeliveryDetails>>();
        return internalCallback.await(_updateUserAttributes(userAttributes, internalCallback));
    }

    private Runnable _updateUserAttributes(final Map<String, String> userAttributes,
                                           final Callback<List<UserCodeDeliveryDetails>> callback) {

        return new Runnable() {
            @Override
            public void run() {
                if (!waitForSignIn()) {
                    callback.onError(new Exception("Operation requires a signed-in state"));
                    return;
                }

                final CognitoUserAttributes cognitoUserAttributes = new CognitoUserAttributes();
                if (userAttributes != null) {
                    for (final String key : userAttributes.keySet()) {
                        cognitoUserAttributes.addAttribute(key, userAttributes.get(key));
                    }
                }

                userpool.getCurrentUser().updateAttributes(cognitoUserAttributes, new UpdateAttributesHandler() {
                    @Override
                    public void onSuccess(List<CognitoUserCodeDeliveryDetails> attributesVerificationList) {
                        final List<UserCodeDeliveryDetails> list = new LinkedList<UserCodeDeliveryDetails>();
                        for (CognitoUserCodeDeliveryDetails details : attributesVerificationList) {
                            list.add(new UserCodeDeliveryDetails(
                                    details.getDestination(),
                                    details.getDeliveryMedium(),
                                    details.getAttributeName()
                            ));
                        }
                        callback.onResult(list);
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        callback.onError(exception);
                    }
                });
            }
        };
    }

    /**
     * Verify an attribute like email.
     * @param attributeName i.e. email
     * @param callback verification delivery information
     */
    public void verifyUserAttribute(final String attributeName,
                                    final Callback<UserCodeDeliveryDetails> callback) {

        InternalCallback internalCallback = new InternalCallback<UserCodeDeliveryDetails>(callback);
        internalCallback.async(_verifyUserAttribute(attributeName, internalCallback));
    }

    /**
     * Verify an attribute like email.
     * @param attributeName i.e. email
     * @return verification delivery information
     * @throws Exception
     */
    public UserCodeDeliveryDetails verifyUserAttribute(final String attributeName) throws Exception {

        InternalCallback<UserCodeDeliveryDetails> internalCallback = new InternalCallback<UserCodeDeliveryDetails>();
        return internalCallback.await(_verifyUserAttribute(attributeName, internalCallback));
    }

    private Runnable _verifyUserAttribute(final String attributeName,
                                          final Callback<UserCodeDeliveryDetails> callback) {

        return new Runnable() {
            @Override
            public void run() {
                if (!waitForSignIn()) {
                    callback.onError(new Exception("Operation requires a signed-in state"));
                    return;
                }

                userpool.getCurrentUser().getAttributeVerificationCodeInBackground(
                        attributeName,
                        new VerificationHandler() {
                            @Override
                            public void onSuccess(CognitoUserCodeDeliveryDetails verificationCodeDeliveryMedium) {
                                callback.onResult(new UserCodeDeliveryDetails(
                                        verificationCodeDeliveryMedium.getDestination(),
                                        verificationCodeDeliveryMedium.getDeliveryMedium(),
                                        verificationCodeDeliveryMedium.getAttributeName())
                                );
                            }

                            @Override
                            public void onFailure(Exception exception) {
                                callback.onError(exception);
                            }
                        }
                );
            }
        };
    }

    /**
     * Confirm the attribute with the code provided by user.
     * @param attributeName i.e. email
     * @param updateUserAttributeChallengeResponse i.e. 123456
     * @param callback callback
     */
    public void confirmUpdateUserAttribute(final String attributeName,
                                     final String updateUserAttributeChallengeResponse,
                                     final Callback<Void> callback) {

        InternalCallback internalCallback = new InternalCallback(callback);
        internalCallback.async(_confirmUserAttribute(attributeName, updateUserAttributeChallengeResponse, internalCallback));
    }

    /**
     * Confirm the attribute with the code provided by user.
     * @param attributeName i.e. email
     * @param updateUserAttributeChallengeResponse i.e. 123456
     * @throws Exception
     */
    public void confirmUpdateUserAttribute(final String attributeName,
                                     final String updateUserAttributeChallengeResponse) throws Exception {

        InternalCallback<Void> internalCallback = new InternalCallback();
        internalCallback.await(_confirmUserAttribute(attributeName, updateUserAttributeChallengeResponse, internalCallback));
    }

    /**
     * Confirm the attribute with the code provided by user.
     * @param attributeName i.e. email
     * @param updateUserAttributeChallengeResponse i.e. 123456
     * @param callback callback
     */
    public void confirmVerifyUserAttribute(final String attributeName,
                                     final String updateUserAttributeChallengeResponse,
                                     final Callback<Void> callback) {

        InternalCallback internalCallback = new InternalCallback(callback);
        internalCallback.async(_confirmUserAttribute(attributeName, updateUserAttributeChallengeResponse, internalCallback));
    }

    /**
     * Confirm the attribute with the code provided by user.
     * @param attributeName i.e. email
     * @param updateUserAttributeChallengeResponse i.e. 123456
     * @throws Exception
     */
    public void confirmVerifyUserAttribute(final String attributeName,
                                     final String updateUserAttributeChallengeResponse) throws Exception {

        InternalCallback<Void> internalCallback = new InternalCallback();
        internalCallback.await(_confirmUserAttribute(attributeName, updateUserAttributeChallengeResponse, internalCallback));
    }

    private Runnable _confirmUserAttribute(final String attributeName,
                                           final String updateUserAttributeChallengeResponse,
                                           final Callback<Void> callback) {

        return new Runnable() {
            @Override
            public void run() {
                if (!waitForSignIn()) {
                    callback.onError(new Exception("Operation requires a signed-in state"));
                    return;
                }

                userpool.getCurrentUser().verifyAttribute(
                        attributeName,
                        updateUserAttributeChallengeResponse,
                        new GenericHandler() {
                            @Override
                            public void onSuccess() {
                                callback.onResult(null);
                            }

                            @Override
                            public void onFailure(Exception exception) {
                                callback.onError(exception);
                            }
                        }
                );
            }
        };
    }

    // TODO test code more before release
//    @Override
//    public void setupTotp(final Callback<SetupTotpResult> callback) {
//        InternalCallback internalCallback = new InternalCallback(callback);
//        internalCallback.async(_setupTotp(internalCallback));
//    }
//
//    @Override
//    public SetupTotpResult setupTotp() throws Exception {
//        InternalCallback<SetupTotpResult> internalCallback = new InternalCallback();
//        return internalCallback.await(_setupTotp(internalCallback));
//    }
//
//    private Runnable _setupTotp(final Callback<SetupTotpResult> callback) {
//        return new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    if (!waitForSignIn()) {
//                        callback.onError(new Exception("Operation requires a signed-in state"));
//                        return;
//                    }
//
//                    userpool.getCurrentUser().associateSoftwareToken(null, new RegisterMfaHandler() {
//                        @Override
//                        public void onSuccess(String sessionToken) {
//                            totpSessionToken = sessionToken;
//                            totpCallback
//                                    .onResult(new SetupTotpResult(null, sessionToken));
//                        }
//
//                        @Override
//                        public void onVerify(VerifyMfaContinuation continuation) {
//                            totpContinuation = continuation;
//                            totpCallback
//                                    .onResult(new SetupTotpResult(SetupTotpState.CONFIRMATION_CODE, null));
//                        }
//
//                        @Override
//                        public void onFailure(Exception exception) {
//                            totpCallback.onError(exception);
//                        }
//                    });
//                } catch (Exception e) {
//                    callback.onError(e);
//                }
//            }
//        };
//    }
//
//    @Override
//    public void verifyTotp(final String totpCode,
//                           final String friendlyName,
//                           final Callback<SetupTotpResult> callback) {
//
//        InternalCallback internalCallback = new InternalCallback(callback);
//        internalCallback.async(_setupTotp(internalCallback));
//    }
//
//    @Override
//    public SetupTotpResult verifyTotp(final String totpCode,
//                                      final String friendlyName) throws Exception {
//
//        InternalCallback<SetupTotpResult> internalCallback = new InternalCallback();
//        return internalCallback.await(_verifyTotp(totpCode, friendlyName, internalCallback));
//    }
//
//    private Runnable _verifyTotp(final String totpCode,
//                                 final String friendlyName,
//                                 final Callback<SetupTotpResult> callback) {
//        return new Runnable() {
//            @Override
//            public void run() {
//                if (!waitForSignIn()) {
//                    callback.onError(new Exception("Operation requires a signed-in state"));
//                    return;
//                }
//
//                try {
//                    userpool.getCurrentUser().verifySoftwareToken(
//                            totpSessionToken,
//                            totpCode,
//                            friendlyName,
//                            new RegisterMfaHandler() {
//                                @Override
//                                public void onSuccess(String sessionToken) {
//                                    totpCallback.onResult(
//                                            new SetupTotpResult(SetupTotpState.DONE,
//                                                    sessionToken
//                                            )
//                                    );
//                                }
//
//                                @Override
//                                public void onVerify(VerifyMfaContinuation continuation) {
//                                    final SetupTotpResult result = new SetupTotpResult(
//                                            SetupTotpState.CONFIRMATION_CODE,
//                                            null
//                                    );
//                                    totpCallback.onResult(result);
//                                }
//
//                                @Override
//                                public void onFailure(Exception exception) {
//                                    totpCallback.onError(exception);
//                                }
//                            }
//                    );
//                } catch (Exception e) {
//                    callback.onError(e);
//                }
//            }
//        };
//    }
//
//    public void setPreferredMFA(final MFAOptions mfaOption, final Callback<Void> callback) {
//        InternalCallback internalCallback = new InternalCallback(callback);
//        internalCallback.async(_setPreferredMFA(mfaOption, internalCallback));
//    }
//
//    public void setPreferredMFA(final MFAOptions mfaOption) throws Exception {
//        InternalCallback<Void> internalCallback = new InternalCallback();
//        internalCallback.await(_setPreferredMFA(mfaOption, internalCallback));
//    }
//
//    private Runnable _setPreferredMFA(final MFAOptions mfaOption, final Callback<Void> callback) {
//
//        return new Runnable() {
//            @Override
//            public void run() {
//                if (!waitForSignIn()) {
//                    callback.onError(new Exception("Operation requires a signed-in state"));
//                    return;
//                }
//
//                try {
//                    CognitoMfaSettings settings = new CognitoMfaSettings(mfaOption.getServiceText());
//                    settings.setEnabled(true);
//                    settings.setPreferred(true);
//                    List<CognitoMfaSettings> settingsList = new ArrayList<CognitoMfaSettings>();
//                    settingsList.add(settings);
//                    userpool.getCurrentUser().setUserMfaSettingsInBackground(settingsList, new GenericHandler() {
//                        @Override
//                        public void onSuccess() {
//                            callback.onResult(null);
//                        }
//
//                        @Override
//                        public void onFailure(Exception exception) {
//                            callback.onError(exception);
//                        }
//                    });
//                } catch (Exception e) {
//                    callback.onError(e);
//                }
//            }
//        };
//    }

    public boolean handleAuthResponse(final Intent intent) {
        if (hostedUI != null) {
            hostedUI.getTokens(intent.getData());
            return true;
        }
        if (mOAuth2Client != null && mOAuth2Client.handleRedirect(intent.getData())) {
            return true;
        }
        return false;
    }

    /**
     * Shows a sign-in UI for user's to sign-in, sign-up, forgot password, create account
     * @param callingActivity The activity that the sign-in screen will be shown on top of.
     * @param callback callback with UserStateDetails at end of operation
     */
    public void showSignIn(final Activity callingActivity,
                           final Callback<UserStateDetails> callback) { //SignInUIOptions

        InternalCallback internalCallback = new InternalCallback(callback);
        internalCallback.async(_showSignIn(callingActivity, SignInUIOptions.builder().build(), internalCallback));
    }

    /**
     * Shows a sign-in UI for user's to sign-in, sign-up, forgot password, create account
     * @param callingActivity The activity that the sign-in screen will be shown on top of.
     */
    public UserStateDetails showSignIn(final Activity callingActivity) throws Exception {

        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>();
        return internalCallback.await(_showSignIn(callingActivity, SignInUIOptions.builder().build(), internalCallback));
    }
    /**
     * Shows a sign-in UI for user's to sign-in, sign-up, forgot password, create account
     * @param callingActivity The activity that the sign-in screen will be shown on top of.
     * @param signInUIOptions Override any default configuration with your preferences.
     * @param callback callback with UserStateDetails at end of operation
     */
    public void showSignIn(final Activity callingActivity,
                           final SignInUIOptions signInUIOptions,
                           final Callback<UserStateDetails> callback) { //SignInUIOptions

        InternalCallback internalCallback = new InternalCallback(callback);
        internalCallback.async(_showSignIn(callingActivity, signInUIOptions, internalCallback));
    }

    /**
     * Shows a sign-in UI for user's to sign-in, sign-up, forgot password, create account
     * @param callingActivity The activity that the sign-in screen will be shown on top of.
     * @param signInUIOptions Override any default configuration with your preferences.
     */
    public UserStateDetails showSignIn(final Activity callingActivity,
                                       final SignInUIOptions signInUIOptions) throws Exception {

        InternalCallback<UserStateDetails> internalCallback = new InternalCallback<UserStateDetails>();
        return internalCallback.await(_showSignIn(callingActivity, signInUIOptions, internalCallback));
    }

    private Runnable _showSignIn(final Activity callingActivity,
                                 final SignInUIOptions signInUIOptions,
                                 final Callback<UserStateDetails> callback) {
        if (signInUIOptions.getHostedUIOptions() != null) {
            final JSONObject hostedUIJSON = getHostedUIJSON();
            if (hostedUIJSON == null) {
                return new Runnable() {
                    @Override
                    public void run() {
                        callback.onError(new Exception("showSignIn called with HostedUI options in awsconfiguration.json"));
                    }
                };
            }
            if (hostedUIJSON.optString("TokenURI", null) != null) {
                return _showSignInOAuth2UI(callingActivity, signInUIOptions, callback);
            } else {
                return _showSignInHostedUI(callingActivity, signInUIOptions, callback);
            }
        }
        return _showSignInDropInUI(callingActivity, signInUIOptions, callback);
    }

    private Runnable _showSignInOAuth2UI(final Activity callingActivity,
                                         final SignInUIOptions signInUIOptions,
                                         final Callback<UserStateDetails> callback) {
        return new Runnable() {
            @Override
            public void run() {
                final HostedUIOptions hostedUIOptions = signInUIOptions.getHostedUIOptions();

                // Reset settings to JSON
                JSONObject hostedUIJSON = getHostedUIJSONFromJSON();
                if (hostedUIJSON == null) {
                    callback.onError(new Exception("Could not create OAuth configuration object"));
                }

                if (hostedUIOptions.getFederationEnabled() != null) {
                    mStore.set(FEDERATION_ENABLED_KEY, hostedUIOptions.getFederationEnabled() ? "true" : "false");
                } else {
                    mStore.set(FEDERATION_ENABLED_KEY, "true");
                }
                mStore.set(SIGN_IN_MODE, SignInMode.OAUTH2.toString());

                if (isFederationEnabled() && hostedUIOptions.getFederationProviderName() == null) {
                    throw new IllegalArgumentException("OAuth flow requires a federation provider name if federation is enabled.");
                }

                if (hostedUIOptions.getSignOutQueryParameters() != null) {
                    try {
                        JSONObject signOutParams = new JSONObject();
                        for (Map.Entry<String, String> e : hostedUIOptions.getSignOutQueryParameters().entrySet()) {
                            signOutParams.put(e.getKey(), e.getValue());
                        }
                        hostedUIJSON.put("SignOutQueryParameters", signOutParams);
                    } catch (JSONException e1) {
                        callback.onError(new Exception("Failed to construct sign-out query parameters", e1));
                        return;
                    }
                }
                if (hostedUIOptions.getTokenQueryParameters() != null) {
                    try {
                    JSONObject tokenParams = new JSONObject();
                    for (Map.Entry<String, String> e : hostedUIOptions.getTokenQueryParameters().entrySet()) {
                            tokenParams.put(e.getKey(), e.getValue());
                    }
                    hostedUIJSON.put("TokenQueryParameters", tokenParams);
                    } catch (JSONException e1) {
                        callback.onError(new Exception("Failed to construct token query parameters", e1));
                        return;
                    }
                }

                mStore.set(HOSTED_UI_KEY, hostedUIJSON.toString());

                Uri.Builder authorizeUriBuilder;
                try {
                    authorizeUriBuilder = Uri.parse(hostedUIJSON.getString("SignInURI")).buildUpon();
                    if (hostedUIOptions.getSignInQueryParameters() != null) {
                        for (Map.Entry<String, String> e : hostedUIOptions.getSignInQueryParameters().entrySet()) {
                            authorizeUriBuilder.appendQueryParameter(e.getKey(), e.getValue());
                        }
                    }
                    authorizeUriBuilder.appendQueryParameter("redirect_uri", hostedUIJSON.getString("SignInRedirectURI"));
                    authorizeUriBuilder.appendQueryParameter("scopes", hostedUIJSON.getJSONArray("Scopes").join(" "));
                    authorizeUriBuilder.appendQueryParameter("client_id", hostedUIJSON.getString("AppClientId"));
                } catch (Exception e) {
                    throw new RuntimeException("Failed to construct authorization url for OAuth", e);
                }

                Uri.Builder tokensUriBuilder;
                final Map<String, String> tokensBody = new HashMap<String, String>();
                try {
                    tokensUriBuilder = Uri.parse(hostedUIJSON.getString("TokenURI")).buildUpon();
                    if (hostedUIOptions.getSignInQueryParameters() != null) {
                        for (Map.Entry<String, String> e : hostedUIOptions.getTokenQueryParameters().entrySet()) {
                            tokensUriBuilder.appendQueryParameter(e.getKey(), e.getValue());
                        }
                    }
                    tokensBody.put("client_id", hostedUIJSON.getString("AppClientId"));
                    tokensBody.put("redirect_uri", hostedUIJSON.getString("SignInRedirectURI"));
                } catch (Exception e) {
                    throw new RuntimeException("Failed to construct tokens url for OAuth", e);
                }
                final Uri tokensUri = tokensUriBuilder.build();

                mOAuth2Client.authorize(authorizeUriBuilder.build(), new Callback<AuthorizeResponse>() {
                    @Override
                    public void onResult(AuthorizeResponse result) {
                        Log.i(TAG, "onResult: OAuth2 callback occurred, exchanging code for token");
                        mOAuth2Client.requestTokens(tokensUri, new HashMap<String, String>(), tokensBody, result.getCode(), new Callback<OAuth2Tokens>() {
                            @Override
                            public void onResult(OAuth2Tokens result) {
                                if (isFederationEnabled()) {
                                    federatedSignInWithoutAssigningState(
                                            hostedUIOptions.getFederationProviderName(),
                                            result.getIdToken(),// TODO verify id token is correct, this would mean OAuth support requires scope openid
                                            new Callback<UserStateDetails>() {
                                                @Override
                                                public void onResult(UserStateDetails result) {
                                                    final UserStateDetails userStateDetails =
                                                            getUserStateDetails(false);
                                                    callback.onResult(userStateDetails);
                                                    setUserState(userStateDetails);
                                                }

                                                @Override
                                                public void onError(Exception e) {
                                                    final UserStateDetails userStateDetails =
                                                            getUserStateDetails(false);
                                                    callback.onResult(userStateDetails);
                                                    setUserState(userStateDetails);
                                                }
                                            });
                                } else {
                                    final UserStateDetails userStateDetails =
                                            getUserStateDetails(false);
                                    callback.onResult(userStateDetails);
                                    setUserState(userStateDetails);
                                }
                            }

                            @Override
                            public void onError(Exception e) {
                                callback.onError(e);
                            }
                        });
                    }

                    @Override
                    public void onError(Exception e) {
                        callback.onError(e);
                    }
                });
            }
        };
    }

    private Runnable _showSignInHostedUI(final Activity callingActivity,
                                 final SignInUIOptions signInUIOptions,
                                 final Callback<UserStateDetails> callback) {
        return new Runnable() {
            @Override
            public void run() {

                final HostedUIOptions hostedUIOptions = signInUIOptions.getHostedUIOptions();

                // Reset settings to JSON
                JSONObject hostedUIJSON = null;
                try {
                    hostedUIJSON = new JSONObject(getHostedUIJSONFromJSON().toString());
                } catch (JSONException e) {
                    callback.onError(new Exception("Could not create OAuth configuration object", e));
                }

                if (hostedUIOptions.getFederationEnabled() != null) {
                    mStore.set(FEDERATION_ENABLED_KEY, hostedUIOptions.getFederationEnabled() ? "true" : "false");
                } else {
                    mStore.set(FEDERATION_ENABLED_KEY, "true");
                }
                mStore.set(SIGN_IN_MODE, SignInMode.HOSTED_UI.toString());

                if (hostedUIOptions.getSignOutQueryParameters() != null) {
                    try {
                        JSONObject signOutParams = new JSONObject();
                        for (Map.Entry<String, String> e : hostedUIOptions.getSignOutQueryParameters().entrySet()) {
                            signOutParams.put(e.getKey(), e.getValue());
                        }
                        hostedUIJSON.put("SignOutQueryParameters", signOutParams);
                    } catch (JSONException e1) {
                        callback.onError(new Exception("Failed to construct sign-out query parameters", e1));
                        return;
                    }
                }
                if (hostedUIOptions.getTokenQueryParameters() != null) {
                    try {
                        JSONObject tokenParams = new JSONObject();
                        for (Map.Entry<String, String> e : hostedUIOptions.getTokenQueryParameters().entrySet()) {
                            tokenParams.put(e.getKey(), e.getValue());
                        }
                        hostedUIJSON.put("TokenQueryParameters", tokenParams);
                    } catch (JSONException e1) {
                        callback.onError(new Exception("Failed to construct token query parameters", e1));
                        return;
                    }
                }

                mStore.set(HOSTED_UI_KEY, hostedUIJSON.toString());

                final HashSet<String> scopes;
                if (hostedUIOptions.getScopes() != null) {
                    scopes = new HashSet<String>();
                    Collections.addAll(scopes, hostedUIOptions.getScopes());
                } else {
                    scopes = null;
                }

                final String identityProvider = hostedUIOptions.getIdentityProvider();
                final String idpIdentifier = hostedUIOptions.getIdpIdentifier();

                mStore.set(SIGN_IN_MODE, SignInMode.HOSTED_UI.toString());

                Auth.Builder hostedUIBuilder = null;
                try {
                    hostedUIBuilder = getHostedUI(hostedUIJSON);
                } catch (JSONException e) {
                    throw new RuntimeException("Failed to construct HostedUI from awsconfiguration.json", e);
                }

                hostedUIBuilder
                        .setPersistenceEnabled(mIsPersistenceEnabled)
                        .setAuthHandler(new AuthHandler() {
                            boolean hasSucceededOnce = false;

                            @Override
                            public void onSuccess(AuthUserSession session) {
                                Log.d(TAG, "onSuccess: HostedUI signed-in");
                                hasSucceededOnce = true;
                                if (isFederationEnabled()) {
                                    federatedSignInWithoutAssigningState(userpoolsLoginKey,
                                            session.getIdToken().getJWTToken(),
                                            new Callback<UserStateDetails>() {
                                                @Override
                                                public void onResult(UserStateDetails result) {
                                                    Log.d(TAG, "onResult: Federation from the Hosted UI " +
                                                            "succeeded");
                                                }

                                                @Override
                                                public void onError(Exception e) {
                                                    Log.e(TAG, "onError: Federation from the Hosted UI " +
                                                            "failed", e);
                                                }
                                            });
                                }
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        final UserStateDetails userStateDetails =
                                                getUserStateDetails(false);
                                        callback.onResult(userStateDetails);
                                        setUserState(userStateDetails);
                                    }
                                }).start();
                            }

                            @Override
                            public void onSignout() {
                                Log.d(TAG, "onSignout: HostedUI signed-out");
                            }

                            @Override
                            public void onFailure(final Exception e) {
                                if (hasSucceededOnce) {
                                    Log.d(TAG, "onFailure: Ignoring failure because HostedUI " +
                                            "has signaled success at least once.");
                                    return;
                                }
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        callback.onError(e);
                                    }
                                }).start();
                            }
                        });
                if (scopes != null) {
                    hostedUIBuilder.setScopes(scopes);
                }
                if (identityProvider != null) {
                    hostedUIBuilder.setIdentityProvider(identityProvider);
                }
                if (idpIdentifier != null) {
                    hostedUIBuilder.setIdpIdentifier(idpIdentifier);
                }
                hostedUI = hostedUIBuilder.build();
                hostedUI.getSession();
            }
        };
    }

    private Runnable _showSignInDropInUI(final Activity callingActivity,
                                 final SignInUIOptions signInUIOptions,
                                 final Callback<UserStateDetails> callback) {

        return new Runnable() {
            @Override
            public void run() {
                synchronized (showSignInLockObject) {
                    UserState userState = getUserStateDetails(false).getUserState();
                    if (UserState.SIGNED_IN.equals(userState)) {
                        callback.onError(new RuntimeException("Called showSignIn while user is already signed-in"));
                        return;
                    }

                    final AuthUIConfiguration.Builder authUIConfigBuilder = new AuthUIConfiguration.Builder()
                            .canCancel(signInUIOptions.canCancel())
                            .isBackgroundColorFullScreen(false);

                    if (signInUIOptions.getLogo() != null) {
                        authUIConfigBuilder.logoResId(signInUIOptions.getLogo());
                    }
                    if (signInUIOptions.getBackgroundColor() != null) {
                        authUIConfigBuilder.backgroundColor(signInUIOptions.getBackgroundColor());
                    }

                    final IdentityManager identityManager = IdentityManager.getDefaultIdentityManager();

                    if (isConfigurationKeyPresent(USER_POOLS)) {
                        authUIConfigBuilder.userPools(true);
                    }

                    if (isConfigurationKeyPresent(FACEBOOK)) {
                        authUIConfigBuilder.signInButton(FacebookButton.class);
                    }

                    if (isConfigurationKeyPresent(GOOGLE)) {
                        authUIConfigBuilder.signInButton(GoogleButton.class);
                    }

                    Class<? extends Activity> nextActivityClass =
                            signInUIOptions.nextActivity() == null ?
                                callingActivity.getClass() : signInUIOptions.nextActivity();
                    SignInUI signin = (SignInUI) getClient(mContext, SignInUI.class);
                    signin.login(callingActivity, nextActivityClass)
                            .authUIConfiguration(authUIConfigBuilder.build())
                            .enableFederation(false)
                            .execute();

                    showSignInWaitLatch = new CountDownLatch(1);
                    try {
                        showSignInWaitLatch.await();
                        callback.onResult(getUserStateDetails(false));
                        Log.d(TAG, "run: showSignIn completed");
                    } catch (InterruptedException e) {
                        callback.onError(e);
                    }
                }
            }
        };
    }

    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////
    //    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * This performs basic initialization for connecting
     * to AWS including fetching the Cognito Identity for
     * the user.
     *
     * @param context The activity context.
     * @deprecated Since 2.8.0 This method will be removed in the next minor version.
     * Please update to use AWSMobileClient using `initialize`.
     * Please visit https://aws-amplify.github.io for the latest Android documentation.
     */
    @Deprecated
    public InitializeBuilder initialize(final Context context) {
        this.awsStartupHandler = new AWSStartupHandler() {
            @Override
            public void onComplete(final AWSStartupResult awsStartupResult) {
                Log.d(TAG, "AWSMobileClient Initialize succeeded.");
                Log.i(TAG, "Welcome to AWS! You are connected successfully.");
            }
        };
        return initialize(context, this.awsStartupHandler);
    }


    /**
     * This performs basic initialization for connecting
     * to AWS including fetching the Cognito Identity for
     * the user.
     *
     * @param context           The activity context.
     * @param awsStartupHandler The result for Initialize callback.
     * @deprecated Since 2.8.0 This method will be removed in the next minor version.
     * Please update to use AWSMobileClient using `initialize`.
     * Please visit https://aws-amplify.github.io for the latest Android documentation.
     */
    @Deprecated
    public InitializeBuilder initialize(final Context context,
                                        final AWSStartupHandler awsStartupHandler) {
        this.awsConfiguration = new AWSConfiguration(context.getApplicationContext());
        this.signInProviderConfig = null;
        this.startupAuthResultHandler = new StartupAuthResultHandler() {
            @Override
            public void onComplete(final StartupAuthResult startupAuthResult) {
                Log.i(TAG, "Welcome to AWS! You are connected successfully.");
                if (startupAuthResult.isIdentityIdAvailable()) {
                    Log.i(TAG, "Identity ID retrieved.");
                }
                awsStartupHandler.onComplete(
                        new AWSStartupResult(IdentityManager.getDefaultIdentityManager()));
            }
        };
        this.awsStartupHandler = awsStartupHandler;
        mIsLegacyMode = true;
        return new InitializeBuilder(context);
    }

    /**
     * Initialize the AWSMobileClient with the parameters passed in
     * {@link InitializeBuilder}
     *
     */
    private void initializeWithBuilder(final InitializeBuilder initializeBuilder) {
        if (initializeBuilder.getAwsConfiguration() != null) {
            this.awsConfiguration = initializeBuilder.getAwsConfiguration();
        }

        if (initializeBuilder.getSignInProviderConfig() != null) {
            this.signInProviderConfig = initializeBuilder.getSignInProviderConfig();
        }

        try {
            fetchCognitoIdentity(initializeBuilder.getContext(), this.startupAuthResultHandler);
        } catch (final Exception exception) {
            Log.e(TAG, "Error in initializing the AWSMobileClient. " +
                    "Check if AWS Cloud Config `awsconfiguration.json` is present in the application.");
        }
    }

    /**
     * Get the AWSConfigurable client if exists, else create one and
     * add it to the clientMap and return.
     *
     * @param context     The activity context
     * @param clientClass SDK Client Class that confirms to the AWSConfigurable interface.
     */
    public AWSConfigurable getClient(final Context context,
                                     final Class<? extends AWSConfigurable> clientClass) {

        Log.d(TAG, "Retrieving the client instance for class: " + clientClass);

        AWSConfigurable client = clientMap.get(clientClass);

        try {
            if (client == null) {
                client = clientClass.newInstance().initialize(context.getApplicationContext(), this.awsConfiguration);
                clientMap.put(clientClass, client);
                Log.d(TAG, "Created the new client: " + client.toString());
            }
        } catch (final Exception exception) {
            Log.e(TAG, "Error occurred in creating and initializing client. "
                    + "Check the context and the clientClass passed in: " + clientClass, exception);
        }

        return client;
    }

    /**
     * Retrieve the CredentialsProvider.
     *
     * @return the awsCredentialsProvider
     * @deprecated Since 2.8.0 This method will be removed in the next minor version.
     * The AWSMobileClient object now implements AWSCredentialsProvider.
     * Please visit https://aws-amplify.github.io for the latest Android documentation.
     */
    @Deprecated
    public AWSCredentialsProvider getCredentialsProvider() {
        if (!isLegacyMode()) {
            return this;
        }
        if (this.awsCredentialsProvider != null) {
            return this.awsCredentialsProvider;
        } else {
            return IdentityManager.getDefaultIdentityManager().getUnderlyingProvider();
        }
    }

    /**
     * Set the CredentialsProvider passed in as the default.
     *
     * @param awsCredentialsProvider The credentials provider object created by the user.
     * @deprecated Since 2.8.0 This method will be removed in the next minor version.
     * The AWSMobileClient object now implements AWSCredentialsProvider.
     * Please visit https://aws-amplify.github.io for the latest Android documentation.
     */
    @Deprecated
    public void setCredentialsProvider(final AWSCredentialsProvider awsCredentialsProvider) {
        this.awsCredentialsProvider = awsCredentialsProvider;
    }

    /**
     * Fetch the Cognito Identity for the user.
     * Register the SignProvider with permissions.
     * Resume any previously signed in auth session and fetch the cognito
     * federated identity for the user in order to connect to
     * AWS services.
     *
     * @param context                  The activity context
     * @param startupAuthResultHandler The callback function for resuming session
     * @deprecated This method is no longer in use.
     */
    private void fetchCognitoIdentity(final Context context,
                                      final StartupAuthResultHandler startupAuthResultHandler) {
        try {
            Log.d(TAG, "Fetching the Cognito Identity.");

            // Create IdentityManager, register the providers and set the permissions.
            final IdentityManager identityManager = new IdentityManager(context, this.awsConfiguration);
            IdentityManager.setDefaultIdentityManager(identityManager);
            if (this.signInProviderConfig == null) {
                this.registerConfigSignInProviders();
            } else {
                this.registerUserSignInProvidersWithPermissions();
            }
            this.resumeSession((Activity) context, startupAuthResultHandler);
        } catch (final Exception exception) {
            Log.e(TAG, "Error occurred in fetching the Cognito Identity "
                    + "and resuming the auth session", exception);
        }
    }

    /**
     * Register the SignInProvider with their permissions
     * supplied by the user.
     */
    private void registerUserSignInProvidersWithPermissions() {
        Log.d(TAG, "Using the SignInProviderConfig supplied by the user.");
        final IdentityManager identityManager = IdentityManager.getDefaultIdentityManager();

        for (final SignInProviderConfig config : signInProviderConfig) {
            identityManager.addSignInProvider((Class<? extends SignInProvider>) config.getSignInProviderClass());
            if (config.getProviderPermissions() != null) {
                if (FacebookSignInProvider.class.isInstance(config.getSignInProviderClass())) {
                    FacebookSignInProvider.setPermissions(config.getProviderPermissions());
                }
                if (GoogleSignInProvider.class.isInstance(config.getSignInProviderClass())) {
                    GoogleSignInProvider.setPermissions(config.getProviderPermissions());
                }
            }
        }
    }

    /**
     * Register the SignInProvider and permissions based on the
     * AWSConfiguration.
     */
    private void registerConfigSignInProviders() {
        Log.d(TAG, "Using the SignInProviderConfig from `awsconfiguration.json`.");
        final IdentityManager identityManager = IdentityManager.getDefaultIdentityManager();

        if (isConfigurationKeyPresent(USER_POOLS)) {
            identityManager.addSignInProvider(CognitoUserPoolsSignInProvider.class);
        }

        if (isConfigurationKeyPresent(FACEBOOK)) {
            identityManager.addSignInProvider(FacebookSignInProvider.class);
        }

        if (isConfigurationKeyPresent(GOOGLE)) {
            identityManager.addSignInProvider(GoogleSignInProvider.class);
        }
    }

    /**
     * Check if the AWSConfiguration has the specified key.
     *
     * @param configurationKey The key for SignIn in AWSConfiguration
     */
    private boolean isConfigurationKeyPresent(final String configurationKey) {
        try {
            JSONObject jsonObject = this.awsConfiguration.optJsonObject(configurationKey);
            if (configurationKey.equals(GOOGLE)) {
                return jsonObject != null && jsonObject.getString(GOOGLE_WEBAPP_CONFIG_KEY) != null;
            } else {
                return jsonObject != null;
            }
        } catch (final Exception exception) {
            Log.d(TAG, configurationKey + " not found in `awsconfiguration.json`");
            return false;
        }
    }

    /**
     * Resume any previously signed-in session.
     *
     * @param callingActivity          The activity context in the app
     * @param startupAuthResultHandler The Callback function for resuming an auth session
     */
    private void resumeSession(final Activity callingActivity,
                               final StartupAuthResultHandler startupAuthResultHandler) {
        IdentityManager
                .getDefaultIdentityManager()
                .resumeSession(callingActivity, startupAuthResultHandler);
    }

    /**
     * {@code InitializeBuilder} accepts and retrieves
     * the optional parameters necessary for initializing the
     * {@link AWSMobileClient} to work on.
     *
     * @deprecated Since 2.8.0 This method will be removed in the next minor version.
     * Please update to use AWSMobileClient using `initialize`.
     * Please visit https://aws-amplify.github.io for the latest Android documentation.
     */
    @Deprecated
    public class InitializeBuilder {

        private Context context;
        private AWSConfiguration awsConfiguration;
        private SignInProviderConfig[] signInProviderConfig;

        /**
         * Constructor that intializes the InitializeBuilder
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public InitializeBuilder() {
            this.context = null;
            this.awsConfiguration = null;
            this.signInProviderConfig = null;
        }

        /**
         * Constructor that intializes the InitializeBuilder
         * with the context passed in.
         *
         * @param context The context object passed in
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public InitializeBuilder(final Context context) {
            this.context = context;
            this.awsConfiguration = null;
            this.signInProviderConfig = null;
        }

        /**
         * Sets the AWSConfiguration object passed in
         *
         * @param awsConfiguration The instance of awsconfiguration.json
         * @return instance of InitializeBuilder
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public InitializeBuilder awsConfiguration(final AWSConfiguration awsConfiguration) {
            this.awsConfiguration = awsConfiguration;
            return this;
        }

        /**
         * Sets the list of SignInProviderConfig passed in
         *
         * @param providersConfig The SignInProvider class with permissions
         * @return instance of InitializeBuilder
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public InitializeBuilder signInProviders(final SignInProviderConfig... providersConfig) {
            this.signInProviderConfig = providersConfig;
            return this;
        }

        /**
         * Retrieve the instance of AWSConfiguration.
         *
         * @return awsConfiguration
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public AWSConfiguration getAwsConfiguration() {
            return this.awsConfiguration;
        }

        /**
         * Retrieve the instance of SignInProvider class and permissions.
         *
         * @return signInProviderConfig
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public SignInProviderConfig[] getSignInProviderConfig() {
            return this.signInProviderConfig;
        }

        /**
         * Retrieve the context.
         *
         * @return context
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public Context getContext() {
            return this.context;
        }

        /**
         * Initialize the {@link AWSMobileClient} with the parameters passed in.
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public void execute() {
            initializeWithBuilder(this);
        }
    }

    /**
     * The wrapper class for SignInProvider class and
     * the permissions necessary for provider.
     *
     * @deprecated Since 2.8.0 This method will be removed in the next minor version.
     * Please update to use AWSMobileClient using `initialize`.
     * Please visit https://aws-amplify.github.io for the latest Android documentation.
     */
    @Deprecated
    public class SignInProviderConfig {

        /**
         * SignInProvider class.
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        private Class<? extends SignInProvider> signInProvider;

        /**
         * Permissions for the SignInProvider.
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        private String[] providerPermissions;

        /**
         * Constructor
         *
         * @param signInProvider      The class object of the SignInProvider
         * @param providerPermissions Provider permissions if applicable
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public SignInProviderConfig(final Class<? extends SignInProvider> signInProvider,
                                    final String... providerPermissions) {
            this.signInProvider = signInProvider;
            this.providerPermissions = providerPermissions;
        }

        /**
         * Retrieve the SignInProvider class
         *
         * @return The SignInProvider class
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public Class<? extends SignInProvider> getSignInProviderClass() {
            return this.signInProvider;
        }

        /**
         * Retrieve the provider permissions
         *
         * @return the provider permissions
         * @deprecated Since 2.8.0 This method will be removed in the next minor version.
         * Please update to use AWSMobileClient using `initialize`.
         * Please visit https://aws-amplify.github.io for the latest Android documentation.
         */
        @Deprecated
        public String[] getProviderPermissions() {
            return this.providerPermissions;
        }
    }
}

class AWSMobileClientStore {
    AWSKeyValueStore mAWSKeyValueStore;

    private ReadWriteLock mReadWriteLock = new ReentrantReadWriteLock();

    AWSMobileClientStore(AWSMobileClient client) {
        mAWSKeyValueStore = new AWSKeyValueStore(client.mContext,
                AWSMobileClient.SHARED_PREFERENCES_KEY,
                client.mIsPersistenceEnabled);
    }

    Map<String, String> get(final String... keys) {
        try {
            mReadWriteLock.readLock().lock();
            HashMap<String, String> attributes = new HashMap<String, String>();
            for (String key : keys) {
                attributes.put(key, mAWSKeyValueStore.get(key));
            }
            return attributes;
        } finally {
            mReadWriteLock.readLock().unlock();
        }
    }

    String get(final String key) {
        try {
            mReadWriteLock.readLock().lock();
            return mAWSKeyValueStore.get(key);
        } finally {
            mReadWriteLock.readLock().unlock();
        }
    }

    void set(final Map<String, String> attributes) {
        try {
            mReadWriteLock.writeLock().lock();
            for (String key : attributes.keySet()) {
                mAWSKeyValueStore.put(key, attributes.get(key));
            }
        } finally {
            mReadWriteLock.writeLock().unlock();
        }
    }

    void set(final String key, final String value) {
        try {
            mReadWriteLock.writeLock().lock();
            mAWSKeyValueStore.put(key, value);
        } finally {
            mReadWriteLock.writeLock().unlock();
        }
    }

    void clear() {
        mAWSKeyValueStore.clear();
    }
}

/**
 * A duplicate class of AWSEnhancedCognitoIdentityProvider that provides the ability to
 * branch into developer authenticated identities.
 */
class AWSMobileClientCognitoIdentityProvider extends AWSAbstractCognitoIdentityProvider {

    boolean isDeveloperAuthenticated;

    /**
     * An extension of the AbstractCognitoProvider that is used to communicate
     * with Cognito.
     *
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     */
    public AWSMobileClientCognitoIdentityProvider(String accountId, String identityPoolId) {
        this(accountId, identityPoolId, new ClientConfiguration());
    }

    /**
     * An extension of the AbstractCognitoProvider that is used to communicate
     * with Cognito.
     *
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     * @param clientConfiguration the configuration to apply to service clients
     *            created
     */
    public AWSMobileClientCognitoIdentityProvider(String accountId, String identityPoolId,
                                              ClientConfiguration clientConfiguration) {
        this(accountId, identityPoolId, new AmazonCognitoIdentityClient
                (new AnonymousAWSCredentials(), clientConfiguration));
    }

    /**
     * An extension of the AbstractCognitoProvider that is used to communicate
     * with Cognito.
     *
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     * @param cibClient the cib client which will be used to contact the cib
     *            back end
     */
    public AWSMobileClientCognitoIdentityProvider(String accountId, String identityPoolId,
                                              AmazonCognitoIdentity cibClient) {
        super(accountId, identityPoolId, cibClient);
    }

    @Override
    protected String getUserAgent() {
        return "AWSMobileClient";
    }

    /**
     * Internal method that switches the flow of the {@link com.amazonaws.auth.CognitoCredentialsProvider}
     * to be the developer authenticated flow.
     *
     * @param identityId provided by user upstream
     * @param token provided by user upstream
     */
    void setDeveloperAuthenticated(final String identityId,
                                   final String token) {
        super.setIdentityId(identityId);
        super.setToken(token);
        isDeveloperAuthenticated = true;
    }

    /**
     * Internal method that switches the flow of the {@link com.amazonaws.auth.CognitoCredentialsProvider}
     * to be the Cognito authenticated flow.
     */
    void setNotDeveloperAuthenticated() {
        isDeveloperAuthenticated = false;
    }

    @Override
    public String getProviderName() {
        return "Cognito";
    }

    @Override
    public String refresh() {
        if (isDeveloperAuthenticated) {
            // The identity id is already set in the setDeveloperAuthenticated call
            return this.token;
        } else {
            getIdentityId();
            return null;
        }
    }

}

class OAuth2Utils {
    private final Context mContext;
    private final Uri mSignInRedirectUri;
    private CustomTabsServiceConnection mCustomTabsServiceConnection;
    private CustomTabsClient mCustomTabsClient;
    private CustomTabsSession mCustomTabsSession;
    private CustomTabsCallback customTabsCallback;
    private String mState;
    private String mError;
    private String mErrorDescription;

    OAuth2Utils(final Context context, final Uri signInRedirectUri) {
        this.mContext = context;
        this.mSignInRedirectUri = signInRedirectUri;
        customTabsCallback = new CustomTabsCallback();
    }

    void preWarm() {
        // Warm up custom tabs for faster launch
        mCustomTabsServiceConnection = new CustomTabsServiceConnection() {
            @Override
            public void onCustomTabsServiceConnected(final ComponentName name, final CustomTabsClient client) {
                mCustomTabsClient = client;
                mCustomTabsClient.warmup(0L);
                mCustomTabsSession = mCustomTabsClient.newSession(customTabsCallback);
            }

            @Override
            public void onServiceDisconnected(final ComponentName name) {
                mCustomTabsClient = null;
            }
        };
        CustomTabsClient.bindCustomTabsService(mContext,
                ClientConstants.CHROME_PACKAGE, mCustomTabsServiceConnection);
    }

    void authorize(final String webDomain, final String clientId, final Map<String, String> queryParameterMap) {
        mState = Pkce.generateRandom();
        final Uri.Builder builder = Uri.parse(webDomain).buildUpon();
        for (Map.Entry<String, String> entry : queryParameterMap.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        if (!queryParameterMap.containsKey("code")) {
            builder.appendQueryParameter("response_type", "code");
        }
        if (!queryParameterMap.containsKey("client_id")) {
            if (clientId != null) {
                builder.appendQueryParameter("client_id", clientId);
            } else {
                throw new IllegalArgumentException("Client id must be specified for an authorization request.");
            }
        }
        builder.appendQueryParameter("state", mState);
        navigate(builder.build());
    }

    /**
     * Opens the CustomTabs browser to the specified URI
     * @param uri
     */
    void navigate(Uri uri) {
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(mCustomTabsSession);
        CustomTabsIntent mCustomTabsIntent = builder.build();
        mCustomTabsIntent.intent.setPackage(ClientConstants.CHROME_PACKAGE);
        mCustomTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        mCustomTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mCustomTabsIntent.launchUrl(mContext, uri);
    }

    boolean parse(Uri uri) {
        // Read the redirect URI for a code
        if (uri.getScheme().equals(mSignInRedirectUri.getScheme())
                && uri.getAuthority().equals(mSignInRedirectUri.getAuthority())
                && uri.getPath().equals(mSignInRedirectUri.getPath())
                && uri.getQueryParameterNames().containsAll(mSignInRedirectUri.getQueryParameterNames())) {
            final String code = uri.getQueryParameter("code");
            final String state = uri.getQueryParameter("state");
            if (!mState.equals(state)) {
                return false;
            }
            mError = uri.getQueryParameter("error");
            mErrorDescription = uri.getQueryParameter("error_description");

            if (mError != null) {
                return true;
            }
        }
        return false;
    }

    Uri exchangeCode(String uri) {
        // Call XXXX/token to exchange code for access token
        return null;
    }

}