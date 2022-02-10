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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Verifies a destination phone number with a one-time password (OTP) for the
 * calling Amazon Web Services account.
 * </p>
 * <p>
 * When you start using Amazon SNS to send SMS messages, your Amazon Web
 * Services account is in the <i>SMS sandbox</i>. The SMS sandbox provides a
 * safe environment for you to try Amazon SNS features without risking your
 * reputation as an SMS sender. While your Amazon Web Services account is in the
 * SMS sandbox, you can use all of the features of Amazon SNS. However, you can
 * send SMS messages only to verified destination phone numbers. For more
 * information, including how to move out of the sandbox to send messages
 * without restrictions, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
 * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
 * </p>
 */
public class VerifySMSSandboxPhoneNumberRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The destination phone number to verify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>^(\+[0-9]{8,}|[0-9]{0,9})$<br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * The OTP sent to the destination number from the
     * <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 8<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String oneTimePassword;

    /**
     * <p>
     * The destination phone number to verify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>^(\+[0-9]{8,}|[0-9]{0,9})$<br/>
     *
     * @return <p>
     *         The destination phone number to verify.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>^(\+[0-9]{8,}|[0-9]{0,9})$<br/>
     *
     * @param phoneNumber <p>
     *            The destination phone number to verify.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify.
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
     *            The destination phone number to verify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySMSSandboxPhoneNumberRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * The OTP sent to the destination number from the
     * <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 8<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The OTP sent to the destination number from the
     *         <code>CreateSMSSandBoxPhoneNumber</code> call.
     *         </p>
     */
    public String getOneTimePassword() {
        return oneTimePassword;
    }

    /**
     * <p>
     * The OTP sent to the destination number from the
     * <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 8<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param oneTimePassword <p>
     *            The OTP sent to the destination number from the
     *            <code>CreateSMSSandBoxPhoneNumber</code> call.
     *            </p>
     */
    public void setOneTimePassword(String oneTimePassword) {
        this.oneTimePassword = oneTimePassword;
    }

    /**
     * <p>
     * The OTP sent to the destination number from the
     * <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 8<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param oneTimePassword <p>
     *            The OTP sent to the destination number from the
     *            <code>CreateSMSSandBoxPhoneNumber</code> call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySMSSandboxPhoneNumberRequest withOneTimePassword(String oneTimePassword) {
        this.oneTimePassword = oneTimePassword;
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
        if (getOneTimePassword() != null)
            sb.append("OneTimePassword: " + getOneTimePassword());
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
                + ((getOneTimePassword() == null) ? 0 : getOneTimePassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifySMSSandboxPhoneNumberRequest == false)
            return false;
        VerifySMSSandboxPhoneNumberRequest other = (VerifySMSSandboxPhoneNumberRequest) obj;

        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getOneTimePassword() == null ^ this.getOneTimePassword() == null)
            return false;
        if (other.getOneTimePassword() != null
                && other.getOneTimePassword().equals(this.getOneTimePassword()) == false)
            return false;
        return true;
    }
}
