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
 * Specifies encryption-related information for an Amazon S3 bucket that is a
 * destination for replicated objects.
 * </p>
 */
public class EncryptionConfiguration implements Serializable {
    /**
     * <p>
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer
     * master key (CMK) stored in AWS Key Management Service (KMS) for the
     * destination bucket. Amazon S3 uses this key to encrypt replica objects.
     * Amazon S3 only supports symmetric customer managed CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     */
    private String replicaKmsKeyID;

    /**
     * <p>
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer
     * master key (CMK) stored in AWS Key Management Service (KMS) for the
     * destination bucket. Amazon S3 uses this key to encrypt replica objects.
     * Amazon S3 only supports symmetric customer managed CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the ID (Key ARN or Alias ARN) of the customer managed
     *         customer master key (CMK) stored in AWS Key Management Service
     *         (KMS) for the destination bucket. Amazon S3 uses this key to
     *         encrypt replica objects. Amazon S3 only supports symmetric
     *         customer managed CMKs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *         >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     *         </p>
     */
    public String getReplicaKmsKeyID() {
        return replicaKmsKeyID;
    }

    /**
     * <p>
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer
     * master key (CMK) stored in AWS Key Management Service (KMS) for the
     * destination bucket. Amazon S3 uses this key to encrypt replica objects.
     * Amazon S3 only supports symmetric customer managed CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     *
     * @param replicaKmsKeyID <p>
     *            Specifies the ID (Key ARN or Alias ARN) of the customer
     *            managed customer master key (CMK) stored in AWS Key Management
     *            Service (KMS) for the destination bucket. Amazon S3 uses this
     *            key to encrypt replica objects. Amazon S3 only supports
     *            symmetric customer managed CMKs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     */
    public void setReplicaKmsKeyID(String replicaKmsKeyID) {
        this.replicaKmsKeyID = replicaKmsKeyID;
    }

    /**
     * <p>
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer
     * master key (CMK) stored in AWS Key Management Service (KMS) for the
     * destination bucket. Amazon S3 uses this key to encrypt replica objects.
     * Amazon S3 only supports symmetric customer managed CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaKmsKeyID <p>
     *            Specifies the ID (Key ARN or Alias ARN) of the customer
     *            managed customer master key (CMK) stored in AWS Key Management
     *            Service (KMS) for the destination bucket. Amazon S3 uses this
     *            key to encrypt replica objects. Amazon S3 only supports
     *            symmetric customer managed CMKs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionConfiguration withReplicaKmsKeyID(String replicaKmsKeyID) {
        this.replicaKmsKeyID = replicaKmsKeyID;
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
        if (getReplicaKmsKeyID() != null)
            sb.append("ReplicaKmsKeyID: " + getReplicaKmsKeyID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicaKmsKeyID() == null) ? 0 : getReplicaKmsKeyID().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfiguration == false)
            return false;
        EncryptionConfiguration other = (EncryptionConfiguration) obj;

        if (other.getReplicaKmsKeyID() == null ^ this.getReplicaKmsKeyID() == null)
            return false;
        if (other.getReplicaKmsKeyID() != null
                && other.getReplicaKmsKeyID().equals(this.getReplicaKmsKeyID()) == false)
            return false;
        return true;
    }
}
