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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * The response object for the <code>UpdateFileSystem</code> operation.
 * </p>
 */
public class UpdateFileSystemResult implements Serializable {
    /**
     * <p>
     * A description of the file system that was updated.
     * </p>
     */
    private FileSystem fileSystem;

    /**
     * <p>
     * A description of the file system that was updated.
     * </p>
     *
     * @return <p>
     *         A description of the file system that was updated.
     *         </p>
     */
    public FileSystem getFileSystem() {
        return fileSystem;
    }

    /**
     * <p>
     * A description of the file system that was updated.
     * </p>
     *
     * @param fileSystem <p>
     *            A description of the file system that was updated.
     *            </p>
     */
    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * <p>
     * A description of the file system that was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystem <p>
     *            A description of the file system that was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
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
        if (getFileSystem() != null)
            sb.append("FileSystem: " + getFileSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystem() == null) ? 0 : getFileSystem().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemResult == false)
            return false;
        UpdateFileSystemResult other = (UpdateFileSystemResult) obj;

        if (other.getFileSystem() == null ^ this.getFileSystem() == null)
            return false;
        if (other.getFileSystem() != null
                && other.getFileSystem().equals(this.getFileSystem()) == false)
            return false;
        return true;
    }
}
