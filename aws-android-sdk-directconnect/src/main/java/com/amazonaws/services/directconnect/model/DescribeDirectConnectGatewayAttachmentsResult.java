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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class DescribeDirectConnectGatewayAttachmentsResult implements Serializable {
    /**
     * <p>
     * The attachments.
     * </p>
     */
    private java.util.List<DirectConnectGatewayAttachment> directConnectGatewayAttachments;

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The attachments.
     * </p>
     *
     * @return <p>
     *         The attachments.
     *         </p>
     */
    public java.util.List<DirectConnectGatewayAttachment> getDirectConnectGatewayAttachments() {
        return directConnectGatewayAttachments;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     *
     * @param directConnectGatewayAttachments <p>
     *            The attachments.
     *            </p>
     */
    public void setDirectConnectGatewayAttachments(
            java.util.Collection<DirectConnectGatewayAttachment> directConnectGatewayAttachments) {
        if (directConnectGatewayAttachments == null) {
            this.directConnectGatewayAttachments = null;
            return;
        }

        this.directConnectGatewayAttachments = new java.util.ArrayList<DirectConnectGatewayAttachment>(
                directConnectGatewayAttachments);
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAttachments <p>
     *            The attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAttachmentsResult withDirectConnectGatewayAttachments(
            DirectConnectGatewayAttachment... directConnectGatewayAttachments) {
        if (getDirectConnectGatewayAttachments() == null) {
            this.directConnectGatewayAttachments = new java.util.ArrayList<DirectConnectGatewayAttachment>(
                    directConnectGatewayAttachments.length);
        }
        for (DirectConnectGatewayAttachment value : directConnectGatewayAttachments) {
            this.directConnectGatewayAttachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAttachments <p>
     *            The attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAttachmentsResult withDirectConnectGatewayAttachments(
            java.util.Collection<DirectConnectGatewayAttachment> directConnectGatewayAttachments) {
        setDirectConnectGatewayAttachments(directConnectGatewayAttachments);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAttachmentsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDirectConnectGatewayAttachments() != null)
            sb.append("directConnectGatewayAttachments: " + getDirectConnectGatewayAttachments()
                    + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayAttachments() == null) ? 0
                        : getDirectConnectGatewayAttachments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAttachmentsResult == false)
            return false;
        DescribeDirectConnectGatewayAttachmentsResult other = (DescribeDirectConnectGatewayAttachmentsResult) obj;

        if (other.getDirectConnectGatewayAttachments() == null
                ^ this.getDirectConnectGatewayAttachments() == null)
            return false;
        if (other.getDirectConnectGatewayAttachments() != null
                && other.getDirectConnectGatewayAttachments().equals(
                        this.getDirectConnectGatewayAttachments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
