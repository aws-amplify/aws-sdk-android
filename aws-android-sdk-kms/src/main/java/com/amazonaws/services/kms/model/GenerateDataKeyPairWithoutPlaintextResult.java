/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class GenerateDataKeyPairWithoutPlaintextResult implements Serializable {
    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer privateKeyCiphertextBlob;

    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     */
    private java.nio.ByteBuffer publicKey;

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the private key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     */
    private String keyPairSpec;

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The encrypted copy of the private key. When you use the HTTP API
     *         or the Amazon Web Services CLI, the value is Base64-encoded.
     *         Otherwise, it is not Base64-encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getPrivateKeyCiphertextBlob() {
        return privateKeyCiphertextBlob;
    }

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param privateKeyCiphertextBlob <p>
     *            The encrypted copy of the private key. When you use the HTTP
     *            API or the Amazon Web Services CLI, the value is
     *            Base64-encoded. Otherwise, it is not Base64-encoded.
     *            </p>
     */
    public void setPrivateKeyCiphertextBlob(java.nio.ByteBuffer privateKeyCiphertextBlob) {
        this.privateKeyCiphertextBlob = privateKeyCiphertextBlob;
    }

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param privateKeyCiphertextBlob <p>
     *            The encrypted copy of the private key. When you use the HTTP
     *            API or the Amazon Web Services CLI, the value is
     *            Base64-encoded. Otherwise, it is not Base64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyPairWithoutPlaintextResult withPrivateKeyCiphertextBlob(
            java.nio.ByteBuffer privateKeyCiphertextBlob) {
        this.privateKeyCiphertextBlob = privateKeyCiphertextBlob;
        return this;
    }

    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @return <p>
     *         The public key (in plaintext).
     *         </p>
     */
    public java.nio.ByteBuffer getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param publicKey <p>
     *            The public key (in plaintext).
     *            </p>
     */
    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param publicKey <p>
     *            The public key (in plaintext).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyPairWithoutPlaintextResult withPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the private key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *         >key ARN</a>) of the KMS key that encrypted the private key.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the private key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key that encrypted the private key.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the private key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key that encrypted the private key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyPairWithoutPlaintextResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @return <p>
     *         The type of data key pair that was generated.
     *         </p>
     * @see DataKeyPairSpec
     */
    public String getKeyPairSpec() {
        return keyPairSpec;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            The type of data key pair that was generated.
     *            </p>
     * @see DataKeyPairSpec
     */
    public void setKeyPairSpec(String keyPairSpec) {
        this.keyPairSpec = keyPairSpec;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            The type of data key pair that was generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataKeyPairSpec
     */
    public GenerateDataKeyPairWithoutPlaintextResult withKeyPairSpec(String keyPairSpec) {
        this.keyPairSpec = keyPairSpec;
        return this;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            The type of data key pair that was generated.
     *            </p>
     * @see DataKeyPairSpec
     */
    public void setKeyPairSpec(DataKeyPairSpec keyPairSpec) {
        this.keyPairSpec = keyPairSpec.toString();
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            The type of data key pair that was generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataKeyPairSpec
     */
    public GenerateDataKeyPairWithoutPlaintextResult withKeyPairSpec(DataKeyPairSpec keyPairSpec) {
        this.keyPairSpec = keyPairSpec.toString();
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
        if (getPrivateKeyCiphertextBlob() != null)
            sb.append("PrivateKeyCiphertextBlob: " + getPrivateKeyCiphertextBlob() + ",");
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getKeyPairSpec() != null)
            sb.append("KeyPairSpec: " + getKeyPairSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPrivateKeyCiphertextBlob() == null) ? 0 : getPrivateKeyCiphertextBlob()
                        .hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getKeyPairSpec() == null) ? 0 : getKeyPairSpec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataKeyPairWithoutPlaintextResult == false)
            return false;
        GenerateDataKeyPairWithoutPlaintextResult other = (GenerateDataKeyPairWithoutPlaintextResult) obj;

        if (other.getPrivateKeyCiphertextBlob() == null
                ^ this.getPrivateKeyCiphertextBlob() == null)
            return false;
        if (other.getPrivateKeyCiphertextBlob() != null
                && other.getPrivateKeyCiphertextBlob().equals(this.getPrivateKeyCiphertextBlob()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyPairSpec() == null ^ this.getKeyPairSpec() == null)
            return false;
        if (other.getKeyPairSpec() != null
                && other.getKeyPairSpec().equals(this.getKeyPairSpec()) == false)
            return false;
        return true;
    }
}
