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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Spot Instance request.
 * </p>
 */
public class SpotInstanceRequest implements Serializable {
    /**
     * <p>
     * If you specified a duration and your Spot Instance request was fulfilled,
     * this is the fixed hourly price in effect for the Spot Instance while it
     * runs.
     * </p>
     */
    private String actualBlockHourlyPrice;

    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched in
     * the same Availability Zone.
     * </p>
     */
    private String availabilityZoneGroup;

    /**
     * <p>
     * The duration for the Spot Instance, in minutes.
     * </p>
     */
    private Integer blockDurationMinutes;

    /**
     * <p>
     * The date and time when the Spot Instance request was created, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     */
    private SpotInstanceStateFault fault;

    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch
     * together and terminate together.
     * </p>
     */
    private String launchGroup;

    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     */
    private LaunchSpecification launchSpecification;

    /**
     * <p>
     * The Availability Zone in which the request is launched.
     * </p>
     */
    private String launchedAvailabilityZone;

    /**
     * <p>
     * The product description associated with the Spot Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     */
    private String spotInstanceRequestId;

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     */
    private String spotPrice;

    /**
     * <p>
     * The state of the Spot Instance request. Spot status information helps
     * track your Spot Instance requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     * >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     */
    private String state;

    /**
     * <p>
     * The status code and status message describing the Spot Instance request.
     * </p>
     */
    private SpotInstanceStatus status;

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     */
    private String type;

    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * request becomes active at this date and time.
     * </p>
     */
    private java.util.Date validFrom;

    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this
     * is a one-time request, it remains active until all instances launch, the
     * request is canceled, or this date is reached. If the request is
     * persistent, it remains active until it is canceled or this date is
     * reached. The default end date is 7 days from the current date.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     */
    private String instanceInterruptionBehavior;

    /**
     * <p>
     * If you specified a duration and your Spot Instance request was fulfilled,
     * this is the fixed hourly price in effect for the Spot Instance while it
     * runs.
     * </p>
     *
     * @return <p>
     *         If you specified a duration and your Spot Instance request was
     *         fulfilled, this is the fixed hourly price in effect for the Spot
     *         Instance while it runs.
     *         </p>
     */
    public String getActualBlockHourlyPrice() {
        return actualBlockHourlyPrice;
    }

    /**
     * <p>
     * If you specified a duration and your Spot Instance request was fulfilled,
     * this is the fixed hourly price in effect for the Spot Instance while it
     * runs.
     * </p>
     *
     * @param actualBlockHourlyPrice <p>
     *            If you specified a duration and your Spot Instance request was
     *            fulfilled, this is the fixed hourly price in effect for the
     *            Spot Instance while it runs.
     *            </p>
     */
    public void setActualBlockHourlyPrice(String actualBlockHourlyPrice) {
        this.actualBlockHourlyPrice = actualBlockHourlyPrice;
    }

    /**
     * <p>
     * If you specified a duration and your Spot Instance request was fulfilled,
     * this is the fixed hourly price in effect for the Spot Instance while it
     * runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actualBlockHourlyPrice <p>
     *            If you specified a duration and your Spot Instance request was
     *            fulfilled, this is the fixed hourly price in effect for the
     *            Spot Instance while it runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withActualBlockHourlyPrice(String actualBlockHourlyPrice) {
        this.actualBlockHourlyPrice = actualBlockHourlyPrice;
        return this;
    }

    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched in
     * the same Availability Zone.
     * </p>
     *
     * @return <p>
     *         The Availability Zone group. If you specify the same Availability
     *         Zone group for all Spot Instance requests, all Spot Instances are
     *         launched in the same Availability Zone.
     *         </p>
     */
    public String getAvailabilityZoneGroup() {
        return availabilityZoneGroup;
    }

    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched in
     * the same Availability Zone.
     * </p>
     *
     * @param availabilityZoneGroup <p>
     *            The Availability Zone group. If you specify the same
     *            Availability Zone group for all Spot Instance requests, all
     *            Spot Instances are launched in the same Availability Zone.
     *            </p>
     */
    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }

    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched in
     * the same Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneGroup <p>
     *            The Availability Zone group. If you specify the same
     *            Availability Zone group for all Spot Instance requests, all
     *            Spot Instances are launched in the same Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        return this;
    }

    /**
     * <p>
     * The duration for the Spot Instance, in minutes.
     * </p>
     *
     * @return <p>
     *         The duration for the Spot Instance, in minutes.
     *         </p>
     */
    public Integer getBlockDurationMinutes() {
        return blockDurationMinutes;
    }

    /**
     * <p>
     * The duration for the Spot Instance, in minutes.
     * </p>
     *
     * @param blockDurationMinutes <p>
     *            The duration for the Spot Instance, in minutes.
     *            </p>
     */
    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * The duration for the Spot Instance, in minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDurationMinutes <p>
     *            The duration for the Spot Instance, in minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
        return this;
    }

    /**
     * <p>
     * The date and time when the Spot Instance request was created, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The date and time when the Spot Instance request was created, in
     *         UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The date and time when the Spot Instance request was created, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param createTime <p>
     *            The date and time when the Spot Instance request was created,
     *            in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>
     *            HH</i>:<i>MM</i>:<i>SS</i>Z).
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time when the Spot Instance request was created, in UTC
     * format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The date and time when the Spot Instance request was created,
     *            in UTC format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>
     *            HH</i>:<i>MM</i>:<i>SS</i>Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     *
     * @return <p>
     *         The fault codes for the Spot Instance request, if any.
     *         </p>
     */
    public SpotInstanceStateFault getFault() {
        return fault;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     *
     * @param fault <p>
     *            The fault codes for the Spot Instance request, if any.
     *            </p>
     */
    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fault <p>
     *            The fault codes for the Spot Instance request, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withFault(SpotInstanceStateFault fault) {
        this.fault = fault;
        return this;
    }

    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     * </p>
     *
     * @return <p>
     *         The instance ID, if an instance has been launched to fulfill the
     *         Spot Instance request.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     * </p>
     *
     * @param instanceId <p>
     *            The instance ID, if an instance has been launched to fulfill
     *            the Spot Instance request.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The instance ID, if an instance has been launched to fulfill
     *            the Spot Instance request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch
     * together and terminate together.
     * </p>
     *
     * @return <p>
     *         The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together.
     *         </p>
     */
    public String getLaunchGroup() {
        return launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch
     * together and terminate together.
     * </p>
     *
     * @param launchGroup <p>
     *            The instance launch group. Launch groups are Spot Instances
     *            that launch together and terminate together.
     *            </p>
     */
    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch
     * together and terminate together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchGroup <p>
     *            The instance launch group. Launch groups are Spot Instances
     *            that launch together and terminate together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
        return this;
    }

    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     *
     * @return <p>
     *         Additional information for launching instances.
     *         </p>
     */
    public LaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }

    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     *
     * @param launchSpecification <p>
     *            Additional information for launching instances.
     *            </p>
     */
    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchSpecification <p>
     *            Additional information for launching instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the request is launched.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which the request is launched.
     *         </p>
     */
    public String getLaunchedAvailabilityZone() {
        return launchedAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the request is launched.
     * </p>
     *
     * @param launchedAvailabilityZone <p>
     *            The Availability Zone in which the request is launched.
     *            </p>
     */
    public void setLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        this.launchedAvailabilityZone = launchedAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the request is launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchedAvailabilityZone <p>
     *            The Availability Zone in which the request is launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        this.launchedAvailabilityZone = launchedAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * The product description associated with the Spot Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @return <p>
     *         The product description associated with the Spot Instance.
     *         </p>
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The product description associated with the Spot Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The product description associated with the Spot Instance.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The product description associated with the Spot Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The product description associated with the Spot Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public SpotInstanceRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The product description associated with the Spot Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The product description associated with the Spot Instance.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }

    /**
     * <p>
     * The product description associated with the Spot Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The product description associated with the Spot Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public SpotInstanceRequest withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     *
     * @return <p>
     *         The ID of the Spot Instance request.
     *         </p>
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     *
     * @param spotInstanceRequestId <p>
     *            The ID of the Spot Instance request.
     *            </p>
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotInstanceRequestId <p>
     *            The ID of the Spot Instance request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     *
     * @return <p>
     *         The maximum price per hour that you are willing to pay for a Spot
     *         Instance.
     *         </p>
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     *
     * @param spotPrice <p>
     *            The maximum price per hour that you are willing to pay for a
     *            Spot Instance.
     *            </p>
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotPrice <p>
     *            The maximum price per hour that you are willing to pay for a
     *            Spot Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance request. Spot status information helps
     * track your Spot Instance requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     * >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @return <p>
     *         The state of the Spot Instance request. Spot status information
     *         helps track your Spot Instance requests. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     *         >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux
     *         Instances</i>.
     *         </p>
     * @see SpotInstanceState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the Spot Instance request. Spot status information helps
     * track your Spot Instance requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     * >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state <p>
     *            The state of the Spot Instance request. Spot status
     *            information helps track your Spot Instance requests. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     *            >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux
     *            Instances</i>.
     *            </p>
     * @see SpotInstanceState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Spot Instance request. Spot status information helps
     * track your Spot Instance requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     * >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state <p>
     *            The state of the Spot Instance request. Spot status
     *            information helps track your Spot Instance requests. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     *            >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux
     *            Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceState
     */
    public SpotInstanceRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance request. Spot status information helps
     * track your Spot Instance requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     * >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state <p>
     *            The state of the Spot Instance request. Spot status
     *            information helps track your Spot Instance requests. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     *            >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux
     *            Instances</i>.
     *            </p>
     * @see SpotInstanceState
     */
    public void setState(SpotInstanceState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the Spot Instance request. Spot status information helps
     * track your Spot Instance requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     * >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state <p>
     *            The state of the Spot Instance request. Spot status
     *            information helps track your Spot Instance requests. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html"
     *            >Spot Status</a> in the <i>Amazon EC2 User Guide for Linux
     *            Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceState
     */
    public SpotInstanceRequest withState(SpotInstanceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status code and status message describing the Spot Instance request.
     * </p>
     *
     * @return <p>
     *         The status code and status message describing the Spot Instance
     *         request.
     *         </p>
     */
    public SpotInstanceStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status code and status message describing the Spot Instance request.
     * </p>
     *
     * @param status <p>
     *            The status code and status message describing the Spot
     *            Instance request.
     *            </p>
     */
    public void setStatus(SpotInstanceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code and status message describing the Spot Instance request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status code and status message describing the Spot
     *            Instance request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withStatus(SpotInstanceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
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
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withTags(Tag... tags) {
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
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return <p>
     *         The Spot Instance request type.
     *         </p>
     * @see SpotInstanceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type <p>
     *            The Spot Instance request type.
     *            </p>
     * @see SpotInstanceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type <p>
     *            The Spot Instance request type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceType
     */
    public SpotInstanceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type <p>
     *            The Spot Instance request type.
     *            </p>
     * @see SpotInstanceType
     */
    public void setType(SpotInstanceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type <p>
     *            The Spot Instance request type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceType
     */
    public SpotInstanceRequest withType(SpotInstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * request becomes active at this date and time.
     * </p>
     *
     * @return <p>
     *         The start date of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         The request becomes active at this date and time.
     *         </p>
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }

    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * request becomes active at this date and time.
     * </p>
     *
     * @param validFrom <p>
     *            The start date of the request, in UTC format (for example,
     *            <i>YYYY
     *            </i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     *            request becomes active at this date and time.
     *            </p>
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * request becomes active at this date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validFrom <p>
     *            The start date of the request, in UTC format (for example,
     *            <i>YYYY
     *            </i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     *            request becomes active at this date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this
     * is a one-time request, it remains active until all instances launch, the
     * request is canceled, or this date is reached. If the request is
     * persistent, it remains active until it is canceled or this date is
     * reached. The default end date is 7 days from the current date.
     * </p>
     *
     * @return <p>
     *         The end date of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         If this is a one-time request, it remains active until all
     *         instances launch, the request is canceled, or this date is
     *         reached. If the request is persistent, it remains active until it
     *         is canceled or this date is reached. The default end date is 7
     *         days from the current date.
     *         </p>
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this
     * is a one-time request, it remains active until all instances launch, the
     * request is canceled, or this date is reached. If the request is
     * persistent, it remains active until it is canceled or this date is
     * reached. The default end date is 7 days from the current date.
     * </p>
     *
     * @param validUntil <p>
     *            The end date of the request, in UTC format (for example,
     *            <i>YYYY
     *            </i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If
     *            this is a one-time request, it remains active until all
     *            instances launch, the request is canceled, or this date is
     *            reached. If the request is persistent, it remains active until
     *            it is canceled or this date is reached. The default end date
     *            is 7 days from the current date.
     *            </p>
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this
     * is a one-time request, it remains active until all instances launch, the
     * request is canceled, or this date is reached. If the request is
     * persistent, it remains active until it is canceled or this date is
     * reached. The default end date is 7 days from the current date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUntil <p>
     *            The end date of the request, in UTC format (for example,
     *            <i>YYYY
     *            </i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If
     *            this is a one-time request, it remains active until all
     *            instances launch, the request is canceled, or this date is
     *            reached. If the request is persistent, it remains active until
     *            it is canceled or this date is reached. The default end date
     *            is 7 days from the current date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotInstanceRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @return <p>
     *         The behavior when a Spot Instance is interrupted.
     *         </p>
     * @see InstanceInterruptionBehavior
     */
    public String getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @see InstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInterruptionBehavior
     */
    public SpotInstanceRequest withInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @see InstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(
            InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInterruptionBehavior
     */
    public SpotInstanceRequest withInstanceInterruptionBehavior(
            InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
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
        if (getActualBlockHourlyPrice() != null)
            sb.append("ActualBlockHourlyPrice: " + getActualBlockHourlyPrice() + ",");
        if (getAvailabilityZoneGroup() != null)
            sb.append("AvailabilityZoneGroup: " + getAvailabilityZoneGroup() + ",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: " + getBlockDurationMinutes() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getFault() != null)
            sb.append("Fault: " + getFault() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getLaunchGroup() != null)
            sb.append("LaunchGroup: " + getLaunchGroup() + ",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getLaunchedAvailabilityZone() != null)
            sb.append("LaunchedAvailabilityZone: " + getLaunchedAvailabilityZone() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getSpotInstanceRequestId() != null)
            sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: " + getInstanceInterruptionBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getActualBlockHourlyPrice() == null) ? 0 : getActualBlockHourlyPrice()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchGroup() == null) ? 0 : getLaunchGroup().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchedAvailabilityZone() == null) ? 0 : getLaunchedAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInterruptionBehavior() == null) ? 0
                        : getInstanceInterruptionBehavior().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotInstanceRequest == false)
            return false;
        SpotInstanceRequest other = (SpotInstanceRequest) obj;

        if (other.getActualBlockHourlyPrice() == null ^ this.getActualBlockHourlyPrice() == null)
            return false;
        if (other.getActualBlockHourlyPrice() != null
                && other.getActualBlockHourlyPrice().equals(this.getActualBlockHourlyPrice()) == false)
            return false;
        if (other.getAvailabilityZoneGroup() == null ^ this.getAvailabilityZoneGroup() == null)
            return false;
        if (other.getAvailabilityZoneGroup() != null
                && other.getAvailabilityZoneGroup().equals(this.getAvailabilityZoneGroup()) == false)
            return false;
        if (other.getBlockDurationMinutes() == null ^ this.getBlockDurationMinutes() == null)
            return false;
        if (other.getBlockDurationMinutes() != null
                && other.getBlockDurationMinutes().equals(this.getBlockDurationMinutes()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getFault() == null ^ this.getFault() == null)
            return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getLaunchGroup() == null ^ this.getLaunchGroup() == null)
            return false;
        if (other.getLaunchGroup() != null
                && other.getLaunchGroup().equals(this.getLaunchGroup()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null
                && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        if (other.getLaunchedAvailabilityZone() == null
                ^ this.getLaunchedAvailabilityZone() == null)
            return false;
        if (other.getLaunchedAvailabilityZone() != null
                && other.getLaunchedAvailabilityZone().equals(this.getLaunchedAvailabilityZone()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null)
            return false;
        if (other.getSpotInstanceRequestId() != null
                && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null
                && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValidFrom() == null ^ this.getValidFrom() == null)
            return false;
        if (other.getValidFrom() != null
                && other.getValidFrom().equals(this.getValidFrom()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null
                && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getInstanceInterruptionBehavior() == null
                ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null
                && other.getInstanceInterruptionBehavior().equals(
                        this.getInstanceInterruptionBehavior()) == false)
            return false;
        return true;
    }
}
