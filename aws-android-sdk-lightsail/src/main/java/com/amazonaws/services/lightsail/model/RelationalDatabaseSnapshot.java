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
 * Describes a database snapshot.
 * </p>
 */
public class RelationalDatabaseSnapshot implements Serializable {
    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The support code for the database snapshot. Include this code in your
     * email to support when you have questions about a database snapshot in
     * Lightsail. This code enables our support team to look up your Lightsail
     * information more easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is
     * located.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type.
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
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String engine;

    /**
     * <p>
     * The database engine version for the database snapshot (for example,
     * <code>5.7.23</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String engineVersion;

    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the
     * database snapshot.
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String state;

    /**
     * <p>
     * The name of the source database from which the database snapshot was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromRelationalDatabaseName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database
     * snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromRelationalDatabaseArn;

    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was
     * created.
     * </p>
     */
    private String fromRelationalDatabaseBundleId;

    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was
     * created. A blueprint describes the major engine version of a database.
     * </p>
     */
    private String fromRelationalDatabaseBlueprintId;

    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the database snapshot.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the database snapshot.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the database snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the database snapshot.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the database snapshot.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the database snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The support code for the database snapshot. Include this code in your
     * email to support when you have questions about a database snapshot in
     * Lightsail. This code enables our support team to look up your Lightsail
     * information more easily.
     * </p>
     *
     * @return <p>
     *         The support code for the database snapshot. Include this code in
     *         your email to support when you have questions about a database
     *         snapshot in Lightsail. This code enables our support team to look
     *         up your Lightsail information more easily.
     *         </p>
     */
    public String getSupportCode() {
        return supportCode;
    }

    /**
     * <p>
     * The support code for the database snapshot. Include this code in your
     * email to support when you have questions about a database snapshot in
     * Lightsail. This code enables our support team to look up your Lightsail
     * information more easily.
     * </p>
     *
     * @param supportCode <p>
     *            The support code for the database snapshot. Include this code
     *            in your email to support when you have questions about a
     *            database snapshot in Lightsail. This code enables our support
     *            team to look up your Lightsail information more easily.
     *            </p>
     */
    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code for the database snapshot. Include this code in your
     * email to support when you have questions about a database snapshot in
     * Lightsail. This code enables our support team to look up your Lightsail
     * information more easily.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportCode <p>
     *            The support code for the database snapshot. Include this code
     *            in your email to support when you have questions about a
     *            database snapshot in Lightsail. This code enables our support
     *            team to look up your Lightsail information more easily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the database snapshot was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the database snapshot was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the database snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is
     * located.
     * </p>
     *
     * @return <p>
     *         The Region name and Availability Zone where the database snapshot
     *         is located.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is
     * located.
     * </p>
     *
     * @param location <p>
     *            The Region name and Availability Zone where the database
     *            snapshot is located.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is
     * located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The Region name and Availability Zone where the database
     *            snapshot is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type.
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
     *            The Lightsail resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public RelationalDatabaseSnapshot withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type.
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
     *            The Lightsail resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public RelationalDatabaseSnapshot withResourceType(ResourceType resourceType) {
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
    public RelationalDatabaseSnapshot withTags(Tag... tags) {
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
    public RelationalDatabaseSnapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The software of the database snapshot (for example,
     *         <code>MySQL</code>)
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engine <p>
     *            The software of the database snapshot (for example,
     *            <code>MySQL</code>)
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engine <p>
     *            The software of the database snapshot (for example,
     *            <code>MySQL</code>)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The database engine version for the database snapshot (for example,
     * <code>5.7.23</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The database engine version for the database snapshot (for
     *         example, <code>5.7.23</code>).
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database snapshot (for example,
     * <code>5.7.23</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engineVersion <p>
     *            The database engine version for the database snapshot (for
     *            example, <code>5.7.23</code>).
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database snapshot (for example,
     * <code>5.7.23</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engineVersion <p>
     *            The database engine version for the database snapshot (for
     *            example, <code>5.7.23</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the
     * database snapshot.
     * </p>
     *
     * @return <p>
     *         The size of the disk in GB (for example, <code>32</code>) for the
     *         database snapshot.
     *         </p>
     */
    public Integer getSizeInGb() {
        return sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the
     * database snapshot.
     * </p>
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB (for example, <code>32</code>) for
     *            the database snapshot.
     *            </p>
     */
    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the
     * database snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB (for example, <code>32</code>) for
     *            the database snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
        return this;
    }

    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The state of the database snapshot.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param state <p>
     *            The state of the database snapshot.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param state <p>
     *            The state of the database snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The name of the source database from which the database snapshot was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the source database from which the database snapshot
     *         was created.
     *         </p>
     */
    public String getFromRelationalDatabaseName() {
        return fromRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database from which the database snapshot was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromRelationalDatabaseName <p>
     *            The name of the source database from which the database
     *            snapshot was created.
     *            </p>
     */
    public void setFromRelationalDatabaseName(String fromRelationalDatabaseName) {
        this.fromRelationalDatabaseName = fromRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database from which the database snapshot was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromRelationalDatabaseName <p>
     *            The name of the source database from which the database
     *            snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withFromRelationalDatabaseName(
            String fromRelationalDatabaseName) {
        this.fromRelationalDatabaseName = fromRelationalDatabaseName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database
     * snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the database from which the
     *         database snapshot was created.
     *         </p>
     */
    public String getFromRelationalDatabaseArn() {
        return fromRelationalDatabaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database
     * snapshot was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromRelationalDatabaseArn <p>
     *            The Amazon Resource Name (ARN) of the database from which the
     *            database snapshot was created.
     *            </p>
     */
    public void setFromRelationalDatabaseArn(String fromRelationalDatabaseArn) {
        this.fromRelationalDatabaseArn = fromRelationalDatabaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database
     * snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromRelationalDatabaseArn <p>
     *            The Amazon Resource Name (ARN) of the database from which the
     *            database snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withFromRelationalDatabaseArn(String fromRelationalDatabaseArn) {
        this.fromRelationalDatabaseArn = fromRelationalDatabaseArn;
        return this;
    }

    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was
     * created.
     * </p>
     *
     * @return <p>
     *         The bundle ID of the database from which the database snapshot
     *         was created.
     *         </p>
     */
    public String getFromRelationalDatabaseBundleId() {
        return fromRelationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was
     * created.
     * </p>
     *
     * @param fromRelationalDatabaseBundleId <p>
     *            The bundle ID of the database from which the database snapshot
     *            was created.
     *            </p>
     */
    public void setFromRelationalDatabaseBundleId(String fromRelationalDatabaseBundleId) {
        this.fromRelationalDatabaseBundleId = fromRelationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromRelationalDatabaseBundleId <p>
     *            The bundle ID of the database from which the database snapshot
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withFromRelationalDatabaseBundleId(
            String fromRelationalDatabaseBundleId) {
        this.fromRelationalDatabaseBundleId = fromRelationalDatabaseBundleId;
        return this;
    }

    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was
     * created. A blueprint describes the major engine version of a database.
     * </p>
     *
     * @return <p>
     *         The blueprint ID of the database from which the database snapshot
     *         was created. A blueprint describes the major engine version of a
     *         database.
     *         </p>
     */
    public String getFromRelationalDatabaseBlueprintId() {
        return fromRelationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was
     * created. A blueprint describes the major engine version of a database.
     * </p>
     *
     * @param fromRelationalDatabaseBlueprintId <p>
     *            The blueprint ID of the database from which the database
     *            snapshot was created. A blueprint describes the major engine
     *            version of a database.
     *            </p>
     */
    public void setFromRelationalDatabaseBlueprintId(String fromRelationalDatabaseBlueprintId) {
        this.fromRelationalDatabaseBlueprintId = fromRelationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was
     * created. A blueprint describes the major engine version of a database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromRelationalDatabaseBlueprintId <p>
     *            The blueprint ID of the database from which the database
     *            snapshot was created. A blueprint describes the major engine
     *            version of a database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseSnapshot withFromRelationalDatabaseBlueprintId(
            String fromRelationalDatabaseBlueprintId) {
        this.fromRelationalDatabaseBlueprintId = fromRelationalDatabaseBlueprintId;
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
        if (getEngine() != null)
            sb.append("engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("engineVersion: " + getEngineVersion() + ",");
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getFromRelationalDatabaseName() != null)
            sb.append("fromRelationalDatabaseName: " + getFromRelationalDatabaseName() + ",");
        if (getFromRelationalDatabaseArn() != null)
            sb.append("fromRelationalDatabaseArn: " + getFromRelationalDatabaseArn() + ",");
        if (getFromRelationalDatabaseBundleId() != null)
            sb.append("fromRelationalDatabaseBundleId: " + getFromRelationalDatabaseBundleId()
                    + ",");
        if (getFromRelationalDatabaseBlueprintId() != null)
            sb.append("fromRelationalDatabaseBlueprintId: "
                    + getFromRelationalDatabaseBlueprintId());
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
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getFromRelationalDatabaseName() == null) ? 0 : getFromRelationalDatabaseName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFromRelationalDatabaseArn() == null) ? 0 : getFromRelationalDatabaseArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFromRelationalDatabaseBundleId() == null) ? 0
                        : getFromRelationalDatabaseBundleId().hashCode());
        hashCode = prime
                * hashCode
                + ((getFromRelationalDatabaseBlueprintId() == null) ? 0
                        : getFromRelationalDatabaseBlueprintId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseSnapshot == false)
            return false;
        RelationalDatabaseSnapshot other = (RelationalDatabaseSnapshot) obj;

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
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getFromRelationalDatabaseName() == null
                ^ this.getFromRelationalDatabaseName() == null)
            return false;
        if (other.getFromRelationalDatabaseName() != null
                && other.getFromRelationalDatabaseName().equals(
                        this.getFromRelationalDatabaseName()) == false)
            return false;
        if (other.getFromRelationalDatabaseArn() == null
                ^ this.getFromRelationalDatabaseArn() == null)
            return false;
        if (other.getFromRelationalDatabaseArn() != null
                && other.getFromRelationalDatabaseArn().equals(this.getFromRelationalDatabaseArn()) == false)
            return false;
        if (other.getFromRelationalDatabaseBundleId() == null
                ^ this.getFromRelationalDatabaseBundleId() == null)
            return false;
        if (other.getFromRelationalDatabaseBundleId() != null
                && other.getFromRelationalDatabaseBundleId().equals(
                        this.getFromRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getFromRelationalDatabaseBlueprintId() == null
                ^ this.getFromRelationalDatabaseBlueprintId() == null)
            return false;
        if (other.getFromRelationalDatabaseBlueprintId() != null
                && other.getFromRelationalDatabaseBlueprintId().equals(
                        this.getFromRelationalDatabaseBlueprintId()) == false)
            return false;
        return true;
    }
}
