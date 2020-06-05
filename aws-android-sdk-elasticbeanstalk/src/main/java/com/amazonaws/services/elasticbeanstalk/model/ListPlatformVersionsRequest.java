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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the platform versions available for your account in an AWS Region.
 * Provides summary information about each platform version. Compare to
 * <a>DescribePlatformVersion</a>, which provides full details about a single
 * platform version.
 * </p>
 * <p>
 * For definitions of platform version and other platform-related terms, see <a
 * href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
 * >AWS Elastic Beanstalk Platforms Glossary</a>.
 * </p>
 */
public class ListPlatformVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Criteria for restricting the resulting list of platform versions. The
     * filter is interpreted as a logical conjunction (AND) of the separate
     * <code>PlatformFilter</code> terms.
     * </p>
     */
    private java.util.List<PlatformFilter> filters;

    /**
     * <p>
     * The maximum number of platform version values returned in one call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxRecords;

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Criteria for restricting the resulting list of platform versions. The
     * filter is interpreted as a logical conjunction (AND) of the separate
     * <code>PlatformFilter</code> terms.
     * </p>
     *
     * @return <p>
     *         Criteria for restricting the resulting list of platform versions.
     *         The filter is interpreted as a logical conjunction (AND) of the
     *         separate <code>PlatformFilter</code> terms.
     *         </p>
     */
    public java.util.List<PlatformFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform versions. The
     * filter is interpreted as a logical conjunction (AND) of the separate
     * <code>PlatformFilter</code> terms.
     * </p>
     *
     * @param filters <p>
     *            Criteria for restricting the resulting list of platform
     *            versions. The filter is interpreted as a logical conjunction
     *            (AND) of the separate <code>PlatformFilter</code> terms.
     *            </p>
     */
    public void setFilters(java.util.Collection<PlatformFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<PlatformFilter>(filters);
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform versions. The
     * filter is interpreted as a logical conjunction (AND) of the separate
     * <code>PlatformFilter</code> terms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Criteria for restricting the resulting list of platform
     *            versions. The filter is interpreted as a logical conjunction
     *            (AND) of the separate <code>PlatformFilter</code> terms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformVersionsRequest withFilters(PlatformFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<PlatformFilter>(filters.length);
        }
        for (PlatformFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform versions. The
     * filter is interpreted as a logical conjunction (AND) of the separate
     * <code>PlatformFilter</code> terms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Criteria for restricting the resulting list of platform
     *            versions. The filter is interpreted as a logical conjunction
     *            (AND) of the separate <code>PlatformFilter</code> terms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformVersionsRequest withFilters(java.util.Collection<PlatformFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of platform version values returned in one call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of platform version values returned in one
     *         call.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform version values returned in one call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRecords <p>
     *            The maximum number of platform version values returned in one
     *            call.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform version values returned in one call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRecords <p>
     *            The maximum number of platform version values returned in one
     *            call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformVersionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     *
     * @return <p>
     *         For a paginated request. Specify a token from a previous response
     *         page to retrieve the next response page. All other parameter
     *         values must be identical to the ones specified in the initial
     *         request.
     *         </p>
     *         <p>
     *         If no <code>NextToken</code> is specified, the first page is
     *         retrieved.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     *
     * @param nextToken <p>
     *            For a paginated request. Specify a token from a previous
     *            response page to retrieve the next response page. All other
     *            parameter values must be identical to the ones specified in
     *            the initial request.
     *            </p>
     *            <p>
     *            If no <code>NextToken</code> is specified, the first page is
     *            retrieved.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            For a paginated request. Specify a token from a previous
     *            response page to retrieve the next response page. All other
     *            parameter values must be identical to the ones specified in
     *            the initial request.
     *            </p>
     *            <p>
     *            If no <code>NextToken</code> is specified, the first page is
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformVersionsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlatformVersionsRequest == false)
            return false;
        ListPlatformVersionsRequest other = (ListPlatformVersionsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
