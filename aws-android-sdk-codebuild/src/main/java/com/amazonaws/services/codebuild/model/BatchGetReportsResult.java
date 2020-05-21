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

public class BatchGetReportsResult implements Serializable {
    /**
     * <p>
     * The array of <code>Report</code> objects returned by
     * <code>BatchGetReports</code>.
     * </p>
     */
    private java.util.List<Report> reports;

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not
     * associated with a <code>Report</code>.
     * </p>
     */
    private java.util.List<String> reportsNotFound;

    /**
     * <p>
     * The array of <code>Report</code> objects returned by
     * <code>BatchGetReports</code>.
     * </p>
     *
     * @return <p>
     *         The array of <code>Report</code> objects returned by
     *         <code>BatchGetReports</code>.
     *         </p>
     */
    public java.util.List<Report> getReports() {
        return reports;
    }

    /**
     * <p>
     * The array of <code>Report</code> objects returned by
     * <code>BatchGetReports</code>.
     * </p>
     *
     * @param reports <p>
     *            The array of <code>Report</code> objects returned by
     *            <code>BatchGetReports</code>.
     *            </p>
     */
    public void setReports(java.util.Collection<Report> reports) {
        if (reports == null) {
            this.reports = null;
            return;
        }

        this.reports = new java.util.ArrayList<Report>(reports);
    }

    /**
     * <p>
     * The array of <code>Report</code> objects returned by
     * <code>BatchGetReports</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reports <p>
     *            The array of <code>Report</code> objects returned by
     *            <code>BatchGetReports</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetReportsResult withReports(Report... reports) {
        if (getReports() == null) {
            this.reports = new java.util.ArrayList<Report>(reports.length);
        }
        for (Report value : reports) {
            this.reports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of <code>Report</code> objects returned by
     * <code>BatchGetReports</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reports <p>
     *            The array of <code>Report</code> objects returned by
     *            <code>BatchGetReports</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetReportsResult withReports(java.util.Collection<Report> reports) {
        setReports(reports);
        return this;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not
     * associated with a <code>Report</code>.
     * </p>
     *
     * @return <p>
     *         An array of ARNs passed to <code>BatchGetReportGroups</code> that
     *         are not associated with a <code>Report</code>.
     *         </p>
     */
    public java.util.List<String> getReportsNotFound() {
        return reportsNotFound;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not
     * associated with a <code>Report</code>.
     * </p>
     *
     * @param reportsNotFound <p>
     *            An array of ARNs passed to <code>BatchGetReportGroups</code>
     *            that are not associated with a <code>Report</code>.
     *            </p>
     */
    public void setReportsNotFound(java.util.Collection<String> reportsNotFound) {
        if (reportsNotFound == null) {
            this.reportsNotFound = null;
            return;
        }

        this.reportsNotFound = new java.util.ArrayList<String>(reportsNotFound);
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not
     * associated with a <code>Report</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportsNotFound <p>
     *            An array of ARNs passed to <code>BatchGetReportGroups</code>
     *            that are not associated with a <code>Report</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetReportsResult withReportsNotFound(String... reportsNotFound) {
        if (getReportsNotFound() == null) {
            this.reportsNotFound = new java.util.ArrayList<String>(reportsNotFound.length);
        }
        for (String value : reportsNotFound) {
            this.reportsNotFound.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not
     * associated with a <code>Report</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportsNotFound <p>
     *            An array of ARNs passed to <code>BatchGetReportGroups</code>
     *            that are not associated with a <code>Report</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetReportsResult withReportsNotFound(java.util.Collection<String> reportsNotFound) {
        setReportsNotFound(reportsNotFound);
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
        if (getReports() != null)
            sb.append("reports: " + getReports() + ",");
        if (getReportsNotFound() != null)
            sb.append("reportsNotFound: " + getReportsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReports() == null) ? 0 : getReports().hashCode());
        hashCode = prime * hashCode
                + ((getReportsNotFound() == null) ? 0 : getReportsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetReportsResult == false)
            return false;
        BatchGetReportsResult other = (BatchGetReportsResult) obj;

        if (other.getReports() == null ^ this.getReports() == null)
            return false;
        if (other.getReports() != null && other.getReports().equals(this.getReports()) == false)
            return false;
        if (other.getReportsNotFound() == null ^ this.getReportsNotFound() == null)
            return false;
        if (other.getReportsNotFound() != null
                && other.getReportsNotFound().equals(this.getReportsNotFound()) == false)
            return false;
        return true;
    }
}
