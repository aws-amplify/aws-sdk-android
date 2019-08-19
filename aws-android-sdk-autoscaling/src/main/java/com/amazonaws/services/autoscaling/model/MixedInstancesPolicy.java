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
 * Describes a mixed instances policy for an Auto Scaling group. With mixed
 * instances, your Auto Scaling group can provision a combination of On-Demand
 * Instances and Spot Instances across multiple instance types. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html"
 * >Auto Scaling Groups with Multiple Instance Types and Purchase Options</a> in
 * the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * <p>
 * You can create a mixed instances policy for a new Auto Scaling group, or you
 * can create it for an existing group by updating the group to specify
 * <code>MixedInstancesPolicy</code> as the top-level parameter instead of a
 * launch configuration or template. For more information, see
 * <a>CreateAutoScalingGroup</a> and <a>UpdateAutoScalingGroup</a>.
 * </p>
 */
public class MixedInstancesPolicy implements Serializable {
    /**
     * <p>
     * The launch template and instance types (overrides).
     * </p>
     * <p>
     * This parameter must be specified when creating a mixed instances policy.
     * </p>
     */
    private LaunchTemplate launchTemplate;

    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating a mixed instances
     * policy, the default values are used.
     * </p>
     */
    private InstancesDistribution instancesDistribution;

    /**
     * <p>
     * The launch template and instance types (overrides).
     * </p>
     * <p>
     * This parameter must be specified when creating a mixed instances policy.
     * </p>
     *
     * @return <p>
     *         The launch template and instance types (overrides).
     *         </p>
     *         <p>
     *         This parameter must be specified when creating a mixed instances
     *         policy.
     *         </p>
     */
    public LaunchTemplate getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * <p>
     * The launch template and instance types (overrides).
     * </p>
     * <p>
     * This parameter must be specified when creating a mixed instances policy.
     * </p>
     *
     * @param launchTemplate <p>
     *            The launch template and instance types (overrides).
     *            </p>
     *            <p>
     *            This parameter must be specified when creating a mixed
     *            instances policy.
     *            </p>
     */
    public void setLaunchTemplate(LaunchTemplate launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template and instance types (overrides).
     * </p>
     * <p>
     * This parameter must be specified when creating a mixed instances policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplate <p>
     *            The launch template and instance types (overrides).
     *            </p>
     *            <p>
     *            This parameter must be specified when creating a mixed
     *            instances policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MixedInstancesPolicy withLaunchTemplate(LaunchTemplate launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating a mixed instances
     * policy, the default values are used.
     * </p>
     *
     * @return <p>
     *         The instances distribution to use.
     *         </p>
     *         <p>
     *         If you leave this parameter unspecified when creating a mixed
     *         instances policy, the default values are used.
     *         </p>
     */
    public InstancesDistribution getInstancesDistribution() {
        return instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating a mixed instances
     * policy, the default values are used.
     * </p>
     *
     * @param instancesDistribution <p>
     *            The instances distribution to use.
     *            </p>
     *            <p>
     *            If you leave this parameter unspecified when creating a mixed
     *            instances policy, the default values are used.
     *            </p>
     */
    public void setInstancesDistribution(InstancesDistribution instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating a mixed instances
     * policy, the default values are used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesDistribution <p>
     *            The instances distribution to use.
     *            </p>
     *            <p>
     *            If you leave this parameter unspecified when creating a mixed
     *            instances policy, the default values are used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MixedInstancesPolicy withInstancesDistribution(
            InstancesDistribution instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
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
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: " + getLaunchTemplate() + ",");
        if (getInstancesDistribution() != null)
            sb.append("InstancesDistribution: " + getInstancesDistribution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstancesDistribution() == null) ? 0 : getInstancesDistribution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MixedInstancesPolicy == false)
            return false;
        MixedInstancesPolicy other = (MixedInstancesPolicy) obj;

        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null
                && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getInstancesDistribution() == null ^ this.getInstancesDistribution() == null)
            return false;
        if (other.getInstancesDistribution() != null
                && other.getInstancesDistribution().equals(this.getInstancesDistribution()) == false)
            return false;
        return true;
    }
}
