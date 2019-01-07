/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class CreateIdentityProviderResult implements Serializable {
    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     */
    private IdentityProviderType identityProvider;

    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     *
     * @return <p>
     *         The newly created identity provider object.
     *         </p>
     */
    public IdentityProviderType getIdentityProvider() {
        return identityProvider;
    }

    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     *
     * @param identityProvider <p>
     *            The newly created identity provider object.
     *            </p>
     */
    public void setIdentityProvider(IdentityProviderType identityProvider) {
        this.identityProvider = identityProvider;
    }

    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityProvider <p>
     *            The newly created identity provider object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityProviderResult withIdentityProvider(IdentityProviderType identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityProvider() != null)
            sb.append("IdentityProvider: " + getIdentityProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityProvider() == null) ? 0 : getIdentityProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentityProviderResult == false)
            return false;
        CreateIdentityProviderResult other = (CreateIdentityProviderResult) obj;

        if (other.getIdentityProvider() == null ^ this.getIdentityProvider() == null)
            return false;
        if (other.getIdentityProvider() != null
                && other.getIdentityProvider().equals(this.getIdentityProvider()) == false)
            return false;
        return true;
    }
}
