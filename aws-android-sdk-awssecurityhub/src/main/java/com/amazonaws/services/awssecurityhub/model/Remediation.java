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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the remediation steps for a finding.
 * </p>
 */
public class Remediation implements Serializable {
    /**
     * <p>
     * A recommendation on the steps to take to remediate the issue identified
     * by a finding.
     * </p>
     */
    private Recommendation recommendation;

    /**
     * <p>
     * A recommendation on the steps to take to remediate the issue identified
     * by a finding.
     * </p>
     *
     * @return <p>
     *         A recommendation on the steps to take to remediate the issue
     *         identified by a finding.
     *         </p>
     */
    public Recommendation getRecommendation() {
        return recommendation;
    }

    /**
     * <p>
     * A recommendation on the steps to take to remediate the issue identified
     * by a finding.
     * </p>
     *
     * @param recommendation <p>
     *            A recommendation on the steps to take to remediate the issue
     *            identified by a finding.
     *            </p>
     */
    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * A recommendation on the steps to take to remediate the issue identified
     * by a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendation <p>
     *            A recommendation on the steps to take to remediate the issue
     *            identified by a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Remediation withRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
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
        if (getRecommendation() != null)
            sb.append("Recommendation: " + getRecommendation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Remediation == false)
            return false;
        Remediation other = (Remediation) obj;

        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null
                && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        return true;
    }
}
