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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The recurrence of the reports.
 * </p>
 */
public class BusinessReportRecurrence implements Serializable {
    /**
     * <p>
     * The start date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$<br/>
     */
    private String startDate;

    /**
     * <p>
     * The start date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$<br/>
     *
     * @return <p>
     *         The start date.
     *         </p>
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The start date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$<br/>
     *
     * @param startDate <p>
     *            The start date.
     *            </p>
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$<br/>
     *
     * @param startDate <p>
     *            The start date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportRecurrence withStartDate(String startDate) {
        this.startDate = startDate;
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
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReportRecurrence == false)
            return false;
        BusinessReportRecurrence other = (BusinessReportRecurrence) obj;

        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        return true;
    }
}
