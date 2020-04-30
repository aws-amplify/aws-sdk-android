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
 * List the registries.
 * </p>
 */
public class ListRegistriesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Specifying this limits the results to only those registry names that
     * start with the specified prefix.
     * </p>
     */
    private String registryNamePrefix;

    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries,
     * or the ones provided by AWS.
     * </p>
     */
    private String scope;

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
    public ListRegistriesRequest withLimit(Integer limit) {
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
    public ListRegistriesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifying this limits the results to only those registry names that
     * start with the specified prefix.
     * </p>
     *
     * @return <p>
     *         Specifying this limits the results to only those registry names
     *         that start with the specified prefix.
     *         </p>
     */
    public String getRegistryNamePrefix() {
        return registryNamePrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those registry names that
     * start with the specified prefix.
     * </p>
     *
     * @param registryNamePrefix <p>
     *            Specifying this limits the results to only those registry
     *            names that start with the specified prefix.
     *            </p>
     */
    public void setRegistryNamePrefix(String registryNamePrefix) {
        this.registryNamePrefix = registryNamePrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those registry names that
     * start with the specified prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryNamePrefix <p>
     *            Specifying this limits the results to only those registry
     *            names that start with the specified prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegistriesRequest withRegistryNamePrefix(String registryNamePrefix) {
        this.registryNamePrefix = registryNamePrefix;
        return this;
    }

    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries,
     * or the ones provided by AWS.
     * </p>
     *
     * @return <p>
     *         Can be set to Local or AWS to limit responses to your custom
     *         registries, or the ones provided by AWS.
     *         </p>
     */
    public String getScope() {
        return scope;
    }

    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries,
     * or the ones provided by AWS.
     * </p>
     *
     * @param scope <p>
     *            Can be set to Local or AWS to limit responses to your custom
     *            registries, or the ones provided by AWS.
     *            </p>
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries,
     * or the ones provided by AWS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scope <p>
     *            Can be set to Local or AWS to limit responses to your custom
     *            registries, or the ones provided by AWS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegistriesRequest withScope(String scope) {
        this.scope = scope;
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getRegistryNamePrefix() != null)
            sb.append("RegistryNamePrefix: " + getRegistryNamePrefix() + ",");
        if (getScope() != null)
            sb.append("Scope: " + getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getRegistryNamePrefix() == null) ? 0 : getRegistryNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegistriesRequest == false)
            return false;
        ListRegistriesRequest other = (ListRegistriesRequest) obj;

        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegistryNamePrefix() == null ^ this.getRegistryNamePrefix() == null)
            return false;
        if (other.getRegistryNamePrefix() != null
                && other.getRegistryNamePrefix().equals(this.getRegistryNamePrefix()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }
}
