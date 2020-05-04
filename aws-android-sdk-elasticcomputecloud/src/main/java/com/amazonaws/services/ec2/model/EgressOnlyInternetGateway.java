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
 * Describes an egress-only internet gateway.
 * </p>
 */
public class EgressOnlyInternetGateway implements Serializable {
    /**
     * <p>
     * Information about the attachment of the egress-only internet gateway.
     * </p>
     */
    private java.util.List<InternetGatewayAttachment> attachments;

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;

    /**
     * <p>
     * The tags assigned to the egress-only internet gateway.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Information about the attachment of the egress-only internet gateway.
     * </p>
     *
     * @return <p>
     *         Information about the attachment of the egress-only internet
     *         gateway.
     *         </p>
     */
    public java.util.List<InternetGatewayAttachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * Information about the attachment of the egress-only internet gateway.
     * </p>
     *
     * @param attachments <p>
     *            Information about the attachment of the egress-only internet
     *            gateway.
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
     * Information about the attachment of the egress-only internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Information about the attachment of the egress-only internet
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EgressOnlyInternetGateway withAttachments(InternetGatewayAttachment... attachments) {
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
     * Information about the attachment of the egress-only internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Information about the attachment of the egress-only internet
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EgressOnlyInternetGateway withAttachments(
            java.util.Collection<InternetGatewayAttachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the egress-only internet gateway.
     *         </p>
     */
    public String getEgressOnlyInternetGatewayId() {
        return egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     *
     * @param egressOnlyInternetGatewayId <p>
     *            The ID of the egress-only internet gateway.
     *            </p>
     */
    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egressOnlyInternetGatewayId <p>
     *            The ID of the egress-only internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EgressOnlyInternetGateway withEgressOnlyInternetGatewayId(
            String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the egress-only internet gateway.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the egress-only internet gateway.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the egress-only internet gateway.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the egress-only internet gateway.
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
     * The tags assigned to the egress-only internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the egress-only internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EgressOnlyInternetGateway withTags(Tag... tags) {
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
     * The tags assigned to the egress-only internet gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the egress-only internet gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EgressOnlyInternetGateway withTags(java.util.Collection<Tag> tags) {
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
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: " + getEgressOnlyInternetGatewayId() + ",");
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
        hashCode = prime
                * hashCode
                + ((getEgressOnlyInternetGatewayId() == null) ? 0
                        : getEgressOnlyInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EgressOnlyInternetGateway == false)
            return false;
        EgressOnlyInternetGateway other = (EgressOnlyInternetGateway) obj;

        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getEgressOnlyInternetGatewayId() == null
                ^ this.getEgressOnlyInternetGatewayId() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayId() != null
                && other.getEgressOnlyInternetGatewayId().equals(
                        this.getEgressOnlyInternetGatewayId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
