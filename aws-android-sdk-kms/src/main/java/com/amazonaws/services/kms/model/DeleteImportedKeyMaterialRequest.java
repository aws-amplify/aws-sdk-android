/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Deletes key material that you previously imported and makes the specified
 * customer master key (CMK) unusable. For more information about importing key
 * material into AWS KMS, see <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
 * >Importing Key Material</a> in the <i>AWS Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * When the specified CMK is in the <code>PendingDeletion</code> state, this
 * operation does not change the CMK's state. Otherwise, it changes the CMK's
 * state to <code>PendingImport</code>.
 * </p>
 * <p>
 * After you delete key material, you can use <a>ImportKeyMaterial</a> to
 * reimport the same key material into the CMK.
 * </p>
 */
public class DeleteImportedKeyMaterialRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN)
     * of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN)
     * of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the CMK whose key material to delete. The CMK's
     *         <code>Origin</code> must be <code>EXTERNAL</code>.
     *         </p>
     *         <p>
     *         A valid identifier is the unique key ID or the Amazon Resource
     *         Name (ARN) of the CMK. Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN)
     * of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            The identifier of the CMK whose key material to delete. The
     *            CMK's <code>Origin</code> must be <code>EXTERNAL</code>.
     *            </p>
     *            <p>
     *            A valid identifier is the unique key ID or the Amazon Resource
     *            Name (ARN) of the CMK. Examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Unique key ID:
     *            <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN)
     * of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            The identifier of the CMK whose key material to delete. The
     *            CMK's <code>Origin</code> must be <code>EXTERNAL</code>.
     *            </p>
     *            <p>
     *            A valid identifier is the unique key ID or the Amazon Resource
     *            Name (ARN) of the CMK. Examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Unique key ID:
     *            <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteImportedKeyMaterialRequest withKeyId(String keyId) {
        this.keyId = keyId;
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
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteImportedKeyMaterialRequest == false)
            return false;
        DeleteImportedKeyMaterialRequest other = (DeleteImportedKeyMaterialRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
