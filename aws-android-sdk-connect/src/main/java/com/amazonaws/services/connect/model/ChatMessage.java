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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A chat message.
 * </p>
 */
public class ChatMessage implements Serializable {
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
     * The content of the chat message.
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
    public ChatMessage withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The content of the chat message.
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
     *         The content of the chat message.
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
     * The content of the chat message.
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
     *            The content of the chat message.
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
     * The content of the chat message.
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
     *            The content of the chat message.
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
    public ChatMessage withContent(String content) {
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

        if (obj instanceof ChatMessage == false)
            return false;
        ChatMessage other = (ChatMessage) obj;

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
