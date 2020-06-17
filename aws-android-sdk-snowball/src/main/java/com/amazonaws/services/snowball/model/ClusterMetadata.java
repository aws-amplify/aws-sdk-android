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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Contains metadata about a specific cluster.
 * </p>
 */
public class ClusterMetadata implements Serializable {
    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String clusterId;

    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with
     * this cluster. This ARN was created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     */
    private String kmsKeyARN;

    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     */
    private String roleARN;

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     */
    private String clusterState;

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported
     * for clusters is <code>LOCAL_USE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     */
    private String jobType;

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     */
    private String snowballType;

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated
     * <a>S3Resource</a> objects or <a>LambdaResource</a> objects.
     * </p>
     */
    private JobResource resources;

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String addressId;

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't
     * dictate how soon you'll get each Snowball Edge device, rather it
     * represents how quickly each device moves to its destination while in
     * transit. Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowball Edges shipped express are delivered in about a day.
     * In addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowball Edges are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     */
    private String shippingOption;

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * for this cluster.
     * </p>
     */
    private Notification notification;

    /**
     * <p>
     * The ID of the address that you want a cluster shipped to, after it will
     * be shipped to its primary address. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String forwardingAddressId;

    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     */
    private TaxDocuments taxDocuments;

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The automatically generated ID for a cluster.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param clusterId <p>
     *            The automatically generated ID for a cluster.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param clusterId <p>
     *            The automatically generated ID for a cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The optional description of the cluster.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The optional description of the cluster.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The optional description of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with
     * this cluster. This ARN was created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @return <p>
     *         The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated
     *         with this cluster. This ARN was created using the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *         >CreateKey</a> API action in AWS Key Management Service (AWS
     *         KMS).
     *         </p>
     */
    public String getKmsKeyARN() {
        return kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with
     * this cluster. This ARN was created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @param kmsKeyARN <p>
     *            The <code>KmsKeyARN</code> Amazon Resource Name (ARN)
     *            associated with this cluster. This ARN was created using the
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *            >CreateKey</a> API action in AWS Key Management Service (AWS
     *            KMS).
     *            </p>
     */
    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> Amazon Resource Name (ARN) associated with
     * this cluster. This ARN was created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @param kmsKeyARN <p>
     *            The <code>KmsKeyARN</code> Amazon Resource Name (ARN)
     *            associated with this cluster. This ARN was created using the
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *            >CreateKey</a> API action in AWS Key Management Service (AWS
     *            KMS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
        return this;
    }

    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @return <p>
     *         The role ARN associated with this cluster. This ARN was created
     *         using the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *         >CreateRole</a> API action in AWS Identity and Access Management
     *         (IAM).
     *         </p>
     */
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @param roleARN <p>
     *            The role ARN associated with this cluster. This ARN was
     *            created using the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a> API action in AWS Identity and Access
     *            Management (IAM).
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The role ARN associated with this cluster. This ARN was created using the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @param roleARN <p>
     *            The role ARN associated with this cluster. This ARN was
     *            created using the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a> API action in AWS Identity and Access
     *            Management (IAM).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @return <p>
     *         The current status of the cluster.
     *         </p>
     * @see ClusterState
     */
    public String getClusterState() {
        return clusterState;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current status of the cluster.
     *            </p>
     * @see ClusterState
     */
    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current status of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterMetadata withClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current status of the cluster.
     *            </p>
     * @see ClusterState
     */
    public void setClusterState(ClusterState clusterState) {
        this.clusterState = clusterState.toString();
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AwaitingQuorum, Pending, InUse, Complete,
     * Cancelled
     *
     * @param clusterState <p>
     *            The current status of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterMetadata withClusterState(ClusterState clusterState) {
        this.clusterState = clusterState.toString();
        return this;
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported
     * for clusters is <code>LOCAL_USE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @return <p>
     *         The type of job for this cluster. Currently, the only job type
     *         supported for clusters is <code>LOCAL_USE</code>.
     *         </p>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported
     * for clusters is <code>LOCAL_USE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job for this cluster. Currently, the only job type
     *            supported for clusters is <code>LOCAL_USE</code>.
     *            </p>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported
     * for clusters is <code>LOCAL_USE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job for this cluster. Currently, the only job type
     *            supported for clusters is <code>LOCAL_USE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public ClusterMetadata withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported
     * for clusters is <code>LOCAL_USE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job for this cluster. Currently, the only job type
     *            supported for clusters is <code>LOCAL_USE</code>.
     *            </p>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The type of job for this cluster. Currently, the only job type supported
     * for clusters is <code>LOCAL_USE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job for this cluster. Currently, the only job type
     *            supported for clusters is <code>LOCAL_USE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public ClusterMetadata withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @return <p>
     *         The type of AWS Snowball device to use for this cluster.
     *         </p>
     *         <note>
     *         <p>
     *         For cluster jobs, AWS Snowball currently supports only the
     *         <code>EDGE</code> device type.
     *         </p>
     *         </note>
     * @see SnowballType
     */
    public String getSnowballType() {
        return snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     * @see SnowballType
     */
    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public ClusterMetadata withSnowballType(String snowballType) {
        this.snowballType = snowballType;
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     * @see SnowballType
     */
    public void setSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public ClusterMetadata withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     *
     * @return <p>
     *         The creation date for this cluster.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     *
     * @param creationDate <p>
     *            The creation date for this cluster.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The creation date for this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated
     * <a>S3Resource</a> objects or <a>LambdaResource</a> objects.
     * </p>
     *
     * @return <p>
     *         The arrays of <a>JobResource</a> objects that can include updated
     *         <a>S3Resource</a> objects or <a>LambdaResource</a> objects.
     *         </p>
     */
    public JobResource getResources() {
        return resources;
    }

    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated
     * <a>S3Resource</a> objects or <a>LambdaResource</a> objects.
     * </p>
     *
     * @param resources <p>
     *            The arrays of <a>JobResource</a> objects that can include
     *            updated <a>S3Resource</a> objects or <a>LambdaResource</a>
     *            objects.
     *            </p>
     */
    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The arrays of <a>JobResource</a> objects that can include updated
     * <a>S3Resource</a> objects or <a>LambdaResource</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The arrays of <a>JobResource</a> objects that can include
     *            updated <a>S3Resource</a> objects or <a>LambdaResource</a>
     *            objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withResources(JobResource resources) {
        this.resources = resources;
        return this;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The automatically generated ID for a specific address.
     *         </p>
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param addressId <p>
     *            The automatically generated ID for a specific address.
     *            </p>
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param addressId <p>
     *            The automatically generated ID for a specific address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't
     * dictate how soon you'll get each Snowball Edge device, rather it
     * represents how quickly each device moves to its destination while in
     * transit. Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowball Edges shipped express are delivered in about a day.
     * In addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowball Edges are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @return <p>
     *         The shipping speed for each node in this cluster. This speed
     *         doesn't dictate how soon you'll get each Snowball Edge device,
     *         rather it represents how quickly each device moves to its
     *         destination while in transit. Regional shipping speeds are as
     *         follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically,
     *         devices shipped express are delivered in about a day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the European Union (EU), you have access to express shipping.
     *         Typically, Snowball Edges shipped express are delivered in about
     *         a day. In addition, most countries in the EU have access to
     *         standard shipping, which typically takes less than a week, one
     *         way.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In India, Snowball Edges are delivered in one to seven days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the US, you have access to one-day shipping and two-day
     *         shipping.
     *         </p>
     *         </li>
     *         </ul>
     * @see ShippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't
     * dictate how soon you'll get each Snowball Edge device, rather it
     * represents how quickly each device moves to its destination while in
     * transit. Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowball Edges shipped express are delivered in about a day.
     * In addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowball Edges are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for each node in this cluster. This speed
     *            doesn't dictate how soon you'll get each Snowball Edge device,
     *            rather it represents how quickly each device moves to its
     *            destination while in transit. Regional shipping speeds are as
     *            follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            devices shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowball Edges shipped express are
     *            delivered in about a day. In addition, most countries in the
     *            EU have access to standard shipping, which typically takes
     *            less than a week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowball Edges are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the US, you have access to one-day shipping and two-day
     *            shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @see ShippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't
     * dictate how soon you'll get each Snowball Edge device, rather it
     * represents how quickly each device moves to its destination while in
     * transit. Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowball Edges shipped express are delivered in about a day.
     * In addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowball Edges are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for each node in this cluster. This speed
     *            doesn't dictate how soon you'll get each Snowball Edge device,
     *            rather it represents how quickly each device moves to its
     *            destination while in transit. Regional shipping speeds are as
     *            follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            devices shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowball Edges shipped express are
     *            delivered in about a day. In addition, most countries in the
     *            EU have access to standard shipping, which typically takes
     *            less than a week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowball Edges are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the US, you have access to one-day shipping and two-day
     *            shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShippingOption
     */
    public ClusterMetadata withShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
        return this;
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't
     * dictate how soon you'll get each Snowball Edge device, rather it
     * represents how quickly each device moves to its destination while in
     * transit. Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowball Edges shipped express are delivered in about a day.
     * In addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowball Edges are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for each node in this cluster. This speed
     *            doesn't dictate how soon you'll get each Snowball Edge device,
     *            rather it represents how quickly each device moves to its
     *            destination while in transit. Regional shipping speeds are as
     *            follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            devices shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowball Edges shipped express are
     *            delivered in about a day. In addition, most countries in the
     *            EU have access to standard shipping, which typically takes
     *            less than a week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowball Edges are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the US, you have access to one-day shipping and two-day
     *            shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @see ShippingOption
     */
    public void setShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
    }

    /**
     * <p>
     * The shipping speed for each node in this cluster. This speed doesn't
     * dictate how soon you'll get each Snowball Edge device, rather it
     * represents how quickly each device moves to its destination while in
     * transit. Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, devices
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowball Edges shipped express are delivered in about a day.
     * In addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowball Edges are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the US, you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for each node in this cluster. This speed
     *            doesn't dictate how soon you'll get each Snowball Edge device,
     *            rather it represents how quickly each device moves to its
     *            destination while in transit. Regional shipping speeds are as
     *            follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            devices shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowball Edges shipped express are
     *            delivered in about a day. In addition, most countries in the
     *            EU have access to standard shipping, which typically takes
     *            less than a week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowball Edges are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the US, you have access to one-day shipping and two-day
     *            shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShippingOption
     */
    public ClusterMetadata withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * for this cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Notification Service (Amazon SNS) notification
     *         settings for this cluster.
     *         </p>
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * for this cluster.
     * </p>
     *
     * @param notification <p>
     *            The Amazon Simple Notification Service (Amazon SNS)
     *            notification settings for this cluster.
     *            </p>
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * for this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notification <p>
     *            The Amazon Simple Notification Service (Amazon SNS)
     *            notification settings for this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    /**
     * <p>
     * The ID of the address that you want a cluster shipped to, after it will
     * be shipped to its primary address. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The ID of the address that you want a cluster shipped to, after
     *         it will be shipped to its primary address. This field is not
     *         supported in most regions.
     *         </p>
     */
    public String getForwardingAddressId() {
        return forwardingAddressId;
    }

    /**
     * <p>
     * The ID of the address that you want a cluster shipped to, after it will
     * be shipped to its primary address. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param forwardingAddressId <p>
     *            The ID of the address that you want a cluster shipped to,
     *            after it will be shipped to its primary address. This field is
     *            not supported in most regions.
     *            </p>
     */
    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The ID of the address that you want a cluster shipped to, after it will
     * be shipped to its primary address. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param forwardingAddressId <p>
     *            The ID of the address that you want a cluster shipped to,
     *            after it will be shipped to its primary address. This field is
     *            not supported in most regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
        return this;
    }

    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     *
     * @return <p>
     *         The tax documents required in your AWS Region.
     *         </p>
     */
    public TaxDocuments getTaxDocuments() {
        return taxDocuments;
    }

    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     *
     * @param taxDocuments <p>
     *            The tax documents required in your AWS Region.
     *            </p>
     */
    public void setTaxDocuments(TaxDocuments taxDocuments) {
        this.taxDocuments = taxDocuments;
    }

    /**
     * <p>
     * The tax documents required in your AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taxDocuments <p>
     *            The tax documents required in your AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterMetadata withTaxDocuments(TaxDocuments taxDocuments) {
        this.taxDocuments = taxDocuments;
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
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKmsKeyARN() != null)
            sb.append("KmsKeyARN: " + getKmsKeyARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getClusterState() != null)
            sb.append("ClusterState: " + getClusterState() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getSnowballType() != null)
            sb.append("SnowballType: " + getSnowballType() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: " + getShippingOption() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getForwardingAddressId() != null)
            sb.append("ForwardingAddressId: " + getForwardingAddressId() + ",");
        if (getTaxDocuments() != null)
            sb.append("TaxDocuments: " + getTaxDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyARN() == null) ? 0 : getKmsKeyARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getClusterState() == null) ? 0 : getClusterState().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode
                + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode
                + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode
                + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode
                + ((getForwardingAddressId() == null) ? 0 : getForwardingAddressId().hashCode());
        hashCode = prime * hashCode
                + ((getTaxDocuments() == null) ? 0 : getTaxDocuments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterMetadata == false)
            return false;
        ClusterMetadata other = (ClusterMetadata) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyARN() == null ^ this.getKmsKeyARN() == null)
            return false;
        if (other.getKmsKeyARN() != null
                && other.getKmsKeyARN().equals(this.getKmsKeyARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getClusterState() == null ^ this.getClusterState() == null)
            return false;
        if (other.getClusterState() != null
                && other.getClusterState().equals(this.getClusterState()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null
                && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null
                && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null
                && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null
                && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getForwardingAddressId() == null ^ this.getForwardingAddressId() == null)
            return false;
        if (other.getForwardingAddressId() != null
                && other.getForwardingAddressId().equals(this.getForwardingAddressId()) == false)
            return false;
        if (other.getTaxDocuments() == null ^ this.getTaxDocuments() == null)
            return false;
        if (other.getTaxDocuments() != null
                && other.getTaxDocuments().equals(this.getTaxDocuments()) == false)
            return false;
        return true;
    }
}
