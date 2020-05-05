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
 * The summaries of the Trusted Advisor checks returned by the
 * <a>DescribeTrustedAdvisorCheckSummaries</a> operation.
 * </p>
 */
public class DescribeTrustedAdvisorCheckSummariesResult implements Serializable {
    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     */
    private java.util.List<TrustedAdvisorCheckSummary> summaries;

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     *
     * @return <p>
     *         The summary information for the requested Trusted Advisor checks.
     *         </p>
     */
    public java.util.List<TrustedAdvisorCheckSummary> getSummaries() {
        return summaries;
    }

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     *
     * @param summaries <p>
     *            The summary information for the requested Trusted Advisor
     *            checks.
     *            </p>
     */
    public void setSummaries(java.util.Collection<TrustedAdvisorCheckSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new java.util.ArrayList<TrustedAdvisorCheckSummary>(summaries);
    }

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaries <p>
     *            The summary information for the requested Trusted Advisor
     *            checks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrustedAdvisorCheckSummariesResult withSummaries(
            TrustedAdvisorCheckSummary... summaries) {
        if (getSummaries() == null) {
            this.summaries = new java.util.ArrayList<TrustedAdvisorCheckSummary>(summaries.length);
        }
        for (TrustedAdvisorCheckSummary value : summaries) {
            this.summaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaries <p>
     *            The summary information for the requested Trusted Advisor
     *            checks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrustedAdvisorCheckSummariesResult withSummaries(
            java.util.Collection<TrustedAdvisorCheckSummary> summaries) {
        setSummaries(summaries);
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
        if (getSummaries() != null)
            sb.append("summaries: " + getSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckSummariesResult == false)
            return false;
        DescribeTrustedAdvisorCheckSummariesResult other = (DescribeTrustedAdvisorCheckSummariesResult) obj;

        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null
                && other.getSummaries().equals(this.getSummaries()) == false)
            return false;
        return true;
    }
}
