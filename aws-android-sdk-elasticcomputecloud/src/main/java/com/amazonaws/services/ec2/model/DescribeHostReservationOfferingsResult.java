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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeHostReservationOfferingsResult implements Serializable {
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the offerings.
     * </p>
     */
    private java.util.List<HostOffering> offeringSet;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     *
     * @return <p>
     *         Information about the offerings.
     *         </p>
     */
    public java.util.List<HostOffering> getOfferingSet() {
        return offeringSet;
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     *
     * @param offeringSet <p>
     *            Information about the offerings.
     *            </p>
     */
    public void setOfferingSet(java.util.Collection<HostOffering> offeringSet) {
        if (offeringSet == null) {
            this.offeringSet = null;
            return;
        }

        this.offeringSet = new java.util.ArrayList<HostOffering>(offeringSet);
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringSet <p>
     *            Information about the offerings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsResult withOfferingSet(HostOffering... offeringSet) {
        if (getOfferingSet() == null) {
            this.offeringSet = new java.util.ArrayList<HostOffering>(offeringSet.length);
        }
        for (HostOffering value : offeringSet) {
            this.offeringSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringSet <p>
     *            Information about the offerings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsResult withOfferingSet(
            java.util.Collection<HostOffering> offeringSet) {
        setOfferingSet(offeringSet);
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
        if (getOfferingSet() != null)
            sb.append("OfferingSet: " + getOfferingSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingSet() == null) ? 0 : getOfferingSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHostReservationOfferingsResult == false)
            return false;
        DescribeHostReservationOfferingsResult other = (DescribeHostReservationOfferingsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOfferingSet() == null ^ this.getOfferingSet() == null)
            return false;
        if (other.getOfferingSet() != null
                && other.getOfferingSet().equals(this.getOfferingSet()) == false)
            return false;
        return true;
    }
}
