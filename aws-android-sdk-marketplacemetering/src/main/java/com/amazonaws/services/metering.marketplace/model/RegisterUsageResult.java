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

package com.amazonaws.services.metering.marketplace.model;

import java.io.Serializable;

public class RegisterUsageResult implements Serializable {
    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     */
    private java.util.Date publicKeyRotationTimestamp;

    /**
     * <p>
     * JWT Token
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String signature;

    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     *
     * @return <p>
     *         (Optional) Only included when public key version has expired
     *         </p>
     */
    public java.util.Date getPublicKeyRotationTimestamp() {
        return publicKeyRotationTimestamp;
    }

    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     *
     * @param publicKeyRotationTimestamp <p>
     *            (Optional) Only included when public key version has expired
     *            </p>
     */
    public void setPublicKeyRotationTimestamp(java.util.Date publicKeyRotationTimestamp) {
        this.publicKeyRotationTimestamp = publicKeyRotationTimestamp;
    }

    /**
     * <p>
     * (Optional) Only included when public key version has expired
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKeyRotationTimestamp <p>
     *            (Optional) Only included when public key version has expired
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUsageResult withPublicKeyRotationTimestamp(
            java.util.Date publicKeyRotationTimestamp) {
        this.publicKeyRotationTimestamp = publicKeyRotationTimestamp;
        return this;
    }

    /**
     * <p>
     * JWT Token
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         JWT Token
     *         </p>
     */
    public String getSignature() {
        return signature;
    }

    /**
     * <p>
     * JWT Token
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param signature <p>
     *            JWT Token
     *            </p>
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * JWT Token
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param signature <p>
     *            JWT Token
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUsageResult withSignature(String signature) {
        this.signature = signature;
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
        if (getPublicKeyRotationTimestamp() != null)
            sb.append("PublicKeyRotationTimestamp: " + getPublicKeyRotationTimestamp() + ",");
        if (getSignature() != null)
            sb.append("Signature: " + getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPublicKeyRotationTimestamp() == null) ? 0 : getPublicKeyRotationTimestamp()
                        .hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterUsageResult == false)
            return false;
        RegisterUsageResult other = (RegisterUsageResult) obj;

        if (other.getPublicKeyRotationTimestamp() == null
                ^ this.getPublicKeyRotationTimestamp() == null)
            return false;
        if (other.getPublicKeyRotationTimestamp() != null
                && other.getPublicKeyRotationTimestamp().equals(
                        this.getPublicKeyRotationTimestamp()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null
                && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
    }
}
