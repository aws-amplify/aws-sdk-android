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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides a pre-signed Amazon S3 URL in response for uploading the file
 * directly to S3.
 * </p>
 * <p>
 * The Amazon Connect Participant Service APIs do not use <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 authentication</a>.
 * </p>
 */
public class StartAttachmentUploadRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The size of the attachment in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long attachmentSizeInBytes;

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
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String connectionToken;

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
    public StartAttachmentUploadRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The size of the attachment in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The size of the attachment in bytes.
     *         </p>
     */
    public Long getAttachmentSizeInBytes() {
        return attachmentSizeInBytes;
    }

    /**
     * <p>
     * The size of the attachment in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param attachmentSizeInBytes <p>
     *            The size of the attachment in bytes.
     *            </p>
     */
    public void setAttachmentSizeInBytes(Long attachmentSizeInBytes) {
        this.attachmentSizeInBytes = attachmentSizeInBytes;
    }

    /**
     * <p>
     * The size of the attachment in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param attachmentSizeInBytes <p>
     *            The size of the attachment in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachmentUploadRequest withAttachmentSizeInBytes(Long attachmentSizeInBytes) {
        this.attachmentSizeInBytes = attachmentSizeInBytes;
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
    public StartAttachmentUploadRequest withAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    /**
     * <p>
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         A unique case sensitive identifier to support idempotency of
     *         request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param clientToken <p>
     *            A unique case sensitive identifier to support idempotency of
     *            request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param clientToken <p>
     *            A unique case sensitive identifier to support idempotency of
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachmentUploadRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The authentication token associated with the participant's
     *         connection.
     *         </p>
     */
    public String getConnectionToken() {
        return connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The authentication token associated with the participant's
     *            connection.
     *            </p>
     */
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The authentication token associated with the participant's
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachmentUploadRequest withConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
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
        if (getAttachmentSizeInBytes() != null)
            sb.append("AttachmentSizeInBytes: " + getAttachmentSizeInBytes() + ",");
        if (getAttachmentName() != null)
            sb.append("AttachmentName: " + getAttachmentName() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: " + getConnectionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttachmentSizeInBytes() == null) ? 0 : getAttachmentSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAttachmentUploadRequest == false)
            return false;
        StartAttachmentUploadRequest other = (StartAttachmentUploadRequest) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAttachmentSizeInBytes() == null ^ this.getAttachmentSizeInBytes() == null)
            return false;
        if (other.getAttachmentSizeInBytes() != null
                && other.getAttachmentSizeInBytes().equals(this.getAttachmentSizeInBytes()) == false)
            return false;
        if (other.getAttachmentName() == null ^ this.getAttachmentName() == null)
            return false;
        if (other.getAttachmentName() != null
                && other.getAttachmentName().equals(this.getAttachmentName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null
                && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        return true;
    }
}
