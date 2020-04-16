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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the default server-side encryption to apply to new objects in the
 * bucket.
 * </p>
 */
public class AwsS3BucketServerSideEncryptionByDefault implements Serializable {
    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sSEAlgorithm;

    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String kMSMasterKeyID;

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Server-side encryption algorithm to use for the default
     *         encryption.
     *         </p>
     */
    public String getSSEAlgorithm() {
        return sSEAlgorithm;
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sSEAlgorithm <p>
     *            Server-side encryption algorithm to use for the default
     *            encryption.
     *            </p>
     */
    public void setSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sSEAlgorithm <p>
     *            Server-side encryption algorithm to use for the default
     *            encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsS3BucketServerSideEncryptionByDefault withSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
        return this;
    }

    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         AWS KMS customer master key (CMK) ID to use for the default
     *         encryption.
     *         </p>
     */
    public String getKMSMasterKeyID() {
        return kMSMasterKeyID;
    }

    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kMSMasterKeyID <p>
     *            AWS KMS customer master key (CMK) ID to use for the default
     *            encryption.
     *            </p>
     */
    public void setKMSMasterKeyID(String kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
    }

    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kMSMasterKeyID <p>
     *            AWS KMS customer master key (CMK) ID to use for the default
     *            encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsS3BucketServerSideEncryptionByDefault withKMSMasterKeyID(String kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
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
        if (getSSEAlgorithm() != null)
            sb.append("SSEAlgorithm: " + getSSEAlgorithm() + ",");
        if (getKMSMasterKeyID() != null)
            sb.append("KMSMasterKeyID: " + getKMSMasterKeyID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSSEAlgorithm() == null) ? 0 : getSSEAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getKMSMasterKeyID() == null) ? 0 : getKMSMasterKeyID().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketServerSideEncryptionByDefault == false)
            return false;
        AwsS3BucketServerSideEncryptionByDefault other = (AwsS3BucketServerSideEncryptionByDefault) obj;

        if (other.getSSEAlgorithm() == null ^ this.getSSEAlgorithm() == null)
            return false;
        if (other.getSSEAlgorithm() != null
                && other.getSSEAlgorithm().equals(this.getSSEAlgorithm()) == false)
            return false;
        if (other.getKMSMasterKeyID() == null ^ this.getKMSMasterKeyID() == null)
            return false;
        if (other.getKMSMasterKeyID() != null
                && other.getKMSMasterKeyID().equals(this.getKMSMasterKeyID()) == false)
            return false;
        return true;
    }
}
