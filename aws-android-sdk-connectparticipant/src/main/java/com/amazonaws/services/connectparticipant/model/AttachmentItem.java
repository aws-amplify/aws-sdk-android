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

/**
 * <p>
 * The case-insensitive input to indicate standard MIME type that describes the
 * format of the file that will be uploaded.
 * </p>
 */
public class AttachmentItem implements Serializable {
    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported
     * file types, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String contentType;

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
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String attachmentName;

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, IN_PROGRESS
     */
    private String status;

    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported
     * file types, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         Describes the MIME file type of the attachment. For a list of
     *         supported file types, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     *         >Feature specifications</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported
     * file types, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param contentType <p>
     *            Describes the MIME file type of the attachment. For a list of
     *            supported file types, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     *            >Feature specifications</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported
     * file types, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param contentType <p>
     *            Describes the MIME file type of the attachment. For a list of
     *            supported file types, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     *            >Feature specifications</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentItem withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

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
    public AttachmentItem withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A case-sensitive name of the attachment being uploaded.
     *         </p>
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param attachmentName <p>
     *            A case-sensitive name of the attachment being uploaded.
     *            </p>
     */
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param attachmentName <p>
     *            A case-sensitive name of the attachment being uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentItem withAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, IN_PROGRESS
     *
     * @return <p>
     *         Status of the attachment.
     *         </p>
     * @see ArtifactStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, IN_PROGRESS
     *
     * @param status <p>
     *            Status of the attachment.
     *            </p>
     * @see ArtifactStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, IN_PROGRESS
     *
     * @param status <p>
     *            Status of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactStatus
     */
    public AttachmentItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, IN_PROGRESS
     *
     * @param status <p>
     *            Status of the attachment.
     *            </p>
     * @see ArtifactStatus
     */
    public void setStatus(ArtifactStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, IN_PROGRESS
     *
     * @param status <p>
     *            Status of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactStatus
     */
    public AttachmentItem withStatus(ArtifactStatus status) {
        this.status = status.toString();
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
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getAttachmentId() != null)
            sb.append("AttachmentId: " + getAttachmentId() + ",");
        if (getAttachmentName() != null)
            sb.append("AttachmentName: " + getAttachmentName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentItem == false)
            return false;
        AttachmentItem other = (AttachmentItem) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null
                && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getAttachmentName() == null ^ this.getAttachmentName() == null)
            return false;
        if (other.getAttachmentName() != null
                && other.getAttachmentName().equals(this.getAttachmentName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
