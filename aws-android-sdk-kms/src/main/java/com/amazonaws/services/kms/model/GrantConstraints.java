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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * A structure for specifying the conditions under which the operations
 * permitted by the grant are allowed.
 * </p>
 * <p>
 * You can use this structure to allow the operations permitted by the grant
 * only when a specified encryption context is present. For more information
 * about encryption context, see <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
 * >Encryption Context</a> in the <i>AWS Key Management Service Developer
 * Guide</i>.
 * </p>
 */
public class GrantConstraints implements Serializable {
    /**
     * <p>
     * Contains a list of key-value pairs, a subset of which must be present in
     * the encryption context of a subsequent operation permitted by the grant.
     * When a subsequent operation permitted by the grant includes an encryption
     * context that matches this list or is a subset of this list, the grant
     * allows the operation. Otherwise, the operation is not allowed.
     * </p>
     */
    private java.util.Map<String, String> encryptionContextSubset = new java.util.HashMap<String, String>();

    /**
     * <p>
     * Contains a list of key-value pairs that must be present in the encryption
     * context of a subsequent operation permitted by the grant. When a
     * subsequent operation permitted by the grant includes an encryption
     * context that matches this list, the grant allows the operation.
     * Otherwise, the operation is not allowed.
     * </p>
     */
    private java.util.Map<String, String> encryptionContextEquals = new java.util.HashMap<String, String>();

    /**
     * <p>
     * Contains a list of key-value pairs, a subset of which must be present in
     * the encryption context of a subsequent operation permitted by the grant.
     * When a subsequent operation permitted by the grant includes an encryption
     * context that matches this list or is a subset of this list, the grant
     * allows the operation. Otherwise, the operation is not allowed.
     * </p>
     *
     * @return <p>
     *         Contains a list of key-value pairs, a subset of which must be
     *         present in the encryption context of a subsequent operation
     *         permitted by the grant. When a subsequent operation permitted by
     *         the grant includes an encryption context that matches this list
     *         or is a subset of this list, the grant allows the operation.
     *         Otherwise, the operation is not allowed.
     *         </p>
     */
    public java.util.Map<String, String> getEncryptionContextSubset() {
        return encryptionContextSubset;
    }

    /**
     * <p>
     * Contains a list of key-value pairs, a subset of which must be present in
     * the encryption context of a subsequent operation permitted by the grant.
     * When a subsequent operation permitted by the grant includes an encryption
     * context that matches this list or is a subset of this list, the grant
     * allows the operation. Otherwise, the operation is not allowed.
     * </p>
     *
     * @param encryptionContextSubset <p>
     *            Contains a list of key-value pairs, a subset of which must be
     *            present in the encryption context of a subsequent operation
     *            permitted by the grant. When a subsequent operation permitted
     *            by the grant includes an encryption context that matches this
     *            list or is a subset of this list, the grant allows the
     *            operation. Otherwise, the operation is not allowed.
     *            </p>
     */
    public void setEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        this.encryptionContextSubset = encryptionContextSubset;
    }

    /**
     * <p>
     * Contains a list of key-value pairs, a subset of which must be present in
     * the encryption context of a subsequent operation permitted by the grant.
     * When a subsequent operation permitted by the grant includes an encryption
     * context that matches this list or is a subset of this list, the grant
     * allows the operation. Otherwise, the operation is not allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionContextSubset <p>
     *            Contains a list of key-value pairs, a subset of which must be
     *            present in the encryption context of a subsequent operation
     *            permitted by the grant. When a subsequent operation permitted
     *            by the grant includes an encryption context that matches this
     *            list or is a subset of this list, the grant allows the
     *            operation. Otherwise, the operation is not allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantConstraints withEncryptionContextSubset(
            java.util.Map<String, String> encryptionContextSubset) {
        this.encryptionContextSubset = encryptionContextSubset;
        return this;
    }

    /**
     * <p>
     * Contains a list of key-value pairs, a subset of which must be present in
     * the encryption context of a subsequent operation permitted by the grant.
     * When a subsequent operation permitted by the grant includes an encryption
     * context that matches this list or is a subset of this list, the grant
     * allows the operation. Otherwise, the operation is not allowed.
     * </p>
     * <p>
     * The method adds a new key-value pair into EncryptionContextSubset
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into EncryptionContextSubset.
     * @param value The corresponding value of the entry to be added into
     *            EncryptionContextSubset.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantConstraints addEncryptionContextSubsetEntry(String key, String value) {
        if (null == this.encryptionContextSubset) {
            this.encryptionContextSubset = new java.util.HashMap<String, String>();
        }
        if (this.encryptionContextSubset.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.encryptionContextSubset.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContextSubset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GrantConstraints clearEncryptionContextSubsetEntries() {
        this.encryptionContextSubset = null;
        return this;
    }

    /**
     * <p>
     * Contains a list of key-value pairs that must be present in the encryption
     * context of a subsequent operation permitted by the grant. When a
     * subsequent operation permitted by the grant includes an encryption
     * context that matches this list, the grant allows the operation.
     * Otherwise, the operation is not allowed.
     * </p>
     *
     * @return <p>
     *         Contains a list of key-value pairs that must be present in the
     *         encryption context of a subsequent operation permitted by the
     *         grant. When a subsequent operation permitted by the grant
     *         includes an encryption context that matches this list, the grant
     *         allows the operation. Otherwise, the operation is not allowed.
     *         </p>
     */
    public java.util.Map<String, String> getEncryptionContextEquals() {
        return encryptionContextEquals;
    }

    /**
     * <p>
     * Contains a list of key-value pairs that must be present in the encryption
     * context of a subsequent operation permitted by the grant. When a
     * subsequent operation permitted by the grant includes an encryption
     * context that matches this list, the grant allows the operation.
     * Otherwise, the operation is not allowed.
     * </p>
     *
     * @param encryptionContextEquals <p>
     *            Contains a list of key-value pairs that must be present in the
     *            encryption context of a subsequent operation permitted by the
     *            grant. When a subsequent operation permitted by the grant
     *            includes an encryption context that matches this list, the
     *            grant allows the operation. Otherwise, the operation is not
     *            allowed.
     *            </p>
     */
    public void setEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        this.encryptionContextEquals = encryptionContextEquals;
    }

    /**
     * <p>
     * Contains a list of key-value pairs that must be present in the encryption
     * context of a subsequent operation permitted by the grant. When a
     * subsequent operation permitted by the grant includes an encryption
     * context that matches this list, the grant allows the operation.
     * Otherwise, the operation is not allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionContextEquals <p>
     *            Contains a list of key-value pairs that must be present in the
     *            encryption context of a subsequent operation permitted by the
     *            grant. When a subsequent operation permitted by the grant
     *            includes an encryption context that matches this list, the
     *            grant allows the operation. Otherwise, the operation is not
     *            allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantConstraints withEncryptionContextEquals(
            java.util.Map<String, String> encryptionContextEquals) {
        this.encryptionContextEquals = encryptionContextEquals;
        return this;
    }

    /**
     * <p>
     * Contains a list of key-value pairs that must be present in the encryption
     * context of a subsequent operation permitted by the grant. When a
     * subsequent operation permitted by the grant includes an encryption
     * context that matches this list, the grant allows the operation.
     * Otherwise, the operation is not allowed.
     * </p>
     * <p>
     * The method adds a new key-value pair into EncryptionContextEquals
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into EncryptionContextEquals.
     * @param value The corresponding value of the entry to be added into
     *            EncryptionContextEquals.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantConstraints addEncryptionContextEqualsEntry(String key, String value) {
        if (null == this.encryptionContextEquals) {
            this.encryptionContextEquals = new java.util.HashMap<String, String>();
        }
        if (this.encryptionContextEquals.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.encryptionContextEquals.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContextEquals.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GrantConstraints clearEncryptionContextEqualsEntries() {
        this.encryptionContextEquals = null;
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
        if (getEncryptionContextSubset() != null)
            sb.append("EncryptionContextSubset: " + getEncryptionContextSubset() + ",");
        if (getEncryptionContextEquals() != null)
            sb.append("EncryptionContextEquals: " + getEncryptionContextEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEncryptionContextSubset() == null) ? 0 : getEncryptionContextSubset()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionContextEquals() == null) ? 0 : getEncryptionContextEquals()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantConstraints == false)
            return false;
        GrantConstraints other = (GrantConstraints) obj;

        if (other.getEncryptionContextSubset() == null ^ this.getEncryptionContextSubset() == null)
            return false;
        if (other.getEncryptionContextSubset() != null
                && other.getEncryptionContextSubset().equals(this.getEncryptionContextSubset()) == false)
            return false;
        if (other.getEncryptionContextEquals() == null ^ this.getEncryptionContextEquals() == null)
            return false;
        if (other.getEncryptionContextEquals() != null
                && other.getEncryptionContextEquals().equals(this.getEncryptionContextEquals()) == false)
            return false;
        return true;
    }
}
