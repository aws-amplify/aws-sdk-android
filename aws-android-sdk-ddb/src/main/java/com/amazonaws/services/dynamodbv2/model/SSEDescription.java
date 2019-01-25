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
 * The description of the server-side encryption status on the specified table.
 * </p>
 */
public class SSEDescription implements Serializable {
    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, UPDATING
     */
    private String status;

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
     * Service.
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
     * The KMS master key ARN used for the KMS encryption.
     * </p>
     */
    private String kMSMasterKeyArn;

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, UPDATING
     *
     * @return <p>
     *         The current state of server-side encryption:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLING</code> - Server-side encryption is being enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Server-side encryption is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLING</code> - Server-side encryption is being
     *         disabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - Server-side encryption is disabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - Server-side encryption is being updated.
     *         </p>
     *         </li>
     *         </ul>
     * @see SSEStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, UPDATING
     *
     * @param status <p>
     *            The current state of server-side encryption:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Server-side encryption is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Server-side encryption is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLING</code> - Server-side encryption is being
     *            disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Server-side encryption is disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Server-side encryption is being
     *            updated.
     *            </p>
     *            </li>
     *            </ul>
     * @see SSEStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, UPDATING
     *
     * @param status <p>
     *            The current state of server-side encryption:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Server-side encryption is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Server-side encryption is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLING</code> - Server-side encryption is being
     *            disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Server-side encryption is disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Server-side encryption is being
     *            updated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSEStatus
     */
    public SSEDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, UPDATING
     *
     * @param status <p>
     *            The current state of server-side encryption:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Server-side encryption is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Server-side encryption is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLING</code> - Server-side encryption is being
     *            disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Server-side encryption is disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Server-side encryption is being
     *            updated.
     *            </p>
     *            </li>
     *            </ul>
     * @see SSEStatus
     */
    public void setStatus(SSEStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED, UPDATING
     *
     * @param status <p>
     *            The current state of server-side encryption:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLING</code> - Server-side encryption is being
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Server-side encryption is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLING</code> - Server-side encryption is being
     *            disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - Server-side encryption is disabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Server-side encryption is being
     *            updated.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSEStatus
     */
    public SSEDescription withStatus(SSEStatus status) {
        this.status = status.toString();
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
     * Service.
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
     *         Management Service.
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
     * Service.
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
     *            Management Service.
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
     * Service.
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
     *            Management Service.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSEType
     */
    public SSEDescription withSSEType(String sSEType) {
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
     * Service.
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
     *            Management Service.
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
     * Service.
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
     *            Management Service.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SSEType
     */
    public SSEDescription withSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
        return this;
    }

    /**
     * <p>
     * The KMS master key ARN used for the KMS encryption.
     * </p>
     *
     * @return <p>
     *         The KMS master key ARN used for the KMS encryption.
     *         </p>
     */
    public String getKMSMasterKeyArn() {
        return kMSMasterKeyArn;
    }

    /**
     * <p>
     * The KMS master key ARN used for the KMS encryption.
     * </p>
     *
     * @param kMSMasterKeyArn <p>
     *            The KMS master key ARN used for the KMS encryption.
     *            </p>
     */
    public void setKMSMasterKeyArn(String kMSMasterKeyArn) {
        this.kMSMasterKeyArn = kMSMasterKeyArn;
    }

    /**
     * <p>
     * The KMS master key ARN used for the KMS encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSMasterKeyArn <p>
     *            The KMS master key ARN used for the KMS encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSEDescription withKMSMasterKeyArn(String kMSMasterKeyArn) {
        this.kMSMasterKeyArn = kMSMasterKeyArn;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSSEType() != null)
            sb.append("SSEType: " + getSSEType() + ",");
        if (getKMSMasterKeyArn() != null)
            sb.append("KMSMasterKeyArn: " + getKMSMasterKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSSEType() == null) ? 0 : getSSEType().hashCode());
        hashCode = prime * hashCode
                + ((getKMSMasterKeyArn() == null) ? 0 : getKMSMasterKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSEDescription == false)
            return false;
        SSEDescription other = (SSEDescription) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSSEType() == null ^ this.getSSEType() == null)
            return false;
        if (other.getSSEType() != null && other.getSSEType().equals(this.getSSEType()) == false)
            return false;
        if (other.getKMSMasterKeyArn() == null ^ this.getKMSMasterKeyArn() == null)
            return false;
        if (other.getKMSMasterKeyArn() != null
                && other.getKMSMasterKeyArn().equals(this.getKMSMasterKeyArn()) == false)
            return false;
        return true;
    }
}
