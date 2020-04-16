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

/**
 * <p>
 * Provides summary information for an Amazon SageMaker notebook instance.
 * </p>
 */
public class NotebookInstanceSummary implements Serializable {
    /**
     * <p>
     * The name of the notebook instance that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceName;

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
     * The URL that you use to connect to the Jupyter instance running in your
     * notebook instance.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
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
     * A timestamp that shows when the notebook instance was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of a notebook instance lifecycle configuration associated with
     * this notebook instance.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceLifecycleConfigName;

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
     * The name of the notebook instance that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the notebook instance that you want a summary for.
     *         </p>
     */
    public String getNotebookInstanceName() {
        return notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceName <p>
     *            The name of the notebook instance that you want a summary for.
     *            </p>
     */
    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance that you want a summary for.
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
     *            The name of the notebook instance that you want a summary for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotebookInstanceSummary withNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
        return this;
    }

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
    public NotebookInstanceSummary withNotebookInstanceArn(String notebookInstanceArn) {
        this.notebookInstanceArn = notebookInstanceArn;
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
    public NotebookInstanceSummary withNotebookInstanceStatus(String notebookInstanceStatus) {
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
    public NotebookInstanceSummary withNotebookInstanceStatus(
            NotebookInstanceStatus notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter instance running in your
     * notebook instance.
     * </p>
     *
     * @return <p>
     *         The URL that you use to connect to the Jupyter instance running
     *         in your notebook instance.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter instance running in your
     * notebook instance.
     * </p>
     *
     * @param url <p>
     *            The URL that you use to connect to the Jupyter instance
     *            running in your notebook instance.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter instance running in your
     * notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL that you use to connect to the Jupyter instance
     *            running in your notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotebookInstanceSummary withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
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
     *         The type of ML compute instance that the notebook instance is
     *         running on.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
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
     *            The type of ML compute instance that the notebook instance is
     *            running on.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
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
     *            The type of ML compute instance that the notebook instance is
     *            running on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public NotebookInstanceSummary withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
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
     *            The type of ML compute instance that the notebook instance is
     *            running on.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The type of ML compute instance that the notebook instance is running on.
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
     *            The type of ML compute instance that the notebook instance is
     *            running on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public NotebookInstanceSummary withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the notebook instance was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the notebook instance was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the notebook instance was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotebookInstanceSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the notebook instance was last
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            A timestamp that shows when the notebook instance was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the notebook instance was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            A timestamp that shows when the notebook instance was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotebookInstanceSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The name of a notebook instance lifecycle configuration associated with
     * this notebook instance.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of a notebook instance lifecycle configuration
     *         associated with this notebook instance.
     *         </p>
     *         <p>
     *         For information about notebook instance lifestyle configurations,
     *         see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *         >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     *         </p>
     */
    public String getNotebookInstanceLifecycleConfigName() {
        return notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of a notebook instance lifecycle configuration associated with
     * this notebook instance.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceLifecycleConfigName <p>
     *            The name of a notebook instance lifecycle configuration
     *            associated with this notebook instance.
     *            </p>
     *            <p>
     *            For information about notebook instance lifestyle
     *            configurations, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *            >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     *            </p>
     */
    public void setNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of a notebook instance lifecycle configuration associated with
     * this notebook instance.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
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
     * @param notebookInstanceLifecycleConfigName <p>
     *            The name of a notebook instance lifecycle configuration
     *            associated with this notebook instance.
     *            </p>
     *            <p>
     *            For information about notebook instance lifestyle
     *            configurations, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     *            >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotebookInstanceSummary withNotebookInstanceLifecycleConfigName(
            String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
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
    public NotebookInstanceSummary withDefaultCodeRepository(String defaultCodeRepository) {
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
    public NotebookInstanceSummary withAdditionalCodeRepositories(
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
    public NotebookInstanceSummary withAdditionalCodeRepositories(
            java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
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
        if (getNotebookInstanceArn() != null)
            sb.append("NotebookInstanceArn: " + getNotebookInstanceArn() + ",");
        if (getNotebookInstanceStatus() != null)
            sb.append("NotebookInstanceStatus: " + getNotebookInstanceStatus() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getNotebookInstanceLifecycleConfigName() != null)
            sb.append("NotebookInstanceLifecycleConfigName: "
                    + getNotebookInstanceLifecycleConfigName() + ",");
        if (getDefaultCodeRepository() != null)
            sb.append("DefaultCodeRepository: " + getDefaultCodeRepository() + ",");
        if (getAdditionalCodeRepositories() != null)
            sb.append("AdditionalCodeRepositories: " + getAdditionalCodeRepositories());
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
                + ((getNotebookInstanceArn() == null) ? 0 : getNotebookInstanceArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotebookInstanceStatus() == null) ? 0 : getNotebookInstanceStatus()
                        .hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotebookInstanceLifecycleConfigName() == null) ? 0
                        : getNotebookInstanceLifecycleConfigName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCodeRepository() == null) ? 0 : getDefaultCodeRepository().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalCodeRepositories() == null) ? 0 : getAdditionalCodeRepositories()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotebookInstanceSummary == false)
            return false;
        NotebookInstanceSummary other = (NotebookInstanceSummary) obj;

        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null
                && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getNotebookInstanceArn() == null ^ this.getNotebookInstanceArn() == null)
            return false;
        if (other.getNotebookInstanceArn() != null
                && other.getNotebookInstanceArn().equals(this.getNotebookInstanceArn()) == false)
            return false;
        if (other.getNotebookInstanceStatus() == null ^ this.getNotebookInstanceStatus() == null)
            return false;
        if (other.getNotebookInstanceStatus() != null
                && other.getNotebookInstanceStatus().equals(this.getNotebookInstanceStatus()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() == null
                ^ this.getNotebookInstanceLifecycleConfigName() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() != null
                && other.getNotebookInstanceLifecycleConfigName().equals(
                        this.getNotebookInstanceLifecycleConfigName()) == false)
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
        return true;
    }
}
