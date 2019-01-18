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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a role alias.
 * </p>
 */
public class UpdateRoleAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The role alias to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String roleAlias;

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
     * The number of seconds the credential will be valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     */
    private Integer credentialDurationSeconds;

    /**
     * <p>
     * The role alias to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The role alias to update.
     *         </p>
     */
    public String getRoleAlias() {
        return roleAlias;
    }

    /**
     * <p>
     * The role alias to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param roleAlias <p>
     *            The role alias to update.
     *            </p>
     */
    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    /**
     * <p>
     * The role alias to update.
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
     *            The role alias to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoleAliasRequest withRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
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
    public UpdateRoleAliasRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The number of seconds the credential will be valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @return <p>
     *         The number of seconds the credential will be valid.
     *         </p>
     */
    public Integer getCredentialDurationSeconds() {
        return credentialDurationSeconds;
    }

    /**
     * <p>
     * The number of seconds the credential will be valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @param credentialDurationSeconds <p>
     *            The number of seconds the credential will be valid.
     *            </p>
     */
    public void setCredentialDurationSeconds(Integer credentialDurationSeconds) {
        this.credentialDurationSeconds = credentialDurationSeconds;
    }

    /**
     * <p>
     * The number of seconds the credential will be valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @param credentialDurationSeconds <p>
     *            The number of seconds the credential will be valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoleAliasRequest withCredentialDurationSeconds(Integer credentialDurationSeconds) {
        this.credentialDurationSeconds = credentialDurationSeconds;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getCredentialDurationSeconds() != null)
            sb.append("credentialDurationSeconds: " + getCredentialDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleAlias() == null) ? 0 : getRoleAlias().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCredentialDurationSeconds() == null) ? 0 : getCredentialDurationSeconds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoleAliasRequest == false)
            return false;
        UpdateRoleAliasRequest other = (UpdateRoleAliasRequest) obj;

        if (other.getRoleAlias() == null ^ this.getRoleAlias() == null)
            return false;
        if (other.getRoleAlias() != null
                && other.getRoleAlias().equals(this.getRoleAlias()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCredentialDurationSeconds() == null
                ^ this.getCredentialDurationSeconds() == null)
            return false;
        if (other.getCredentialDurationSeconds() != null
                && other.getCredentialDurationSeconds().equals(this.getCredentialDurationSeconds()) == false)
            return false;
        return true;
    }
}
