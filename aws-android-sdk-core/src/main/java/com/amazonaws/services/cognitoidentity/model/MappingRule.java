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
 * A rule that maps a claim name, a claim value, and a match type to a role ARN.
 * </p>
 */
public class MappingRule implements Serializable {
    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin"
     * or "paid".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String claim;

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP
     * token must match <code>Value</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, Contains, StartsWith, NotEqual
     */
    private String matchType;

    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String value;

    /**
     * <p>
     * The role ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleARN;

    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin"
     * or "paid".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The claim name that must be present in the token, for example,
     *         "isAdmin" or "paid".
     *         </p>
     */
    public String getClaim() {
        return claim;
    }

    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin"
     * or "paid".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param claim <p>
     *            The claim name that must be present in the token, for example,
     *            "isAdmin" or "paid".
     *            </p>
     */
    public void setClaim(String claim) {
        this.claim = claim;
    }

    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin"
     * or "paid".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param claim <p>
     *            The claim name that must be present in the token, for example,
     *            "isAdmin" or "paid".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingRule withClaim(String claim) {
        this.claim = claim;
        return this;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP
     * token must match <code>Value</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, Contains, StartsWith, NotEqual
     *
     * @return <p>
     *         The match condition that specifies how closely the claim value in
     *         the IdP token must match <code>Value</code>.
     *         </p>
     * @see MappingRuleMatchType
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP
     * token must match <code>Value</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, Contains, StartsWith, NotEqual
     *
     * @param matchType <p>
     *            The match condition that specifies how closely the claim value
     *            in the IdP token must match <code>Value</code>.
     *            </p>
     * @see MappingRuleMatchType
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP
     * token must match <code>Value</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, Contains, StartsWith, NotEqual
     *
     * @param matchType <p>
     *            The match condition that specifies how closely the claim value
     *            in the IdP token must match <code>Value</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MappingRuleMatchType
     */
    public MappingRule withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP
     * token must match <code>Value</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, Contains, StartsWith, NotEqual
     *
     * @param matchType <p>
     *            The match condition that specifies how closely the claim value
     *            in the IdP token must match <code>Value</code>.
     *            </p>
     * @see MappingRuleMatchType
     */
    public void setMatchType(MappingRuleMatchType matchType) {
        this.matchType = matchType.toString();
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP
     * token must match <code>Value</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, Contains, StartsWith, NotEqual
     *
     * @param matchType <p>
     *            The match condition that specifies how closely the claim value
     *            in the IdP token must match <code>Value</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MappingRuleMatchType
     */
    public MappingRule withMatchType(MappingRuleMatchType matchType) {
        this.matchType = matchType.toString();
        return this;
    }

    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A brief string that the claim must match, for example, "paid" or
     *         "yes".
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param value <p>
     *            A brief string that the claim must match, for example, "paid"
     *            or "yes".
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param value <p>
     *            A brief string that the claim must match, for example, "paid"
     *            or "yes".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingRule withValue(String value) {
        this.value = value;
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
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleARN <p>
     *            The role ARN.
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
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
     * @param roleARN <p>
     *            The role ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingRule withRoleARN(String roleARN) {
        this.roleARN = roleARN;
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
        if (getClaim() != null)
            sb.append("Claim: " + getClaim() + ",");
        if (getMatchType() != null)
            sb.append("MatchType: " + getMatchType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClaim() == null) ? 0 : getClaim().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappingRule == false)
            return false;
        MappingRule other = (MappingRule) obj;

        if (other.getClaim() == null ^ this.getClaim() == null)
            return false;
        if (other.getClaim() != null && other.getClaim().equals(this.getClaim()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null
                && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }
}
