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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;

/**
 * An extension of the AbstractCognitoProvider that is used to communicate with
 * Cognito when using the enhanced authentication flow. All other functionality
 * is the same as that of AbstractCognitoIdentityProvider.
 */
public final class AWSEnhancedCognitoIdentityProvider extends AWSAbstractCognitoIdentityProvider {

    /**
     * An extension of the AbstractCognitoProvider that is used to communicate
     * with Cognito.
     *
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     */
    public AWSEnhancedCognitoIdentityProvider(String accountId, String identityPoolId) {
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
    public AWSEnhancedCognitoIdentityProvider(String accountId, String identityPoolId,
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
    public AWSEnhancedCognitoIdentityProvider(String accountId, String identityPoolId,
            AmazonCognitoIdentity cibClient) {
        super(accountId, identityPoolId, cibClient);
    }

    @Override
    public String getProviderName() {
        return "Cognito";
    }

    @Override
    public String refresh() {
        getIdentityId();
        // This flow doesn't request a token
        return null;
    }

}
