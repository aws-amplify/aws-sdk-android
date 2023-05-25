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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The content and content type of a document.
 * </p>
 */
public class Document implements Serializable {
    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This
     * object contains the document content converted into base64-encoded binary
     * data. If you use one of the AWS SDKs, the SDK performs the
     * Base64-encoding on this field before sending the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     */
    private java.nio.ByteBuffer content;

    /**
     * <p>
     * Describes the format of the document. You can specify one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/html - The input data consists of HTML content. Amazon Translate
     * translates only the text in the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain - The input data consists of unformatted text. Amazon
     * Translate translates every character in the content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     */
    private String contentType;

    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This
     * object contains the document content converted into base64-encoded binary
     * data. If you use one of the AWS SDKs, the SDK performs the
     * Base64-encoding on this field before sending the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @return <p>
     *         The <code>Content</code>field type is Binary large object (blob).
     *         This object contains the document content converted into
     *         base64-encoded binary data. If you use one of the AWS SDKs, the
     *         SDK performs the Base64-encoding on this field before sending the
     *         request.
     *         </p>
     */
    public java.nio.ByteBuffer getContent() {
        return content;
    }

    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This
     * object contains the document content converted into base64-encoded binary
     * data. If you use one of the AWS SDKs, the SDK performs the
     * Base64-encoding on this field before sending the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param content <p>
     *            The <code>Content</code>field type is Binary large object
     *            (blob). This object contains the document content converted
     *            into base64-encoded binary data. If you use one of the AWS
     *            SDKs, the SDK performs the Base64-encoding on this field
     *            before sending the request.
     *            </p>
     */
    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This
     * object contains the document content converted into base64-encoded binary
     * data. If you use one of the AWS SDKs, the SDK performs the
     * Base64-encoding on this field before sending the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param content <p>
     *            The <code>Content</code>field type is Binary large object
     *            (blob). This object contains the document content converted
     *            into base64-encoded binary data. If you use one of the AWS
     *            SDKs, the SDK performs the Base64-encoding on this field
     *            before sending the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withContent(java.nio.ByteBuffer content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * Describes the format of the document. You can specify one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/html - The input data consists of HTML content. Amazon Translate
     * translates only the text in the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain - The input data consists of unformatted text. Amazon
     * Translate translates every character in the content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @return <p>
     *         Describes the format of the document. You can specify one of the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         text/html - The input data consists of HTML content. Amazon
     *         Translate translates only the text in the HTML element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         text/plain - The input data consists of unformatted text. Amazon
     *         Translate translates every character in the content.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * Describes the format of the document. You can specify one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/html - The input data consists of HTML content. Amazon Translate
     * translates only the text in the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain - The input data consists of unformatted text. Amazon
     * Translate translates every character in the content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @param contentType <p>
     *            Describes the format of the document. You can specify one of
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            text/html - The input data consists of HTML content. Amazon
     *            Translate translates only the text in the HTML element.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            text/plain - The input data consists of unformatted text.
     *            Amazon Translate translates every character in the content.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Describes the format of the document. You can specify one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/html - The input data consists of HTML content. Amazon Translate
     * translates only the text in the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain - The input data consists of unformatted text. Amazon
     * Translate translates every character in the content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @param contentType <p>
     *            Describes the format of the document. You can specify one of
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            text/html - The input data consists of HTML content. Amazon
     *            Translate translates only the text in the HTML element.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            text/plain - The input data consists of unformatted text.
     *            Amazon Translate translates every character in the content.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withContentType(String contentType) {
        this.contentType = contentType;
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Document == false)
            return false;
        Document other = (Document) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
