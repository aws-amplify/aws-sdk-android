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
 * Creates an Amazon SageMaker notebook instance. A notebook instance is a
 * machine learning (ML) compute instance running on a Jupyter notebook.
 * </p>
 * <p>
 * In a <code>CreateNotebookInstance</code> request, specify the type of ML
 * compute instance that you want to run. Amazon SageMaker launches the
 * instance, installs common libraries that you can use to explore datasets for
 * model training, and attaches an ML storage volume to the notebook instance.
 * </p>
 * <p>
 * Amazon SageMaker also provides a set of example notebooks. Each notebook
 * demonstrates how to use Amazon SageMaker with a specific algorithm or with a
 * machine learning framework.
 * </p>
 * <p>
 * After receiving the request, Amazon SageMaker does the following:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Creates a network interface in the Amazon SageMaker VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * (Option) If you specified <code>SubnetId</code>, Amazon SageMaker creates a
 * network interface in your own VPC, which is inferred from the subnet ID that
 * you provide in the input. When creating this network interface, Amazon
 * SageMaker attaches the security group that you specified in the request to
 * the network interface that it creates in your VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Launches an EC2 instance of the type specified in the request in the Amazon
 * SageMaker VPC. If you specified <code>SubnetId</code> of your VPC, Amazon
 * SageMaker specifies both network interfaces when launching this instance.
 * This enables inbound traffic from your own VPC to the notebook instance,
 * assuming that the security groups allow it.
 * </p>
 * </li>
 * </ol>
 * <p>
 * After creating the notebook instance, Amazon SageMaker returns its Amazon
 * Resource Name (ARN). You can't change the name of a notebook instance after
 * you create it.
 * </p>
 * <p>
 * After Amazon SageMaker creates the notebook instance, you can connect to the
 * Jupyter server and work in Jupyter notebooks. For example, you can write code
 * to explore a dataset that you can use for model training, train a model, host
 * models by creating Amazon SageMaker endpoints, and validate hosted models.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
 * It Works</a>.
 * </p>
 */
public class CreateNotebookInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the new notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceName;

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
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
     * The ID of the subnet in a VPC to which you would like to have a
     * connectivity from your ML compute instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     */
    private String subnetId;

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups
     * must be for the same VPC as specified in the subnet.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * When you send any requests to AWS resources from the notebook instance,
     * Amazon SageMaker assumes this role to perform tasks on your behalf. You
     * must grant this role necessary permissions so Amazon SageMaker can
     * perform these tasks. The policy must allow the Amazon SageMaker service
     * principal (sagemaker.amazonaws.com) permissions to assume this role. For
     * more information, see <a href=
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
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * your notebook instance. The KMS key you provide must be enabled. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html"
     * >Enabling and Disabling Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags
     * later by using the <code>CreateTags</code> API.
     * </p>
     */
    private java.util.List<Tag> tags;

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
     * Sets whether Amazon SageMaker provides internet access to the notebook
     * instance. If you set this to <code>Disabled</code> this notebook instance
     * will be able to access resources only in your VPC, and will not be able
     * to connect to Amazon SageMaker training and endpoint services unless your
     * configure a NAT Gateway in your VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the
     * value of this parameter to <code>Disabled</code> only if you set a value
     * for the <code>SubnetId</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String directInternetAccess;

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this
     * notebook instance. Currently, only one instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;

    /**
     * <p>
     * A Git repository to associate with the notebook instance as its default
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
     * Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is <code>Enabled</code>.
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
     * The name of the new notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the new notebook instance.
     *         </p>
     */
    public String getNotebookInstanceName() {
        return notebookInstanceName;
    }

    /**
     * <p>
     * The name of the new notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceName <p>
     *            The name of the new notebook instance.
     *            </p>
     */
    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the new notebook instance.
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
     *            The name of the new notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
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
     *         The type of ML compute instance to launch for the notebook
     *         instance.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
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
     *            The type of ML compute instance to launch for the notebook
     *            instance.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
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
     *            The type of ML compute instance to launch for the notebook
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public CreateNotebookInstanceRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
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
     *            The type of ML compute instance to launch for the notebook
     *            instance.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
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
     *            The type of ML compute instance to launch for the notebook
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public CreateNotebookInstanceRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in a VPC to which you would like to have a
     * connectivity from your ML compute instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The ID of the subnet in a VPC to which you would like to have a
     *         connectivity from your ML compute instance.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in a VPC to which you would like to have a
     * connectivity from your ML compute instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @param subnetId <p>
     *            The ID of the subnet in a VPC to which you would like to have
     *            a connectivity from your ML compute instance.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in a VPC to which you would like to have a
     * connectivity from your ML compute instance.
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
     *            The ID of the subnet in a VPC to which you would like to have
     *            a connectivity from your ML compute instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups
     * must be for the same VPC as specified in the subnet.
     * </p>
     *
     * @return <p>
     *         The VPC security group IDs, in the form sg-xxxxxxxx. The security
     *         groups must be for the same VPC as specified in the subnet.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups
     * must be for the same VPC as specified in the subnet.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The VPC security group IDs, in the form sg-xxxxxxxx. The
     *            security groups must be for the same VPC as specified in the
     *            subnet.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups
     * must be for the same VPC as specified in the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The VPC security group IDs, in the form sg-xxxxxxxx. The
     *            security groups must be for the same VPC as specified in the
     *            subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups
     * must be for the same VPC as specified in the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The VPC security group IDs, in the form sg-xxxxxxxx. The
     *            security groups must be for the same VPC as specified in the
     *            subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * When you send any requests to AWS resources from the notebook instance,
     * Amazon SageMaker assumes this role to perform tasks on your behalf. You
     * must grant this role necessary permissions so Amazon SageMaker can
     * perform these tasks. The policy must allow the Amazon SageMaker service
     * principal (sagemaker.amazonaws.com) permissions to assume this role. For
     * more information, see <a href=
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
     *         When you send any requests to AWS resources from the notebook
     *         instance, Amazon SageMaker assumes this role to perform tasks on
     *         your behalf. You must grant this role necessary permissions so
     *         Amazon SageMaker can perform these tasks. The policy must allow
     *         the Amazon SageMaker service principal (sagemaker.amazonaws.com)
     *         permissions to assume this role. For more information, see <a
     *         href=
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
     * When you send any requests to AWS resources from the notebook instance,
     * Amazon SageMaker assumes this role to perform tasks on your behalf. You
     * must grant this role necessary permissions so Amazon SageMaker can
     * perform these tasks. The policy must allow the Amazon SageMaker service
     * principal (sagemaker.amazonaws.com) permissions to assume this role. For
     * more information, see <a href=
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
     *            When you send any requests to AWS resources from the notebook
     *            instance, Amazon SageMaker assumes this role to perform tasks
     *            on your behalf. You must grant this role necessary permissions
     *            so Amazon SageMaker can perform these tasks. The policy must
     *            allow the Amazon SageMaker service principal
     *            (sagemaker.amazonaws.com) permissions to assume this role. For
     *            more information, see <a href=
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
     * When you send any requests to AWS resources from the notebook instance,
     * Amazon SageMaker assumes this role to perform tasks on your behalf. You
     * must grant this role necessary permissions so Amazon SageMaker can
     * perform these tasks. The policy must allow the Amazon SageMaker service
     * principal (sagemaker.amazonaws.com) permissions to assume this role. For
     * more information, see <a href=
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
     *            When you send any requests to AWS resources from the notebook
     *            instance, Amazon SageMaker assumes this role to perform tasks
     *            on your behalf. You must grant this role necessary permissions
     *            so Amazon SageMaker can perform these tasks. The policy must
     *            allow the Amazon SageMaker service principal
     *            (sagemaker.amazonaws.com) permissions to assume this role. For
     *            more information, see <a href=
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
    public CreateNotebookInstanceRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * your notebook instance. The KMS key you provide must be enabled. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html"
     * >Enabling and Disabling Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a AWS Key Management Service
     *         key that Amazon SageMaker uses to encrypt data on the storage
     *         volume attached to your notebook instance. The KMS key you
     *         provide must be enabled. For information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html"
     *         >Enabling and Disabling Keys</a> in the <i>AWS Key Management
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * your notebook instance. The KMS key you provide must be enabled. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html"
     * >Enabling and Disabling Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of a AWS Key Management Service
     *            key that Amazon SageMaker uses to encrypt data on the storage
     *            volume attached to your notebook instance. The KMS key you
     *            provide must be enabled. For information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html"
     *            >Enabling and Disabling Keys</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * your notebook instance. The KMS key you provide must be enabled. For
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html"
     * >Enabling and Disabling Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
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
     *            The Amazon Resource Name (ARN) of a AWS Key Management Service
     *            key that Amazon SageMaker uses to encrypt data on the storage
     *            volume attached to your notebook instance. The KMS key you
     *            provide must be enabled. For information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html"
     *            >Enabling and Disabling Keys</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags
     * later by using the <code>CreateTags</code> API.
     * </p>
     *
     * @return <p>
     *         A list of tags to associate with the notebook instance. You can
     *         add tags later by using the <code>CreateTags</code> API.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags
     * later by using the <code>CreateTags</code> API.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to associate with the notebook instance. You
     *            can add tags later by using the <code>CreateTags</code> API.
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
     * A list of tags to associate with the notebook instance. You can add tags
     * later by using the <code>CreateTags</code> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the notebook instance. You
     *            can add tags later by using the <code>CreateTags</code> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withTags(Tag... tags) {
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
     * A list of tags to associate with the notebook instance. You can add tags
     * later by using the <code>CreateTags</code> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the notebook instance. You
     *            can add tags later by using the <code>CreateTags</code> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public CreateNotebookInstanceRequest withLifecycleConfigName(String lifecycleConfigName) {
        this.lifecycleConfigName = lifecycleConfigName;
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook
     * instance. If you set this to <code>Disabled</code> this notebook instance
     * will be able to access resources only in your VPC, and will not be able
     * to connect to Amazon SageMaker training and endpoint services unless your
     * configure a NAT Gateway in your VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the
     * value of this parameter to <code>Disabled</code> only if you set a value
     * for the <code>SubnetId</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Sets whether Amazon SageMaker provides internet access to the
     *         notebook instance. If you set this to <code>Disabled</code> this
     *         notebook instance will be able to access resources only in your
     *         VPC, and will not be able to connect to Amazon SageMaker training
     *         and endpoint services unless your configure a NAT Gateway in your
     *         VPC.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *         >Notebook Instances Are Internet-Enabled by Default</a>. You can
     *         set the value of this parameter to <code>Disabled</code> only if
     *         you set a value for the <code>SubnetId</code> parameter.
     *         </p>
     * @see DirectInternetAccess
     */
    public String getDirectInternetAccess() {
        return directInternetAccess;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook
     * instance. If you set this to <code>Disabled</code> this notebook instance
     * will be able to access resources only in your VPC, and will not be able
     * to connect to Amazon SageMaker training and endpoint services unless your
     * configure a NAT Gateway in your VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the
     * value of this parameter to <code>Disabled</code> only if you set a value
     * for the <code>SubnetId</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Sets whether Amazon SageMaker provides internet access to the
     *            notebook instance. If you set this to <code>Disabled</code>
     *            this notebook instance will be able to access resources only
     *            in your VPC, and will not be able to connect to Amazon
     *            SageMaker training and endpoint services unless your configure
     *            a NAT Gateway in your VPC.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>. You
     *            can set the value of this parameter to <code>Disabled</code>
     *            only if you set a value for the <code>SubnetId</code>
     *            parameter.
     *            </p>
     * @see DirectInternetAccess
     */
    public void setDirectInternetAccess(String directInternetAccess) {
        this.directInternetAccess = directInternetAccess;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook
     * instance. If you set this to <code>Disabled</code> this notebook instance
     * will be able to access resources only in your VPC, and will not be able
     * to connect to Amazon SageMaker training and endpoint services unless your
     * configure a NAT Gateway in your VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the
     * value of this parameter to <code>Disabled</code> only if you set a value
     * for the <code>SubnetId</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Sets whether Amazon SageMaker provides internet access to the
     *            notebook instance. If you set this to <code>Disabled</code>
     *            this notebook instance will be able to access resources only
     *            in your VPC, and will not be able to connect to Amazon
     *            SageMaker training and endpoint services unless your configure
     *            a NAT Gateway in your VPC.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>. You
     *            can set the value of this parameter to <code>Disabled</code>
     *            only if you set a value for the <code>SubnetId</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectInternetAccess
     */
    public CreateNotebookInstanceRequest withDirectInternetAccess(String directInternetAccess) {
        this.directInternetAccess = directInternetAccess;
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook
     * instance. If you set this to <code>Disabled</code> this notebook instance
     * will be able to access resources only in your VPC, and will not be able
     * to connect to Amazon SageMaker training and endpoint services unless your
     * configure a NAT Gateway in your VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the
     * value of this parameter to <code>Disabled</code> only if you set a value
     * for the <code>SubnetId</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Sets whether Amazon SageMaker provides internet access to the
     *            notebook instance. If you set this to <code>Disabled</code>
     *            this notebook instance will be able to access resources only
     *            in your VPC, and will not be able to connect to Amazon
     *            SageMaker training and endpoint services unless your configure
     *            a NAT Gateway in your VPC.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>. You
     *            can set the value of this parameter to <code>Disabled</code>
     *            only if you set a value for the <code>SubnetId</code>
     *            parameter.
     *            </p>
     * @see DirectInternetAccess
     */
    public void setDirectInternetAccess(DirectInternetAccess directInternetAccess) {
        this.directInternetAccess = directInternetAccess.toString();
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook
     * instance. If you set this to <code>Disabled</code> this notebook instance
     * will be able to access resources only in your VPC, and will not be able
     * to connect to Amazon SageMaker training and endpoint services unless your
     * configure a NAT Gateway in your VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the
     * value of this parameter to <code>Disabled</code> only if you set a value
     * for the <code>SubnetId</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param directInternetAccess <p>
     *            Sets whether Amazon SageMaker provides internet access to the
     *            notebook instance. If you set this to <code>Disabled</code>
     *            this notebook instance will be able to access resources only
     *            in your VPC, and will not be able to connect to Amazon
     *            SageMaker training and endpoint services unless your configure
     *            a NAT Gateway in your VPC.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *            >Notebook Instances Are Internet-Enabled by Default</a>. You
     *            can set the value of this parameter to <code>Disabled</code>
     *            only if you set a value for the <code>SubnetId</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectInternetAccess
     */
    public CreateNotebookInstanceRequest withDirectInternetAccess(
            DirectInternetAccess directInternetAccess) {
        this.directInternetAccess = directInternetAccess.toString();
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @return <p>
     *         The size, in GB, of the ML storage volume to attach to the
     *         notebook instance. The default value is 5 GB.
     *         </p>
     */
    public Integer getVolumeSizeInGB() {
        return volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 16384<br/>
     *
     * @param volumeSizeInGB <p>
     *            The size, in GB, of the ML storage volume to attach to the
     *            notebook instance. The default value is 5 GB.
     *            </p>
     */
    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook
     * instance. The default value is 5 GB.
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
     *            notebook instance. The default value is 5 GB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
        return this;
    }

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this
     * notebook instance. Currently, only one instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     *
     * @return <p>
     *         A list of Elastic Inference (EI) instance types to associate with
     *         this notebook instance. Currently, only one instance type can be
     *         associated with a notebook instance. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     *         Elastic Inference in Amazon SageMaker</a>.
     *         </p>
     */
    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this
     * notebook instance. Currently, only one instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     *
     * @param acceleratorTypes <p>
     *            A list of Elastic Inference (EI) instance types to associate
     *            with this notebook instance. Currently, only one instance type
     *            can be associated with a notebook instance. For more
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
     * A list of Elastic Inference (EI) instance types to associate with this
     * notebook instance. Currently, only one instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            A list of Elastic Inference (EI) instance types to associate
     *            with this notebook instance. Currently, only one instance type
     *            can be associated with a notebook instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withAcceleratorTypes(String... acceleratorTypes) {
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
     * A list of Elastic Inference (EI) instance types to associate with this
     * notebook instance. Currently, only one instance type can be associated
     * with a notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            A list of Elastic Inference (EI) instance types to associate
     *            with this notebook instance. Currently, only one instance type
     *            can be associated with a notebook instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceRequest withAcceleratorTypes(
            java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * A Git repository to associate with the notebook instance as its default
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
     *         A Git repository to associate with the notebook instance as its
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
     * A Git repository to associate with the notebook instance as its default
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
     *            A Git repository to associate with the notebook instance as
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
     * A Git repository to associate with the notebook instance as its default
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
     *            A Git repository to associate with the notebook instance as
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
    public CreateNotebookInstanceRequest withDefaultCodeRepository(String defaultCodeRepository) {
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
    public CreateNotebookInstanceRequest withAdditionalCodeRepositories(
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
    public CreateNotebookInstanceRequest withAdditionalCodeRepositories(
            java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is <code>Enabled</code>.
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
     *         notebook instance. The default value is <code>Enabled</code>.
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
     * instance. The default value is <code>Enabled</code>.
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
     *            notebook instance. The default value is <code>Enabled</code>.
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
     * instance. The default value is <code>Enabled</code>.
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
     *            notebook instance. The default value is <code>Enabled</code>.
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
    public CreateNotebookInstanceRequest withRootAccess(String rootAccess) {
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
     *            notebook instance. The default value is <code>Enabled</code>.
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
     * instance. The default value is <code>Enabled</code>.
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
     *            notebook instance. The default value is <code>Enabled</code>.
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
    public CreateNotebookInstanceRequest withRootAccess(RootAccess rootAccess) {
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
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getLifecycleConfigName() != null)
            sb.append("LifecycleConfigName: " + getLifecycleConfigName() + ",");
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
                + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleConfigName() == null) ? 0 : getLifecycleConfigName().hashCode());
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

        if (obj instanceof CreateNotebookInstanceRequest == false)
            return false;
        CreateNotebookInstanceRequest other = (CreateNotebookInstanceRequest) obj;

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
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLifecycleConfigName() == null ^ this.getLifecycleConfigName() == null)
            return false;
        if (other.getLifecycleConfigName() != null
                && other.getLifecycleConfigName().equals(this.getLifecycleConfigName()) == false)
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
