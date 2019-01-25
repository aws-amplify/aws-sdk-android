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
 * Describes an EC2 instance associated with an Auto Scaling group.
 * </p>
 */
public class AutoScalingInstanceDetails implements Serializable {
    /**
     * <p>
     * The ID of the instance.
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
     * The name of the Auto Scaling group for the instance.
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
     * The Availability Zone for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String availabilityZone;

    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     * >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String lifecycleState;

    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that
     * the instance is healthy and should remain in service. "Unhealthy" means
     * that the instance is unhealthy and Amazon EC2 Auto Scaling should
     * terminate and replace it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String healthStatus;

    /**
     * <p>
     * The launch configuration used to launch the instance. This value is not
     * available if you attached the instance to the Auto Scaling group.
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
     * The launch template for the instance.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     */
    private Boolean protectedFromScaleIn;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
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
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group for the instance.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group for the instance.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group for the instance.
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
     *            The name of the Auto Scaling group for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Availability Zone for the instance.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the instance.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
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
     * @param availabilityZone <p>
     *            The Availability Zone for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     * >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The lifecycle state for the instance. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     *         >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling
     *         User Guide</i>.
     *         </p>
     */
    public String getLifecycleState() {
        return lifecycleState;
    }

    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     * >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param lifecycleState <p>
     *            The lifecycle state for the instance. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     *            >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling
     *            User Guide</i>.
     *            </p>
     */
    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     * >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
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
     * @param lifecycleState <p>
     *            The lifecycle state for the instance. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
     *            >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }

    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that
     * the instance is healthy and should remain in service. "Unhealthy" means
     * that the instance is unhealthy and Amazon EC2 Auto Scaling should
     * terminate and replace it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The last reported health status of this instance. "Healthy" means
     *         that the instance is healthy and should remain in service.
     *         "Unhealthy" means that the instance is unhealthy and Amazon EC2
     *         Auto Scaling should terminate and replace it.
     *         </p>
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that
     * the instance is healthy and should remain in service. "Unhealthy" means
     * that the instance is unhealthy and Amazon EC2 Auto Scaling should
     * terminate and replace it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param healthStatus <p>
     *            The last reported health status of this instance. "Healthy"
     *            means that the instance is healthy and should remain in
     *            service. "Unhealthy" means that the instance is unhealthy and
     *            Amazon EC2 Auto Scaling should terminate and replace it.
     *            </p>
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that
     * the instance is healthy and should remain in service. "Unhealthy" means
     * that the instance is unhealthy and Amazon EC2 Auto Scaling should
     * terminate and replace it.
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
     * @param healthStatus <p>
     *            The last reported health status of this instance. "Healthy"
     *            means that the instance is healthy and should remain in
     *            service. "Unhealthy" means that the instance is unhealthy and
     *            Amazon EC2 Auto Scaling should terminate and replace it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * The launch configuration used to launch the instance. This value is not
     * available if you attached the instance to the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The launch configuration used to launch the instance. This value
     *         is not available if you attached the instance to the Auto Scaling
     *         group.
     *         </p>
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * <p>
     * The launch configuration used to launch the instance. This value is not
     * available if you attached the instance to the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationName <p>
     *            The launch configuration used to launch the instance. This
     *            value is not available if you attached the instance to the
     *            Auto Scaling group.
     *            </p>
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The launch configuration used to launch the instance. This value is not
     * available if you attached the instance to the Auto Scaling group.
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
     *            The launch configuration used to launch the instance. This
     *            value is not available if you attached the instance to the
     *            Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * <p>
     * The launch template for the instance.
     * </p>
     *
     * @return <p>
     *         The launch template for the instance.
     *         </p>
     */
    public LaunchTemplateSpecification getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * <p>
     * The launch template for the instance.
     * </p>
     *
     * @param launchTemplate <p>
     *            The launch template for the instance.
     *            </p>
     */
    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplate <p>
     *            The launch template for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is protected from termination by
     *         Amazon EC2 Auto Scaling when scaling in.
     *         </p>
     */
    public Boolean isProtectedFromScaleIn() {
        return protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is protected from termination by
     *         Amazon EC2 Auto Scaling when scaling in.
     *         </p>
     */
    public Boolean getProtectedFromScaleIn() {
        return protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     *
     * @param protectedFromScaleIn <p>
     *            Indicates whether the instance is protected from termination
     *            by Amazon EC2 Auto Scaling when scaling in.
     *            </p>
     */
    public void setProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protectedFromScaleIn <p>
     *            Indicates whether the instance is protected from termination
     *            by Amazon EC2 Auto Scaling when scaling in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingInstanceDetails withProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: " + getLifecycleState() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: " + getLaunchTemplate() + ",");
        if (getProtectedFromScaleIn() != null)
            sb.append("ProtectedFromScaleIn: " + getProtectedFromScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleState() == null) ? 0 : getLifecycleState().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode
                + ((getProtectedFromScaleIn() == null) ? 0 : getProtectedFromScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingInstanceDetails == false)
            return false;
        AutoScalingInstanceDetails other = (AutoScalingInstanceDetails) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getLifecycleState() == null ^ this.getLifecycleState() == null)
            return false;
        if (other.getLifecycleState() != null
                && other.getLifecycleState().equals(this.getLifecycleState()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
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
        if (other.getProtectedFromScaleIn() == null ^ this.getProtectedFromScaleIn() == null)
            return false;
        if (other.getProtectedFromScaleIn() != null
                && other.getProtectedFromScaleIn().equals(this.getProtectedFromScaleIn()) == false)
            return false;
        return true;
    }
}
