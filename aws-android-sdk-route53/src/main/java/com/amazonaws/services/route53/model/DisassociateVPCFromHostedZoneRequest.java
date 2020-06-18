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
 * Disassociates an Amazon Virtual Private Cloud (Amazon VPC) from an Amazon
 * Route 53 private hosted zone. Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can't disassociate the last Amazon VPC from a private hosted zone.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can't convert a private hosted zone into a public hosted zone.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can submit a <code>DisassociateVPCFromHostedZone</code> request using
 * either the account that created the hosted zone or the account that created
 * the Amazon VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Some services, such as AWS Cloud Map and Amazon Elastic File System (Amazon
 * EFS) automatically create hosted zones and associate VPCs with the hosted
 * zones. A service can create a hosted zone using your account or using its own
 * account. You can disassociate a VPC from a hosted zone only if the service
 * created the hosted zone using your account.
 * </p>
 * <p>
 * When you run <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListHostedZonesByVPC.html"
 * >DisassociateVPCFromHostedZone</a>, if the hosted zone has a value for
 * <code>OwningAccount</code>, you can use
 * <code>DisassociateVPCFromHostedZone</code>. If the hosted zone has a value
 * for <code>OwningService</code>, you can't use
 * <code>DisassociateVPCFromHostedZone</code>.
 * </p>
 * </li>
 * </ul>
 */
public class DisassociateVPCFromHostedZoneRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the private hosted zone that you want to disassociate a VPC
     * from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * A complex type that contains information about the VPC that you're
     * disassociating from the specified hosted zone.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * <i>Optional:</i> A comment about the disassociation request.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID of the private hosted zone that you want to disassociate a VPC
     * from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the private hosted zone that you want to disassociate a
     *         VPC from.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to disassociate a VPC
     * from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the private hosted zone that you want to
     *            disassociate a VPC from.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to disassociate a VPC
     * from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the private hosted zone that you want to
     *            disassociate a VPC from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateVPCFromHostedZoneRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you're
     * disassociating from the specified hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the VPC that
     *         you're disassociating from the specified hosted zone.
     *         </p>
     */
    public VPC getVPC() {
        return vPC;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you're
     * disassociating from the specified hosted zone.
     * </p>
     *
     * @param vPC <p>
     *            A complex type that contains information about the VPC that
     *            you're disassociating from the specified hosted zone.
     *            </p>
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you're
     * disassociating from the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPC <p>
     *            A complex type that contains information about the VPC that
     *            you're disassociating from the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateVPCFromHostedZoneRequest withVPC(VPC vPC) {
        this.vPC = vPC;
        return this;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the disassociation request.
     * </p>
     *
     * @return <p>
     *         <i>Optional:</i> A comment about the disassociation request.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the disassociation request.
     * </p>
     *
     * @param comment <p>
     *            <i>Optional:</i> A comment about the disassociation request.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the disassociation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            <i>Optional:</i> A comment about the disassociation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateVPCFromHostedZoneRequest withComment(String comment) {
        this.comment = comment;
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
            sb.append("VPC: " + getVPC() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
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
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateVPCFromHostedZoneRequest == false)
            return false;
        DisassociateVPCFromHostedZoneRequest other = (DisassociateVPCFromHostedZoneRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
