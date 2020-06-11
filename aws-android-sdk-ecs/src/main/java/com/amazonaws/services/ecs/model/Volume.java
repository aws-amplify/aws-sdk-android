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
 * A data volume used in a task definition. For tasks that use Amazon Elastic
 * File System (Amazon EFS) file storage, specify an
 * <code>efsVolumeConfiguration</code>. For tasks that use a Docker volume,
 * specify a <code>DockerVolumeConfiguration</code>. For tasks that use a bind
 * mount host volume, specify a <code>host</code> and optional
 * <code>sourcePath</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html"
 * >Using Data Volumes in Tasks</a>.
 * </p>
 */
public class Volume implements Serializable {
    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * This parameter is specified when you are using bind mount host volumes.
     * The contents of the <code>host</code> parameter determine whether your
     * bind mount host volume persists on the host container instance and where
     * it is stored. If the <code>host</code> parameter is empty, then the
     * Docker daemon assigns a host path for your data volume. However, the data
     * is not guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as
     * <code>$env:ProgramData</code>. Windows containers cannot mount
     * directories on a different drive, and mount point cannot be across
     * drives. For example, you can mount <code>C:\my\path:C:\my\path</code> and
     * <code>D:\:D:\</code>, but not <code>D:\my\path:C:\my\path</code> or
     * <code>D:\:C:\my\path</code>.
     * </p>
     */
    private HostVolumeProperties host;

    /**
     * <p>
     * This parameter is specified when you are using Docker volumes. Docker
     * volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the <code>local</code> driver.
     * To use bind mounts, specify the <code>host</code> parameter instead.
     * </p>
     */
    private DockerVolumeConfiguration dockerVolumeConfiguration;

    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File
     * System file system for task storage.
     * </p>
     */
    private EFSVolumeConfiguration efsVolumeConfiguration;

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     *
     * @return <p>
     *         The name of the volume. Up to 255 letters (uppercase and
     *         lowercase), numbers, and hyphens are allowed. This name is
     *         referenced in the <code>sourceVolume</code> parameter of
     *         container definition <code>mountPoints</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     *
     * @param name <p>
     *            The name of the volume. Up to 255 letters (uppercase and
     *            lowercase), numbers, and hyphens are allowed. This name is
     *            referenced in the <code>sourceVolume</code> parameter of
     *            container definition <code>mountPoints</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the volume. Up to 255 letters (uppercase and
     *            lowercase), numbers, and hyphens are allowed. This name is
     *            referenced in the <code>sourceVolume</code> parameter of
     *            container definition <code>mountPoints</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * This parameter is specified when you are using bind mount host volumes.
     * The contents of the <code>host</code> parameter determine whether your
     * bind mount host volume persists on the host container instance and where
     * it is stored. If the <code>host</code> parameter is empty, then the
     * Docker daemon assigns a host path for your data volume. However, the data
     * is not guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as
     * <code>$env:ProgramData</code>. Windows containers cannot mount
     * directories on a different drive, and mount point cannot be across
     * drives. For example, you can mount <code>C:\my\path:C:\my\path</code> and
     * <code>D:\:D:\</code>, but not <code>D:\my\path:C:\my\path</code> or
     * <code>D:\:C:\my\path</code>.
     * </p>
     *
     * @return <p>
     *         This parameter is specified when you are using bind mount host
     *         volumes. The contents of the <code>host</code> parameter
     *         determine whether your bind mount host volume persists on the
     *         host container instance and where it is stored. If the
     *         <code>host</code> parameter is empty, then the Docker daemon
     *         assigns a host path for your data volume. However, the data is
     *         not guaranteed to persist after the containers associated with it
     *         stop running.
     *         </p>
     *         <p>
     *         Windows containers can mount whole directories on the same drive
     *         as <code>$env:ProgramData</code>. Windows containers cannot mount
     *         directories on a different drive, and mount point cannot be
     *         across drives. For example, you can mount
     *         <code>C:\my\path:C:\my\path</code> and <code>D:\:D:\</code>, but
     *         not <code>D:\my\path:C:\my\path</code> or
     *         <code>D:\:C:\my\path</code>.
     *         </p>
     */
    public HostVolumeProperties getHost() {
        return host;
    }

    /**
     * <p>
     * This parameter is specified when you are using bind mount host volumes.
     * The contents of the <code>host</code> parameter determine whether your
     * bind mount host volume persists on the host container instance and where
     * it is stored. If the <code>host</code> parameter is empty, then the
     * Docker daemon assigns a host path for your data volume. However, the data
     * is not guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as
     * <code>$env:ProgramData</code>. Windows containers cannot mount
     * directories on a different drive, and mount point cannot be across
     * drives. For example, you can mount <code>C:\my\path:C:\my\path</code> and
     * <code>D:\:D:\</code>, but not <code>D:\my\path:C:\my\path</code> or
     * <code>D:\:C:\my\path</code>.
     * </p>
     *
     * @param host <p>
     *            This parameter is specified when you are using bind mount host
     *            volumes. The contents of the <code>host</code> parameter
     *            determine whether your bind mount host volume persists on the
     *            host container instance and where it is stored. If the
     *            <code>host</code> parameter is empty, then the Docker daemon
     *            assigns a host path for your data volume. However, the data is
     *            not guaranteed to persist after the containers associated with
     *            it stop running.
     *            </p>
     *            <p>
     *            Windows containers can mount whole directories on the same
     *            drive as <code>$env:ProgramData</code>. Windows containers
     *            cannot mount directories on a different drive, and mount point
     *            cannot be across drives. For example, you can mount
     *            <code>C:\my\path:C:\my\path</code> and <code>D:\:D:\</code>,
     *            but not <code>D:\my\path:C:\my\path</code> or
     *            <code>D:\:C:\my\path</code>.
     *            </p>
     */
    public void setHost(HostVolumeProperties host) {
        this.host = host;
    }

    /**
     * <p>
     * This parameter is specified when you are using bind mount host volumes.
     * The contents of the <code>host</code> parameter determine whether your
     * bind mount host volume persists on the host container instance and where
     * it is stored. If the <code>host</code> parameter is empty, then the
     * Docker daemon assigns a host path for your data volume. However, the data
     * is not guaranteed to persist after the containers associated with it stop
     * running.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as
     * <code>$env:ProgramData</code>. Windows containers cannot mount
     * directories on a different drive, and mount point cannot be across
     * drives. For example, you can mount <code>C:\my\path:C:\my\path</code> and
     * <code>D:\:D:\</code>, but not <code>D:\my\path:C:\my\path</code> or
     * <code>D:\:C:\my\path</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param host <p>
     *            This parameter is specified when you are using bind mount host
     *            volumes. The contents of the <code>host</code> parameter
     *            determine whether your bind mount host volume persists on the
     *            host container instance and where it is stored. If the
     *            <code>host</code> parameter is empty, then the Docker daemon
     *            assigns a host path for your data volume. However, the data is
     *            not guaranteed to persist after the containers associated with
     *            it stop running.
     *            </p>
     *            <p>
     *            Windows containers can mount whole directories on the same
     *            drive as <code>$env:ProgramData</code>. Windows containers
     *            cannot mount directories on a different drive, and mount point
     *            cannot be across drives. For example, you can mount
     *            <code>C:\my\path:C:\my\path</code> and <code>D:\:D:\</code>,
     *            but not <code>D:\my\path:C:\my\path</code> or
     *            <code>D:\:C:\my\path</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Volume withHost(HostVolumeProperties host) {
        this.host = host;
        return this;
    }

    /**
     * <p>
     * This parameter is specified when you are using Docker volumes. Docker
     * volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the <code>local</code> driver.
     * To use bind mounts, specify the <code>host</code> parameter instead.
     * </p>
     *
     * @return <p>
     *         This parameter is specified when you are using Docker volumes.
     *         Docker volumes are only supported when you are using the EC2
     *         launch type. Windows containers only support the use of the
     *         <code>local</code> driver. To use bind mounts, specify the
     *         <code>host</code> parameter instead.
     *         </p>
     */
    public DockerVolumeConfiguration getDockerVolumeConfiguration() {
        return dockerVolumeConfiguration;
    }

    /**
     * <p>
     * This parameter is specified when you are using Docker volumes. Docker
     * volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the <code>local</code> driver.
     * To use bind mounts, specify the <code>host</code> parameter instead.
     * </p>
     *
     * @param dockerVolumeConfiguration <p>
     *            This parameter is specified when you are using Docker volumes.
     *            Docker volumes are only supported when you are using the EC2
     *            launch type. Windows containers only support the use of the
     *            <code>local</code> driver. To use bind mounts, specify the
     *            <code>host</code> parameter instead.
     *            </p>
     */
    public void setDockerVolumeConfiguration(DockerVolumeConfiguration dockerVolumeConfiguration) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
    }

    /**
     * <p>
     * This parameter is specified when you are using Docker volumes. Docker
     * volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the <code>local</code> driver.
     * To use bind mounts, specify the <code>host</code> parameter instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dockerVolumeConfiguration <p>
     *            This parameter is specified when you are using Docker volumes.
     *            Docker volumes are only supported when you are using the EC2
     *            launch type. Windows containers only support the use of the
     *            <code>local</code> driver. To use bind mounts, specify the
     *            <code>host</code> parameter instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Volume withDockerVolumeConfiguration(DockerVolumeConfiguration dockerVolumeConfiguration) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        return this;
    }

    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File
     * System file system for task storage.
     * </p>
     *
     * @return <p>
     *         This parameter is specified when you are using an Amazon Elastic
     *         File System file system for task storage.
     *         </p>
     */
    public EFSVolumeConfiguration getEfsVolumeConfiguration() {
        return efsVolumeConfiguration;
    }

    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File
     * System file system for task storage.
     * </p>
     *
     * @param efsVolumeConfiguration <p>
     *            This parameter is specified when you are using an Amazon
     *            Elastic File System file system for task storage.
     *            </p>
     */
    public void setEfsVolumeConfiguration(EFSVolumeConfiguration efsVolumeConfiguration) {
        this.efsVolumeConfiguration = efsVolumeConfiguration;
    }

    /**
     * <p>
     * This parameter is specified when you are using an Amazon Elastic File
     * System file system for task storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param efsVolumeConfiguration <p>
     *            This parameter is specified when you are using an Amazon
     *            Elastic File System file system for task storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Volume withEfsVolumeConfiguration(EFSVolumeConfiguration efsVolumeConfiguration) {
        this.efsVolumeConfiguration = efsVolumeConfiguration;
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
            sb.append("name: " + getName() + ",");
        if (getHost() != null)
            sb.append("host: " + getHost() + ",");
        if (getDockerVolumeConfiguration() != null)
            sb.append("dockerVolumeConfiguration: " + getDockerVolumeConfiguration() + ",");
        if (getEfsVolumeConfiguration() != null)
            sb.append("efsVolumeConfiguration: " + getEfsVolumeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime
                * hashCode
                + ((getDockerVolumeConfiguration() == null) ? 0 : getDockerVolumeConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEfsVolumeConfiguration() == null) ? 0 : getEfsVolumeConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getDockerVolumeConfiguration() == null
                ^ this.getDockerVolumeConfiguration() == null)
            return false;
        if (other.getDockerVolumeConfiguration() != null
                && other.getDockerVolumeConfiguration().equals(this.getDockerVolumeConfiguration()) == false)
            return false;
        if (other.getEfsVolumeConfiguration() == null ^ this.getEfsVolumeConfiguration() == null)
            return false;
        if (other.getEfsVolumeConfiguration() != null
                && other.getEfsVolumeConfiguration().equals(this.getEfsVolumeConfiguration()) == false)
            return false;
        return true;
    }
}
