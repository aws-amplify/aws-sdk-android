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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListThingRegistrationTaskReportsResult implements Serializable {
    /**
     * <p>
     * Links to the task resources.
     * </p>
     */
    private java.util.List<String> resourceLinks;

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     */
    private String reportType;

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Links to the task resources.
     * </p>
     *
     * @return <p>
     *         Links to the task resources.
     *         </p>
     */
    public java.util.List<String> getResourceLinks() {
        return resourceLinks;
    }

    /**
     * <p>
     * Links to the task resources.
     * </p>
     *
     * @param resourceLinks <p>
     *            Links to the task resources.
     *            </p>
     */
    public void setResourceLinks(java.util.Collection<String> resourceLinks) {
        if (resourceLinks == null) {
            this.resourceLinks = null;
            return;
        }

        this.resourceLinks = new java.util.ArrayList<String>(resourceLinks);
    }

    /**
     * <p>
     * Links to the task resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLinks <p>
     *            Links to the task resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTaskReportsResult withResourceLinks(String... resourceLinks) {
        if (getResourceLinks() == null) {
            this.resourceLinks = new java.util.ArrayList<String>(resourceLinks.length);
        }
        for (String value : resourceLinks) {
            this.resourceLinks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Links to the task resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLinks <p>
     *            Links to the task resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTaskReportsResult withResourceLinks(
            java.util.Collection<String> resourceLinks) {
        setResourceLinks(resourceLinks);
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @return <p>
     *         The type of task report.
     *         </p>
     * @see ReportType
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @see ReportType
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public ListThingRegistrationTaskReportsResult withReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @see ReportType
     */
    public void setReportType(ReportType reportType) {
        this.reportType = reportType.toString();
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public ListThingRegistrationTaskReportsResult withReportType(ReportType reportType) {
        this.reportType = reportType.toString();
        return this;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token to use to get the next set of results, or <b>null</b>
     *         if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to get the next set of results, or
     *            <b>null</b> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to get the next set of results, or
     *            <b>null</b> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTaskReportsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceLinks() != null)
            sb.append("resourceLinks: " + getResourceLinks() + ",");
        if (getReportType() != null)
            sb.append("reportType: " + getReportType() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceLinks() == null) ? 0 : getResourceLinks().hashCode());
        hashCode = prime * hashCode + ((getReportType() == null) ? 0 : getReportType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingRegistrationTaskReportsResult == false)
            return false;
        ListThingRegistrationTaskReportsResult other = (ListThingRegistrationTaskReportsResult) obj;

        if (other.getResourceLinks() == null ^ this.getResourceLinks() == null)
            return false;
        if (other.getResourceLinks() != null
                && other.getResourceLinks().equals(this.getResourceLinks()) == false)
            return false;
        if (other.getReportType() == null ^ this.getReportType() == null)
            return false;
        if (other.getReportType() != null
                && other.getReportType().equals(this.getReportType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
