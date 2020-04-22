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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a snapshot.
 * </p>
 */
public class Snapshot implements Serializable {
    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A
     * snapshot contains a copy of the cluster data as of this exact time.
     * </p>
     */
    private java.util.Date snapshotCreateTime;

    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation
     * used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns
     * status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     */
    private java.util.Date clusterCreateTime;

    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     */
    private String masterUsername;

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     */
    private String clusterVersion;

    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a>
     * and <a>CopyClusterSnapshot</a> are of type "manual".
     * </p>
     */
    private String snapshotType;

    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     */
    private String dBName;

    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a
     * VPC. Otherwise, this field is not in the output.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * was used to encrypt data in the cluster from which the snapshot was
     * taken.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the
     * HSM keys of the source cluster. <code>true</code> indicates that the data
     * is encrypted using HSM keys.
     * </p>
     */
    private Boolean encryptedWithHSM;

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot.
     * Returns <code>null</code> if no accounts are authorized. Visible only to
     * the snapshot owner.
     * </p>
     */
    private java.util.List<AccountWithRestoreAccess> accountsWithRestoreAccess;

    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the
     * snapshot. For automatic snapshots, the owner of the cluster. The owner
     * can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore
     * the cluster.
     * </p>
     */
    private Double totalBackupSizeInMegaBytes;

    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     */
    private Double actualIncrementalBackupSizeInMegaBytes;

    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     * </p>
     */
    private Double backupProgressInMegaBytes;

    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     * </p>
     */
    private Double currentBackupRateInMegaBytesPerSecond;

    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     * </p>
     */
    private Long estimatedSecondsToCompletion;

    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     * </p>
     */
    private Long elapsedTimeInSeconds;

    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     */
    private String sourceRegion;

    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore
     * into.
     * </p>
     */
    private java.util.List<String> restorableNodeTypes;

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean enhancedVpcRouting;

    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     */
    private String maintenanceTrackName;

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;

    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention
     * period.
     * </p>
     */
    private Integer manualSnapshotRemainingDays;

    /**
     * <p>
     * A timestamp representing the start of the retention period for the
     * snapshot.
     * </p>
     */
    private java.util.Date snapshotRetentionStartTime;

    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     *
     * @return <p>
     *         The snapshot identifier that is provided in the request.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The snapshot identifier that is provided in the request.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The snapshot identifier that is provided in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster for which the snapshot was taken.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster for which the snapshot was
     *            taken.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster for which the snapshot was
     *            taken.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A
     * snapshot contains a copy of the cluster data as of this exact time.
     * </p>
     *
     * @return <p>
     *         The time (in UTC format) when Amazon Redshift began the snapshot.
     *         A snapshot contains a copy of the cluster data as of this exact
     *         time.
     *         </p>
     */
    public java.util.Date getSnapshotCreateTime() {
        return snapshotCreateTime;
    }

    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A
     * snapshot contains a copy of the cluster data as of this exact time.
     * </p>
     *
     * @param snapshotCreateTime <p>
     *            The time (in UTC format) when Amazon Redshift began the
     *            snapshot. A snapshot contains a copy of the cluster data as of
     *            this exact time.
     *            </p>
     */
    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A
     * snapshot contains a copy of the cluster data as of this exact time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCreateTime <p>
     *            The time (in UTC format) when Amazon Redshift began the
     *            snapshot. A snapshot contains a copy of the cluster data as of
     *            this exact time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
        return this;
    }

    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation
     * used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns
     * status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The snapshot status. The value of the status depends on the API
     *         operation used:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a>
     *         returns status as "creating".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>DescribeClusterSnapshots</a> returns status as "creating",
     *         "available", "final snapshot", or "failed".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>DeleteClusterSnapshot</a> returns status as "deleted".
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation
     * used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns
     * status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The snapshot status. The value of the status depends on the
     *            API operation used:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a>
     *            returns status as "creating".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>DescribeClusterSnapshots</a> returns status as "creating",
     *            "available", "final snapshot", or "failed".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>DeleteClusterSnapshot</a> returns status as "deleted".
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation
     * used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns
     * status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The snapshot status. The value of the status depends on the
     *            API operation used:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a>
     *            returns status as "creating".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>DescribeClusterSnapshots</a> returns status as "creating",
     *            "available", "final snapshot", or "failed".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>DeleteClusterSnapshot</a> returns status as "deleted".
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     *
     * @return <p>
     *         The port that the cluster is listening on.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     *
     * @param port <p>
     *            The port that the cluster is listening on.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port that the cluster is listening on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which the cluster was created.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the cluster was created.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the cluster was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     *
     * @return <p>
     *         The time (UTC) when the cluster was originally created.
     *         </p>
     */
    public java.util.Date getClusterCreateTime() {
        return clusterCreateTime;
    }

    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     *
     * @param clusterCreateTime <p>
     *            The time (UTC) when the cluster was originally created.
     *            </p>
     */
    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterCreateTime <p>
     *            The time (UTC) when the cluster was originally created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }

    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     *
     * @return <p>
     *         The master user name for the cluster.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     *
     * @param masterUsername <p>
     *            The master user name for the cluster.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            The master user name for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     *
     * @return <p>
     *         The version ID of the Amazon Redshift engine that is running on
     *         the cluster.
     *         </p>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     *
     * @param clusterVersion <p>
     *            The version ID of the Amazon Redshift engine that is running
     *            on the cluster.
     *            </p>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterVersion <p>
     *            The version ID of the Amazon Redshift engine that is running
     *            on the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a>
     * and <a>CopyClusterSnapshot</a> are of type "manual".
     * </p>
     *
     * @return <p>
     *         The snapshot type. Snapshots created using
     *         <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> are
     *         of type "manual".
     *         </p>
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a>
     * and <a>CopyClusterSnapshot</a> are of type "manual".
     * </p>
     *
     * @param snapshotType <p>
     *            The snapshot type. Snapshots created using
     *            <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a>
     *            are of type "manual".
     *            </p>
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a>
     * and <a>CopyClusterSnapshot</a> are of type "manual".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotType <p>
     *            The snapshot type. Snapshots created using
     *            <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a>
     *            are of type "manual".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     *
     * @return <p>
     *         The node type of the nodes in the cluster.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     *
     * @param nodeType <p>
     *            The node type of the nodes in the cluster.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type of the nodes in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     *
     * @return <p>
     *         The number of nodes in the cluster.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The number of nodes in the cluster.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The number of nodes in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     *
     * @return <p>
     *         The name of the database that was created when the cluster was
     *         created.
     *         </p>
     */
    public String getDBName() {
        return dBName;
    }

    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     *
     * @param dBName <p>
     *            The name of the database that was created when the cluster was
     *            created.
     *            </p>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBName <p>
     *            The name of the database that was created when the cluster was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a
     * VPC. Otherwise, this field is not in the output.
     * </p>
     *
     * @return <p>
     *         The VPC identifier of the cluster if the snapshot is from a
     *         cluster in a VPC. Otherwise, this field is not in the output.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a
     * VPC. Otherwise, this field is not in the output.
     * </p>
     *
     * @param vpcId <p>
     *            The VPC identifier of the cluster if the snapshot is from a
     *            cluster in a VPC. Otherwise, this field is not in the output.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a
     * VPC. Otherwise, this field is not in the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The VPC identifier of the cluster if the snapshot is from a
     *            cluster in a VPC. Otherwise, this field is not in the output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the data in the snapshot is encrypted at
     *         rest.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the data in the snapshot is encrypted at
     *         rest.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     *
     * @param encrypted <p>
     *            If <code>true</code>, the data in the snapshot is encrypted at
     *            rest.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            If <code>true</code>, the data in the snapshot is encrypted at
     *            rest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * was used to encrypt data in the cluster from which the snapshot was
     * taken.
     * </p>
     *
     * @return <p>
     *         The AWS Key Management Service (KMS) key ID of the encryption key
     *         that was used to encrypt data in the cluster from which the
     *         snapshot was taken.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * was used to encrypt data in the cluster from which the snapshot was
     * taken.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (KMS) key ID of the encryption
     *            key that was used to encrypt data in the cluster from which
     *            the snapshot was taken.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * was used to encrypt data in the cluster from which the snapshot was
     * taken.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (KMS) key ID of the encryption
     *            key that was used to encrypt data in the cluster from which
     *            the snapshot was taken.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the
     * HSM keys of the source cluster. <code>true</code> indicates that the data
     * is encrypted using HSM keys.
     * </p>
     *
     * @return <p>
     *         A boolean that indicates whether the snapshot data is encrypted
     *         using the HSM keys of the source cluster. <code>true</code>
     *         indicates that the data is encrypted using HSM keys.
     *         </p>
     */
    public Boolean isEncryptedWithHSM() {
        return encryptedWithHSM;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the
     * HSM keys of the source cluster. <code>true</code> indicates that the data
     * is encrypted using HSM keys.
     * </p>
     *
     * @return <p>
     *         A boolean that indicates whether the snapshot data is encrypted
     *         using the HSM keys of the source cluster. <code>true</code>
     *         indicates that the data is encrypted using HSM keys.
     *         </p>
     */
    public Boolean getEncryptedWithHSM() {
        return encryptedWithHSM;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the
     * HSM keys of the source cluster. <code>true</code> indicates that the data
     * is encrypted using HSM keys.
     * </p>
     *
     * @param encryptedWithHSM <p>
     *            A boolean that indicates whether the snapshot data is
     *            encrypted using the HSM keys of the source cluster.
     *            <code>true</code> indicates that the data is encrypted using
     *            HSM keys.
     *            </p>
     */
    public void setEncryptedWithHSM(Boolean encryptedWithHSM) {
        this.encryptedWithHSM = encryptedWithHSM;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the
     * HSM keys of the source cluster. <code>true</code> indicates that the data
     * is encrypted using HSM keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptedWithHSM <p>
     *            A boolean that indicates whether the snapshot data is
     *            encrypted using the HSM keys of the source cluster.
     *            <code>true</code> indicates that the data is encrypted using
     *            HSM keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withEncryptedWithHSM(Boolean encryptedWithHSM) {
        this.encryptedWithHSM = encryptedWithHSM;
        return this;
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot.
     * Returns <code>null</code> if no accounts are authorized. Visible only to
     * the snapshot owner.
     * </p>
     *
     * @return <p>
     *         A list of the AWS customer accounts authorized to restore the
     *         snapshot. Returns <code>null</code> if no accounts are
     *         authorized. Visible only to the snapshot owner.
     *         </p>
     */
    public java.util.List<AccountWithRestoreAccess> getAccountsWithRestoreAccess() {
        return accountsWithRestoreAccess;
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot.
     * Returns <code>null</code> if no accounts are authorized. Visible only to
     * the snapshot owner.
     * </p>
     *
     * @param accountsWithRestoreAccess <p>
     *            A list of the AWS customer accounts authorized to restore the
     *            snapshot. Returns <code>null</code> if no accounts are
     *            authorized. Visible only to the snapshot owner.
     *            </p>
     */
    public void setAccountsWithRestoreAccess(
            java.util.Collection<AccountWithRestoreAccess> accountsWithRestoreAccess) {
        if (accountsWithRestoreAccess == null) {
            this.accountsWithRestoreAccess = null;
            return;
        }

        this.accountsWithRestoreAccess = new java.util.ArrayList<AccountWithRestoreAccess>(
                accountsWithRestoreAccess);
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot.
     * Returns <code>null</code> if no accounts are authorized. Visible only to
     * the snapshot owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountsWithRestoreAccess <p>
     *            A list of the AWS customer accounts authorized to restore the
     *            snapshot. Returns <code>null</code> if no accounts are
     *            authorized. Visible only to the snapshot owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withAccountsWithRestoreAccess(
            AccountWithRestoreAccess... accountsWithRestoreAccess) {
        if (getAccountsWithRestoreAccess() == null) {
            this.accountsWithRestoreAccess = new java.util.ArrayList<AccountWithRestoreAccess>(
                    accountsWithRestoreAccess.length);
        }
        for (AccountWithRestoreAccess value : accountsWithRestoreAccess) {
            this.accountsWithRestoreAccess.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot.
     * Returns <code>null</code> if no accounts are authorized. Visible only to
     * the snapshot owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountsWithRestoreAccess <p>
     *            A list of the AWS customer accounts authorized to restore the
     *            snapshot. Returns <code>null</code> if no accounts are
     *            authorized. Visible only to the snapshot owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withAccountsWithRestoreAccess(
            java.util.Collection<AccountWithRestoreAccess> accountsWithRestoreAccess) {
        setAccountsWithRestoreAccess(accountsWithRestoreAccess);
        return this;
    }

    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the
     * snapshot. For automatic snapshots, the owner of the cluster. The owner
     * can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     *
     * @return <p>
     *         For manual snapshots, the AWS customer account used to create or
     *         copy the snapshot. For automatic snapshots, the owner of the
     *         cluster. The owner can perform all snapshot actions, such as
     *         sharing a manual snapshot.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the
     * snapshot. For automatic snapshots, the owner of the cluster. The owner
     * can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     *
     * @param ownerAccount <p>
     *            For manual snapshots, the AWS customer account used to create
     *            or copy the snapshot. For automatic snapshots, the owner of
     *            the cluster. The owner can perform all snapshot actions, such
     *            as sharing a manual snapshot.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the
     * snapshot. For automatic snapshots, the owner of the cluster. The owner
     * can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            For manual snapshots, the AWS customer account used to create
     *            or copy the snapshot. For automatic snapshots, the owner of
     *            the cluster. The owner can perform all snapshot actions, such
     *            as sharing a manual snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore
     * the cluster.
     * </p>
     *
     * @return <p>
     *         The size of the complete set of backup data that would be used to
     *         restore the cluster.
     *         </p>
     */
    public Double getTotalBackupSizeInMegaBytes() {
        return totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore
     * the cluster.
     * </p>
     *
     * @param totalBackupSizeInMegaBytes <p>
     *            The size of the complete set of backup data that would be used
     *            to restore the cluster.
     *            </p>
     */
    public void setTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore
     * the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalBackupSizeInMegaBytes <p>
     *            The size of the complete set of backup data that would be used
     *            to restore the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     *
     * @return <p>
     *         The size of the incremental backup.
     *         </p>
     */
    public Double getActualIncrementalBackupSizeInMegaBytes() {
        return actualIncrementalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     *
     * @param actualIncrementalBackupSizeInMegaBytes <p>
     *            The size of the incremental backup.
     *            </p>
     */
    public void setActualIncrementalBackupSizeInMegaBytes(
            Double actualIncrementalBackupSizeInMegaBytes) {
        this.actualIncrementalBackupSizeInMegaBytes = actualIncrementalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actualIncrementalBackupSizeInMegaBytes <p>
     *            The size of the incremental backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withActualIncrementalBackupSizeInMegaBytes(
            Double actualIncrementalBackupSizeInMegaBytes) {
        this.actualIncrementalBackupSizeInMegaBytes = actualIncrementalBackupSizeInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     * </p>
     *
     * @return <p>
     *         The number of megabytes that have been transferred to the
     *         snapshot backup.
     *         </p>
     */
    public Double getBackupProgressInMegaBytes() {
        return backupProgressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     * </p>
     *
     * @param backupProgressInMegaBytes <p>
     *            The number of megabytes that have been transferred to the
     *            snapshot backup.
     *            </p>
     */
    public void setBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        this.backupProgressInMegaBytes = backupProgressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupProgressInMegaBytes <p>
     *            The number of megabytes that have been transferred to the
     *            snapshot backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        this.backupProgressInMegaBytes = backupProgressInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     * </p>
     *
     * @return <p>
     *         The number of megabytes per second being transferred to the
     *         snapshot backup. Returns <code>0</code> for a completed backup.
     *         </p>
     */
    public Double getCurrentBackupRateInMegaBytesPerSecond() {
        return currentBackupRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     * </p>
     *
     * @param currentBackupRateInMegaBytesPerSecond <p>
     *            The number of megabytes per second being transferred to the
     *            snapshot backup. Returns <code>0</code> for a completed
     *            backup.
     *            </p>
     */
    public void setCurrentBackupRateInMegaBytesPerSecond(
            Double currentBackupRateInMegaBytesPerSecond) {
        this.currentBackupRateInMegaBytesPerSecond = currentBackupRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentBackupRateInMegaBytesPerSecond <p>
     *            The number of megabytes per second being transferred to the
     *            snapshot backup. Returns <code>0</code> for a completed
     *            backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withCurrentBackupRateInMegaBytesPerSecond(
            Double currentBackupRateInMegaBytesPerSecond) {
        this.currentBackupRateInMegaBytesPerSecond = currentBackupRateInMegaBytesPerSecond;
        return this;
    }

    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     * </p>
     *
     * @return <p>
     *         The estimate of the time remaining before the snapshot backup
     *         will complete. Returns <code>0</code> for a completed backup.
     *         </p>
     */
    public Long getEstimatedSecondsToCompletion() {
        return estimatedSecondsToCompletion;
    }

    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     * </p>
     *
     * @param estimatedSecondsToCompletion <p>
     *            The estimate of the time remaining before the snapshot backup
     *            will complete. Returns <code>0</code> for a completed backup.
     *            </p>
     */
    public void setEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        this.estimatedSecondsToCompletion = estimatedSecondsToCompletion;
    }

    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedSecondsToCompletion <p>
     *            The estimate of the time remaining before the snapshot backup
     *            will complete. Returns <code>0</code> for a completed backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        this.estimatedSecondsToCompletion = estimatedSecondsToCompletion;
        return this;
    }

    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     * </p>
     *
     * @return <p>
     *         The amount of time an in-progress snapshot backup has been
     *         running, or the amount of time it took a completed backup to
     *         finish.
     *         </p>
     */
    public Long getElapsedTimeInSeconds() {
        return elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     * </p>
     *
     * @param elapsedTimeInSeconds <p>
     *            The amount of time an in-progress snapshot backup has been
     *            running, or the amount of time it took a completed backup to
     *            finish.
     *            </p>
     */
    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elapsedTimeInSeconds <p>
     *            The amount of time an in-progress snapshot backup has been
     *            running, or the amount of time it took a completed backup to
     *            finish.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     *
     * @return <p>
     *         The source region from which the snapshot was copied.
     *         </p>
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     *
     * @param sourceRegion <p>
     *            The source region from which the snapshot was copied.
     *            </p>
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegion <p>
     *            The source region from which the snapshot was copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     *
     * @return <p>
     *         The list of tags for the cluster snapshot.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     *
     * @param tags <p>
     *            The list of tags for the cluster snapshot.
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
     * The list of tags for the cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withTags(Tag... tags) {
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
     * The list of tags for the cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore
     * into.
     * </p>
     *
     * @return <p>
     *         The list of node types that this cluster snapshot is able to
     *         restore into.
     *         </p>
     */
    public java.util.List<String> getRestorableNodeTypes() {
        return restorableNodeTypes;
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore
     * into.
     * </p>
     *
     * @param restorableNodeTypes <p>
     *            The list of node types that this cluster snapshot is able to
     *            restore into.
     *            </p>
     */
    public void setRestorableNodeTypes(java.util.Collection<String> restorableNodeTypes) {
        if (restorableNodeTypes == null) {
            this.restorableNodeTypes = null;
            return;
        }

        this.restorableNodeTypes = new java.util.ArrayList<String>(restorableNodeTypes);
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore
     * into.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restorableNodeTypes <p>
     *            The list of node types that this cluster snapshot is able to
     *            restore into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withRestorableNodeTypes(String... restorableNodeTypes) {
        if (getRestorableNodeTypes() == null) {
            this.restorableNodeTypes = new java.util.ArrayList<String>(restorableNodeTypes.length);
        }
        for (String value : restorableNodeTypes) {
            this.restorableNodeTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore
     * into.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restorableNodeTypes <p>
     *            The list of node types that this cluster snapshot is able to
     *            restore into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withRestorableNodeTypes(java.util.Collection<String> restorableNodeTypes) {
        setRestorableNodeTypes(restorableNodeTypes);
        return this;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     *
     * @return <p>
     *         An option that specifies whether to create the cluster with
     *         enhanced VPC routing enabled. To create a cluster that uses
     *         enhanced VPC routing, the cluster must be in a VPC. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *         >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *         Management Guide.
     *         </p>
     *         <p>
     *         If this option is <code>true</code>, enhanced VPC routing is
     *         enabled.
     *         </p>
     *         <p>
     *         Default: false
     *         </p>
     */
    public Boolean isEnhancedVpcRouting() {
        return enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     *
     * @return <p>
     *         An option that specifies whether to create the cluster with
     *         enhanced VPC routing enabled. To create a cluster that uses
     *         enhanced VPC routing, the cluster must be in a VPC. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *         >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *         Management Guide.
     *         </p>
     *         <p>
     *         If this option is <code>true</code>, enhanced VPC routing is
     *         enabled.
     *         </p>
     *         <p>
     *         Default: false
     *         </p>
     */
    public Boolean getEnhancedVpcRouting() {
        return enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     *
     * @param enhancedVpcRouting <p>
     *            An option that specifies whether to create the cluster with
     *            enhanced VPC routing enabled. To create a cluster that uses
     *            enhanced VPC routing, the cluster must be in a VPC. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *            >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *            Management Guide.
     *            </p>
     *            <p>
     *            If this option is <code>true</code>, enhanced VPC routing is
     *            enabled.
     *            </p>
     *            <p>
     *            Default: false
     *            </p>
     */
    public void setEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enhancedVpcRouting <p>
     *            An option that specifies whether to create the cluster with
     *            enhanced VPC routing enabled. To create a cluster that uses
     *            enhanced VPC routing, the cluster must be in a VPC. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *            >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *            Management Guide.
     *            </p>
     *            <p>
     *            If this option is <code>true</code>, enhanced VPC routing is
     *            enabled.
     *            </p>
     *            <p>
     *            Default: false
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
        return this;
    }

    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     *
     * @return <p>
     *         The name of the maintenance track for the snapshot.
     *         </p>
     */
    public String getMaintenanceTrackName() {
        return maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track for the snapshot.
     *            </p>
     */
    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @return <p>
     *         The number of days that a manual snapshot is retained. If the
     *         value is -1, the manual snapshot is retained indefinitely.
     *         </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     */
    public Integer getManualSnapshotRetentionPeriod() {
        return manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If the
     *            value is -1, the manual snapshot is retained indefinitely.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     */
    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is
     * -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The number of days that a manual snapshot is retained. If the
     *            value is -1, the manual snapshot is retained indefinitely.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention
     * period.
     * </p>
     *
     * @return <p>
     *         The number of days until a manual snapshot will pass its
     *         retention period.
     *         </p>
     */
    public Integer getManualSnapshotRemainingDays() {
        return manualSnapshotRemainingDays;
    }

    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention
     * period.
     * </p>
     *
     * @param manualSnapshotRemainingDays <p>
     *            The number of days until a manual snapshot will pass its
     *            retention period.
     *            </p>
     */
    public void setManualSnapshotRemainingDays(Integer manualSnapshotRemainingDays) {
        this.manualSnapshotRemainingDays = manualSnapshotRemainingDays;
    }

    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manualSnapshotRemainingDays <p>
     *            The number of days until a manual snapshot will pass its
     *            retention period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withManualSnapshotRemainingDays(Integer manualSnapshotRemainingDays) {
        this.manualSnapshotRemainingDays = manualSnapshotRemainingDays;
        return this;
    }

    /**
     * <p>
     * A timestamp representing the start of the retention period for the
     * snapshot.
     * </p>
     *
     * @return <p>
     *         A timestamp representing the start of the retention period for
     *         the snapshot.
     *         </p>
     */
    public java.util.Date getSnapshotRetentionStartTime() {
        return snapshotRetentionStartTime;
    }

    /**
     * <p>
     * A timestamp representing the start of the retention period for the
     * snapshot.
     * </p>
     *
     * @param snapshotRetentionStartTime <p>
     *            A timestamp representing the start of the retention period for
     *            the snapshot.
     *            </p>
     */
    public void setSnapshotRetentionStartTime(java.util.Date snapshotRetentionStartTime) {
        this.snapshotRetentionStartTime = snapshotRetentionStartTime;
    }

    /**
     * <p>
     * A timestamp representing the start of the retention period for the
     * snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotRetentionStartTime <p>
     *            A timestamp representing the start of the retention period for
     *            the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Snapshot withSnapshotRetentionStartTime(java.util.Date snapshotRetentionStartTime) {
        this.snapshotRetentionStartTime = snapshotRetentionStartTime;
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: " + getSnapshotCreateTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getEncryptedWithHSM() != null)
            sb.append("EncryptedWithHSM: " + getEncryptedWithHSM() + ",");
        if (getAccountsWithRestoreAccess() != null)
            sb.append("AccountsWithRestoreAccess: " + getAccountsWithRestoreAccess() + ",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getTotalBackupSizeInMegaBytes() != null)
            sb.append("TotalBackupSizeInMegaBytes: " + getTotalBackupSizeInMegaBytes() + ",");
        if (getActualIncrementalBackupSizeInMegaBytes() != null)
            sb.append("ActualIncrementalBackupSizeInMegaBytes: "
                    + getActualIncrementalBackupSizeInMegaBytes() + ",");
        if (getBackupProgressInMegaBytes() != null)
            sb.append("BackupProgressInMegaBytes: " + getBackupProgressInMegaBytes() + ",");
        if (getCurrentBackupRateInMegaBytesPerSecond() != null)
            sb.append("CurrentBackupRateInMegaBytesPerSecond: "
                    + getCurrentBackupRateInMegaBytesPerSecond() + ",");
        if (getEstimatedSecondsToCompletion() != null)
            sb.append("EstimatedSecondsToCompletion: " + getEstimatedSecondsToCompletion() + ",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: " + getElapsedTimeInSeconds() + ",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: " + getSourceRegion() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getRestorableNodeTypes() != null)
            sb.append("RestorableNodeTypes: " + getRestorableNodeTypes() + ",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: " + getEnhancedVpcRouting() + ",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: " + getMaintenanceTrackName() + ",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: " + getManualSnapshotRetentionPeriod() + ",");
        if (getManualSnapshotRemainingDays() != null)
            sb.append("ManualSnapshotRemainingDays: " + getManualSnapshotRemainingDays() + ",");
        if (getSnapshotRetentionStartTime() != null)
            sb.append("SnapshotRetentionStartTime: " + getSnapshotRetentionStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode
                + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptedWithHSM() == null) ? 0 : getEncryptedWithHSM().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountsWithRestoreAccess() == null) ? 0 : getAccountsWithRestoreAccess()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalBackupSizeInMegaBytes() == null) ? 0 : getTotalBackupSizeInMegaBytes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getActualIncrementalBackupSizeInMegaBytes() == null) ? 0
                        : getActualIncrementalBackupSizeInMegaBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupProgressInMegaBytes() == null) ? 0 : getBackupProgressInMegaBytes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentBackupRateInMegaBytesPerSecond() == null) ? 0
                        : getCurrentBackupRateInMegaBytesPerSecond().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedSecondsToCompletion() == null) ? 0
                        : getEstimatedSecondsToCompletion().hashCode());
        hashCode = prime * hashCode
                + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getRestorableNodeTypes() == null) ? 0 : getRestorableNodeTypes().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode
                + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime
                * hashCode
                + ((getManualSnapshotRetentionPeriod() == null) ? 0
                        : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getManualSnapshotRemainingDays() == null) ? 0
                        : getManualSnapshotRemainingDays().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotRetentionStartTime() == null) ? 0 : getSnapshotRetentionStartTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;

        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null
                && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null
                && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null
                && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null
                && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEncryptedWithHSM() == null ^ this.getEncryptedWithHSM() == null)
            return false;
        if (other.getEncryptedWithHSM() != null
                && other.getEncryptedWithHSM().equals(this.getEncryptedWithHSM()) == false)
            return false;
        if (other.getAccountsWithRestoreAccess() == null
                ^ this.getAccountsWithRestoreAccess() == null)
            return false;
        if (other.getAccountsWithRestoreAccess() != null
                && other.getAccountsWithRestoreAccess().equals(this.getAccountsWithRestoreAccess()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() == null
                ^ this.getTotalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() != null
                && other.getTotalBackupSizeInMegaBytes().equals(
                        this.getTotalBackupSizeInMegaBytes()) == false)
            return false;
        if (other.getActualIncrementalBackupSizeInMegaBytes() == null
                ^ this.getActualIncrementalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getActualIncrementalBackupSizeInMegaBytes() != null
                && other.getActualIncrementalBackupSizeInMegaBytes().equals(
                        this.getActualIncrementalBackupSizeInMegaBytes()) == false)
            return false;
        if (other.getBackupProgressInMegaBytes() == null
                ^ this.getBackupProgressInMegaBytes() == null)
            return false;
        if (other.getBackupProgressInMegaBytes() != null
                && other.getBackupProgressInMegaBytes().equals(this.getBackupProgressInMegaBytes()) == false)
            return false;
        if (other.getCurrentBackupRateInMegaBytesPerSecond() == null
                ^ this.getCurrentBackupRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getCurrentBackupRateInMegaBytesPerSecond() != null
                && other.getCurrentBackupRateInMegaBytesPerSecond().equals(
                        this.getCurrentBackupRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getEstimatedSecondsToCompletion() == null
                ^ this.getEstimatedSecondsToCompletion() == null)
            return false;
        if (other.getEstimatedSecondsToCompletion() != null
                && other.getEstimatedSecondsToCompletion().equals(
                        this.getEstimatedSecondsToCompletion()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null
                && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null
                && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRestorableNodeTypes() == null ^ this.getRestorableNodeTypes() == null)
            return false;
        if (other.getRestorableNodeTypes() != null
                && other.getRestorableNodeTypes().equals(this.getRestorableNodeTypes()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null
                && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null
                && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null
                ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(
                        this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getManualSnapshotRemainingDays() == null
                ^ this.getManualSnapshotRemainingDays() == null)
            return false;
        if (other.getManualSnapshotRemainingDays() != null
                && other.getManualSnapshotRemainingDays().equals(
                        this.getManualSnapshotRemainingDays()) == false)
            return false;
        if (other.getSnapshotRetentionStartTime() == null
                ^ this.getSnapshotRetentionStartTime() == null)
            return false;
        if (other.getSnapshotRetentionStartTime() != null
                && other.getSnapshotRetentionStartTime().equals(
                        this.getSnapshotRetentionStartTime()) == false)
            return false;
        return true;
    }
}
