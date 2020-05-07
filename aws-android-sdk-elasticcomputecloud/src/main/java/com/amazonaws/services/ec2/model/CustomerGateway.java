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

/**
 * <p>
 * Describes a customer gateway.
 * </p>
 */
public class CustomerGateway implements Serializable {
    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     * </p>
     */
    private String bgpAsn;

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     */
    private String customerGatewayId;

    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The current state of the customer gateway (
     * <code>pending | available | deleting | deleted</code>).
     * </p>
     */
    private String state;

    /**
     * <p>
     * The type of VPN connection the customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of customer gateway device.
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     * </p>
     *
     * @return <p>
     *         The customer gateway's Border Gateway Protocol (BGP) Autonomous
     *         System Number (ASN).
     *         </p>
     */
    public String getBgpAsn() {
        return bgpAsn;
    }

    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     * </p>
     *
     * @param bgpAsn <p>
     *            The customer gateway's Border Gateway Protocol (BGP)
     *            Autonomous System Number (ASN).
     *            </p>
     */
    public void setBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System
     * Number (ASN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpAsn <p>
     *            The customer gateway's Border Gateway Protocol (BGP)
     *            Autonomous System Number (ASN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the customer gateway.
     *         </p>
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     *
     * @param customerGatewayId <p>
     *            The ID of the customer gateway.
     *            </p>
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerGatewayId <p>
     *            The ID of the customer gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     * </p>
     *
     * @return <p>
     *         The Internet-routable IP address of the customer gateway's
     *         outside interface.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     * </p>
     *
     * @param ipAddress <p>
     *            The Internet-routable IP address of the customer gateway's
     *            outside interface.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside
     * interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddress <p>
     *            The Internet-routable IP address of the customer gateway's
     *            outside interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
    public CustomerGateway withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The current state of the customer gateway (
     * <code>pending | available | deleting | deleted</code>).
     * </p>
     *
     * @return <p>
     *         The current state of the customer gateway (
     *         <code>pending | available | deleting | deleted</code>).
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the customer gateway (
     * <code>pending | available | deleting | deleted</code>).
     * </p>
     *
     * @param state <p>
     *            The current state of the customer gateway (
     *            <code>pending | available | deleting | deleted</code>).
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the customer gateway (
     * <code>pending | available | deleting | deleted</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The current state of the customer gateway (
     *            <code>pending | available | deleting | deleted</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The type of VPN connection the customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     *
     * @return <p>
     *         The type of VPN connection the customer gateway supports (
     *         <code>ipsec.1</code>).
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of VPN connection the customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     *
     * @param type <p>
     *            The type of VPN connection the customer gateway supports (
     *            <code>ipsec.1</code>).
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection the customer gateway supports (
     * <code>ipsec.1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of VPN connection the customer gateway supports (
     *            <code>ipsec.1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The name of customer gateway device.
     * </p>
     *
     * @return <p>
     *         The name of customer gateway device.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The name of customer gateway device.
     * </p>
     *
     * @param deviceName <p>
     *            The name of customer gateway device.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of customer gateway device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            The name of customer gateway device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the customer gateway.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the customer gateway.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the customer gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the customer gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerGateway withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: " + getCustomerGatewayId() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgpAsn() == null) ? 0 : getBgpAsn().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerGateway == false)
            return false;
        CustomerGateway other = (CustomerGateway) obj;

        if (other.getBgpAsn() == null ^ this.getBgpAsn() == null)
            return false;
        if (other.getBgpAsn() != null && other.getBgpAsn().equals(this.getBgpAsn()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null
                && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
