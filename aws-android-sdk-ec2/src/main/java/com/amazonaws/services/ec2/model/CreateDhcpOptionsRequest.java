/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateDhcpOptionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest) CreateDhcpOptions operation}.
 * <p>
 * Creates a set of DHCP options for your VPC. After creating the set,
 * you must associate it with the VPC, causing all existing and new
 * instances that you launch in the VPC to use this set of DHCP options.
 * The following are the individual DHCP options you can specify. For
 * more information about the options, see
 * <a href="http://www.ietf.org/rfc/rfc2132.txt"> RFC 2132 </a>
 * .
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <code>domain-name-servers</code> - The IP addresses of up to four
 * domain name servers, or AmazonProvidedDNS. The default DHCP option set
 * specifies AmazonProvidedDNS. If specifying more than one domain name
 * server, specify the IP addresses in a single parameter, separated by
 * commas.
 * </p>
 * </li>
 * <li> <p>
 * <code>domain-name</code> - If you're using AmazonProvidedDNS in
 * "us-east-1", specify "ec2.internal". If you're using AmazonProvidedDNS
 * in another region, specify "region.compute.internal" (for example,
 * "ap-northeast-1.compute.internal"). Otherwise, specify a domain name
 * (for example, "MyCompany.com"). <b>Important</b> : Some Linux
 * operating systems accept multiple domain names separated by spaces.
 * However, Windows and other Linux operating systems treat the value as
 * a single domain, which results in unexpected behavior. If your DHCP
 * options set is associated with a VPC that has instances with multiple
 * operating systems, specify only one domain name.
 * </p>
 * </li>
 * <li> <p>
 * <code>ntp-servers</code> - The IP addresses of up to four Network
 * Time Protocol (NTP) servers.
 * </p>
 * </li>
 * <li> <p>
 * <code>netbios-name-servers</code> - The IP addresses of up to four
 * NetBIOS name servers.
 * </p>
 * </li>
 * <li> <p>
 * <code>netbios-node-type</code> - The NetBIOS node type (1, 2, 4, or
 * 8). We recommend that you specify 2 (broadcast and multicast are not
 * currently supported). For more information about these node types, see
 * <a href="http://www.ietf.org/rfc/rfc2132.txt"> RFC 2132 </a>
 * .
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Your VPC automatically starts out with a set of DHCP options that
 * includes only a DNS server that we provide (AmazonProvidedDNS). If you
 * create a set of options, and if your VPC has an Internet gateway, make
 * sure to set the <code>domain-name-servers</code> option either to
 * <code>AmazonProvidedDNS</code> or to a domain name server of your
 * choice. For more information about DHCP options, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest)
 */
public class CreateDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateDhcpOptionsRequest> {

    /**
     * A DHCP configuration option.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurations;

    /**
     * Default constructor for a new CreateDhcpOptionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDhcpOptionsRequest() {}
    
    /**
     * Constructs a new CreateDhcpOptionsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dhcpConfigurations A DHCP configuration option.
     */
    public CreateDhcpOptionsRequest(java.util.List<DhcpConfiguration> dhcpConfigurations) {
        setDhcpConfigurations(dhcpConfigurations);
    }

    /**
     * A DHCP configuration option.
     *
     * @return A DHCP configuration option.
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
              dhcpConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>();
              dhcpConfigurations.setAutoConstruct(true);
        }
        return dhcpConfigurations;
    }
    
    /**
     * A DHCP configuration option.
     *
     * @param dhcpConfigurations A DHCP configuration option.
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>(dhcpConfigurations.size());
        dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        this.dhcpConfigurations = dhcpConfigurationsCopy;
    }
    
    /**
     * A DHCP configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations A DHCP configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        if (getDhcpConfigurations() == null) setDhcpConfigurations(new java.util.ArrayList<DhcpConfiguration>(dhcpConfigurations.length));
        for (DhcpConfiguration value : dhcpConfigurations) {
            getDhcpConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A DHCP configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations A DHCP configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>(dhcpConfigurations.size());
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
            this.dhcpConfigurations = dhcpConfigurationsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateDhcpOptionsRequest> getDryRunRequest() {
        Request<CreateDhcpOptionsRequest> request = new CreateDhcpOptionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDhcpConfigurations() != null) sb.append("DhcpConfigurations: " + getDhcpConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDhcpConfigurations() == null) ? 0 : getDhcpConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDhcpOptionsRequest == false) return false;
        CreateDhcpOptionsRequest other = (CreateDhcpOptionsRequest)obj;
        
        if (other.getDhcpConfigurations() == null ^ this.getDhcpConfigurations() == null) return false;
        if (other.getDhcpConfigurations() != null && other.getDhcpConfigurations().equals(this.getDhcpConfigurations()) == false) return false; 
        return true;
    }
    
}
    