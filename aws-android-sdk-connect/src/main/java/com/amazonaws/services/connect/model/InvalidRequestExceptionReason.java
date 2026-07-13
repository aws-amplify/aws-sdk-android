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
 * Reason why the request was invalid.
 * </p>
 */
public class InvalidRequestExceptionReason implements Serializable {
    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FILE_SIZE, INVALID_FILE_TYPE,
     * INVALID_FILE_NAME
     */
    private String attachedFileInvalidRequestExceptionReason;

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FILE_SIZE, INVALID_FILE_TYPE,
     * INVALID_FILE_NAME
     *
     * @return <p>
     *         Reason why the StartAttachedFiledUpload request was invalid.
     *         </p>
     * @see AttachedFileInvalidRequestExceptionReason
     */
    public String getAttachedFileInvalidRequestExceptionReason() {
        return attachedFileInvalidRequestExceptionReason;
    }

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FILE_SIZE, INVALID_FILE_TYPE,
     * INVALID_FILE_NAME
     *
     * @param attachedFileInvalidRequestExceptionReason <p>
     *            Reason why the StartAttachedFiledUpload request was invalid.
     *            </p>
     * @see AttachedFileInvalidRequestExceptionReason
     */
    public void setAttachedFileInvalidRequestExceptionReason(
            String attachedFileInvalidRequestExceptionReason) {
        this.attachedFileInvalidRequestExceptionReason = attachedFileInvalidRequestExceptionReason;
    }

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FILE_SIZE, INVALID_FILE_TYPE,
     * INVALID_FILE_NAME
     *
     * @param attachedFileInvalidRequestExceptionReason <p>
     *            Reason why the StartAttachedFiledUpload request was invalid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttachedFileInvalidRequestExceptionReason
     */
    public InvalidRequestExceptionReason withAttachedFileInvalidRequestExceptionReason(
            String attachedFileInvalidRequestExceptionReason) {
        this.attachedFileInvalidRequestExceptionReason = attachedFileInvalidRequestExceptionReason;
        return this;
    }

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FILE_SIZE, INVALID_FILE_TYPE,
     * INVALID_FILE_NAME
     *
     * @param attachedFileInvalidRequestExceptionReason <p>
     *            Reason why the StartAttachedFiledUpload request was invalid.
     *            </p>
     * @see AttachedFileInvalidRequestExceptionReason
     */
    public void setAttachedFileInvalidRequestExceptionReason(
            AttachedFileInvalidRequestExceptionReason attachedFileInvalidRequestExceptionReason) {
        this.attachedFileInvalidRequestExceptionReason = attachedFileInvalidRequestExceptionReason
                .toString();
    }

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FILE_SIZE, INVALID_FILE_TYPE,
     * INVALID_FILE_NAME
     *
     * @param attachedFileInvalidRequestExceptionReason <p>
     *            Reason why the StartAttachedFiledUpload request was invalid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttachedFileInvalidRequestExceptionReason
     */
    public InvalidRequestExceptionReason withAttachedFileInvalidRequestExceptionReason(
            AttachedFileInvalidRequestExceptionReason attachedFileInvalidRequestExceptionReason) {
        this.attachedFileInvalidRequestExceptionReason = attachedFileInvalidRequestExceptionReason
                .toString();
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
        if (getAttachedFileInvalidRequestExceptionReason() != null)
            sb.append("AttachedFileInvalidRequestExceptionReason: "
                    + getAttachedFileInvalidRequestExceptionReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAttachedFileInvalidRequestExceptionReason() == null) ? 0
                        : getAttachedFileInvalidRequestExceptionReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidRequestExceptionReason == false)
            return false;
        InvalidRequestExceptionReason other = (InvalidRequestExceptionReason) obj;

        if (other.getAttachedFileInvalidRequestExceptionReason() == null
                ^ this.getAttachedFileInvalidRequestExceptionReason() == null)
            return false;
        if (other.getAttachedFileInvalidRequestExceptionReason() != null
                && other.getAttachedFileInvalidRequestExceptionReason().equals(
                        this.getAttachedFileInvalidRequestExceptionReason()) == false)
            return false;
        return true;
    }
}
