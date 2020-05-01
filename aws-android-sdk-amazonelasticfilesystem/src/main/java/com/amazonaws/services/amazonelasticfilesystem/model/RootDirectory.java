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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the directory on the Amazon EFS file system that the access point
 * provides access to. The access point exposes the specified file system path
 * as the root directory of your file system to applications using the access
 * point. NFS clients using the access point can only access data in the access
 * point's <code>RootDirectory</code> and it's subdirectories.
 * </p>
 */
public class RootDirectory implements Serializable {
    /**
     * <p>
     * Specifies the path on the EFS file system to expose as the root directory
     * to NFS clients using the access point to access the EFS file system. A
     * path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide the <code>CreationInfo</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String path;

    /**
     * <p>
     * (Optional) Specifies the POSIX IDs and permissions to apply to the access
     * point's <code>RootDirectory</code>. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates the root
     * directory using the <code>CreationInfo</code> settings when a client
     * connects to an access point. When specifying the
     * <code>CreationInfo</code>, you must provide values for all properties.
     * </p>
     * <important>
     * <p>
     * If you do not provide <code>CreationInfo</code> and the specified
     * <code>RootDirectory</code> &gt; <code>Path</code> does not exist,
     * attempts to mount the file system using the access point will fail.
     * </p>
     * </important>
     */
    private CreationInfo creationInfo;

    /**
     * <p>
     * Specifies the path on the EFS file system to expose as the root directory
     * to NFS clients using the access point to access the EFS file system. A
     * path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide the <code>CreationInfo</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specifies the path on the EFS file system to expose as the root
     *         directory to NFS clients using the access point to access the EFS
     *         file system. A path can have up to four subdirectories. If the
     *         specified path does not exist, you are required to provide the
     *         <code>CreationInfo</code>.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * Specifies the path on the EFS file system to expose as the root directory
     * to NFS clients using the access point to access the EFS file system. A
     * path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide the <code>CreationInfo</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param path <p>
     *            Specifies the path on the EFS file system to expose as the
     *            root directory to NFS clients using the access point to access
     *            the EFS file system. A path can have up to four
     *            subdirectories. If the specified path does not exist, you are
     *            required to provide the <code>CreationInfo</code>.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Specifies the path on the EFS file system to expose as the root directory
     * to NFS clients using the access point to access the EFS file system. A
     * path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide the <code>CreationInfo</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param path <p>
     *            Specifies the path on the EFS file system to expose as the
     *            root directory to NFS clients using the access point to access
     *            the EFS file system. A path can have up to four
     *            subdirectories. If the specified path does not exist, you are
     *            required to provide the <code>CreationInfo</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RootDirectory withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the POSIX IDs and permissions to apply to the access
     * point's <code>RootDirectory</code>. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates the root
     * directory using the <code>CreationInfo</code> settings when a client
     * connects to an access point. When specifying the
     * <code>CreationInfo</code>, you must provide values for all properties.
     * </p>
     * <important>
     * <p>
     * If you do not provide <code>CreationInfo</code> and the specified
     * <code>RootDirectory</code> &gt; <code>Path</code> does not exist,
     * attempts to mount the file system using the access point will fail.
     * </p>
     * </important>
     *
     * @return <p>
     *         (Optional) Specifies the POSIX IDs and permissions to apply to
     *         the access point's <code>RootDirectory</code>. If the
     *         <code>RootDirectory</code> &gt; <code>Path</code> specified does
     *         not exist, EFS creates the root directory using the
     *         <code>CreationInfo</code> settings when a client connects to an
     *         access point. When specifying the <code>CreationInfo</code>, you
     *         must provide values for all properties.
     *         </p>
     *         <important>
     *         <p>
     *         If you do not provide <code>CreationInfo</code> and the specified
     *         <code>RootDirectory</code> &gt; <code>Path</code> does not exist,
     *         attempts to mount the file system using the access point will
     *         fail.
     *         </p>
     *         </important>
     */
    public CreationInfo getCreationInfo() {
        return creationInfo;
    }

    /**
     * <p>
     * (Optional) Specifies the POSIX IDs and permissions to apply to the access
     * point's <code>RootDirectory</code>. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates the root
     * directory using the <code>CreationInfo</code> settings when a client
     * connects to an access point. When specifying the
     * <code>CreationInfo</code>, you must provide values for all properties.
     * </p>
     * <important>
     * <p>
     * If you do not provide <code>CreationInfo</code> and the specified
     * <code>RootDirectory</code> &gt; <code>Path</code> does not exist,
     * attempts to mount the file system using the access point will fail.
     * </p>
     * </important>
     *
     * @param creationInfo <p>
     *            (Optional) Specifies the POSIX IDs and permissions to apply to
     *            the access point's <code>RootDirectory</code>. If the
     *            <code>RootDirectory</code> &gt; <code>Path</code> specified
     *            does not exist, EFS creates the root directory using the
     *            <code>CreationInfo</code> settings when a client connects to
     *            an access point. When specifying the <code>CreationInfo</code>
     *            , you must provide values for all properties.
     *            </p>
     *            <important>
     *            <p>
     *            If you do not provide <code>CreationInfo</code> and the
     *            specified <code>RootDirectory</code> &gt; <code>Path</code>
     *            does not exist, attempts to mount the file system using the
     *            access point will fail.
     *            </p>
     *            </important>
     */
    public void setCreationInfo(CreationInfo creationInfo) {
        this.creationInfo = creationInfo;
    }

    /**
     * <p>
     * (Optional) Specifies the POSIX IDs and permissions to apply to the access
     * point's <code>RootDirectory</code>. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates the root
     * directory using the <code>CreationInfo</code> settings when a client
     * connects to an access point. When specifying the
     * <code>CreationInfo</code>, you must provide values for all properties.
     * </p>
     * <important>
     * <p>
     * If you do not provide <code>CreationInfo</code> and the specified
     * <code>RootDirectory</code> &gt; <code>Path</code> does not exist,
     * attempts to mount the file system using the access point will fail.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationInfo <p>
     *            (Optional) Specifies the POSIX IDs and permissions to apply to
     *            the access point's <code>RootDirectory</code>. If the
     *            <code>RootDirectory</code> &gt; <code>Path</code> specified
     *            does not exist, EFS creates the root directory using the
     *            <code>CreationInfo</code> settings when a client connects to
     *            an access point. When specifying the <code>CreationInfo</code>
     *            , you must provide values for all properties.
     *            </p>
     *            <important>
     *            <p>
     *            If you do not provide <code>CreationInfo</code> and the
     *            specified <code>RootDirectory</code> &gt; <code>Path</code>
     *            does not exist, attempts to mount the file system using the
     *            access point will fail.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RootDirectory withCreationInfo(CreationInfo creationInfo) {
        this.creationInfo = creationInfo;
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getCreationInfo() != null)
            sb.append("CreationInfo: " + getCreationInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode
                + ((getCreationInfo() == null) ? 0 : getCreationInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RootDirectory == false)
            return false;
        RootDirectory other = (RootDirectory) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getCreationInfo() == null ^ this.getCreationInfo() == null)
            return false;
        if (other.getCreationInfo() != null
                && other.getCreationInfo().equals(this.getCreationInfo()) == false)
            return false;
        return true;
    }
}
