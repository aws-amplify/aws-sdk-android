/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Error describing a failure to retrieve attached file metadata through
 * BatchGetAttachedFileMetadata action.
 * </p>
 */
public class AttachedFileError implements Serializable {
    /**
     * <p>
     * Status code describing the failure.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String fileId;

    /**
     * <p>
     * Status code describing the failure.
     * </p>
     *
     * @return <p>
     *         Status code describing the failure.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * Status code describing the failure.
     * </p>
     *
     * @param errorCode <p>
     *            Status code describing the failure.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Status code describing the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            Status code describing the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachedFileError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     *
     * @return <p>
     *         Why the attached file couldn't be retrieved.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     *
     * @param errorMessage <p>
     *            Why the attached file couldn't be retrieved.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            Why the attached file couldn't be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachedFileError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The unique identifier of the attached file resource.
     *         </p>
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param fileId <p>
     *            The unique identifier of the attached file resource.
     *            </p>
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param fileId <p>
     *            The unique identifier of the attached file resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachedFileError withFileId(String fileId) {
        this.fileId = fileId;
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getFileId() != null)
            sb.append("FileId: " + getFileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachedFileError == false)
            return false;
        AttachedFileError other = (AttachedFileError) obj;

        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        return true;
    }
}
