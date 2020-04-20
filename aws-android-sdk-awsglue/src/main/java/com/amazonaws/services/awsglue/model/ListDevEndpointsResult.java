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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class ListDevEndpointsResult implements Serializable {
    /**
     * <p>
     * The names of all the <code>DevEndpoint</code>s in the account, or the
     * <code>DevEndpoint</code>s with the specified tags.
     * </p>
     */
    private java.util.List<String> devEndpointNames;

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of all the <code>DevEndpoint</code>s in the account, or the
     * <code>DevEndpoint</code>s with the specified tags.
     * </p>
     *
     * @return <p>
     *         The names of all the <code>DevEndpoint</code>s in the account, or
     *         the <code>DevEndpoint</code>s with the specified tags.
     *         </p>
     */
    public java.util.List<String> getDevEndpointNames() {
        return devEndpointNames;
    }

    /**
     * <p>
     * The names of all the <code>DevEndpoint</code>s in the account, or the
     * <code>DevEndpoint</code>s with the specified tags.
     * </p>
     *
     * @param devEndpointNames <p>
     *            The names of all the <code>DevEndpoint</code>s in the account,
     *            or the <code>DevEndpoint</code>s with the specified tags.
     *            </p>
     */
    public void setDevEndpointNames(java.util.Collection<String> devEndpointNames) {
        if (devEndpointNames == null) {
            this.devEndpointNames = null;
            return;
        }

        this.devEndpointNames = new java.util.ArrayList<String>(devEndpointNames);
    }

    /**
     * <p>
     * The names of all the <code>DevEndpoint</code>s in the account, or the
     * <code>DevEndpoint</code>s with the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpointNames <p>
     *            The names of all the <code>DevEndpoint</code>s in the account,
     *            or the <code>DevEndpoint</code>s with the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDevEndpointsResult withDevEndpointNames(String... devEndpointNames) {
        if (getDevEndpointNames() == null) {
            this.devEndpointNames = new java.util.ArrayList<String>(devEndpointNames.length);
        }
        for (String value : devEndpointNames) {
            this.devEndpointNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of all the <code>DevEndpoint</code>s in the account, or the
     * <code>DevEndpoint</code>s with the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpointNames <p>
     *            The names of all the <code>DevEndpoint</code>s in the account,
     *            or the <code>DevEndpoint</code>s with the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDevEndpointsResult withDevEndpointNames(java.util.Collection<String> devEndpointNames) {
        setDevEndpointNames(devEndpointNames);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the returned list does not contain the
     *         last metric available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDevEndpointsResult withNextToken(String nextToken) {
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
        if (getDevEndpointNames() != null)
            sb.append("DevEndpointNames: " + getDevEndpointNames() + ",");
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
                + ((getDevEndpointNames() == null) ? 0 : getDevEndpointNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevEndpointsResult == false)
            return false;
        ListDevEndpointsResult other = (ListDevEndpointsResult) obj;

        if (other.getDevEndpointNames() == null ^ this.getDevEndpointNames() == null)
            return false;
        if (other.getDevEndpointNames() != null
                && other.getDevEndpointNames().equals(this.getDevEndpointNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
