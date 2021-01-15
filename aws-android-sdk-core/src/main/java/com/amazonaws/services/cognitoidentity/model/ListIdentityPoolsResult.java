/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a successful ListIdentityPools action.
 * </p>
 */
public class ListIdentityPoolsResult implements Serializable {
    /**
     * <p>
     * The identity pools returned by the ListIdentityPools action.
     * </p>
     */
    private java.util.List<IdentityPoolShortDescription> identityPools;

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The identity pools returned by the ListIdentityPools action.
     * </p>
     *
     * @return <p>
     *         The identity pools returned by the ListIdentityPools action.
     *         </p>
     */
    public java.util.List<IdentityPoolShortDescription> getIdentityPools() {
        return identityPools;
    }

    /**
     * <p>
     * The identity pools returned by the ListIdentityPools action.
     * </p>
     *
     * @param identityPools <p>
     *            The identity pools returned by the ListIdentityPools action.
     *            </p>
     */
    public void setIdentityPools(java.util.Collection<IdentityPoolShortDescription> identityPools) {
        if (identityPools == null) {
            this.identityPools = null;
            return;
        }

        this.identityPools = new java.util.ArrayList<IdentityPoolShortDescription>(identityPools);
    }

    /**
     * <p>
     * The identity pools returned by the ListIdentityPools action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityPools <p>
     *            The identity pools returned by the ListIdentityPools action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIdentityPoolsResult withIdentityPools(IdentityPoolShortDescription... identityPools) {
        if (getIdentityPools() == null) {
            this.identityPools = new java.util.ArrayList<IdentityPoolShortDescription>(
                    identityPools.length);
        }
        for (IdentityPoolShortDescription value : identityPools) {
            this.identityPools.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identity pools returned by the ListIdentityPools action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityPools <p>
     *            The identity pools returned by the ListIdentityPools action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIdentityPoolsResult withIdentityPools(
            java.util.Collection<IdentityPoolShortDescription> identityPools) {
        setIdentityPools(identityPools);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         A pagination token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIdentityPoolsResult withNextToken(String nextToken) {
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
        if (getIdentityPools() != null)
            sb.append("IdentityPools: " + getIdentityPools() + ",");
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
                + ((getIdentityPools() == null) ? 0 : getIdentityPools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdentityPoolsResult == false)
            return false;
        ListIdentityPoolsResult other = (ListIdentityPoolsResult) obj;

        if (other.getIdentityPools() == null ^ this.getIdentityPools() == null)
            return false;
        if (other.getIdentityPools() != null
                && other.getIdentityPools().equals(this.getIdentityPools()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
