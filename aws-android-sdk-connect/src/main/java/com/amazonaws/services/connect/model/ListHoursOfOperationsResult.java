/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListHoursOfOperationsResult implements Serializable {
    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     */
    private java.util.List<HoursOfOperationSummary> hoursOfOperationSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     *
     * @return <p>
     *         Information about the hours of operation.
     *         </p>
     */
    public java.util.List<HoursOfOperationSummary> getHoursOfOperationSummaryList() {
        return hoursOfOperationSummaryList;
    }

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     *
     * @param hoursOfOperationSummaryList <p>
     *            Information about the hours of operation.
     *            </p>
     */
    public void setHoursOfOperationSummaryList(
            java.util.Collection<HoursOfOperationSummary> hoursOfOperationSummaryList) {
        if (hoursOfOperationSummaryList == null) {
            this.hoursOfOperationSummaryList = null;
            return;
        }

        this.hoursOfOperationSummaryList = new java.util.ArrayList<HoursOfOperationSummary>(
                hoursOfOperationSummaryList);
    }

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hoursOfOperationSummaryList <p>
     *            Information about the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHoursOfOperationsResult withHoursOfOperationSummaryList(
            HoursOfOperationSummary... hoursOfOperationSummaryList) {
        if (getHoursOfOperationSummaryList() == null) {
            this.hoursOfOperationSummaryList = new java.util.ArrayList<HoursOfOperationSummary>(
                    hoursOfOperationSummaryList.length);
        }
        for (HoursOfOperationSummary value : hoursOfOperationSummaryList) {
            this.hoursOfOperationSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hoursOfOperationSummaryList <p>
     *            Information about the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHoursOfOperationsResult withHoursOfOperationSummaryList(
            java.util.Collection<HoursOfOperationSummary> hoursOfOperationSummaryList) {
        setHoursOfOperationSummaryList(hoursOfOperationSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHoursOfOperationsResult withNextToken(String nextToken) {
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
        if (getHoursOfOperationSummaryList() != null)
            sb.append("HoursOfOperationSummaryList: " + getHoursOfOperationSummaryList() + ",");
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
                + ((getHoursOfOperationSummaryList() == null) ? 0
                        : getHoursOfOperationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHoursOfOperationsResult == false)
            return false;
        ListHoursOfOperationsResult other = (ListHoursOfOperationsResult) obj;

        if (other.getHoursOfOperationSummaryList() == null
                ^ this.getHoursOfOperationSummaryList() == null)
            return false;
        if (other.getHoursOfOperationSummaryList() != null
                && other.getHoursOfOperationSummaryList().equals(
                        this.getHoursOfOperationSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
