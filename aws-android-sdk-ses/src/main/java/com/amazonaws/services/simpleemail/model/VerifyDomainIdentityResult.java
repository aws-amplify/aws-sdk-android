/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Returns a TXT record that you must publish to the DNS server of your domain
 * to complete domain verification with Amazon SES.
 * </p>
 */
public class VerifyDomainIdentityResult implements Serializable {
    /**
     * <p>
     * A TXT record that must be placed in the DNS settings for the domain, in
     * order to complete domain verification.
     * </p>
     */
    private String verificationToken;

    /**
     * <p>
     * A TXT record that must be placed in the DNS settings for the domain, in
     * order to complete domain verification.
     * </p>
     *
     * @return <p>
     *         A TXT record that must be placed in the DNS settings for the
     *         domain, in order to complete domain verification.
     *         </p>
     */
    public String getVerificationToken() {
        return verificationToken;
    }

    /**
     * <p>
     * A TXT record that must be placed in the DNS settings for the domain, in
     * order to complete domain verification.
     * </p>
     *
     * @param verificationToken <p>
     *            A TXT record that must be placed in the DNS settings for the
     *            domain, in order to complete domain verification.
     *            </p>
     */
    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    /**
     * <p>
     * A TXT record that must be placed in the DNS settings for the domain, in
     * order to complete domain verification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verificationToken <p>
     *            A TXT record that must be placed in the DNS settings for the
     *            domain, in order to complete domain verification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDomainIdentityResult withVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
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
        if (getVerificationToken() != null)
            sb.append("VerificationToken: " + getVerificationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVerificationToken() == null) ? 0 : getVerificationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyDomainIdentityResult == false)
            return false;
        VerifyDomainIdentityResult other = (VerifyDomainIdentityResult) obj;

        if (other.getVerificationToken() == null ^ this.getVerificationToken() == null)
            return false;
        if (other.getVerificationToken() != null
                && other.getVerificationToken().equals(this.getVerificationToken()) == false)
            return false;
        return true;
    }
}
