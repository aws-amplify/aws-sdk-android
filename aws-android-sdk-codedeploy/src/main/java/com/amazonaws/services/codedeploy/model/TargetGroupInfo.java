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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a target group in Elastic Load Balancing to use in a
 * deployment. Instances are registered as targets in a target group, and
 * traffic is routed to the target group.
 * </p>
 */
public class TargetGroupInfo implements Serializable {
    /**
     * <p>
     * For blue/green deployments, the name of the target group that instances
     * in the original environment are deregistered from, and instances in the
     * replacement environment are registered with. For in-place deployments,
     * the name of the target group that instances are deregistered from, so
     * they are not serving traffic during a deployment, and then re-registered
     * with after the deployment is complete.
     * </p>
     */
    private String name;

    /**
     * <p>
     * For blue/green deployments, the name of the target group that instances
     * in the original environment are deregistered from, and instances in the
     * replacement environment are registered with. For in-place deployments,
     * the name of the target group that instances are deregistered from, so
     * they are not serving traffic during a deployment, and then re-registered
     * with after the deployment is complete.
     * </p>
     *
     * @return <p>
     *         For blue/green deployments, the name of the target group that
     *         instances in the original environment are deregistered from, and
     *         instances in the replacement environment are registered with. For
     *         in-place deployments, the name of the target group that instances
     *         are deregistered from, so they are not serving traffic during a
     *         deployment, and then re-registered with after the deployment is
     *         complete.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * For blue/green deployments, the name of the target group that instances
     * in the original environment are deregistered from, and instances in the
     * replacement environment are registered with. For in-place deployments,
     * the name of the target group that instances are deregistered from, so
     * they are not serving traffic during a deployment, and then re-registered
     * with after the deployment is complete.
     * </p>
     *
     * @param name <p>
     *            For blue/green deployments, the name of the target group that
     *            instances in the original environment are deregistered from,
     *            and instances in the replacement environment are registered
     *            with. For in-place deployments, the name of the target group
     *            that instances are deregistered from, so they are not serving
     *            traffic during a deployment, and then re-registered with after
     *            the deployment is complete.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * For blue/green deployments, the name of the target group that instances
     * in the original environment are deregistered from, and instances in the
     * replacement environment are registered with. For in-place deployments,
     * the name of the target group that instances are deregistered from, so
     * they are not serving traffic during a deployment, and then re-registered
     * with after the deployment is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            For blue/green deployments, the name of the target group that
     *            instances in the original environment are deregistered from,
     *            and instances in the replacement environment are registered
     *            with. For in-place deployments, the name of the target group
     *            that instances are deregistered from, so they are not serving
     *            traffic during a deployment, and then re-registered with after
     *            the deployment is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGroupInfo withName(String name) {
        this.name = name;
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
        if (getName() != null)
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupInfo == false)
            return false;
        TargetGroupInfo other = (TargetGroupInfo) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
