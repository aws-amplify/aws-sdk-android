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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a notebook instance. NotebookInstance updates include upgrading or
 * downgrading the ML compute instance used for your notebook instance to
 * accommodate changes in your workload requirements.
 * </p>
 */
public class UpdateNotebookInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceName;

    /**
     * <p>
     * The Amazon ML compute instance type.
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
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access the notebook instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook
     * instance. For information about lifestyle configurations, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String lifecycleConfigName;

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle
     * configuration currently associated with the notebook instance. This
     * operation is idempotent. If you specify a lifecycle configuration that is
     * not associated with the notebook instance when you call this method, it
     * does not throw an error.
     * </p>
     */
    private Boolean disassociateLifecycleConfig;

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB. ML storage volumes are encrypted, so
     * Amazon SageMaker can't determine the amount of available free space on
     * the volume. Because of this, you can increase the volume size when you
     * update a notebook instance, but you can't decrease the volume size. If
     * you want to decrease the size of the ML storage volume in use, create a
     * new notebook instance with the desired size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * The Git repository to associate with the notebook instance as its default
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
     * An array of up to three Git repositories to associate with the notebook
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
     * A list of the Elastic Inference (EI) instance types to associate with
     * this notebook instance. Currently only one EI instance type can be
     * associated with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this
     * notebook instance. This operation is idempotent. If you specify an
     * accelerator type that is not associated with the notebook instance when
     * you call this method, it does not throw an error.
     * </p>
     */
    private Boolean disassociateAcceleratorTypes;

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this
     * notebook instance. This operation is idempotent. If you specify a Git
     * repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     */
    private Boolean disassociateDefaultCodeRepository;

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from
     * this notebook instance. This operation is idempotent. If you specify a
     * Git repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     */
    private Boolean disassociateAdditionalCodeRepositories;

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on
     * the notebook instance, but lifecycle configuration scripts still run with
     * root permissions.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String rootAccess;

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the notebook instance to update.
     *         </p>
     */
    public String getNotebookInstanceName() {
        return notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceName <p>
     *            The name of the notebook instance to update.
     *            </p>
     */
    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance to update.
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
     *            The name of the notebook instance to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
        return this;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
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
     *         The Amazon ML compute instance type.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
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
     *            The Amazon ML compute instance type.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
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
     *            The Amazon ML compute instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public UpdateNotebookInstanceRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
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
     *            The Amazon ML compute instance type.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
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
     *            The Amazon ML compute instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public UpdateNotebookInstanceRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access the notebook instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that Amazon
     *         SageMaker can assume to access the notebook instance. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *         >Amazon SageMaker Roles</a>.
     *         </p>
     *         <note>
     *         <p>
     *         To be able to pass this role to Amazon SageMaker, the caller of
     *         this API must have the <code>iam:PassRole</code> permission.
     *         </p>
     *         </note>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access the notebook instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that Amazon
     *            SageMaker can assume to access the notebook instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *            >Amazon SageMaker Roles</a>.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to pass this role to Amazon SageMaker, the caller
     *            of this API must have the <code>iam:PassRole</code>
     *            permission.
     *            </p>
     *            </note>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access the notebook instance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
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
     *            The Amazon Resource Name (ARN) of the IAM role that Amazon
     *            SageMaker can assume to access the notebook instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *            >Amazon SageMaker Roles</a>.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to pass this role to Amazon SageMaker, the caller
     *            of this API must have the <code>iam:PassRole</code>
     *            permission.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook
     * instance. For information about lifestyle configurations, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of a lifecycle configuration to associate with the
     *         notebook instance. For information about lifestyle
     *         configurations, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *         >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     *         </p>
     */
    public String getLifecycleConfigName() {
        return lifecycleConfigName;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook
     * instance. For information about lifestyle configurations, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param lifecycleConfigName <p>
     *            The name of a lifecycle configuration to associate with the
     *            notebook instance. For information about lifestyle
     *            configurations, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *            >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     *            </p>
     */
    public void setLifecycleConfigName(String lifecycleConfigName) {
        this.lifecycleConfigName = lifecycleConfigName;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook
     * instance. For information about lifestyle configurations, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param lifecycleConfigName <p>
     *            The name of a lifecycle configuration to associate with the
     *            notebook instance. For information about lifestyle
     *            configurations, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *            >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withLifecycleConfigName(String lifecycleConfigName) {
        this.lifecycleConfigName = lifecycleConfigName;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle
     * configuration currently associated with the notebook instance. This
     * operation is idempotent. If you specify a lifecycle configuration that is
     * not associated with the notebook instance when you call this method, it
     * does not throw an error.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to remove the notebook instance
     *         lifecycle configuration currently associated with the notebook
     *         instance. This operation is idempotent. If you specify a
     *         lifecycle configuration that is not associated with the notebook
     *         instance when you call this method, it does not throw an error.
     *         </p>
     */
    public Boolean isDisassociateLifecycleConfig() {
        return disassociateLifecycleConfig;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle
     * configuration currently associated with the notebook instance. This
     * operation is idempotent. If you specify a lifecycle configuration that is
     * not associated with the notebook instance when you call this method, it
     * does not throw an error.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to remove the notebook instance
     *         lifecycle configuration currently associated with the notebook
     *         instance. This operation is idempotent. If you specify a
     *         lifecycle configuration that is not associated with the notebook
     *         instance when you call this method, it does not throw an error.
     *         </p>
     */
    public Boolean getDisassociateLifecycleConfig() {
        return disassociateLifecycleConfig;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle
     * configuration currently associated with the notebook instance. This
     * operation is idempotent. If you specify a lifecycle configuration that is
     * not associated with the notebook instance when you call this method, it
     * does not throw an error.
     * </p>
     *
     * @param disassociateLifecycleConfig <p>
     *            Set to <code>true</code> to remove the notebook instance
     *            lifecycle configuration currently associated with the notebook
     *            instance. This operation is idempotent. If you specify a
     *            lifecycle configuration that is not associated with the
     *            notebook instance when you call this method, it does not throw
     *            an error.
     *            </p>
     */
    public void setDisassociateLifecycleConfig(Boolean disassociateLifecycleConfig) {
        this.disassociateLifecycleConfig = disassociateLifecycleConfig;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle
     * configuration currently associated with the notebook instance. This
     * operation is idempotent. If you specify a lifecycle configuration that is
     * not associated with the notebook instance when you call this method, it
     * does not throw an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociateLifecycleConfig <p>
     *            Set to <code>true</code> to remove the notebook instance
     *            lifecycle configuration currently associated with the notebook
     *            instance. This operation is idempotent. If you specify a
     *            lifecycle configuration that is not associated with the
     *            notebook instance when you call this method, it does not throw
     *            an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withDisassociateLifecycleConfig(
            Boolean disassociateLifecycleConfig) {
        this.disassociateLifecycleConfig = disassociateLifecycleConfig;
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB. ML storage volumes are encrypted, so
     * Amazon SageMaker can't determine the amount of available free space on
     * the volume. Because of this, you can increase the volume size when you
     * update a notebook instance, but you can't decrease the volume size. If
     * you want to decrease the size of the ML storage volume in use, create a
     * new notebook instance with the desired size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @return <p>
     *         The size, in GB, of the ML storage volume to attach to the
     *         notebook instance. The default value is 5 GB. ML storage volumes
     *         are encrypted, so Amazon SageMaker can't determine the amount of
     *         available free space on the volume. Because of this, you can
     *         increase the volume size when you update a notebook instance, but
     *         you can't decrease the volume size. If you want to decrease the
     *         size of the ML storage volume in use, create a new notebook
     *         instance with the desired size.
     *         </p>
     */
    public Integer getVolumeSizeInGB() {
        return volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB. ML storage volumes are encrypted, so
     * Amazon SageMaker can't determine the amount of available free space on
     * the volume. Because of this, you can increase the volume size when you
     * update a notebook instance, but you can't decrease the volume size. If
     * you want to decrease the size of the ML storage volume in use, create a
     * new notebook instance with the desired size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @param volumeSizeInGB <p>
     *            The size, in GB, of the ML storage volume to attach to the
     *            notebook instance. The default value is 5 GB. ML storage
     *            volumes are encrypted, so Amazon SageMaker can't determine the
     *            amount of available free space on the volume. Because of this,
     *            you can increase the volume size when you update a notebook
     *            instance, but you can't decrease the volume size. If you want
     *            to decrease the size of the ML storage volume in use, create a
     *            new notebook instance with the desired size.
     *            </p>
     */
    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB. ML storage volumes are encrypted, so
     * Amazon SageMaker can't determine the amount of available free space on
     * the volume. Because of this, you can increase the volume size when you
     * update a notebook instance, but you can't decrease the volume size. If
     * you want to decrease the size of the ML storage volume in use, create a
     * new notebook instance with the desired size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @param volumeSizeInGB <p>
     *            The size, in GB, of the ML storage volume to attach to the
     *            notebook instance. The default value is 5 GB. ML storage
     *            volumes are encrypted, so Amazon SageMaker can't determine the
     *            amount of available free space on the volume. Because of this,
     *            you can increase the volume size when you update a notebook
     *            instance, but you can't decrease the volume size. If you want
     *            to decrease the size of the ML storage volume in use, create a
     *            new notebook instance with the desired size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
        return this;
    }

    /**
     * <p>
     * The Git repository to associate with the notebook instance as its default
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
     *         The Git repository to associate with the notebook instance as its
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
     * The Git repository to associate with the notebook instance as its default
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
     *            The Git repository to associate with the notebook instance as
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
     * The Git repository to associate with the notebook instance as its default
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
     *            The Git repository to associate with the notebook instance as
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
    public UpdateNotebookInstanceRequest withDefaultCodeRepository(String defaultCodeRepository) {
        this.defaultCodeRepository = defaultCodeRepository;
        return this;
    }

    /**
     * <p>
     * An array of up to three Git repositories to associate with the notebook
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
     *         An array of up to three Git repositories to associate with the
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
     * An array of up to three Git repositories to associate with the notebook
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
     *            An array of up to three Git repositories to associate with the
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
     * An array of up to three Git repositories to associate with the notebook
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
     *            An array of up to three Git repositories to associate with the
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
    public UpdateNotebookInstanceRequest withAdditionalCodeRepositories(
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
     * An array of up to three Git repositories to associate with the notebook
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
     *            An array of up to three Git repositories to associate with the
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
    public UpdateNotebookInstanceRequest withAdditionalCodeRepositories(
            java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to associate with
     * this notebook instance. Currently only one EI instance type can be
     * associated with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     *
     * @return <p>
     *         A list of the Elastic Inference (EI) instance types to associate
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
     * A list of the Elastic Inference (EI) instance types to associate with
     * this notebook instance. Currently only one EI instance type can be
     * associated with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     *
     * @param acceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types to
     *            associate with this notebook instance. Currently only one EI
     *            instance type can be associated with a notebook instance. For
     *            more information, see <a href=
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
     * A list of the Elastic Inference (EI) instance types to associate with
     * this notebook instance. Currently only one EI instance type can be
     * associated with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types to
     *            associate with this notebook instance. Currently only one EI
     *            instance type can be associated with a notebook instance. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withAcceleratorTypes(String... acceleratorTypes) {
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
     * A list of the Elastic Inference (EI) instance types to associate with
     * this notebook instance. Currently only one EI instance type can be
     * associated with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types to
     *            associate with this notebook instance. Currently only one EI
     *            instance type can be associated with a notebook instance. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withAcceleratorTypes(
            java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this
     * notebook instance. This operation is idempotent. If you specify an
     * accelerator type that is not associated with the notebook instance when
     * you call this method, it does not throw an error.
     * </p>
     *
     * @return <p>
     *         A list of the Elastic Inference (EI) instance types to remove
     *         from this notebook instance. This operation is idempotent. If you
     *         specify an accelerator type that is not associated with the
     *         notebook instance when you call this method, it does not throw an
     *         error.
     *         </p>
     */
    public Boolean isDisassociateAcceleratorTypes() {
        return disassociateAcceleratorTypes;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this
     * notebook instance. This operation is idempotent. If you specify an
     * accelerator type that is not associated with the notebook instance when
     * you call this method, it does not throw an error.
     * </p>
     *
     * @return <p>
     *         A list of the Elastic Inference (EI) instance types to remove
     *         from this notebook instance. This operation is idempotent. If you
     *         specify an accelerator type that is not associated with the
     *         notebook instance when you call this method, it does not throw an
     *         error.
     *         </p>
     */
    public Boolean getDisassociateAcceleratorTypes() {
        return disassociateAcceleratorTypes;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this
     * notebook instance. This operation is idempotent. If you specify an
     * accelerator type that is not associated with the notebook instance when
     * you call this method, it does not throw an error.
     * </p>
     *
     * @param disassociateAcceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types to remove
     *            from this notebook instance. This operation is idempotent. If
     *            you specify an accelerator type that is not associated with
     *            the notebook instance when you call this method, it does not
     *            throw an error.
     *            </p>
     */
    public void setDisassociateAcceleratorTypes(Boolean disassociateAcceleratorTypes) {
        this.disassociateAcceleratorTypes = disassociateAcceleratorTypes;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this
     * notebook instance. This operation is idempotent. If you specify an
     * accelerator type that is not associated with the notebook instance when
     * you call this method, it does not throw an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociateAcceleratorTypes <p>
     *            A list of the Elastic Inference (EI) instance types to remove
     *            from this notebook instance. This operation is idempotent. If
     *            you specify an accelerator type that is not associated with
     *            the notebook instance when you call this method, it does not
     *            throw an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withDisassociateAcceleratorTypes(
            Boolean disassociateAcceleratorTypes) {
        this.disassociateAcceleratorTypes = disassociateAcceleratorTypes;
        return this;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this
     * notebook instance. This operation is idempotent. If you specify a Git
     * repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     *
     * @return <p>
     *         The name or URL of the default Git repository to remove from this
     *         notebook instance. This operation is idempotent. If you specify a
     *         Git repository that is not associated with the notebook instance
     *         when you call this method, it does not throw an error.
     *         </p>
     */
    public Boolean isDisassociateDefaultCodeRepository() {
        return disassociateDefaultCodeRepository;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this
     * notebook instance. This operation is idempotent. If you specify a Git
     * repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     *
     * @return <p>
     *         The name or URL of the default Git repository to remove from this
     *         notebook instance. This operation is idempotent. If you specify a
     *         Git repository that is not associated with the notebook instance
     *         when you call this method, it does not throw an error.
     *         </p>
     */
    public Boolean getDisassociateDefaultCodeRepository() {
        return disassociateDefaultCodeRepository;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this
     * notebook instance. This operation is idempotent. If you specify a Git
     * repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     *
     * @param disassociateDefaultCodeRepository <p>
     *            The name or URL of the default Git repository to remove from
     *            this notebook instance. This operation is idempotent. If you
     *            specify a Git repository that is not associated with the
     *            notebook instance when you call this method, it does not throw
     *            an error.
     *            </p>
     */
    public void setDisassociateDefaultCodeRepository(Boolean disassociateDefaultCodeRepository) {
        this.disassociateDefaultCodeRepository = disassociateDefaultCodeRepository;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this
     * notebook instance. This operation is idempotent. If you specify a Git
     * repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociateDefaultCodeRepository <p>
     *            The name or URL of the default Git repository to remove from
     *            this notebook instance. This operation is idempotent. If you
     *            specify a Git repository that is not associated with the
     *            notebook instance when you call this method, it does not throw
     *            an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withDisassociateDefaultCodeRepository(
            Boolean disassociateDefaultCodeRepository) {
        this.disassociateDefaultCodeRepository = disassociateDefaultCodeRepository;
        return this;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from
     * this notebook instance. This operation is idempotent. If you specify a
     * Git repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     *
     * @return <p>
     *         A list of names or URLs of the default Git repositories to remove
     *         from this notebook instance. This operation is idempotent. If you
     *         specify a Git repository that is not associated with the notebook
     *         instance when you call this method, it does not throw an error.
     *         </p>
     */
    public Boolean isDisassociateAdditionalCodeRepositories() {
        return disassociateAdditionalCodeRepositories;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from
     * this notebook instance. This operation is idempotent. If you specify a
     * Git repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     *
     * @return <p>
     *         A list of names or URLs of the default Git repositories to remove
     *         from this notebook instance. This operation is idempotent. If you
     *         specify a Git repository that is not associated with the notebook
     *         instance when you call this method, it does not throw an error.
     *         </p>
     */
    public Boolean getDisassociateAdditionalCodeRepositories() {
        return disassociateAdditionalCodeRepositories;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from
     * this notebook instance. This operation is idempotent. If you specify a
     * Git repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     *
     * @param disassociateAdditionalCodeRepositories <p>
     *            A list of names or URLs of the default Git repositories to
     *            remove from this notebook instance. This operation is
     *            idempotent. If you specify a Git repository that is not
     *            associated with the notebook instance when you call this
     *            method, it does not throw an error.
     *            </p>
     */
    public void setDisassociateAdditionalCodeRepositories(
            Boolean disassociateAdditionalCodeRepositories) {
        this.disassociateAdditionalCodeRepositories = disassociateAdditionalCodeRepositories;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from
     * this notebook instance. This operation is idempotent. If you specify a
     * Git repository that is not associated with the notebook instance when you
     * call this method, it does not throw an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociateAdditionalCodeRepositories <p>
     *            A list of names or URLs of the default Git repositories to
     *            remove from this notebook instance. This operation is
     *            idempotent. If you specify a Git repository that is not
     *            associated with the notebook instance when you call this
     *            method, it does not throw an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNotebookInstanceRequest withDisassociateAdditionalCodeRepositories(
            Boolean disassociateAdditionalCodeRepositories) {
        this.disassociateAdditionalCodeRepositories = disassociateAdditionalCodeRepositories;
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on
     * the notebook instance, but lifecycle configuration scripts still run with
     * root permissions.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Whether root access is enabled or disabled for users of the
     *         notebook instance. The default value is <code>Enabled</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If you set this to <code>Disabled</code>, users don't have root
     *         access on the notebook instance, but lifecycle configuration
     *         scripts still run with root permissions.
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
     * instance. The default value is <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on
     * the notebook instance, but lifecycle configuration scripts still run with
     * root permissions.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param rootAccess <p>
     *            Whether root access is enabled or disabled for users of the
     *            notebook instance. The default value is <code>Enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you set this to <code>Disabled</code>, users don't have
     *            root access on the notebook instance, but lifecycle
     *            configuration scripts still run with root permissions.
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
     * instance. The default value is <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on
     * the notebook instance, but lifecycle configuration scripts still run with
     * root permissions.
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
     *            notebook instance. The default value is <code>Enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you set this to <code>Disabled</code>, users don't have
     *            root access on the notebook instance, but lifecycle
     *            configuration scripts still run with root permissions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RootAccess
     */
    public UpdateNotebookInstanceRequest withRootAccess(String rootAccess) {
        this.rootAccess = rootAccess;
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on
     * the notebook instance, but lifecycle configuration scripts still run with
     * root permissions.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param rootAccess <p>
     *            Whether root access is enabled or disabled for users of the
     *            notebook instance. The default value is <code>Enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you set this to <code>Disabled</code>, users don't have
     *            root access on the notebook instance, but lifecycle
     *            configuration scripts still run with root permissions.
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
     * instance. The default value is <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on
     * the notebook instance, but lifecycle configuration scripts still run with
     * root permissions.
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
     *            notebook instance. The default value is <code>Enabled</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you set this to <code>Disabled</code>, users don't have
     *            root access on the notebook instance, but lifecycle
     *            configuration scripts still run with root permissions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RootAccess
     */
    public UpdateNotebookInstanceRequest withRootAccess(RootAccess rootAccess) {
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
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: " + getNotebookInstanceName() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getLifecycleConfigName() != null)
            sb.append("LifecycleConfigName: " + getLifecycleConfigName() + ",");
        if (getDisassociateLifecycleConfig() != null)
            sb.append("DisassociateLifecycleConfig: " + getDisassociateLifecycleConfig() + ",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: " + getVolumeSizeInGB() + ",");
        if (getDefaultCodeRepository() != null)
            sb.append("DefaultCodeRepository: " + getDefaultCodeRepository() + ",");
        if (getAdditionalCodeRepositories() != null)
            sb.append("AdditionalCodeRepositories: " + getAdditionalCodeRepositories() + ",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: " + getAcceleratorTypes() + ",");
        if (getDisassociateAcceleratorTypes() != null)
            sb.append("DisassociateAcceleratorTypes: " + getDisassociateAcceleratorTypes() + ",");
        if (getDisassociateDefaultCodeRepository() != null)
            sb.append("DisassociateDefaultCodeRepository: "
                    + getDisassociateDefaultCodeRepository() + ",");
        if (getDisassociateAdditionalCodeRepositories() != null)
            sb.append("DisassociateAdditionalCodeRepositories: "
                    + getDisassociateAdditionalCodeRepositories() + ",");
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
                + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleConfigName() == null) ? 0 : getLifecycleConfigName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisassociateLifecycleConfig() == null) ? 0
                        : getDisassociateLifecycleConfig().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCodeRepository() == null) ? 0 : getDefaultCodeRepository().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalCodeRepositories() == null) ? 0 : getAdditionalCodeRepositories()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisassociateAcceleratorTypes() == null) ? 0
                        : getDisassociateAcceleratorTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisassociateDefaultCodeRepository() == null) ? 0
                        : getDisassociateDefaultCodeRepository().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisassociateAdditionalCodeRepositories() == null) ? 0
                        : getDisassociateAdditionalCodeRepositories().hashCode());
        hashCode = prime * hashCode + ((getRootAccess() == null) ? 0 : getRootAccess().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotebookInstanceRequest == false)
            return false;
        UpdateNotebookInstanceRequest other = (UpdateNotebookInstanceRequest) obj;

        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null
                && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLifecycleConfigName() == null ^ this.getLifecycleConfigName() == null)
            return false;
        if (other.getLifecycleConfigName() != null
                && other.getLifecycleConfigName().equals(this.getLifecycleConfigName()) == false)
            return false;
        if (other.getDisassociateLifecycleConfig() == null
                ^ this.getDisassociateLifecycleConfig() == null)
            return false;
        if (other.getDisassociateLifecycleConfig() != null
                && other.getDisassociateLifecycleConfig().equals(
                        this.getDisassociateLifecycleConfig()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null
                && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
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
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null
                && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getDisassociateAcceleratorTypes() == null
                ^ this.getDisassociateAcceleratorTypes() == null)
            return false;
        if (other.getDisassociateAcceleratorTypes() != null
                && other.getDisassociateAcceleratorTypes().equals(
                        this.getDisassociateAcceleratorTypes()) == false)
            return false;
        if (other.getDisassociateDefaultCodeRepository() == null
                ^ this.getDisassociateDefaultCodeRepository() == null)
            return false;
        if (other.getDisassociateDefaultCodeRepository() != null
                && other.getDisassociateDefaultCodeRepository().equals(
                        this.getDisassociateDefaultCodeRepository()) == false)
            return false;
        if (other.getDisassociateAdditionalCodeRepositories() == null
                ^ this.getDisassociateAdditionalCodeRepositories() == null)
            return false;
        if (other.getDisassociateAdditionalCodeRepositories() != null
                && other.getDisassociateAdditionalCodeRepositories().equals(
                        this.getDisassociateAdditionalCodeRepositories()) == false)
            return false;
        if (other.getRootAccess() == null ^ this.getRootAccess() == null)
            return false;
        if (other.getRootAccess() != null
                && other.getRootAccess().equals(this.getRootAccess()) == false)
            return false;
        return true;
    }
}
