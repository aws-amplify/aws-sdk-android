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

package com.amazonaws.services.amazoncodegurureviewer.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a repository association.
 * </p>
 */
public class RepositoryAssociation implements Serializable {
    /**
     * <p>
     * The ID of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String associationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     */
    private String associationArn;

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     */
    private String name;

    /**
     * <p>
     * The owner of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     */
    private String owner;

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub
     */
    private String providerType;

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Associated, Associating, Failed, Disassociating
     */
    private String state;

    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String stateReason;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimeStamp;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was created.
     * </p>
     */
    private java.util.Date createdTimeStamp;

    /**
     * <p>
     * The ID of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The ID of the repository association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param associationId <p>
     *            The ID of the repository association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the repository association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param associationId <p>
     *            The ID of the repository association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryAssociation withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) identifying the repository
     *         association.
     *         </p>
     */
    public String getAssociationArn() {
        return associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     *
     * @param associationArn <p>
     *            The Amazon Resource Name (ARN) identifying the repository
     *            association.
     *            </p>
     */
    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     *
     * @param associationArn <p>
     *            The Amazon Resource Name (ARN) identifying the repository
     *            association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryAssociation withAssociationArn(String associationArn) {
        this.associationArn = associationArn;
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @return <p>
     *         The name of the repository.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param name <p>
     *            The name of the repository.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param name <p>
     *            The name of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryAssociation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The owner of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @return <p>
     *         The owner of the repository.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @param owner <p>
     *            The owner of the repository.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @param owner <p>
     *            The owner of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryAssociation withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub
     *
     * @return <p>
     *         The provider type of the repository association.
     *         </p>
     * @see ProviderType
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub
     *
     * @param providerType <p>
     *            The provider type of the repository association.
     *            </p>
     * @see ProviderType
     */
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub
     *
     * @param providerType <p>
     *            The provider type of the repository association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProviderType
     */
    public RepositoryAssociation withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub
     *
     * @param providerType <p>
     *            The provider type of the repository association.
     *            </p>
     * @see ProviderType
     */
    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub
     *
     * @param providerType <p>
     *            The provider type of the repository association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProviderType
     */
    public RepositoryAssociation withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Associated, Associating, Failed, Disassociating
     *
     * @return <p>
     *         The state of the repository association.
     *         </p>
     * @see RepositoryAssociationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Associated, Associating, Failed, Disassociating
     *
     * @param state <p>
     *            The state of the repository association.
     *            </p>
     * @see RepositoryAssociationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Associated, Associating, Failed, Disassociating
     *
     * @param state <p>
     *            The state of the repository association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RepositoryAssociationState
     */
    public RepositoryAssociation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Associated, Associating, Failed, Disassociating
     *
     * @param state <p>
     *            The state of the repository association.
     *            </p>
     * @see RepositoryAssociationState
     */
    public void setState(RepositoryAssociationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Associated, Associating, Failed, Disassociating
     *
     * @param state <p>
     *            The state of the repository association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RepositoryAssociationState
     */
    public RepositoryAssociation withState(RepositoryAssociationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>
     *         A description of why the repository association is in the current
     *         state.
     *         </p>
     */
    public String getStateReason() {
        return stateReason;
    }

    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param stateReason <p>
     *            A description of why the repository association is in the
     *            current state.
     *            </p>
     */
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param stateReason <p>
     *            A description of why the repository association is in the
     *            current state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryAssociation withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was last updated.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the repository
     *         association was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTimeStamp() {
        return lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was last updated.
     * </p>
     *
     * @param lastUpdatedTimeStamp <p>
     *            The time, in milliseconds since the epoch, when the repository
     *            association was last updated.
     *            </p>
     */
    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimeStamp <p>
     *            The time, in milliseconds since the epoch, when the repository
     *            association was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryAssociation withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was created.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the repository
     *         association was created.
     *         </p>
     */
    public java.util.Date getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was created.
     * </p>
     *
     * @param createdTimeStamp <p>
     *            The time, in milliseconds since the epoch, when the repository
     *            association was created.
     *            </p>
     */
    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository
     * association was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimeStamp <p>
     *            The time, in milliseconds since the epoch, when the repository
     *            association was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryAssociation withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
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
        if (getAssociationArn() != null)
            sb.append("AssociationArn: " + getAssociationArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getProviderType() != null)
            sb.append("ProviderType: " + getProviderType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateReason() != null)
            sb.append("StateReason: " + getStateReason() + ",");
        if (getLastUpdatedTimeStamp() != null)
            sb.append("LastUpdatedTimeStamp: " + getLastUpdatedTimeStamp() + ",");
        if (getCreatedTimeStamp() != null)
            sb.append("CreatedTimeStamp: " + getCreatedTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryAssociation == false)
            return false;
        RepositoryAssociation other = (RepositoryAssociation) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null
                && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null
                && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null
                && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null)
            return false;
        if (other.getLastUpdatedTimeStamp() != null
                && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false)
            return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null)
            return false;
        if (other.getCreatedTimeStamp() != null
                && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false)
            return false;
        return true;
    }
}
