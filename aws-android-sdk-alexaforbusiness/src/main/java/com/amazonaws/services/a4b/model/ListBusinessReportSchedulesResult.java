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

public class ListBusinessReportSchedulesResult implements Serializable {
    /**
     * <p>
     * The schedule of the reports.
     * </p>
     */
    private java.util.List<BusinessReportSchedule> businessReportSchedules;

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API
     * call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     *
     * @return <p>
     *         The schedule of the reports.
     *         </p>
     */
    public java.util.List<BusinessReportSchedule> getBusinessReportSchedules() {
        return businessReportSchedules;
    }

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     *
     * @param businessReportSchedules <p>
     *            The schedule of the reports.
     *            </p>
     */
    public void setBusinessReportSchedules(
            java.util.Collection<BusinessReportSchedule> businessReportSchedules) {
        if (businessReportSchedules == null) {
            this.businessReportSchedules = null;
            return;
        }

        this.businessReportSchedules = new java.util.ArrayList<BusinessReportSchedule>(
                businessReportSchedules);
    }

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param businessReportSchedules <p>
     *            The schedule of the reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBusinessReportSchedulesResult withBusinessReportSchedules(
            BusinessReportSchedule... businessReportSchedules) {
        if (getBusinessReportSchedules() == null) {
            this.businessReportSchedules = new java.util.ArrayList<BusinessReportSchedule>(
                    businessReportSchedules.length);
        }
        for (BusinessReportSchedule value : businessReportSchedules) {
            this.businessReportSchedules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param businessReportSchedules <p>
     *            The schedule of the reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBusinessReportSchedulesResult withBusinessReportSchedules(
            java.util.Collection<BusinessReportSchedule> businessReportSchedules) {
        setBusinessReportSchedules(businessReportSchedules);
        return this;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API
     * call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The token used to list the remaining schedules from the previous
     *         API call.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API
     * call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token used to list the remaining schedules from the
     *            previous API call.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API
     * call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token used to list the remaining schedules from the
     *            previous API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBusinessReportSchedulesResult withNextToken(String nextToken) {
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
        if (getBusinessReportSchedules() != null)
            sb.append("BusinessReportSchedules: " + getBusinessReportSchedules() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBusinessReportSchedules() == null) ? 0 : getBusinessReportSchedules()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBusinessReportSchedulesResult == false)
            return false;
        ListBusinessReportSchedulesResult other = (ListBusinessReportSchedulesResult) obj;

        if (other.getBusinessReportSchedules() == null ^ this.getBusinessReportSchedules() == null)
            return false;
        if (other.getBusinessReportSchedules() != null
                && other.getBusinessReportSchedules().equals(this.getBusinessReportSchedules()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
