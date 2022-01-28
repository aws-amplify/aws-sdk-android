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
 * The message template structure.
 * </p>
 */
public class MessageTemplateType implements Serializable {
    /**
     * <p>
     * The message template for SMS messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String sMSMessage;

    /**
     * <p>
     * The message template for email messages. EmailMessage is allowed only if
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
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
     * The subject line for email messages. EmailSubject is allowed only if <a
     * href=
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
     * The message template for SMS messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         The message template for SMS messages.
     *         </p>
     */
    public String getSMSMessage() {
        return sMSMessage;
    }

    /**
     * <p>
     * The message template for SMS messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param sMSMessage <p>
     *            The message template for SMS messages.
     *            </p>
     */
    public void setSMSMessage(String sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * <p>
     * The message template for SMS messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param sMSMessage <p>
     *            The message template for SMS messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageTemplateType withSMSMessage(String sMSMessage) {
        this.sMSMessage = sMSMessage;
        return this;
    }

    /**
     * <p>
     * The message template for email messages. EmailMessage is allowed only if
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @return <p>
     *         The message template for email messages. EmailMessage is allowed
     *         only if <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         >EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailMessage() {
        return emailMessage;
    }

    /**
     * <p>
     * The message template for email messages. EmailMessage is allowed only if
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @param emailMessage <p>
     *            The message template for email messages. EmailMessage is
     *            allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * The message template for email messages. EmailMessage is allowed only if
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
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
     *            The message template for email messages. EmailMessage is
     *            allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageTemplateType withEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * <p>
     * The subject line for email messages. EmailSubject is allowed only if <a
     * href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return <p>
     *         The subject line for email messages. EmailSubject is allowed only
     *         if <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         >EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * <p>
     * The subject line for email messages. EmailSubject is allowed only if <a
     * href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailSubject <p>
     *            The subject line for email messages. EmailSubject is allowed
     *            only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * <p>
     * The subject line for email messages. EmailSubject is allowed only if <a
     * href=
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
     *            The subject line for email messages. EmailSubject is allowed
     *            only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageTemplateType withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
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
        if (getSMSMessage() != null)
            sb.append("SMSMessage: " + getSMSMessage() + ",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: " + getEmailMessage() + ",");
        if (getEmailSubject() != null)
            sb.append("EmailSubject: " + getEmailSubject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSMSMessage() == null) ? 0 : getSMSMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEmailSubject() == null) ? 0 : getEmailSubject().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageTemplateType == false)
            return false;
        MessageTemplateType other = (MessageTemplateType) obj;

        if (other.getSMSMessage() == null ^ this.getSMSMessage() == null)
            return false;
        if (other.getSMSMessage() != null
                && other.getSMSMessage().equals(this.getSMSMessage()) == false)
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
        return true;
    }
}
