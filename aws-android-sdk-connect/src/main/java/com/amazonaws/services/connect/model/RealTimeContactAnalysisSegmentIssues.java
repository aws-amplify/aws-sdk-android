/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Segment type containing a list of detected issues.
 * </p>
 */
public class RealTimeContactAnalysisSegmentIssues implements Serializable {
    /**
     * <p>
     * List of the issues detected.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisIssueDetected> issuesDetected;

    /**
     * <p>
     * List of the issues detected.
     * </p>
     *
     * @return <p>
     *         List of the issues detected.
     *         </p>
     */
    public java.util.List<RealTimeContactAnalysisIssueDetected> getIssuesDetected() {
        return issuesDetected;
    }

    /**
     * <p>
     * List of the issues detected.
     * </p>
     *
     * @param issuesDetected <p>
     *            List of the issues detected.
     *            </p>
     */
    public void setIssuesDetected(
            java.util.Collection<RealTimeContactAnalysisIssueDetected> issuesDetected) {
        if (issuesDetected == null) {
            this.issuesDetected = null;
            return;
        }

        this.issuesDetected = new java.util.ArrayList<RealTimeContactAnalysisIssueDetected>(
                issuesDetected);
    }

    /**
     * <p>
     * List of the issues detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issuesDetected <p>
     *            List of the issues detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentIssues withIssuesDetected(
            RealTimeContactAnalysisIssueDetected... issuesDetected) {
        if (getIssuesDetected() == null) {
            this.issuesDetected = new java.util.ArrayList<RealTimeContactAnalysisIssueDetected>(
                    issuesDetected.length);
        }
        for (RealTimeContactAnalysisIssueDetected value : issuesDetected) {
            this.issuesDetected.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of the issues detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issuesDetected <p>
     *            List of the issues detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentIssues withIssuesDetected(
            java.util.Collection<RealTimeContactAnalysisIssueDetected> issuesDetected) {
        setIssuesDetected(issuesDetected);
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
        if (getIssuesDetected() != null)
            sb.append("IssuesDetected: " + getIssuesDetected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIssuesDetected() == null) ? 0 : getIssuesDetected().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentIssues == false)
            return false;
        RealTimeContactAnalysisSegmentIssues other = (RealTimeContactAnalysisSegmentIssues) obj;

        if (other.getIssuesDetected() == null ^ this.getIssuesDetected() == null)
            return false;
        if (other.getIssuesDetected() != null
                && other.getIssuesDetected().equals(this.getIssuesDetected()) == false)
            return false;
        return true;
    }
}
