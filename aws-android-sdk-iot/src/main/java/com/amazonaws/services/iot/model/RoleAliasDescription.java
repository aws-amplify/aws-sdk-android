/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Role alias description.
 * </p>
 */
public class RoleAliasDescription implements Serializable {
    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String roleAlias;

    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     */
    private String roleAliasArn;

    /**
     * <p>
     * The role ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The role alias owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String owner;

    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     */
    private Integer credentialDurationSeconds;

    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The role alias.
     *         </p>
     */
    public String getRoleAlias() {
        return roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param roleAlias <p>
     *            The role alias.
     *            </p>
     */
    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param roleAlias <p>
     *            The role alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleAliasDescription withRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
        return this;
    }

    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     *
     * @return <p>
     *         The ARN of the role alias.
     *         </p>
     */
    public String getRoleAliasArn() {
        return roleAliasArn;
    }

    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     *
     * @param roleAliasArn <p>
     *            The ARN of the role alias.
     *            </p>
     */
    public void setRoleAliasArn(String roleAliasArn) {
        this.roleAliasArn = roleAliasArn;
    }

    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleAliasArn <p>
     *            The ARN of the role alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleAliasDescription withRoleAliasArn(String roleAliasArn) {
        this.roleAliasArn = roleAliasArn;
        return this;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The role ARN.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The role ARN.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The role ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleAliasDescription withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The role alias owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The role alias owner.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The role alias owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param owner <p>
     *            The role alias owner.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The role alias owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param owner <p>
     *            The role alias owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleAliasDescription withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @return <p>
     *         The number of seconds for which the credential is valid.
     *         </p>
     */
    public Integer getCredentialDurationSeconds() {
        return credentialDurationSeconds;
    }

    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @param credentialDurationSeconds <p>
     *            The number of seconds for which the credential is valid.
     *            </p>
     */
    public void setCredentialDurationSeconds(Integer credentialDurationSeconds) {
        this.credentialDurationSeconds = credentialDurationSeconds;
    }

    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @param credentialDurationSeconds <p>
     *            The number of seconds for which the credential is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleAliasDescription withCredentialDurationSeconds(Integer credentialDurationSeconds) {
        this.credentialDurationSeconds = credentialDurationSeconds;
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     *
     * @return <p>
     *         The UNIX timestamp of when the role alias was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     *
     * @param creationDate <p>
     *            The UNIX timestamp of when the role alias was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The UNIX timestamp of when the role alias was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleAliasDescription withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     *
     * @return <p>
     *         The UNIX timestamp of when the role alias was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The UNIX timestamp of when the role alias was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The UNIX timestamp of when the role alias was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleAliasDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        if (getRoleAlias() != null)
            sb.append("roleAlias: " + getRoleAlias() + ",");
        if (getRoleAliasArn() != null)
            sb.append("roleAliasArn: " + getRoleAliasArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getOwner() != null)
            sb.append("owner: " + getOwner() + ",");
        if (getCredentialDurationSeconds() != null)
            sb.append("credentialDurationSeconds: " + getCredentialDurationSeconds() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleAlias() == null) ? 0 : getRoleAlias().hashCode());
        hashCode = prime * hashCode
                + ((getRoleAliasArn() == null) ? 0 : getRoleAliasArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime
                * hashCode
                + ((getCredentialDurationSeconds() == null) ? 0 : getCredentialDurationSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleAliasDescription == false)
            return false;
        RoleAliasDescription other = (RoleAliasDescription) obj;

        if (other.getRoleAlias() == null ^ this.getRoleAlias() == null)
            return false;
        if (other.getRoleAlias() != null
                && other.getRoleAlias().equals(this.getRoleAlias()) == false)
            return false;
        if (other.getRoleAliasArn() == null ^ this.getRoleAliasArn() == null)
            return false;
        if (other.getRoleAliasArn() != null
                && other.getRoleAliasArn().equals(this.getRoleAliasArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getCredentialDurationSeconds() == null
                ^ this.getCredentialDurationSeconds() == null)
            return false;
        if (other.getCredentialDurationSeconds() != null
                && other.getCredentialDurationSeconds().equals(this.getCredentialDurationSeconds()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }
}
