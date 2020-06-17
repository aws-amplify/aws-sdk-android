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
 * Authorizes the AWS account that created a specified VPC to submit an
 * <code>AssociateVPCWithHostedZone</code> request to associate the VPC with a
 * specified hosted zone that was created by a different account. To submit a
 * <code>CreateVPCAssociationAuthorization</code> request, you must use the
 * account that created the hosted zone. After you authorize the association,
 * use the account that created the VPC to submit an
 * <code>AssociateVPCWithHostedZone</code> request.
 * </p>
 * <note>
 * <p>
 * If you want to associate multiple VPCs that you created by using one account
 * with a hosted zone that you created by using a different account, you must
 * submit one authorization request for each VPC.
 * </p>
 * </note>
 */
public class CreateVPCAssociationAuthorizationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the private hosted zone that you want to authorize associating
     * a VPC with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * A complex type that contains the VPC ID and region for the VPC that you
     * want to authorize associating with your hosted zone.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * The ID of the private hosted zone that you want to authorize associating
     * a VPC with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the private hosted zone that you want to authorize
     *         associating a VPC with.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to authorize associating
     * a VPC with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the private hosted zone that you want to authorize
     *            associating a VPC with.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to authorize associating
     * a VPC with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the private hosted zone that you want to authorize
     *            associating a VPC with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVPCAssociationAuthorizationRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * A complex type that contains the VPC ID and region for the VPC that you
     * want to authorize associating with your hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the VPC ID and region for the VPC
     *         that you want to authorize associating with your hosted zone.
     *         </p>
     */
    public VPC getVPC() {
        return vPC;
    }

    /**
     * <p>
     * A complex type that contains the VPC ID and region for the VPC that you
     * want to authorize associating with your hosted zone.
     * </p>
     *
     * @param vPC <p>
     *            A complex type that contains the VPC ID and region for the VPC
     *            that you want to authorize associating with your hosted zone.
     *            </p>
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * A complex type that contains the VPC ID and region for the VPC that you
     * want to authorize associating with your hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPC <p>
     *            A complex type that contains the VPC ID and region for the VPC
     *            that you want to authorize associating with your hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVPCAssociationAuthorizationRequest withVPC(VPC vPC) {
        this.vPC = vPC;
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getVPC() != null)
            sb.append("VPC: " + getVPC());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVPCAssociationAuthorizationRequest == false)
            return false;
        CreateVPCAssociationAuthorizationRequest other = (CreateVPCAssociationAuthorizationRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        return true;
    }
}
