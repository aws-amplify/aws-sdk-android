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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

public class DescribeEndpointsResult implements Serializable {
    /**
     * List of endpoints
     */
    private java.util.List<Endpoint> endpoints;

    /**
     * Use this string to request the next batch of endpoints.
     */
    private String nextToken;

    /**
     * List of endpoints
     *
     * @return List of endpoints
     */
    public java.util.List<Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * List of endpoints
     *
     * @param endpoints List of endpoints
     */
    public void setEndpoints(java.util.Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<Endpoint>(endpoints);
    }

    /**
     * List of endpoints
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints List of endpoints
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsResult withEndpoints(Endpoint... endpoints) {
        if (getEndpoints() == null) {
            this.endpoints = new java.util.ArrayList<Endpoint>(endpoints.length);
        }
        for (Endpoint value : endpoints) {
            this.endpoints.add(value);
        }
        return this;
    }

    /**
     * List of endpoints
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints List of endpoints
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsResult withEndpoints(java.util.Collection<Endpoint> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * Use this string to request the next batch of endpoints.
     *
     * @return Use this string to request the next batch of endpoints.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Use this string to request the next batch of endpoints.
     *
     * @param nextToken Use this string to request the next batch of endpoints.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string to request the next batch of endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Use this string to request the next batch of endpoints.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointsResult withNextToken(String nextToken) {
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
        if (getEndpoints() != null)
            sb.append("Endpoints: " + getEndpoints() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointsResult == false)
            return false;
        DescribeEndpointsResult other = (DescribeEndpointsResult) obj;

        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null
                && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
