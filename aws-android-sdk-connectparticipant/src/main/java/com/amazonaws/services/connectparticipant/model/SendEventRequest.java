/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Sends an event.
 * </p>
 * <note>
 * <p>
 * <code>ConnectionToken</code> is used for invoking this API instead of
 * <code>ParticipantToken</code>.
 * </p>
 * </note>
 * <p>
 * The Amazon Connect Participant Service APIs do not use <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 authentication</a>.
 * </p>
 */
public class SendEventRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.delivered
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.read
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String contentType;

    /**
     * <p>
     * The content of the event to be sent (for example, message text). For
     * content related to message receipts, this is supported in the form of a
     * JSON string.
     * </p>
     * <p>
     * Sample Content:
     * "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String content;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
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
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.delivered
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.read
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The content type of the request. Supported types are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         application/vnd.amazonaws.connect.event.typing
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         application/vnd.amazonaws.connect.event.connection.acknowledged
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         application/vnd.amazonaws.connect.event.message.delivered
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         application/vnd.amazonaws.connect.event.message.read
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.delivered
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.read
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param contentType <p>
     *            The content type of the request. Supported types are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.typing
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.connection.
     *            acknowledged
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.message.delivered
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.message.read
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the request. Supported types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.typing
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.connection.acknowledged
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.delivered
     * </p>
     * </li>
     * <li>
     * <p>
     * application/vnd.amazonaws.connect.event.message.read
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param contentType <p>
     *            The content type of the request. Supported types are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.typing
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.connection.
     *            acknowledged
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.message.delivered
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            application/vnd.amazonaws.connect.event.message.read
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEventRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The content of the event to be sent (for example, message text). For
     * content related to message receipts, this is supported in the form of a
     * JSON string.
     * </p>
     * <p>
     * Sample Content:
     * "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         The content of the event to be sent (for example, message text).
     *         For content related to message receipts, this is supported in the
     *         form of a JSON string.
     *         </p>
     *         <p>
     *         Sample Content:
     *         "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the event to be sent (for example, message text). For
     * content related to message receipts, this is supported in the form of a
     * JSON string.
     * </p>
     * <p>
     * Sample Content:
     * "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            The content of the event to be sent (for example, message
     *            text). For content related to message receipts, this is
     *            supported in the form of a JSON string.
     *            </p>
     *            <p>
     *            Sample Content:
     *            "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the event to be sent (for example, message text). For
     * content related to message receipts, this is supported in the form of a
     * JSON string.
     * </p>
     * <p>
     * Sample Content:
     * "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            The content of the event to be sent (for example, message
     *            text). For content related to message receipts, this is
     *            supported in the form of a JSON string.
     *            </p>
     *            <p>
     *            Sample Content:
     *            "{\"messageId\":\"11111111-aaaa-bbbb-cccc-EXAMPLE01234\"}"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEventRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If not provided, the Amazon Web
     *         Services SDK populates this field. For more information about
     *         idempotency, see <a href=
     *         "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *         >Making retries safe with idempotent APIs</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEventRequest withClientToken(String clientToken) {
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
    public SendEventRequest withConnectionToken(String connectionToken) {
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
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
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
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

        if (obj instanceof SendEventRequest == false)
            return false;
        SendEventRequest other = (SendEventRequest) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
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
