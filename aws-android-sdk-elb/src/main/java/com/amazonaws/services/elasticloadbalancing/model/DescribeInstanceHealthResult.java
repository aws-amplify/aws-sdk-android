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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output for DescribeInstanceHealth.
 * </p>
 */
public class DescribeInstanceHealthResult implements Serializable {
    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     */
    private java.util.List<InstanceState> instanceStates = new java.util.ArrayList<InstanceState>();

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     *
     * @return <p>
     *         Information about the health of the instances.
     *         </p>
     */
    public java.util.List<InstanceState> getInstanceStates() {
        return instanceStates;
    }

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     *
     * @param instanceStates <p>
     *            Information about the health of the instances.
     *            </p>
     */
    public void setInstanceStates(java.util.Collection<InstanceState> instanceStates) {
        if (instanceStates == null) {
            this.instanceStates = null;
            return;
        }

        this.instanceStates = new java.util.ArrayList<InstanceState>(instanceStates);
    }

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStates <p>
     *            Information about the health of the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceHealthResult withInstanceStates(InstanceState... instanceStates) {
        if (getInstanceStates() == null) {
            this.instanceStates = new java.util.ArrayList<InstanceState>(instanceStates.length);
        }
        for (InstanceState value : instanceStates) {
            this.instanceStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStates <p>
     *            Information about the health of the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceHealthResult withInstanceStates(
            java.util.Collection<InstanceState> instanceStates) {
        setInstanceStates(instanceStates);
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
        if (getInstanceStates() != null)
            sb.append("InstanceStates: " + getInstanceStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceStates() == null) ? 0 : getInstanceStates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceHealthResult == false)
            return false;
        DescribeInstanceHealthResult other = (DescribeInstanceHealthResult) obj;

        if (other.getInstanceStates() == null ^ this.getInstanceStates() == null)
            return false;
        if (other.getInstanceStates() != null
                && other.getInstanceStates().equals(this.getInstanceStates()) == false)
            return false;
        return true;
    }
}
