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
 * Describes a cluster.
 * </p>
 */
public class Cluster implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, prep-for-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, resize-cleanup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>paused</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     */
    private String clusterStatus;

    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unavailable - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maintenance - The cluster is intermittently available for queries due to
     * maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifying - The cluster is intermittently available for queries due to
     * changes that modify the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterAvailabilityStatus;

    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     */
    private String modifyStatus;

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the
     * database that is specified in the <b>DBName</b> parameter.
     * </p>
     */
    private String masterUsername;

    /**
     * <p>
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named <code>dev</code>dev
     * was created by default.
     * </p>
     */
    private String dBName;

    /**
     * <p>
     * The connection endpoint.
     * </p>
     */
    private Endpoint endpoint;

    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     */
    private java.util.Date clusterCreateTime;

    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * <p>
     * The default number of days to retain a manual snapshot. If the value is
     * -1, the snapshot is retained indefinitely. This setting doesn't change
     * the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an
     * Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC
     * use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     */
    private java.util.List<ClusterSecurityGroupMembership> clusterSecurityGroups;

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that
     * are associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     * </p>
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups;

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this
     * cluster. Each parameter group in the list is returned with its status.
     * </p>
     */
    private java.util.List<ClusterParameterGroupStatus> clusterParameterGroups;

    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     * </p>
     */
    private String clusterSubnetGroupName;

    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which
     * system maintenance can occur.
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are
     * pending. Specific pending changes are identified by subelements.
     * </p>
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     */
    private String clusterVersion;

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that major version
     * upgrades will be applied automatically to the cluster during the
     * maintenance window.
     * </p>
     */
    private Boolean allowVersionUpgrade;

    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that the cluster
     * can be accessed from a public network.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that data in the
     * cluster is encrypted at rest.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * A value that describes the status of a cluster restore action. This
     * parameter returns null if the cluster was not created by restoring a
     * snapshot.
     * </p>
     */
    private RestoreStatus restoreStatus;

    /**
     * <p/>
     */
    private DataTransferProgress dataTransferProgress;

    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished
     * applying any hardware security module (HSM) settings changes specified in
     * a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     */
    private HsmStatus hsmStatus;

    /**
     * <p>
     * A value that returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     * </p>
     */
    private ClusterSnapshotCopyStatus clusterSnapshotCopyStatus;

    /**
     * <p>
     * The public key for the cluster.
     * </p>
     */
    private String clusterPublicKey;

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     */
    private java.util.List<ClusterNode> clusterNodes;

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     */
    private ElasticIpStatus elasticIpStatus;

    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     */
    private String clusterRevisionNumber;

    /**
     * <p>
     * The list of tags for the cluster.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key
     * used to encrypt data in the cluster.
     * </p>
     */
    private String kmsKeyId;

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
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services.
     * </p>
     */
    private java.util.List<ClusterIamRole> iamRoles;

    /**
     * <p>
     * Cluster operations that are waiting to be started.
     * </p>
     */
    private java.util.List<String> pendingActions;

    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     */
    private String maintenanceTrackName;

    /**
     * <p>
     * The number of nodes that you can resize the cluster to with the elastic
     * resize method.
     * </p>
     */
    private String elasticResizeNumberOfNodeOptions;

    /**
     * <p>
     * Describes a group of <code>DeferredMaintenanceWindow</code> objects.
     * </p>
     */
    private java.util.List<DeferredMaintenanceWindow> deferredMaintenanceWindows;

    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     */
    private String snapshotScheduleIdentifier;

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     */
    private String snapshotScheduleState;

    /**
     * <p>
     * The date and time when the next snapshot is expected to be taken for
     * clusters with a valid snapshot schedule and backups enabled.
     * </p>
     */
    private java.util.Date expectedNextSnapshotScheduleTime;

    /**
     * <p>
     * The status of next expected snapshot for clusters having a valid snapshot
     * schedule and backups enabled. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OnTrack - The next snapshot is expected to be taken on time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending - The next snapshot is pending to be taken.
     * </p>
     * </li>
     * </ul>
     */
    private String expectedNextSnapshotScheduleTimeStatus;

    /**
     * <p>
     * The date and time in UTC when system maintenance can begin.
     * </p>
     */
    private java.util.Date nextMaintenanceWindowStartTime;

    /**
     * <p>
     * Returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AllowCancelResize: a boolean value indicating if the resize operation can
     * be cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResizeType: Returns ClassicResize
     * </p>
     * </li>
     * </ul>
     */
    private ResizeInfo resizeInfo;

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     *
     * @return <p>
     *         The node type for the nodes in the cluster.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     *
     * @param nodeType <p>
     *            The node type for the nodes in the cluster.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type for the nodes in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, prep-for-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, resize-cleanup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>paused</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The current state of the cluster. Possible values are the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>available</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available, prep-for-resize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available, resize-cleanup</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelling-resize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>creating</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>final-snapshot</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hardware-failure</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-hsm</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-network</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-parameters</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-restore</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modifying</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>paused</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rebooting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>renaming</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resizing</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rotating-keys</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>storage-full</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>updating-hsm</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getClusterStatus() {
        return clusterStatus;
    }

    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, prep-for-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, resize-cleanup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>paused</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param clusterStatus <p>
     *            The current state of the cluster. Possible values are the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>available</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available, prep-for-resize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available, resize-cleanup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cancelling-resize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>creating</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>final-snapshot</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hardware-failure</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-hsm</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-network</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-parameters</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-restore</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>modifying</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>paused</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rebooting</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>renaming</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resizing</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rotating-keys</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>storage-full</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>updating-hsm</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, prep-for-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available, resize-cleanup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling-resize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>paused</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterStatus <p>
     *            The current state of the cluster. Possible values are the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>available</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available, prep-for-resize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available, resize-cleanup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cancelling-resize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>creating</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>final-snapshot</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hardware-failure</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-hsm</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-network</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-parameters</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>incompatible-restore</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>modifying</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>paused</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rebooting</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>renaming</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resizing</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rotating-keys</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>storage-full</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>updating-hsm</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unavailable - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maintenance - The cluster is intermittently available for queries due to
     * maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifying - The cluster is intermittently available for queries due to
     * changes that modify the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The availability status of the cluster for queries. Possible
     *         values are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Available - The cluster is available for queries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unavailable - The cluster is not available for queries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maintenance - The cluster is intermittently available for queries
     *         due to maintenance activities.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Modifying - The cluster is intermittently available for queries
     *         due to changes that modify the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed - The cluster failed and is not available for queries.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getClusterAvailabilityStatus() {
        return clusterAvailabilityStatus;
    }

    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unavailable - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maintenance - The cluster is intermittently available for queries due to
     * maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifying - The cluster is intermittently available for queries due to
     * changes that modify the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     *
     * @param clusterAvailabilityStatus <p>
     *            The availability status of the cluster for queries. Possible
     *            values are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Available - The cluster is available for queries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unavailable - The cluster is not available for queries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maintenance - The cluster is intermittently available for
     *            queries due to maintenance activities.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Modifying - The cluster is intermittently available for
     *            queries due to changes that modify the cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed - The cluster failed and is not available for queries.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClusterAvailabilityStatus(String clusterAvailabilityStatus) {
        this.clusterAvailabilityStatus = clusterAvailabilityStatus;
    }

    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unavailable - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maintenance - The cluster is intermittently available for queries due to
     * maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifying - The cluster is intermittently available for queries due to
     * changes that modify the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterAvailabilityStatus <p>
     *            The availability status of the cluster for queries. Possible
     *            values are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Available - The cluster is available for queries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unavailable - The cluster is not available for queries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maintenance - The cluster is intermittently available for
     *            queries due to maintenance activities.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Modifying - The cluster is intermittently available for
     *            queries due to changes that modify the cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed - The cluster failed and is not available for queries.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterAvailabilityStatus(String clusterAvailabilityStatus) {
        this.clusterAvailabilityStatus = clusterAvailabilityStatus;
        return this;
    }

    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     *
     * @return <p>
     *         The status of a modify operation, if any, initiated for the
     *         cluster.
     *         </p>
     */
    public String getModifyStatus() {
        return modifyStatus;
    }

    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     *
     * @param modifyStatus <p>
     *            The status of a modify operation, if any, initiated for the
     *            cluster.
     *            </p>
     */
    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modifyStatus <p>
     *            The status of a modify operation, if any, initiated for the
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
        return this;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the
     * database that is specified in the <b>DBName</b> parameter.
     * </p>
     *
     * @return <p>
     *         The master user name for the cluster. This name is used to
     *         connect to the database that is specified in the <b>DBName</b>
     *         parameter.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the
     * database that is specified in the <b>DBName</b> parameter.
     * </p>
     *
     * @param masterUsername <p>
     *            The master user name for the cluster. This name is used to
     *            connect to the database that is specified in the <b>DBName</b>
     *            parameter.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the
     * database that is specified in the <b>DBName</b> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            The master user name for the cluster. This name is used to
     *            connect to the database that is specified in the <b>DBName</b>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named <code>dev</code>dev
     * was created by default.
     * </p>
     *
     * @return <p>
     *         The name of the initial database that was created when the
     *         cluster was created. This same name is returned for the life of
     *         the cluster. If an initial database was not specified, a database
     *         named <code>dev</code>dev was created by default.
     *         </p>
     */
    public String getDBName() {
        return dBName;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named <code>dev</code>dev
     * was created by default.
     * </p>
     *
     * @param dBName <p>
     *            The name of the initial database that was created when the
     *            cluster was created. This same name is returned for the life
     *            of the cluster. If an initial database was not specified, a
     *            database named <code>dev</code>dev was created by default.
     *            </p>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named <code>dev</code>dev
     * was created by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBName <p>
     *            The name of the initial database that was created when the
     *            cluster was created. This same name is returned for the life
     *            of the cluster. If an initial database was not specified, a
     *            database named <code>dev</code>dev was created by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     *
     * @return <p>
     *         The connection endpoint.
     *         </p>
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     *
     * @param endpoint <p>
     *            The connection endpoint.
     *            </p>
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The connection endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the cluster was created.
     *         </p>
     */
    public java.util.Date getClusterCreateTime() {
        return clusterCreateTime;
    }

    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     *
     * @param clusterCreateTime <p>
     *            The date and time that the cluster was created.
     *            </p>
     */
    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterCreateTime <p>
     *            The date and time that the cluster was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }

    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     *
     * @return <p>
     *         The number of days that automatic cluster snapshots are retained.
     *         </p>
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     *
     * @param automatedSnapshotRetentionPeriod <p>
     *            The number of days that automatic cluster snapshots are
     *            retained.
     *            </p>
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automatedSnapshotRetentionPeriod <p>
     *            The number of days that automatic cluster snapshots are
     *            retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The default number of days to retain a manual snapshot. If the value is
     * -1, the snapshot is retained indefinitely. This setting doesn't change
     * the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @return <p>
     *         The default number of days to retain a manual snapshot. If the
     *         value is -1, the snapshot is retained indefinitely. This setting
     *         doesn't change the retention period of existing snapshots.
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
     * The default number of days to retain a manual snapshot. If the value is
     * -1, the snapshot is retained indefinitely. This setting doesn't change
     * the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The default number of days to retain a manual snapshot. If the
     *            value is -1, the snapshot is retained indefinitely. This
     *            setting doesn't change the retention period of existing
     *            snapshots.
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
     * The default number of days to retain a manual snapshot. If the value is
     * -1, the snapshot is retained indefinitely. This setting doesn't change
     * the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The default number of days to retain a manual snapshot. If the
     *            value is -1, the snapshot is retained indefinitely. This
     *            setting doesn't change the retention period of existing
     *            snapshots.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an
     * Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC
     * use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     *
     * @return <p>
     *         A list of cluster security group that are associated with the
     *         cluster. Each security group is represented by an element that
     *         contains <code>ClusterSecurityGroup.Name</code> and
     *         <code>ClusterSecurityGroup.Status</code> subelements.
     *         </p>
     *         <p>
     *         Cluster security groups are used when the cluster is not created
     *         in an Amazon Virtual Private Cloud (VPC). Clusters that are
     *         created in a VPC use VPC security groups, which are listed by the
     *         <b>VpcSecurityGroups</b> parameter.
     *         </p>
     */
    public java.util.List<ClusterSecurityGroupMembership> getClusterSecurityGroups() {
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an
     * Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC
     * use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     *
     * @param clusterSecurityGroups <p>
     *            A list of cluster security group that are associated with the
     *            cluster. Each security group is represented by an element that
     *            contains <code>ClusterSecurityGroup.Name</code> and
     *            <code>ClusterSecurityGroup.Status</code> subelements.
     *            </p>
     *            <p>
     *            Cluster security groups are used when the cluster is not
     *            created in an Amazon Virtual Private Cloud (VPC). Clusters
     *            that are created in a VPC use VPC security groups, which are
     *            listed by the <b>VpcSecurityGroups</b> parameter.
     *            </p>
     */
    public void setClusterSecurityGroups(
            java.util.Collection<ClusterSecurityGroupMembership> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }

        this.clusterSecurityGroups = new java.util.ArrayList<ClusterSecurityGroupMembership>(
                clusterSecurityGroups);
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an
     * Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC
     * use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroups <p>
     *            A list of cluster security group that are associated with the
     *            cluster. Each security group is represented by an element that
     *            contains <code>ClusterSecurityGroup.Name</code> and
     *            <code>ClusterSecurityGroup.Status</code> subelements.
     *            </p>
     *            <p>
     *            Cluster security groups are used when the cluster is not
     *            created in an Amazon Virtual Private Cloud (VPC). Clusters
     *            that are created in a VPC use VPC security groups, which are
     *            listed by the <b>VpcSecurityGroups</b> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterSecurityGroups(
            ClusterSecurityGroupMembership... clusterSecurityGroups) {
        if (getClusterSecurityGroups() == null) {
            this.clusterSecurityGroups = new java.util.ArrayList<ClusterSecurityGroupMembership>(
                    clusterSecurityGroups.length);
        }
        for (ClusterSecurityGroupMembership value : clusterSecurityGroups) {
            this.clusterSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an
     * Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC
     * use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroups <p>
     *            A list of cluster security group that are associated with the
     *            cluster. Each security group is represented by an element that
     *            contains <code>ClusterSecurityGroup.Name</code> and
     *            <code>ClusterSecurityGroup.Status</code> subelements.
     *            </p>
     *            <p>
     *            Cluster security groups are used when the cluster is not
     *            created in an Amazon Virtual Private Cloud (VPC). Clusters
     *            that are created in a VPC use VPC security groups, which are
     *            listed by the <b>VpcSecurityGroups</b> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterSecurityGroups(
            java.util.Collection<ClusterSecurityGroupMembership> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that
     * are associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     * </p>
     *
     * @return <p>
     *         A list of Amazon Virtual Private Cloud (Amazon VPC) security
     *         groups that are associated with the cluster. This parameter is
     *         returned only if the cluster is in a VPC.
     *         </p>
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that
     * are associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     * </p>
     *
     * @param vpcSecurityGroups <p>
     *            A list of Amazon Virtual Private Cloud (Amazon VPC) security
     *            groups that are associated with the cluster. This parameter is
     *            returned only if the cluster is in a VPC.
     *            </p>
     */
    public void setVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(
                vpcSecurityGroups);
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that
     * are associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            A list of Amazon Virtual Private Cloud (Amazon VPC) security
     *            groups that are associated with the cluster. This parameter is
     *            returned only if the cluster is in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (getVpcSecurityGroups() == null) {
            this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(
                    vpcSecurityGroups.length);
        }
        for (VpcSecurityGroupMembership value : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that
     * are associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            A list of Amazon Virtual Private Cloud (Amazon VPC) security
     *            groups that are associated with the cluster. This parameter is
     *            returned only if the cluster is in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this
     * cluster. Each parameter group in the list is returned with its status.
     * </p>
     *
     * @return <p>
     *         The list of cluster parameter groups that are associated with
     *         this cluster. Each parameter group in the list is returned with
     *         its status.
     *         </p>
     */
    public java.util.List<ClusterParameterGroupStatus> getClusterParameterGroups() {
        return clusterParameterGroups;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this
     * cluster. Each parameter group in the list is returned with its status.
     * </p>
     *
     * @param clusterParameterGroups <p>
     *            The list of cluster parameter groups that are associated with
     *            this cluster. Each parameter group in the list is returned
     *            with its status.
     *            </p>
     */
    public void setClusterParameterGroups(
            java.util.Collection<ClusterParameterGroupStatus> clusterParameterGroups) {
        if (clusterParameterGroups == null) {
            this.clusterParameterGroups = null;
            return;
        }

        this.clusterParameterGroups = new java.util.ArrayList<ClusterParameterGroupStatus>(
                clusterParameterGroups);
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this
     * cluster. Each parameter group in the list is returned with its status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterParameterGroups <p>
     *            The list of cluster parameter groups that are associated with
     *            this cluster. Each parameter group in the list is returned
     *            with its status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterParameterGroups(ClusterParameterGroupStatus... clusterParameterGroups) {
        if (getClusterParameterGroups() == null) {
            this.clusterParameterGroups = new java.util.ArrayList<ClusterParameterGroupStatus>(
                    clusterParameterGroups.length);
        }
        for (ClusterParameterGroupStatus value : clusterParameterGroups) {
            this.clusterParameterGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this
     * cluster. Each parameter group in the list is returned with its status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterParameterGroups <p>
     *            The list of cluster parameter groups that are associated with
     *            this cluster. Each parameter group in the list is returned
     *            with its status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterParameterGroups(
            java.util.Collection<ClusterParameterGroupStatus> clusterParameterGroups) {
        setClusterParameterGroups(clusterParameterGroups);
        return this;
    }

    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     * </p>
     *
     * @return <p>
     *         The name of the subnet group that is associated with the cluster.
     *         This parameter is valid only when the cluster is in a VPC.
     *         </p>
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     * </p>
     *
     * @param clusterSubnetGroupName <p>
     *            The name of the subnet group that is associated with the
     *            cluster. This parameter is valid only when the cluster is in a
     *            VPC.
     *            </p>
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSubnetGroupName <p>
     *            The name of the subnet group that is associated with the
     *            cluster. This parameter is valid only when the cluster is in a
     *            VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     *
     * @return <p>
     *         The identifier of the VPC the cluster is in, if the cluster is in
     *         a VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The identifier of the VPC the cluster is in, if the cluster is
     *            in a VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The identifier of the VPC the cluster is in, if the cluster is
     *            in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     *
     * @return <p>
     *         The name of the Availability Zone in which the cluster is
     *         located.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     *
     * @param availabilityZone <p>
     *            The name of the Availability Zone in which the cluster is
     *            located.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The name of the Availability Zone in which the cluster is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which
     * system maintenance can occur.
     * </p>
     *
     * @return <p>
     *         The weekly time range, in Universal Coordinated Time (UTC),
     *         during which system maintenance can occur.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which
     * system maintenance can occur.
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range, in Universal Coordinated Time (UTC),
     *            during which system maintenance can occur.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which
     * system maintenance can occur.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range, in Universal Coordinated Time (UTC),
     *            during which system maintenance can occur.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are
     * pending. Specific pending changes are identified by subelements.
     * </p>
     *
     * @return <p>
     *         A value that, if present, indicates that changes to the cluster
     *         are pending. Specific pending changes are identified by
     *         subelements.
     *         </p>
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }

    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are
     * pending. Specific pending changes are identified by subelements.
     * </p>
     *
     * @param pendingModifiedValues <p>
     *            A value that, if present, indicates that changes to the
     *            cluster are pending. Specific pending changes are identified
     *            by subelements.
     *            </p>
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are
     * pending. Specific pending changes are identified by subelements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingModifiedValues <p>
     *            A value that, if present, indicates that changes to the
     *            cluster are pending. Specific pending changes are identified
     *            by subelements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
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
    public Cluster withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that major version
     * upgrades will be applied automatically to the cluster during the
     * maintenance window.
     * </p>
     *
     * @return <p>
     *         A boolean value that, if <code>true</code>, indicates that major
     *         version upgrades will be applied automatically to the cluster
     *         during the maintenance window.
     *         </p>
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that major version
     * upgrades will be applied automatically to the cluster during the
     * maintenance window.
     * </p>
     *
     * @return <p>
     *         A boolean value that, if <code>true</code>, indicates that major
     *         version upgrades will be applied automatically to the cluster
     *         during the maintenance window.
     *         </p>
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that major version
     * upgrades will be applied automatically to the cluster during the
     * maintenance window.
     * </p>
     *
     * @param allowVersionUpgrade <p>
     *            A boolean value that, if <code>true</code>, indicates that
     *            major version upgrades will be applied automatically to the
     *            cluster during the maintenance window.
     *            </p>
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that major version
     * upgrades will be applied automatically to the cluster during the
     * maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowVersionUpgrade <p>
     *            A boolean value that, if <code>true</code>, indicates that
     *            major version upgrades will be applied automatically to the
     *            cluster during the maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     *
     * @return <p>
     *         The number of compute nodes in the cluster.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The number of compute nodes in the cluster.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The number of compute nodes in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that the cluster
     * can be accessed from a public network.
     * </p>
     *
     * @return <p>
     *         A boolean value that, if <code>true</code>, indicates that the
     *         cluster can be accessed from a public network.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that the cluster
     * can be accessed from a public network.
     * </p>
     *
     * @return <p>
     *         A boolean value that, if <code>true</code>, indicates that the
     *         cluster can be accessed from a public network.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that the cluster
     * can be accessed from a public network.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            A boolean value that, if <code>true</code>, indicates that the
     *            cluster can be accessed from a public network.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that the cluster
     * can be accessed from a public network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            A boolean value that, if <code>true</code>, indicates that the
     *            cluster can be accessed from a public network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that data in the
     * cluster is encrypted at rest.
     * </p>
     *
     * @return <p>
     *         A boolean value that, if <code>true</code>, indicates that data
     *         in the cluster is encrypted at rest.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that data in the
     * cluster is encrypted at rest.
     * </p>
     *
     * @return <p>
     *         A boolean value that, if <code>true</code>, indicates that data
     *         in the cluster is encrypted at rest.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that data in the
     * cluster is encrypted at rest.
     * </p>
     *
     * @param encrypted <p>
     *            A boolean value that, if <code>true</code>, indicates that
     *            data in the cluster is encrypted at rest.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A boolean value that, if <code>true</code>, indicates that data in the
     * cluster is encrypted at rest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            A boolean value that, if <code>true</code>, indicates that
     *            data in the cluster is encrypted at rest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * A value that describes the status of a cluster restore action. This
     * parameter returns null if the cluster was not created by restoring a
     * snapshot.
     * </p>
     *
     * @return <p>
     *         A value that describes the status of a cluster restore action.
     *         This parameter returns null if the cluster was not created by
     *         restoring a snapshot.
     *         </p>
     */
    public RestoreStatus getRestoreStatus() {
        return restoreStatus;
    }

    /**
     * <p>
     * A value that describes the status of a cluster restore action. This
     * parameter returns null if the cluster was not created by restoring a
     * snapshot.
     * </p>
     *
     * @param restoreStatus <p>
     *            A value that describes the status of a cluster restore action.
     *            This parameter returns null if the cluster was not created by
     *            restoring a snapshot.
     *            </p>
     */
    public void setRestoreStatus(RestoreStatus restoreStatus) {
        this.restoreStatus = restoreStatus;
    }

    /**
     * <p>
     * A value that describes the status of a cluster restore action. This
     * parameter returns null if the cluster was not created by restoring a
     * snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreStatus <p>
     *            A value that describes the status of a cluster restore action.
     *            This parameter returns null if the cluster was not created by
     *            restoring a snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withRestoreStatus(RestoreStatus restoreStatus) {
        this.restoreStatus = restoreStatus;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public DataTransferProgress getDataTransferProgress() {
        return dataTransferProgress;
    }

    /**
     * <p/>
     *
     * @param dataTransferProgress <p/>
     */
    public void setDataTransferProgress(DataTransferProgress dataTransferProgress) {
        this.dataTransferProgress = dataTransferProgress;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTransferProgress <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withDataTransferProgress(DataTransferProgress dataTransferProgress) {
        this.dataTransferProgress = dataTransferProgress;
        return this;
    }

    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished
     * applying any hardware security module (HSM) settings changes specified in
     * a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     *
     * @return <p>
     *         A value that reports whether the Amazon Redshift cluster has
     *         finished applying any hardware security module (HSM) settings
     *         changes specified in a modify cluster command.
     *         </p>
     *         <p>
     *         Values: active, applying
     *         </p>
     */
    public HsmStatus getHsmStatus() {
        return hsmStatus;
    }

    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished
     * applying any hardware security module (HSM) settings changes specified in
     * a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     *
     * @param hsmStatus <p>
     *            A value that reports whether the Amazon Redshift cluster has
     *            finished applying any hardware security module (HSM) settings
     *            changes specified in a modify cluster command.
     *            </p>
     *            <p>
     *            Values: active, applying
     *            </p>
     */
    public void setHsmStatus(HsmStatus hsmStatus) {
        this.hsmStatus = hsmStatus;
    }

    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished
     * applying any hardware security module (HSM) settings changes specified in
     * a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmStatus <p>
     *            A value that reports whether the Amazon Redshift cluster has
     *            finished applying any hardware security module (HSM) settings
     *            changes specified in a modify cluster command.
     *            </p>
     *            <p>
     *            Values: active, applying
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withHsmStatus(HsmStatus hsmStatus) {
        this.hsmStatus = hsmStatus;
        return this;
    }

    /**
     * <p>
     * A value that returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     * </p>
     *
     * @return <p>
     *         A value that returns the destination region and retention period
     *         that are configured for cross-region snapshot copy.
     *         </p>
     */
    public ClusterSnapshotCopyStatus getClusterSnapshotCopyStatus() {
        return clusterSnapshotCopyStatus;
    }

    /**
     * <p>
     * A value that returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     * </p>
     *
     * @param clusterSnapshotCopyStatus <p>
     *            A value that returns the destination region and retention
     *            period that are configured for cross-region snapshot copy.
     *            </p>
     */
    public void setClusterSnapshotCopyStatus(ClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        this.clusterSnapshotCopyStatus = clusterSnapshotCopyStatus;
    }

    /**
     * <p>
     * A value that returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSnapshotCopyStatus <p>
     *            A value that returns the destination region and retention
     *            period that are configured for cross-region snapshot copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterSnapshotCopyStatus(ClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        this.clusterSnapshotCopyStatus = clusterSnapshotCopyStatus;
        return this;
    }

    /**
     * <p>
     * The public key for the cluster.
     * </p>
     *
     * @return <p>
     *         The public key for the cluster.
     *         </p>
     */
    public String getClusterPublicKey() {
        return clusterPublicKey;
    }

    /**
     * <p>
     * The public key for the cluster.
     * </p>
     *
     * @param clusterPublicKey <p>
     *            The public key for the cluster.
     *            </p>
     */
    public void setClusterPublicKey(String clusterPublicKey) {
        this.clusterPublicKey = clusterPublicKey;
    }

    /**
     * <p>
     * The public key for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterPublicKey <p>
     *            The public key for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterPublicKey(String clusterPublicKey) {
        this.clusterPublicKey = clusterPublicKey;
        return this;
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     *
     * @return <p>
     *         The nodes in the cluster.
     *         </p>
     */
    public java.util.List<ClusterNode> getClusterNodes() {
        return clusterNodes;
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     *
     * @param clusterNodes <p>
     *            The nodes in the cluster.
     *            </p>
     */
    public void setClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        if (clusterNodes == null) {
            this.clusterNodes = null;
            return;
        }

        this.clusterNodes = new java.util.ArrayList<ClusterNode>(clusterNodes);
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterNodes <p>
     *            The nodes in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterNodes(ClusterNode... clusterNodes) {
        if (getClusterNodes() == null) {
            this.clusterNodes = new java.util.ArrayList<ClusterNode>(clusterNodes.length);
        }
        for (ClusterNode value : clusterNodes) {
            this.clusterNodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterNodes <p>
     *            The nodes in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        setClusterNodes(clusterNodes);
        return this;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     *
     * @return <p>
     *         The status of the elastic IP (EIP) address.
     *         </p>
     */
    public ElasticIpStatus getElasticIpStatus() {
        return elasticIpStatus;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     *
     * @param elasticIpStatus <p>
     *            The status of the elastic IP (EIP) address.
     *            </p>
     */
    public void setElasticIpStatus(ElasticIpStatus elasticIpStatus) {
        this.elasticIpStatus = elasticIpStatus;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticIpStatus <p>
     *            The status of the elastic IP (EIP) address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withElasticIpStatus(ElasticIpStatus elasticIpStatus) {
        this.elasticIpStatus = elasticIpStatus;
        return this;
    }

    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     *
     * @return <p>
     *         The specific revision number of the database in the cluster.
     *         </p>
     */
    public String getClusterRevisionNumber() {
        return clusterRevisionNumber;
    }

    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     *
     * @param clusterRevisionNumber <p>
     *            The specific revision number of the database in the cluster.
     *            </p>
     */
    public void setClusterRevisionNumber(String clusterRevisionNumber) {
        this.clusterRevisionNumber = clusterRevisionNumber;
    }

    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterRevisionNumber <p>
     *            The specific revision number of the database in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterRevisionNumber(String clusterRevisionNumber) {
        this.clusterRevisionNumber = clusterRevisionNumber;
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster.
     * </p>
     *
     * @return <p>
     *         The list of tags for the cluster.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster.
     * </p>
     *
     * @param tags <p>
     *            The list of tags for the cluster.
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
     * The list of tags for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withTags(Tag... tags) {
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
     * The list of tags for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key
     * used to encrypt data in the cluster.
     * </p>
     *
     * @return <p>
     *         The AWS Key Management Service (AWS KMS) key ID of the encryption
     *         key used to encrypt data in the cluster.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key
     * used to encrypt data in the cluster.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key ID of the
     *            encryption key used to encrypt data in the cluster.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key
     * used to encrypt data in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key ID of the
     *            encryption key used to encrypt data in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
    public Cluster withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
        return this;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services.
     * </p>
     *
     * @return <p>
     *         A list of AWS Identity and Access Management (IAM) roles that can
     *         be used by the cluster to access other AWS services.
     *         </p>
     */
    public java.util.List<ClusterIamRole> getIamRoles() {
        return iamRoles;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services.
     * </p>
     *
     * @param iamRoles <p>
     *            A list of AWS Identity and Access Management (IAM) roles that
     *            can be used by the cluster to access other AWS services.
     *            </p>
     */
    public void setIamRoles(java.util.Collection<ClusterIamRole> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
            return;
        }

        this.iamRoles = new java.util.ArrayList<ClusterIamRole>(iamRoles);
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoles <p>
     *            A list of AWS Identity and Access Management (IAM) roles that
     *            can be used by the cluster to access other AWS services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withIamRoles(ClusterIamRole... iamRoles) {
        if (getIamRoles() == null) {
            this.iamRoles = new java.util.ArrayList<ClusterIamRole>(iamRoles.length);
        }
        for (ClusterIamRole value : iamRoles) {
            this.iamRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoles <p>
     *            A list of AWS Identity and Access Management (IAM) roles that
     *            can be used by the cluster to access other AWS services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withIamRoles(java.util.Collection<ClusterIamRole> iamRoles) {
        setIamRoles(iamRoles);
        return this;
    }

    /**
     * <p>
     * Cluster operations that are waiting to be started.
     * </p>
     *
     * @return <p>
     *         Cluster operations that are waiting to be started.
     *         </p>
     */
    public java.util.List<String> getPendingActions() {
        return pendingActions;
    }

    /**
     * <p>
     * Cluster operations that are waiting to be started.
     * </p>
     *
     * @param pendingActions <p>
     *            Cluster operations that are waiting to be started.
     *            </p>
     */
    public void setPendingActions(java.util.Collection<String> pendingActions) {
        if (pendingActions == null) {
            this.pendingActions = null;
            return;
        }

        this.pendingActions = new java.util.ArrayList<String>(pendingActions);
    }

    /**
     * <p>
     * Cluster operations that are waiting to be started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingActions <p>
     *            Cluster operations that are waiting to be started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withPendingActions(String... pendingActions) {
        if (getPendingActions() == null) {
            this.pendingActions = new java.util.ArrayList<String>(pendingActions.length);
        }
        for (String value : pendingActions) {
            this.pendingActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Cluster operations that are waiting to be started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingActions <p>
     *            Cluster operations that are waiting to be started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withPendingActions(java.util.Collection<String> pendingActions) {
        setPendingActions(pendingActions);
        return this;
    }

    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     *
     * @return <p>
     *         The name of the maintenance track for the cluster.
     *         </p>
     */
    public String getMaintenanceTrackName() {
        return maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track for the cluster.
     *            </p>
     */
    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
        return this;
    }

    /**
     * <p>
     * The number of nodes that you can resize the cluster to with the elastic
     * resize method.
     * </p>
     *
     * @return <p>
     *         The number of nodes that you can resize the cluster to with the
     *         elastic resize method.
     *         </p>
     */
    public String getElasticResizeNumberOfNodeOptions() {
        return elasticResizeNumberOfNodeOptions;
    }

    /**
     * <p>
     * The number of nodes that you can resize the cluster to with the elastic
     * resize method.
     * </p>
     *
     * @param elasticResizeNumberOfNodeOptions <p>
     *            The number of nodes that you can resize the cluster to with
     *            the elastic resize method.
     *            </p>
     */
    public void setElasticResizeNumberOfNodeOptions(String elasticResizeNumberOfNodeOptions) {
        this.elasticResizeNumberOfNodeOptions = elasticResizeNumberOfNodeOptions;
    }

    /**
     * <p>
     * The number of nodes that you can resize the cluster to with the elastic
     * resize method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticResizeNumberOfNodeOptions <p>
     *            The number of nodes that you can resize the cluster to with
     *            the elastic resize method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withElasticResizeNumberOfNodeOptions(String elasticResizeNumberOfNodeOptions) {
        this.elasticResizeNumberOfNodeOptions = elasticResizeNumberOfNodeOptions;
        return this;
    }

    /**
     * <p>
     * Describes a group of <code>DeferredMaintenanceWindow</code> objects.
     * </p>
     *
     * @return <p>
     *         Describes a group of <code>DeferredMaintenanceWindow</code>
     *         objects.
     *         </p>
     */
    public java.util.List<DeferredMaintenanceWindow> getDeferredMaintenanceWindows() {
        return deferredMaintenanceWindows;
    }

    /**
     * <p>
     * Describes a group of <code>DeferredMaintenanceWindow</code> objects.
     * </p>
     *
     * @param deferredMaintenanceWindows <p>
     *            Describes a group of <code>DeferredMaintenanceWindow</code>
     *            objects.
     *            </p>
     */
    public void setDeferredMaintenanceWindows(
            java.util.Collection<DeferredMaintenanceWindow> deferredMaintenanceWindows) {
        if (deferredMaintenanceWindows == null) {
            this.deferredMaintenanceWindows = null;
            return;
        }

        this.deferredMaintenanceWindows = new java.util.ArrayList<DeferredMaintenanceWindow>(
                deferredMaintenanceWindows);
    }

    /**
     * <p>
     * Describes a group of <code>DeferredMaintenanceWindow</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferredMaintenanceWindows <p>
     *            Describes a group of <code>DeferredMaintenanceWindow</code>
     *            objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withDeferredMaintenanceWindows(
            DeferredMaintenanceWindow... deferredMaintenanceWindows) {
        if (getDeferredMaintenanceWindows() == null) {
            this.deferredMaintenanceWindows = new java.util.ArrayList<DeferredMaintenanceWindow>(
                    deferredMaintenanceWindows.length);
        }
        for (DeferredMaintenanceWindow value : deferredMaintenanceWindows) {
            this.deferredMaintenanceWindows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes a group of <code>DeferredMaintenanceWindow</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deferredMaintenanceWindows <p>
     *            Describes a group of <code>DeferredMaintenanceWindow</code>
     *            objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withDeferredMaintenanceWindows(
            java.util.Collection<DeferredMaintenanceWindow> deferredMaintenanceWindows) {
        setDeferredMaintenanceWindows(deferredMaintenanceWindows);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the cluster snapshot schedule.
     *         </p>
     */
    public String getSnapshotScheduleIdentifier() {
        return snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     *
     * @param snapshotScheduleIdentifier <p>
     *            A unique identifier for the cluster snapshot schedule.
     *            </p>
     */
    public void setSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
        this.snapshotScheduleIdentifier = snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotScheduleIdentifier <p>
     *            A unique identifier for the cluster snapshot schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
        this.snapshotScheduleIdentifier = snapshotScheduleIdentifier;
        return this;
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @return <p>
     *         The current state of the cluster snapshot schedule.
     *         </p>
     * @see ScheduleState
     */
    public String getSnapshotScheduleState() {
        return snapshotScheduleState;
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param snapshotScheduleState <p>
     *            The current state of the cluster snapshot schedule.
     *            </p>
     * @see ScheduleState
     */
    public void setSnapshotScheduleState(String snapshotScheduleState) {
        this.snapshotScheduleState = snapshotScheduleState;
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param snapshotScheduleState <p>
     *            The current state of the cluster snapshot schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleState
     */
    public Cluster withSnapshotScheduleState(String snapshotScheduleState) {
        this.snapshotScheduleState = snapshotScheduleState;
        return this;
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param snapshotScheduleState <p>
     *            The current state of the cluster snapshot schedule.
     *            </p>
     * @see ScheduleState
     */
    public void setSnapshotScheduleState(ScheduleState snapshotScheduleState) {
        this.snapshotScheduleState = snapshotScheduleState.toString();
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MODIFYING, ACTIVE, FAILED
     *
     * @param snapshotScheduleState <p>
     *            The current state of the cluster snapshot schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleState
     */
    public Cluster withSnapshotScheduleState(ScheduleState snapshotScheduleState) {
        this.snapshotScheduleState = snapshotScheduleState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the next snapshot is expected to be taken for
     * clusters with a valid snapshot schedule and backups enabled.
     * </p>
     *
     * @return <p>
     *         The date and time when the next snapshot is expected to be taken
     *         for clusters with a valid snapshot schedule and backups enabled.
     *         </p>
     */
    public java.util.Date getExpectedNextSnapshotScheduleTime() {
        return expectedNextSnapshotScheduleTime;
    }

    /**
     * <p>
     * The date and time when the next snapshot is expected to be taken for
     * clusters with a valid snapshot schedule and backups enabled.
     * </p>
     *
     * @param expectedNextSnapshotScheduleTime <p>
     *            The date and time when the next snapshot is expected to be
     *            taken for clusters with a valid snapshot schedule and backups
     *            enabled.
     *            </p>
     */
    public void setExpectedNextSnapshotScheduleTime(java.util.Date expectedNextSnapshotScheduleTime) {
        this.expectedNextSnapshotScheduleTime = expectedNextSnapshotScheduleTime;
    }

    /**
     * <p>
     * The date and time when the next snapshot is expected to be taken for
     * clusters with a valid snapshot schedule and backups enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedNextSnapshotScheduleTime <p>
     *            The date and time when the next snapshot is expected to be
     *            taken for clusters with a valid snapshot schedule and backups
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withExpectedNextSnapshotScheduleTime(
            java.util.Date expectedNextSnapshotScheduleTime) {
        this.expectedNextSnapshotScheduleTime = expectedNextSnapshotScheduleTime;
        return this;
    }

    /**
     * <p>
     * The status of next expected snapshot for clusters having a valid snapshot
     * schedule and backups enabled. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OnTrack - The next snapshot is expected to be taken on time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending - The next snapshot is pending to be taken.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of next expected snapshot for clusters having a valid
     *         snapshot schedule and backups enabled. Possible values are the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         OnTrack - The next snapshot is expected to be taken on time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Pending - The next snapshot is pending to be taken.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getExpectedNextSnapshotScheduleTimeStatus() {
        return expectedNextSnapshotScheduleTimeStatus;
    }

    /**
     * <p>
     * The status of next expected snapshot for clusters having a valid snapshot
     * schedule and backups enabled. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OnTrack - The next snapshot is expected to be taken on time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending - The next snapshot is pending to be taken.
     * </p>
     * </li>
     * </ul>
     *
     * @param expectedNextSnapshotScheduleTimeStatus <p>
     *            The status of next expected snapshot for clusters having a
     *            valid snapshot schedule and backups enabled. Possible values
     *            are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OnTrack - The next snapshot is expected to be taken on time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Pending - The next snapshot is pending to be taken.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setExpectedNextSnapshotScheduleTimeStatus(
            String expectedNextSnapshotScheduleTimeStatus) {
        this.expectedNextSnapshotScheduleTimeStatus = expectedNextSnapshotScheduleTimeStatus;
    }

    /**
     * <p>
     * The status of next expected snapshot for clusters having a valid snapshot
     * schedule and backups enabled. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OnTrack - The next snapshot is expected to be taken on time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending - The next snapshot is pending to be taken.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedNextSnapshotScheduleTimeStatus <p>
     *            The status of next expected snapshot for clusters having a
     *            valid snapshot schedule and backups enabled. Possible values
     *            are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OnTrack - The next snapshot is expected to be taken on time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Pending - The next snapshot is pending to be taken.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withExpectedNextSnapshotScheduleTimeStatus(
            String expectedNextSnapshotScheduleTimeStatus) {
        this.expectedNextSnapshotScheduleTimeStatus = expectedNextSnapshotScheduleTimeStatus;
        return this;
    }

    /**
     * <p>
     * The date and time in UTC when system maintenance can begin.
     * </p>
     *
     * @return <p>
     *         The date and time in UTC when system maintenance can begin.
     *         </p>
     */
    public java.util.Date getNextMaintenanceWindowStartTime() {
        return nextMaintenanceWindowStartTime;
    }

    /**
     * <p>
     * The date and time in UTC when system maintenance can begin.
     * </p>
     *
     * @param nextMaintenanceWindowStartTime <p>
     *            The date and time in UTC when system maintenance can begin.
     *            </p>
     */
    public void setNextMaintenanceWindowStartTime(java.util.Date nextMaintenanceWindowStartTime) {
        this.nextMaintenanceWindowStartTime = nextMaintenanceWindowStartTime;
    }

    /**
     * <p>
     * The date and time in UTC when system maintenance can begin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMaintenanceWindowStartTime <p>
     *            The date and time in UTC when system maintenance can begin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withNextMaintenanceWindowStartTime(java.util.Date nextMaintenanceWindowStartTime) {
        this.nextMaintenanceWindowStartTime = nextMaintenanceWindowStartTime;
        return this;
    }

    /**
     * <p>
     * Returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AllowCancelResize: a boolean value indicating if the resize operation can
     * be cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResizeType: Returns ClassicResize
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Returns the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AllowCancelResize: a boolean value indicating if the resize
     *         operation can be cancelled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ResizeType: Returns ClassicResize
     *         </p>
     *         </li>
     *         </ul>
     */
    public ResizeInfo getResizeInfo() {
        return resizeInfo;
    }

    /**
     * <p>
     * Returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AllowCancelResize: a boolean value indicating if the resize operation can
     * be cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResizeType: Returns ClassicResize
     * </p>
     * </li>
     * </ul>
     *
     * @param resizeInfo <p>
     *            Returns the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AllowCancelResize: a boolean value indicating if the resize
     *            operation can be cancelled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ResizeType: Returns ClassicResize
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResizeInfo(ResizeInfo resizeInfo) {
        this.resizeInfo = resizeInfo;
    }

    /**
     * <p>
     * Returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AllowCancelResize: a boolean value indicating if the resize operation can
     * be cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResizeType: Returns ClassicResize
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resizeInfo <p>
     *            Returns the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AllowCancelResize: a boolean value indicating if the resize
     *            operation can be cancelled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ResizeType: Returns ClassicResize
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withResizeInfo(ResizeInfo resizeInfo) {
        this.resizeInfo = resizeInfo;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: " + getClusterStatus() + ",");
        if (getClusterAvailabilityStatus() != null)
            sb.append("ClusterAvailabilityStatus: " + getClusterAvailabilityStatus() + ",");
        if (getModifyStatus() != null)
            sb.append("ModifyStatus: " + getModifyStatus() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod()
                    + ",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: " + getManualSnapshotRetentionPeriod() + ",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getClusterParameterGroups() != null)
            sb.append("ClusterParameterGroups: " + getClusterParameterGroups() + ",");
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: " + getAllowVersionUpgrade() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getRestoreStatus() != null)
            sb.append("RestoreStatus: " + getRestoreStatus() + ",");
        if (getDataTransferProgress() != null)
            sb.append("DataTransferProgress: " + getDataTransferProgress() + ",");
        if (getHsmStatus() != null)
            sb.append("HsmStatus: " + getHsmStatus() + ",");
        if (getClusterSnapshotCopyStatus() != null)
            sb.append("ClusterSnapshotCopyStatus: " + getClusterSnapshotCopyStatus() + ",");
        if (getClusterPublicKey() != null)
            sb.append("ClusterPublicKey: " + getClusterPublicKey() + ",");
        if (getClusterNodes() != null)
            sb.append("ClusterNodes: " + getClusterNodes() + ",");
        if (getElasticIpStatus() != null)
            sb.append("ElasticIpStatus: " + getElasticIpStatus() + ",");
        if (getClusterRevisionNumber() != null)
            sb.append("ClusterRevisionNumber: " + getClusterRevisionNumber() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: " + getEnhancedVpcRouting() + ",");
        if (getIamRoles() != null)
            sb.append("IamRoles: " + getIamRoles() + ",");
        if (getPendingActions() != null)
            sb.append("PendingActions: " + getPendingActions() + ",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: " + getMaintenanceTrackName() + ",");
        if (getElasticResizeNumberOfNodeOptions() != null)
            sb.append("ElasticResizeNumberOfNodeOptions: " + getElasticResizeNumberOfNodeOptions()
                    + ",");
        if (getDeferredMaintenanceWindows() != null)
            sb.append("DeferredMaintenanceWindows: " + getDeferredMaintenanceWindows() + ",");
        if (getSnapshotScheduleIdentifier() != null)
            sb.append("SnapshotScheduleIdentifier: " + getSnapshotScheduleIdentifier() + ",");
        if (getSnapshotScheduleState() != null)
            sb.append("SnapshotScheduleState: " + getSnapshotScheduleState() + ",");
        if (getExpectedNextSnapshotScheduleTime() != null)
            sb.append("ExpectedNextSnapshotScheduleTime: " + getExpectedNextSnapshotScheduleTime()
                    + ",");
        if (getExpectedNextSnapshotScheduleTimeStatus() != null)
            sb.append("ExpectedNextSnapshotScheduleTimeStatus: "
                    + getExpectedNextSnapshotScheduleTimeStatus() + ",");
        if (getNextMaintenanceWindowStartTime() != null)
            sb.append("NextMaintenanceWindowStartTime: " + getNextMaintenanceWindowStartTime()
                    + ",");
        if (getResizeInfo() != null)
            sb.append("ResizeInfo: " + getResizeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterAvailabilityStatus() == null) ? 0 : getClusterAvailabilityStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getModifyStatus() == null) ? 0 : getModifyStatus().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0
                        : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getManualSnapshotRetentionPeriod() == null) ? 0
                        : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterParameterGroups() == null) ? 0 : getClusterParameterGroups()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName()
                        .hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode
                + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode
                + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreStatus() == null) ? 0 : getRestoreStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDataTransferProgress() == null) ? 0 : getDataTransferProgress().hashCode());
        hashCode = prime * hashCode + ((getHsmStatus() == null) ? 0 : getHsmStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterSnapshotCopyStatus() == null) ? 0 : getClusterSnapshotCopyStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClusterPublicKey() == null) ? 0 : getClusterPublicKey().hashCode());
        hashCode = prime * hashCode
                + ((getClusterNodes() == null) ? 0 : getClusterNodes().hashCode());
        hashCode = prime * hashCode
                + ((getElasticIpStatus() == null) ? 0 : getElasticIpStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterRevisionNumber() == null) ? 0 : getClusterRevisionNumber().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        hashCode = prime * hashCode
                + ((getPendingActions() == null) ? 0 : getPendingActions().hashCode());
        hashCode = prime * hashCode
                + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticResizeNumberOfNodeOptions() == null) ? 0
                        : getElasticResizeNumberOfNodeOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeferredMaintenanceWindows() == null) ? 0 : getDeferredMaintenanceWindows()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotScheduleIdentifier() == null) ? 0 : getSnapshotScheduleIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotScheduleState() == null) ? 0 : getSnapshotScheduleState().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpectedNextSnapshotScheduleTime() == null) ? 0
                        : getExpectedNextSnapshotScheduleTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpectedNextSnapshotScheduleTimeStatus() == null) ? 0
                        : getExpectedNextSnapshotScheduleTimeStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextMaintenanceWindowStartTime() == null) ? 0
                        : getNextMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getResizeInfo() == null) ? 0 : getResizeInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null
                && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        if (other.getClusterAvailabilityStatus() == null
                ^ this.getClusterAvailabilityStatus() == null)
            return false;
        if (other.getClusterAvailabilityStatus() != null
                && other.getClusterAvailabilityStatus().equals(this.getClusterAvailabilityStatus()) == false)
            return false;
        if (other.getModifyStatus() == null ^ this.getModifyStatus() == null)
            return false;
        if (other.getModifyStatus() != null
                && other.getModifyStatus().equals(this.getModifyStatus()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null
                && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() == null
                ^ this.getAutomatedSnapshotRetentionPeriod() == null)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null
                && other.getAutomatedSnapshotRetentionPeriod().equals(
                        this.getAutomatedSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null
                ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(
                        this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null
                && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null
                && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getClusterParameterGroups() == null ^ this.getClusterParameterGroups() == null)
            return false;
        if (other.getClusterParameterGroups() != null
                && other.getClusterParameterGroups().equals(this.getClusterParameterGroups()) == false)
            return false;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null
                && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null
                && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getAllowVersionUpgrade() == null ^ this.getAllowVersionUpgrade() == null)
            return false;
        if (other.getAllowVersionUpgrade() != null
                && other.getAllowVersionUpgrade().equals(this.getAllowVersionUpgrade()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getRestoreStatus() == null ^ this.getRestoreStatus() == null)
            return false;
        if (other.getRestoreStatus() != null
                && other.getRestoreStatus().equals(this.getRestoreStatus()) == false)
            return false;
        if (other.getDataTransferProgress() == null ^ this.getDataTransferProgress() == null)
            return false;
        if (other.getDataTransferProgress() != null
                && other.getDataTransferProgress().equals(this.getDataTransferProgress()) == false)
            return false;
        if (other.getHsmStatus() == null ^ this.getHsmStatus() == null)
            return false;
        if (other.getHsmStatus() != null
                && other.getHsmStatus().equals(this.getHsmStatus()) == false)
            return false;
        if (other.getClusterSnapshotCopyStatus() == null
                ^ this.getClusterSnapshotCopyStatus() == null)
            return false;
        if (other.getClusterSnapshotCopyStatus() != null
                && other.getClusterSnapshotCopyStatus().equals(this.getClusterSnapshotCopyStatus()) == false)
            return false;
        if (other.getClusterPublicKey() == null ^ this.getClusterPublicKey() == null)
            return false;
        if (other.getClusterPublicKey() != null
                && other.getClusterPublicKey().equals(this.getClusterPublicKey()) == false)
            return false;
        if (other.getClusterNodes() == null ^ this.getClusterNodes() == null)
            return false;
        if (other.getClusterNodes() != null
                && other.getClusterNodes().equals(this.getClusterNodes()) == false)
            return false;
        if (other.getElasticIpStatus() == null ^ this.getElasticIpStatus() == null)
            return false;
        if (other.getElasticIpStatus() != null
                && other.getElasticIpStatus().equals(this.getElasticIpStatus()) == false)
            return false;
        if (other.getClusterRevisionNumber() == null ^ this.getClusterRevisionNumber() == null)
            return false;
        if (other.getClusterRevisionNumber() != null
                && other.getClusterRevisionNumber().equals(this.getClusterRevisionNumber()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null
                && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getIamRoles() == null ^ this.getIamRoles() == null)
            return false;
        if (other.getIamRoles() != null && other.getIamRoles().equals(this.getIamRoles()) == false)
            return false;
        if (other.getPendingActions() == null ^ this.getPendingActions() == null)
            return false;
        if (other.getPendingActions() != null
                && other.getPendingActions().equals(this.getPendingActions()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null
                && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getElasticResizeNumberOfNodeOptions() == null
                ^ this.getElasticResizeNumberOfNodeOptions() == null)
            return false;
        if (other.getElasticResizeNumberOfNodeOptions() != null
                && other.getElasticResizeNumberOfNodeOptions().equals(
                        this.getElasticResizeNumberOfNodeOptions()) == false)
            return false;
        if (other.getDeferredMaintenanceWindows() == null
                ^ this.getDeferredMaintenanceWindows() == null)
            return false;
        if (other.getDeferredMaintenanceWindows() != null
                && other.getDeferredMaintenanceWindows().equals(
                        this.getDeferredMaintenanceWindows()) == false)
            return false;
        if (other.getSnapshotScheduleIdentifier() == null
                ^ this.getSnapshotScheduleIdentifier() == null)
            return false;
        if (other.getSnapshotScheduleIdentifier() != null
                && other.getSnapshotScheduleIdentifier().equals(
                        this.getSnapshotScheduleIdentifier()) == false)
            return false;
        if (other.getSnapshotScheduleState() == null ^ this.getSnapshotScheduleState() == null)
            return false;
        if (other.getSnapshotScheduleState() != null
                && other.getSnapshotScheduleState().equals(this.getSnapshotScheduleState()) == false)
            return false;
        if (other.getExpectedNextSnapshotScheduleTime() == null
                ^ this.getExpectedNextSnapshotScheduleTime() == null)
            return false;
        if (other.getExpectedNextSnapshotScheduleTime() != null
                && other.getExpectedNextSnapshotScheduleTime().equals(
                        this.getExpectedNextSnapshotScheduleTime()) == false)
            return false;
        if (other.getExpectedNextSnapshotScheduleTimeStatus() == null
                ^ this.getExpectedNextSnapshotScheduleTimeStatus() == null)
            return false;
        if (other.getExpectedNextSnapshotScheduleTimeStatus() != null
                && other.getExpectedNextSnapshotScheduleTimeStatus().equals(
                        this.getExpectedNextSnapshotScheduleTimeStatus()) == false)
            return false;
        if (other.getNextMaintenanceWindowStartTime() == null
                ^ this.getNextMaintenanceWindowStartTime() == null)
            return false;
        if (other.getNextMaintenanceWindowStartTime() != null
                && other.getNextMaintenanceWindowStartTime().equals(
                        this.getNextMaintenanceWindowStartTime()) == false)
            return false;
        if (other.getResizeInfo() == null ^ this.getResizeInfo() == null)
            return false;
        if (other.getResizeInfo() != null
                && other.getResizeInfo().equals(this.getResizeInfo()) == false)
            return false;
        return true;
    }
}
