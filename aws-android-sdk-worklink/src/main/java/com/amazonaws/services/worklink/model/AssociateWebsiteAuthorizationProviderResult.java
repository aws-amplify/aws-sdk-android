/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

public class AssociateWebsiteAuthorizationProviderResult implements Serializable {
    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String authorizationProviderId;

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the authorization provider.
     *         </p>
     */
    public String getAuthorizationProviderId() {
        return authorizationProviderId;
    }

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param authorizationProviderId <p>
     *            A unique identifier for the authorization provider.
     *            </p>
     */
    public void setAuthorizationProviderId(String authorizationProviderId) {
        this.authorizationProviderId = authorizationProviderId;
    }

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param authorizationProviderId <p>
     *            A unique identifier for the authorization provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateWebsiteAuthorizationProviderResult withAuthorizationProviderId(
            String authorizationProviderId) {
        this.authorizationProviderId = authorizationProviderId;
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
        if (getAuthorizationProviderId() != null)
            sb.append("AuthorizationProviderId: " + getAuthorizationProviderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAuthorizationProviderId() == null) ? 0 : getAuthorizationProviderId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateWebsiteAuthorizationProviderResult == false)
            return false;
        AssociateWebsiteAuthorizationProviderResult other = (AssociateWebsiteAuthorizationProviderResult) obj;

        if (other.getAuthorizationProviderId() == null ^ this.getAuthorizationProviderId() == null)
            return false;
        if (other.getAuthorizationProviderId() != null
                && other.getAuthorizationProviderId().equals(this.getAuthorizationProviderId()) == false)
            return false;
        return true;
    }
}
