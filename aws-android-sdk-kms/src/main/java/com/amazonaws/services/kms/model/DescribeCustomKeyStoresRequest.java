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
 * Gets information about <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key stores</a> in the account and Region.
 * </p>
 * <p>
 * This operation is part of the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key stores</a> feature in KMS, which combines the convenience and
 * extensive integration of KMS with the isolation and control of a key store
 * that you own and manage.
 * </p>
 * <p>
 * By default, this operation returns information about all custom key stores in
 * the account and Region. To get only information about a particular custom key
 * store, use either the <code>CustomKeyStoreName</code> or
 * <code>CustomKeyStoreId</code> parameter (but not both).
 * </p>
 * <p>
 * To determine whether the custom key store is connected to its CloudHSM
 * cluster or external key store proxy, use the <code>ConnectionState</code>
 * element in the response. If an attempt to connect the custom key store
 * failed, the <code>ConnectionState</code> value is <code>FAILED</code> and the
 * <code>ConnectionErrorCode</code> element in the response indicates the cause
 * of the failure. For help interpreting the <code>ConnectionErrorCode</code>,
 * see <a>CustomKeyStoresListEntry</a>.
 * </p>
 * <p>
 * Custom key stores have a <code>DISCONNECTED</code> connection state if the
 * key store has never been connected or you used the
 * <a>DisconnectCustomKeyStore</a> operation to disconnect it. Otherwise, the
 * connection state is CONNECTED. If your custom key store connection state is
 * <code>CONNECTED</code> but you are having trouble using it, verify that the
 * backing store is active and available. For an CloudHSM key store, verify that
 * the associated CloudHSM cluster is active and contains the minimum number of
 * HSMs required for the operation, if any. For an external key store, verify
 * that the external key store proxy and its associated external key manager are
 * reachable and enabled.
 * </p>
 * <p>
 * For help repairing your CloudHSM key store, see the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
 * >Troubleshooting CloudHSM key stores</a>. For help repairing your external
 * key store, see the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/xks-troubleshooting.html"
 * >Troubleshooting external key stores</a>. Both topics are in the <i>Key
 * Management Service Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a custom
 * key store in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:DescribeCustomKeyStores</a> (IAM policy)
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
 * <a>DeleteCustomKeyStore</a>
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
public class DescribeCustomKeyStoresRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key
     * store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the
     * friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String customKeyStoreName;

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer limit;

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     */
    private String marker;

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key
     * store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Gets only information about the specified custom key store. Enter
     *         the key store ID.
     *         </p>
     *         <p>
     *         By default, this operation gets information about all custom key
     *         stores in the account and Region. To limit the output to a
     *         particular custom key store, provide either the
     *         <code>CustomKeyStoreId</code> or <code>CustomKeyStoreName</code>
     *         parameter, but not both.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key
     * store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Gets only information about the specified custom key store.
     *            Enter the key store ID.
     *            </p>
     *            <p>
     *            By default, this operation gets information about all custom
     *            key stores in the account and Region. To limit the output to a
     *            particular custom key store, provide either the
     *            <code>CustomKeyStoreId</code> or
     *            <code>CustomKeyStoreName</code> parameter, but not both.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key
     * store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Gets only information about the specified custom key store.
     *            Enter the key store ID.
     *            </p>
     *            <p>
     *            By default, this operation gets information about all custom
     *            key stores in the account and Region. To limit the output to a
     *            particular custom key store, provide either the
     *            <code>CustomKeyStoreId</code> or
     *            <code>CustomKeyStoreName</code> parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCustomKeyStoresRequest withCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
        return this;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the
     * friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Gets only information about the specified custom key store. Enter
     *         the friendly name of the custom key store.
     *         </p>
     *         <p>
     *         By default, this operation gets information about all custom key
     *         stores in the account and Region. To limit the output to a
     *         particular custom key store, provide either the
     *         <code>CustomKeyStoreId</code> or <code>CustomKeyStoreName</code>
     *         parameter, but not both.
     *         </p>
     */
    public String getCustomKeyStoreName() {
        return customKeyStoreName;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the
     * friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param customKeyStoreName <p>
     *            Gets only information about the specified custom key store.
     *            Enter the friendly name of the custom key store.
     *            </p>
     *            <p>
     *            By default, this operation gets information about all custom
     *            key stores in the account and Region. To limit the output to a
     *            particular custom key store, provide either the
     *            <code>CustomKeyStoreId</code> or
     *            <code>CustomKeyStoreName</code> parameter, but not both.
     *            </p>
     */
    public void setCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the
     * friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores
     * in the account and Region. To limit the output to a particular custom key
     * store, provide either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param customKeyStoreName <p>
     *            Gets only information about the specified custom key store.
     *            Enter the friendly name of the custom key store.
     *            </p>
     *            <p>
     *            By default, this operation gets information about all custom
     *            key stores in the account and Region. To limit the output to a
     *            particular custom key store, provide either the
     *            <code>CustomKeyStoreId</code> or
     *            <code>CustomKeyStoreName</code> parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCustomKeyStoresRequest withCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Use this parameter to specify the maximum number of items to
     *         return. When this value is present, KMS does not return more than
     *         the specified number of items, but it might return fewer.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            Use this parameter to specify the maximum number of items to
     *            return. When this value is present, KMS does not return more
     *            than the specified number of items, but it might return fewer.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            Use this parameter to specify the maximum number of items to
     *            return. When this value is present, KMS does not return more
     *            than the specified number of items, but it might return fewer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCustomKeyStoresRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @return <p>
     *         Use this parameter in a subsequent request after you receive a
     *         response with truncated results. Set it to the value of
     *         <code>NextMarker</code> from the truncated response you just
     *         received.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter in a subsequent request after you receive a
     *            response with truncated results. Set it to the value of
     *            <code>NextMarker</code> from the truncated response you just
     *            received.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter in a subsequent request after you receive a
     *            response with truncated results. Set it to the value of
     *            <code>NextMarker</code> from the truncated response you just
     *            received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCustomKeyStoresRequest withMarker(String marker) {
        this.marker = marker;
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
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId() + ",");
        if (getCustomKeyStoreName() != null)
            sb.append("CustomKeyStoreName: " + getCustomKeyStoreName() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode
                + ((getCustomKeyStoreName() == null) ? 0 : getCustomKeyStoreName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomKeyStoresRequest == false)
            return false;
        DescribeCustomKeyStoresRequest other = (DescribeCustomKeyStoresRequest) obj;

        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getCustomKeyStoreName() == null ^ this.getCustomKeyStoreName() == null)
            return false;
        if (other.getCustomKeyStoreName() != null
                && other.getCustomKeyStoreName().equals(this.getCustomKeyStoreName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
