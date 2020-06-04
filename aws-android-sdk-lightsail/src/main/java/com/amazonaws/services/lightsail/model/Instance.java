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
 * Describes an instance (a virtual private server).
 * </p>
 */
public class Instance implements Serializable {
    /**
     * <p>
     * The name the user gave the instance (e.g.,
     * <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about an instance or another resource in Lightsail. This
     * code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The timestamp when the instance was created (e.g.,
     * <code>1479734909.17</code>).
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
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
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String blueprintId;

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String blueprintName;

    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String bundleId;

    /**
     * <p>
     * An array of objects representing the add-ons enabled on the instance.
     * </p>
     */
    private java.util.List<AddOn> addOns;

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned
     * to it.
     * </p>
     */
    private Boolean isStaticIp;

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     */
    private String publicIpAddress;

    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([A-F0-9]{1,4}:){7}[A-F0-9]{1,4}<br/>
     */
    private String ipv6Address;

    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     */
    private InstanceHardware hardware;

    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for
     * the instance.
     * </p>
     */
    private InstanceNetworking networking;

    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the
     * instance.
     * </p>
     */
    private InstanceState state;

    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String username;

    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g.,
     * <code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String sshKeyName;

    /**
     * <p>
     * The name the user gave the instance (e.g.,
     * <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name the user gave the instance (e.g.,
     *         <code>Amazon_Linux-1GB-Ohio-1</code>).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name the user gave the instance (e.g.,
     * <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name the user gave the instance (e.g.,
     *            <code>Amazon_Linux-1GB-Ohio-1</code>).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name the user gave the instance (e.g.,
     * <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name the user gave the instance (e.g.,
     *            <code>Amazon_Linux-1GB-Ohio-1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the instance (e.g.,
     *         <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>
     *         ).
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the instance (e.g.,
     *            <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>
     *            ).
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the instance (e.g.,
     *            <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about an instance or another resource in Lightsail. This
     * code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     *
     * @return <p>
     *         The support code. Include this code in your email to support when
     *         you have questions about an instance or another resource in
     *         Lightsail. This code enables our support team to look up your
     *         Lightsail information more easily.
     *         </p>
     */
    public String getSupportCode() {
        return supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about an instance or another resource in Lightsail. This
     * code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about an instance or another resource
     *            in Lightsail. This code enables our support team to look up
     *            your Lightsail information more easily.
     *            </p>
     */
    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about an instance or another resource in Lightsail. This
     * code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about an instance or another resource
     *            in Lightsail. This code enables our support team to look up
     *            your Lightsail information more easily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The timestamp when the instance was created (e.g.,
     * <code>1479734909.17</code>).
     * </p>
     *
     * @return <p>
     *         The timestamp when the instance was created (e.g.,
     *         <code>1479734909.17</code>).
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the instance was created (e.g.,
     * <code>1479734909.17</code>).
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the instance was created (e.g.,
     *            <code>1479734909.17</code>).
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the instance was created (e.g.,
     * <code>1479734909.17</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the instance was created (e.g.,
     *            <code>1479734909.17</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     *
     * @return <p>
     *         The region name and Availability Zone where the instance is
     *         located.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     *
     * @param location <p>
     *            The region name and Availability Zone where the instance is
     *            located.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The region name and Availability Zone where the instance is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The type of resource (usually <code>Instance</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The type of resource (usually <code>Instance</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
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
     *            The type of resource (usually <code>Instance</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Instance withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The type of resource (usually <code>Instance</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
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
     *            The type of resource (usually <code>Instance</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Instance withResourceType(ResourceType resourceType) {
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
    public Instance withTags(Tag... tags) {
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
    public Instance withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     *         </p>
     */
    public String getBlueprintId() {
        return blueprintId;
    }

    /**
     * <p>
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintId <p>
     *            The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     *            </p>
     */
    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintId <p>
     *            The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
        return this;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The friendly name of the blueprint (e.g.,
     *         <code>Amazon Linux</code>).
     *         </p>
     */
    public String getBlueprintName() {
        return blueprintName;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintName <p>
     *            The friendly name of the blueprint (e.g.,
     *            <code>Amazon Linux</code>).
     *            </p>
     */
    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintName <p>
     *            The friendly name of the blueprint (e.g.,
     *            <code>Amazon Linux</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
        return this;
    }

    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The bundle for the instance (e.g., <code>micro_1_0</code>).
     *         </p>
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bundleId <p>
     *            The bundle for the instance (e.g., <code>micro_1_0</code>).
     *            </p>
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bundleId <p>
     *            The bundle for the instance (e.g., <code>micro_1_0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * <p>
     * An array of objects representing the add-ons enabled on the instance.
     * </p>
     *
     * @return <p>
     *         An array of objects representing the add-ons enabled on the
     *         instance.
     *         </p>
     */
    public java.util.List<AddOn> getAddOns() {
        return addOns;
    }

    /**
     * <p>
     * An array of objects representing the add-ons enabled on the instance.
     * </p>
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons enabled on the
     *            instance.
     *            </p>
     */
    public void setAddOns(java.util.Collection<AddOn> addOns) {
        if (addOns == null) {
            this.addOns = null;
            return;
        }

        this.addOns = new java.util.ArrayList<AddOn>(addOns);
    }

    /**
     * <p>
     * An array of objects representing the add-ons enabled on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons enabled on the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withAddOns(AddOn... addOns) {
        if (getAddOns() == null) {
            this.addOns = new java.util.ArrayList<AddOn>(addOns.length);
        }
        for (AddOn value : addOns) {
            this.addOns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the add-ons enabled on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons enabled on the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withAddOns(java.util.Collection<AddOn> addOns) {
        setAddOns(addOns);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned
     * to it.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether this instance has a static IP
     *         assigned to it.
     *         </p>
     */
    public Boolean isIsStaticIp() {
        return isStaticIp;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned
     * to it.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether this instance has a static IP
     *         assigned to it.
     *         </p>
     */
    public Boolean getIsStaticIp() {
        return isStaticIp;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned
     * to it.
     * </p>
     *
     * @param isStaticIp <p>
     *            A Boolean value indicating whether this instance has a static
     *            IP assigned to it.
     *            </p>
     */
    public void setIsStaticIp(Boolean isStaticIp) {
        this.isStaticIp = isStaticIp;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned
     * to it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isStaticIp <p>
     *            A Boolean value indicating whether this instance has a static
     *            IP assigned to it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withIsStaticIp(Boolean isStaticIp) {
        this.isStaticIp = isStaticIp;
        return this;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @return <p>
     *         The private IP address of the instance.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @param privateIpAddress <p>
     *            The private IP address of the instance.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @param privateIpAddress <p>
     *            The private IP address of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @return <p>
     *         The public IP address of the instance.
     *         </p>
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @param publicIpAddress <p>
     *            The public IP address of the instance.
     *            </p>
     */
    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @param publicIpAddress <p>
     *            The public IP address of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([A-F0-9]{1,4}:){7}[A-F0-9]{1,4}<br/>
     *
     * @return <p>
     *         The IPv6 address of the instance.
     *         </p>
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([A-F0-9]{1,4}:){7}[A-F0-9]{1,4}<br/>
     *
     * @param ipv6Address <p>
     *            The IPv6 address of the instance.
     *            </p>
     */
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([A-F0-9]{1,4}:){7}[A-F0-9]{1,4}<br/>
     *
     * @param ipv6Address <p>
     *            The IPv6 address of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     *
     * @return <p>
     *         The size of the vCPU and the amount of RAM for the instance.
     *         </p>
     */
    public InstanceHardware getHardware() {
        return hardware;
    }

    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     *
     * @param hardware <p>
     *            The size of the vCPU and the amount of RAM for the instance.
     *            </p>
     */
    public void setHardware(InstanceHardware hardware) {
        this.hardware = hardware;
    }

    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hardware <p>
     *            The size of the vCPU and the amount of RAM for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withHardware(InstanceHardware hardware) {
        this.hardware = hardware;
        return this;
    }

    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for
     * the instance.
     * </p>
     *
     * @return <p>
     *         Information about the public ports and monthly data transfer
     *         rates for the instance.
     *         </p>
     */
    public InstanceNetworking getNetworking() {
        return networking;
    }

    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for
     * the instance.
     * </p>
     *
     * @param networking <p>
     *            Information about the public ports and monthly data transfer
     *            rates for the instance.
     *            </p>
     */
    public void setNetworking(InstanceNetworking networking) {
        this.networking = networking;
    }

    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for
     * the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networking <p>
     *            Information about the public ports and monthly data transfer
     *            rates for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withNetworking(InstanceNetworking networking) {
        this.networking = networking;
        return this;
    }

    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the
     * instance.
     * </p>
     *
     * @return <p>
     *         The status code and the state (e.g., <code>running</code>) for
     *         the instance.
     *         </p>
     */
    public InstanceState getState() {
        return state;
    }

    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the
     * instance.
     * </p>
     *
     * @param state <p>
     *            The status code and the state (e.g., <code>running</code>) for
     *            the instance.
     *            </p>
     */
    public void setState(InstanceState state) {
        this.state = state;
    }

    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The status code and the state (e.g., <code>running</code>) for
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withState(InstanceState state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The user name for connecting to the instance (e.g.,
     *         <code>ec2-user</code>).
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param username <p>
     *            The user name for connecting to the instance (e.g.,
     *            <code>ec2-user</code>).
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>
     * ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param username <p>
     *            The user name for connecting to the instance (e.g.,
     *            <code>ec2-user</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g.,
     * <code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the SSH key being used to connect to the instance
     *         (e.g., <code>LightsailDefaultKeyPair</code>).
     *         </p>
     */
    public String getSshKeyName() {
        return sshKeyName;
    }

    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g.,
     * <code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sshKeyName <p>
     *            The name of the SSH key being used to connect to the instance
     *            (e.g., <code>LightsailDefaultKeyPair</code>).
     *            </p>
     */
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }

    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g.,
     * <code>LightsailDefaultKeyPair</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sshKeyName <p>
     *            The name of the SSH key being used to connect to the instance
     *            (e.g., <code>LightsailDefaultKeyPair</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
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
        if (getBlueprintId() != null)
            sb.append("blueprintId: " + getBlueprintId() + ",");
        if (getBlueprintName() != null)
            sb.append("blueprintName: " + getBlueprintName() + ",");
        if (getBundleId() != null)
            sb.append("bundleId: " + getBundleId() + ",");
        if (getAddOns() != null)
            sb.append("addOns: " + getAddOns() + ",");
        if (getIsStaticIp() != null)
            sb.append("isStaticIp: " + getIsStaticIp() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("privateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPublicIpAddress() != null)
            sb.append("publicIpAddress: " + getPublicIpAddress() + ",");
        if (getIpv6Address() != null)
            sb.append("ipv6Address: " + getIpv6Address() + ",");
        if (getHardware() != null)
            sb.append("hardware: " + getHardware() + ",");
        if (getNetworking() != null)
            sb.append("networking: " + getNetworking() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getUsername() != null)
            sb.append("username: " + getUsername() + ",");
        if (getSshKeyName() != null)
            sb.append("sshKeyName: " + getSshKeyName());
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
        hashCode = prime * hashCode
                + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode
                + ((getBlueprintName() == null) ? 0 : getBlueprintName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getAddOns() == null) ? 0 : getAddOns().hashCode());
        hashCode = prime * hashCode + ((getIsStaticIp() == null) ? 0 : getIsStaticIp().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6Address() == null) ? 0 : getIpv6Address().hashCode());
        hashCode = prime * hashCode + ((getHardware() == null) ? 0 : getHardware().hashCode());
        hashCode = prime * hashCode + ((getNetworking() == null) ? 0 : getNetworking().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;

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
        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null
                && other.getBlueprintId().equals(this.getBlueprintId()) == false)
            return false;
        if (other.getBlueprintName() == null ^ this.getBlueprintName() == null)
            return false;
        if (other.getBlueprintName() != null
                && other.getBlueprintName().equals(this.getBlueprintName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getAddOns() == null ^ this.getAddOns() == null)
            return false;
        if (other.getAddOns() != null && other.getAddOns().equals(this.getAddOns()) == false)
            return false;
        if (other.getIsStaticIp() == null ^ this.getIsStaticIp() == null)
            return false;
        if (other.getIsStaticIp() != null
                && other.getIsStaticIp().equals(this.getIsStaticIp()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null
                && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        if (other.getIpv6Address() == null ^ this.getIpv6Address() == null)
            return false;
        if (other.getIpv6Address() != null
                && other.getIpv6Address().equals(this.getIpv6Address()) == false)
            return false;
        if (other.getHardware() == null ^ this.getHardware() == null)
            return false;
        if (other.getHardware() != null && other.getHardware().equals(this.getHardware()) == false)
            return false;
        if (other.getNetworking() == null ^ this.getNetworking() == null)
            return false;
        if (other.getNetworking() != null
                && other.getNetworking().equals(this.getNetworking()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null)
            return false;
        if (other.getSshKeyName() != null
                && other.getSshKeyName().equals(this.getSshKeyName()) == false)
            return false;
        return true;
    }
}
