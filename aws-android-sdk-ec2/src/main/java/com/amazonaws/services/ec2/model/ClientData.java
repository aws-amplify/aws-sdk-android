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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the client-specific data.
 * </p>
 */
public class ClientData implements Serializable {
    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     */
    private java.util.Date uploadEnd;

    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     */
    private Double uploadSize;

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     */
    private java.util.Date uploadStart;

    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     *
     * @return <p>
     *         A user-defined comment about the disk upload.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     *
     * @param comment <p>
     *            A user-defined comment about the disk upload.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A user-defined comment about the disk upload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            A user-defined comment about the disk upload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientData withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     *
     * @return <p>
     *         The time that the disk upload ends.
     *         </p>
     */
    public java.util.Date getUploadEnd() {
        return uploadEnd;
    }

    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     *
     * @param uploadEnd <p>
     *            The time that the disk upload ends.
     *            </p>
     */
    public void setUploadEnd(java.util.Date uploadEnd) {
        this.uploadEnd = uploadEnd;
    }

    /**
     * <p>
     * The time that the disk upload ends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadEnd <p>
     *            The time that the disk upload ends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientData withUploadEnd(java.util.Date uploadEnd) {
        this.uploadEnd = uploadEnd;
        return this;
    }

    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     *
     * @return <p>
     *         The size of the uploaded disk image, in GiB.
     *         </p>
     */
    public Double getUploadSize() {
        return uploadSize;
    }

    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     *
     * @param uploadSize <p>
     *            The size of the uploaded disk image, in GiB.
     *            </p>
     */
    public void setUploadSize(Double uploadSize) {
        this.uploadSize = uploadSize;
    }

    /**
     * <p>
     * The size of the uploaded disk image, in GiB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadSize <p>
     *            The size of the uploaded disk image, in GiB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientData withUploadSize(Double uploadSize) {
        this.uploadSize = uploadSize;
        return this;
    }

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     *
     * @return <p>
     *         The time that the disk upload starts.
     *         </p>
     */
    public java.util.Date getUploadStart() {
        return uploadStart;
    }

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     *
     * @param uploadStart <p>
     *            The time that the disk upload starts.
     *            </p>
     */
    public void setUploadStart(java.util.Date uploadStart) {
        this.uploadStart = uploadStart;
    }

    /**
     * <p>
     * The time that the disk upload starts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadStart <p>
     *            The time that the disk upload starts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientData withUploadStart(java.util.Date uploadStart) {
        this.uploadStart = uploadStart;
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
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getUploadEnd() != null)
            sb.append("UploadEnd: " + getUploadEnd() + ",");
        if (getUploadSize() != null)
            sb.append("UploadSize: " + getUploadSize() + ",");
        if (getUploadStart() != null)
            sb.append("UploadStart: " + getUploadStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getUploadEnd() == null) ? 0 : getUploadEnd().hashCode());
        hashCode = prime * hashCode + ((getUploadSize() == null) ? 0 : getUploadSize().hashCode());
        hashCode = prime * hashCode
                + ((getUploadStart() == null) ? 0 : getUploadStart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientData == false)
            return false;
        ClientData other = (ClientData) obj;

        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getUploadEnd() == null ^ this.getUploadEnd() == null)
            return false;
        if (other.getUploadEnd() != null
                && other.getUploadEnd().equals(this.getUploadEnd()) == false)
            return false;
        if (other.getUploadSize() == null ^ this.getUploadSize() == null)
            return false;
        if (other.getUploadSize() != null
                && other.getUploadSize().equals(this.getUploadSize()) == false)
            return false;
        if (other.getUploadStart() == null ^ this.getUploadStart() == null)
            return false;
        if (other.getUploadStart() != null
                && other.getUploadStart().equals(this.getUploadStart()) == false)
            return false;
        return true;
    }
}
