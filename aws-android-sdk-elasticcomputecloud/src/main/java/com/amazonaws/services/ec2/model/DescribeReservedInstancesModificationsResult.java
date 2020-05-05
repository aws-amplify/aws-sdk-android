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

/**
 * <p>
 * Contains the output of DescribeReservedInstancesModifications.
 * </p>
 */
public class DescribeReservedInstancesModificationsResult implements Serializable {
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     */
    private java.util.List<ReservedInstancesModification> reservedInstancesModifications;

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
    public DescribeReservedInstancesModificationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     *
     * @return <p>
     *         The Reserved Instance modification information.
     *         </p>
     */
    public java.util.List<ReservedInstancesModification> getReservedInstancesModifications() {
        return reservedInstancesModifications;
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     *
     * @param reservedInstancesModifications <p>
     *            The Reserved Instance modification information.
     *            </p>
     */
    public void setReservedInstancesModifications(
            java.util.Collection<ReservedInstancesModification> reservedInstancesModifications) {
        if (reservedInstancesModifications == null) {
            this.reservedInstancesModifications = null;
            return;
        }

        this.reservedInstancesModifications = new java.util.ArrayList<ReservedInstancesModification>(
                reservedInstancesModifications);
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesModifications <p>
     *            The Reserved Instance modification information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesModificationsResult withReservedInstancesModifications(
            ReservedInstancesModification... reservedInstancesModifications) {
        if (getReservedInstancesModifications() == null) {
            this.reservedInstancesModifications = new java.util.ArrayList<ReservedInstancesModification>(
                    reservedInstancesModifications.length);
        }
        for (ReservedInstancesModification value : reservedInstancesModifications) {
            this.reservedInstancesModifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesModifications <p>
     *            The Reserved Instance modification information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedInstancesModificationsResult withReservedInstancesModifications(
            java.util.Collection<ReservedInstancesModification> reservedInstancesModifications) {
        setReservedInstancesModifications(reservedInstancesModifications);
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
        if (getReservedInstancesModifications() != null)
            sb.append("ReservedInstancesModifications: " + getReservedInstancesModifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstancesModifications() == null) ? 0
                        : getReservedInstancesModifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesModificationsResult == false)
            return false;
        DescribeReservedInstancesModificationsResult other = (DescribeReservedInstancesModificationsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservedInstancesModifications() == null
                ^ this.getReservedInstancesModifications() == null)
            return false;
        if (other.getReservedInstancesModifications() != null
                && other.getReservedInstancesModifications().equals(
                        this.getReservedInstancesModifications()) == false)
            return false;
        return true;
    }
}
