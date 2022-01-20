/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListSecurityKeysResult implements Serializable {
    /**
     * <p>
     * The security keys.
     * </p>
     */
    private java.util.List<SecurityKey> securityKeys;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The security keys.
     * </p>
     *
     * @return <p>
     *         The security keys.
     *         </p>
     */
    public java.util.List<SecurityKey> getSecurityKeys() {
        return securityKeys;
    }

    /**
     * <p>
     * The security keys.
     * </p>
     *
     * @param securityKeys <p>
     *            The security keys.
     *            </p>
     */
    public void setSecurityKeys(java.util.Collection<SecurityKey> securityKeys) {
        if (securityKeys == null) {
            this.securityKeys = null;
            return;
        }

        this.securityKeys = new java.util.ArrayList<SecurityKey>(securityKeys);
    }

    /**
     * <p>
     * The security keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityKeys <p>
     *            The security keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityKeysResult withSecurityKeys(SecurityKey... securityKeys) {
        if (getSecurityKeys() == null) {
            this.securityKeys = new java.util.ArrayList<SecurityKey>(securityKeys.length);
        }
        for (SecurityKey value : securityKeys) {
            this.securityKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityKeys <p>
     *            The security keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityKeysResult withSecurityKeys(java.util.Collection<SecurityKey> securityKeys) {
        setSecurityKeys(securityKeys);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityKeysResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSecurityKeys() != null)
            sb.append("SecurityKeys: " + getSecurityKeys() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityKeys() == null) ? 0 : getSecurityKeys().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityKeysResult == false)
            return false;
        ListSecurityKeysResult other = (ListSecurityKeysResult) obj;

        if (other.getSecurityKeys() == null ^ this.getSecurityKeys() == null)
            return false;
        if (other.getSecurityKeys() != null
                && other.getSecurityKeys().equals(this.getSecurityKeys()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
