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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an empty cluster. Each cluster supports five nodes. You use the
 * <a>CreateJob</a> action separately to create the jobs for each of these
 * nodes. The cluster does not ship until these five node jobs have been
 * created.
 * </p>
 */
public class CreateClusterRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The resources associated with the cluster job. These resources include
     * Amazon S3 buckets and optional AWS Lambda functions written in the Python
     * language.
     * </p>
     */
    private JobResource resources;

    /**
     * <p>
     * An optional description of this specific cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
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
     * The <code>KmsKeyARN</code> value that you want to associate with this
     * cluster. <code>KmsKeyARN</code> values are created by using the <a href=
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
     * The <code>RoleARN</code> that you want to associate with this cluster.
     * <code>RoleArn</code> values are created by using the <a href=
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
     * The type of AWS Snowball device to use for this cluster. Currently, the
     * only supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S
     */
    private String snowballType;

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
     * The forwarding address ID for a cluster. This field is not supported in
     * most regions.
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
    public CreateClusterRequest withJobType(String jobType) {
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
    public CreateClusterRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The resources associated with the cluster job. These resources include
     * Amazon S3 buckets and optional AWS Lambda functions written in the Python
     * language.
     * </p>
     *
     * @return <p>
     *         The resources associated with the cluster job. These resources
     *         include Amazon S3 buckets and optional AWS Lambda functions
     *         written in the Python language.
     *         </p>
     */
    public JobResource getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources associated with the cluster job. These resources include
     * Amazon S3 buckets and optional AWS Lambda functions written in the Python
     * language.
     * </p>
     *
     * @param resources <p>
     *            The resources associated with the cluster job. These resources
     *            include Amazon S3 buckets and optional AWS Lambda functions
     *            written in the Python language.
     *            </p>
     */
    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The resources associated with the cluster job. These resources include
     * Amazon S3 buckets and optional AWS Lambda functions written in the Python
     * language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The resources associated with the cluster job. These resources
     *            include Amazon S3 buckets and optional AWS Lambda functions
     *            written in the Python language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withResources(JobResource resources) {
        this.resources = resources;
        return this;
    }

    /**
     * <p>
     * An optional description of this specific cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         An optional description of this specific cluster, for example
     *         <code>Environmental Data Cluster-01</code>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description of this specific cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            An optional description of this specific cluster, for example
     *            <code>Environmental Data Cluster-01</code>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of this specific cluster, for example
     * <code>Environmental Data Cluster-01</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            An optional description of this specific cluster, for example
     *            <code>Environmental Data Cluster-01</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The ID for the address that you want the cluster shipped to.
     *         </p>
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param addressId <p>
     *            The ID for the address that you want the cluster shipped to.
     *            </p>
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the cluster shipped to.
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
     *            The ID for the address that you want the cluster shipped to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> value that you want to associate with this
     * cluster. <code>KmsKeyARN</code> values are created by using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @return <p>
     *         The <code>KmsKeyARN</code> value that you want to associate with
     *         this cluster. <code>KmsKeyARN</code> values are created by using
     *         the <a href=
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
     * The <code>KmsKeyARN</code> value that you want to associate with this
     * cluster. <code>KmsKeyARN</code> values are created by using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @param kmsKeyARN <p>
     *            The <code>KmsKeyARN</code> value that you want to associate
     *            with this cluster. <code>KmsKeyARN</code> values are created
     *            by using the <a href=
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
     * The <code>KmsKeyARN</code> value that you want to associate with this
     * cluster. <code>KmsKeyARN</code> values are created by using the <a href=
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
     *            The <code>KmsKeyARN</code> value that you want to associate
     *            with this cluster. <code>KmsKeyARN</code> values are created
     *            by using the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *            >CreateKey</a> API action in AWS Key Management Service (AWS
     *            KMS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
        return this;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this cluster.
     * <code>RoleArn</code> values are created by using the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @return <p>
     *         The <code>RoleARN</code> that you want to associate with this
     *         cluster. <code>RoleArn</code> values are created by using the <a
     *         href=
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
     * The <code>RoleARN</code> that you want to associate with this cluster.
     * <code>RoleArn</code> values are created by using the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @param roleARN <p>
     *            The <code>RoleARN</code> that you want to associate with this
     *            cluster. <code>RoleArn</code> values are created by using the
     *            <a href=
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
     * The <code>RoleARN</code> that you want to associate with this cluster.
     * <code>RoleArn</code> values are created by using the <a href=
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
     *            The <code>RoleARN</code> that you want to associate with this
     *            cluster. <code>RoleArn</code> values are created by using the
     *            <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a> API action in AWS Identity and Access
     *            Management (IAM).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. Currently, the
     * only supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S
     *
     * @return <p>
     *         The type of AWS Snowball device to use for this cluster.
     *         Currently, the only supported device type for cluster jobs is
     *         <code>EDGE</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     *         >Snowball Edge Device Options</a> in the Snowball Edge Developer
     *         Guide.
     *         </p>
     * @see SnowballType
     */
    public String getSnowballType() {
        return snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. Currently, the
     * only supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            Currently, the only supported device type for cluster jobs is
     *            <code>EDGE</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     *            >Snowball Edge Device Options</a> in the Snowball Edge
     *            Developer Guide.
     *            </p>
     * @see SnowballType
     */
    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. Currently, the
     * only supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            Currently, the only supported device type for cluster jobs is
     *            <code>EDGE</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     *            >Snowball Edge Device Options</a> in the Snowball Edge
     *            Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public CreateClusterRequest withSnowballType(String snowballType) {
        this.snowballType = snowballType;
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. Currently, the
     * only supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            Currently, the only supported device type for cluster jobs is
     *            <code>EDGE</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     *            >Snowball Edge Device Options</a> in the Snowball Edge
     *            Developer Guide.
     *            </p>
     * @see SnowballType
     */
    public void setSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this cluster. Currently, the
     * only supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this cluster.
     *            Currently, the only supported device type for cluster jobs is
     *            <code>EDGE</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     *            >Snowball Edge Device Options</a> in the Snowball Edge
     *            Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public CreateClusterRequest withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
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
    public CreateClusterRequest withShippingOption(String shippingOption) {
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
    public CreateClusterRequest withShippingOption(ShippingOption shippingOption) {
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
    public CreateClusterRequest withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    /**
     * <p>
     * The forwarding address ID for a cluster. This field is not supported in
     * most regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The forwarding address ID for a cluster. This field is not
     *         supported in most regions.
     *         </p>
     */
    public String getForwardingAddressId() {
        return forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a cluster. This field is not supported in
     * most regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param forwardingAddressId <p>
     *            The forwarding address ID for a cluster. This field is not
     *            supported in most regions.
     *            </p>
     */
    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a cluster. This field is not supported in
     * most regions.
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
     *            The forwarding address ID for a cluster. This field is not
     *            supported in most regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withForwardingAddressId(String forwardingAddressId) {
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
    public CreateClusterRequest withTaxDocuments(TaxDocuments taxDocuments) {
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
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getKmsKeyARN() != null)
            sb.append("KmsKeyARN: " + getKmsKeyARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getSnowballType() != null)
            sb.append("SnowballType: " + getSnowballType() + ",");
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

        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyARN() == null) ? 0 : getKmsKeyARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
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

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;

        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null
                && other.getAddressId().equals(this.getAddressId()) == false)
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
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null
                && other.getSnowballType().equals(this.getSnowballType()) == false)
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
