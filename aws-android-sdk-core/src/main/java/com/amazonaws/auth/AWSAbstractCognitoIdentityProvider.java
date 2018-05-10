/**
 * Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class utilizes Cognito as a means to get an identity and dispense an
 * identityId and token. It also handles the refreshing of the token and
 * identityId.
 */
public abstract class AWSAbstractCognitoIdentityProvider implements AWSCognitoIdentityProvider {

    /** The client for communication with Cognito */
    protected final AmazonCognitoIdentity cib;

    /**
     * The data structures that won't vary between cognito and developer
     * providers
     */
    protected String identityId;
    private final String accountId;
    private final String identityPoolId;
    protected String token;

    protected List<IdentityChangedListener> listeners;
    protected Map<String, String> loginsMap;

    /**
     * Sets up an AWSAbstractCognitoIdentityProvider, which will serve as the
     * baseline for both Cognito and developer trusted identity providers.
     * Custom providers should not extend this class, but should extend
     * AWSAbstractCognitoDeveloperIdentityProvider
     *
     * @param accountId the accountId of the developer
     * @param identityPoolId the identityPoolId to be used
     * @param cibClient the cib client which will communicate with cognito
     */
    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId,
            AmazonCognitoIdentity cibClient) {
        this.accountId = accountId;
        this.identityPoolId = identityPoolId;
        this.loginsMap = new HashMap<String, String>();
        this.listeners = new ArrayList<IdentityChangedListener>();
        this.cib = cibClient;
    }

    /**
     * Sets up an AWSAbstractCognitoIdentityProvider, which will serve as the
     * baseline for both Cognito and developer trusted identity providers.
     * Custom providers should not extend this class, but should extend
     * AWSAbstractCognitoDeveloperIdentityProvider
     *
     * @deprecated please use AWSAbstractCognitoIdentityProvider(String
     *             accountId, String identityPoolId, ClientConfiguration
     *             clientConfiguration, Regions region) instead.
     * @param accountId the accountId of the developer
     * @param identityPoolId the identityPoolId to be used
     * @param clientConfiguration the client configuration to be used by the
     *            client
     */
    @Deprecated
    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId,
            ClientConfiguration clientConfiguration) {
        this(accountId, identityPoolId, new AmazonCognitoIdentityClient
                (new AnonymousAWSCredentials(), clientConfiguration));
    }

    /**
     * Sets up an AWSAbstractCognitoIdentityProvider, which will serve as the
     * baseline for both Cognito and developer trusted identity providers.
     * Custom providers should not extend this class, but should extend
     * AWSAbstractCognitoDeveloperIdentityProvider
     *
     * @param accountId the accountId of the developer
     * @param identityPoolId the identityPoolId to be used
     * @param clientConfiguration the client configuration to be used by the
     *            client
     * @param region the region cognito will use
     */
    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId,
            ClientConfiguration clientConfiguration,
            Regions region) {
        this(accountId, identityPoolId, new AmazonCognitoIdentityClient
                (new AnonymousAWSCredentials(), clientConfiguration));
        this.cib.setRegion(Region.getRegion(region));
    }

    /**
     * Sets up an AWSAbstractCognitoIdentityProvider, which will serve as the
     * baseline for both Cognito and developer trusted identity providers.
     * Custom providers should not extend this class, but should extend
     * AWSAbstractCognitoDeveloperIdentityProvider
     *
     * @deprecated please use AWSAbstractCognitoIdentityProvider(String
     *             accountId, String identityPoolId, Regions region) instead.
     * @param accountId the accountId of the developer
     * @param identityPoolId the identityPoolId to be used
     */
    @Deprecated
    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId) {
        this(accountId, identityPoolId, new ClientConfiguration());
    }

    /**
     * Sets up an AWSAbstractCognitoIdentityProvider, which will serve as the
     * baseline for both Cognito and developer trusted identity providers.
     * Custom providers should not extend this class, but should extend
     * AWSAbstractCognitoDeveloperIdentityProvider
     *
     * @param accountId the accountId of the developer
     * @param identityPoolId the identityPoolId to be used
     * @param region the region cib will use
     */
    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId,
            Regions region) {
        this(accountId, identityPoolId, new ClientConfiguration(), region);
    }

    /**
     * Gets a string with the name of the provider being used. For example,
     * Cognito would return "Cognito"
     *
     * @return the name of the provider in a string
     */
    public abstract String getProviderName();

    /**
     * Gets a reference to the identityId of the user (sending a new request if
     * it isn't yet set), using the dev accountId, identityPoolId, and the
     * user's loginsMap to identify.
     */
    @Override
    public String getIdentityId() {
        if (identityId == null) {
            GetIdRequest getIdRequest = new GetIdRequest()
                    .withAccountId(getAccountId())
                    .withIdentityPoolId(getIdentityPoolId())
                    .withLogins(loginsMap);

            appendUserAgent(getIdRequest, getUserAgent());

            GetIdResult getIdResult = cib.getId(getIdRequest);

            if (getIdResult.getIdentityId() != null) {
                identityChanged(getIdResult.getIdentityId());
            }
        }
        return identityId;
    }

    protected void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * With the logins and identityId to mark the user, it builds a request to
     * the cognito back end, and returns the token cib hands back
     */
    @Override
    public String getToken() {
        if (this.token == null) {
            GetOpenIdTokenRequest getTokenRequest = new GetOpenIdTokenRequest()
                    .withIdentityId(getIdentityId()).withLogins(loginsMap);

            appendUserAgent(getTokenRequest, getUserAgent());

            GetOpenIdTokenResult getTokenResult = cib
                    .getOpenIdToken(getTokenRequest);

            if (!getTokenResult.getIdentityId().equals(getIdentityId())) {
                identityChanged(getTokenResult.getIdentityId());
            }
            this.token = getTokenResult.getToken();
        }
        return token;
    }

    protected void setToken(String token) {
        this.token = token;
    }

    @Override
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public Map<String, String> getLogins() {
        return loginsMap;
    }

    @Override
    public void setLogins(Map<String, String> logins) {
        loginsMap = logins;
    }

    @Override
    public boolean isAuthenticated() {
        return ((loginsMap != null) && (loginsMap.size() > 0));
    }

    @Override
    public void unregisterIdentityChangedListener(IdentityChangedListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void registerIdentityChangedListener(IdentityChangedListener listener) {
        listeners.add(listener);
    }

    /**
     * Updates the listeners and establishes the new identityId as the stored
     * identityId
     *
     * @param newIdentityId the identityId to be saved
     */
    @Override
    public void identityChanged(String newIdentityId) {
        if (identityId != null && identityId.equals(newIdentityId)) {
            return;
        }
        String oldIdentityId = identityId;
        identityId = newIdentityId;
        for (IdentityChangedListener listener: listeners) {
            listener.identityChanged(oldIdentityId, identityId);
        }
    }

    /**
     * Append user agent string to the request. The final string is what is set
     * in the ClientCofniguration concatenated with the given userAgent string.
     *
     * @param request the request object to be appended
     * @param userAgent additional user agent string to append
     */
    protected void appendUserAgent(AmazonWebServiceRequest request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
    }

    @Override
    public void clearListeners() {
        listeners.clear();
    }

    /**
     * Gets the user agent string to append to all requests made by this
     * provider. Default is an empty string.
     * 
     * @return the user agent string
     */
    protected String getUserAgent() {
        return "";
    }

    /**
     * To be used to update the identityId and token after a call to refresh
     * from an identityProvider. Note, this is the only call that is needed
     * after the refresh call terminates, and it is explicitly necessary. Do not
     * call setIdentity and/or setToken in addition to this, or it could cause
     * unexpected behavior.
     *
     * @param identityId the new identityId to be used for the user
     * @param token the new token to be used with STS
     */
    protected void update(String identityId, String token) {
        if (this.identityId == null || !this.identityId.equals(identityId)) {
            identityChanged(identityId);
        }
        if (this.token == null || !this.token.equals(token)) {
            this.token = token;
        }
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.auth.AWSIdentityProvider#refresh()
     */
    @Override
    public String refresh() {
        getIdentityId();
        String token = getToken();
        update(getIdentityId(), token);
        return token;
    }
}
