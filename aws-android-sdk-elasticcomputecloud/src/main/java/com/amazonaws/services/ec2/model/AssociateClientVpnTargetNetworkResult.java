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

public class AssociateClientVpnTargetNetworkResult implements Serializable {
    /**
     * <p>
     * The unique ID of the target network association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     */
    private AssociationStatus status;

    /**
     * <p>
     * The unique ID of the target network association.
     * </p>
     *
     * @return <p>
     *         The unique ID of the target network association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The unique ID of the target network association.
     * </p>
     *
     * @param associationId <p>
     *            The unique ID of the target network association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The unique ID of the target network association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The unique ID of the target network association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateClientVpnTargetNetworkResult withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     *
     * @return <p>
     *         The current state of the target network association.
     *         </p>
     */
    public AssociationStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     *
     * @param status <p>
     *            The current state of the target network association.
     *            </p>
     */
    public void setStatus(AssociationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the target network association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateClientVpnTargetNetworkResult withStatus(AssociationStatus status) {
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateClientVpnTargetNetworkResult == false)
            return false;
        AssociateClientVpnTargetNetworkResult other = (AssociateClientVpnTargetNetworkResult) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
