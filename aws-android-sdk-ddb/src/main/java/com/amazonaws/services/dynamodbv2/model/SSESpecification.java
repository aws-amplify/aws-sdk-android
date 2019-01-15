/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the settings used to enable server-side encryption.
 * </p>
 */
public class SSESpecification implements Serializable {
    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled
     * (false) on the table.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management
     * Service. (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     */
    private String sSEType;

    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To
     * specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or
     * alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     */
    private String kMSMasterKeyId;

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @return <p>
     *         Indicates whether server-side encryption is enabled (true) or
     *         disabled (false) on the table.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @return <p>
     *         Indicates whether server-side encryption is enabled (true) or
     *         disabled (false) on the table.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether server-side encryption is enabled (true) or
     *            disabled (false) on the table.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether server-side encryption is enabled (true) or disabled
     * (false) on the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether server-side encryption is enabled (true) or
     *            disabled (false) on the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSESpecification withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management
     * Service. (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @return <p>
     *         Server-side encryption type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AES256</code> - Server-side encryption which uses the
     *         AES256 algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS</code> - Server-side encryption which uses AWS Key
     *         Management Service. (default)
     *         </p>
     *         </li>
     *         </ul>
     * @see SSEType
     */
    public String getSSEType() {
        return sSEType;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management
     * Service. (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEType <p>
     *            Server-side encryption type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AES256</code> - Server-side encryption which uses the
     *            AES256 algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code> - Server-side encryption which uses AWS Key
     *            Management Service. (default)
     *            </p>
     *            </li>
     *            </ul>
     * @see SSEType
     */
    public void setSSEType(String sSEType) {
        this.sSEType = sSEType;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management
     * Service. (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEType <p>
     *            Server-side encryption type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AES256</code> - Server-side encryption which uses the
     *            AES256 algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code> - Server-side encryption which uses AWS Key
     *            Management Service. (default)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSEType
     */
    public SSESpecification withSSEType(String sSEType) {
        this.sSEType = sSEType;
        return this;
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management
     * Service. (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEType <p>
     *            Server-side encryption type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AES256</code> - Server-side encryption which uses the
     *            AES256 algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code> - Server-side encryption which uses AWS Key
     *            Management Service. (default)
     *            </p>
     *            </li>
     *            </ul>
     * @see SSEType
     */
    public void setSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
    }

    /**
     * <p>
     * Server-side encryption type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - Server-side encryption which uses the AES256
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption which uses AWS Key Management
     * Service. (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEType <p>
     *            Server-side encryption type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AES256</code> - Server-side encryption which uses the
     *            AES256 algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code> - Server-side encryption which uses AWS Key
     *            Management Service. (default)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSEType
     */
    public SSESpecification withSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
        return this;
    }

    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To
     * specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or
     * alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     *
     * @return <p>
     *         The KMS Master Key (CMK) which should be used for the KMS
     *         encryption. To specify a CMK, use its key ID, Amazon Resource
     *         Name (ARN), alias name, or alias ARN. Note that you should only
     *         provide this parameter if the key is different from the default
     *         DynamoDB KMS Master Key alias/aws/dynamodb.
     *         </p>
     */
    public String getKMSMasterKeyId() {
        return kMSMasterKeyId;
    }

    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To
     * specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or
     * alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     *
     * @param kMSMasterKeyId <p>
     *            The KMS Master Key (CMK) which should be used for the KMS
     *            encryption. To specify a CMK, use its key ID, Amazon Resource
     *            Name (ARN), alias name, or alias ARN. Note that you should
     *            only provide this parameter if the key is different from the
     *            default DynamoDB KMS Master Key alias/aws/dynamodb.
     *            </p>
     */
    public void setKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    /**
     * <p>
     * The KMS Master Key (CMK) which should be used for the KMS encryption. To
     * specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or
     * alias ARN. Note that you should only provide this parameter if the key is
     * different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSMasterKeyId <p>
     *            The KMS Master Key (CMK) which should be used for the KMS
     *            encryption. To specify a CMK, use its key ID, Amazon Resource
     *            Name (ARN), alias name, or alias ARN. Note that you should
     *            only provide this parameter if the key is different from the
     *            default DynamoDB KMS Master Key alias/aws/dynamodb.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSESpecification withKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getSSEType() != null)
            sb.append("SSEType: " + getSSEType() + ",");
        if (getKMSMasterKeyId() != null)
            sb.append("KMSMasterKeyId: " + getKMSMasterKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSSEType() == null) ? 0 : getSSEType().hashCode());
        hashCode = prime * hashCode
                + ((getKMSMasterKeyId() == null) ? 0 : getKMSMasterKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSESpecification == false)
            return false;
        SSESpecification other = (SSESpecification) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSSEType() == null ^ this.getSSEType() == null)
            return false;
        if (other.getSSEType() != null && other.getSSEType().equals(this.getSSEType()) == false)
            return false;
        if (other.getKMSMasterKeyId() == null ^ this.getKMSMasterKeyId() == null)
            return false;
        if (other.getKMSMasterKeyId() != null
                && other.getKMSMasterKeyId().equals(this.getKMSMasterKeyId()) == false)
            return false;
        return true;
    }
}
