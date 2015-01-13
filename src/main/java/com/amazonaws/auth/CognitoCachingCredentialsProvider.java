/**
 * Copyright 2013-2014 Amazon.com, 
 * Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Amazon Software License (the "License"). 
 * You may not use this file except in compliance with the 
 * License. A copy of the License is located at
 * 
 *     http://aws.amazon.com/asl/
 * 
 * or in the "license" file accompanying this file. This file is 
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, express or implied. See the License 
 * for the specific language governing permissions and 
 * limitations under the License.
 */

package com.amazonaws.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.NotAuthorizedException;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.util.VersionInfoUtils;

import java.util.Date;
import java.util.Map;

/**
 * This credentials provider is intended for Android applications. It offers the
 * ability to persist the Cognito identity id in {@link SharedPreferences}.
 * Furthermore, it caches session credentials so as to reduce the number of
 * network requests. This is the provider to use with a custom identity
 * provider, which should be an extension of AWSAbstractCognitoIdentityProvider.
 * This will consume an identity provider, as well. If one is passed in to a
 * constructor, then that one is the one that is consumed, but if not/a
 * constructor that doesn't take an identity provider is used, then the Cognito
 * identity provider is used by default.
 * 
 * <pre>
 * // initiate a credentials provider
 * CognitoCachingCredentialsProvider provider = new CognitoCachingCredentialsProvider(
 *         context,
 *         &quot;awsAccountId&quot;,
 *         &quot;identityPoolId&quot;,
 *         &quot;unauthRoleArn&quot;,
 *         &quot;authRoleArn&quot;,
 *         Regions.US_EAST_1);
 * 
 * // use the provider to instantiate an AWS client
 * AmazonSNS snsClient = new AmazonSNSClient(provider);
 * 
 * // If the user is authenticated through login with Amazon, you can set the map
 * // of token to the provider
 * Map&lt;String, String&gt; logins = new HashMap&lt;String, String&gt;();
 * logins.put(""www.amazon.com", "login with Amazon token");
 * provider.setLogins(logins);
 * 
 * // Note: Please reuse the provider when possible.
 * </pre>
 */
public class CognitoCachingCredentialsProvider
        extends CognitoCredentialsProvider {

    private final String DEFAULT_SHAREDPREFERENCES_NAME = "com.amazonaws.android.auth";
    private static final String USER_AGENT = CognitoCachingCredentialsProvider.class.getName()
            + "/" + VersionInfoUtils.getVersion();
    private final SharedPreferences prefs;
    private String identityId;

    private static final String ID_KEY = "identityId";
    private static final String AK_KEY = "accessKey";
    private static final String SK_KEY = "secretKey";
    private static final String ST_KEY = "sessionToken";
    private static final String EXP_KEY = "expirationDate";

    boolean needIdentityRefresh = false;

    private static final String TAG = "CognitoCachingCredentialsProvider";

    private final IdentityChangedListener listener = new IdentityChangedListener() {
        @Override
        public void identityChanged(String oldIdentityId, String newIdentityId) {
            Log.d(TAG, "Identity id is changed");
            saveIdentityId(newIdentityId);
        }
    };

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool and account id to make a
     * request to the AWS Security Token Service (STS), as well as various other
     * tasks to handle the lifecycle. By default, this will utilize a Cognito
     * identity provider.
     * 
     * @param context The context to be used for the caching
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param region The region to use when contacting Cognito Identity, and STS
     *            (if STS supports the provided regions, otherwise STS will be
     *            contacted using the US_EAST_1 region)
     */
    public CognitoCachingCredentialsProvider(Context context,
            String accountId, String identityPoolId, String unauthRoleArn, String authRoleArn,
            Regions region) {
        this(context, accountId, identityPoolId, unauthRoleArn, authRoleArn, region,
                new ClientConfiguration());

    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool and account id to make a
     * request to the AWS Security Token Service (STS), as well as various other
     * tasks to handle the lifecycle. By default, this will utilize a Cognito
     * identity provider.
     * 
     * @param context The context to be used for the caching
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     * @param region The region to use when contacting Cognito Identity, and STS
     *            (if STS supports the provided regions, otherwise STS will be
     *            contacted using the US_EAST_1 region)
     */
    public CognitoCachingCredentialsProvider(Context context,
            String accountId, String identityPoolId, String unauthRoleArn, String authRoleArn,
            Regions region,
            ClientConfiguration clientConfiguration) {
        super(accountId, identityPoolId, unauthRoleArn, authRoleArn, region, clientConfiguration);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        checkUpgrade();
        this.identityId = getCachedIdentityId();
        loadCachedCredentials();
        registerIdentityChangedListener(listener);
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool and account id to make a
     * request to the AWS Security Token Service (STS), as well as various other
     * tasks to handle the lifecycle. By default, this will utilize a Cognito
     * identity provider.
     * 
     * @param context The context to be used for the caching
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param cibClient Preconfigured CognitoIdentity client to make requests
     *            with
     * @param stsClient Preconfigured STS client to make requests with
     */
    public CognitoCachingCredentialsProvider(Context context, String accountId,
            String identityPoolId, String unauthRoleArn, String authRoleArn,
            AmazonCognitoIdentityClient cib, AWSSecurityTokenService sts) {
        this(context, new AWSBasicCognitoIdentityProvider(accountId, identityPoolId, cib),
                unauthRoleArn, authRoleArn, sts);
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool and account id to make a
     * request to the AWS Security Token Service (STS), as well as various other
     * tasks to handle the lifecycle. This is to be used with a custom identity
     * provider
     * 
     * @param context The context to be used for the caching
     * @param provider The identity provider to be consumed by the credentials
     *            provider
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param stsClient Preconfigured STS client to make requests with
     */
    public CognitoCachingCredentialsProvider(Context context, AWSCognitoIdentityProvider provider,
            String unauthRoleArn, String authRoleArn, AWSSecurityTokenService sts) {
        super(provider, unauthRoleArn, authRoleArn, sts);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        checkUpgrade();
        this.identityId = getCachedIdentityId();
        loadCachedCredentials();
        registerIdentityChangedListener(listener);
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool and account id to make a
     * request to the AWS Security Token Service (STS), as well as various other
     * tasks to handle the lifecycle. This is to be used with a custom identity
     * provider
     * 
     * @param context The context to be used for the caching
     * @param provider The identity provider to be consumed by the credentials
     *            provider
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     */
    public CognitoCachingCredentialsProvider(Context context, AWSCognitoIdentityProvider provider,
            String unauthRoleArn, String authRoleArn) {
        super(provider, unauthRoleArn, authRoleArn, new AWSSecurityTokenServiceClient(
                new AnonymousAWSCredentials(),
                new ClientConfiguration()));

        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        checkUpgrade();
        this.identityId = getCachedIdentityId();
        loadCachedCredentials();
        registerIdentityChangedListener(listener);
    }

    /**
     * Gets the Cognito identity id of the user. The first time when this method
     * is called, a network request will be made to retrieve a new identity id.
     * After that it's saved in {@link SharedPreferences}. Please don't call it
     * in the main thread.
     * 
     * @return identity id of the user
     */
    @Override
    public String getIdentityId() {
        // If a login has been added, this condition is met
        // and refresh is called to update the id
        if (needIdentityRefresh) {
            needIdentityRefresh = false;
            refresh();
            identityId = super.getIdentityId();
            saveIdentityId(identityId);
        }

        // try to get the ID from SharedPreferences
        this.identityId = getCachedIdentityId();
        if (this.identityId == null) {
            identityId = super.getIdentityId();
            saveIdentityId(identityId);
        }
        return identityId;
    }

    @Override
    synchronized public AWSSessionCredentials getCredentials() {
        if (sessionCredentials == null) {
            loadCachedCredentials();
        }
        // return only if the credentials are valid
        if (!needsNewSession()) {
            return sessionCredentials;
        }

        try {
            // super will validate loaded credentials
            // and fetch if necessary
            super.getCredentials();
        } catch (NotAuthorizedException e) {
            Log.e(TAG, "Failure to get credentials", e);
            if (getLogins() != null) {
                // If the fetch failed then the credentials don't
                // match the current id, so clear them
                clear();
                super.getCredentials();
            }
            else {
                throw e;
            }
        }

        saveCredentials(sessionCredentials,
                getSessionCredentitalsExpiration().getTime());

        return sessionCredentials;
    }

    @Override
    public void setLogins(Map<String, String> logins) {
        super.setLogins(logins);
        // A new login has been added, so an identity refresh is necessary
        needIdentityRefresh = true;
        // clear cached credentials
        clearCredentials();
    }

    /* (non-Javadoc)
     * @see com.amazonaws.auth.CognitoCredentialsProvider#clear()
     * 
     * Clears the AWS credentials and the identity id.
     */
    @Override
    public void clear() {
        super.clear();

        // clear cached identity id and credentials
        prefs.edit().clear().apply();
    }
    
    /* (non-Javadoc)
     * @see com.amazonaws.auth.CognitoCredentialsProvider#clearCredentials()
     * 
     * Clears the AWS credentials
     */
    @Override
    public void clearCredentials() {
        super.clearCredentials();
        Log.d(TAG, "Clearing credentials from SharedPreferences");
        if (sessionCredentials != null) {
            prefs.edit()
            .remove(namespace(AK_KEY))
            .remove(namespace(SK_KEY))
            .remove(namespace(ST_KEY))
            .remove(namespace(EXP_KEY))
            .apply();
        }
    }

    /**
     * Gets the cached identity id without making a network request.
     * 
     * @return cached identity id, null if it doesn't exist
     */
    public String getCachedIdentityId() {
        String cachedIdentityId = prefs.getString(namespace(ID_KEY), null);
        if (cachedIdentityId != null && identityId == null) {
            super.setIdentityId(cachedIdentityId);
        }
        return cachedIdentityId;
    }

    /**
     * Load the credentials from prefs
     */
    private void loadCachedCredentials() {
        Log.d(TAG, "Loading credentials from SharedPreferences");
        sessionCredentialsExpiration = new Date(prefs.getLong(namespace(EXP_KEY), 0));
        // make sure we have valid data in prefs
        boolean hasAK = prefs.contains(namespace(AK_KEY));
        boolean hasSK = prefs.contains(namespace(SK_KEY));
        boolean hasST = prefs.contains(namespace(ST_KEY));
        if (!hasAK || !hasSK || !hasST) {
            Log.d(TAG, "No valid credentials found in SharedPreferences");
            sessionCredentialsExpiration = null;
            return;
        }
        String AK = prefs.getString(namespace(AK_KEY), null);
        String SK = prefs.getString(namespace(SK_KEY), null);
        String ST = prefs.getString(namespace(ST_KEY), null);

        sessionCredentials = new BasicSessionCredentials(AK, SK, ST);
    }

    /**
     * Save the credentials to SharedPreferences
     */
    private void saveCredentials(AWSSessionCredentials sessionCredentials,
            long time) {
        Log.d(TAG, "Saving credentials to SharedPreferences");
        if (sessionCredentials != null) {
            prefs.edit()
                    .putString(namespace(AK_KEY), sessionCredentials.getAWSAccessKeyId())
                    .putString(namespace(SK_KEY), sessionCredentials.getAWSSecretKey())
                    .putString(namespace(ST_KEY), sessionCredentials.getSessionToken())
                    .putLong(namespace(EXP_KEY), time)
                    .apply();
        }
    }

    /**
     * clear cached identity id and credentials Save the Amazon Cognito Identity
     * Id to SharedPreferences
     */
    private void saveIdentityId(String identityId) {
        Log.d(TAG, "Saving identity id to SharedPreferences");
        this.identityId = identityId;

        prefs.edit()
                .putString(namespace(ID_KEY), identityId)
                .apply();
    }

    @Override
    protected String getUserAgent() {
        return USER_AGENT;
    }

    // To support multiple identity pools in the same app, namespacing the keys
    // in shared preferences is required. However, in order to keep previously
    // saved identity id, unauthenticated id in particular, a check of the id
    // under the old key is performed. If there is one, save it under the new
    // namespace.
    private void checkUpgrade() {
        // check identity id without namespace
        if (prefs.contains(ID_KEY)) {
            Log.i(TAG,
                    "Identity id without namespace is detected. It will be saved under new namespace.");
            // save identity id
            String identityId = prefs.getString(ID_KEY, null);
            prefs.edit().clear() // clear old data
                    .putString(namespace(ID_KEY), identityId)
                    .apply();
        }
    }

    // prefix the key with identity pool id
    private String namespace(String key) {
        return getIdentityPoolId() + "." + key;
    }
}
