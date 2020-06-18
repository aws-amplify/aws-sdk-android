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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds one or more attachments to an attachment set.
 * </p>
 * <p>
 * An attachment set is a temporary container for attachments that you add to a
 * case or case communication. The set is available for 1 hour after it's
 * created. The <code>expiryTime</code> returned in the response is when the set
 * expires.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise support plan to use the AWS Support
 * API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the AWS Support API from an account that does not have a Business
 * or Enterprise support plan, the <code>SubscriptionRequiredException</code>
 * error message appears. For information about changing your support plan, see
 * <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class AddAttachmentsToSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     */
    private String attachmentSetId;

    /**
     * <p>
     * One or more attachments to add to the set. You can add up to three
     * attachments per set. The size limit is 5 MB per attachment.
     * </p>
     * <p>
     * In the <code>Attachment</code> object, use the <code>data</code>
     * parameter to specify the contents of the attachment file. In the previous
     * request syntax, the value for <code>data</code> appear as
     * <code>blob</code>, which is represented as a base64-encoded string. The
     * value for <code>fileName</code> is the name of the attachment, such as
     * <code>troubleshoot-screenshot.png</code>.
     * </p>
     */
    private java.util.List<Attachment> attachments;

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     *
     * @return <p>
     *         The ID of the attachment set. If an <code>attachmentSetId</code>
     *         is not specified, a new attachment set is created, and the ID of
     *         the set is returned in the response. If an
     *         <code>attachmentSetId</code> is specified, the attachments are
     *         added to the specified set, if it exists.
     *         </p>
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     *
     * @param attachmentSetId <p>
     *            The ID of the attachment set. If an
     *            <code>attachmentSetId</code> is not specified, a new
     *            attachment set is created, and the ID of the set is returned
     *            in the response. If an <code>attachmentSetId</code> is
     *            specified, the attachments are added to the specified set, if
     *            it exists.
     *            </p>
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not
     * specified, a new attachment set is created, and the ID of the set is
     * returned in the response. If an <code>attachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it exists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentSetId <p>
     *            The ID of the attachment set. If an
     *            <code>attachmentSetId</code> is not specified, a new
     *            attachment set is created, and the ID of the set is returned
     *            in the response. If an <code>attachmentSetId</code> is
     *            specified, the attachments are added to the specified set, if
     *            it exists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddAttachmentsToSetRequest withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
        return this;
    }

    /**
     * <p>
     * One or more attachments to add to the set. You can add up to three
     * attachments per set. The size limit is 5 MB per attachment.
     * </p>
     * <p>
     * In the <code>Attachment</code> object, use the <code>data</code>
     * parameter to specify the contents of the attachment file. In the previous
     * request syntax, the value for <code>data</code> appear as
     * <code>blob</code>, which is represented as a base64-encoded string. The
     * value for <code>fileName</code> is the name of the attachment, such as
     * <code>troubleshoot-screenshot.png</code>.
     * </p>
     *
     * @return <p>
     *         One or more attachments to add to the set. You can add up to
     *         three attachments per set. The size limit is 5 MB per attachment.
     *         </p>
     *         <p>
     *         In the <code>Attachment</code> object, use the <code>data</code>
     *         parameter to specify the contents of the attachment file. In the
     *         previous request syntax, the value for <code>data</code> appear
     *         as <code>blob</code>, which is represented as a base64-encoded
     *         string. The value for <code>fileName</code> is the name of the
     *         attachment, such as <code>troubleshoot-screenshot.png</code>.
     *         </p>
     */
    public java.util.List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * One or more attachments to add to the set. You can add up to three
     * attachments per set. The size limit is 5 MB per attachment.
     * </p>
     * <p>
     * In the <code>Attachment</code> object, use the <code>data</code>
     * parameter to specify the contents of the attachment file. In the previous
     * request syntax, the value for <code>data</code> appear as
     * <code>blob</code>, which is represented as a base64-encoded string. The
     * value for <code>fileName</code> is the name of the attachment, such as
     * <code>troubleshoot-screenshot.png</code>.
     * </p>
     *
     * @param attachments <p>
     *            One or more attachments to add to the set. You can add up to
     *            three attachments per set. The size limit is 5 MB per
     *            attachment.
     *            </p>
     *            <p>
     *            In the <code>Attachment</code> object, use the
     *            <code>data</code> parameter to specify the contents of the
     *            attachment file. In the previous request syntax, the value for
     *            <code>data</code> appear as <code>blob</code>, which is
     *            represented as a base64-encoded string. The value for
     *            <code>fileName</code> is the name of the attachment, such as
     *            <code>troubleshoot-screenshot.png</code>.
     *            </p>
     */
    public void setAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<Attachment>(attachments);
    }

    /**
     * <p>
     * One or more attachments to add to the set. You can add up to three
     * attachments per set. The size limit is 5 MB per attachment.
     * </p>
     * <p>
     * In the <code>Attachment</code> object, use the <code>data</code>
     * parameter to specify the contents of the attachment file. In the previous
     * request syntax, the value for <code>data</code> appear as
     * <code>blob</code>, which is represented as a base64-encoded string. The
     * value for <code>fileName</code> is the name of the attachment, such as
     * <code>troubleshoot-screenshot.png</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            One or more attachments to add to the set. You can add up to
     *            three attachments per set. The size limit is 5 MB per
     *            attachment.
     *            </p>
     *            <p>
     *            In the <code>Attachment</code> object, use the
     *            <code>data</code> parameter to specify the contents of the
     *            attachment file. In the previous request syntax, the value for
     *            <code>data</code> appear as <code>blob</code>, which is
     *            represented as a base64-encoded string. The value for
     *            <code>fileName</code> is the name of the attachment, such as
     *            <code>troubleshoot-screenshot.png</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddAttachmentsToSetRequest withAttachments(Attachment... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<Attachment>(attachments.length);
        }
        for (Attachment value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more attachments to add to the set. You can add up to three
     * attachments per set. The size limit is 5 MB per attachment.
     * </p>
     * <p>
     * In the <code>Attachment</code> object, use the <code>data</code>
     * parameter to specify the contents of the attachment file. In the previous
     * request syntax, the value for <code>data</code> appear as
     * <code>blob</code>, which is represented as a base64-encoded string. The
     * value for <code>fileName</code> is the name of the attachment, such as
     * <code>troubleshoot-screenshot.png</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            One or more attachments to add to the set. You can add up to
     *            three attachments per set. The size limit is 5 MB per
     *            attachment.
     *            </p>
     *            <p>
     *            In the <code>Attachment</code> object, use the
     *            <code>data</code> parameter to specify the contents of the
     *            attachment file. In the previous request syntax, the value for
     *            <code>data</code> appear as <code>blob</code>, which is
     *            represented as a base64-encoded string. The value for
     *            <code>fileName</code> is the name of the attachment, such as
     *            <code>troubleshoot-screenshot.png</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddAttachmentsToSetRequest withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
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
        if (getAttachments() != null)
            sb.append("attachments: " + getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddAttachmentsToSetRequest == false)
            return false;
        AddAttachmentsToSetRequest other = (AddAttachmentsToSetRequest) obj;

        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null)
            return false;
        if (other.getAttachmentSetId() != null
                && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }
}
