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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Replaces an IAM instance profile for the specified running instance. You can
 * use this action to change the IAM instance profile that's associated with an
 * instance without having to disassociate the existing IAM instance profile
 * first.
 * </p>
 * <p>
 * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association ID.
 * </p>
 */
public class ReplaceIamInstanceProfileAssociationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private IamInstanceProfileSpecification iamInstanceProfile;

    /**
     * <p>
     * The ID of the existing IAM instance profile association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     *
     * @return <p>
     *         The IAM instance profile.
     *         </p>
     */
    public IamInstanceProfileSpecification getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     *
     * @param iamInstanceProfile <p>
     *            The IAM instance profile.
     *            </p>
     */
    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamInstanceProfile <p>
     *            The IAM instance profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplaceIamInstanceProfileAssociationRequest withIamInstanceProfile(
            IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * The ID of the existing IAM instance profile association.
     * </p>
     *
     * @return <p>
     *         The ID of the existing IAM instance profile association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID of the existing IAM instance profile association.
     * </p>
     *
     * @param associationId <p>
     *            The ID of the existing IAM instance profile association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the existing IAM instance profile association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The ID of the existing IAM instance profile association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplaceIamInstanceProfileAssociationRequest withAssociationId(String associationId) {
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
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
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
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
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

        if (obj instanceof ReplaceIamInstanceProfileAssociationRequest == false)
            return false;
        ReplaceIamInstanceProfileAssociationRequest other = (ReplaceIamInstanceProfileAssociationRequest) obj;

        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }
}
