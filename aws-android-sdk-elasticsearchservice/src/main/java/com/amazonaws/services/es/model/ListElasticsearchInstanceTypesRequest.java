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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List all Elasticsearch instance types that are supported for given
 * ElasticsearchVersion
 * </p>
 */
public class ListElasticsearchInstanceTypesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch
     * instance types are needed.
     * </p>
     */
    private String elasticsearchVersion;

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for list of
     * available Elasticsearch instance types when modifying existing domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided
     * must be greater than 30 else it wont be honored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch
     * instance types are needed.
     * </p>
     *
     * @return <p>
     *         Version of Elasticsearch for which list of supported
     *         elasticsearch instance types are needed.
     *         </p>
     */
    public String getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch
     * instance types are needed.
     * </p>
     *
     * @param elasticsearchVersion <p>
     *            Version of Elasticsearch for which list of supported
     *            elasticsearch instance types are needed.
     *            </p>
     */
    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch
     * instance types are needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchVersion <p>
     *            Version of Elasticsearch for which list of supported
     *            elasticsearch instance types are needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchInstanceTypesRequest withElasticsearchVersion(
            String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
        return this;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for list of
     * available Elasticsearch instance types when modifying existing domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         DomainName represents the name of the Domain that we are trying
     *         to modify. This should be present only if we are querying for
     *         list of available Elasticsearch instance types when modifying
     *         existing domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for list of
     * available Elasticsearch instance types when modifying existing domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            DomainName represents the name of the Domain that we are
     *            trying to modify. This should be present only if we are
     *            querying for list of available Elasticsearch instance types
     *            when modifying existing domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for list of
     * available Elasticsearch instance types when modifying existing domain.
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
     *            DomainName represents the name of the Domain that we are
     *            trying to modify. This should be present only if we are
     *            querying for list of available Elasticsearch instance types
     *            when modifying existing domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchInstanceTypesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided
     * must be greater than 30 else it wont be honored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         Set this value to limit the number of results returned. Value
     *         provided must be greater than 30 else it wont be honored.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided
     * must be greater than 30 else it wont be honored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned. Value
     *            provided must be greater than 30 else it wont be honored.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided
     * must be greater than 30 else it wont be honored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned. Value
     *            provided must be greater than 30 else it wont be honored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchInstanceTypesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     *
     * @return <p>
     *         NextToken should be sent in case if earlier API call produced
     *         result containing NextToken. It is used for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     *
     * @param nextToken <p>
     *            NextToken should be sent in case if earlier API call produced
     *            result containing NextToken. It is used for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            NextToken should be sent in case if earlier API call produced
     *            result containing NextToken. It is used for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchInstanceTypesRequest withNextToken(String nextToken) {
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
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: " + getElasticsearchVersion() + ",");
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

        hashCode = prime * hashCode
                + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
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

        if (obj instanceof ListElasticsearchInstanceTypesRequest == false)
            return false;
        ListElasticsearchInstanceTypesRequest other = (ListElasticsearchInstanceTypesRequest) obj;

        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null
                && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
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
