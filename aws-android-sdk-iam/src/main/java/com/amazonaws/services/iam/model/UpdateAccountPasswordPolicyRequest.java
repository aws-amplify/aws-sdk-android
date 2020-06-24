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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the password policy settings for the AWS account.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * This operation does not support partial updates. No parameters are required,
 * but if you do not specify a parameter, that parameter's value reverts to its
 * default value. See the <b>Request Parameters</b> section for each parameter's
 * default value. Also note that some parameters do not allow the default
 * parameter to be explicitly set. Instead, to invoke the default value, do not
 * include that parameter when you invoke the operation.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * For more information about using a password policy, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"
 * >Managing an IAM Password Policy</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class UpdateAccountPasswordPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>6</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     */
    private Integer minimumPasswordLength;

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one symbol character.
     * </p>
     */
    private Boolean requireSymbols;

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one numeric character.
     * </p>
     */
    private Boolean requireNumbers;

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase
     * character from the ISO basic Latin alphabet (A to Z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one uppercase character.
     * </p>
     */
    private Boolean requireUppercaseCharacters;

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase
     * character from the ISO basic Latin alphabet (a to z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one lowercase character.
     * </p>
     */
    private Boolean requireLowercaseCharacters;

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to
     * change their own passwords. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     * >Letting IAM Users Change Their Own Passwords</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users in
     * the account do not automatically have permissions to change their own
     * password.
     * </p>
     */
    private Boolean allowUsersToChangePassword;

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM user
     * passwords never expire.
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
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM users are not
     * prevented from reusing previous passwords.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer passwordReusePrevention;

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has
     * expired. The IAM user cannot be accessed until an administrator resets
     * the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users can
     * change their passwords after they expire and continue to sign in as the
     * user.
     * </p>
     */
    private Boolean hardExpiry;

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>6</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @return <p>
     *         The minimum number of characters allowed in an IAM user password.
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>6</code>.
     *         </p>
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>6</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength <p>
     *            The minimum number of characters allowed in an IAM user
     *            password.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>6</code>.
     *            </p>
     */
    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>6</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength <p>
     *            The minimum number of characters allowed in an IAM user
     *            password.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>6</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withMinimumPasswordLength(
            Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one symbol character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one of
     *         the following non-alphanumeric characters:
     *         </p>
     *         <p>
     *         ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one symbol
     *         character.
     *         </p>
     */
    public Boolean isRequireSymbols() {
        return requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one symbol character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one of
     *         the following non-alphanumeric characters:
     *         </p>
     *         <p>
     *         ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one symbol
     *         character.
     *         </p>
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one symbol character.
     * </p>
     *
     * @param requireSymbols <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            of the following non-alphanumeric characters:
     *            </p>
     *            <p>
     *            ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one symbol
     *            character.
     *            </p>
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one symbol character.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireSymbols <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            of the following non-alphanumeric characters:
     *            </p>
     *            <p>
     *            ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one symbol
     *            character.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one numeric character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one
     *         numeric character (0 to 9).
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one numeric
     *         character.
     *         </p>
     */
    public Boolean isRequireNumbers() {
        return requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one numeric character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one
     *         numeric character (0 to 9).
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one numeric
     *         character.
     *         </p>
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one numeric character.
     * </p>
     *
     * @param requireNumbers <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            numeric character (0 to 9).
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one numeric
     *            character.
     *            </p>
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one numeric character.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireNumbers <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            numeric character (0 to 9).
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one numeric
     *            character.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase
     * character from the ISO basic Latin alphabet (A to Z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one uppercase character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one
     *         uppercase character from the ISO basic Latin alphabet (A to Z).
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one uppercase
     *         character.
     *         </p>
     */
    public Boolean isRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase
     * character from the ISO basic Latin alphabet (A to Z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one uppercase character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one
     *         uppercase character from the ISO basic Latin alphabet (A to Z).
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one uppercase
     *         character.
     *         </p>
     */
    public Boolean getRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase
     * character from the ISO basic Latin alphabet (A to Z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one uppercase character.
     * </p>
     *
     * @param requireUppercaseCharacters <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            uppercase character from the ISO basic Latin alphabet (A to
     *            Z).
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one uppercase
     *            character.
     *            </p>
     */
    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase
     * character from the ISO basic Latin alphabet (A to Z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one uppercase character.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireUppercaseCharacters <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            uppercase character from the ISO basic Latin alphabet (A to
     *            Z).
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one uppercase
     *            character.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireUppercaseCharacters(
            Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase
     * character from the ISO basic Latin alphabet (a to z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one lowercase character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one
     *         lowercase character from the ISO basic Latin alphabet (a to z).
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one lowercase
     *         character.
     *         </p>
     */
    public Boolean isRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase
     * character from the ISO basic Latin alphabet (a to z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one lowercase character.
     * </p>
     *
     * @return <p>
     *         Specifies whether IAM user passwords must contain at least one
     *         lowercase character from the ISO basic Latin alphabet (a to z).
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that passwords do not require at least one lowercase
     *         character.
     *         </p>
     */
    public Boolean getRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase
     * character from the ISO basic Latin alphabet (a to z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one lowercase character.
     * </p>
     *
     * @param requireLowercaseCharacters <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            lowercase character from the ISO basic Latin alphabet (a to
     *            z).
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one lowercase
     *            character.
     *            </p>
     */
    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase
     * character from the ISO basic Latin alphabet (a to z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that passwords do
     * not require at least one lowercase character.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireLowercaseCharacters <p>
     *            Specifies whether IAM user passwords must contain at least one
     *            lowercase character from the ISO basic Latin alphabet (a to
     *            z).
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that passwords do not require at least one lowercase
     *            character.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireLowercaseCharacters(
            Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to
     * change their own passwords. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     * >Letting IAM Users Change Their Own Passwords</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users in
     * the account do not automatically have permissions to change their own
     * password.
     * </p>
     *
     * @return <p>
     *         Allows all IAM users in your account to use the AWS Management
     *         Console to change their own passwords. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     *         >Letting IAM Users Change Their Own Passwords</a> in the <i>IAM
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that IAM users in the account do not automatically have
     *         permissions to change their own password.
     *         </p>
     */
    public Boolean isAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to
     * change their own passwords. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     * >Letting IAM Users Change Their Own Passwords</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users in
     * the account do not automatically have permissions to change their own
     * password.
     * </p>
     *
     * @return <p>
     *         Allows all IAM users in your account to use the AWS Management
     *         Console to change their own passwords. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     *         >Letting IAM Users Change Their Own Passwords</a> in the <i>IAM
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that IAM users in the account do not automatically have
     *         permissions to change their own password.
     *         </p>
     */
    public Boolean getAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to
     * change their own passwords. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     * >Letting IAM Users Change Their Own Passwords</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users in
     * the account do not automatically have permissions to change their own
     * password.
     * </p>
     *
     * @param allowUsersToChangePassword <p>
     *            Allows all IAM users in your account to use the AWS Management
     *            Console to change their own passwords. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     *            >Letting IAM Users Change Their Own Passwords</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that IAM users in the account do not automatically
     *            have permissions to change their own password.
     *            </p>
     */
    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to
     * change their own passwords. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     * >Letting IAM Users Change Their Own Passwords</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users in
     * the account do not automatically have permissions to change their own
     * password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowUsersToChangePassword <p>
     *            Allows all IAM users in your account to use the AWS Management
     *            Console to change their own passwords. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html"
     *            >Letting IAM Users Change Their Own Passwords</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that IAM users in the account do not automatically
     *            have permissions to change their own password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withAllowUsersToChangePassword(
            Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
        return this;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM user
     * passwords never expire.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @return <p>
     *         The number of days that an IAM user password is valid.
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>0</code>. The result is
     *         that IAM user passwords never expire.
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
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM user
     * passwords never expire.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @param maxPasswordAge <p>
     *            The number of days that an IAM user password is valid.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>0</code>. The result
     *            is that IAM user passwords never expire.
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
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM user
     * passwords never expire.
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
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>0</code>. The result
     *            is that IAM user passwords never expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented
     * from reusing.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM users are not
     * prevented from reusing previous passwords.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return <p>
     *         Specifies the number of previous passwords that IAM users are
     *         prevented from reusing.
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>0</code>. The result is
     *         that IAM users are not prevented from reusing previous passwords.
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
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM users are not
     * prevented from reusing previous passwords.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param passwordReusePrevention <p>
     *            Specifies the number of previous passwords that IAM users are
     *            prevented from reusing.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>0</code>. The result
     *            is that IAM users are not prevented from reusing previous
     *            passwords.
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
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>0</code>. The result is that IAM users are not
     * prevented from reusing previous passwords.
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
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>0</code>. The result
     *            is that IAM users are not prevented from reusing previous
     *            passwords.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withPasswordReusePrevention(
            Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has
     * expired. The IAM user cannot be accessed until an administrator resets
     * the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users can
     * change their passwords after they expire and continue to sign in as the
     * user.
     * </p>
     *
     * @return <p>
     *         Prevents IAM users from setting a new password after their
     *         password has expired. The IAM user cannot be accessed until an
     *         administrator resets the password.
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that IAM users can change their passwords after they
     *         expire and continue to sign in as the user.
     *         </p>
     */
    public Boolean isHardExpiry() {
        return hardExpiry;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has
     * expired. The IAM user cannot be accessed until an administrator resets
     * the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users can
     * change their passwords after they expire and continue to sign in as the
     * user.
     * </p>
     *
     * @return <p>
     *         Prevents IAM users from setting a new password after their
     *         password has expired. The IAM user cannot be accessed until an
     *         administrator resets the password.
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the
     *         operation uses the default value of <code>false</code>. The
     *         result is that IAM users can change their passwords after they
     *         expire and continue to sign in as the user.
     *         </p>
     */
    public Boolean getHardExpiry() {
        return hardExpiry;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has
     * expired. The IAM user cannot be accessed until an administrator resets
     * the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users can
     * change their passwords after they expire and continue to sign in as the
     * user.
     * </p>
     *
     * @param hardExpiry <p>
     *            Prevents IAM users from setting a new password after their
     *            password has expired. The IAM user cannot be accessed until an
     *            administrator resets the password.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that IAM users can change their passwords after they
     *            expire and continue to sign in as the user.
     *            </p>
     */
    public void setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has
     * expired. The IAM user cannot be accessed until an administrator resets
     * the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses
     * the default value of <code>false</code>. The result is that IAM users can
     * change their passwords after they expire and continue to sign in as the
     * user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hardExpiry <p>
     *            Prevents IAM users from setting a new password after their
     *            password has expired. The IAM user cannot be accessed until an
     *            administrator resets the password.
     *            </p>
     *            <p>
     *            If you do not specify a value for this parameter, then the
     *            operation uses the default value of <code>false</code>. The
     *            result is that IAM users can change their passwords after they
     *            expire and continue to sign in as the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountPasswordPolicyRequest withHardExpiry(Boolean hardExpiry) {
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

        if (obj instanceof UpdateAccountPasswordPolicyRequest == false)
            return false;
        UpdateAccountPasswordPolicyRequest other = (UpdateAccountPasswordPolicyRequest) obj;

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
