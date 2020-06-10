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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the Lightsail load balancer.
 * </p>
 */
public class LoadBalancer implements Serializable {
    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g.,
     * <code>us-east-2a</code>). Lightsail automatically creates your load
     * balancer across Availability Zones.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     */
    private String resourceType;

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dnsName;

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, provisioning, active_impaired, failed,
     * unknown
     */
    private String state;

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are
     * below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just
     * <code>HTTP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP_HTTPS, HTTP
     */
    private String protocol;

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use
     * port 80. For HTTPS, use port 443.
     * </p>
     */
    private java.util.List<Integer> publicPorts;

    /**
     * <p>
     * The path you specified to perform your health checks. If no path is
     * specified, the load balancer tries to make a request to the default
     * (root) page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String healthCheckPath;

    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail
     * instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port
     * 443.
     * </p>
     */
    private Integer instancePort;

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the
     * load balancer.
     * </p>
     */
    private java.util.List<InstanceHealthSummary> instanceHealthSummary;

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide
     * additional information about the SSL/TLS certificates. For example, if
     * <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     */
    private java.util.List<LoadBalancerTlsCertificateSummary> tlsCertificateSummaries;

    /**
     * <p>
     * A string to string map of the configuration options for your load
     * balancer. Valid values are listed below.
     * </p>
     */
    private java.util.Map<String, String> configurationOptions;

    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the load balancer (e.g.,
     *         <code>my-load-balancer</code>).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the load balancer (e.g.,
     *            <code>my-load-balancer</code>).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the load balancer (e.g., <code>my-load-balancer</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the load balancer (e.g.,
     *            <code>my-load-balancer</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the load balancer.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the load balancer.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     *
     * @return <p>
     *         The support code. Include this code in your email to support when
     *         you have questions about your Lightsail load balancer. This code
     *         enables our support team to look up your Lightsail information
     *         more easily.
     *         </p>
     */
    public String getSupportCode() {
        return supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail load balancer.
     *            This code enables our support team to look up your Lightsail
     *            information more easily.
     *            </p>
     */
    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail load balancer.
     *            This code enables our support team to look up your Lightsail
     *            information more easily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     *
     * @return <p>
     *         The date when your load balancer was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date when your load balancer was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when your load balancer was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date when your load balancer was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g.,
     * <code>us-east-2a</code>). Lightsail automatically creates your load
     * balancer across Availability Zones.
     * </p>
     *
     * @return <p>
     *         The AWS Region where your load balancer was created (e.g.,
     *         <code>us-east-2a</code>). Lightsail automatically creates your
     *         load balancer across Availability Zones.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g.,
     * <code>us-east-2a</code>). Lightsail automatically creates your load
     * balancer across Availability Zones.
     * </p>
     *
     * @param location <p>
     *            The AWS Region where your load balancer was created (e.g.,
     *            <code>us-east-2a</code>). Lightsail automatically creates your
     *            load balancer across Availability Zones.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region where your load balancer was created (e.g.,
     * <code>us-east-2a</code>). Lightsail automatically creates your load
     * balancer across Availability Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The AWS Region where your load balancer was created (e.g.,
     *            <code>us-east-2a</code>). Lightsail automatically creates your
     *            load balancer across Availability Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The resource type (e.g., <code>LoadBalancer</code>.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>LoadBalancer</code>.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>LoadBalancer</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public LoadBalancer withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>LoadBalancer</code>.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancer</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>LoadBalancer</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public LoadBalancer withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values for the resource. For more
     *         information about tags in Lightsail, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values for the resource. For more
     *            information about tags in Lightsail, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *            >Lightsail Dev Guide</a>.
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
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values for the resource. For more
     *            information about tags in Lightsail, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withTags(Tag... tags) {
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
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values for the resource. For more
     *            information about tags in Lightsail, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The DNS name of your Lightsail load balancer.
     *         </p>
     */
    public String getDnsName() {
        return dnsName;
    }

    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dnsName <p>
     *            The DNS name of your Lightsail load balancer.
     *            </p>
     */
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name of your Lightsail load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dnsName <p>
     *            The DNS name of your Lightsail load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, provisioning, active_impaired, failed,
     * unknown
     *
     * @return <p>
     *         The status of your load balancer. Valid values are below.
     *         </p>
     * @see LoadBalancerState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, provisioning, active_impaired, failed,
     * unknown
     *
     * @param state <p>
     *            The status of your load balancer. Valid values are below.
     *            </p>
     * @see LoadBalancerState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, provisioning, active_impaired, failed,
     * unknown
     *
     * @param state <p>
     *            The status of your load balancer. Valid values are below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerState
     */
    public LoadBalancer withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, provisioning, active_impaired, failed,
     * unknown
     *
     * @param state <p>
     *            The status of your load balancer. Valid values are below.
     *            </p>
     * @see LoadBalancerState
     */
    public void setState(LoadBalancerState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The status of your load balancer. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, provisioning, active_impaired, failed,
     * unknown
     *
     * @param state <p>
     *            The status of your load balancer. Valid values are below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerState
     */
    public LoadBalancer withState(LoadBalancerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are
     * below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just
     * <code>HTTP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP_HTTPS, HTTP
     *
     * @return <p>
     *         The protocol you have enabled for your load balancer. Valid
     *         values are below.
     *         </p>
     *         <p>
     *         You can't just have <code>HTTP_HTTPS</code>, but you can have
     *         just <code>HTTP</code>.
     *         </p>
     * @see LoadBalancerProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are
     * below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just
     * <code>HTTP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP_HTTPS, HTTP
     *
     * @param protocol <p>
     *            The protocol you have enabled for your load balancer. Valid
     *            values are below.
     *            </p>
     *            <p>
     *            You can't just have <code>HTTP_HTTPS</code>, but you can have
     *            just <code>HTTP</code>.
     *            </p>
     * @see LoadBalancerProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are
     * below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just
     * <code>HTTP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP_HTTPS, HTTP
     *
     * @param protocol <p>
     *            The protocol you have enabled for your load balancer. Valid
     *            values are below.
     *            </p>
     *            <p>
     *            You can't just have <code>HTTP_HTTPS</code>, but you can have
     *            just <code>HTTP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerProtocol
     */
    public LoadBalancer withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are
     * below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just
     * <code>HTTP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP_HTTPS, HTTP
     *
     * @param protocol <p>
     *            The protocol you have enabled for your load balancer. Valid
     *            values are below.
     *            </p>
     *            <p>
     *            You can't just have <code>HTTP_HTTPS</code>, but you can have
     *            just <code>HTTP</code>.
     *            </p>
     * @see LoadBalancerProtocol
     */
    public void setProtocol(LoadBalancerProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol you have enabled for your load balancer. Valid values are
     * below.
     * </p>
     * <p>
     * You can't just have <code>HTTP_HTTPS</code>, but you can have just
     * <code>HTTP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP_HTTPS, HTTP
     *
     * @param protocol <p>
     *            The protocol you have enabled for your load balancer. Valid
     *            values are below.
     *            </p>
     *            <p>
     *            You can't just have <code>HTTP_HTTPS</code>, but you can have
     *            just <code>HTTP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerProtocol
     */
    public LoadBalancer withProtocol(LoadBalancerProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use
     * port 80. For HTTPS, use port 443.
     * </p>
     *
     * @return <p>
     *         An array of public port settings for your load balancer. For
     *         HTTP, use port 80. For HTTPS, use port 443.
     *         </p>
     */
    public java.util.List<Integer> getPublicPorts() {
        return publicPorts;
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use
     * port 80. For HTTPS, use port 443.
     * </p>
     *
     * @param publicPorts <p>
     *            An array of public port settings for your load balancer. For
     *            HTTP, use port 80. For HTTPS, use port 443.
     *            </p>
     */
    public void setPublicPorts(java.util.Collection<Integer> publicPorts) {
        if (publicPorts == null) {
            this.publicPorts = null;
            return;
        }

        this.publicPorts = new java.util.ArrayList<Integer>(publicPorts);
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use
     * port 80. For HTTPS, use port 443.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicPorts <p>
     *            An array of public port settings for your load balancer. For
     *            HTTP, use port 80. For HTTPS, use port 443.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withPublicPorts(Integer... publicPorts) {
        if (getPublicPorts() == null) {
            this.publicPorts = new java.util.ArrayList<Integer>(publicPorts.length);
        }
        for (Integer value : publicPorts) {
            this.publicPorts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of public port settings for your load balancer. For HTTP, use
     * port 80. For HTTPS, use port 443.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicPorts <p>
     *            An array of public port settings for your load balancer. For
     *            HTTP, use port 80. For HTTPS, use port 443.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withPublicPorts(java.util.Collection<Integer> publicPorts) {
        setPublicPorts(publicPorts);
        return this;
    }

    /**
     * <p>
     * The path you specified to perform your health checks. If no path is
     * specified, the load balancer tries to make a request to the default
     * (root) page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The path you specified to perform your health checks. If no path
     *         is specified, the load balancer tries to make a request to the
     *         default (root) page.
     *         </p>
     */
    public String getHealthCheckPath() {
        return healthCheckPath;
    }

    /**
     * <p>
     * The path you specified to perform your health checks. If no path is
     * specified, the load balancer tries to make a request to the default
     * (root) page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param healthCheckPath <p>
     *            The path you specified to perform your health checks. If no
     *            path is specified, the load balancer tries to make a request
     *            to the default (root) page.
     *            </p>
     */
    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * The path you specified to perform your health checks. If no path is
     * specified, the load balancer tries to make a request to the default
     * (root) page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param healthCheckPath <p>
     *            The path you specified to perform your health checks. If no
     *            path is specified, the load balancer tries to make a request
     *            to the default (root) page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }

    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail
     * instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port
     * 443.
     * </p>
     *
     * @return <p>
     *         The port where the load balancer will direct traffic to your
     *         Lightsail instances. For HTTP traffic, it's port 80. For HTTPS
     *         traffic, it's port 443.
     *         </p>
     */
    public Integer getInstancePort() {
        return instancePort;
    }

    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail
     * instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port
     * 443.
     * </p>
     *
     * @param instancePort <p>
     *            The port where the load balancer will direct traffic to your
     *            Lightsail instances. For HTTP traffic, it's port 80. For HTTPS
     *            traffic, it's port 443.
     *            </p>
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port where the load balancer will direct traffic to your Lightsail
     * instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port
     * 443.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancePort <p>
     *            The port where the load balancer will direct traffic to your
     *            Lightsail instances. For HTTP traffic, it's port 80. For HTTPS
     *            traffic, it's port 443.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the
     * load balancer.
     * </p>
     *
     * @return <p>
     *         An array of InstanceHealthSummary objects describing the health
     *         of the load balancer.
     *         </p>
     */
    public java.util.List<InstanceHealthSummary> getInstanceHealthSummary() {
        return instanceHealthSummary;
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the
     * load balancer.
     * </p>
     *
     * @param instanceHealthSummary <p>
     *            An array of InstanceHealthSummary objects describing the
     *            health of the load balancer.
     *            </p>
     */
    public void setInstanceHealthSummary(
            java.util.Collection<InstanceHealthSummary> instanceHealthSummary) {
        if (instanceHealthSummary == null) {
            this.instanceHealthSummary = null;
            return;
        }

        this.instanceHealthSummary = new java.util.ArrayList<InstanceHealthSummary>(
                instanceHealthSummary);
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the
     * load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceHealthSummary <p>
     *            An array of InstanceHealthSummary objects describing the
     *            health of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withInstanceHealthSummary(InstanceHealthSummary... instanceHealthSummary) {
        if (getInstanceHealthSummary() == null) {
            this.instanceHealthSummary = new java.util.ArrayList<InstanceHealthSummary>(
                    instanceHealthSummary.length);
        }
        for (InstanceHealthSummary value : instanceHealthSummary) {
            this.instanceHealthSummary.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of InstanceHealthSummary objects describing the health of the
     * load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceHealthSummary <p>
     *            An array of InstanceHealthSummary objects describing the
     *            health of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withInstanceHealthSummary(
            java.util.Collection<InstanceHealthSummary> instanceHealthSummary) {
        setInstanceHealthSummary(instanceHealthSummary);
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide
     * additional information about the SSL/TLS certificates. For example, if
     * <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     *
     * @return <p>
     *         An array of LoadBalancerTlsCertificateSummary objects that
     *         provide additional information about the SSL/TLS certificates.
     *         For example, if <code>true</code>, the certificate is attached to
     *         the load balancer.
     *         </p>
     */
    public java.util.List<LoadBalancerTlsCertificateSummary> getTlsCertificateSummaries() {
        return tlsCertificateSummaries;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide
     * additional information about the SSL/TLS certificates. For example, if
     * <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     *
     * @param tlsCertificateSummaries <p>
     *            An array of LoadBalancerTlsCertificateSummary objects that
     *            provide additional information about the SSL/TLS certificates.
     *            For example, if <code>true</code>, the certificate is attached
     *            to the load balancer.
     *            </p>
     */
    public void setTlsCertificateSummaries(
            java.util.Collection<LoadBalancerTlsCertificateSummary> tlsCertificateSummaries) {
        if (tlsCertificateSummaries == null) {
            this.tlsCertificateSummaries = null;
            return;
        }

        this.tlsCertificateSummaries = new java.util.ArrayList<LoadBalancerTlsCertificateSummary>(
                tlsCertificateSummaries);
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide
     * additional information about the SSL/TLS certificates. For example, if
     * <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tlsCertificateSummaries <p>
     *            An array of LoadBalancerTlsCertificateSummary objects that
     *            provide additional information about the SSL/TLS certificates.
     *            For example, if <code>true</code>, the certificate is attached
     *            to the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withTlsCertificateSummaries(
            LoadBalancerTlsCertificateSummary... tlsCertificateSummaries) {
        if (getTlsCertificateSummaries() == null) {
            this.tlsCertificateSummaries = new java.util.ArrayList<LoadBalancerTlsCertificateSummary>(
                    tlsCertificateSummaries.length);
        }
        for (LoadBalancerTlsCertificateSummary value : tlsCertificateSummaries) {
            this.tlsCertificateSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateSummary objects that provide
     * additional information about the SSL/TLS certificates. For example, if
     * <code>true</code>, the certificate is attached to the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tlsCertificateSummaries <p>
     *            An array of LoadBalancerTlsCertificateSummary objects that
     *            provide additional information about the SSL/TLS certificates.
     *            For example, if <code>true</code>, the certificate is attached
     *            to the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withTlsCertificateSummaries(
            java.util.Collection<LoadBalancerTlsCertificateSummary> tlsCertificateSummaries) {
        setTlsCertificateSummaries(tlsCertificateSummaries);
        return this;
    }

    /**
     * <p>
     * A string to string map of the configuration options for your load
     * balancer. Valid values are listed below.
     * </p>
     *
     * @return <p>
     *         A string to string map of the configuration options for your load
     *         balancer. Valid values are listed below.
     *         </p>
     */
    public java.util.Map<String, String> getConfigurationOptions() {
        return configurationOptions;
    }

    /**
     * <p>
     * A string to string map of the configuration options for your load
     * balancer. Valid values are listed below.
     * </p>
     *
     * @param configurationOptions <p>
     *            A string to string map of the configuration options for your
     *            load balancer. Valid values are listed below.
     *            </p>
     */
    public void setConfigurationOptions(java.util.Map<String, String> configurationOptions) {
        this.configurationOptions = configurationOptions;
    }

    /**
     * <p>
     * A string to string map of the configuration options for your load
     * balancer. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationOptions <p>
     *            A string to string map of the configuration options for your
     *            load balancer. Valid values are listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer withConfigurationOptions(java.util.Map<String, String> configurationOptions) {
        this.configurationOptions = configurationOptions;
        return this;
    }

    /**
     * <p>
     * A string to string map of the configuration options for your load
     * balancer. Valid values are listed below.
     * </p>
     * <p>
     * The method adds a new key-value pair into configurationOptions parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into configurationOptions.
     * @param value The corresponding value of the entry to be added into
     *            configurationOptions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancer addconfigurationOptionsEntry(String key, String value) {
        if (null == this.configurationOptions) {
            this.configurationOptions = new java.util.HashMap<String, String>();
        }
        if (this.configurationOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.configurationOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into configurationOptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public LoadBalancer clearconfigurationOptionsEntries() {
        this.configurationOptions = null;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getSupportCode() != null)
            sb.append("supportCode: " + getSupportCode() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getDnsName() != null)
            sb.append("dnsName: " + getDnsName() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol() + ",");
        if (getPublicPorts() != null)
            sb.append("publicPorts: " + getPublicPorts() + ",");
        if (getHealthCheckPath() != null)
            sb.append("healthCheckPath: " + getHealthCheckPath() + ",");
        if (getInstancePort() != null)
            sb.append("instancePort: " + getInstancePort() + ",");
        if (getInstanceHealthSummary() != null)
            sb.append("instanceHealthSummary: " + getInstanceHealthSummary() + ",");
        if (getTlsCertificateSummaries() != null)
            sb.append("tlsCertificateSummaries: " + getTlsCertificateSummaries() + ",");
        if (getConfigurationOptions() != null)
            sb.append("configurationOptions: " + getConfigurationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getPublicPorts() == null) ? 0 : getPublicPorts().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode
                + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceHealthSummary() == null) ? 0 : getInstanceHealthSummary().hashCode());
        hashCode = prime
                * hashCode
                + ((getTlsCertificateSummaries() == null) ? 0 : getTlsCertificateSummaries()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationOptions() == null) ? 0 : getConfigurationOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancer == false)
            return false;
        LoadBalancer other = (LoadBalancer) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null
                && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPublicPorts() == null ^ this.getPublicPorts() == null)
            return false;
        if (other.getPublicPorts() != null
                && other.getPublicPorts().equals(this.getPublicPorts()) == false)
            return false;
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null
                && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null
                && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getInstanceHealthSummary() == null ^ this.getInstanceHealthSummary() == null)
            return false;
        if (other.getInstanceHealthSummary() != null
                && other.getInstanceHealthSummary().equals(this.getInstanceHealthSummary()) == false)
            return false;
        if (other.getTlsCertificateSummaries() == null ^ this.getTlsCertificateSummaries() == null)
            return false;
        if (other.getTlsCertificateSummaries() != null
                && other.getTlsCertificateSummaries().equals(this.getTlsCertificateSummaries()) == false)
            return false;
        if (other.getConfigurationOptions() == null ^ this.getConfigurationOptions() == null)
            return false;
        if (other.getConfigurationOptions() != null
                && other.getConfigurationOptions().equals(this.getConfigurationOptions()) == false)
            return false;
        return true;
    }
}
