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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the items you need to import key material into a symmetric, customer
 * managed customer master key (CMK). For more information about importing key
 * material into AWS KMS, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
 * >Importing Key Material</a> in the <i>AWS Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * This operation returns a public key and an import token. Use the public key
 * to encrypt the symmetric key material. Store the import token to send with a
 * subsequent <a>ImportKeyMaterial</a> request.
 * </p>
 * <p>
 * You must specify the key ID of the symmetric CMK into which you will import
 * key material. This CMK's <code>Origin</code> must be <code>EXTERNAL</code>.
 * You must also specify the wrapping algorithm and type of wrapping key (public
 * key) that you will use to encrypt the key material. You cannot perform this
 * operation on an asymmetric CMK or on any CMK in a different AWS account.
 * </p>
 * <p>
 * To import key material, you must use the public key and import token from the
 * same response. These items are valid for 24 hours. The expiration date and
 * time appear in the <code>GetParametersForImport</code> response. You cannot
 * use an expired token in an <a>ImportKeyMaterial</a> request. If your key and
 * token expire, send another <code>GetParametersForImport</code> request.
 * </p>
 * <p>
 * The CMK that you use for this operation must be in a compatible key state.
 * For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
 * Management Service Developer Guide</i>.
 * </p>
 */
public class GetParametersForImportRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the symmetric CMK into which you will import key
     * material. The <code>Origin</code> of the CMK must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing
     * it with <a>ImportKeyMaterial</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     * >Encrypt the Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     */
    private String wrappingAlgorithm;

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only
     * 2048-bit RSA public keys are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048
     */
    private String wrappingKeySpec;

    /**
     * <p>
     * The identifier of the symmetric CMK into which you will import key
     * material. The <code>Origin</code> of the CMK must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The identifier of the symmetric CMK into which you will import
     *         key material. The <code>Origin</code> of the CMK must be
     *         <code>EXTERNAL</code>.
     *         </p>
     *         <p>
     *         Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     *         <a>DescribeKey</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The identifier of the symmetric CMK into which you will import key
     * material. The <code>Origin</code> of the CMK must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The identifier of the symmetric CMK into which you will import
     *            key material. The <code>Origin</code> of the CMK must be
     *            <code>EXTERNAL</code>.
     *            </p>
     *            <p>
     *            Specify the key ID or the Amazon Resource Name (ARN) of the
     *            CMK.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the symmetric CMK into which you will import key
     * material. The <code>Origin</code> of the CMK must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The identifier of the symmetric CMK into which you will import
     *            key material. The <code>Origin</code> of the CMK must be
     *            <code>EXTERNAL</code>.
     *            </p>
     *            <p>
     *            Specify the key ID or the Amazon Resource Name (ARN) of the
     *            CMK.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersForImportRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing
     * it with <a>ImportKeyMaterial</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     * >Encrypt the Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @return <p>
     *         The algorithm you will use to encrypt the key material before
     *         importing it with <a>ImportKeyMaterial</a>. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *         >Encrypt the Key Material</a> in the <i>AWS Key Management
     *         Service Developer Guide</i>.
     *         </p>
     * @see AlgorithmSpec
     */
    public String getWrappingAlgorithm() {
        return wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing
     * it with <a>ImportKeyMaterial</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     * >Encrypt the Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use to encrypt the key material before
     *            importing it with <a>ImportKeyMaterial</a>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *            >Encrypt the Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @see AlgorithmSpec
     */
    public void setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing
     * it with <a>ImportKeyMaterial</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     * >Encrypt the Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use to encrypt the key material before
     *            importing it with <a>ImportKeyMaterial</a>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *            >Encrypt the Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmSpec
     */
    public GetParametersForImportRequest withWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing
     * it with <a>ImportKeyMaterial</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     * >Encrypt the Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use to encrypt the key material before
     *            importing it with <a>ImportKeyMaterial</a>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *            >Encrypt the Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @see AlgorithmSpec
     */
    public void setWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm.toString();
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing
     * it with <a>ImportKeyMaterial</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     * >Encrypt the Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use to encrypt the key material before
     *            importing it with <a>ImportKeyMaterial</a>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *            >Encrypt the Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmSpec
     */
    public GetParametersForImportRequest withWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only
     * 2048-bit RSA public keys are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048
     *
     * @return <p>
     *         The type of wrapping key (public key) to return in the response.
     *         Only 2048-bit RSA public keys are supported.
     *         </p>
     * @see WrappingKeySpec
     */
    public String getWrappingKeySpec() {
        return wrappingKeySpec;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only
     * 2048-bit RSA public keys are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048
     *
     * @param wrappingKeySpec <p>
     *            The type of wrapping key (public key) to return in the
     *            response. Only 2048-bit RSA public keys are supported.
     *            </p>
     * @see WrappingKeySpec
     */
    public void setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only
     * 2048-bit RSA public keys are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048
     *
     * @param wrappingKeySpec <p>
     *            The type of wrapping key (public key) to return in the
     *            response. Only 2048-bit RSA public keys are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WrappingKeySpec
     */
    public GetParametersForImportRequest withWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only
     * 2048-bit RSA public keys are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048
     *
     * @param wrappingKeySpec <p>
     *            The type of wrapping key (public key) to return in the
     *            response. Only 2048-bit RSA public keys are supported.
     *            </p>
     * @see WrappingKeySpec
     */
    public void setWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec.toString();
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only
     * 2048-bit RSA public keys are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048
     *
     * @param wrappingKeySpec <p>
     *            The type of wrapping key (public key) to return in the
     *            response. Only 2048-bit RSA public keys are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WrappingKeySpec
     */
    public GetParametersForImportRequest withWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec.toString();
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
            sb.append("KeyId: " + getKeyId() + ",");
        if (getWrappingAlgorithm() != null)
            sb.append("WrappingAlgorithm: " + getWrappingAlgorithm() + ",");
        if (getWrappingKeySpec() != null)
            sb.append("WrappingKeySpec: " + getWrappingKeySpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getWrappingAlgorithm() == null) ? 0 : getWrappingAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getWrappingKeySpec() == null) ? 0 : getWrappingKeySpec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForImportRequest == false)
            return false;
        GetParametersForImportRequest other = (GetParametersForImportRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getWrappingAlgorithm() == null ^ this.getWrappingAlgorithm() == null)
            return false;
        if (other.getWrappingAlgorithm() != null
                && other.getWrappingAlgorithm().equals(this.getWrappingAlgorithm()) == false)
            return false;
        if (other.getWrappingKeySpec() == null ^ this.getWrappingKeySpec() == null)
            return false;
        if (other.getWrappingKeySpec() != null
                && other.getWrappingKeySpec().equals(this.getWrappingKeySpec()) == false)
            return false;
        return true;
    }
}
