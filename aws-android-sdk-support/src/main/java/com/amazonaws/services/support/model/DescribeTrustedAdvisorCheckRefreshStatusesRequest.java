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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the refresh status of the Trusted Advisor checks that have the
 * specified check IDs. Check IDs can be obtained by calling
 * <a>DescribeTrustedAdvisorChecks</a>.
 * </p>
 * <note>
 * <p>
 * Some checks are refreshed automatically, and their refresh statuses cannot be
 * retrieved by using this operation. Use of the
 * <code>DescribeTrustedAdvisorCheckRefreshStatuses</code> operation for these
 * checks causes an <code>InvalidParameterValue</code> error.
 * </p>
 * </note>
 */
public class DescribeTrustedAdvisorCheckRefreshStatusesRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b>
     * Specifying the check ID of a check that is automatically refreshed causes
     * an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private java.util.List<String> checkIds;

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b>
     * Specifying the check ID of a check that is automatically refreshed causes
     * an <code>InvalidParameterValue</code> error.
     * </p>
     *
     * @return <p>
     *         The IDs of the Trusted Advisor checks to get the status of.
     *         <b>Note:</b> Specifying the check ID of a check that is
     *         automatically refreshed causes an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public java.util.List<String> getCheckIds() {
        return checkIds;
    }

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b>
     * Specifying the check ID of a check that is automatically refreshed causes
     * an <code>InvalidParameterValue</code> error.
     * </p>
     *
     * @param checkIds <p>
     *            The IDs of the Trusted Advisor checks to get the status of.
     *            <b>Note:</b> Specifying the check ID of a check that is
     *            automatically refreshed causes an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setCheckIds(java.util.Collection<String> checkIds) {
        if (checkIds == null) {
            this.checkIds = null;
            return;
        }

        this.checkIds = new java.util.ArrayList<String>(checkIds);
    }

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b>
     * Specifying the check ID of a check that is automatically refreshed causes
     * an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkIds <p>
     *            The IDs of the Trusted Advisor checks to get the status of.
     *            <b>Note:</b> Specifying the check ID of a check that is
     *            automatically refreshed causes an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesRequest withCheckIds(String... checkIds) {
        if (getCheckIds() == null) {
            this.checkIds = new java.util.ArrayList<String>(checkIds.length);
        }
        for (String value : checkIds) {
            this.checkIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b>
     * Specifying the check ID of a check that is automatically refreshed causes
     * an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkIds <p>
     *            The IDs of the Trusted Advisor checks to get the status of.
     *            <b>Note:</b> Specifying the check ID of a check that is
     *            automatically refreshed causes an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesRequest withCheckIds(
            java.util.Collection<String> checkIds) {
        setCheckIds(checkIds);
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
        if (getCheckIds() != null)
            sb.append("checkIds: " + getCheckIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckIds() == null) ? 0 : getCheckIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckRefreshStatusesRequest == false)
            return false;
        DescribeTrustedAdvisorCheckRefreshStatusesRequest other = (DescribeTrustedAdvisorCheckRefreshStatusesRequest) obj;

        if (other.getCheckIds() == null ^ this.getCheckIds() == null)
            return false;
        if (other.getCheckIds() != null && other.getCheckIds().equals(this.getCheckIds()) == false)
            return false;
        return true;
    }
}
