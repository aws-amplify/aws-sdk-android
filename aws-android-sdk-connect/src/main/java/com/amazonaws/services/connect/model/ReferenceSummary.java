/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains summary information about a reference. <code>ReferenceSummary</code>
 * contains only one non null field between the URL and attachment based on the
 * reference type.
 * </p>
 */
public class ReferenceSummary implements Serializable {
    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null.
     * </p>
     */
    private UrlReference url;

    /**
     * <p>
     * Information about the attachment reference if the
     * <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     */
    private AttachmentReference attachment;

    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null.
     * </p>
     *
     * @return <p>
     *         Information about the URL reference if the
     *         <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     *         </p>
     */
    public UrlReference getUrl() {
        return url;
    }

    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null.
     * </p>
     *
     * @param url <p>
     *            Information about the URL reference if the
     *            <code>referenceType</code> is <code>URL</code>. Otherwise,
     *            null.
     *            </p>
     */
    public void setUrl(UrlReference url) {
        this.url = url;
    }

    /**
     * <p>
     * Information about the URL reference if the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            Information about the URL reference if the
     *            <code>referenceType</code> is <code>URL</code>. Otherwise,
     *            null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReferenceSummary withUrl(UrlReference url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * Information about the attachment reference if the
     * <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     *
     * @return <p>
     *         Information about the attachment reference if the
     *         <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise,
     *         null.
     *         </p>
     */
    public AttachmentReference getAttachment() {
        return attachment;
    }

    /**
     * <p>
     * Information about the attachment reference if the
     * <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     *
     * @param attachment <p>
     *            Information about the attachment reference if the
     *            <code>referenceType</code> is <code>ATTACHMENT</code>.
     *            Otherwise, null.
     *            </p>
     */
    public void setAttachment(AttachmentReference attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Information about the attachment reference if the
     * <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachment <p>
     *            Information about the attachment reference if the
     *            <code>referenceType</code> is <code>ATTACHMENT</code>.
     *            Otherwise, null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReferenceSummary withAttachment(AttachmentReference attachment) {
        this.attachment = attachment;
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
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getAttachment() != null)
            sb.append("Attachment: " + getAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceSummary == false)
            return false;
        ReferenceSummary other = (ReferenceSummary) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null
                && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        return true;
    }
}
