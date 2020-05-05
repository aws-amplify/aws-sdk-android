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
 * Launches an EC2 Fleet.
 * </p>
 * <p>
 * You can create a single EC2 Fleet that includes multiple launch
 * specifications that vary by instance type, AMI, Availability Zone, or subnet.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html"
 * >Launching an EC2 Fleet</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class CreateFleetRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     */
    private SpotOptionsRequest spotOptions;

    /**
     * <p>
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     * </p>
     */
    private OnDemandOptionsRequest onDemandOptions;

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     */
    private String excessCapacityTerminationPolicy;

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     */
    private java.util.List<FleetLaunchTemplateConfigRequest> launchTemplateConfigs;

    /**
     * <p>
     * The number of units to request.
     * </p>
     */
    private TargetCapacitySpecificationRequest targetCapacitySpecification;

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     */
    private Boolean terminateInstancesWithExpiration;

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous
     * request for your desired capacity, and maintains it by replenishing
     * interrupted Spot Instances (<code>maintain</code>). A value of
     * <code>instant</code> places a synchronous one-time request, and returns
     * errors for any instances that could not be launched. A value of
     * <code>request</code> places an asynchronous one-time request without
     * maintaining capacity or submitting requests in alternative capacity pools
     * if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     */
    private String type;

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     */
    private java.util.Date validFrom;

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new EC2 Fleet requests are placed or able to fulfill the
     * request. If no value is specified, the request remains until you cancel
     * it.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     */
    private Boolean replaceUnhealthyInstances;

    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The
     * value for <code>ResourceType</code> must be <code>fleet</code>, otherwise
     * the fleet request fails. To tag instances at launch, specify the tags in
     * the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a>. For information about tagging after launch, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

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
    public CreateFleetRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         Describes the configuration of Spot Instances in an EC2 Fleet.
     *         </p>
     */
    public SpotOptionsRequest getSpotOptions() {
        return spotOptions;
    }

    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     *
     * @param spotOptions <p>
     *            Describes the configuration of Spot Instances in an EC2 Fleet.
     *            </p>
     */
    public void setSpotOptions(SpotOptionsRequest spotOptions) {
        this.spotOptions = spotOptions;
    }

    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotOptions <p>
     *            Describes the configuration of Spot Instances in an EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withSpotOptions(SpotOptionsRequest spotOptions) {
        this.spotOptions = spotOptions;
        return this;
    }

    /**
     * <p>
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         Describes the configuration of On-Demand Instances in an EC2
     *         Fleet.
     *         </p>
     */
    public OnDemandOptionsRequest getOnDemandOptions() {
        return onDemandOptions;
    }

    /**
     * <p>
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     * </p>
     *
     * @param onDemandOptions <p>
     *            Describes the configuration of On-Demand Instances in an EC2
     *            Fleet.
     *            </p>
     */
    public void setOnDemandOptions(OnDemandOptionsRequest onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
    }

    /**
     * <p>
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandOptions <p>
     *            Describes the configuration of On-Demand Instances in an EC2
     *            Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withOnDemandOptions(OnDemandOptionsRequest onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @return <p>
     *         Indicates whether running instances should be terminated if the
     *         total target capacity of the EC2 Fleet is decreased below the
     *         current size of the EC2 Fleet.
     *         </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */
    public CreateFleetRequest withExcessCapacityTerminationPolicy(
            String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(
            FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */
    public CreateFleetRequest withExcessCapacityTerminationPolicy(
            FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The configuration for the EC2 Fleet.
     *         </p>
     */
    public java.util.List<FleetLaunchTemplateConfigRequest> getLaunchTemplateConfigs() {
        return launchTemplateConfigs;
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     *
     * @param launchTemplateConfigs <p>
     *            The configuration for the EC2 Fleet.
     *            </p>
     */
    public void setLaunchTemplateConfigs(
            java.util.Collection<FleetLaunchTemplateConfigRequest> launchTemplateConfigs) {
        if (launchTemplateConfigs == null) {
            this.launchTemplateConfigs = null;
            return;
        }

        this.launchTemplateConfigs = new java.util.ArrayList<FleetLaunchTemplateConfigRequest>(
                launchTemplateConfigs);
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateConfigs <p>
     *            The configuration for the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withLaunchTemplateConfigs(
            FleetLaunchTemplateConfigRequest... launchTemplateConfigs) {
        if (getLaunchTemplateConfigs() == null) {
            this.launchTemplateConfigs = new java.util.ArrayList<FleetLaunchTemplateConfigRequest>(
                    launchTemplateConfigs.length);
        }
        for (FleetLaunchTemplateConfigRequest value : launchTemplateConfigs) {
            this.launchTemplateConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateConfigs <p>
     *            The configuration for the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withLaunchTemplateConfigs(
            java.util.Collection<FleetLaunchTemplateConfigRequest> launchTemplateConfigs) {
        setLaunchTemplateConfigs(launchTemplateConfigs);
        return this;
    }

    /**
     * <p>
     * The number of units to request.
     * </p>
     *
     * @return <p>
     *         The number of units to request.
     *         </p>
     */
    public TargetCapacitySpecificationRequest getTargetCapacitySpecification() {
        return targetCapacitySpecification;
    }

    /**
     * <p>
     * The number of units to request.
     * </p>
     *
     * @param targetCapacitySpecification <p>
     *            The number of units to request.
     *            </p>
     */
    public void setTargetCapacitySpecification(
            TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    /**
     * <p>
     * The number of units to request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCapacitySpecification <p>
     *            The number of units to request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withTargetCapacitySpecification(
            TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     *
     * @return <p>
     *         Indicates whether running instances should be terminated when the
     *         EC2 Fleet expires.
     *         </p>
     */
    public Boolean isTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     *
     * @return <p>
     *         Indicates whether running instances should be terminated when the
     *         EC2 Fleet expires.
     *         </p>
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     *
     * @param terminateInstancesWithExpiration <p>
     *            Indicates whether running instances should be terminated when
     *            the EC2 Fleet expires.
     *            </p>
     */
    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2
     * Fleet expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateInstancesWithExpiration <p>
     *            Indicates whether running instances should be terminated when
     *            the EC2 Fleet expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withTerminateInstancesWithExpiration(
            Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous
     * request for your desired capacity, and maintains it by replenishing
     * interrupted Spot Instances (<code>maintain</code>). A value of
     * <code>instant</code> places a synchronous one-time request, and returns
     * errors for any instances that could not be launched. A value of
     * <code>request</code> places an asynchronous one-time request without
     * maintaining capacity or submitting requests in alternative capacity pools
     * if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @return <p>
     *         The type of the request. By default, the EC2 Fleet places an
     *         asynchronous request for your desired capacity, and maintains it
     *         by replenishing interrupted Spot Instances (<code>maintain</code>
     *         ). A value of <code>instant</code> places a synchronous one-time
     *         request, and returns errors for any instances that could not be
     *         launched. A value of <code>request</code> places an asynchronous
     *         one-time request without maintaining capacity or submitting
     *         requests in alternative capacity pools if capacity is
     *         unavailable. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *         >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     * @see FleetType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous
     * request for your desired capacity, and maintains it by replenishing
     * interrupted Spot Instances (<code>maintain</code>). A value of
     * <code>instant</code> places a synchronous one-time request, and returns
     * errors for any instances that could not be launched. A value of
     * <code>request</code> places an asynchronous one-time request without
     * maintaining capacity or submitting requests in alternative capacity pools
     * if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of the request. By default, the EC2 Fleet places an
     *            asynchronous request for your desired capacity, and maintains
     *            it by replenishing interrupted Spot Instances (
     *            <code>maintain</code>). A value of <code>instant</code> places
     *            a synchronous one-time request, and returns errors for any
     *            instances that could not be launched. A value of
     *            <code>request</code> places an asynchronous one-time request
     *            without maintaining capacity or submitting requests in
     *            alternative capacity pools if capacity is unavailable. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *            >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @see FleetType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous
     * request for your desired capacity, and maintains it by replenishing
     * interrupted Spot Instances (<code>maintain</code>). A value of
     * <code>instant</code> places a synchronous one-time request, and returns
     * errors for any instances that could not be launched. A value of
     * <code>request</code> places an asynchronous one-time request without
     * maintaining capacity or submitting requests in alternative capacity pools
     * if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of the request. By default, the EC2 Fleet places an
     *            asynchronous request for your desired capacity, and maintains
     *            it by replenishing interrupted Spot Instances (
     *            <code>maintain</code>). A value of <code>instant</code> places
     *            a synchronous one-time request, and returns errors for any
     *            instances that could not be launched. A value of
     *            <code>request</code> places an asynchronous one-time request
     *            without maintaining capacity or submitting requests in
     *            alternative capacity pools if capacity is unavailable. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *            >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetType
     */
    public CreateFleetRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous
     * request for your desired capacity, and maintains it by replenishing
     * interrupted Spot Instances (<code>maintain</code>). A value of
     * <code>instant</code> places a synchronous one-time request, and returns
     * errors for any instances that could not be launched. A value of
     * <code>request</code> places an asynchronous one-time request without
     * maintaining capacity or submitting requests in alternative capacity pools
     * if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of the request. By default, the EC2 Fleet places an
     *            asynchronous request for your desired capacity, and maintains
     *            it by replenishing interrupted Spot Instances (
     *            <code>maintain</code>). A value of <code>instant</code> places
     *            a synchronous one-time request, and returns errors for any
     *            instances that could not be launched. A value of
     *            <code>request</code> places an asynchronous one-time request
     *            without maintaining capacity or submitting requests in
     *            alternative capacity pools if capacity is unavailable. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *            >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @see FleetType
     */
    public void setType(FleetType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous
     * request for your desired capacity, and maintains it by replenishing
     * interrupted Spot Instances (<code>maintain</code>). A value of
     * <code>instant</code> places a synchronous one-time request, and returns
     * errors for any instances that could not be launched. A value of
     * <code>request</code> places an asynchronous one-time request without
     * maintaining capacity or submitting requests in alternative capacity pools
     * if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of the request. By default, the EC2 Fleet places an
     *            asynchronous request for your desired capacity, and maintains
     *            it by replenishing interrupted Spot Instances (
     *            <code>maintain</code>). A value of <code>instant</code> places
     *            a synchronous one-time request, and returns errors for any
     *            instances that could not be launched. A value of
     *            <code>request</code> places an asynchronous one-time request
     *            without maintaining capacity or submitting requests in
     *            alternative capacity pools if capacity is unavailable. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *            >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetType
     */
    public CreateFleetRequest withType(FleetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     *
     * @return <p>
     *         The start date and time of the request, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         The default is to start fulfilling the request immediately.
     *         </p>
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     *
     * @param validFrom <p>
     *            The start date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). The default is to start fulfilling the request
     *            immediately.
     *            </p>
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validFrom <p>
     *            The start date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). The default is to start fulfilling the request
     *            immediately.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new EC2 Fleet requests are placed or able to fulfill the
     * request. If no value is specified, the request remains until you cancel
     * it.
     * </p>
     *
     * @return <p>
     *         The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         At this point, no new EC2 Fleet requests are placed or able to
     *         fulfill the request. If no value is specified, the request
     *         remains until you cancel it.
     *         </p>
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new EC2 Fleet requests are placed or able to fulfill the
     * request. If no value is specified, the request remains until you cancel
     * it.
     * </p>
     *
     * @param validUntil <p>
     *            The end date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). At this point, no new EC2 Fleet requests are placed
     *            or able to fulfill the request. If no value is specified, the
     *            request remains until you cancel it.
     *            </p>
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this
     * point, no new EC2 Fleet requests are placed or able to fulfill the
     * request. If no value is specified, the request remains until you cancel
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUntil <p>
     *            The end date and time of the request, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). At this point, no new EC2 Fleet requests are placed
     *            or able to fulfill the request. If no value is specified, the
     *            request remains until you cancel it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 Fleet should replace unhealthy instances.
     *         </p>
     */
    public Boolean isReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 Fleet should replace unhealthy instances.
     *         </p>
     */
    public Boolean getReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     *
     * @param replaceUnhealthyInstances <p>
     *            Indicates whether EC2 Fleet should replace unhealthy
     *            instances.
     *            </p>
     */
    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceUnhealthyInstances <p>
     *            Indicates whether EC2 Fleet should replace unhealthy
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        return this;
    }

    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The
     * value for <code>ResourceType</code> must be <code>fleet</code>, otherwise
     * the fleet request fails. To tag instances at launch, specify the tags in
     * the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a>. For information about tagging after launch, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     *
     * @return <p>
     *         The key-value pair for tagging the EC2 Fleet request on creation.
     *         The value for <code>ResourceType</code> must be
     *         <code>fleet</code>, otherwise the fleet request fails. To tag
     *         instances at launch, specify the tags in the <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *         >launch template</a>. For information about tagging after launch,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     *         >Tagging Your Resources</a>.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The
     * value for <code>ResourceType</code> must be <code>fleet</code>, otherwise
     * the fleet request fails. To tag instances at launch, specify the tags in
     * the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a>. For information about tagging after launch, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The key-value pair for tagging the EC2 Fleet request on
     *            creation. The value for <code>ResourceType</code> must be
     *            <code>fleet</code>, otherwise the fleet request fails. To tag
     *            instances at launch, specify the tags in the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *            >launch template</a>. For information about tagging after
     *            launch, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     *            >Tagging Your Resources</a>.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The
     * value for <code>ResourceType</code> must be <code>fleet</code>, otherwise
     * the fleet request fails. To tag instances at launch, specify the tags in
     * the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a>. For information about tagging after launch, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The key-value pair for tagging the EC2 Fleet request on
     *            creation. The value for <code>ResourceType</code> must be
     *            <code>fleet</code>, otherwise the fleet request fails. To tag
     *            instances at launch, specify the tags in the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *            >launch template</a>. For information about tagging after
     *            launch, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     *            >Tagging Your Resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The
     * value for <code>ResourceType</code> must be <code>fleet</code>, otherwise
     * the fleet request fails. To tag instances at launch, specify the tags in
     * the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a>. For information about tagging after launch, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The key-value pair for tagging the EC2 Fleet request on
     *            creation. The value for <code>ResourceType</code> must be
     *            <code>fleet</code>, otherwise the fleet request fails. To tag
     *            instances at launch, specify the tags in the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *            >launch template</a>. For information about tagging after
     *            launch, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     *            >Tagging Your Resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getSpotOptions() != null)
            sb.append("SpotOptions: " + getSpotOptions() + ",");
        if (getOnDemandOptions() != null)
            sb.append("OnDemandOptions: " + getOnDemandOptions() + ",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy()
                    + ",");
        if (getLaunchTemplateConfigs() != null)
            sb.append("LaunchTemplateConfigs: " + getLaunchTemplateConfigs() + ",");
        if (getTargetCapacitySpecification() != null)
            sb.append("TargetCapacitySpecification: " + getTargetCapacitySpecification() + ",");
        if (getTerminateInstancesWithExpiration() != null)
            sb.append("TerminateInstancesWithExpiration: " + getTerminateInstancesWithExpiration()
                    + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getReplaceUnhealthyInstances() != null)
            sb.append("ReplaceUnhealthyInstances: " + getReplaceUnhealthyInstances() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getSpotOptions() == null) ? 0 : getSpotOptions().hashCode());
        hashCode = prime * hashCode
                + ((getOnDemandOptions() == null) ? 0 : getOnDemandOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getExcessCapacityTerminationPolicy() == null) ? 0
                        : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchTemplateConfigs() == null) ? 0 : getLaunchTemplateConfigs().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetCapacitySpecification() == null) ? 0
                        : getTargetCapacitySpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminateInstancesWithExpiration() == null) ? 0
                        : getTerminateInstancesWithExpiration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplaceUnhealthyInstances() == null) ? 0 : getReplaceUnhealthyInstances()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetRequest == false)
            return false;
        CreateFleetRequest other = (CreateFleetRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSpotOptions() == null ^ this.getSpotOptions() == null)
            return false;
        if (other.getSpotOptions() != null
                && other.getSpotOptions().equals(this.getSpotOptions()) == false)
            return false;
        if (other.getOnDemandOptions() == null ^ this.getOnDemandOptions() == null)
            return false;
        if (other.getOnDemandOptions() != null
                && other.getOnDemandOptions().equals(this.getOnDemandOptions()) == false)
            return false;
        if (other.getExcessCapacityTerminationPolicy() == null
                ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(
                        this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getLaunchTemplateConfigs() == null ^ this.getLaunchTemplateConfigs() == null)
            return false;
        if (other.getLaunchTemplateConfigs() != null
                && other.getLaunchTemplateConfigs().equals(this.getLaunchTemplateConfigs()) == false)
            return false;
        if (other.getTargetCapacitySpecification() == null
                ^ this.getTargetCapacitySpecification() == null)
            return false;
        if (other.getTargetCapacitySpecification() != null
                && other.getTargetCapacitySpecification().equals(
                        this.getTargetCapacitySpecification()) == false)
            return false;
        if (other.getTerminateInstancesWithExpiration() == null
                ^ this.getTerminateInstancesWithExpiration() == null)
            return false;
        if (other.getTerminateInstancesWithExpiration() != null
                && other.getTerminateInstancesWithExpiration().equals(
                        this.getTerminateInstancesWithExpiration()) == false)
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
        if (other.getReplaceUnhealthyInstances() == null
                ^ this.getReplaceUnhealthyInstances() == null)
            return false;
        if (other.getReplaceUnhealthyInstances() != null
                && other.getReplaceUnhealthyInstances().equals(this.getReplaceUnhealthyInstances()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
