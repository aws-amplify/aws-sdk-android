/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a load balancer.
 * </p>
 */
public class LoadBalancerDescription implements Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     */
    private String dNSName;

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     * >Configure a Custom Domain Name</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     */
    private String canonicalHostedZoneName;

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     */
    private String canonicalHostedZoneNameID;

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     */
    private java.util.List<ListenerDescription> listenerDescriptions = new java.util.ArrayList<ListenerDescription>();

    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     */
    private Policies policies;

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     */
    private java.util.List<BackendServerDescription> backendServerDescriptions = new java.util.ArrayList<BackendServerDescription>();

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     */
    private java.util.List<String> availabilityZones = new java.util.ArrayList<String>();

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     */
    private java.util.List<String> subnets = new java.util.ArrayList<String>();

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     */
    private String vPCId;

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     */
    private java.util.List<Instance> instances = new java.util.ArrayList<Instance>();

    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     */
    private HealthCheck healthCheck;

    /**
     * <p>
     * The security group for the load balancer, which you can use as part of
     * your inbound rules for your registered instances. To only allow traffic
     * from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     */
    private SourceSecurityGroup sourceSecurityGroup;

    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers
     * in a VPC.
     * </p>
     */
    private java.util.List<String> securityGroups = new java.util.ArrayList<String>();

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer
     * has a public DNS name that resolves to a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * public DNS name that resolves to a private IP address.
     * </p>
     */
    private String scheme;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     *
     * @return <p>
     *         The DNS name of the load balancer.
     *         </p>
     */
    public String getDNSName() {
        return dNSName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     *
     * @param dNSName <p>
     *            The DNS name of the load balancer.
     *            </p>
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dNSName <p>
     *            The DNS name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     * >Configure a Custom Domain Name</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The DNS name of the load balancer.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     *         >Configure a Custom Domain Name</a> in the <i>Classic Load
     *         Balancers Guide</i>.
     *         </p>
     */
    public String getCanonicalHostedZoneName() {
        return canonicalHostedZoneName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     * >Configure a Custom Domain Name</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     *
     * @param canonicalHostedZoneName <p>
     *            The DNS name of the load balancer.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     *            >Configure a Custom Domain Name</a> in the <i>Classic Load
     *            Balancers Guide</i>.
     *            </p>
     */
    public void setCanonicalHostedZoneName(String canonicalHostedZoneName) {
        this.canonicalHostedZoneName = canonicalHostedZoneName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     * >Configure a Custom Domain Name</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canonicalHostedZoneName <p>
     *            The DNS name of the load balancer.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     *            >Configure a Custom Domain Name</a> in the <i>Classic Load
     *            Balancers Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withCanonicalHostedZoneName(String canonicalHostedZoneName) {
        this.canonicalHostedZoneName = canonicalHostedZoneName;
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     *
     * @return <p>
     *         The ID of the Amazon Route 53 hosted zone for the load balancer.
     *         </p>
     */
    public String getCanonicalHostedZoneNameID() {
        return canonicalHostedZoneNameID;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     *
     * @param canonicalHostedZoneNameID <p>
     *            The ID of the Amazon Route 53 hosted zone for the load
     *            balancer.
     *            </p>
     */
    public void setCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        this.canonicalHostedZoneNameID = canonicalHostedZoneNameID;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canonicalHostedZoneNameID <p>
     *            The ID of the Amazon Route 53 hosted zone for the load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        this.canonicalHostedZoneNameID = canonicalHostedZoneNameID;
        return this;
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     *
     * @return <p>
     *         The listeners for the load balancer.
     *         </p>
     */
    public java.util.List<ListenerDescription> getListenerDescriptions() {
        return listenerDescriptions;
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     *
     * @param listenerDescriptions <p>
     *            The listeners for the load balancer.
     *            </p>
     */
    public void setListenerDescriptions(
            java.util.Collection<ListenerDescription> listenerDescriptions) {
        if (listenerDescriptions == null) {
            this.listenerDescriptions = null;
            return;
        }

        this.listenerDescriptions = new java.util.ArrayList<ListenerDescription>(
                listenerDescriptions);
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listenerDescriptions <p>
     *            The listeners for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withListenerDescriptions(
            ListenerDescription... listenerDescriptions) {
        if (getListenerDescriptions() == null) {
            this.listenerDescriptions = new java.util.ArrayList<ListenerDescription>(
                    listenerDescriptions.length);
        }
        for (ListenerDescription value : listenerDescriptions) {
            this.listenerDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listenerDescriptions <p>
     *            The listeners for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withListenerDescriptions(
            java.util.Collection<ListenerDescription> listenerDescriptions) {
        setListenerDescriptions(listenerDescriptions);
        return this;
    }

    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     *
     * @return <p>
     *         The policies defined for the load balancer.
     *         </p>
     */
    public Policies getPolicies() {
        return policies;
    }

    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     *
     * @param policies <p>
     *            The policies defined for the load balancer.
     *            </p>
     */
    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            The policies defined for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     *
     * @return <p>
     *         Information about your EC2 instances.
     *         </p>
     */
    public java.util.List<BackendServerDescription> getBackendServerDescriptions() {
        return backendServerDescriptions;
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     *
     * @param backendServerDescriptions <p>
     *            Information about your EC2 instances.
     *            </p>
     */
    public void setBackendServerDescriptions(
            java.util.Collection<BackendServerDescription> backendServerDescriptions) {
        if (backendServerDescriptions == null) {
            this.backendServerDescriptions = null;
            return;
        }

        this.backendServerDescriptions = new java.util.ArrayList<BackendServerDescription>(
                backendServerDescriptions);
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backendServerDescriptions <p>
     *            Information about your EC2 instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withBackendServerDescriptions(
            BackendServerDescription... backendServerDescriptions) {
        if (getBackendServerDescriptions() == null) {
            this.backendServerDescriptions = new java.util.ArrayList<BackendServerDescription>(
                    backendServerDescriptions.length);
        }
        for (BackendServerDescription value : backendServerDescriptions) {
            this.backendServerDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backendServerDescriptions <p>
     *            Information about your EC2 instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withBackendServerDescriptions(
            java.util.Collection<BackendServerDescription> backendServerDescriptions) {
        setBackendServerDescriptions(backendServerDescriptions);
        return this;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     *
     * @return <p>
     *         The Availability Zones for the load balancer.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
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
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
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
    public LoadBalancerDescription withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
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
    public LoadBalancerDescription withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     *
     * @return <p>
     *         The IDs of the subnets for the load balancer.
     *         </p>
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     *
     * @param subnets <p>
     *            The IDs of the subnets for the load balancer.
     *            </p>
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withSubnets(String... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<String>(subnets.length);
        }
        for (String value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC for the load balancer.
     *         </p>
     */
    public String getVPCId() {
        return vPCId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     *
     * @param vPCId <p>
     *            The ID of the VPC for the load balancer.
     *            </p>
     */
    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCId <p>
     *            The ID of the VPC for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withVPCId(String vPCId) {
        this.vPCId = vPCId;
        return this;
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     *
     * @return <p>
     *         The IDs of the instances for the load balancer.
     *         </p>
     */
    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     *
     * @param instances <p>
     *            The IDs of the instances for the load balancer.
     *            </p>
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The IDs of the instances for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withInstances(Instance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<Instance>(instances.length);
        }
        for (Instance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The IDs of the instances for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     *
     * @return <p>
     *         Information about the health checks conducted on the load
     *         balancer.
     *         </p>
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }

    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     *
     * @param healthCheck <p>
     *            Information about the health checks conducted on the load
     *            balancer.
     *            </p>
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheck <p>
     *            Information about the health checks conducted on the load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * <p>
     * The security group for the load balancer, which you can use as part of
     * your inbound rules for your registered instances. To only allow traffic
     * from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     *
     * @return <p>
     *         The security group for the load balancer, which you can use as
     *         part of your inbound rules for your registered instances. To only
     *         allow traffic from load balancers, add a security group rule that
     *         specifies this source security group as the inbound source.
     *         </p>
     */
    public SourceSecurityGroup getSourceSecurityGroup() {
        return sourceSecurityGroup;
    }

    /**
     * <p>
     * The security group for the load balancer, which you can use as part of
     * your inbound rules for your registered instances. To only allow traffic
     * from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     *
     * @param sourceSecurityGroup <p>
     *            The security group for the load balancer, which you can use as
     *            part of your inbound rules for your registered instances. To
     *            only allow traffic from load balancers, add a security group
     *            rule that specifies this source security group as the inbound
     *            source.
     *            </p>
     */
    public void setSourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
        this.sourceSecurityGroup = sourceSecurityGroup;
    }

    /**
     * <p>
     * The security group for the load balancer, which you can use as part of
     * your inbound rules for your registered instances. To only allow traffic
     * from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSecurityGroup <p>
     *            The security group for the load balancer, which you can use as
     *            part of your inbound rules for your registered instances. To
     *            only allow traffic from load balancers, add a security group
     *            rule that specifies this source security group as the inbound
     *            source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withSourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
        this.sourceSecurityGroup = sourceSecurityGroup;
        return this;
    }

    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers
     * in a VPC.
     * </p>
     *
     * @return <p>
     *         The security groups for the load balancer. Valid only for load
     *         balancers in a VPC.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers
     * in a VPC.
     * </p>
     *
     * @param securityGroups <p>
     *            The security groups for the load balancer. Valid only for load
     *            balancers in a VPC.
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
     * The security groups for the load balancer. Valid only for load balancers
     * in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups for the load balancer. Valid only for load
     *            balancers in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withSecurityGroups(String... securityGroups) {
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
     * The security groups for the load balancer. Valid only for load balancers
     * in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups for the load balancer. Valid only for load
     *            balancers in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     *
     * @return <p>
     *         The date and time the load balancer was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     *
     * @param createdTime <p>
     *            The date and time the load balancer was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The date and time the load balancer was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer
     * has a public DNS name that resolves to a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * public DNS name that resolves to a private IP address.
     * </p>
     *
     * @return <p>
     *         The type of load balancer. Valid only for load balancers in a
     *         VPC.
     *         </p>
     *         <p>
     *         If <code>Scheme</code> is <code>internet-facing</code>, the load
     *         balancer has a public DNS name that resolves to a public IP
     *         address.
     *         </p>
     *         <p>
     *         If <code>Scheme</code> is <code>internal</code>, the load
     *         balancer has a public DNS name that resolves to a private IP
     *         address.
     *         </p>
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer
     * has a public DNS name that resolves to a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * public DNS name that resolves to a private IP address.
     * </p>
     *
     * @param scheme <p>
     *            The type of load balancer. Valid only for load balancers in a
     *            VPC.
     *            </p>
     *            <p>
     *            If <code>Scheme</code> is <code>internet-facing</code>, the
     *            load balancer has a public DNS name that resolves to a public
     *            IP address.
     *            </p>
     *            <p>
     *            If <code>Scheme</code> is <code>internal</code>, the load
     *            balancer has a public DNS name that resolves to a private IP
     *            address.
     *            </p>
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer
     * has a public DNS name that resolves to a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * public DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheme <p>
     *            The type of load balancer. Valid only for load balancers in a
     *            VPC.
     *            </p>
     *            <p>
     *            If <code>Scheme</code> is <code>internet-facing</code>, the
     *            load balancer has a public DNS name that resolves to a public
     *            IP address.
     *            </p>
     *            <p>
     *            If <code>Scheme</code> is <code>internal</code>, the load
     *            balancer has a public DNS name that resolves to a private IP
     *            address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withScheme(String scheme) {
        this.scheme = scheme;
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getCanonicalHostedZoneName() != null)
            sb.append("CanonicalHostedZoneName: " + getCanonicalHostedZoneName() + ",");
        if (getCanonicalHostedZoneNameID() != null)
            sb.append("CanonicalHostedZoneNameID: " + getCanonicalHostedZoneNameID() + ",");
        if (getListenerDescriptions() != null)
            sb.append("ListenerDescriptions: " + getListenerDescriptions() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
        if (getBackendServerDescriptions() != null)
            sb.append("BackendServerDescriptions: " + getBackendServerDescriptions() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets() + ",");
        if (getVPCId() != null)
            sb.append("VPCId: " + getVPCId() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: " + getHealthCheck() + ",");
        if (getSourceSecurityGroup() != null)
            sb.append("SourceSecurityGroup: " + getSourceSecurityGroup() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getScheme() != null)
            sb.append("Scheme: " + getScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCanonicalHostedZoneName() == null) ? 0 : getCanonicalHostedZoneName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCanonicalHostedZoneNameID() == null) ? 0 : getCanonicalHostedZoneNameID()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getListenerDescriptions() == null) ? 0 : getListenerDescriptions().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackendServerDescriptions() == null) ? 0 : getBackendServerDescriptions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSecurityGroup() == null) ? 0 : getSourceSecurityGroup().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerDescription == false)
            return false;
        LoadBalancerDescription other = (LoadBalancerDescription) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getCanonicalHostedZoneName() == null ^ this.getCanonicalHostedZoneName() == null)
            return false;
        if (other.getCanonicalHostedZoneName() != null
                && other.getCanonicalHostedZoneName().equals(this.getCanonicalHostedZoneName()) == false)
            return false;
        if (other.getCanonicalHostedZoneNameID() == null
                ^ this.getCanonicalHostedZoneNameID() == null)
            return false;
        if (other.getCanonicalHostedZoneNameID() != null
                && other.getCanonicalHostedZoneNameID().equals(this.getCanonicalHostedZoneNameID()) == false)
            return false;
        if (other.getListenerDescriptions() == null ^ this.getListenerDescriptions() == null)
            return false;
        if (other.getListenerDescriptions() != null
                && other.getListenerDescriptions().equals(this.getListenerDescriptions()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getBackendServerDescriptions() == null
                ^ this.getBackendServerDescriptions() == null)
            return false;
        if (other.getBackendServerDescriptions() != null
                && other.getBackendServerDescriptions().equals(this.getBackendServerDescriptions()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null
                && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getSourceSecurityGroup() == null ^ this.getSourceSecurityGroup() == null)
            return false;
        if (other.getSourceSecurityGroup() != null
                && other.getSourceSecurityGroup().equals(this.getSourceSecurityGroup()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        return true;
    }
}
