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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;

/**
 * An extension of the AbstractCognitoProvider that provides a class which
 * developers can extend for implementing a developer provider, when using
 * developer authenticated identities
 */
public abstract class AWSAbstractCognitoDeveloperIdentityProvider extends
        AWSAbstractCognitoIdentityProvider {

    /**
     * Wraps around the AbstractIdentityProvider to cover some back end code
     * that is consistent across all providers, utilizing the CIB client to
     * handle the identity management.
     *
     * @deprecated please use AWSAbstractCognitoDeveloperIdentityProvider(String
     *             accountId, String identityPoolId, Regions region) instead
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     */
    @Deprecated
    public AWSAbstractCognitoDeveloperIdentityProvider(String accountId, String identityPoolId) {
        this(accountId, identityPoolId, new ClientConfiguration());
    }

    /**
     * Wraps around the AbstractIdentityProvider to cover some back end code
     * that is consistent across all providers, utilizing the CIB client to
     * handle the identity management.
     *
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     * @param region the region the cib client will use
     */
    public AWSAbstractCognitoDeveloperIdentityProvider(String accountId, String identityPoolId,
            Regions region) {
        this(accountId, identityPoolId, new ClientConfiguration(), region);
    }

    /**
     * Wraps around the AbstractIdentityProvider to cover some back end code
     * that is consistent across all providers, utilizing the CIB client to
     * handle the identity management.
     *
     * @deprecated please use AWSAbstractCognitoDeveloperIdentityProvider(String
     *             accountId, String identityPoolId, ClientConfiguration
     *             clientConfiguration, Regions region) instead
     * @param accountId the account id of the developer
     * @param identityPoolId the identity pool id of the app/user in question
     * @param clientConfiguration the configuration to apply to service clients
     *            created
     */
    @Deprecated
    public AWSAbstractCognitoDeveloperIdentityProvider(String accountId, String identityPoolId,
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
     * @param clientConfiguration the configuration to apply to service clients
     *            created
     * @param region the region the cib client will use
     */
    public AWSAbstractCognitoDeveloperIdentityProvider(String accountId, String identityPoolId,
            ClientConfiguration clientConfiguration, Regions region) {
        this(accountId, identityPoolId, new AmazonCognitoIdentityClient
                (new AnonymousAWSCredentials(), clientConfiguration));
        this.cib.setRegion(Region.getRegion(region));
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
    public AWSAbstractCognitoDeveloperIdentityProvider(String accountId, String identityPoolId,
            AmazonCognitoIdentity cibClient) {
        super(accountId, identityPoolId, cibClient);
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.auth.AWSBasicCognitoIdentityProvider#getProviderName()
     */
    @Override
    public abstract String getProviderName();
}
