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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Classic Load Balancer.
 * </p>
 * <p>
 * You can add listeners, security groups, subnets, and tags when you create
 * your load balancer, or you can add them later using
 * <a>CreateLoadBalancerListeners</a>, <a>ApplySecurityGroupsToLoadBalancer</a>,
 * <a>AttachLoadBalancerToSubnets</a>, and <a>AddTags</a>.
 * </p>
 * <p>
 * To describe your current load balancers, see <a>DescribeLoadBalancers</a>.
 * When you are finished with a load balancer, you can delete it using
 * <a>DeleteLoadBalancer</a>.
 * </p>
 * <p>
 * You can create up to 20 load balancers per region per account. You can
 * request an increase for the number of load balancers for your account. For
 * more information, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html"
 * >Limits for Your Classic Load Balancer</a> in the <i>Classic Load Balancers
 * Guide</i>.
 * </p>
 */
public class CreateLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique within your set of load balancers for the
     * region, must have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and cannot begin or end with a
     * hyphen.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     * >Listeners for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     */
    private java.util.List<Listener> listeners = new java.util.ArrayList<Listener>();

    /**
     * <p>
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer
     * using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     */
    private java.util.List<String> availabilityZones = new java.util.ArrayList<String>();

    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     * </p>
     */
    private java.util.List<String> subnets = new java.util.ArrayList<String>();

    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     */
    private java.util.List<String> securityGroups = new java.util.ArrayList<String>();

    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a DNS name that resolves to public IP addresses. For more
     * information about Internet-facing and Internal load balancers, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User
     * Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name
     * that resolves to private IP addresses.
     * </p>
     */
    private String scheme;

    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     * >Tag Your Classic Load Balancer</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * Default constructor for CreateLoadBalancerRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public CreateLoadBalancerRequest() {
    }

    /**
     * Constructs a new CreateLoadBalancerRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     *            <p>
     *            This name must be unique within your set of load balancers for
     *            the region, must have a maximum of 32 characters, must contain
     *            only alphanumeric characters or hyphens, and cannot begin or
     *            end with a hyphen.
     *            </p>
     */
    public CreateLoadBalancerRequest(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
    }

    /**
     * Constructs a new CreateLoadBalancerRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     *            <p>
     *            This name must be unique within your set of load balancers for
     *            the region, must have a maximum of 32 characters, must contain
     *            only alphanumeric characters or hyphens, and cannot begin or
     *            end with a hyphen.
     *            </p>
     * @param listeners <p>
     *            The listeners.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     *            >Listeners for Your Classic Load Balancer</a> in the
     *            <i>Classic Load Balancers Guide</i>.
     *            </p>
     * @param availabilityZones <p>
     *            One or more Availability Zones from the same region as the
     *            load balancer.
     *            </p>
     *            <p>
     *            You must specify at least one Availability Zone.
     *            </p>
     *            <p>
     *            You can add more Availability Zones after you create the load
     *            balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *            </p>
     */
    public CreateLoadBalancerRequest(String loadBalancerName, java.util.List<Listener> listeners,
            java.util.List<String> availabilityZones) {
        setLoadBalancerName(loadBalancerName);
        setListeners(listeners);
        setAvailabilityZones(availabilityZones);
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique within your set of load balancers for the
     * region, must have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and cannot begin or end with a
     * hyphen.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer.
     *         </p>
     *         <p>
     *         This name must be unique within your set of load balancers for
     *         the region, must have a maximum of 32 characters, must contain
     *         only alphanumeric characters or hyphens, and cannot begin or end
     *         with a hyphen.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique within your set of load balancers for the
     * region, must have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and cannot begin or end with a
     * hyphen.
     * </p>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     *            <p>
     *            This name must be unique within your set of load balancers for
     *            the region, must have a maximum of 32 characters, must contain
     *            only alphanumeric characters or hyphens, and cannot begin or
     *            end with a hyphen.
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
     * This name must be unique within your set of load balancers for the
     * region, must have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, and cannot begin or end with a
     * hyphen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     *            <p>
     *            This name must be unique within your set of load balancers for
     *            the region, must have a maximum of 32 characters, must contain
     *            only alphanumeric characters or hyphens, and cannot begin or
     *            end with a hyphen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     * >Listeners for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     *
     * @return <p>
     *         The listeners.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     *         >Listeners for Your Classic Load Balancer</a> in the <i>Classic
     *         Load Balancers Guide</i>.
     *         </p>
     */
    public java.util.List<Listener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     * >Listeners for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     *
     * @param listeners <p>
     *            The listeners.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     *            >Listeners for Your Classic Load Balancer</a> in the
     *            <i>Classic Load Balancers Guide</i>.
     *            </p>
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<Listener>(listeners);
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     * >Listeners for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            The listeners.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     *            >Listeners for Your Classic Load Balancer</a> in the
     *            <i>Classic Load Balancers Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withListeners(Listener... listeners) {
        if (getListeners() == null) {
            this.listeners = new java.util.ArrayList<Listener>(listeners.length);
        }
        for (Listener value : listeners) {
            this.listeners.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     * >Listeners for Your Classic Load Balancer</a> in the <i>Classic Load
     * Balancers Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            The listeners.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html"
     *            >Listeners for Your Classic Load Balancer</a> in the
     *            <i>Classic Load Balancers Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer
     * using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     *
     * @return <p>
     *         One or more Availability Zones from the same region as the load
     *         balancer.
     *         </p>
     *         <p>
     *         You must specify at least one Availability Zone.
     *         </p>
     *         <p>
     *         You can add more Availability Zones after you create the load
     *         balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer
     * using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones from the same region as the
     *            load balancer.
     *            </p>
     *            <p>
     *            You must specify at least one Availability Zone.
     *            </p>
     *            <p>
     *            You can add more Availability Zones after you create the load
     *            balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
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
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer
     * using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones from the same region as the
     *            load balancer.
     *            </p>
     *            <p>
     *            You must specify at least one Availability Zone.
     *            </p>
     *            <p>
     *            You can add more Availability Zones after you create the load
     *            balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withAvailabilityZones(String... availabilityZones) {
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
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer
     * using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones from the same region as the
     *            load balancer.
     *            </p>
     *            <p>
     *            You must specify at least one Availability Zone.
     *            </p>
     *            <p>
     *            You can add more Availability Zones after you create the load
     *            balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     * </p>
     *
     * @return <p>
     *         The IDs of the subnets in your VPC to attach to the load
     *         balancer. Specify one subnet per Availability Zone specified in
     *         <code>AvailabilityZones</code>.
     *         </p>
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     * </p>
     *
     * @param subnets <p>
     *            The IDs of the subnets in your VPC to attach to the load
     *            balancer. Specify one subnet per Availability Zone specified
     *            in <code>AvailabilityZones</code>.
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
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets in your VPC to attach to the load
     *            balancer. Specify one subnet per Availability Zone specified
     *            in <code>AvailabilityZones</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withSubnets(String... subnets) {
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
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets in your VPC to attach to the load
     *            balancer. Specify one subnet per Availability Zone specified
     *            in <code>AvailabilityZones</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     *
     * @return <p>
     *         The IDs of the security groups to assign to the load balancer.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     *
     * @param securityGroups <p>
     *            The IDs of the security groups to assign to the load balancer.
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
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the security groups to assign to the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withSecurityGroups(String... securityGroups) {
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
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the security groups to assign to the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a DNS name that resolves to public IP addresses. For more
     * information about Internet-facing and Internal load balancers, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User
     * Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name
     * that resolves to private IP addresses.
     * </p>
     *
     * @return <p>
     *         The type of a load balancer. Valid only for load balancers in a
     *         VPC.
     *         </p>
     *         <p>
     *         By default, Elastic Load Balancing creates an Internet-facing
     *         load balancer with a DNS name that resolves to public IP
     *         addresses. For more information about Internet-facing and
     *         Internal load balancers, see <a href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     *         >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         Specify <code>internal</code> to create a load balancer with a
     *         DNS name that resolves to private IP addresses.
     *         </p>
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a DNS name that resolves to public IP addresses. For more
     * information about Internet-facing and Internal load balancers, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User
     * Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name
     * that resolves to private IP addresses.
     * </p>
     *
     * @param scheme <p>
     *            The type of a load balancer. Valid only for load balancers in
     *            a VPC.
     *            </p>
     *            <p>
     *            By default, Elastic Load Balancing creates an Internet-facing
     *            load balancer with a DNS name that resolves to public IP
     *            addresses. For more information about Internet-facing and
     *            Internal load balancers, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     *            >Load Balancer Scheme</a> in the <i>Elastic Load Balancing
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Specify <code>internal</code> to create a load balancer with a
     *            DNS name that resolves to private IP addresses.
     *            </p>
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a DNS name that resolves to public IP addresses. For more
     * information about Internet-facing and Internal load balancers, see <a
     * href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User
     * Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name
     * that resolves to private IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheme <p>
     *            The type of a load balancer. Valid only for load balancers in
     *            a VPC.
     *            </p>
     *            <p>
     *            By default, Elastic Load Balancing creates an Internet-facing
     *            load balancer with a DNS name that resolves to public IP
     *            addresses. For more information about Internet-facing and
     *            Internal load balancers, see <a href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     *            >Load Balancer Scheme</a> in the <i>Elastic Load Balancing
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Specify <code>internal</code> to create a load balancer with a
     *            DNS name that resolves to private IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     * >Tag Your Classic Load Balancer</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of tags to assign to the load balancer.
     *         </p>
     *         <p>
     *         For more information about tagging your load balancer, see <a
     *         href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     *         >Tag Your Classic Load Balancer</a> in the <i>Classic Load
     *         Balancers Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     * >Tag Your Classic Load Balancer</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to assign to the load balancer.
     *            </p>
     *            <p>
     *            For more information about tagging your load balancer, see <a
     *            href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     *            >Tag Your Classic Load Balancer</a> in the <i>Classic Load
     *            Balancers Guide</i>.
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
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     * >Tag Your Classic Load Balancer</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to assign to the load balancer.
     *            </p>
     *            <p>
     *            For more information about tagging your load balancer, see <a
     *            href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     *            >Tag Your Classic Load Balancer</a> in the <i>Classic Load
     *            Balancers Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withTags(Tag... tags) {
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
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     * >Tag Your Classic Load Balancer</a> in the <i>Classic Load Balancers
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to assign to the load balancer.
     *            </p>
     *            <p>
     *            For more information about tagging your load balancer, see <a
     *            href=
     *            "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html"
     *            >Tag Your Classic Load Balancer</a> in the <i>Classic Load
     *            Balancers Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getListeners() != null)
            sb.append("Listeners: " + getListeners() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getScheme() != null)
            sb.append("Scheme: " + getScheme() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoadBalancerRequest == false)
            return false;
        CreateLoadBalancerRequest other = (CreateLoadBalancerRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null
                && other.getListeners().equals(this.getListeners()) == false)
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
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
