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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Use this structure to allow <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
 * >cryptographic operations</a> in the grant only when the operation request
 * includes the specified <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
 * >encryption context</a>.
 * </p>
 * <p>
 * KMS applies the grant constraints only to cryptographic operations that
 * support an encryption context, that is, all cryptographic operations with a
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html#symmetric-cmks"
 * >symmetric KMS key</a>. Grant constraints are not applied to operations that
 * do not support an encryption context, such as cryptographic operations with
 * asymmetric KMS keys and management operations, such as <a>DescribeKey</a> or
 * <a>RetireGrant</a>.
 * </p>
 * <important>
 * <p>
 * In a cryptographic operation, the encryption context in the decryption
 * operation must be an exact, case-sensitive match for the keys and values in
 * the encryption context of the encryption operation. Only the order of the
 * pairs can vary.
 * </p>
 * <p>
 * However, in a grant constraint, the key in each key-value pair is not case
 * sensitive, but the value is case sensitive.
 * </p>
 * <p>
 * To avoid confusion, do not use multiple encryption context pairs that differ
 * only by case. To require a fully case-sensitive encryption context, use the
 * <code>kms:EncryptionContext:</code> and
 * <code>kms:EncryptionContextKeys</code> conditions in an IAM or key policy.
 * For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-context"
 * >kms:EncryptionContext:</a> in the <i> <i>Key Management Service Developer
 * Guide</i> </i>.
 * </p>
 * </important>
 */
public class GrantConstraints implements Serializable {
    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context
     * of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the cryptographic
     * operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include
     * additional key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> encryptionContextSubset = new java.util.HashMap<String, String>();

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the operation only
     * when the encryption context in the request is the same as the encryption
     * context specified in this constraint.
     * </p>
     */
    private java.util.Map<String, String> encryptionContextEquals = new java.util.HashMap<String, String>();

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context
     * of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the cryptographic
     * operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include
     * additional key-value pairs.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that must be included in the encryption
     *         context of the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operation</a> request. The grant allows the
     *         cryptographic operation only when the encryption context in the
     *         request includes the key-value pairs specified in this
     *         constraint, although it can include additional key-value pairs.
     *         </p>
     */
    public java.util.Map<String, String> getEncryptionContextSubset() {
        return encryptionContextSubset;
    }

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context
     * of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the cryptographic
     * operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include
     * additional key-value pairs.
     * </p>
     *
     * @param encryptionContextSubset <p>
     *            A list of key-value pairs that must be included in the
     *            encryption context of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operation</a> request. The grant allows the
     *            cryptographic operation only when the encryption context in
     *            the request includes the key-value pairs specified in this
     *            constraint, although it can include additional key-value
     *            pairs.
     *            </p>
     */
    public void setEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        this.encryptionContextSubset = encryptionContextSubset;
    }

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context
     * of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the cryptographic
     * operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include
     * additional key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionContextSubset <p>
     *            A list of key-value pairs that must be included in the
     *            encryption context of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operation</a> request. The grant allows the
     *            cryptographic operation only when the encryption context in
     *            the request includes the key-value pairs specified in this
     *            constraint, although it can include additional key-value
     *            pairs.
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
     * A list of key-value pairs that must be included in the encryption context
     * of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the cryptographic
     * operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include
     * additional key-value pairs.
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
     * A list of key-value pairs that must match the encryption context in the
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the operation only
     * when the encryption context in the request is the same as the encryption
     * context specified in this constraint.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that must match the encryption context
     *         in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operation</a> request. The grant allows the
     *         operation only when the encryption context in the request is the
     *         same as the encryption context specified in this constraint.
     *         </p>
     */
    public java.util.Map<String, String> getEncryptionContextEquals() {
        return encryptionContextEquals;
    }

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the operation only
     * when the encryption context in the request is the same as the encryption
     * context specified in this constraint.
     * </p>
     *
     * @param encryptionContextEquals <p>
     *            A list of key-value pairs that must match the encryption
     *            context in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operation</a> request. The grant allows the
     *            operation only when the encryption context in the request is
     *            the same as the encryption context specified in this
     *            constraint.
     *            </p>
     */
    public void setEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        this.encryptionContextEquals = encryptionContextEquals;
    }

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the operation only
     * when the encryption context in the request is the same as the encryption
     * context specified in this constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionContextEquals <p>
     *            A list of key-value pairs that must match the encryption
     *            context in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operation</a> request. The grant allows the
     *            operation only when the encryption context in the request is
     *            the same as the encryption context specified in this
     *            constraint.
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
     * A list of key-value pairs that must match the encryption context in the
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operation</a> request. The grant allows the operation only
     * when the encryption context in the request is the same as the encryption
     * context specified in this constraint.
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
