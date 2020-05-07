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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a test report.
 * </p>
 */
public class TestReportSummary implements Serializable {
    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The
     * total includes truncated test cases.
     * </p>
     */
    private Integer total;

    /**
     * <p>
     * A map that contains the number of each type of status returned by the
     * test results in this <code>TestReportSummary</code>.
     * </p>
     */
    private java.util.Map<String, Integer> statusCounts;

    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this
     * report.
     * </p>
     */
    private Long durationInNanoSeconds;

    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The
     * total includes truncated test cases.
     * </p>
     *
     * @return <p>
     *         The number of test cases in this <code>TestReportSummary</code>.
     *         The total includes truncated test cases.
     *         </p>
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The
     * total includes truncated test cases.
     * </p>
     *
     * @param total <p>
     *            The number of test cases in this
     *            <code>TestReportSummary</code>. The total includes truncated
     *            test cases.
     *            </p>
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The
     * total includes truncated test cases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The number of test cases in this
     *            <code>TestReportSummary</code>. The total includes truncated
     *            test cases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestReportSummary withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * <p>
     * A map that contains the number of each type of status returned by the
     * test results in this <code>TestReportSummary</code>.
     * </p>
     *
     * @return <p>
     *         A map that contains the number of each type of status returned by
     *         the test results in this <code>TestReportSummary</code>.
     *         </p>
     */
    public java.util.Map<String, Integer> getStatusCounts() {
        return statusCounts;
    }

    /**
     * <p>
     * A map that contains the number of each type of status returned by the
     * test results in this <code>TestReportSummary</code>.
     * </p>
     *
     * @param statusCounts <p>
     *            A map that contains the number of each type of status returned
     *            by the test results in this <code>TestReportSummary</code>.
     *            </p>
     */
    public void setStatusCounts(java.util.Map<String, Integer> statusCounts) {
        this.statusCounts = statusCounts;
    }

    /**
     * <p>
     * A map that contains the number of each type of status returned by the
     * test results in this <code>TestReportSummary</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCounts <p>
     *            A map that contains the number of each type of status returned
     *            by the test results in this <code>TestReportSummary</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestReportSummary withStatusCounts(java.util.Map<String, Integer> statusCounts) {
        this.statusCounts = statusCounts;
        return this;
    }

    /**
     * <p>
     * A map that contains the number of each type of status returned by the
     * test results in this <code>TestReportSummary</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into statusCounts parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into statusCounts.
     * @param value The corresponding value of the entry to be added into
     *            statusCounts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestReportSummary addstatusCountsEntry(String key, Integer value) {
        if (null == this.statusCounts) {
            this.statusCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.statusCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.statusCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into statusCounts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TestReportSummary clearstatusCountsEntries() {
        this.statusCounts = null;
        return this;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this
     * report.
     * </p>
     *
     * @return <p>
     *         The number of nanoseconds it took to run all of the test cases in
     *         this report.
     *         </p>
     */
    public Long getDurationInNanoSeconds() {
        return durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this
     * report.
     * </p>
     *
     * @param durationInNanoSeconds <p>
     *            The number of nanoseconds it took to run all of the test cases
     *            in this report.
     *            </p>
     */
    public void setDurationInNanoSeconds(Long durationInNanoSeconds) {
        this.durationInNanoSeconds = durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this
     * report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationInNanoSeconds <p>
     *            The number of nanoseconds it took to run all of the test cases
     *            in this report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestReportSummary withDurationInNanoSeconds(Long durationInNanoSeconds) {
        this.durationInNanoSeconds = durationInNanoSeconds;
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
        if (getTotal() != null)
            sb.append("total: " + getTotal() + ",");
        if (getStatusCounts() != null)
            sb.append("statusCounts: " + getStatusCounts() + ",");
        if (getDurationInNanoSeconds() != null)
            sb.append("durationInNanoSeconds: " + getDurationInNanoSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode
                + ((getStatusCounts() == null) ? 0 : getStatusCounts().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationInNanoSeconds() == null) ? 0 : getDurationInNanoSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestReportSummary == false)
            return false;
        TestReportSummary other = (TestReportSummary) obj;

        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getStatusCounts() == null ^ this.getStatusCounts() == null)
            return false;
        if (other.getStatusCounts() != null
                && other.getStatusCounts().equals(this.getStatusCounts()) == false)
            return false;
        if (other.getDurationInNanoSeconds() == null ^ this.getDurationInNanoSeconds() == null)
            return false;
        if (other.getDurationInNanoSeconds() != null
                && other.getDurationInNanoSeconds().equals(this.getDurationInNanoSeconds()) == false)
            return false;
        return true;
    }
}
