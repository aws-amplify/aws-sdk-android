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

import com.amazonaws.AmazonWebServiceRequest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class serves as a means for some back end code that should be consistent
 * across all identity providers. It handles everything short of getting the
 * identity id and the token, and is what should be extended to create a custom
 * identity provider.
 */
public abstract class AWSAbstractCognitoIdentityProvider implements AWSCognitoIdentityProvider {


    /**
     * The data structures that won't vary between cognito and developer
     * providers
     */
    private String identityId;
    private final String accountId;
    private final String identityPoolId;
    private String token;

    protected Set<IdentityChangedListener> listeners;
    protected Map<String, String> loginsMap;

    public AWSAbstractCognitoIdentityProvider(String accountId, String identityPoolId) {
        this.accountId = accountId;
        this.identityPoolId = identityPoolId;
        this.loginsMap = new HashMap<String, String>();
        this.listeners = new HashSet<IdentityChangedListener>();
    }

    /**
     * Gets a string with the name of the provider being used. For example,
     * Cognito would return "Cognito";
     * 
     * @return the name of the provider in a string
     */
    public abstract String getProviderName();

    @Override
    public String getIdentityId() {
        return identityId;
    }

    protected void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    @Override
    public String getToken() {
        return token;
    }

    protected void setToken(String token) {
        this.token = token;
    }

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

}
