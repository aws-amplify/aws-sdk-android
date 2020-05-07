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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Spot Instance request.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot
 * Instance Requests</a> in the <i>Amazon EC2 User Guide for Linux
 * Instances</i>.
 * </p>
 */
public class RequestSpotInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request,
     * all Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to requests
     * for Spot Instances of the same instance type. Any additional Spot
     * Instance requests that are specified with the same Availability Zone
     * group name are launched in that same Availability Zone, as long as at
     * least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group
     * that you specify for a new Spot Instance request (all instances are
     * terminated, the request is expired, or the maximum price you specified
     * falls below current Spot price), then Amazon EC2 launches the instance in
     * any Availability Zone where the constraint can be met. Consequently, the
     * subsequent set of Spot Instances could be placed in a different zone from
     * the original request, even if you specified the same Availability Zone
     * group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     */
    private String availabilityZoneGroup;

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot Instance receives its
     * instance ID. At the end of the duration period, Amazon EC2 marks the Spot
     * Instance for termination and provides a Spot Instance termination notice,
     * which gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * You can't specify an Availability Zone group or a launch group if you
     * specify a duration.
     * </p>
     */
    private Integer blockDurationMinutes;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch
     * together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     */
    private String launchGroup;

    /**
     * <p>
     * The launch specification.
     * </p>
     */
    private RequestSpotLaunchSpecification launchSpecification;

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     */
    private String spotPrice;

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     */
    private String type;

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request
     * becomes active at this date and time and remains active until all
     * instances launch, the request expires, or the request is canceled. If the
     * request is persistent, the request becomes active at this date and time
     * and remains active until it expires or is canceled.
     * </p>
     * <p>
     * The specified start date and time cannot be equal to the current date and
     * time. You must specify a start date and time that occurs after the
     * current date and time.
     * </p>
     */
    private java.util.Date validFrom;

    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request
     * remains active until all instances launch, the request is canceled, or
     * this date is reached. If the request is persistent, it remains active
     * until it is canceled or this date is reached. The default end date is 7
     * days from the current date.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     */
    private String instanceInterruptionBehavior;

    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request,
     * all Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to requests
     * for Spot Instances of the same instance type. Any additional Spot
     * Instance requests that are specified with the same Availability Zone
     * group name are launched in that same Availability Zone, as long as at
     * least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group
     * that you specify for a new Spot Instance request (all instances are
     * terminated, the request is expired, or the maximum price you specified
     * falls below current Spot price), then Amazon EC2 launches the instance in
     * any Availability Zone where the constraint can be met. Consequently, the
     * subsequent set of Spot Instances could be placed in a different zone from
     * the original request, even if you specified the same Availability Zone
     * group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     *
     * @return <p>
     *         The user-specified name for a logical grouping of requests.
     *         </p>
     *         <p>
     *         When you specify an Availability Zone group in a Spot Instance
     *         request, all Spot Instances in the request are launched in the
     *         same Availability Zone. Instance proximity is maintained with
     *         this parameter, but the choice of Availability Zone is not. The
     *         group applies only to requests for Spot Instances of the same
     *         instance type. Any additional Spot Instance requests that are
     *         specified with the same Availability Zone group name are launched
     *         in that same Availability Zone, as long as at least one instance
     *         from the group is still active.
     *         </p>
     *         <p>
     *         If there is no active instance running in the Availability Zone
     *         group that you specify for a new Spot Instance request (all
     *         instances are terminated, the request is expired, or the maximum
     *         price you specified falls below current Spot price), then Amazon
     *         EC2 launches the instance in any Availability Zone where the
     *         constraint can be met. Consequently, the subsequent set of Spot
     *         Instances could be placed in a different zone from the original
     *         request, even if you specified the same Availability Zone group.
     *         </p>
     *         <p>
     *         Default: Instances are launched in any available Availability
     *         Zone.
     *         </p>
     */
    public String getAvailabilityZoneGroup() {
        return availabilityZoneGroup;
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request,
     * all Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to requests
     * for Spot Instances of the same instance type. Any additional Spot
     * Instance requests that are specified with the same Availability Zone
     * group name are launched in that same Availability Zone, as long as at
     * least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group
     * that you specify for a new Spot Instance request (all instances are
     * terminated, the request is expired, or the maximum price you specified
     * falls below current Spot price), then Amazon EC2 launches the instance in
     * any Availability Zone where the constraint can be met. Consequently, the
     * subsequent set of Spot Instances could be placed in a different zone from
     * the original request, even if you specified the same Availability Zone
     * group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     *
     * @param availabilityZoneGroup <p>
     *            The user-specified name for a logical grouping of requests.
     *            </p>
     *            <p>
     *            When you specify an Availability Zone group in a Spot Instance
     *            request, all Spot Instances in the request are launched in the
     *            same Availability Zone. Instance proximity is maintained with
     *            this parameter, but the choice of Availability Zone is not.
     *            The group applies only to requests for Spot Instances of the
     *            same instance type. Any additional Spot Instance requests that
     *            are specified with the same Availability Zone group name are
     *            launched in that same Availability Zone, as long as at least
     *            one instance from the group is still active.
     *            </p>
     *            <p>
     *            If there is no active instance running in the Availability
     *            Zone group that you specify for a new Spot Instance request
     *            (all instances are terminated, the request is expired, or the
     *            maximum price you specified falls below current Spot price),
     *            then Amazon EC2 launches the instance in any Availability Zone
     *            where the constraint can be met. Consequently, the subsequent
     *            set of Spot Instances could be placed in a different zone from
     *            the original request, even if you specified the same
     *            Availability Zone group.
     *            </p>
     *            <p>
     *            Default: Instances are launched in any available Availability
     *            Zone.
     *            </p>
     */
    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request,
     * all Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to requests
     * for Spot Instances of the same instance type. Any additional Spot
     * Instance requests that are specified with the same Availability Zone
     * group name are launched in that same Availability Zone, as long as at
     * least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group
     * that you specify for a new Spot Instance request (all instances are
     * terminated, the request is expired, or the maximum price you specified
     * falls below current Spot price), then Amazon EC2 launches the instance in
     * any Availability Zone where the constraint can be met. Consequently, the
     * subsequent set of Spot Instances could be placed in a different zone from
     * the original request, even if you specified the same Availability Zone
     * group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneGroup <p>
     *            The user-specified name for a logical grouping of requests.
     *            </p>
     *            <p>
     *            When you specify an Availability Zone group in a Spot Instance
     *            request, all Spot Instances in the request are launched in the
     *            same Availability Zone. Instance proximity is maintained with
     *            this parameter, but the choice of Availability Zone is not.
     *            The group applies only to requests for Spot Instances of the
     *            same instance type. Any additional Spot Instance requests that
     *            are specified with the same Availability Zone group name are
     *            launched in that same Availability Zone, as long as at least
     *            one instance from the group is still active.
     *            </p>
     *            <p>
     *            If there is no active instance running in the Availability
     *            Zone group that you specify for a new Spot Instance request
     *            (all instances are terminated, the request is expired, or the
     *            maximum price you specified falls below current Spot price),
     *            then Amazon EC2 launches the instance in any Availability Zone
     *            where the constraint can be met. Consequently, the subsequent
     *            set of Spot Instances could be placed in a different zone from
     *            the original request, even if you specified the same
     *            Availability Zone group.
     *            </p>
     *            <p>
     *            Default: Instances are launched in any available Availability
     *            Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        return this;
    }

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot Instance receives its
     * instance ID. At the end of the duration period, Amazon EC2 marks the Spot
     * Instance for termination and provides a Spot Instance termination notice,
     * which gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * You can't specify an Availability Zone group or a launch group if you
     * specify a duration.
     * </p>
     *
     * @return <p>
     *         The required duration for the Spot Instances (also known as Spot
     *         blocks), in minutes. This value must be a multiple of 60 (60,
     *         120, 180, 240, 300, or 360).
     *         </p>
     *         <p>
     *         The duration period starts as soon as your Spot Instance receives
     *         its instance ID. At the end of the duration period, Amazon EC2
     *         marks the Spot Instance for termination and provides a Spot
     *         Instance termination notice, which gives the instance a
     *         two-minute warning before it terminates.
     *         </p>
     *         <p>
     *         You can't specify an Availability Zone group or a launch group if
     *         you specify a duration.
     *         </p>
     */
    public Integer getBlockDurationMinutes() {
        return blockDurationMinutes;
    }

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot Instance receives its
     * instance ID. At the end of the duration period, Amazon EC2 marks the Spot
     * Instance for termination and provides a Spot Instance termination notice,
     * which gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * You can't specify an Availability Zone group or a launch group if you
     * specify a duration.
     * </p>
     *
     * @param blockDurationMinutes <p>
     *            The required duration for the Spot Instances (also known as
     *            Spot blocks), in minutes. This value must be a multiple of 60
     *            (60, 120, 180, 240, 300, or 360).
     *            </p>
     *            <p>
     *            The duration period starts as soon as your Spot Instance
     *            receives its instance ID. At the end of the duration period,
     *            Amazon EC2 marks the Spot Instance for termination and
     *            provides a Spot Instance termination notice, which gives the
     *            instance a two-minute warning before it terminates.
     *            </p>
     *            <p>
     *            You can't specify an Availability Zone group or a launch group
     *            if you specify a duration.
     *            </p>
     */
    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot Instance receives its
     * instance ID. At the end of the duration period, Amazon EC2 marks the Spot
     * Instance for termination and provides a Spot Instance termination notice,
     * which gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * You can't specify an Availability Zone group or a launch group if you
     * specify a duration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDurationMinutes <p>
     *            The required duration for the Spot Instances (also known as
     *            Spot blocks), in minutes. This value must be a multiple of 60
     *            (60, 120, 180, 240, 300, or 360).
     *            </p>
     *            <p>
     *            The duration period starts as soon as your Spot Instance
     *            receives its instance ID. At the end of the duration period,
     *            Amazon EC2 marks the Spot Instance for termination and
     *            provides a Spot Instance termination notice, which gives the
     *            instance a two-minute warning before it terminates.
     *            </p>
     *            <p>
     *            You can't specify an Availability Zone group or a launch group
     *            if you specify a duration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide
     *         for Linux Instances</i>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     *
     * @return <p>
     *         The maximum number of Spot Instances to launch.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     *
     * @param instanceCount <p>
     *            The maximum number of Spot Instances to launch.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The maximum number of Spot Instances to launch.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch
     * together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     *
     * @return <p>
     *         The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together.
     *         </p>
     *         <p>
     *         Default: Instances are launched and terminated individually
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
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     *
     * @param launchGroup <p>
     *            The instance launch group. Launch groups are Spot Instances
     *            that launch together and terminate together.
     *            </p>
     *            <p>
     *            Default: Instances are launched and terminated individually
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
     * Default: Instances are launched and terminated individually
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchGroup <p>
     *            The instance launch group. Launch groups are Spot Instances
     *            that launch together and terminate together.
     *            </p>
     *            <p>
     *            Default: Instances are launched and terminated individually
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
        return this;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     *
     * @return <p>
     *         The launch specification.
     *         </p>
     */
    public RequestSpotLaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     *
     * @param launchSpecification <p>
     *            The launch specification.
     *            </p>
     */
    public void setLaunchSpecification(RequestSpotLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchSpecification <p>
     *            The launch specification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withLaunchSpecification(
            RequestSpotLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     *
     * @return <p>
     *         The maximum price per hour that you are willing to pay for a Spot
     *         Instance. The default is the On-Demand price.
     *         </p>
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     *
     * @param spotPrice <p>
     *            The maximum price per hour that you are willing to pay for a
     *            Spot Instance. The default is the On-Demand price.
     *            </p>
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotPrice <p>
     *            The maximum price per hour that you are willing to pay for a
     *            Spot Instance. The default is the On-Demand price.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return <p>
     *         The Spot Instance request type.
     *         </p>
     *         <p>
     *         Default: <code>one-time</code>
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
     * Default: <code>one-time</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type <p>
     *            The Spot Instance request type.
     *            </p>
     *            <p>
     *            Default: <code>one-time</code>
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
     * Default: <code>one-time</code>
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
     *            <p>
     *            Default: <code>one-time</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceType
     */
    public RequestSpotInstancesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type <p>
     *            The Spot Instance request type.
     *            </p>
     *            <p>
     *            Default: <code>one-time</code>
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
     * Default: <code>one-time</code>
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
     *            <p>
     *            Default: <code>one-time</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceType
     */
    public RequestSpotInstancesRequest withType(SpotInstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request
     * becomes active at this date and time and remains active until all
     * instances launch, the request expires, or the request is canceled. If the
     * request is persistent, the request becomes active at this date and time
     * and remains active until it expires or is canceled.
     * </p>
     * <p>
     * The specified start date and time cannot be equal to the current date and
     * time. You must specify a start date and time that occurs after the
     * current date and time.
     * </p>
     *
     * @return <p>
     *         The start date of the request. If this is a one-time request, the
     *         request becomes active at this date and time and remains active
     *         until all instances launch, the request expires, or the request
     *         is canceled. If the request is persistent, the request becomes
     *         active at this date and time and remains active until it expires
     *         or is canceled.
     *         </p>
     *         <p>
     *         The specified start date and time cannot be equal to the current
     *         date and time. You must specify a start date and time that occurs
     *         after the current date and time.
     *         </p>
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request
     * becomes active at this date and time and remains active until all
     * instances launch, the request expires, or the request is canceled. If the
     * request is persistent, the request becomes active at this date and time
     * and remains active until it expires or is canceled.
     * </p>
     * <p>
     * The specified start date and time cannot be equal to the current date and
     * time. You must specify a start date and time that occurs after the
     * current date and time.
     * </p>
     *
     * @param validFrom <p>
     *            The start date of the request. If this is a one-time request,
     *            the request becomes active at this date and time and remains
     *            active until all instances launch, the request expires, or the
     *            request is canceled. If the request is persistent, the request
     *            becomes active at this date and time and remains active until
     *            it expires or is canceled.
     *            </p>
     *            <p>
     *            The specified start date and time cannot be equal to the
     *            current date and time. You must specify a start date and time
     *            that occurs after the current date and time.
     *            </p>
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request
     * becomes active at this date and time and remains active until all
     * instances launch, the request expires, or the request is canceled. If the
     * request is persistent, the request becomes active at this date and time
     * and remains active until it expires or is canceled.
     * </p>
     * <p>
     * The specified start date and time cannot be equal to the current date and
     * time. You must specify a start date and time that occurs after the
     * current date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validFrom <p>
     *            The start date of the request. If this is a one-time request,
     *            the request becomes active at this date and time and remains
     *            active until all instances launch, the request expires, or the
     *            request is canceled. If the request is persistent, the request
     *            becomes active at this date and time and remains active until
     *            it expires or is canceled.
     *            </p>
     *            <p>
     *            The specified start date and time cannot be equal to the
     *            current date and time. You must specify a start date and time
     *            that occurs after the current date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request
     * remains active until all instances launch, the request is canceled, or
     * this date is reached. If the request is persistent, it remains active
     * until it is canceled or this date is reached. The default end date is 7
     * days from the current date.
     * </p>
     *
     * @return <p>
     *         The end date of the request. If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent,
     *         it remains active until it is canceled or this date is reached.
     *         The default end date is 7 days from the current date.
     *         </p>
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }

    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request
     * remains active until all instances launch, the request is canceled, or
     * this date is reached. If the request is persistent, it remains active
     * until it is canceled or this date is reached. The default end date is 7
     * days from the current date.
     * </p>
     *
     * @param validUntil <p>
     *            The end date of the request. If this is a one-time request,
     *            the request remains active until all instances launch, the
     *            request is canceled, or this date is reached. If the request
     *            is persistent, it remains active until it is canceled or this
     *            date is reached. The default end date is 7 days from the
     *            current date.
     *            </p>
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request
     * remains active until all instances launch, the request is canceled, or
     * this date is reached. If the request is persistent, it remains active
     * until it is canceled or this date is reached. The default end date is 7
     * days from the current date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUntil <p>
     *            The end date of the request. If this is a one-time request,
     *            the request remains active until all instances launch, the
     *            request is canceled, or this date is reached. If the request
     *            is persistent, it remains active until it is canceled or this
     *            date is reached. The default end date is 7 days from the
     *            current date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotInstancesRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @return <p>
     *         The behavior when a Spot Instance is interrupted. The default is
     *         <code>terminate</code>.
     *         </p>
     * @see InstanceInterruptionBehavior
     */
    public String getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @see InstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInterruptionBehavior
     */
    public RequestSpotInstancesRequest withInstanceInterruptionBehavior(
            String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @see InstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(
            InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInterruptionBehavior
     */
    public RequestSpotInstancesRequest withInstanceInterruptionBehavior(
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
        if (getAvailabilityZoneGroup() != null)
            sb.append("AvailabilityZoneGroup: " + getAvailabilityZoneGroup() + ",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: " + getBlockDurationMinutes() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getLaunchGroup() != null)
            sb.append("LaunchGroup: " + getLaunchGroup() + ",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
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
                + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchGroup() == null) ? 0 : getLaunchGroup().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
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

        if (obj instanceof RequestSpotInstancesRequest == false)
            return false;
        RequestSpotInstancesRequest other = (RequestSpotInstancesRequest) obj;

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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
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
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null
                && other.getSpotPrice().equals(this.getSpotPrice()) == false)
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
