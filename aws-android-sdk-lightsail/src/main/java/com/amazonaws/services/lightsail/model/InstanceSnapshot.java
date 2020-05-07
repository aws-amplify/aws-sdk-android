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
 * Describes an instance snapshot.
 * </p>
 */
public class InstanceSnapshot implements Serializable {
    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
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
     * The timestamp when the snapshot was created (e.g.,
     * <code>1479907467.024</code>).
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The region name and Availability Zone where you created the snapshot.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
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
     * The state the snapshot is in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available
     */
    private String state;

    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     */
    private String progress;

    /**
     * <p>
     * An array of disk objects containing information about all block storage
     * disks.
     * </p>
     */
    private java.util.List<Disk> fromAttachedDisks;

    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String fromInstanceName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot
     * was created (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromInstanceArn;

    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g.,
     * <code>os_debian_8_3</code>). A blueprint is a virtual private server (or
     * <i>instance</i>) image used to create instances quickly.
     * </p>
     */
    private String fromBlueprintId;

    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     */
    private String fromBundleId;

    /**
     * <p>
     * A Boolean value indicating whether the snapshot was created from an
     * automatic snapshot.
     * </p>
     */
    private Boolean isFromAutoSnapshot;

    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the snapshot.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the snapshot.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the snapshot (e.g.,
     *         <code>arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     *         ).
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the snapshot (e.g.,
     *            <code>arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     *            ).
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
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
     *            The Amazon Resource Name (ARN) of the snapshot (e.g.,
     *            <code>arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withArn(String arn) {
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
    public InstanceSnapshot withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created (e.g.,
     * <code>1479907467.024</code>).
     * </p>
     *
     * @return <p>
     *         The timestamp when the snapshot was created (e.g.,
     *         <code>1479907467.024</code>).
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created (e.g.,
     * <code>1479907467.024</code>).
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the snapshot was created (e.g.,
     *            <code>1479907467.024</code>).
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created (e.g.,
     * <code>1479907467.024</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the snapshot was created (e.g.,
     *            <code>1479907467.024</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The region name and Availability Zone where you created the snapshot.
     * </p>
     *
     * @return <p>
     *         The region name and Availability Zone where you created the
     *         snapshot.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The region name and Availability Zone where you created the snapshot.
     * </p>
     *
     * @param location <p>
     *            The region name and Availability Zone where you created the
     *            snapshot.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region name and Availability Zone where you created the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The region name and Availability Zone where you created the
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The type of resource (usually <code>InstanceSnapshot</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The type of resource (usually <code>InstanceSnapshot</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
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
     *            The type of resource (usually <code>InstanceSnapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public InstanceSnapshot withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The type of resource (usually <code>InstanceSnapshot</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
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
     *            The type of resource (usually <code>InstanceSnapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public InstanceSnapshot withResourceType(ResourceType resourceType) {
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
    public InstanceSnapshot withTags(Tag... tags) {
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
    public InstanceSnapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available
     *
     * @return <p>
     *         The state the snapshot is in.
     *         </p>
     * @see InstanceSnapshotState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available
     *
     * @param state <p>
     *            The state the snapshot is in.
     *            </p>
     * @see InstanceSnapshotState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available
     *
     * @param state <p>
     *            The state the snapshot is in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceSnapshotState
     */
    public InstanceSnapshot withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available
     *
     * @param state <p>
     *            The state the snapshot is in.
     *            </p>
     * @see InstanceSnapshotState
     */
    public void setState(InstanceSnapshotState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, error, available
     *
     * @param state <p>
     *            The state the snapshot is in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceSnapshotState
     */
    public InstanceSnapshot withState(InstanceSnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     *
     * @return <p>
     *         The progress of the snapshot.
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     *
     * @param progress <p>
     *            The progress of the snapshot.
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The progress of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * An array of disk objects containing information about all block storage
     * disks.
     * </p>
     *
     * @return <p>
     *         An array of disk objects containing information about all block
     *         storage disks.
     *         </p>
     */
    public java.util.List<Disk> getFromAttachedDisks() {
        return fromAttachedDisks;
    }

    /**
     * <p>
     * An array of disk objects containing information about all block storage
     * disks.
     * </p>
     *
     * @param fromAttachedDisks <p>
     *            An array of disk objects containing information about all
     *            block storage disks.
     *            </p>
     */
    public void setFromAttachedDisks(java.util.Collection<Disk> fromAttachedDisks) {
        if (fromAttachedDisks == null) {
            this.fromAttachedDisks = null;
            return;
        }

        this.fromAttachedDisks = new java.util.ArrayList<Disk>(fromAttachedDisks);
    }

    /**
     * <p>
     * An array of disk objects containing information about all block storage
     * disks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAttachedDisks <p>
     *            An array of disk objects containing information about all
     *            block storage disks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withFromAttachedDisks(Disk... fromAttachedDisks) {
        if (getFromAttachedDisks() == null) {
            this.fromAttachedDisks = new java.util.ArrayList<Disk>(fromAttachedDisks.length);
        }
        for (Disk value : fromAttachedDisks) {
            this.fromAttachedDisks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of disk objects containing information about all block storage
     * disks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAttachedDisks <p>
     *            An array of disk objects containing information about all
     *            block storage disks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withFromAttachedDisks(java.util.Collection<Disk> fromAttachedDisks) {
        setFromAttachedDisks(fromAttachedDisks);
        return this;
    }

    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The instance from which the snapshot was created.
     *         </p>
     */
    public String getFromInstanceName() {
        return fromInstanceName;
    }

    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param fromInstanceName <p>
     *            The instance from which the snapshot was created.
     *            </p>
     */
    public void setFromInstanceName(String fromInstanceName) {
        this.fromInstanceName = fromInstanceName;
    }

    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param fromInstanceName <p>
     *            The instance from which the snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withFromInstanceName(String fromInstanceName) {
        this.fromInstanceName = fromInstanceName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot
     * was created (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the instance from which the
     *         snapshot was created (e.g.,
     *         <code>arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>
     *         ).
     *         </p>
     */
    public String getFromInstanceArn() {
        return fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot
     * was created (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the instance from which the
     *            snapshot was created (e.g.,
     *            <code>arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>
     *            ).
     *            </p>
     */
    public void setFromInstanceArn(String fromInstanceArn) {
        this.fromInstanceArn = fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot
     * was created (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>
     * ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the instance from which the
     *            snapshot was created (e.g.,
     *            <code>arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withFromInstanceArn(String fromInstanceArn) {
        this.fromInstanceArn = fromInstanceArn;
        return this;
    }

    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g.,
     * <code>os_debian_8_3</code>). A blueprint is a virtual private server (or
     * <i>instance</i>) image used to create instances quickly.
     * </p>
     *
     * @return <p>
     *         The blueprint ID from which you created the snapshot (e.g.,
     *         <code>os_debian_8_3</code>). A blueprint is a virtual private
     *         server (or <i>instance</i>) image used to create instances
     *         quickly.
     *         </p>
     */
    public String getFromBlueprintId() {
        return fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g.,
     * <code>os_debian_8_3</code>). A blueprint is a virtual private server (or
     * <i>instance</i>) image used to create instances quickly.
     * </p>
     *
     * @param fromBlueprintId <p>
     *            The blueprint ID from which you created the snapshot (e.g.,
     *            <code>os_debian_8_3</code>). A blueprint is a virtual private
     *            server (or <i>instance</i>) image used to create instances
     *            quickly.
     *            </p>
     */
    public void setFromBlueprintId(String fromBlueprintId) {
        this.fromBlueprintId = fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g.,
     * <code>os_debian_8_3</code>). A blueprint is a virtual private server (or
     * <i>instance</i>) image used to create instances quickly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromBlueprintId <p>
     *            The blueprint ID from which you created the snapshot (e.g.,
     *            <code>os_debian_8_3</code>). A blueprint is a virtual private
     *            server (or <i>instance</i>) image used to create instances
     *            quickly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withFromBlueprintId(String fromBlueprintId) {
        this.fromBlueprintId = fromBlueprintId;
        return this;
    }

    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     *
     * @return <p>
     *         The bundle ID from which you created the snapshot (e.g.,
     *         <code>micro_1_0</code>).
     *         </p>
     */
    public String getFromBundleId() {
        return fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     *
     * @param fromBundleId <p>
     *            The bundle ID from which you created the snapshot (e.g.,
     *            <code>micro_1_0</code>).
     *            </p>
     */
    public void setFromBundleId(String fromBundleId) {
        this.fromBundleId = fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromBundleId <p>
     *            The bundle ID from which you created the snapshot (e.g.,
     *            <code>micro_1_0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withFromBundleId(String fromBundleId) {
        this.fromBundleId = fromBundleId;
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
    public InstanceSnapshot withIsFromAutoSnapshot(Boolean isFromAutoSnapshot) {
        this.isFromAutoSnapshot = isFromAutoSnapshot;
        return this;
    }

    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     *
     * @return <p>
     *         The size in GB of the SSD.
     *         </p>
     */
    public Integer getSizeInGb() {
        return sizeInGb;
    }

    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     *
     * @param sizeInGb <p>
     *            The size in GB of the SSD.
     *            </p>
     */
    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGb <p>
     *            The size in GB of the SSD.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshot withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
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
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getProgress() != null)
            sb.append("progress: " + getProgress() + ",");
        if (getFromAttachedDisks() != null)
            sb.append("fromAttachedDisks: " + getFromAttachedDisks() + ",");
        if (getFromInstanceName() != null)
            sb.append("fromInstanceName: " + getFromInstanceName() + ",");
        if (getFromInstanceArn() != null)
            sb.append("fromInstanceArn: " + getFromInstanceArn() + ",");
        if (getFromBlueprintId() != null)
            sb.append("fromBlueprintId: " + getFromBlueprintId() + ",");
        if (getFromBundleId() != null)
            sb.append("fromBundleId: " + getFromBundleId() + ",");
        if (getIsFromAutoSnapshot() != null)
            sb.append("isFromAutoSnapshot: " + getIsFromAutoSnapshot() + ",");
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb());
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
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode
                + ((getFromAttachedDisks() == null) ? 0 : getFromAttachedDisks().hashCode());
        hashCode = prime * hashCode
                + ((getFromInstanceName() == null) ? 0 : getFromInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getFromInstanceArn() == null) ? 0 : getFromInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getFromBlueprintId() == null) ? 0 : getFromBlueprintId().hashCode());
        hashCode = prime * hashCode
                + ((getFromBundleId() == null) ? 0 : getFromBundleId().hashCode());
        hashCode = prime * hashCode
                + ((getIsFromAutoSnapshot() == null) ? 0 : getIsFromAutoSnapshot().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSnapshot == false)
            return false;
        InstanceSnapshot other = (InstanceSnapshot) obj;

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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getFromAttachedDisks() == null ^ this.getFromAttachedDisks() == null)
            return false;
        if (other.getFromAttachedDisks() != null
                && other.getFromAttachedDisks().equals(this.getFromAttachedDisks()) == false)
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
        if (other.getFromBlueprintId() == null ^ this.getFromBlueprintId() == null)
            return false;
        if (other.getFromBlueprintId() != null
                && other.getFromBlueprintId().equals(this.getFromBlueprintId()) == false)
            return false;
        if (other.getFromBundleId() == null ^ this.getFromBundleId() == null)
            return false;
        if (other.getFromBundleId() != null
                && other.getFromBundleId().equals(this.getFromBundleId()) == false)
            return false;
        if (other.getIsFromAutoSnapshot() == null ^ this.getIsFromAutoSnapshot() == null)
            return false;
        if (other.getIsFromAutoSnapshot() != null
                && other.getIsFromAutoSnapshot().equals(this.getIsFromAutoSnapshot()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        return true;
    }
}
