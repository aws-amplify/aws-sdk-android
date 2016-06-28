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

import java.util.Map;

/**
 * A container of data pertinent to a single provider, and will handle most of
 * the interactions with said provider and the client. This includes some more
 * logic for custom identity providers, but shouldn't be implemented to do so.
 * It is utilized by the AWSAbstractCognitoIdentityProvider, which is what
 * should be extended to do so.
 */
public interface AWSCognitoIdentityProvider extends AWSIdentityProvider {

    /**
     * Gets the identityId of the user
     *
     * @return the identityId of the user
     */
    public String getIdentityId();

    /**
     * Get the identityPoolId from the provider
     *
     * @return the identityPoolId
     */
    public String getIdentityPoolId();

    /**
     * Pass the logins to the provider
     *
     * @param loginsMap the logins map
     */
    public void setLogins(Map<String, String> loginsMap);

    /**
     * Get the logins from the provider
     *
     * @return the logins map
     */
    public Map<String, String> getLogins();

    /**
     * Checks if the current identityId belongs to an authenticated user
     *
     * @return true if the identity is authenticated
     */
    public boolean isAuthenticated();

    /**
     * Handles the new version of an identity changed listener to be handled by
     * the provider
     * 
     * @param listener the new listener to be registered
     */
    public void registerIdentityChangedListener(IdentityChangedListener listener);

    /**
     * Handles the removing of a version of an identity changed listener from
     * the list with the provider
     * 
     * @param listener the listener to be removed
     */
    public void unregisterIdentityChangedListener(IdentityChangedListener listener);


    /**
     * Handles the updating of the identityId locally once it has been changed
     * for one reason or another
     *
     * @param newIdentity the new identityId for the user
     */
    public void identityChanged(String newIdentity);

    /**
     * To be used to empty all registered listeners from the identity provider
     */
    public void clearListeners();
}
