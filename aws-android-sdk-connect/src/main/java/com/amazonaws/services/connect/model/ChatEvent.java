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
 * Chat integration event containing payload to perform different chat actions
 * such as:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Sending a chat message
 * </p>
 * </li>
 * <li>
 * <p>
 * Sending a chat event, such as typing
 * </p>
 * </li>
 * <li>
 * <p>
 * Disconnecting from a chat
 * </p>
 * </li>
 * </ul>
 */
public class ChatEvent implements Serializable {
    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT, MESSAGE, EVENT
     */
    private String type;

    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is
     * <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
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
     * Content of the message or event. This is required when <code>Type</code>
     * is <code>MESSAGE</code> and for certain <code>ContentTypes</code> when
     * <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in
     * the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the
     * <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
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
     * Type of chat integration event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT, MESSAGE, EVENT
     *
     * @return <p>
     *         Type of chat integration event.
     *         </p>
     * @see ChatEventType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT, MESSAGE, EVENT
     *
     * @param type <p>
     *            Type of chat integration event.
     *            </p>
     * @see ChatEventType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT, MESSAGE, EVENT
     *
     * @param type <p>
     *            Type of chat integration event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChatEventType
     */
    public ChatEvent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT, MESSAGE, EVENT
     *
     * @param type <p>
     *            Type of chat integration event.
     *            </p>
     * @see ChatEventType
     */
    public void setType(ChatEventType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT, MESSAGE, EVENT
     *
     * @param type <p>
     *            Type of chat integration event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChatEventType
     */
    public ChatEvent withType(ChatEventType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is
     * <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         Type of content. This is required when <code>Type</code> is
     *         <code>MESSAGE</code> or <code>EVENT</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For allowed message content types, see the
     *         <code>ContentType</code> parameter in the <a href=
     *         "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *         >SendMessage</a> topic in the <i>Amazon Connect Participant
     *         Service API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For allowed event content types, see the <code>ContentType</code>
     *         parameter in the <a href=
     *         "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *         >SendEvent</a> topic in the <i>Amazon Connect Participant Service
     *         API Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is
     * <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param contentType <p>
     *            Type of content. This is required when <code>Type</code> is
     *            <code>MESSAGE</code> or <code>EVENT</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For allowed message content types, see the
     *            <code>ContentType</code> parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *            >SendMessage</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For allowed event content types, see the
     *            <code>ContentType</code> parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *            >SendEvent</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is
     * <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
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
     *            Type of content. This is required when <code>Type</code> is
     *            <code>MESSAGE</code> or <code>EVENT</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For allowed message content types, see the
     *            <code>ContentType</code> parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *            >SendMessage</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For allowed event content types, see the
     *            <code>ContentType</code> parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *            >SendEvent</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChatEvent withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * Content of the message or event. This is required when <code>Type</code>
     * is <code>MESSAGE</code> and for certain <code>ContentTypes</code> when
     * <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in
     * the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the
     * <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         Content of the message or event. This is required when
     *         <code>Type</code> is <code>MESSAGE</code> and for certain
     *         <code>ContentTypes</code> when <code>Type</code> is
     *         <code>EVENT</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For allowed message content, see the <code>Content</code>
     *         parameter in the <a href=
     *         "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *         >SendMessage</a> topic in the <i>Amazon Connect Participant
     *         Service API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For allowed event content, see the <code>Content</code> parameter
     *         in the <a href=
     *         "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *         >SendEvent</a> topic in the <i>Amazon Connect Participant Service
     *         API Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * Content of the message or event. This is required when <code>Type</code>
     * is <code>MESSAGE</code> and for certain <code>ContentTypes</code> when
     * <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in
     * the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the
     * <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            Content of the message or event. This is required when
     *            <code>Type</code> is <code>MESSAGE</code> and for certain
     *            <code>ContentTypes</code> when <code>Type</code> is
     *            <code>EVENT</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For allowed message content, see the <code>Content</code>
     *            parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *            >SendMessage</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For allowed event content, see the <code>Content</code>
     *            parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *            >SendEvent</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Content of the message or event. This is required when <code>Type</code>
     * is <code>MESSAGE</code> and for certain <code>ContentTypes</code> when
     * <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in
     * the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     * >SendMessage</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the
     * <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     * >SendEvent</a> topic in the <i>Amazon Connect Participant Service API
     * Reference</i>.
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
     *            Content of the message or event. This is required when
     *            <code>Type</code> is <code>MESSAGE</code> and for certain
     *            <code>ContentTypes</code> when <code>Type</code> is
     *            <code>EVENT</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For allowed message content, see the <code>Content</code>
     *            parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *            >SendMessage</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For allowed event content, see the <code>Content</code>
     *            parameter in the <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *            >SendEvent</a> topic in the <i>Amazon Connect Participant
     *            Service API Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChatEvent withContent(String content) {
        this.content = content;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatEvent == false)
            return false;
        ChatEvent other = (ChatEvent) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
