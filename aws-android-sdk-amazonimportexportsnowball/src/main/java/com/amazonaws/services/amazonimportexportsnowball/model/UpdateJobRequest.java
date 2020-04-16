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
 * While a job's <code>JobState</code> value is <code>New</code>, you can update
 * some of the information associated with a job. Once the job changes to a
 * different job state, usually within 60 minutes of the job being created, this
 * action is no longer available.
 * </p>
 */
public class UpdateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The job ID of the job that you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     */
    private String jobId;

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with
     * this job. To create a role ARN, use the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a>AWS Identity and Access Management (IAM) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     */
    private String roleARN;

    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     */
    private Notification notification;

    /**
     * <p>
     * The updated <code>JobResource</code> object, or the updated
     * <a>JobResource</a> object.
     * </p>
     */
    private JobResource resources;

    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
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
     * The updated shipping option value of this job's <a>ShippingDetails</a>
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     */
    private String shippingOption;

    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's
     * <a>JobMetadata</a> object. The 50 TB Snowballs are only available in the
     * US regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, NoPreference
     */
    private String snowballCapacityPreference;

    /**
     * <p>
     * The updated ID for the forwarding address for a job. This field is not
     * supported in most regions.
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
     * The job ID of the job that you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     *
     * @return <p>
     *         The job ID of the job that you want to update, for example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The job ID of the job that you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     *
     * @param jobId <p>
     *            The job ID of the job that you want to update, for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID of the job that you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     *
     * @param jobId <p>
     *            The job ID of the job that you want to update, for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with
     * this job. To create a role ARN, use the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a>AWS Identity and Access Management (IAM) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @return <p>
     *         The new role Amazon Resource Name (ARN) that you want to
     *         associate with this job. To create a role ARN, use the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *         >CreateRole</a>AWS Identity and Access Management (IAM) API
     *         action.
     *         </p>
     */
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with
     * this job. To create a role ARN, use the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a>AWS Identity and Access Management (IAM) API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>arn:aws.*:iam::[0-9]{12}:role/.*<br/>
     *
     * @param roleARN <p>
     *            The new role Amazon Resource Name (ARN) that you want to
     *            associate with this job. To create a role ARN, use the <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a>AWS Identity and Access Management (IAM) API
     *            action.
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with
     * this job. To create a role ARN, use the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     * >CreateRole</a>AWS Identity and Access Management (IAM) API action.
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
     *            The new role Amazon Resource Name (ARN) that you want to
     *            associate with this job. To create a role ARN, use the <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html"
     *            >CreateRole</a>AWS Identity and Access Management (IAM) API
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     *
     * @return <p>
     *         The new or updated <a>Notification</a> object.
     *         </p>
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     *
     * @param notification <p>
     *            The new or updated <a>Notification</a> object.
     *            </p>
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notification <p>
     *            The new or updated <a>Notification</a> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobRequest withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    /**
     * <p>
     * The updated <code>JobResource</code> object, or the updated
     * <a>JobResource</a> object.
     * </p>
     *
     * @return <p>
     *         The updated <code>JobResource</code> object, or the updated
     *         <a>JobResource</a> object.
     *         </p>
     */
    public JobResource getResources() {
        return resources;
    }

    /**
     * <p>
     * The updated <code>JobResource</code> object, or the updated
     * <a>JobResource</a> object.
     * </p>
     *
     * @param resources <p>
     *            The updated <code>JobResource</code> object, or the updated
     *            <a>JobResource</a> object.
     *            </p>
     */
    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The updated <code>JobResource</code> object, or the updated
     * <a>JobResource</a> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The updated <code>JobResource</code> object, or the updated
     *            <a>JobResource</a> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobRequest withResources(JobResource resources) {
        this.resources = resources;
        return this;
    }

    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The ID of the updated <a>Address</a> object.
     *         </p>
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param addressId <p>
     *            The ID of the updated <a>Address</a> object.
     *            </p>
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
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
     *            The ID of the updated <a>Address</a> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobRequest withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a>
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @return <p>
     *         The updated shipping option value of this job's
     *         <a>ShippingDetails</a> object.
     *         </p>
     * @see ShippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a>
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The updated shipping option value of this job's
     *            <a>ShippingDetails</a> object.
     *            </p>
     * @see ShippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a>
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The updated shipping option value of this job's
     *            <a>ShippingDetails</a> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShippingOption
     */
    public UpdateJobRequest withShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
        return this;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a>
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The updated shipping option value of this job's
     *            <a>ShippingDetails</a> object.
     *            </p>
     * @see ShippingOption
     */
    public void setShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a>
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The updated shipping option value of this job's
     *            <a>ShippingDetails</a> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShippingOption
     */
    public UpdateJobRequest withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The updated description of this job's <a>JobMetadata</a> object.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The updated description of this job's <a>JobMetadata</a>
     *            object.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The updated description of this job's <a>JobMetadata</a>
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's
     * <a>JobMetadata</a> object. The 50 TB Snowballs are only available in the
     * US regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, NoPreference
     *
     * @return <p>
     *         The updated <code>SnowballCapacityPreference</code> of this job's
     *         <a>JobMetadata</a> object. The 50 TB Snowballs are only available
     *         in the US regions.
     *         </p>
     * @see SnowballCapacity
     */
    public String getSnowballCapacityPreference() {
        return snowballCapacityPreference;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's
     * <a>JobMetadata</a> object. The 50 TB Snowballs are only available in the
     * US regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The updated <code>SnowballCapacityPreference</code> of this
     *            job's <a>JobMetadata</a> object. The 50 TB Snowballs are only
     *            available in the US regions.
     *            </p>
     * @see SnowballCapacity
     */
    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's
     * <a>JobMetadata</a> object. The 50 TB Snowballs are only available in the
     * US regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The updated <code>SnowballCapacityPreference</code> of this
     *            job's <a>JobMetadata</a> object. The 50 TB Snowballs are only
     *            available in the US regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */
    public UpdateJobRequest withSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
        return this;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's
     * <a>JobMetadata</a> object. The 50 TB Snowballs are only available in the
     * US regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The updated <code>SnowballCapacityPreference</code> of this
     *            job's <a>JobMetadata</a> object. The 50 TB Snowballs are only
     *            available in the US regions.
     *            </p>
     * @see SnowballCapacity
     */
    public void setSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's
     * <a>JobMetadata</a> object. The 50 TB Snowballs are only available in the
     * US regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>T50, T80, T100, T42, T98, NoPreference
     *
     * @param snowballCapacityPreference <p>
     *            The updated <code>SnowballCapacityPreference</code> of this
     *            job's <a>JobMetadata</a> object. The 50 TB Snowballs are only
     *            available in the US regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */
    public UpdateJobRequest withSnowballCapacityPreference(
            SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
        return this;
    }

    /**
     * <p>
     * The updated ID for the forwarding address for a job. This field is not
     * supported in most regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The updated ID for the forwarding address for a job. This field
     *         is not supported in most regions.
     *         </p>
     */
    public String getForwardingAddressId() {
        return forwardingAddressId;
    }

    /**
     * <p>
     * The updated ID for the forwarding address for a job. This field is not
     * supported in most regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - 40<br/>
     * <b>Pattern:
     * </b>ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param forwardingAddressId <p>
     *            The updated ID for the forwarding address for a job. This
     *            field is not supported in most regions.
     *            </p>
     */
    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The updated ID for the forwarding address for a job. This field is not
     * supported in most regions.
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
     *            The updated ID for the forwarding address for a job. This
     *            field is not supported in most regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateJobRequest withForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
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
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: " + getShippingOption() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSnowballCapacityPreference() != null)
            sb.append("SnowballCapacityPreference: " + getSnowballCapacityPreference() + ",");
        if (getForwardingAddressId() != null)
            sb.append("ForwardingAddressId: " + getForwardingAddressId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode
                + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnowballCapacityPreference() == null) ? 0 : getSnowballCapacityPreference()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getForwardingAddressId() == null) ? 0 : getForwardingAddressId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobRequest == false)
            return false;
        UpdateJobRequest other = (UpdateJobRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null
                && other.getNotification().equals(this.getNotification()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSnowballCapacityPreference() == null
                ^ this.getSnowballCapacityPreference() == null)
            return false;
        if (other.getSnowballCapacityPreference() != null
                && other.getSnowballCapacityPreference().equals(
                        this.getSnowballCapacityPreference()) == false)
            return false;
        if (other.getForwardingAddressId() == null ^ this.getForwardingAddressId() == null)
            return false;
        if (other.getForwardingAddressId() != null
                && other.getForwardingAddressId().equals(this.getForwardingAddressId()) == false)
            return false;
        return true;
    }
}
