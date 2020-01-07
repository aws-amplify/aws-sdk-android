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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

public class DescribeAccountLimitsResult implements Serializable {
    /**
     * <p>
     * Information about the limits.
     * </p>
     */
    private java.util.List<Limit> limits = new java.util.ArrayList<Limit>();

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Information about the limits.
     * </p>
     *
     * @return <p>
     *         Information about the limits.
     *         </p>
     */
    public java.util.List<Limit> getLimits() {
        return limits;
    }

    /**
     * <p>
     * Information about the limits.
     * </p>
     *
     * @param limits <p>
     *            Information about the limits.
     *            </p>
     */
    public void setLimits(java.util.Collection<Limit> limits) {
        if (limits == null) {
            this.limits = null;
            return;
        }

        this.limits = new java.util.ArrayList<Limit>(limits);
    }

    /**
     * <p>
     * Information about the limits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits <p>
     *            Information about the limits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountLimitsResult withLimits(Limit... limits) {
        if (getLimits() == null) {
            this.limits = new java.util.ArrayList<Limit>(limits.length);
        }
        for (Limit value : limits) {
            this.limits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the limits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits <p>
     *            Information about the limits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountLimitsResult withLimits(java.util.Collection<Limit> limits) {
        setLimits(limits);
        return this;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     *
     * @return <p>
     *         The marker to use when requesting the next set of results. If
     *         there are no additional results, the string is empty.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     *
     * @param nextMarker <p>
     *            The marker to use when requesting the next set of results. If
     *            there are no additional results, the string is empty.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            The marker to use when requesting the next set of results. If
     *            there are no additional results, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountLimitsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getLimits() != null)
            sb.append("Limits: " + getLimits() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountLimitsResult == false)
            return false;
        DescribeAccountLimitsResult other = (DescribeAccountLimitsResult) obj;

        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
