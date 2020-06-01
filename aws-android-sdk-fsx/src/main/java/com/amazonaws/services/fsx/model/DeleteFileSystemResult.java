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
 * The response object for the <code>DeleteFileSystem</code> operation.
 * </p>
 */
public class DeleteFileSystemResult implements Serializable {
    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     */
    private String fileSystemId;

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be
     * <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     */
    private String lifecycle;

    /**
     * <p>
     * The response object for the Microsoft Windows file system used in the
     * <code>DeleteFileSystem</code> operation.
     * </p>
     */
    private DeleteFileSystemWindowsResponse windowsResponse;

    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the file system being deleted.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The ID of the file system being deleted.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The ID of the file system being deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemResult withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be
     * <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @return <p>
     *         The file system lifecycle for the deletion request. Should be
     *         <code>DELETING</code>.
     *         </p>
     * @see FileSystemLifecycle
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be
     * <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The file system lifecycle for the deletion request. Should be
     *            <code>DELETING</code>.
     *            </p>
     * @see FileSystemLifecycle
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be
     * <code>DELETING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The file system lifecycle for the deletion request. Should be
     *            <code>DELETING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemLifecycle
     */
    public DeleteFileSystemResult withLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be
     * <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The file system lifecycle for the deletion request. Should be
     *            <code>DELETING</code>.
     *            </p>
     * @see FileSystemLifecycle
     */
    public void setLifecycle(FileSystemLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be
     * <code>DELETING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The file system lifecycle for the deletion request. Should be
     *            <code>DELETING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemLifecycle
     */
    public DeleteFileSystemResult withLifecycle(FileSystemLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The response object for the Microsoft Windows file system used in the
     * <code>DeleteFileSystem</code> operation.
     * </p>
     *
     * @return <p>
     *         The response object for the Microsoft Windows file system used in
     *         the <code>DeleteFileSystem</code> operation.
     *         </p>
     */
    public DeleteFileSystemWindowsResponse getWindowsResponse() {
        return windowsResponse;
    }

    /**
     * <p>
     * The response object for the Microsoft Windows file system used in the
     * <code>DeleteFileSystem</code> operation.
     * </p>
     *
     * @param windowsResponse <p>
     *            The response object for the Microsoft Windows file system used
     *            in the <code>DeleteFileSystem</code> operation.
     *            </p>
     */
    public void setWindowsResponse(DeleteFileSystemWindowsResponse windowsResponse) {
        this.windowsResponse = windowsResponse;
    }

    /**
     * <p>
     * The response object for the Microsoft Windows file system used in the
     * <code>DeleteFileSystem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowsResponse <p>
     *            The response object for the Microsoft Windows file system used
     *            in the <code>DeleteFileSystem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemResult withWindowsResponse(
            DeleteFileSystemWindowsResponse windowsResponse) {
        this.windowsResponse = windowsResponse;
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getWindowsResponse() != null)
            sb.append("WindowsResponse: " + getWindowsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode
                + ((getWindowsResponse() == null) ? 0 : getWindowsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileSystemResult == false)
            return false;
        DeleteFileSystemResult other = (DeleteFileSystemResult) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getWindowsResponse() == null ^ this.getWindowsResponse() == null)
            return false;
        if (other.getWindowsResponse() != null
                && other.getWindowsResponse().equals(this.getWindowsResponse()) == false)
            return false;
        return true;
    }
}
