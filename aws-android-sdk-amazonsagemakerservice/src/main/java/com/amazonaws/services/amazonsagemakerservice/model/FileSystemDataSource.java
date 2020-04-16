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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a file system data source for a channel.
 * </p>
 */
public class FileSystemDataSource implements Serializable {
    /**
     * <p>
     * The file system id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - <br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String fileSystemId;

    /**
     * <p>
     * The access mode of the mount of the directory associated with the
     * channel. A directory can be mounted either in <code>ro</code> (read-only)
     * or <code>rw</code> (read-write) mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rw, ro
     */
    private String fileSystemAccessMode;

    /**
     * <p>
     * The file system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS, FSxLustre
     */
    private String fileSystemType;

    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String directoryPath;

    /**
     * <p>
     * The file system id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - <br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The file system id.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The file system id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - <br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param fileSystemId <p>
     *            The file system id.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The file system id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - <br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param fileSystemId <p>
     *            The file system id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystemDataSource withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the
     * channel. A directory can be mounted either in <code>ro</code> (read-only)
     * or <code>rw</code> (read-write) mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rw, ro
     *
     * @return <p>
     *         The access mode of the mount of the directory associated with the
     *         channel. A directory can be mounted either in <code>ro</code>
     *         (read-only) or <code>rw</code> (read-write) mode.
     *         </p>
     * @see FileSystemAccessMode
     */
    public String getFileSystemAccessMode() {
        return fileSystemAccessMode;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the
     * channel. A directory can be mounted either in <code>ro</code> (read-only)
     * or <code>rw</code> (read-write) mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rw, ro
     *
     * @param fileSystemAccessMode <p>
     *            The access mode of the mount of the directory associated with
     *            the channel. A directory can be mounted either in
     *            <code>ro</code> (read-only) or <code>rw</code> (read-write)
     *            mode.
     *            </p>
     * @see FileSystemAccessMode
     */
    public void setFileSystemAccessMode(String fileSystemAccessMode) {
        this.fileSystemAccessMode = fileSystemAccessMode;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the
     * channel. A directory can be mounted either in <code>ro</code> (read-only)
     * or <code>rw</code> (read-write) mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rw, ro
     *
     * @param fileSystemAccessMode <p>
     *            The access mode of the mount of the directory associated with
     *            the channel. A directory can be mounted either in
     *            <code>ro</code> (read-only) or <code>rw</code> (read-write)
     *            mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemAccessMode
     */
    public FileSystemDataSource withFileSystemAccessMode(String fileSystemAccessMode) {
        this.fileSystemAccessMode = fileSystemAccessMode;
        return this;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the
     * channel. A directory can be mounted either in <code>ro</code> (read-only)
     * or <code>rw</code> (read-write) mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rw, ro
     *
     * @param fileSystemAccessMode <p>
     *            The access mode of the mount of the directory associated with
     *            the channel. A directory can be mounted either in
     *            <code>ro</code> (read-only) or <code>rw</code> (read-write)
     *            mode.
     *            </p>
     * @see FileSystemAccessMode
     */
    public void setFileSystemAccessMode(FileSystemAccessMode fileSystemAccessMode) {
        this.fileSystemAccessMode = fileSystemAccessMode.toString();
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the
     * channel. A directory can be mounted either in <code>ro</code> (read-only)
     * or <code>rw</code> (read-write) mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rw, ro
     *
     * @param fileSystemAccessMode <p>
     *            The access mode of the mount of the directory associated with
     *            the channel. A directory can be mounted either in
     *            <code>ro</code> (read-only) or <code>rw</code> (read-write)
     *            mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemAccessMode
     */
    public FileSystemDataSource withFileSystemAccessMode(FileSystemAccessMode fileSystemAccessMode) {
        this.fileSystemAccessMode = fileSystemAccessMode.toString();
        return this;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS, FSxLustre
     *
     * @return <p>
     *         The file system type.
     *         </p>
     * @see FileSystemType
     */
    public String getFileSystemType() {
        return fileSystemType;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS, FSxLustre
     *
     * @param fileSystemType <p>
     *            The file system type.
     *            </p>
     * @see FileSystemType
     */
    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS, FSxLustre
     *
     * @param fileSystemType <p>
     *            The file system type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public FileSystemDataSource withFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS, FSxLustre
     *
     * @param fileSystemType <p>
     *            The file system type.
     *            </p>
     * @see FileSystemType
     */
    public void setFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS, FSxLustre
     *
     * @param fileSystemType <p>
     *            The file system type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public FileSystemDataSource withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The full path to the directory to associate with the channel.
     *         </p>
     */
    public String getDirectoryPath() {
        return directoryPath;
    }

    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param directoryPath <p>
     *            The full path to the directory to associate with the channel.
     *            </p>
     */
    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param directoryPath <p>
     *            The full path to the directory to associate with the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystemDataSource withDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getFileSystemAccessMode() != null)
            sb.append("FileSystemAccessMode: " + getFileSystemAccessMode() + ",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: " + getFileSystemType() + ",");
        if (getDirectoryPath() != null)
            sb.append("DirectoryPath: " + getDirectoryPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemAccessMode() == null) ? 0 : getFileSystemAccessMode().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryPath() == null) ? 0 : getDirectoryPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemDataSource == false)
            return false;
        FileSystemDataSource other = (FileSystemDataSource) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getFileSystemAccessMode() == null ^ this.getFileSystemAccessMode() == null)
            return false;
        if (other.getFileSystemAccessMode() != null
                && other.getFileSystemAccessMode().equals(this.getFileSystemAccessMode()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null
                && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getDirectoryPath() == null ^ this.getDirectoryPath() == null)
            return false;
        if (other.getDirectoryPath() != null
                && other.getDirectoryPath().equals(this.getDirectoryPath()) == false)
            return false;
        return true;
    }
}
