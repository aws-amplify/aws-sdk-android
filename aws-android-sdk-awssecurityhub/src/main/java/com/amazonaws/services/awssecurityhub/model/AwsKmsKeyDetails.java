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
 * Contains metadata about a customer master key (CMK).
 * </p>
 */
public class AwsKmsKeyDetails implements Serializable {
    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String aWSAccountId;

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     */
    private Double creationDate;

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String keyId;

    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer
     * managed or AWS managed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String keyManager;

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String keyState;

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key
     * material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * from your existing key management infrastructure or the CMK lacks key
     * material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String origin;

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The twelve-digit account ID of the AWS account that owns the CMK.
     *         </p>
     */
    public String getAWSAccountId() {
        return aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param aWSAccountId <p>
     *            The twelve-digit account ID of the AWS account that owns the
     *            CMK.
     *            </p>
     */
    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param aWSAccountId <p>
     *            The twelve-digit account ID of the AWS account that owns the
     *            CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsKmsKeyDetails withAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
        return this;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the CMK was created.
     *         </p>
     */
    public Double getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time when the CMK was created.
     *            </p>
     */
    public void setCreationDate(Double creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time when the CMK was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsKmsKeyDetails withCreationDate(Double creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The globally unique identifier for the CMK.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyId <p>
     *            The globally unique identifier for the CMK.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyId <p>
     *            The globally unique identifier for the CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsKmsKeyDetails withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer
     * managed or AWS managed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The manager of the CMK. CMKs in your AWS account are either
     *         customer managed or AWS managed.
     *         </p>
     */
    public String getKeyManager() {
        return keyManager;
    }

    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer
     * managed or AWS managed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyManager <p>
     *            The manager of the CMK. CMKs in your AWS account are either
     *            customer managed or AWS managed.
     *            </p>
     */
    public void setKeyManager(String keyManager) {
        this.keyManager = keyManager;
    }

    /**
     * <p>
     * The manager of the CMK. CMKs in your AWS account are either customer
     * managed or AWS managed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyManager <p>
     *            The manager of the CMK. CMKs in your AWS account are either
     *            customer managed or AWS managed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsKmsKeyDetails withKeyManager(String keyManager) {
        this.keyManager = keyManager;
        return this;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The state of the CMK.
     *         </p>
     */
    public String getKeyState() {
        return keyState;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyState <p>
     *            The state of the CMK.
     *            </p>
     */
    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyState <p>
     *            The state of the CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsKmsKeyDetails withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key
     * material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * from your existing key management infrastructure or the CMK lacks key
     * material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The source of the CMK's key material.
     *         </p>
     *         <p>
     *         When this value is <code>AWS_KMS</code>, AWS KMS created the key
     *         material.
     *         </p>
     *         <p>
     *         When this value is <code>EXTERNAL</code>, the key material was
     *         imported from your existing key management infrastructure or the
     *         CMK lacks key material.
     *         </p>
     *         <p>
     *         When this value is <code>AWS_CLOUDHSM</code>, the key material
     *         was created in the AWS CloudHSM cluster associated with a custom
     *         key store.
     *         </p>
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key
     * material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * from your existing key management infrastructure or the CMK lacks key
     * material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param origin <p>
     *            The source of the CMK's key material.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_KMS</code>, AWS KMS created the
     *            key material.
     *            </p>
     *            <p>
     *            When this value is <code>EXTERNAL</code>, the key material was
     *            imported from your existing key management infrastructure or
     *            the CMK lacks key material.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_CLOUDHSM</code>, the key material
     *            was created in the AWS CloudHSM cluster associated with a
     *            custom key store.
     *            </p>
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, AWS KMS created the key
     * material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * from your existing key management infrastructure or the CMK lacks key
     * material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param origin <p>
     *            The source of the CMK's key material.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_KMS</code>, AWS KMS created the
     *            key material.
     *            </p>
     *            <p>
     *            When this value is <code>EXTERNAL</code>, the key material was
     *            imported from your existing key management infrastructure or
     *            the CMK lacks key material.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_CLOUDHSM</code>, the key material
     *            was created in the AWS CloudHSM cluster associated with a
     *            custom key store.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsKmsKeyDetails withOrigin(String origin) {
        this.origin = origin;
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
        if (getAWSAccountId() != null)
            sb.append("AWSAccountId: " + getAWSAccountId() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getKeyManager() != null)
            sb.append("KeyManager: " + getKeyManager() + ",");
        if (getKeyState() != null)
            sb.append("KeyState: " + getKeyState() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getKeyManager() == null) ? 0 : getKeyManager().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsKmsKeyDetails == false)
            return false;
        AwsKmsKeyDetails other = (AwsKmsKeyDetails) obj;

        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null)
            return false;
        if (other.getAWSAccountId() != null
                && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyManager() == null ^ this.getKeyManager() == null)
            return false;
        if (other.getKeyManager() != null
                && other.getKeyManager().equals(this.getKeyManager()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        return true;
    }
}
