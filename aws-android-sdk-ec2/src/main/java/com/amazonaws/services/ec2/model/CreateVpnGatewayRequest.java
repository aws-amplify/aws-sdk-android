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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a virtual private gateway. A virtual private gateway is the endpoint
 * on the VPC side of your VPN connection. You can create a virtual private
 * gateway before creating the VPC itself.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
 * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
 * </p>
 */
public class CreateVpnGatewayRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. If you're using a 16-bit ASN, it must be in the 64512 to 65534
     * range. If you're using a 32-bit ASN, it must be in the 4200000000 to
     * 4294967294 range.
     * </p>
     * <p>
     * Default: 64512
     * </p>
     */
    private Long amazonSideAsn;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The Availability Zone for the virtual private gateway.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the virtual private gateway.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnGatewayRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return <p>
     *         The type of VPN connection this virtual private gateway supports.
     *         </p>
     * @see GatewayType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection this virtual private gateway
     *            supports.
     *            </p>
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection this virtual private gateway
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public CreateVpnGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection this virtual private gateway
     *            supports.
     *            </p>
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of VPN connection this virtual private gateway supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection this virtual private gateway
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public CreateVpnGatewayRequest withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. If you're using a 16-bit ASN, it must be in the 64512 to 65534
     * range. If you're using a 32-bit ASN, it must be in the 4200000000 to
     * 4294967294 range.
     * </p>
     * <p>
     * Default: 64512
     * </p>
     *
     * @return <p>
     *         A private Autonomous System Number (ASN) for the Amazon side of a
     *         BGP session. If you're using a 16-bit ASN, it must be in the
     *         64512 to 65534 range. If you're using a 32-bit ASN, it must be in
     *         the 4200000000 to 4294967294 range.
     *         </p>
     *         <p>
     *         Default: 64512
     *         </p>
     */
    public Long getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. If you're using a 16-bit ASN, it must be in the 64512 to 65534
     * range. If you're using a 32-bit ASN, it must be in the 4200000000 to
     * 4294967294 range.
     * </p>
     * <p>
     * Default: 64512
     * </p>
     *
     * @param amazonSideAsn <p>
     *            A private Autonomous System Number (ASN) for the Amazon side
     *            of a BGP session. If you're using a 16-bit ASN, it must be in
     *            the 64512 to 65534 range. If you're using a 32-bit ASN, it
     *            must be in the 4200000000 to 4294967294 range.
     *            </p>
     *            <p>
     *            Default: 64512
     *            </p>
     */
    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP
     * session. If you're using a 16-bit ASN, it must be in the 64512 to 65534
     * range. If you're using a 32-bit ASN, it must be in the 4200000000 to
     * 4294967294 range.
     * </p>
     * <p>
     * Default: 64512
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonSideAsn <p>
     *            A private Autonomous System Number (ASN) for the Amazon side
     *            of a BGP session. If you're using a 16-bit ASN, it must be in
     *            the 64512 to 65534 range. If you're using a 32-bit ASN, it
     *            must be in the 4200000000 to 4294967294 range.
     *            </p>
     *            <p>
     *            Default: 64512
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnGatewayRequest withAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpnGatewayRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: " + getAmazonSideAsn() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpnGatewayRequest == false)
            return false;
        CreateVpnGatewayRequest other = (CreateVpnGatewayRequest) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null
                && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
