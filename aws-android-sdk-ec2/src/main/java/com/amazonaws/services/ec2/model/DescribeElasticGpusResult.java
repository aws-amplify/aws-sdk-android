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

public class DescribeElasticGpusResult implements Serializable {
    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     */
    private java.util.List<ElasticGpus> elasticGpuSet;

    /**
     * <p>
     * The total number of items to return. If the total number of items
     * available is more than the value specified in max-items then a Next-Token
     * will be provided in the output that you can use to resume pagination.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     *
     * @return <p>
     *         Information about the Elastic Graphics accelerators.
     *         </p>
     */
    public java.util.List<ElasticGpus> getElasticGpuSet() {
        return elasticGpuSet;
    }

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     *
     * @param elasticGpuSet <p>
     *            Information about the Elastic Graphics accelerators.
     *            </p>
     */
    public void setElasticGpuSet(java.util.Collection<ElasticGpus> elasticGpuSet) {
        if (elasticGpuSet == null) {
            this.elasticGpuSet = null;
            return;
        }

        this.elasticGpuSet = new java.util.ArrayList<ElasticGpus>(elasticGpuSet);
    }

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuSet <p>
     *            Information about the Elastic Graphics accelerators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusResult withElasticGpuSet(ElasticGpus... elasticGpuSet) {
        if (getElasticGpuSet() == null) {
            this.elasticGpuSet = new java.util.ArrayList<ElasticGpus>(elasticGpuSet.length);
        }
        for (ElasticGpus value : elasticGpuSet) {
            this.elasticGpuSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuSet <p>
     *            Information about the Elastic Graphics accelerators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusResult withElasticGpuSet(
            java.util.Collection<ElasticGpus> elasticGpuSet) {
        setElasticGpuSet(elasticGpuSet);
        return this;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of items
     * available is more than the value specified in max-items then a Next-Token
     * will be provided in the output that you can use to resume pagination.
     * </p>
     *
     * @return <p>
     *         The total number of items to return. If the total number of items
     *         available is more than the value specified in max-items then a
     *         Next-Token will be provided in the output that you can use to
     *         resume pagination.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of items
     * available is more than the value specified in max-items then a Next-Token
     * will be provided in the output that you can use to resume pagination.
     * </p>
     *
     * @param maxResults <p>
     *            The total number of items to return. If the total number of
     *            items available is more than the value specified in max-items
     *            then a Next-Token will be provided in the output that you can
     *            use to resume pagination.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of items
     * available is more than the value specified in max-items then a Next-Token
     * will be provided in the output that you can use to resume pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The total number of items to return. If the total number of
     *            items available is more than the value specified in max-items
     *            then a Next-Token will be provided in the output that you can
     *            use to resume pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusResult withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticGpusResult withNextToken(String nextToken) {
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
        if (getElasticGpuSet() != null)
            sb.append("ElasticGpuSet: " + getElasticGpuSet() + ",");
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
                + ((getElasticGpuSet() == null) ? 0 : getElasticGpuSet().hashCode());
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

        if (obj instanceof DescribeElasticGpusResult == false)
            return false;
        DescribeElasticGpusResult other = (DescribeElasticGpusResult) obj;

        if (other.getElasticGpuSet() == null ^ this.getElasticGpuSet() == null)
            return false;
        if (other.getElasticGpuSet() != null
                && other.getElasticGpuSet().equals(this.getElasticGpuSet()) == false)
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
