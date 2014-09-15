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
import com.amazonaws.regions.Region;
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
 * network requests.
 */
public class CognitoCachingCredentialsProvider extends CognitoCredentialsProvider {

    private static final String PREFS_NAME = "com.amazonaws.auth";

    private static final String TAG = "CognitoCachingCredentialsProvider";

    /**
     * User agent string appended to cib and sts
     */
    private static final String USER_AGENT = CognitoCachingCredentialsProvider.class.getName()
            + "/" + VersionInfoUtils.getVersion();

    private static final String ID_KEY = "identityId";
    private static final String AK_KEY = "accessKey";
    private static final String SK_KEY = "secretKey";
    private static final String ST_KEY = "sessionToken";
    private static final String EXP_KEY = "expirationDate";

    private SharedPreferences sharedPreferences = null;

    private boolean needIdentityRefresh = false;

    private final IdentityChangedListener listener = new IdentityChangedListener() {
        @Override
        public void identityChanged(String oldIdentityId, String newIdentityId) {
            Log.d(TAG, "Identity id is changed");
            // identityId has already been updated, just save it
            saveIdentityId();
        }
    };

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request to the
     * AWS Security Token Service (STS) to request short lived session
     * credentials, which will then be returned by this class's
     * {@link #getCredentials()} method.
     * 
     * @param context The context that will store identity id
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param region The region to use when contacting Cognito Identity, and STS
     *  (if STS supports the provided regions, otherwise STS will be contacted using the
     *  US_EAST_1 region)
     */
    public CognitoCachingCredentialsProvider(Context context,
            String accountId, String identityPoolId, String unauthRoleArn, String authRoleArn, Regions region) {
        this(context, accountId, identityPoolId, unauthRoleArn, authRoleArn, region,
                new ClientConfiguration());
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request to the
     * AWS Security Token Service (STS) to request short lived session
     * credentials, which will then be returned by this class's
     * {@link #getCredentials()} method.
     * 
     * @param context The context that will store identity id
     * @param accountId The AWS accountId for the account with Amazon Cognito
     * @param identityPoolId The Amazon Cogntio identity pool to use
     * @param unauthRoleArn The ARN of the IAM Role that will be assumed when
     *            unauthenticated
     * @param authRoleArn The ARN of the IAM Role that will be assumed when
     *            authenticated
     * @param clientConfiguation Configuration to apply to service clients
     *            created
     * @param region The region to use when contacting Cognito Identity, and STS
     *  (if STS supports the provided regions, otherwise STS will be contacted using the
     *  US_EAST_1 region)
     */
    public CognitoCachingCredentialsProvider(Context context,
            String accountId, String identityPoolId, String unauthRoleArn, String authRoleArn, Regions region,
            ClientConfiguration clientConfiguration) {
        super(accountId, identityPoolId, unauthRoleArn, authRoleArn, region, clientConfiguration);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        registerIdentityChangedListener(listener);
    }

    /**
     * Constructs a new {@link CognitoCachingCredentialsProvider}, which will
     * use the specified Amazon Cognito identity pool to make a request to the
     * AWS Security Token Service (STS) to request short lived session
     * credentials, which will then be returned by this class's
     * {@link #getCredentials()} method.
     * 
     * @param context The context that will store identity id
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
    public CognitoCachingCredentialsProvider(Context context,
            String accountId, String identityPoolId, String unauthRoleArn, String authRoleArn,
            AmazonCognitoIdentityClient cibClient, AWSSecurityTokenService stsClient) {
        super(accountId, identityPoolId, unauthRoleArn, authRoleArn, cibClient, stsClient);
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        registerIdentityChangedListener(listener);
    }

    @Override
    public void clear() {
        super.clear();

        // clear cached identity id and credentials
        sharedPreferences.edit().clear().apply();
    }

    @Override
    public String getIdentityId() {
        // If a login has been added, this condition is met
        // and refersh is called to update the id
        if (needIdentityRefresh) {
            needIdentityRefresh = false;
            refresh();
        }
        // try to get the ID from UserPreferences
        this.identityId = sharedPreferences.getString(ID_KEY, null);

        if (this.identityId == null) {
            super.getIdentityId();
        }

        return this.identityId;
    }

    /**
     * {@link NotAuthorizedException} is thrown when the Cognito Identity pool
     * setup is incorrect. Possible causes include: identity pool doesn't allow
     * unauth use case; identity pool doesn't support the given provider; the
     * open id token is invalid.
     */
    @Override
    synchronized public AWSSessionCredentials getCredentials() throws NotAuthorizedException {
        if (sessionCredentials == null) {
            loadCredentials();
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
            if (logins != null) {
                // if the fetch failed, clear the credentials
                // as provided credentials don't match current id
                clear();
                super.getCredentials();
            }
            else {
                throw e;
            }
        }

        saveCredentials();

        return sessionCredentials;
    }

    /**
     * Save the credentials to SharedPreferences
     */
    private void saveCredentials() {
        Log.d(TAG, "Saving credentials to SharedPreferences");
        sharedPreferences.edit()
                .putString(AK_KEY, sessionCredentials.getAWSAccessKeyId())
                .putString(SK_KEY, sessionCredentials.getAWSSecretKey())
                .putString(ST_KEY, sessionCredentials.getSessionToken())
                .putLong(EXP_KEY, sessionCredentialsExpiration.getTime())
                .apply();
    }

    /**
     * Load the credentials from SharedPreferences
     */
    private void loadCredentials() {
        Log.d(TAG, "Loading credentials from SharedPreferences");
        sessionCredentialsExpiration = new Date(sharedPreferences.getLong(EXP_KEY, 0));
        String AK = sharedPreferences.getString(AK_KEY, null);
        String SK = sharedPreferences.getString(SK_KEY, null);
        String ST = sharedPreferences.getString(ST_KEY, null);

        // make sure we have valid data in SharedPreferences
        if ((AK == null) || (SK == null) || (ST == null)) {
            Log.d(TAG, "No valid credentials found in SharedPreferences");
            sessionCredentialsExpiration = null;
            return;
        }

        sessionCredentials = new BasicSessionCredentials(AK, SK, ST);
    }

    /**
     * Save the Amazon Cognito Identity Id to SharedPreferences
     */
    private void saveIdentityId() {
        Log.d(TAG, "Saving identity id to SharedPreferences");
        sharedPreferences.edit()
                .putString(ID_KEY, this.identityId)
                .apply();
    }

    @Override
    public void setLogins(Map<String, String> logins) {
        super.setLogins(logins);
        // A new login has been added, so an identity refresh is necessary
        needIdentityRefresh = true;
        // clear cached credentials
        sharedPreferences.edit()
                .remove(AK_KEY)
                .remove(SK_KEY)
                .remove(ST_KEY)
                .remove(EXP_KEY)
                .apply();
    }

    /**
     * Gets the cached identity id without making a network request.
     * 
     * @return cached identity id, null if it doesn't exist
     */
    public String getCachedIdentityId() {
        return sharedPreferences.getString(ID_KEY, null);
    }

    @Override
    protected String getUserAgent() {
        return USER_AGENT;
    }
}

