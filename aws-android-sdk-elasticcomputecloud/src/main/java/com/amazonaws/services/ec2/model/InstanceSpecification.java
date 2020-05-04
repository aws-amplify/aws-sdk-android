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
 * The instance details to specify which volumes should be snapshotted.
 * </p>
 */
public class InstanceSpecification implements Serializable {
    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     */
    private Boolean excludeBootVolume;

    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     *
     * @return <p>
     *         The instance to specify which volumes should be snapshotted.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     *
     * @param instanceId <p>
     *            The instance to specify which volumes should be snapshotted.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The instance to specify which volumes should be snapshotted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSpecification withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     *
     * @return <p>
     *         Excludes the root volume from being snapshotted.
     *         </p>
     */
    public Boolean isExcludeBootVolume() {
        return excludeBootVolume;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     *
     * @return <p>
     *         Excludes the root volume from being snapshotted.
     *         </p>
     */
    public Boolean getExcludeBootVolume() {
        return excludeBootVolume;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     *
     * @param excludeBootVolume <p>
     *            Excludes the root volume from being snapshotted.
     *            </p>
     */
    public void setExcludeBootVolume(Boolean excludeBootVolume) {
        this.excludeBootVolume = excludeBootVolume;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeBootVolume <p>
     *            Excludes the root volume from being snapshotted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSpecification withExcludeBootVolume(Boolean excludeBootVolume) {
        this.excludeBootVolume = excludeBootVolume;
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
        if (getExcludeBootVolume() != null)
            sb.append("ExcludeBootVolume: " + getExcludeBootVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getExcludeBootVolume() == null) ? 0 : getExcludeBootVolume().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSpecification == false)
            return false;
        InstanceSpecification other = (InstanceSpecification) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getExcludeBootVolume() == null ^ this.getExcludeBootVolume() == null)
            return false;
        if (other.getExcludeBootVolume() != null
                && other.getExcludeBootVolume().equals(this.getExcludeBootVolume()) == false)
            return false;
        return true;
    }
}
