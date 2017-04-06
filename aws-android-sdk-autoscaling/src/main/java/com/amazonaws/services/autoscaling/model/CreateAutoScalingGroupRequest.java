/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates an Auto Scaling group with the specified name and attributes.
 * </p>
 * <p>
 * If you exceed your maximum limit of Auto Scaling groups, which by default is
 * 20 per region, the call fails. For information about viewing and updating
 * this limit, see <a>DescribeAccountLimits</a>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroup.html"
 * >Auto Scaling Groups</a> in the <i>Auto Scaling Developer Guide</i>.
 * </p>
 */
public class CreateAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
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
     * The name of the launch configuration. Alternatively, specify an EC2
     * instance instead of a launch configuration.
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
     * The ID of the instance used to create a launch configuration for the
     * group. Alternatively, specify a launch configuration instead of an EC2
     * instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceId;

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
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
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
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     */
    private Integer defaultCooldown;

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify one or more subnets.
     * </p>
     */
    private java.util.List<String> availabilityZones = new java.util.ArrayList<String>();

    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Using a Load Balancer With an Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> loadBalancerNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
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
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     */
    private Integer healthCheckGracePeriod;

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
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
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String vPCZoneIdentifier;

    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling Developer Guide</i>.
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
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the group. This name must be unique within the scope
     *         of your AWS account.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the group. This name must be unique within the
     *            scope of your AWS account.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
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
     *            The name of the group. This name must be unique within the
     *            scope of your AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration. Alternatively, specify an EC2
     * instance instead of a launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the launch configuration. Alternatively, specify an
     *         EC2 instance instead of a launch configuration.
     *         </p>
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. Alternatively, specify an EC2
     * instance instead of a launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationName <p>
     *            The name of the launch configuration. Alternatively, specify
     *            an EC2 instance instead of a launch configuration.
     *            </p>
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. Alternatively, specify an EC2
     * instance instead of a launch configuration.
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
     *            The name of the launch configuration. Alternatively, specify
     *            an EC2 instance instead of a launch configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * <p>
     * The ID of the instance used to create a launch configuration for the
     * group. Alternatively, specify a launch configuration instead of an EC2
     * instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the instance used to create a launch configuration for
     *         the group. Alternatively, specify a launch configuration instead
     *         of an EC2 instance.
     *         </p>
     *         <p>
     *         When you specify an ID of an instance, Auto Scaling creates a new
     *         launch configuration and associates it with the group. This
     *         launch configuration derives its attributes from the specified
     *         instance, with the exception of the block device mapping.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     *         >Create an Auto Scaling Group Using an EC2 Instance</a> in the
     *         <i>Auto Scaling Developer Guide</i>.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance used to create a launch configuration for the
     * group. Alternatively, specify a launch configuration instead of an EC2
     * instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance used to create a launch configuration
     *            for the group. Alternatively, specify a launch configuration
     *            instead of an EC2 instance.
     *            </p>
     *            <p>
     *            When you specify an ID of an instance, Auto Scaling creates a
     *            new launch configuration and associates it with the group.
     *            This launch configuration derives its attributes from the
     *            specified instance, with the exception of the block device
     *            mapping.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     *            >Create an Auto Scaling Group Using an EC2 Instance</a> in the
     *            <i>Auto Scaling Developer Guide</i>.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance used to create a launch configuration for the
     * group. Alternatively, specify a launch configuration instead of an EC2
     * instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance used to create a launch configuration
     *            for the group. Alternatively, specify a launch configuration
     *            instead of an EC2 instance.
     *            </p>
     *            <p>
     *            When you specify an ID of an instance, Auto Scaling creates a
     *            new launch configuration and associates it with the group.
     *            This launch configuration derives its attributes from the
     *            specified instance, with the exception of the block device
     *            mapping.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     *            >Create an Auto Scaling Group Using an EC2 Instance</a> in the
     *            <i>Auto Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public CreateAutoScalingGroupRequest withMinSize(Integer minSize) {
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
    public CreateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
     * </p>
     *
     * @return <p>
     *         The number of EC2 instances that should be running in the group.
     *         This number must be greater than or equal to the minimum size of
     *         the group and less than or equal to the maximum size of the
     *         group.
     *         </p>
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
     * </p>
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the
     *            group. This number must be greater than or equal to the
     *            minimum size of the group and less than or equal to the
     *            maximum size of the group.
     *            </p>
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the
     *            group. This number must be greater than or equal to the
     *            minimum size of the group and less than or equal to the
     *            maximum size of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
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
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scaling activity
     *         completes before another scaling activity can start. The default
     *         is 300.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     *         >Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer
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
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     *
     * @param defaultCooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before another scaling activity can start. The
     *            default is 300.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     *            >Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer
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
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
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
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     *            >Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify one or more subnets.
     * </p>
     *
     * @return <p>
     *         One or more Availability Zones for the group. This parameter is
     *         optional if you specify one or more subnets.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify one or more subnets.
     * </p>
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones for the group. This parameter
     *            is optional if you specify one or more subnets.
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
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify one or more subnets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones for the group. This parameter
     *            is optional if you specify one or more subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
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
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify one or more subnets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones for the group. This parameter
     *            is optional if you specify one or more subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Using a Load Balancer With an Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         One or more load balancers.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *         >Using a Load Balancer With an Auto Scaling Group</a> in the
     *         <i>Auto Scaling Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Using a Load Balancer With an Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     *
     * @param loadBalancerNames <p>
     *            One or more load balancers.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *            >Using a Load Balancer With an Auto Scaling Group</a> in the
     *            <i>Auto Scaling Developer Guide</i>.
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
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Using a Load Balancer With an Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            One or more load balancers.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *            >Using a Load Balancer With an Auto Scaling Group</a> in the
     *            <i>Auto Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withLoadBalancerNames(String... loadBalancerNames) {
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
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Using a Load Balancer With an Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            One or more load balancers.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *            >Using a Load Balancer With an Auto Scaling Group</a> in the
     *            <i>Auto Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withLoadBalancerNames(
            java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
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
     *         <p>
     *         By default, health checks use Amazon EC2 instance status checks
     *         to determine the health of an instance. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *         >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
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
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
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
     *            <p>
     *            By default, health checks use Amazon EC2 instance status
     *            checks to determine the health of an instance. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *            >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
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
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
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
     *            <p>
     *            By default, health checks use Amazon EC2 instance status
     *            checks to determine the health of an instance. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *            >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, that Auto Scaling waits before
     *         checking the health status of an EC2 instance that has come into
     *         service. During this time, any health check failures for the
     *         instance are ignored. The default is 300.
     *         </p>
     *         <p>
     *         This parameter is required if you are adding an <code>ELB</code>
     *         health check.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *         >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     *         </p>
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     *
     * @param healthCheckGracePeriod <p>
     *            The amount of time, in seconds, that Auto Scaling waits before
     *            checking the health status of an EC2 instance that has come
     *            into service. During this time, any health check failures for
     *            the instance are ignored. The default is 300.
     *            </p>
     *            <p>
     *            This parameter is required if you are adding an
     *            <code>ELB</code> health check.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *            >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     *            </p>
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckGracePeriod <p>
     *            The amount of time, in seconds, that Auto Scaling waits before
     *            checking the health status of an EC2 instance that has come
     *            into service. During this time, any health check failures for
     *            the instance are ignored. The default is 300.
     *            </p>
     *            <p>
     *            This parameter is required if you are adding an
     *            <code>ELB</code> health check.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *            >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        return this;
    }

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
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
     *         The name of the placement group into which you'll launch your
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
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
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
     *            The name of the placement group into which you'll launch your
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
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
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
     *            The name of the placement group into which you'll launch your
     *            instances, if any. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     *            >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * <p>
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A comma-separated list of subnet identifiers for your virtual
     *         private cloud (VPC).
     *         </p>
     *         <p>
     *         If you specify subnets and Availability Zones with this call,
     *         ensure that the subnets' Availability Zones match the
     *         Availability Zones specified.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/asg-in-vpc.html"
     *         >Launching Auto Scaling Instances in a VPC</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     *         </p>
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param vPCZoneIdentifier <p>
     *            A comma-separated list of subnet identifiers for your virtual
     *            private cloud (VPC).
     *            </p>
     *            <p>
     *            If you specify subnets and Availability Zones with this call,
     *            ensure that the subnets' Availability Zones match the
     *            Availability Zones specified.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/asg-in-vpc.html"
     *            >Launching Auto Scaling Instances in a VPC</a> in the <i>Auto
     *            Scaling Developer Guide</i>.
     *            </p>
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/asg-in-vpc.html"
     * >Launching Auto Scaling Instances in a VPC</a> in the <i>Auto Scaling
     * Developer Guide</i>.
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
     * @param vPCZoneIdentifier <p>
     *            A comma-separated list of subnet identifiers for your virtual
     *            private cloud (VPC).
     *            </p>
     *            <p>
     *            If you specify subnets and Availability Zones with this call,
     *            ensure that the subnets' Availability Zones match the
     *            Availability Zones specified.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/asg-in-vpc.html"
     *            >Launching Auto Scaling Instances in a VPC</a> in the <i>Auto
     *            Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         One or more termination policies used to select the instance to
     *         terminate. These policies are executed in the order that they are
     *         listed.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     *         >Controlling Which Instances Auto Scaling Terminates During Scale
     *         In</a> in the <i>Auto Scaling Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getTerminationPolicies() {
        return terminationPolicies;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     *
     * @param terminationPolicies <p>
     *            One or more termination policies used to select the instance
     *            to terminate. These policies are executed in the order that
     *            they are listed.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     *            >Controlling Which Instances Auto Scaling Terminates During
     *            Scale In</a> in the <i>Auto Scaling Developer Guide</i>.
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
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicies <p>
     *            One or more termination policies used to select the instance
     *            to terminate. These policies are executed in the order that
     *            they are listed.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     *            >Controlling Which Instances Auto Scaling Terminates During
     *            Scale In</a> in the <i>Auto Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withTerminationPolicies(String... terminationPolicies) {
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
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     * >Controlling Which Instances Auto Scaling Terminates During Scale In</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicies <p>
     *            One or more termination policies used to select the instance
     *            to terminate. These policies are executed in the order that
     *            they are listed.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html"
     *            >Controlling Which Instances Auto Scaling Terminates During
     *            Scale In</a> in the <i>Auto Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withTerminationPolicies(
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
    public CreateAutoScalingGroupRequest withNewInstancesProtectedFromScaleIn(
            Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *         >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *            >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *            Scaling Developer Guide</i>.
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
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *            >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *            Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withTags(Tag... tags) {
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
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *            >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *            Scaling Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoScalingGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
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
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoScalingGroupRequest == false)
            return false;
        CreateAutoScalingGroupRequest other = (CreateAutoScalingGroupRequest) obj;

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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
