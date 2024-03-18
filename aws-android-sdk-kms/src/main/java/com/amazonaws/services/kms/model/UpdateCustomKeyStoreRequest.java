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
 * Changes the properties of a custom key store. You can use this operation to
 * change the properties of an CloudHSM key store or an external key store.
 * </p>
 * <p>
 * Use the required <code>CustomKeyStoreId</code> parameter to identify the
 * custom key store. Use the remaining optional parameters to change its
 * properties. This operation does not return any property values. To verify the
 * updated property values, use the <a>DescribeCustomKeyStores</a> operation.
 * </p>
 * <p>
 * This operation is part of the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key stores</a> feature in KMS, which combines the convenience and
 * extensive integration of KMS with the isolation and control of a key store
 * that you own and manage.
 * </p>
 * <important>
 * <p>
 * When updating the properties of an external key store, verify that the
 * updated settings connect your key store, via the external key store proxy, to
 * the same external key manager as the previous settings, or to a backup or
 * snapshot of the external key manager with the same cryptographic keys. If the
 * updated connection settings fail, you can fix them and retry, although an
 * extended delay might disrupt Amazon Web Services services. However, if KMS
 * permanently loses its access to cryptographic keys, ciphertext encrypted
 * under those keys is unrecoverable.
 * </p>
 * </important> <note>
 * <p>
 * For external key stores:
 * </p>
 * <p>
 * Some external key managers provide a simpler method for updating an external
 * key store. For details, see your external key manager documentation.
 * </p>
 * <p>
 * When updating an external key store in the KMS console, you can upload a
 * JSON-based proxy configuration file with the desired values. You cannot
 * upload the proxy configuration file to the <code>UpdateCustomKeyStore</code>
 * operation. However, you can use the file to help you determine the correct
 * values for the <code>UpdateCustomKeyStore</code> parameters.
 * </p>
 * </note>
 * <p>
 * For an CloudHSM key store, you can use this operation to change the custom
 * key store friendly name (<code>NewCustomKeyStoreName</code>), to tell KMS
 * about a change to the <code>kmsuser</code> crypto user password (
 * <code>KeyStorePassword</code>), or to associate the custom key store with a
 * different, but related, CloudHSM cluster (<code>CloudHsmClusterId</code>). To
 * update any property of an CloudHSM key store, the
 * <code>ConnectionState</code> of the CloudHSM key store must be
 * <code>DISCONNECTED</code>.
 * </p>
 * <p>
 * For an external key store, you can use this operation to change the custom
 * key store friendly name (<code>NewCustomKeyStoreName</code>), or to tell KMS
 * about a change to the external key store proxy authentication credentials (
 * <code>XksProxyAuthenticationCredential</code>), connection method (
 * <code>XksProxyConnectivity</code>), external proxy endpoint (
 * <code>XksProxyUriEndpoint</code>) and path (<code>XksProxyUriPath</code>).
 * For external key stores with an <code>XksProxyConnectivity</code> of
 * <code>VPC_ENDPOINT_SERVICE</code>, you can also update the Amazon VPC
 * endpoint service name (<code>XksProxyVpcEndpointServiceName</code>). To
 * update most properties of an external key store, the
 * <code>ConnectionState</code> of the external key store must be
 * <code>DISCONNECTED</code>. However, you can update the
 * <code>CustomKeyStoreName</code>,
 * <code>XksProxyAuthenticationCredential</code>, and
 * <code>XksProxyUriPath</code> of an external key store when it is in the
 * CONNECTED or DISCONNECTED state.
 * </p>
 * <p>
 * If your update requires a <code>DISCONNECTED</code> state, before using
 * <code>UpdateCustomKeyStore</code>, use the <a>DisconnectCustomKeyStore</a>
 * operation to disconnect the custom key store. After the
 * <code>UpdateCustomKeyStore</code> operation completes, use the
 * <a>ConnectCustomKeyStore</a> to reconnect the custom key store. To find the
 * <code>ConnectionState</code> of the custom key store, use the
 * <a>DescribeCustomKeyStores</a> operation.
 * </p>
 * <p>
 * </p>
 * <p>
 * Before updating the custom key store, verify that the new values allow KMS to
 * connect the custom key store to its backing key store. For example, before
 * you change the <code>XksProxyUriPath</code> value, verify that the external
 * key store proxy is reachable at the new path.
 * </p>
 * <p>
 * If the operation succeeds, it returns a JSON object with no properties.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a custom
 * key store in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:UpdateCustomKeyStore</a> (IAM policy)
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
 * <a>DescribeCustomKeyStores</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectCustomKeyStore</a>
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
public class UpdateCustomKeyStoreRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of
     * the custom key store. To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you
     * specify. The custom key store name must be unique in the Amazon Web
     * Services account.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An
     * external key store can be connected or disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String newCustomKeyStoreName;

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU)
     * in the CloudHSM cluster that is associated with the custom key store.
     * This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code>
     * crypto user (CU). It does not set or change the password of any users in
     * the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     */
    private String keyStorePassword;

    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This
     * parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history and has the same
     * cluster certificate as the original cluster. You cannot use this
     * parameter to associate a custom key store with an unrelated cluster. In
     * addition, the replacement cluster must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     * >fulfill the requirements</a> for a cluster associated with a custom key
     * store. To view the cluster certificate of a cluster, use the <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     * <b>Pattern: </b>cluster-[2-7a-zA-Z]{11,16}<br/>
     */
    private String cloudHsmClusterId;

    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key
     * store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>PUBLIC_ENDPOINT</code>, the protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code>
     * followed by the private DNS name associated with the VPC endpoint
     * service. Each external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     */
    private String xksProxyUriEndpoint;

    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key manager and
     * external key store proxy (XKS proxy). This parameter is valid only for
     * custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code>, where <code>v1</code> represents the version of
     * the KMS external key store proxy API. You can include an optional prefix
     * between the required elements such as
     * <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     */
    private String xksProxyUriPath;

    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint
     * service for your external key store proxy (XKS proxy). This parameter is
     * valid when the <code>CustomKeyStoreType</code> is
     * <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code>
     * is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     */
    private String xksProxyVpcEndpointServiceName;

    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external
     * key store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and
     * <code>SecretAccessKey</code> value in the authentication credential, even
     * if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication
     * credentials on the proxy. It just tells KMS the credential that you
     * established with your external key store proxy. For example, if you
     * rotate the credential on your external key store proxy, you can use this
     * parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     */
    private XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential;

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate
     * that the external key store proxy uses a Amazon VPC endpoint service to
     * communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     * Otherwise, specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and add an
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for
     * the <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     */
    private String xksProxyConnectivity;

    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of
     * the custom key store. To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Identifies the custom key store that you want to update. Enter
     *         the ID of the custom key store. To find the ID of a custom key
     *         store, use the <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of
     * the custom key store. To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Identifies the custom key store that you want to update. Enter
     *            the ID of the custom key store. To find the ID of a custom key
     *            store, use the <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of
     * the custom key store. To find the ID of a custom key store, use the
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
     *            Identifies the custom key store that you want to update. Enter
     *            the ID of the custom key store. To find the ID of a custom key
     *            store, use the <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
        return this;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you
     * specify. The custom key store name must be unique in the Amazon Web
     * Services account.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An
     * external key store can be connected or disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Changes the friendly name of the custom key store to the value
     *         that you specify. The custom key store name must be unique in the
     *         Amazon Web Services account.
     *         </p>
     *         <important>
     *         <p>
     *         Do not include confidential or sensitive information in this
     *         field. This field may be displayed in plaintext in CloudTrail
     *         logs and other output.
     *         </p>
     *         </important>
     *         <p>
     *         To change this value, an CloudHSM key store must be disconnected.
     *         An external key store can be connected or disconnected.
     *         </p>
     */
    public String getNewCustomKeyStoreName() {
        return newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you
     * specify. The custom key store name must be unique in the Amazon Web
     * Services account.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An
     * external key store can be connected or disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param newCustomKeyStoreName <p>
     *            Changes the friendly name of the custom key store to the value
     *            that you specify. The custom key store name must be unique in
     *            the Amazon Web Services account.
     *            </p>
     *            <important>
     *            <p>
     *            Do not include confidential or sensitive information in this
     *            field. This field may be displayed in plaintext in CloudTrail
     *            logs and other output.
     *            </p>
     *            </important>
     *            <p>
     *            To change this value, an CloudHSM key store must be
     *            disconnected. An external key store can be connected or
     *            disconnected.
     *            </p>
     */
    public void setNewCustomKeyStoreName(String newCustomKeyStoreName) {
        this.newCustomKeyStoreName = newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you
     * specify. The custom key store name must be unique in the Amazon Web
     * Services account.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An
     * external key store can be connected or disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param newCustomKeyStoreName <p>
     *            Changes the friendly name of the custom key store to the value
     *            that you specify. The custom key store name must be unique in
     *            the Amazon Web Services account.
     *            </p>
     *            <important>
     *            <p>
     *            Do not include confidential or sensitive information in this
     *            field. This field may be displayed in plaintext in CloudTrail
     *            logs and other output.
     *            </p>
     *            </important>
     *            <p>
     *            To change this value, an CloudHSM key store must be
     *            disconnected. An external key store can be connected or
     *            disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withNewCustomKeyStoreName(String newCustomKeyStoreName) {
        this.newCustomKeyStoreName = newCustomKeyStoreName;
        return this;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU)
     * in the CloudHSM cluster that is associated with the custom key store.
     * This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code>
     * crypto user (CU). It does not set or change the password of any users in
     * the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     *
     * @return <p>
     *         Enter the current password of the <code>kmsuser</code> crypto
     *         user (CU) in the CloudHSM cluster that is associated with the
     *         custom key store. This parameter is valid only for custom key
     *         stores with a <code>CustomKeyStoreType</code> of
     *         <code>AWS_CLOUDHSM</code>.
     *         </p>
     *         <p>
     *         This parameter tells KMS the current password of the
     *         <code>kmsuser</code> crypto user (CU). It does not set or change
     *         the password of any users in the CloudHSM cluster.
     *         </p>
     *         <p>
     *         To change this value, the CloudHSM key store must be
     *         disconnected.
     *         </p>
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU)
     * in the CloudHSM cluster that is associated with the custom key store.
     * This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code>
     * crypto user (CU). It does not set or change the password of any users in
     * the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     *
     * @param keyStorePassword <p>
     *            Enter the current password of the <code>kmsuser</code> crypto
     *            user (CU) in the CloudHSM cluster that is associated with the
     *            custom key store. This parameter is valid only for custom key
     *            stores with a <code>CustomKeyStoreType</code> of
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            This parameter tells KMS the current password of the
     *            <code>kmsuser</code> crypto user (CU). It does not set or
     *            change the password of any users in the CloudHSM cluster.
     *            </p>
     *            <p>
     *            To change this value, the CloudHSM key store must be
     *            disconnected.
     *            </p>
     */
    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU)
     * in the CloudHSM cluster that is associated with the custom key store.
     * This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code>
     * crypto user (CU). It does not set or change the password of any users in
     * the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     *
     * @param keyStorePassword <p>
     *            Enter the current password of the <code>kmsuser</code> crypto
     *            user (CU) in the CloudHSM cluster that is associated with the
     *            custom key store. This parameter is valid only for custom key
     *            stores with a <code>CustomKeyStoreType</code> of
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            This parameter tells KMS the current password of the
     *            <code>kmsuser</code> crypto user (CU). It does not set or
     *            change the password of any users in the CloudHSM cluster.
     *            </p>
     *            <p>
     *            To change this value, the CloudHSM key store must be
     *            disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
        return this;
    }

    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This
     * parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history and has the same
     * cluster certificate as the original cluster. You cannot use this
     * parameter to associate a custom key store with an unrelated cluster. In
     * addition, the replacement cluster must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     * >fulfill the requirements</a> for a cluster associated with a custom key
     * store. To view the cluster certificate of a cluster, use the <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     * <b>Pattern: </b>cluster-[2-7a-zA-Z]{11,16}<br/>
     *
     * @return <p>
     *         Associates the custom key store with a related CloudHSM cluster.
     *         This parameter is valid only for custom key stores with a
     *         <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *         </p>
     *         <p>
     *         Enter the cluster ID of the cluster that you used to create the
     *         custom key store or a cluster that shares a backup history and
     *         has the same cluster certificate as the original cluster. You
     *         cannot use this parameter to associate a custom key store with an
     *         unrelated cluster. In addition, the replacement cluster must <a
     *         href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >fulfill the requirements</a> for a cluster associated with a
     *         custom key store. To view the cluster certificate of a cluster,
     *         use the <a href=
     *         "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     *         </p>
     *         <p>
     *         To change this value, the CloudHSM key store must be
     *         disconnected.
     *         </p>
     */
    public String getCloudHsmClusterId() {
        return cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This
     * parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history and has the same
     * cluster certificate as the original cluster. You cannot use this
     * parameter to associate a custom key store with an unrelated cluster. In
     * addition, the replacement cluster must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     * >fulfill the requirements</a> for a cluster associated with a custom key
     * store. To view the cluster certificate of a cluster, use the <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     * <b>Pattern: </b>cluster-[2-7a-zA-Z]{11,16}<br/>
     *
     * @param cloudHsmClusterId <p>
     *            Associates the custom key store with a related CloudHSM
     *            cluster. This parameter is valid only for custom key stores
     *            with a <code>CustomKeyStoreType</code> of
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the cluster ID of the cluster that you used to create
     *            the custom key store or a cluster that shares a backup history
     *            and has the same cluster certificate as the original cluster.
     *            You cannot use this parameter to associate a custom key store
     *            with an unrelated cluster. In addition, the replacement
     *            cluster must <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *            >fulfill the requirements</a> for a cluster associated with a
     *            custom key store. To view the cluster certificate of a
     *            cluster, use the <a href=
     *            "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *            >DescribeClusters</a> operation.
     *            </p>
     *            <p>
     *            To change this value, the CloudHSM key store must be
     *            disconnected.
     *            </p>
     */
    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This
     * parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history and has the same
     * cluster certificate as the original cluster. You cannot use this
     * parameter to associate a custom key store with an unrelated cluster. In
     * addition, the replacement cluster must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     * >fulfill the requirements</a> for a cluster associated with a custom key
     * store. To view the cluster certificate of a cluster, use the <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     * <b>Pattern: </b>cluster-[2-7a-zA-Z]{11,16}<br/>
     *
     * @param cloudHsmClusterId <p>
     *            Associates the custom key store with a related CloudHSM
     *            cluster. This parameter is valid only for custom key stores
     *            with a <code>CustomKeyStoreType</code> of
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the cluster ID of the cluster that you used to create
     *            the custom key store or a cluster that shares a backup history
     *            and has the same cluster certificate as the original cluster.
     *            You cannot use this parameter to associate a custom key store
     *            with an unrelated cluster. In addition, the replacement
     *            cluster must <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *            >fulfill the requirements</a> for a cluster associated with a
     *            custom key store. To view the cluster certificate of a
     *            cluster, use the <a href=
     *            "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *            >DescribeClusters</a> operation.
     *            </p>
     *            <p>
     *            To change this value, the CloudHSM key store must be
     *            disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
        return this;
    }

    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key
     * store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>PUBLIC_ENDPOINT</code>, the protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code>
     * followed by the private DNS name associated with the VPC endpoint
     * service. Each external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @return <p>
     *         Changes the URI endpoint that KMS uses to connect to your
     *         external key store proxy (XKS proxy). This parameter is valid
     *         only for custom key stores with a <code>CustomKeyStoreType</code>
     *         of <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     *         <p>
     *         For external key stores with an <code>XksProxyConnectivity</code>
     *         value of <code>PUBLIC_ENDPOINT</code>, the protocol must be
     *         HTTPS.
     *         </p>
     *         <p>
     *         For external key stores with an <code>XksProxyConnectivity</code>
     *         value of <code>VPC_ENDPOINT_SERVICE</code>, specify
     *         <code>https://</code> followed by the private DNS name associated
     *         with the VPC endpoint service. Each external key store must use a
     *         different private DNS name.
     *         </p>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and
     *         <code>XksProxyUriPath</code> values must be unique in the Amazon
     *         Web Services account and Region.
     *         </p>
     *         <p>
     *         To change this value, the external key store must be
     *         disconnected.
     *         </p>
     */
    public String getXksProxyUriEndpoint() {
        return xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key
     * store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>PUBLIC_ENDPOINT</code>, the protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code>
     * followed by the private DNS name associated with the VPC endpoint
     * service. Each external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @param xksProxyUriEndpoint <p>
     *            Changes the URI endpoint that KMS uses to connect to your
     *            external key store proxy (XKS proxy). This parameter is valid
     *            only for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            For external key stores with an
     *            <code>XksProxyConnectivity</code> value of
     *            <code>PUBLIC_ENDPOINT</code>, the protocol must be HTTPS.
     *            </p>
     *            <p>
     *            For external key stores with an
     *            <code>XksProxyConnectivity</code> value of
     *            <code>VPC_ENDPOINT_SERVICE</code>, specify
     *            <code>https://</code> followed by the private DNS name
     *            associated with the VPC endpoint service. Each external key
     *            store must use a different private DNS name.
     *            </p>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     */
    public void setXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        this.xksProxyUriEndpoint = xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key
     * store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>PUBLIC_ENDPOINT</code>, the protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value
     * of <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code>
     * followed by the private DNS name associated with the VPC endpoint
     * service. Each external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @param xksProxyUriEndpoint <p>
     *            Changes the URI endpoint that KMS uses to connect to your
     *            external key store proxy (XKS proxy). This parameter is valid
     *            only for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            For external key stores with an
     *            <code>XksProxyConnectivity</code> value of
     *            <code>PUBLIC_ENDPOINT</code>, the protocol must be HTTPS.
     *            </p>
     *            <p>
     *            For external key stores with an
     *            <code>XksProxyConnectivity</code> value of
     *            <code>VPC_ENDPOINT_SERVICE</code>, specify
     *            <code>https://</code> followed by the private DNS name
     *            associated with the VPC endpoint service. Each external key
     *            store must use a different private DNS name.
     *            </p>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        this.xksProxyUriEndpoint = xksProxyUriEndpoint;
        return this;
    }

    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key manager and
     * external key store proxy (XKS proxy). This parameter is valid only for
     * custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code>, where <code>v1</code> represents the version of
     * the KMS external key store proxy API. You can include an optional prefix
     * between the required elements such as
     * <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @return <p>
     *         Changes the base path to the proxy APIs for this external key
     *         store. To find this value, see the documentation for your
     *         external key manager and external key store proxy (XKS proxy).
     *         This parameter is valid only for custom key stores with a
     *         <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     *         <p>
     *         The value must start with <code>/</code> and must end with
     *         <code>/kms/xks/v1</code>, where <code>v1</code> represents the
     *         version of the KMS external key store proxy API. You can include
     *         an optional prefix between the required elements such as
     *         <code>/<i>example</i>/kms/xks/v1</code>.
     *         </p>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and
     *         <code>XksProxyUriPath</code> values must be unique in the Amazon
     *         Web Services account and Region.
     *         </p>
     *         <p>
     *         You can change this value when the external key store is
     *         connected or disconnected.
     *         </p>
     */
    public String getXksProxyUriPath() {
        return xksProxyUriPath;
    }

    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key manager and
     * external key store proxy (XKS proxy). This parameter is valid only for
     * custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code>, where <code>v1</code> represents the version of
     * the KMS external key store proxy API. You can include an optional prefix
     * between the required elements such as
     * <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @param xksProxyUriPath <p>
     *            Changes the base path to the proxy APIs for this external key
     *            store. To find this value, see the documentation for your
     *            external key manager and external key store proxy (XKS proxy).
     *            This parameter is valid only for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The value must start with <code>/</code> and must end with
     *            <code>/kms/xks/v1</code>, where <code>v1</code> represents the
     *            version of the KMS external key store proxy API. You can
     *            include an optional prefix between the required elements such
     *            as <code>/<i>example</i>/kms/xks/v1</code>.
     *            </p>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            <p>
     *            You can change this value when the external key store is
     *            connected or disconnected.
     *            </p>
     */
    public void setXksProxyUriPath(String xksProxyUriPath) {
        this.xksProxyUriPath = xksProxyUriPath;
    }

    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key manager and
     * external key store proxy (XKS proxy). This parameter is valid only for
     * custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code>, where <code>v1</code> represents the version of
     * the KMS external key store proxy API. You can include an optional prefix
     * between the required elements such as
     * <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @param xksProxyUriPath <p>
     *            Changes the base path to the proxy APIs for this external key
     *            store. To find this value, see the documentation for your
     *            external key manager and external key store proxy (XKS proxy).
     *            This parameter is valid only for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The value must start with <code>/</code> and must end with
     *            <code>/kms/xks/v1</code>, where <code>v1</code> represents the
     *            version of the KMS external key store proxy API. You can
     *            include an optional prefix between the required elements such
     *            as <code>/<i>example</i>/kms/xks/v1</code>.
     *            </p>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            <p>
     *            You can change this value when the external key store is
     *            connected or disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withXksProxyUriPath(String xksProxyUriPath) {
        this.xksProxyUriPath = xksProxyUriPath;
        return this;
    }

    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint
     * service for your external key store proxy (XKS proxy). This parameter is
     * valid when the <code>CustomKeyStoreType</code> is
     * <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code>
     * is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @return <p>
     *         Changes the name that KMS uses to identify the Amazon VPC
     *         endpoint service for your external key store proxy (XKS proxy).
     *         This parameter is valid when the <code>CustomKeyStoreType</code>
     *         is <code>EXTERNAL_KEY_STORE</code> and the
     *         <code>XksProxyConnectivity</code> is
     *         <code>VPC_ENDPOINT_SERVICE</code>.
     *         </p>
     *         <p>
     *         To change this value, the external key store must be
     *         disconnected.
     *         </p>
     */
    public String getXksProxyVpcEndpointServiceName() {
        return xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint
     * service for your external key store proxy (XKS proxy). This parameter is
     * valid when the <code>CustomKeyStoreType</code> is
     * <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code>
     * is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @param xksProxyVpcEndpointServiceName <p>
     *            Changes the name that KMS uses to identify the Amazon VPC
     *            endpoint service for your external key store proxy (XKS
     *            proxy). This parameter is valid when the
     *            <code>CustomKeyStoreType</code> is
     *            <code>EXTERNAL_KEY_STORE</code> and the
     *            <code>XksProxyConnectivity</code> is
     *            <code>VPC_ENDPOINT_SERVICE</code>.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     */
    public void setXksProxyVpcEndpointServiceName(String xksProxyVpcEndpointServiceName) {
        this.xksProxyVpcEndpointServiceName = xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint
     * service for your external key store proxy (XKS proxy). This parameter is
     * valid when the <code>CustomKeyStoreType</code> is
     * <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code>
     * is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @param xksProxyVpcEndpointServiceName <p>
     *            Changes the name that KMS uses to identify the Amazon VPC
     *            endpoint service for your external key store proxy (XKS
     *            proxy). This parameter is valid when the
     *            <code>CustomKeyStoreType</code> is
     *            <code>EXTERNAL_KEY_STORE</code> and the
     *            <code>XksProxyConnectivity</code> is
     *            <code>VPC_ENDPOINT_SERVICE</code>.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withXksProxyVpcEndpointServiceName(
            String xksProxyVpcEndpointServiceName) {
        this.xksProxyVpcEndpointServiceName = xksProxyVpcEndpointServiceName;
        return this;
    }

    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external
     * key store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and
     * <code>SecretAccessKey</code> value in the authentication credential, even
     * if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication
     * credentials on the proxy. It just tells KMS the credential that you
     * established with your external key store proxy. For example, if you
     * rotate the credential on your external key store proxy, you can use this
     * parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     *
     * @return <p>
     *         Changes the credentials that KMS uses to sign requests to the
     *         external key store proxy (XKS proxy). This parameter is valid
     *         only for custom key stores with a <code>CustomKeyStoreType</code>
     *         of <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     *         <p>
     *         You must specify both the <code>AccessKeyId</code> and
     *         <code>SecretAccessKey</code> value in the authentication
     *         credential, even if you are only updating one value.
     *         </p>
     *         <p>
     *         This parameter doesn't establish or change your authentication
     *         credentials on the proxy. It just tells KMS the credential that
     *         you established with your external key store proxy. For example,
     *         if you rotate the credential on your external key store proxy,
     *         you can use this parameter to update the credential in KMS.
     *         </p>
     *         <p>
     *         You can change this value when the external key store is
     *         connected or disconnected.
     *         </p>
     */
    public XksProxyAuthenticationCredentialType getXksProxyAuthenticationCredential() {
        return xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external
     * key store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and
     * <code>SecretAccessKey</code> value in the authentication credential, even
     * if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication
     * credentials on the proxy. It just tells KMS the credential that you
     * established with your external key store proxy. For example, if you
     * rotate the credential on your external key store proxy, you can use this
     * parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     *
     * @param xksProxyAuthenticationCredential <p>
     *            Changes the credentials that KMS uses to sign requests to the
     *            external key store proxy (XKS proxy). This parameter is valid
     *            only for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            You must specify both the <code>AccessKeyId</code> and
     *            <code>SecretAccessKey</code> value in the authentication
     *            credential, even if you are only updating one value.
     *            </p>
     *            <p>
     *            This parameter doesn't establish or change your authentication
     *            credentials on the proxy. It just tells KMS the credential
     *            that you established with your external key store proxy. For
     *            example, if you rotate the credential on your external key
     *            store proxy, you can use this parameter to update the
     *            credential in KMS.
     *            </p>
     *            <p>
     *            You can change this value when the external key store is
     *            connected or disconnected.
     *            </p>
     */
    public void setXksProxyAuthenticationCredential(
            XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        this.xksProxyAuthenticationCredential = xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external
     * key store proxy (XKS proxy). This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and
     * <code>SecretAccessKey</code> value in the authentication credential, even
     * if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication
     * credentials on the proxy. It just tells KMS the credential that you
     * established with your external key store proxy. For example, if you
     * rotate the credential on your external key store proxy, you can use this
     * parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or
     * disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xksProxyAuthenticationCredential <p>
     *            Changes the credentials that KMS uses to sign requests to the
     *            external key store proxy (XKS proxy). This parameter is valid
     *            only for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            You must specify both the <code>AccessKeyId</code> and
     *            <code>SecretAccessKey</code> value in the authentication
     *            credential, even if you are only updating one value.
     *            </p>
     *            <p>
     *            This parameter doesn't establish or change your authentication
     *            credentials on the proxy. It just tells KMS the credential
     *            that you established with your external key store proxy. For
     *            example, if you rotate the credential on your external key
     *            store proxy, you can use this parameter to update the
     *            credential in KMS.
     *            </p>
     *            <p>
     *            You can change this value when the external key store is
     *            connected or disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withXksProxyAuthenticationCredential(
            XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        this.xksProxyAuthenticationCredential = xksProxyAuthenticationCredential;
        return this;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate
     * that the external key store proxy uses a Amazon VPC endpoint service to
     * communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     * Otherwise, specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and add an
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for
     * the <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @return <p>
     *         Changes the connectivity setting for the external key store. To
     *         indicate that the external key store proxy uses a Amazon VPC
     *         endpoint service to communicate with KMS, specify
     *         <code>VPC_ENDPOINT_SERVICE</code>. Otherwise, specify
     *         <code>PUBLIC_ENDPOINT</code>.
     *         </p>
     *         <p>
     *         If you change the <code>XksProxyConnectivity</code> to
     *         <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     *         <code>XksProxyUriEndpoint</code> and add an
     *         <code>XksProxyVpcEndpointServiceName</code> value.
     *         </p>
     *         <p>
     *         If you change the <code>XksProxyConnectivity</code> to
     *         <code>PUBLIC_ENDPOINT</code>, you must also change the
     *         <code>XksProxyUriEndpoint</code> and specify a null or empty
     *         string for the <code>XksProxyVpcEndpointServiceName</code> value.
     *         </p>
     *         <p>
     *         To change this value, the external key store must be
     *         disconnected.
     *         </p>
     * @see XksProxyConnectivityType
     */
    public String getXksProxyConnectivity() {
        return xksProxyConnectivity;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate
     * that the external key store proxy uses a Amazon VPC endpoint service to
     * communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     * Otherwise, specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and add an
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for
     * the <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Changes the connectivity setting for the external key store.
     *            To indicate that the external key store proxy uses a Amazon
     *            VPC endpoint service to communicate with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. Otherwise, specify
     *            <code>PUBLIC_ENDPOINT</code>.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and add an
     *            <code>XksProxyVpcEndpointServiceName</code> value.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>PUBLIC_ENDPOINT</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and specify a null or empty
     *            string for the <code>XksProxyVpcEndpointServiceName</code>
     *            value.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     * @see XksProxyConnectivityType
     */
    public void setXksProxyConnectivity(String xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate
     * that the external key store proxy uses a Amazon VPC endpoint service to
     * communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     * Otherwise, specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and add an
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for
     * the <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Changes the connectivity setting for the external key store.
     *            To indicate that the external key store proxy uses a Amazon
     *            VPC endpoint service to communicate with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. Otherwise, specify
     *            <code>PUBLIC_ENDPOINT</code>.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and add an
     *            <code>XksProxyVpcEndpointServiceName</code> value.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>PUBLIC_ENDPOINT</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and specify a null or empty
     *            string for the <code>XksProxyVpcEndpointServiceName</code>
     *            value.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see XksProxyConnectivityType
     */
    public UpdateCustomKeyStoreRequest withXksProxyConnectivity(String xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity;
        return this;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate
     * that the external key store proxy uses a Amazon VPC endpoint service to
     * communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     * Otherwise, specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and add an
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for
     * the <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Changes the connectivity setting for the external key store.
     *            To indicate that the external key store proxy uses a Amazon
     *            VPC endpoint service to communicate with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. Otherwise, specify
     *            <code>PUBLIC_ENDPOINT</code>.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and add an
     *            <code>XksProxyVpcEndpointServiceName</code> value.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>PUBLIC_ENDPOINT</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and specify a null or empty
     *            string for the <code>XksProxyVpcEndpointServiceName</code>
     *            value.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     * @see XksProxyConnectivityType
     */
    public void setXksProxyConnectivity(XksProxyConnectivityType xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity.toString();
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate
     * that the external key store proxy uses a Amazon VPC endpoint service to
     * communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     * Otherwise, specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and add an
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to
     * <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for
     * the <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Changes the connectivity setting for the external key store.
     *            To indicate that the external key store proxy uses a Amazon
     *            VPC endpoint service to communicate with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. Otherwise, specify
     *            <code>PUBLIC_ENDPOINT</code>.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>VPC_ENDPOINT_SERVICE</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and add an
     *            <code>XksProxyVpcEndpointServiceName</code> value.
     *            </p>
     *            <p>
     *            If you change the <code>XksProxyConnectivity</code> to
     *            <code>PUBLIC_ENDPOINT</code>, you must also change the
     *            <code>XksProxyUriEndpoint</code> and specify a null or empty
     *            string for the <code>XksProxyVpcEndpointServiceName</code>
     *            value.
     *            </p>
     *            <p>
     *            To change this value, the external key store must be
     *            disconnected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see XksProxyConnectivityType
     */
    public UpdateCustomKeyStoreRequest withXksProxyConnectivity(
            XksProxyConnectivityType xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity.toString();
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
        if (getNewCustomKeyStoreName() != null)
            sb.append("NewCustomKeyStoreName: " + getNewCustomKeyStoreName() + ",");
        if (getKeyStorePassword() != null)
            sb.append("KeyStorePassword: " + getKeyStorePassword() + ",");
        if (getCloudHsmClusterId() != null)
            sb.append("CloudHsmClusterId: " + getCloudHsmClusterId() + ",");
        if (getXksProxyUriEndpoint() != null)
            sb.append("XksProxyUriEndpoint: " + getXksProxyUriEndpoint() + ",");
        if (getXksProxyUriPath() != null)
            sb.append("XksProxyUriPath: " + getXksProxyUriPath() + ",");
        if (getXksProxyVpcEndpointServiceName() != null)
            sb.append("XksProxyVpcEndpointServiceName: " + getXksProxyVpcEndpointServiceName()
                    + ",");
        if (getXksProxyAuthenticationCredential() != null)
            sb.append("XksProxyAuthenticationCredential: " + getXksProxyAuthenticationCredential()
                    + ",");
        if (getXksProxyConnectivity() != null)
            sb.append("XksProxyConnectivity: " + getXksProxyConnectivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewCustomKeyStoreName() == null) ? 0 : getNewCustomKeyStoreName().hashCode());
        hashCode = prime * hashCode
                + ((getKeyStorePassword() == null) ? 0 : getKeyStorePassword().hashCode());
        hashCode = prime * hashCode
                + ((getCloudHsmClusterId() == null) ? 0 : getCloudHsmClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getXksProxyUriEndpoint() == null) ? 0 : getXksProxyUriEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getXksProxyUriPath() == null) ? 0 : getXksProxyUriPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getXksProxyVpcEndpointServiceName() == null) ? 0
                        : getXksProxyVpcEndpointServiceName().hashCode());
        hashCode = prime
                * hashCode
                + ((getXksProxyAuthenticationCredential() == null) ? 0
                        : getXksProxyAuthenticationCredential().hashCode());
        hashCode = prime * hashCode
                + ((getXksProxyConnectivity() == null) ? 0 : getXksProxyConnectivity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomKeyStoreRequest == false)
            return false;
        UpdateCustomKeyStoreRequest other = (UpdateCustomKeyStoreRequest) obj;

        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getNewCustomKeyStoreName() == null ^ this.getNewCustomKeyStoreName() == null)
            return false;
        if (other.getNewCustomKeyStoreName() != null
                && other.getNewCustomKeyStoreName().equals(this.getNewCustomKeyStoreName()) == false)
            return false;
        if (other.getKeyStorePassword() == null ^ this.getKeyStorePassword() == null)
            return false;
        if (other.getKeyStorePassword() != null
                && other.getKeyStorePassword().equals(this.getKeyStorePassword()) == false)
            return false;
        if (other.getCloudHsmClusterId() == null ^ this.getCloudHsmClusterId() == null)
            return false;
        if (other.getCloudHsmClusterId() != null
                && other.getCloudHsmClusterId().equals(this.getCloudHsmClusterId()) == false)
            return false;
        if (other.getXksProxyUriEndpoint() == null ^ this.getXksProxyUriEndpoint() == null)
            return false;
        if (other.getXksProxyUriEndpoint() != null
                && other.getXksProxyUriEndpoint().equals(this.getXksProxyUriEndpoint()) == false)
            return false;
        if (other.getXksProxyUriPath() == null ^ this.getXksProxyUriPath() == null)
            return false;
        if (other.getXksProxyUriPath() != null
                && other.getXksProxyUriPath().equals(this.getXksProxyUriPath()) == false)
            return false;
        if (other.getXksProxyVpcEndpointServiceName() == null
                ^ this.getXksProxyVpcEndpointServiceName() == null)
            return false;
        if (other.getXksProxyVpcEndpointServiceName() != null
                && other.getXksProxyVpcEndpointServiceName().equals(
                        this.getXksProxyVpcEndpointServiceName()) == false)
            return false;
        if (other.getXksProxyAuthenticationCredential() == null
                ^ this.getXksProxyAuthenticationCredential() == null)
            return false;
        if (other.getXksProxyAuthenticationCredential() != null
                && other.getXksProxyAuthenticationCredential().equals(
                        this.getXksProxyAuthenticationCredential()) == false)
            return false;
        if (other.getXksProxyConnectivity() == null ^ this.getXksProxyConnectivity() == null)
            return false;
        if (other.getXksProxyConnectivity() != null
                && other.getXksProxyConnectivity().equals(this.getXksProxyConnectivity()) == false)
            return false;
        return true;
    }
}
