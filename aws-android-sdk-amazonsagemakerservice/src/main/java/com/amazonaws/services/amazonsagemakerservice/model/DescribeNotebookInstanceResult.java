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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class DescribeNotebookInstanceResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String notebookInstanceArn;

    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceName;

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     */
    private String notebookInstanceStatus;

    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running
     * in your notebook instance.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.t3.medium, ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge,
     * ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge, ml.m4.10xlarge,
     * ml.m4.16xlarge, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge,
     * ml.c5.9xlarge, ml.c5.18xlarge, ml.c5d.xlarge, ml.c5d.2xlarge,
     * ml.c5d.4xlarge, ml.c5d.9xlarge, ml.c5d.18xlarge, ml.p2.xlarge,
     * ml.p2.8xlarge, ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge,
     * ml.p3.16xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     */
    private String subnetId;

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it
     * on the ML storage volume attached to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of
     * creating the instance.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook
     * instance was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook
     * instance was created
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceLifecycleConfigName;

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the
     * notebook instance. If this value is set to <i>Disabled</i>, the notebook
     * instance does not have internet access, and cannot connect to Amazon
     * SageMaker training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String directInternetAccess;

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this
     * notebook instance. Currently only one EI instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;

    /**
     * <p>
     * The Git repository associated with the notebook instance as its default
     * code repository. This can be either the name of a Git repository stored
     * as a resource in your account, or the URL of a Git repository in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. When you open a
     * notebook instance, it opens in the directory that contains this
     * repository. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String defaultCodeRepository;

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook
     * instance. These can be either the names of Git repositories stored as
     * resources in your account, or the URL of Git repositories in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. These repositories
     * are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     */
    private java.util.List<String> additionalCodeRepositories;

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook
     * instance. Because of this, lifecycle configurations associated with a
     * notebook instance always run with root access even if you disable root
     * access for users.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String rootAccess;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the notebook instance.
     *         </p>
     */
    public String getNotebookInstanceArn() {
        return notebookInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param notebookInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the notebook instance.
     *            </p>
     */
    public void setNotebookInstanceArn(String notebookInstanceArn) {
        this.notebookInstanceArn = notebookInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param notebookInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withNotebookInstanceArn(String notebookInstanceArn) {
        this.notebookInstanceArn = notebookInstanceArn;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the Amazon SageMaker notebook instance.
     *         </p>
     */
    public String getNotebookInstanceName() {
        return notebookInstanceName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceName <p>
     *            The name of the Amazon SageMaker notebook instance.
     *            </p>
     */
    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceName <p>
     *            The name of the Amazon SageMaker notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
        return this;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @return <p>
     *         The status of the notebook instance.
     *         </p>
     * @see NotebookInstanceStatus
     */
    public String getNotebookInstanceStatus() {
        return notebookInstanceStatus;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param notebookInstanceStatus <p>
     *            The status of the notebook instance.
     *            </p>
     * @see NotebookInstanceStatus
     */
    public void setNotebookInstanceStatus(String notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param notebookInstanceStatus <p>
     *            The status of the notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceStatus
     */
    public DescribeNotebookInstanceResult withNotebookInstanceStatus(String notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus;
        return this;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param notebookInstanceStatus <p>
     *            The status of the notebook instance.
     *            </p>
     * @see NotebookInstanceStatus
     */
    public void setNotebookInstanceStatus(NotebookInstanceStatus notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus.toString();
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param notebookInstanceStatus <p>
     *            The status of the notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceStatus
     */
    public DescribeNotebookInstanceResult withNotebookInstanceStatus(
            NotebookInstanceStatus notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus.toString();
        return this;
    }

    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If status is <code>Failed</code>, the reason it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If status is <code>Failed</code>, the reason it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If status is <code>Failed</code>, the reason it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running
     * in your notebook instance.
     * </p>
     *
     * @return <p>
     *         The URL that you use to connect to the Jupyter notebook that is
     *         running in your notebook instance.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running
     * in your notebook instance.
     * </p>
     *
     * @param url <p>
     *            The URL that you use to connect to the Jupyter notebook that
     *            is running in your notebook instance.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running
     * in your notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL that you use to connect to the Jupyter notebook that
     *            is running in your notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.t3.medium, ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge,
     * ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge, ml.m4.10xlarge,
     * ml.m4.16xlarge, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge,
     * ml.c5.9xlarge, ml.c5.18xlarge, ml.c5d.xlarge, ml.c5d.2xlarge,
     * ml.c5d.4xlarge, ml.c5d.9xlarge, ml.c5d.18xlarge, ml.p2.xlarge,
     * ml.p2.8xlarge, ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge,
     * ml.p3.16xlarge
     *
     * @return <p>
     *         The type of ML compute instance running on the notebook instance.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.t3.medium, ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge,
     * ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge, ml.m4.10xlarge,
     * ml.m4.16xlarge, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge,
     * ml.c5.9xlarge, ml.c5.18xlarge, ml.c5d.xlarge, ml.c5d.2xlarge,
     * ml.c5d.4xlarge, ml.c5d.9xlarge, ml.c5d.18xlarge, ml.p2.xlarge,
     * ml.p2.8xlarge, ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge,
     * ml.p3.16xlarge
     *
     * @param instanceType <p>
     *            The type of ML compute instance running on the notebook
     *            instance.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.t3.medium, ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge,
     * ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge, ml.m4.10xlarge,
     * ml.m4.16xlarge, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge,
     * ml.c5.9xlarge, ml.c5.18xlarge, ml.c5d.xlarge, ml.c5d.2xlarge,
     * ml.c5d.4xlarge, ml.c5d.9xlarge, ml.c5d.18xlarge, ml.p2.xlarge,
     * ml.p2.8xlarge, ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge,
     * ml.p3.16xlarge
     *
     * @param instanceType <p>
     *            The type of ML compute instance running on the notebook
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public DescribeNotebookInstanceResult withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.t3.medium, ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge,
     * ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge, ml.m4.10xlarge,
     * ml.m4.16xlarge, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge,
     * ml.c5.9xlarge, ml.c5.18xlarge, ml.c5d.xlarge, ml.c5d.2xlarge,
     * ml.c5d.4xlarge, ml.c5d.9xlarge, ml.c5d.18xlarge, ml.p2.xlarge,
     * ml.p2.8xlarge, ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge,
     * ml.p3.16xlarge
     *
     * @param instanceType <p>
     *            The type of ML compute instance running on the notebook
     *            instance.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.t3.medium, ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge,
     * ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge, ml.m4.10xlarge,
     * ml.m4.16xlarge, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge,
     * ml.c5.9xlarge, ml.c5.18xlarge, ml.c5d.xlarge, ml.c5d.2xlarge,
     * ml.c5d.4xlarge, ml.c5d.9xlarge, ml.c5d.18xlarge, ml.p2.xlarge,
     * ml.p2.8xlarge, ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge,
     * ml.p3.16xlarge
     *
     * @param instanceType <p>
     *            The type of ML compute instance running on the notebook
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public DescribeNotebookInstanceResult withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The ID of the VPC subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @param subnetId <p>
     *            The ID of the VPC subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @param subnetId <p>
     *            The ID of the VPC subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     *
     * @return <p>
     *         The IDs of the VPC security groups.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     *
     * @param securityGroups <p>
     *            The IDs of the VPC security groups.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the VPC security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The IDs of the VPC security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withSecurityGroups(
            java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role associated with
     *         the instance.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role associated with
     *            the instance.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role associated with
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it
     * on the ML storage volume attached to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS KMS key ID Amazon SageMaker uses to encrypt data when
     *         storing it on the ML storage volume attached to the instance.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it
     * on the ML storage volume attached to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID Amazon SageMaker uses to encrypt data when
     *            storing it on the ML storage volume attached to the instance.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it
     * on the ML storage volume attached to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID Amazon SageMaker uses to encrypt data when
     *            storing it on the ML storage volume attached to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of
     * creating the instance.
     * </p>
     *
     * @return <p>
     *         The network interface IDs that Amazon SageMaker created at the
     *         time of creating the instance.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of
     * creating the instance.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The network interface IDs that Amazon SageMaker created at the
     *            time of creating the instance.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of
     * creating the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The network interface IDs that Amazon SageMaker created at the
     *            time of creating the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook
     * instance was last modified.
     * </p>
     *
     * @return <p>
     *         A timestamp. Use this parameter to retrieve the time when the
     *         notebook instance was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook
     * instance was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            A timestamp. Use this parameter to retrieve the time when the
     *            notebook instance was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook
     * instance was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            A timestamp. Use this parameter to retrieve the time when the
     *            notebook instance was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook
     * instance was created
     * </p>
     *
     * @return <p>
     *         A timestamp. Use this parameter to return the time when the
     *         notebook instance was created
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook
     * instance was created
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp. Use this parameter to return the time when the
     *            notebook instance was created
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook
     * instance was created
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp. Use this parameter to return the time when the
     *            notebook instance was created
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         Returns the name of a notebook instance lifecycle configuration.
     *         </p>
     *         <p>
     *         For information about notebook instance lifestyle configurations,
     *         see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *         >Step 2.1: (Optional) Customize a Notebook Instance</a>
     *         </p>
     */
    public String getNotebookInstanceLifecycleConfigName() {
        return notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceLifecycleConfigName <p>
     *            Returns the name of a notebook instance lifecycle
     *            configuration.
     *            </p>
     *            <p>
     *            For information about notebook instance lifestyle
     *            configurations, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *            >Step 2.1: (Optional) Customize a Notebook Instance</a>
     *            </p>
     */
    public void setNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceLifecycleConfigName <p>
     *            Returns the name of a notebook instance lifecycle
     *            configuration.
     *            </p>
     *            <p>
     *            For information about notebook instance lifestyle
     *            configurations, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *            >Step 2.1: (Optional) Customize a Notebook Instance</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withNotebookInstanceLifecycleConfigName(
            String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the
     * notebook instance. If this value is set to <i>Disabled</i>, the notebook
     * instance does not have internet access, and cannot connect to Amazon
     * SageMaker training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Describes whether Amazon SageMaker provides internet access to
     *         the notebook instance. If this value is set to <i>Disabled</i>,
     *         the notebook instance does not have internet access, and cannot
     *         connect to Amazon SageMaker training and endpoint services.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *         >Notebook Instances Are Internet-Enabled by Default</a>.
     *         </p>
     * @see DirectInternetAccess
     */
    public String getDirectInternetAccess() {
        return directInternetAccess;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the
     * notebook instance. If this value is set to <i>Disabled</i>, the notebook
     * instance does not have internet access, and cannot connect to Amazon
     * SageMaker training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Describes whether Amazon SageMaker provides internet access to
     *            the notebook instance. If this value is set to
     *            <i>Disabled</i>, the notebook instance does not have internet
     *            access, and cannot connect to Amazon SageMaker training and
     *            endpoint services.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>.
     *            </p>
     * @see DirectInternetAccess
     */
    public void setDirectInternetAccess(String directInternetAccess) {
        this.directInternetAccess = directInternetAccess;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the
     * notebook instance. If this value is set to <i>Disabled</i>, the notebook
     * instance does not have internet access, and cannot connect to Amazon
     * SageMaker training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Describes whether Amazon SageMaker provides internet access to
     *            the notebook instance. If this value is set to
     *            <i>Disabled</i>, the notebook instance does not have internet
     *            access, and cannot connect to Amazon SageMaker training and
     *            endpoint services.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectInternetAccess
     */
    public DescribeNotebookInstanceResult withDirectInternetAccess(String directInternetAccess) {
        this.directInternetAccess = directInternetAccess;
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the
     * notebook instance. If this value is set to <i>Disabled</i>, the notebook
     * instance does not have internet access, and cannot connect to Amazon
     * SageMaker training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Describes whether Amazon SageMaker provides internet access to
     *            the notebook instance. If this value is set to
     *            <i>Disabled</i>, the notebook instance does not have internet
     *            access, and cannot connect to Amazon SageMaker training and
     *            endpoint services.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>.
     *            </p>
     * @see DirectInternetAccess
     */
    public void setDirectInternetAccess(DirectInternetAccess directInternetAccess) {
        this.directInternetAccess = directInternetAccess.toString();
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the
     * notebook instance. If this value is set to <i>Disabled</i>, the notebook
     * instance does not have internet access, and cannot connect to Amazon
     * SageMaker training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Describes whether Amazon SageMaker provides internet access to
     *            the notebook instance. If this value is set to
     *            <i>Disabled</i>, the notebook instance does not have internet
     *            access, and cannot connect to Amazon SageMaker training and
     *            endpoint services.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectInternetAccess
     */
    public DescribeNotebookInstanceResult withDirectInternetAccess(
            DirectInternetAccess directInternetAccess) {
        this.directInternetAccess = directInternetAccess.toString();
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @return <p>
     *         The size, in GB, of the ML storage volume attached to the
     *         notebook instance.
     *         </p>
     */
    public Integer getVolumeSizeInGB() {
        return volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @param volumeSizeInGB <p>
     *            The size, in GB, of the ML storage volume attached to the
     *            notebook instance.
     *            </p>
     */
    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @param volumeSizeInGB <p>
     *            The size, in GB, of the ML storage volume attached to the
     *            notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this
     * notebook instance. Currently only one EI instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     *
     * @return <p>
     *         A list of the Elastic Inference (EI) instance types associated
     *         with this notebook instance. Currently only one EI instance type
     *         can be associated with a notebook instance. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *         >Using Elastic Inference in Amazon SageMaker</a>.
     *         </p>
     */
    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this
     * notebook instance. Currently only one EI instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     *
     * @param acceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types associated
     *            with this notebook instance. Currently only one EI instance
     *            type can be associated with a notebook instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     */
    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this
     * notebook instance. Currently only one EI instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types associated
     *            with this notebook instance. Currently only one EI instance
     *            type can be associated with a notebook instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withAcceleratorTypes(String... acceleratorTypes) {
        if (getAcceleratorTypes() == null) {
            this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes.length);
        }
        for (String value : acceleratorTypes) {
            this.acceleratorTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this
     * notebook instance. Currently only one EI instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types associated
     *            with this notebook instance. Currently only one EI instance
     *            type can be associated with a notebook instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withAcceleratorTypes(
            java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * The Git repository associated with the notebook instance as its default
     * code repository. This can be either the name of a Git repository stored
     * as a resource in your account, or the URL of a Git repository in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. When you open a
     * notebook instance, it opens in the directory that contains this
     * repository. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Git repository associated with the notebook instance as its
     *         default code repository. This can be either the name of a Git
     *         repository stored as a resource in your account, or the URL of a
     *         Git repository in <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     *         >AWS CodeCommit</a> or in any other Git repository. When you open
     *         a notebook instance, it opens in the directory that contains this
     *         repository. For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     *         >Associating Git Repositories with Amazon SageMaker Notebook
     *         Instances</a>.
     *         </p>
     */
    public String getDefaultCodeRepository() {
        return defaultCodeRepository;
    }

    /**
     * <p>
     * The Git repository associated with the notebook instance as its default
     * code repository. This can be either the name of a Git repository stored
     * as a resource in your account, or the URL of a Git repository in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. When you open a
     * notebook instance, it opens in the directory that contains this
     * repository. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param defaultCodeRepository <p>
     *            The Git repository associated with the notebook instance as
     *            its default code repository. This can be either the name of a
     *            Git repository stored as a resource in your account, or the
     *            URL of a Git repository in <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     *            >AWS CodeCommit</a> or in any other Git repository. When you
     *            open a notebook instance, it opens in the directory that
     *            contains this repository. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     *            >Associating Git Repositories with Amazon SageMaker Notebook
     *            Instances</a>.
     *            </p>
     */
    public void setDefaultCodeRepository(String defaultCodeRepository) {
        this.defaultCodeRepository = defaultCodeRepository;
    }

    /**
     * <p>
     * The Git repository associated with the notebook instance as its default
     * code repository. This can be either the name of a Git repository stored
     * as a resource in your account, or the URL of a Git repository in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. When you open a
     * notebook instance, it opens in the directory that contains this
     * repository. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param defaultCodeRepository <p>
     *            The Git repository associated with the notebook instance as
     *            its default code repository. This can be either the name of a
     *            Git repository stored as a resource in your account, or the
     *            URL of a Git repository in <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     *            >AWS CodeCommit</a> or in any other Git repository. When you
     *            open a notebook instance, it opens in the directory that
     *            contains this repository. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     *            >Associating Git Repositories with Amazon SageMaker Notebook
     *            Instances</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withDefaultCodeRepository(String defaultCodeRepository) {
        this.defaultCodeRepository = defaultCodeRepository;
        return this;
    }

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook
     * instance. These can be either the names of Git repositories stored as
     * resources in your account, or the URL of Git repositories in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. These repositories
     * are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     *
     * @return <p>
     *         An array of up to three Git repositories associated with the
     *         notebook instance. These can be either the names of Git
     *         repositories stored as resources in your account, or the URL of
     *         Git repositories in <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     *         >AWS CodeCommit</a> or in any other Git repository. These
     *         repositories are cloned at the same level as the default
     *         repository of your notebook instance. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     *         >Associating Git Repositories with Amazon SageMaker Notebook
     *         Instances</a>.
     *         </p>
     */
    public java.util.List<String> getAdditionalCodeRepositories() {
        return additionalCodeRepositories;
    }

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook
     * instance. These can be either the names of Git repositories stored as
     * resources in your account, or the URL of Git repositories in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. These repositories
     * are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     *
     * @param additionalCodeRepositories <p>
     *            An array of up to three Git repositories associated with the
     *            notebook instance. These can be either the names of Git
     *            repositories stored as resources in your account, or the URL
     *            of Git repositories in <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     *            >AWS CodeCommit</a> or in any other Git repository. These
     *            repositories are cloned at the same level as the default
     *            repository of your notebook instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     *            >Associating Git Repositories with Amazon SageMaker Notebook
     *            Instances</a>.
     *            </p>
     */
    public void setAdditionalCodeRepositories(
            java.util.Collection<String> additionalCodeRepositories) {
        if (additionalCodeRepositories == null) {
            this.additionalCodeRepositories = null;
            return;
        }

        this.additionalCodeRepositories = new java.util.ArrayList<String>(
                additionalCodeRepositories);
    }

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook
     * instance. These can be either the names of Git repositories stored as
     * resources in your account, or the URL of Git repositories in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. These repositories
     * are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalCodeRepositories <p>
     *            An array of up to three Git repositories associated with the
     *            notebook instance. These can be either the names of Git
     *            repositories stored as resources in your account, or the URL
     *            of Git repositories in <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     *            >AWS CodeCommit</a> or in any other Git repository. These
     *            repositories are cloned at the same level as the default
     *            repository of your notebook instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     *            >Associating Git Repositories with Amazon SageMaker Notebook
     *            Instances</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withAdditionalCodeRepositories(
            String... additionalCodeRepositories) {
        if (getAdditionalCodeRepositories() == null) {
            this.additionalCodeRepositories = new java.util.ArrayList<String>(
                    additionalCodeRepositories.length);
        }
        for (String value : additionalCodeRepositories) {
            this.additionalCodeRepositories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook
     * instance. These can be either the names of Git repositories stored as
     * resources in your account, or the URL of Git repositories in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository. These repositories
     * are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     * >Associating Git Repositories with Amazon SageMaker Notebook
     * Instances</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalCodeRepositories <p>
     *            An array of up to three Git repositories associated with the
     *            notebook instance. These can be either the names of Git
     *            repositories stored as resources in your account, or the URL
     *            of Git repositories in <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     *            >AWS CodeCommit</a> or in any other Git repository. These
     *            repositories are cloned at the same level as the default
     *            repository of your notebook instance. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html"
     *            >Associating Git Repositories with Amazon SageMaker Notebook
     *            Instances</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceResult withAdditionalCodeRepositories(
            java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook
     * instance. Because of this, lifecycle configurations associated with a
     * notebook instance always run with root access even if you disable root
     * access for users.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Whether root access is enabled or disabled for users of the
     *         notebook instance.
     *         </p>
     *         <note>
     *         <p>
     *         Lifecycle configurations need root access to be able to set up a
     *         notebook instance. Because of this, lifecycle configurations
     *         associated with a notebook instance always run with root access
     *         even if you disable root access for users.
     *         </p>
     *         </note>
     * @see RootAccess
     */
    public String getRootAccess() {
        return rootAccess;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook
     * instance. Because of this, lifecycle configurations associated with a
     * notebook instance always run with root access even if you disable root
     * access for users.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param rootAccess <p>
     *            Whether root access is enabled or disabled for users of the
     *            notebook instance.
     *            </p>
     *            <note>
     *            <p>
     *            Lifecycle configurations need root access to be able to set up
     *            a notebook instance. Because of this, lifecycle configurations
     *            associated with a notebook instance always run with root
     *            access even if you disable root access for users.
     *            </p>
     *            </note>
     * @see RootAccess
     */
    public void setRootAccess(String rootAccess) {
        this.rootAccess = rootAccess;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook
     * instance. Because of this, lifecycle configurations associated with a
     * notebook instance always run with root access even if you disable root
     * access for users.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param rootAccess <p>
     *            Whether root access is enabled or disabled for users of the
     *            notebook instance.
     *            </p>
     *            <note>
     *            <p>
     *            Lifecycle configurations need root access to be able to set up
     *            a notebook instance. Because of this, lifecycle configurations
     *            associated with a notebook instance always run with root
     *            access even if you disable root access for users.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RootAccess
     */
    public DescribeNotebookInstanceResult withRootAccess(String rootAccess) {
        this.rootAccess = rootAccess;
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook
     * instance. Because of this, lifecycle configurations associated with a
     * notebook instance always run with root access even if you disable root
     * access for users.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param rootAccess <p>
     *            Whether root access is enabled or disabled for users of the
     *            notebook instance.
     *            </p>
     *            <note>
     *            <p>
     *            Lifecycle configurations need root access to be able to set up
     *            a notebook instance. Because of this, lifecycle configurations
     *            associated with a notebook instance always run with root
     *            access even if you disable root access for users.
     *            </p>
     *            </note>
     * @see RootAccess
     */
    public void setRootAccess(RootAccess rootAccess) {
        this.rootAccess = rootAccess.toString();
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook
     * instance. Because of this, lifecycle configurations associated with a
     * notebook instance always run with root access even if you disable root
     * access for users.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param rootAccess <p>
     *            Whether root access is enabled or disabled for users of the
     *            notebook instance.
     *            </p>
     *            <note>
     *            <p>
     *            Lifecycle configurations need root access to be able to set up
     *            a notebook instance. Because of this, lifecycle configurations
     *            associated with a notebook instance always run with root
     *            access even if you disable root access for users.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RootAccess
     */
    public DescribeNotebookInstanceResult withRootAccess(RootAccess rootAccess) {
        this.rootAccess = rootAccess.toString();
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
        if (getNotebookInstanceArn() != null)
            sb.append("NotebookInstanceArn: " + getNotebookInstanceArn() + ",");
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: " + getNotebookInstanceName() + ",");
        if (getNotebookInstanceStatus() != null)
            sb.append("NotebookInstanceStatus: " + getNotebookInstanceStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getNotebookInstanceLifecycleConfigName() != null)
            sb.append("NotebookInstanceLifecycleConfigName: "
                    + getNotebookInstanceLifecycleConfigName() + ",");
        if (getDirectInternetAccess() != null)
            sb.append("DirectInternetAccess: " + getDirectInternetAccess() + ",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: " + getVolumeSizeInGB() + ",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: " + getAcceleratorTypes() + ",");
        if (getDefaultCodeRepository() != null)
            sb.append("DefaultCodeRepository: " + getDefaultCodeRepository() + ",");
        if (getAdditionalCodeRepositories() != null)
            sb.append("AdditionalCodeRepositories: " + getAdditionalCodeRepositories() + ",");
        if (getRootAccess() != null)
            sb.append("RootAccess: " + getRootAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNotebookInstanceArn() == null) ? 0 : getNotebookInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotebookInstanceStatus() == null) ? 0 : getNotebookInstanceStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotebookInstanceLifecycleConfigName() == null) ? 0
                        : getNotebookInstanceLifecycleConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getDirectInternetAccess() == null) ? 0 : getDirectInternetAccess().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode
                + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCodeRepository() == null) ? 0 : getDefaultCodeRepository().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalCodeRepositories() == null) ? 0 : getAdditionalCodeRepositories()
                        .hashCode());
        hashCode = prime * hashCode + ((getRootAccess() == null) ? 0 : getRootAccess().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNotebookInstanceResult == false)
            return false;
        DescribeNotebookInstanceResult other = (DescribeNotebookInstanceResult) obj;

        if (other.getNotebookInstanceArn() == null ^ this.getNotebookInstanceArn() == null)
            return false;
        if (other.getNotebookInstanceArn() != null
                && other.getNotebookInstanceArn().equals(this.getNotebookInstanceArn()) == false)
            return false;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null
                && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getNotebookInstanceStatus() == null ^ this.getNotebookInstanceStatus() == null)
            return false;
        if (other.getNotebookInstanceStatus() != null
                && other.getNotebookInstanceStatus().equals(this.getNotebookInstanceStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() == null
                ^ this.getNotebookInstanceLifecycleConfigName() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() != null
                && other.getNotebookInstanceLifecycleConfigName().equals(
                        this.getNotebookInstanceLifecycleConfigName()) == false)
            return false;
        if (other.getDirectInternetAccess() == null ^ this.getDirectInternetAccess() == null)
            return false;
        if (other.getDirectInternetAccess() != null
                && other.getDirectInternetAccess().equals(this.getDirectInternetAccess()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null
                && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null
                && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getDefaultCodeRepository() == null ^ this.getDefaultCodeRepository() == null)
            return false;
        if (other.getDefaultCodeRepository() != null
                && other.getDefaultCodeRepository().equals(this.getDefaultCodeRepository()) == false)
            return false;
        if (other.getAdditionalCodeRepositories() == null
                ^ this.getAdditionalCodeRepositories() == null)
            return false;
        if (other.getAdditionalCodeRepositories() != null
                && other.getAdditionalCodeRepositories().equals(
                        this.getAdditionalCodeRepositories()) == false)
            return false;
        if (other.getRootAccess() == null ^ this.getRootAccess() == null)
            return false;
        if (other.getRootAccess() != null
                && other.getRootAccess().equals(this.getRootAccess()) == false)
            return false;
        return true;
    }
}
