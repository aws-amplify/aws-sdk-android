/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The password policy type.
 * </p>
 */
public class PasswordPolicyType implements Serializable {
    /**
     * <p>
     * The minimum length of the password in the policy that you have set. This
     * value can't be less than 6.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     */
    private Integer minimumLength;

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     * </p>
     */
    private Boolean requireUppercase;

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     * </p>
     */
    private Boolean requireLowercase;

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     * </p>
     */
    private Boolean requireNumbers;

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     * </p>
     */
    private Boolean requireSymbols;

    /**
     * <p>
     * The number of days a temporary password is valid in the password policy.
     * If the user doesn't sign in during this time, an administrator must reset
     * their password.
     * </p>
     * <note>
     * <p>
     * When you set <code>TemporaryPasswordValidityDays</code> for a user pool,
     * you can no longer set the deprecated
     * <code>UnusedAccountValidityDays</code> value for that user pool.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     */
    private Integer temporaryPasswordValidityDays;

    /**
     * <p>
     * The minimum length of the password in the policy that you have set. This
     * value can't be less than 6.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     *
     * @return <p>
     *         The minimum length of the password in the policy that you have
     *         set. This value can't be less than 6.
     *         </p>
     */
    public Integer getMinimumLength() {
        return minimumLength;
    }

    /**
     * <p>
     * The minimum length of the password in the policy that you have set. This
     * value can't be less than 6.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     *
     * @param minimumLength <p>
     *            The minimum length of the password in the policy that you have
     *            set. This value can't be less than 6.
     *            </p>
     */
    public void setMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
    }

    /**
     * <p>
     * The minimum length of the password in the policy that you have set. This
     * value can't be less than 6.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     *
     * @param minimumLength <p>
     *            The minimum length of the password in the policy that you have
     *            set. This value can't be less than 6.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicyType withMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one uppercase letter in their
     *         password.
     *         </p>
     */
    public Boolean isRequireUppercase() {
        return requireUppercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one uppercase letter in their
     *         password.
     *         </p>
     */
    public Boolean getRequireUppercase() {
        return requireUppercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     * </p>
     *
     * @param requireUppercase <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one uppercase letter
     *            in their password.
     *            </p>
     */
    public void setRequireUppercase(Boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireUppercase <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one uppercase letter
     *            in their password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicyType withRequireUppercase(Boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one lowercase letter in their
     *         password.
     *         </p>
     */
    public Boolean isRequireLowercase() {
        return requireLowercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one lowercase letter in their
     *         password.
     *         </p>
     */
    public Boolean getRequireLowercase() {
        return requireLowercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     * </p>
     *
     * @param requireLowercase <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one lowercase letter
     *            in their password.
     *            </p>
     */
    public void setRequireLowercase(Boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireLowercase <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one lowercase letter
     *            in their password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicyType withRequireLowercase(Boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one number in their password.
     *         </p>
     */
    public Boolean isRequireNumbers() {
        return requireNumbers;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one number in their password.
     *         </p>
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     * </p>
     *
     * @param requireNumbers <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one number in their
     *            password.
     *            </p>
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireNumbers <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one number in their
     *            password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicyType withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one symbol in their password.
     *         </p>
     */
    public Boolean isRequireSymbols() {
        return requireSymbols;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     * </p>
     *
     * @return <p>
     *         In the password policy that you have set, refers to whether you
     *         have required users to use at least one symbol in their password.
     *         </p>
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     * </p>
     *
     * @param requireSymbols <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one symbol in their
     *            password.
     *            </p>
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireSymbols <p>
     *            In the password policy that you have set, refers to whether
     *            you have required users to use at least one symbol in their
     *            password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicyType withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * <p>
     * The number of days a temporary password is valid in the password policy.
     * If the user doesn't sign in during this time, an administrator must reset
     * their password.
     * </p>
     * <note>
     * <p>
     * When you set <code>TemporaryPasswordValidityDays</code> for a user pool,
     * you can no longer set the deprecated
     * <code>UnusedAccountValidityDays</code> value for that user pool.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     *
     * @return <p>
     *         The number of days a temporary password is valid in the password
     *         policy. If the user doesn't sign in during this time, an
     *         administrator must reset their password.
     *         </p>
     *         <note>
     *         <p>
     *         When you set <code>TemporaryPasswordValidityDays</code> for a
     *         user pool, you can no longer set the deprecated
     *         <code>UnusedAccountValidityDays</code> value for that user pool.
     *         </p>
     *         </note>
     */
    public Integer getTemporaryPasswordValidityDays() {
        return temporaryPasswordValidityDays;
    }

    /**
     * <p>
     * The number of days a temporary password is valid in the password policy.
     * If the user doesn't sign in during this time, an administrator must reset
     * their password.
     * </p>
     * <note>
     * <p>
     * When you set <code>TemporaryPasswordValidityDays</code> for a user pool,
     * you can no longer set the deprecated
     * <code>UnusedAccountValidityDays</code> value for that user pool.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     *
     * @param temporaryPasswordValidityDays <p>
     *            The number of days a temporary password is valid in the
     *            password policy. If the user doesn't sign in during this time,
     *            an administrator must reset their password.
     *            </p>
     *            <note>
     *            <p>
     *            When you set <code>TemporaryPasswordValidityDays</code> for a
     *            user pool, you can no longer set the deprecated
     *            <code>UnusedAccountValidityDays</code> value for that user
     *            pool.
     *            </p>
     *            </note>
     */
    public void setTemporaryPasswordValidityDays(Integer temporaryPasswordValidityDays) {
        this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
    }

    /**
     * <p>
     * The number of days a temporary password is valid in the password policy.
     * If the user doesn't sign in during this time, an administrator must reset
     * their password.
     * </p>
     * <note>
     * <p>
     * When you set <code>TemporaryPasswordValidityDays</code> for a user pool,
     * you can no longer set the deprecated
     * <code>UnusedAccountValidityDays</code> value for that user pool.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     *
     * @param temporaryPasswordValidityDays <p>
     *            The number of days a temporary password is valid in the
     *            password policy. If the user doesn't sign in during this time,
     *            an administrator must reset their password.
     *            </p>
     *            <note>
     *            <p>
     *            When you set <code>TemporaryPasswordValidityDays</code> for a
     *            user pool, you can no longer set the deprecated
     *            <code>UnusedAccountValidityDays</code> value for that user
     *            pool.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicyType withTemporaryPasswordValidityDays(
            Integer temporaryPasswordValidityDays) {
        this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
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
        if (getMinimumLength() != null)
            sb.append("MinimumLength: " + getMinimumLength() + ",");
        if (getRequireUppercase() != null)
            sb.append("RequireUppercase: " + getRequireUppercase() + ",");
        if (getRequireLowercase() != null)
            sb.append("RequireLowercase: " + getRequireLowercase() + ",");
        if (getRequireNumbers() != null)
            sb.append("RequireNumbers: " + getRequireNumbers() + ",");
        if (getRequireSymbols() != null)
            sb.append("RequireSymbols: " + getRequireSymbols() + ",");
        if (getTemporaryPasswordValidityDays() != null)
            sb.append("TemporaryPasswordValidityDays: " + getTemporaryPasswordValidityDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinimumLength() == null) ? 0 : getMinimumLength().hashCode());
        hashCode = prime * hashCode
                + ((getRequireUppercase() == null) ? 0 : getRequireUppercase().hashCode());
        hashCode = prime * hashCode
                + ((getRequireLowercase() == null) ? 0 : getRequireLowercase().hashCode());
        hashCode = prime * hashCode
                + ((getRequireNumbers() == null) ? 0 : getRequireNumbers().hashCode());
        hashCode = prime * hashCode
                + ((getRequireSymbols() == null) ? 0 : getRequireSymbols().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemporaryPasswordValidityDays() == null) ? 0
                        : getTemporaryPasswordValidityDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PasswordPolicyType == false)
            return false;
        PasswordPolicyType other = (PasswordPolicyType) obj;

        if (other.getMinimumLength() == null ^ this.getMinimumLength() == null)
            return false;
        if (other.getMinimumLength() != null
                && other.getMinimumLength().equals(this.getMinimumLength()) == false)
            return false;
        if (other.getRequireUppercase() == null ^ this.getRequireUppercase() == null)
            return false;
        if (other.getRequireUppercase() != null
                && other.getRequireUppercase().equals(this.getRequireUppercase()) == false)
            return false;
        if (other.getRequireLowercase() == null ^ this.getRequireLowercase() == null)
            return false;
        if (other.getRequireLowercase() != null
                && other.getRequireLowercase().equals(this.getRequireLowercase()) == false)
            return false;
        if (other.getRequireNumbers() == null ^ this.getRequireNumbers() == null)
            return false;
        if (other.getRequireNumbers() != null
                && other.getRequireNumbers().equals(this.getRequireNumbers()) == false)
            return false;
        if (other.getRequireSymbols() == null ^ this.getRequireSymbols() == null)
            return false;
        if (other.getRequireSymbols() != null
                && other.getRequireSymbols().equals(this.getRequireSymbols()) == false)
            return false;
        if (other.getTemporaryPasswordValidityDays() == null
                ^ this.getTemporaryPasswordValidityDays() == null)
            return false;
        if (other.getTemporaryPasswordValidityDays() != null
                && other.getTemporaryPasswordValidityDays().equals(
                        this.getTemporaryPasswordValidityDays()) == false)
            return false;
        return true;
    }
}
