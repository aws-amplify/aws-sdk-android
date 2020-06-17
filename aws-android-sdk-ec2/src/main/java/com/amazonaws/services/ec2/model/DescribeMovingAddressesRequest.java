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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes your Elastic IP addresses that are being moved to the EC2-VPC
 * platform, or that are being restored to the EC2-Classic platform. This
 * request does not return information about any other Elastic IP addresses in
 * your account.
 * </p>
 */
public class DescribeMovingAddressesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (
     * <code>MovingToVpc</code> | <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1000; if <code>MaxResults</code> is given a
     * value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     */
    private java.util.List<String> publicIps;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (
     * <code>MovingToVpc</code> | <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>moving-status</code> - The status of the Elastic IP address
     *         (<code>MovingToVpc</code> | <code>RestoringToClassic</code>).
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (
     * <code>MovingToVpc</code> | <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>moving-status</code> - The status of the Elastic IP
     *            address (<code>MovingToVpc</code> |
     *            <code>RestoringToClassic</code>).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (
     * <code>MovingToVpc</code> | <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>moving-status</code> - The status of the Elastic IP
     *            address (<code>MovingToVpc</code> |
     *            <code>RestoringToClassic</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMovingAddressesRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (
     * <code>MovingToVpc</code> | <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>moving-status</code> - The status of the Elastic IP
     *            address (<code>MovingToVpc</code> |
     *            <code>RestoringToClassic</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMovingAddressesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMovingAddressesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1000; if <code>MaxResults</code> is given a
     * value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results of the initial request can be
     *         seen by sending another request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and
     *         1000; if <code>MaxResults</code> is given a value outside of this
     *         range, an error is returned.
     *         </p>
     *         <p>
     *         Default: If no value is provided, the default is 1000.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1000; if <code>MaxResults</code> is given a
     * value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results of the initial request can
     *            be seen by sending another request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            1000; if <code>MaxResults</code> is given a value outside of
     *            this range, an error is returned.
     *            </p>
     *            <p>
     *            Default: If no value is provided, the default is 1000.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This
     * value can be between 5 and 1000; if <code>MaxResults</code> is given a
     * value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results of the initial request can
     *            be seen by sending another request with the returned
     *            <code>NextToken</code> value. This value can be between 5 and
     *            1000; if <code>MaxResults</code> is given a value outside of
     *            this range, an error is returned.
     *            </p>
     *            <p>
     *            Default: If no value is provided, the default is 1000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMovingAddressesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMovingAddressesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     *
     * @return <p>
     *         One or more Elastic IP addresses.
     *         </p>
     */
    public java.util.List<String> getPublicIps() {
        return publicIps;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     *
     * @param publicIps <p>
     *            One or more Elastic IP addresses.
     *            </p>
     */
    public void setPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
            return;
        }

        this.publicIps = new java.util.ArrayList<String>(publicIps);
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIps <p>
     *            One or more Elastic IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMovingAddressesRequest withPublicIps(String... publicIps) {
        if (getPublicIps() == null) {
            this.publicIps = new java.util.ArrayList<String>(publicIps.length);
        }
        for (String value : publicIps) {
            this.publicIps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIps <p>
     *            One or more Elastic IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMovingAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        setPublicIps(publicIps);
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getPublicIps() != null)
            sb.append("PublicIps: " + getPublicIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPublicIps() == null) ? 0 : getPublicIps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMovingAddressesRequest == false)
            return false;
        DescribeMovingAddressesRequest other = (DescribeMovingAddressesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPublicIps() == null ^ this.getPublicIps() == null)
            return false;
        if (other.getPublicIps() != null
                && other.getPublicIps().equals(this.getPublicIps()) == false)
            return false;
        return true;
    }
}
