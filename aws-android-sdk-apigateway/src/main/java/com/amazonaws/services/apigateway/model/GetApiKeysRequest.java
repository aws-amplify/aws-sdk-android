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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about the current <a>ApiKeys</a> resource.
 * </p>
 */
public class GetApiKeysRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     */
    private String position;

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The name of queried API keys.
     * </p>
     */
    private String nameQuery;

    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system,
     * such as a developer portal.
     * </p>
     */
    private String customerId;

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (
     * <code>false</code>) the result contains key values.
     * </p>
     */
    private Boolean includeValues;

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     *
     * @return <p>
     *         The current pagination position in the paged result set.
     *         </p>
     */
    public String getPosition() {
        return position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     *
     * @param position <p>
     *            The current pagination position in the paged result set.
     *            </p>
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The current pagination position in the paged result set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApiKeysRequest withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     *
     * @return <p>
     *         The maximum number of returned results per page. The default
     *         value is 25 and the maximum value is 500.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     *
     * @param limit <p>
     *            The maximum number of returned results per page. The default
     *            value is 25 and the maximum value is 500.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limit <p>
     *            The maximum number of returned results per page. The default
     *            value is 25 and the maximum value is 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApiKeysRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The name of queried API keys.
     * </p>
     *
     * @return <p>
     *         The name of queried API keys.
     *         </p>
     */
    public String getNameQuery() {
        return nameQuery;
    }

    /**
     * <p>
     * The name of queried API keys.
     * </p>
     *
     * @param nameQuery <p>
     *            The name of queried API keys.
     *            </p>
     */
    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    /**
     * <p>
     * The name of queried API keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameQuery <p>
     *            The name of queried API keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApiKeysRequest withNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
        return this;
    }

    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system,
     * such as a developer portal.
     * </p>
     *
     * @return <p>
     *         The identifier of a customer in AWS Marketplace or an external
     *         system, such as a developer portal.
     *         </p>
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system,
     * such as a developer portal.
     * </p>
     *
     * @param customerId <p>
     *            The identifier of a customer in AWS Marketplace or an external
     *            system, such as a developer portal.
     *            </p>
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system,
     * such as a developer portal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerId <p>
     *            The identifier of a customer in AWS Marketplace or an external
     *            system, such as a developer portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApiKeysRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (
     * <code>false</code>) the result contains key values.
     * </p>
     *
     * @return <p>
     *         A boolean flag to specify whether (<code>true</code>) or not (
     *         <code>false</code>) the result contains key values.
     *         </p>
     */
    public Boolean isIncludeValues() {
        return includeValues;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (
     * <code>false</code>) the result contains key values.
     * </p>
     *
     * @return <p>
     *         A boolean flag to specify whether (<code>true</code>) or not (
     *         <code>false</code>) the result contains key values.
     *         </p>
     */
    public Boolean getIncludeValues() {
        return includeValues;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (
     * <code>false</code>) the result contains key values.
     * </p>
     *
     * @param includeValues <p>
     *            A boolean flag to specify whether (<code>true</code>) or not (
     *            <code>false</code>) the result contains key values.
     *            </p>
     */
    public void setIncludeValues(Boolean includeValues) {
        this.includeValues = includeValues;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (
     * <code>false</code>) the result contains key values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeValues <p>
     *            A boolean flag to specify whether (<code>true</code>) or not (
     *            <code>false</code>) the result contains key values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApiKeysRequest withIncludeValues(Boolean includeValues) {
        this.includeValues = includeValues;
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
        if (getPosition() != null)
            sb.append("position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit() + ",");
        if (getNameQuery() != null)
            sb.append("nameQuery: " + getNameQuery() + ",");
        if (getCustomerId() != null)
            sb.append("customerId: " + getCustomerId() + ",");
        if (getIncludeValues() != null)
            sb.append("includeValues: " + getIncludeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNameQuery() == null) ? 0 : getNameQuery().hashCode());
        hashCode = prime * hashCode + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeValues() == null) ? 0 : getIncludeValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApiKeysRequest == false)
            return false;
        GetApiKeysRequest other = (GetApiKeysRequest) obj;

        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNameQuery() == null ^ this.getNameQuery() == null)
            return false;
        if (other.getNameQuery() != null
                && other.getNameQuery().equals(this.getNameQuery()) == false)
            return false;
        if (other.getCustomerId() == null ^ this.getCustomerId() == null)
            return false;
        if (other.getCustomerId() != null
                && other.getCustomerId().equals(this.getCustomerId()) == false)
            return false;
        if (other.getIncludeValues() == null ^ this.getIncludeValues() == null)
            return false;
        if (other.getIncludeValues() != null
                && other.getIncludeValues().equals(this.getIncludeValues()) == false)
            return false;
        return true;
    }
}
