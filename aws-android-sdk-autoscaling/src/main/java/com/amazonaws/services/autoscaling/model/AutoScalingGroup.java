/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Auto Scaling group.
 * </p>
 */
public class AutoScalingGroup implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupARN;

    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String launchConfigurationName;

    /**
     * <p>
     * The launch template for the group.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;

    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     */
    private MixedInstancesPolicy mixedInstancesPolicy;

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     */
    private Integer minSize;

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     */
    private Integer maxSize;

    /**
     * <p>
     * The desired size of the group.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start.
     * </p>
     */
    private Integer defaultCooldown;

    /**
     * <p>
     * One or more Availability Zones for the group.
     * </p>
     */
    private java.util.List<String> availabilityZones = new java.util.ArrayList<String>();

    /**
     * <p>
     * One or more load balancers associated with the group.
     * </p>
     */
    private java.util.List<String> loadBalancerNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load
     * balancer.
     * </p>
     */
    private java.util.List<String> targetGroupARNs = new java.util.ArrayList<String>();

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String healthCheckType;

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before
     * checking the health status of an EC2 instance that has come into service.
     * </p>
     */
    private Integer healthCheckGracePeriod;

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     */
    private java.util.List<Instance> instances = new java.util.ArrayList<Instance>();

    /**
     * <p>
     * The date and time the group was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     */
    private java.util.List<SuspendedProcess> suspendedProcesses = new java.util.ArrayList<SuspendedProcess>();

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if
     * any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String placementGroup;

    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of the
     * subnets match the values for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2047<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String vPCZoneIdentifier;

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     */
    private java.util.List<EnabledMetric> enabledMetrics = new java.util.ArrayList<EnabledMetric>();

    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in
     * progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String status;

    /**
     * <p>
     * The tags for the group.
     * </p>
     */
    private java.util.List<TagDescription> tags = new java.util.ArrayList<TagDescription>();

    /**
     * <p>
     * The termination policies for the group.
     * </p>
     */
    private java.util.List<String> terminationPolicies = new java.util.ArrayList<String>();

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     */
    private Boolean newInstancesProtectedFromScaleIn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto
     * Scaling group uses to call other AWS services on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String serviceLinkedRoleARN;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupARN() {
        return autoScalingGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupARN <p>
     *            The Amazon Resource Name (ARN) of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupARN(String autoScalingGroupARN) {
        this.autoScalingGroupARN = autoScalingGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupARN <p>
     *            The Amazon Resource Name (ARN) of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withAutoScalingGroupARN(String autoScalingGroupARN) {
        this.autoScalingGroupARN = autoScalingGroupARN;
        return this;
    }

    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the associated launch configuration.
     *         </p>
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationName <p>
     *            The name of the associated launch configuration.
     *            </p>
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationName <p>
     *            The name of the associated launch configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * <p>
     * The launch template for the group.
     * </p>
     *
     * @return <p>
     *         The launch template for the group.
     *         </p>
     */
    public LaunchTemplateSpecification getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * <p>
     * The launch template for the group.
     * </p>
     *
     * @param launchTemplate <p>
     *            The launch template for the group.
     *            </p>
     */
    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplate <p>
     *            The launch template for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     *
     * @return <p>
     *         The mixed instances policy for the group.
     *         </p>
     */
    public MixedInstancesPolicy getMixedInstancesPolicy() {
        return mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     *
     * @param mixedInstancesPolicy <p>
     *            The mixed instances policy for the group.
     *            </p>
     */
    public void setMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mixedInstancesPolicy <p>
     *            The mixed instances policy for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
        return this;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     *
     * @return <p>
     *         The minimum size of the group.
     *         </p>
     */
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     *
     * @param minSize <p>
     *            The minimum size of the group.
     *            </p>
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minSize <p>
     *            The minimum size of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     *
     * @return <p>
     *         The maximum size of the group.
     *         </p>
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     *
     * @param maxSize <p>
     *            The maximum size of the group.
     *            </p>
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSize <p>
     *            The maximum size of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * <p>
     * The desired size of the group.
     * </p>
     *
     * @return <p>
     *         The desired size of the group.
     *         </p>
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * <p>
     * The desired size of the group.
     * </p>
     *
     * @param desiredCapacity <p>
     *            The desired size of the group.
     *            </p>
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The desired size of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCapacity <p>
     *            The desired size of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scaling activity
     *         completes before another scaling activity can start.
     *         </p>
     */
    public Integer getDefaultCooldown() {
        return defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start.
     * </p>
     *
     * @param defaultCooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before another scaling activity can start.
     *            </p>
     */
    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before another scaling activity can start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group.
     * </p>
     *
     * @return <p>
     *         One or more Availability Zones for the group.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones for the group.
     * </p>
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones for the group.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * One or more Availability Zones for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * One or more load balancers associated with the group.
     * </p>
     *
     * @return <p>
     *         One or more load balancers associated with the group.
     *         </p>
     */
    public java.util.List<String> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * <p>
     * One or more load balancers associated with the group.
     * </p>
     *
     * @param loadBalancerNames <p>
     *            One or more load balancers associated with the group.
     *            </p>
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames);
    }

    /**
     * <p>
     * One or more load balancers associated with the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            One or more load balancers associated with the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) {
            this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames.length);
        }
        for (String value : loadBalancerNames) {
            this.loadBalancerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more load balancers associated with the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            One or more load balancers associated with the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load
     * balancer.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the target groups for your
     *         load balancer.
     *         </p>
     */
    public java.util.List<String> getTargetGroupARNs() {
        return targetGroupARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load
     * balancer.
     * </p>
     *
     * @param targetGroupARNs <p>
     *            The Amazon Resource Names (ARN) of the target groups for your
     *            load balancer.
     *            </p>
     */
    public void setTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        if (targetGroupARNs == null) {
            this.targetGroupARNs = null;
            return;
        }

        this.targetGroupARNs = new java.util.ArrayList<String>(targetGroupARNs);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load
     * balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupARNs <p>
     *            The Amazon Resource Names (ARN) of the target groups for your
     *            load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withTargetGroupARNs(String... targetGroupARNs) {
        if (getTargetGroupARNs() == null) {
            this.targetGroupARNs = new java.util.ArrayList<String>(targetGroupARNs.length);
        }
        for (String value : targetGroupARNs) {
            this.targetGroupARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load
     * balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupARNs <p>
     *            The Amazon Resource Names (ARN) of the target groups for your
     *            load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        setTargetGroupARNs(targetGroupARNs);
        return this;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The service to use for the health checks. The valid values are
     *         <code>EC2</code> and <code>ELB</code>.
     *         </p>
     */
    public String getHealthCheckType() {
        return healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param healthCheckType <p>
     *            The service to use for the health checks. The valid values are
     *            <code>EC2</code> and <code>ELB</code>.
     *            </p>
     */
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param healthCheckType <p>
     *            The service to use for the health checks. The valid values are
     *            <code>EC2</code> and <code>ELB</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before
     * checking the health status of an EC2 instance that has come into service.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, that Amazon EC2 Auto Scaling
     *         waits before checking the health status of an EC2 instance that
     *         has come into service.
     *         </p>
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before
     * checking the health status of an EC2 instance that has come into service.
     * </p>
     *
     * @param healthCheckGracePeriod <p>
     *            The amount of time, in seconds, that Amazon EC2 Auto Scaling
     *            waits before checking the health status of an EC2 instance
     *            that has come into service.
     *            </p>
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before
     * checking the health status of an EC2 instance that has come into service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckGracePeriod <p>
     *            The amount of time, in seconds, that Amazon EC2 Auto Scaling
     *            waits before checking the health status of an EC2 instance
     *            that has come into service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        return this;
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     *
     * @return <p>
     *         The EC2 instances associated with the group.
     *         </p>
     */
    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     *
     * @param instances <p>
     *            The EC2 instances associated with the group.
     *            </p>
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The EC2 instances associated with the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withInstances(Instance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<Instance>(instances.length);
        }
        for (Instance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The EC2 instances associated with the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The date and time the group was created.
     * </p>
     *
     * @return <p>
     *         The date and time the group was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The date and time the group was created.
     * </p>
     *
     * @param createdTime <p>
     *            The date and time the group was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the group was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The date and time the group was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     *
     * @return <p>
     *         The suspended processes associated with the group.
     *         </p>
     */
    public java.util.List<SuspendedProcess> getSuspendedProcesses() {
        return suspendedProcesses;
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     *
     * @param suspendedProcesses <p>
     *            The suspended processes associated with the group.
     *            </p>
     */
    public void setSuspendedProcesses(java.util.Collection<SuspendedProcess> suspendedProcesses) {
        if (suspendedProcesses == null) {
            this.suspendedProcesses = null;
            return;
        }

        this.suspendedProcesses = new java.util.ArrayList<SuspendedProcess>(suspendedProcesses);
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suspendedProcesses <p>
     *            The suspended processes associated with the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withSuspendedProcesses(SuspendedProcess... suspendedProcesses) {
        if (getSuspendedProcesses() == null) {
            this.suspendedProcesses = new java.util.ArrayList<SuspendedProcess>(
                    suspendedProcesses.length);
        }
        for (SuspendedProcess value : suspendedProcesses) {
            this.suspendedProcesses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suspendedProcesses <p>
     *            The suspended processes associated with the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withSuspendedProcesses(
            java.util.Collection<SuspendedProcess> suspendedProcesses) {
        setSuspendedProcesses(suspendedProcesses);
        return this;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if
     * any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the placement group into which to launch your
     *         instances, if any. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     *         >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     */
    public String getPlacementGroup() {
        return placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if
     * any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param placementGroup <p>
     *            The name of the placement group into which to launch your
     *            instances, if any. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     *            >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     */
    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if
     * any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param placementGroup <p>
     *            The name of the placement group into which to launch your
     *            instances, if any. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     *            >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of the
     * subnets match the values for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2047<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         One or more subnet IDs, if applicable, separated by commas.
     *         </p>
     *         <p>
     *         If you specify <code>VPCZoneIdentifier</code> and
     *         <code>AvailabilityZones</code>, ensure that the Availability
     *         Zones of the subnets match the values for
     *         <code>AvailabilityZones</code>.
     *         </p>
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }

    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of the
     * subnets match the values for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2047<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param vPCZoneIdentifier <p>
     *            One or more subnet IDs, if applicable, separated by commas.
     *            </p>
     *            <p>
     *            If you specify <code>VPCZoneIdentifier</code> and
     *            <code>AvailabilityZones</code>, ensure that the Availability
     *            Zones of the subnets match the values for
     *            <code>AvailabilityZones</code>.
     *            </p>
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of the
     * subnets match the values for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2047<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param vPCZoneIdentifier <p>
     *            One or more subnet IDs, if applicable, separated by commas.
     *            </p>
     *            <p>
     *            If you specify <code>VPCZoneIdentifier</code> and
     *            <code>AvailabilityZones</code>, ensure that the Availability
     *            Zones of the subnets match the values for
     *            <code>AvailabilityZones</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     *
     * @return <p>
     *         The metrics enabled for the group.
     *         </p>
     */
    public java.util.List<EnabledMetric> getEnabledMetrics() {
        return enabledMetrics;
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     *
     * @param enabledMetrics <p>
     *            The metrics enabled for the group.
     *            </p>
     */
    public void setEnabledMetrics(java.util.Collection<EnabledMetric> enabledMetrics) {
        if (enabledMetrics == null) {
            this.enabledMetrics = null;
            return;
        }

        this.enabledMetrics = new java.util.ArrayList<EnabledMetric>(enabledMetrics);
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledMetrics <p>
     *            The metrics enabled for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withEnabledMetrics(EnabledMetric... enabledMetrics) {
        if (getEnabledMetrics() == null) {
            this.enabledMetrics = new java.util.ArrayList<EnabledMetric>(enabledMetrics.length);
        }
        for (EnabledMetric value : enabledMetrics) {
            this.enabledMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledMetrics <p>
     *            The metrics enabled for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withEnabledMetrics(java.util.Collection<EnabledMetric> enabledMetrics) {
        setEnabledMetrics(enabledMetrics);
        return this;
    }

    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in
     * progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The current state of the group when <a>DeleteAutoScalingGroup</a>
     *         is in progress.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in
     * progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param status <p>
     *            The current state of the group when
     *            <a>DeleteAutoScalingGroup</a> is in progress.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in
     * progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param status <p>
     *            The current state of the group when
     *            <a>DeleteAutoScalingGroup</a> is in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     *
     * @return <p>
     *         The tags for the group.
     *         </p>
     */
    public java.util.List<TagDescription> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     *
     * @param tags <p>
     *            The tags for the group.
     *            </p>
     */
    public void setTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagDescription>(tags);
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withTags(TagDescription... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<TagDescription>(tags.length);
        }
        for (TagDescription value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withTags(java.util.Collection<TagDescription> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The termination policies for the group.
     * </p>
     *
     * @return <p>
     *         The termination policies for the group.
     *         </p>
     */
    public java.util.List<String> getTerminationPolicies() {
        return terminationPolicies;
    }

    /**
     * <p>
     * The termination policies for the group.
     * </p>
     *
     * @param terminationPolicies <p>
     *            The termination policies for the group.
     *            </p>
     */
    public void setTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        if (terminationPolicies == null) {
            this.terminationPolicies = null;
            return;
        }

        this.terminationPolicies = new java.util.ArrayList<String>(terminationPolicies);
    }

    /**
     * <p>
     * The termination policies for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicies <p>
     *            The termination policies for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withTerminationPolicies(String... terminationPolicies) {
        if (getTerminationPolicies() == null) {
            this.terminationPolicies = new java.util.ArrayList<String>(terminationPolicies.length);
        }
        for (String value : terminationPolicies) {
            this.terminationPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The termination policies for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicies <p>
     *            The termination policies for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        setTerminationPolicies(terminationPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     *
     * @return <p>
     *         Indicates whether newly launched instances are protected from
     *         termination by Auto Scaling when scaling in.
     *         </p>
     */
    public Boolean isNewInstancesProtectedFromScaleIn() {
        return newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     *
     * @return <p>
     *         Indicates whether newly launched instances are protected from
     *         termination by Auto Scaling when scaling in.
     *         </p>
     */
    public Boolean getNewInstancesProtectedFromScaleIn() {
        return newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     *
     * @param newInstancesProtectedFromScaleIn <p>
     *            Indicates whether newly launched instances are protected from
     *            termination by Auto Scaling when scaling in.
     *            </p>
     */
    public void setNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newInstancesProtectedFromScaleIn <p>
     *            Indicates whether newly launched instances are protected from
     *            termination by Auto Scaling when scaling in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withNewInstancesProtectedFromScaleIn(
            Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto
     * Scaling group uses to call other AWS services on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the service-linked role that
     *         the Auto Scaling group uses to call other AWS services on your
     *         behalf.
     *         </p>
     */
    public String getServiceLinkedRoleARN() {
        return serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto
     * Scaling group uses to call other AWS services on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param serviceLinkedRoleARN <p>
     *            The Amazon Resource Name (ARN) of the service-linked role that
     *            the Auto Scaling group uses to call other AWS services on your
     *            behalf.
     *            </p>
     */
    public void setServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto
     * Scaling group uses to call other AWS services on your behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param serviceLinkedRoleARN <p>
     *            The Amazon Resource Name (ARN) of the service-linked role that
     *            the Auto Scaling group uses to call other AWS services on your
     *            behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getAutoScalingGroupARN() != null)
            sb.append("AutoScalingGroupARN: " + getAutoScalingGroupARN() + ",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: " + getLaunchTemplate() + ",");
        if (getMixedInstancesPolicy() != null)
            sb.append("MixedInstancesPolicy: " + getMixedInstancesPolicy() + ",");
        if (getMinSize() != null)
            sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null)
            sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (getDefaultCooldown() != null)
            sb.append("DefaultCooldown: " + getDefaultCooldown() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getTargetGroupARNs() != null)
            sb.append("TargetGroupARNs: " + getTargetGroupARNs() + ",");
        if (getHealthCheckType() != null)
            sb.append("HealthCheckType: " + getHealthCheckType() + ",");
        if (getHealthCheckGracePeriod() != null)
            sb.append("HealthCheckGracePeriod: " + getHealthCheckGracePeriod() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getSuspendedProcesses() != null)
            sb.append("SuspendedProcesses: " + getSuspendedProcesses() + ",");
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: " + getPlacementGroup() + ",");
        if (getVPCZoneIdentifier() != null)
            sb.append("VPCZoneIdentifier: " + getVPCZoneIdentifier() + ",");
        if (getEnabledMetrics() != null)
            sb.append("EnabledMetrics: " + getEnabledMetrics() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getTerminationPolicies() != null)
            sb.append("TerminationPolicies: " + getTerminationPolicies() + ",");
        if (getNewInstancesProtectedFromScaleIn() != null)
            sb.append("NewInstancesProtectedFromScaleIn: " + getNewInstancesProtectedFromScaleIn()
                    + ",");
        if (getServiceLinkedRoleARN() != null)
            sb.append("ServiceLinkedRoleARN: " + getServiceLinkedRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupARN() == null) ? 0 : getAutoScalingGroupARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode
                + ((getMixedInstancesPolicy() == null) ? 0 : getMixedInstancesPolicy().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultCooldown() == null) ? 0 : getDefaultCooldown().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        hashCode = prime * hashCode
                + ((getTargetGroupARNs() == null) ? 0 : getTargetGroupARNs().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckType() == null) ? 0 : getHealthCheckType().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckGracePeriod() == null) ? 0 : getHealthCheckGracePeriod()
                        .hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getSuspendedProcesses() == null) ? 0 : getSuspendedProcesses().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        hashCode = prime * hashCode
                + ((getVPCZoneIdentifier() == null) ? 0 : getVPCZoneIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getEnabledMetrics() == null) ? 0 : getEnabledMetrics().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTerminationPolicies() == null) ? 0 : getTerminationPolicies().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewInstancesProtectedFromScaleIn() == null) ? 0
                        : getNewInstancesProtectedFromScaleIn().hashCode());
        hashCode = prime * hashCode
                + ((getServiceLinkedRoleARN() == null) ? 0 : getServiceLinkedRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingGroup == false)
            return false;
        AutoScalingGroup other = (AutoScalingGroup) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getAutoScalingGroupARN() == null ^ this.getAutoScalingGroupARN() == null)
            return false;
        if (other.getAutoScalingGroupARN() != null
                && other.getAutoScalingGroupARN().equals(this.getAutoScalingGroupARN()) == false)
            return false;
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null
                && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null
                && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getMixedInstancesPolicy() == null ^ this.getMixedInstancesPolicy() == null)
            return false;
        if (other.getMixedInstancesPolicy() != null
                && other.getMixedInstancesPolicy().equals(this.getMixedInstancesPolicy()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null
                && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getDefaultCooldown() == null ^ this.getDefaultCooldown() == null)
            return false;
        if (other.getDefaultCooldown() != null
                && other.getDefaultCooldown().equals(this.getDefaultCooldown()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null
                && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false)
            return false;
        if (other.getTargetGroupARNs() == null ^ this.getTargetGroupARNs() == null)
            return false;
        if (other.getTargetGroupARNs() != null
                && other.getTargetGroupARNs().equals(this.getTargetGroupARNs()) == false)
            return false;
        if (other.getHealthCheckType() == null ^ this.getHealthCheckType() == null)
            return false;
        if (other.getHealthCheckType() != null
                && other.getHealthCheckType().equals(this.getHealthCheckType()) == false)
            return false;
        if (other.getHealthCheckGracePeriod() == null ^ this.getHealthCheckGracePeriod() == null)
            return false;
        if (other.getHealthCheckGracePeriod() != null
                && other.getHealthCheckGracePeriod().equals(this.getHealthCheckGracePeriod()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getSuspendedProcesses() == null ^ this.getSuspendedProcesses() == null)
            return false;
        if (other.getSuspendedProcesses() != null
                && other.getSuspendedProcesses().equals(this.getSuspendedProcesses()) == false)
            return false;
        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null)
            return false;
        if (other.getPlacementGroup() != null
                && other.getPlacementGroup().equals(this.getPlacementGroup()) == false)
            return false;
        if (other.getVPCZoneIdentifier() == null ^ this.getVPCZoneIdentifier() == null)
            return false;
        if (other.getVPCZoneIdentifier() != null
                && other.getVPCZoneIdentifier().equals(this.getVPCZoneIdentifier()) == false)
            return false;
        if (other.getEnabledMetrics() == null ^ this.getEnabledMetrics() == null)
            return false;
        if (other.getEnabledMetrics() != null
                && other.getEnabledMetrics().equals(this.getEnabledMetrics()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTerminationPolicies() == null ^ this.getTerminationPolicies() == null)
            return false;
        if (other.getTerminationPolicies() != null
                && other.getTerminationPolicies().equals(this.getTerminationPolicies()) == false)
            return false;
        if (other.getNewInstancesProtectedFromScaleIn() == null
                ^ this.getNewInstancesProtectedFromScaleIn() == null)
            return false;
        if (other.getNewInstancesProtectedFromScaleIn() != null
                && other.getNewInstancesProtectedFromScaleIn().equals(
                        this.getNewInstancesProtectedFromScaleIn()) == false)
            return false;
        if (other.getServiceLinkedRoleARN() == null ^ this.getServiceLinkedRoleARN() == null)
            return false;
        if (other.getServiceLinkedRoleARN() != null
                && other.getServiceLinkedRoleARN().equals(this.getServiceLinkedRoleARN()) == false)
            return false;
        return true;
    }
}
