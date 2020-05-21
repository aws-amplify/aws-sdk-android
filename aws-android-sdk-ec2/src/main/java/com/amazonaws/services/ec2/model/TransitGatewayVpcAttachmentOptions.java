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
 * Describes the VPC attachment options.
 * </p>
 */
public class TransitGatewayVpcAttachmentOptions implements Serializable {
    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String dnsSupport;

    /**
     * <p>
     * Indicates whether IPv6 support is disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     */
    private String ipv6Support;

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether DNS support is enabled.
     *         </p>
     * @see DnsSupportValue
     */
    public String getDnsSupport() {
        return dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @see DnsSupportValue
     */
    public void setDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsSupportValue
     */
    public TransitGatewayVpcAttachmentOptions withDnsSupport(String dnsSupport) {
        this.dnsSupport = dnsSupport;
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @see DnsSupportValue
     */
    public void setDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
    }

    /**
     * <p>
     * Indicates whether DNS support is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param dnsSupport <p>
     *            Indicates whether DNS support is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsSupportValue
     */
    public TransitGatewayVpcAttachmentOptions withDnsSupport(DnsSupportValue dnsSupport) {
        this.dnsSupport = dnsSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @return <p>
     *         Indicates whether IPv6 support is disabled.
     *         </p>
     * @see Ipv6SupportValue
     */
    public String getIpv6Support() {
        return ipv6Support;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param ipv6Support <p>
     *            Indicates whether IPv6 support is disabled.
     *            </p>
     * @see Ipv6SupportValue
     */
    public void setIpv6Support(String ipv6Support) {
        this.ipv6Support = ipv6Support;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param ipv6Support <p>
     *            Indicates whether IPv6 support is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ipv6SupportValue
     */
    public TransitGatewayVpcAttachmentOptions withIpv6Support(String ipv6Support) {
        this.ipv6Support = ipv6Support;
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 support is disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param ipv6Support <p>
     *            Indicates whether IPv6 support is disabled.
     *            </p>
     * @see Ipv6SupportValue
     */
    public void setIpv6Support(Ipv6SupportValue ipv6Support) {
        this.ipv6Support = ipv6Support.toString();
    }

    /**
     * <p>
     * Indicates whether IPv6 support is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enable, disable
     *
     * @param ipv6Support <p>
     *            Indicates whether IPv6 support is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ipv6SupportValue
     */
    public TransitGatewayVpcAttachmentOptions withIpv6Support(Ipv6SupportValue ipv6Support) {
        this.ipv6Support = ipv6Support.toString();
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
        if (getDnsSupport() != null)
            sb.append("DnsSupport: " + getDnsSupport() + ",");
        if (getIpv6Support() != null)
            sb.append("Ipv6Support: " + getIpv6Support());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDnsSupport() == null) ? 0 : getDnsSupport().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Support() == null) ? 0 : getIpv6Support().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayVpcAttachmentOptions == false)
            return false;
        TransitGatewayVpcAttachmentOptions other = (TransitGatewayVpcAttachmentOptions) obj;

        if (other.getDnsSupport() == null ^ this.getDnsSupport() == null)
            return false;
        if (other.getDnsSupport() != null
                && other.getDnsSupport().equals(this.getDnsSupport()) == false)
            return false;
        if (other.getIpv6Support() == null ^ this.getIpv6Support() == null)
            return false;
        if (other.getIpv6Support() != null
                && other.getIpv6Support().equals(this.getIpv6Support()) == false)
            return false;
        return true;
    }
}
