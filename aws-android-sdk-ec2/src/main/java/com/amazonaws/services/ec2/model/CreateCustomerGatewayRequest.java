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
 * Provides information to AWS about your VPN customer gateway device. The
 * customer gateway is the appliance at your end of the VPN connection. (The
 * device on the AWS side of the VPN connection is the virtual private gateway.)
 * You must provide the Internet-routable IP address of the customer gateway's
 * external interface. The IP address must be static and can be behind a device
 * performing network address translation (NAT).
 * </p>
 * <p>
 * For devices that use Border Gateway Protocol (BGP), you can also provide the
 * device's BGP Autonomous System Number (ASN). You can use an existing ASN
 * assigned to your network. If you don't have an ASN already, you can use a
 * private ASN (in the 64512 - 65534 range).
 * </p>
 * <note>
 * <p>
 * Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with
 * the exception of 7224, which is reserved in the <code>us-east-1</code>
 * Region, and 9059, which is reserved in the <code>eu-west-1</code> Region.
 * </p>
 * </note>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
 * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
 * </p>
 * <important>
 * <p>
 * To create more than one customer gateway with the same VPN type, IP address,
 * and BGP ASN, specify a unique device name for each customer gateway.
 * Identical requests return information about the existing customer gateway and
 * do not create new customer gateways.
 * </p>
 * </important>
 */
public class CreateCustomerGatewayRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     */
    private Integer bgpAsn;

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     */
    private String deviceName;

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
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     *
     * @return <p>
     *         For devices that support BGP, the customer gateway's BGP ASN.
     *         </p>
     *         <p>
     *         Default: 65000
     *         </p>
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     *
     * @param bgpAsn <p>
     *            For devices that support BGP, the customer gateway's BGP ASN.
     *            </p>
     *            <p>
     *            Default: 65000
     *            </p>
     */
    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpAsn <p>
     *            For devices that support BGP, the customer gateway's BGP ASN.
     *            </p>
     *            <p>
     *            Default: 65000
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomerGatewayRequest withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static.
     * </p>
     *
     * @return <p>
     *         The Internet-routable IP address for the customer gateway's
     *         outside interface. The address must be static.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static.
     * </p>
     *
     * @param publicIp <p>
     *            The Internet-routable IP address for the customer gateway's
     *            outside interface. The address must be static.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside
     * interface. The address must be static.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            The Internet-routable IP address for the customer gateway's
     *            outside interface. The address must be static.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomerGatewayRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the customer gateway
     *         certificate.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) for the customer gateway
     *            certificate.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) for the customer gateway
     *            certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomerGatewayRequest withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return <p>
     *         The type of VPN connection that this customer gateway supports (
     *         <code>ipsec.1</code>).
     *         </p>
     * @see GatewayType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection that this customer gateway supports
     *            (<code>ipsec.1</code>).
     *            </p>
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection that this customer gateway supports
     *            (<code>ipsec.1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public CreateCustomerGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection that this customer gateway supports
     *            (<code>ipsec.1</code>).
     *            </p>
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type <p>
     *            The type of VPN connection that this customer gateway supports
     *            (<code>ipsec.1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public CreateCustomerGatewayRequest withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     *
     * @return <p>
     *         A name for the customer gateway device.
     *         </p>
     *         <p>
     *         Length Constraints: Up to 255 characters.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     *
     * @param deviceName <p>
     *            A name for the customer gateway device.
     *            </p>
     *            <p>
     *            Length Constraints: Up to 255 characters.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            A name for the customer gateway device.
     *            </p>
     *            <p>
     *            Length Constraints: Up to 255 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomerGatewayRequest withDeviceName(String deviceName) {
        this.deviceName = deviceName;
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
    public CreateCustomerGatewayRequest withDryRun(Boolean dryRun) {
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
        if (getBgpAsn() != null)
            sb.append("BgpAsn: " + getBgpAsn() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgpAsn() == null) ? 0 : getBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomerGatewayRequest == false)
            return false;
        CreateCustomerGatewayRequest other = (CreateCustomerGatewayRequest) obj;

        if (other.getBgpAsn() == null ^ this.getBgpAsn() == null)
            return false;
        if (other.getBgpAsn() != null && other.getBgpAsn().equals(this.getBgpAsn()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
