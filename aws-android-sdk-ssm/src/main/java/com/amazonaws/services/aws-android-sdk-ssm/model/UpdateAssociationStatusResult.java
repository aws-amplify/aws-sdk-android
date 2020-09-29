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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class UpdateAssociationStatusResult implements Serializable {
    /**
     * <p>Information about the association.</p>
     */
    private AssociationDescription associationDescription;

    /**
     * <p>Information about the association.</p>
     *
     * @return <p>Information about the association.</p>
     */
    public AssociationDescription getAssociationDescription() {
        return associationDescription;
    }

    /**
     * <p>Information about the association.</p>
     *
     * @param associationDescription <p>Information about the association.</p>
     */
    public void setAssociationDescription(AssociationDescription associationDescription) {
        this.associationDescription = associationDescription;
    }

    /**
     * <p>Information about the association.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationDescription <p>Information about the association.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateAssociationStatusResult withAssociationDescription(AssociationDescription associationDescription) {
        this.associationDescription = associationDescription;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssociationDescription() != null) sb.append("AssociationDescription: " + getAssociationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationDescription() == null) ? 0 : getAssociationDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAssociationStatusResult == false) return false;
        UpdateAssociationStatusResult other = (UpdateAssociationStatusResult)obj;

        if (other.getAssociationDescription() == null ^ this.getAssociationDescription() == null) return false;
        if (other.getAssociationDescription() != null && other.getAssociationDescription().equals(this.getAssociationDescription()) == false) return false;
        return true;
    }
}
