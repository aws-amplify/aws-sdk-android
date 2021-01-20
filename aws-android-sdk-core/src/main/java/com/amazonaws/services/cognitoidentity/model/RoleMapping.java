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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * A role mapping.
 * </p>
 */
public class RoleMapping implements Serializable {
    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims from the Cognito identity
     * provider token to map groups to roles. Rules will attempt to match claims
     * from the token to map to a role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Token, Rules
     */
    private String type;

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>,
     * <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value
     * for the <code>Rules</code> type, or there is no
     * <code>cognito:preferred_role</code> claim and there are multiple
     * <code>cognito:roles</code> matches for the <code>Token</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AuthenticatedRole, Deny
     */
    private String ambiguousRoleResolution;

    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type,
     * <code>RulesConfiguration</code> is required.
     * </p>
     */
    private RulesConfigurationType rulesConfiguration;

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims from the Cognito identity
     * provider token to map groups to roles. Rules will attempt to match claims
     * from the token to map to a role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Token, Rules
     *
     * @return <p>
     *         The role mapping type. Token will use <code>cognito:roles</code>
     *         and <code>cognito:preferred_role</code> claims from the Cognito
     *         identity provider token to map groups to roles. Rules will
     *         attempt to match claims from the token to map to a role.
     *         </p>
     * @see RoleMappingType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims from the Cognito identity
     * provider token to map groups to roles. Rules will attempt to match claims
     * from the token to map to a role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Token, Rules
     *
     * @param type <p>
     *            The role mapping type. Token will use
     *            <code>cognito:roles</code> and
     *            <code>cognito:preferred_role</code> claims from the Cognito
     *            identity provider token to map groups to roles. Rules will
     *            attempt to match claims from the token to map to a role.
     *            </p>
     * @see RoleMappingType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims from the Cognito identity
     * provider token to map groups to roles. Rules will attempt to match claims
     * from the token to map to a role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Token, Rules
     *
     * @param type <p>
     *            The role mapping type. Token will use
     *            <code>cognito:roles</code> and
     *            <code>cognito:preferred_role</code> claims from the Cognito
     *            identity provider token to map groups to roles. Rules will
     *            attempt to match claims from the token to map to a role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoleMappingType
     */
    public RoleMapping withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims from the Cognito identity
     * provider token to map groups to roles. Rules will attempt to match claims
     * from the token to map to a role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Token, Rules
     *
     * @param type <p>
     *            The role mapping type. Token will use
     *            <code>cognito:roles</code> and
     *            <code>cognito:preferred_role</code> claims from the Cognito
     *            identity provider token to map groups to roles. Rules will
     *            attempt to match claims from the token to map to a role.
     *            </p>
     * @see RoleMappingType
     */
    public void setType(RoleMappingType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The role mapping type. Token will use <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims from the Cognito identity
     * provider token to map groups to roles. Rules will attempt to match claims
     * from the token to map to a role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Token, Rules
     *
     * @param type <p>
     *            The role mapping type. Token will use
     *            <code>cognito:roles</code> and
     *            <code>cognito:preferred_role</code> claims from the Cognito
     *            identity provider token to map groups to roles. Rules will
     *            attempt to match claims from the token to map to a role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoleMappingType
     */
    public RoleMapping withType(RoleMappingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>,
     * <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value
     * for the <code>Rules</code> type, or there is no
     * <code>cognito:preferred_role</code> claim and there are multiple
     * <code>cognito:roles</code> matches for the <code>Token</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AuthenticatedRole, Deny
     *
     * @return <p>
     *         If you specify Token or Rules as the <code>Type</code>,
     *         <code>AmbiguousRoleResolution</code> is required.
     *         </p>
     *         <p>
     *         Specifies the action to be taken if either no rules match the
     *         claim value for the <code>Rules</code> type, or there is no
     *         <code>cognito:preferred_role</code> claim and there are multiple
     *         <code>cognito:roles</code> matches for the <code>Token</code>
     *         type.
     *         </p>
     * @see AmbiguousRoleResolutionType
     */
    public String getAmbiguousRoleResolution() {
        return ambiguousRoleResolution;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>,
     * <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value
     * for the <code>Rules</code> type, or there is no
     * <code>cognito:preferred_role</code> claim and there are multiple
     * <code>cognito:roles</code> matches for the <code>Token</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AuthenticatedRole, Deny
     *
     * @param ambiguousRoleResolution <p>
     *            If you specify Token or Rules as the <code>Type</code>,
     *            <code>AmbiguousRoleResolution</code> is required.
     *            </p>
     *            <p>
     *            Specifies the action to be taken if either no rules match the
     *            claim value for the <code>Rules</code> type, or there is no
     *            <code>cognito:preferred_role</code> claim and there are
     *            multiple <code>cognito:roles</code> matches for the
     *            <code>Token</code> type.
     *            </p>
     * @see AmbiguousRoleResolutionType
     */
    public void setAmbiguousRoleResolution(String ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>,
     * <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value
     * for the <code>Rules</code> type, or there is no
     * <code>cognito:preferred_role</code> claim and there are multiple
     * <code>cognito:roles</code> matches for the <code>Token</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AuthenticatedRole, Deny
     *
     * @param ambiguousRoleResolution <p>
     *            If you specify Token or Rules as the <code>Type</code>,
     *            <code>AmbiguousRoleResolution</code> is required.
     *            </p>
     *            <p>
     *            Specifies the action to be taken if either no rules match the
     *            claim value for the <code>Rules</code> type, or there is no
     *            <code>cognito:preferred_role</code> claim and there are
     *            multiple <code>cognito:roles</code> matches for the
     *            <code>Token</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AmbiguousRoleResolutionType
     */
    public RoleMapping withAmbiguousRoleResolution(String ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
        return this;
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>,
     * <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value
     * for the <code>Rules</code> type, or there is no
     * <code>cognito:preferred_role</code> claim and there are multiple
     * <code>cognito:roles</code> matches for the <code>Token</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AuthenticatedRole, Deny
     *
     * @param ambiguousRoleResolution <p>
     *            If you specify Token or Rules as the <code>Type</code>,
     *            <code>AmbiguousRoleResolution</code> is required.
     *            </p>
     *            <p>
     *            Specifies the action to be taken if either no rules match the
     *            claim value for the <code>Rules</code> type, or there is no
     *            <code>cognito:preferred_role</code> claim and there are
     *            multiple <code>cognito:roles</code> matches for the
     *            <code>Token</code> type.
     *            </p>
     * @see AmbiguousRoleResolutionType
     */
    public void setAmbiguousRoleResolution(AmbiguousRoleResolutionType ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution.toString();
    }

    /**
     * <p>
     * If you specify Token or Rules as the <code>Type</code>,
     * <code>AmbiguousRoleResolution</code> is required.
     * </p>
     * <p>
     * Specifies the action to be taken if either no rules match the claim value
     * for the <code>Rules</code> type, or there is no
     * <code>cognito:preferred_role</code> claim and there are multiple
     * <code>cognito:roles</code> matches for the <code>Token</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AuthenticatedRole, Deny
     *
     * @param ambiguousRoleResolution <p>
     *            If you specify Token or Rules as the <code>Type</code>,
     *            <code>AmbiguousRoleResolution</code> is required.
     *            </p>
     *            <p>
     *            Specifies the action to be taken if either no rules match the
     *            claim value for the <code>Rules</code> type, or there is no
     *            <code>cognito:preferred_role</code> claim and there are
     *            multiple <code>cognito:roles</code> matches for the
     *            <code>Token</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AmbiguousRoleResolutionType
     */
    public RoleMapping withAmbiguousRoleResolution(
            AmbiguousRoleResolutionType ambiguousRoleResolution) {
        this.ambiguousRoleResolution = ambiguousRoleResolution.toString();
        return this;
    }

    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type,
     * <code>RulesConfiguration</code> is required.
     * </p>
     *
     * @return <p>
     *         The rules to be used for mapping users to roles.
     *         </p>
     *         <p>
     *         If you specify Rules as the role mapping type,
     *         <code>RulesConfiguration</code> is required.
     *         </p>
     */
    public RulesConfigurationType getRulesConfiguration() {
        return rulesConfiguration;
    }

    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type,
     * <code>RulesConfiguration</code> is required.
     * </p>
     *
     * @param rulesConfiguration <p>
     *            The rules to be used for mapping users to roles.
     *            </p>
     *            <p>
     *            If you specify Rules as the role mapping type,
     *            <code>RulesConfiguration</code> is required.
     *            </p>
     */
    public void setRulesConfiguration(RulesConfigurationType rulesConfiguration) {
        this.rulesConfiguration = rulesConfiguration;
    }

    /**
     * <p>
     * The rules to be used for mapping users to roles.
     * </p>
     * <p>
     * If you specify Rules as the role mapping type,
     * <code>RulesConfiguration</code> is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rulesConfiguration <p>
     *            The rules to be used for mapping users to roles.
     *            </p>
     *            <p>
     *            If you specify Rules as the role mapping type,
     *            <code>RulesConfiguration</code> is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleMapping withRulesConfiguration(RulesConfigurationType rulesConfiguration) {
        this.rulesConfiguration = rulesConfiguration;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAmbiguousRoleResolution() != null)
            sb.append("AmbiguousRoleResolution: " + getAmbiguousRoleResolution() + ",");
        if (getRulesConfiguration() != null)
            sb.append("RulesConfiguration: " + getRulesConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAmbiguousRoleResolution() == null) ? 0 : getAmbiguousRoleResolution()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRulesConfiguration() == null) ? 0 : getRulesConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleMapping == false)
            return false;
        RoleMapping other = (RoleMapping) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAmbiguousRoleResolution() == null ^ this.getAmbiguousRoleResolution() == null)
            return false;
        if (other.getAmbiguousRoleResolution() != null
                && other.getAmbiguousRoleResolution().equals(this.getAmbiguousRoleResolution()) == false)
            return false;
        if (other.getRulesConfiguration() == null ^ this.getRulesConfiguration() == null)
            return false;
        if (other.getRulesConfiguration() != null
                && other.getRulesConfiguration().equals(this.getRulesConfiguration()) == false)
            return false;
        return true;
    }
}
