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
 * A summary of a Trusted Advisor check result, including the alert status, last
 * refresh, and number of resources examined.
 * </p>
 */
public class TrustedAdvisorCheckSummary implements Serializable {
    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String checkId;

    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     */
    private String timestamp;

    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error"
     * (red), or "not_available".
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     */
    private Boolean hasFlaggedResources;

    /**
     * <p>
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     * </p>
     */
    private TrustedAdvisorResourcesSummary resourcesSummary;

    /**
     * <p>
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     * </p>
     */
    private TrustedAdvisorCategorySpecificSummary categorySpecificSummary;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the Trusted Advisor check.
     *         </p>
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     *
     * @param checkId <p>
     *            The unique identifier for the Trusted Advisor check.
     *            </p>
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkId <p>
     *            The unique identifier for the Trusted Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckSummary withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     *
     * @return <p>
     *         The time of the last refresh of the check.
     *         </p>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     *
     * @param timestamp <p>
     *            The time of the last refresh of the check.
     *            </p>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time of the last refresh of the check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckSummary withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error"
     * (red), or "not_available".
     * </p>
     *
     * @return <p>
     *         The alert status of the check: "ok" (green), "warning" (yellow),
     *         "error" (red), or "not_available".
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error"
     * (red), or "not_available".
     * </p>
     *
     * @param status <p>
     *            The alert status of the check: "ok" (green), "warning"
     *            (yellow), "error" (red), or "not_available".
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error"
     * (red), or "not_available".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The alert status of the check: "ok" (green), "warning"
     *            (yellow), "error" (red), or "not_available".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     *
     * @return <p>
     *         Specifies whether the Trusted Advisor check has flagged
     *         resources.
     *         </p>
     */
    public Boolean isHasFlaggedResources() {
        return hasFlaggedResources;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     *
     * @return <p>
     *         Specifies whether the Trusted Advisor check has flagged
     *         resources.
     *         </p>
     */
    public Boolean getHasFlaggedResources() {
        return hasFlaggedResources;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     *
     * @param hasFlaggedResources <p>
     *            Specifies whether the Trusted Advisor check has flagged
     *            resources.
     *            </p>
     */
    public void setHasFlaggedResources(Boolean hasFlaggedResources) {
        this.hasFlaggedResources = hasFlaggedResources;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasFlaggedResources <p>
     *            Specifies whether the Trusted Advisor check has flagged
     *            resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckSummary withHasFlaggedResources(Boolean hasFlaggedResources) {
        this.hasFlaggedResources = hasFlaggedResources;
        return this;
    }

    /**
     * <p>
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     * </p>
     *
     * @return <p>
     *         Details about AWS resources that were analyzed in a call to
     *         Trusted Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     *         </p>
     */
    public TrustedAdvisorResourcesSummary getResourcesSummary() {
        return resourcesSummary;
    }

    /**
     * <p>
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     * </p>
     *
     * @param resourcesSummary <p>
     *            Details about AWS resources that were analyzed in a call to
     *            Trusted Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     *            </p>
     */
    public void setResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
    }

    /**
     * <p>
     * Details about AWS resources that were analyzed in a call to Trusted
     * Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesSummary <p>
     *            Details about AWS resources that were analyzed in a call to
     *            Trusted Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckSummary withResourcesSummary(
            TrustedAdvisorResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
        return this;
    }

    /**
     * <p>
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     * </p>
     *
     * @return <p>
     *         Summary information that relates to the category of the check.
     *         Cost Optimizing is the only category that is currently supported.
     *         </p>
     */
    public TrustedAdvisorCategorySpecificSummary getCategorySpecificSummary() {
        return categorySpecificSummary;
    }

    /**
     * <p>
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     * </p>
     *
     * @param categorySpecificSummary <p>
     *            Summary information that relates to the category of the check.
     *            Cost Optimizing is the only category that is currently
     *            supported.
     *            </p>
     */
    public void setCategorySpecificSummary(
            TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        this.categorySpecificSummary = categorySpecificSummary;
    }

    /**
     * <p>
     * Summary information that relates to the category of the check. Cost
     * Optimizing is the only category that is currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categorySpecificSummary <p>
     *            Summary information that relates to the category of the check.
     *            Cost Optimizing is the only category that is currently
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckSummary withCategorySpecificSummary(
            TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        this.categorySpecificSummary = categorySpecificSummary;
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
        if (getCheckId() != null)
            sb.append("checkId: " + getCheckId() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getHasFlaggedResources() != null)
            sb.append("hasFlaggedResources: " + getHasFlaggedResources() + ",");
        if (getResourcesSummary() != null)
            sb.append("resourcesSummary: " + getResourcesSummary() + ",");
        if (getCategorySpecificSummary() != null)
            sb.append("categorySpecificSummary: " + getCategorySpecificSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getHasFlaggedResources() == null) ? 0 : getHasFlaggedResources().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesSummary() == null) ? 0 : getResourcesSummary().hashCode());
        hashCode = prime
                * hashCode
                + ((getCategorySpecificSummary() == null) ? 0 : getCategorySpecificSummary()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCheckSummary == false)
            return false;
        TrustedAdvisorCheckSummary other = (TrustedAdvisorCheckSummary) obj;

        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getHasFlaggedResources() == null ^ this.getHasFlaggedResources() == null)
            return false;
        if (other.getHasFlaggedResources() != null
                && other.getHasFlaggedResources().equals(this.getHasFlaggedResources()) == false)
            return false;
        if (other.getResourcesSummary() == null ^ this.getResourcesSummary() == null)
            return false;
        if (other.getResourcesSummary() != null
                && other.getResourcesSummary().equals(this.getResourcesSummary()) == false)
            return false;
        if (other.getCategorySpecificSummary() == null ^ this.getCategorySpecificSummary() == null)
            return false;
        if (other.getCategorySpecificSummary() != null
                && other.getCategorySpecificSummary().equals(this.getCategorySpecificSummary()) == false)
            return false;
        return true;
    }
}
