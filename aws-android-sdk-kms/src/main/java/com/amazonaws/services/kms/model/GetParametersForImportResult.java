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

public class GetParametersForImportResult implements Serializable {
    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a>
     * request. This is the same CMK specified in the
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a>
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer importToken;

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it
     * with <a>ImportKeyMaterial</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer publicKey;

    /**
     * <p>
     * The time at which the import token and public key are no longer valid.
     * After this time, you cannot use them to make an <a>ImportKeyMaterial</a>
     * request and you must send another <code>GetParametersForImport</code>
     * request to get new ones.
     * </p>
     */
    private java.util.Date parametersValidTo;

    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a>
     * request. This is the same CMK specified in the
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The identifier of the CMK to use in a subsequent
     *         <a>ImportKeyMaterial</a> request. This is the same CMK specified
     *         in the <code>GetParametersForImport</code> request.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a>
     * request. This is the same CMK specified in the
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The identifier of the CMK to use in a subsequent
     *            <a>ImportKeyMaterial</a> request. This is the same CMK
     *            specified in the <code>GetParametersForImport</code> request.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a>
     * request. This is the same CMK specified in the
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The identifier of the CMK to use in a subsequent
     *            <a>ImportKeyMaterial</a> request. This is the same CMK
     *            specified in the <code>GetParametersForImport</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersForImportResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a>
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The import token to send in a subsequent <a>ImportKeyMaterial</a>
     *         request.
     *         </p>
     */
    public java.nio.ByteBuffer getImportToken() {
        return importToken;
    }

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a>
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param importToken <p>
     *            The import token to send in a subsequent
     *            <a>ImportKeyMaterial</a> request.
     *            </p>
     */
    public void setImportToken(java.nio.ByteBuffer importToken) {
        this.importToken = importToken;
    }

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a>
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param importToken <p>
     *            The import token to send in a subsequent
     *            <a>ImportKeyMaterial</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersForImportResult withImportToken(java.nio.ByteBuffer importToken) {
        this.importToken = importToken;
        return this;
    }

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it
     * with <a>ImportKeyMaterial</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The public key to use to encrypt the key material before
     *         importing it with <a>ImportKeyMaterial</a>.
     *         </p>
     */
    public java.nio.ByteBuffer getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it
     * with <a>ImportKeyMaterial</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param publicKey <p>
     *            The public key to use to encrypt the key material before
     *            importing it with <a>ImportKeyMaterial</a>.
     *            </p>
     */
    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it
     * with <a>ImportKeyMaterial</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param publicKey <p>
     *            The public key to use to encrypt the key material before
     *            importing it with <a>ImportKeyMaterial</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersForImportResult withPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * <p>
     * The time at which the import token and public key are no longer valid.
     * After this time, you cannot use them to make an <a>ImportKeyMaterial</a>
     * request and you must send another <code>GetParametersForImport</code>
     * request to get new ones.
     * </p>
     *
     * @return <p>
     *         The time at which the import token and public key are no longer
     *         valid. After this time, you cannot use them to make an
     *         <a>ImportKeyMaterial</a> request and you must send another
     *         <code>GetParametersForImport</code> request to get new ones.
     *         </p>
     */
    public java.util.Date getParametersValidTo() {
        return parametersValidTo;
    }

    /**
     * <p>
     * The time at which the import token and public key are no longer valid.
     * After this time, you cannot use them to make an <a>ImportKeyMaterial</a>
     * request and you must send another <code>GetParametersForImport</code>
     * request to get new ones.
     * </p>
     *
     * @param parametersValidTo <p>
     *            The time at which the import token and public key are no
     *            longer valid. After this time, you cannot use them to make an
     *            <a>ImportKeyMaterial</a> request and you must send another
     *            <code>GetParametersForImport</code> request to get new ones.
     *            </p>
     */
    public void setParametersValidTo(java.util.Date parametersValidTo) {
        this.parametersValidTo = parametersValidTo;
    }

    /**
     * <p>
     * The time at which the import token and public key are no longer valid.
     * After this time, you cannot use them to make an <a>ImportKeyMaterial</a>
     * request and you must send another <code>GetParametersForImport</code>
     * request to get new ones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parametersValidTo <p>
     *            The time at which the import token and public key are no
     *            longer valid. After this time, you cannot use them to make an
     *            <a>ImportKeyMaterial</a> request and you must send another
     *            <code>GetParametersForImport</code> request to get new ones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersForImportResult withParametersValidTo(java.util.Date parametersValidTo) {
        this.parametersValidTo = parametersValidTo;
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
        if (getImportToken() != null)
            sb.append("ImportToken: " + getImportToken() + ",");
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getParametersValidTo() != null)
            sb.append("ParametersValidTo: " + getParametersValidTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getImportToken() == null) ? 0 : getImportToken().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode
                + ((getParametersValidTo() == null) ? 0 : getParametersValidTo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForImportResult == false)
            return false;
        GetParametersForImportResult other = (GetParametersForImportResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getImportToken() == null ^ this.getImportToken() == null)
            return false;
        if (other.getImportToken() != null
                && other.getImportToken().equals(this.getImportToken()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getParametersValidTo() == null ^ this.getParametersValidTo() == null)
            return false;
        if (other.getParametersValidTo() != null
                && other.getParametersValidTo().equals(this.getParametersValidTo()) == false)
            return false;
        return true;
    }
}
