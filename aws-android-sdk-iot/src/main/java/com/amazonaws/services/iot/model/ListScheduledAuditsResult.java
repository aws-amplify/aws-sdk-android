/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListScheduledAuditsResult implements Serializable {
    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     */
    private java.util.List<ScheduledAuditMetadata> scheduledAudits;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     *
     * @return <p>
     *         The list of scheduled audits.
     *         </p>
     */
    public java.util.List<ScheduledAuditMetadata> getScheduledAudits() {
        return scheduledAudits;
    }

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     *
     * @param scheduledAudits <p>
     *            The list of scheduled audits.
     *            </p>
     */
    public void setScheduledAudits(java.util.Collection<ScheduledAuditMetadata> scheduledAudits) {
        if (scheduledAudits == null) {
            this.scheduledAudits = null;
            return;
        }

        this.scheduledAudits = new java.util.ArrayList<ScheduledAuditMetadata>(scheduledAudits);
    }

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledAudits <p>
     *            The list of scheduled audits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListScheduledAuditsResult withScheduledAudits(ScheduledAuditMetadata... scheduledAudits) {
        if (getScheduledAudits() == null) {
            this.scheduledAudits = new java.util.ArrayList<ScheduledAuditMetadata>(
                    scheduledAudits.length);
        }
        for (ScheduledAuditMetadata value : scheduledAudits) {
            this.scheduledAudits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledAudits <p>
     *            The list of scheduled audits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListScheduledAuditsResult withScheduledAudits(
            java.util.Collection<ScheduledAuditMetadata> scheduledAudits) {
        setScheduledAudits(scheduledAudits);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListScheduledAuditsResult withNextToken(String nextToken) {
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
        if (getScheduledAudits() != null)
            sb.append("scheduledAudits: " + getScheduledAudits() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduledAudits() == null) ? 0 : getScheduledAudits().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScheduledAuditsResult == false)
            return false;
        ListScheduledAuditsResult other = (ListScheduledAuditsResult) obj;

        if (other.getScheduledAudits() == null ^ this.getScheduledAudits() == null)
            return false;
        if (other.getScheduledAudits() != null
                && other.getScheduledAudits().equals(this.getScheduledAudits()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
