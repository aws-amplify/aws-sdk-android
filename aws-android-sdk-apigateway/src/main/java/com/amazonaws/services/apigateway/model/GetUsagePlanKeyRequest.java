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
 * Gets a usage plan key of a given key identifier.
 * </p>
 */
public class GetUsagePlanKeyRequest extends AmazonWebServiceRequest implements Serializable {
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
     * [Required] The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     */
    private String keyId;

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
    public GetUsagePlanKeyRequest withUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
        return this;
    }

    /**
     * <p>
     * [Required] The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     *
     * @return <p>
     *         [Required] The key Id of the to-be-retrieved <a>UsagePlanKey</a>
     *         resource representing a plan customer.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * [Required] The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     *
     * @param keyId <p>
     *            [Required] The key Id of the to-be-retrieved
     *            <a>UsagePlanKey</a> resource representing a plan customer.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * [Required] The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyId <p>
     *            [Required] The key Id of the to-be-retrieved
     *            <a>UsagePlanKey</a> resource representing a plan customer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsagePlanKeyRequest withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getKeyId() != null)
            sb.append("keyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsagePlanKeyRequest == false)
            return false;
        GetUsagePlanKeyRequest other = (GetUsagePlanKeyRequest) obj;

        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null
                && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
