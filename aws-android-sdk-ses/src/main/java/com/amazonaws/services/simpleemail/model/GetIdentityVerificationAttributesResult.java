/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Amazon SES verification status of a list of identities. For domain
 * identities, this response also contains the verification token.
 * </p>
 */
public class GetIdentityVerificationAttributesResult implements Serializable {
    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     */
    private java.util.Map<String, IdentityVerificationAttributes> verificationAttributes = new java.util.HashMap<String, IdentityVerificationAttributes>();

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     *
     * @return <p>
     *         A map of Identities to IdentityVerificationAttributes objects.
     *         </p>
     */
    public java.util.Map<String, IdentityVerificationAttributes> getVerificationAttributes() {
        return verificationAttributes;
    }

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     *
     * @param verificationAttributes <p>
     *            A map of Identities to IdentityVerificationAttributes objects.
     *            </p>
     */
    public void setVerificationAttributes(
            java.util.Map<String, IdentityVerificationAttributes> verificationAttributes) {
        this.verificationAttributes = verificationAttributes;
    }

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verificationAttributes <p>
     *            A map of Identities to IdentityVerificationAttributes objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityVerificationAttributesResult withVerificationAttributes(
            java.util.Map<String, IdentityVerificationAttributes> verificationAttributes) {
        this.verificationAttributes = verificationAttributes;
        return this;
    }

    /**
     * <p>
     * A map of Identities to IdentityVerificationAttributes objects.
     * </p>
     * <p>
     * The method adds a new key-value pair into VerificationAttributes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into VerificationAttributes.
     * @param value The corresponding value of the entry to be added into
     *            VerificationAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityVerificationAttributesResult addVerificationAttributesEntry(String key,
            IdentityVerificationAttributes value) {
        if (null == this.verificationAttributes) {
            this.verificationAttributes = new java.util.HashMap<String, IdentityVerificationAttributes>();
        }
        if (this.verificationAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.verificationAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VerificationAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetIdentityVerificationAttributesResult clearVerificationAttributesEntries() {
        this.verificationAttributes = null;
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
        if (getVerificationAttributes() != null)
            sb.append("VerificationAttributes: " + getVerificationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVerificationAttributes() == null) ? 0 : getVerificationAttributes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityVerificationAttributesResult == false)
            return false;
        GetIdentityVerificationAttributesResult other = (GetIdentityVerificationAttributesResult) obj;

        if (other.getVerificationAttributes() == null ^ this.getVerificationAttributes() == null)
            return false;
        if (other.getVerificationAttributes() != null
                && other.getVerificationAttributes().equals(this.getVerificationAttributes()) == false)
            return false;
        return true;
    }
}
