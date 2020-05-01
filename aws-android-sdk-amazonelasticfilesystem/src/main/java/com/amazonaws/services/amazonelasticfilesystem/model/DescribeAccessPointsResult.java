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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

public class DescribeAccessPointsResult implements Serializable {
    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     */
    private java.util.List<AccessPointDescription> accessPoints;

    /**
     * <p>
     * Present if there are more access points than returned in the response.
     * You can use the NextMarker in the subsequent request to fetch the
     * additional descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     *
     * @return <p>
     *         An array of access point descriptions.
     *         </p>
     */
    public java.util.List<AccessPointDescription> getAccessPoints() {
        return accessPoints;
    }

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     *
     * @param accessPoints <p>
     *            An array of access point descriptions.
     *            </p>
     */
    public void setAccessPoints(java.util.Collection<AccessPointDescription> accessPoints) {
        if (accessPoints == null) {
            this.accessPoints = null;
            return;
        }

        this.accessPoints = new java.util.ArrayList<AccessPointDescription>(accessPoints);
    }

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPoints <p>
     *            An array of access point descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPointsResult withAccessPoints(AccessPointDescription... accessPoints) {
        if (getAccessPoints() == null) {
            this.accessPoints = new java.util.ArrayList<AccessPointDescription>(accessPoints.length);
        }
        for (AccessPointDescription value : accessPoints) {
            this.accessPoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPoints <p>
     *            An array of access point descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPointsResult withAccessPoints(
            java.util.Collection<AccessPointDescription> accessPoints) {
        setAccessPoints(accessPoints);
        return this;
    }

    /**
     * <p>
     * Present if there are more access points than returned in the response.
     * You can use the NextMarker in the subsequent request to fetch the
     * additional descriptions.
     * </p>
     *
     * @return <p>
     *         Present if there are more access points than returned in the
     *         response. You can use the NextMarker in the subsequent request to
     *         fetch the additional descriptions.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Present if there are more access points than returned in the response.
     * You can use the NextMarker in the subsequent request to fetch the
     * additional descriptions.
     * </p>
     *
     * @param nextToken <p>
     *            Present if there are more access points than returned in the
     *            response. You can use the NextMarker in the subsequent request
     *            to fetch the additional descriptions.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Present if there are more access points than returned in the response.
     * You can use the NextMarker in the subsequent request to fetch the
     * additional descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Present if there are more access points than returned in the
     *            response. You can use the NextMarker in the subsequent request
     *            to fetch the additional descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPointsResult withNextToken(String nextToken) {
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
        if (getAccessPoints() != null)
            sb.append("AccessPoints: " + getAccessPoints() + ",");
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
                + ((getAccessPoints() == null) ? 0 : getAccessPoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccessPointsResult == false)
            return false;
        DescribeAccessPointsResult other = (DescribeAccessPointsResult) obj;

        if (other.getAccessPoints() == null ^ this.getAccessPoints() == null)
            return false;
        if (other.getAccessPoints() != null
                && other.getAccessPoints().equals(this.getAccessPoints()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
