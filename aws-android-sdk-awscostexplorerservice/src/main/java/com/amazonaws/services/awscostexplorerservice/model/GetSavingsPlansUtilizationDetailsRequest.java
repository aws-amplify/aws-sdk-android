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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves attribute data along with aggregate utilization and savings data
 * for a given time period. This doesn't support granular or grouped data
 * (daily/monthly) in response. You can't retrieve data by dates in a single
 * response similar to <code>GetSavingsPlanUtilization</code>, but you have the
 * option to make multiple calls to
 * <code>GetSavingsPlanUtilizationDetails</code> by providing individual dates.
 * You can use <code>GetDimensionValues</code> in <code>SAVINGS_PLANS</code> to
 * determine the possible dimension values.
 * </p>
 * <note>
 * <p>
 * <code>GetSavingsPlanUtilizationDetails</code> internally groups data by
 * <code>SavingsPlansArn</code>.
 * </p>
 * </note>
 */
public class GetSavingsPlansUtilizationDetailsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The time period that you want the usage and costs for. The
     * <code>Start</code> date must be within 13 months. The <code>End</code>
     * date must be after the <code>Start</code> date, and before the current
     * date. Future dates can't be used as an <code>End</code> date.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans
     * dimensions. You can filter data with the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension.
     * </p>
     */
    private Expression filter;

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
     * The number of items to be returned in a response. The default is
     * <code>20</code>, with a minimum value of <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The time period that you want the usage and costs for. The
     * <code>Start</code> date must be within 13 months. The <code>End</code>
     * date must be after the <code>Start</code> date, and before the current
     * date. Future dates can't be used as an <code>End</code> date.
     * </p>
     *
     * @return <p>
     *         The time period that you want the usage and costs for. The
     *         <code>Start</code> date must be within 13 months. The
     *         <code>End</code> date must be after the <code>Start</code> date,
     *         and before the current date. Future dates can't be used as an
     *         <code>End</code> date.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for. The
     * <code>Start</code> date must be within 13 months. The <code>End</code>
     * date must be after the <code>Start</code> date, and before the current
     * date. Future dates can't be used as an <code>End</code> date.
     * </p>
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for. The
     *            <code>Start</code> date must be within 13 months. The
     *            <code>End</code> date must be after the <code>Start</code>
     *            date, and before the current date. Future dates can't be used
     *            as an <code>End</code> date.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for. The
     * <code>Start</code> date must be within 13 months. The <code>End</code>
     * date must be after the <code>Start</code> date, and before the current
     * date. Future dates can't be used as an <code>End</code> date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for. The
     *            <code>Start</code> date must be within 13 months. The
     *            <code>End</code> date must be after the <code>Start</code>
     *            date, and before the current date. Future dates can't be used
     *            as an <code>End</code> date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsRequest withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans
     * dimensions. You can filter data with the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension.
     * </p>
     *
     * @return <p>
     *         Filters Savings Plans utilization coverage data for active
     *         Savings Plans dimensions. You can filter data with the following
     *         dimensions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LINKED_ACCOUNT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAVINGS_PLAN_ARN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PAYMENT_OPTION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE_TYPE_FAMILY</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>GetSavingsPlansUtilizationDetails</code> uses the same <a
     *         href=
     *         "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *         >Expression</a> object as the other operations, but only
     *         <code>AND</code> is supported among each dimension.
     *         </p>
     */
    public Expression getFilter() {
        return filter;
    }

    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans
     * dimensions. You can filter data with the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension.
     * </p>
     *
     * @param filter <p>
     *            Filters Savings Plans utilization coverage data for active
     *            Savings Plans dimensions. You can filter data with the
     *            following dimensions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LINKED_ACCOUNT</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SAVINGS_PLAN_ARN</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>REGION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PAYMENT_OPTION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE_TYPE_FAMILY</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>GetSavingsPlansUtilizationDetails</code> uses the same
     *            <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object as the other operations, but only
     *            <code>AND</code> is supported among each dimension.
     *            </p>
     */
    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters Savings Plans utilization coverage data for active Savings Plans
     * dimensions. You can filter data with the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_PLAN_ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAYMENT_OPTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_TYPE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetSavingsPlansUtilizationDetails</code> uses the same <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     * >Expression</a> object as the other operations, but only <code>AND</code>
     * is supported among each dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Filters Savings Plans utilization coverage data for active
     *            Savings Plans dimensions. You can filter data with the
     *            following dimensions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LINKED_ACCOUNT</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SAVINGS_PLAN_ARN</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>REGION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PAYMENT_OPTION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE_TYPE_FAMILY</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>GetSavingsPlansUtilizationDetails</code> uses the same
     *            <a href=
     *            "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html"
     *            >Expression</a> object as the other operations, but only
     *            <code>AND</code> is supported among each dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsRequest withFilter(Expression filter) {
        this.filter = filter;
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
    public GetSavingsPlansUtilizationDetailsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is
     * <code>20</code>, with a minimum value of <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of items to be returned in a response. The default is
     *         <code>20</code>, with a minimum value of <code>1</code>.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is
     * <code>20</code>, with a minimum value of <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The number of items to be returned in a response. The default
     *            is <code>20</code>, with a minimum value of <code>1</code>.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of items to be returned in a response. The default is
     * <code>20</code>, with a minimum value of <code>1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The number of items to be returned in a response. The default
     *            is <code>20</code>, with a minimum value of <code>1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationDetailsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansUtilizationDetailsRequest == false)
            return false;
        GetSavingsPlansUtilizationDetailsRequest other = (GetSavingsPlansUtilizationDetailsRequest) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
