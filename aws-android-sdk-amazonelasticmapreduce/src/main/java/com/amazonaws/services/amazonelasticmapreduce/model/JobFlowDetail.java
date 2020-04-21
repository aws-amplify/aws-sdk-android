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
 * A description of a cluster (job flow).
 * </p>
 */
public class JobFlowDetail implements Serializable {
    /**
     * <p>
     * The job flow identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String jobFlowId;

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
     * The location in Amazon S3 where log files for the job are stored.
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
     * Describes the execution status of the job flow.
     * </p>
     */
    private JobFlowExecutionStatusDetail executionStatusDetail;

    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     */
    private JobFlowInstancesDetail instances;

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     */
    private java.util.List<StepDetail> steps;

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     */
    private java.util.List<BootstrapActionDetail> bootstrapActions;

    /**
     * <p>
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     * </p>
     */
    private java.util.List<String> supportedProducts;

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
     * The IAM role that was specified when the job flow was launched. The EC2
     * instances of the job flow assume this role.
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
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides a way for
     * the automatic scaling feature to get the required permissions it needs to
     * launch and terminate EC2 instances in an instance group.
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
     * The job flow identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The job flow identifier.
     *         </p>
     */
    public String getJobFlowId() {
        return jobFlowId;
    }

    /**
     * <p>
     * The job flow identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowId <p>
     *            The job flow identifier.
     *            </p>
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * The job flow identifier.
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
     * @param jobFlowId <p>
     *            The job flow identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
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
    public JobFlowDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where log files for the job are stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The location in Amazon S3 where log files for the job are stored.
     *         </p>
     */
    public String getLogUri() {
        return logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 where log files for the job are stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param logUri <p>
     *            The location in Amazon S3 where log files for the job are
     *            stored.
     *            </p>
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 where log files for the job are stored.
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
     *            The location in Amazon S3 where log files for the job are
     *            stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withLogUri(String logUri) {
        this.logUri = logUri;
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
    public JobFlowDetail withAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
        return this;
    }

    /**
     * <p>
     * Describes the execution status of the job flow.
     * </p>
     *
     * @return <p>
     *         Describes the execution status of the job flow.
     *         </p>
     */
    public JobFlowExecutionStatusDetail getExecutionStatusDetail() {
        return executionStatusDetail;
    }

    /**
     * <p>
     * Describes the execution status of the job flow.
     * </p>
     *
     * @param executionStatusDetail <p>
     *            Describes the execution status of the job flow.
     *            </p>
     */
    public void setExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }

    /**
     * <p>
     * Describes the execution status of the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionStatusDetail <p>
     *            Describes the execution status of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withExecutionStatusDetail(
            JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
        return this;
    }

    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     *
     * @return <p>
     *         Describes the Amazon EC2 instances of the job flow.
     *         </p>
     */
    public JobFlowInstancesDetail getInstances() {
        return instances;
    }

    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     *
     * @param instances <p>
     *            Describes the Amazon EC2 instances of the job flow.
     *            </p>
     */
    public void setInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
    }

    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            Describes the Amazon EC2 instances of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
        return this;
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     *
     * @return <p>
     *         A list of steps run by the job flow.
     *         </p>
     */
    public java.util.List<StepDetail> getSteps() {
        return steps;
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     *
     * @param steps <p>
     *            A list of steps run by the job flow.
     *            </p>
     */
    public void setSteps(java.util.Collection<StepDetail> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<StepDetail>(steps);
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            A list of steps run by the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withSteps(StepDetail... steps) {
        if (getSteps() == null) {
            this.steps = new java.util.ArrayList<StepDetail>(steps.length);
        }
        for (StepDetail value : steps) {
            this.steps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            A list of steps run by the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withSteps(java.util.Collection<StepDetail> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     *
     * @return <p>
     *         A list of the bootstrap actions run by the job flow.
     *         </p>
     */
    public java.util.List<BootstrapActionDetail> getBootstrapActions() {
        return bootstrapActions;
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     *
     * @param bootstrapActions <p>
     *            A list of the bootstrap actions run by the job flow.
     *            </p>
     */
    public void setBootstrapActions(java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }

        this.bootstrapActions = new java.util.ArrayList<BootstrapActionDetail>(bootstrapActions);
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bootstrapActions <p>
     *            A list of the bootstrap actions run by the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withBootstrapActions(BootstrapActionDetail... bootstrapActions) {
        if (getBootstrapActions() == null) {
            this.bootstrapActions = new java.util.ArrayList<BootstrapActionDetail>(
                    bootstrapActions.length);
        }
        for (BootstrapActionDetail value : bootstrapActions) {
            this.bootstrapActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bootstrapActions <p>
     *            A list of the bootstrap actions run by the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withBootstrapActions(
            java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        setBootstrapActions(bootstrapActions);
        return this;
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     * </p>
     *
     * @return <p>
     *         A list of strings set by third party software when the job flow
     *         is launched. If you are not using third party software to manage
     *         the job flow this value is empty.
     *         </p>
     */
    public java.util.List<String> getSupportedProducts() {
        return supportedProducts;
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     * </p>
     *
     * @param supportedProducts <p>
     *            A list of strings set by third party software when the job
     *            flow is launched. If you are not using third party software to
     *            manage the job flow this value is empty.
     *            </p>
     */
    public void setSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
            return;
        }

        this.supportedProducts = new java.util.ArrayList<String>(supportedProducts);
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedProducts <p>
     *            A list of strings set by third party software when the job
     *            flow is launched. If you are not using third party software to
     *            manage the job flow this value is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withSupportedProducts(String... supportedProducts) {
        if (getSupportedProducts() == null) {
            this.supportedProducts = new java.util.ArrayList<String>(supportedProducts.length);
        }
        for (String value : supportedProducts) {
            this.supportedProducts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedProducts <p>
     *            A list of strings set by third party software when the job
     *            flow is launched. If you are not using third party software to
     *            manage the job flow this value is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withSupportedProducts(java.util.Collection<String> supportedProducts) {
        setSupportedProducts(supportedProducts);
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
    public JobFlowDetail withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2
     * instances of the job flow assume this role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The IAM role that was specified when the job flow was launched.
     *         The EC2 instances of the job flow assume this role.
     *         </p>
     */
    public String getJobFlowRole() {
        return jobFlowRole;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2
     * instances of the job flow assume this role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowRole <p>
     *            The IAM role that was specified when the job flow was
     *            launched. The EC2 instances of the job flow assume this role.
     *            </p>
     */
    public void setJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2
     * instances of the job flow assume this role.
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
     *            The IAM role that was specified when the job flow was
     *            launched. The EC2 instances of the job flow assume this role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withJobFlowRole(String jobFlowRole) {
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
    public JobFlowDetail withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides a way for
     * the automatic scaling feature to get the required permissions it needs to
     * launch and terminate EC2 instances in an instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         An IAM role for automatic scaling policies. The default role is
     *         <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides a
     *         way for the automatic scaling feature to get the required
     *         permissions it needs to launch and terminate EC2 instances in an
     *         instance group.
     *         </p>
     */
    public String getAutoScalingRole() {
        return autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides a way for
     * the automatic scaling feature to get the required permissions it needs to
     * launch and terminate EC2 instances in an instance group.
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
     *            provides a way for the automatic scaling feature to get the
     *            required permissions it needs to launch and terminate EC2
     *            instances in an instance group.
     *            </p>
     */
    public void setAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is
     * <code>EMR_AutoScaling_DefaultRole</code>. The IAM role provides a way for
     * the automatic scaling feature to get the required permissions it needs to
     * launch and terminate EC2 instances in an instance group.
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
     *            provides a way for the automatic scaling feature to get the
     *            required permissions it needs to launch and terminate EC2
     *            instances in an instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowDetail withAutoScalingRole(String autoScalingRole) {
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
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleDownBehavior
     */
    public JobFlowDetail withScaleDownBehavior(String scaleDownBehavior) {
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
     *            <code>TERMINATE_AT_TASK_COMPLETION</code> available only in
     *            Amazon EMR version 4.1.0 and later, and is the default for
     *            versions of Amazon EMR earlier than 5.1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleDownBehavior
     */
    public JobFlowDetail withScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior.toString();
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: " + getJobFlowId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getAmiVersion() != null)
            sb.append("AmiVersion: " + getAmiVersion() + ",");
        if (getExecutionStatusDetail() != null)
            sb.append("ExecutionStatusDetail: " + getExecutionStatusDetail() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getSteps() != null)
            sb.append("Steps: " + getSteps() + ",");
        if (getBootstrapActions() != null)
            sb.append("BootstrapActions: " + getBootstrapActions() + ",");
        if (getSupportedProducts() != null)
            sb.append("SupportedProducts: " + getSupportedProducts() + ",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: " + getVisibleToAllUsers() + ",");
        if (getJobFlowRole() != null)
            sb.append("JobFlowRole: " + getJobFlowRole() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getAutoScalingRole() != null)
            sb.append("AutoScalingRole: " + getAutoScalingRole() + ",");
        if (getScaleDownBehavior() != null)
            sb.append("ScaleDownBehavior: " + getScaleDownBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getAmiVersion() == null) ? 0 : getAmiVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getExecutionStatusDetail() == null) ? 0 : getExecutionStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode
                + ((getBootstrapActions() == null) ? 0 : getBootstrapActions().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedProducts() == null) ? 0 : getSupportedProducts().hashCode());
        hashCode = prime * hashCode
                + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        hashCode = prime * hashCode
                + ((getJobFlowRole() == null) ? 0 : getJobFlowRole().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingRole() == null) ? 0 : getAutoScalingRole().hashCode());
        hashCode = prime * hashCode
                + ((getScaleDownBehavior() == null) ? 0 : getScaleDownBehavior().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobFlowDetail == false)
            return false;
        JobFlowDetail other = (JobFlowDetail) obj;

        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null
                && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getAmiVersion() == null ^ this.getAmiVersion() == null)
            return false;
        if (other.getAmiVersion() != null
                && other.getAmiVersion().equals(this.getAmiVersion()) == false)
            return false;
        if (other.getExecutionStatusDetail() == null ^ this.getExecutionStatusDetail() == null)
            return false;
        if (other.getExecutionStatusDetail() != null
                && other.getExecutionStatusDetail().equals(this.getExecutionStatusDetail()) == false)
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
        return true;
    }
}
