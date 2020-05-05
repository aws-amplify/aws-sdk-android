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
 * The current refresh status of a Trusted Advisor check.
 * </p>
 */
public class RefreshTrustedAdvisorCheckResult implements Serializable {
    /**
     * <p>
     * The current refresh status for a check, including the amount of time
     * until the check is eligible for refresh.
     * </p>
     */
    private TrustedAdvisorCheckRefreshStatus status;

    /**
     * <p>
     * The current refresh status for a check, including the amount of time
     * until the check is eligible for refresh.
     * </p>
     *
     * @return <p>
     *         The current refresh status for a check, including the amount of
     *         time until the check is eligible for refresh.
     *         </p>
     */
    public TrustedAdvisorCheckRefreshStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current refresh status for a check, including the amount of time
     * until the check is eligible for refresh.
     * </p>
     *
     * @param status <p>
     *            The current refresh status for a check, including the amount
     *            of time until the check is eligible for refresh.
     *            </p>
     */
    public void setStatus(TrustedAdvisorCheckRefreshStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current refresh status for a check, including the amount of time
     * until the check is eligible for refresh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current refresh status for a check, including the amount
     *            of time until the check is eligible for refresh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshTrustedAdvisorCheckResult withStatus(TrustedAdvisorCheckRefreshStatus status) {
        this.status = status;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshTrustedAdvisorCheckResult == false)
            return false;
        RefreshTrustedAdvisorCheckResult other = (RefreshTrustedAdvisorCheckResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
