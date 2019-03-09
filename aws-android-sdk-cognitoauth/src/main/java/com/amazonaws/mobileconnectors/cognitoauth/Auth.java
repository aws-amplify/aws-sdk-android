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

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;

import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidParameterException;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;

import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

/**
 * Abstraction for Cognito Auth, provides methods to authenticate users in a User-Pool.
 * <p>
 *     Provides methods to get tokens, retrieve the last authenticated user on the device, and
 *     sign-out users.
 * </p>
 */

public final class Auth {
    /**
     * The host application {@link Context}.
     */
    private final Context context;

    /**
     * Cognito user pool Id
     */
    private final String userPoolId;

    /**
     * Identity Provider for social login
     */
    private final String identityProvider;

    /**
     * Identity provider (idp) identifier, works as an alias to the real idp
     */
    private final String idpIdentifier;

    /**
     * Bundle containing customization flags for chrome custom tab
     */
    private final Bundle customTabExtras;

    /**
     * Reference to the store that manages secure storage of tokens
     */
    AWSKeyValueStore awsKeyValueStore;

    /**
     * This identifies the settings for additional userPool features.
     */
    private boolean advancedSecurityDataCollectionFlag;

    /**
     * This is the  hostname for the app/user-pool.
     */
    private final String appWebDomain;

    /**
     * Cognito App-Client Id.
     */
    private final String appId;

    /**
     * Cognito App-Client Secret.
     */
    private final String appSecret;

    /**
     * Redirect-Uri after Sign-In.
     * <p>This is also the redirect Uri for SignUp and Forgot-Password processes.</p>
     */
    private final String signInRedirectUri;

    /**
     * Redirect-Uri after Sign-Out.
     */
    private final String signOutRedirectUri;

    /**
     * Scopes for the requested tokens.
     */
    private final Set<String> scopes;

    /**
     * Local client to manage user level activities.
     */
    private AuthClient user;

    /**
     * Flag indicating if the tokens will be cached on device.
     * By default, this is enabled.
     */
    private boolean isPersistenceEnabled = true;

    /**
     * It enables user context data collection.
     */
    public void setAdvancedSecurityDataCollection(boolean isEnabled) {
            this.advancedSecurityDataCollectionFlag = isEnabled;
    }
 
    /**
     * @return It identifies if the data collection is enabled. By default, we
     *         do collect user context data.
     */
    public boolean isAdvancedSecurityDataCollectionEnabled() {
        return advancedSecurityDataCollectionFlag;
    }

    /**
     * Enable or disable persistence
     * @param isPersistenceEnabled flag if true indicates tokens are persisted.
     */
    public void setPersistenceEnabled(boolean isPersistenceEnabled) {
        this.isPersistenceEnabled = isPersistenceEnabled;
        awsKeyValueStore.setPersistenceEnabled(this.isPersistenceEnabled);
    }

    /**
     * Instantiates {@link Auth}.
     * <p><b>Note: </b>This SDK not obfuscate the App Secret. When using App Secret in the production
     * app's, you must take precautions to properly hide the Secret.</p>
     * @param context Required: The Android application {@link Context}.
     * @param userPoolId : Id for cognito user pool used by application.
     * @param appWebDomain Required: The application/user-pools Cognito web hostname,
     *                     this is set at the Cognito console.
     * @param appId Required: The Cognito App/Client Id.
     * @param appSecret Required: The Cognito App/Client secret associated with the {@code appId}.
     * @param signInRedirectUri Required: The callback Uri after successful authentication.
     * @param signOutRedirectUri Required: The callback Uri after sign-out.
     * @param scopes Required: Scopes requested for the tokens.
     * @param userHandler Required: An instance of the callback handler.
     * @param advancedSecurityDataCollectionFlag : Flag identifying if user context data should be collected.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    private Auth(final Context context,
                 final String userPoolId,
                 final String appWebDomain,
                 final String appId,
                 final String appSecret,
                 final String signInRedirectUri,
                 final String signOutRedirectUri,
                 final Set<String> scopes,
                 final AuthHandler userHandler,
                 final boolean advancedSecurityDataCollectionFlag,
                 final String identityProvider,
                 final String idpIdentifier,
                 final Bundle customTabExtras,
                 final boolean isPersistenceEnabled) {
        this.context = context;
        this.appWebDomain = appWebDomain;
        this.appId = appId;
        this.appSecret = appSecret;
        this.signInRedirectUri = signInRedirectUri;
        this.signOutRedirectUri = signOutRedirectUri;
        this.scopes = scopes;
        this.user = new AuthClient(context, this);
        this.user.setUserHandler(userHandler);
        this.userPoolId = userPoolId;
        this.advancedSecurityDataCollectionFlag = advancedSecurityDataCollectionFlag;
        this.identityProvider = identityProvider;
        this.idpIdentifier = idpIdentifier;
        this.customTabExtras = customTabExtras;
        this.isPersistenceEnabled = isPersistenceEnabled;
        this.awsKeyValueStore = new AWSKeyValueStore(context,
                ClientConstants.APP_LOCAL_CACHE,
                this.isPersistenceEnabled);
        getCurrentUser();
    }

    /**
     * Builder class for {@link Auth} objects.
     */
    public static final class Builder {
        /**
    	 * The host application Context.
    	 */
        private Context mAppContext;

        /**
         * Amazon Cognito Auth web domain.
         */
        private String mAppWebDomain;

        /**
         * Amazon Cognito App Client Id.
         * <p>Optional, use a Client Secret only if it can be safely obfuscated in the
         * application</p>
         */
        private String mAppClientId;

        /**
         * Amazon Cognito App Client Secret.
         */
        private String mAppSecret;

        /**
         * Redirect Uri for Sign In.
         */
        private String mSignInRedirect;

        /**
         * Redirect Uri for Sign Out.
         */
        private String mSignOutRedirect;

        /**
         * Scopes for the requested tokens.
         */
        private Set<String> mScopes;

        /**
         * Callback handler.
         */
        private AuthHandler mUserHandler;

        /**
         * User Pool id for the userPool.
         */
        private String mUserPoolId;

        /**
         * Identity Provider for the userPool.
         */
        private String mIdentityProvider;

        /**
         * Idp identifier for the userPool.
         */
        private String mIdpIdentifier;

        /**
         * Bundle of flags to customize chrome custom tab UI
         */
        private Bundle mCustomTabsExtras;

        /**
         * Flag indicating if data collection for advanced security mode is enabled.
         * By default this is enabled.
         */
        private boolean mAdvancedSecurityDataCollectionFlag = true;

        /**
         * Flag indicating if the tokens will be cached on device.
         * By default, this is enabled.
         */
        private boolean mIsCachingEnabled = true;

        public Builder setPersistenceEnabled(boolean isPersistenceEnabled) {
            this.mIsCachingEnabled = isPersistenceEnabled;
            return this;
        }

        /**
         * Sets flag to enable user context data collection. By
         * default, the flag is set to true.
         * <p>
         *     Flag identifying if user context data should be collected for
         *     advanced security evaluation.
         * </p>
         * @param advancedSecurityDataCollectionFlag value for data collection
         * @return A reference to this builder.
         */
        public Builder setAdvancedSecurityDataCollection(final boolean advancedSecurityDataCollectionFlag) {
            this.mAdvancedSecurityDataCollectionFlag = advancedSecurityDataCollectionFlag;
            return this;
        }
 
        /**
         * Sets cognito user pool Id used by the application. 
         * @param userPoolId pool id for cognito user pool.
         * @return A reference to this builder.
         */
        public Builder setUserPoolId(final String userPoolId) {
            this.mUserPoolId = userPoolId;
            return this;
        }

        /**
         * Sets the Cognito App-Client Id.
         * <p>
         *     Required to allow the SDK to interact with the User-Pool.
         * </p>
         * @param mAppClientId Required: The App-Client Id.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setAppClientId(final String mAppClientId) {
            this.mAppClientId = mAppClientId;
            return this;
        }

        /**
         * Sets the Android Application Context.
         * <p>
         *     Required to allow the SDK to use the Android OS services.
         * </p>
         * @param mAppContext Required: {@link Context}.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setApplicationContext(final Context mAppContext) {
            this.mAppContext = mAppContext;
            return this;
        }

        /**
         * Sets the Cognito App-Client Secret.
         * <p>
         *     Required only if the used App-Client id has an associated secret.
         *     <b>Note</b>: When using App-Client secret, take necessary pre-cautions to
         *     obfuscate the secret in your app.
         * </p>
         * @param mAppSecret Optional: The Secret associated with the App-Client Id.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setAppClientSecret(final String mAppSecret) {
            this.mAppSecret = mAppSecret;
            return this;
        }

        /**
         * Sets Cognito Auth Web domain.
         * <p>
         *     Required to allow app users to interact with the Cognito Auth's hosted web pages.
         * </p>
         * @param mAppWebDomain Required: The Cognito Auth Web Domain.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setAppCognitoWebDomain(final String mAppWebDomain) {
            this.mAppWebDomain = mAppWebDomain;
            return this;
        }

        /**
         * Sets the redirect uri for Sign-In operations.
         *  <p>
         *      Required to allow Amazon Cognito Auth to correctly redirect after successful
         *      authentication.
         *      Must be a fully-qualified domain name and include the scheme.
         *      Must one of the allowed redirect uri for sign-in in the User-Pool.
         *      This is the redirect uri for SignUp and Forgot-Password processes.
         *  </p>
         * @param mSignInRedirect Required: The redirect uri for Sign-In.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setSignInRedirect(final String mSignInRedirect) {
            this.mSignInRedirect = mSignInRedirect;
            return this;
        }

        /**
         * Sets the redirect uri for Sign-Out operations.
         * <p>
         *     Required to allow Amazon Cognito Auth to correctly redirect Sign-Out.
         *     Must be a fully-qualified domain name and include the scheme.
         *     Must one of the allowed redirect uri for sign-out in the User-Pool.
         * </p>
         * @param mSignOutRedirect Required: The redirect uri for Sign-Out.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setSignOutRedirect(final String mSignOutRedirect) {
            this.mSignOutRedirect = mSignOutRedirect;
            return this;
        }

        /**
         * Sets the scopes for tokens.
         * <p>
         *     Optional. Set scopes when requesting tokens with specific set of permissions.
         *     Default scopes for the user-pool will be used if this is not set.
         * </p>
         * @param mScopes Required: Scopes as a {@link Set<String>}.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setScopes(final Set<String> mScopes) {
            this.mScopes = mScopes;
            return this;
        }

        /**
         * Set the callback handler for {@link Auth}.
         * @param mUserHandler Required: {@link AuthHandler}.
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setAuthHandler(final AuthHandler mUserHandler) {
            this.mUserHandler = mUserHandler;
            return this;
        }

        /**
         * Sets the identity provider. This will change the hosted UI behavior to go directly to the specified social provider
         * <p>
         *     Optional. Set identity provider for social sign in.
         * </p>
         * @param mIdentityProvider Optional: Will change the hosted UI behavior to go directly to the specified social provider
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setIdentityProvider(final String mIdentityProvider) {
            this.mIdentityProvider = mIdentityProvider;
            return this;
        }

        /**
         * Sets the identity provider (idp) identifier. This will change the hosted UI behavior to go directly to the corresponding provider
         * Used by the developer to map to a identity provider name without exposing the provider name.
         * <p>
         *     Optional. Set idp identifier for provider mapping.
         * </p>
         * @param mIdpIdentifier Optional: Will change the hosted UI behavior to go directly to the corresponding provider
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setIdpIdentifier(final String mIdpIdentifier) {
            this.mIdpIdentifier = mIdpIdentifier;
            return this;
        }

        /**
         * Sets customization bundle. This allow to customize chrome custom tab.
         * <p>
         *     Optional. Set a bundle to customize UI
         * </p>
         * @param mCustomTabsExtras Optional: Pass to chrome custom tab a bundle of customization flags
         * @return A reference to this builder.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder setCustomTabsExtras(final Bundle mCustomTabsExtras) {
            this.mCustomTabsExtras = mCustomTabsExtras;
            return this;
        }

        /**
         * Instantiates {@link Auth} with the set options.
         * @return {@link Auth}.
         */
        public Auth build() {
            validateCognitoAuthParameters();
            return new Auth(this.mAppContext,
                    this.mUserPoolId,
                    this.mAppWebDomain,
                    this.mAppClientId,
                    this.mAppSecret,
                    this.mSignInRedirect,
                    this.mSignOutRedirect,
                    this.mScopes,
                    this.mUserHandler,
                    this.mAdvancedSecurityDataCollectionFlag,
                    this.mIdentityProvider,
                    this.mIdpIdentifier,
                    this.mCustomTabsExtras,
                    this.mIsCachingEnabled);
        }


        /**
         * Checks if all required parameters are available to instantiate {@link Auth}.
         */
        private void validateCognitoAuthParameters() {
            StringBuilder errorStringBuilder = new StringBuilder();
            boolean error = false;
            JSONObject errorMessage = new JSONObject();
            try {
                if (this.mAppContext == null) {
                    errorMessage.put("ApplicationContext", "cannot be null");
                    error = true;
                }
                if (this.mAppClientId == null || this.mAppClientId.length() < 1) {
                    errorMessage.put("AppClientId", "invalid");
                    error = true;
                }
                if (!isValidDomain(this.mAppWebDomain)) {
                    errorMessage.put("AppCognitoWebDomain", "invalid");
                    error = true;
                }
                if (this.mSignInRedirect == null) {
                    errorMessage.put("SignInRedirect", "cannot be null");
                    error = true;
                }
                if (this.mSignOutRedirect == null) {
                    errorMessage.put("SignOutRedirect", "cannot be null");
                    error = true;
                }
                if (this.mScopes == null) {
                    this.mScopes = new HashSet<String>();
                }
                if (this.mAppSecret != null && this.mAppSecret.length() < 1) {
                    this.mAppSecret = null;
                }
                if (this.mUserHandler == null) {
                    errorMessage.put("AuthHandler", "cannot be null");
                    error = true;
                }
                if (error) {
                    throw new AuthInvalidParameterException(errorMessage.toString());
                }
            } catch (Exception e) {
                throw new AuthInvalidParameterException("validation failed", e);
            }
        }

        /**
         * Validates domain.
         * @param uri The uri as a {@link String}.
         * @return {@code true} is the domain name is valid.
         */
        private boolean isValidDomain(String uri) {
            if (uri == null) {
                return false;
            }
            return Patterns.DOMAIN_NAME.matcher(uri).matches();
        }
    }

    /**
     * @return an instance of {@link Auth} after setting to the last authenticated user on
     * the device.
     */
    public Auth getCurrentUser() {
        this.user.setUsername(LocalDataManager.getLastAuthUser(awsKeyValueStore, context, appId));
        return this;
    }

    /**
     * @return Id for the cognito user pool used by the application.
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * @return the web domain set for this application.
     */
    public String getAppWebDomain() {
        return appWebDomain;
    }

    /**
     * @return the Cognito Client App-Id set for this application.
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @return the Cognito Client App-Secret.
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * @return Scopes set for this {@link Auth} instance.
     */
    public Set<String> getScopes() {
        return scopes;
    }

    /**
     * @return The username set for this {@link Auth} instance.
     */
    public String getUsername() {
        return this.user.getUsername();
    }

    /**
     * @return Sign-In redirect uri set for this {@link Auth} instance.
     */
    public String getSignInRedirectUri() {
        return signInRedirectUri;
    }

    /**
     * @return Sign-Out redirect uri set for this {@link Auth} instance.
     */
    public String getSignOutRedirectUri() {
        return signOutRedirectUri;
    }

    /**
     * @return Identity Provider set for this {@link Auth} instance.
     */
    public String getIdentityProvider() {
        return identityProvider;
    }

    /**
     * @return Identity Provider identifier set for this {@link Auth} instance.
     */
    public String getIdpIdentifier() {
        return idpIdentifier;
    }

    /**
     * @return Extra customization bundle for this {@link Auth} instance.
     */
    public Bundle getCustomTabExtras() {
        return customTabExtras;
    }

    /**
     * Use this method to get tokens for a user, the tokens are returned though the callback.
     * {@link AuthHandler#onSuccess(AuthUserSession)}.
     * <p>
     *     If a username is available, this method looks for valid cached tokens on the device.
     *     If the cached token have expired and the refresh token (if available) is used to get new
     *     tokens.
     *     If valid tokens are not available locally or if the username is not set, Cognito Auth's
     *     web interface is launched on Chrome Custom Tabs. The user credentials will be required to
     *     authenticate.
     *     <b>Note</b>: This SDK uses OAuth Code-Grant flow with PKCE, for authentication. To get
     *     tokens after successful user authentication, the Amazom Cognito Auth returns the
     *     authentication code through the redirect uri. Call {@link Auth#getTokens(Uri)} to
     *     get tokens from the authentication code. <i>Uri</i> is the redirect uri with the
     *     authentication code.
     * </p>
     */
    public void getSession() {
        this.user.getSession();
    }

    /**
     * Signs out the user.
     * <p>
     *     Invokes Cognito Auth's web signout domain to clear cookies stored.
     *     If username is set, the  local cached tokens are cleared.
     * </p>
     */
    public void signOut() {
        this.user.signOut();
    }

    /**
     * @return {@code True} if a user has valid cached tokens.
     */
    public boolean isAuthenticated() {
        return this.user.isAuthenticated();
    }

    /**
     * Exchanges the Cognito Authentication Code for Cognito Tokens.
     * <p>
     *     Call this method when the Chrome Custom tabs redirect to the your app {@link android.app.Activity}
     *     after authentication. Pass the redirect uri as parameter, the redirect uri can can be found
     *     in the {@link android.content.Intent} used to invoke your {@link android.app.Activity}.
     * </p>
     * @param uri Required: {@link Uri} containing the redirect and authentication code.
     */
    public void getTokens(final Uri uri) {
        this.user.getTokens(uri);
    }

    /**
     * Set a username for the {@link Auth} instance.
     * @param username Required: The username of the user in your Cognito User-Pool.
     * @return {@link Auth}.
     */
    public Auth setUsername(final String username) {
        this.user.setUsername(username);
        return this;
    }

    /**
     * Release resources used by {@link Auth}
     */
    public void release() {
        this.user.unbindServiceConnection();
    }
}
