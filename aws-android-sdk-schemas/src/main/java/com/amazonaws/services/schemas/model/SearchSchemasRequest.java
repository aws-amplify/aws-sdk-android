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
 * Search the schemas
 * </p>
 */
public class SearchSchemasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifying this limits the results to only schemas that include the
     * provided keywords.
     * </p>
     */
    private String keywords;

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
     * The name of the registry.
     * </p>
     */
    private String registryName;

    /**
     * <p>
     * Specifying this limits the results to only schemas that include the
     * provided keywords.
     * </p>
     *
     * @return <p>
     *         Specifying this limits the results to only schemas that include
     *         the provided keywords.
     *         </p>
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * Specifying this limits the results to only schemas that include the
     * provided keywords.
     * </p>
     *
     * @param keywords <p>
     *            Specifying this limits the results to only schemas that
     *            include the provided keywords.
     *            </p>
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * <p>
     * Specifying this limits the results to only schemas that include the
     * provided keywords.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keywords <p>
     *            Specifying this limits the results to only schemas that
     *            include the provided keywords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSchemasRequest withKeywords(String keywords) {
        this.keywords = keywords;
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
    public SearchSchemasRequest withLimit(Integer limit) {
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
    public SearchSchemasRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     *
     * @return <p>
     *         The name of the registry.
     *         </p>
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     *
     * @param registryName <p>
     *            The name of the registry.
     *            </p>
     */
    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryName <p>
     *            The name of the registry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSchemasRequest withRegistryName(String registryName) {
        this.registryName = registryName;
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
        if (getKeywords() != null)
            sb.append("Keywords: " + getKeywords() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getRegistryName() != null)
            sb.append("RegistryName: " + getRegistryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSchemasRequest == false)
            return false;
        SearchSchemasRequest other = (SearchSchemasRequest) obj;

        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
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
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null
                && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        return true;
    }
}
