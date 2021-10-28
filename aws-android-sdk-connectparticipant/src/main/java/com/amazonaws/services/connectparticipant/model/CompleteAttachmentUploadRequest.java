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
 * Allows you to confirm that the attachment has been uploaded using the
 * pre-signed URL provided in StartAttachmentUpload API.
 * </p>
 * <p>
 * The Amazon Connect Participant Service APIs do not use <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 authentication</a>.
 * </p>
 */
public class CompleteAttachmentUploadRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     */
    private java.util.List<String> attachmentIds;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
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
     * A list of unique identifiers for the attachments.
     * </p>
     *
     * @return <p>
     *         A list of unique identifiers for the attachments.
     *         </p>
     */
    public java.util.List<String> getAttachmentIds() {
        return attachmentIds;
    }

    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     *
     * @param attachmentIds <p>
     *            A list of unique identifiers for the attachments.
     *            </p>
     */
    public void setAttachmentIds(java.util.Collection<String> attachmentIds) {
        if (attachmentIds == null) {
            this.attachmentIds = null;
            return;
        }

        this.attachmentIds = new java.util.ArrayList<String>(attachmentIds);
    }

    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentIds <p>
     *            A list of unique identifiers for the attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteAttachmentUploadRequest withAttachmentIds(String... attachmentIds) {
        if (getAttachmentIds() == null) {
            this.attachmentIds = new java.util.ArrayList<String>(attachmentIds.length);
        }
        for (String value : attachmentIds) {
            this.attachmentIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentIds <p>
     *            A list of unique identifiers for the attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteAttachmentUploadRequest withAttachmentIds(
            java.util.Collection<String> attachmentIds) {
        setAttachmentIds(attachmentIds);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteAttachmentUploadRequest withClientToken(String clientToken) {
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
    public CompleteAttachmentUploadRequest withConnectionToken(String connectionToken) {
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
        if (getAttachmentIds() != null)
            sb.append("AttachmentIds: " + getAttachmentIds() + ",");
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
                + ((getAttachmentIds() == null) ? 0 : getAttachmentIds().hashCode());
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

        if (obj instanceof CompleteAttachmentUploadRequest == false)
            return false;
        CompleteAttachmentUploadRequest other = (CompleteAttachmentUploadRequest) obj;

        if (other.getAttachmentIds() == null ^ this.getAttachmentIds() == null)
            return false;
        if (other.getAttachmentIds() != null
                && other.getAttachmentIds().equals(this.getAttachmentIds()) == false)
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
