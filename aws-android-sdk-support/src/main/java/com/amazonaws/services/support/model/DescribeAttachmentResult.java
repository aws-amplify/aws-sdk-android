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
 * The content and file name of the attachment returned by the
 * <a>DescribeAttachment</a> operation.
 * </p>
 */
public class DescribeAttachmentResult implements Serializable {
    /**
     * <p>
     * This object includes the attachment content and file name.
     * </p>
     * <p>
     * In the previous response syntax, the value for the <code>data</code>
     * parameter appears as <code>blob</code>, which is represented as a
     * base64-encoded string. The value for <code>fileName</code> is the name of
     * the attachment, such as <code>troubleshoot-screenshot.png</code>.
     * </p>
     */
    private Attachment attachment;

    /**
     * <p>
     * This object includes the attachment content and file name.
     * </p>
     * <p>
     * In the previous response syntax, the value for the <code>data</code>
     * parameter appears as <code>blob</code>, which is represented as a
     * base64-encoded string. The value for <code>fileName</code> is the name of
     * the attachment, such as <code>troubleshoot-screenshot.png</code>.
     * </p>
     *
     * @return <p>
     *         This object includes the attachment content and file name.
     *         </p>
     *         <p>
     *         In the previous response syntax, the value for the
     *         <code>data</code> parameter appears as <code>blob</code>, which
     *         is represented as a base64-encoded string. The value for
     *         <code>fileName</code> is the name of the attachment, such as
     *         <code>troubleshoot-screenshot.png</code>.
     *         </p>
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * <p>
     * This object includes the attachment content and file name.
     * </p>
     * <p>
     * In the previous response syntax, the value for the <code>data</code>
     * parameter appears as <code>blob</code>, which is represented as a
     * base64-encoded string. The value for <code>fileName</code> is the name of
     * the attachment, such as <code>troubleshoot-screenshot.png</code>.
     * </p>
     *
     * @param attachment <p>
     *            This object includes the attachment content and file name.
     *            </p>
     *            <p>
     *            In the previous response syntax, the value for the
     *            <code>data</code> parameter appears as <code>blob</code>,
     *            which is represented as a base64-encoded string. The value for
     *            <code>fileName</code> is the name of the attachment, such as
     *            <code>troubleshoot-screenshot.png</code>.
     *            </p>
     */
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * This object includes the attachment content and file name.
     * </p>
     * <p>
     * In the previous response syntax, the value for the <code>data</code>
     * parameter appears as <code>blob</code>, which is represented as a
     * base64-encoded string. The value for <code>fileName</code> is the name of
     * the attachment, such as <code>troubleshoot-screenshot.png</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachment <p>
     *            This object includes the attachment content and file name.
     *            </p>
     *            <p>
     *            In the previous response syntax, the value for the
     *            <code>data</code> parameter appears as <code>blob</code>,
     *            which is represented as a base64-encoded string. The value for
     *            <code>fileName</code> is the name of the attachment, such as
     *            <code>troubleshoot-screenshot.png</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAttachmentResult withAttachment(Attachment attachment) {
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
        if (getAttachment() != null)
            sb.append("attachment: " + getAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAttachmentResult == false)
            return false;
        DescribeAttachmentResult other = (DescribeAttachmentResult) obj;

        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null
                && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        return true;
    }
}
