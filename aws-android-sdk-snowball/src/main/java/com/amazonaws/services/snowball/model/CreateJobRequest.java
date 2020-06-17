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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a job to import or export data between Amazon S3 and your on-premises
 * data center. Your AWS account must have the right trust policies and
 * permissions in place to create a job for Snowball. If you're creating a job
 * for a node in a cluster, you only need to provide the <code>clusterId</code>
 * value; the other job attributes are inherited from the cluster.
 * </p>
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     */
    private String jobType;

    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be imported into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be exported from. Optionally, you can also
     * specify a <code>KeyRange</code> value. If you choose to export a range,
     * you define the length of the range by providing either an inclusive
     * <code>BeginMarker</code> value, an inclusive <code>EndMarker</code>
     * value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     */
    private JobResource resources;

    /**
     * <p>
     * Defines an optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
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
     * The <code>KmsKeyARN</code> that you want to associate with this job.
     * <code>KmsKeyARN</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> AWS Key Management Service (KMS) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     */
    private String kmsKeyARN;

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job.
     * <code>RoleArn</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> AWS Identity and Access Management (IAM) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     */
    private String roleARN;

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the
     * option of specifying what size Snowball you'd like for this job. In all
     * other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     */
    private String snowballCapacityPreference;

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon
     * you'll get the Snowball, rather it represents how quickly the Snowball
     * moves to its destination while in transit. Regional shipping speeds are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
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
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification
     * settings for this job.
     * </p>
     */
    private Notification notification;

    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster,
     * you need to provide only this <code>clusterId</code> value. The other job
     * attributes are inherited from the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String clusterId;

    /**
     * <p>
     * The type of AWS Snowball device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snowball device to use for this job. Currently, the only
     * supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     */
    private String snowballType;

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most
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
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     */
    private DeviceConfiguration deviceConfiguration;

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @return <p>
     *         Defines the type of job that you're creating.
     *         </p>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            Defines the type of job that you're creating.
     *            </p>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            Defines the type of job that you're creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateJobRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            Defines the type of job that you're creating.
     *            </p>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * Defines the type of job that you're creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            Defines the type of job that you're creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be imported into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be exported from. Optionally, you can also
     * specify a <code>KeyRange</code> value. If you choose to export a range,
     * you define the length of the range by providing either an inclusive
     * <code>BeginMarker</code> value, an inclusive <code>EndMarker</code>
     * value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     *
     * @return <p>
     *         Defines the Amazon S3 buckets associated with this job.
     *         </p>
     *         <p>
     *         With <code>IMPORT</code> jobs, you specify the bucket or buckets
     *         that your transferred data will be imported into.
     *         </p>
     *         <p>
     *         With <code>EXPORT</code> jobs, you specify the bucket or buckets
     *         that your transferred data will be exported from. Optionally, you
     *         can also specify a <code>KeyRange</code> value. If you choose to
     *         export a range, you define the length of the range by providing
     *         either an inclusive <code>BeginMarker</code> value, an inclusive
     *         <code>EndMarker</code> value, or both. Ranges are UTF-8 binary
     *         sorted.
     *         </p>
     */
    public JobResource getResources() {
        return resources;
    }

    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be imported into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be exported from. Optionally, you can also
     * specify a <code>KeyRange</code> value. If you choose to export a range,
     * you define the length of the range by providing either an inclusive
     * <code>BeginMarker</code> value, an inclusive <code>EndMarker</code>
     * value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     *
     * @param resources <p>
     *            Defines the Amazon S3 buckets associated with this job.
     *            </p>
     *            <p>
     *            With <code>IMPORT</code> jobs, you specify the bucket or
     *            buckets that your transferred data will be imported into.
     *            </p>
     *            <p>
     *            With <code>EXPORT</code> jobs, you specify the bucket or
     *            buckets that your transferred data will be exported from.
     *            Optionally, you can also specify a <code>KeyRange</code>
     *            value. If you choose to export a range, you define the length
     *            of the range by providing either an inclusive
     *            <code>BeginMarker</code> value, an inclusive
     *            <code>EndMarker</code> value, or both. Ranges are UTF-8 binary
     *            sorted.
     *            </p>
     */
    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * Defines the Amazon S3 buckets associated with this job.
     * </p>
     * <p>
     * With <code>IMPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be imported into.
     * </p>
     * <p>
     * With <code>EXPORT</code> jobs, you specify the bucket or buckets that
     * your transferred data will be exported from. Optionally, you can also
     * specify a <code>KeyRange</code> value. If you choose to export a range,
     * you define the length of the range by providing either an inclusive
     * <code>BeginMarker</code> value, an inclusive <code>EndMarker</code>
     * value, or both. Ranges are UTF-8 binary sorted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            Defines the Amazon S3 buckets associated with this job.
     *            </p>
     *            <p>
     *            With <code>IMPORT</code> jobs, you specify the bucket or
     *            buckets that your transferred data will be imported into.
     *            </p>
     *            <p>
     *            With <code>EXPORT</code> jobs, you specify the bucket or
     *            buckets that your transferred data will be exported from.
     *            Optionally, you can also specify a <code>KeyRange</code>
     *            value. If you choose to export a range, you define the length
     *            of the range by providing either an inclusive
     *            <code>BeginMarker</code> value, an inclusive
     *            <code>EndMarker</code> value, or both. Ranges are UTF-8 binary
     *            sorted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withResources(JobResource resources) {
        this.resources = resources;
        return this;
    }

    /**
     * <p>
     * Defines an optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Defines an optional description of this specific job, for example
     *         <code>Important Photos 2016-08-11</code>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Defines an optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            Defines an optional description of this specific job, for
     *            example <code>Important Photos 2016-08-11</code>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Defines an optional description of this specific job, for example
     * <code>Important Photos 2016-08-11</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            Defines an optional description of this specific job, for
     *            example <code>Important Photos 2016-08-11</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The ID for the address that you want the Snowball shipped to.
     *         </p>
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param addressId <p>
     *            The ID for the address that you want the Snowball shipped to.
     *            </p>
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
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
     *            The ID for the address that you want the Snowball shipped to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job.
     * <code>KmsKeyARN</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> AWS Key Management Service (KMS) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @return <p>
     *         The <code>KmsKeyARN</code> that you want to associate with this
     *         job. <code>KmsKeyARN</code>s are created using the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *         >CreateKey</a> AWS Key Management Service (KMS) API action.
     *         </p>
     */
    public String getKmsKeyARN() {
        return kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job.
     * <code>KmsKeyARN</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> AWS Key Management Service (KMS) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @param kmsKeyARN <p>
     *            The <code>KmsKeyARN</code> that you want to associate with
     *            this job. <code>KmsKeyARN</code>s are created using the <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *            >CreateKey</a> AWS Key Management Service (KMS) API action.
     *            </p>
     */
    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The <code>KmsKeyARN</code> that you want to associate with this job.
     * <code>KmsKeyARN</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> AWS Key Management Service (KMS) API action.
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
     *            The <code>KmsKeyARN</code> that you want to associate with
     *            this job. <code>KmsKeyARN</code>s are created using the <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *            >CreateKey</a> AWS Key Management Service (KMS) API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
        return this;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job.
     * <code>RoleArn</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> AWS Identity and Access Management (IAM) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @return <p>
     *         The <code>RoleARN</code> that you want to associate with this
     *         job. <code>RoleArn</code>s are created using the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *         >CreateRole</a> AWS Identity and Access Management (IAM) API
     *         action.
     *         </p>
     */
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job.
     * <code>RoleArn</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> AWS Identity and Access Management (IAM) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @param roleARN <p>
     *            The <code>RoleARN</code> that you want to associate with this
     *            job. <code>RoleArn</code>s are created using the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a> AWS Identity and Access Management (IAM) API
     *            action.
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The <code>RoleARN</code> that you want to associate with this job.
     * <code>RoleArn</code>s are created using the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> AWS Identity and Access Management (IAM) API action.
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
     *            job. <code>RoleArn</code>s are created using the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a> AWS Identity and Access Management (IAM) API
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the
     * option of specifying what size Snowball you'd like for this job. In all
     * other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @return <p>
     *         If your job is being created in one of the US regions, you have
     *         the option of specifying what size Snowball you'd like for this
     *         job. In all other regions, Snowballs come with 80 TB in storage
     *         capacity.
     *         </p>
     * @see SnowballCapacity
     */
    public String getSnowballCapacityPreference() {
        return snowballCapacityPreference;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the
     * option of specifying what size Snowball you'd like for this job. In all
     * other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            If your job is being created in one of the US regions, you
     *            have the option of specifying what size Snowball you'd like
     *            for this job. In all other regions, Snowballs come with 80 TB
     *            in storage capacity.
     *            </p>
     * @see SnowballCapacity
     */
    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the
     * option of specifying what size Snowball you'd like for this job. In all
     * other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            If your job is being created in one of the US regions, you
     *            have the option of specifying what size Snowball you'd like
     *            for this job. In all other regions, Snowballs come with 80 TB
     *            in storage capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */
    public CreateJobRequest withSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
        return this;
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the
     * option of specifying what size Snowball you'd like for this job. In all
     * other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            If your job is being created in one of the US regions, you
     *            have the option of specifying what size Snowball you'd like
     *            for this job. In all other regions, Snowballs come with 80 TB
     *            in storage capacity.
     *            </p>
     * @see SnowballCapacity
     */
    public void setSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
    }

    /**
     * <p>
     * If your job is being created in one of the US regions, you have the
     * option of specifying what size Snowball you'd like for this job. In all
     * other regions, Snowballs come with 80 TB in storage capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            If your job is being created in one of the US regions, you
     *            have the option of specifying what size Snowball you'd like
     *            for this job. In all other regions, Snowballs come with 80 TB
     *            in storage capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */
    public CreateJobRequest withSnowballCapacityPreference(
            SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
        return this;
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon
     * you'll get the Snowball, rather it represents how quickly the Snowball
     * moves to its destination while in transit. Regional shipping speeds are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
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
     *         The shipping speed for this job. This speed doesn't dictate how
     *         soon you'll get the Snowball, rather it represents how quickly
     *         the Snowball moves to its destination while in transit. Regional
     *         shipping speeds are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically,
     *         Snowballs shipped express are delivered in about a day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the European Union (EU), you have access to express shipping.
     *         Typically, Snowballs shipped express are delivered in about a
     *         day. In addition, most countries in the EU have access to
     *         standard shipping, which typically takes less than a week, one
     *         way.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In India, Snowballs are delivered in one to seven days.
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
     * The shipping speed for this job. This speed doesn't dictate how soon
     * you'll get the Snowball, rather it represents how quickly the Snowball
     * moves to its destination while in transit. Regional shipping speeds are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
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
     *            The shipping speed for this job. This speed doesn't dictate
     *            how soon you'll get the Snowball, rather it represents how
     *            quickly the Snowball moves to its destination while in
     *            transit. Regional shipping speeds are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
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
     * The shipping speed for this job. This speed doesn't dictate how soon
     * you'll get the Snowball, rather it represents how quickly the Snowball
     * moves to its destination while in transit. Regional shipping speeds are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
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
     *            The shipping speed for this job. This speed doesn't dictate
     *            how soon you'll get the Snowball, rather it represents how
     *            quickly the Snowball moves to its destination while in
     *            transit. Regional shipping speeds are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
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
    public CreateJobRequest withShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
        return this;
    }

    /**
     * <p>
     * The shipping speed for this job. This speed doesn't dictate how soon
     * you'll get the Snowball, rather it represents how quickly the Snowball
     * moves to its destination while in transit. Regional shipping speeds are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
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
     *            The shipping speed for this job. This speed doesn't dictate
     *            how soon you'll get the Snowball, rather it represents how
     *            quickly the Snowball moves to its destination while in
     *            transit. Regional shipping speeds are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
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
     * The shipping speed for this job. This speed doesn't dictate how soon
     * you'll get the Snowball, rather it represents how quickly the Snowball
     * moves to its destination while in transit. Regional shipping speeds are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
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
     *            The shipping speed for this job. This speed doesn't dictate
     *            how soon you'll get the Snowball, rather it represents how
     *            quickly the Snowball moves to its destination while in
     *            transit. Regional shipping speeds are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
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
    public CreateJobRequest withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification
     * settings for this job.
     * </p>
     *
     * @return <p>
     *         Defines the Amazon Simple Notification Service (Amazon SNS)
     *         notification settings for this job.
     *         </p>
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * <p>
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification
     * settings for this job.
     * </p>
     *
     * @param notification <p>
     *            Defines the Amazon Simple Notification Service (Amazon SNS)
     *            notification settings for this job.
     *            </p>
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * Defines the Amazon Simple Notification Service (Amazon SNS) notification
     * settings for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notification <p>
     *            Defines the Amazon Simple Notification Service (Amazon SNS)
     *            notification settings for this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster,
     * you need to provide only this <code>clusterId</code> value. The other job
     * attributes are inherited from the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The ID of a cluster. If you're creating a job for a node in a
     *         cluster, you need to provide only this <code>clusterId</code>
     *         value. The other job attributes are inherited from the cluster.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster,
     * you need to provide only this <code>clusterId</code> value. The other job
     * attributes are inherited from the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param clusterId <p>
     *            The ID of a cluster. If you're creating a job for a node in a
     *            cluster, you need to provide only this <code>clusterId</code>
     *            value. The other job attributes are inherited from the
     *            cluster.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The ID of a cluster. If you're creating a job for a node in a cluster,
     * you need to provide only this <code>clusterId</code> value. The other job
     * attributes are inherited from the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param clusterId <p>
     *            The ID of a cluster. If you're creating a job for a node in a
     *            cluster, you need to provide only this <code>clusterId</code>
     *            value. The other job attributes are inherited from the
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snowball device to use for this job. Currently, the only
     * supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @return <p>
     *         The type of AWS Snowball device to use for this job.
     *         </p>
     *         <note>
     *         <p>
     *         For cluster jobs, AWS Snowball currently supports only the
     *         <code>EDGE</code> device type.
     *         </p>
     *         </note>
     *         <p>
     *         The type of AWS Snowball device to use for this job. Currently,
     *         the only supported device type for cluster jobs is
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
     * The type of AWS Snowball device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snowball device to use for this job. Currently, the only
     * supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this job.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     *            <p>
     *            The type of AWS Snowball device to use for this job.
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
     * The type of AWS Snowball device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snowball device to use for this job. Currently, the only
     * supported device type for cluster jobs is <code>EDGE</code>.
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
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this job.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     *            <p>
     *            The type of AWS Snowball device to use for this job.
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
    public CreateJobRequest withSnowballType(String snowballType) {
        this.snowballType = snowballType;
        return this;
    }

    /**
     * <p>
     * The type of AWS Snowball device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snowball device to use for this job. Currently, the only
     * supported device type for cluster jobs is <code>EDGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/snowball/latest/developer-guide/device-differences.html"
     * >Snowball Edge Device Options</a> in the Snowball Edge Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this job.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     *            <p>
     *            The type of AWS Snowball device to use for this job.
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
     * The type of AWS Snowball device to use for this job.
     * </p>
     * <note>
     * <p>
     * For cluster jobs, AWS Snowball currently supports only the
     * <code>EDGE</code> device type.
     * </p>
     * </note>
     * <p>
     * The type of AWS Snowball device to use for this job. Currently, the only
     * supported device type for cluster jobs is <code>EDGE</code>.
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
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of AWS Snowball device to use for this job.
     *            </p>
     *            <note>
     *            <p>
     *            For cluster jobs, AWS Snowball currently supports only the
     *            <code>EDGE</code> device type.
     *            </p>
     *            </note>
     *            <p>
     *            The type of AWS Snowball device to use for this job.
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
    public CreateJobRequest withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The forwarding address ID for a job. This field is not supported
     *         in most regions.
     *         </p>
     */
    public String getForwardingAddressId() {
        return forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param forwardingAddressId <p>
     *            The forwarding address ID for a job. This field is not
     *            supported in most regions.
     *            </p>
     */
    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The forwarding address ID for a job. This field is not supported in most
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
     *            The forwarding address ID for a job. This field is not
     *            supported in most regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withForwardingAddressId(String forwardingAddressId) {
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
    public CreateJobRequest withTaxDocuments(TaxDocuments taxDocuments) {
        this.taxDocuments = taxDocuments;
        return this;
    }

    /**
     * <p>
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     *
     * @return <p>
     *         Defines the device configuration for an AWS Snowcone job.
     *         </p>
     */
    public DeviceConfiguration getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * <p>
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     *
     * @param deviceConfiguration <p>
     *            Defines the device configuration for an AWS Snowcone job.
     *            </p>
     */
    public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * Defines the device configuration for an AWS Snowcone job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceConfiguration <p>
     *            Defines the device configuration for an AWS Snowcone job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
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
        if (getSnowballCapacityPreference() != null)
            sb.append("SnowballCapacityPreference: " + getSnowballCapacityPreference() + ",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: " + getShippingOption() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getSnowballType() != null)
            sb.append("SnowballType: " + getSnowballType() + ",");
        if (getForwardingAddressId() != null)
            sb.append("ForwardingAddressId: " + getForwardingAddressId() + ",");
        if (getTaxDocuments() != null)
            sb.append("TaxDocuments: " + getTaxDocuments() + ",");
        if (getDeviceConfiguration() != null)
            sb.append("DeviceConfiguration: " + getDeviceConfiguration());
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
        hashCode = prime
                * hashCode
                + ((getSnowballCapacityPreference() == null) ? 0 : getSnowballCapacityPreference()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode
                + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode
                + ((getForwardingAddressId() == null) ? 0 : getForwardingAddressId().hashCode());
        hashCode = prime * hashCode
                + ((getTaxDocuments() == null) ? 0 : getTaxDocuments().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;

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
        if (other.getSnowballCapacityPreference() == null
                ^ this.getSnowballCapacityPreference() == null)
            return false;
        if (other.getSnowballCapacityPreference() != null
                && other.getSnowballCapacityPreference().equals(
                        this.getSnowballCapacityPreference()) == false)
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
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null
                && other.getSnowballType().equals(this.getSnowballType()) == false)
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
        if (other.getDeviceConfiguration() == null ^ this.getDeviceConfiguration() == null)
            return false;
        if (other.getDeviceConfiguration() != null
                && other.getDeviceConfiguration().equals(this.getDeviceConfiguration()) == false)
            return false;
        return true;
    }
}
