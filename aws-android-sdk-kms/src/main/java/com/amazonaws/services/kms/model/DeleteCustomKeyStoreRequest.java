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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key store</a>. This operation does not delete the CloudHSM cluster
 * that is associated with the custom key store, or affect any users or keys in
 * the cluster.
 * </p>
 * <p>
 * The custom key store that you delete cannot contain any KMS <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
 * >KMS keys</a>. Before deleting the key store, verify that you will never need
 * to use any of the KMS keys in the key store for any <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
 * >cryptographic operations</a>. Then, use <a>ScheduleKeyDeletion</a> to delete
 * the KMS keys from the key store. When the scheduled waiting period expires,
 * the <code>ScheduleKeyDeletion</code> operation deletes the KMS keys. Then it
 * makes a best effort to delete the key material from the associated cluster.
 * However, you might need to manually <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key"
 * >delete the orphaned key material</a> from the cluster and its backups.
 * </p>
 * <p>
 * After all KMS keys are deleted from KMS, use <a>DisconnectCustomKeyStore</a>
 * to disconnect the key store from KMS. Then, you can delete the custom key
 * store.
 * </p>
 * <p>
 * Instead of deleting the custom key store, consider using
 * <a>DisconnectCustomKeyStore</a> to disconnect it from KMS. While the key
 * store is disconnected, you cannot create or use the KMS keys in the key
 * store. But, you do not need to delete KMS keys and you can reconnect a
 * disconnected custom key store at any time.
 * </p>
 * <p>
 * If the operation succeeds, it returns a JSON object with no properties.
 * </p>
 * <p>
 * This operation is part of the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >Custom Key Store feature</a> feature in KMS, which combines the convenience
 * and extensive integration of KMS with the isolation and control of a
 * single-tenant key store.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a custom
 * key store in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:DeleteCustomKeyStore</a> (IAM policy)
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ConnectCustomKeyStore</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateCustomKeyStore</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeCustomKeyStores</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectCustomKeyStore</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateCustomKeyStore</a>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteCustomKeyStoreRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Enter the ID of the custom key store you want to delete. To find the ID
     * of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * Enter the ID of the custom key store you want to delete. To find the ID
     * of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Enter the ID of the custom key store you want to delete. To find
     *         the ID of a custom key store, use the
     *         <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Enter the ID of the custom key store you want to delete. To find the ID
     * of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Enter the ID of the custom key store you want to delete. To
     *            find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Enter the ID of the custom key store you want to delete. To find the ID
     * of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Enter the ID of the custom key store you want to delete. To
     *            find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCustomKeyStoreRequest withCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
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
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomKeyStoreRequest == false)
            return false;
        DeleteCustomKeyStoreRequest other = (DeleteCustomKeyStoreRequest) obj;

        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        return true;
    }
}
