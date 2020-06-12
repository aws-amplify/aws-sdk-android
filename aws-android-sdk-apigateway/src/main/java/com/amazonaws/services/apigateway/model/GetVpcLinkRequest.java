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
 * Gets a specified VPC link under the caller's account in a region.
 * </p>
 */
public class GetVpcLinkRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an
     * <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     */
    private String vpcLinkId;

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an
     * <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     *
     * @return <p>
     *         [Required] The identifier of the <a>VpcLink</a>. It is used in an
     *         <a>Integration</a> to reference this <a>VpcLink</a>.
     *         </p>
     */
    public String getVpcLinkId() {
        return vpcLinkId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an
     * <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     *
     * @param vpcLinkId <p>
     *            [Required] The identifier of the <a>VpcLink</a>. It is used in
     *            an <a>Integration</a> to reference this <a>VpcLink</a>.
     *            </p>
     */
    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an
     * <a>Integration</a> to reference this <a>VpcLink</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcLinkId <p>
     *            [Required] The identifier of the <a>VpcLink</a>. It is used in
     *            an <a>Integration</a> to reference this <a>VpcLink</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVpcLinkRequest withVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
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
        if (getVpcLinkId() != null)
            sb.append("vpcLinkId: " + getVpcLinkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVpcLinkRequest == false)
            return false;
        GetVpcLinkRequest other = (GetVpcLinkRequest) obj;

        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null
                && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
            return false;
        return true;
    }
}
