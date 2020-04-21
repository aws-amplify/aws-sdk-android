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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The detailed description of the cluster.
 * </p>
 */
public class Cluster implements Serializable {
    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     */
    private ClusterStatus status;

    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and so
     * on.
     * </p>
     */
    private Ec2InstanceAttributes ec2InstanceAttributes;

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * The instance group configuration of the cluster. A value of
     * <code>INSTANCE_GROUP</code> indicates a uniform instance group
     * configuration. A value of <code>INSTANCE_FLEET</code> indicates an
     * instance fleets configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE_FLEET, INSTANCE_GROUP
     */
    private String instanceCollectionType;

    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     * </p>
     */
    private String logUri;

    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     */
    private String requestedAmiVersion;

    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     */
    private String runningAmiVersion;

    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. Release labels are in the
     * form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version
     * such as <code>emr-5.14.0</code>. For more information about Amazon EMR
     * release versions and included application versions and features, see <a
     * href
     * ="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws
     * .amazon.com/emr/latest/ReleaseGuide/</a>. The release label applies only
     * to Amazon EMR releases version 4.0 and later. Earlier versions use
     * <code>AmiVersion</code>.
     * </p>
     */
    private String releaseLabel;

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all
     * steps.
     * </p>
     */
    private Boolean autoTerminate;

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention, or
     * in the event of a cluster error.
     * </p>
     */
    private Boolean terminationProtected;

    /**
     * <p>
     * Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. The default value, <code>true</code>
     * , indicates that all IAM users in the AWS account can perform cluster
     * actions if they have the proper IAM policy permissions. If this value is
     * <code>false</code>, only the IAM user that created the cluster can
     * perform actions. This value can be changed on a running cluster by using
     * the <a>SetVisibleToAllUsers</a> action. You can override the default
     * value of <code>true</code> when you create a cluster by using the
     * <code>VisibleToAllUsers</code> parameter of the <code>RunJobFlow</code>
     * action.
     * </p>
     */
    private Boolean visibleToAllUsers;

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     */
    private java.util.List<Application> applications;

    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     * </p>
     */
    private String serviceRole;

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     */
    private Integer normalizedInstanceHours;

    /**
     * <p>
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     */
    private String masterPublicDnsName;

    /**
     * <p>
     * Applies only to Amazon EMR releases 4.x and later. The list of
     * Configurations supplied to the EMR cluster.
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String securityConfiguration;

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides
     * permissions that the automatic scaling feature requires to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingRole;

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic
     * scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available only
     * in Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     */
    private String scaleDownBehavior;

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String customAmiId;

    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is
     * used for each EC2 instance. Available in Amazon EMR version 4.x and
     * later.
     * </p>
     */
    private Integer ebsRootVolumeSize;

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies the type of
     * updates that are applied from the Amazon Linux AMI package repositories
     * when an instance boots using the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     */
    private String repoUpgradeOnBoot;

    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is
     * enabled using a security configuration. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
     * >Use Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     */
    private KerberosAttributes kerberosAttributes;

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String clusterArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String outpostArn;

    /**
     * <p>
     * Specifies the number of steps that can be executed concurrently.
     * </p>
     */
    private Integer stepConcurrencyLevel;

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the cluster.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the cluster.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     *
     * @return <p>
     *         The name of the cluster.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     *
     * @param name <p>
     *            The name of the cluster.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     *
     * @return <p>
     *         The current status details about the cluster.
     *         </p>
     */
    public ClusterStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     *
     * @param status <p>
     *            The current status details about the cluster.
     *            </p>
     */
    public void setStatus(ClusterStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status details about the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status details about the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and so
     * on.
     * </p>
     *
     * @return <p>
     *         Provides information about the EC2 instances in a cluster grouped
     *         by category. For example, key name, subnet ID, IAM instance
     *         profile, and so on.
     *         </p>
     */
    public Ec2InstanceAttributes getEc2InstanceAttributes() {
        return ec2InstanceAttributes;
    }

    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and so
     * on.
     * </p>
     *
     * @param ec2InstanceAttributes <p>
     *            Provides information about the EC2 instances in a cluster
     *            grouped by category. For example, key name, subnet ID, IAM
     *            instance profile, and so on.
     *            </p>
     */
    public void setEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        this.ec2InstanceAttributes = ec2InstanceAttributes;
    }

    /**
     * <p>
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, key name, subnet ID, IAM instance profile, and so
     * on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceAttributes <p>
     *            Provides information about the EC2 instances in a cluster
     *            grouped by category. For example, key name, subnet ID, IAM
     *            instance profile, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        this.ec2InstanceAttributes = ec2InstanceAttributes;
        return this;
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * The instance group configuration of the cluster. A value of
     * <code>INSTANCE_GROUP</code> indicates a uniform instance group
     * configuration. A value of <code>INSTANCE_FLEET</code> indicates an
     * instance fleets configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE_FLEET, INSTANCE_GROUP
     *
     * @return <note>
     *         <p>
     *         The instance fleet configuration is available only in Amazon EMR
     *         versions 4.8.0 and later, excluding 5.0.x versions.
     *         </p>
     *         </note>
     *         <p>
     *         The instance group configuration of the cluster. A value of
     *         <code>INSTANCE_GROUP</code> indicates a uniform instance group
     *         configuration. A value of <code>INSTANCE_FLEET</code> indicates
     *         an instance fleets configuration.
     *         </p>
     * @see InstanceCollectionType
     */
    public String getInstanceCollectionType() {
        return instanceCollectionType;
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * The instance group configuration of the cluster. A value of
     * <code>INSTANCE_GROUP</code> indicates a uniform instance group
     * configuration. A value of <code>INSTANCE_FLEET</code> indicates an
     * instance fleets configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE_FLEET, INSTANCE_GROUP
     *
     * @param instanceCollectionType <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     *            <p>
     *            The instance group configuration of the cluster. A value of
     *            <code>INSTANCE_GROUP</code> indicates a uniform instance group
     *            configuration. A value of <code>INSTANCE_FLEET</code>
     *            indicates an instance fleets configuration.
     *            </p>
     * @see InstanceCollectionType
     */
    public void setInstanceCollectionType(String instanceCollectionType) {
        this.instanceCollectionType = instanceCollectionType;
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * The instance group configuration of the cluster. A value of
     * <code>INSTANCE_GROUP</code> indicates a uniform instance group
     * configuration. A value of <code>INSTANCE_FLEET</code> indicates an
     * instance fleets configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE_FLEET, INSTANCE_GROUP
     *
     * @param instanceCollectionType <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     *            <p>
     *            The instance group configuration of the cluster. A value of
     *            <code>INSTANCE_GROUP</code> indicates a uniform instance group
     *            configuration. A value of <code>INSTANCE_FLEET</code>
     *            indicates an instance fleets configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceCollectionType
     */
    public Cluster withInstanceCollectionType(String instanceCollectionType) {
        this.instanceCollectionType = instanceCollectionType;
        return this;
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * The instance group configuration of the cluster. A value of
     * <code>INSTANCE_GROUP</code> indicates a uniform instance group
     * configuration. A value of <code>INSTANCE_FLEET</code> indicates an
     * instance fleets configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE_FLEET, INSTANCE_GROUP
     *
     * @param instanceCollectionType <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     *            <p>
     *            The instance group configuration of the cluster. A value of
     *            <code>INSTANCE_GROUP</code> indicates a uniform instance group
     *            configuration. A value of <code>INSTANCE_FLEET</code>
     *            indicates an instance fleets configuration.
     *            </p>
     * @see InstanceCollectionType
     */
    public void setInstanceCollectionType(InstanceCollectionType instanceCollectionType) {
        this.instanceCollectionType = instanceCollectionType.toString();
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * The instance group configuration of the cluster. A value of
     * <code>INSTANCE_GROUP</code> indicates a uniform instance group
     * configuration. A value of <code>INSTANCE_FLEET</code> indicates an
     * instance fleets configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE_FLEET, INSTANCE_GROUP
     *
     * @param instanceCollectionType <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     *            <p>
     *            The instance group configuration of the cluster. A value of
     *            <code>INSTANCE_GROUP</code> indicates a uniform instance group
     *            configuration. A value of <code>INSTANCE_FLEET</code>
     *            indicates an instance fleets configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceCollectionType
     */
    public Cluster withInstanceCollectionType(InstanceCollectionType instanceCollectionType) {
        this.instanceCollectionType = instanceCollectionType.toString();
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     * </p>
     *
     * @return <p>
     *         The path to the Amazon S3 location where logs for this cluster
     *         are stored.
     *         </p>
     */
    public String getLogUri() {
        return logUri;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     * </p>
     *
     * @param logUri <p>
     *            The path to the Amazon S3 location where logs for this cluster
     *            are stored.
     *            </p>
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logUri <p>
     *            The path to the Amazon S3 location where logs for this cluster
     *            are stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     *
     * @return <p>
     *         The AMI version requested for this cluster.
     *         </p>
     */
    public String getRequestedAmiVersion() {
        return requestedAmiVersion;
    }

    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     *
     * @param requestedAmiVersion <p>
     *            The AMI version requested for this cluster.
     *            </p>
     */
    public void setRequestedAmiVersion(String requestedAmiVersion) {
        this.requestedAmiVersion = requestedAmiVersion;
    }

    /**
     * <p>
     * The AMI version requested for this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedAmiVersion <p>
     *            The AMI version requested for this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withRequestedAmiVersion(String requestedAmiVersion) {
        this.requestedAmiVersion = requestedAmiVersion;
        return this;
    }

    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     *
     * @return <p>
     *         The AMI version running on this cluster.
     *         </p>
     */
    public String getRunningAmiVersion() {
        return runningAmiVersion;
    }

    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     *
     * @param runningAmiVersion <p>
     *            The AMI version running on this cluster.
     *            </p>
     */
    public void setRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
    }

    /**
     * <p>
     * The AMI version running on this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningAmiVersion <p>
     *            The AMI version running on this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
        return this;
    }

    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. Release labels are in the
     * form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version
     * such as <code>emr-5.14.0</code>. For more information about Amazon EMR
     * release versions and included application versions and features, see <a
     * href
     * ="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws
     * .amazon.com/emr/latest/ReleaseGuide/</a>. The release label applies only
     * to Amazon EMR releases version 4.0 and later. Earlier versions use
     * <code>AmiVersion</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon EMR release label, which determines the version of
     *         open-source application packages installed on the cluster.
     *         Release labels are in the form <code>emr-x.x.x</code>, where
     *         x.x.x is an Amazon EMR release version such as
     *         <code>emr-5.14.0</code>. For more information about Amazon EMR
     *         release versions and included application versions and features,
     *         see <a
     *         href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *         >https://docs.aws.amazon.com/emr/latest/ReleaseGuide/</a>. The
     *         release label applies only to Amazon EMR releases version 4.0 and
     *         later. Earlier versions use <code>AmiVersion</code>.
     *         </p>
     */
    public String getReleaseLabel() {
        return releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. Release labels are in the
     * form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version
     * such as <code>emr-5.14.0</code>. For more information about Amazon EMR
     * release versions and included application versions and features, see <a
     * href
     * ="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws
     * .amazon.com/emr/latest/ReleaseGuide/</a>. The release label applies only
     * to Amazon EMR releases version 4.0 and later. Earlier versions use
     * <code>AmiVersion</code>.
     * </p>
     *
     * @param releaseLabel <p>
     *            The Amazon EMR release label, which determines the version of
     *            open-source application packages installed on the cluster.
     *            Release labels are in the form <code>emr-x.x.x</code>, where
     *            x.x.x is an Amazon EMR release version such as
     *            <code>emr-5.14.0</code>. For more information about Amazon EMR
     *            release versions and included application versions and
     *            features, see <a
     *            href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *            >https://docs.aws.amazon.com/emr/latest/ReleaseGuide/</a>. The
     *            release label applies only to Amazon EMR releases version 4.0
     *            and later. Earlier versions use <code>AmiVersion</code>.
     *            </p>
     */
    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. Release labels are in the
     * form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version
     * such as <code>emr-5.14.0</code>. For more information about Amazon EMR
     * release versions and included application versions and features, see <a
     * href
     * ="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws
     * .amazon.com/emr/latest/ReleaseGuide/</a>. The release label applies only
     * to Amazon EMR releases version 4.0 and later. Earlier versions use
     * <code>AmiVersion</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param releaseLabel <p>
     *            The Amazon EMR release label, which determines the version of
     *            open-source application packages installed on the cluster.
     *            Release labels are in the form <code>emr-x.x.x</code>, where
     *            x.x.x is an Amazon EMR release version such as
     *            <code>emr-5.14.0</code>. For more information about Amazon EMR
     *            release versions and included application versions and
     *            features, see <a
     *            href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *            >https://docs.aws.amazon.com/emr/latest/ReleaseGuide/</a>. The
     *            release label applies only to Amazon EMR releases version 4.0
     *            and later. Earlier versions use <code>AmiVersion</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
        return this;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all
     * steps.
     * </p>
     *
     * @return <p>
     *         Specifies whether the cluster should terminate after completing
     *         all steps.
     *         </p>
     */
    public Boolean isAutoTerminate() {
        return autoTerminate;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all
     * steps.
     * </p>
     *
     * @return <p>
     *         Specifies whether the cluster should terminate after completing
     *         all steps.
     *         </p>
     */
    public Boolean getAutoTerminate() {
        return autoTerminate;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all
     * steps.
     * </p>
     *
     * @param autoTerminate <p>
     *            Specifies whether the cluster should terminate after
     *            completing all steps.
     *            </p>
     */
    public void setAutoTerminate(Boolean autoTerminate) {
        this.autoTerminate = autoTerminate;
    }

    /**
     * <p>
     * Specifies whether the cluster should terminate after completing all
     * steps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoTerminate <p>
     *            Specifies whether the cluster should terminate after
     *            completing all steps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAutoTerminate(Boolean autoTerminate) {
        this.autoTerminate = autoTerminate;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention, or
     * in the event of a cluster error.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EMR will lock the cluster to prevent the
     *         EC2 instances from being terminated by an API call or user
     *         intervention, or in the event of a cluster error.
     *         </p>
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention, or
     * in the event of a cluster error.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EMR will lock the cluster to prevent the
     *         EC2 instances from being terminated by an API call or user
     *         intervention, or in the event of a cluster error.
     *         </p>
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention, or
     * in the event of a cluster error.
     * </p>
     *
     * @param terminationProtected <p>
     *            Indicates whether Amazon EMR will lock the cluster to prevent
     *            the EC2 instances from being terminated by an API call or user
     *            intervention, or in the event of a cluster error.
     *            </p>
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention, or
     * in the event of a cluster error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationProtected <p>
     *            Indicates whether Amazon EMR will lock the cluster to prevent
     *            the EC2 instances from being terminated by an API call or user
     *            intervention, or in the event of a cluster error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    /**
     * <p>
     * Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. The default value, <code>true</code>
     * , indicates that all IAM users in the AWS account can perform cluster
     * actions if they have the proper IAM policy permissions. If this value is
     * <code>false</code>, only the IAM user that created the cluster can
     * perform actions. This value can be changed on a running cluster by using
     * the <a>SetVisibleToAllUsers</a> action. You can override the default
     * value of <code>true</code> when you create a cluster by using the
     * <code>VisibleToAllUsers</code> parameter of the <code>RunJobFlow</code>
     * action.
     * </p>
     *
     * @return <p>
     *         Indicates whether the cluster is visible to all IAM users of the
     *         AWS account associated with the cluster. The default value,
     *         <code>true</code>, indicates that all IAM users in the AWS
     *         account can perform cluster actions if they have the proper IAM
     *         policy permissions. If this value is <code>false</code>, only the
     *         IAM user that created the cluster can perform actions. This value
     *         can be changed on a running cluster by using the
     *         <a>SetVisibleToAllUsers</a> action. You can override the default
     *         value of <code>true</code> when you create a cluster by using the
     *         <code>VisibleToAllUsers</code> parameter of the
     *         <code>RunJobFlow</code> action.
     *         </p>
     */
    public Boolean isVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * <p>
     * Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. The default value, <code>true</code>
     * , indicates that all IAM users in the AWS account can perform cluster
     * actions if they have the proper IAM policy permissions. If this value is
     * <code>false</code>, only the IAM user that created the cluster can
     * perform actions. This value can be changed on a running cluster by using
     * the <a>SetVisibleToAllUsers</a> action. You can override the default
     * value of <code>true</code> when you create a cluster by using the
     * <code>VisibleToAllUsers</code> parameter of the <code>RunJobFlow</code>
     * action.
     * </p>
     *
     * @return <p>
     *         Indicates whether the cluster is visible to all IAM users of the
     *         AWS account associated with the cluster. The default value,
     *         <code>true</code>, indicates that all IAM users in the AWS
     *         account can perform cluster actions if they have the proper IAM
     *         policy permissions. If this value is <code>false</code>, only the
     *         IAM user that created the cluster can perform actions. This value
     *         can be changed on a running cluster by using the
     *         <a>SetVisibleToAllUsers</a> action. You can override the default
     *         value of <code>true</code> when you create a cluster by using the
     *         <code>VisibleToAllUsers</code> parameter of the
     *         <code>RunJobFlow</code> action.
     *         </p>
     */
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * <p>
     * Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. The default value, <code>true</code>
     * , indicates that all IAM users in the AWS account can perform cluster
     * actions if they have the proper IAM policy permissions. If this value is
     * <code>false</code>, only the IAM user that created the cluster can
     * perform actions. This value can be changed on a running cluster by using
     * the <a>SetVisibleToAllUsers</a> action. You can override the default
     * value of <code>true</code> when you create a cluster by using the
     * <code>VisibleToAllUsers</code> parameter of the <code>RunJobFlow</code>
     * action.
     * </p>
     *
     * @param visibleToAllUsers <p>
     *            Indicates whether the cluster is visible to all IAM users of
     *            the AWS account associated with the cluster. The default
     *            value, <code>true</code>, indicates that all IAM users in the
     *            AWS account can perform cluster actions if they have the
     *            proper IAM policy permissions. If this value is
     *            <code>false</code>, only the IAM user that created the cluster
     *            can perform actions. This value can be changed on a running
     *            cluster by using the <a>SetVisibleToAllUsers</a> action. You
     *            can override the default value of <code>true</code> when you
     *            create a cluster by using the <code>VisibleToAllUsers</code>
     *            parameter of the <code>RunJobFlow</code> action.
     *            </p>
     */
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. The default value, <code>true</code>
     * , indicates that all IAM users in the AWS account can perform cluster
     * actions if they have the proper IAM policy permissions. If this value is
     * <code>false</code>, only the IAM user that created the cluster can
     * perform actions. This value can be changed on a running cluster by using
     * the <a>SetVisibleToAllUsers</a> action. You can override the default
     * value of <code>true</code> when you create a cluster by using the
     * <code>VisibleToAllUsers</code> parameter of the <code>RunJobFlow</code>
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param visibleToAllUsers <p>
     *            Indicates whether the cluster is visible to all IAM users of
     *            the AWS account associated with the cluster. The default
     *            value, <code>true</code>, indicates that all IAM users in the
     *            AWS account can perform cluster actions if they have the
     *            proper IAM policy permissions. If this value is
     *            <code>false</code>, only the IAM user that created the cluster
     *            can perform actions. This value can be changed on a running
     *            cluster by using the <a>SetVisibleToAllUsers</a> action. You
     *            can override the default value of <code>true</code> when you
     *            create a cluster by using the <code>VisibleToAllUsers</code>
     *            parameter of the <code>RunJobFlow</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     *
     * @return <p>
     *         The applications installed on this cluster.
     *         </p>
     */
    public java.util.List<Application> getApplications() {
        return applications;
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     *
     * @param applications <p>
     *            The applications installed on this cluster.
     *            </p>
     */
    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<Application>(applications);
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applications <p>
     *            The applications installed on this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withApplications(Application... applications) {
        if (getApplications() == null) {
            this.applications = new java.util.ArrayList<Application>(applications.length);
        }
        for (Application value : applications) {
            this.applications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The applications installed on this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applications <p>
     *            The applications installed on this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     *
     * @return <p>
     *         A list of tags associated with a cluster.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with a cluster.
     * </p>
     *
     * @param tags <p>
     *            A list of tags associated with a cluster.
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
     * A list of tags associated with a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags associated with a cluster.
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
     * A list of tags associated with a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags associated with a cluster.
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
     * The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     * </p>
     *
     * @return <p>
     *         The IAM role that will be assumed by the Amazon EMR service to
     *         access AWS resources on your behalf.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     * </p>
     *
     * @param serviceRole <p>
     *            The IAM role that will be assumed by the Amazon EMR service to
     *            access AWS resources on your behalf.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRole <p>
     *            The IAM role that will be assumed by the Amazon EMR service to
     *            access AWS resources on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     *
     * @return <p>
     *         An approximation of the cost of the cluster, represented in
     *         m1.small/hours. This value is incremented one time for every hour
     *         an m1.small instance runs. Larger instances are weighted more, so
     *         an EC2 instance that is roughly four times more expensive would
     *         result in the normalized instance hours being incremented by
     *         four. This result is only an approximation and does not reflect
     *         the actual billing rate.
     *         </p>
     */
    public Integer getNormalizedInstanceHours() {
        return normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     *
     * @param normalizedInstanceHours <p>
     *            An approximation of the cost of the cluster, represented in
     *            m1.small/hours. This value is incremented one time for every
     *            hour an m1.small instance runs. Larger instances are weighted
     *            more, so an EC2 instance that is roughly four times more
     *            expensive would result in the normalized instance hours being
     *            incremented by four. This result is only an approximation and
     *            does not reflect the actual billing rate.
     *            </p>
     */
    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param normalizedInstanceHours <p>
     *            An approximation of the cost of the cluster, represented in
     *            m1.small/hours. This value is incremented one time for every
     *            hour an m1.small instance runs. Larger instances are weighted
     *            more, so an EC2 instance that is roughly four times more
     *            expensive would result in the normalized instance hours being
     *            incremented by four. This result is only an approximation and
     *            does not reflect the actual billing rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
        return this;
    }

    /**
     * <p>
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     *
     * @return <p>
     *         The DNS name of the master node. If the cluster is on a private
     *         subnet, this is the private DNS name. On a public subnet, this is
     *         the public DNS name.
     *         </p>
     */
    public String getMasterPublicDnsName() {
        return masterPublicDnsName;
    }

    /**
     * <p>
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     *
     * @param masterPublicDnsName <p>
     *            The DNS name of the master node. If the cluster is on a
     *            private subnet, this is the private DNS name. On a public
     *            subnet, this is the public DNS name.
     *            </p>
     */
    public void setMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
    }

    /**
     * <p>
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterPublicDnsName <p>
     *            The DNS name of the master node. If the cluster is on a
     *            private subnet, this is the private DNS name. On a public
     *            subnet, this is the public DNS name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
        return this;
    }

    /**
     * <p>
     * Applies only to Amazon EMR releases 4.x and later. The list of
     * Configurations supplied to the EMR cluster.
     * </p>
     *
     * @return <p>
     *         Applies only to Amazon EMR releases 4.x and later. The list of
     *         Configurations supplied to the EMR cluster.
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * Applies only to Amazon EMR releases 4.x and later. The list of
     * Configurations supplied to the EMR cluster.
     * </p>
     *
     * @param configurations <p>
     *            Applies only to Amazon EMR releases 4.x and later. The list of
     *            Configurations supplied to the EMR cluster.
     *            </p>
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<Configuration>(configurations);
    }

    /**
     * <p>
     * Applies only to Amazon EMR releases 4.x and later. The list of
     * Configurations supplied to the EMR cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            Applies only to Amazon EMR releases 4.x and later. The list of
     *            Configurations supplied to the EMR cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) {
            this.configurations = new java.util.ArrayList<Configuration>(configurations.length);
        }
        for (Configuration value : configurations) {
            this.configurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Applies only to Amazon EMR releases 4.x and later. The list of
     * Configurations supplied to the EMR cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            Applies only to Amazon EMR releases 4.x and later. The list of
     *            Configurations supplied to the EMR cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the security configuration applied to the cluster.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param securityConfiguration <p>
     *            The name of the security configuration applied to the cluster.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the security configuration applied to the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param securityConfiguration <p>
     *            The name of the security configuration applied to the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides
     * permissions that the automatic scaling feature requires to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         An IAM role for automatic scaling policies. The default role is
     *         <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides
     *         permissions that the automatic scaling feature requires to launch
     *         and terminate EC2 instances in an instance group.
     *         </p>
     */
    public String getAutoScalingRole() {
        return autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides
     * permissions that the automatic scaling feature requires to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingRole <p>
     *            An IAM role for automatic scaling policies. The default role
     *            is <code>EMR_AutoScaling_DefaultRole</code>. The IAM role
     *            provides permissions that the automatic scaling feature
     *            requires to launch and terminate EC2 instances in an instance
     *            group.
     *            </p>
     */
    public void setAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides
     * permissions that the automatic scaling feature requires to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingRole <p>
     *            An IAM role for automatic scaling policies. The default role
     *            is <code>EMR_AutoScaling_DefaultRole</code>. The IAM role
     *            provides permissions that the automatic scaling feature
     *            requires to launch and terminate EC2 instances in an instance
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
        return this;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic
     * scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available only
     * in Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @return <p>
     *         The way that individual Amazon EC2 instances terminate when an
     *         automatic scale-in activity occurs or an instance group is
     *         resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that
     *         Amazon EMR terminates nodes at the instance-hour boundary,
     *         regardless of when the request to terminate the instance was
     *         submitted. This option is only available with Amazon EMR 5.1.0
     *         and later and is the default for clusters created using that
     *         version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *         Amazon EMR blacklists and drains tasks from nodes before
     *         terminating the Amazon EC2 instances, regardless of the
     *         instance-hour boundary. With either behavior, Amazon EMR removes
     *         the least active nodes first and blocks instance termination if
     *         it could lead to HDFS corruption.
     *         <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in
     *         Amazon EMR version 4.1.0 and later, and is the default for
     *         versions of Amazon EMR earlier than 5.1.0.
     *         </p>
     * @see ScaleDownBehavior
     */
    public String getScaleDownBehavior() {
        return scaleDownBehavior;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic
     * scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available only
     * in Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @param scaleDownBehavior <p>
     *            The way that individual Amazon EC2 instances terminate when an
     *            automatic scale-in activity occurs or an instance group is
     *            resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates
     *            that Amazon EMR terminates nodes at the instance-hour
     *            boundary, regardless of when the request to terminate the
     *            instance was submitted. This option is only available with
     *            Amazon EMR 5.1.0 and later and is the default for clusters
     *            created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @see ScaleDownBehavior
     */
    public void setScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic
     * scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available only
     * in Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @param scaleDownBehavior <p>
     *            The way that individual Amazon EC2 instances terminate when an
     *            automatic scale-in activity occurs or an instance group is
     *            resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates
     *            that Amazon EMR terminates nodes at the instance-hour
     *            boundary, regardless of when the request to terminate the
     *            instance was submitted. This option is only available with
     *            Amazon EMR 5.1.0 and later and is the default for clusters
     *            created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleDownBehavior
     */
    public Cluster withScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
        return this;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic
     * scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available only
     * in Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @param scaleDownBehavior <p>
     *            The way that individual Amazon EC2 instances terminate when an
     *            automatic scale-in activity occurs or an instance group is
     *            resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates
     *            that Amazon EMR terminates nodes at the instance-hour
     *            boundary, regardless of when the request to terminate the
     *            instance was submitted. This option is only available with
     *            Amazon EMR 5.1.0 and later and is the default for clusters
     *            created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @see ScaleDownBehavior
     */
    public void setScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior.toString();
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic
     * scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> is available only
     * in Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @param scaleDownBehavior <p>
     *            The way that individual Amazon EC2 instances terminate when an
     *            automatic scale-in activity occurs or an instance group is
     *            resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates
     *            that Amazon EMR terminates nodes at the instance-hour
     *            boundary, regardless of when the request to terminate the
     *            instance was submitted. This option is only available with
     *            Amazon EMR 5.1.0 and later and is the default for clusters
     *            created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> is available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleDownBehavior
     */
    public Cluster withScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Available only in Amazon EMR version 5.7.0 and later. The ID of a
     *         custom Amazon EBS-backed Linux AMI if the cluster uses a custom
     *         AMI.
     *         </p>
     */
    public String getCustomAmiId() {
        return customAmiId;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param customAmiId <p>
     *            Available only in Amazon EMR version 5.7.0 and later. The ID
     *            of a custom Amazon EBS-backed Linux AMI if the cluster uses a
     *            custom AMI.
     *            </p>
     */
    public void setCustomAmiId(String customAmiId) {
        this.customAmiId = customAmiId;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param customAmiId <p>
     *            Available only in Amazon EMR version 5.7.0 and later. The ID
     *            of a custom Amazon EBS-backed Linux AMI if the cluster uses a
     *            custom AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withCustomAmiId(String customAmiId) {
        this.customAmiId = customAmiId;
        return this;
    }

    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is
     * used for each EC2 instance. Available in Amazon EMR version 4.x and
     * later.
     * </p>
     *
     * @return <p>
     *         The size, in GiB, of the EBS root device volume of the Linux AMI
     *         that is used for each EC2 instance. Available in Amazon EMR
     *         version 4.x and later.
     *         </p>
     */
    public Integer getEbsRootVolumeSize() {
        return ebsRootVolumeSize;
    }

    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is
     * used for each EC2 instance. Available in Amazon EMR version 4.x and
     * later.
     * </p>
     *
     * @param ebsRootVolumeSize <p>
     *            The size, in GiB, of the EBS root device volume of the Linux
     *            AMI that is used for each EC2 instance. Available in Amazon
     *            EMR version 4.x and later.
     *            </p>
     */
    public void setEbsRootVolumeSize(Integer ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
    }

    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is
     * used for each EC2 instance. Available in Amazon EMR version 4.x and
     * later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsRootVolumeSize <p>
     *            The size, in GiB, of the EBS root device volume of the Linux
     *            AMI that is used for each EC2 instance. Available in Amazon
     *            EMR version 4.x and later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withEbsRootVolumeSize(Integer ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
        return this;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies the type of
     * updates that are applied from the Amazon Linux AMI package repositories
     * when an instance boots using the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @return <p>
     *         Applies only when <code>CustomAmiID</code> is used. Specifies the
     *         type of updates that are applied from the Amazon Linux AMI
     *         package repositories when an instance boots using the AMI.
     *         </p>
     * @see RepoUpgradeOnBoot
     */
    public String getRepoUpgradeOnBoot() {
        return repoUpgradeOnBoot;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies the type of
     * updates that are applied from the Amazon Linux AMI package repositories
     * when an instance boots using the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @param repoUpgradeOnBoot <p>
     *            Applies only when <code>CustomAmiID</code> is used. Specifies
     *            the type of updates that are applied from the Amazon Linux AMI
     *            package repositories when an instance boots using the AMI.
     *            </p>
     * @see RepoUpgradeOnBoot
     */
    public void setRepoUpgradeOnBoot(String repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies the type of
     * updates that are applied from the Amazon Linux AMI package repositories
     * when an instance boots using the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @param repoUpgradeOnBoot <p>
     *            Applies only when <code>CustomAmiID</code> is used. Specifies
     *            the type of updates that are applied from the Amazon Linux AMI
     *            package repositories when an instance boots using the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RepoUpgradeOnBoot
     */
    public Cluster withRepoUpgradeOnBoot(String repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot;
        return this;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies the type of
     * updates that are applied from the Amazon Linux AMI package repositories
     * when an instance boots using the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @param repoUpgradeOnBoot <p>
     *            Applies only when <code>CustomAmiID</code> is used. Specifies
     *            the type of updates that are applied from the Amazon Linux AMI
     *            package repositories when an instance boots using the AMI.
     *            </p>
     * @see RepoUpgradeOnBoot
     */
    public void setRepoUpgradeOnBoot(RepoUpgradeOnBoot repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot.toString();
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies the type of
     * updates that are applied from the Amazon Linux AMI package repositories
     * when an instance boots using the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @param repoUpgradeOnBoot <p>
     *            Applies only when <code>CustomAmiID</code> is used. Specifies
     *            the type of updates that are applied from the Amazon Linux AMI
     *            package repositories when an instance boots using the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RepoUpgradeOnBoot
     */
    public Cluster withRepoUpgradeOnBoot(RepoUpgradeOnBoot repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot.toString();
        return this;
    }

    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is
     * enabled using a security configuration. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
     * >Use Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     *
     * @return <p>
     *         Attributes for Kerberos configuration when Kerberos
     *         authentication is enabled using a security configuration. For
     *         more information see <a href=
     *         "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
     *         >Use Kerberos Authentication</a> in the <i>EMR Management
     *         Guide</i>.
     *         </p>
     */
    public KerberosAttributes getKerberosAttributes() {
        return kerberosAttributes;
    }

    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is
     * enabled using a security configuration. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
     * >Use Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     *
     * @param kerberosAttributes <p>
     *            Attributes for Kerberos configuration when Kerberos
     *            authentication is enabled using a security configuration. For
     *            more information see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
     *            >Use Kerberos Authentication</a> in the <i>EMR Management
     *            Guide</i>.
     *            </p>
     */
    public void setKerberosAttributes(KerberosAttributes kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
    }

    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is
     * enabled using a security configuration. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
     * >Use Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kerberosAttributes <p>
     *            Attributes for Kerberos configuration when Kerberos
     *            authentication is enabled using a security configuration. For
     *            more information see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
     *            >Use Kerberos Authentication</a> in the <i>EMR Management
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withKerberosAttributes(KerberosAttributes kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name of the cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name of the cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost where the cluster
     *         is launched.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost where the
     *            cluster is launched.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost where the cluster is
     * launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost where the
     *            cluster is launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * Specifies the number of steps that can be executed concurrently.
     * </p>
     *
     * @return <p>
     *         Specifies the number of steps that can be executed concurrently.
     *         </p>
     */
    public Integer getStepConcurrencyLevel() {
        return stepConcurrencyLevel;
    }

    /**
     * <p>
     * Specifies the number of steps that can be executed concurrently.
     * </p>
     *
     * @param stepConcurrencyLevel <p>
     *            Specifies the number of steps that can be executed
     *            concurrently.
     *            </p>
     */
    public void setStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
    }

    /**
     * <p>
     * Specifies the number of steps that can be executed concurrently.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepConcurrencyLevel <p>
     *            Specifies the number of steps that can be executed
     *            concurrently.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEc2InstanceAttributes() != null)
            sb.append("Ec2InstanceAttributes: " + getEc2InstanceAttributes() + ",");
        if (getInstanceCollectionType() != null)
            sb.append("InstanceCollectionType: " + getInstanceCollectionType() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getRequestedAmiVersion() != null)
            sb.append("RequestedAmiVersion: " + getRequestedAmiVersion() + ",");
        if (getRunningAmiVersion() != null)
            sb.append("RunningAmiVersion: " + getRunningAmiVersion() + ",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: " + getReleaseLabel() + ",");
        if (getAutoTerminate() != null)
            sb.append("AutoTerminate: " + getAutoTerminate() + ",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: " + getTerminationProtected() + ",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: " + getVisibleToAllUsers() + ",");
        if (getApplications() != null)
            sb.append("Applications: " + getApplications() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getNormalizedInstanceHours() != null)
            sb.append("NormalizedInstanceHours: " + getNormalizedInstanceHours() + ",");
        if (getMasterPublicDnsName() != null)
            sb.append("MasterPublicDnsName: " + getMasterPublicDnsName() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getAutoScalingRole() != null)
            sb.append("AutoScalingRole: " + getAutoScalingRole() + ",");
        if (getScaleDownBehavior() != null)
            sb.append("ScaleDownBehavior: " + getScaleDownBehavior() + ",");
        if (getCustomAmiId() != null)
            sb.append("CustomAmiId: " + getCustomAmiId() + ",");
        if (getEbsRootVolumeSize() != null)
            sb.append("EbsRootVolumeSize: " + getEbsRootVolumeSize() + ",");
        if (getRepoUpgradeOnBoot() != null)
            sb.append("RepoUpgradeOnBoot: " + getRepoUpgradeOnBoot() + ",");
        if (getKerberosAttributes() != null)
            sb.append("KerberosAttributes: " + getKerberosAttributes() + ",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getStepConcurrencyLevel() != null)
            sb.append("StepConcurrencyLevel: " + getStepConcurrencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getEc2InstanceAttributes() == null) ? 0 : getEc2InstanceAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceCollectionType() == null) ? 0 : getInstanceCollectionType()
                        .hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode
                + ((getRequestedAmiVersion() == null) ? 0 : getRequestedAmiVersion().hashCode());
        hashCode = prime * hashCode
                + ((getRunningAmiVersion() == null) ? 0 : getRunningAmiVersion().hashCode());
        hashCode = prime * hashCode
                + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode
                + ((getAutoTerminate() == null) ? 0 : getAutoTerminate().hashCode());
        hashCode = prime * hashCode
                + ((getTerminationProtected() == null) ? 0 : getTerminationProtected().hashCode());
        hashCode = prime * hashCode
                + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        hashCode = prime * hashCode
                + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime
                * hashCode
                + ((getNormalizedInstanceHours() == null) ? 0 : getNormalizedInstanceHours()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMasterPublicDnsName() == null) ? 0 : getMasterPublicDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingRole() == null) ? 0 : getAutoScalingRole().hashCode());
        hashCode = prime * hashCode
                + ((getScaleDownBehavior() == null) ? 0 : getScaleDownBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getCustomAmiId() == null) ? 0 : getCustomAmiId().hashCode());
        hashCode = prime * hashCode
                + ((getEbsRootVolumeSize() == null) ? 0 : getEbsRootVolumeSize().hashCode());
        hashCode = prime * hashCode
                + ((getRepoUpgradeOnBoot() == null) ? 0 : getRepoUpgradeOnBoot().hashCode());
        hashCode = prime * hashCode
                + ((getKerberosAttributes() == null) ? 0 : getKerberosAttributes().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode
                + ((getStepConcurrencyLevel() == null) ? 0 : getStepConcurrencyLevel().hashCode());
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

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEc2InstanceAttributes() == null ^ this.getEc2InstanceAttributes() == null)
            return false;
        if (other.getEc2InstanceAttributes() != null
                && other.getEc2InstanceAttributes().equals(this.getEc2InstanceAttributes()) == false)
            return false;
        if (other.getInstanceCollectionType() == null ^ this.getInstanceCollectionType() == null)
            return false;
        if (other.getInstanceCollectionType() != null
                && other.getInstanceCollectionType().equals(this.getInstanceCollectionType()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getRequestedAmiVersion() == null ^ this.getRequestedAmiVersion() == null)
            return false;
        if (other.getRequestedAmiVersion() != null
                && other.getRequestedAmiVersion().equals(this.getRequestedAmiVersion()) == false)
            return false;
        if (other.getRunningAmiVersion() == null ^ this.getRunningAmiVersion() == null)
            return false;
        if (other.getRunningAmiVersion() != null
                && other.getRunningAmiVersion().equals(this.getRunningAmiVersion()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null
                && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getAutoTerminate() == null ^ this.getAutoTerminate() == null)
            return false;
        if (other.getAutoTerminate() != null
                && other.getAutoTerminate().equals(this.getAutoTerminate()) == false)
            return false;
        if (other.getTerminationProtected() == null ^ this.getTerminationProtected() == null)
            return false;
        if (other.getTerminationProtected() != null
                && other.getTerminationProtected().equals(this.getTerminationProtected()) == false)
            return false;
        if (other.getVisibleToAllUsers() == null ^ this.getVisibleToAllUsers() == null)
            return false;
        if (other.getVisibleToAllUsers() != null
                && other.getVisibleToAllUsers().equals(this.getVisibleToAllUsers()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null
                && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null)
            return false;
        if (other.getNormalizedInstanceHours() != null
                && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false)
            return false;
        if (other.getMasterPublicDnsName() == null ^ this.getMasterPublicDnsName() == null)
            return false;
        if (other.getMasterPublicDnsName() != null
                && other.getMasterPublicDnsName().equals(this.getMasterPublicDnsName()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null
                && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getAutoScalingRole() == null ^ this.getAutoScalingRole() == null)
            return false;
        if (other.getAutoScalingRole() != null
                && other.getAutoScalingRole().equals(this.getAutoScalingRole()) == false)
            return false;
        if (other.getScaleDownBehavior() == null ^ this.getScaleDownBehavior() == null)
            return false;
        if (other.getScaleDownBehavior() != null
                && other.getScaleDownBehavior().equals(this.getScaleDownBehavior()) == false)
            return false;
        if (other.getCustomAmiId() == null ^ this.getCustomAmiId() == null)
            return false;
        if (other.getCustomAmiId() != null
                && other.getCustomAmiId().equals(this.getCustomAmiId()) == false)
            return false;
        if (other.getEbsRootVolumeSize() == null ^ this.getEbsRootVolumeSize() == null)
            return false;
        if (other.getEbsRootVolumeSize() != null
                && other.getEbsRootVolumeSize().equals(this.getEbsRootVolumeSize()) == false)
            return false;
        if (other.getRepoUpgradeOnBoot() == null ^ this.getRepoUpgradeOnBoot() == null)
            return false;
        if (other.getRepoUpgradeOnBoot() != null
                && other.getRepoUpgradeOnBoot().equals(this.getRepoUpgradeOnBoot()) == false)
            return false;
        if (other.getKerberosAttributes() == null ^ this.getKerberosAttributes() == null)
            return false;
        if (other.getKerberosAttributes() != null
                && other.getKerberosAttributes().equals(this.getKerberosAttributes()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getStepConcurrencyLevel() == null ^ this.getStepConcurrencyLevel() == null)
            return false;
        if (other.getStepConcurrencyLevel() != null
                && other.getStepConcurrencyLevel().equals(this.getStepConcurrencyLevel()) == false)
            return false;
        return true;
    }
}
