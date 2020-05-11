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
 * Describes the Elastic Graphics accelerator associated with your instances.
 * For more information about Elastic Graphics, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
 * >Amazon Elastic Graphics</a>.
 * </p>
 */
public class DescribeElasticGpusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Elastic Graphics accelerator IDs.
     * </p>
     */
    private java.util.List<String> elasticGpuIds;

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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics
     * accelerator (<code>OK</code> | <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics
     * accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator;
     * for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic
     * Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Elastic Graphics accelerator IDs.
     * </p>
     *
     * @return <p>
     *         The Elastic Graphics accelerator IDs.
     *         </p>
     */
    public java.util.List<String> getElasticGpuIds() {
        return elasticGpuIds;
    }

    /**
     * <p>
     * The Elastic Graphics accelerator IDs.
     * </p>
     *
     * @param elasticGpuIds <p>
     *            The Elastic Graphics accelerator IDs.
     *            </p>
     */
    public void setElasticGpuIds(java.util.Collection<String> elasticGpuIds) {
        if (elasticGpuIds == null) {
            this.elasticGpuIds = null;
            return;
        }

        this.elasticGpuIds = new java.util.ArrayList<String>(elasticGpuIds);
    }

    /**
     * <p>
     * The Elastic Graphics accelerator IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuIds <p>
     *            The Elastic Graphics accelerator IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusRequest withElasticGpuIds(String... elasticGpuIds) {
        if (getElasticGpuIds() == null) {
            this.elasticGpuIds = new java.util.ArrayList<String>(elasticGpuIds.length);
        }
        for (String value : elasticGpuIds) {
            this.elasticGpuIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic Graphics accelerator IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuIds <p>
     *            The Elastic Graphics accelerator IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusRequest withElasticGpuIds(java.util.Collection<String> elasticGpuIds) {
        setElasticGpuIds(elasticGpuIds);
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
    public DescribeElasticGpusRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics
     * accelerator (<code>OK</code> | <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics
     * accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator;
     * for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic
     * Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone in which
     *         the Elastic Graphics accelerator resides.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elastic-gpu-health</code> - The status of the Elastic
     *         Graphics accelerator (<code>OK</code> | <code>IMPAIRED</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elastic-gpu-state</code> - The state of the Elastic
     *         Graphics accelerator (<code>ATTACHED</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elastic-gpu-type</code> - The type of Elastic Graphics
     *         accelerator; for example, <code>eg1.medium</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance to which the
     *         Elastic Graphics accelerator is associated.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics
     * accelerator (<code>OK</code> | <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics
     * accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator;
     * for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic
     * Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone in
     *            which the Elastic Graphics accelerator resides.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-health</code> - The status of the Elastic
     *            Graphics accelerator (<code>OK</code> | <code>IMPAIRED</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-state</code> - The state of the Elastic
     *            Graphics accelerator (<code>ATTACHED</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-type</code> - The type of Elastic Graphics
     *            accelerator; for example, <code>eg1.medium</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance to which the
     *            Elastic Graphics accelerator is associated.
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics
     * accelerator (<code>OK</code> | <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics
     * accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator;
     * for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic
     * Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone in
     *            which the Elastic Graphics accelerator resides.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-health</code> - The status of the Elastic
     *            Graphics accelerator (<code>OK</code> | <code>IMPAIRED</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-state</code> - The state of the Elastic
     *            Graphics accelerator (<code>ATTACHED</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-type</code> - The type of Elastic Graphics
     *            accelerator; for example, <code>eg1.medium</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance to which the
     *            Elastic Graphics accelerator is associated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics
     * accelerator (<code>OK</code> | <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics
     * accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator;
     * for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic
     * Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone in
     *            which the Elastic Graphics accelerator resides.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-health</code> - The status of the Elastic
     *            Graphics accelerator (<code>OK</code> | <code>IMPAIRED</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-state</code> - The state of the Elastic
     *            Graphics accelerator (<code>ATTACHED</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elastic-gpu-type</code> - The type of Elastic Graphics
     *            accelerator; for example, <code>eg1.medium</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance to which the
     *            Elastic Graphics accelerator is associated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value. This value can be between
     *         5 and 1000.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 5 and 1000.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 5 and 1000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusRequest withNextToken(String nextToken) {
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
        if (getElasticGpuIds() != null)
            sb.append("ElasticGpuIds: " + getElasticGpuIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getElasticGpuIds() == null) ? 0 : getElasticGpuIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticGpusRequest == false)
            return false;
        DescribeElasticGpusRequest other = (DescribeElasticGpusRequest) obj;

        if (other.getElasticGpuIds() == null ^ this.getElasticGpuIds() == null)
            return false;
        if (other.getElasticGpuIds() != null
                && other.getElasticGpuIds().equals(this.getElasticGpuIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
        return true;
    }
}
