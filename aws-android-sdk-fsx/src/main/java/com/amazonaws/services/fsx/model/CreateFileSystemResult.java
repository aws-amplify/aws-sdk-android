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
 * The response object returned after the file system is created.
 * </p>
 */
public class CreateFileSystemResult implements Serializable {
    /**
     * <p>
     * The configuration of the file system that was created.
     * </p>
     */
    private FileSystem fileSystem;

    /**
     * <p>
     * The configuration of the file system that was created.
     * </p>
     *
     * @return <p>
     *         The configuration of the file system that was created.
     *         </p>
     */
    public FileSystem getFileSystem() {
        return fileSystem;
    }

    /**
     * <p>
     * The configuration of the file system that was created.
     * </p>
     *
     * @param fileSystem <p>
     *            The configuration of the file system that was created.
     *            </p>
     */
    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * <p>
     * The configuration of the file system that was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystem <p>
     *            The configuration of the file system that was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemResult withFileSystem(FileSystem fileSystem) {
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

        if (obj instanceof CreateFileSystemResult == false)
            return false;
        CreateFileSystemResult other = (CreateFileSystemResult) obj;

        if (other.getFileSystem() == null ^ this.getFileSystem() == null)
            return false;
        if (other.getFileSystem() != null
                && other.getFileSystem().equals(this.getFileSystem()) == false)
            return false;
        return true;
    }
}
