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

public class DescribeFleetsResult implements Serializable {
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     */
    private java.util.List<FleetData> fleets;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     *
     * @return <p>
     *         Information about the EC2 Fleets.
     *         </p>
     */
    public java.util.List<FleetData> getFleets() {
        return fleets;
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     *
     * @param fleets <p>
     *            Information about the EC2 Fleets.
     *            </p>
     */
    public void setFleets(java.util.Collection<FleetData> fleets) {
        if (fleets == null) {
            this.fleets = null;
            return;
        }

        this.fleets = new java.util.ArrayList<FleetData>(fleets);
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleets <p>
     *            Information about the EC2 Fleets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetsResult withFleets(FleetData... fleets) {
        if (getFleets() == null) {
            this.fleets = new java.util.ArrayList<FleetData>(fleets.length);
        }
        for (FleetData value : fleets) {
            this.fleets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleets <p>
     *            Information about the EC2 Fleets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetsResult withFleets(java.util.Collection<FleetData> fleets) {
        setFleets(fleets);
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
        if (getFleets() != null)
            sb.append("Fleets: " + getFleets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFleets() == null) ? 0 : getFleets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetsResult == false)
            return false;
        DescribeFleetsResult other = (DescribeFleetsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFleets() == null ^ this.getFleets() == null)
            return false;
        if (other.getFleets() != null && other.getFleets().equals(this.getFleets()) == false)
            return false;
        return true;
    }
}
