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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a key pair.
 * </p>
 */
public class CreateKeyPairResult implements Serializable {
    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     */
    private String keyFingerprint;

    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     */
    private String keyMaterial;

    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     */
    private String keyPairId;

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     *
     * @return <p>
     *         The SHA-1 digest of the DER encoded private key.
     *         </p>
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     *
     * @param keyFingerprint <p>
     *            The SHA-1 digest of the DER encoded private key.
     *            </p>
     */
    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyFingerprint <p>
     *            The SHA-1 digest of the DER encoded private key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyPairResult withKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
        return this;
    }

    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     *
     * @return <p>
     *         An unencrypted PEM encoded RSA private key.
     *         </p>
     */
    public String getKeyMaterial() {
        return keyMaterial;
    }

    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     *
     * @param keyMaterial <p>
     *            An unencrypted PEM encoded RSA private key.
     *            </p>
     */
    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyMaterial <p>
     *            An unencrypted PEM encoded RSA private key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyPairResult withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     *
     * @return <p>
     *         The name of the key pair.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     *
     * @param keyName <p>
     *            The name of the key pair.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyName <p>
     *            The name of the key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyPairResult withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     *
     * @return <p>
     *         The ID of the key pair.
     *         </p>
     */
    public String getKeyPairId() {
        return keyPairId;
    }

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     *
     * @param keyPairId <p>
     *            The ID of the key pair.
     *            </p>
     */
    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairId <p>
     *            The ID of the key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyPairResult withKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     *
     * @return <p>
     *         Any tags applied to the key pair.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     *
     * @param tags <p>
     *            Any tags applied to the key pair.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags applied to the key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyPairResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags applied to the key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyPairResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getKeyFingerprint() != null)
            sb.append("KeyFingerprint: " + getKeyFingerprint() + ",");
        if (getKeyMaterial() != null)
            sb.append("KeyMaterial: " + getKeyMaterial() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getKeyPairId() != null)
            sb.append("KeyPairId: " + getKeyPairId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode());
        hashCode = prime * hashCode
                + ((getKeyMaterial() == null) ? 0 : getKeyMaterial().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getKeyPairId() == null) ? 0 : getKeyPairId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyPairResult == false)
            return false;
        CreateKeyPairResult other = (CreateKeyPairResult) obj;

        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null
                && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
            return false;
        if (other.getKeyMaterial() == null ^ this.getKeyMaterial() == null)
            return false;
        if (other.getKeyMaterial() != null
                && other.getKeyMaterial().equals(this.getKeyMaterial()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getKeyPairId() == null ^ this.getKeyPairId() == null)
            return false;
        if (other.getKeyPairId() != null
                && other.getKeyPairId().equals(this.getKeyPairId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
