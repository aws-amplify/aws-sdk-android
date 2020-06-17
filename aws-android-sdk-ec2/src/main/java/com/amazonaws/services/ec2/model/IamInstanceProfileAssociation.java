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
 * Describes an association between an IAM instance profile and an instance.
 * </p>
 */
public class IamInstanceProfileAssociation implements Serializable {
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private IamInstanceProfile iamInstanceProfile;

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     */
    private String state;

    /**
     * <p>
     * The time the IAM instance profile was associated with the instance.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @return <p>
     *         The ID of the association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @param associationId <p>
     *            The ID of the association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The ID of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IamInstanceProfileAssociation withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IamInstanceProfileAssociation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     *
     * @return <p>
     *         The IAM instance profile.
     *         </p>
     */
    public IamInstanceProfile getIamInstanceProfile() {
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
    public void setIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
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
    public IamInstanceProfileAssociation withIamInstanceProfile(
            IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @return <p>
     *         The state of the association.
     *         </p>
     * @see IamInstanceProfileAssociationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @see IamInstanceProfileAssociationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IamInstanceProfileAssociationState
     */
    public IamInstanceProfileAssociation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @see IamInstanceProfileAssociationState
     */
    public void setState(IamInstanceProfileAssociationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IamInstanceProfileAssociationState
     */
    public IamInstanceProfileAssociation withState(IamInstanceProfileAssociationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time the IAM instance profile was associated with the instance.
     * </p>
     *
     * @return <p>
     *         The time the IAM instance profile was associated with the
     *         instance.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time the IAM instance profile was associated with the instance.
     * </p>
     *
     * @param timestamp <p>
     *            The time the IAM instance profile was associated with the
     *            instance.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the IAM instance profile was associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time the IAM instance profile was associated with the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IamInstanceProfileAssociation withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IamInstanceProfileAssociation == false)
            return false;
        IamInstanceProfileAssociation other = (IamInstanceProfileAssociation) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
