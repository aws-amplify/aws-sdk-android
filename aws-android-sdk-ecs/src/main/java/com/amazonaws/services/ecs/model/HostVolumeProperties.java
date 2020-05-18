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
 * Details on a container instance bind mount host volume.
 * </p>
 */
public class HostVolumeProperties implements Serializable {
    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a
     * <code>sourcePath</code> to declare the path on the host container
     * instance that is presented to the container. If this parameter is empty,
     * then the Docker daemon has assigned a host path for you. If the
     * <code>host</code> parameter contains a <code>sourcePath</code> file
     * location, then the data volume persists at the specified location on the
     * host container instance until you delete it manually. If the
     * <code>sourcePath</code> value does not exist on the host container
     * instance, the Docker daemon creates it. If the location does exist, the
     * contents of the source path folder are exported.
     * </p>
     * <p>
     * If you are using the Fargate launch type, the <code>sourcePath</code>
     * parameter is not supported.
     * </p>
     */
    private String sourcePath;

    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a
     * <code>sourcePath</code> to declare the path on the host container
     * instance that is presented to the container. If this parameter is empty,
     * then the Docker daemon has assigned a host path for you. If the
     * <code>host</code> parameter contains a <code>sourcePath</code> file
     * location, then the data volume persists at the specified location on the
     * host container instance until you delete it manually. If the
     * <code>sourcePath</code> value does not exist on the host container
     * instance, the Docker daemon creates it. If the location does exist, the
     * contents of the source path folder are exported.
     * </p>
     * <p>
     * If you are using the Fargate launch type, the <code>sourcePath</code>
     * parameter is not supported.
     * </p>
     *
     * @return <p>
     *         When the <code>host</code> parameter is used, specify a
     *         <code>sourcePath</code> to declare the path on the host container
     *         instance that is presented to the container. If this parameter is
     *         empty, then the Docker daemon has assigned a host path for you.
     *         If the <code>host</code> parameter contains a
     *         <code>sourcePath</code> file location, then the data volume
     *         persists at the specified location on the host container instance
     *         until you delete it manually. If the <code>sourcePath</code>
     *         value does not exist on the host container instance, the Docker
     *         daemon creates it. If the location does exist, the contents of
     *         the source path folder are exported.
     *         </p>
     *         <p>
     *         If you are using the Fargate launch type, the
     *         <code>sourcePath</code> parameter is not supported.
     *         </p>
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a
     * <code>sourcePath</code> to declare the path on the host container
     * instance that is presented to the container. If this parameter is empty,
     * then the Docker daemon has assigned a host path for you. If the
     * <code>host</code> parameter contains a <code>sourcePath</code> file
     * location, then the data volume persists at the specified location on the
     * host container instance until you delete it manually. If the
     * <code>sourcePath</code> value does not exist on the host container
     * instance, the Docker daemon creates it. If the location does exist, the
     * contents of the source path folder are exported.
     * </p>
     * <p>
     * If you are using the Fargate launch type, the <code>sourcePath</code>
     * parameter is not supported.
     * </p>
     *
     * @param sourcePath <p>
     *            When the <code>host</code> parameter is used, specify a
     *            <code>sourcePath</code> to declare the path on the host
     *            container instance that is presented to the container. If this
     *            parameter is empty, then the Docker daemon has assigned a host
     *            path for you. If the <code>host</code> parameter contains a
     *            <code>sourcePath</code> file location, then the data volume
     *            persists at the specified location on the host container
     *            instance until you delete it manually. If the
     *            <code>sourcePath</code> value does not exist on the host
     *            container instance, the Docker daemon creates it. If the
     *            location does exist, the contents of the source path folder
     *            are exported.
     *            </p>
     *            <p>
     *            If you are using the Fargate launch type, the
     *            <code>sourcePath</code> parameter is not supported.
     *            </p>
     */
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a
     * <code>sourcePath</code> to declare the path on the host container
     * instance that is presented to the container. If this parameter is empty,
     * then the Docker daemon has assigned a host path for you. If the
     * <code>host</code> parameter contains a <code>sourcePath</code> file
     * location, then the data volume persists at the specified location on the
     * host container instance until you delete it manually. If the
     * <code>sourcePath</code> value does not exist on the host container
     * instance, the Docker daemon creates it. If the location does exist, the
     * contents of the source path folder are exported.
     * </p>
     * <p>
     * If you are using the Fargate launch type, the <code>sourcePath</code>
     * parameter is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePath <p>
     *            When the <code>host</code> parameter is used, specify a
     *            <code>sourcePath</code> to declare the path on the host
     *            container instance that is presented to the container. If this
     *            parameter is empty, then the Docker daemon has assigned a host
     *            path for you. If the <code>host</code> parameter contains a
     *            <code>sourcePath</code> file location, then the data volume
     *            persists at the specified location on the host container
     *            instance until you delete it manually. If the
     *            <code>sourcePath</code> value does not exist on the host
     *            container instance, the Docker daemon creates it. If the
     *            location does exist, the contents of the source path folder
     *            are exported.
     *            </p>
     *            <p>
     *            If you are using the Fargate launch type, the
     *            <code>sourcePath</code> parameter is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostVolumeProperties withSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
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
        if (getSourcePath() != null)
            sb.append("sourcePath: " + getSourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostVolumeProperties == false)
            return false;
        HostVolumeProperties other = (HostVolumeProperties) obj;

        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null
                && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        return true;
    }
}
