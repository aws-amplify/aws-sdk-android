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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Details on a volume mount point that is used in a container definition.
 * </p>
 */
public class MountPoint implements Serializable {
    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the
     * <code>name</code> parameter of task definition <code>volume</code>.
     * </p>
     */
    private String sourceVolume;

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     */
    private String containerPath;

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the
     * <code>name</code> parameter of task definition <code>volume</code>.
     * </p>
     *
     * @return <p>
     *         The name of the volume to mount. Must be a volume name referenced
     *         in the <code>name</code> parameter of task definition
     *         <code>volume</code>.
     *         </p>
     */
    public String getSourceVolume() {
        return sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the
     * <code>name</code> parameter of task definition <code>volume</code>.
     * </p>
     *
     * @param sourceVolume <p>
     *            The name of the volume to mount. Must be a volume name
     *            referenced in the <code>name</code> parameter of task
     *            definition <code>volume</code>.
     *            </p>
     */
    public void setSourceVolume(String sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the
     * <code>name</code> parameter of task definition <code>volume</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceVolume <p>
     *            The name of the volume to mount. Must be a volume name
     *            referenced in the <code>name</code> parameter of task
     *            definition <code>volume</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountPoint withSourceVolume(String sourceVolume) {
        this.sourceVolume = sourceVolume;
        return this;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     *
     * @return <p>
     *         The path on the container to mount the host volume at.
     *         </p>
     */
    public String getContainerPath() {
        return containerPath;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     *
     * @param containerPath <p>
     *            The path on the container to mount the host volume at.
     *            </p>
     */
    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerPath <p>
     *            The path on the container to mount the host volume at.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountPoint withContainerPath(String containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If this value is <code>true</code>, the container has read-only
     *         access to the volume. If this value is <code>false</code>, then
     *         the container can write to the volume. The default value is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If this value is <code>true</code>, the container has read-only
     *         access to the volume. If this value is <code>false</code>, then
     *         the container can write to the volume. The default value is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     *
     * @param readOnly <p>
     *            If this value is <code>true</code>, the container has
     *            read-only access to the volume. If this value is
     *            <code>false</code>, then the container can write to the
     *            volume. The default value is <code>false</code>.
     *            </p>
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readOnly <p>
     *            If this value is <code>true</code>, the container has
     *            read-only access to the volume. If this value is
     *            <code>false</code>, then the container can write to the
     *            volume. The default value is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountPoint withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
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
        if (getSourceVolume() != null)
            sb.append("sourceVolume: " + getSourceVolume() + ",");
        if (getContainerPath() != null)
            sb.append("containerPath: " + getContainerPath() + ",");
        if (getReadOnly() != null)
            sb.append("readOnly: " + getReadOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceVolume() == null) ? 0 : getSourceVolume().hashCode());
        hashCode = prime * hashCode
                + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MountPoint == false)
            return false;
        MountPoint other = (MountPoint) obj;

        if (other.getSourceVolume() == null ^ this.getSourceVolume() == null)
            return false;
        if (other.getSourceVolume() != null
                && other.getSourceVolume().equals(this.getSourceVolume()) == false)
            return false;
        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null
                && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        return true;
    }
}
