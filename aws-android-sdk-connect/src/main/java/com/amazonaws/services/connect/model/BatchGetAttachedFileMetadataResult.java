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

public class BatchGetAttachedFileMetadataResult implements Serializable {
    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     */
    private java.util.List<AttachedFile> files;

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     */
    private java.util.List<AttachedFileError> errors;

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     *
     * @return <p>
     *         List of attached files that were successfully retrieved.
     *         </p>
     */
    public java.util.List<AttachedFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     *
     * @param files <p>
     *            List of attached files that were successfully retrieved.
     *            </p>
     */
    public void setFiles(java.util.Collection<AttachedFile> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<AttachedFile>(files);
    }

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param files <p>
     *            List of attached files that were successfully retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataResult withFiles(AttachedFile... files) {
        if (getFiles() == null) {
            this.files = new java.util.ArrayList<AttachedFile>(files.length);
        }
        for (AttachedFile value : files) {
            this.files.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param files <p>
     *            List of attached files that were successfully retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataResult withFiles(java.util.Collection<AttachedFile> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     *
     * @return <p>
     *         List of errors of attached files that could not be retrieved.
     *         </p>
     */
    public java.util.List<AttachedFileError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     *
     * @param errors <p>
     *            List of errors of attached files that could not be retrieved.
     *            </p>
     */
    public void setErrors(java.util.Collection<AttachedFileError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<AttachedFileError>(errors);
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            List of errors of attached files that could not be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataResult withErrors(AttachedFileError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<AttachedFileError>(errors.length);
        }
        for (AttachedFileError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            List of errors of attached files that could not be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataResult withErrors(
            java.util.Collection<AttachedFileError> errors) {
        setErrors(errors);
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
        if (getFiles() != null)
            sb.append("Files: " + getFiles() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAttachedFileMetadataResult == false)
            return false;
        BatchGetAttachedFileMetadataResult other = (BatchGetAttachedFileMetadataResult) obj;

        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
