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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a load balancer.
 * </p>
 */
public class AwsElbv2LoadBalancerDetails implements Serializable {
    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load
     * balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String canonicalHostedZoneId;

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String createdTime;

    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dNSName;

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The
     * possible values are <code>ipv4</code> (for IPv4 addresses) and
     * <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ipAddressType;

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String scheme;

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The state of the load balancer.
     * </p>
     */
    private LoadBalancerState state;

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String vpcId;

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     *
     * @return <p>
     *         The Availability Zones for the load balancer.
     *         </p>
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     *
     * @param availabilityZones <p>
     *            The Availability Zones for the load balancer.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(
                    availabilityZones.length);
        }
        for (AvailabilityZone value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withAvailabilityZones(
            java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load
     * balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the Amazon Route 53 hosted zone associated with the
     *         load balancer.
     *         </p>
     */
    public String getCanonicalHostedZoneId() {
        return canonicalHostedZoneId;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load
     * balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param canonicalHostedZoneId <p>
     *            The ID of the Amazon Route 53 hosted zone associated with the
     *            load balancer.
     *            </p>
     */
    public void setCanonicalHostedZoneId(String canonicalHostedZoneId) {
        this.canonicalHostedZoneId = canonicalHostedZoneId;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load
     * balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param canonicalHostedZoneId <p>
     *            The ID of the Amazon Route 53 hosted zone associated with the
     *            load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withCanonicalHostedZoneId(String canonicalHostedZoneId) {
        this.canonicalHostedZoneId = canonicalHostedZoneId;
        return this;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time the load balancer was created.
     *         </p>
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdTime <p>
     *            The date and time the load balancer was created.
     *            </p>
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdTime <p>
     *            The date and time the load balancer was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The public DNS name of the load balancer.
     *         </p>
     */
    public String getDNSName() {
        return dNSName;
    }

    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dNSName <p>
     *            The public DNS name of the load balancer.
     *            </p>
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dNSName <p>
     *            The public DNS name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The
     * possible values are <code>ipv4</code> (for IPv4 addresses) and
     * <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of IP addresses used by the subnets for your load
     *         balancer. The possible values are <code>ipv4</code> (for IPv4
     *         addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *         addresses).
     *         </p>
     */
    public String getIpAddressType() {
        return ipAddressType;
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The
     * possible values are <code>ipv4</code> (for IPv4 addresses) and
     * <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ipAddressType <p>
     *            The type of IP addresses used by the subnets for your load
     *            balancer. The possible values are <code>ipv4</code> (for IPv4
     *            addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *            addresses).
     *            </p>
     */
    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The
     * possible values are <code>ipv4</code> (for IPv4 addresses) and
     * <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ipAddressType <p>
     *            The type of IP addresses used by the subnets for your load
     *            balancer. The possible values are <code>ipv4</code> (for IPv4
     *            addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *            addresses).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
        return this;
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The nodes of an Internet-facing load balancer have public IP
     *         addresses.
     *         </p>
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param scheme <p>
     *            The nodes of an Internet-facing load balancer have public IP
     *            addresses.
     *            </p>
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param scheme <p>
     *            The nodes of an Internet-facing load balancer have public IP
     *            addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups for the load balancer.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     *
     * @param securityGroups <p>
     *            The IDs of the security groups for the load balancer.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the security groups for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the security groups for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withSecurityGroups(
            java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The state of the load balancer.
     * </p>
     *
     * @return <p>
     *         The state of the load balancer.
     *         </p>
     */
    public LoadBalancerState getState() {
        return state;
    }

    /**
     * <p>
     * The state of the load balancer.
     * </p>
     *
     * @param state <p>
     *            The state of the load balancer.
     *            </p>
     */
    public void setState(LoadBalancerState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withState(LoadBalancerState state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of load balancer.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of load balancer.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the VPC for the load balancer.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcId <p>
     *            The ID of the VPC for the load balancer.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcId <p>
     *            The ID of the VPC for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElbv2LoadBalancerDetails withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getCanonicalHostedZoneId() != null)
            sb.append("CanonicalHostedZoneId: " + getCanonicalHostedZoneId() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: " + getIpAddressType() + ",");
        if (getScheme() != null)
            sb.append("Scheme: " + getScheme() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime
                * hashCode
                + ((getCanonicalHostedZoneId() == null) ? 0 : getCanonicalHostedZoneId().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode
                + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbv2LoadBalancerDetails == false)
            return false;
        AwsElbv2LoadBalancerDetails other = (AwsElbv2LoadBalancerDetails) obj;

        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getCanonicalHostedZoneId() == null ^ this.getCanonicalHostedZoneId() == null)
            return false;
        if (other.getCanonicalHostedZoneId() != null
                && other.getCanonicalHostedZoneId().equals(this.getCanonicalHostedZoneId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null
                && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
