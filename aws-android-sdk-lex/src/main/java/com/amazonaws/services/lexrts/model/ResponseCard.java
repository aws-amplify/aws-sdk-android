/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

/**
 * <p>
 * If you configure a response card when creating your bots, Amazon Lex
 * substitutes the session attributes and slot values that are available, and
 * then returns it. The response card can also come from a Lambda function (
 * <code>dialogCodeHook</code> and <code>fulfillmentActivity</code> on an
 * intent).
 * </p>
 */
public class ResponseCard implements Serializable {
    /**
     * <p>
     * The version of the response card format.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The content type of the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/vnd.amazonaws.card.generic
     */
    private String contentType;

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     */
    private java.util.List<GenericAttachment> genericAttachments;

    /**
     * <p>
     * The version of the response card format.
     * </p>
     *
     * @return <p>
     *         The version of the response card format.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the response card format.
     * </p>
     *
     * @param version <p>
     *            The version of the response card format.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the response card format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the response card format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResponseCard withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/vnd.amazonaws.card.generic
     *
     * @return <p>
     *         The content type of the response.
     *         </p>
     * @see ContentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/vnd.amazonaws.card.generic
     *
     * @param contentType <p>
     *            The content type of the response.
     *            </p>
     * @see ContentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/vnd.amazonaws.card.generic
     *
     * @param contentType <p>
     *            The content type of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentType
     */
    public ResponseCard withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/vnd.amazonaws.card.generic
     *
     * @param contentType <p>
     *            The content type of the response.
     *            </p>
     * @see ContentType
     */
    public void setContentType(ContentType contentType) {
        this.contentType = contentType.toString();
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/vnd.amazonaws.card.generic
     *
     * @param contentType <p>
     *            The content type of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentType
     */
    public ResponseCard withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     *
     * @return <p>
     *         An array of attachment objects representing options.
     *         </p>
     */
    public java.util.List<GenericAttachment> getGenericAttachments() {
        return genericAttachments;
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     *
     * @param genericAttachments <p>
     *            An array of attachment objects representing options.
     *            </p>
     */
    public void setGenericAttachments(java.util.Collection<GenericAttachment> genericAttachments) {
        if (genericAttachments == null) {
            this.genericAttachments = null;
            return;
        }

        this.genericAttachments = new java.util.ArrayList<GenericAttachment>(genericAttachments);
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param genericAttachments <p>
     *            An array of attachment objects representing options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResponseCard withGenericAttachments(GenericAttachment... genericAttachments) {
        if (getGenericAttachments() == null) {
            this.genericAttachments = new java.util.ArrayList<GenericAttachment>(
                    genericAttachments.length);
        }
        for (GenericAttachment value : genericAttachments) {
            this.genericAttachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param genericAttachments <p>
     *            An array of attachment objects representing options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResponseCard withGenericAttachments(
            java.util.Collection<GenericAttachment> genericAttachments) {
        setGenericAttachments(genericAttachments);
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
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getContentType() != null)
            sb.append("contentType: " + getContentType() + ",");
        if (getGenericAttachments() != null)
            sb.append("genericAttachments: " + getGenericAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getGenericAttachments() == null) ? 0 : getGenericAttachments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseCard == false)
            return false;
        ResponseCard other = (ResponseCard) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getGenericAttachments() == null ^ this.getGenericAttachments() == null)
            return false;
        if (other.getGenericAttachments() != null
                && other.getGenericAttachments().equals(this.getGenericAttachments()) == false)
            return false;
        return true;
    }
}
