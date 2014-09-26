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

/**
 * A container of data pertinent to a single provider, and will handle most of
 * the interactions with said provider and the client. Note, this will only
 * implement token and identityId interactions. It should not be used for
 * implementing a custom IdentityProvider. Instead, extend
 * AbstractCognitoIdentityProvider.
 */
public interface AWSIdentityProvider {

    /**
     * Get the token from the relevant provider
     * 
     * @return the token which was retrieved from the provider
     */
    public String getToken();

    /**
     * Gets the identityId of the user
     * 
     * @return the identityId of the user
     */
    public String getIdentityId();


}
