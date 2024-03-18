/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Connects or reconnects a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key store</a> to its backing key store. For an CloudHSM key store,
 * <code>ConnectCustomKeyStore</code> connects the key store to its associated
 * CloudHSM cluster. For an external key store,
 * <code>ConnectCustomKeyStore</code> connects the key store to the external key
 * store proxy that communicates with your external key manager.
 * </p>
 * <p>
 * The custom key store must be connected before you can create KMS keys in the
 * key store or use the KMS keys it contains. You can disconnect and reconnect a
 * custom key store at any time.
 * </p>
 * <p>
 * The connection process for a custom key store can take an extended amount of
 * time to complete. This operation starts the connection process, but it does
 * not wait for it to complete. When it succeeds, this operation quickly returns
 * an HTTP 200 response and a JSON object with no properties. However, this
 * response does not indicate that the custom key store is connected. To get the
 * connection state of the custom key store, use the
 * <a>DescribeCustomKeyStores</a> operation.
 * </p>
 * <p>
 * This operation is part of the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key stores</a> feature in KMS, which combines the convenience and
 * extensive integration of KMS with the isolation and control of a key store
 * that you own and manage.
 * </p>
 * <p>
 * The <code>ConnectCustomKeyStore</code> operation might fail for various
 * reasons. To find the reason, use the <a>DescribeCustomKeyStores</a> operation
 * and see the <code>ConnectionErrorCode</code> in the response. For help
 * interpreting the <code>ConnectionErrorCode</code>, see
 * <a>CustomKeyStoresListEntry</a>.
 * </p>
 * <p>
 * To fix the failure, use the <a>DisconnectCustomKeyStore</a> operation to
 * disconnect the custom key store, correct the error, use the
 * <a>UpdateCustomKeyStore</a> operation if necessary, and then use
 * <code>ConnectCustomKeyStore</code> again.
 * </p>
 * <p>
 * <b>CloudHSM key store</b>
 * </p>
 * <p>
 * During the connection process for an CloudHSM key store, KMS finds the
 * CloudHSM cluster that is associated with the custom key store, creates the
 * connection infrastructure, connects to the cluster, logs into the CloudHSM
 * client as the <code>kmsuser</code> CU, and rotates its password.
 * </p>
 * <p>
 * To connect an CloudHSM key store, its associated CloudHSM cluster must have
 * at least one active HSM. To get the number of active HSMs in a cluster, use
 * the <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
 * >DescribeClusters</a> operation. To add HSMs to the cluster, use the <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html"
 * >CreateHsm</a> operation. Also, the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
 * > <code>kmsuser</code> crypto user</a> (CU) must not be logged into the
 * cluster. This prevents KMS from using this account to log in.
 * </p>
 * <p>
 * If you are having trouble connecting or disconnecting a CloudHSM key store,
 * see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
 * >Troubleshooting an CloudHSM key store</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>External key store</b>
 * </p>
 * <p>
 * When you connect an external key store that uses public endpoint
 * connectivity, KMS tests its ability to communicate with your external key
 * manager by sending a request via the external key store proxy.
 * </p>
 * <p>
 * When you connect to an external key store that uses VPC endpoint service
 * connectivity, KMS establishes the networking elements that it needs to
 * communicate with your external key manager via the external key store proxy.
 * This includes creating an interface endpoint to the VPC endpoint service and
 * a private hosted zone for traffic between KMS and the VPC endpoint service.
 * </p>
 * <p>
 * To connect an external key store, KMS must be able to connect to the external
 * key store proxy, the external key store proxy must be able to communicate
 * with your external key manager, and the external key manager must be
 * available for cryptographic operations.
 * </p>
 * <p>
 * If you are having trouble connecting or disconnecting an external key store,
 * see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/xks-troubleshooting.html"
 * >Troubleshooting an external key store</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a custom
 * key store in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:ConnectCustomKeyStore</a> (IAM policy)
 * </p>
 * <p>
 * <b>Related operations</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateCustomKeyStore</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteCustomKeyStore</a>
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
 * <p>
 * <b>Eventual consistency</b>: The KMS API follows an eventual consistency
 * model. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
 * >KMS eventual consistency</a>.
 * </p>
 */
public class ConnectCustomKeyStoreRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect.
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect.
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Enter the key store ID of the custom key store that you want to
     *         connect. To find the ID of a custom key store, use the
     *         <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect.
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Enter the key store ID of the custom key store that you want
     *            to connect. To find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect.
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Enter the key store ID of the custom key store that you want
     *            to connect. To find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectCustomKeyStoreRequest withCustomKeyStoreId(String customKeyStoreId) {
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

        if (obj instanceof ConnectCustomKeyStoreRequest == false)
            return false;
        ConnectCustomKeyStoreRequest other = (ConnectCustomKeyStoreRequest) obj;

        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        return true;
    }
}
