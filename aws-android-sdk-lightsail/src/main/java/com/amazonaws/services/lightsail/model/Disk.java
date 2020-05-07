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
 * Describes a system disk or a block storage disk.
 * </p>
 */
public class Disk implements Serializable {
    /**
     * <p>
     * The unique name of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
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
     * The date when the disk was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
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
     * An array of objects representing the add-ons enabled on the disk.
     * </p>
     */
    private java.util.List<AddOn> addOns;

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     */
    private Boolean isSystemDisk;

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The disk path.
     * </p>
     */
    private String path;

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available, in-use, unknown
     */
    private String state;

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String attachedTo;

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     */
    private Boolean isAttached;

    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned
     * <code>attached</code> for system disks in the API response. It is now
     * deprecated, but still included in the response. Use
     * <code>isAttached</code> instead.
     * </p>
     * </note>
     */
    private String attachmentState;

    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     */
    private Integer gbInUse;

    /**
     * <p>
     * The unique name of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique name of the disk.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The unique name of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The unique name of the disk.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The unique name of the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the disk.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the disk.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withArn(String arn) {
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
    public Disk withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     *
     * @return <p>
     *         The date when the disk was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date when the disk was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date when the disk was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     *
     * @return <p>
     *         The AWS Region and Availability Zone where the disk is located.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where the disk is
     *            located.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where the disk is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type (e.g., <code>Disk</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>Disk</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
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
     *            The Lightsail resource type (e.g., <code>Disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Disk withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>Disk</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
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
     *            The Lightsail resource type (e.g., <code>Disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Disk withResourceType(ResourceType resourceType) {
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
    public Disk withTags(Tag... tags) {
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
    public Disk withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An array of objects representing the add-ons enabled on the disk.
     * </p>
     *
     * @return <p>
     *         An array of objects representing the add-ons enabled on the disk.
     *         </p>
     */
    public java.util.List<AddOn> getAddOns() {
        return addOns;
    }

    /**
     * <p>
     * An array of objects representing the add-ons enabled on the disk.
     * </p>
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons enabled on the
     *            disk.
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
     * An array of objects representing the add-ons enabled on the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons enabled on the
     *            disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withAddOns(AddOn... addOns) {
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
     * An array of objects representing the add-ons enabled on the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons enabled on the
     *            disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withAddOns(java.util.Collection<AddOn> addOns) {
        setAddOns(addOns);
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     *
     * @return <p>
     *         The size of the disk in GB.
     *         </p>
     */
    public Integer getSizeInGb() {
        return sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB.
     *            </p>
     */
    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether this disk is a system disk
     *         (has an operating system loaded on it).
     *         </p>
     */
    public Boolean isIsSystemDisk() {
        return isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether this disk is a system disk
     *         (has an operating system loaded on it).
     *         </p>
     */
    public Boolean getIsSystemDisk() {
        return isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     *
     * @param isSystemDisk <p>
     *            A Boolean value indicating whether this disk is a system disk
     *            (has an operating system loaded on it).
     *            </p>
     */
    public void setIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an
     * operating system loaded on it).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isSystemDisk <p>
     *            A Boolean value indicating whether this disk is a system disk
     *            (has an operating system loaded on it).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
        return this;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     *
     * @return <p>
     *         The input/output operations per second (IOPS) of the disk.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     *
     * @param iops <p>
     *            The input/output operations per second (IOPS) of the disk.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The input/output operations per second (IOPS) of the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     *
     * @return <p>
     *         The disk path.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     *
     * @param path <p>
     *            The disk path.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The disk path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available, in-use, unknown
     *
     * @return <p>
     *         Describes the status of the disk.
     *         </p>
     * @see DiskState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available, in-use, unknown
     *
     * @param state <p>
     *            Describes the status of the disk.
     *            </p>
     * @see DiskState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available, in-use, unknown
     *
     * @param state <p>
     *            Describes the status of the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskState
     */
    public Disk withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available, in-use, unknown
     *
     * @param state <p>
     *            Describes the status of the disk.
     *            </p>
     * @see DiskState
     */
    public void setState(DiskState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available, in-use, unknown
     *
     * @param state <p>
     *            Describes the status of the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskState
     */
    public Disk withState(DiskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The resources to which the disk is attached.
     *         </p>
     */
    public String getAttachedTo() {
        return attachedTo;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param attachedTo <p>
     *            The resources to which the disk is attached.
     *            </p>
     */
    public void setAttachedTo(String attachedTo) {
        this.attachedTo = attachedTo;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param attachedTo <p>
     *            The resources to which the disk is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withAttachedTo(String attachedTo) {
        this.attachedTo = attachedTo;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the disk is attached.
     *         </p>
     */
    public Boolean isIsAttached() {
        return isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the disk is attached.
     *         </p>
     */
    public Boolean getIsAttached() {
        return isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     *
     * @param isAttached <p>
     *            A Boolean value indicating whether the disk is attached.
     *            </p>
     */
    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAttached <p>
     *            A Boolean value indicating whether the disk is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
        return this;
    }

    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned
     * <code>attached</code> for system disks in the API response. It is now
     * deprecated, but still included in the response. Use
     * <code>isAttached</code> instead.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Deprecated) The attachment state of the disk.
     *         </p>
     *         <note>
     *         <p>
     *         In releases prior to November 14, 2017, this parameter returned
     *         <code>attached</code> for system disks in the API response. It is
     *         now deprecated, but still included in the response. Use
     *         <code>isAttached</code> instead.
     *         </p>
     *         </note>
     */
    public String getAttachmentState() {
        return attachmentState;
    }

    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned
     * <code>attached</code> for system disks in the API response. It is now
     * deprecated, but still included in the response. Use
     * <code>isAttached</code> instead.
     * </p>
     * </note>
     *
     * @param attachmentState <p>
     *            (Deprecated) The attachment state of the disk.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to November 14, 2017, this parameter
     *            returned <code>attached</code> for system disks in the API
     *            response. It is now deprecated, but still included in the
     *            response. Use <code>isAttached</code> instead.
     *            </p>
     *            </note>
     */
    public void setAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
    }

    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned
     * <code>attached</code> for system disks in the API response. It is now
     * deprecated, but still included in the response. Use
     * <code>isAttached</code> instead.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentState <p>
     *            (Deprecated) The attachment state of the disk.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to November 14, 2017, this parameter
     *            returned <code>attached</code> for system disks in the API
     *            response. It is now deprecated, but still included in the
     *            response. Use <code>isAttached</code> instead.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
        return this;
    }

    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Deprecated) The number of GB in use by the disk.
     *         </p>
     *         <note>
     *         <p>
     *         In releases prior to November 14, 2017, this parameter was not
     *         included in the API response. It is now deprecated.
     *         </p>
     *         </note>
     */
    public Integer getGbInUse() {
        return gbInUse;
    }

    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     *
     * @param gbInUse <p>
     *            (Deprecated) The number of GB in use by the disk.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to November 14, 2017, this parameter was not
     *            included in the API response. It is now deprecated.
     *            </p>
     *            </note>
     */
    public void setGbInUse(Integer gbInUse) {
        this.gbInUse = gbInUse;
    }

    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gbInUse <p>
     *            (Deprecated) The number of GB in use by the disk.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to November 14, 2017, this parameter was not
     *            included in the API response. It is now deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withGbInUse(Integer gbInUse) {
        this.gbInUse = gbInUse;
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
        if (getAddOns() != null)
            sb.append("addOns: " + getAddOns() + ",");
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb() + ",");
        if (getIsSystemDisk() != null)
            sb.append("isSystemDisk: " + getIsSystemDisk() + ",");
        if (getIops() != null)
            sb.append("iops: " + getIops() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getAttachedTo() != null)
            sb.append("attachedTo: " + getAttachedTo() + ",");
        if (getIsAttached() != null)
            sb.append("isAttached: " + getIsAttached() + ",");
        if (getAttachmentState() != null)
            sb.append("attachmentState: " + getAttachmentState() + ",");
        if (getGbInUse() != null)
            sb.append("gbInUse: " + getGbInUse());
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
        hashCode = prime * hashCode + ((getAddOns() == null) ? 0 : getAddOns().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode
                + ((getIsSystemDisk() == null) ? 0 : getIsSystemDisk().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAttachedTo() == null) ? 0 : getAttachedTo().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentState() == null) ? 0 : getAttachmentState().hashCode());
        hashCode = prime * hashCode + ((getGbInUse() == null) ? 0 : getGbInUse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Disk == false)
            return false;
        Disk other = (Disk) obj;

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
        if (other.getAddOns() == null ^ this.getAddOns() == null)
            return false;
        if (other.getAddOns() != null && other.getAddOns().equals(this.getAddOns()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getIsSystemDisk() == null ^ this.getIsSystemDisk() == null)
            return false;
        if (other.getIsSystemDisk() != null
                && other.getIsSystemDisk().equals(this.getIsSystemDisk()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAttachedTo() == null ^ this.getAttachedTo() == null)
            return false;
        if (other.getAttachedTo() != null
                && other.getAttachedTo().equals(this.getAttachedTo()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null
                && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        if (other.getAttachmentState() == null ^ this.getAttachmentState() == null)
            return false;
        if (other.getAttachmentState() != null
                && other.getAttachmentState().equals(this.getAttachmentState()) == false)
            return false;
        if (other.getGbInUse() == null ^ this.getGbInUse() == null)
            return false;
        if (other.getGbInUse() != null && other.getGbInUse().equals(this.getGbInUse()) == false)
            return false;
        return true;
    }
}
