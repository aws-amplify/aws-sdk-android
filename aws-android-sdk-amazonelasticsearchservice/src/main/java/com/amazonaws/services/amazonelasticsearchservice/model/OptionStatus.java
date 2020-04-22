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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the current status of the entity.
 * </p>
 */
public class OptionStatus implements Serializable {
    /**
     * <p>
     * Timestamp which tells the creation date for the entity.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Timestamp which tells the last updated time for the entity.
     * </p>
     */
    private java.util.Date updateDate;

    /**
     * <p>
     * Specifies the latest version for the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer updateVersion;

    /**
     * <p>
     * Provides the <code>OptionState</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     */
    private String state;

    /**
     * <p>
     * Indicates whether the Elasticsearch domain is being deleted.
     * </p>
     */
    private Boolean pendingDeletion;

    /**
     * <p>
     * Timestamp which tells the creation date for the entity.
     * </p>
     *
     * @return <p>
     *         Timestamp which tells the creation date for the entity.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * Timestamp which tells the creation date for the entity.
     * </p>
     *
     * @param creationDate <p>
     *            Timestamp which tells the creation date for the entity.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * Timestamp which tells the creation date for the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            Timestamp which tells the creation date for the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionStatus withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * Timestamp which tells the last updated time for the entity.
     * </p>
     *
     * @return <p>
     *         Timestamp which tells the last updated time for the entity.
     *         </p>
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }

    /**
     * <p>
     * Timestamp which tells the last updated time for the entity.
     * </p>
     *
     * @param updateDate <p>
     *            Timestamp which tells the last updated time for the entity.
     *            </p>
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * Timestamp which tells the last updated time for the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDate <p>
     *            Timestamp which tells the last updated time for the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionStatus withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * <p>
     * Specifies the latest version for the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Specifies the latest version for the entity.
     *         </p>
     */
    public Integer getUpdateVersion() {
        return updateVersion;
    }

    /**
     * <p>
     * Specifies the latest version for the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param updateVersion <p>
     *            Specifies the latest version for the entity.
     *            </p>
     */
    public void setUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
    }

    /**
     * <p>
     * Specifies the latest version for the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param updateVersion <p>
     *            Specifies the latest version for the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionStatus withUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
        return this;
    }

    /**
     * <p>
     * Provides the <code>OptionState</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @return <p>
     *         Provides the <code>OptionState</code> for the Elasticsearch
     *         domain.
     *         </p>
     * @see OptionState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * Provides the <code>OptionState</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state <p>
     *            Provides the <code>OptionState</code> for the Elasticsearch
     *            domain.
     *            </p>
     * @see OptionState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Provides the <code>OptionState</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state <p>
     *            Provides the <code>OptionState</code> for the Elasticsearch
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OptionState
     */
    public OptionStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Provides the <code>OptionState</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state <p>
     *            Provides the <code>OptionState</code> for the Elasticsearch
     *            domain.
     *            </p>
     * @see OptionState
     */
    public void setState(OptionState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * Provides the <code>OptionState</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state <p>
     *            Provides the <code>OptionState</code> for the Elasticsearch
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OptionState
     */
    public OptionStatus withState(OptionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the Elasticsearch domain is being deleted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Elasticsearch domain is being deleted.
     *         </p>
     */
    public Boolean isPendingDeletion() {
        return pendingDeletion;
    }

    /**
     * <p>
     * Indicates whether the Elasticsearch domain is being deleted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Elasticsearch domain is being deleted.
     *         </p>
     */
    public Boolean getPendingDeletion() {
        return pendingDeletion;
    }

    /**
     * <p>
     * Indicates whether the Elasticsearch domain is being deleted.
     * </p>
     *
     * @param pendingDeletion <p>
     *            Indicates whether the Elasticsearch domain is being deleted.
     *            </p>
     */
    public void setPendingDeletion(Boolean pendingDeletion) {
        this.pendingDeletion = pendingDeletion;
    }

    /**
     * <p>
     * Indicates whether the Elasticsearch domain is being deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingDeletion <p>
     *            Indicates whether the Elasticsearch domain is being deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionStatus withPendingDeletion(Boolean pendingDeletion) {
        this.pendingDeletion = pendingDeletion;
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
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: " + getUpdateDate() + ",");
        if (getUpdateVersion() != null)
            sb.append("UpdateVersion: " + getUpdateVersion() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getPendingDeletion() != null)
            sb.append("PendingDeletion: " + getPendingDeletion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateVersion() == null) ? 0 : getUpdateVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getPendingDeletion() == null) ? 0 : getPendingDeletion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionStatus == false)
            return false;
        OptionStatus other = (OptionStatus) obj;

        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null
                && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        if (other.getUpdateVersion() == null ^ this.getUpdateVersion() == null)
            return false;
        if (other.getUpdateVersion() != null
                && other.getUpdateVersion().equals(this.getUpdateVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPendingDeletion() == null ^ this.getPendingDeletion() == null)
            return false;
        if (other.getPendingDeletion() != null
                && other.getPendingDeletion().equals(this.getPendingDeletion()) == false)
            return false;
        return true;
    }
}
