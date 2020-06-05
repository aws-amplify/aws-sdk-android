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
 * Gets all the usage plan keys representing the API keys added to a specified
 * usage plan.
 * </p>
 */
public class GetUsagePlanKeysRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage
     * plan containing the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     */
    private String usagePlanId;

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
     * A query parameter specifying the name of the to-be-returned usage plan
     * keys.
     * </p>
     */
    private String nameQuery;

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage
     * plan containing the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     *
     * @return <p>
     *         [Required] The Id of the <a>UsagePlan</a> resource representing
     *         the usage plan containing the to-be-retrieved <a>UsagePlanKey</a>
     *         resource representing a plan customer.
     *         </p>
     */
    public String getUsagePlanId() {
        return usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage
     * plan containing the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     *
     * @param usagePlanId <p>
     *            [Required] The Id of the <a>UsagePlan</a> resource
     *            representing the usage plan containing the to-be-retrieved
     *            <a>UsagePlanKey</a> resource representing a plan customer.
     *            </p>
     */
    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage
     * plan containing the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePlanId <p>
     *            [Required] The Id of the <a>UsagePlan</a> resource
     *            representing the usage plan containing the to-be-retrieved
     *            <a>UsagePlanKey</a> resource representing a plan customer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsagePlanKeysRequest withUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
        return this;
    }

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
    public GetUsagePlanKeysRequest withPosition(String position) {
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
    public GetUsagePlanKeysRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * A query parameter specifying the name of the to-be-returned usage plan
     * keys.
     * </p>
     *
     * @return <p>
     *         A query parameter specifying the name of the to-be-returned usage
     *         plan keys.
     *         </p>
     */
    public String getNameQuery() {
        return nameQuery;
    }

    /**
     * <p>
     * A query parameter specifying the name of the to-be-returned usage plan
     * keys.
     * </p>
     *
     * @param nameQuery <p>
     *            A query parameter specifying the name of the to-be-returned
     *            usage plan keys.
     *            </p>
     */
    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    /**
     * <p>
     * A query parameter specifying the name of the to-be-returned usage plan
     * keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameQuery <p>
     *            A query parameter specifying the name of the to-be-returned
     *            usage plan keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsagePlanKeysRequest withNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
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
        if (getUsagePlanId() != null)
            sb.append("usagePlanId: " + getUsagePlanId() + ",");
        if (getPosition() != null)
            sb.append("position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit() + ",");
        if (getNameQuery() != null)
            sb.append("nameQuery: " + getNameQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNameQuery() == null) ? 0 : getNameQuery().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsagePlanKeysRequest == false)
            return false;
        GetUsagePlanKeysRequest other = (GetUsagePlanKeysRequest) obj;

        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null
                && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
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
        return true;
    }
}
