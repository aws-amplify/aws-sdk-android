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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the account password policy.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetAccountPasswordPolicy</a> operation.
 * </p>
 */
public class PasswordPolicy implements Serializable {
    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     */
    private Integer minimumPasswordLength;

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     */
    private Boolean requireSymbols;

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     */
    private Boolean requireNumbers;

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     */
    private Boolean requireUppercaseCharacters;

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     */
    private Boolean requireLowercaseCharacters;

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     */
    private Boolean allowUsersToChangePassword;

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if
     * <code>MaxPasswordAge</code> contains a value greater than 0. Returns
     * false if MaxPasswordAge is 0 or not present.
     * </p>
     */
    private Boolean expirePasswords;

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     */
    private Integer maxPasswordAge;

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented
     * from reusing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer passwordReusePrevention;

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     * </p>
     */
    private Boolean hardExpiry;

    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @return <p>
     *         Minimum length to require for IAM user passwords.
     *         </p>
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength <p>
     *            Minimum length to require for IAM user passwords.
     *            </p>
     */
    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength <p>
     *            Minimum length to require for IAM user passwords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require symbols for IAM user passwords.
     *         </p>
     */
    public Boolean isRequireSymbols() {
        return requireSymbols;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require symbols for IAM user passwords.
     *         </p>
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     *
     * @param requireSymbols <p>
     *            Specifies whether to require symbols for IAM user passwords.
     *            </p>
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireSymbols <p>
     *            Specifies whether to require symbols for IAM user passwords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require numbers for IAM user passwords.
     *         </p>
     */
    public Boolean isRequireNumbers() {
        return requireNumbers;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require numbers for IAM user passwords.
     *         </p>
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     *
     * @param requireNumbers <p>
     *            Specifies whether to require numbers for IAM user passwords.
     *            </p>
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireNumbers <p>
     *            Specifies whether to require numbers for IAM user passwords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require uppercase characters for IAM user
     *         passwords.
     *         </p>
     */
    public Boolean isRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require uppercase characters for IAM user
     *         passwords.
     *         </p>
     */
    public Boolean getRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     *
     * @param requireUppercaseCharacters <p>
     *            Specifies whether to require uppercase characters for IAM user
     *            passwords.
     *            </p>
     */
    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireUppercaseCharacters <p>
     *            Specifies whether to require uppercase characters for IAM user
     *            passwords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require lowercase characters for IAM user
     *         passwords.
     *         </p>
     */
    public Boolean isRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     *
     * @return <p>
     *         Specifies whether to require lowercase characters for IAM user
     *         passwords.
     *         </p>
     */
    public Boolean getRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     *
     * @param requireLowercaseCharacters <p>
     *            Specifies whether to require lowercase characters for IAM user
     *            passwords.
     *            </p>
     */
    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireLowercaseCharacters <p>
     *            Specifies whether to require lowercase characters for IAM user
     *            passwords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM users are allowed to change their own
     *         password.
     *         </p>
     */
    public Boolean isAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM users are allowed to change their own
     *         password.
     *         </p>
     */
    public Boolean getAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     *
     * @param allowUsersToChangePassword <p>
     *            Specifies whether IAM users are allowed to change their own
     *            password.
     *            </p>
     */
    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowUsersToChangePassword <p>
     *            Specifies whether IAM users are allowed to change their own
     *            password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
        return this;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if
     * <code>MaxPasswordAge</code> contains a value greater than 0. Returns
     * false if MaxPasswordAge is 0 or not present.
     * </p>
     *
     * @return <p>
     *         Indicates whether passwords in the account expire. Returns true
     *         if <code>MaxPasswordAge</code> contains a value greater than 0.
     *         Returns false if MaxPasswordAge is 0 or not present.
     *         </p>
     */
    public Boolean isExpirePasswords() {
        return expirePasswords;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if
     * <code>MaxPasswordAge</code> contains a value greater than 0. Returns
     * false if MaxPasswordAge is 0 or not present.
     * </p>
     *
     * @return <p>
     *         Indicates whether passwords in the account expire. Returns true
     *         if <code>MaxPasswordAge</code> contains a value greater than 0.
     *         Returns false if MaxPasswordAge is 0 or not present.
     *         </p>
     */
    public Boolean getExpirePasswords() {
        return expirePasswords;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if
     * <code>MaxPasswordAge</code> contains a value greater than 0. Returns
     * false if MaxPasswordAge is 0 or not present.
     * </p>
     *
     * @param expirePasswords <p>
     *            Indicates whether passwords in the account expire. Returns
     *            true if <code>MaxPasswordAge</code> contains a value greater
     *            than 0. Returns false if MaxPasswordAge is 0 or not present.
     *            </p>
     */
    public void setExpirePasswords(Boolean expirePasswords) {
        this.expirePasswords = expirePasswords;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if
     * <code>MaxPasswordAge</code> contains a value greater than 0. Returns
     * false if MaxPasswordAge is 0 or not present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirePasswords <p>
     *            Indicates whether passwords in the account expire. Returns
     *            true if <code>MaxPasswordAge</code> contains a value greater
     *            than 0. Returns false if MaxPasswordAge is 0 or not present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withExpirePasswords(Boolean expirePasswords) {
        this.expirePasswords = expirePasswords;
        return this;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @return <p>
     *         The number of days that an IAM user password is valid.
     *         </p>
     */
    public Integer getMaxPasswordAge() {
        return maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @param maxPasswordAge <p>
     *            The number of days that an IAM user password is valid.
     *            </p>
     */
    public void setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @param maxPasswordAge <p>
     *            The number of days that an IAM user password is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented
     * from reusing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return <p>
     *         Specifies the number of previous passwords that IAM users are
     *         prevented from reusing.
     *         </p>
     */
    public Integer getPasswordReusePrevention() {
        return passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented
     * from reusing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param passwordReusePrevention <p>
     *            Specifies the number of previous passwords that IAM users are
     *            prevented from reusing.
     *            </p>
     */
    public void setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented
     * from reusing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param passwordReusePrevention <p>
     *            Specifies the number of previous passwords that IAM users are
     *            prevented from reusing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM users are prevented from setting a new
     *         password after their password has expired.
     *         </p>
     */
    public Boolean isHardExpiry() {
        return hardExpiry;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM users are prevented from setting a new
     *         password after their password has expired.
     *         </p>
     */
    public Boolean getHardExpiry() {
        return hardExpiry;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     * </p>
     *
     * @param hardExpiry <p>
     *            Specifies whether IAM users are prevented from setting a new
     *            password after their password has expired.
     *            </p>
     */
    public void setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hardExpiry <p>
     *            Specifies whether IAM users are prevented from setting a new
     *            password after their password has expired.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PasswordPolicy withHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
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
        if (getMinimumPasswordLength() != null)
            sb.append("MinimumPasswordLength: " + getMinimumPasswordLength() + ",");
        if (getRequireSymbols() != null)
            sb.append("RequireSymbols: " + getRequireSymbols() + ",");
        if (getRequireNumbers() != null)
            sb.append("RequireNumbers: " + getRequireNumbers() + ",");
        if (getRequireUppercaseCharacters() != null)
            sb.append("RequireUppercaseCharacters: " + getRequireUppercaseCharacters() + ",");
        if (getRequireLowercaseCharacters() != null)
            sb.append("RequireLowercaseCharacters: " + getRequireLowercaseCharacters() + ",");
        if (getAllowUsersToChangePassword() != null)
            sb.append("AllowUsersToChangePassword: " + getAllowUsersToChangePassword() + ",");
        if (getExpirePasswords() != null)
            sb.append("ExpirePasswords: " + getExpirePasswords() + ",");
        if (getMaxPasswordAge() != null)
            sb.append("MaxPasswordAge: " + getMaxPasswordAge() + ",");
        if (getPasswordReusePrevention() != null)
            sb.append("PasswordReusePrevention: " + getPasswordReusePrevention() + ",");
        if (getHardExpiry() != null)
            sb.append("HardExpiry: " + getHardExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMinimumPasswordLength() == null) ? 0 : getMinimumPasswordLength().hashCode());
        hashCode = prime * hashCode
                + ((getRequireSymbols() == null) ? 0 : getRequireSymbols().hashCode());
        hashCode = prime * hashCode
                + ((getRequireNumbers() == null) ? 0 : getRequireNumbers().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequireUppercaseCharacters() == null) ? 0 : getRequireUppercaseCharacters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRequireLowercaseCharacters() == null) ? 0 : getRequireLowercaseCharacters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowUsersToChangePassword() == null) ? 0 : getAllowUsersToChangePassword()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExpirePasswords() == null) ? 0 : getExpirePasswords().hashCode());
        hashCode = prime * hashCode
                + ((getMaxPasswordAge() == null) ? 0 : getMaxPasswordAge().hashCode());
        hashCode = prime
                * hashCode
                + ((getPasswordReusePrevention() == null) ? 0 : getPasswordReusePrevention()
                        .hashCode());
        hashCode = prime * hashCode + ((getHardExpiry() == null) ? 0 : getHardExpiry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PasswordPolicy == false)
            return false;
        PasswordPolicy other = (PasswordPolicy) obj;

        if (other.getMinimumPasswordLength() == null ^ this.getMinimumPasswordLength() == null)
            return false;
        if (other.getMinimumPasswordLength() != null
                && other.getMinimumPasswordLength().equals(this.getMinimumPasswordLength()) == false)
            return false;
        if (other.getRequireSymbols() == null ^ this.getRequireSymbols() == null)
            return false;
        if (other.getRequireSymbols() != null
                && other.getRequireSymbols().equals(this.getRequireSymbols()) == false)
            return false;
        if (other.getRequireNumbers() == null ^ this.getRequireNumbers() == null)
            return false;
        if (other.getRequireNumbers() != null
                && other.getRequireNumbers().equals(this.getRequireNumbers()) == false)
            return false;
        if (other.getRequireUppercaseCharacters() == null
                ^ this.getRequireUppercaseCharacters() == null)
            return false;
        if (other.getRequireUppercaseCharacters() != null
                && other.getRequireUppercaseCharacters().equals(
                        this.getRequireUppercaseCharacters()) == false)
            return false;
        if (other.getRequireLowercaseCharacters() == null
                ^ this.getRequireLowercaseCharacters() == null)
            return false;
        if (other.getRequireLowercaseCharacters() != null
                && other.getRequireLowercaseCharacters().equals(
                        this.getRequireLowercaseCharacters()) == false)
            return false;
        if (other.getAllowUsersToChangePassword() == null
                ^ this.getAllowUsersToChangePassword() == null)
            return false;
        if (other.getAllowUsersToChangePassword() != null
                && other.getAllowUsersToChangePassword().equals(
                        this.getAllowUsersToChangePassword()) == false)
            return false;
        if (other.getExpirePasswords() == null ^ this.getExpirePasswords() == null)
            return false;
        if (other.getExpirePasswords() != null
                && other.getExpirePasswords().equals(this.getExpirePasswords()) == false)
            return false;
        if (other.getMaxPasswordAge() == null ^ this.getMaxPasswordAge() == null)
            return false;
        if (other.getMaxPasswordAge() != null
                && other.getMaxPasswordAge().equals(this.getMaxPasswordAge()) == false)
            return false;
        if (other.getPasswordReusePrevention() == null ^ this.getPasswordReusePrevention() == null)
            return false;
        if (other.getPasswordReusePrevention() != null
                && other.getPasswordReusePrevention().equals(this.getPasswordReusePrevention()) == false)
            return false;
        if (other.getHardExpiry() == null ^ this.getHardExpiry() == null)
            return false;
        if (other.getHardExpiry() != null
                && other.getHardExpiry().equals(this.getHardExpiry()) == false)
            return false;
        return true;
    }
}
