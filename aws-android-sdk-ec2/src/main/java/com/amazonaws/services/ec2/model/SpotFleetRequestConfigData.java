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
 * Describes the configuration of a Spot Fleet request.
 * </p>
 */
public class SpotFleetRequestConfigData implements Serializable {
    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the Spot Fleet request.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowestPrice</code>, Spot Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, Spot Fleet
     * launches instances from all the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacityOptimized</code>, Spot Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified, capacityOptimized
     */
    private String allocationStrategy;

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowestPrice</code>, Spot Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, Spot Fleet uses the priority that you assign to
     * each Spot Fleet launch template override, launching the highest priority
     * first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, prioritized
     */
    private String onDemandAllocationStrategy;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of your listings. This helps to avoid duplicate listings. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if you
     * decrease the target capacity of the Spot Fleet request below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     */
    private String excessCapacityTerminationPolicy;

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity. You cannot set this value.
     * </p>
     */
    private Double fulfilledCapacity;

    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the
     * set target On-Demand capacity.
     * </p>
     */
    private Double onDemandFulfilledCapacity;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that grants the Spot Fleet the permission to request, launch,
     * terminate, and tag instances on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites"
     * >Spot Fleet Prerequisites</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>. Spot Fleet can terminate Spot Instances on your behalf
     * when you cancel its Spot Fleet request using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests"
     * >CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if
     * you set <code>TerminateInstancesWithExpiration</code>.
     * </p>
     */
    private String iamFleetRole;

    /**
     * <p>
     * The launch specifications for the Spot Fleet request. If you specify
     * <code>LaunchSpecifications</code>, you can't specify
     * <code>LaunchTemplateConfigs</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     */
    private java.util.List<SpotFleetLaunchSpecification> launchSpecifications;

    /**
     * <p>
     * The launch template and overrides. If you specify
     * <code>LaunchTemplateConfigs</code>, you can't specify
     * <code>LaunchSpecifications</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     */
    private java.util.List<LaunchTemplateConfig> launchTemplateConfigs;

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     */
    private String spotPrice;

    /**
     * <p>
     * The number of units to request for the Spot Fleet. You can choose to set
     * the target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     */
    private Integer targetCapacity;

    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     */
    private Integer onDemandTargetCapacity;

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay. You can use the <code>onDemandMaxTotalPrice</code> parameter, the
     * <code>spotMaxTotalPrice</code> parameter, or both parameters to ensure
     * that your fleet cost does not exceed your budget. If you set a maximum
     * price per hour for the On-Demand Instances and Spot Instances in your
     * request, Spot Fleet will launch instances until it reaches the maximum
     * amount you're willing to pay. When the maximum amount you're willing to
     * pay is reached, the fleet stops launching instances even if it hasn’t met
     * the target capacity.
     * </p>
     */
    private String onDemandMaxTotalPrice;

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay. You can use the <code>spotdMaxTotalPrice</code> parameter, the
     * <code>onDemandMaxTotalPrice</code> parameter, or both parameters to
     * ensure that your fleet cost does not exceed your budget. If you set a
     * maximum price per hour for the On-Demand Instances and Spot Instances in
     * your request, Spot Fleet will launch instances until it reaches the
     * maximum amount you're willing to pay. When the maximum amount you're
     * willing to pay is reached, the fleet stops launching instances even if it
     * hasn’t met the target capacity.
     * </p>
     */
    private String spotMaxTotalPrice;

    /**
     * <p>
     * Indicates whether running Spot Instances are terminated when the Spot
     * Fleet request expires.
     * </p>
     */
    private Boolean terminateInstancesWithExpiration;

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the
     * target capacity or also attempts to maintain it. When this value is
     * <code>request</code>, the Spot Fleet only places the required requests.
     * It does not attempt to replenish Spot Instances if capacity is
     * diminished, nor does it submit requests in alternative Spot pools if
     * capacity is not available. When this value is <code>maintain</code>, the
     * Spot Fleet maintains the target capacity. The Spot Fleet places the
     * required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>.
     * <code>instant</code> is listed but is not used by Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     */
    private String type;

    /**
     * <p>
     * The start date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). By
     * default, Amazon EC2 starts fulfilling the request immediately.
     * </p>
     */
    private java.util.Date validFrom;

    /**
     * <p>
     * The end date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). After
     * the end date and time, no new Spot Instance requests are placed or able
     * to fulfill the request. If no value is specified, the Spot Fleet request
     * remains until you cancel it.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     */
    private Boolean replaceUnhealthyInstances;

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
     * One or more Classic Load Balancers and target groups to attach to the
     * Spot Fleet request. Spot Fleet registers the running Spot Instances with
     * the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that
     * have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1,
     * G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     */
    private LoadBalancersConfig loadBalancersConfig;

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when Spot <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     */
    private Integer instancePoolsToUseCount;

    /**
     * <p>
     * The key-value pair for tagging the Spot Fleet request on creation. The
     * value for <code>ResourceType</code> must be
     * <code>spot-fleet-request</code>, otherwise the Spot Fleet request fails.
     * To tag instances at launch, specify the tags in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a> (valid only if you use
     * <code>LaunchTemplateConfigs</code>) or in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     * > <code>SpotFleetTagSpecification</code> </a> (valid only if you use
     * <code>LaunchSpecifications</code>). For information about tagging after
     * launch, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the Spot Fleet request.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowestPrice</code>, Spot Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, Spot Fleet
     * launches instances from all the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacityOptimized</code>, Spot Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified, capacityOptimized
     *
     * @return <p>
     *         Indicates how to allocate the target Spot Instance capacity
     *         across the Spot Instance pools specified by the Spot Fleet
     *         request.
     *         </p>
     *         <p>
     *         If the allocation strategy is <code>lowestPrice</code>, Spot
     *         Fleet launches instances from the Spot Instance pools with the
     *         lowest price. This is the default allocation strategy.
     *         </p>
     *         <p>
     *         If the allocation strategy is <code>diversified</code>, Spot
     *         Fleet launches instances from all the Spot Instance pools that
     *         you specify.
     *         </p>
     *         <p>
     *         If the allocation strategy is <code>capacityOptimized</code>,
     *         Spot Fleet launches instances from Spot Instance pools with
     *         optimal capacity for the number of instances that are launching.
     *         </p>
     * @see AllocationStrategy
     */
    public String getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the Spot Fleet request.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowestPrice</code>, Spot Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, Spot Fleet
     * launches instances from all the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacityOptimized</code>, Spot Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified, capacityOptimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the Spot Fleet
     *            request.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowestPrice</code>, Spot
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, Spot
     *            Fleet launches instances from all the Spot Instance pools that
     *            you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacityOptimized</code>,
     *            Spot Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @see AllocationStrategy
     */
    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the Spot Fleet request.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowestPrice</code>, Spot Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, Spot Fleet
     * launches instances from all the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacityOptimized</code>, Spot Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified, capacityOptimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the Spot Fleet
     *            request.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowestPrice</code>, Spot
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, Spot
     *            Fleet launches instances from all the Spot Instance pools that
     *            you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacityOptimized</code>,
     *            Spot Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllocationStrategy
     */
    public SpotFleetRequestConfigData withAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the Spot Fleet request.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowestPrice</code>, Spot Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, Spot Fleet
     * launches instances from all the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacityOptimized</code>, Spot Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified, capacityOptimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the Spot Fleet
     *            request.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowestPrice</code>, Spot
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, Spot
     *            Fleet launches instances from all the Spot Instance pools that
     *            you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacityOptimized</code>,
     *            Spot Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @see AllocationStrategy
     */
    public void setAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the Spot Fleet request.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowestPrice</code>, Spot Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, Spot Fleet
     * launches instances from all the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacityOptimized</code>, Spot Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified, capacityOptimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the Spot Fleet
     *            request.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowestPrice</code>, Spot
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, Spot
     *            Fleet launches instances from all the Spot Instance pools that
     *            you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacityOptimized</code>,
     *            Spot Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllocationStrategy
     */
    public SpotFleetRequestConfigData withAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowestPrice</code>, Spot Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, Spot Fleet uses the priority that you assign to
     * each Spot Fleet launch template override, launching the highest priority
     * first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, prioritized
     *
     * @return <p>
     *         The order of the launch template overrides to use in fulfilling
     *         On-Demand capacity. If you specify <code>lowestPrice</code>, Spot
     *         Fleet uses price to determine the order, launching the lowest
     *         price first. If you specify <code>prioritized</code>, Spot Fleet
     *         uses the priority that you assign to each Spot Fleet launch
     *         template override, launching the highest priority first. If you
     *         do not specify a value, Spot Fleet defaults to
     *         <code>lowestPrice</code>.
     *         </p>
     * @see OnDemandAllocationStrategy
     */
    public String getOnDemandAllocationStrategy() {
        return onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowestPrice</code>, Spot Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, Spot Fleet uses the priority that you assign to
     * each Spot Fleet launch template override, launching the highest priority
     * first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, prioritized
     *
     * @param onDemandAllocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowestPrice</code>, Spot Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, Spot Fleet uses the priority that
     *            you assign to each Spot Fleet launch template override,
     *            launching the highest priority first. If you do not specify a
     *            value, Spot Fleet defaults to <code>lowestPrice</code>.
     *            </p>
     * @see OnDemandAllocationStrategy
     */
    public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowestPrice</code>, Spot Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, Spot Fleet uses the priority that you assign to
     * each Spot Fleet launch template override, launching the highest priority
     * first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, prioritized
     *
     * @param onDemandAllocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowestPrice</code>, Spot Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, Spot Fleet uses the priority that
     *            you assign to each Spot Fleet launch template override,
     *            launching the highest priority first. If you do not specify a
     *            value, Spot Fleet defaults to <code>lowestPrice</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OnDemandAllocationStrategy
     */
    public SpotFleetRequestConfigData withOnDemandAllocationStrategy(
            String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
        return this;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowestPrice</code>, Spot Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, Spot Fleet uses the priority that you assign to
     * each Spot Fleet launch template override, launching the highest priority
     * first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, prioritized
     *
     * @param onDemandAllocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowestPrice</code>, Spot Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, Spot Fleet uses the priority that
     *            you assign to each Spot Fleet launch template override,
     *            launching the highest priority first. If you do not specify a
     *            value, Spot Fleet defaults to <code>lowestPrice</code>.
     *            </p>
     * @see OnDemandAllocationStrategy
     */
    public void setOnDemandAllocationStrategy(OnDemandAllocationStrategy onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy.toString();
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowestPrice</code>, Spot Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, Spot Fleet uses the priority that you assign to
     * each Spot Fleet launch template override, launching the highest priority
     * first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, prioritized
     *
     * @param onDemandAllocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowestPrice</code>, Spot Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, Spot Fleet uses the priority that
     *            you assign to each Spot Fleet launch template override,
     *            launching the highest priority first. If you do not specify a
     *            value, Spot Fleet defaults to <code>lowestPrice</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OnDemandAllocationStrategy
     */
    public SpotFleetRequestConfigData withOnDemandAllocationStrategy(
            OnDemandAllocationStrategy onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of your listings. This helps to avoid duplicate listings. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of your listings. This helps to avoid duplicate
     *         listings. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of your listings. This helps to avoid duplicate listings. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of your listings. This helps to avoid
     *            duplicate listings. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of your listings. This helps to avoid duplicate listings. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of your listings. This helps to avoid
     *            duplicate listings. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if you
     * decrease the target capacity of the Spot Fleet request below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @return <p>
     *         Indicates whether running Spot Instances should be terminated if
     *         you decrease the target capacity of the Spot Fleet request below
     *         the current size of the Spot Fleet.
     *         </p>
     * @see ExcessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if you
     * decrease the target capacity of the Spot Fleet request below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if you decrease the target capacity of the Spot Fleet request
     *            below the current size of the Spot Fleet.
     *            </p>
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if you
     * decrease the target capacity of the Spot Fleet request below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if you decrease the target capacity of the Spot Fleet request
     *            below the current size of the Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExcessCapacityTerminationPolicy
     */
    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(
            String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if you
     * decrease the target capacity of the Spot Fleet request below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if you decrease the target capacity of the Spot Fleet request
     *            below the current size of the Spot Fleet.
     *            </p>
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(
            ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if you
     * decrease the target capacity of the Spot Fleet request below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if you decrease the target capacity of the Spot Fleet request
     *            below the current size of the Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExcessCapacityTerminationPolicy
     */
    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(
            ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity. You cannot set this value.
     * </p>
     *
     * @return <p>
     *         The number of units fulfilled by this request compared to the set
     *         target capacity. You cannot set this value.
     *         </p>
     */
    public Double getFulfilledCapacity() {
        return fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity. You cannot set this value.
     * </p>
     *
     * @param fulfilledCapacity <p>
     *            The number of units fulfilled by this request compared to the
     *            set target capacity. You cannot set this value.
     *            </p>
     */
    public void setFulfilledCapacity(Double fulfilledCapacity) {
        this.fulfilledCapacity = fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target
     * capacity. You cannot set this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fulfilledCapacity <p>
     *            The number of units fulfilled by this request compared to the
     *            set target capacity. You cannot set this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withFulfilledCapacity(Double fulfilledCapacity) {
        this.fulfilledCapacity = fulfilledCapacity;
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the
     * set target On-Demand capacity.
     * </p>
     *
     * @return <p>
     *         The number of On-Demand units fulfilled by this request compared
     *         to the set target On-Demand capacity.
     *         </p>
     */
    public Double getOnDemandFulfilledCapacity() {
        return onDemandFulfilledCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the
     * set target On-Demand capacity.
     * </p>
     *
     * @param onDemandFulfilledCapacity <p>
     *            The number of On-Demand units fulfilled by this request
     *            compared to the set target On-Demand capacity.
     *            </p>
     */
    public void setOnDemandFulfilledCapacity(Double onDemandFulfilledCapacity) {
        this.onDemandFulfilledCapacity = onDemandFulfilledCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the
     * set target On-Demand capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandFulfilledCapacity <p>
     *            The number of On-Demand units fulfilled by this request
     *            compared to the set target On-Demand capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withOnDemandFulfilledCapacity(Double onDemandFulfilledCapacity) {
        this.onDemandFulfilledCapacity = onDemandFulfilledCapacity;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that grants the Spot Fleet the permission to request, launch,
     * terminate, and tag instances on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites"
     * >Spot Fleet Prerequisites</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>. Spot Fleet can terminate Spot Instances on your behalf
     * when you cancel its Spot Fleet request using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests"
     * >CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if
     * you set <code>TerminateInstancesWithExpiration</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Identity and Access
     *         Management (IAM) role that grants the Spot Fleet the permission
     *         to request, launch, terminate, and tag instances on your behalf.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites"
     *         >Spot Fleet Prerequisites</a> in the <i>Amazon EC2 User Guide for
     *         Linux Instances</i>. Spot Fleet can terminate Spot Instances on
     *         your behalf when you cancel its Spot Fleet request using <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests"
     *         >CancelSpotFleetRequests</a> or when the Spot Fleet request
     *         expires, if you set <code>TerminateInstancesWithExpiration</code>
     *         .
     *         </p>
     */
    public String getIamFleetRole() {
        return iamFleetRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that grants the Spot Fleet the permission to request, launch,
     * terminate, and tag instances on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites"
     * >Spot Fleet Prerequisites</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>. Spot Fleet can terminate Spot Instances on your behalf
     * when you cancel its Spot Fleet request using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests"
     * >CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if
     * you set <code>TerminateInstancesWithExpiration</code>.
     * </p>
     *
     * @param iamFleetRole <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that grants the Spot Fleet the
     *            permission to request, launch, terminate, and tag instances on
     *            your behalf. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites"
     *            >Spot Fleet Prerequisites</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>. Spot Fleet can terminate Spot
     *            Instances on your behalf when you cancel its Spot Fleet
     *            request using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests"
     *            >CancelSpotFleetRequests</a> or when the Spot Fleet request
     *            expires, if you set
     *            <code>TerminateInstancesWithExpiration</code>.
     *            </p>
     */
    public void setIamFleetRole(String iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that grants the Spot Fleet the permission to request, launch,
     * terminate, and tag instances on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites"
     * >Spot Fleet Prerequisites</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>. Spot Fleet can terminate Spot Instances on your behalf
     * when you cancel its Spot Fleet request using <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests"
     * >CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if
     * you set <code>TerminateInstancesWithExpiration</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamFleetRole <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that grants the Spot Fleet the
     *            permission to request, launch, terminate, and tag instances on
     *            your behalf. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites"
     *            >Spot Fleet Prerequisites</a> in the <i>Amazon EC2 User Guide
     *            for Linux Instances</i>. Spot Fleet can terminate Spot
     *            Instances on your behalf when you cancel its Spot Fleet
     *            request using <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests"
     *            >CancelSpotFleetRequests</a> or when the Spot Fleet request
     *            expires, if you set
     *            <code>TerminateInstancesWithExpiration</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withIamFleetRole(String iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
        return this;
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request. If you specify
     * <code>LaunchSpecifications</code>, you can't specify
     * <code>LaunchTemplateConfigs</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     *
     * @return <p>
     *         The launch specifications for the Spot Fleet request. If you
     *         specify <code>LaunchSpecifications</code>, you can't specify
     *         <code>LaunchTemplateConfigs</code>. If you include On-Demand
     *         capacity in your request, you must use
     *         <code>LaunchTemplateConfigs</code>.
     *         </p>
     */
    public java.util.List<SpotFleetLaunchSpecification> getLaunchSpecifications() {
        return launchSpecifications;
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request. If you specify
     * <code>LaunchSpecifications</code>, you can't specify
     * <code>LaunchTemplateConfigs</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     *
     * @param launchSpecifications <p>
     *            The launch specifications for the Spot Fleet request. If you
     *            specify <code>LaunchSpecifications</code>, you can't specify
     *            <code>LaunchTemplateConfigs</code>. If you include On-Demand
     *            capacity in your request, you must use
     *            <code>LaunchTemplateConfigs</code>.
     *            </p>
     */
    public void setLaunchSpecifications(
            java.util.Collection<SpotFleetLaunchSpecification> launchSpecifications) {
        if (launchSpecifications == null) {
            this.launchSpecifications = null;
            return;
        }

        this.launchSpecifications = new java.util.ArrayList<SpotFleetLaunchSpecification>(
                launchSpecifications);
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request. If you specify
     * <code>LaunchSpecifications</code>, you can't specify
     * <code>LaunchTemplateConfigs</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchSpecifications <p>
     *            The launch specifications for the Spot Fleet request. If you
     *            specify <code>LaunchSpecifications</code>, you can't specify
     *            <code>LaunchTemplateConfigs</code>. If you include On-Demand
     *            capacity in your request, you must use
     *            <code>LaunchTemplateConfigs</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withLaunchSpecifications(
            SpotFleetLaunchSpecification... launchSpecifications) {
        if (getLaunchSpecifications() == null) {
            this.launchSpecifications = new java.util.ArrayList<SpotFleetLaunchSpecification>(
                    launchSpecifications.length);
        }
        for (SpotFleetLaunchSpecification value : launchSpecifications) {
            this.launchSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request. If you specify
     * <code>LaunchSpecifications</code>, you can't specify
     * <code>LaunchTemplateConfigs</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchSpecifications <p>
     *            The launch specifications for the Spot Fleet request. If you
     *            specify <code>LaunchSpecifications</code>, you can't specify
     *            <code>LaunchTemplateConfigs</code>. If you include On-Demand
     *            capacity in your request, you must use
     *            <code>LaunchTemplateConfigs</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withLaunchSpecifications(
            java.util.Collection<SpotFleetLaunchSpecification> launchSpecifications) {
        setLaunchSpecifications(launchSpecifications);
        return this;
    }

    /**
     * <p>
     * The launch template and overrides. If you specify
     * <code>LaunchTemplateConfigs</code>, you can't specify
     * <code>LaunchSpecifications</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     *
     * @return <p>
     *         The launch template and overrides. If you specify
     *         <code>LaunchTemplateConfigs</code>, you can't specify
     *         <code>LaunchSpecifications</code>. If you include On-Demand
     *         capacity in your request, you must use
     *         <code>LaunchTemplateConfigs</code>.
     *         </p>
     */
    public java.util.List<LaunchTemplateConfig> getLaunchTemplateConfigs() {
        return launchTemplateConfigs;
    }

    /**
     * <p>
     * The launch template and overrides. If you specify
     * <code>LaunchTemplateConfigs</code>, you can't specify
     * <code>LaunchSpecifications</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     *
     * @param launchTemplateConfigs <p>
     *            The launch template and overrides. If you specify
     *            <code>LaunchTemplateConfigs</code>, you can't specify
     *            <code>LaunchSpecifications</code>. If you include On-Demand
     *            capacity in your request, you must use
     *            <code>LaunchTemplateConfigs</code>.
     *            </p>
     */
    public void setLaunchTemplateConfigs(
            java.util.Collection<LaunchTemplateConfig> launchTemplateConfigs) {
        if (launchTemplateConfigs == null) {
            this.launchTemplateConfigs = null;
            return;
        }

        this.launchTemplateConfigs = new java.util.ArrayList<LaunchTemplateConfig>(
                launchTemplateConfigs);
    }

    /**
     * <p>
     * The launch template and overrides. If you specify
     * <code>LaunchTemplateConfigs</code>, you can't specify
     * <code>LaunchSpecifications</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateConfigs <p>
     *            The launch template and overrides. If you specify
     *            <code>LaunchTemplateConfigs</code>, you can't specify
     *            <code>LaunchSpecifications</code>. If you include On-Demand
     *            capacity in your request, you must use
     *            <code>LaunchTemplateConfigs</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withLaunchTemplateConfigs(
            LaunchTemplateConfig... launchTemplateConfigs) {
        if (getLaunchTemplateConfigs() == null) {
            this.launchTemplateConfigs = new java.util.ArrayList<LaunchTemplateConfig>(
                    launchTemplateConfigs.length);
        }
        for (LaunchTemplateConfig value : launchTemplateConfigs) {
            this.launchTemplateConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The launch template and overrides. If you specify
     * <code>LaunchTemplateConfigs</code>, you can't specify
     * <code>LaunchSpecifications</code>. If you include On-Demand capacity in
     * your request, you must use <code>LaunchTemplateConfigs</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateConfigs <p>
     *            The launch template and overrides. If you specify
     *            <code>LaunchTemplateConfigs</code>, you can't specify
     *            <code>LaunchSpecifications</code>. If you include On-Demand
     *            capacity in your request, you must use
     *            <code>LaunchTemplateConfigs</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withLaunchTemplateConfigs(
            java.util.Collection<LaunchTemplateConfig> launchTemplateConfigs) {
        setLaunchTemplateConfigs(launchTemplateConfigs);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     *
     * @return <p>
     *         The maximum price per unit hour that you are willing to pay for a
     *         Spot Instance. The default is the On-Demand price.
     *         </p>
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     *
     * @param spotPrice <p>
     *            The maximum price per unit hour that you are willing to pay
     *            for a Spot Instance. The default is the On-Demand price.
     *            </p>
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot
     * Instance. The default is the On-Demand price.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotPrice <p>
     *            The maximum price per unit hour that you are willing to pay
     *            for a Spot Instance. The default is the On-Demand price.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * <p>
     * The number of units to request for the Spot Fleet. You can choose to set
     * the target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     *
     * @return <p>
     *         The number of units to request for the Spot Fleet. You can choose
     *         to set the target capacity in terms of instances or a performance
     *         characteristic that is important to your application workload,
     *         such as vCPUs, memory, or I/O. If the request type is
     *         <code>maintain</code>, you can specify a target capacity of 0 and
     *         add capacity later.
     *         </p>
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }

    /**
     * <p>
     * The number of units to request for the Spot Fleet. You can choose to set
     * the target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     *
     * @param targetCapacity <p>
     *            The number of units to request for the Spot Fleet. You can
     *            choose to set the target capacity in terms of instances or a
     *            performance characteristic that is important to your
     *            application workload, such as vCPUs, memory, or I/O. If the
     *            request type is <code>maintain</code>, you can specify a
     *            target capacity of 0 and add capacity later.
     *            </p>
     */
    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    /**
     * <p>
     * The number of units to request for the Spot Fleet. You can choose to set
     * the target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCapacity <p>
     *            The number of units to request for the Spot Fleet. You can
     *            choose to set the target capacity in terms of instances or a
     *            performance characteristic that is important to your
     *            application workload, such as vCPUs, memory, or I/O. If the
     *            request type is <code>maintain</code>, you can specify a
     *            target capacity of 0 and add capacity later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     *
     * @return <p>
     *         The number of On-Demand units to request. You can choose to set
     *         the target capacity in terms of instances or a performance
     *         characteristic that is important to your application workload,
     *         such as vCPUs, memory, or I/O. If the request type is
     *         <code>maintain</code>, you can specify a target capacity of 0 and
     *         add capacity later.
     *         </p>
     */
    public Integer getOnDemandTargetCapacity() {
        return onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     *
     * @param onDemandTargetCapacity <p>
     *            The number of On-Demand units to request. You can choose to
     *            set the target capacity in terms of instances or a performance
     *            characteristic that is important to your application workload,
     *            such as vCPUs, memory, or I/O. If the request type is
     *            <code>maintain</code>, you can specify a target capacity of 0
     *            and add capacity later.
     *            </p>
     */
    public void setOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic
     * that is important to your application workload, such as vCPUs, memory, or
     * I/O. If the request type is <code>maintain</code>, you can specify a
     * target capacity of 0 and add capacity later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandTargetCapacity <p>
     *            The number of On-Demand units to request. You can choose to
     *            set the target capacity in terms of instances or a performance
     *            characteristic that is important to your application workload,
     *            such as vCPUs, memory, or I/O. If the request type is
     *            <code>maintain</code>, you can specify a target capacity of 0
     *            and add capacity later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        return this;
    }

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay. You can use the <code>onDemandMaxTotalPrice</code> parameter, the
     * <code>spotMaxTotalPrice</code> parameter, or both parameters to ensure
     * that your fleet cost does not exceed your budget. If you set a maximum
     * price per hour for the On-Demand Instances and Spot Instances in your
     * request, Spot Fleet will launch instances until it reaches the maximum
     * amount you're willing to pay. When the maximum amount you're willing to
     * pay is reached, the fleet stops launching instances even if it hasn’t met
     * the target capacity.
     * </p>
     *
     * @return <p>
     *         The maximum amount per hour for On-Demand Instances that you're
     *         willing to pay. You can use the
     *         <code>onDemandMaxTotalPrice</code> parameter, the
     *         <code>spotMaxTotalPrice</code> parameter, or both parameters to
     *         ensure that your fleet cost does not exceed your budget. If you
     *         set a maximum price per hour for the On-Demand Instances and Spot
     *         Instances in your request, Spot Fleet will launch instances until
     *         it reaches the maximum amount you're willing to pay. When the
     *         maximum amount you're willing to pay is reached, the fleet stops
     *         launching instances even if it hasn’t met the target capacity.
     *         </p>
     */
    public String getOnDemandMaxTotalPrice() {
        return onDemandMaxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay. You can use the <code>onDemandMaxTotalPrice</code> parameter, the
     * <code>spotMaxTotalPrice</code> parameter, or both parameters to ensure
     * that your fleet cost does not exceed your budget. If you set a maximum
     * price per hour for the On-Demand Instances and Spot Instances in your
     * request, Spot Fleet will launch instances until it reaches the maximum
     * amount you're willing to pay. When the maximum amount you're willing to
     * pay is reached, the fleet stops launching instances even if it hasn’t met
     * the target capacity.
     * </p>
     *
     * @param onDemandMaxTotalPrice <p>
     *            The maximum amount per hour for On-Demand Instances that
     *            you're willing to pay. You can use the
     *            <code>onDemandMaxTotalPrice</code> parameter, the
     *            <code>spotMaxTotalPrice</code> parameter, or both parameters
     *            to ensure that your fleet cost does not exceed your budget. If
     *            you set a maximum price per hour for the On-Demand Instances
     *            and Spot Instances in your request, Spot Fleet will launch
     *            instances until it reaches the maximum amount you're willing
     *            to pay. When the maximum amount you're willing to pay is
     *            reached, the fleet stops launching instances even if it hasn’t
     *            met the target capacity.
     *            </p>
     */
    public void setOnDemandMaxTotalPrice(String onDemandMaxTotalPrice) {
        this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay. You can use the <code>onDemandMaxTotalPrice</code> parameter, the
     * <code>spotMaxTotalPrice</code> parameter, or both parameters to ensure
     * that your fleet cost does not exceed your budget. If you set a maximum
     * price per hour for the On-Demand Instances and Spot Instances in your
     * request, Spot Fleet will launch instances until it reaches the maximum
     * amount you're willing to pay. When the maximum amount you're willing to
     * pay is reached, the fleet stops launching instances even if it hasn’t met
     * the target capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandMaxTotalPrice <p>
     *            The maximum amount per hour for On-Demand Instances that
     *            you're willing to pay. You can use the
     *            <code>onDemandMaxTotalPrice</code> parameter, the
     *            <code>spotMaxTotalPrice</code> parameter, or both parameters
     *            to ensure that your fleet cost does not exceed your budget. If
     *            you set a maximum price per hour for the On-Demand Instances
     *            and Spot Instances in your request, Spot Fleet will launch
     *            instances until it reaches the maximum amount you're willing
     *            to pay. When the maximum amount you're willing to pay is
     *            reached, the fleet stops launching instances even if it hasn’t
     *            met the target capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withOnDemandMaxTotalPrice(String onDemandMaxTotalPrice) {
        this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
        return this;
    }

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay. You can use the <code>spotdMaxTotalPrice</code> parameter, the
     * <code>onDemandMaxTotalPrice</code> parameter, or both parameters to
     * ensure that your fleet cost does not exceed your budget. If you set a
     * maximum price per hour for the On-Demand Instances and Spot Instances in
     * your request, Spot Fleet will launch instances until it reaches the
     * maximum amount you're willing to pay. When the maximum amount you're
     * willing to pay is reached, the fleet stops launching instances even if it
     * hasn’t met the target capacity.
     * </p>
     *
     * @return <p>
     *         The maximum amount per hour for Spot Instances that you're
     *         willing to pay. You can use the <code>spotdMaxTotalPrice</code>
     *         parameter, the <code>onDemandMaxTotalPrice</code> parameter, or
     *         both parameters to ensure that your fleet cost does not exceed
     *         your budget. If you set a maximum price per hour for the
     *         On-Demand Instances and Spot Instances in your request, Spot
     *         Fleet will launch instances until it reaches the maximum amount
     *         you're willing to pay. When the maximum amount you're willing to
     *         pay is reached, the fleet stops launching instances even if it
     *         hasn’t met the target capacity.
     *         </p>
     */
    public String getSpotMaxTotalPrice() {
        return spotMaxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay. You can use the <code>spotdMaxTotalPrice</code> parameter, the
     * <code>onDemandMaxTotalPrice</code> parameter, or both parameters to
     * ensure that your fleet cost does not exceed your budget. If you set a
     * maximum price per hour for the On-Demand Instances and Spot Instances in
     * your request, Spot Fleet will launch instances until it reaches the
     * maximum amount you're willing to pay. When the maximum amount you're
     * willing to pay is reached, the fleet stops launching instances even if it
     * hasn’t met the target capacity.
     * </p>
     *
     * @param spotMaxTotalPrice <p>
     *            The maximum amount per hour for Spot Instances that you're
     *            willing to pay. You can use the
     *            <code>spotdMaxTotalPrice</code> parameter, the
     *            <code>onDemandMaxTotalPrice</code> parameter, or both
     *            parameters to ensure that your fleet cost does not exceed your
     *            budget. If you set a maximum price per hour for the On-Demand
     *            Instances and Spot Instances in your request, Spot Fleet will
     *            launch instances until it reaches the maximum amount you're
     *            willing to pay. When the maximum amount you're willing to pay
     *            is reached, the fleet stops launching instances even if it
     *            hasn’t met the target capacity.
     *            </p>
     */
    public void setSpotMaxTotalPrice(String spotMaxTotalPrice) {
        this.spotMaxTotalPrice = spotMaxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay. You can use the <code>spotdMaxTotalPrice</code> parameter, the
     * <code>onDemandMaxTotalPrice</code> parameter, or both parameters to
     * ensure that your fleet cost does not exceed your budget. If you set a
     * maximum price per hour for the On-Demand Instances and Spot Instances in
     * your request, Spot Fleet will launch instances until it reaches the
     * maximum amount you're willing to pay. When the maximum amount you're
     * willing to pay is reached, the fleet stops launching instances even if it
     * hasn’t met the target capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotMaxTotalPrice <p>
     *            The maximum amount per hour for Spot Instances that you're
     *            willing to pay. You can use the
     *            <code>spotdMaxTotalPrice</code> parameter, the
     *            <code>onDemandMaxTotalPrice</code> parameter, or both
     *            parameters to ensure that your fleet cost does not exceed your
     *            budget. If you set a maximum price per hour for the On-Demand
     *            Instances and Spot Instances in your request, Spot Fleet will
     *            launch instances until it reaches the maximum amount you're
     *            willing to pay. When the maximum amount you're willing to pay
     *            is reached, the fleet stops launching instances even if it
     *            hasn’t met the target capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withSpotMaxTotalPrice(String spotMaxTotalPrice) {
        this.spotMaxTotalPrice = spotMaxTotalPrice;
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances are terminated when the Spot
     * Fleet request expires.
     * </p>
     *
     * @return <p>
     *         Indicates whether running Spot Instances are terminated when the
     *         Spot Fleet request expires.
     *         </p>
     */
    public Boolean isTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances are terminated when the Spot
     * Fleet request expires.
     * </p>
     *
     * @return <p>
     *         Indicates whether running Spot Instances are terminated when the
     *         Spot Fleet request expires.
     *         </p>
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances are terminated when the Spot
     * Fleet request expires.
     * </p>
     *
     * @param terminateInstancesWithExpiration <p>
     *            Indicates whether running Spot Instances are terminated when
     *            the Spot Fleet request expires.
     *            </p>
     */
    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances are terminated when the Spot
     * Fleet request expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateInstancesWithExpiration <p>
     *            Indicates whether running Spot Instances are terminated when
     *            the Spot Fleet request expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withTerminateInstancesWithExpiration(
            Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the
     * target capacity or also attempts to maintain it. When this value is
     * <code>request</code>, the Spot Fleet only places the required requests.
     * It does not attempt to replenish Spot Instances if capacity is
     * diminished, nor does it submit requests in alternative Spot pools if
     * capacity is not available. When this value is <code>maintain</code>, the
     * Spot Fleet maintains the target capacity. The Spot Fleet places the
     * required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>.
     * <code>instant</code> is listed but is not used by Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @return <p>
     *         The type of request. Indicates whether the Spot Fleet only
     *         requests the target capacity or also attempts to maintain it.
     *         When this value is <code>request</code>, the Spot Fleet only
     *         places the required requests. It does not attempt to replenish
     *         Spot Instances if capacity is diminished, nor does it submit
     *         requests in alternative Spot pools if capacity is not available.
     *         When this value is <code>maintain</code>, the Spot Fleet
     *         maintains the target capacity. The Spot Fleet places the required
     *         requests to meet capacity and automatically replenishes any
     *         interrupted instances. Default: <code>maintain</code>.
     *         <code>instant</code> is listed but is not used by Spot Fleet.
     *         </p>
     * @see FleetType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the
     * target capacity or also attempts to maintain it. When this value is
     * <code>request</code>, the Spot Fleet only places the required requests.
     * It does not attempt to replenish Spot Instances if capacity is
     * diminished, nor does it submit requests in alternative Spot pools if
     * capacity is not available. When this value is <code>maintain</code>, the
     * Spot Fleet maintains the target capacity. The Spot Fleet places the
     * required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>.
     * <code>instant</code> is listed but is not used by Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the Spot Fleet only
     *            requests the target capacity or also attempts to maintain it.
     *            When this value is <code>request</code>, the Spot Fleet only
     *            places the required requests. It does not attempt to replenish
     *            Spot Instances if capacity is diminished, nor does it submit
     *            requests in alternative Spot pools if capacity is not
     *            available. When this value is <code>maintain</code>, the Spot
     *            Fleet maintains the target capacity. The Spot Fleet places the
     *            required requests to meet capacity and automatically
     *            replenishes any interrupted instances. Default:
     *            <code>maintain</code>. <code>instant</code> is listed but is
     *            not used by Spot Fleet.
     *            </p>
     * @see FleetType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the
     * target capacity or also attempts to maintain it. When this value is
     * <code>request</code>, the Spot Fleet only places the required requests.
     * It does not attempt to replenish Spot Instances if capacity is
     * diminished, nor does it submit requests in alternative Spot pools if
     * capacity is not available. When this value is <code>maintain</code>, the
     * Spot Fleet maintains the target capacity. The Spot Fleet places the
     * required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>.
     * <code>instant</code> is listed but is not used by Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the Spot Fleet only
     *            requests the target capacity or also attempts to maintain it.
     *            When this value is <code>request</code>, the Spot Fleet only
     *            places the required requests. It does not attempt to replenish
     *            Spot Instances if capacity is diminished, nor does it submit
     *            requests in alternative Spot pools if capacity is not
     *            available. When this value is <code>maintain</code>, the Spot
     *            Fleet maintains the target capacity. The Spot Fleet places the
     *            required requests to meet capacity and automatically
     *            replenishes any interrupted instances. Default:
     *            <code>maintain</code>. <code>instant</code> is listed but is
     *            not used by Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetType
     */
    public SpotFleetRequestConfigData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the
     * target capacity or also attempts to maintain it. When this value is
     * <code>request</code>, the Spot Fleet only places the required requests.
     * It does not attempt to replenish Spot Instances if capacity is
     * diminished, nor does it submit requests in alternative Spot pools if
     * capacity is not available. When this value is <code>maintain</code>, the
     * Spot Fleet maintains the target capacity. The Spot Fleet places the
     * required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>.
     * <code>instant</code> is listed but is not used by Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the Spot Fleet only
     *            requests the target capacity or also attempts to maintain it.
     *            When this value is <code>request</code>, the Spot Fleet only
     *            places the required requests. It does not attempt to replenish
     *            Spot Instances if capacity is diminished, nor does it submit
     *            requests in alternative Spot pools if capacity is not
     *            available. When this value is <code>maintain</code>, the Spot
     *            Fleet maintains the target capacity. The Spot Fleet places the
     *            required requests to meet capacity and automatically
     *            replenishes any interrupted instances. Default:
     *            <code>maintain</code>. <code>instant</code> is listed but is
     *            not used by Spot Fleet.
     *            </p>
     * @see FleetType
     */
    public void setType(FleetType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the
     * target capacity or also attempts to maintain it. When this value is
     * <code>request</code>, the Spot Fleet only places the required requests.
     * It does not attempt to replenish Spot Instances if capacity is
     * diminished, nor does it submit requests in alternative Spot pools if
     * capacity is not available. When this value is <code>maintain</code>, the
     * Spot Fleet maintains the target capacity. The Spot Fleet places the
     * required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>.
     * <code>instant</code> is listed but is not used by Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>request, maintain, instant
     *
     * @param type <p>
     *            The type of request. Indicates whether the Spot Fleet only
     *            requests the target capacity or also attempts to maintain it.
     *            When this value is <code>request</code>, the Spot Fleet only
     *            places the required requests. It does not attempt to replenish
     *            Spot Instances if capacity is diminished, nor does it submit
     *            requests in alternative Spot pools if capacity is not
     *            available. When this value is <code>maintain</code>, the Spot
     *            Fleet maintains the target capacity. The Spot Fleet places the
     *            required requests to meet capacity and automatically
     *            replenishes any interrupted instances. Default:
     *            <code>maintain</code>. <code>instant</code> is listed but is
     *            not used by Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetType
     */
    public SpotFleetRequestConfigData withType(FleetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). By
     * default, Amazon EC2 starts fulfilling the request immediately.
     * </p>
     *
     * @return <p>
     *         The start date and time of the request, in UTC format
     *         (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         By default, Amazon EC2 starts fulfilling the request immediately.
     *         </p>
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). By
     * default, Amazon EC2 starts fulfilling the request immediately.
     * </p>
     *
     * @param validFrom <p>
     *            The start date and time of the request, in UTC format
     *            (<i>YYYY<
     *            /i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). By
     *            default, Amazon EC2 starts fulfilling the request immediately.
     *            </p>
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). By
     * default, Amazon EC2 starts fulfilling the request immediately.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validFrom <p>
     *            The start date and time of the request, in UTC format
     *            (<i>YYYY<
     *            /i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). By
     *            default, Amazon EC2 starts fulfilling the request immediately.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). After
     * the end date and time, no new Spot Instance requests are placed or able
     * to fulfill the request. If no value is specified, the Spot Fleet request
     * remains until you cancel it.
     * </p>
     *
     * @return <p>
     *         The end date and time of the request, in UTC format
     *         (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         After the end date and time, no new Spot Instance requests are
     *         placed or able to fulfill the request. If no value is specified,
     *         the Spot Fleet request remains until you cancel it.
     *         </p>
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). After
     * the end date and time, no new Spot Instance requests are placed or able
     * to fulfill the request. If no value is specified, the Spot Fleet request
     * remains until you cancel it.
     * </p>
     *
     * @param validUntil <p>
     *            The end date and time of the request, in UTC format
     *            (<i>YYYY</i
     *            >-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). After
     *            the end date and time, no new Spot Instance requests are
     *            placed or able to fulfill the request. If no value is
     *            specified, the Spot Fleet request remains until you cancel it.
     *            </p>
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format
     * (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). After
     * the end date and time, no new Spot Instance requests are placed or able
     * to fulfill the request. If no value is specified, the Spot Fleet request
     * remains until you cancel it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUntil <p>
     *            The end date and time of the request, in UTC format
     *            (<i>YYYY</i
     *            >-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). After
     *            the end date and time, no new Spot Instance requests are
     *            placed or able to fulfill the request. If no value is
     *            specified, the Spot Fleet request remains until you cancel it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether Spot Fleet should replace unhealthy instances.
     *         </p>
     */
    public Boolean isReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     *
     * @return <p>
     *         Indicates whether Spot Fleet should replace unhealthy instances.
     *         </p>
     */
    public Boolean getReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     *
     * @param replaceUnhealthyInstances <p>
     *            Indicates whether Spot Fleet should replace unhealthy
     *            instances.
     *            </p>
     */
    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceUnhealthyInstances <p>
     *            Indicates whether Spot Fleet should replace unhealthy
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withReplaceUnhealthyInstances(
            Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
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
    public SpotFleetRequestConfigData withInstanceInterruptionBehavior(
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
    public SpotFleetRequestConfigData withInstanceInterruptionBehavior(
            InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
        return this;
    }

    /**
     * <p>
     * One or more Classic Load Balancers and target groups to attach to the
     * Spot Fleet request. Spot Fleet registers the running Spot Instances with
     * the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that
     * have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1,
     * G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     *
     * @return <p>
     *         One or more Classic Load Balancers and target groups to attach to
     *         the Spot Fleet request. Spot Fleet registers the running Spot
     *         Instances with the specified Classic Load Balancers and target
     *         groups.
     *         </p>
     *         <p>
     *         With Network Load Balancers, Spot Fleet cannot register instances
     *         that have the following instance types: C1, CC1, CC2, CG1, CG2,
     *         CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     *         </p>
     */
    public LoadBalancersConfig getLoadBalancersConfig() {
        return loadBalancersConfig;
    }

    /**
     * <p>
     * One or more Classic Load Balancers and target groups to attach to the
     * Spot Fleet request. Spot Fleet registers the running Spot Instances with
     * the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that
     * have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1,
     * G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     *
     * @param loadBalancersConfig <p>
     *            One or more Classic Load Balancers and target groups to attach
     *            to the Spot Fleet request. Spot Fleet registers the running
     *            Spot Instances with the specified Classic Load Balancers and
     *            target groups.
     *            </p>
     *            <p>
     *            With Network Load Balancers, Spot Fleet cannot register
     *            instances that have the following instance types: C1, CC1,
     *            CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     *            </p>
     */
    public void setLoadBalancersConfig(LoadBalancersConfig loadBalancersConfig) {
        this.loadBalancersConfig = loadBalancersConfig;
    }

    /**
     * <p>
     * One or more Classic Load Balancers and target groups to attach to the
     * Spot Fleet request. Spot Fleet registers the running Spot Instances with
     * the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that
     * have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1,
     * G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancersConfig <p>
     *            One or more Classic Load Balancers and target groups to attach
     *            to the Spot Fleet request. Spot Fleet registers the running
     *            Spot Instances with the specified Classic Load Balancers and
     *            target groups.
     *            </p>
     *            <p>
     *            With Network Load Balancers, Spot Fleet cannot register
     *            instances that have the following instance types: C1, CC1,
     *            CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withLoadBalancersConfig(
            LoadBalancersConfig loadBalancersConfig) {
        this.loadBalancersConfig = loadBalancersConfig;
        return this;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when Spot <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     *
     * @return <p>
     *         The number of Spot pools across which to allocate your target
     *         Spot capacity. Valid only when Spot <b>AllocationStrategy</b> is
     *         set to <code>lowest-price</code>. Spot Fleet selects the cheapest
     *         Spot pools and evenly allocates your target Spot capacity across
     *         the number of Spot pools that you specify.
     *         </p>
     */
    public Integer getInstancePoolsToUseCount() {
        return instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when Spot <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     *
     * @param instancePoolsToUseCount <p>
     *            The number of Spot pools across which to allocate your target
     *            Spot capacity. Valid only when Spot <b>AllocationStrategy</b>
     *            is set to <code>lowest-price</code>. Spot Fleet selects the
     *            cheapest Spot pools and evenly allocates your target Spot
     *            capacity across the number of Spot pools that you specify.
     *            </p>
     */
    public void setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when Spot <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancePoolsToUseCount <p>
     *            The number of Spot pools across which to allocate your target
     *            Spot capacity. Valid only when Spot <b>AllocationStrategy</b>
     *            is set to <code>lowest-price</code>. Spot Fleet selects the
     *            cheapest Spot pools and evenly allocates your target Spot
     *            capacity across the number of Spot pools that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        return this;
    }

    /**
     * <p>
     * The key-value pair for tagging the Spot Fleet request on creation. The
     * value for <code>ResourceType</code> must be
     * <code>spot-fleet-request</code>, otherwise the Spot Fleet request fails.
     * To tag instances at launch, specify the tags in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a> (valid only if you use
     * <code>LaunchTemplateConfigs</code>) or in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     * > <code>SpotFleetTagSpecification</code> </a> (valid only if you use
     * <code>LaunchSpecifications</code>). For information about tagging after
     * launch, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     *
     * @return <p>
     *         The key-value pair for tagging the Spot Fleet request on
     *         creation. The value for <code>ResourceType</code> must be
     *         <code>spot-fleet-request</code>, otherwise the Spot Fleet request
     *         fails. To tag instances at launch, specify the tags in the <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *         >launch template</a> (valid only if you use
     *         <code>LaunchTemplateConfigs</code>) or in the <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     *         > <code>SpotFleetTagSpecification</code> </a> (valid only if you
     *         use <code>LaunchSpecifications</code>). For information about
     *         tagging after launch, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     *         >Tagging Your Resources</a>.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The key-value pair for tagging the Spot Fleet request on creation. The
     * value for <code>ResourceType</code> must be
     * <code>spot-fleet-request</code>, otherwise the Spot Fleet request fails.
     * To tag instances at launch, specify the tags in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a> (valid only if you use
     * <code>LaunchTemplateConfigs</code>) or in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     * > <code>SpotFleetTagSpecification</code> </a> (valid only if you use
     * <code>LaunchSpecifications</code>). For information about tagging after
     * launch, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The key-value pair for tagging the Spot Fleet request on
     *            creation. The value for <code>ResourceType</code> must be
     *            <code>spot-fleet-request</code>, otherwise the Spot Fleet
     *            request fails. To tag instances at launch, specify the tags in
     *            the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *            >launch template</a> (valid only if you use
     *            <code>LaunchTemplateConfigs</code>) or in the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     *            > <code>SpotFleetTagSpecification</code> </a> (valid only if
     *            you use <code>LaunchSpecifications</code>). For information
     *            about tagging after launch, see <a href=
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
     * The key-value pair for tagging the Spot Fleet request on creation. The
     * value for <code>ResourceType</code> must be
     * <code>spot-fleet-request</code>, otherwise the Spot Fleet request fails.
     * To tag instances at launch, specify the tags in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a> (valid only if you use
     * <code>LaunchTemplateConfigs</code>) or in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     * > <code>SpotFleetTagSpecification</code> </a> (valid only if you use
     * <code>LaunchSpecifications</code>). For information about tagging after
     * launch, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The key-value pair for tagging the Spot Fleet request on
     *            creation. The value for <code>ResourceType</code> must be
     *            <code>spot-fleet-request</code>, otherwise the Spot Fleet
     *            request fails. To tag instances at launch, specify the tags in
     *            the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *            >launch template</a> (valid only if you use
     *            <code>LaunchTemplateConfigs</code>) or in the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     *            > <code>SpotFleetTagSpecification</code> </a> (valid only if
     *            you use <code>LaunchSpecifications</code>). For information
     *            about tagging after launch, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     *            >Tagging Your Resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The key-value pair for tagging the Spot Fleet request on creation. The
     * value for <code>ResourceType</code> must be
     * <code>spot-fleet-request</code>, otherwise the Spot Fleet request fails.
     * To tag instances at launch, specify the tags in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     * >launch template</a> (valid only if you use
     * <code>LaunchTemplateConfigs</code>) or in the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     * > <code>SpotFleetTagSpecification</code> </a> (valid only if you use
     * <code>LaunchSpecifications</code>). For information about tagging after
     * launch, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     * >Tagging Your Resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The key-value pair for tagging the Spot Fleet request on
     *            creation. The value for <code>ResourceType</code> must be
     *            <code>spot-fleet-request</code>, otherwise the Spot Fleet
     *            request fails. To tag instances at launch, specify the tags in
     *            the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *            >launch template</a> (valid only if you use
     *            <code>LaunchTemplateConfigs</code>) or in the <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html"
     *            > <code>SpotFleetTagSpecification</code> </a> (valid only if
     *            you use <code>LaunchSpecifications</code>). For information
     *            about tagging after launch, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources"
     *            >Tagging Your Resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfigData withTagSpecifications(
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
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: " + getAllocationStrategy() + ",");
        if (getOnDemandAllocationStrategy() != null)
            sb.append("OnDemandAllocationStrategy: " + getOnDemandAllocationStrategy() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy()
                    + ",");
        if (getFulfilledCapacity() != null)
            sb.append("FulfilledCapacity: " + getFulfilledCapacity() + ",");
        if (getOnDemandFulfilledCapacity() != null)
            sb.append("OnDemandFulfilledCapacity: " + getOnDemandFulfilledCapacity() + ",");
        if (getIamFleetRole() != null)
            sb.append("IamFleetRole: " + getIamFleetRole() + ",");
        if (getLaunchSpecifications() != null)
            sb.append("LaunchSpecifications: " + getLaunchSpecifications() + ",");
        if (getLaunchTemplateConfigs() != null)
            sb.append("LaunchTemplateConfigs: " + getLaunchTemplateConfigs() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getTargetCapacity() != null)
            sb.append("TargetCapacity: " + getTargetCapacity() + ",");
        if (getOnDemandTargetCapacity() != null)
            sb.append("OnDemandTargetCapacity: " + getOnDemandTargetCapacity() + ",");
        if (getOnDemandMaxTotalPrice() != null)
            sb.append("OnDemandMaxTotalPrice: " + getOnDemandMaxTotalPrice() + ",");
        if (getSpotMaxTotalPrice() != null)
            sb.append("SpotMaxTotalPrice: " + getSpotMaxTotalPrice() + ",");
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
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: " + getInstanceInterruptionBehavior() + ",");
        if (getLoadBalancersConfig() != null)
            sb.append("LoadBalancersConfig: " + getLoadBalancersConfig() + ",");
        if (getInstancePoolsToUseCount() != null)
            sb.append("InstancePoolsToUseCount: " + getInstancePoolsToUseCount() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandAllocationStrategy() == null) ? 0 : getOnDemandAllocationStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getExcessCapacityTerminationPolicy() == null) ? 0
                        : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getFulfilledCapacity() == null) ? 0 : getFulfilledCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandFulfilledCapacity() == null) ? 0 : getOnDemandFulfilledCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIamFleetRole() == null) ? 0 : getIamFleetRole().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchSpecifications() == null) ? 0 : getLaunchSpecifications().hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchTemplateConfigs() == null) ? 0 : getLaunchTemplateConfigs().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode
                + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandTargetCapacity() == null) ? 0 : getOnDemandTargetCapacity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandMaxTotalPrice() == null) ? 0 : getOnDemandMaxTotalPrice().hashCode());
        hashCode = prime * hashCode
                + ((getSpotMaxTotalPrice() == null) ? 0 : getSpotMaxTotalPrice().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getInstanceInterruptionBehavior() == null) ? 0
                        : getInstanceInterruptionBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancersConfig() == null) ? 0 : getLoadBalancersConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstancePoolsToUseCount() == null) ? 0 : getInstancePoolsToUseCount()
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

        if (obj instanceof SpotFleetRequestConfigData == false)
            return false;
        SpotFleetRequestConfigData other = (SpotFleetRequestConfigData) obj;

        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null
                && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getOnDemandAllocationStrategy() == null
                ^ this.getOnDemandAllocationStrategy() == null)
            return false;
        if (other.getOnDemandAllocationStrategy() != null
                && other.getOnDemandAllocationStrategy().equals(
                        this.getOnDemandAllocationStrategy()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExcessCapacityTerminationPolicy() == null
                ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(
                        this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getFulfilledCapacity() == null ^ this.getFulfilledCapacity() == null)
            return false;
        if (other.getFulfilledCapacity() != null
                && other.getFulfilledCapacity().equals(this.getFulfilledCapacity()) == false)
            return false;
        if (other.getOnDemandFulfilledCapacity() == null
                ^ this.getOnDemandFulfilledCapacity() == null)
            return false;
        if (other.getOnDemandFulfilledCapacity() != null
                && other.getOnDemandFulfilledCapacity().equals(this.getOnDemandFulfilledCapacity()) == false)
            return false;
        if (other.getIamFleetRole() == null ^ this.getIamFleetRole() == null)
            return false;
        if (other.getIamFleetRole() != null
                && other.getIamFleetRole().equals(this.getIamFleetRole()) == false)
            return false;
        if (other.getLaunchSpecifications() == null ^ this.getLaunchSpecifications() == null)
            return false;
        if (other.getLaunchSpecifications() != null
                && other.getLaunchSpecifications().equals(this.getLaunchSpecifications()) == false)
            return false;
        if (other.getLaunchTemplateConfigs() == null ^ this.getLaunchTemplateConfigs() == null)
            return false;
        if (other.getLaunchTemplateConfigs() != null
                && other.getLaunchTemplateConfigs().equals(this.getLaunchTemplateConfigs()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null
                && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null)
            return false;
        if (other.getTargetCapacity() != null
                && other.getTargetCapacity().equals(this.getTargetCapacity()) == false)
            return false;
        if (other.getOnDemandTargetCapacity() == null ^ this.getOnDemandTargetCapacity() == null)
            return false;
        if (other.getOnDemandTargetCapacity() != null
                && other.getOnDemandTargetCapacity().equals(this.getOnDemandTargetCapacity()) == false)
            return false;
        if (other.getOnDemandMaxTotalPrice() == null ^ this.getOnDemandMaxTotalPrice() == null)
            return false;
        if (other.getOnDemandMaxTotalPrice() != null
                && other.getOnDemandMaxTotalPrice().equals(this.getOnDemandMaxTotalPrice()) == false)
            return false;
        if (other.getSpotMaxTotalPrice() == null ^ this.getSpotMaxTotalPrice() == null)
            return false;
        if (other.getSpotMaxTotalPrice() != null
                && other.getSpotMaxTotalPrice().equals(this.getSpotMaxTotalPrice()) == false)
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
        if (other.getInstanceInterruptionBehavior() == null
                ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null
                && other.getInstanceInterruptionBehavior().equals(
                        this.getInstanceInterruptionBehavior()) == false)
            return false;
        if (other.getLoadBalancersConfig() == null ^ this.getLoadBalancersConfig() == null)
            return false;
        if (other.getLoadBalancersConfig() != null
                && other.getLoadBalancersConfig().equals(this.getLoadBalancersConfig()) == false)
            return false;
        if (other.getInstancePoolsToUseCount() == null ^ this.getInstancePoolsToUseCount() == null)
            return false;
        if (other.getInstancePoolsToUseCount() != null
                && other.getInstancePoolsToUseCount().equals(this.getInstancePoolsToUseCount()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
