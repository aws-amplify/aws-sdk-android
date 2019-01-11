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
 * Connects or reconnects a <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
 * >custom key store</a> to its associated AWS CloudHSM cluster.
 * </p>
 * <p>
 * The custom key store must be connected before you can create customer master
 * keys (CMKs) in the key store or use the CMKs it contains. You can disconnect
 * and reconnect a custom key store at any time.
 * </p>
 * <p>
 * To connect a custom key store, its associated AWS CloudHSM cluster must have
 * at least one active HSM. To get the number of active HSMs in a cluster, use
 * the <a href=
 * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters"
 * >DescribeClusters</a> operation. To add HSMs to the cluster, use the <a href=
 * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm"
 * >CreateHsm</a> operation.
 * </p>
 * <p>
 * The connection process can take an extended amount of time to complete; up to
 * 20 minutes. This operation starts the connection process, but it does not
 * wait for it to complete. When it succeeds, this operation quickly returns an
 * HTTP 200 response and a JSON object with no properties. However, this
 * response does not indicate that the custom key store is connected. To get the
 * connection state of the custom key store, use the
 * <a>DescribeCustomKeyStores</a> operation.
 * </p>
 * <p>
 * During the connection process, AWS KMS finds the AWS CloudHSM cluster that is
 * associated with the custom key store, creates the connection infrastructure,
 * connects to the cluster, logs into the AWS CloudHSM client as the <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
 * > <code>kmsuser</code> crypto user</a> (CU), and rotates its password.
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
 * If you are having trouble connecting or disconnecting a custom key store, see
 * <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
 * >Troubleshooting a Custom Key Store</a> in the <i>AWS Key Management Service
 * Developer Guide</i>.
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
