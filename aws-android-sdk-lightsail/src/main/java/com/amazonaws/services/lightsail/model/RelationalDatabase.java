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
 * Describes a database.
 * </p>
 */
public class RelationalDatabase implements Serializable {
    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The support code for the database. Include this code in your email to
     * support when you have questions about a database in Lightsail. This code
     * enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type for the database (for example,
     * <code>RelationalDatabase</code>).
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
     * The blueprint ID for the database. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String relationalDatabaseBlueprintId;

    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String relationalDatabaseBundleId;

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     */
    private String masterDatabaseName;

    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     */
    private RelationalDatabaseHardware hardware;

    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String state;

    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability
     * database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high
     * availability database.
     * </p>
     */
    private String secondaryAvailabilityZone;

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled
     * for the database.
     * </p>
     */
    private Boolean backupRetentionEnabled;

    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     */
    private PendingModifiedRelationalDatabaseValues pendingModifiedValues;

    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String engine;

    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String engineVersion;

    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted
     * in Unix time.
     * </p>
     */
    private java.util.Date latestRestorableTime;

    /**
     * <p>
     * The master user name of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String masterUsername;

    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String parameterApplyStatus;

    /**
     * <p>
     * The daily time range during which automated backups are created for the
     * database (for example, <code>16:00-16:30</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String preferredBackupWindow;

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the
     * database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example,
     * <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     */
    private RelationalDatabaseEndpoint masterEndpoint;

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     */
    private java.util.List<PendingMaintenanceAction> pendingMaintenanceActions;

    /**
     * <p>
     * The certificate associated with the database.
     * </p>
     */
    private String caCertificateIdentifier;

    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique name of the database resource in Lightsail.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The unique name of the database resource in Lightsail.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The unique name of the database resource in Lightsail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the database.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the database.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The support code for the database. Include this code in your email to
     * support when you have questions about a database in Lightsail. This code
     * enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     *
     * @return <p>
     *         The support code for the database. Include this code in your
     *         email to support when you have questions about a database in
     *         Lightsail. This code enables our support team to look up your
     *         Lightsail information more easily.
     *         </p>
     */
    public String getSupportCode() {
        return supportCode;
    }

    /**
     * <p>
     * The support code for the database. Include this code in your email to
     * support when you have questions about a database in Lightsail. This code
     * enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     *
     * @param supportCode <p>
     *            The support code for the database. Include this code in your
     *            email to support when you have questions about a database in
     *            Lightsail. This code enables our support team to look up your
     *            Lightsail information more easily.
     *            </p>
     */
    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code for the database. Include this code in your email to
     * support when you have questions about a database in Lightsail. This code
     * enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportCode <p>
     *            The support code for the database. Include this code in your
     *            email to support when you have questions about a database in
     *            Lightsail. This code enables our support team to look up your
     *            Lightsail information more easily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     *
     * @return <p>
     *         The timestamp when the database was created. Formatted in Unix
     *         time.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the database was created. Formatted in Unix
     *            time.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the database was created. Formatted in Unix
     *            time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     *
     * @return <p>
     *         The Region name and Availability Zone where the database is
     *         located.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     *
     * @param location <p>
     *            The Region name and Availability Zone where the database is
     *            located.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The Region name and Availability Zone where the database is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example,
     * <code>RelationalDatabase</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type for the database (for example,
     *         <code>RelationalDatabase</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example,
     * <code>RelationalDatabase</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type for the database (for example,
     *            <code>RelationalDatabase</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example,
     * <code>RelationalDatabase</code>).
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
     *            The Lightsail resource type for the database (for example,
     *            <code>RelationalDatabase</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public RelationalDatabase withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example,
     * <code>RelationalDatabase</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type for the database (for example,
     *            <code>RelationalDatabase</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example,
     * <code>RelationalDatabase</code>).
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
     *            The Lightsail resource type for the database (for example,
     *            <code>RelationalDatabase</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public RelationalDatabase withResourceType(ResourceType resourceType) {
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
    public RelationalDatabase withTags(Tag... tags) {
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
    public RelationalDatabase withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The blueprint ID for the database. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The blueprint ID for the database. A blueprint describes the
     *         major engine version of a database.
     *         </p>
     */
    public String getRelationalDatabaseBlueprintId() {
        return relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for the database. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param relationalDatabaseBlueprintId <p>
     *            The blueprint ID for the database. A blueprint describes the
     *            major engine version of a database.
     *            </p>
     */
    public void setRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
        this.relationalDatabaseBlueprintId = relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for the database. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param relationalDatabaseBlueprintId <p>
     *            The blueprint ID for the database. A blueprint describes the
     *            major engine version of a database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
        this.relationalDatabaseBlueprintId = relationalDatabaseBlueprintId;
        return this;
    }

    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The bundle ID for the database. A bundle describes the
     *         performance specifications for your database.
     *         </p>
     */
    public String getRelationalDatabaseBundleId() {
        return relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param relationalDatabaseBundleId <p>
     *            The bundle ID for the database. A bundle describes the
     *            performance specifications for your database.
     *            </p>
     */
    public void setRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param relationalDatabaseBundleId <p>
     *            The bundle ID for the database. A bundle describes the
     *            performance specifications for your database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
        return this;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     *
     * @return <p>
     *         The name of the master database created when the Lightsail
     *         database resource is created.
     *         </p>
     */
    public String getMasterDatabaseName() {
        return masterDatabaseName;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     *
     * @param masterDatabaseName <p>
     *            The name of the master database created when the Lightsail
     *            database resource is created.
     *            </p>
     */
    public void setMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterDatabaseName <p>
     *            The name of the master database created when the Lightsail
     *            database resource is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
        return this;
    }

    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     *
     * @return <p>
     *         Describes the hardware of the database.
     *         </p>
     */
    public RelationalDatabaseHardware getHardware() {
        return hardware;
    }

    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     *
     * @param hardware <p>
     *            Describes the hardware of the database.
     *            </p>
     */
    public void setHardware(RelationalDatabaseHardware hardware) {
        this.hardware = hardware;
    }

    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hardware <p>
     *            Describes the hardware of the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withHardware(RelationalDatabaseHardware hardware) {
        this.hardware = hardware;
        return this;
    }

    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Describes the current state of the database.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param state <p>
     *            Describes the current state of the database.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param state <p>
     *            Describes the current state of the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability
     * database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high
     * availability database.
     * </p>
     *
     * @return <p>
     *         Describes the secondary Availability Zone of a high availability
     *         database.
     *         </p>
     *         <p>
     *         The secondary database is used for failover support of a high
     *         availability database.
     *         </p>
     */
    public String getSecondaryAvailabilityZone() {
        return secondaryAvailabilityZone;
    }

    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability
     * database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high
     * availability database.
     * </p>
     *
     * @param secondaryAvailabilityZone <p>
     *            Describes the secondary Availability Zone of a high
     *            availability database.
     *            </p>
     *            <p>
     *            The secondary database is used for failover support of a high
     *            availability database.
     *            </p>
     */
    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability
     * database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high
     * availability database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryAvailabilityZone <p>
     *            Describes the secondary Availability Zone of a high
     *            availability database.
     *            </p>
     *            <p>
     *            The secondary database is used for failover support of a high
     *            availability database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled
     * for the database.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether automated backup retention is
     *         enabled for the database.
     *         </p>
     */
    public Boolean isBackupRetentionEnabled() {
        return backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled
     * for the database.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether automated backup retention is
     *         enabled for the database.
     *         </p>
     */
    public Boolean getBackupRetentionEnabled() {
        return backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled
     * for the database.
     * </p>
     *
     * @param backupRetentionEnabled <p>
     *            A Boolean value indicating whether automated backup retention
     *            is enabled for the database.
     *            </p>
     */
    public void setBackupRetentionEnabled(Boolean backupRetentionEnabled) {
        this.backupRetentionEnabled = backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled
     * for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionEnabled <p>
     *            A Boolean value indicating whether automated backup retention
     *            is enabled for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withBackupRetentionEnabled(Boolean backupRetentionEnabled) {
        this.backupRetentionEnabled = backupRetentionEnabled;
        return this;
    }

    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     *
     * @return <p>
     *         Describes pending database value modifications.
     *         </p>
     */
    public PendingModifiedRelationalDatabaseValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }

    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     *
     * @param pendingModifiedValues <p>
     *            Describes pending database value modifications.
     *            </p>
     */
    public void setPendingModifiedValues(
            PendingModifiedRelationalDatabaseValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingModifiedValues <p>
     *            Describes pending database value modifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withPendingModifiedValues(
            PendingModifiedRelationalDatabaseValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The database software (for example, <code>MySQL</code>).
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engine <p>
     *            The database software (for example, <code>MySQL</code>).
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engine <p>
     *            The database software (for example, <code>MySQL</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The database engine version (for example, <code>5.7.23</code>).
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engineVersion <p>
     *            The database engine version (for example, <code>5.7.23</code>
     *            ).
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engineVersion <p>
     *            The database engine version (for example, <code>5.7.23</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted
     * in Unix time.
     * </p>
     *
     * @return <p>
     *         The latest point in time to which the database can be restored.
     *         Formatted in Unix time.
     *         </p>
     */
    public java.util.Date getLatestRestorableTime() {
        return latestRestorableTime;
    }

    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted
     * in Unix time.
     * </p>
     *
     * @param latestRestorableTime <p>
     *            The latest point in time to which the database can be
     *            restored. Formatted in Unix time.
     *            </p>
     */
    public void setLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted
     * in Unix time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestRestorableTime <p>
     *            The latest point in time to which the database can be
     *            restored. Formatted in Unix time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
        return this;
    }

    /**
     * <p>
     * The master user name of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The master user name of the database.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * The master user name of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterUsername <p>
     *            The master user name of the database.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name of the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterUsername <p>
     *            The master user name of the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The status of parameter updates for the database.
     *         </p>
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates for the database.
     *            </p>
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for the
     * database (for example, <code>16:00-16:30</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The daily time range during which automated backups are created
     *         for the database (for example, <code>16:00-16:30</code>).
     *         </p>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for the
     * database (for example, <code>16:00-16:30</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param preferredBackupWindow <p>
     *            The daily time range during which automated backups are
     *            created for the database (for example,
     *            <code>16:00-16:30</code>).
     *            </p>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for the
     * database (for example, <code>16:00-16:30</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param preferredBackupWindow <p>
     *            The daily time range during which automated backups are
     *            created for the database (for example,
     *            <code>16:00-16:30</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the
     * database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example,
     * <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The weekly time range during which system maintenance can occur
     *         on the database.
     *         </p>
     *         <p>
     *         In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example,
     *         <code>Tue:17:00-Tue:17:30</code>.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the
     * database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example,
     * <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur on the database.
     *            </p>
     *            <p>
     *            In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For
     *            example, <code>Tue:17:00-Tue:17:30</code>.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the
     * database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example,
     * <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur on the database.
     *            </p>
     *            <p>
     *            In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For
     *            example, <code>Tue:17:00-Tue:17:30</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the database is publicly
     *         accessible.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the database is publicly
     *         accessible.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            A Boolean value indicating whether the database is publicly
     *            accessible.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            A Boolean value indicating whether the database is publicly
     *            accessible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     *
     * @return <p>
     *         The master endpoint for the database.
     *         </p>
     */
    public RelationalDatabaseEndpoint getMasterEndpoint() {
        return masterEndpoint;
    }

    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     *
     * @param masterEndpoint <p>
     *            The master endpoint for the database.
     *            </p>
     */
    public void setMasterEndpoint(RelationalDatabaseEndpoint masterEndpoint) {
        this.masterEndpoint = masterEndpoint;
    }

    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterEndpoint <p>
     *            The master endpoint for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withMasterEndpoint(RelationalDatabaseEndpoint masterEndpoint) {
        this.masterEndpoint = masterEndpoint;
        return this;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     *
     * @return <p>
     *         Describes the pending maintenance actions for the database.
     *         </p>
     */
    public java.util.List<PendingMaintenanceAction> getPendingMaintenanceActions() {
        return pendingMaintenanceActions;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     *
     * @param pendingMaintenanceActions <p>
     *            Describes the pending maintenance actions for the database.
     *            </p>
     */
    public void setPendingMaintenanceActions(
            java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActions) {
        if (pendingMaintenanceActions == null) {
            this.pendingMaintenanceActions = null;
            return;
        }

        this.pendingMaintenanceActions = new java.util.ArrayList<PendingMaintenanceAction>(
                pendingMaintenanceActions);
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingMaintenanceActions <p>
     *            Describes the pending maintenance actions for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withPendingMaintenanceActions(
            PendingMaintenanceAction... pendingMaintenanceActions) {
        if (getPendingMaintenanceActions() == null) {
            this.pendingMaintenanceActions = new java.util.ArrayList<PendingMaintenanceAction>(
                    pendingMaintenanceActions.length);
        }
        for (PendingMaintenanceAction value : pendingMaintenanceActions) {
            this.pendingMaintenanceActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingMaintenanceActions <p>
     *            Describes the pending maintenance actions for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withPendingMaintenanceActions(
            java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActions) {
        setPendingMaintenanceActions(pendingMaintenanceActions);
        return this;
    }

    /**
     * <p>
     * The certificate associated with the database.
     * </p>
     *
     * @return <p>
     *         The certificate associated with the database.
     *         </p>
     */
    public String getCaCertificateIdentifier() {
        return caCertificateIdentifier;
    }

    /**
     * <p>
     * The certificate associated with the database.
     * </p>
     *
     * @param caCertificateIdentifier <p>
     *            The certificate associated with the database.
     *            </p>
     */
    public void setCaCertificateIdentifier(String caCertificateIdentifier) {
        this.caCertificateIdentifier = caCertificateIdentifier;
    }

    /**
     * <p>
     * The certificate associated with the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caCertificateIdentifier <p>
     *            The certificate associated with the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabase withCaCertificateIdentifier(String caCertificateIdentifier) {
        this.caCertificateIdentifier = caCertificateIdentifier;
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
        if (getRelationalDatabaseBlueprintId() != null)
            sb.append("relationalDatabaseBlueprintId: " + getRelationalDatabaseBlueprintId() + ",");
        if (getRelationalDatabaseBundleId() != null)
            sb.append("relationalDatabaseBundleId: " + getRelationalDatabaseBundleId() + ",");
        if (getMasterDatabaseName() != null)
            sb.append("masterDatabaseName: " + getMasterDatabaseName() + ",");
        if (getHardware() != null)
            sb.append("hardware: " + getHardware() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getSecondaryAvailabilityZone() != null)
            sb.append("secondaryAvailabilityZone: " + getSecondaryAvailabilityZone() + ",");
        if (getBackupRetentionEnabled() != null)
            sb.append("backupRetentionEnabled: " + getBackupRetentionEnabled() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("pendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getEngine() != null)
            sb.append("engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("engineVersion: " + getEngineVersion() + ",");
        if (getLatestRestorableTime() != null)
            sb.append("latestRestorableTime: " + getLatestRestorableTime() + ",");
        if (getMasterUsername() != null)
            sb.append("masterUsername: " + getMasterUsername() + ",");
        if (getParameterApplyStatus() != null)
            sb.append("parameterApplyStatus: " + getParameterApplyStatus() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("preferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("preferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("publiclyAccessible: " + getPubliclyAccessible() + ",");
        if (getMasterEndpoint() != null)
            sb.append("masterEndpoint: " + getMasterEndpoint() + ",");
        if (getPendingMaintenanceActions() != null)
            sb.append("pendingMaintenanceActions: " + getPendingMaintenanceActions() + ",");
        if (getCaCertificateIdentifier() != null)
            sb.append("caCertificateIdentifier: " + getCaCertificateIdentifier());
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
        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseBlueprintId() == null) ? 0
                        : getRelationalDatabaseBlueprintId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseBundleId() == null) ? 0 : getRelationalDatabaseBundleId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMasterDatabaseName() == null) ? 0 : getMasterDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getHardware() == null) ? 0 : getHardware().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionEnabled() == null) ? 0 : getBackupRetentionEnabled()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode
                + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode
                + ((getMasterEndpoint() == null) ? 0 : getMasterEndpoint().hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingMaintenanceActions() == null) ? 0 : getPendingMaintenanceActions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCaCertificateIdentifier() == null) ? 0 : getCaCertificateIdentifier()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabase == false)
            return false;
        RelationalDatabase other = (RelationalDatabase) obj;

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
        if (other.getRelationalDatabaseBlueprintId() == null
                ^ this.getRelationalDatabaseBlueprintId() == null)
            return false;
        if (other.getRelationalDatabaseBlueprintId() != null
                && other.getRelationalDatabaseBlueprintId().equals(
                        this.getRelationalDatabaseBlueprintId()) == false)
            return false;
        if (other.getRelationalDatabaseBundleId() == null
                ^ this.getRelationalDatabaseBundleId() == null)
            return false;
        if (other.getRelationalDatabaseBundleId() != null
                && other.getRelationalDatabaseBundleId().equals(
                        this.getRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getMasterDatabaseName() == null ^ this.getMasterDatabaseName() == null)
            return false;
        if (other.getMasterDatabaseName() != null
                && other.getMasterDatabaseName().equals(this.getMasterDatabaseName()) == false)
            return false;
        if (other.getHardware() == null ^ this.getHardware() == null)
            return false;
        if (other.getHardware() != null && other.getHardware().equals(this.getHardware()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSecondaryAvailabilityZone() == null
                ^ this.getSecondaryAvailabilityZone() == null)
            return false;
        if (other.getSecondaryAvailabilityZone() != null
                && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false)
            return false;
        if (other.getBackupRetentionEnabled() == null ^ this.getBackupRetentionEnabled() == null)
            return false;
        if (other.getBackupRetentionEnabled() != null
                && other.getBackupRetentionEnabled().equals(this.getBackupRetentionEnabled()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
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
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null
                && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null
                && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getMasterEndpoint() == null ^ this.getMasterEndpoint() == null)
            return false;
        if (other.getMasterEndpoint() != null
                && other.getMasterEndpoint().equals(this.getMasterEndpoint()) == false)
            return false;
        if (other.getPendingMaintenanceActions() == null
                ^ this.getPendingMaintenanceActions() == null)
            return false;
        if (other.getPendingMaintenanceActions() != null
                && other.getPendingMaintenanceActions().equals(this.getPendingMaintenanceActions()) == false)
            return false;
        if (other.getCaCertificateIdentifier() == null ^ this.getCaCertificateIdentifier() == null)
            return false;
        if (other.getCaCertificateIdentifier() != null
                && other.getCaCertificateIdentifier().equals(this.getCaCertificateIdentifier()) == false)
            return false;
        return true;
    }
}
