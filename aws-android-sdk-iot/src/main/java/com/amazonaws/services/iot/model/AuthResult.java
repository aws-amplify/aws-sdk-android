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
 * The authorizer result.
 * </p>
 */
public class AuthResult implements Serializable {
    /**
     * <p>
     * Authorization information.
     * </p>
     */
    private AuthInfo authInfo;

    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     */
    private Allowed allowed;

    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     */
    private Denied denied;

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements
     * are taken into account when determining the authorization decision. An
     * explicit deny statement can override multiple allow statements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY
     */
    private String authDecision;

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     */
    private java.util.List<String> missingContextValues;

    /**
     * <p>
     * Authorization information.
     * </p>
     *
     * @return <p>
     *         Authorization information.
     *         </p>
     */
    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    /**
     * <p>
     * Authorization information.
     * </p>
     *
     * @param authInfo <p>
     *            Authorization information.
     *            </p>
     */
    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    /**
     * <p>
     * Authorization information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authInfo <p>
     *            Authorization information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthResult withAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     *
     * @return <p>
     *         The policies and statements that allowed the specified action.
     *         </p>
     */
    public Allowed getAllowed() {
        return allowed;
    }

    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     *
     * @param allowed <p>
     *            The policies and statements that allowed the specified action.
     *            </p>
     */
    public void setAllowed(Allowed allowed) {
        this.allowed = allowed;
    }

    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowed <p>
     *            The policies and statements that allowed the specified action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthResult withAllowed(Allowed allowed) {
        this.allowed = allowed;
        return this;
    }

    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     *
     * @return <p>
     *         The policies and statements that denied the specified action.
     *         </p>
     */
    public Denied getDenied() {
        return denied;
    }

    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     *
     * @param denied <p>
     *            The policies and statements that denied the specified action.
     *            </p>
     */
    public void setDenied(Denied denied) {
        this.denied = denied;
    }

    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param denied <p>
     *            The policies and statements that denied the specified action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthResult withDenied(Denied denied) {
        this.denied = denied;
        return this;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements
     * are taken into account when determining the authorization decision. An
     * explicit deny statement can override multiple allow statements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY
     *
     * @return <p>
     *         The final authorization decision of this scenario. Multiple
     *         statements are taken into account when determining the
     *         authorization decision. An explicit deny statement can override
     *         multiple allow statements.
     *         </p>
     * @see AuthDecision
     */
    public String getAuthDecision() {
        return authDecision;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements
     * are taken into account when determining the authorization decision. An
     * explicit deny statement can override multiple allow statements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY
     *
     * @param authDecision <p>
     *            The final authorization decision of this scenario. Multiple
     *            statements are taken into account when determining the
     *            authorization decision. An explicit deny statement can
     *            override multiple allow statements.
     *            </p>
     * @see AuthDecision
     */
    public void setAuthDecision(String authDecision) {
        this.authDecision = authDecision;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements
     * are taken into account when determining the authorization decision. An
     * explicit deny statement can override multiple allow statements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY
     *
     * @param authDecision <p>
     *            The final authorization decision of this scenario. Multiple
     *            statements are taken into account when determining the
     *            authorization decision. An explicit deny statement can
     *            override multiple allow statements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthDecision
     */
    public AuthResult withAuthDecision(String authDecision) {
        this.authDecision = authDecision;
        return this;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements
     * are taken into account when determining the authorization decision. An
     * explicit deny statement can override multiple allow statements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY
     *
     * @param authDecision <p>
     *            The final authorization decision of this scenario. Multiple
     *            statements are taken into account when determining the
     *            authorization decision. An explicit deny statement can
     *            override multiple allow statements.
     *            </p>
     * @see AuthDecision
     */
    public void setAuthDecision(AuthDecision authDecision) {
        this.authDecision = authDecision.toString();
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements
     * are taken into account when determining the authorization decision. An
     * explicit deny statement can override multiple allow statements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY
     *
     * @param authDecision <p>
     *            The final authorization decision of this scenario. Multiple
     *            statements are taken into account when determining the
     *            authorization decision. An explicit deny statement can
     *            override multiple allow statements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthDecision
     */
    public AuthResult withAuthDecision(AuthDecision authDecision) {
        this.authDecision = authDecision.toString();
        return this;
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     *
     * @return <p>
     *         Contains any missing context values found while evaluating
     *         policy.
     *         </p>
     */
    public java.util.List<String> getMissingContextValues() {
        return missingContextValues;
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     *
     * @param missingContextValues <p>
     *            Contains any missing context values found while evaluating
     *            policy.
     *            </p>
     */
    public void setMissingContextValues(java.util.Collection<String> missingContextValues) {
        if (missingContextValues == null) {
            this.missingContextValues = null;
            return;
        }

        this.missingContextValues = new java.util.ArrayList<String>(missingContextValues);
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param missingContextValues <p>
     *            Contains any missing context values found while evaluating
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthResult withMissingContextValues(String... missingContextValues) {
        if (getMissingContextValues() == null) {
            this.missingContextValues = new java.util.ArrayList<String>(missingContextValues.length);
        }
        for (String value : missingContextValues) {
            this.missingContextValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param missingContextValues <p>
     *            Contains any missing context values found while evaluating
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthResult withMissingContextValues(java.util.Collection<String> missingContextValues) {
        setMissingContextValues(missingContextValues);
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
        if (getAuthInfo() != null)
            sb.append("authInfo: " + getAuthInfo() + ",");
        if (getAllowed() != null)
            sb.append("allowed: " + getAllowed() + ",");
        if (getDenied() != null)
            sb.append("denied: " + getDenied() + ",");
        if (getAuthDecision() != null)
            sb.append("authDecision: " + getAuthDecision() + ",");
        if (getMissingContextValues() != null)
            sb.append("missingContextValues: " + getMissingContextValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthInfo() == null) ? 0 : getAuthInfo().hashCode());
        hashCode = prime * hashCode + ((getAllowed() == null) ? 0 : getAllowed().hashCode());
        hashCode = prime * hashCode + ((getDenied() == null) ? 0 : getDenied().hashCode());
        hashCode = prime * hashCode
                + ((getAuthDecision() == null) ? 0 : getAuthDecision().hashCode());
        hashCode = prime * hashCode
                + ((getMissingContextValues() == null) ? 0 : getMissingContextValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthResult == false)
            return false;
        AuthResult other = (AuthResult) obj;

        if (other.getAuthInfo() == null ^ this.getAuthInfo() == null)
            return false;
        if (other.getAuthInfo() != null && other.getAuthInfo().equals(this.getAuthInfo()) == false)
            return false;
        if (other.getAllowed() == null ^ this.getAllowed() == null)
            return false;
        if (other.getAllowed() != null && other.getAllowed().equals(this.getAllowed()) == false)
            return false;
        if (other.getDenied() == null ^ this.getDenied() == null)
            return false;
        if (other.getDenied() != null && other.getDenied().equals(this.getDenied()) == false)
            return false;
        if (other.getAuthDecision() == null ^ this.getAuthDecision() == null)
            return false;
        if (other.getAuthDecision() != null
                && other.getAuthDecision().equals(this.getAuthDecision()) == false)
            return false;
        if (other.getMissingContextValues() == null ^ this.getMissingContextValues() == null)
            return false;
        if (other.getMissingContextValues() != null
                && other.getMissingContextValues().equals(this.getMissingContextValues()) == false)
            return false;
        return true;
    }
}
