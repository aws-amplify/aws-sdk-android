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
 * Includes encryption-related information, such as the AWS KMS key used for
 * encrypting data at rest and whether you want MSK to encrypt your data in
 * transit.
 * </p>
 */
public class EncryptionInfo implements Serializable {
    /**
     * 
     <p>
     * The data-volume encryption details.
     * </p>
     */
    private EncryptionAtRest encryptionAtRest;

    /**
     * 
     <p>
     * The details for encryption in transit.
     * </p>
     */
    private EncryptionInTransit encryptionInTransit;

    /**
     * 
     <p>
     * The data-volume encryption details.
     * </p>
     * 
     * @return <p>
     *         The data-volume encryption details.
     *         </p>
     */
    public EncryptionAtRest getEncryptionAtRest() {
        return encryptionAtRest;
    }

    /**
     * 
     <p>
     * The data-volume encryption details.
     * </p>
     * 
     * @param encryptionAtRest <p>
     *            The data-volume encryption details.
     *            </p>
     */
    public void setEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
    }

    /**
     * 
     <p>
     * The data-volume encryption details.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAtRest <p>
     *            The data-volume encryption details.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionInfo withEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
        return this;
    }

    /**
     * 
     <p>
     * The details for encryption in transit.
     * </p>
     * 
     * @return <p>
     *         The details for encryption in transit.
     *         </p>
     */
    public EncryptionInTransit getEncryptionInTransit() {
        return encryptionInTransit;
    }

    /**
     * 
     <p>
     * The details for encryption in transit.
     * </p>
     * 
     * @param encryptionInTransit <p>
     *            The details for encryption in transit.
     *            </p>
     */
    public void setEncryptionInTransit(EncryptionInTransit encryptionInTransit) {
        this.encryptionInTransit = encryptionInTransit;
    }

    /**
     * 
     <p>
     * The details for encryption in transit.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionInTransit <p>
     *            The details for encryption in transit.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionInfo withEncryptionInTransit(EncryptionInTransit encryptionInTransit) {
        this.encryptionInTransit = encryptionInTransit;
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
        if (getEncryptionAtRest() != null)
            sb.append("EncryptionAtRest: " + getEncryptionAtRest() + ",");
        if (getEncryptionInTransit() != null)
            sb.append("EncryptionInTransit: " + getEncryptionInTransit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncryptionAtRest() == null) ? 0 : getEncryptionAtRest().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionInTransit() == null) ? 0 : getEncryptionInTransit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionInfo == false)
            return false;
        EncryptionInfo other = (EncryptionInfo) obj;

        if (other.getEncryptionAtRest() == null ^ this.getEncryptionAtRest() == null)
            return false;
        if (other.getEncryptionAtRest() != null
                && other.getEncryptionAtRest().equals(this.getEncryptionAtRest()) == false)
            return false;
        if (other.getEncryptionInTransit() == null ^ this.getEncryptionInTransit() == null)
            return false;
        if (other.getEncryptionInTransit() != null
                && other.getEncryptionInTransit().equals(this.getEncryptionInTransit()) == false)
            return false;
        return true;
    }
}
