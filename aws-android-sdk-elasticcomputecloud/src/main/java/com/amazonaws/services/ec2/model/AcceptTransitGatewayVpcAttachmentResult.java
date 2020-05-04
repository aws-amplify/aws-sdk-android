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

public class AcceptTransitGatewayVpcAttachmentResult implements Serializable {
    /**
     * <p>
     * The VPC attachment.
     * </p>
     */
    private TransitGatewayVpcAttachment transitGatewayVpcAttachment;

    /**
     * <p>
     * The VPC attachment.
     * </p>
     *
     * @return <p>
     *         The VPC attachment.
     *         </p>
     */
    public TransitGatewayVpcAttachment getTransitGatewayVpcAttachment() {
        return transitGatewayVpcAttachment;
    }

    /**
     * <p>
     * The VPC attachment.
     * </p>
     *
     * @param transitGatewayVpcAttachment <p>
     *            The VPC attachment.
     *            </p>
     */
    public void setTransitGatewayVpcAttachment(
            TransitGatewayVpcAttachment transitGatewayVpcAttachment) {
        this.transitGatewayVpcAttachment = transitGatewayVpcAttachment;
    }

    /**
     * <p>
     * The VPC attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayVpcAttachment <p>
     *            The VPC attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptTransitGatewayVpcAttachmentResult withTransitGatewayVpcAttachment(
            TransitGatewayVpcAttachment transitGatewayVpcAttachment) {
        this.transitGatewayVpcAttachment = transitGatewayVpcAttachment;
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
        if (getTransitGatewayVpcAttachment() != null)
            sb.append("TransitGatewayVpcAttachment: " + getTransitGatewayVpcAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayVpcAttachment() == null) ? 0
                        : getTransitGatewayVpcAttachment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptTransitGatewayVpcAttachmentResult == false)
            return false;
        AcceptTransitGatewayVpcAttachmentResult other = (AcceptTransitGatewayVpcAttachmentResult) obj;

        if (other.getTransitGatewayVpcAttachment() == null
                ^ this.getTransitGatewayVpcAttachment() == null)
            return false;
        if (other.getTransitGatewayVpcAttachment() != null
                && other.getTransitGatewayVpcAttachment().equals(
                        this.getTransitGatewayVpcAttachment()) == false)
            return false;
        return true;
    }
}
