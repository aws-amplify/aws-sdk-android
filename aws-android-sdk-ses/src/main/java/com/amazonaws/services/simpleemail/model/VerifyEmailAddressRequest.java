/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deprecated. Use the <code>VerifyEmailIdentity</code> operation to verify a
 * new email address.
 * </p>
 */
public class VerifyEmailAddressRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The email address to be verified.
     * </p>
     */
    private String emailAddress;

    /**
     * <p>
     * The email address to be verified.
     * </p>
     *
     * @return <p>
     *         The email address to be verified.
     *         </p>
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * The email address to be verified.
     * </p>
     *
     * @param emailAddress <p>
     *            The email address to be verified.
     *            </p>
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address to be verified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailAddress <p>
     *            The email address to be verified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyEmailAddressRequest withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: " + getEmailAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyEmailAddressRequest == false)
            return false;
        VerifyEmailAddressRequest other = (VerifyEmailAddressRequest) obj;

        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null
                && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        return true;
    }
}
