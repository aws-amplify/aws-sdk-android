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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing a change in state for a task attachment.
 * </p>
 */
public class AttachmentStateChange implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     */
    private String attachmentArn;

    /**
     * <p>
     * The status of the attachment.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the attachment.
     *         </p>
     */
    public String getAttachmentArn() {
        return attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     *
     * @param attachmentArn <p>
     *            The Amazon Resource Name (ARN) of the attachment.
     *            </p>
     */
    public void setAttachmentArn(String attachmentArn) {
        this.attachmentArn = attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentArn <p>
     *            The Amazon Resource Name (ARN) of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentStateChange withAttachmentArn(String attachmentArn) {
        this.attachmentArn = attachmentArn;
        return this;
    }

    /**
     * <p>
     * The status of the attachment.
     * </p>
     *
     * @return <p>
     *         The status of the attachment.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the attachment.
     * </p>
     *
     * @param status <p>
     *            The status of the attachment.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentStateChange withStatus(String status) {
        this.status = status;
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
        if (getAttachmentArn() != null)
            sb.append("attachmentArn: " + getAttachmentArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachmentArn() == null) ? 0 : getAttachmentArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentStateChange == false)
            return false;
        AttachmentStateChange other = (AttachmentStateChange) obj;

        if (other.getAttachmentArn() == null ^ this.getAttachmentArn() == null)
            return false;
        if (other.getAttachmentArn() != null
                && other.getAttachmentArn().equals(this.getAttachmentArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
