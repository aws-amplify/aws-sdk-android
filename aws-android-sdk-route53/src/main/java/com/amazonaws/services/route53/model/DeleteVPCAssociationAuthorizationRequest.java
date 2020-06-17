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
 * Removes authorization to submit an <code>AssociateVPCWithHostedZone</code>
 * request to associate a specified VPC with a hosted zone that was created by a
 * different account. You must use the account that created the hosted zone to
 * submit a <code>DeleteVPCAssociationAuthorization</code> request.
 * </p>
 * <important>
 * <p>
 * Sending this request only prevents the AWS account that created the VPC from
 * associating the VPC with the Amazon Route 53 hosted zone in the future. If
 * the VPC is already associated with the hosted zone,
 * <code>DeleteVPCAssociationAuthorization</code> won't disassociate the VPC
 * from the hosted zone. If you want to delete an existing association, use
 * <code>DisassociateVPCFromHostedZone</code>.
 * </p>
 * </important>
 */
public class DeleteVPCAssociationAuthorizationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, the ID of the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, a complex type that includes the ID and region of the VPC.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, the ID of the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         When removing authorization to associate a VPC that was created
     *         by one AWS account with a hosted zone that was created with a
     *         different AWS account, the ID of the hosted zone.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, the ID of the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            When removing authorization to associate a VPC that was
     *            created by one AWS account with a hosted zone that was created
     *            with a different AWS account, the ID of the hosted zone.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, the ID of the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            When removing authorization to associate a VPC that was
     *            created by one AWS account with a hosted zone that was created
     *            with a different AWS account, the ID of the hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVPCAssociationAuthorizationRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, a complex type that includes the ID and region of the VPC.
     * </p>
     *
     * @return <p>
     *         When removing authorization to associate a VPC that was created
     *         by one AWS account with a hosted zone that was created with a
     *         different AWS account, a complex type that includes the ID and
     *         region of the VPC.
     *         </p>
     */
    public VPC getVPC() {
        return vPC;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, a complex type that includes the ID and region of the VPC.
     * </p>
     *
     * @param vPC <p>
     *            When removing authorization to associate a VPC that was
     *            created by one AWS account with a hosted zone that was created
     *            with a different AWS account, a complex type that includes the
     *            ID and region of the VPC.
     *            </p>
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one
     * AWS account with a hosted zone that was created with a different AWS
     * account, a complex type that includes the ID and region of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPC <p>
     *            When removing authorization to associate a VPC that was
     *            created by one AWS account with a hosted zone that was created
     *            with a different AWS account, a complex type that includes the
     *            ID and region of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVPCAssociationAuthorizationRequest withVPC(VPC vPC) {
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

        if (obj instanceof DeleteVPCAssociationAuthorizationRequest == false)
            return false;
        DeleteVPCAssociationAuthorizationRequest other = (DeleteVPCAssociationAuthorizationRequest) obj;

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
