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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

public class ListThreatIntelSetsResult implements Serializable {
    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     */
    private java.util.List<String> threatIntelSetIds;

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     *
     * @return <p>
     *         The IDs of the ThreatIntelSet resources.
     *         </p>
     */
    public java.util.List<String> getThreatIntelSetIds() {
        return threatIntelSetIds;
    }

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     *
     * @param threatIntelSetIds <p>
     *            The IDs of the ThreatIntelSet resources.
     *            </p>
     */
    public void setThreatIntelSetIds(java.util.Collection<String> threatIntelSetIds) {
        if (threatIntelSetIds == null) {
            this.threatIntelSetIds = null;
            return;
        }

        this.threatIntelSetIds = new java.util.ArrayList<String>(threatIntelSetIds);
    }

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatIntelSetIds <p>
     *            The IDs of the ThreatIntelSet resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThreatIntelSetsResult withThreatIntelSetIds(String... threatIntelSetIds) {
        if (getThreatIntelSetIds() == null) {
            this.threatIntelSetIds = new java.util.ArrayList<String>(threatIntelSetIds.length);
        }
        for (String value : threatIntelSetIds) {
            this.threatIntelSetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatIntelSetIds <p>
     *            The IDs of the ThreatIntelSet resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThreatIntelSetsResult withThreatIntelSetIds(
            java.util.Collection<String> threatIntelSetIds) {
        setThreatIntelSetIds(threatIntelSetIds);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @return <p>
     *         The pagination parameter to be used on the next list operation to
     *         retrieve more items.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThreatIntelSetsResult withNextToken(String nextToken) {
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
        if (getThreatIntelSetIds() != null)
            sb.append("ThreatIntelSetIds: " + getThreatIntelSetIds() + ",");
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
                + ((getThreatIntelSetIds() == null) ? 0 : getThreatIntelSetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThreatIntelSetsResult == false)
            return false;
        ListThreatIntelSetsResult other = (ListThreatIntelSetsResult) obj;

        if (other.getThreatIntelSetIds() == null ^ this.getThreatIntelSetIds() == null)
            return false;
        if (other.getThreatIntelSetIds() != null
                && other.getThreatIntelSetIds().equals(this.getThreatIntelSetIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
