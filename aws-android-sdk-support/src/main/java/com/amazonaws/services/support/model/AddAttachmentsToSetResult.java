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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The ID and expiry time of the attachment set returned by the
 * <a>AddAttachmentsToSet</a> operation.
 * </p>
 */
public class AddAttachmentsToSetResult implements Serializable {
    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> was
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     */
    private String attachmentSetId;

    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     */
    private String expiryTime;

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> was
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     *
     * @return <p>
     *         The ID of the attachment set. If an <code>attachmentSetId</code>
     *         was not specified, a new attachment set is created, and the ID of
     *         the set is returned in the response. If an
     *         <code>attachmentSetId</code> was specified, the attachments are
     *         added to the specified set, if it exists.
     *         </p>
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> was
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     *
     * @param attachmentSetId <p>
     *            The ID of the attachment set. If an
     *            <code>attachmentSetId</code> was not specified, a new
     *            attachment set is created, and the ID of the set is returned
     *            in the response. If an <code>attachmentSetId</code> was
     *            specified, the attachments are added to the specified set, if
     *            it exists.
     *            </p>
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> was
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentSetId <p>
     *            The ID of the attachment set. If an
     *            <code>attachmentSetId</code> was not specified, a new
     *            attachment set is created, and the ID of the set is returned
     *            in the response. If an <code>attachmentSetId</code> was
     *            specified, the attachments are added to the specified set, if
     *            it exists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddAttachmentsToSetResult withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
        return this;
    }

    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     *
     * @return <p>
     *         The time and date when the attachment set expires.
     *         </p>
     */
    public String getExpiryTime() {
        return expiryTime;
    }

    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     *
     * @param expiryTime <p>
     *            The time and date when the attachment set expires.
     *            </p>
     */
    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiryTime <p>
     *            The time and date when the attachment set expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddAttachmentsToSetResult withExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
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
        if (getAttachmentSetId() != null)
            sb.append("attachmentSetId: " + getAttachmentSetId() + ",");
        if (getExpiryTime() != null)
            sb.append("expiryTime: " + getExpiryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddAttachmentsToSetResult == false)
            return false;
        AddAttachmentsToSetResult other = (AddAttachmentsToSetResult) obj;

        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null)
            return false;
        if (other.getAttachmentSetId() != null
                && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null
                && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        return true;
    }
}
