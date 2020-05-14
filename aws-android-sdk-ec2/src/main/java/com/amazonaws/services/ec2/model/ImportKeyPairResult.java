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

public class ImportKeyPairResult implements Serializable {
    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     */
    private String keyFingerprint;

    /**
     * <p>
     * The key pair name you provided.
     * </p>
     */
    private String keyName;

    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     */
    private String keyPairId;

    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     *
     * @return <p>
     *         The MD5 public key fingerprint as specified in section 4 of RFC
     *         4716.
     *         </p>
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     *
     * @param keyFingerprint <p>
     *            The MD5 public key fingerprint as specified in section 4 of
     *            RFC 4716.
     *            </p>
     */
    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyFingerprint <p>
     *            The MD5 public key fingerprint as specified in section 4 of
     *            RFC 4716.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyPairResult withKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
        return this;
    }

    /**
     * <p>
     * The key pair name you provided.
     * </p>
     *
     * @return <p>
     *         The key pair name you provided.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The key pair name you provided.
     * </p>
     *
     * @param keyName <p>
     *            The key pair name you provided.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The key pair name you provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyName <p>
     *            The key pair name you provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyPairResult withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     *
     * @return <p>
     *         The ID of the resulting key pair.
     *         </p>
     */
    public String getKeyPairId() {
        return keyPairId;
    }

    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     *
     * @param keyPairId <p>
     *            The ID of the resulting key pair.
     *            </p>
     */
    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }

    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairId <p>
     *            The ID of the resulting key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyPairResult withKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }

    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     *
     * @return <p>
     *         The tags applied to the imported key pair.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     *
     * @param tags <p>
     *            The tags applied to the imported key pair.
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
     * The tags applied to the imported key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags applied to the imported key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyPairResult withTags(Tag... tags) {
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
     * The tags applied to the imported key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags applied to the imported key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyPairResult withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof ImportKeyPairResult == false)
            return false;
        ImportKeyPairResult other = (ImportKeyPairResult) obj;

        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null
                && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
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
