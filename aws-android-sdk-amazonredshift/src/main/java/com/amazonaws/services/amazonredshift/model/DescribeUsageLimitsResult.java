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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class DescribeUsageLimitsResult implements Serializable {
    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     */
    private java.util.List<UsageLimit> usageLimits;

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     *
     * @return <p>
     *         Contains the output from the <a>DescribeUsageLimits</a> action.
     *         </p>
     */
    public java.util.List<UsageLimit> getUsageLimits() {
        return usageLimits;
    }

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     *
     * @param usageLimits <p>
     *            Contains the output from the <a>DescribeUsageLimits</a>
     *            action.
     *            </p>
     */
    public void setUsageLimits(java.util.Collection<UsageLimit> usageLimits) {
        if (usageLimits == null) {
            this.usageLimits = null;
            return;
        }

        this.usageLimits = new java.util.ArrayList<UsageLimit>(usageLimits);
    }

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageLimits <p>
     *            Contains the output from the <a>DescribeUsageLimits</a>
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUsageLimitsResult withUsageLimits(UsageLimit... usageLimits) {
        if (getUsageLimits() == null) {
            this.usageLimits = new java.util.ArrayList<UsageLimit>(usageLimits.length);
        }
        for (UsageLimit value : usageLimits) {
            this.usageLimits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageLimits <p>
     *            Contains the output from the <a>DescribeUsageLimits</a>
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUsageLimitsResult withUsageLimits(java.util.Collection<UsageLimit> usageLimits) {
        setUsageLimits(usageLimits);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @return <p>
     *         A value that indicates the starting point for the next set of
     *         response records in a subsequent request. If a value is returned
     *         in a response, you can retrieve the next set of records by
     *         providing this returned marker value in the <code>Marker</code>
     *         parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>Marker</code> parameter and retrying the command. If the
     *            <code>Marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>Marker</code> parameter and retrying the command. If the
     *            <code>Marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUsageLimitsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getUsageLimits() != null)
            sb.append("UsageLimits: " + getUsageLimits() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsageLimits() == null) ? 0 : getUsageLimits().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUsageLimitsResult == false)
            return false;
        DescribeUsageLimitsResult other = (DescribeUsageLimitsResult) obj;

        if (other.getUsageLimits() == null ^ this.getUsageLimits() == null)
            return false;
        if (other.getUsageLimits() != null
                && other.getUsageLimits().equals(this.getUsageLimits()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
