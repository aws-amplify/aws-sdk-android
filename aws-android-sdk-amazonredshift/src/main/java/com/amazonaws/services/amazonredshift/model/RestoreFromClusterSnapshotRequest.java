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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new cluster from a snapshot. By default, Amazon Redshift creates
 * the resulting cluster with the same configuration as the original cluster
 * from which the snapshot was created, except that the new cluster is created
 * with the default cluster security and parameter groups. After Amazon Redshift
 * creates the cluster, you can use the <a>ModifyCluster</a> API to associate a
 * different security group and different parameter group with the restored
 * cluster. If you are using a DS node type, you can also choose to change to
 * another DS node type of the same size during restore.
 * </p>
 * <p>
 * If you restore a cluster into a VPC, you must provide a cluster subnet group
 * where you want the cluster restored.
 * </p>
 * <p>
 * For more information about working with snapshots, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"
 * >Amazon Redshift Snapshots</a> in the <i>Amazon Redshift Cluster Management
 * Guide</i>.
 * </p>
 */
public class RestoreFromClusterSnapshotRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     */
    private String snapshotClusterIdentifier;

    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-2a</code>
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean allowVersionUpgrade;

    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     * </p>
     */
    private String clusterSubnetGroupName;

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     */
    private String hsmClientCertificateIdentifier;

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     */
    private String hsmConfigurationIdentifier;

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     */
    private String elasticIp;

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Working with Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterParameterGroupName;

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     */
    private java.util.List<String> clusterSecurityGroups;

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance
     * can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken. For more information about the time blocks for each region, see <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is
     * 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
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
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken.
     * You can modify this if you are using any DS node type. In that case, you
     * can choose to restore into another DS node type of the same size. For
     * example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into
     * ds2.xlarge. If you have a DC instance type, you must restore into that
     * same instance type and size. In other words, you can only restore a
     * dc1.large instance type into another dc1.large instance type or dc2.large
     * instance type. You can't restore dc1.8xlarge to dc2.8xlarge. First
     * restore to a dc1.8xlarge cluster, then resize to a dc2.8large cluster.
     * For more information about node types, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     * > About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     */
    private String nodeType;

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
     * Reserved.
     * </p>
     */
    private String additionalInfo;

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services. You must supply the IAM
     * roles in their Amazon Resource Name (ARN) format. You can supply up to 10
     * IAM roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     */
    private java.util.List<String> iamRoles;

    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take
     * a snapshot, the snapshot inherits the <code>MaintenanceTrack</code> value
     * from the cluster. The snapshot might be on a different track than the
     * cluster that was the source for the snapshot. For example, suppose that
     * you take a snapshot of a cluster that is on the current track and then
     * change the cluster to be on the trailing track. In this case, the
     * snapshot and the source cluster are on different tracks.
     * </p>
     */
    private String maintenanceTrackName;

    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     */
    private String snapshotScheduleIdentifier;

    /**
     * <p>
     * The number of nodes specified when provisioning the restored cluster.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier of the cluster that will be created from restoring
     *         the snapshot.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alphabetic characters must be lowercase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be unique for all clusters within an AWS account.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster that will be created from
     *            restoring the snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alphabetic characters must be lowercase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be unique for all clusters within an AWS account.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster that will be created from
     *            restoring the snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alphabetic characters must be lowercase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be unique for all clusters within an AWS account.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     *
     * @return <p>
     *         The name of the snapshot from which to create the new cluster.
     *         This parameter isn't case sensitive.
     *         </p>
     *         <p>
     *         Example: <code>my-snapshot-id</code>
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The name of the snapshot from which to create the new cluster.
     *            This parameter isn't case sensitive.
     *            </p>
     *            <p>
     *            Example: <code>my-snapshot-id</code>
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The name of the snapshot from which to create the new cluster.
     *            This parameter isn't case sensitive.
     *            </p>
     *            <p>
     *            Example: <code>my-snapshot-id</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     *
     * @return <p>
     *         The name of the cluster the source snapshot was created from.
     *         This parameter is required if your IAM user has a policy
     *         containing a snapshot resource element that specifies anything
     *         other than * for the cluster name.
     *         </p>
     */
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     *
     * @param snapshotClusterIdentifier <p>
     *            The name of the cluster the source snapshot was created from.
     *            This parameter is required if your IAM user has a policy
     *            containing a snapshot resource element that specifies anything
     *            other than * for the cluster name.
     *            </p>
     */
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotClusterIdentifier <p>
     *            The name of the cluster the source snapshot was created from.
     *            This parameter is required if your IAM user has a policy
     *            containing a snapshot resource element that specifies anything
     *            other than * for the cluster name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withSnapshotClusterIdentifier(
            String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     *
     * @return <p>
     *         The port number on which the cluster accepts connections.
     *         </p>
     *         <p>
     *         Default: The same port as the original cluster.
     *         </p>
     *         <p>
     *         Constraints: Must be between <code>1115</code> and
     *         <code>65535</code>.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     *
     * @param port <p>
     *            The port number on which the cluster accepts connections.
     *            </p>
     *            <p>
     *            Default: The same port as the original cluster.
     *            </p>
     *            <p>
     *            Constraints: Must be between <code>1115</code> and
     *            <code>65535</code>.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which the cluster accepts connections.
     *            </p>
     *            <p>
     *            Default: The same port as the original cluster.
     *            </p>
     *            <p>
     *            Constraints: Must be between <code>1115</code> and
     *            <code>65535</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-2a</code>
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 Availability Zone in which to restore the cluster.
     *         </p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone.
     *         </p>
     *         <p>
     *         Example: <code>us-east-2a</code>
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-2a</code>
     * </p>
     *
     * @param availabilityZone <p>
     *            The Amazon EC2 Availability Zone in which to restore the
     *            cluster.
     *            </p>
     *            <p>
     *            Default: A random, system-chosen Availability Zone.
     *            </p>
     *            <p>
     *            Example: <code>us-east-2a</code>
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-2a</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Amazon EC2 Availability Zone in which to restore the
     *            cluster.
     *            </p>
     *            <p>
     *            Default: A random, system-chosen Availability Zone.
     *            </p>
     *            <p>
     *            Example: <code>us-east-2a</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, major version upgrades can be applied
     *         during the maintenance window to the Amazon Redshift engine that
     *         is running on the cluster.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, major version upgrades can be applied
     *         during the maintenance window to the Amazon Redshift engine that
     *         is running on the cluster.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @param allowVersionUpgrade <p>
     *            If <code>true</code>, major version upgrades can be applied
     *            during the maintenance window to the Amazon Redshift engine
     *            that is running on the cluster.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowVersionUpgrade <p>
     *            If <code>true</code>, major version upgrades can be applied
     *            during the maintenance window to the Amazon Redshift engine
     *            that is running on the cluster.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     * </p>
     *
     * @return <p>
     *         The name of the subnet group where you want to cluster restored.
     *         </p>
     *         <p>
     *         A snapshot of cluster in VPC can be restored only in VPC.
     *         Therefore, you must provide subnet group name where you want the
     *         cluster restored.
     *         </p>
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     * </p>
     *
     * @param clusterSubnetGroupName <p>
     *            The name of the subnet group where you want to cluster
     *            restored.
     *            </p>
     *            <p>
     *            A snapshot of cluster in VPC can be restored only in VPC.
     *            Therefore, you must provide subnet group name where you want
     *            the cluster restored.
     *            </p>
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSubnetGroupName <p>
     *            The name of the subnet group where you want to cluster
     *            restored.
     *            </p>
     *            <p>
     *            A snapshot of cluster in VPC can be restored only in VPC.
     *            Therefore, you must provide subnet group name where you want
     *            the cluster restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withClusterSubnetGroupName(
            String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the cluster can be accessed from a public
     *         network.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the cluster can be accessed from a public
     *         network.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            If <code>true</code>, the cluster can be accessed from a
     *            public network.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            If <code>true</code>, the cluster can be accessed from a
     *            public network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     *
     * @return <p>
     *         The AWS customer account used to create or copy the snapshot.
     *         Required if you are restoring a snapshot you do not own, optional
     *         if you own the snapshot.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     *
     * @param ownerAccount <p>
     *            The AWS customer account used to create or copy the snapshot.
     *            Required if you are restoring a snapshot you do not own,
     *            optional if you own the snapshot.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The AWS customer account used to create or copy the snapshot.
     *            Required if you are restoring a snapshot you do not own,
     *            optional if you own the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the HSM client certificate the Amazon
     *         Redshift cluster uses to retrieve the data encryption keys stored
     *         in an HSM.
     *         </p>
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     *
     * @param hsmClientCertificateIdentifier <p>
     *            Specifies the name of the HSM client certificate the Amazon
     *            Redshift cluster uses to retrieve the data encryption keys
     *            stored in an HSM.
     *            </p>
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmClientCertificateIdentifier <p>
     *            Specifies the name of the HSM client certificate the Amazon
     *            Redshift cluster uses to retrieve the data encryption keys
     *            stored in an HSM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withHsmClientCertificateIdentifier(
            String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and
     *         store keys in an HSM.
     *         </p>
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     *
     * @param hsmConfigurationIdentifier <p>
     *            Specifies the name of the HSM configuration that contains the
     *            information the Amazon Redshift cluster can use to retrieve
     *            and store keys in an HSM.
     *            </p>
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmConfigurationIdentifier <p>
     *            Specifies the name of the HSM configuration that contains the
     *            information the Amazon Redshift cluster can use to retrieve
     *            and store keys in an HSM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withHsmConfigurationIdentifier(
            String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     *
     * @return <p>
     *         The elastic IP (EIP) address for the cluster.
     *         </p>
     */
    public String getElasticIp() {
        return elasticIp;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     *
     * @param elasticIp <p>
     *            The elastic IP (EIP) address for the cluster.
     *            </p>
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticIp <p>
     *            The elastic IP (EIP) address for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Working with Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the parameter group to be associated with this
     *         cluster.
     *         </p>
     *         <p>
     *         Default: The default Amazon Redshift cluster parameter group. For
     *         information about the default parameter group, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *         >Working with Amazon Redshift Parameter Groups</a>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getClusterParameterGroupName() {
        return clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Working with Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @param clusterParameterGroupName <p>
     *            The name of the parameter group to be associated with this
     *            cluster.
     *            </p>
     *            <p>
     *            Default: The default Amazon Redshift cluster parameter group.
     *            For information about the default parameter group, go to <a
     *            href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Working with Amazon Redshift Parameter Groups</a>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Working with Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterParameterGroupName <p>
     *            The name of the parameter group to be associated with this
     *            cluster.
     *            </p>
     *            <p>
     *            Default: The default Amazon Redshift cluster parameter group.
     *            For information about the default parameter group, go to <a
     *            href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Working with Amazon Redshift Parameter Groups</a>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withClusterParameterGroupName(
            String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     *
     * @return <p>
     *         A list of security groups to be associated with this cluster.
     *         </p>
     *         <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *         </p>
     *         <p>
     *         Cluster security groups only apply to clusters outside of VPCs.
     *         </p>
     */
    public java.util.List<String> getClusterSecurityGroups() {
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     *
     * @param clusterSecurityGroups <p>
     *            A list of security groups to be associated with this cluster.
     *            </p>
     *            <p>
     *            Default: The default cluster security group for Amazon
     *            Redshift.
     *            </p>
     *            <p>
     *            Cluster security groups only apply to clusters outside of
     *            VPCs.
     *            </p>
     */
    public void setClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }

        this.clusterSecurityGroups = new java.util.ArrayList<String>(clusterSecurityGroups);
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroups <p>
     *            A list of security groups to be associated with this cluster.
     *            </p>
     *            <p>
     *            Default: The default cluster security group for Amazon
     *            Redshift.
     *            </p>
     *            <p>
     *            Cluster security groups only apply to clusters outside of
     *            VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withClusterSecurityGroups(
            String... clusterSecurityGroups) {
        if (getClusterSecurityGroups() == null) {
            this.clusterSecurityGroups = new java.util.ArrayList<String>(
                    clusterSecurityGroups.length);
        }
        for (String value : clusterSecurityGroups) {
            this.clusterSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroups <p>
     *            A list of security groups to be associated with this cluster.
     *            </p>
     *            <p>
     *            Default: The default cluster security group for Amazon
     *            Redshift.
     *            </p>
     *            <p>
     *            Cluster security groups only apply to clusters outside of
     *            VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withClusterSecurityGroups(
            java.util.Collection<String> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     *
     * @return <p>
     *         A list of Virtual Private Cloud (VPC) security groups to be
     *         associated with the cluster.
     *         </p>
     *         <p>
     *         Default: The default VPC security group is associated with the
     *         cluster.
     *         </p>
     *         <p>
     *         VPC security groups only apply to clusters in VPCs.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of Virtual Private Cloud (VPC) security groups to be
     *            associated with the cluster.
     *            </p>
     *            <p>
     *            Default: The default VPC security group is associated with the
     *            cluster.
     *            </p>
     *            <p>
     *            VPC security groups only apply to clusters in VPCs.
     *            </p>
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of Virtual Private Cloud (VPC) security groups to be
     *            associated with the cluster.
     *            </p>
     *            <p>
     *            Default: The default VPC security group is associated with the
     *            cluster.
     *            </p>
     *            <p>
     *            VPC security groups only apply to clusters in VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) {
            this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds.length);
        }
        for (String value : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of Virtual Private Cloud (VPC) security groups to be
     *            associated with the cluster.
     *            </p>
     *            <p>
     *            Default: The default VPC security group is associated with the
     *            cluster.
     *            </p>
     *            <p>
     *            VPC security groups only apply to clusters in VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance
     * can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken. For more information about the time blocks for each region, see <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @return <p>
     *         The weekly time range (in UTC) during which automated cluster
     *         maintenance can occur.
     *         </p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         Default: The value selected for the cluster from which the
     *         snapshot was taken. For more information about the time blocks
     *         for each region, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     *         >Maintenance Windows</a> in Amazon Redshift Cluster Management
     *         Guide.
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance
     * can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken. For more information about the time blocks for each region, see <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range (in UTC) during which automated cluster
     *            maintenance can occur.
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            Default: The value selected for the cluster from which the
     *            snapshot was taken. For more information about the time blocks
     *            for each region, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     *            >Maintenance Windows</a> in Amazon Redshift Cluster Management
     *            Guide.
     *            </p>
     *            <p>
     *            Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *            </p>
     *            <p>
     *            Constraints: Minimum 30-minute window.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance
     * can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken. For more information about the time blocks for each region, see <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range (in UTC) during which automated cluster
     *            maintenance can occur.
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            Default: The value selected for the cluster from which the
     *            snapshot was taken. For more information about the time blocks
     *            for each region, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     *            >Maintenance Windows</a> in Amazon Redshift Cluster Management
     *            Guide.
     *            </p>
     *            <p>
     *            Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *            </p>
     *            <p>
     *            Constraints: Minimum 30-minute window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is
     * 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     *
     * @return <p>
     *         The number of days that automated snapshots are retained. If the
     *         value is 0, automated snapshots are disabled. Even if automated
     *         snapshots are disabled, you can still create manual snapshots
     *         when you want with <a>CreateClusterSnapshot</a>.
     *         </p>
     *         <p>
     *         Default: The value selected for the cluster from which the
     *         snapshot was taken.
     *         </p>
     *         <p>
     *         Constraints: Must be a value from 0 to 35.
     *         </p>
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is
     * 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     *
     * @param automatedSnapshotRetentionPeriod <p>
     *            The number of days that automated snapshots are retained. If
     *            the value is 0, automated snapshots are disabled. Even if
     *            automated snapshots are disabled, you can still create manual
     *            snapshots when you want with <a>CreateClusterSnapshot</a>.
     *            </p>
     *            <p>
     *            Default: The value selected for the cluster from which the
     *            snapshot was taken.
     *            </p>
     *            <p>
     *            Constraints: Must be a value from 0 to 35.
     *            </p>
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is
     * 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was
     * taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automatedSnapshotRetentionPeriod <p>
     *            The number of days that automated snapshots are retained. If
     *            the value is 0, automated snapshots are disabled. Even if
     *            automated snapshots are disabled, you can still create manual
     *            snapshots when you want with <a>CreateClusterSnapshot</a>.
     *            </p>
     *            <p>
     *            Default: The value selected for the cluster from which the
     *            snapshot was taken.
     *            </p>
     *            <p>
     *            Constraints: Must be a value from 0 to 35.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withAutomatedSnapshotRetentionPeriod(
            Integer automatedSnapshotRetentionPeriod) {
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
    public RestoreFromClusterSnapshotRequest withManualSnapshotRetentionPeriod(
            Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     * </p>
     *
     * @return <p>
     *         The AWS Key Management Service (KMS) key ID of the encryption key
     *         that you want to use to encrypt data in the cluster that you
     *         restore from a shared snapshot.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (KMS) key ID of the encryption
     *            key that you want to use to encrypt data in the cluster that
     *            you restore from a shared snapshot.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (KMS) key ID of the encryption
     *            key that you want to use to encrypt data in the cluster that
     *            you restore from a shared snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken.
     * You can modify this if you are using any DS node type. In that case, you
     * can choose to restore into another DS node type of the same size. For
     * example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into
     * ds2.xlarge. If you have a DC instance type, you must restore into that
     * same instance type and size. In other words, you can only restore a
     * dc1.large instance type into another dc1.large instance type or dc2.large
     * instance type. You can't restore dc1.8xlarge to dc2.8xlarge. First
     * restore to a dc1.8xlarge cluster, then resize to a dc2.8large cluster.
     * For more information about node types, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     * > About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     *
     * @return <p>
     *         The node type that the restored cluster will be provisioned with.
     *         </p>
     *         <p>
     *         Default: The node type of the cluster from which the snapshot was
     *         taken. You can modify this if you are using any DS node type. In
     *         that case, you can choose to restore into another DS node type of
     *         the same size. For example, you can restore ds1.8xlarge into
     *         ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC
     *         instance type, you must restore into that same instance type and
     *         size. In other words, you can only restore a dc1.large instance
     *         type into another dc1.large instance type or dc2.large instance
     *         type. You can't restore dc1.8xlarge to dc2.8xlarge. First restore
     *         to a dc1.8xlarge cluster, then resize to a dc2.8large cluster.
     *         For more information about node types, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     *         > About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     *         Management Guide</i>.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken.
     * You can modify this if you are using any DS node type. In that case, you
     * can choose to restore into another DS node type of the same size. For
     * example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into
     * ds2.xlarge. If you have a DC instance type, you must restore into that
     * same instance type and size. In other words, you can only restore a
     * dc1.large instance type into another dc1.large instance type or dc2.large
     * instance type. You can't restore dc1.8xlarge to dc2.8xlarge. First
     * restore to a dc1.8xlarge cluster, then resize to a dc2.8large cluster.
     * For more information about node types, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     * > About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     *
     * @param nodeType <p>
     *            The node type that the restored cluster will be provisioned
     *            with.
     *            </p>
     *            <p>
     *            Default: The node type of the cluster from which the snapshot
     *            was taken. You can modify this if you are using any DS node
     *            type. In that case, you can choose to restore into another DS
     *            node type of the same size. For example, you can restore
     *            ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge.
     *            If you have a DC instance type, you must restore into that
     *            same instance type and size. In other words, you can only
     *            restore a dc1.large instance type into another dc1.large
     *            instance type or dc2.large instance type. You can't restore
     *            dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlarge
     *            cluster, then resize to a dc2.8large cluster. For more
     *            information about node types, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     *            > About Clusters and Nodes</a> in the <i>Amazon Redshift
     *            Cluster Management Guide</i>.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken.
     * You can modify this if you are using any DS node type. In that case, you
     * can choose to restore into another DS node type of the same size. For
     * example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into
     * ds2.xlarge. If you have a DC instance type, you must restore into that
     * same instance type and size. In other words, you can only restore a
     * dc1.large instance type into another dc1.large instance type or dc2.large
     * instance type. You can't restore dc1.8xlarge to dc2.8xlarge. First
     * restore to a dc1.8xlarge cluster, then resize to a dc2.8large cluster.
     * For more information about node types, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     * > About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type that the restored cluster will be provisioned
     *            with.
     *            </p>
     *            <p>
     *            Default: The node type of the cluster from which the snapshot
     *            was taken. You can modify this if you are using any DS node
     *            type. In that case, you can choose to restore into another DS
     *            node type of the same size. For example, you can restore
     *            ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge.
     *            If you have a DC instance type, you must restore into that
     *            same instance type and size. In other words, you can only
     *            restore a dc1.large instance type into another dc1.large
     *            instance type or dc2.large instance type. You can't restore
     *            dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlarge
     *            cluster, then resize to a dc2.8large cluster. For more
     *            information about node types, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     *            > About Clusters and Nodes</a> in the <i>Amazon Redshift
     *            Cluster Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
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
    public RestoreFromClusterSnapshotRequest withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     *
     * @return <p>
     *         Reserved.
     *         </p>
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     *
     * @param additionalInfo <p>
     *            Reserved.
     *            </p>
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalInfo <p>
     *            Reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services. You must supply the IAM
     * roles in their Amazon Resource Name (ARN) format. You can supply up to 10
     * IAM roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     *
     * @return <p>
     *         A list of AWS Identity and Access Management (IAM) roles that can
     *         be used by the cluster to access other AWS services. You must
     *         supply the IAM roles in their Amazon Resource Name (ARN) format.
     *         You can supply up to 10 IAM roles in a single request.
     *         </p>
     *         <p>
     *         A cluster can have up to 10 IAM roles associated at any time.
     *         </p>
     */
    public java.util.List<String> getIamRoles() {
        return iamRoles;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services. You must supply the IAM
     * roles in their Amazon Resource Name (ARN) format. You can supply up to 10
     * IAM roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     *
     * @param iamRoles <p>
     *            A list of AWS Identity and Access Management (IAM) roles that
     *            can be used by the cluster to access other AWS services. You
     *            must supply the IAM roles in their Amazon Resource Name (ARN)
     *            format. You can supply up to 10 IAM roles in a single request.
     *            </p>
     *            <p>
     *            A cluster can have up to 10 IAM roles associated at any time.
     *            </p>
     */
    public void setIamRoles(java.util.Collection<String> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
            return;
        }

        this.iamRoles = new java.util.ArrayList<String>(iamRoles);
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services. You must supply the IAM
     * roles in their Amazon Resource Name (ARN) format. You can supply up to 10
     * IAM roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoles <p>
     *            A list of AWS Identity and Access Management (IAM) roles that
     *            can be used by the cluster to access other AWS services. You
     *            must supply the IAM roles in their Amazon Resource Name (ARN)
     *            format. You can supply up to 10 IAM roles in a single request.
     *            </p>
     *            <p>
     *            A cluster can have up to 10 IAM roles associated at any time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withIamRoles(String... iamRoles) {
        if (getIamRoles() == null) {
            this.iamRoles = new java.util.ArrayList<String>(iamRoles.length);
        }
        for (String value : iamRoles) {
            this.iamRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used
     * by the cluster to access other AWS services. You must supply the IAM
     * roles in their Amazon Resource Name (ARN) format. You can supply up to 10
     * IAM roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoles <p>
     *            A list of AWS Identity and Access Management (IAM) roles that
     *            can be used by the cluster to access other AWS services. You
     *            must supply the IAM roles in their Amazon Resource Name (ARN)
     *            format. You can supply up to 10 IAM roles in a single request.
     *            </p>
     *            <p>
     *            A cluster can have up to 10 IAM roles associated at any time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withIamRoles(java.util.Collection<String> iamRoles) {
        setIamRoles(iamRoles);
        return this;
    }

    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take
     * a snapshot, the snapshot inherits the <code>MaintenanceTrack</code> value
     * from the cluster. The snapshot might be on a different track than the
     * cluster that was the source for the snapshot. For example, suppose that
     * you take a snapshot of a cluster that is on the current track and then
     * change the cluster to be on the trailing track. In this case, the
     * snapshot and the source cluster are on different tracks.
     * </p>
     *
     * @return <p>
     *         The name of the maintenance track for the restored cluster. When
     *         you take a snapshot, the snapshot inherits the
     *         <code>MaintenanceTrack</code> value from the cluster. The
     *         snapshot might be on a different track than the cluster that was
     *         the source for the snapshot. For example, suppose that you take a
     *         snapshot of a cluster that is on the current track and then
     *         change the cluster to be on the trailing track. In this case, the
     *         snapshot and the source cluster are on different tracks.
     *         </p>
     */
    public String getMaintenanceTrackName() {
        return maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take
     * a snapshot, the snapshot inherits the <code>MaintenanceTrack</code> value
     * from the cluster. The snapshot might be on a different track than the
     * cluster that was the source for the snapshot. For example, suppose that
     * you take a snapshot of a cluster that is on the current track and then
     * change the cluster to be on the trailing track. In this case, the
     * snapshot and the source cluster are on different tracks.
     * </p>
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track for the restored cluster.
     *            When you take a snapshot, the snapshot inherits the
     *            <code>MaintenanceTrack</code> value from the cluster. The
     *            snapshot might be on a different track than the cluster that
     *            was the source for the snapshot. For example, suppose that you
     *            take a snapshot of a cluster that is on the current track and
     *            then change the cluster to be on the trailing track. In this
     *            case, the snapshot and the source cluster are on different
     *            tracks.
     *            </p>
     */
    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take
     * a snapshot, the snapshot inherits the <code>MaintenanceTrack</code> value
     * from the cluster. The snapshot might be on a different track than the
     * cluster that was the source for the snapshot. For example, suppose that
     * you take a snapshot of a cluster that is on the current track and then
     * change the cluster to be on the trailing track. In this case, the
     * snapshot and the source cluster are on different tracks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track for the restored cluster.
     *            When you take a snapshot, the snapshot inherits the
     *            <code>MaintenanceTrack</code> value from the cluster. The
     *            snapshot might be on a different track than the cluster that
     *            was the source for the snapshot. For example, suppose that you
     *            take a snapshot of a cluster that is on the current track and
     *            then change the cluster to be on the trailing track. In this
     *            case, the snapshot and the source cluster are on different
     *            tracks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the snapshot schedule.
     *         </p>
     */
    public String getSnapshotScheduleIdentifier() {
        return snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     *
     * @param snapshotScheduleIdentifier <p>
     *            A unique identifier for the snapshot schedule.
     *            </p>
     */
    public void setSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
        this.snapshotScheduleIdentifier = snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotScheduleIdentifier <p>
     *            A unique identifier for the snapshot schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withSnapshotScheduleIdentifier(
            String snapshotScheduleIdentifier) {
        this.snapshotScheduleIdentifier = snapshotScheduleIdentifier;
        return this;
    }

    /**
     * <p>
     * The number of nodes specified when provisioning the restored cluster.
     * </p>
     *
     * @return <p>
     *         The number of nodes specified when provisioning the restored
     *         cluster.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes specified when provisioning the restored cluster.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The number of nodes specified when provisioning the restored
     *            cluster.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes specified when provisioning the restored cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The number of nodes specified when provisioning the restored
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreFromClusterSnapshotRequest withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotClusterIdentifier() != null)
            sb.append("SnapshotClusterIdentifier: " + getSnapshotClusterIdentifier() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: " + getAllowVersionUpgrade() + ",");
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier()
                    + ",");
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getElasticIp() != null)
            sb.append("ElasticIp: " + getElasticIp() + ",");
        if (getClusterParameterGroupName() != null)
            sb.append("ClusterParameterGroupName: " + getClusterParameterGroupName() + ",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod()
                    + ",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: " + getManualSnapshotRetentionPeriod() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: " + getEnhancedVpcRouting() + ",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getIamRoles() != null)
            sb.append("IamRoles: " + getIamRoles() + ",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: " + getMaintenanceTrackName() + ",");
        if (getSnapshotScheduleIdentifier() != null)
            sb.append("SnapshotScheduleIdentifier: " + getSnapshotScheduleIdentifier() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier()
                        .hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime
                * hashCode
                + ((getHsmClientCertificateIdentifier() == null) ? 0
                        : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier()
                        .hashCode());
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterParameterGroupName() == null) ? 0 : getClusterParameterGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0
                        : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getManualSnapshotRetentionPeriod() == null) ? 0
                        : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        hashCode = prime * hashCode
                + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotScheduleIdentifier() == null) ? 0 : getSnapshotScheduleIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreFromClusterSnapshotRequest == false)
            return false;
        RestoreFromClusterSnapshotRequest other = (RestoreFromClusterSnapshotRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotClusterIdentifier() == null
                ^ this.getSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSnapshotClusterIdentifier() != null
                && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false)
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
        if (other.getAllowVersionUpgrade() == null ^ this.getAllowVersionUpgrade() == null)
            return false;
        if (other.getAllowVersionUpgrade() != null
                && other.getAllowVersionUpgrade().equals(this.getAllowVersionUpgrade()) == false)
            return false;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null
                && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getHsmClientCertificateIdentifier() == null
                ^ this.getHsmClientCertificateIdentifier() == null)
            return false;
        if (other.getHsmClientCertificateIdentifier() != null
                && other.getHsmClientCertificateIdentifier().equals(
                        this.getHsmClientCertificateIdentifier()) == false)
            return false;
        if (other.getHsmConfigurationIdentifier() == null
                ^ this.getHsmConfigurationIdentifier() == null)
            return false;
        if (other.getHsmConfigurationIdentifier() != null
                && other.getHsmConfigurationIdentifier().equals(
                        this.getHsmConfigurationIdentifier()) == false)
            return false;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null
                && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        if (other.getClusterParameterGroupName() == null
                ^ this.getClusterParameterGroupName() == null)
            return false;
        if (other.getClusterParameterGroupName() != null
                && other.getClusterParameterGroupName().equals(this.getClusterParameterGroupName()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null
                && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null
                && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null
                && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getIamRoles() == null ^ this.getIamRoles() == null)
            return false;
        if (other.getIamRoles() != null && other.getIamRoles().equals(this.getIamRoles()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null
                && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getSnapshotScheduleIdentifier() == null
                ^ this.getSnapshotScheduleIdentifier() == null)
            return false;
        if (other.getSnapshotScheduleIdentifier() != null
                && other.getSnapshotScheduleIdentifier().equals(
                        this.getSnapshotScheduleIdentifier()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        return true;
    }
}
