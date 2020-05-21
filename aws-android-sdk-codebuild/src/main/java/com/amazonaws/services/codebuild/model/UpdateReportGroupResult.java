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

public class UpdateReportGroupResult implements Serializable {
    /**
     * <p>
     * Information about the updated report group.
     * </p>
     */
    private ReportGroup reportGroup;

    /**
     * <p>
     * Information about the updated report group.
     * </p>
     *
     * @return <p>
     *         Information about the updated report group.
     *         </p>
     */
    public ReportGroup getReportGroup() {
        return reportGroup;
    }

    /**
     * <p>
     * Information about the updated report group.
     * </p>
     *
     * @param reportGroup <p>
     *            Information about the updated report group.
     *            </p>
     */
    public void setReportGroup(ReportGroup reportGroup) {
        this.reportGroup = reportGroup;
    }

    /**
     * <p>
     * Information about the updated report group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportGroup <p>
     *            Information about the updated report group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateReportGroupResult withReportGroup(ReportGroup reportGroup) {
        this.reportGroup = reportGroup;
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
        if (getReportGroup() != null)
            sb.append("reportGroup: " + getReportGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReportGroup() == null) ? 0 : getReportGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReportGroupResult == false)
            return false;
        UpdateReportGroupResult other = (UpdateReportGroupResult) obj;

        if (other.getReportGroup() == null ^ this.getReportGroup() == null)
            return false;
        if (other.getReportGroup() != null
                && other.getReportGroup().equals(this.getReportGroup()) == false)
            return false;
        return true;
    }
}
