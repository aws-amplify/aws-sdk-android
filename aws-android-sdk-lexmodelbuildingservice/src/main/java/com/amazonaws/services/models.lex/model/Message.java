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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

/**
 * <p>
 * The message object that provides the message text and its type.
 * </p>
 */
public class Message implements Serializable {
    /**
     * <p>
     * The content type of the message string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, SSML, CustomPayload
     */
    private String contentType;

    /**
     * <p>
     * The text of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String content;

    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is
     * assigned to a message, Amazon Lex returns one message from each group in
     * the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     */
    private Integer groupNumber;

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, SSML, CustomPayload
     *
     * @return <p>
     *         The content type of the message string.
     *         </p>
     * @see ContentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, SSML, CustomPayload
     *
     * @param contentType <p>
     *            The content type of the message string.
     *            </p>
     * @see ContentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, SSML, CustomPayload
     *
     * @param contentType <p>
     *            The content type of the message string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentType
     */
    public Message withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, SSML, CustomPayload
     *
     * @param contentType <p>
     *            The content type of the message string.
     *            </p>
     * @see ContentType
     */
    public void setContentType(ContentType contentType) {
        this.contentType = contentType.toString();
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, SSML, CustomPayload
     *
     * @param contentType <p>
     *            The content type of the message string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentType
     */
    public Message withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * The text of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The text of the message.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The text of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param content <p>
     *            The text of the message.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The text of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param content <p>
     *            The text of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is
     * assigned to a message, Amazon Lex returns one message from each group in
     * the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @return <p>
     *         Identifies the message group that the message belongs to. When a
     *         group is assigned to a message, Amazon Lex returns one message
     *         from each group in the response.
     *         </p>
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is
     * assigned to a message, Amazon Lex returns one message from each group in
     * the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param groupNumber <p>
     *            Identifies the message group that the message belongs to. When
     *            a group is assigned to a message, Amazon Lex returns one
     *            message from each group in the response.
     *            </p>
     */
    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is
     * assigned to a message, Amazon Lex returns one message from each group in
     * the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param groupNumber <p>
     *            Identifies the message group that the message belongs to. When
     *            a group is assigned to a message, Amazon Lex returns one
     *            message from each group in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
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
            sb.append("contentType: " + getContentType() + ",");
        if (getContent() != null)
            sb.append("content: " + getContent() + ",");
        if (getGroupNumber() != null)
            sb.append("groupNumber: " + getGroupNumber());
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
                + ((getGroupNumber() == null) ? 0 : getGroupNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getGroupNumber() == null ^ this.getGroupNumber() == null)
            return false;
        if (other.getGroupNumber() != null
                && other.getGroupNumber().equals(this.getGroupNumber()) == false)
            return false;
        return true;
    }
}
