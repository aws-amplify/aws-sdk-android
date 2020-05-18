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
 * Creates a set of DHCP options for your VPC. After creating the set, you must
 * associate it with the VPC, causing all existing and new instances that you
 * launch in the VPC to use this set of DHCP options. The following are the
 * individual DHCP options you can specify. For more information about the
 * options, see <a href="http://www.ietf.org/rfc/rfc2132.txt">RFC 2132</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>domain-name-servers</code> - The IP addresses of up to four domain name
 * servers, or AmazonProvidedDNS. The default DHCP option set specifies
 * AmazonProvidedDNS. If specifying more than one domain name server, specify
 * the IP addresses in a single parameter, separated by commas. To have your
 * instance receive a custom DNS hostname as specified in
 * <code>domain-name</code>, you must set <code>domain-name-servers</code> to a
 * custom DNS server.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>domain-name</code> - If you're using AmazonProvidedDNS in
 * <code>us-east-1</code>, specify <code>ec2.internal</code>. If you're using
 * AmazonProvidedDNS in another Region, specify
 * <code>region.compute.internal</code> (for example,
 * <code>ap-northeast-1.compute.internal</code>). Otherwise, specify a domain
 * name (for example, <code>MyCompany.com</code>). This value is used to
 * complete unqualified DNS hostnames. <b>Important</b>: Some Linux operating
 * systems accept multiple domain names separated by spaces. However, Windows
 * and other Linux operating systems treat the value as a single domain, which
 * results in unexpected behavior. If your DHCP options set is associated with a
 * VPC that has instances with multiple operating systems, specify only one
 * domain name.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ntp-servers</code> - The IP addresses of up to four Network Time
 * Protocol (NTP) servers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>netbios-name-servers</code> - The IP addresses of up to four NetBIOS
 * name servers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>netbios-node-type</code> - The NetBIOS node type (1, 2, 4, or 8). We
 * recommend that you specify 2 (broadcast and multicast are not currently
 * supported). For more information about these node types, see <a
 * href="http://www.ietf.org/rfc/rfc2132.txt">RFC 2132</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Your VPC automatically starts out with a set of DHCP options that includes
 * only a DNS server that we provide (AmazonProvidedDNS). If you create a set of
 * options, and if your VPC has an internet gateway, make sure to set the
 * <code>domain-name-servers</code> option either to
 * <code>AmazonProvidedDNS</code> or to a domain name server of your choice. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html">DHCP
 * Options Sets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class CreateDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     */
    private java.util.List<NewDhcpConfiguration> dhcpConfigurations;

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
     * A DHCP configuration option.
     * </p>
     *
     * @return <p>
     *         A DHCP configuration option.
     *         </p>
     */
    public java.util.List<NewDhcpConfiguration> getDhcpConfigurations() {
        return dhcpConfigurations;
    }

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     *
     * @param dhcpConfigurations <p>
     *            A DHCP configuration option.
     *            </p>
     */
    public void setDhcpConfigurations(java.util.Collection<NewDhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }

        this.dhcpConfigurations = new java.util.ArrayList<NewDhcpConfiguration>(dhcpConfigurations);
    }

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dhcpConfigurations <p>
     *            A DHCP configuration option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(
            NewDhcpConfiguration... dhcpConfigurations) {
        if (getDhcpConfigurations() == null) {
            this.dhcpConfigurations = new java.util.ArrayList<NewDhcpConfiguration>(
                    dhcpConfigurations.length);
        }
        for (NewDhcpConfiguration value : dhcpConfigurations) {
            this.dhcpConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dhcpConfigurations <p>
     *            A DHCP configuration option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(
            java.util.Collection<NewDhcpConfiguration> dhcpConfigurations) {
        setDhcpConfigurations(dhcpConfigurations);
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
    public CreateDhcpOptionsRequest withDryRun(Boolean dryRun) {
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
        if (getDhcpConfigurations() != null)
            sb.append("DhcpConfigurations: " + getDhcpConfigurations() + ",");
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
                + ((getDhcpConfigurations() == null) ? 0 : getDhcpConfigurations().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDhcpOptionsRequest == false)
            return false;
        CreateDhcpOptionsRequest other = (CreateDhcpOptionsRequest) obj;

        if (other.getDhcpConfigurations() == null ^ this.getDhcpConfigurations() == null)
            return false;
        if (other.getDhcpConfigurations() != null
                && other.getDhcpConfigurations().equals(this.getDhcpConfigurations()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
