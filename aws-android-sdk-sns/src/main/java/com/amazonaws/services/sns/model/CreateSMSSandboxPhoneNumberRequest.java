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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a destination phone number to an account in the SMS sandbox and sends a
 * one-time password (OTP) to that phone number.
 * </p>
 * <p>
 * When you start using Amazon SNS to send SMS messages, your account is in the
 * <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for you to
 * try Amazon SNS features without risking your reputation as an SMS sender.
 * While your account is in the SMS sandbox, you can use all of the features of
 * Amazon SNS. However, you can send SMS messages only to verified destination
 * phone numbers. For more information, including how to move out of the sandbox
 * to send messages without restrictions, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
 * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
 * </p>
 */
public class CreateSMSSandboxPhoneNumberRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds
     * this phone number to the list of verified phone numbers that you can send
     * SMS messages to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>^(\+[0-9]{8,}|[0-9]{0,9})$<br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * The language to use for sending the OTP. The default value is
     * <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-419, es-ES, de-DE, fr-CA, fr-FR,
     * it-IT, ja-JP, pt-BR, kr-KR, zh-CN, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds
     * this phone number to the list of verified phone numbers that you can send
     * SMS messages to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>^(\+[0-9]{8,}|[0-9]{0,9})$<br/>
     *
     * @return <p>
     *         The destination phone number to verify. On verification, Amazon
     *         SNS adds this phone number to the list of verified phone numbers
     *         that you can send SMS messages to.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds
     * this phone number to the list of verified phone numbers that you can send
     * SMS messages to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>^(\+[0-9]{8,}|[0-9]{0,9})$<br/>
     *
     * @param phoneNumber <p>
     *            The destination phone number to verify. On verification,
     *            Amazon SNS adds this phone number to the list of verified
     *            phone numbers that you can send SMS messages to.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds
     * this phone number to the list of verified phone numbers that you can send
     * SMS messages to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>^(\+[0-9]{8,}|[0-9]{0,9})$<br/>
     *
     * @param phoneNumber <p>
     *            The destination phone number to verify. On verification,
     *            Amazon SNS adds this phone number to the list of verified
     *            phone numbers that you can send SMS messages to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSMSSandboxPhoneNumberRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is
     * <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-419, es-ES, de-DE, fr-CA, fr-FR,
     * it-IT, ja-JP, pt-BR, kr-KR, zh-CN, zh-TW
     *
     * @return <p>
     *         The language to use for sending the OTP. The default value is
     *         <code>en-US</code>.
     *         </p>
     * @see LanguageCodeString
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is
     * <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-419, es-ES, de-DE, fr-CA, fr-FR,
     * it-IT, ja-JP, pt-BR, kr-KR, zh-CN, zh-TW
     *
     * @param languageCode <p>
     *            The language to use for sending the OTP. The default value is
     *            <code>en-US</code>.
     *            </p>
     * @see LanguageCodeString
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is
     * <code>en-US</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-419, es-ES, de-DE, fr-CA, fr-FR,
     * it-IT, ja-JP, pt-BR, kr-KR, zh-CN, zh-TW
     *
     * @param languageCode <p>
     *            The language to use for sending the OTP. The default value is
     *            <code>en-US</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCodeString
     */
    public CreateSMSSandboxPhoneNumberRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is
     * <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-419, es-ES, de-DE, fr-CA, fr-FR,
     * it-IT, ja-JP, pt-BR, kr-KR, zh-CN, zh-TW
     *
     * @param languageCode <p>
     *            The language to use for sending the OTP. The default value is
     *            <code>en-US</code>.
     *            </p>
     * @see LanguageCodeString
     */
    public void setLanguageCode(LanguageCodeString languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is
     * <code>en-US</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-419, es-ES, de-DE, fr-CA, fr-FR,
     * it-IT, ja-JP, pt-BR, kr-KR, zh-CN, zh-TW
     *
     * @param languageCode <p>
     *            The language to use for sending the OTP. The default value is
     *            <code>en-US</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCodeString
     */
    public CreateSMSSandboxPhoneNumberRequest withLanguageCode(LanguageCodeString languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSMSSandboxPhoneNumberRequest == false)
            return false;
        CreateSMSSandboxPhoneNumberRequest other = (CreateSMSSandboxPhoneNumberRequest) obj;

        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }
}
