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
 * Sends a message.
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
public class SendMessageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>,
     * <code>text/markdown</code>, <code>application/json</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String contentType;

    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length
     * Constraints are Minimum of 1, Maximum of 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of
     * 1, Maximum of 12000.
     * </p>
     * </li>
     * <li>
     * <p>
     * For
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * , the Length Constraints are Minimum of 1, Maximum of 12288.
     * </p>
     * </li>
     * </ul>
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
     * The authentication token associated with the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String connectionToken;

    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>,
     * <code>text/markdown</code>, <code>application/json</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The type of the content. Supported types are
     *         <code>text/plain</code>, <code>text/markdown</code>,
     *         <code>application/json</code>, and
     *         <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *         .
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>,
     * <code>text/markdown</code>, <code>application/json</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param contentType <p>
     *            The type of the content. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>, and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of the content. Supported types are <code>text/plain</code>,
     * <code>text/markdown</code>, <code>application/json</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param contentType <p>
     *            The type of the content. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>, and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length
     * Constraints are Minimum of 1, Maximum of 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of
     * 1, Maximum of 12000.
     * </p>
     * </li>
     * <li>
     * <p>
     * For
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * , the Length Constraints are Minimum of 1, Maximum of 12288.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         The content of the message.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>text/plain</code> and <code>text/markdown</code>, the
     *         Length Constraints are Minimum of 1, Maximum of 1024.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>application/json</code>, the Length Constraints are
     *         Minimum of 1, Maximum of 12000.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For
     *         <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *         , the Length Constraints are Minimum of 1, Maximum of 12288.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length
     * Constraints are Minimum of 1, Maximum of 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of
     * 1, Maximum of 12000.
     * </p>
     * </li>
     * <li>
     * <p>
     * For
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * , the Length Constraints are Minimum of 1, Maximum of 12288.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            The content of the message.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>text/plain</code> and <code>text/markdown</code>,
     *            the Length Constraints are Minimum of 1, Maximum of 1024.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>application/json</code>, the Length Constraints are
     *            Minimum of 1, Maximum of 12000.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            , the Length Constraints are Minimum of 1, Maximum of 12288.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>text/plain</code> and <code>text/markdown</code>, the Length
     * Constraints are Minimum of 1, Maximum of 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>application/json</code>, the Length Constraints are Minimum of
     * 1, Maximum of 12000.
     * </p>
     * </li>
     * <li>
     * <p>
     * For
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * , the Length Constraints are Minimum of 1, Maximum of 12288.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            The content of the message.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>text/plain</code> and <code>text/markdown</code>,
     *            the Length Constraints are Minimum of 1, Maximum of 1024.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>application/json</code>, the Length Constraints are
     *            Minimum of 1, Maximum of 12000.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            , the Length Constraints are Minimum of 1, Maximum of 12288.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest withContent(String content) {
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
    public SendMessageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The authentication token associated with the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The authentication token associated with the connection.
     *         </p>
     */
    public String getConnectionToken() {
        return connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The authentication token associated with the connection.
     *            </p>
     */
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The authentication token associated with the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageRequest withConnectionToken(String connectionToken) {
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

        if (obj instanceof SendMessageRequest == false)
            return false;
        SendMessageRequest other = (SendMessageRequest) obj;

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
