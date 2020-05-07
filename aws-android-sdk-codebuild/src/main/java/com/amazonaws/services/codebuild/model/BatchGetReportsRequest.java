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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of reports.
 * </p>
 */
public class BatchGetReportsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     */
    private java.util.List<String> reportArns;

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     *
     * @return <p>
     *         An array of ARNs that identify the <code>Report</code> objects to
     *         return.
     *         </p>
     */
    public java.util.List<String> getReportArns() {
        return reportArns;
    }

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     *
     * @param reportArns <p>
     *            An array of ARNs that identify the <code>Report</code> objects
     *            to return.
     *            </p>
     */
    public void setReportArns(java.util.Collection<String> reportArns) {
        if (reportArns == null) {
            this.reportArns = null;
            return;
        }

        this.reportArns = new java.util.ArrayList<String>(reportArns);
    }

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportArns <p>
     *            An array of ARNs that identify the <code>Report</code> objects
     *            to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetReportsRequest withReportArns(String... reportArns) {
        if (getReportArns() == null) {
            this.reportArns = new java.util.ArrayList<String>(reportArns.length);
        }
        for (String value : reportArns) {
            this.reportArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportArns <p>
     *            An array of ARNs that identify the <code>Report</code> objects
     *            to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetReportsRequest withReportArns(java.util.Collection<String> reportArns) {
        setReportArns(reportArns);
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
        if (getReportArns() != null)
            sb.append("reportArns: " + getReportArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportArns() == null) ? 0 : getReportArns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetReportsRequest == false)
            return false;
        BatchGetReportsRequest other = (BatchGetReportsRequest) obj;

        if (other.getReportArns() == null ^ this.getReportArns() == null)
            return false;
        if (other.getReportArns() != null
                && other.getReportArns().equals(this.getReportArns()) == false)
            return false;
        return true;
    }
}
