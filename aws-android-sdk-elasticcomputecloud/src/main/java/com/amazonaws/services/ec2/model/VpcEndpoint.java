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
 * Describes a VPC endpoint.
 * </p>
 */
public class VpcEndpoint implements Serializable {
    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     */
    private String vpcEndpointType;

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingAcceptance, Pending, Available, Deleting,
     * Deleted, Rejected, Failed, Expired
     */
    private String state;

    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     */
    private java.util.List<String> routeTableIds;

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is
     * located.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * (Interface endpoint) Information about the security groups that are
     * associated with the network interface.
     * </p>
     */
    private java.util.List<SecurityGroupIdentifier> groups;

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a
     * private hosted zone.
     * </p>
     */
    private Boolean privateDnsEnabled;

    /**
     * <p>
     * Indicates whether the VPC endpoint is being managed by its service.
     * </p>
     */
    private Boolean requesterManaged;

    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     */
    private java.util.List<String> networkInterfaceIds;

    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     */
    private java.util.List<DnsEntry> dnsEntries;

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * Any tags assigned to the VPC endpoint.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the AWS account that owns the VPC endpoint.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The last error that occurred for VPC endpoint.
     * </p>
     */
    private LastError lastError;

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
    public VpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @return <p>
     *         The type of endpoint.
     *         </p>
     * @see VpcEndpointType
     */
    public String getVpcEndpointType() {
        return vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     * @see VpcEndpointType
     */
    public void setVpcEndpointType(String vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcEndpointType
     */
    public VpcEndpoint withVpcEndpointType(String vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType;
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     * @see VpcEndpointType
     */
    public void setVpcEndpointType(VpcEndpointType vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType.toString();
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcEndpointType
     */
    public VpcEndpoint withVpcEndpointType(VpcEndpointType vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC to which the endpoint is associated.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC to which the endpoint is associated.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC to which the endpoint is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     *
     * @return <p>
     *         The name of the service to which the endpoint is associated.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the service to which the endpoint is associated.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the service to which the endpoint is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
    public String getState() {
        return state;
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
     * @param state <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @see State
     */
    public void setState(String state) {
        this.state = state;
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
     * @param state <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public VpcEndpoint withState(String state) {
        this.state = state;
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
     * @param state <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @see State
     */
    public void setState(State state) {
        this.state = state.toString();
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
     * @param state <p>
     *            The state of the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public VpcEndpoint withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     *
     * @return <p>
     *         The policy document associated with the endpoint, if applicable.
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     *
     * @param policyDocument <p>
     *            The policy document associated with the endpoint, if
     *            applicable.
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocument <p>
     *            The policy document associated with the endpoint, if
     *            applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     *
     * @return <p>
     *         (Gateway endpoint) One or more route tables associated with the
     *         endpoint.
     *         </p>
     */
    public java.util.List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     *
     * @param routeTableIds <p>
     *            (Gateway endpoint) One or more route tables associated with
     *            the endpoint.
     *            </p>
     */
    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new java.util.ArrayList<String>(routeTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableIds <p>
     *            (Gateway endpoint) One or more route tables associated with
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withRouteTableIds(String... routeTableIds) {
        if (getRouteTableIds() == null) {
            this.routeTableIds = new java.util.ArrayList<String>(routeTableIds.length);
        }
        for (String value : routeTableIds) {
            this.routeTableIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableIds <p>
     *            (Gateway endpoint) One or more route tables associated with
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is
     * located.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) One or more subnets in which the endpoint is
     *         located.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is
     * located.
     * </p>
     *
     * @param subnetIds <p>
     *            (Interface endpoint) One or more subnets in which the endpoint
     *            is located.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is
     * located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            (Interface endpoint) One or more subnets in which the endpoint
     *            is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is
     * located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            (Interface endpoint) One or more subnets in which the endpoint
     *            is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups that are
     * associated with the network interface.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) Information about the security groups that
     *         are associated with the network interface.
     *         </p>
     */
    public java.util.List<SecurityGroupIdentifier> getGroups() {
        return groups;
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups that are
     * associated with the network interface.
     * </p>
     *
     * @param groups <p>
     *            (Interface endpoint) Information about the security groups
     *            that are associated with the network interface.
     *            </p>
     */
    public void setGroups(java.util.Collection<SecurityGroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<SecurityGroupIdentifier>(groups);
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups that are
     * associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            (Interface endpoint) Information about the security groups
     *            that are associated with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withGroups(SecurityGroupIdentifier... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<SecurityGroupIdentifier>(groups.length);
        }
        for (SecurityGroupIdentifier value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups that are
     * associated with the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            (Interface endpoint) Information about the security groups
     *            that are associated with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withGroups(java.util.Collection<SecurityGroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a
     * private hosted zone.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) Indicates whether the VPC is associated with
     *         a private hosted zone.
     *         </p>
     */
    public Boolean isPrivateDnsEnabled() {
        return privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a
     * private hosted zone.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) Indicates whether the VPC is associated with
     *         a private hosted zone.
     *         </p>
     */
    public Boolean getPrivateDnsEnabled() {
        return privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a
     * private hosted zone.
     * </p>
     *
     * @param privateDnsEnabled <p>
     *            (Interface endpoint) Indicates whether the VPC is associated
     *            with a private hosted zone.
     *            </p>
     */
    public void setPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a
     * private hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsEnabled <p>
     *            (Interface endpoint) Indicates whether the VPC is associated
     *            with a private hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPC endpoint is being managed by its service.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPC endpoint is being managed by its
     *         service.
     *         </p>
     */
    public Boolean isRequesterManaged() {
        return requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the VPC endpoint is being managed by its service.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPC endpoint is being managed by its
     *         service.
     *         </p>
     */
    public Boolean getRequesterManaged() {
        return requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the VPC endpoint is being managed by its service.
     * </p>
     *
     * @param requesterManaged <p>
     *            Indicates whether the VPC endpoint is being managed by its
     *            service.
     *            </p>
     */
    public void setRequesterManaged(Boolean requesterManaged) {
        this.requesterManaged = requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the VPC endpoint is being managed by its service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterManaged <p>
     *            Indicates whether the VPC endpoint is being managed by its
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withRequesterManaged(Boolean requesterManaged) {
        this.requesterManaged = requesterManaged;
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) One or more network interfaces for the
     *         endpoint.
     *         </p>
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     *
     * @param networkInterfaceIds <p>
     *            (Interface endpoint) One or more network interfaces for the
     *            endpoint.
     *            </p>
     */
    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            (Interface endpoint) One or more network interfaces for the
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (getNetworkInterfaceIds() == null) {
            this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds.length);
        }
        for (String value : networkInterfaceIds) {
            this.networkInterfaceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            (Interface endpoint) One or more network interfaces for the
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) The DNS entries for the endpoint.
     *         </p>
     */
    public java.util.List<DnsEntry> getDnsEntries() {
        return dnsEntries;
    }

    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     *
     * @param dnsEntries <p>
     *            (Interface endpoint) The DNS entries for the endpoint.
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
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsEntries <p>
     *            (Interface endpoint) The DNS entries for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withDnsEntries(DnsEntry... dnsEntries) {
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
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsEntries <p>
     *            (Interface endpoint) The DNS entries for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withDnsEntries(java.util.Collection<DnsEntry> dnsEntries) {
        setDnsEntries(dnsEntries);
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
    public VpcEndpoint withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the VPC endpoint.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the VPC endpoint.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the VPC endpoint.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the VPC endpoint.
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
     * Any tags assigned to the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withTags(Tag... tags) {
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
     * Any tags assigned to the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the VPC endpoint.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC endpoint.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the VPC endpoint.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The last error that occurred for VPC endpoint.
     * </p>
     *
     * @return <p>
     *         The last error that occurred for VPC endpoint.
     *         </p>
     */
    public LastError getLastError() {
        return lastError;
    }

    /**
     * <p>
     * The last error that occurred for VPC endpoint.
     * </p>
     *
     * @param lastError <p>
     *            The last error that occurred for VPC endpoint.
     *            </p>
     */
    public void setLastError(LastError lastError) {
        this.lastError = lastError;
    }

    /**
     * <p>
     * The last error that occurred for VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastError <p>
     *            The last error that occurred for VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcEndpoint withLastError(LastError lastError) {
        this.lastError = lastError;
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getVpcEndpointType() != null)
            sb.append("VpcEndpointType: " + getVpcEndpointType() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: " + getRouteTableIds() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getPrivateDnsEnabled() != null)
            sb.append("PrivateDnsEnabled: " + getPrivateDnsEnabled() + ",");
        if (getRequesterManaged() != null)
            sb.append("RequesterManaged: " + getRequesterManaged() + ",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: " + getNetworkInterfaceIds() + ",");
        if (getDnsEntries() != null)
            sb.append("DnsEntries: " + getDnsEntries() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getLastError() != null)
            sb.append("LastError: " + getLastError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointType() == null) ? 0 : getVpcEndpointType().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode
                + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsEnabled() == null) ? 0 : getPrivateDnsEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getRequesterManaged() == null) ? 0 : getRequesterManaged().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getDnsEntries() == null) ? 0 : getDnsEntries().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getLastError() == null) ? 0 : getLastError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpoint == false)
            return false;
        VpcEndpoint other = (VpcEndpoint) obj;

        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null
                && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcEndpointType() == null ^ this.getVpcEndpointType() == null)
            return false;
        if (other.getVpcEndpointType() != null
                && other.getVpcEndpointType().equals(this.getVpcEndpointType()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null
                && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getPrivateDnsEnabled() == null ^ this.getPrivateDnsEnabled() == null)
            return false;
        if (other.getPrivateDnsEnabled() != null
                && other.getPrivateDnsEnabled().equals(this.getPrivateDnsEnabled()) == false)
            return false;
        if (other.getRequesterManaged() == null ^ this.getRequesterManaged() == null)
            return false;
        if (other.getRequesterManaged() != null
                && other.getRequesterManaged().equals(this.getRequesterManaged()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null
                && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getDnsEntries() == null ^ this.getDnsEntries() == null)
            return false;
        if (other.getDnsEntries() != null
                && other.getDnsEntries().equals(this.getDnsEntries()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getLastError() == null ^ this.getLastError() == null)
            return false;
        if (other.getLastError() != null
                && other.getLastError().equals(this.getLastError()) == false)
            return false;
        return true;
    }
}
