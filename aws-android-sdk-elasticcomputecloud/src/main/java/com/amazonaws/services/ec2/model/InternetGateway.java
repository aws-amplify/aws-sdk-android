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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an internet gateway.
 * </p>
 */
public class InternetGateway implements Serializable {
    /**
     * <p>
     * Any VPCs attached to the internet gateway.
     * </p>
     */
    private java.util.List<InternetGatewayAttachment> attachments;

    /**
     * <p>
     * The ID of the internet gateway.
     * </p>
     */
    private String internetGatewayId;

    /**
     * <p>
     * The ID of the AWS account that owns the internet gateway.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Any tags assigned to the internet gateway.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Any VPCs attached to the internet gateway.
     * </p>
     *
     * @return <p>
     *         Any VPCs attached to the internet gateway.
     *         </p>
     */
    public java.util.List<InternetGatewayAttachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * Any VPCs attached to the internet gateway.
     * </p>
     *
     * @param attachments <p>
     *            Any VPCs attached to the internet gateway.
     *            </p>
     */
    public void setAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<InternetGatewayAttachment>(attachments);
    }

    /**
     * <p>
     * Any VPCs attached to the internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Any VPCs attached to the internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InternetGateway withAttachments(InternetGatewayAttachment... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<InternetGatewayAttachment>(
                    attachments.length);
        }
        for (InternetGatewayAttachment value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any VPCs attached to the internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Any VPCs attached to the internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InternetGateway withAttachments(
            java.util.Collection<InternetGatewayAttachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The ID of the internet gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the internet gateway.
     *         </p>
     */
    public String getInternetGatewayId() {
        return internetGatewayId;
    }

    /**
     * <p>
     * The ID of the internet gateway.
     * </p>
     *
     * @param internetGatewayId <p>
     *            The ID of the internet gateway.
     *            </p>
     */
    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }

    /**
     * <p>
     * The ID of the internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param internetGatewayId <p>
     *            The ID of the internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InternetGateway withInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the internet gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the internet gateway.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the internet gateway.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the internet gateway.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InternetGateway withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the internet gateway.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the internet gateway.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the internet gateway.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the internet gateway.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InternetGateway withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InternetGateway withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAttachments() != null)
            sb.append("Attachments: " + getAttachments() + ",");
        if (getInternetGatewayId() != null)
            sb.append("InternetGatewayId: " + getInternetGatewayId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getInternetGatewayId() == null) ? 0 : getInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InternetGateway == false)
            return false;
        InternetGateway other = (InternetGateway) obj;

        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getInternetGatewayId() == null ^ this.getInternetGatewayId() == null)
            return false;
        if (other.getInternetGatewayId() != null
                && other.getInternetGatewayId().equals(this.getInternetGatewayId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
