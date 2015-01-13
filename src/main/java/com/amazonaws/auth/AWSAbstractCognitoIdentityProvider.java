/**
 * Copyright 2011-2014 Amazon Technologies, Inc.
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;

/**
 * This class utilizes Cognito as a means to get an identity and dispense an
 * identityId and token. It also handles the refreshing of the token and
 * identityId. Any custom provider which needs interaction with Cognito should
 * extend this class.
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

    protected Set<IdentityChangedListener> listeners;
    protected Map<String, String> loginsMap;

    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId, AmazonCognitoIdentity cibClient) {
        this.accountId = accountId;
        this.identityPoolId = identityPoolId;
        this.loginsMap = new HashMap<String, String>();
        this.listeners = new HashSet<IdentityChangedListener>();
        this.cib = cibClient;
    }
    
    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId, ClientConfiguration clientConfiguration) {
        this(accountId, identityPoolId, new AmazonCognitoIdentityClient
                (new AnonymousAWSCredentials(), clientConfiguration));
    }
    
    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId) {
        this(accountId, identityPoolId, new ClientConfiguration());
    }

    /**
     * Gets a string with the name of the provider being used. For example,
     * Cognito would return "Cognito";
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
    public void unregisterIdentityChangedListener(
            IdentityChangedListener listener) {
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
        String oldIdentityId = identityId;
        identityId = newIdentityId;
        for (IdentityChangedListener listener : listeners) {
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
     */
    protected String getUserAgent() {
        return "";
    }

    /**
     * To be used to update the identityId and token after a call to refresh
     * from an identityProvider. Note, this is the only call that is needed
     * after the refresh call terminates, and it is explicitly necessary.
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
    
    /* (non-Javadoc)
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