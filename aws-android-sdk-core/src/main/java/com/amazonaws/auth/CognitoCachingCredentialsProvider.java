/**
 * Copyright 2011-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
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
 * <p>
 * Note: if you haven't yet associated your IAM roles with your identity pool,
 * please do so via the Cognito console before using this constructor. You will
 * get an InvalidIdentityPoolConfigurationException if you use it and have not.
 * </p>
 *
 * <pre>
 * // initiate a credentials provider
 * CognitoCachingCredentialsProvider provider = new CognitoCachingCredentialsProvider(
 *         context,
 *         &quot;identityPoolId&quot;,
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
 *
 * //The existing constructor will work without doing so, but will not use the enhanced flow:
 * CognitoCachingCredentialsProvider provider = new CognitoCachingCredentialsProvider(
 *         context,
 *         &quot;awsAccountId&quot;,
 *         &quot;identityPoolId&quot;,
 *         &quot;unauthRoleArn&quot;,
 *         &quot;authRoleArn&quot;,
 *         Regions.US_EAST_1);
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

    volatile boolean needIdentityRefresh = false;

    private static final String TAG = "CognitoCachingCredentialsProvider";

    private final IdentityChangedListener listener = new IdentityChangedListener() {
        @Override
        public void identityChanged(String oldIdentityId, String newIdentityId) {
            Log.d(TAG, "Identity id is changed");
            saveIdentityId(newIdentityId);
            clearCredentials();
        }
    };

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request, using
     * the basic authentication flow, to the AWS Security Token Service (STS) to
     * request short-lived session credentials, which will then be returned by
     * this class's {@link #getCredentials()} method.
     *
     * @param context The Android context to be used for the caching
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param region The region to use when contacting Cognito Identity
     */
    public CognitoCachingCredentialsProvider(Context context, String accountId,
            String identityPoolId, String unauthRoleArn, String authRoleArn, Regions region) {
        super(accountId, identityPoolId, unauthRoleArn, authRoleArn, region);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request, using
     * the basic authentication flow, to the AWS Security Token Service (STS) to
     * request short-lived session credentials, which will then be returned by
     * this class's {@link #getCredentials()} method.
     * <p>
     * This version of the constructor allows you to specify a client
     * configuration for the Amazon Cognito and STS clients.
     * </p>
     *
     * @param context The Android context to be used for the caching
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cognito identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param region The region to use when contacting Cognito Identity
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     */
    public CognitoCachingCredentialsProvider(Context context, String accountId,
            String identityPoolId, String unauthRoleArn, String authRoleArn, Regions region,
            ClientConfiguration clientConfiguration) {
        super(accountId, identityPoolId, unauthRoleArn, authRoleArn, region, clientConfiguration);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request to
     * Cognito, using the enhanced flow, to get short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     * <p>
     * Note: if you haven't yet associated your IAM roles with your identity
     * pool, please do so via the Cognito console before using this constructor.
     * You will get an InvalidIdentityPoolConfigurationException if you use it
     * and have not. The existing constructor (mirroring this one but with roles
     * and an account id) will work without doing so, but will not use the
     * enhanced flow.
     * </p>
     *
     * @param context The Android context to be used for the caching
     * @param identityPoolId The Amazon Cognito identity pool to use
     * @param region The region to use when contacting Cognito Identity
     */
    public CognitoCachingCredentialsProvider(Context context, String identityPoolId, Regions region) {
        super(identityPoolId, region);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request to
     * Cognito, using the enhanced flow, to get short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     * <p>
     * This version of the constructor allows you to specify a client
     * configuration for the Amazon Cognito client.
     * </p>
     * <p>
     * Note: if you haven't yet associated your IAM roles with your identity
     * pool, please do so via the Cognito console before using this constructor.
     * You will get an InvalidIdentityPoolConfigurationException if you use it
     * and have not. The existing constructor (mirroring this one but with roles
     * and an account id) will work without doing so, but will not use the
     * enhanced flow.
     * </p>
     *
     * @param context The Android context to be used for the caching
     * @param identityPoolId The Amazon Cognito identity pool to use
     * @param region The region to use when contacting Cognito Identity
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     */
    public CognitoCachingCredentialsProvider(Context context, String identityPoolId,
            Regions region, ClientConfiguration clientConfiguration) {
        super(identityPoolId, region, clientConfiguration);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request to the
     * AWS Security Token Service (STS) to get short-lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     * <p>
     * This version of the constructor allows you to specify the Amazon Cognito
     * and STS client to use.
     * </p>
     * <p>
     * Set the roles and stsClient to null to use the enhanced authentication
     * flow, not contacting STS. Otherwise the basic flow will be used.
     * </p>
     *
     * @param context The Android context to be used for the caching
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
            String identityPoolId, String unauthArn, String authArn,
            AmazonCognitoIdentityClient cibClient, AWSSecurityTokenService stsClient) {
        super(accountId, identityPoolId, unauthArn, authArn, cibClient, stsClient);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * set up a link to the provider passed in using the basic authentication
     * flow to get get short-lived credentials from STS, which can be retrieved
     * from {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class.
     * </p>
     *
     * @param context The Android context to be used for the caching
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with STS
     * @param unauthArn the unauthArn, for use with the STS call
     * @param authArn the authArn, for use with the STS call
     */
    public CognitoCachingCredentialsProvider(Context context, AWSCognitoIdentityProvider provider,
            String unauthArn, String authArn) {
        super(provider, unauthArn, authArn);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * set up a link to the provider passed in to use the basic authentication
     * flow to get short-lived credentials from STS, which can be retrieved from
     * {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class, and the STS client to use.
     * </p>
     *
     * @param context The Android context to be used for the caching
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with STS
     * @param unauthArn the unauthArn, for use with the STS call
     * @param authArn the authArn, for use with the STS call
     * @param stsClient the sts endpoint to get session credentials from
     */
    public CognitoCachingCredentialsProvider(Context context, AWSCognitoIdentityProvider provider,
            String unauthArn, String authArn, AWSSecurityTokenService stsClient) {
        super(provider, unauthArn, authArn, stsClient);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * set up a link to the provider passed in using the enhanced authentication
     * flow to get short-lived credentials from Amazon Cognito, which can be
     * retrieved from {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class.
     * </p>
     * <p>
     * Note: if you haven't yet associated your IAM roles with your identity
     * pool, please do so via the Cognito console before using this constructor.
     * You will get an InvalidIdentityPoolConfigurationException if you use it
     * and have not. The existing constructor (mirroring this one but with
     * roles) will work without doing so, but will not use the enhanced flow.
     * </p>
     *
     * @param context The Android context to be used for the caching
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with Amazon
     *            Cognito
     * @param region The region to use when contacting Cognito
     */
    public CognitoCachingCredentialsProvider(Context context, AWSCognitoIdentityProvider provider,
            Regions region) {
        super(provider, region);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * set up a link to the provider passed in using the enhanced authentication
     * flow to get short-lived credentials from Amazon Cognito, which can be
     * retrieved from {@link #getCredentials()}
     * <p>
     * This version of the constructor allows you to specify your own Identity
     * Provider class and the configuration for the Amazon Cognito client.
     * </p>
     * <p>
     * Note: if you haven't yet associated your IAM roles with your identity
     * pool, please do so via the Cognito console before using this constructor.
     * You will get an InvalidIdentityPoolConfigurationException if you use it
     * and have not. The existing constructor (mirroring this one but with
     * roles) will work without doing so, but will not use the enhanced flow.
     * </p>
     *
     * @param context The Android context to be used for the caching
     * @param provider a reference to the provider in question, including what's
     *            needed to interact with it to later connect with Amazon
     *            Cognito
     * @param clientConfiguration Configuration to apply to service clients
     *            created
     * @param region The region to use when contacting Cognito Identity
     */
    public CognitoCachingCredentialsProvider(Context context, AWSCognitoIdentityProvider provider,
            Regions region, ClientConfiguration clientConfiguration) {
        super(provider, region, clientConfiguration);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.prefs = context.getSharedPreferences(DEFAULT_SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
        initialize();
    }

    private void initialize() {
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
    public AWSSessionCredentials getCredentials() {
    	credentialsLock.writeLock().lock();
        try {
        	// return only if the credentials are valid
        	if (sessionCredentials == null) {
        		loadCachedCredentials();
        	}

        	if ((sessionCredentialsExpiration != null) && !needsNewSession()) {
        		return sessionCredentials;
        	}
        	// super will validate loaded credentials
        	// and fetch if necessary
        	super.getCredentials();

        	// null check before saving credentials
        	if (sessionCredentialsExpiration != null) {
        		saveCredentials(sessionCredentials, 
        				sessionCredentialsExpiration.getTime());
        	}
        	return sessionCredentials;
        } catch (NotAuthorizedException e) {
            Log.e(TAG, "Failure to get credentials", e);
            if (getLogins() != null) {
                // If the fetch failed then the credentials don't
                // match the current id, so clear them
                super.setIdentityId(null);
                super.getCredentials();
                return sessionCredentials;
            }
            else {
                throw e;
            }
        } finally {
        	credentialsLock.writeLock().unlock();
        }
    }
    
    @Override
    public void refresh() {
    	credentialsLock.writeLock().lock();
    	try {
    		super.refresh();

    		// null check before saving credentials
    		if (sessionCredentialsExpiration != null) {
    			saveCredentials(sessionCredentials,
    					sessionCredentialsExpiration.getTime());
    		}
    	} finally {
    		credentialsLock.writeLock().unlock();
    	}
    }

    @Override
    public void setLogins(Map<String, String> logins) {
    	credentialsLock.writeLock().lock();
    	try {
    		super.setLogins(logins);
    		// A new login has been added, so an identity refresh is necessary
    		needIdentityRefresh = true;
    		// clear cached credentials
    		clearCredentials();
    	} finally {
    		credentialsLock.writeLock().unlock();
    	}
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.auth.CognitoCredentialsProvider#clear() Clears the AWS
     * credentials and the identity id.
     */
    @Override
    public void clear() {
        super.clear();

        // clear cached identity id and credentials
        prefs.edit().clear().apply();
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.auth.CognitoCredentialsProvider#clearCredentials()
     * Clears the AWS credentials
     */
    @Override
    public void clearCredentials() {
    	credentialsLock.writeLock().lock();
    	try {
	        super.clearCredentials();
	        Log.d(TAG, "Clearing credentials from SharedPreferences");
	        prefs.edit()
	                .remove(namespace(AK_KEY))
	                .remove(namespace(SK_KEY))
	                .remove(namespace(ST_KEY))
	                .remove(namespace(EXP_KEY))
	                .apply();
    	} finally {
    		credentialsLock.writeLock().unlock();
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
    void loadCachedCredentials() {
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
