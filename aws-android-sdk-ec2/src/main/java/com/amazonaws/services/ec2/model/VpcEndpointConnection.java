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
 * Describes a VPC endpoint connection to a service.
 * </p>
 */
public class VpcEndpointConnection implements Serializable {
    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointOwner;

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingAcceptance, Pending, Available, Deleting,
     * Deleted, Rejected, Failed, Expired
     */
    private String vpcEndpointState;

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     */
    private java.util.List<DnsEntry> dnsEntries;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the
     * service.
     * </p>
     */
    private java.util.List<String> networkLoadBalancerArns;

    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     *
     * @return <p>
     *         The ID of the service to which the endpoint is connected.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     *
     * @param serviceId <p>
     *            The ID of the service to which the endpoint is connected.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceId <p>
     *            The ID of the service to which the endpoint is connected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC endpoint.
     *         </p>
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     *
     * @param vpcEndpointId <p>
     *            The ID of the VPC endpoint.
     *            </p>
     */
    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointId <p>
     *            The ID of the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the owner of the VPC endpoint.
     *         </p>
     */
    public String getVpcEndpointOwner() {
        return vpcEndpointOwner;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     *
     * @param vpcEndpointOwner <p>
     *            The AWS account ID of the owner of the VPC endpoint.
     *            </p>
     */
    public void setVpcEndpointOwner(String vpcEndpointOwner) {
        this.vpcEndpointOwner = vpcEndpointOwner;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointOwner <p>
     *            The AWS account ID of the owner of the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withVpcEndpointOwner(String vpcEndpointOwner) {
        this.vpcEndpointOwner = vpcEndpointOwner;
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingAcceptance, Pending, Available, Deleting,
     * Deleted, Rejected, Failed, Expired
     *
     * @return <p>
     *         The state of the VPC endpoint.
     *         </p>
     * @see State
     */
    public String getVpcEndpointState() {
        return vpcEndpointState;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingAcceptance, Pending, Available, Deleting,
     * Deleted, Rejected, Failed, Expired
     *
     * @param vpcEndpointState <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @see State
     */
    public void setVpcEndpointState(String vpcEndpointState) {
        this.vpcEndpointState = vpcEndpointState;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingAcceptance, Pending, Available, Deleting,
     * Deleted, Rejected, Failed, Expired
     *
     * @param vpcEndpointState <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public VpcEndpointConnection withVpcEndpointState(String vpcEndpointState) {
        this.vpcEndpointState = vpcEndpointState;
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingAcceptance, Pending, Available, Deleting,
     * Deleted, Rejected, Failed, Expired
     *
     * @param vpcEndpointState <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @see State
     */
    public void setVpcEndpointState(State vpcEndpointState) {
        this.vpcEndpointState = vpcEndpointState.toString();
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingAcceptance, Pending, Available, Deleting,
     * Deleted, Rejected, Failed, Expired
     *
     * @param vpcEndpointState <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public VpcEndpointConnection withVpcEndpointState(State vpcEndpointState) {
        this.vpcEndpointState = vpcEndpointState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the VPC endpoint was created.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The date and time that the VPC endpoint was created.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The date and time that the VPC endpoint was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     *
     * @return <p>
     *         The DNS entries for the VPC endpoint.
     *         </p>
     */
    public java.util.List<DnsEntry> getDnsEntries() {
        return dnsEntries;
    }

    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     *
     * @param dnsEntries <p>
     *            The DNS entries for the VPC endpoint.
     *            </p>
     */
    public void setDnsEntries(java.util.Collection<DnsEntry> dnsEntries) {
        if (dnsEntries == null) {
            this.dnsEntries = null;
            return;
        }

        this.dnsEntries = new java.util.ArrayList<DnsEntry>(dnsEntries);
    }

    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsEntries <p>
     *            The DNS entries for the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withDnsEntries(DnsEntry... dnsEntries) {
        if (getDnsEntries() == null) {
            this.dnsEntries = new java.util.ArrayList<DnsEntry>(dnsEntries.length);
        }
        for (DnsEntry value : dnsEntries) {
            this.dnsEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsEntries <p>
     *            The DNS entries for the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withDnsEntries(java.util.Collection<DnsEntry> dnsEntries) {
        setDnsEntries(dnsEntries);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the
     * service.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of the network load balancers
     *         for the service.
     *         </p>
     */
    public java.util.List<String> getNetworkLoadBalancerArns() {
        return networkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the
     * service.
     * </p>
     *
     * @param networkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of the network load balancers
     *            for the service.
     *            </p>
     */
    public void setNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        if (networkLoadBalancerArns == null) {
            this.networkLoadBalancerArns = null;
            return;
        }

        this.networkLoadBalancerArns = new java.util.ArrayList<String>(networkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the
     * service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of the network load balancers
     *            for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withNetworkLoadBalancerArns(String... networkLoadBalancerArns) {
        if (getNetworkLoadBalancerArns() == null) {
            this.networkLoadBalancerArns = new java.util.ArrayList<String>(
                    networkLoadBalancerArns.length);
        }
        for (String value : networkLoadBalancerArns) {
            this.networkLoadBalancerArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the
     * service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of the network load balancers
     *            for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpointConnection withNetworkLoadBalancerArns(
            java.util.Collection<String> networkLoadBalancerArns) {
        setNetworkLoadBalancerArns(networkLoadBalancerArns);
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
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getVpcEndpointOwner() != null)
            sb.append("VpcEndpointOwner: " + getVpcEndpointOwner() + ",");
        if (getVpcEndpointState() != null)
            sb.append("VpcEndpointState: " + getVpcEndpointState() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getDnsEntries() != null)
            sb.append("DnsEntries: " + getDnsEntries() + ",");
        if (getNetworkLoadBalancerArns() != null)
            sb.append("NetworkLoadBalancerArns: " + getNetworkLoadBalancerArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointOwner() == null) ? 0 : getVpcEndpointOwner().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointState() == null) ? 0 : getVpcEndpointState().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDnsEntries() == null) ? 0 : getDnsEntries().hashCode());
        hashCode = prime
                * hashCode
                + ((getNetworkLoadBalancerArns() == null) ? 0 : getNetworkLoadBalancerArns()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpointConnection == false)
            return false;
        VpcEndpointConnection other = (VpcEndpointConnection) obj;

        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null
                && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcEndpointOwner() == null ^ this.getVpcEndpointOwner() == null)
            return false;
        if (other.getVpcEndpointOwner() != null
                && other.getVpcEndpointOwner().equals(this.getVpcEndpointOwner()) == false)
            return false;
        if (other.getVpcEndpointState() == null ^ this.getVpcEndpointState() == null)
            return false;
        if (other.getVpcEndpointState() != null
                && other.getVpcEndpointState().equals(this.getVpcEndpointState()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDnsEntries() == null ^ this.getDnsEntries() == null)
            return false;
        if (other.getDnsEntries() != null
                && other.getDnsEntries().equals(this.getDnsEntries()) == false)
            return false;
        if (other.getNetworkLoadBalancerArns() == null ^ this.getNetworkLoadBalancerArns() == null)
            return false;
        if (other.getNetworkLoadBalancerArns() != null
                && other.getNetworkLoadBalancerArns().equals(this.getNetworkLoadBalancerArns()) == false)
            return false;
        return true;
    }
}
