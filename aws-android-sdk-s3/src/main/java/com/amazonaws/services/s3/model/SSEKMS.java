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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
 * </p>
 */
public class SSEKMS implements Serializable {
    /**
     * <p>
     * Specifies the ID of the AWS Key Management Service (AWS KMS) symmetric
     * customer managed customer master key (CMK) to use for encrypting
     * inventory reports.
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * Specifies the ID of the AWS Key Management Service (AWS KMS) symmetric
     * customer managed customer master key (CMK) to use for encrypting
     * inventory reports.
     * </p>
     *
     * @return <p>
     *         Specifies the ID of the AWS Key Management Service (AWS KMS)
     *         symmetric customer managed customer master key (CMK) to use for
     *         encrypting inventory reports.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Specifies the ID of the AWS Key Management Service (AWS KMS) symmetric
     * customer managed customer master key (CMK) to use for encrypting
     * inventory reports.
     * </p>
     *
     * @param keyId <p>
     *            Specifies the ID of the AWS Key Management Service (AWS KMS)
     *            symmetric customer managed customer master key (CMK) to use
     *            for encrypting inventory reports.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Specifies the ID of the AWS Key Management Service (AWS KMS) symmetric
     * customer managed customer master key (CMK) to use for encrypting
     * inventory reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyId <p>
     *            Specifies the ID of the AWS Key Management Service (AWS KMS)
     *            symmetric customer managed customer master key (CMK) to use
     *            for encrypting inventory reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSEKMS withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSEKMS == false)
            return false;
        SSEKMS other = (SSEKMS) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
