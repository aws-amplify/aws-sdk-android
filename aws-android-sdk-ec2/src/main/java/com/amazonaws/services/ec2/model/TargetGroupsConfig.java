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
 * Describes the target groups to attach to a Spot Fleet. Spot Fleet registers
 * the running Spot Instances with these target groups.
 * </p>
 */
public class TargetGroupsConfig implements Serializable {
    /**
     * <p>
     * One or more target groups.
     * </p>
     */
    private java.util.List<TargetGroup> targetGroups;

    /**
     * <p>
     * One or more target groups.
     * </p>
     *
     * @return <p>
     *         One or more target groups.
     *         </p>
     */
    public java.util.List<TargetGroup> getTargetGroups() {
        return targetGroups;
    }

    /**
     * <p>
     * One or more target groups.
     * </p>
     *
     * @param targetGroups <p>
     *            One or more target groups.
     *            </p>
     */
    public void setTargetGroups(java.util.Collection<TargetGroup> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new java.util.ArrayList<TargetGroup>(targetGroups);
    }

    /**
     * <p>
     * One or more target groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroups <p>
     *            One or more target groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGroupsConfig withTargetGroups(TargetGroup... targetGroups) {
        if (getTargetGroups() == null) {
            this.targetGroups = new java.util.ArrayList<TargetGroup>(targetGroups.length);
        }
        for (TargetGroup value : targetGroups) {
            this.targetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more target groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroups <p>
     *            One or more target groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGroupsConfig withTargetGroups(java.util.Collection<TargetGroup> targetGroups) {
        setTargetGroups(targetGroups);
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
        if (getTargetGroups() != null)
            sb.append("TargetGroups: " + getTargetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupsConfig == false)
            return false;
        TargetGroupsConfig other = (TargetGroupsConfig) obj;

        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null
                && other.getTargetGroups().equals(this.getTargetGroups()) == false)
            return false;
        return true;
    }
}
