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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The file name and ID of an attachment to a case communication. You can use
 * the ID to retrieve the attachment with the <a>DescribeAttachment</a>
 * operation.
 * </p>
 */
public class AttachmentDetails implements Serializable {
    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String attachmentId;

    /**
     * <p>
     * The file name of the attachment.
     * </p>
     */
    private String fileName;

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the attachment.
     *         </p>
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     *
     * @param attachmentId <p>
     *            The ID of the attachment.
     *            </p>
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentId <p>
     *            The ID of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentDetails withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * <p>
     * The file name of the attachment.
     * </p>
     *
     * @return <p>
     *         The file name of the attachment.
     *         </p>
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <p>
     * The file name of the attachment.
     * </p>
     *
     * @param fileName <p>
     *            The file name of the attachment.
     *            </p>
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The file name of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileName <p>
     *            The file name of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentDetails withFileName(String fileName) {
        this.fileName = fileName;
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
        if (getAttachmentId() != null)
            sb.append("attachmentId: " + getAttachmentId() + ",");
        if (getFileName() != null)
            sb.append("fileName: " + getFileName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentDetails == false)
            return false;
        AttachmentDetails other = (AttachmentDetails) obj;

        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null
                && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        return true;
    }
}
