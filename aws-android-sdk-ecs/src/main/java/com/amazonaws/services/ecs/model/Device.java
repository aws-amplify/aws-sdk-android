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
 * An object representing a container instance host device.
 * </p>
 */
public class Device implements Serializable {
    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     */
    private String hostPath;

    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     */
    private String containerPath;

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By
     * default, the container has permissions for <code>read</code>,
     * <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     */
    private java.util.List<String> permissions;

    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     *
     * @return <p>
     *         The path for the device on the host container instance.
     *         </p>
     */
    public String getHostPath() {
        return hostPath;
    }

    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     *
     * @param hostPath <p>
     *            The path for the device on the host container instance.
     *            </p>
     */
    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostPath <p>
     *            The path for the device on the host container instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     *
     * @return <p>
     *         The path inside the container at which to expose the host device.
     *         </p>
     */
    public String getContainerPath() {
        return containerPath;
    }

    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     *
     * @param containerPath <p>
     *            The path inside the container at which to expose the host
     *            device.
     *            </p>
     */
    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerPath <p>
     *            The path inside the container at which to expose the host
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withContainerPath(String containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By
     * default, the container has permissions for <code>read</code>,
     * <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     *
     * @return <p>
     *         The explicit permissions to provide to the container for the
     *         device. By default, the container has permissions for
     *         <code>read</code>, <code>write</code>, and <code>mknod</code> for
     *         the device.
     *         </p>
     */
    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By
     * default, the container has permissions for <code>read</code>,
     * <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     *
     * @param permissions <p>
     *            The explicit permissions to provide to the container for the
     *            device. By default, the container has permissions for
     *            <code>read</code>, <code>write</code>, and <code>mknod</code>
     *            for the device.
     *            </p>
     */
    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By
     * default, the container has permissions for <code>read</code>,
     * <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            The explicit permissions to provide to the container for the
     *            device. By default, the container has permissions for
     *            <code>read</code>, <code>write</code>, and <code>mknod</code>
     *            for the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withPermissions(String... permissions) {
        if (getPermissions() == null) {
            this.permissions = new java.util.ArrayList<String>(permissions.length);
        }
        for (String value : permissions) {
            this.permissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By
     * default, the container has permissions for <code>read</code>,
     * <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            The explicit permissions to provide to the container for the
     *            device. By default, the container has permissions for
     *            <code>read</code>, <code>write</code>, and <code>mknod</code>
     *            for the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Device withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
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
        if (getHostPath() != null)
            sb.append("hostPath: " + getHostPath() + ",");
        if (getContainerPath() != null)
            sb.append("containerPath: " + getContainerPath() + ",");
        if (getPermissions() != null)
            sb.append("permissions: " + getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostPath() == null) ? 0 : getHostPath().hashCode());
        hashCode = prime * hashCode
                + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        hashCode = prime * hashCode
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;

        if (other.getHostPath() == null ^ this.getHostPath() == null)
            return false;
        if (other.getHostPath() != null && other.getHostPath().equals(this.getHostPath()) == false)
            return false;
        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null
                && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }
}
