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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

public class GetFileResult implements Serializable {
    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by
     * GetFile.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     */
    private String blobId;

    /**
     * <p>
     * The fully qualified path to the specified file. Returns the name and
     * extension of the file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include
     * strings such as EXECUTABLE and not numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file
     * mode permission values, such as 100644, but rather extrapolated values.
     * See the supported return values.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String fileMode;

    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     */
    private Long fileSize;

    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the
     * file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     */
    private java.nio.ByteBuffer fileContent;

    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by
     * GetFile.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit that contains the content
     *         returned by GetFile.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by
     * GetFile.
     * </p>
     *
     * @param commitId <p>
     *            The full commit ID of the commit that contains the content
     *            returned by GetFile.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by
     * GetFile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitId <p>
     *            The full commit ID of the commit that contains the content
     *            returned by GetFile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileResult withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     *
     * @return <p>
     *         The blob ID of the object that represents the file content.
     *         </p>
     */
    public String getBlobId() {
        return blobId;
    }

    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     *
     * @param blobId <p>
     *            The blob ID of the object that represents the file content.
     *            </p>
     */
    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blobId <p>
     *            The blob ID of the object that represents the file content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileResult withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the specified file. Returns the name and
     * extension of the file.
     * </p>
     *
     * @return <p>
     *         The fully qualified path to the specified file. Returns the name
     *         and extension of the file.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The fully qualified path to the specified file. Returns the name and
     * extension of the file.
     * </p>
     *
     * @param filePath <p>
     *            The fully qualified path to the specified file. Returns the
     *            name and extension of the file.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully qualified path to the specified file. Returns the name and
     * extension of the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The fully qualified path to the specified file. Returns the
     *            name and extension of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileResult withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include
     * strings such as EXECUTABLE and not numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file
     * mode permission values, such as 100644, but rather extrapolated values.
     * See the supported return values.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The extrapolated file mode permissions of the blob. Valid values
     *         include strings such as EXECUTABLE and not numeric values.
     *         </p>
     *         <note>
     *         <p>
     *         The file mode permissions returned by this API are not the
     *         standard file mode permission values, such as 100644, but rather
     *         extrapolated values. See the supported return values.
     *         </p>
     *         </note>
     * @see FileModeTypeEnum
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include
     * strings such as EXECUTABLE and not numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file
     * mode permission values, such as 100644, but rather extrapolated values.
     * See the supported return values.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions of the blob. Valid
     *            values include strings such as EXECUTABLE and not numeric
     *            values.
     *            </p>
     *            <note>
     *            <p>
     *            The file mode permissions returned by this API are not the
     *            standard file mode permission values, such as 100644, but
     *            rather extrapolated values. See the supported return values.
     *            </p>
     *            </note>
     * @see FileModeTypeEnum
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include
     * strings such as EXECUTABLE and not numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file
     * mode permission values, such as 100644, but rather extrapolated values.
     * See the supported return values.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions of the blob. Valid
     *            values include strings such as EXECUTABLE and not numeric
     *            values.
     *            </p>
     *            <note>
     *            <p>
     *            The file mode permissions returned by this API are not the
     *            standard file mode permission values, such as 100644, but
     *            rather extrapolated values. See the supported return values.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public GetFileResult withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include
     * strings such as EXECUTABLE and not numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file
     * mode permission values, such as 100644, but rather extrapolated values.
     * See the supported return values.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions of the blob. Valid
     *            values include strings such as EXECUTABLE and not numeric
     *            values.
     *            </p>
     *            <note>
     *            <p>
     *            The file mode permissions returned by this API are not the
     *            standard file mode permission values, such as 100644, but
     *            rather extrapolated values. See the supported return values.
     *            </p>
     *            </note>
     * @see FileModeTypeEnum
     */
    public void setFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include
     * strings such as EXECUTABLE and not numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file
     * mode permission values, such as 100644, but rather extrapolated values.
     * See the supported return values.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions of the blob. Valid
     *            values include strings such as EXECUTABLE and not numeric
     *            values.
     *            </p>
     *            <note>
     *            <p>
     *            The file mode permissions returned by this API are not the
     *            standard file mode permission values, such as 100644, but
     *            rather extrapolated values. See the supported return values.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public GetFileResult withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
        return this;
    }

    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     *
     * @return <p>
     *         The size of the contents of the file, in bytes.
     *         </p>
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     *
     * @param fileSize <p>
     *            The size of the contents of the file, in bytes.
     *            </p>
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSize <p>
     *            The size of the contents of the file, in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileResult withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the
     * file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @return <p>
     *         The base-64 encoded binary data object that represents the
     *         content of the file.
     *         </p>
     */
    public java.nio.ByteBuffer getFileContent() {
        return fileContent;
    }

    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the
     * file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param fileContent <p>
     *            The base-64 encoded binary data object that represents the
     *            content of the file.
     *            </p>
     */
    public void setFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the
     * file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param fileContent <p>
     *            The base-64 encoded binary data object that represents the
     *            content of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileResult withFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
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
        if (getCommitId() != null)
            sb.append("commitId: " + getCommitId() + ",");
        if (getBlobId() != null)
            sb.append("blobId: " + getBlobId() + ",");
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath() + ",");
        if (getFileMode() != null)
            sb.append("fileMode: " + getFileMode() + ",");
        if (getFileSize() != null)
            sb.append("fileSize: " + getFileSize() + ",");
        if (getFileContent() != null)
            sb.append("fileContent: " + getFileContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        hashCode = prime * hashCode
                + ((getFileContent() == null) ? 0 : getFileContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFileResult == false)
            return false;
        GetFileResult other = (GetFileResult) obj;

        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getFileSize() == null ^ this.getFileSize() == null)
            return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false)
            return false;
        if (other.getFileContent() == null ^ this.getFileContent() == null)
            return false;
        if (other.getFileContent() != null
                && other.getFileContent().equals(this.getFileContent()) == false)
            return false;
        return true;
    }
}
