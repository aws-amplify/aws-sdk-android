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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * The data-volume encryption details.
 * </p>
 */
public class EncryptionAtRest implements Serializable {
    /**
     * 
     <p>
     * The ARN of the AWS KMS key for encrypting data at rest. If you don't
     * specify a KMS key, MSK creates one for you and uses it.
     * </p>
     */
    private String dataVolumeKMSKeyId;

    /**
     * 
     <p>
     * The ARN of the AWS KMS key for encrypting data at rest. If you don't
     * specify a KMS key, MSK creates one for you and uses it.
     * </p>
     * 
     * @return <p>
     *         The ARN of the AWS KMS key for encrypting data at rest. If you
     *         don't specify a KMS key, MSK creates one for you and uses it.
     *         </p>
     */
    public String getDataVolumeKMSKeyId() {
        return dataVolumeKMSKeyId;
    }

    /**
     * 
     <p>
     * The ARN of the AWS KMS key for encrypting data at rest. If you don't
     * specify a KMS key, MSK creates one for you and uses it.
     * </p>
     * 
     * @param dataVolumeKMSKeyId <p>
     *            The ARN of the AWS KMS key for encrypting data at rest. If you
     *            don't specify a KMS key, MSK creates one for you and uses it.
     *            </p>
     */
    public void setDataVolumeKMSKeyId(String dataVolumeKMSKeyId) {
        this.dataVolumeKMSKeyId = dataVolumeKMSKeyId;
    }

    /**
     * 
     <p>
     * The ARN of the AWS KMS key for encrypting data at rest. If you don't
     * specify a KMS key, MSK creates one for you and uses it.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataVolumeKMSKeyId <p>
     *            The ARN of the AWS KMS key for encrypting data at rest. If you
     *            don't specify a KMS key, MSK creates one for you and uses it.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionAtRest withDataVolumeKMSKeyId(String dataVolumeKMSKeyId) {
        this.dataVolumeKMSKeyId = dataVolumeKMSKeyId;
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
        if (getDataVolumeKMSKeyId() != null)
            sb.append("DataVolumeKMSKeyId: " + getDataVolumeKMSKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataVolumeKMSKeyId() == null) ? 0 : getDataVolumeKMSKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionAtRest == false)
            return false;
        EncryptionAtRest other = (EncryptionAtRest) obj;

        if (other.getDataVolumeKMSKeyId() == null ^ this.getDataVolumeKMSKeyId() == null)
            return false;
        if (other.getDataVolumeKMSKeyId() != null
                && other.getDataVolumeKMSKeyId().equals(this.getDataVolumeKMSKeyId()) == false)
            return false;
        return true;
    }
}
