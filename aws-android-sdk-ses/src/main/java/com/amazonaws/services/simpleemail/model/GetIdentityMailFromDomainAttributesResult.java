/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the custom MAIL FROM attributes for a list of identities.
 * </p>
 */
public class GetIdentityMailFromDomainAttributesResult implements Serializable {
    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     */
    private java.util.Map<String, IdentityMailFromDomainAttributes> mailFromDomainAttributes = new java.util.HashMap<String, IdentityMailFromDomainAttributes>();

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     *
     * @return <p>
     *         A map of identities to custom MAIL FROM attributes.
     *         </p>
     */
    public java.util.Map<String, IdentityMailFromDomainAttributes> getMailFromDomainAttributes() {
        return mailFromDomainAttributes;
    }

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     *
     * @param mailFromDomainAttributes <p>
     *            A map of identities to custom MAIL FROM attributes.
     *            </p>
     */
    public void setMailFromDomainAttributes(
            java.util.Map<String, IdentityMailFromDomainAttributes> mailFromDomainAttributes) {
        this.mailFromDomainAttributes = mailFromDomainAttributes;
    }

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mailFromDomainAttributes <p>
     *            A map of identities to custom MAIL FROM attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityMailFromDomainAttributesResult withMailFromDomainAttributes(
            java.util.Map<String, IdentityMailFromDomainAttributes> mailFromDomainAttributes) {
        this.mailFromDomainAttributes = mailFromDomainAttributes;
        return this;
    }

    /**
     * <p>
     * A map of identities to custom MAIL FROM attributes.
     * </p>
     * <p>
     * The method adds a new key-value pair into MailFromDomainAttributes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            MailFromDomainAttributes.
     * @param value The corresponding value of the entry to be added into
     *            MailFromDomainAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityMailFromDomainAttributesResult addMailFromDomainAttributesEntry(String key,
            IdentityMailFromDomainAttributes value) {
        if (null == this.mailFromDomainAttributes) {
            this.mailFromDomainAttributes = new java.util.HashMap<String, IdentityMailFromDomainAttributes>();
        }
        if (this.mailFromDomainAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.mailFromDomainAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MailFromDomainAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetIdentityMailFromDomainAttributesResult clearMailFromDomainAttributesEntries() {
        this.mailFromDomainAttributes = null;
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
        if (getMailFromDomainAttributes() != null)
            sb.append("MailFromDomainAttributes: " + getMailFromDomainAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMailFromDomainAttributes() == null) ? 0 : getMailFromDomainAttributes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityMailFromDomainAttributesResult == false)
            return false;
        GetIdentityMailFromDomainAttributesResult other = (GetIdentityMailFromDomainAttributesResult) obj;

        if (other.getMailFromDomainAttributes() == null
                ^ this.getMailFromDomainAttributes() == null)
            return false;
        if (other.getMailFromDomainAttributes() != null
                && other.getMailFromDomainAttributes().equals(this.getMailFromDomainAttributes()) == false)
            return false;
        return true;
    }
}
