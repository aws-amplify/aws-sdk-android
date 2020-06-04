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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends a verification request to an email contact method to ensure it's owned
 * by the requester. SMS contact methods don't need to be verified.
 * </p>
 * <p>
 * A contact method is used to send you notifications about your Amazon
 * Lightsail resources. You can add one email address and one mobile phone
 * number contact method in each AWS Region. However, SMS text messaging is not
 * supported in some AWS Regions, and SMS text messages cannot be sent to some
 * countries/regions. For more information, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
 * >Notifications in Amazon Lightsail</a>.
 * </p>
 * <p>
 * A verification request is sent to the contact method when you initially
 * create it. Use this action to send another verification request if a previous
 * verification request was deleted, or has expired.
 * </p>
 * <important>
 * <p>
 * Notifications are not sent to an email contact method until after it is
 * verified, and confirmed as valid.
 * </p>
 * </important>
 */
public class SendContactMethodVerificationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code>
     * (text messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email
     */
    private String protocol;

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code>
     * (text messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email
     *
     * @return <p>
     *         The protocol to verify, such as <code>Email</code> or
     *         <code>SMS</code> (text messaging).
     *         </p>
     * @see ContactMethodVerificationProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code>
     * (text messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email
     *
     * @param protocol <p>
     *            The protocol to verify, such as <code>Email</code> or
     *            <code>SMS</code> (text messaging).
     *            </p>
     * @see ContactMethodVerificationProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code>
     * (text messaging).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email
     *
     * @param protocol <p>
     *            The protocol to verify, such as <code>Email</code> or
     *            <code>SMS</code> (text messaging).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactMethodVerificationProtocol
     */
    public SendContactMethodVerificationRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code>
     * (text messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email
     *
     * @param protocol <p>
     *            The protocol to verify, such as <code>Email</code> or
     *            <code>SMS</code> (text messaging).
     *            </p>
     * @see ContactMethodVerificationProtocol
     */
    public void setProtocol(ContactMethodVerificationProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code>
     * (text messaging).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email
     *
     * @param protocol <p>
     *            The protocol to verify, such as <code>Email</code> or
     *            <code>SMS</code> (text messaging).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactMethodVerificationProtocol
     */
    public SendContactMethodVerificationRequest withProtocol(
            ContactMethodVerificationProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendContactMethodVerificationRequest == false)
            return false;
        SendContactMethodVerificationRequest other = (SendContactMethodVerificationRequest) obj;

        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }
}
