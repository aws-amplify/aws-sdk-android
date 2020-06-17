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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the maximum number of hosted zones that you can associate with the
 * specified reusable delegation set.
 * </p>
 * <p>
 * For the default limit, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html"
 * >Limits</a> in the <i>Amazon Route 53 Developer Guide</i>. To request a
 * higher limit, <a href=
 * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
 * >open a case</a>.
 * </p>
 */
public class GetReusableDelegationSetLimitRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the
     * maximum number of hosted zones that you can associate with the specified
     * reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_ZONES_BY_REUSABLE_DELEGATION_SET
     */
    private String type;

    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String delegationSetId;

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the
     * maximum number of hosted zones that you can associate with the specified
     * reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_ZONES_BY_REUSABLE_DELEGATION_SET
     *
     * @return <p>
     *         Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get
     *         the maximum number of hosted zones that you can associate with
     *         the specified reusable delegation set.
     *         </p>
     * @see ReusableDelegationSetLimitType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the
     * maximum number of hosted zones that you can associate with the specified
     * reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_ZONES_BY_REUSABLE_DELEGATION_SET
     *
     * @param type <p>
     *            Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to
     *            get the maximum number of hosted zones that you can associate
     *            with the specified reusable delegation set.
     *            </p>
     * @see ReusableDelegationSetLimitType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the
     * maximum number of hosted zones that you can associate with the specified
     * reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_ZONES_BY_REUSABLE_DELEGATION_SET
     *
     * @param type <p>
     *            Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to
     *            get the maximum number of hosted zones that you can associate
     *            with the specified reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReusableDelegationSetLimitType
     */
    public GetReusableDelegationSetLimitRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the
     * maximum number of hosted zones that you can associate with the specified
     * reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_ZONES_BY_REUSABLE_DELEGATION_SET
     *
     * @param type <p>
     *            Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to
     *            get the maximum number of hosted zones that you can associate
     *            with the specified reusable delegation set.
     *            </p>
     * @see ReusableDelegationSetLimitType
     */
    public void setType(ReusableDelegationSetLimitType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to get the
     * maximum number of hosted zones that you can associate with the specified
     * reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_ZONES_BY_REUSABLE_DELEGATION_SET
     *
     * @param type <p>
     *            Specify <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> to
     *            get the maximum number of hosted zones that you can associate
     *            with the specified reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReusableDelegationSetLimitType
     */
    public GetReusableDelegationSetLimitRequest withType(ReusableDelegationSetLimitType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the delegation set that you want to get the limit for.
     *         </p>
     */
    public String getDelegationSetId() {
        return delegationSetId;
    }

    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param delegationSetId <p>
     *            The ID of the delegation set that you want to get the limit
     *            for.
     *            </p>
     */
    public void setDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
    }

    /**
     * <p>
     * The ID of the delegation set that you want to get the limit for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param delegationSetId <p>
     *            The ID of the delegation set that you want to get the limit
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReusableDelegationSetLimitRequest withDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDelegationSetId() != null)
            sb.append("DelegationSetId: " + getDelegationSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDelegationSetId() == null) ? 0 : getDelegationSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReusableDelegationSetLimitRequest == false)
            return false;
        GetReusableDelegationSetLimitRequest other = (GetReusableDelegationSetLimitRequest) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDelegationSetId() == null ^ this.getDelegationSetId() == null)
            return false;
        if (other.getDelegationSetId() != null
                && other.getDelegationSetId().equals(this.getDelegationSetId()) == false)
            return false;
        return true;
    }
}
