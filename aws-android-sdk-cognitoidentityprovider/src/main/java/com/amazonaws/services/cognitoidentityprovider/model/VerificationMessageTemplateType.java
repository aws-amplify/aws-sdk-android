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
 * The template for verification messages.
 * </p>
 */
public class VerificationMessageTemplateType implements Serializable {
    /**
     * <p>
     * The SMS message template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsMessage;

    /**
     * <p>
     * The email message template. EmailMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     */
    private String emailMessage;

    /**
     * <p>
     * The subject line for the email message template. EmailSubject is allowed
     * only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     */
    private String emailSubject;

    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * EmailMessageByLink is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{##[\p{L}\p{M}\p{S}\p{N}\p
     * {P}\s*]*##\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     */
    private String emailMessageByLink;

    /**
     * <p>
     * The subject line for the email message template for sending a
     * confirmation link to the user. EmailSubjectByLink is allowed only <a
     * href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     */
    private String emailSubjectByLink;

    /**
     * <p>
     * The default email option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIRM_WITH_LINK, CONFIRM_WITH_CODE
     */
    private String defaultEmailOption;

    /**
     * <p>
     * The SMS message template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         The SMS message template.
     *         </p>
     */
    public String getSmsMessage() {
        return smsMessage;
    }

    /**
     * <p>
     * The SMS message template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsMessage <p>
     *            The SMS message template.
     *            </p>
     */
    public void setSmsMessage(String smsMessage) {
        this.smsMessage = smsMessage;
    }

    /**
     * <p>
     * The SMS message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsMessage <p>
     *            The SMS message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerificationMessageTemplateType withSmsMessage(String smsMessage) {
        this.smsMessage = smsMessage;
        return this;
    }

    /**
     * <p>
     * The email message template. EmailMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @return <p>
     *         The email message template. EmailMessage is allowed only if <a
     *         href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         > EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailMessage() {
        return emailMessage;
    }

    /**
     * <p>
     * The email message template. EmailMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @param emailMessage <p>
     *            The email message template. EmailMessage is allowed only if <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            > EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * The email message template. EmailMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @param emailMessage <p>
     *            The email message template. EmailMessage is allowed only if <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            > EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerificationMessageTemplateType withEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * <p>
     * The subject line for the email message template. EmailSubject is allowed
     * only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return <p>
     *         The subject line for the email message template. EmailSubject is
     *         allowed only if <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         >EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * <p>
     * The subject line for the email message template. EmailSubject is allowed
     * only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailSubject <p>
     *            The subject line for the email message template. EmailSubject
     *            is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * <p>
     * The subject line for the email message template. EmailSubject is allowed
     * only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailSubject <p>
     *            The subject line for the email message template. EmailSubject
     *            is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerificationMessageTemplateType withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * EmailMessageByLink is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{##[\p{L}\p{M}\p{S}\p{N}\p
     * {P}\s*]*##\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @return <p>
     *         The email message template for sending a confirmation link to the
     *         user. EmailMessageByLink is allowed only if <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         > EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailMessageByLink() {
        return emailMessageByLink;
    }

    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * EmailMessageByLink is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{##[\p{L}\p{M}\p{S}\p{N}\p
     * {P}\s*]*##\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @param emailMessageByLink <p>
     *            The email message template for sending a confirmation link to
     *            the user. EmailMessageByLink is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            > EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailMessageByLink(String emailMessageByLink) {
        this.emailMessageByLink = emailMessageByLink;
    }

    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * EmailMessageByLink is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{##[\p{L}\p{M}\p{S}\p{N}\p
     * {P}\s*]*##\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @param emailMessageByLink <p>
     *            The email message template for sending a confirmation link to
     *            the user. EmailMessageByLink is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            > EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerificationMessageTemplateType withEmailMessageByLink(String emailMessageByLink) {
        this.emailMessageByLink = emailMessageByLink;
        return this;
    }

    /**
     * <p>
     * The subject line for the email message template for sending a
     * confirmation link to the user. EmailSubjectByLink is allowed only <a
     * href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return <p>
     *         The subject line for the email message template for sending a
     *         confirmation link to the user. EmailSubjectByLink is allowed only
     *         <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         > EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailSubjectByLink() {
        return emailSubjectByLink;
    }

    /**
     * <p>
     * The subject line for the email message template for sending a
     * confirmation link to the user. EmailSubjectByLink is allowed only <a
     * href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailSubjectByLink <p>
     *            The subject line for the email message template for sending a
     *            confirmation link to the user. EmailSubjectByLink is allowed
     *            only <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            > EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailSubjectByLink(String emailSubjectByLink) {
        this.emailSubjectByLink = emailSubjectByLink;
    }

    /**
     * <p>
     * The subject line for the email message template for sending a
     * confirmation link to the user. EmailSubjectByLink is allowed only <a
     * href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * > EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailSubjectByLink <p>
     *            The subject line for the email message template for sending a
     *            confirmation link to the user. EmailSubjectByLink is allowed
     *            only <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            > EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerificationMessageTemplateType withEmailSubjectByLink(String emailSubjectByLink) {
        this.emailSubjectByLink = emailSubjectByLink;
        return this;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIRM_WITH_LINK, CONFIRM_WITH_CODE
     *
     * @return <p>
     *         The default email option.
     *         </p>
     * @see DefaultEmailOptionType
     */
    public String getDefaultEmailOption() {
        return defaultEmailOption;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIRM_WITH_LINK, CONFIRM_WITH_CODE
     *
     * @param defaultEmailOption <p>
     *            The default email option.
     *            </p>
     * @see DefaultEmailOptionType
     */
    public void setDefaultEmailOption(String defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIRM_WITH_LINK, CONFIRM_WITH_CODE
     *
     * @param defaultEmailOption <p>
     *            The default email option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultEmailOptionType
     */
    public VerificationMessageTemplateType withDefaultEmailOption(String defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption;
        return this;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIRM_WITH_LINK, CONFIRM_WITH_CODE
     *
     * @param defaultEmailOption <p>
     *            The default email option.
     *            </p>
     * @see DefaultEmailOptionType
     */
    public void setDefaultEmailOption(DefaultEmailOptionType defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption.toString();
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIRM_WITH_LINK, CONFIRM_WITH_CODE
     *
     * @param defaultEmailOption <p>
     *            The default email option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultEmailOptionType
     */
    public VerificationMessageTemplateType withDefaultEmailOption(
            DefaultEmailOptionType defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption.toString();
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
        if (getSmsMessage() != null)
            sb.append("SmsMessage: " + getSmsMessage() + ",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: " + getEmailMessage() + ",");
        if (getEmailSubject() != null)
            sb.append("EmailSubject: " + getEmailSubject() + ",");
        if (getEmailMessageByLink() != null)
            sb.append("EmailMessageByLink: " + getEmailMessageByLink() + ",");
        if (getEmailSubjectByLink() != null)
            sb.append("EmailSubjectByLink: " + getEmailSubjectByLink() + ",");
        if (getDefaultEmailOption() != null)
            sb.append("DefaultEmailOption: " + getDefaultEmailOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSmsMessage() == null) ? 0 : getSmsMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEmailSubject() == null) ? 0 : getEmailSubject().hashCode());
        hashCode = prime * hashCode
                + ((getEmailMessageByLink() == null) ? 0 : getEmailMessageByLink().hashCode());
        hashCode = prime * hashCode
                + ((getEmailSubjectByLink() == null) ? 0 : getEmailSubjectByLink().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultEmailOption() == null) ? 0 : getDefaultEmailOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerificationMessageTemplateType == false)
            return false;
        VerificationMessageTemplateType other = (VerificationMessageTemplateType) obj;

        if (other.getSmsMessage() == null ^ this.getSmsMessage() == null)
            return false;
        if (other.getSmsMessage() != null
                && other.getSmsMessage().equals(this.getSmsMessage()) == false)
            return false;
        if (other.getEmailMessage() == null ^ this.getEmailMessage() == null)
            return false;
        if (other.getEmailMessage() != null
                && other.getEmailMessage().equals(this.getEmailMessage()) == false)
            return false;
        if (other.getEmailSubject() == null ^ this.getEmailSubject() == null)
            return false;
        if (other.getEmailSubject() != null
                && other.getEmailSubject().equals(this.getEmailSubject()) == false)
            return false;
        if (other.getEmailMessageByLink() == null ^ this.getEmailMessageByLink() == null)
            return false;
        if (other.getEmailMessageByLink() != null
                && other.getEmailMessageByLink().equals(this.getEmailMessageByLink()) == false)
            return false;
        if (other.getEmailSubjectByLink() == null ^ this.getEmailSubjectByLink() == null)
            return false;
        if (other.getEmailSubjectByLink() != null
                && other.getEmailSubjectByLink().equals(this.getEmailSubjectByLink()) == false)
            return false;
        if (other.getDefaultEmailOption() == null ^ this.getDefaultEmailOption() == null)
            return false;
        if (other.getDefaultEmailOption() != null
                && other.getDefaultEmailOption().equals(this.getDefaultEmailOption()) == false)
            return false;
        return true;
    }
}
