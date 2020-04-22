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
 * Modifies the settings for a cluster.
 * </p>
 * <p>
 * You can also change node type and the number of nodes to scale up or down the
 * cluster. When resizing a cluster, you must specify both the number of nodes
 * and the node type even if one of the parameters does not change.
 * </p>
 * <p>
 * You can add another security or parameter group, or change the master user
 * password. Resetting a cluster password or modifying the security groups
 * associated with a cluster do not need a reboot. However, modifying a
 * parameter group requires a reboot for parameters to take effect. For more
 * information about managing clusters, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
 * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management
 * Guide</i>.
 * </p>
 */
public class ModifyClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes
     * into a read-only mode. After Amazon Redshift provisions a new cluster
     * based on your resize requirements, there will be outage for a period
     * while the old cluster is deleted and your connection is switched to the
     * new cluster. You can use <a>DescribeResize</a> to track the progress of
     * the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     */
    private String clusterType;

    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> |
     * <code>dc1.large</code> | <code>dc1.8xlarge</code> |
     * <code>dc2.large</code> | <code>dc2.8xlarge</code> |
     * <code>ra3.4xlarge</code> | <code>ra3.16xlarge</code>
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * A list of cluster security groups to be authorized on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the
     * list of groups to apply, will be revoked from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> clusterSecurityGroups;

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups to be associated
     * with the cluster. This change is asynchronously applied as soon as
     * possible.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to
     * regain access to the master user account for a cluster if the password is
     * lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except '
     * (single quote), " (double quote), \, /, @, or space.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUserPassword;

    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a cluster
     * use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter
     * group family that matches the cluster version.
     * </p>
     */
    private String clusterParameterGroupName;

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is
     * 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * If you decrease the automated snapshot retention period from its current
     * value, existing automated snapshots that fall outside of the new
     * retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is
     * retained. If the value is -1, the manual snapshot is retained
     * indefinitely. This value doesn't retroactively change the retention
     * periods of existing manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * if necessary. If system maintenance is necessary during the window, it
     * may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new
     * maintenance window indicates the current time, there must be at least 120
     * minutes between the current time and end of the window in order to ensure
     * that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example
     * <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is
     * currently in use, a new cluster parameter group in the cluster parameter
     * group family for the new version must be specified. The new cluster
     * parameter group can be the default for that cluster parameter group
     * family. For more information about parameters and parameter groups, go to
     * <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     */
    private String clusterVersion;

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied
     * automatically to the cluster during the maintenance window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean allowVersionUpgrade;

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
     * The new identifier for the cluster.
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
     * Example: <code>examplecluster</code>
     * </p>
     */
    private String newClusterIdentifier;

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * Only clusters in VPCs can be set to be publicly available.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and
     * publicly-accessible through an Internet gateway. For more information
     * about provisioning clusters in EC2-VPC, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     * >Supported Platforms to Launch Your Cluster</a> in the Amazon Redshift
     * Cluster Management Guide.
     * </p>
     */
    private String elasticIp;

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
     * The name for the maintenance track that you want to assign for the
     * cluster. This name change is asynchronous. The new track name stays in
     * the <code>PendingModifiedValues</code> for the cluster until the next
     * maintenance window. When the maintenance track changes, the cluster is
     * switched to the latest cluster release available for the maintenance
     * track. At this point, the maintenance track name is applied.
     * </p>
     */
    private String maintenanceTrackName;

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the value is encrypted
     * (true) and you provide a value for the <code>KmsKeyId</code> parameter,
     * we encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we encrypt with the default key.
     * In the China region we use legacy encryption if you specify that the
     * cluster is encrypted.
     * </p>
     * <p>
     * If the value is not encrypted (false), then the cluster is decrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster to be modified.
     *         </p>
     *         <p>
     *         Example: <code>examplecluster</code>
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster to be modified.
     *            </p>
     *            <p>
     *            Example: <code>examplecluster</code>
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster to be modified.
     *            </p>
     *            <p>
     *            Example: <code>examplecluster</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes
     * into a read-only mode. After Amazon Redshift provisions a new cluster
     * based on your resize requirements, there will be outage for a period
     * while the old cluster is deleted and your connection is switched to the
     * new cluster. You can use <a>DescribeResize</a> to track the progress of
     * the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     *
     * @return <p>
     *         The new cluster type.
     *         </p>
     *         <p>
     *         When you submit your cluster resize request, your existing
     *         cluster goes into a read-only mode. After Amazon Redshift
     *         provisions a new cluster based on your resize requirements, there
     *         will be outage for a period while the old cluster is deleted and
     *         your connection is switched to the new cluster. You can use
     *         <a>DescribeResize</a> to track the progress of the resize
     *         request.
     *         </p>
     *         <p>
     *         Valid Values: <code> multi-node | single-node </code>
     *         </p>
     */
    public String getClusterType() {
        return clusterType;
    }

    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes
     * into a read-only mode. After Amazon Redshift provisions a new cluster
     * based on your resize requirements, there will be outage for a period
     * while the old cluster is deleted and your connection is switched to the
     * new cluster. You can use <a>DescribeResize</a> to track the progress of
     * the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     *
     * @param clusterType <p>
     *            The new cluster type.
     *            </p>
     *            <p>
     *            When you submit your cluster resize request, your existing
     *            cluster goes into a read-only mode. After Amazon Redshift
     *            provisions a new cluster based on your resize requirements,
     *            there will be outage for a period while the old cluster is
     *            deleted and your connection is switched to the new cluster.
     *            You can use <a>DescribeResize</a> to track the progress of the
     *            resize request.
     *            </p>
     *            <p>
     *            Valid Values: <code> multi-node | single-node </code>
     *            </p>
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes
     * into a read-only mode. After Amazon Redshift provisions a new cluster
     * based on your resize requirements, there will be outage for a period
     * while the old cluster is deleted and your connection is switched to the
     * new cluster. You can use <a>DescribeResize</a> to track the progress of
     * the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterType <p>
     *            The new cluster type.
     *            </p>
     *            <p>
     *            When you submit your cluster resize request, your existing
     *            cluster goes into a read-only mode. After Amazon Redshift
     *            provisions a new cluster based on your resize requirements,
     *            there will be outage for a period while the old cluster is
     *            deleted and your connection is switched to the new cluster.
     *            You can use <a>DescribeResize</a> to track the progress of the
     *            resize request.
     *            </p>
     *            <p>
     *            Valid Values: <code> multi-node | single-node </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> |
     * <code>dc1.large</code> | <code>dc1.8xlarge</code> |
     * <code>dc2.large</code> | <code>dc2.8xlarge</code> |
     * <code>ra3.4xlarge</code> | <code>ra3.16xlarge</code>
     * </p>
     *
     * @return <p>
     *         The new node type of the cluster. If you specify a new node type,
     *         you must also specify the number of nodes parameter.
     *         </p>
     *         <p>
     *         For more information about resizing clusters, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     *         >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon
     *         Redshift Cluster Management Guide</i>.
     *         </p>
     *         <p>
     *         Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code>
     *         | <code>dc1.large</code> | <code>dc1.8xlarge</code> |
     *         <code>dc2.large</code> | <code>dc2.8xlarge</code> |
     *         <code>ra3.4xlarge</code> | <code>ra3.16xlarge</code>
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> |
     * <code>dc1.large</code> | <code>dc1.8xlarge</code> |
     * <code>dc2.large</code> | <code>dc2.8xlarge</code> |
     * <code>ra3.4xlarge</code> | <code>ra3.16xlarge</code>
     * </p>
     *
     * @param nodeType <p>
     *            The new node type of the cluster. If you specify a new node
     *            type, you must also specify the number of nodes parameter.
     *            </p>
     *            <p>
     *            For more information about resizing clusters, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     *            >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     *            <p>
     *            Valid Values: <code>ds2.xlarge</code> |
     *            <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     *            <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     *            <code>dc2.8xlarge</code> | <code>ra3.4xlarge</code> |
     *            <code>ra3.16xlarge</code>
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> |
     * <code>dc1.large</code> | <code>dc1.8xlarge</code> |
     * <code>dc2.large</code> | <code>dc2.8xlarge</code> |
     * <code>ra3.4xlarge</code> | <code>ra3.16xlarge</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The new node type of the cluster. If you specify a new node
     *            type, you must also specify the number of nodes parameter.
     *            </p>
     *            <p>
     *            For more information about resizing clusters, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     *            >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     *            <p>
     *            Valid Values: <code>ds2.xlarge</code> |
     *            <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     *            <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     *            <code>dc2.8xlarge</code> | <code>ra3.4xlarge</code> |
     *            <code>ra3.16xlarge</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     *
     * @return <p>
     *         The new number of nodes of the cluster. If you specify a new
     *         number of nodes, you must also specify the node type parameter.
     *         </p>
     *         <p>
     *         For more information about resizing clusters, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     *         >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon
     *         Redshift Cluster Management Guide</i>.
     *         </p>
     *         <p>
     *         Valid Values: Integer greater than <code>0</code>.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The new number of nodes of the cluster. If you specify a new
     *            number of nodes, you must also specify the node type
     *            parameter.
     *            </p>
     *            <p>
     *            For more information about resizing clusters, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     *            >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     *            <p>
     *            Valid Values: Integer greater than <code>0</code>.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter.
     * </p>
     * <p>
     * For more information about resizing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     * >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The new number of nodes of the cluster. If you specify a new
     *            number of nodes, you must also specify the node type
     *            parameter.
     *            </p>
     *            <p>
     *            For more information about resizing clusters, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/rs-resize-tutorial.html"
     *            >Resizing Clusters in Amazon Redshift</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     *            <p>
     *            Valid Values: Integer greater than <code>0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * <p>
     * A list of cluster security groups to be authorized on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the
     * list of groups to apply, will be revoked from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of cluster security groups to be authorized on this
     *         cluster. This change is asynchronously applied as soon as
     *         possible.
     *         </p>
     *         <p>
     *         Security groups currently associated with the cluster, and not in
     *         the list of groups to apply, will be revoked from the cluster.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getClusterSecurityGroups() {
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of cluster security groups to be authorized on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the
     * list of groups to apply, will be revoked from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     *
     * @param clusterSecurityGroups <p>
     *            A list of cluster security groups to be authorized on this
     *            cluster. This change is asynchronously applied as soon as
     *            possible.
     *            </p>
     *            <p>
     *            Security groups currently associated with the cluster, and not
     *            in the list of groups to apply, will be revoked from the
     *            cluster.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
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
     * A list of cluster security groups to be authorized on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the
     * list of groups to apply, will be revoked from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroups <p>
     *            A list of cluster security groups to be authorized on this
     *            cluster. This change is asynchronously applied as soon as
     *            possible.
     *            </p>
     *            <p>
     *            Security groups currently associated with the cluster, and not
     *            in the list of groups to apply, will be revoked from the
     *            cluster.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withClusterSecurityGroups(String... clusterSecurityGroups) {
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
     * A list of cluster security groups to be authorized on this cluster. This
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the
     * list of groups to apply, will be revoked from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroups <p>
     *            A list of cluster security groups to be authorized on this
     *            cluster. This change is asynchronously applied as soon as
     *            possible.
     *            </p>
     *            <p>
     *            Security groups currently associated with the cluster, and not
     *            in the list of groups to apply, will be revoked from the
     *            cluster.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withClusterSecurityGroups(
            java.util.Collection<String> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups to be associated
     * with the cluster. This change is asynchronously applied as soon as
     * possible.
     * </p>
     *
     * @return <p>
     *         A list of virtual private cloud (VPC) security groups to be
     *         associated with the cluster. This change is asynchronously
     *         applied as soon as possible.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups to be associated
     * with the cluster. This change is asynchronously applied as soon as
     * possible.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of virtual private cloud (VPC) security groups to be
     *            associated with the cluster. This change is asynchronously
     *            applied as soon as possible.
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
     * A list of virtual private cloud (VPC) security groups to be associated
     * with the cluster. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of virtual private cloud (VPC) security groups to be
     *            associated with the cluster. This change is asynchronously
     *            applied as soon as possible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of virtual private cloud (VPC) security groups to be associated
     * with the cluster. This change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of virtual private cloud (VPC) security groups to be
     *            associated with the cluster. This change is asynchronously
     *            applied as soon as possible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to
     * regain access to the master user account for a cluster if the password is
     * lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except '
     * (single quote), " (double quote), \, /, @, or space.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The new password for the cluster master user. This change is
     *         asynchronously applied as soon as possible. Between the time of
     *         the request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the
     *         <code>PendingModifiedValues</code> element of the operation
     *         response.
     *         </p>
     *         <note>
     *         <p>
     *         Operations never return the password, so this operation provides
     *         a way to regain access to the master user account for a cluster
     *         if the password is lost.
     *         </p>
     *         </note>
     *         <p>
     *         Default: Uses existing setting.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be between 8 and 64 characters in length.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain at least one uppercase letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain at least one lowercase letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain one number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can be any printable ASCII character (ASCII code 33 to 126)
     *         except ' (single quote), " (double quote), \, /, @, or space.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * <p>
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to
     * regain access to the master user account for a cluster if the password is
     * lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except '
     * (single quote), " (double quote), \, /, @, or space.
     * </p>
     * </li>
     * </ul>
     *
     * @param masterUserPassword <p>
     *            The new password for the cluster master user. This change is
     *            asynchronously applied as soon as possible. Between the time
     *            of the request and the completion of the request, the
     *            <code>MasterUserPassword</code> element exists in the
     *            <code>PendingModifiedValues</code> element of the operation
     *            response.
     *            </p>
     *            <note>
     *            <p>
     *            Operations never return the password, so this operation
     *            provides a way to regain access to the master user account for
     *            a cluster if the password is lost.
     *            </p>
     *            </note>
     *            <p>
     *            Default: Uses existing setting.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be between 8 and 64 characters in length.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain at least one uppercase letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain at least one lowercase letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain one number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can be any printable ASCII character (ASCII code 33 to 126)
     *            except ' (single quote), " (double quote), \, /, @, or space.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to
     * regain access to the master user account for a cluster if the password is
     * lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except '
     * (single quote), " (double quote), \, /, @, or space.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            The new password for the cluster master user. This change is
     *            asynchronously applied as soon as possible. Between the time
     *            of the request and the completion of the request, the
     *            <code>MasterUserPassword</code> element exists in the
     *            <code>PendingModifiedValues</code> element of the operation
     *            response.
     *            </p>
     *            <note>
     *            <p>
     *            Operations never return the password, so this operation
     *            provides a way to regain access to the master user account for
     *            a cluster if the password is lost.
     *            </p>
     *            </note>
     *            <p>
     *            Default: Uses existing setting.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be between 8 and 64 characters in length.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain at least one uppercase letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain at least one lowercase letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain one number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can be any printable ASCII character (ASCII code 33 to 126)
     *            except ' (single quote), " (double quote), \, /, @, or space.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a cluster
     * use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter
     * group family that matches the cluster version.
     * </p>
     *
     * @return <p>
     *         The name of the cluster parameter group to apply to this cluster.
     *         This change is applied only after the cluster is rebooted. To
     *         reboot a cluster use <a>RebootCluster</a>.
     *         </p>
     *         <p>
     *         Default: Uses existing setting.
     *         </p>
     *         <p>
     *         Constraints: The cluster parameter group must be in the same
     *         parameter group family that matches the cluster version.
     *         </p>
     */
    public String getClusterParameterGroupName() {
        return clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a cluster
     * use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter
     * group family that matches the cluster version.
     * </p>
     *
     * @param clusterParameterGroupName <p>
     *            The name of the cluster parameter group to apply to this
     *            cluster. This change is applied only after the cluster is
     *            rebooted. To reboot a cluster use <a>RebootCluster</a>.
     *            </p>
     *            <p>
     *            Default: Uses existing setting.
     *            </p>
     *            <p>
     *            Constraints: The cluster parameter group must be in the same
     *            parameter group family that matches the cluster version.
     *            </p>
     */
    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a cluster
     * use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter
     * group family that matches the cluster version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterParameterGroupName <p>
     *            The name of the cluster parameter group to apply to this
     *            cluster. This change is applied only after the cluster is
     *            rebooted. To reboot a cluster use <a>RebootCluster</a>.
     *            </p>
     *            <p>
     *            Default: Uses existing setting.
     *            </p>
     *            <p>
     *            Constraints: The cluster parameter group must be in the same
     *            parameter group family that matches the cluster version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
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
     * If you decrease the automated snapshot retention period from its current
     * value, existing automated snapshots that fall outside of the new
     * retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
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
     *         If you decrease the automated snapshot retention period from its
     *         current value, existing automated snapshots that fall outside of
     *         the new retention period will be immediately deleted.
     *         </p>
     *         <p>
     *         Default: Uses existing setting.
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
     * If you decrease the automated snapshot retention period from its current
     * value, existing automated snapshots that fall outside of the new
     * retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
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
     *            If you decrease the automated snapshot retention period from
     *            its current value, existing automated snapshots that fall
     *            outside of the new retention period will be immediately
     *            deleted.
     *            </p>
     *            <p>
     *            Default: Uses existing setting.
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
     * If you decrease the automated snapshot retention period from its current
     * value, existing automated snapshots that fall outside of the new
     * retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
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
     *            If you decrease the automated snapshot retention period from
     *            its current value, existing automated snapshots that fall
     *            outside of the new retention period will be immediately
     *            deleted.
     *            </p>
     *            <p>
     *            Default: Uses existing setting.
     *            </p>
     *            <p>
     *            Constraints: Must be a value from 0 to 35.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withAutomatedSnapshotRetentionPeriod(
            Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is
     * retained. If the value is -1, the manual snapshot is retained
     * indefinitely. This value doesn't retroactively change the retention
     * periods of existing manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     *
     * @return <p>
     *         The default for number of days that a newly created manual
     *         snapshot is retained. If the value is -1, the manual snapshot is
     *         retained indefinitely. This value doesn't retroactively change
     *         the retention periods of existing manual snapshots.
     *         </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     *         <p>
     *         The default value is -1.
     *         </p>
     */
    public Integer getManualSnapshotRetentionPeriod() {
        return manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is
     * retained. If the value is -1, the manual snapshot is retained
     * indefinitely. This value doesn't retroactively change the retention
     * periods of existing manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The default for number of days that a newly created manual
     *            snapshot is retained. If the value is -1, the manual snapshot
     *            is retained indefinitely. This value doesn't retroactively
     *            change the retention periods of existing manual snapshots.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     *            <p>
     *            The default value is -1.
     *            </p>
     */
    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is
     * retained. If the value is -1, the manual snapshot is retained
     * indefinitely. This value doesn't retroactively change the retention
     * periods of existing manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manualSnapshotRetentionPeriod <p>
     *            The default for number of days that a newly created manual
     *            snapshot is retained. If the value is -1, the manual snapshot
     *            is retained indefinitely. This value doesn't retroactively
     *            change the retention periods of existing manual snapshots.
     *            </p>
     *            <p>
     *            The value must be either -1 or an integer between 1 and 3,653.
     *            </p>
     *            <p>
     *            The default value is -1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withManualSnapshotRetentionPeriod(
            Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * if necessary. If system maintenance is necessary during the window, it
     * may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new
     * maintenance window indicates the current time, there must be at least 120
     * minutes between the current time and end of the window in order to ensure
     * that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example
     * <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     *
     * @return <p>
     *         The weekly time range (in UTC) during which system maintenance
     *         can occur, if necessary. If system maintenance is necessary
     *         during the window, it may result in an outage.
     *         </p>
     *         <p>
     *         This maintenance window change is made immediately. If the new
     *         maintenance window indicates the current time, there must be at
     *         least 120 minutes between the current time and end of the window
     *         in order to ensure that pending changes are applied.
     *         </p>
     *         <p>
     *         Default: Uses existing setting.
     *         </p>
     *         <p>
     *         Format: ddd:hh24:mi-ddd:hh24:mi, for example
     *         <code>wed:07:30-wed:08:00</code>.
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Must be at least 30 minutes.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * if necessary. If system maintenance is necessary during the window, it
     * may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new
     * maintenance window indicates the current time, there must be at least 120
     * minutes between the current time and end of the window in order to ensure
     * that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example
     * <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range (in UTC) during which system maintenance
     *            can occur, if necessary. If system maintenance is necessary
     *            during the window, it may result in an outage.
     *            </p>
     *            <p>
     *            This maintenance window change is made immediately. If the new
     *            maintenance window indicates the current time, there must be
     *            at least 120 minutes between the current time and end of the
     *            window in order to ensure that pending changes are applied.
     *            </p>
     *            <p>
     *            Default: Uses existing setting.
     *            </p>
     *            <p>
     *            Format: ddd:hh24:mi-ddd:hh24:mi, for example
     *            <code>wed:07:30-wed:08:00</code>.
     *            </p>
     *            <p>
     *            Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *            </p>
     *            <p>
     *            Constraints: Must be at least 30 minutes.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * if necessary. If system maintenance is necessary during the window, it
     * may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new
     * maintenance window indicates the current time, there must be at least 120
     * minutes between the current time and end of the window in order to ensure
     * that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example
     * <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range (in UTC) during which system maintenance
     *            can occur, if necessary. If system maintenance is necessary
     *            during the window, it may result in an outage.
     *            </p>
     *            <p>
     *            This maintenance window change is made immediately. If the new
     *            maintenance window indicates the current time, there must be
     *            at least 120 minutes between the current time and end of the
     *            window in order to ensure that pending changes are applied.
     *            </p>
     *            <p>
     *            Default: Uses existing setting.
     *            </p>
     *            <p>
     *            Format: ddd:hh24:mi-ddd:hh24:mi, for example
     *            <code>wed:07:30-wed:08:00</code>.
     *            </p>
     *            <p>
     *            Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *            </p>
     *            <p>
     *            Constraints: Must be at least 30 minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is
     * currently in use, a new cluster parameter group in the cluster parameter
     * group family for the new version must be specified. The new cluster
     * parameter group can be the default for that cluster parameter group
     * family. For more information about parameters and parameter groups, go to
     * <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     *
     * @return <p>
     *         The new version number of the Amazon Redshift engine to upgrade
     *         to.
     *         </p>
     *         <p>
     *         For major version upgrades, if a non-default cluster parameter
     *         group is currently in use, a new cluster parameter group in the
     *         cluster parameter group family for the new version must be
     *         specified. The new cluster parameter group can be the default for
     *         that cluster parameter group family. For more information about
     *         parameters and parameter groups, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *         >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift
     *         Cluster Management Guide</i>.
     *         </p>
     *         <p>
     *         Example: <code>1.0</code>
     *         </p>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is
     * currently in use, a new cluster parameter group in the cluster parameter
     * group family for the new version must be specified. The new cluster
     * parameter group can be the default for that cluster parameter group
     * family. For more information about parameters and parameter groups, go to
     * <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     *
     * @param clusterVersion <p>
     *            The new version number of the Amazon Redshift engine to
     *            upgrade to.
     *            </p>
     *            <p>
     *            For major version upgrades, if a non-default cluster parameter
     *            group is currently in use, a new cluster parameter group in
     *            the cluster parameter group family for the new version must be
     *            specified. The new cluster parameter group can be the default
     *            for that cluster parameter group family. For more information
     *            about parameters and parameter groups, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     *            <p>
     *            Example: <code>1.0</code>
     *            </p>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is
     * currently in use, a new cluster parameter group in the cluster parameter
     * group family for the new version must be specified. The new cluster
     * parameter group can be the default for that cluster parameter group
     * family. For more information about parameters and parameter groups, go to
     * <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterVersion <p>
     *            The new version number of the Amazon Redshift engine to
     *            upgrade to.
     *            </p>
     *            <p>
     *            For major version upgrades, if a non-default cluster parameter
     *            group is currently in use, a new cluster parameter group in
     *            the cluster parameter group family for the new version must be
     *            specified. The new cluster parameter group can be the default
     *            for that cluster parameter group family. For more information
     *            about parameters and parameter groups, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     *            <p>
     *            Example: <code>1.0</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied
     * automatically to the cluster during the maintenance window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, major version upgrades will be applied
     *         automatically to the cluster during the maintenance window.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied
     * automatically to the cluster during the maintenance window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, major version upgrades will be applied
     *         automatically to the cluster during the maintenance window.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied
     * automatically to the cluster during the maintenance window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param allowVersionUpgrade <p>
     *            If <code>true</code>, major version upgrades will be applied
     *            automatically to the cluster during the maintenance window.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied
     * automatically to the cluster during the maintenance window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowVersionUpgrade <p>
     *            If <code>true</code>, major version upgrades will be applied
     *            automatically to the cluster during the maintenance window.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
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
    public ModifyClusterRequest withHsmClientCertificateIdentifier(
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
    public ModifyClusterRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * <p>
     * The new identifier for the cluster.
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
     * Example: <code>examplecluster</code>
     * </p>
     *
     * @return <p>
     *         The new identifier for the cluster.
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
     *         <p>
     *         Example: <code>examplecluster</code>
     *         </p>
     */
    public String getNewClusterIdentifier() {
        return newClusterIdentifier;
    }

    /**
     * <p>
     * The new identifier for the cluster.
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
     * Example: <code>examplecluster</code>
     * </p>
     *
     * @param newClusterIdentifier <p>
     *            The new identifier for the cluster.
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
     *            <p>
     *            Example: <code>examplecluster</code>
     *            </p>
     */
    public void setNewClusterIdentifier(String newClusterIdentifier) {
        this.newClusterIdentifier = newClusterIdentifier;
    }

    /**
     * <p>
     * The new identifier for the cluster.
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
     * Example: <code>examplecluster</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newClusterIdentifier <p>
     *            The new identifier for the cluster.
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
     *            <p>
     *            Example: <code>examplecluster</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withNewClusterIdentifier(String newClusterIdentifier) {
        this.newClusterIdentifier = newClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * Only clusters in VPCs can be set to be publicly available.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the cluster can be accessed from a public
     *         network. Only clusters in VPCs can be set to be publicly
     *         available.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * Only clusters in VPCs can be set to be publicly available.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the cluster can be accessed from a public
     *         network. Only clusters in VPCs can be set to be publicly
     *         available.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * Only clusters in VPCs can be set to be publicly available.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            If <code>true</code>, the cluster can be accessed from a
     *            public network. Only clusters in VPCs can be set to be
     *            publicly available.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * Only clusters in VPCs can be set to be publicly available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            If <code>true</code>, the cluster can be accessed from a
     *            public network. Only clusters in VPCs can be set to be
     *            publicly available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and
     * publicly-accessible through an Internet gateway. For more information
     * about provisioning clusters in EC2-VPC, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     * >Supported Platforms to Launch Your Cluster</a> in the Amazon Redshift
     * Cluster Management Guide.
     * </p>
     *
     * @return <p>
     *         The Elastic IP (EIP) address for the cluster.
     *         </p>
     *         <p>
     *         Constraints: The cluster must be provisioned in EC2-VPC and
     *         publicly-accessible through an Internet gateway. For more
     *         information about provisioning clusters in EC2-VPC, go to <a
     *         href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     *         >Supported Platforms to Launch Your Cluster</a> in the Amazon
     *         Redshift Cluster Management Guide.
     *         </p>
     */
    public String getElasticIp() {
        return elasticIp;
    }

    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and
     * publicly-accessible through an Internet gateway. For more information
     * about provisioning clusters in EC2-VPC, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     * >Supported Platforms to Launch Your Cluster</a> in the Amazon Redshift
     * Cluster Management Guide.
     * </p>
     *
     * @param elasticIp <p>
     *            The Elastic IP (EIP) address for the cluster.
     *            </p>
     *            <p>
     *            Constraints: The cluster must be provisioned in EC2-VPC and
     *            publicly-accessible through an Internet gateway. For more
     *            information about provisioning clusters in EC2-VPC, go to <a
     *            href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     *            >Supported Platforms to Launch Your Cluster</a> in the Amazon
     *            Redshift Cluster Management Guide.
     *            </p>
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and
     * publicly-accessible through an Internet gateway. For more information
     * about provisioning clusters in EC2-VPC, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     * >Supported Platforms to Launch Your Cluster</a> in the Amazon Redshift
     * Cluster Management Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticIp <p>
     *            The Elastic IP (EIP) address for the cluster.
     *            </p>
     *            <p>
     *            Constraints: The cluster must be provisioned in EC2-VPC and
     *            publicly-accessible through an Internet gateway. For more
     *            information about provisioning clusters in EC2-VPC, go to <a
     *            href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     *            >Supported Platforms to Launch Your Cluster</a> in the Amazon
     *            Redshift Cluster Management Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
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
    public ModifyClusterRequest withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
        return this;
    }

    /**
     * <p>
     * The name for the maintenance track that you want to assign for the
     * cluster. This name change is asynchronous. The new track name stays in
     * the <code>PendingModifiedValues</code> for the cluster until the next
     * maintenance window. When the maintenance track changes, the cluster is
     * switched to the latest cluster release available for the maintenance
     * track. At this point, the maintenance track name is applied.
     * </p>
     *
     * @return <p>
     *         The name for the maintenance track that you want to assign for
     *         the cluster. This name change is asynchronous. The new track name
     *         stays in the <code>PendingModifiedValues</code> for the cluster
     *         until the next maintenance window. When the maintenance track
     *         changes, the cluster is switched to the latest cluster release
     *         available for the maintenance track. At this point, the
     *         maintenance track name is applied.
     *         </p>
     */
    public String getMaintenanceTrackName() {
        return maintenanceTrackName;
    }

    /**
     * <p>
     * The name for the maintenance track that you want to assign for the
     * cluster. This name change is asynchronous. The new track name stays in
     * the <code>PendingModifiedValues</code> for the cluster until the next
     * maintenance window. When the maintenance track changes, the cluster is
     * switched to the latest cluster release available for the maintenance
     * track. At this point, the maintenance track name is applied.
     * </p>
     *
     * @param maintenanceTrackName <p>
     *            The name for the maintenance track that you want to assign for
     *            the cluster. This name change is asynchronous. The new track
     *            name stays in the <code>PendingModifiedValues</code> for the
     *            cluster until the next maintenance window. When the
     *            maintenance track changes, the cluster is switched to the
     *            latest cluster release available for the maintenance track. At
     *            this point, the maintenance track name is applied.
     *            </p>
     */
    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name for the maintenance track that you want to assign for the
     * cluster. This name change is asynchronous. The new track name stays in
     * the <code>PendingModifiedValues</code> for the cluster until the next
     * maintenance window. When the maintenance track changes, the cluster is
     * switched to the latest cluster release available for the maintenance
     * track. At this point, the maintenance track name is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTrackName <p>
     *            The name for the maintenance track that you want to assign for
     *            the cluster. This name change is asynchronous. The new track
     *            name stays in the <code>PendingModifiedValues</code> for the
     *            cluster until the next maintenance window. When the
     *            maintenance track changes, the cluster is switched to the
     *            latest cluster release available for the maintenance track. At
     *            this point, the maintenance track name is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
        return this;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the value is encrypted
     * (true) and you provide a value for the <code>KmsKeyId</code> parameter,
     * we encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we encrypt with the default key.
     * In the China region we use legacy encryption if you specify that the
     * cluster is encrypted.
     * </p>
     * <p>
     * If the value is not encrypted (false), then the cluster is decrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the cluster is encrypted. If the value is
     *         encrypted (true) and you provide a value for the
     *         <code>KmsKeyId</code> parameter, we encrypt the cluster with the
     *         provided <code>KmsKeyId</code>. If you don't provide a
     *         <code>KmsKeyId</code>, we encrypt with the default key. In the
     *         China region we use legacy encryption if you specify that the
     *         cluster is encrypted.
     *         </p>
     *         <p>
     *         If the value is not encrypted (false), then the cluster is
     *         decrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the value is encrypted
     * (true) and you provide a value for the <code>KmsKeyId</code> parameter,
     * we encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we encrypt with the default key.
     * In the China region we use legacy encryption if you specify that the
     * cluster is encrypted.
     * </p>
     * <p>
     * If the value is not encrypted (false), then the cluster is decrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the cluster is encrypted. If the value is
     *         encrypted (true) and you provide a value for the
     *         <code>KmsKeyId</code> parameter, we encrypt the cluster with the
     *         provided <code>KmsKeyId</code>. If you don't provide a
     *         <code>KmsKeyId</code>, we encrypt with the default key. In the
     *         China region we use legacy encryption if you specify that the
     *         cluster is encrypted.
     *         </p>
     *         <p>
     *         If the value is not encrypted (false), then the cluster is
     *         decrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the value is encrypted
     * (true) and you provide a value for the <code>KmsKeyId</code> parameter,
     * we encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we encrypt with the default key.
     * In the China region we use legacy encryption if you specify that the
     * cluster is encrypted.
     * </p>
     * <p>
     * If the value is not encrypted (false), then the cluster is decrypted.
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the cluster is encrypted. If the value is
     *            encrypted (true) and you provide a value for the
     *            <code>KmsKeyId</code> parameter, we encrypt the cluster with
     *            the provided <code>KmsKeyId</code>. If you don't provide a
     *            <code>KmsKeyId</code>, we encrypt with the default key. In the
     *            China region we use legacy encryption if you specify that the
     *            cluster is encrypted.
     *            </p>
     *            <p>
     *            If the value is not encrypted (false), then the cluster is
     *            decrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the value is encrypted
     * (true) and you provide a value for the <code>KmsKeyId</code> parameter,
     * we encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we encrypt with the default key.
     * In the China region we use legacy encryption if you specify that the
     * cluster is encrypted.
     * </p>
     * <p>
     * If the value is not encrypted (false), then the cluster is decrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the cluster is encrypted. If the value is
     *            encrypted (true) and you provide a value for the
     *            <code>KmsKeyId</code> parameter, we encrypt the cluster with
     *            the provided <code>KmsKeyId</code>. If you don't provide a
     *            <code>KmsKeyId</code>, we encrypt with the default key. In the
     *            China region we use legacy encryption if you specify that the
     *            cluster is encrypted.
     *            </p>
     *            <p>
     *            If the value is not encrypted (false), then the cluster is
     *            decrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster.
     * </p>
     *
     * @return <p>
     *         The AWS Key Management Service (KMS) key ID of the encryption key
     *         that you want to use to encrypt data in the cluster.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (KMS) key ID of the encryption
     *            key that you want to use to encrypt data in the cluster.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (KMS) key ID of the encryption
     *            key that you want to use to encrypt data in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getClusterType() != null)
            sb.append("ClusterType: " + getClusterType() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getClusterParameterGroupName() != null)
            sb.append("ClusterParameterGroupName: " + getClusterParameterGroupName() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod()
                    + ",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: " + getManualSnapshotRetentionPeriod() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: " + getAllowVersionUpgrade() + ",");
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier()
                    + ",");
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getNewClusterIdentifier() != null)
            sb.append("NewClusterIdentifier: " + getNewClusterIdentifier() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getElasticIp() != null)
            sb.append("ElasticIp: " + getElasticIp() + ",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: " + getEnhancedVpcRouting() + ",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: " + getMaintenanceTrackName() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
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
                + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterParameterGroupName() == null) ? 0 : getClusterParameterGroupName()
                        .hashCode());
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
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode
                + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime
                * hashCode
                + ((getHsmClientCertificateIdentifier() == null) ? 0
                        : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNewClusterIdentifier() == null) ? 0 : getNewClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode
                + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterRequest == false)
            return false;
        ModifyClusterRequest other = (ModifyClusterRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null
                && other.getClusterType().equals(this.getClusterType()) == false)
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
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getClusterParameterGroupName() == null
                ^ this.getClusterParameterGroupName() == null)
            return false;
        if (other.getClusterParameterGroupName() != null
                && other.getClusterParameterGroupName().equals(this.getClusterParameterGroupName()) == false)
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
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
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
        if (other.getNewClusterIdentifier() == null ^ this.getNewClusterIdentifier() == null)
            return false;
        if (other.getNewClusterIdentifier() != null
                && other.getNewClusterIdentifier().equals(this.getNewClusterIdentifier()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null
                && other.getElasticIp().equals(this.getElasticIp()) == false)
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
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
