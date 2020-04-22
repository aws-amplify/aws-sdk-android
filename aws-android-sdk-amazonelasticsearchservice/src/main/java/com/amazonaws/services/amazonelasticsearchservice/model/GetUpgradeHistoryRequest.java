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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the complete history of the last 10 upgrades that were performed on
 * the domain.
 * </p>
 */
public class GetUpgradeHistoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * Set this value to limit the number of results returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         The name of an Elasticsearch domain. Domain names are unique
     *         across the domains owned by an account within an AWS region.
     *         Domain names start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen).
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUpgradeHistoryRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         Set this value to limit the number of results returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUpgradeHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     *
     * @return <p>
     *         Paginated APIs accepts NextToken input to returns next page
     *         results and provides a NextToken output in the response which can
     *         be used by the client to retrieve more results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     *
     * @param nextToken <p>
     *            Paginated APIs accepts NextToken input to returns next page
     *            results and provides a NextToken output in the response which
     *            can be used by the client to retrieve more results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Paginated APIs accepts NextToken input to returns next page
     *            results and provides a NextToken output in the response which
     *            can be used by the client to retrieve more results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUpgradeHistoryRequest withNextToken(String nextToken) {
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
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

        if (obj instanceof GetUpgradeHistoryRequest == false)
            return false;
        GetUpgradeHistoryRequest other = (GetUpgradeHistoryRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
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
