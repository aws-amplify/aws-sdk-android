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

public class ListApprovedOriginsResult implements Serializable {
    /**
     * <p>
     * The approved origins.
     * </p>
     */
    private java.util.List<String> origins;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The approved origins.
     * </p>
     *
     * @return <p>
     *         The approved origins.
     *         </p>
     */
    public java.util.List<String> getOrigins() {
        return origins;
    }

    /**
     * <p>
     * The approved origins.
     * </p>
     *
     * @param origins <p>
     *            The approved origins.
     *            </p>
     */
    public void setOrigins(java.util.Collection<String> origins) {
        if (origins == null) {
            this.origins = null;
            return;
        }

        this.origins = new java.util.ArrayList<String>(origins);
    }

    /**
     * <p>
     * The approved origins.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param origins <p>
     *            The approved origins.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApprovedOriginsResult withOrigins(String... origins) {
        if (getOrigins() == null) {
            this.origins = new java.util.ArrayList<String>(origins.length);
        }
        for (String value : origins) {
            this.origins.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The approved origins.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param origins <p>
     *            The approved origins.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApprovedOriginsResult withOrigins(java.util.Collection<String> origins) {
        setOrigins(origins);
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
    public ListApprovedOriginsResult withNextToken(String nextToken) {
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
        if (getOrigins() != null)
            sb.append("Origins: " + getOrigins() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApprovedOriginsResult == false)
            return false;
        ListApprovedOriginsResult other = (ListApprovedOriginsResult) obj;

        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null && other.getOrigins().equals(this.getOrigins()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
