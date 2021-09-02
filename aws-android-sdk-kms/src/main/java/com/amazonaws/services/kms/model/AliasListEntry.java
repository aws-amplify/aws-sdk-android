/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an alias.
 * </p>
 */
public class AliasListEntry implements Serializable {
    /**
     * <p>
     * String that contains the alias. This value begins with
     * <code>alias/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aliasArn;

    /**
     * <p>
     * String that contains the key identifier of the KMS key associated with
     * the alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String targetKeyId;

    /**
     * <p>
     * Date and time that the alias was most recently created in the account and
     * Region. Formatted as Unix time.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Date and time that the alias was most recently associated with a KMS key
     * in the account and Region. Formatted as Unix time.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * String that contains the alias. This value begins with
     * <code>alias/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         String that contains the alias. This value begins with
     *         <code>alias/</code>.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * String that contains the alias. This value begins with
     * <code>alias/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            String that contains the alias. This value begins with
     *            <code>alias/</code>.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * String that contains the alias. This value begins with
     * <code>alias/</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            String that contains the alias. This value begins with
     *            <code>alias/</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AliasListEntry withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         String that contains the key ARN.
     *         </p>
     */
    public String getAliasArn() {
        return aliasArn;
    }

    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aliasArn <p>
     *            String that contains the key ARN.
     *            </p>
     */
    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }

    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aliasArn <p>
     *            String that contains the key ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AliasListEntry withAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
        return this;
    }

    /**
     * <p>
     * String that contains the key identifier of the KMS key associated with
     * the alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         String that contains the key identifier of the KMS key associated
     *         with the alias.
     *         </p>
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    /**
     * <p>
     * String that contains the key identifier of the KMS key associated with
     * the alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            String that contains the key identifier of the KMS key
     *            associated with the alias.
     *            </p>
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * String that contains the key identifier of the KMS key associated with
     * the alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            String that contains the key identifier of the KMS key
     *            associated with the alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AliasListEntry withTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
        return this;
    }

    /**
     * <p>
     * Date and time that the alias was most recently created in the account and
     * Region. Formatted as Unix time.
     * </p>
     *
     * @return <p>
     *         Date and time that the alias was most recently created in the
     *         account and Region. Formatted as Unix time.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * Date and time that the alias was most recently created in the account and
     * Region. Formatted as Unix time.
     * </p>
     *
     * @param creationDate <p>
     *            Date and time that the alias was most recently created in the
     *            account and Region. Formatted as Unix time.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * Date and time that the alias was most recently created in the account and
     * Region. Formatted as Unix time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            Date and time that the alias was most recently created in the
     *            account and Region. Formatted as Unix time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AliasListEntry withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * Date and time that the alias was most recently associated with a KMS key
     * in the account and Region. Formatted as Unix time.
     * </p>
     *
     * @return <p>
     *         Date and time that the alias was most recently associated with a
     *         KMS key in the account and Region. Formatted as Unix time.
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * Date and time that the alias was most recently associated with a KMS key
     * in the account and Region. Formatted as Unix time.
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            Date and time that the alias was most recently associated with
     *            a KMS key in the account and Region. Formatted as Unix time.
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * Date and time that the alias was most recently associated with a KMS key
     * in the account and Region. Formatted as Unix time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            Date and time that the alias was most recently associated with
     *            a KMS key in the account and Region. Formatted as Unix time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AliasListEntry withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
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
        if (getAliasName() != null)
            sb.append("AliasName: " + getAliasName() + ",");
        if (getAliasArn() != null)
            sb.append("AliasArn: " + getAliasArn() + ",");
        if (getTargetKeyId() != null)
            sb.append("TargetKeyId: " + getTargetKeyId() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: " + getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode());
        hashCode = prime * hashCode
                + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AliasListEntry == false)
            return false;
        AliasListEntry other = (AliasListEntry) obj;

        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getAliasArn() == null ^ this.getAliasArn() == null)
            return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false)
            return false;
        if (other.getTargetKeyId() == null ^ this.getTargetKeyId() == null)
            return false;
        if (other.getTargetKeyId() != null
                && other.getTargetKeyId().equals(this.getTargetKeyId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null
                && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        return true;
    }
}
