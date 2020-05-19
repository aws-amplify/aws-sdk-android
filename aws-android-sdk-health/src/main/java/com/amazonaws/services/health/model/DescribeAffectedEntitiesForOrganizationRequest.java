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

package com.amazonaws.services.health.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of entities that have been affected by one or more events for
 * one or more accounts in your organization in AWS Organizations, based on the
 * filter criteria. Entities can refer to individual customer resources, groups
 * of customer resources, or any other construct, depending on the AWS service.
 * </p>
 * <p>
 * At least one event ARN and account ID are required. Results are sorted by the
 * <code>lastUpdatedTime</code> of the entity, starting with the most recent.
 * </p>
 * <p>
 * Before you can call this operation, you must first enable AWS Health to work
 * with AWS Organizations. To do this, call the
 * <a>EnableHealthServiceAccessForOrganization</a> operation from your
 * organization's master account.
 * </p>
 */
public class DescribeAffectedEntitiesForOrganizationRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and the
     * <code>eventArn</code>.
     * </p>
     */
    private java.util.List<EventAccountFilter> organizationEntityFilters;

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     */
    private String locale;

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and the
     * <code>eventArn</code>.
     * </p>
     *
     * @return <p>
     *         A JSON set of elements including the <code>awsAccountId</code>
     *         and the <code>eventArn</code>.
     *         </p>
     */
    public java.util.List<EventAccountFilter> getOrganizationEntityFilters() {
        return organizationEntityFilters;
    }

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and the
     * <code>eventArn</code>.
     * </p>
     *
     * @param organizationEntityFilters <p>
     *            A JSON set of elements including the <code>awsAccountId</code>
     *            and the <code>eventArn</code>.
     *            </p>
     */
    public void setOrganizationEntityFilters(
            java.util.Collection<EventAccountFilter> organizationEntityFilters) {
        if (organizationEntityFilters == null) {
            this.organizationEntityFilters = null;
            return;
        }

        this.organizationEntityFilters = new java.util.ArrayList<EventAccountFilter>(
                organizationEntityFilters);
    }

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and the
     * <code>eventArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationEntityFilters <p>
     *            A JSON set of elements including the <code>awsAccountId</code>
     *            and the <code>eventArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedEntitiesForOrganizationRequest withOrganizationEntityFilters(
            EventAccountFilter... organizationEntityFilters) {
        if (getOrganizationEntityFilters() == null) {
            this.organizationEntityFilters = new java.util.ArrayList<EventAccountFilter>(
                    organizationEntityFilters.length);
        }
        for (EventAccountFilter value : organizationEntityFilters) {
            this.organizationEntityFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and the
     * <code>eventArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationEntityFilters <p>
     *            A JSON set of elements including the <code>awsAccountId</code>
     *            and the <code>eventArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedEntitiesForOrganizationRequest withOrganizationEntityFilters(
            java.util.Collection<EventAccountFilter> organizationEntityFilters) {
        setOrganizationEntityFilters(organizationEntityFilters);
        return this;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @return <p>
     *         The locale (language) to return information in. English (en) is
     *         the default and the only supported value at this time.
     *         </p>
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @param locale <p>
     *            The locale (language) to return information in. English (en)
     *            is the default and the only supported value at this time.
     *            </p>
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @param locale <p>
     *            The locale (language) to return information in. English (en)
     *            is the default and the only supported value at this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedEntitiesForOrganizationRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @return <p>
     *         If the results of a search are large, only a portion of the
     *         results are returned, and a <code>nextToken</code> pagination
     *         token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned
     *         token. When all results have been returned, the response does not
     *         contain a pagination token value.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedEntitiesForOrganizationRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @return <p>
     *         The maximum number of items to return in one batch, between 10
     *         and 100, inclusive.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in one batch, between 10
     *            and 100, inclusive.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in one batch, between 10
     *            and 100, inclusive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedEntitiesForOrganizationRequest withMaxResults(Integer maxResults) {
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
        if (getOrganizationEntityFilters() != null)
            sb.append("organizationEntityFilters: " + getOrganizationEntityFilters() + ",");
        if (getLocale() != null)
            sb.append("locale: " + getLocale() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOrganizationEntityFilters() == null) ? 0 : getOrganizationEntityFilters()
                        .hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
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

        if (obj instanceof DescribeAffectedEntitiesForOrganizationRequest == false)
            return false;
        DescribeAffectedEntitiesForOrganizationRequest other = (DescribeAffectedEntitiesForOrganizationRequest) obj;

        if (other.getOrganizationEntityFilters() == null
                ^ this.getOrganizationEntityFilters() == null)
            return false;
        if (other.getOrganizationEntityFilters() != null
                && other.getOrganizationEntityFilters().equals(this.getOrganizationEntityFilters()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
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
