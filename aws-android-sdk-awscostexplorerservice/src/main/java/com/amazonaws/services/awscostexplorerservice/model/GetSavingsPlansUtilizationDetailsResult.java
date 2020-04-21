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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

public class GetSavingsPlansUtilizationDetailsResult implements Serializable {
    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and
     * details for your account.
     * </p>
     */
    private java.util.List<SavingsPlansUtilizationDetail> savingsPlansUtilizationDetails;

    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     */
    private SavingsPlansUtilizationAggregates total;

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and
     * details for your account.
     * </p>
     *
     * @return <p>
     *         Retrieves a single daily or monthly Savings Plans utilization
     *         rate and details for your account.
     *         </p>
     */
    public java.util.List<SavingsPlansUtilizationDetail> getSavingsPlansUtilizationDetails() {
        return savingsPlansUtilizationDetails;
    }

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and
     * details for your account.
     * </p>
     *
     * @param savingsPlansUtilizationDetails <p>
     *            Retrieves a single daily or monthly Savings Plans utilization
     *            rate and details for your account.
     *            </p>
     */
    public void setSavingsPlansUtilizationDetails(
            java.util.Collection<SavingsPlansUtilizationDetail> savingsPlansUtilizationDetails) {
        if (savingsPlansUtilizationDetails == null) {
            this.savingsPlansUtilizationDetails = null;
            return;
        }

        this.savingsPlansUtilizationDetails = new java.util.ArrayList<SavingsPlansUtilizationDetail>(
                savingsPlansUtilizationDetails);
    }

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and
     * details for your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansUtilizationDetails <p>
     *            Retrieves a single daily or monthly Savings Plans utilization
     *            rate and details for your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsResult withSavingsPlansUtilizationDetails(
            SavingsPlansUtilizationDetail... savingsPlansUtilizationDetails) {
        if (getSavingsPlansUtilizationDetails() == null) {
            this.savingsPlansUtilizationDetails = new java.util.ArrayList<SavingsPlansUtilizationDetail>(
                    savingsPlansUtilizationDetails.length);
        }
        for (SavingsPlansUtilizationDetail value : savingsPlansUtilizationDetails) {
            this.savingsPlansUtilizationDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and
     * details for your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansUtilizationDetails <p>
     *            Retrieves a single daily or monthly Savings Plans utilization
     *            rate and details for your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsResult withSavingsPlansUtilizationDetails(
            java.util.Collection<SavingsPlansUtilizationDetail> savingsPlansUtilizationDetails) {
        setSavingsPlansUtilizationDetails(savingsPlansUtilizationDetails);
        return this;
    }

    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     *
     * @return <p>
     *         The total Savings Plans utilization, regardless of time period.
     *         </p>
     */
    public SavingsPlansUtilizationAggregates getTotal() {
        return total;
    }

    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     *
     * @param total <p>
     *            The total Savings Plans utilization, regardless of time
     *            period.
     *            </p>
     */
    public void setTotal(SavingsPlansUtilizationAggregates total) {
        this.total = total;
    }

    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The total Savings Plans utilization, regardless of time
     *            period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsResult withTotal(SavingsPlansUtilizationAggregates total) {
        this.total = total;
        return this;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     *
     * @return <p>
     *         The time period that you want the usage and costs for.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsResult withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results. Amazon Web
     *         Services provides the token when the response from a previous
     *         call has more results than the maximum page size.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsResult withNextToken(String nextToken) {
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
        if (getSavingsPlansUtilizationDetails() != null)
            sb.append("SavingsPlansUtilizationDetails: " + getSavingsPlansUtilizationDetails()
                    + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal() + ",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
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
                + ((getSavingsPlansUtilizationDetails() == null) ? 0
                        : getSavingsPlansUtilizationDetails().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansUtilizationDetailsResult == false)
            return false;
        GetSavingsPlansUtilizationDetailsResult other = (GetSavingsPlansUtilizationDetailsResult) obj;

        if (other.getSavingsPlansUtilizationDetails() == null
                ^ this.getSavingsPlansUtilizationDetails() == null)
            return false;
        if (other.getSavingsPlansUtilizationDetails() != null
                && other.getSavingsPlansUtilizationDetails().equals(
                        this.getSavingsPlansUtilizationDetails()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
