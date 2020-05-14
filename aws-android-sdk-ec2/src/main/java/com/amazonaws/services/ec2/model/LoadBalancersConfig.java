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
 * Describes the Classic Load Balancers and target groups to attach to a Spot
 * Fleet request.
 * </p>
 */
public class LoadBalancersConfig implements Serializable {
    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     */
    private ClassicLoadBalancersConfig classicLoadBalancersConfig;

    /**
     * <p>
     * The target groups.
     * </p>
     */
    private TargetGroupsConfig targetGroupsConfig;

    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     *
     * @return <p>
     *         The Classic Load Balancers.
     *         </p>
     */
    public ClassicLoadBalancersConfig getClassicLoadBalancersConfig() {
        return classicLoadBalancersConfig;
    }

    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     *
     * @param classicLoadBalancersConfig <p>
     *            The Classic Load Balancers.
     *            </p>
     */
    public void setClassicLoadBalancersConfig(ClassicLoadBalancersConfig classicLoadBalancersConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
    }

    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classicLoadBalancersConfig <p>
     *            The Classic Load Balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancersConfig withClassicLoadBalancersConfig(
            ClassicLoadBalancersConfig classicLoadBalancersConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
        return this;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     *
     * @return <p>
     *         The target groups.
     *         </p>
     */
    public TargetGroupsConfig getTargetGroupsConfig() {
        return targetGroupsConfig;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     *
     * @param targetGroupsConfig <p>
     *            The target groups.
     *            </p>
     */
    public void setTargetGroupsConfig(TargetGroupsConfig targetGroupsConfig) {
        this.targetGroupsConfig = targetGroupsConfig;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupsConfig <p>
     *            The target groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancersConfig withTargetGroupsConfig(TargetGroupsConfig targetGroupsConfig) {
        this.targetGroupsConfig = targetGroupsConfig;
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
        if (getClassicLoadBalancersConfig() != null)
            sb.append("ClassicLoadBalancersConfig: " + getClassicLoadBalancersConfig() + ",");
        if (getTargetGroupsConfig() != null)
            sb.append("TargetGroupsConfig: " + getTargetGroupsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClassicLoadBalancersConfig() == null) ? 0 : getClassicLoadBalancersConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTargetGroupsConfig() == null) ? 0 : getTargetGroupsConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancersConfig == false)
            return false;
        LoadBalancersConfig other = (LoadBalancersConfig) obj;

        if (other.getClassicLoadBalancersConfig() == null
                ^ this.getClassicLoadBalancersConfig() == null)
            return false;
        if (other.getClassicLoadBalancersConfig() != null
                && other.getClassicLoadBalancersConfig().equals(
                        this.getClassicLoadBalancersConfig()) == false)
            return false;
        if (other.getTargetGroupsConfig() == null ^ this.getTargetGroupsConfig() == null)
            return false;
        if (other.getTargetGroupsConfig() != null
                && other.getTargetGroupsConfig().equals(this.getTargetGroupsConfig()) == false)
            return false;
        return true;
    }
}
