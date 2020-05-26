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

public class DescribeHostReservationsResult implements Serializable {
    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     */
    private java.util.List<HostReservation> hostReservationSet;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     *
     * @return <p>
     *         Details about the reservation's configuration.
     *         </p>
     */
    public java.util.List<HostReservation> getHostReservationSet() {
        return hostReservationSet;
    }

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     *
     * @param hostReservationSet <p>
     *            Details about the reservation's configuration.
     *            </p>
     */
    public void setHostReservationSet(java.util.Collection<HostReservation> hostReservationSet) {
        if (hostReservationSet == null) {
            this.hostReservationSet = null;
            return;
        }

        this.hostReservationSet = new java.util.ArrayList<HostReservation>(hostReservationSet);
    }

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostReservationSet <p>
     *            Details about the reservation's configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationsResult withHostReservationSet(
            HostReservation... hostReservationSet) {
        if (getHostReservationSet() == null) {
            this.hostReservationSet = new java.util.ArrayList<HostReservation>(
                    hostReservationSet.length);
        }
        for (HostReservation value : hostReservationSet) {
            this.hostReservationSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details about the reservation's configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostReservationSet <p>
     *            Details about the reservation's configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationsResult withHostReservationSet(
            java.util.Collection<HostReservation> hostReservationSet) {
        setHostReservationSet(hostReservationSet);
        return this;
    }

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
    public DescribeHostReservationsResult withNextToken(String nextToken) {
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
        if (getHostReservationSet() != null)
            sb.append("HostReservationSet: " + getHostReservationSet() + ",");
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
                + ((getHostReservationSet() == null) ? 0 : getHostReservationSet().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHostReservationsResult == false)
            return false;
        DescribeHostReservationsResult other = (DescribeHostReservationsResult) obj;

        if (other.getHostReservationSet() == null ^ this.getHostReservationSet() == null)
            return false;
        if (other.getHostReservationSet() != null
                && other.getHostReservationSet().equals(this.getHostReservationSet()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
