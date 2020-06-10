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
 * Describes a block storage disk snapshot.
 * </p>
 */
public class DiskSnapshot implements Serializable {
    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
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
     * The date when the disk snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
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
     * The size of the disk in GB.
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error, unknown
     */
    private String state;

    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     */
    private String progress;

    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String fromDiskName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk
     * snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromDiskArn;

    /**
     * <p>
     * The unique name of the source instance from which the disk (system
     * volume) snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String fromInstanceName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk
     * (system volume) snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromInstanceArn;

    /**
     * <p>
     * A Boolean value indicating whether the snapshot was created from an
     * automatic snapshot.
     * </p>
     */
    private Boolean isFromAutoSnapshot;

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the disk snapshot (e.g.,
     *         <code>my-disk-snapshot</code>).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the disk snapshot (e.g.,
     *            <code>my-disk-snapshot</code>).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the disk snapshot (e.g.,
     *            <code>my-disk-snapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the disk snapshot.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the disk snapshot.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the disk snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withArn(String arn) {
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
    public DiskSnapshot withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The date when the disk snapshot was created.
     * </p>
     *
     * @return <p>
     *         The date when the disk snapshot was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date when the disk snapshot was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date when the disk snapshot was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the disk snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date when the disk snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     *
     * @return <p>
     *         The AWS Region and Availability Zone where the disk snapshot was
     *         created.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where the disk snapshot
     *            was created.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where the disk snapshot
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
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
     *            The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public DiskSnapshot withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
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
     *            The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public DiskSnapshot withResourceType(ResourceType resourceType) {
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
    public DiskSnapshot withTags(Tag... tags) {
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
    public DiskSnapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public DiskSnapshot withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
        return this;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error, unknown
     *
     * @return <p>
     *         The status of the disk snapshot operation.
     *         </p>
     * @see DiskSnapshotState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error, unknown
     *
     * @param state <p>
     *            The status of the disk snapshot operation.
     *            </p>
     * @see DiskSnapshotState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error, unknown
     *
     * @param state <p>
     *            The status of the disk snapshot operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskSnapshotState
     */
    public DiskSnapshot withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error, unknown
     *
     * @param state <p>
     *            The status of the disk snapshot operation.
     *            </p>
     * @see DiskSnapshotState
     */
    public void setState(DiskSnapshotState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error, unknown
     *
     * @param state <p>
     *            The status of the disk snapshot operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiskSnapshotState
     */
    public DiskSnapshot withState(DiskSnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     *
     * @return <p>
     *         The progress of the disk snapshot operation.
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     *
     * @param progress <p>
     *            The progress of the disk snapshot operation.
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The progress of the disk snapshot operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique name of the source disk from which the disk snapshot
     *         was created.
     *         </p>
     */
    public String getFromDiskName() {
        return fromDiskName;
    }

    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param fromDiskName <p>
     *            The unique name of the source disk from which the disk
     *            snapshot was created.
     *            </p>
     */
    public void setFromDiskName(String fromDiskName) {
        this.fromDiskName = fromDiskName;
    }

    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param fromDiskName <p>
     *            The unique name of the source disk from which the disk
     *            snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withFromDiskName(String fromDiskName) {
        this.fromDiskName = fromDiskName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk
     * snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source disk from which the
     *         disk snapshot was created.
     *         </p>
     */
    public String getFromDiskArn() {
        return fromDiskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk
     * snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromDiskArn <p>
     *            The Amazon Resource Name (ARN) of the source disk from which
     *            the disk snapshot was created.
     *            </p>
     */
    public void setFromDiskArn(String fromDiskArn) {
        this.fromDiskArn = fromDiskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk
     * snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromDiskArn <p>
     *            The Amazon Resource Name (ARN) of the source disk from which
     *            the disk snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withFromDiskArn(String fromDiskArn) {
        this.fromDiskArn = fromDiskArn;
        return this;
    }

    /**
     * <p>
     * The unique name of the source instance from which the disk (system
     * volume) snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique name of the source instance from which the disk
     *         (system volume) snapshot was created.
     *         </p>
     */
    public String getFromInstanceName() {
        return fromInstanceName;
    }

    /**
     * <p>
     * The unique name of the source instance from which the disk (system
     * volume) snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param fromInstanceName <p>
     *            The unique name of the source instance from which the disk
     *            (system volume) snapshot was created.
     *            </p>
     */
    public void setFromInstanceName(String fromInstanceName) {
        this.fromInstanceName = fromInstanceName;
    }

    /**
     * <p>
     * The unique name of the source instance from which the disk (system
     * volume) snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param fromInstanceName <p>
     *            The unique name of the source instance from which the disk
     *            (system volume) snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withFromInstanceName(String fromInstanceName) {
        this.fromInstanceName = fromInstanceName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk
     * (system volume) snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source instance from which
     *         the disk (system volume) snapshot was created.
     *         </p>
     */
    public String getFromInstanceArn() {
        return fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk
     * (system volume) snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the source instance from
     *            which the disk (system volume) snapshot was created.
     *            </p>
     */
    public void setFromInstanceArn(String fromInstanceArn) {
        this.fromInstanceArn = fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk
     * (system volume) snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the source instance from
     *            which the disk (system volume) snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withFromInstanceArn(String fromInstanceArn) {
        this.fromInstanceArn = fromInstanceArn;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the snapshot was created from an
     * automatic snapshot.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the snapshot was created from
     *         an automatic snapshot.
     *         </p>
     */
    public Boolean isIsFromAutoSnapshot() {
        return isFromAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value indicating whether the snapshot was created from an
     * automatic snapshot.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the snapshot was created from
     *         an automatic snapshot.
     *         </p>
     */
    public Boolean getIsFromAutoSnapshot() {
        return isFromAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value indicating whether the snapshot was created from an
     * automatic snapshot.
     * </p>
     *
     * @param isFromAutoSnapshot <p>
     *            A Boolean value indicating whether the snapshot was created
     *            from an automatic snapshot.
     *            </p>
     */
    public void setIsFromAutoSnapshot(Boolean isFromAutoSnapshot) {
        this.isFromAutoSnapshot = isFromAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value indicating whether the snapshot was created from an
     * automatic snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isFromAutoSnapshot <p>
     *            A Boolean value indicating whether the snapshot was created
     *            from an automatic snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiskSnapshot withIsFromAutoSnapshot(Boolean isFromAutoSnapshot) {
        this.isFromAutoSnapshot = isFromAutoSnapshot;
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
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getProgress() != null)
            sb.append("progress: " + getProgress() + ",");
        if (getFromDiskName() != null)
            sb.append("fromDiskName: " + getFromDiskName() + ",");
        if (getFromDiskArn() != null)
            sb.append("fromDiskArn: " + getFromDiskArn() + ",");
        if (getFromInstanceName() != null)
            sb.append("fromInstanceName: " + getFromInstanceName() + ",");
        if (getFromInstanceArn() != null)
            sb.append("fromInstanceArn: " + getFromInstanceArn() + ",");
        if (getIsFromAutoSnapshot() != null)
            sb.append("isFromAutoSnapshot: " + getIsFromAutoSnapshot());
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
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode
                + ((getFromDiskName() == null) ? 0 : getFromDiskName().hashCode());
        hashCode = prime * hashCode
                + ((getFromDiskArn() == null) ? 0 : getFromDiskArn().hashCode());
        hashCode = prime * hashCode
                + ((getFromInstanceName() == null) ? 0 : getFromInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getFromInstanceArn() == null) ? 0 : getFromInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getIsFromAutoSnapshot() == null) ? 0 : getIsFromAutoSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskSnapshot == false)
            return false;
        DiskSnapshot other = (DiskSnapshot) obj;

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
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getFromDiskName() == null ^ this.getFromDiskName() == null)
            return false;
        if (other.getFromDiskName() != null
                && other.getFromDiskName().equals(this.getFromDiskName()) == false)
            return false;
        if (other.getFromDiskArn() == null ^ this.getFromDiskArn() == null)
            return false;
        if (other.getFromDiskArn() != null
                && other.getFromDiskArn().equals(this.getFromDiskArn()) == false)
            return false;
        if (other.getFromInstanceName() == null ^ this.getFromInstanceName() == null)
            return false;
        if (other.getFromInstanceName() != null
                && other.getFromInstanceName().equals(this.getFromInstanceName()) == false)
            return false;
        if (other.getFromInstanceArn() == null ^ this.getFromInstanceArn() == null)
            return false;
        if (other.getFromInstanceArn() != null
                && other.getFromInstanceArn().equals(this.getFromInstanceArn()) == false)
            return false;
        if (other.getIsFromAutoSnapshot() == null ^ this.getIsFromAutoSnapshot() == null)
            return false;
        if (other.getIsFromAutoSnapshot() != null
                && other.getIsFromAutoSnapshot().equals(this.getIsFromAutoSnapshot()) == false)
            return false;
        return true;
    }
}
