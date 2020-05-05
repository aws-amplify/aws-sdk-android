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
 * The container for summary information that relates to the category of the
 * Trusted Advisor check.
 * </p>
 */
public class TrustedAdvisorCategorySpecificSummary implements Serializable {
    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check
     * that is in the Cost Optimizing category.
     * </p>
     */
    private TrustedAdvisorCostOptimizingSummary costOptimizing;

    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check
     * that is in the Cost Optimizing category.
     * </p>
     *
     * @return <p>
     *         The summary information about cost savings for a Trusted Advisor
     *         check that is in the Cost Optimizing category.
     *         </p>
     */
    public TrustedAdvisorCostOptimizingSummary getCostOptimizing() {
        return costOptimizing;
    }

    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check
     * that is in the Cost Optimizing category.
     * </p>
     *
     * @param costOptimizing <p>
     *            The summary information about cost savings for a Trusted
     *            Advisor check that is in the Cost Optimizing category.
     *            </p>
     */
    public void setCostOptimizing(TrustedAdvisorCostOptimizingSummary costOptimizing) {
        this.costOptimizing = costOptimizing;
    }

    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check
     * that is in the Cost Optimizing category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param costOptimizing <p>
     *            The summary information about cost savings for a Trusted
     *            Advisor check that is in the Cost Optimizing category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCategorySpecificSummary withCostOptimizing(
            TrustedAdvisorCostOptimizingSummary costOptimizing) {
        this.costOptimizing = costOptimizing;
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
        if (getCostOptimizing() != null)
            sb.append("costOptimizing: " + getCostOptimizing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCostOptimizing() == null) ? 0 : getCostOptimizing().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCategorySpecificSummary == false)
            return false;
        TrustedAdvisorCategorySpecificSummary other = (TrustedAdvisorCategorySpecificSummary) obj;

        if (other.getCostOptimizing() == null ^ this.getCostOptimizing() == null)
            return false;
        if (other.getCostOptimizing() != null
                && other.getCostOptimizing().equals(this.getCostOptimizing()) == false)
            return false;
        return true;
    }
}
