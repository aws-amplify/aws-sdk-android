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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * RunJobFlow creates and starts running a new cluster (job flow). The cluster
 * runs the steps specified. After the steps complete, the cluster stops and the
 * HDFS partition is lost. To prevent loss of data, configure the last step of
 * the job flow to store results in Amazon S3. If the
 * <a>JobFlowInstancesConfig</a> <code>KeepJobFlowAliveWhenNoSteps</code>
 * parameter is set to <code>TRUE</code>, the cluster transitions to the WAITING
 * state rather than shutting down after the steps have completed.
 * </p>
 * <p>
 * For additional protection, you can set the <a>JobFlowInstancesConfig</a>
 * <code>TerminationProtected</code> parameter to <code>TRUE</code> to lock the
 * cluster and prevent it from being terminated by API call, user intervention,
 * or in the event of a job flow error.
 * </p>
 * <p>
 * A maximum of 256 steps are allowed in each job flow.
 * </p>
 * <p>
 * If your cluster is long-running (such as a Hive data warehouse) or complex,
 * you may require more than 256 steps to process your data. You can bypass the
 * 256-step limitation in various ways, including using the SSH shell to connect
 * to the master node and submitting queries directly to the software running on
 * the master node, such as Hive and Hadoop. For more information on how to do
 * this, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html"
 * >Add More than 256 Steps to a Cluster</a> in the <i>Amazon EMR Management
 * Guide</i>.
 * </p>
 * <p>
 * For long running clusters, we recommend that you periodically store your
 * results.
 * </p>
 * <note>
 * <p>
 * The instance fleets configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain
 * InstanceFleets parameters or InstanceGroups parameters, but not both.
 * </p>
 * </note>
 */
public class RunJobFlowRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the job flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String name;

    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String logUri;

    /**
     * <p>
     * A JSON string for selecting additional features.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String additionalInfo;

    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR
     * releases 4.0 and later, <code>ReleaseLabel</code> is used. To specify a
     * custom AMI, use <code>CustomAmiID</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String amiVersion;

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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String releaseLabel;

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     */
    private JobFlowInstancesConfig instances;

    /**
     * <p>
     * A list of steps to run.
     * </p>
     */
    private java.util.List<StepConfig> steps;

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster
     * nodes.
     * </p>
     */
    private java.util.List<BootstrapActionConfig> bootstrapActions;

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Currently supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> supportedProducts;

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job
     * flow that accepts a user argument list. EMR accepts and forwards the
     * argument list to the corresponding installation script as bootstrap
     * action arguments. For more information, see
     * "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or
     * "--edition,m5" - launch the job flow using MapR M3 or M5 Edition
     * respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System
     * installed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<SupportedProductConfig> newSupportedProducts;

    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of
     * applications for Amazon EMR to install and configure when launching the
     * cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR
     * Release Guide</a>.
     * </p>
     */
    private java.util.List<Application> applications;

    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations
     * supplied for the EMR cluster you are creating.
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     */
    private Boolean visibleToAllUsers;

    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR
     * cluster. The EC2 instances of the cluster assume this role. The default
     * role is <code>EMR_EC2_DefaultRole</code>. In order to use the default
     * role, you must have already created it using the CLI or console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String jobFlowRole;

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String serviceRole;

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
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
     * Specifies the way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     * Amazon EMR version 4.1.0 and later, and is the default for versions of
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
     * Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when
     * it launches cluster EC2 instances. For more information about custom AMIs
     * in Amazon EMR, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html"
     * >Using a Custom AMI</a> in the <i>Amazon EMR Management Guide</i>. If
     * omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x,
     * use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     * >Creating an Amazon EBS-Backed Linux AMI</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding a Linux AMI</a>.
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
     * Applies only when <code>CustomAmiID</code> is used. Specifies which
     * updates from the Amazon Linux AMI package repositories to apply
     * automatically when the instance boots using the AMI. If omitted, the
     * default is <code>SECURITY</code>, which indicates that only security
     * updates are applied. If <code>NONE</code> is specified, no updates are
     * applied, and all updates must be applied manually.
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
     * Specifies the number of steps that can be executed concurrently. The
     * default value is <code>1</code>. The maximum value is <code>256</code>.
     * </p>
     */
    private Integer stepConcurrencyLevel;

    /**
     * <p>
     * The specified managed scaling policy for an Amazon EMR cluster.
     * </p>
     */
    private ManagedScalingPolicy managedScalingPolicy;

    /**
     * <p>
     * The name of the job flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the job flow.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the job flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            The name of the job flow.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job flow.
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
     * @param name <p>
     *            The name of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The location in Amazon S3 to write the log files of the job flow.
     *         If a value is not provided, logs are not created.
     *         </p>
     */
    public String getLogUri() {
        return logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param logUri <p>
     *            The location in Amazon S3 to write the log files of the job
     *            flow. If a value is not provided, logs are not created.
     *            </p>
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
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
     * @param logUri <p>
     *            The location in Amazon S3 to write the log files of the job
     *            flow. If a value is not provided, logs are not created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * <p>
     * A JSON string for selecting additional features.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A JSON string for selecting additional features.
     *         </p>
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * A JSON string for selecting additional features.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param additionalInfo <p>
     *            A JSON string for selecting additional features.
     *            </p>
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * A JSON string for selecting additional features.
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
     * @param additionalInfo <p>
     *            A JSON string for selecting additional features.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR
     * releases 4.0 and later, <code>ReleaseLabel</code> is used. To specify a
     * custom AMI, use <code>CustomAmiID</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon
     *         EMR releases 4.0 and later, <code>ReleaseLabel</code> is used. To
     *         specify a custom AMI, use <code>CustomAmiID</code>.
     *         </p>
     */
    public String getAmiVersion() {
        return amiVersion;
    }

    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR
     * releases 4.0 and later, <code>ReleaseLabel</code> is used. To specify a
     * custom AMI, use <code>CustomAmiID</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param amiVersion <p>
     *            Applies only to Amazon EMR AMI versions 3.x and 2.x. For
     *            Amazon EMR releases 4.0 and later, <code>ReleaseLabel</code>
     *            is used. To specify a custom AMI, use <code>CustomAmiID</code>
     *            .
     *            </p>
     */
    public void setAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
    }

    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR
     * releases 4.0 and later, <code>ReleaseLabel</code> is used. To specify a
     * custom AMI, use <code>CustomAmiID</code>.
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
     * @param amiVersion <p>
     *            Applies only to Amazon EMR AMI versions 3.x and 2.x. For
     *            Amazon EMR releases 4.0 and later, <code>ReleaseLabel</code>
     *            is used. To specify a custom AMI, use <code>CustomAmiID</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
    public RunJobFlowRequest withReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
        return this;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     *
     * @return <p>
     *         A specification of the number and type of Amazon EC2 instances.
     *         </p>
     */
    public JobFlowInstancesConfig getInstances() {
        return instances;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     *
     * @param instances <p>
     *            A specification of the number and type of Amazon EC2
     *            instances.
     *            </p>
     */
    public void setInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            A specification of the number and type of Amazon EC2
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
        return this;
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     *
     * @return <p>
     *         A list of steps to run.
     *         </p>
     */
    public java.util.List<StepConfig> getSteps() {
        return steps;
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     *
     * @param steps <p>
     *            A list of steps to run.
     *            </p>
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<StepConfig>(steps);
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            A list of steps to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withSteps(StepConfig... steps) {
        if (getSteps() == null) {
            this.steps = new java.util.ArrayList<StepConfig>(steps.length);
        }
        for (StepConfig value : steps) {
            this.steps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            A list of steps to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withSteps(java.util.Collection<StepConfig> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster
     * nodes.
     * </p>
     *
     * @return <p>
     *         A list of bootstrap actions to run before Hadoop starts on the
     *         cluster nodes.
     *         </p>
     */
    public java.util.List<BootstrapActionConfig> getBootstrapActions() {
        return bootstrapActions;
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster
     * nodes.
     * </p>
     *
     * @param bootstrapActions <p>
     *            A list of bootstrap actions to run before Hadoop starts on the
     *            cluster nodes.
     *            </p>
     */
    public void setBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }

        this.bootstrapActions = new java.util.ArrayList<BootstrapActionConfig>(bootstrapActions);
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster
     * nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bootstrapActions <p>
     *            A list of bootstrap actions to run before Hadoop starts on the
     *            cluster nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withBootstrapActions(BootstrapActionConfig... bootstrapActions) {
        if (getBootstrapActions() == null) {
            this.bootstrapActions = new java.util.ArrayList<BootstrapActionConfig>(
                    bootstrapActions.length);
        }
        for (BootstrapActionConfig value : bootstrapActions) {
            this.bootstrapActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster
     * nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bootstrapActions <p>
     *            A list of bootstrap actions to run before Hadoop starts on the
     *            cluster nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withBootstrapActions(
            java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        setBootstrapActions(bootstrapActions);
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Currently supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     *
     * @return <note>
     *         <p>
     *         For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x
     *         and later, use Applications.
     *         </p>
     *         </note>
     *         <p>
     *         A list of strings that indicates third-party software to use. For
     *         more information, see the <a href=
     *         "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *         >Amazon EMR Developer Guide</a>. Currently supported values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "mapr-m3" - launch the job flow using MapR M3 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr-m5" - launch the job flow using MapR M5 Edition.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getSupportedProducts() {
        return supportedProducts;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Currently supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     *
     * @param supportedProducts <note>
     *            <p>
     *            For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *            4.x and later, use Applications.
     *            </p>
     *            </note>
     *            <p>
     *            A list of strings that indicates third-party software to use.
     *            For more information, see the <a href=
     *            "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *            >Amazon EMR Developer Guide</a>. Currently supported values
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            "mapr-m3" - launch the job flow using MapR M3 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m5" - launch the job flow using MapR M5 Edition.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
            return;
        }

        this.supportedProducts = new java.util.ArrayList<String>(supportedProducts);
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Currently supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedProducts <note>
     *            <p>
     *            For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *            4.x and later, use Applications.
     *            </p>
     *            </note>
     *            <p>
     *            A list of strings that indicates third-party software to use.
     *            For more information, see the <a href=
     *            "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *            >Amazon EMR Developer Guide</a>. Currently supported values
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            "mapr-m3" - launch the job flow using MapR M3 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m5" - launch the job flow using MapR M5 Edition.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withSupportedProducts(String... supportedProducts) {
        if (getSupportedProducts() == null) {
            this.supportedProducts = new java.util.ArrayList<String>(supportedProducts.length);
        }
        for (String value : supportedProducts) {
            this.supportedProducts.add(value);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Currently supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedProducts <note>
     *            <p>
     *            For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *            4.x and later, use Applications.
     *            </p>
     *            </note>
     *            <p>
     *            A list of strings that indicates third-party software to use.
     *            For more information, see the <a href=
     *            "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *            >Amazon EMR Developer Guide</a>. Currently supported values
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            "mapr-m3" - launch the job flow using MapR M3 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m5" - launch the job flow using MapR M5 Edition.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withSupportedProducts(java.util.Collection<String> supportedProducts) {
        setSupportedProducts(supportedProducts);
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job
     * flow that accepts a user argument list. EMR accepts and forwards the
     * argument list to the corresponding installation script as bootstrap
     * action arguments. For more information, see
     * "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or
     * "--edition,m5" - launch the job flow using MapR M3 or M5 Edition
     * respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System
     * installed.
     * </p>
     * </li>
     * </ul>
     *
     * @return <note>
     *         <p>
     *         For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x
     *         and later, use Applications.
     *         </p>
     *         </note>
     *         <p>
     *         A list of strings that indicates third-party software to use with
     *         the job flow that accepts a user argument list. EMR accepts and
     *         forwards the argument list to the corresponding installation
     *         script as bootstrap action arguments. For more information, see
     *         "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     *         href=
     *         "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *         >Amazon EMR Developer Guide</a>. Supported values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "mapr-m3" - launch the cluster using MapR M3 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr-m5" - launch the cluster using MapR M5 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr" with the user arguments specifying "--edition,m3" or
     *         "--edition,m5" - launch the job flow using MapR M3 or M5 Edition
     *         respectively.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr-m7" - launch the cluster using MapR M7 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "hunk" - launch the cluster with the Hunk Big Data Analtics
     *         Platform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "hue"- launch the cluster with Hue installed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "spark" - launch the cluster with Apache Spark installed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "ganglia" - launch the cluster with the Ganglia Monitoring System
     *         installed.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<SupportedProductConfig> getNewSupportedProducts() {
        return newSupportedProducts;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job
     * flow that accepts a user argument list. EMR accepts and forwards the
     * argument list to the corresponding installation script as bootstrap
     * action arguments. For more information, see
     * "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or
     * "--edition,m5" - launch the job flow using MapR M3 or M5 Edition
     * respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System
     * installed.
     * </p>
     * </li>
     * </ul>
     *
     * @param newSupportedProducts <note>
     *            <p>
     *            For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *            4.x and later, use Applications.
     *            </p>
     *            </note>
     *            <p>
     *            A list of strings that indicates third-party software to use
     *            with the job flow that accepts a user argument list. EMR
     *            accepts and forwards the argument list to the corresponding
     *            installation script as bootstrap action arguments. For more
     *            information, see
     *            "Launch a Job Flow on the MapR Distribution for Hadoop" in the
     *            <a href=
     *            "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *            >Amazon EMR Developer Guide</a>. Supported values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            "mapr-m3" - launch the cluster using MapR M3 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m5" - launch the cluster using MapR M5 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr" with the user arguments specifying "--edition,m3" or
     *            "--edition,m5" - launch the job flow using MapR M3 or M5
     *            Edition respectively.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m7" - launch the cluster using MapR M7 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "hunk" - launch the cluster with the Hunk Big Data Analtics
     *            Platform.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "hue"- launch the cluster with Hue installed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "spark" - launch the cluster with Apache Spark installed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "ganglia" - launch the cluster with the Ganglia Monitoring
     *            System installed.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNewSupportedProducts(
            java.util.Collection<SupportedProductConfig> newSupportedProducts) {
        if (newSupportedProducts == null) {
            this.newSupportedProducts = null;
            return;
        }

        this.newSupportedProducts = new java.util.ArrayList<SupportedProductConfig>(
                newSupportedProducts);
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job
     * flow that accepts a user argument list. EMR accepts and forwards the
     * argument list to the corresponding installation script as bootstrap
     * action arguments. For more information, see
     * "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or
     * "--edition,m5" - launch the job flow using MapR M3 or M5 Edition
     * respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System
     * installed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newSupportedProducts <note>
     *            <p>
     *            For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *            4.x and later, use Applications.
     *            </p>
     *            </note>
     *            <p>
     *            A list of strings that indicates third-party software to use
     *            with the job flow that accepts a user argument list. EMR
     *            accepts and forwards the argument list to the corresponding
     *            installation script as bootstrap action arguments. For more
     *            information, see
     *            "Launch a Job Flow on the MapR Distribution for Hadoop" in the
     *            <a href=
     *            "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *            >Amazon EMR Developer Guide</a>. Supported values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            "mapr-m3" - launch the cluster using MapR M3 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m5" - launch the cluster using MapR M5 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr" with the user arguments specifying "--edition,m3" or
     *            "--edition,m5" - launch the job flow using MapR M3 or M5
     *            Edition respectively.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m7" - launch the cluster using MapR M7 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "hunk" - launch the cluster with the Hunk Big Data Analtics
     *            Platform.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "hue"- launch the cluster with Hue installed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "spark" - launch the cluster with Apache Spark installed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "ganglia" - launch the cluster with the Ganglia Monitoring
     *            System installed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withNewSupportedProducts(
            SupportedProductConfig... newSupportedProducts) {
        if (getNewSupportedProducts() == null) {
            this.newSupportedProducts = new java.util.ArrayList<SupportedProductConfig>(
                    newSupportedProducts.length);
        }
        for (SupportedProductConfig value : newSupportedProducts) {
            this.newSupportedProducts.add(value);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and
     * later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job
     * flow that accepts a user argument list. EMR accepts and forwards the
     * argument list to the corresponding installation script as bootstrap
     * action arguments. For more information, see
     * "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     * >Amazon EMR Developer Guide</a>. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or
     * "--edition,m5" - launch the job flow using MapR M3 or M5 Edition
     * respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System
     * installed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newSupportedProducts <note>
     *            <p>
     *            For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *            4.x and later, use Applications.
     *            </p>
     *            </note>
     *            <p>
     *            A list of strings that indicates third-party software to use
     *            with the job flow that accepts a user argument list. EMR
     *            accepts and forwards the argument list to the corresponding
     *            installation script as bootstrap action arguments. For more
     *            information, see
     *            "Launch a Job Flow on the MapR Distribution for Hadoop" in the
     *            <a href=
     *            "https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf"
     *            >Amazon EMR Developer Guide</a>. Supported values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            "mapr-m3" - launch the cluster using MapR M3 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m5" - launch the cluster using MapR M5 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr" with the user arguments specifying "--edition,m3" or
     *            "--edition,m5" - launch the job flow using MapR M3 or M5
     *            Edition respectively.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "mapr-m7" - launch the cluster using MapR M7 Edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "hunk" - launch the cluster with the Hunk Big Data Analtics
     *            Platform.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "hue"- launch the cluster with Hue installed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "spark" - launch the cluster with Apache Spark installed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            "ganglia" - launch the cluster with the Ganglia Monitoring
     *            System installed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withNewSupportedProducts(
            java.util.Collection<SupportedProductConfig> newSupportedProducts) {
        setNewSupportedProducts(newSupportedProducts);
        return this;
    }

    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of
     * applications for Amazon EMR to install and configure when launching the
     * cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR
     * Release Guide</a>.
     * </p>
     *
     * @return <p>
     *         Applies to Amazon EMR releases 4.0 and later. A case-insensitive
     *         list of applications for Amazon EMR to install and configure when
     *         launching the cluster. For a list of applications available for
     *         each Amazon EMR release version, see the <a
     *         href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *         >Amazon EMR Release Guide</a>.
     *         </p>
     */
    public java.util.List<Application> getApplications() {
        return applications;
    }

    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of
     * applications for Amazon EMR to install and configure when launching the
     * cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR
     * Release Guide</a>.
     * </p>
     *
     * @param applications <p>
     *            Applies to Amazon EMR releases 4.0 and later. A
     *            case-insensitive list of applications for Amazon EMR to
     *            install and configure when launching the cluster. For a list
     *            of applications available for each Amazon EMR release version,
     *            see the <a
     *            href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *            >Amazon EMR Release Guide</a>.
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
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of
     * applications for Amazon EMR to install and configure when launching the
     * cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR
     * Release Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applications <p>
     *            Applies to Amazon EMR releases 4.0 and later. A
     *            case-insensitive list of applications for Amazon EMR to
     *            install and configure when launching the cluster. For a list
     *            of applications available for each Amazon EMR release version,
     *            see the <a
     *            href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *            >Amazon EMR Release Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withApplications(Application... applications) {
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
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of
     * applications for Amazon EMR to install and configure when launching the
     * cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR
     * Release Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applications <p>
     *            Applies to Amazon EMR releases 4.0 and later. A
     *            case-insensitive list of applications for Amazon EMR to
     *            install and configure when launching the cluster. For a list
     *            of applications available for each Amazon EMR release version,
     *            see the <a
     *            href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *            >Amazon EMR Release Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations
     * supplied for the EMR cluster you are creating.
     * </p>
     *
     * @return <p>
     *         For Amazon EMR releases 4.0 and later. The list of configurations
     *         supplied for the EMR cluster you are creating.
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations
     * supplied for the EMR cluster you are creating.
     * </p>
     *
     * @param configurations <p>
     *            For Amazon EMR releases 4.0 and later. The list of
     *            configurations supplied for the EMR cluster you are creating.
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
     * For Amazon EMR releases 4.0 and later. The list of configurations
     * supplied for the EMR cluster you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            For Amazon EMR releases 4.0 and later. The list of
     *            configurations supplied for the EMR cluster you are creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withConfigurations(Configuration... configurations) {
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
     * For Amazon EMR releases 4.0 and later. The list of configurations
     * supplied for the EMR cluster you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            For Amazon EMR releases 4.0 and later. The list of
     *            configurations supplied for the EMR cluster you are creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     *
     * @return <p>
     *         A value of <code>true</code> indicates that all IAM users in the
     *         AWS account can perform cluster actions if they have the proper
     *         IAM policy permissions. This is the default. A value of
     *         <code>false</code> indicates that only the IAM user who created
     *         the cluster can perform actions.
     *         </p>
     */
    public Boolean isVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     *
     * @return <p>
     *         A value of <code>true</code> indicates that all IAM users in the
     *         AWS account can perform cluster actions if they have the proper
     *         IAM policy permissions. This is the default. A value of
     *         <code>false</code> indicates that only the IAM user who created
     *         the cluster can perform actions.
     *         </p>
     */
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     *
     * @param visibleToAllUsers <p>
     *            A value of <code>true</code> indicates that all IAM users in
     *            the AWS account can perform cluster actions if they have the
     *            proper IAM policy permissions. This is the default. A value of
     *            <code>false</code> indicates that only the IAM user who
     *            created the cluster can perform actions.
     *            </p>
     */
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param visibleToAllUsers <p>
     *            A value of <code>true</code> indicates that all IAM users in
     *            the AWS account can perform cluster actions if they have the
     *            proper IAM policy permissions. This is the default. A value of
     *            <code>false</code> indicates that only the IAM user who
     *            created the cluster can perform actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR
     * cluster. The EC2 instances of the cluster assume this role. The default
     * role is <code>EMR_EC2_DefaultRole</code>. In order to use the default
     * role, you must have already created it using the CLI or console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Also called instance profile and EC2 role. An IAM role for an EMR
     *         cluster. The EC2 instances of the cluster assume this role. The
     *         default role is <code>EMR_EC2_DefaultRole</code>. In order to use
     *         the default role, you must have already created it using the CLI
     *         or console.
     *         </p>
     */
    public String getJobFlowRole() {
        return jobFlowRole;
    }

    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR
     * cluster. The EC2 instances of the cluster assume this role. The default
     * role is <code>EMR_EC2_DefaultRole</code>. In order to use the default
     * role, you must have already created it using the CLI or console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowRole <p>
     *            Also called instance profile and EC2 role. An IAM role for an
     *            EMR cluster. The EC2 instances of the cluster assume this
     *            role. The default role is <code>EMR_EC2_DefaultRole</code>. In
     *            order to use the default role, you must have already created
     *            it using the CLI or console.
     *            </p>
     */
    public void setJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }

    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR
     * cluster. The EC2 instances of the cluster assume this role. The default
     * role is <code>EMR_EC2_DefaultRole</code>. In order to use the default
     * role, you must have already created it using the CLI or console.
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
     * @param jobFlowRole <p>
     *            Also called instance profile and EC2 role. An IAM role for an
     *            EMR cluster. The EC2 instances of the cluster assume this
     *            role. The default role is <code>EMR_EC2_DefaultRole</code>. In
     *            order to use the default role, you must have already created
     *            it using the CLI or console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
        return this;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param serviceRole <p>
     *            The IAM role that will be assumed by the Amazon EMR service to
     *            access AWS resources on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     * </p>
     *
     * @return <p>
     *         A list of tags to associate with a cluster and propagate to
     *         Amazon EC2 instances.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to associate with a cluster and propagate to
     *            Amazon EC2 instances.
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
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with a cluster and propagate to
     *            Amazon EC2 instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withTags(Tag... tags) {
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
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with a cluster and propagate to
     *            Amazon EC2 instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of a security configuration to apply to the cluster.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param securityConfiguration <p>
     *            The name of a security configuration to apply to the cluster.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
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
     *            The name of a security configuration to apply to the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withSecurityConfiguration(String securityConfiguration) {
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
    public RunJobFlowRequest withAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
        return this;
    }

    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     * Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @return <p>
     *         Specifies the way that individual Amazon EC2 instances terminate
     *         when an automatic scale-in activity occurs or an instance group
     *         is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates
     *         that Amazon EMR terminates nodes at the instance-hour boundary,
     *         regardless of when the request to terminate the instance was
     *         submitted. This option is only available with Amazon EMR 5.1.0
     *         and later and is the default for clusters created using that
     *         version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *         Amazon EMR blacklists and drains tasks from nodes before
     *         terminating the Amazon EC2 instances, regardless of the
     *         instance-hour boundary. With either behavior, Amazon EMR removes
     *         the least active nodes first and blocks instance termination if
     *         it could lead to HDFS corruption.
     *         <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
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
     * Specifies the way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     * Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @param scaleDownBehavior <p>
     *            Specifies the way that individual Amazon EC2 instances
     *            terminate when an automatic scale-in activity occurs or an
     *            instance group is resized.
     *            <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon
     *            EMR terminates nodes at the instance-hour boundary, regardless
     *            of when the request to terminate the instance was submitted.
     *            This option is only available with Amazon EMR 5.1.0 and later
     *            and is the default for clusters created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
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
     * Specifies the way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     * Amazon EMR version 4.1.0 and later, and is the default for versions of
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
     *            Specifies the way that individual Amazon EC2 instances
     *            terminate when an automatic scale-in activity occurs or an
     *            instance group is resized.
     *            <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon
     *            EMR terminates nodes at the instance-hour boundary, regardless
     *            of when the request to terminate the instance was submitted.
     *            This option is only available with Amazon EMR 5.1.0 and later
     *            and is the default for clusters created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleDownBehavior
     */
    public RunJobFlowRequest withScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
        return this;
    }

    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     * Amazon EMR version 4.1.0 and later, and is the default for versions of
     * Amazon EMR earlier than 5.1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_AT_INSTANCE_HOUR,
     * TERMINATE_AT_TASK_COMPLETION
     *
     * @param scaleDownBehavior <p>
     *            Specifies the way that individual Amazon EC2 instances
     *            terminate when an automatic scale-in activity occurs or an
     *            instance group is resized.
     *            <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon
     *            EMR terminates nodes at the instance-hour boundary, regardless
     *            of when the request to terminate the instance was submitted.
     *            This option is only available with Amazon EMR 5.1.0 and later
     *            and is the default for clusters created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
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
     * Specifies the way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     * terminates nodes at the instance-hour boundary, regardless of when the
     * request to terminate the instance was submitted. This option is only
     * available with Amazon EMR 5.1.0 and later and is the default for clusters
     * created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code>
     * indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour
     * boundary. With either behavior, Amazon EMR removes the least active nodes
     * first and blocks instance termination if it could lead to HDFS
     * corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     * Amazon EMR version 4.1.0 and later, and is the default for versions of
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
     *            Specifies the way that individual Amazon EC2 instances
     *            terminate when an automatic scale-in activity occurs or an
     *            instance group is resized.
     *            <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon
     *            EMR terminates nodes at the instance-hour boundary, regardless
     *            of when the request to terminate the instance was submitted.
     *            This option is only available with Amazon EMR 5.1.0 and later
     *            and is the default for clusters created using that version.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that
     *            Amazon EMR blacklists and drains tasks from nodes before
     *            terminating the Amazon EC2 instances, regardless of the
     *            instance-hour boundary. With either behavior, Amazon EMR
     *            removes the least active nodes first and blocks instance
     *            termination if it could lead to HDFS corruption.
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleDownBehavior
     */
    public RunJobFlowRequest withScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when
     * it launches cluster EC2 instances. For more information about custom AMIs
     * in Amazon EMR, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html"
     * >Using a Custom AMI</a> in the <i>Amazon EMR Management Guide</i>. If
     * omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x,
     * use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     * >Creating an Amazon EBS-Backed Linux AMI</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding a Linux AMI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Available only in Amazon EMR version 5.7.0 and later. The ID of a
     *         custom Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses
     *         this AMI when it launches cluster EC2 instances. For more
     *         information about custom AMIs in Amazon EMR, see <a href=
     *         "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html"
     *         >Using a Custom AMI</a> in the <i>Amazon EMR Management
     *         Guide</i>. If omitted, the cluster uses the base Linux AMI for
     *         the <code>ReleaseLabel</code> specified. For Amazon EMR versions
     *         2.x and 3.x, use <code>AmiVersion</code> instead.
     *         </p>
     *         <p>
     *         For information about creating a custom AMI, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     *         >Creating an Amazon EBS-Backed Linux AMI</a> in the <i>Amazon
     *         Elastic Compute Cloud User Guide for Linux Instances</i>. For
     *         information about finding an AMI ID, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     *         >Finding a Linux AMI</a>.
     *         </p>
     */
    public String getCustomAmiId() {
        return customAmiId;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when
     * it launches cluster EC2 instances. For more information about custom AMIs
     * in Amazon EMR, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html"
     * >Using a Custom AMI</a> in the <i>Amazon EMR Management Guide</i>. If
     * omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x,
     * use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     * >Creating an Amazon EBS-Backed Linux AMI</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding a Linux AMI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param customAmiId <p>
     *            Available only in Amazon EMR version 5.7.0 and later. The ID
     *            of a custom Amazon EBS-backed Linux AMI. If specified, Amazon
     *            EMR uses this AMI when it launches cluster EC2 instances. For
     *            more information about custom AMIs in Amazon EMR, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html"
     *            >Using a Custom AMI</a> in the <i>Amazon EMR Management
     *            Guide</i>. If omitted, the cluster uses the base Linux AMI for
     *            the <code>ReleaseLabel</code> specified. For Amazon EMR
     *            versions 2.x and 3.x, use <code>AmiVersion</code> instead.
     *            </p>
     *            <p>
     *            For information about creating a custom AMI, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     *            >Creating an Amazon EBS-Backed Linux AMI</a> in the <i>Amazon
     *            Elastic Compute Cloud User Guide for Linux Instances</i>. For
     *            information about finding an AMI ID, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     *            >Finding a Linux AMI</a>.
     *            </p>
     */
    public void setCustomAmiId(String customAmiId) {
        this.customAmiId = customAmiId;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when
     * it launches cluster EC2 instances. For more information about custom AMIs
     * in Amazon EMR, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html"
     * >Using a Custom AMI</a> in the <i>Amazon EMR Management Guide</i>. If
     * omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x,
     * use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     * >Creating an Amazon EBS-Backed Linux AMI</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding a Linux AMI</a>.
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
     *            of a custom Amazon EBS-backed Linux AMI. If specified, Amazon
     *            EMR uses this AMI when it launches cluster EC2 instances. For
     *            more information about custom AMIs in Amazon EMR, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html"
     *            >Using a Custom AMI</a> in the <i>Amazon EMR Management
     *            Guide</i>. If omitted, the cluster uses the base Linux AMI for
     *            the <code>ReleaseLabel</code> specified. For Amazon EMR
     *            versions 2.x and 3.x, use <code>AmiVersion</code> instead.
     *            </p>
     *            <p>
     *            For information about creating a custom AMI, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     *            >Creating an Amazon EBS-Backed Linux AMI</a> in the <i>Amazon
     *            Elastic Compute Cloud User Guide for Linux Instances</i>. For
     *            information about finding an AMI ID, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     *            >Finding a Linux AMI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withCustomAmiId(String customAmiId) {
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
    public RunJobFlowRequest withEbsRootVolumeSize(Integer ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
        return this;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which
     * updates from the Amazon Linux AMI package repositories to apply
     * automatically when the instance boots using the AMI. If omitted, the
     * default is <code>SECURITY</code>, which indicates that only security
     * updates are applied. If <code>NONE</code> is specified, no updates are
     * applied, and all updates must be applied manually.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @return <p>
     *         Applies only when <code>CustomAmiID</code> is used. Specifies
     *         which updates from the Amazon Linux AMI package repositories to
     *         apply automatically when the instance boots using the AMI. If
     *         omitted, the default is <code>SECURITY</code>, which indicates
     *         that only security updates are applied. If <code>NONE</code> is
     *         specified, no updates are applied, and all updates must be
     *         applied manually.
     *         </p>
     * @see RepoUpgradeOnBoot
     */
    public String getRepoUpgradeOnBoot() {
        return repoUpgradeOnBoot;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which
     * updates from the Amazon Linux AMI package repositories to apply
     * automatically when the instance boots using the AMI. If omitted, the
     * default is <code>SECURITY</code>, which indicates that only security
     * updates are applied. If <code>NONE</code> is specified, no updates are
     * applied, and all updates must be applied manually.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @param repoUpgradeOnBoot <p>
     *            Applies only when <code>CustomAmiID</code> is used. Specifies
     *            which updates from the Amazon Linux AMI package repositories
     *            to apply automatically when the instance boots using the AMI.
     *            If omitted, the default is <code>SECURITY</code>, which
     *            indicates that only security updates are applied. If
     *            <code>NONE</code> is specified, no updates are applied, and
     *            all updates must be applied manually.
     *            </p>
     * @see RepoUpgradeOnBoot
     */
    public void setRepoUpgradeOnBoot(String repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which
     * updates from the Amazon Linux AMI package repositories to apply
     * automatically when the instance boots using the AMI. If omitted, the
     * default is <code>SECURITY</code>, which indicates that only security
     * updates are applied. If <code>NONE</code> is specified, no updates are
     * applied, and all updates must be applied manually.
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
     *            which updates from the Amazon Linux AMI package repositories
     *            to apply automatically when the instance boots using the AMI.
     *            If omitted, the default is <code>SECURITY</code>, which
     *            indicates that only security updates are applied. If
     *            <code>NONE</code> is specified, no updates are applied, and
     *            all updates must be applied manually.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RepoUpgradeOnBoot
     */
    public RunJobFlowRequest withRepoUpgradeOnBoot(String repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot;
        return this;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which
     * updates from the Amazon Linux AMI package repositories to apply
     * automatically when the instance boots using the AMI. If omitted, the
     * default is <code>SECURITY</code>, which indicates that only security
     * updates are applied. If <code>NONE</code> is specified, no updates are
     * applied, and all updates must be applied manually.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECURITY, NONE
     *
     * @param repoUpgradeOnBoot <p>
     *            Applies only when <code>CustomAmiID</code> is used. Specifies
     *            which updates from the Amazon Linux AMI package repositories
     *            to apply automatically when the instance boots using the AMI.
     *            If omitted, the default is <code>SECURITY</code>, which
     *            indicates that only security updates are applied. If
     *            <code>NONE</code> is specified, no updates are applied, and
     *            all updates must be applied manually.
     *            </p>
     * @see RepoUpgradeOnBoot
     */
    public void setRepoUpgradeOnBoot(RepoUpgradeOnBoot repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot.toString();
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which
     * updates from the Amazon Linux AMI package repositories to apply
     * automatically when the instance boots using the AMI. If omitted, the
     * default is <code>SECURITY</code>, which indicates that only security
     * updates are applied. If <code>NONE</code> is specified, no updates are
     * applied, and all updates must be applied manually.
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
     *            which updates from the Amazon Linux AMI package repositories
     *            to apply automatically when the instance boots using the AMI.
     *            If omitted, the default is <code>SECURITY</code>, which
     *            indicates that only security updates are applied. If
     *            <code>NONE</code> is specified, no updates are applied, and
     *            all updates must be applied manually.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RepoUpgradeOnBoot
     */
    public RunJobFlowRequest withRepoUpgradeOnBoot(RepoUpgradeOnBoot repoUpgradeOnBoot) {
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
    public RunJobFlowRequest withKerberosAttributes(KerberosAttributes kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
        return this;
    }

    /**
     * <p>
     * Specifies the number of steps that can be executed concurrently. The
     * default value is <code>1</code>. The maximum value is <code>256</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the number of steps that can be executed concurrently.
     *         The default value is <code>1</code>. The maximum value is
     *         <code>256</code>.
     *         </p>
     */
    public Integer getStepConcurrencyLevel() {
        return stepConcurrencyLevel;
    }

    /**
     * <p>
     * Specifies the number of steps that can be executed concurrently. The
     * default value is <code>1</code>. The maximum value is <code>256</code>.
     * </p>
     *
     * @param stepConcurrencyLevel <p>
     *            Specifies the number of steps that can be executed
     *            concurrently. The default value is <code>1</code>. The maximum
     *            value is <code>256</code>.
     *            </p>
     */
    public void setStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
    }

    /**
     * <p>
     * Specifies the number of steps that can be executed concurrently. The
     * default value is <code>1</code>. The maximum value is <code>256</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepConcurrencyLevel <p>
     *            Specifies the number of steps that can be executed
     *            concurrently. The default value is <code>1</code>. The maximum
     *            value is <code>256</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
        return this;
    }

    /**
     * <p>
     * The specified managed scaling policy for an Amazon EMR cluster.
     * </p>
     *
     * @return <p>
     *         The specified managed scaling policy for an Amazon EMR cluster.
     *         </p>
     */
    public ManagedScalingPolicy getManagedScalingPolicy() {
        return managedScalingPolicy;
    }

    /**
     * <p>
     * The specified managed scaling policy for an Amazon EMR cluster.
     * </p>
     *
     * @param managedScalingPolicy <p>
     *            The specified managed scaling policy for an Amazon EMR
     *            cluster.
     *            </p>
     */
    public void setManagedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
        this.managedScalingPolicy = managedScalingPolicy;
    }

    /**
     * <p>
     * The specified managed scaling policy for an Amazon EMR cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedScalingPolicy <p>
     *            The specified managed scaling policy for an Amazon EMR
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunJobFlowRequest withManagedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
        this.managedScalingPolicy = managedScalingPolicy;
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
            sb.append("Name: " + getName() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getAmiVersion() != null)
            sb.append("AmiVersion: " + getAmiVersion() + ",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: " + getReleaseLabel() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getSteps() != null)
            sb.append("Steps: " + getSteps() + ",");
        if (getBootstrapActions() != null)
            sb.append("BootstrapActions: " + getBootstrapActions() + ",");
        if (getSupportedProducts() != null)
            sb.append("SupportedProducts: " + getSupportedProducts() + ",");
        if (getNewSupportedProducts() != null)
            sb.append("NewSupportedProducts: " + getNewSupportedProducts() + ",");
        if (getApplications() != null)
            sb.append("Applications: " + getApplications() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: " + getVisibleToAllUsers() + ",");
        if (getJobFlowRole() != null)
            sb.append("JobFlowRole: " + getJobFlowRole() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
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
        if (getStepConcurrencyLevel() != null)
            sb.append("StepConcurrencyLevel: " + getStepConcurrencyLevel() + ",");
        if (getManagedScalingPolicy() != null)
            sb.append("ManagedScalingPolicy: " + getManagedScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getAmiVersion() == null) ? 0 : getAmiVersion().hashCode());
        hashCode = prime * hashCode
                + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode
                + ((getBootstrapActions() == null) ? 0 : getBootstrapActions().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedProducts() == null) ? 0 : getSupportedProducts().hashCode());
        hashCode = prime * hashCode
                + ((getNewSupportedProducts() == null) ? 0 : getNewSupportedProducts().hashCode());
        hashCode = prime * hashCode
                + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        hashCode = prime * hashCode
                + ((getJobFlowRole() == null) ? 0 : getJobFlowRole().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
        hashCode = prime * hashCode
                + ((getStepConcurrencyLevel() == null) ? 0 : getStepConcurrencyLevel().hashCode());
        hashCode = prime * hashCode
                + ((getManagedScalingPolicy() == null) ? 0 : getManagedScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunJobFlowRequest == false)
            return false;
        RunJobFlowRequest other = (RunJobFlowRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null
                && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getAmiVersion() == null ^ this.getAmiVersion() == null)
            return false;
        if (other.getAmiVersion() != null
                && other.getAmiVersion().equals(this.getAmiVersion()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null
                && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getBootstrapActions() == null ^ this.getBootstrapActions() == null)
            return false;
        if (other.getBootstrapActions() != null
                && other.getBootstrapActions().equals(this.getBootstrapActions()) == false)
            return false;
        if (other.getSupportedProducts() == null ^ this.getSupportedProducts() == null)
            return false;
        if (other.getSupportedProducts() != null
                && other.getSupportedProducts().equals(this.getSupportedProducts()) == false)
            return false;
        if (other.getNewSupportedProducts() == null ^ this.getNewSupportedProducts() == null)
            return false;
        if (other.getNewSupportedProducts() != null
                && other.getNewSupportedProducts().equals(this.getNewSupportedProducts()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null
                && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getVisibleToAllUsers() == null ^ this.getVisibleToAllUsers() == null)
            return false;
        if (other.getVisibleToAllUsers() != null
                && other.getVisibleToAllUsers().equals(this.getVisibleToAllUsers()) == false)
            return false;
        if (other.getJobFlowRole() == null ^ this.getJobFlowRole() == null)
            return false;
        if (other.getJobFlowRole() != null
                && other.getJobFlowRole().equals(this.getJobFlowRole()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getStepConcurrencyLevel() == null ^ this.getStepConcurrencyLevel() == null)
            return false;
        if (other.getStepConcurrencyLevel() != null
                && other.getStepConcurrencyLevel().equals(this.getStepConcurrencyLevel()) == false)
            return false;
        if (other.getManagedScalingPolicy() == null ^ this.getManagedScalingPolicy() == null)
            return false;
        if (other.getManagedScalingPolicy() != null
                && other.getManagedScalingPolicy().equals(this.getManagedScalingPolicy()) == false)
            return false;
        return true;
    }
}
