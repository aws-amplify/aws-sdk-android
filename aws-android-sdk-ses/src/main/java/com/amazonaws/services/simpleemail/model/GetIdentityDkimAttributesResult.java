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
 * Represents the status of Amazon SES Easy DKIM signing for an identity. For
 * domain identities, this response also contains the DKIM tokens that are
 * required for Easy DKIM signing, and whether Amazon SES successfully verified
 * that these tokens were published.
 * </p>
 */
public class GetIdentityDkimAttributesResult implements Serializable {
    /**
     * <p>
     * The DKIM attributes for an email address or a domain.
     * </p>
     */
    private java.util.Map<String, IdentityDkimAttributes> dkimAttributes = new java.util.HashMap<String, IdentityDkimAttributes>();

    /**
     * <p>
     * The DKIM attributes for an email address or a domain.
     * </p>
     *
     * @return <p>
     *         The DKIM attributes for an email address or a domain.
     *         </p>
     */
    public java.util.Map<String, IdentityDkimAttributes> getDkimAttributes() {
        return dkimAttributes;
    }

    /**
     * <p>
     * The DKIM attributes for an email address or a domain.
     * </p>
     *
     * @param dkimAttributes <p>
     *            The DKIM attributes for an email address or a domain.
     *            </p>
     */
    public void setDkimAttributes(java.util.Map<String, IdentityDkimAttributes> dkimAttributes) {
        this.dkimAttributes = dkimAttributes;
    }

    /**
     * <p>
     * The DKIM attributes for an email address or a domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dkimAttributes <p>
     *            The DKIM attributes for an email address or a domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityDkimAttributesResult withDkimAttributes(
            java.util.Map<String, IdentityDkimAttributes> dkimAttributes) {
        this.dkimAttributes = dkimAttributes;
        return this;
    }

    /**
     * <p>
     * The DKIM attributes for an email address or a domain.
     * </p>
     * <p>
     * The method adds a new key-value pair into DkimAttributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into DkimAttributes.
     * @param value The corresponding value of the entry to be added into
     *            DkimAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityDkimAttributesResult addDkimAttributesEntry(String key,
            IdentityDkimAttributes value) {
        if (null == this.dkimAttributes) {
            this.dkimAttributes = new java.util.HashMap<String, IdentityDkimAttributes>();
        }
        if (this.dkimAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.dkimAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DkimAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetIdentityDkimAttributesResult clearDkimAttributesEntries() {
        this.dkimAttributes = null;
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
        if (getDkimAttributes() != null)
            sb.append("DkimAttributes: " + getDkimAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDkimAttributes() == null) ? 0 : getDkimAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityDkimAttributesResult == false)
            return false;
        GetIdentityDkimAttributesResult other = (GetIdentityDkimAttributesResult) obj;

        if (other.getDkimAttributes() == null ^ this.getDkimAttributes() == null)
            return false;
        if (other.getDkimAttributes() != null
                && other.getDkimAttributes().equals(this.getDkimAttributes()) == false)
            return false;
        return true;
    }
}
