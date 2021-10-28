/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

public class StartAttachmentUploadResult implements Serializable {
    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String attachmentId;

    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     */
    private UploadMetadata uploadMetadata;

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the attachment.
     *         </p>
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param attachmentId <p>
     *            A unique identifier for the attachment.
     *            </p>
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param attachmentId <p>
     *            A unique identifier for the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachmentUploadResult withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     *
     * @return <p>
     *         Fields to be used while uploading the attachment.
     *         </p>
     */
    public UploadMetadata getUploadMetadata() {
        return uploadMetadata;
    }

    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     *
     * @param uploadMetadata <p>
     *            Fields to be used while uploading the attachment.
     *            </p>
     */
    public void setUploadMetadata(UploadMetadata uploadMetadata) {
        this.uploadMetadata = uploadMetadata;
    }

    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadMetadata <p>
     *            Fields to be used while uploading the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachmentUploadResult withUploadMetadata(UploadMetadata uploadMetadata) {
        this.uploadMetadata = uploadMetadata;
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
            sb.append("AttachmentId: " + getAttachmentId() + ",");
        if (getUploadMetadata() != null)
            sb.append("UploadMetadata: " + getUploadMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode
                + ((getUploadMetadata() == null) ? 0 : getUploadMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAttachmentUploadResult == false)
            return false;
        StartAttachmentUploadResult other = (StartAttachmentUploadResult) obj;

        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null
                && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getUploadMetadata() == null ^ this.getUploadMetadata() == null)
            return false;
        if (other.getUploadMetadata() != null
                && other.getUploadMetadata().equals(this.getUploadMetadata()) == false)
            return false;
        return true;
    }
}
