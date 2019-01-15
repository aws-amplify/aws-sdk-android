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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the configuration for the specified Auto Scaling group.
 * </p>
 * <p>
 * The new settings take effect on any scaling activities after this call
 * returns. Scaling activities that are currently in progress aren't affected.
 * </p>
 * <p>
 * To update an Auto Scaling group with a launch configuration with
 * <code>InstanceMonitoring</code> set to <code>false</code>, you must first
 * disable the collection of group metrics. Otherwise, you get an error. If you
 * have previously enabled the collection of group metrics, you can disable it
 * using <a>DisableMetricsCollection</a>.
 * </p>
 * <p>
 * Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you specify a new value for <code>MinSize</code> without specifying a
 * value for <code>DesiredCapacity</code>, and the new <code>MinSize</code> is
 * larger than the current size of the group, we implicitly call
 * <a>SetDesiredCapacity</a> to set the size of the group to the new value of
 * <code>MinSize</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you specify a new value for <code>MaxSize</code> without specifying a
 * value for <code>DesiredCapacity</code>, and the new <code>MaxSize</code> is
 * smaller than the current size of the group, we implicitly call
 * <a>SetDesiredCapacity</a> to set the size of the group to the new value of
 * <code>MaxSize</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * All other optional parameters are left unchanged if not specified.
 * </p>
 * </li>
 * </ul>
 */
public class UpdateAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you
     * can't specify a launch template or a mixed instances policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String launchConfigurationName;

    /**
     * <p>
     * The launch template and version to use to specify the updates. If you
     * specify this parameter, you can't specify a launch configuration or a
     * mixed instances policy.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;

    /**
     * <p>
     * The mixed instances policy to use to specify the updates. If you specify
     * this parameter, you can't specify a launch configuration or a launch
     * template.
     * </p>
     */
    private MixedInstancesPolicy mixedInstancesPolicy;

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     */
    private Integer minSize;

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     */
    private Integer maxSize;

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group. This number must be greater than or equal to the minimum size of
     * the group and less than or equal to the maximum size of the group.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * The default is 0.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     * >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer healthCheckGracePeriod;

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
     * The ID of the subnet, if you are launching into a VPC. You can specify
     * several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Amazon EC2 Auto
     * Scaling User Guide</i>.
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
     * A standalone termination policy or a list of termination policies used to
     * select the instance to terminate. The policies are executed in the order
     * that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling User Guide</i>.
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
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you
     * can't specify a launch template or a mixed instances policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the launch configuration. If you specify this
     *         parameter, you can't specify a launch template or a mixed
     *         instances policy.
     *         </p>
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you
     * can't specify a launch template or a mixed instances policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationName <p>
     *            The name of the launch configuration. If you specify this
     *            parameter, you can't specify a launch template or a mixed
     *            instances policy.
     *            </p>
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you
     * can't specify a launch template or a mixed instances policy.
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
     * @param launchConfigurationName <p>
     *            The name of the launch configuration. If you specify this
     *            parameter, you can't specify a launch template or a mixed
     *            instances policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * <p>
     * The launch template and version to use to specify the updates. If you
     * specify this parameter, you can't specify a launch configuration or a
     * mixed instances policy.
     * </p>
     *
     * @return <p>
     *         The launch template and version to use to specify the updates. If
     *         you specify this parameter, you can't specify a launch
     *         configuration or a mixed instances policy.
     *         </p>
     */
    public LaunchTemplateSpecification getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * <p>
     * The launch template and version to use to specify the updates. If you
     * specify this parameter, you can't specify a launch configuration or a
     * mixed instances policy.
     * </p>
     *
     * @param launchTemplate <p>
     *            The launch template and version to use to specify the updates.
     *            If you specify this parameter, you can't specify a launch
     *            configuration or a mixed instances policy.
     *            </p>
     */
    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template and version to use to specify the updates. If you
     * specify this parameter, you can't specify a launch configuration or a
     * mixed instances policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplate <p>
     *            The launch template and version to use to specify the updates.
     *            If you specify this parameter, you can't specify a launch
     *            configuration or a mixed instances policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withLaunchTemplate(
            LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * <p>
     * The mixed instances policy to use to specify the updates. If you specify
     * this parameter, you can't specify a launch configuration or a launch
     * template.
     * </p>
     *
     * @return <p>
     *         The mixed instances policy to use to specify the updates. If you
     *         specify this parameter, you can't specify a launch configuration
     *         or a launch template.
     *         </p>
     */
    public MixedInstancesPolicy getMixedInstancesPolicy() {
        return mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy to use to specify the updates. If you specify
     * this parameter, you can't specify a launch configuration or a launch
     * template.
     * </p>
     *
     * @param mixedInstancesPolicy <p>
     *            The mixed instances policy to use to specify the updates. If
     *            you specify this parameter, you can't specify a launch
     *            configuration or a launch template.
     *            </p>
     */
    public void setMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy to use to specify the updates. If you specify
     * this parameter, you can't specify a launch configuration or a launch
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mixedInstancesPolicy <p>
     *            The mixed instances policy to use to specify the updates. If
     *            you specify this parameter, you can't specify a launch
     *            configuration or a launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withMixedInstancesPolicy(
            MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
        return this;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     *
     * @return <p>
     *         The minimum size of the Auto Scaling group.
     *         </p>
     */
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     *
     * @param minSize <p>
     *            The minimum size of the Auto Scaling group.
     *            </p>
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minSize <p>
     *            The minimum size of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     *
     * @return <p>
     *         The maximum size of the Auto Scaling group.
     *         </p>
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     *
     * @param maxSize <p>
     *            The maximum size of the Auto Scaling group.
     *            </p>
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSize <p>
     *            The maximum size of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group. This number must be greater than or equal to the minimum size of
     * the group and less than or equal to the maximum size of the group.
     * </p>
     *
     * @return <p>
     *         The number of EC2 instances that should be running in the Auto
     *         Scaling group. This number must be greater than or equal to the
     *         minimum size of the group and less than or equal to the maximum
     *         size of the group.
     *         </p>
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group. This number must be greater than or equal to the minimum size of
     * the group and less than or equal to the maximum size of the group.
     * </p>
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the Auto
     *            Scaling group. This number must be greater than or equal to
     *            the minimum size of the group and less than or equal to the
     *            maximum size of the group.
     *            </p>
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group. This number must be greater than or equal to the minimum size of
     * the group and less than or equal to the maximum size of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the Auto
     *            Scaling group. This number must be greater than or equal to
     *            the minimum size of the group and less than or equal to the
     *            maximum size of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scaling activity
     *         completes before another scaling activity can start. The default
     *         is 300.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *         >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     *         </p>
     */
    public Integer getDefaultCooldown() {
        return defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @param defaultCooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before another scaling activity can start. The
     *            default is 300.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *            >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     */
    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before another scaling activity can start. The
     *            default is 300.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *            >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
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
    public UpdateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
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
    public UpdateAutoScalingGroupRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
    public UpdateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before
     * checking the health status of an EC2 instance that has come into service.
     * The default is 0.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     * >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, that Amazon EC2 Auto Scaling
     *         waits before checking the health status of an EC2 instance that
     *         has come into service. The default is 0.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     *         >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     *         </p>
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before
     * checking the health status of an EC2 instance that has come into service.
     * The default is 0.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     * >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @param healthCheckGracePeriod <p>
     *            The amount of time, in seconds, that Amazon EC2 Auto Scaling
     *            waits before checking the health status of an EC2 instance
     *            that has come into service. The default is 0.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     *            >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before
     * checking the health status of an EC2 instance that has come into service.
     * The default is 0.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     * >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckGracePeriod <p>
     *            The amount of time, in seconds, that Amazon EC2 Auto Scaling
     *            waits before checking the health status of an EC2 instance
     *            that has come into service. The default is 0.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html"
     *            >Health Checks</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
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
    public UpdateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet, if you are launching into a VPC. You can specify
     * several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Amazon EC2 Auto
     * Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2047<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the subnet, if you are launching into a VPC. You can
     *         specify several subnets in a comma-separated list.
     *         </p>
     *         <p>
     *         When you specify <code>VPCZoneIdentifier</code> with
     *         <code>AvailabilityZones</code>, ensure that the subnets'
     *         Availability Zones match the values you specify for
     *         <code>AvailabilityZones</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html"
     *         >Launching Auto Scaling Instances in a VPC</a> in the <i>Amazon
     *         EC2 Auto Scaling User Guide</i>.
     *         </p>
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }

    /**
     * <p>
     * The ID of the subnet, if you are launching into a VPC. You can specify
     * several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Amazon EC2 Auto
     * Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2047<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param vPCZoneIdentifier <p>
     *            The ID of the subnet, if you are launching into a VPC. You can
     *            specify several subnets in a comma-separated list.
     *            </p>
     *            <p>
     *            When you specify <code>VPCZoneIdentifier</code> with
     *            <code>AvailabilityZones</code>, ensure that the subnets'
     *            Availability Zones match the values you specify for
     *            <code>AvailabilityZones</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html"
     *            >Launching Auto Scaling Instances in a VPC</a> in the
     *            <i>Amazon EC2 Auto Scaling User Guide</i>.
     *            </p>
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * The ID of the subnet, if you are launching into a VPC. You can specify
     * several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Amazon EC2 Auto
     * Scaling User Guide</i>.
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
     *            The ID of the subnet, if you are launching into a VPC. You can
     *            specify several subnets in a comma-separated list.
     *            </p>
     *            <p>
     *            When you specify <code>VPCZoneIdentifier</code> with
     *            <code>AvailabilityZones</code>, ensure that the subnets'
     *            Availability Zones match the values you specify for
     *            <code>AvailabilityZones</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html"
     *            >Launching Auto Scaling Instances in a VPC</a> in the
     *            <i>Amazon EC2 Auto Scaling User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }

    /**
     * <p>
     * A standalone termination policy or a list of termination policies used to
     * select the instance to terminate. The policies are executed in the order
     * that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A standalone termination policy or a list of termination policies
     *         used to select the instance to terminate. The policies are
     *         executed in the order that they are listed.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     *         >Controlling Which Instances Auto Scaling Terminates During Scale
     *         In</a> in the <i>Auto Scaling User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getTerminationPolicies() {
        return terminationPolicies;
    }

    /**
     * <p>
     * A standalone termination policy or a list of termination policies used to
     * select the instance to terminate. The policies are executed in the order
     * that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling User Guide</i>.
     * </p>
     *
     * @param terminationPolicies <p>
     *            A standalone termination policy or a list of termination
     *            policies used to select the instance to terminate. The
     *            policies are executed in the order that they are listed.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     *            >Controlling Which Instances Auto Scaling Terminates During
     *            Scale In</a> in the <i>Auto Scaling User Guide</i>.
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
     * A standalone termination policy or a list of termination policies used to
     * select the instance to terminate. The policies are executed in the order
     * that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicies <p>
     *            A standalone termination policy or a list of termination
     *            policies used to select the instance to terminate. The
     *            policies are executed in the order that they are listed.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     *            >Controlling Which Instances Auto Scaling Terminates During
     *            Scale In</a> in the <i>Auto Scaling User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withTerminationPolicies(String... terminationPolicies) {
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
     * A standalone termination policy or a list of termination policies used to
     * select the instance to terminate. The policies are executed in the order
     * that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicies <p>
     *            A standalone termination policy or a list of termination
     *            policies used to select the instance to terminate. The
     *            policies are executed in the order that they are listed.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html"
     *            >Controlling Which Instances Auto Scaling Terminates During
     *            Scale In</a> in the <i>Auto Scaling User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutoScalingGroupRequest withTerminationPolicies(
            java.util.Collection<String> terminationPolicies) {
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
    public UpdateAutoScalingGroupRequest withNewInstancesProtectedFromScaleIn(
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
    public UpdateAutoScalingGroupRequest withServiceLinkedRoleARN(String serviceLinkedRoleARN) {
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
        if (getHealthCheckType() != null)
            sb.append("HealthCheckType: " + getHealthCheckType() + ",");
        if (getHealthCheckGracePeriod() != null)
            sb.append("HealthCheckGracePeriod: " + getHealthCheckGracePeriod() + ",");
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: " + getPlacementGroup() + ",");
        if (getVPCZoneIdentifier() != null)
            sb.append("VPCZoneIdentifier: " + getVPCZoneIdentifier() + ",");
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
                + ((getHealthCheckType() == null) ? 0 : getHealthCheckType().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckGracePeriod() == null) ? 0 : getHealthCheckGracePeriod()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        hashCode = prime * hashCode
                + ((getVPCZoneIdentifier() == null) ? 0 : getVPCZoneIdentifier().hashCode());
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

        if (obj instanceof UpdateAutoScalingGroupRequest == false)
            return false;
        UpdateAutoScalingGroupRequest other = (UpdateAutoScalingGroupRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
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
