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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * If query results are encrypted in Amazon S3, indicates the encryption option
 * used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>) and key
 * information.
 * </p>
 */
public class EncryptionConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed
     * keys (<code>SSE-S3</code>), server-side encryption with KMS-managed keys
     * (<code>SSE-KMS</code>), or client-side encryption with KMS-managed keys
     * (CSE-KMS) is used.
     * </p>
     * <p>
     * If a query runs in a workgroup and the workgroup overrides client-side
     * settings, then the workgroup's setting for encryption is used. It
     * specifies whether query results must be encrypted, for all queries that
     * run in this workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_S3, SSE_KMS, CSE_KMS
     */
    private String encryptionOption;

    /**
     * <p>
     * For <code>SSE-KMS</code> and <code>CSE-KMS</code>, this is the KMS key
     * ARN or ID.
     * </p>
     */
    private String kmsKey;

    /**
     * <p>
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed
     * keys (<code>SSE-S3</code>), server-side encryption with KMS-managed keys
     * (<code>SSE-KMS</code>), or client-side encryption with KMS-managed keys
     * (CSE-KMS) is used.
     * </p>
     * <p>
     * If a query runs in a workgroup and the workgroup overrides client-side
     * settings, then the workgroup's setting for encryption is used. It
     * specifies whether query results must be encrypted, for all queries that
     * run in this workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_S3, SSE_KMS, CSE_KMS
     *
     * @return <p>
     *         Indicates whether Amazon S3 server-side encryption with Amazon
     *         S3-managed keys (<code>SSE-S3</code>), server-side encryption
     *         with KMS-managed keys (<code>SSE-KMS</code>), or client-side
     *         encryption with KMS-managed keys (CSE-KMS) is used.
     *         </p>
     *         <p>
     *         If a query runs in a workgroup and the workgroup overrides
     *         client-side settings, then the workgroup's setting for encryption
     *         is used. It specifies whether query results must be encrypted,
     *         for all queries that run in this workgroup.
     *         </p>
     * @see EncryptionOption
     */
    public String getEncryptionOption() {
        return encryptionOption;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed
     * keys (<code>SSE-S3</code>), server-side encryption with KMS-managed keys
     * (<code>SSE-KMS</code>), or client-side encryption with KMS-managed keys
     * (CSE-KMS) is used.
     * </p>
     * <p>
     * If a query runs in a workgroup and the workgroup overrides client-side
     * settings, then the workgroup's setting for encryption is used. It
     * specifies whether query results must be encrypted, for all queries that
     * run in this workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_S3, SSE_KMS, CSE_KMS
     *
     * @param encryptionOption <p>
     *            Indicates whether Amazon S3 server-side encryption with Amazon
     *            S3-managed keys (<code>SSE-S3</code>), server-side encryption
     *            with KMS-managed keys (<code>SSE-KMS</code>), or client-side
     *            encryption with KMS-managed keys (CSE-KMS) is used.
     *            </p>
     *            <p>
     *            If a query runs in a workgroup and the workgroup overrides
     *            client-side settings, then the workgroup's setting for
     *            encryption is used. It specifies whether query results must be
     *            encrypted, for all queries that run in this workgroup.
     *            </p>
     * @see EncryptionOption
     */
    public void setEncryptionOption(String encryptionOption) {
        this.encryptionOption = encryptionOption;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed
     * keys (<code>SSE-S3</code>), server-side encryption with KMS-managed keys
     * (<code>SSE-KMS</code>), or client-side encryption with KMS-managed keys
     * (CSE-KMS) is used.
     * </p>
     * <p>
     * If a query runs in a workgroup and the workgroup overrides client-side
     * settings, then the workgroup's setting for encryption is used. It
     * specifies whether query results must be encrypted, for all queries that
     * run in this workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_S3, SSE_KMS, CSE_KMS
     *
     * @param encryptionOption <p>
     *            Indicates whether Amazon S3 server-side encryption with Amazon
     *            S3-managed keys (<code>SSE-S3</code>), server-side encryption
     *            with KMS-managed keys (<code>SSE-KMS</code>), or client-side
     *            encryption with KMS-managed keys (CSE-KMS) is used.
     *            </p>
     *            <p>
     *            If a query runs in a workgroup and the workgroup overrides
     *            client-side settings, then the workgroup's setting for
     *            encryption is used. It specifies whether query results must be
     *            encrypted, for all queries that run in this workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionOption
     */
    public EncryptionConfiguration withEncryptionOption(String encryptionOption) {
        this.encryptionOption = encryptionOption;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed
     * keys (<code>SSE-S3</code>), server-side encryption with KMS-managed keys
     * (<code>SSE-KMS</code>), or client-side encryption with KMS-managed keys
     * (CSE-KMS) is used.
     * </p>
     * <p>
     * If a query runs in a workgroup and the workgroup overrides client-side
     * settings, then the workgroup's setting for encryption is used. It
     * specifies whether query results must be encrypted, for all queries that
     * run in this workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_S3, SSE_KMS, CSE_KMS
     *
     * @param encryptionOption <p>
     *            Indicates whether Amazon S3 server-side encryption with Amazon
     *            S3-managed keys (<code>SSE-S3</code>), server-side encryption
     *            with KMS-managed keys (<code>SSE-KMS</code>), or client-side
     *            encryption with KMS-managed keys (CSE-KMS) is used.
     *            </p>
     *            <p>
     *            If a query runs in a workgroup and the workgroup overrides
     *            client-side settings, then the workgroup's setting for
     *            encryption is used. It specifies whether query results must be
     *            encrypted, for all queries that run in this workgroup.
     *            </p>
     * @see EncryptionOption
     */
    public void setEncryptionOption(EncryptionOption encryptionOption) {
        this.encryptionOption = encryptionOption.toString();
    }

    /**
     * <p>
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed
     * keys (<code>SSE-S3</code>), server-side encryption with KMS-managed keys
     * (<code>SSE-KMS</code>), or client-side encryption with KMS-managed keys
     * (CSE-KMS) is used.
     * </p>
     * <p>
     * If a query runs in a workgroup and the workgroup overrides client-side
     * settings, then the workgroup's setting for encryption is used. It
     * specifies whether query results must be encrypted, for all queries that
     * run in this workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_S3, SSE_KMS, CSE_KMS
     *
     * @param encryptionOption <p>
     *            Indicates whether Amazon S3 server-side encryption with Amazon
     *            S3-managed keys (<code>SSE-S3</code>), server-side encryption
     *            with KMS-managed keys (<code>SSE-KMS</code>), or client-side
     *            encryption with KMS-managed keys (CSE-KMS) is used.
     *            </p>
     *            <p>
     *            If a query runs in a workgroup and the workgroup overrides
     *            client-side settings, then the workgroup's setting for
     *            encryption is used. It specifies whether query results must be
     *            encrypted, for all queries that run in this workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionOption
     */
    public EncryptionConfiguration withEncryptionOption(EncryptionOption encryptionOption) {
        this.encryptionOption = encryptionOption.toString();
        return this;
    }

    /**
     * <p>
     * For <code>SSE-KMS</code> and <code>CSE-KMS</code>, this is the KMS key
     * ARN or ID.
     * </p>
     *
     * @return <p>
     *         For <code>SSE-KMS</code> and <code>CSE-KMS</code>, this is the
     *         KMS key ARN or ID.
     *         </p>
     */
    public String getKmsKey() {
        return kmsKey;
    }

    /**
     * <p>
     * For <code>SSE-KMS</code> and <code>CSE-KMS</code>, this is the KMS key
     * ARN or ID.
     * </p>
     *
     * @param kmsKey <p>
     *            For <code>SSE-KMS</code> and <code>CSE-KMS</code>, this is the
     *            KMS key ARN or ID.
     *            </p>
     */
    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * For <code>SSE-KMS</code> and <code>CSE-KMS</code>, this is the KMS key
     * ARN or ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKey <p>
     *            For <code>SSE-KMS</code> and <code>CSE-KMS</code>, this is the
     *            KMS key ARN or ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionConfiguration withKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
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
        if (getEncryptionOption() != null)
            sb.append("EncryptionOption: " + getEncryptionOption() + ",");
        if (getKmsKey() != null)
            sb.append("KmsKey: " + getKmsKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncryptionOption() == null) ? 0 : getEncryptionOption().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
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

        if (other.getEncryptionOption() == null ^ this.getEncryptionOption() == null)
            return false;
        if (other.getEncryptionOption() != null
                && other.getEncryptionOption().equals(this.getEncryptionOption()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        return true;
    }
}
