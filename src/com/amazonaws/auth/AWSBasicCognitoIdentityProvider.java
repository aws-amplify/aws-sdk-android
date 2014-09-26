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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;

/**
 * An extension of the AbstractCognitoProvider that utilizes Cognito as a means
 * to validate an identity and dispense an identityId and token. All other
 * functionality is the same as that of AbstractCognitoIdentityProvider
 */
public class AWSBasicCognitoIdentityProvider extends AWSAbstractCognitoIdentityProvider {

    /** The client for communitation with Cognito */
    protected final AmazonCognitoIdentity cib;

    /**
     * Wraps around the AbstractIdentityProvider to cover some back end code
     * that is consistent across all providers, utilizing the CIB client to
     * handle the identity management.
     * 
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     */
    public AWSBasicCognitoIdentityProvider(String accountId, String identityPoolId) {
        this(accountId, identityPoolId, new ClientConfiguration());
    }

    /**
     * Wraps around the AbstractIdentityProvider to cover some back end code
     * that is consistent across all providers, utilizing the CIB client to
     * handle the identity management.
     * 
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     * @param clientConfiguration the configuration to apply to service clients
     *            created
     */
    public AWSBasicCognitoIdentityProvider(String accountId, String identityPoolId,
            ClientConfiguration clientConfiguration) {
        this(accountId, identityPoolId, new AmazonCognitoIdentityClient
                (new AnonymousAWSCredentials(), clientConfiguration));
    }

    /**
     * Wraps around the AbstractIdentityProvider to cover some back end code
     * that is consistent across all providers, utilizing the CIB client to
     * handle the identity management.
     * 
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     * @param cibClient the cib client which will be used to contact the cib
     *            back end
     */
    public AWSBasicCognitoIdentityProvider(String accountId, String identityPoolId,
            AmazonCognitoIdentity cibClient) {
        super(accountId, identityPoolId);
        cib = cibClient;
    }


    /**
     * With the logins and identityId to mark the user, it builds a request to
     * the cognito back end, and returns the token cib hands back
     */
    @Override
    public String getToken() {
        GetOpenIdTokenRequest getTokenRequest = new GetOpenIdTokenRequest()
                .withIdentityId(super.getIdentityId())
                .withLogins(loginsMap);

        appendUserAgent(getTokenRequest, getUserAgent());

        GetOpenIdTokenResult getTokenResult = cib.getOpenIdToken(getTokenRequest);

        if (!getTokenResult.getIdentityId().equals(super.getIdentityId())) {
            identityChanged(getTokenResult.getIdentityId());
        }
        return getTokenResult.getToken();
    }

    /**
     * Gets a reference to the identityId of the user (sending a new request if
     * it isn't yet set), using the dev accountId, identityPoolId, and the
     * user's loginsMap to identify.
     */
    @Override
    public String getIdentityId() {
        if (super.getIdentityId() == null) {
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
        return super.getIdentityId();
    }

    @Override
    public String getProviderName() {
        return "Cognito";
    }

    @Override
    public String refresh() {
        getIdentityId();
        String token = getToken();
        update(getIdentityId(), token);
        return token;
    }

}
