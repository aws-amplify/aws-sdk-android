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
 * Contains information about a specific job including shipping information, job
 * status, and other important metadata. This information is returned as a part
 * of the response syntax of the <code>DescribeJob</code> action.
 * </p>
 */
public class JobMetadata implements Serializable {
    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String jobId;

    /**
     * <p>
     * The current status of the jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     */
    private String jobState;

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     */
    private String jobType;

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     */
    private String snowballType;

    /**
     * <p>
     * The creation date for this job.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code>
     * object represents an Amazon S3 bucket that your transferred data will be
     * exported from or imported into.
     * </p>
     */
    private JobResource resources;

    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS
     * KMS) key associated with this job. This ARN was created using the <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     */
    private String kmsKeyARN;

    /**
     * <p>
     * The role ARN associated with this job. This ARN was created using the <a
     * href=
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
     * A job's shipping information, including inbound and outbound tracking
     * numbers and shipping speed options.
     * </p>
     */
    private ShippingDetails shippingDetails;

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation.
     * In US regions, you can choose between 50 TB and 80 TB Snowballs. All
     * other regions use 80 TB capacity Snowballs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     */
    private String snowballCapacityPreference;

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * associated with a specific job. The <code>Notification</code> object is
     * returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     */
    private Notification notification;

    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer
     * while the device is at AWS. This data is only available while a job has a
     * <code>JobState</code> value of <code>InProgress</code>, for both import
     * and export jobs.
     * </p>
     */
    private DataTransfer dataTransferProgress;

    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import
     * jobs, the PDF job report becomes available at the end of the import
     * process. For export jobs, your job report typically becomes available
     * while the Snowball for your job part is being delivered to you.
     * </p>
     */
    private JobLogs jobLogInfo;

    /**
     * <p>
     * The 39-character ID for the cluster, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String clusterId;

    /**
     * <p>
     * The ID of the address that you want a job shipped to, after it will be
     * shipped to its primary address. This field is not supported in most
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
     * The metadata associated with the tax documents required in your AWS
     * Region.
     * </p>
     */
    private TaxDocuments taxDocuments;

    /**
     * <p>
     * The container for <code>SnowconeDeviceConfiguration</code>.
     * </p>
     */
    private DeviceConfiguration deviceConfiguration;

    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The automatically generated ID for a job, for example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param jobId <p>
     *            The automatically generated ID for a job, for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param jobId <p>
     *            The automatically generated ID for a job, for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The current status of the jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @return <p>
     *         The current status of the jobs.
     *         </p>
     * @see JobState
     */
    public String getJobState() {
        return jobState;
    }

    /**
     * <p>
     * The current status of the jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current status of the jobs.
     *            </p>
     * @see JobState
     */
    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    /**
     * <p>
     * The current status of the jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current status of the jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobState
     */
    public JobMetadata withJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }

    /**
     * <p>
     * The current status of the jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current status of the jobs.
     *            </p>
     * @see JobState
     */
    public void setJobState(JobState jobState) {
        this.jobState = jobState.toString();
    }

    /**
     * <p>
     * The current status of the jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>New, PreparingAppliance, PreparingShipment,
     * InTransitToCustomer, WithCustomer, InTransitToAWS,
     * WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled,
     * Listing, Pending
     *
     * @param jobState <p>
     *            The current status of the jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobState
     */
    public JobMetadata withJobState(JobState jobState) {
        this.jobState = jobState.toString();
        return this;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @return <p>
     *         The type of job.
     *         </p>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobMetadata withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT, EXPORT, LOCAL_USE
     *
     * @param jobType <p>
     *            The type of job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobMetadata withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @return <p>
     *         The type of device used with this job.
     *         </p>
     * @see SnowballType
     */
    public String getSnowballType() {
        return snowballType;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @see SnowballType
     */
    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public JobMetadata withSnowballType(String snowballType) {
        this.snowballType = snowballType;
        return this;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @see SnowballType
     */
    public void setSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD
     *
     * @param snowballType <p>
     *            The type of device used with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballType
     */
    public JobMetadata withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     *
     * @return <p>
     *         The creation date for this job.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     *
     * @param creationDate <p>
     *            The creation date for this job.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The creation date for this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code>
     * object represents an Amazon S3 bucket that your transferred data will be
     * exported from or imported into.
     * </p>
     *
     * @return <p>
     *         An array of <code>S3Resource</code> objects. Each
     *         <code>S3Resource</code> object represents an Amazon S3 bucket
     *         that your transferred data will be exported from or imported
     *         into.
     *         </p>
     */
    public JobResource getResources() {
        return resources;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code>
     * object represents an Amazon S3 bucket that your transferred data will be
     * exported from or imported into.
     * </p>
     *
     * @param resources <p>
     *            An array of <code>S3Resource</code> objects. Each
     *            <code>S3Resource</code> object represents an Amazon S3 bucket
     *            that your transferred data will be exported from or imported
     *            into.
     *            </p>
     */
    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code>
     * object represents an Amazon S3 bucket that your transferred data will be
     * exported from or imported into.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            An array of <code>S3Resource</code> objects. Each
     *            <code>S3Resource</code> object represents an Amazon S3 bucket
     *            that your transferred data will be exported from or imported
     *            into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withResources(JobResource resources) {
        this.resources = resources;
        return this;
    }

    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The description of the job, provided at job creation.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The description of the job, provided at job creation.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The description of the job, provided at job creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS
     * KMS) key associated with this job. This ARN was created using the <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the AWS Key Management Service
     *         (AWS KMS) key associated with this job. This ARN was created
     *         using the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *         >CreateKey</a> API action in AWS KMS.
     *         </p>
     */
    public String getKmsKeyARN() {
        return kmsKeyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS
     * KMS) key associated with this job. This ARN was created using the <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:kms:.*:[0-9]{12}:key/.*<br/>
     *
     * @param kmsKeyARN <p>
     *            The Amazon Resource Name (ARN) for the AWS Key Management
     *            Service (AWS KMS) key associated with this job. This ARN was
     *            created using the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *            >CreateKey</a> API action in AWS KMS.
     *            </p>
     */
    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS
     * KMS) key associated with this job. This ARN was created using the <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     * >CreateKey</a> API action in AWS KMS.
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
     *            The Amazon Resource Name (ARN) for the AWS Key Management
     *            Service (AWS KMS) key associated with this job. This ARN was
     *            created using the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html"
     *            >CreateKey</a> API action in AWS KMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
        return this;
    }

    /**
     * <p>
     * The role ARN associated with this job. This ARN was created using the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @return <p>
     *         The role ARN associated with this job. This ARN was created using
     *         the <a href=
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
     * The role ARN associated with this job. This ARN was created using the <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a> API action in AWS Identity and Access Management (IAM).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @param roleARN <p>
     *            The role ARN associated with this job. This ARN was created
     *            using the <a href=
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
     * The role ARN associated with this job. This ARN was created using the <a
     * href=
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
     *            The role ARN associated with this job. This ARN was created
     *            using the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a> API action in AWS Identity and Access
     *            Management (IAM).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withRoleARN(String roleARN) {
        this.roleARN = roleARN;
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
    public JobMetadata withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * <p>
     * A job's shipping information, including inbound and outbound tracking
     * numbers and shipping speed options.
     * </p>
     *
     * @return <p>
     *         A job's shipping information, including inbound and outbound
     *         tracking numbers and shipping speed options.
     *         </p>
     */
    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    /**
     * <p>
     * A job's shipping information, including inbound and outbound tracking
     * numbers and shipping speed options.
     * </p>
     *
     * @param shippingDetails <p>
     *            A job's shipping information, including inbound and outbound
     *            tracking numbers and shipping speed options.
     *            </p>
     */
    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    /**
     * <p>
     * A job's shipping information, including inbound and outbound tracking
     * numbers and shipping speed options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shippingDetails <p>
     *            A job's shipping information, including inbound and outbound
     *            tracking numbers and shipping speed options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation.
     * In US regions, you can choose between 50 TB and 80 TB Snowballs. All
     * other regions use 80 TB capacity Snowballs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @return <p>
     *         The Snowball capacity preference for this job, specified at job
     *         creation. In US regions, you can choose between 50 TB and 80 TB
     *         Snowballs. All other regions use 80 TB capacity Snowballs.
     *         </p>
     * @see SnowballCapacity
     */
    public String getSnowballCapacityPreference() {
        return snowballCapacityPreference;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation.
     * In US regions, you can choose between 50 TB and 80 TB Snowballs. All
     * other regions use 80 TB capacity Snowballs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The Snowball capacity preference for this job, specified at
     *            job creation. In US regions, you can choose between 50 TB and
     *            80 TB Snowballs. All other regions use 80 TB capacity
     *            Snowballs.
     *            </p>
     * @see SnowballCapacity
     */
    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation.
     * In US regions, you can choose between 50 TB and 80 TB Snowballs. All
     * other regions use 80 TB capacity Snowballs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The Snowball capacity preference for this job, specified at
     *            job creation. In US regions, you can choose between 50 TB and
     *            80 TB Snowballs. All other regions use 80 TB capacity
     *            Snowballs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */
    public JobMetadata withSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
        return this;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation.
     * In US regions, you can choose between 50 TB and 80 TB Snowballs. All
     * other regions use 80 TB capacity Snowballs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The Snowball capacity preference for this job, specified at
     *            job creation. In US regions, you can choose between 50 TB and
     *            80 TB Snowballs. All other regions use 80 TB capacity
     *            Snowballs.
     *            </p>
     * @see SnowballCapacity
     */
    public void setSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation.
     * In US regions, you can choose between 50 TB and 80 TB Snowballs. All
     * other regions use 80 TB capacity Snowballs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, T8, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The Snowball capacity preference for this job, specified at
     *            job creation. In US regions, you can choose between 50 TB and
     *            80 TB Snowballs. All other regions use 80 TB capacity
     *            Snowballs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */
    public JobMetadata withSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * associated with a specific job. The <code>Notification</code> object is
     * returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Notification Service (Amazon SNS) notification
     *         settings associated with a specific job. The
     *         <code>Notification</code> object is returned as a part of the
     *         response syntax of the <code>DescribeJob</code> action in the
     *         <code>JobMetadata</code> data type.
     *         </p>
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * associated with a specific job. The <code>Notification</code> object is
     * returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     *
     * @param notification <p>
     *            The Amazon Simple Notification Service (Amazon SNS)
     *            notification settings associated with a specific job. The
     *            <code>Notification</code> object is returned as a part of the
     *            response syntax of the <code>DescribeJob</code> action in the
     *            <code>JobMetadata</code> data type.
     *            </p>
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings
     * associated with a specific job. The <code>Notification</code> object is
     * returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notification <p>
     *            The Amazon Simple Notification Service (Amazon SNS)
     *            notification settings associated with a specific job. The
     *            <code>Notification</code> object is returned as a part of the
     *            response syntax of the <code>DescribeJob</code> action in the
     *            <code>JobMetadata</code> data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer
     * while the device is at AWS. This data is only available while a job has a
     * <code>JobState</code> value of <code>InProgress</code>, for both import
     * and export jobs.
     * </p>
     *
     * @return <p>
     *         A value that defines the real-time status of a Snowball's data
     *         transfer while the device is at AWS. This data is only available
     *         while a job has a <code>JobState</code> value of
     *         <code>InProgress</code>, for both import and export jobs.
     *         </p>
     */
    public DataTransfer getDataTransferProgress() {
        return dataTransferProgress;
    }

    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer
     * while the device is at AWS. This data is only available while a job has a
     * <code>JobState</code> value of <code>InProgress</code>, for both import
     * and export jobs.
     * </p>
     *
     * @param dataTransferProgress <p>
     *            A value that defines the real-time status of a Snowball's data
     *            transfer while the device is at AWS. This data is only
     *            available while a job has a <code>JobState</code> value of
     *            <code>InProgress</code>, for both import and export jobs.
     *            </p>
     */
    public void setDataTransferProgress(DataTransfer dataTransferProgress) {
        this.dataTransferProgress = dataTransferProgress;
    }

    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer
     * while the device is at AWS. This data is only available while a job has a
     * <code>JobState</code> value of <code>InProgress</code>, for both import
     * and export jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTransferProgress <p>
     *            A value that defines the real-time status of a Snowball's data
     *            transfer while the device is at AWS. This data is only
     *            available while a job has a <code>JobState</code> value of
     *            <code>InProgress</code>, for both import and export jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withDataTransferProgress(DataTransfer dataTransferProgress) {
        this.dataTransferProgress = dataTransferProgress;
        return this;
    }

    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import
     * jobs, the PDF job report becomes available at the end of the import
     * process. For export jobs, your job report typically becomes available
     * while the Snowball for your job part is being delivered to you.
     * </p>
     *
     * @return <p>
     *         Links to Amazon S3 presigned URLs for the job report and logs.
     *         For import jobs, the PDF job report becomes available at the end
     *         of the import process. For export jobs, your job report typically
     *         becomes available while the Snowball for your job part is being
     *         delivered to you.
     *         </p>
     */
    public JobLogs getJobLogInfo() {
        return jobLogInfo;
    }

    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import
     * jobs, the PDF job report becomes available at the end of the import
     * process. For export jobs, your job report typically becomes available
     * while the Snowball for your job part is being delivered to you.
     * </p>
     *
     * @param jobLogInfo <p>
     *            Links to Amazon S3 presigned URLs for the job report and logs.
     *            For import jobs, the PDF job report becomes available at the
     *            end of the import process. For export jobs, your job report
     *            typically becomes available while the Snowball for your job
     *            part is being delivered to you.
     *            </p>
     */
    public void setJobLogInfo(JobLogs jobLogInfo) {
        this.jobLogInfo = jobLogInfo;
    }

    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import
     * jobs, the PDF job report becomes available at the end of the import
     * process. For export jobs, your job report typically becomes available
     * while the Snowball for your job part is being delivered to you.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobLogInfo <p>
     *            Links to Amazon S3 presigned URLs for the job report and logs.
     *            For import jobs, the PDF job report becomes available at the
     *            end of the import process. For export jobs, your job report
     *            typically becomes available while the Snowball for your job
     *            part is being delivered to you.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withJobLogInfo(JobLogs jobLogInfo) {
        this.jobLogInfo = jobLogInfo;
        return this;
    }

    /**
     * <p>
     * The 39-character ID for the cluster, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The 39-character ID for the cluster, for example
     *         <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param clusterId <p>
     *            The 39-character ID for the cluster, for example
     *            <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param clusterId <p>
     *            The 39-character ID for the cluster, for example
     *            <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The ID of the address that you want a job shipped to, after it will be
     * shipped to its primary address. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The ID of the address that you want a job shipped to, after it
     *         will be shipped to its primary address. This field is not
     *         supported in most regions.
     *         </p>
     */
    public String getForwardingAddressId() {
        return forwardingAddressId;
    }

    /**
     * <p>
     * The ID of the address that you want a job shipped to, after it will be
     * shipped to its primary address. This field is not supported in most
     * regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param forwardingAddressId <p>
     *            The ID of the address that you want a job shipped to, after it
     *            will be shipped to its primary address. This field is not
     *            supported in most regions.
     *            </p>
     */
    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The ID of the address that you want a job shipped to, after it will be
     * shipped to its primary address. This field is not supported in most
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
     *            The ID of the address that you want a job shipped to, after it
     *            will be shipped to its primary address. This field is not
     *            supported in most regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
        return this;
    }

    /**
     * <p>
     * The metadata associated with the tax documents required in your AWS
     * Region.
     * </p>
     *
     * @return <p>
     *         The metadata associated with the tax documents required in your
     *         AWS Region.
     *         </p>
     */
    public TaxDocuments getTaxDocuments() {
        return taxDocuments;
    }

    /**
     * <p>
     * The metadata associated with the tax documents required in your AWS
     * Region.
     * </p>
     *
     * @param taxDocuments <p>
     *            The metadata associated with the tax documents required in
     *            your AWS Region.
     *            </p>
     */
    public void setTaxDocuments(TaxDocuments taxDocuments) {
        this.taxDocuments = taxDocuments;
    }

    /**
     * <p>
     * The metadata associated with the tax documents required in your AWS
     * Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taxDocuments <p>
     *            The metadata associated with the tax documents required in
     *            your AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withTaxDocuments(TaxDocuments taxDocuments) {
        this.taxDocuments = taxDocuments;
        return this;
    }

    /**
     * <p>
     * The container for <code>SnowconeDeviceConfiguration</code>.
     * </p>
     *
     * @return <p>
     *         The container for <code>SnowconeDeviceConfiguration</code>.
     *         </p>
     */
    public DeviceConfiguration getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * <p>
     * The container for <code>SnowconeDeviceConfiguration</code>.
     * </p>
     *
     * @param deviceConfiguration <p>
     *            The container for <code>SnowconeDeviceConfiguration</code>.
     *            </p>
     */
    public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * The container for <code>SnowconeDeviceConfiguration</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceConfiguration <p>
     *            The container for <code>SnowconeDeviceConfiguration</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMetadata withDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobState() != null)
            sb.append("JobState: " + getJobState() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getSnowballType() != null)
            sb.append("SnowballType: " + getSnowballType() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKmsKeyARN() != null)
            sb.append("KmsKeyARN: " + getKmsKeyARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getShippingDetails() != null)
            sb.append("ShippingDetails: " + getShippingDetails() + ",");
        if (getSnowballCapacityPreference() != null)
            sb.append("SnowballCapacityPreference: " + getSnowballCapacityPreference() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getDataTransferProgress() != null)
            sb.append("DataTransferProgress: " + getDataTransferProgress() + ",");
        if (getJobLogInfo() != null)
            sb.append("JobLogInfo: " + getJobLogInfo() + ",");
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
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

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobState() == null) ? 0 : getJobState().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode
                + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyARN() == null) ? 0 : getKmsKeyARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode
                + ((getShippingDetails() == null) ? 0 : getShippingDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnowballCapacityPreference() == null) ? 0 : getSnowballCapacityPreference()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode
                + ((getDataTransferProgress() == null) ? 0 : getDataTransferProgress().hashCode());
        hashCode = prime * hashCode + ((getJobLogInfo() == null) ? 0 : getJobLogInfo().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
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

        if (obj instanceof JobMetadata == false)
            return false;
        JobMetadata other = (JobMetadata) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobState() == null ^ this.getJobState() == null)
            return false;
        if (other.getJobState() != null && other.getJobState().equals(this.getJobState()) == false)
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
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null
                && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getShippingDetails() == null ^ this.getShippingDetails() == null)
            return false;
        if (other.getShippingDetails() != null
                && other.getShippingDetails().equals(this.getShippingDetails()) == false)
            return false;
        if (other.getSnowballCapacityPreference() == null
                ^ this.getSnowballCapacityPreference() == null)
            return false;
        if (other.getSnowballCapacityPreference() != null
                && other.getSnowballCapacityPreference().equals(
                        this.getSnowballCapacityPreference()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null
                && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getDataTransferProgress() == null ^ this.getDataTransferProgress() == null)
            return false;
        if (other.getDataTransferProgress() != null
                && other.getDataTransferProgress().equals(this.getDataTransferProgress()) == false)
            return false;
        if (other.getJobLogInfo() == null ^ this.getJobLogInfo() == null)
            return false;
        if (other.getJobLogInfo() != null
                && other.getJobLogInfo().equals(this.getJobLogInfo()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
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
