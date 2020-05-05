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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The statuses of the Trusted Advisor checks returned by the
 * <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> operation.
 * </p>
 */
public class DescribeTrustedAdvisorCheckRefreshStatusesResult implements Serializable {
    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     */
    private java.util.List<TrustedAdvisorCheckRefreshStatus> statuses;

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     *
     * @return <p>
     *         The refresh status of the specified Trusted Advisor checks.
     *         </p>
     */
    public java.util.List<TrustedAdvisorCheckRefreshStatus> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     *
     * @param statuses <p>
     *            The refresh status of the specified Trusted Advisor checks.
     *            </p>
     */
    public void setStatuses(java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new java.util.ArrayList<TrustedAdvisorCheckRefreshStatus>(statuses);
    }

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statuses <p>
     *            The refresh status of the specified Trusted Advisor checks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(
            TrustedAdvisorCheckRefreshStatus... statuses) {
        if (getStatuses() == null) {
            this.statuses = new java.util.ArrayList<TrustedAdvisorCheckRefreshStatus>(
                    statuses.length);
        }
        for (TrustedAdvisorCheckRefreshStatus value : statuses) {
            this.statuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statuses <p>
     *            The refresh status of the specified Trusted Advisor checks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(
            java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        setStatuses(statuses);
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
        if (getStatuses() != null)
            sb.append("statuses: " + getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckRefreshStatusesResult == false)
            return false;
        DescribeTrustedAdvisorCheckRefreshStatusesResult other = (DescribeTrustedAdvisorCheckRefreshStatusesResult) obj;

        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }
}
