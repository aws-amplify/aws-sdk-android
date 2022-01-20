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

public class AssociateSecurityKeyResult implements Serializable {
    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String associationId;

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The existing association identifier that uniquely identifies the
     *         resource type and storage config for the given instance ID.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param associationId <p>
     *            The existing association identifier that uniquely identifies
     *            the resource type and storage config for the given instance
     *            ID.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param associationId <p>
     *            The existing association identifier that uniquely identifies
     *            the resource type and storage config for the given instance
     *            ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSecurityKeyResult withAssociationId(String associationId) {
        this.associationId = associationId;
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
            sb.append("AssociationId: " + getAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSecurityKeyResult == false)
            return false;
        AssociateSecurityKeyResult other = (AssociateSecurityKeyResult) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }
}
