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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List the discoverers.
 * </p>
 */
public class ListDiscoverersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that
     * start with the specified prefix.
     * </p>
     */
    private String discovererIdPrefix;

    /**
     * The new value for the limit property for this object.
     */
    private Integer limit;

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the
     * specified prefix.
     * </p>
     */
    private String sourceArnPrefix;

    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that
     * start with the specified prefix.
     * </p>
     *
     * @return <p>
     *         Specifying this limits the results to only those discoverer IDs
     *         that start with the specified prefix.
     *         </p>
     */
    public String getDiscovererIdPrefix() {
        return discovererIdPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that
     * start with the specified prefix.
     * </p>
     *
     * @param discovererIdPrefix <p>
     *            Specifying this limits the results to only those discoverer
     *            IDs that start with the specified prefix.
     *            </p>
     */
    public void setDiscovererIdPrefix(String discovererIdPrefix) {
        this.discovererIdPrefix = discovererIdPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that
     * start with the specified prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discovererIdPrefix <p>
     *            Specifying this limits the results to only those discoverer
     *            IDs that start with the specified prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoverersRequest withDiscovererIdPrefix(String discovererIdPrefix) {
        this.discovererIdPrefix = discovererIdPrefix;
        return this;
    }

    /**
     * Returns the value of the limit property for this object.
     *
     * @return The value of the limit property for this object.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of limit
     *
     * @param limit The new value for the limit property for this object.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Sets the value of the limit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limit The new value for the limit property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoverersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @return <p>
     *         The token that specifies the next page of results to return. To
     *         request the first page, leave NextToken empty. The token will
     *         expire in 24 hours, and cannot be shared with other accounts.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoverersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the
     * specified prefix.
     * </p>
     *
     * @return <p>
     *         Specifying this limits the results to only those ARNs that start
     *         with the specified prefix.
     *         </p>
     */
    public String getSourceArnPrefix() {
        return sourceArnPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the
     * specified prefix.
     * </p>
     *
     * @param sourceArnPrefix <p>
     *            Specifying this limits the results to only those ARNs that
     *            start with the specified prefix.
     *            </p>
     */
    public void setSourceArnPrefix(String sourceArnPrefix) {
        this.sourceArnPrefix = sourceArnPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the
     * specified prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceArnPrefix <p>
     *            Specifying this limits the results to only those ARNs that
     *            start with the specified prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoverersRequest withSourceArnPrefix(String sourceArnPrefix) {
        this.sourceArnPrefix = sourceArnPrefix;
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
        if (getDiscovererIdPrefix() != null)
            sb.append("DiscovererIdPrefix: " + getDiscovererIdPrefix() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSourceArnPrefix() != null)
            sb.append("SourceArnPrefix: " + getSourceArnPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDiscovererIdPrefix() == null) ? 0 : getDiscovererIdPrefix().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getSourceArnPrefix() == null) ? 0 : getSourceArnPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDiscoverersRequest == false)
            return false;
        ListDiscoverersRequest other = (ListDiscoverersRequest) obj;

        if (other.getDiscovererIdPrefix() == null ^ this.getDiscovererIdPrefix() == null)
            return false;
        if (other.getDiscovererIdPrefix() != null
                && other.getDiscovererIdPrefix().equals(this.getDiscovererIdPrefix()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSourceArnPrefix() == null ^ this.getSourceArnPrefix() == null)
            return false;
        if (other.getSourceArnPrefix() != null
                && other.getSourceArnPrefix().equals(this.getSourceArnPrefix()) == false)
            return false;
        return true;
    }
}
