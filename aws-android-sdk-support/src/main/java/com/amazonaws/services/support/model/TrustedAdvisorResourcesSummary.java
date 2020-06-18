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
 * Details about AWS resources that were analyzed in a call to Trusted Advisor
 * <a>DescribeTrustedAdvisorCheckSummaries</a>.
 * </p>
 */
public class TrustedAdvisorResourcesSummary implements Serializable {
    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     * </p>
     */
    private Long resourcesProcessed;

    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     * </p>
     */
    private Long resourcesFlagged;

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     * </p>
     */
    private Long resourcesIgnored;

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were
     * marked as suppressed by the user.
     * </p>
     */
    private Long resourcesSuppressed;

    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     * </p>
     *
     * @return <p>
     *         The number of AWS resources that were analyzed by the Trusted
     *         Advisor check.
     *         </p>
     */
    public Long getResourcesProcessed() {
        return resourcesProcessed;
    }

    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     * </p>
     *
     * @param resourcesProcessed <p>
     *            The number of AWS resources that were analyzed by the Trusted
     *            Advisor check.
     *            </p>
     */
    public void setResourcesProcessed(Long resourcesProcessed) {
        this.resourcesProcessed = resourcesProcessed;
    }

    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor
     * check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesProcessed <p>
     *            The number of AWS resources that were analyzed by the Trusted
     *            Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourcesSummary withResourcesProcessed(Long resourcesProcessed) {
        this.resourcesProcessed = resourcesProcessed;
        return this;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     * </p>
     *
     * @return <p>
     *         The number of AWS resources that were flagged (listed) by the
     *         Trusted Advisor check.
     *         </p>
     */
    public Long getResourcesFlagged() {
        return resourcesFlagged;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     * </p>
     *
     * @param resourcesFlagged <p>
     *            The number of AWS resources that were flagged (listed) by the
     *            Trusted Advisor check.
     *            </p>
     */
    public void setResourcesFlagged(Long resourcesFlagged) {
        this.resourcesFlagged = resourcesFlagged;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted
     * Advisor check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesFlagged <p>
     *            The number of AWS resources that were flagged (listed) by the
     *            Trusted Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourcesSummary withResourcesFlagged(Long resourcesFlagged) {
        this.resourcesFlagged = resourcesFlagged;
        return this;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     * </p>
     *
     * @return <p>
     *         The number of AWS resources ignored by Trusted Advisor because
     *         information was unavailable.
     *         </p>
     */
    public Long getResourcesIgnored() {
        return resourcesIgnored;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     * </p>
     *
     * @param resourcesIgnored <p>
     *            The number of AWS resources ignored by Trusted Advisor because
     *            information was unavailable.
     *            </p>
     */
    public void setResourcesIgnored(Long resourcesIgnored) {
        this.resourcesIgnored = resourcesIgnored;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because
     * information was unavailable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesIgnored <p>
     *            The number of AWS resources ignored by Trusted Advisor because
     *            information was unavailable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourcesSummary withResourcesIgnored(Long resourcesIgnored) {
        this.resourcesIgnored = resourcesIgnored;
        return this;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were
     * marked as suppressed by the user.
     * </p>
     *
     * @return <p>
     *         The number of AWS resources ignored by Trusted Advisor because
     *         they were marked as suppressed by the user.
     *         </p>
     */
    public Long getResourcesSuppressed() {
        return resourcesSuppressed;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were
     * marked as suppressed by the user.
     * </p>
     *
     * @param resourcesSuppressed <p>
     *            The number of AWS resources ignored by Trusted Advisor because
     *            they were marked as suppressed by the user.
     *            </p>
     */
    public void setResourcesSuppressed(Long resourcesSuppressed) {
        this.resourcesSuppressed = resourcesSuppressed;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were
     * marked as suppressed by the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesSuppressed <p>
     *            The number of AWS resources ignored by Trusted Advisor because
     *            they were marked as suppressed by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourcesSummary withResourcesSuppressed(Long resourcesSuppressed) {
        this.resourcesSuppressed = resourcesSuppressed;
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
        if (getResourcesProcessed() != null)
            sb.append("resourcesProcessed: " + getResourcesProcessed() + ",");
        if (getResourcesFlagged() != null)
            sb.append("resourcesFlagged: " + getResourcesFlagged() + ",");
        if (getResourcesIgnored() != null)
            sb.append("resourcesIgnored: " + getResourcesIgnored() + ",");
        if (getResourcesSuppressed() != null)
            sb.append("resourcesSuppressed: " + getResourcesSuppressed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourcesProcessed() == null) ? 0 : getResourcesProcessed().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesFlagged() == null) ? 0 : getResourcesFlagged().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesIgnored() == null) ? 0 : getResourcesIgnored().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesSuppressed() == null) ? 0 : getResourcesSuppressed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorResourcesSummary == false)
            return false;
        TrustedAdvisorResourcesSummary other = (TrustedAdvisorResourcesSummary) obj;

        if (other.getResourcesProcessed() == null ^ this.getResourcesProcessed() == null)
            return false;
        if (other.getResourcesProcessed() != null
                && other.getResourcesProcessed().equals(this.getResourcesProcessed()) == false)
            return false;
        if (other.getResourcesFlagged() == null ^ this.getResourcesFlagged() == null)
            return false;
        if (other.getResourcesFlagged() != null
                && other.getResourcesFlagged().equals(this.getResourcesFlagged()) == false)
            return false;
        if (other.getResourcesIgnored() == null ^ this.getResourcesIgnored() == null)
            return false;
        if (other.getResourcesIgnored() != null
                && other.getResourcesIgnored().equals(this.getResourcesIgnored()) == false)
            return false;
        if (other.getResourcesSuppressed() == null ^ this.getResourcesSuppressed() == null)
            return false;
        if (other.getResourcesSuppressed() != null
                && other.getResourcesSuppressed().equals(this.getResourcesSuppressed()) == false)
            return false;
        return true;
    }
}
