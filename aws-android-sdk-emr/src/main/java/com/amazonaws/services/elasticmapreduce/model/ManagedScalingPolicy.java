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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Managed scaling policy for an Amazon EMR cluster. The policy specifies the
 * limits for resources that can be added or terminated from a cluster. The
 * policy only applies to the core and task nodes. The master node cannot be
 * scaled after initial configuration.
 * </p>
 */
public class ManagedScalingPolicy implements Serializable {
    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling
     * activity of a cluster is not allowed to go above or below these limits.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     */
    private ComputeLimits computeLimits;

    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling
     * activity of a cluster is not allowed to go above or below these limits.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     *
     * @return <p>
     *         The EC2 unit limits for a managed scaling policy. The managed
     *         scaling activity of a cluster is not allowed to go above or below
     *         these limits. The limit only applies to the core and task nodes.
     *         The master node cannot be scaled after initial configuration.
     *         </p>
     */
    public ComputeLimits getComputeLimits() {
        return computeLimits;
    }

    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling
     * activity of a cluster is not allowed to go above or below these limits.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     *
     * @param computeLimits <p>
     *            The EC2 unit limits for a managed scaling policy. The managed
     *            scaling activity of a cluster is not allowed to go above or
     *            below these limits. The limit only applies to the core and
     *            task nodes. The master node cannot be scaled after initial
     *            configuration.
     *            </p>
     */
    public void setComputeLimits(ComputeLimits computeLimits) {
        this.computeLimits = computeLimits;
    }

    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling
     * activity of a cluster is not allowed to go above or below these limits.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param computeLimits <p>
     *            The EC2 unit limits for a managed scaling policy. The managed
     *            scaling activity of a cluster is not allowed to go above or
     *            below these limits. The limit only applies to the core and
     *            task nodes. The master node cannot be scaled after initial
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedScalingPolicy withComputeLimits(ComputeLimits computeLimits) {
        this.computeLimits = computeLimits;
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
        if (getComputeLimits() != null)
            sb.append("ComputeLimits: " + getComputeLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComputeLimits() == null) ? 0 : getComputeLimits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedScalingPolicy == false)
            return false;
        ManagedScalingPolicy other = (ManagedScalingPolicy) obj;

        if (other.getComputeLimits() == null ^ this.getComputeLimits() == null)
            return false;
        if (other.getComputeLimits() != null
                && other.getComputeLimits().equals(this.getComputeLimits()) == false)
            return false;
        return true;
    }
}
