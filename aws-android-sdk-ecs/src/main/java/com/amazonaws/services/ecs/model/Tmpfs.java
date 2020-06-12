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
 * The container path, mount options, and size of the tmpfs mount.
 * </p>
 */
public class Tmpfs implements Serializable {
    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     */
    private String containerPath;

    /**
     * <p>
     * The size (in MiB) of the tmpfs volume.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * <p>
     * Valid values:
     * <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     * </p>
     */
    private java.util.List<String> mountOptions;

    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     *
     * @return <p>
     *         The absolute file path where the tmpfs volume is to be mounted.
     *         </p>
     */
    public String getContainerPath() {
        return containerPath;
    }

    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     *
     * @param containerPath <p>
     *            The absolute file path where the tmpfs volume is to be
     *            mounted.
     *            </p>
     */
    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerPath <p>
     *            The absolute file path where the tmpfs volume is to be
     *            mounted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tmpfs withContainerPath(String containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    /**
     * <p>
     * The size (in MiB) of the tmpfs volume.
     * </p>
     *
     * @return <p>
     *         The size (in MiB) of the tmpfs volume.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * The size (in MiB) of the tmpfs volume.
     * </p>
     *
     * @param size <p>
     *            The size (in MiB) of the tmpfs volume.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size (in MiB) of the tmpfs volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The size (in MiB) of the tmpfs volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tmpfs withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * <p>
     * Valid values:
     * <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     * </p>
     *
     * @return <p>
     *         The list of tmpfs volume mount options.
     *         </p>
     *         <p>
     *         Valid values:
     *         <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     *         </p>
     */
    public java.util.List<String> getMountOptions() {
        return mountOptions;
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * <p>
     * Valid values:
     * <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     * </p>
     *
     * @param mountOptions <p>
     *            The list of tmpfs volume mount options.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     *            </p>
     */
    public void setMountOptions(java.util.Collection<String> mountOptions) {
        if (mountOptions == null) {
            this.mountOptions = null;
            return;
        }

        this.mountOptions = new java.util.ArrayList<String>(mountOptions);
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * <p>
     * Valid values:
     * <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountOptions <p>
     *            The list of tmpfs volume mount options.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tmpfs withMountOptions(String... mountOptions) {
        if (getMountOptions() == null) {
            this.mountOptions = new java.util.ArrayList<String>(mountOptions.length);
        }
        for (String value : mountOptions) {
            this.mountOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * <p>
     * Valid values:
     * <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountOptions <p>
     *            The list of tmpfs volume mount options.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tmpfs withMountOptions(java.util.Collection<String> mountOptions) {
        setMountOptions(mountOptions);
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
        if (getContainerPath() != null)
            sb.append("containerPath: " + getContainerPath() + ",");
        if (getSize() != null)
            sb.append("size: " + getSize() + ",");
        if (getMountOptions() != null)
            sb.append("mountOptions: " + getMountOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode
                + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tmpfs == false)
            return false;
        Tmpfs other = (Tmpfs) obj;

        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null
                && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null
                && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        return true;
    }
}
