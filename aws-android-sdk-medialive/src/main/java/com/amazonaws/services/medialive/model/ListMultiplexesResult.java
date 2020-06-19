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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for ListMultiplexesResponse
 */
public class ListMultiplexesResult implements Serializable {
    /**
     * List of multiplexes.
     */
    private java.util.List<MultiplexSummary> multiplexes;

    /**
     * Token for the next ListMultiplexes request.
     */
    private String nextToken;

    /**
     * List of multiplexes.
     *
     * @return List of multiplexes.
     */
    public java.util.List<MultiplexSummary> getMultiplexes() {
        return multiplexes;
    }

    /**
     * List of multiplexes.
     *
     * @param multiplexes List of multiplexes.
     */
    public void setMultiplexes(java.util.Collection<MultiplexSummary> multiplexes) {
        if (multiplexes == null) {
            this.multiplexes = null;
            return;
        }

        this.multiplexes = new java.util.ArrayList<MultiplexSummary>(multiplexes);
    }

    /**
     * List of multiplexes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexes List of multiplexes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultiplexesResult withMultiplexes(MultiplexSummary... multiplexes) {
        if (getMultiplexes() == null) {
            this.multiplexes = new java.util.ArrayList<MultiplexSummary>(multiplexes.length);
        }
        for (MultiplexSummary value : multiplexes) {
            this.multiplexes.add(value);
        }
        return this;
    }

    /**
     * List of multiplexes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexes List of multiplexes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultiplexesResult withMultiplexes(java.util.Collection<MultiplexSummary> multiplexes) {
        setMultiplexes(multiplexes);
        return this;
    }

    /**
     * Token for the next ListMultiplexes request.
     *
     * @return Token for the next ListMultiplexes request.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Token for the next ListMultiplexes request.
     *
     * @param nextToken Token for the next ListMultiplexes request.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Token for the next ListMultiplexes request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Token for the next ListMultiplexes request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultiplexesResult withNextToken(String nextToken) {
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
        if (getMultiplexes() != null)
            sb.append("Multiplexes: " + getMultiplexes() + ",");
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
                + ((getMultiplexes() == null) ? 0 : getMultiplexes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMultiplexesResult == false)
            return false;
        ListMultiplexesResult other = (ListMultiplexesResult) obj;

        if (other.getMultiplexes() == null ^ this.getMultiplexes() == null)
            return false;
        if (other.getMultiplexes() != null
                && other.getMultiplexes().equals(this.getMultiplexes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
