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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for ListOfferingsResponse
 */
public class ListOfferingsResult implements Serializable {
    /**
     * Token to retrieve the next page of results
     */
    private String nextToken;

    /**
     * List of offerings
     */
    private java.util.List<Offering> offerings;

    /**
     * Token to retrieve the next page of results
     *
     * @return Token to retrieve the next page of results
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Token to retrieve the next page of results
     *
     * @param nextToken Token to retrieve the next page of results
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Token to retrieve the next page of results
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Token to retrieve the next page of results
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOfferingsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * List of offerings
     *
     * @return List of offerings
     */
    public java.util.List<Offering> getOfferings() {
        return offerings;
    }

    /**
     * List of offerings
     *
     * @param offerings List of offerings
     */
    public void setOfferings(java.util.Collection<Offering> offerings) {
        if (offerings == null) {
            this.offerings = null;
            return;
        }

        this.offerings = new java.util.ArrayList<Offering>(offerings);
    }

    /**
     * List of offerings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offerings List of offerings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOfferingsResult withOfferings(Offering... offerings) {
        if (getOfferings() == null) {
            this.offerings = new java.util.ArrayList<Offering>(offerings.length);
        }
        for (Offering value : offerings) {
            this.offerings.add(value);
        }
        return this;
    }

    /**
     * List of offerings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offerings List of offerings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOfferingsResult withOfferings(java.util.Collection<Offering> offerings) {
        setOfferings(offerings);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOfferings() != null)
            sb.append("Offerings: " + getOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOfferings() == null) ? 0 : getOfferings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOfferingsResult == false)
            return false;
        ListOfferingsResult other = (ListOfferingsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOfferings() == null ^ this.getOfferings() == null)
            return false;
        if (other.getOfferings() != null
                && other.getOfferings().equals(this.getOfferings()) == false)
            return false;
        return true;
    }
}
