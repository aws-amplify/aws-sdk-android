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
 * The devices that are available on the container instance. The only supported
 * device type is a GPU.
 * </p>
 */
public class PlatformDevice implements Serializable {
    /**
     * <p>
     * The ID for the GPU(s) on the container instance. The available GPU IDs
     * can also be obtained on the container instance in the
     * <code>/var/lib/ecs/gpu/nvidia_gpu_info.json</code> file.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The type of device that is available on the container instance. The only
     * supported value is <code>GPU</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU
     */
    private String type;

    /**
     * <p>
     * The ID for the GPU(s) on the container instance. The available GPU IDs
     * can also be obtained on the container instance in the
     * <code>/var/lib/ecs/gpu/nvidia_gpu_info.json</code> file.
     * </p>
     *
     * @return <p>
     *         The ID for the GPU(s) on the container instance. The available
     *         GPU IDs can also be obtained on the container instance in the
     *         <code>/var/lib/ecs/gpu/nvidia_gpu_info.json</code> file.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID for the GPU(s) on the container instance. The available GPU IDs
     * can also be obtained on the container instance in the
     * <code>/var/lib/ecs/gpu/nvidia_gpu_info.json</code> file.
     * </p>
     *
     * @param id <p>
     *            The ID for the GPU(s) on the container instance. The available
     *            GPU IDs can also be obtained on the container instance in the
     *            <code>/var/lib/ecs/gpu/nvidia_gpu_info.json</code> file.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the GPU(s) on the container instance. The available GPU IDs
     * can also be obtained on the container instance in the
     * <code>/var/lib/ecs/gpu/nvidia_gpu_info.json</code> file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID for the GPU(s) on the container instance. The available
     *            GPU IDs can also be obtained on the container instance in the
     *            <code>/var/lib/ecs/gpu/nvidia_gpu_info.json</code> file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDevice withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of device that is available on the container instance. The only
     * supported value is <code>GPU</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU
     *
     * @return <p>
     *         The type of device that is available on the container instance.
     *         The only supported value is <code>GPU</code>.
     *         </p>
     * @see PlatformDeviceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of device that is available on the container instance. The only
     * supported value is <code>GPU</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU
     *
     * @param type <p>
     *            The type of device that is available on the container
     *            instance. The only supported value is <code>GPU</code>.
     *            </p>
     * @see PlatformDeviceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of device that is available on the container instance. The only
     * supported value is <code>GPU</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU
     *
     * @param type <p>
     *            The type of device that is available on the container
     *            instance. The only supported value is <code>GPU</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformDeviceType
     */
    public PlatformDevice withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of device that is available on the container instance. The only
     * supported value is <code>GPU</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU
     *
     * @param type <p>
     *            The type of device that is available on the container
     *            instance. The only supported value is <code>GPU</code>.
     *            </p>
     * @see PlatformDeviceType
     */
    public void setType(PlatformDeviceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of device that is available on the container instance. The only
     * supported value is <code>GPU</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU
     *
     * @param type <p>
     *            The type of device that is available on the container
     *            instance. The only supported value is <code>GPU</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformDeviceType
     */
    public PlatformDevice withType(PlatformDeviceType type) {
        this.type = type.toString();
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformDevice == false)
            return false;
        PlatformDevice other = (PlatformDevice) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
