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

package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

public class GetAuthorizationTokenResult implements Serializable {
    /**
     * <p>
     * A list of authorization token data objects that correspond to the
     * <code>registryIds</code> values in the request.
     * </p>
     */
    private java.util.List<AuthorizationData> authorizationData;

    /**
     * <p>
     * A list of authorization token data objects that correspond to the
     * <code>registryIds</code> values in the request.
     * </p>
     *
     * @return <p>
     *         A list of authorization token data objects that correspond to the
     *         <code>registryIds</code> values in the request.
     *         </p>
     */
    public java.util.List<AuthorizationData> getAuthorizationData() {
        return authorizationData;
    }

    /**
     * <p>
     * A list of authorization token data objects that correspond to the
     * <code>registryIds</code> values in the request.
     * </p>
     *
     * @param authorizationData <p>
     *            A list of authorization token data objects that correspond to
     *            the <code>registryIds</code> values in the request.
     *            </p>
     */
    public void setAuthorizationData(java.util.Collection<AuthorizationData> authorizationData) {
        if (authorizationData == null) {
            this.authorizationData = null;
            return;
        }

        this.authorizationData = new java.util.ArrayList<AuthorizationData>(authorizationData);
    }

    /**
     * <p>
     * A list of authorization token data objects that correspond to the
     * <code>registryIds</code> values in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizationData <p>
     *            A list of authorization token data objects that correspond to
     *            the <code>registryIds</code> values in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizationTokenResult withAuthorizationData(AuthorizationData... authorizationData) {
        if (getAuthorizationData() == null) {
            this.authorizationData = new java.util.ArrayList<AuthorizationData>(
                    authorizationData.length);
        }
        for (AuthorizationData value : authorizationData) {
            this.authorizationData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of authorization token data objects that correspond to the
     * <code>registryIds</code> values in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizationData <p>
     *            A list of authorization token data objects that correspond to
     *            the <code>registryIds</code> values in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizationTokenResult withAuthorizationData(
            java.util.Collection<AuthorizationData> authorizationData) {
        setAuthorizationData(authorizationData);
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
        if (getAuthorizationData() != null)
            sb.append("authorizationData: " + getAuthorizationData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizationData() == null) ? 0 : getAuthorizationData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizationTokenResult == false)
            return false;
        GetAuthorizationTokenResult other = (GetAuthorizationTokenResult) obj;

        if (other.getAuthorizationData() == null ^ this.getAuthorizationData() == null)
            return false;
        if (other.getAuthorizationData() != null
                && other.getAuthorizationData().equals(this.getAuthorizationData()) == false)
            return false;
        return true;
    }
}
