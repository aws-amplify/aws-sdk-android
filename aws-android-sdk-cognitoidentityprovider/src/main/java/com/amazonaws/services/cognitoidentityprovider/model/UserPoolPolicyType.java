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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The policy associated with a user pool.
 * </p>
 */
public class UserPoolPolicyType implements Serializable {
    /**
     * <p>
     * The password policy.
     * </p>
     */
    private PasswordPolicyType passwordPolicy;

    /**
     * <p>
     * The password policy.
     * </p>
     *
     * @return <p>
     *         The password policy.
     *         </p>
     */
    public PasswordPolicyType getPasswordPolicy() {
        return passwordPolicy;
    }

    /**
     * <p>
     * The password policy.
     * </p>
     *
     * @param passwordPolicy <p>
     *            The password policy.
     *            </p>
     */
    public void setPasswordPolicy(PasswordPolicyType passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    /**
     * <p>
     * The password policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passwordPolicy <p>
     *            The password policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolPolicyType withPasswordPolicy(PasswordPolicyType passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
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
        if (getPasswordPolicy() != null)
            sb.append("PasswordPolicy: " + getPasswordPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPasswordPolicy() == null) ? 0 : getPasswordPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolPolicyType == false)
            return false;
        UserPoolPolicyType other = (UserPoolPolicyType) obj;

        if (other.getPasswordPolicy() == null ^ this.getPasswordPolicy() == null)
            return false;
        if (other.getPasswordPolicy() != null
                && other.getPasswordPolicy().equals(this.getPasswordPolicy()) == false)
            return false;
        return true;
    }
}
