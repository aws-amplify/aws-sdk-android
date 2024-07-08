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
 * Creates a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key store</a> backed by a key store that you own and manage. When you
 * use a KMS key in a custom key store for a cryptographic operation, the
 * cryptographic operation is actually performed in your key store using your
 * keys. KMS supports <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/keystore-cloudhsm.html"
 * >CloudHSM key stores</a> backed by an <a
 * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/clusters.html"
 * >CloudHSM cluster</a> and <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html"
 * >external key stores</a> backed by an external key store proxy and external
 * key manager outside of Amazon Web Services.
 * </p>
 * <p>
 * This operation is part of the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key stores</a> feature in KMS, which combines the convenience and
 * extensive integration of KMS with the isolation and control of a key store
 * that you own and manage.
 * </p>
 * <p>
 * Before you create the custom key store, the required elements must be in
 * place and operational. We recommend that you use the test tools that KMS
 * provides to verify the configuration your external key store proxy. For
 * details about the required elements and verification tests, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
 * >Assemble the prerequisites (for CloudHSM key stores)</a> or <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
 * >Assemble the prerequisites (for external key stores)</a> in the <i>Key
 * Management Service Developer Guide</i>.
 * </p>
 * <p>
 * To create a custom key store, use the following parameters.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To create an CloudHSM key store, specify the <code>CustomKeyStoreName</code>,
 * <code>CloudHsmClusterId</code>, <code>KeyStorePassword</code>, and
 * <code>TrustAnchorCertificate</code>. The <code>CustomKeyStoreType</code>
 * parameter is optional for CloudHSM key stores. If you include it, set it to
 * the default value, <code>AWS_CLOUDHSM</code>. For help with failures, see <a
 * href
 * ="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
 * >Troubleshooting an CloudHSM key store</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * To create an external key store, specify the <code>CustomKeyStoreName</code>
 * and a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
 * Also, specify values for <code>XksProxyConnectivity</code>,
 * <code>XksProxyAuthenticationCredential</code>,
 * <code>XksProxyUriEndpoint</code>, and <code>XksProxyUriPath</code>. If your
 * <code>XksProxyConnectivity</code> value is <code>VPC_ENDPOINT_SERVICE</code>,
 * specify the <code>XksProxyVpcEndpointServiceName</code> parameter. For help
 * with failures, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/xks-troubleshooting.html"
 * >Troubleshooting an external key store</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * For external key stores:
 * </p>
 * <p>
 * Some external key managers provide a simpler method for creating an external
 * key store. For details, see your external key manager documentation.
 * </p>
 * <p>
 * When creating an external key store in the KMS console, you can upload a
 * JSON-based proxy configuration file with the desired values. You cannot use a
 * proxy configuration with the <code>CreateCustomKeyStore</code> operation.
 * However, you can use the values in the file to help you determine the correct
 * values for the <code>CreateCustomKeyStore</code> parameters.
 * </p>
 * </note>
 * <p>
 * When the operation completes successfully, it returns the ID of the new
 * custom key store. Before you can use your new custom key store, you need to
 * use the <a>ConnectCustomKeyStore</a> operation to connect a new CloudHSM key
 * store to its CloudHSM cluster, or to connect a new external key store to the
 * external key store proxy for your external key manager. Even if you are not
 * going to use your custom key store immediately, you might want to connect it
 * to verify that all settings are correct and then disconnect it until you are
 * ready to use it.
 * </p>
 * <p>
 * For help with failures, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
 * >Troubleshooting a custom key store</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a custom
 * key store in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:CreateCustomKeyStore</a> (IAM policy).
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
public class CreateCustomKeyStoreRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your Amazon Web Services account and Region. This parameter is
     * required for all custom key stores.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String customKeyStoreName;

    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter
     * is required for custom key stores with <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     * <b>Pattern: </b>cluster-[2-7a-zA-Z]{11,16}<br/>
     */
    private String cloudHsmClusterId;

    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is
     * required for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM
     * cluster. This is the content of the <code>customerCA.crt</code> file that
     * you created when you <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     * >initialized the cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     */
    private String trustAnchorCertificate;

    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store.
     * This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified
     * CloudHSM cluster. KMS logs into the cluster as this user to manage key
     * material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case
     * sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it
     * does not change the password in the CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     */
    private String keyStorePassword;

    /**
     * <p>
     * Specifies the type of custom key store. The default value is
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter
     * or enter <code>AWS_CLOUDHSM</code>. For a custom key store backed by an
     * external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after
     * the key store is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_CLOUDHSM, EXTERNAL_KEY_STORE
     */
    private String customKeyStoreType;

    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key
     * store proxy (XKS proxy). This parameter is required for custom key stores
     * with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>
     * .
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify
     * the port in the <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of
     * <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed
     * by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity,
     * this endpoint must be reachable before you create the custom key store.
     * KMS connects to the external key store proxy while creating the custom
     * key store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity, KMS connects when you call the <a>ConnectCustomKeyStore</a>
     * operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The
     * remainder can contain upper and lower case letters (A-Z and a-z), numbers
     * (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional
     * slashes (<code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity
     * cannot use the same <code>XksProxyUriEndpoint</code> value as an external
     * key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity in this
     * Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity must have its own private DNS name. The
     * <code>XksProxyUriEndpoint</code> value for external key stores with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be
     * unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     */
    private String xksProxyUriEndpoint;

    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key store proxy.
     * This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code> where <code>v1</code> represents the version of
     * the KMS external key store proxy API. This path can include an optional
     * prefix between the required elements such as
     * <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     */
    private String xksProxyUriPath;

    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface
     * endpoints that is used to communicate with your external key store proxy
     * (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the value of <code>XksProxyConnectivity</code> is
     * <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     * >fulfill all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity
     * can share an Amazon VPC, but each external key store must have its own
     * VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     */
    private String xksProxyVpcEndpointServiceName;

    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy
     * (XKS proxy). This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required
     * elements: <code>RawSecretAccessKey</code>, a secret key, and
     * <code>AccessKeyId</code>, a unique identifier for the
     * <code>RawSecretAccessKey</code>. For character requirements, see <a href=
     * "kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     * >XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external
     * key store proxy on your behalf. This credential is unrelated to Identity
     * and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on
     * the XKS proxy. It just tells KMS the credential that you established on
     * your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the
     * new credential to KMS.
     * </p>
     */
    private XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential;

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This
     * parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify
     * <code>PUBLIC_ENDPOINT</code>. If the external key store proxy uses a
     * Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a
     * private address space entirely within Amazon Web Services, but it
     * requires more configuration, including establishing a Amazon VPC with
     * multiple subnets, a VPC endpoint service, a network load balancer, and a
     * verified private DNS name. A public endpoint is simpler to set up, but it
     * might be slower and might not fulfill your security requirements. You
     * might consider testing with a public endpoint, and then establishing a
     * VPC endpoint service for production tasks. Note that this choice does not
     * determine the location of the external key store proxy. Even if you
     * choose a VPC endpoint service, the proxy can be hosted within the VPC or
     * outside of Amazon Web Services such as in your corporate data center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     */
    private String xksProxyConnectivity;

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your Amazon Web Services account and Region. This parameter is
     * required for all custom key stores.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Specifies a friendly name for the custom key store. The name must
     *         be unique in your Amazon Web Services account and Region. This
     *         parameter is required for all custom key stores.
     *         </p>
     *         <important>
     *         <p>
     *         Do not include confidential or sensitive information in this
     *         field. This field may be displayed in plaintext in CloudTrail
     *         logs and other output.
     *         </p>
     *         </important>
     */
    public String getCustomKeyStoreName() {
        return customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your Amazon Web Services account and Region. This parameter is
     * required for all custom key stores.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param customKeyStoreName <p>
     *            Specifies a friendly name for the custom key store. The name
     *            must be unique in your Amazon Web Services account and Region.
     *            This parameter is required for all custom key stores.
     *            </p>
     *            <important>
     *            <p>
     *            Do not include confidential or sensitive information in this
     *            field. This field may be displayed in plaintext in CloudTrail
     *            logs and other output.
     *            </p>
     *            </important>
     */
    public void setCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your Amazon Web Services account and Region. This parameter is
     * required for all custom key stores.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param customKeyStoreName <p>
     *            Specifies a friendly name for the custom key store. The name
     *            must be unique in your Amazon Web Services account and Region.
     *            This parameter is required for all custom key stores.
     *            </p>
     *            <important>
     *            <p>
     *            Do not include confidential or sensitive information in this
     *            field. This field may be displayed in plaintext in CloudTrail
     *            logs and other output.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
        return this;
    }

    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter
     * is required for custom key stores with <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     * <b>Pattern: </b>cluster-[2-7a-zA-Z]{11,16}<br/>
     *
     * @return <p>
     *         Identifies the CloudHSM cluster for an CloudHSM key store. This
     *         parameter is required for custom key stores with
     *         <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *         </p>
     *         <p>
     *         Enter the cluster ID of any active CloudHSM cluster that is not
     *         already associated with a custom key store. To find the cluster
     *         ID, use the <a href=
     *         "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     *         </p>
     */
    public String getCloudHsmClusterId() {
        return cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter
     * is required for custom key stores with <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     * <b>Pattern: </b>cluster-[2-7a-zA-Z]{11,16}<br/>
     *
     * @param cloudHsmClusterId <p>
     *            Identifies the CloudHSM cluster for an CloudHSM key store.
     *            This parameter is required for custom key stores with
     *            <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the cluster ID of any active CloudHSM cluster that is
     *            not already associated with a custom key store. To find the
     *            cluster ID, use the <a href=
     *            "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *            >DescribeClusters</a> operation.
     *            </p>
     */
    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter
     * is required for custom key stores with <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
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
     *            Identifies the CloudHSM cluster for an CloudHSM key store.
     *            This parameter is required for custom key stores with
     *            <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the cluster ID of any active CloudHSM cluster that is
     *            not already associated with a custom key store. To find the
     *            cluster ID, use the <a href=
     *            "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *            >DescribeClusters</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
        return this;
    }

    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is
     * required for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM
     * cluster. This is the content of the <code>customerCA.crt</code> file that
     * you created when you <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     * >initialized the cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @return <p>
     *         Specifies the certificate for an CloudHSM key store. This
     *         parameter is required for custom key stores with a
     *         <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *         </p>
     *         <p>
     *         Enter the content of the trust anchor certificate for the
     *         CloudHSM cluster. This is the content of the
     *         <code>customerCA.crt</code> file that you created when you <a
     *         href=
     *         "https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     *         >initialized the cluster</a>.
     *         </p>
     */
    public String getTrustAnchorCertificate() {
        return trustAnchorCertificate;
    }

    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is
     * required for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM
     * cluster. This is the content of the <code>customerCA.crt</code> file that
     * you created when you <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     * >initialized the cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @param trustAnchorCertificate <p>
     *            Specifies the certificate for an CloudHSM key store. This
     *            parameter is required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the content of the trust anchor certificate for the
     *            CloudHSM cluster. This is the content of the
     *            <code>customerCA.crt</code> file that you created when you <a
     *            href=
     *            "https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     *            >initialized the cluster</a>.
     *            </p>
     */
    public void setTrustAnchorCertificate(String trustAnchorCertificate) {
        this.trustAnchorCertificate = trustAnchorCertificate;
    }

    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is
     * required for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM
     * cluster. This is the content of the <code>customerCA.crt</code> file that
     * you created when you <a href=
     * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     * >initialized the cluster</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @param trustAnchorCertificate <p>
     *            Specifies the certificate for an CloudHSM key store. This
     *            parameter is required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the content of the trust anchor certificate for the
     *            CloudHSM cluster. This is the content of the
     *            <code>customerCA.crt</code> file that you created when you <a
     *            href=
     *            "https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     *            >initialized the cluster</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withTrustAnchorCertificate(String trustAnchorCertificate) {
        this.trustAnchorCertificate = trustAnchorCertificate;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store.
     * This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified
     * CloudHSM cluster. KMS logs into the cluster as this user to manage key
     * material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case
     * sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it
     * does not change the password in the CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     *
     * @return <p>
     *         Specifies the <code>kmsuser</code> password for an CloudHSM key
     *         store. This parameter is required for custom key stores with a
     *         <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     *         </p>
     *         <p>
     *         Enter the password of the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     *         > <code>kmsuser</code> crypto user (CU) account</a> in the
     *         specified CloudHSM cluster. KMS logs into the cluster as this
     *         user to manage key material on your behalf.
     *         </p>
     *         <p>
     *         The password must be a string of 7 to 32 characters. Its value is
     *         case sensitive.
     *         </p>
     *         <p>
     *         This parameter tells KMS the <code>kmsuser</code> account
     *         password; it does not change the password in the CloudHSM
     *         cluster.
     *         </p>
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store.
     * This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified
     * CloudHSM cluster. KMS logs into the cluster as this user to manage key
     * material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case
     * sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it
     * does not change the password in the CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     *
     * @param keyStorePassword <p>
     *            Specifies the <code>kmsuser</code> password for an CloudHSM
     *            key store. This parameter is required for custom key stores
     *            with a <code>CustomKeyStoreType</code> of
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the password of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     *            > <code>kmsuser</code> crypto user (CU) account</a> in the
     *            specified CloudHSM cluster. KMS logs into the cluster as this
     *            user to manage key material on your behalf.
     *            </p>
     *            <p>
     *            The password must be a string of 7 to 32 characters. Its value
     *            is case sensitive.
     *            </p>
     *            <p>
     *            This parameter tells KMS the <code>kmsuser</code> account
     *            password; it does not change the password in the CloudHSM
     *            cluster.
     *            </p>
     */
    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store.
     * This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified
     * CloudHSM cluster. KMS logs into the cluster as this user to manage key
     * material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case
     * sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it
     * does not change the password in the CloudHSM cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 32<br/>
     *
     * @param keyStorePassword <p>
     *            Specifies the <code>kmsuser</code> password for an CloudHSM
     *            key store. This parameter is required for custom key stores
     *            with a <code>CustomKeyStoreType</code> of
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            Enter the password of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     *            > <code>kmsuser</code> crypto user (CU) account</a> in the
     *            specified CloudHSM cluster. KMS logs into the cluster as this
     *            user to manage key material on your behalf.
     *            </p>
     *            <p>
     *            The password must be a string of 7 to 32 characters. Its value
     *            is case sensitive.
     *            </p>
     *            <p>
     *            This parameter tells KMS the <code>kmsuser</code> account
     *            password; it does not change the password in the CloudHSM
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
        return this;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter
     * or enter <code>AWS_CLOUDHSM</code>. For a custom key store backed by an
     * external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after
     * the key store is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_CLOUDHSM, EXTERNAL_KEY_STORE
     *
     * @return <p>
     *         Specifies the type of custom key store. The default value is
     *         <code>AWS_CLOUDHSM</code>.
     *         </p>
     *         <p>
     *         For a custom key store backed by an CloudHSM cluster, omit the
     *         parameter or enter <code>AWS_CLOUDHSM</code>. For a custom key
     *         store backed by an external key manager outside of Amazon Web
     *         Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot
     *         change this property after the key store is created.
     *         </p>
     * @see CustomKeyStoreType
     */
    public String getCustomKeyStoreType() {
        return customKeyStoreType;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter
     * or enter <code>AWS_CLOUDHSM</code>. For a custom key store backed by an
     * external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after
     * the key store is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_CLOUDHSM, EXTERNAL_KEY_STORE
     *
     * @param customKeyStoreType <p>
     *            Specifies the type of custom key store. The default value is
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            For a custom key store backed by an CloudHSM cluster, omit the
     *            parameter or enter <code>AWS_CLOUDHSM</code>. For a custom key
     *            store backed by an external key manager outside of Amazon Web
     *            Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot
     *            change this property after the key store is created.
     *            </p>
     * @see CustomKeyStoreType
     */
    public void setCustomKeyStoreType(String customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter
     * or enter <code>AWS_CLOUDHSM</code>. For a custom key store backed by an
     * external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after
     * the key store is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_CLOUDHSM, EXTERNAL_KEY_STORE
     *
     * @param customKeyStoreType <p>
     *            Specifies the type of custom key store. The default value is
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            For a custom key store backed by an CloudHSM cluster, omit the
     *            parameter or enter <code>AWS_CLOUDHSM</code>. For a custom key
     *            store backed by an external key manager outside of Amazon Web
     *            Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot
     *            change this property after the key store is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomKeyStoreType
     */
    public CreateCustomKeyStoreRequest withCustomKeyStoreType(String customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType;
        return this;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter
     * or enter <code>AWS_CLOUDHSM</code>. For a custom key store backed by an
     * external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after
     * the key store is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_CLOUDHSM, EXTERNAL_KEY_STORE
     *
     * @param customKeyStoreType <p>
     *            Specifies the type of custom key store. The default value is
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            For a custom key store backed by an CloudHSM cluster, omit the
     *            parameter or enter <code>AWS_CLOUDHSM</code>. For a custom key
     *            store backed by an external key manager outside of Amazon Web
     *            Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot
     *            change this property after the key store is created.
     *            </p>
     * @see CustomKeyStoreType
     */
    public void setCustomKeyStoreType(CustomKeyStoreType customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType.toString();
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is
     * <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter
     * or enter <code>AWS_CLOUDHSM</code>. For a custom key store backed by an
     * external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after
     * the key store is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_CLOUDHSM, EXTERNAL_KEY_STORE
     *
     * @param customKeyStoreType <p>
     *            Specifies the type of custom key store. The default value is
     *            <code>AWS_CLOUDHSM</code>.
     *            </p>
     *            <p>
     *            For a custom key store backed by an CloudHSM cluster, omit the
     *            parameter or enter <code>AWS_CLOUDHSM</code>. For a custom key
     *            store backed by an external key manager outside of Amazon Web
     *            Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot
     *            change this property after the key store is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomKeyStoreType
     */
    public CreateCustomKeyStoreRequest withCustomKeyStoreType(CustomKeyStoreType customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key
     * store proxy (XKS proxy). This parameter is required for custom key stores
     * with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>
     * .
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify
     * the port in the <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of
     * <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed
     * by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity,
     * this endpoint must be reachable before you create the custom key store.
     * KMS connects to the external key store proxy while creating the custom
     * key store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity, KMS connects when you call the <a>ConnectCustomKeyStore</a>
     * operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The
     * remainder can contain upper and lower case letters (A-Z and a-z), numbers
     * (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional
     * slashes (<code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity
     * cannot use the same <code>XksProxyUriEndpoint</code> value as an external
     * key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity in this
     * Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity must have its own private DNS name. The
     * <code>XksProxyUriEndpoint</code> value for external key stores with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be
     * unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @return <p>
     *         Specifies the endpoint that KMS uses to send requests to the
     *         external key store proxy (XKS proxy). This parameter is required
     *         for custom key stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     *         <p>
     *         The protocol must be HTTPS. KMS communicates on port 443. Do not
     *         specify the port in the <code>XksProxyUriEndpoint</code> value.
     *         </p>
     *         <p>
     *         For external key stores with <code>XksProxyConnectivity</code>
     *         value of <code>VPC_ENDPOINT_SERVICE</code>, specify
     *         <code>https://</code> followed by the private DNS name of the VPC
     *         endpoint service.
     *         </p>
     *         <p>
     *         For external key stores with <code>PUBLIC_ENDPOINT</code>
     *         connectivity, this endpoint must be reachable before you create
     *         the custom key store. KMS connects to the external key store
     *         proxy while creating the custom key store. For external key
     *         stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS
     *         connects when you call the <a>ConnectCustomKeyStore</a>
     *         operation.
     *         </p>
     *         <p>
     *         The value of this parameter must begin with <code>https://</code>
     *         . The remainder can contain upper and lower case letters (A-Z and
     *         a-z), numbers (0-9), dots (<code>.</code>), and hyphens (
     *         <code>-</code>). Additional slashes (<code>/</code> and
     *         <code>\</code>) are not permitted.
     *         </p>
     *         <p>
     *         <b>Uniqueness requirements: </b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and
     *         <code>XksProxyUriPath</code> values must be unique in the Amazon
     *         Web Services account and Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An external key store with <code>PUBLIC_ENDPOINT</code>
     *         connectivity cannot use the same <code>XksProxyUriEndpoint</code>
     *         value as an external key store with
     *         <code>VPC_ENDPOINT_SERVICE</code> connectivity in this Amazon Web
     *         Services Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each external key store with <code>VPC_ENDPOINT_SERVICE</code>
     *         connectivity must have its own private DNS name. The
     *         <code>XksProxyUriEndpoint</code> value for external key stores
     *         with <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS
     *         name) must be unique in the Amazon Web Services account and
     *         Region.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getXksProxyUriEndpoint() {
        return xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key
     * store proxy (XKS proxy). This parameter is required for custom key stores
     * with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>
     * .
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify
     * the port in the <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of
     * <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed
     * by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity,
     * this endpoint must be reachable before you create the custom key store.
     * KMS connects to the external key store proxy while creating the custom
     * key store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity, KMS connects when you call the <a>ConnectCustomKeyStore</a>
     * operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The
     * remainder can contain upper and lower case letters (A-Z and a-z), numbers
     * (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional
     * slashes (<code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity
     * cannot use the same <code>XksProxyUriEndpoint</code> value as an external
     * key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity in this
     * Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity must have its own private DNS name. The
     * <code>XksProxyUriEndpoint</code> value for external key stores with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be
     * unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @param xksProxyUriEndpoint <p>
     *            Specifies the endpoint that KMS uses to send requests to the
     *            external key store proxy (XKS proxy). This parameter is
     *            required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The protocol must be HTTPS. KMS communicates on port 443. Do
     *            not specify the port in the <code>XksProxyUriEndpoint</code>
     *            value.
     *            </p>
     *            <p>
     *            For external key stores with <code>XksProxyConnectivity</code>
     *            value of <code>VPC_ENDPOINT_SERVICE</code>, specify
     *            <code>https://</code> followed by the private DNS name of the
     *            VPC endpoint service.
     *            </p>
     *            <p>
     *            For external key stores with <code>PUBLIC_ENDPOINT</code>
     *            connectivity, this endpoint must be reachable before you
     *            create the custom key store. KMS connects to the external key
     *            store proxy while creating the custom key store. For external
     *            key stores with <code>VPC_ENDPOINT_SERVICE</code>
     *            connectivity, KMS connects when you call the
     *            <a>ConnectCustomKeyStore</a> operation.
     *            </p>
     *            <p>
     *            The value of this parameter must begin with
     *            <code>https://</code>. The remainder can contain upper and
     *            lower case letters (A-Z and a-z), numbers (0-9), dots (
     *            <code>.</code>), and hyphens (<code>-</code>). Additional
     *            slashes (<code>/</code> and <code>\</code>) are not permitted.
     *            </p>
     *            <p>
     *            <b>Uniqueness requirements: </b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An external key store with <code>PUBLIC_ENDPOINT</code>
     *            connectivity cannot use the same
     *            <code>XksProxyUriEndpoint</code> value as an external key
     *            store with <code>VPC_ENDPOINT_SERVICE</code> connectivity in
     *            this Amazon Web Services Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each external key store with <code>VPC_ENDPOINT_SERVICE</code>
     *            connectivity must have its own private DNS name. The
     *            <code>XksProxyUriEndpoint</code> value for external key stores
     *            with <code>VPC_ENDPOINT_SERVICE</code> connectivity (private
     *            DNS name) must be unique in the Amazon Web Services account
     *            and Region.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        this.xksProxyUriEndpoint = xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key
     * store proxy (XKS proxy). This parameter is required for custom key stores
     * with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>
     * .
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify
     * the port in the <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of
     * <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed
     * by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity,
     * this endpoint must be reachable before you create the custom key store.
     * KMS connects to the external key store proxy while creating the custom
     * key store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity, KMS connects when you call the <a>ConnectCustomKeyStore</a>
     * operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The
     * remainder can contain upper and lower case letters (A-Z and a-z), numbers
     * (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional
     * slashes (<code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity
     * cannot use the same <code>XksProxyUriEndpoint</code> value as an external
     * key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity in this
     * Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity must have its own private DNS name. The
     * <code>XksProxyUriEndpoint</code> value for external key stores with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be
     * unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern: </b>^https://[a-zA-Z0-9.-]+$<br/>
     *
     * @param xksProxyUriEndpoint <p>
     *            Specifies the endpoint that KMS uses to send requests to the
     *            external key store proxy (XKS proxy). This parameter is
     *            required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The protocol must be HTTPS. KMS communicates on port 443. Do
     *            not specify the port in the <code>XksProxyUriEndpoint</code>
     *            value.
     *            </p>
     *            <p>
     *            For external key stores with <code>XksProxyConnectivity</code>
     *            value of <code>VPC_ENDPOINT_SERVICE</code>, specify
     *            <code>https://</code> followed by the private DNS name of the
     *            VPC endpoint service.
     *            </p>
     *            <p>
     *            For external key stores with <code>PUBLIC_ENDPOINT</code>
     *            connectivity, this endpoint must be reachable before you
     *            create the custom key store. KMS connects to the external key
     *            store proxy while creating the custom key store. For external
     *            key stores with <code>VPC_ENDPOINT_SERVICE</code>
     *            connectivity, KMS connects when you call the
     *            <a>ConnectCustomKeyStore</a> operation.
     *            </p>
     *            <p>
     *            The value of this parameter must begin with
     *            <code>https://</code>. The remainder can contain upper and
     *            lower case letters (A-Z and a-z), numbers (0-9), dots (
     *            <code>.</code>), and hyphens (<code>-</code>). Additional
     *            slashes (<code>/</code> and <code>\</code>) are not permitted.
     *            </p>
     *            <p>
     *            <b>Uniqueness requirements: </b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An external key store with <code>PUBLIC_ENDPOINT</code>
     *            connectivity cannot use the same
     *            <code>XksProxyUriEndpoint</code> value as an external key
     *            store with <code>VPC_ENDPOINT_SERVICE</code> connectivity in
     *            this Amazon Web Services Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each external key store with <code>VPC_ENDPOINT_SERVICE</code>
     *            connectivity must have its own private DNS name. The
     *            <code>XksProxyUriEndpoint</code> value for external key stores
     *            with <code>VPC_ENDPOINT_SERVICE</code> connectivity (private
     *            DNS name) must be unique in the Amazon Web Services account
     *            and Region.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        this.xksProxyUriEndpoint = xksProxyUriEndpoint;
        return this;
    }

    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key store proxy.
     * This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code> where <code>v1</code> represents the version of
     * the KMS external key store proxy API. This path can include an optional
     * prefix between the required elements such as
     * <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @return <p>
     *         Specifies the base path to the proxy APIs for this external key
     *         store. To find this value, see the documentation for your
     *         external key store proxy. This parameter is required for all
     *         custom key stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     *         <p>
     *         The value must start with <code>/</code> and must end with
     *         <code>/kms/xks/v1</code> where <code>v1</code> represents the
     *         version of the KMS external key store proxy API. This path can
     *         include an optional prefix between the required elements such as
     *         <code>/<i>prefix</i>/kms/xks/v1</code>.
     *         </p>
     *         <p>
     *         <b>Uniqueness requirements: </b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and
     *         <code>XksProxyUriPath</code> values must be unique in the Amazon
     *         Web Services account and Region.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getXksProxyUriPath() {
        return xksProxyUriPath;
    }

    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key store proxy.
     * This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code> where <code>v1</code> represents the version of
     * the KMS external key store proxy API. This path can include an optional
     * prefix between the required elements such as
     * <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 128<br/>
     * <b>Pattern:
     * </b>^(/[a-zA-Z0-9\/_-]+/kms/xks/v\d{1,2})$|^(/kms/xks/v\d{1,2})$<br/>
     *
     * @param xksProxyUriPath <p>
     *            Specifies the base path to the proxy APIs for this external
     *            key store. To find this value, see the documentation for your
     *            external key store proxy. This parameter is required for all
     *            custom key stores with a <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The value must start with <code>/</code> and must end with
     *            <code>/kms/xks/v1</code> where <code>v1</code> represents the
     *            version of the KMS external key store proxy API. This path can
     *            include an optional prefix between the required elements such
     *            as <code>/<i>prefix</i>/kms/xks/v1</code>.
     *            </p>
     *            <p>
     *            <b>Uniqueness requirements: </b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setXksProxyUriPath(String xksProxyUriPath) {
        this.xksProxyUriPath = xksProxyUriPath;
    }

    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To
     * find this value, see the documentation for your external key store proxy.
     * This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with
     * <code>/kms/xks/v1</code> where <code>v1</code> represents the version of
     * the KMS external key store proxy API. This path can include an optional
     * prefix between the required elements such as
     * <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and
     * <code>XksProxyUriPath</code> values must be unique in the Amazon Web
     * Services account and Region.
     * </p>
     * </li>
     * </ul>
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
     *            Specifies the base path to the proxy APIs for this external
     *            key store. To find this value, see the documentation for your
     *            external key store proxy. This parameter is required for all
     *            custom key stores with a <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The value must start with <code>/</code> and must end with
     *            <code>/kms/xks/v1</code> where <code>v1</code> represents the
     *            version of the KMS external key store proxy API. This path can
     *            include an optional prefix between the required elements such
     *            as <code>/<i>prefix</i>/kms/xks/v1</code>.
     *            </p>
     *            <p>
     *            <b>Uniqueness requirements: </b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The combined <code>XksProxyUriEndpoint</code> and
     *            <code>XksProxyUriPath</code> values must be unique in the
     *            Amazon Web Services account and Region.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withXksProxyUriPath(String xksProxyUriPath) {
        this.xksProxyUriPath = xksProxyUriPath;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface
     * endpoints that is used to communicate with your external key store proxy
     * (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the value of <code>XksProxyConnectivity</code> is
     * <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     * >fulfill all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity
     * can share an Amazon VPC, but each external key store must have its own
     * VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @return <p>
     *         Specifies the name of the Amazon VPC endpoint service for
     *         interface endpoints that is used to communicate with your
     *         external key store proxy (XKS proxy). This parameter is required
     *         when the value of <code>CustomKeyStoreType</code> is
     *         <code>EXTERNAL_KEY_STORE</code> and the value of
     *         <code>XksProxyConnectivity</code> is
     *         <code>VPC_ENDPOINT_SERVICE</code>.
     *         </p>
     *         <p>
     *         The Amazon VPC endpoint service must <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     *         >fulfill all requirements</a> for use with an external key store.
     *         </p>
     *         <p>
     *         <b>Uniqueness requirements:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         External key stores with <code>VPC_ENDPOINT_SERVICE</code>
     *         connectivity can share an Amazon VPC, but each external key store
     *         must have its own VPC endpoint service and private DNS name.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getXksProxyVpcEndpointServiceName() {
        return xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface
     * endpoints that is used to communicate with your external key store proxy
     * (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the value of <code>XksProxyConnectivity</code> is
     * <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     * >fulfill all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity
     * can share an Amazon VPC, but each external key store must have its own
     * VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 64<br/>
     * <b>Pattern:
     * </b>^com\.amazonaws\.vpce\.([a-z]+-){2,3}\d+\.vpce-svc-[0-9a-z]+$<br/>
     *
     * @param xksProxyVpcEndpointServiceName <p>
     *            Specifies the name of the Amazon VPC endpoint service for
     *            interface endpoints that is used to communicate with your
     *            external key store proxy (XKS proxy). This parameter is
     *            required when the value of <code>CustomKeyStoreType</code> is
     *            <code>EXTERNAL_KEY_STORE</code> and the value of
     *            <code>XksProxyConnectivity</code> is
     *            <code>VPC_ENDPOINT_SERVICE</code>.
     *            </p>
     *            <p>
     *            The Amazon VPC endpoint service must <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     *            >fulfill all requirements</a> for use with an external key
     *            store.
     *            </p>
     *            <p>
     *            <b>Uniqueness requirements:</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            External key stores with <code>VPC_ENDPOINT_SERVICE</code>
     *            connectivity can share an Amazon VPC, but each external key
     *            store must have its own VPC endpoint service and private DNS
     *            name.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setXksProxyVpcEndpointServiceName(String xksProxyVpcEndpointServiceName) {
        this.xksProxyVpcEndpointServiceName = xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface
     * endpoints that is used to communicate with your external key store proxy
     * (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the value of <code>XksProxyConnectivity</code> is
     * <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     * >fulfill all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity
     * can share an Amazon VPC, but each external key store must have its own
     * VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
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
     *            Specifies the name of the Amazon VPC endpoint service for
     *            interface endpoints that is used to communicate with your
     *            external key store proxy (XKS proxy). This parameter is
     *            required when the value of <code>CustomKeyStoreType</code> is
     *            <code>EXTERNAL_KEY_STORE</code> and the value of
     *            <code>XksProxyConnectivity</code> is
     *            <code>VPC_ENDPOINT_SERVICE</code>.
     *            </p>
     *            <p>
     *            The Amazon VPC endpoint service must <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     *            >fulfill all requirements</a> for use with an external key
     *            store.
     *            </p>
     *            <p>
     *            <b>Uniqueness requirements:</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            External key stores with <code>VPC_ENDPOINT_SERVICE</code>
     *            connectivity can share an Amazon VPC, but each external key
     *            store must have its own VPC endpoint service and private DNS
     *            name.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withXksProxyVpcEndpointServiceName(
            String xksProxyVpcEndpointServiceName) {
        this.xksProxyVpcEndpointServiceName = xksProxyVpcEndpointServiceName;
        return this;
    }

    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy
     * (XKS proxy). This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required
     * elements: <code>RawSecretAccessKey</code>, a secret key, and
     * <code>AccessKeyId</code>, a unique identifier for the
     * <code>RawSecretAccessKey</code>. For character requirements, see <a href=
     * "kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     * >XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external
     * key store proxy on your behalf. This credential is unrelated to Identity
     * and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on
     * the XKS proxy. It just tells KMS the credential that you established on
     * your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the
     * new credential to KMS.
     * </p>
     *
     * @return <p>
     *         Specifies an authentication credential for the external key store
     *         proxy (XKS proxy). This parameter is required for all custom key
     *         stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     *         <p>
     *         The <code>XksProxyAuthenticationCredential</code> has two
     *         required elements: <code>RawSecretAccessKey</code>, a secret key,
     *         and <code>AccessKeyId</code>, a unique identifier for the
     *         <code>RawSecretAccessKey</code>. For character requirements, see
     *         <a href=
     *         "kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     *         >XksProxyAuthenticationCredentialType</a>.
     *         </p>
     *         <p>
     *         KMS uses this authentication credential to sign requests to the
     *         external key store proxy on your behalf. This credential is
     *         unrelated to Identity and Access Management (IAM) and Amazon Web
     *         Services credentials.
     *         </p>
     *         <p>
     *         This parameter doesn't set or change the authentication
     *         credentials on the XKS proxy. It just tells KMS the credential
     *         that you established on your external key store proxy. If you
     *         rotate your proxy authentication credential, use the
     *         <a>UpdateCustomKeyStore</a> operation to provide the new
     *         credential to KMS.
     *         </p>
     */
    public XksProxyAuthenticationCredentialType getXksProxyAuthenticationCredential() {
        return xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy
     * (XKS proxy). This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required
     * elements: <code>RawSecretAccessKey</code>, a secret key, and
     * <code>AccessKeyId</code>, a unique identifier for the
     * <code>RawSecretAccessKey</code>. For character requirements, see <a href=
     * "kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     * >XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external
     * key store proxy on your behalf. This credential is unrelated to Identity
     * and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on
     * the XKS proxy. It just tells KMS the credential that you established on
     * your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the
     * new credential to KMS.
     * </p>
     *
     * @param xksProxyAuthenticationCredential <p>
     *            Specifies an authentication credential for the external key
     *            store proxy (XKS proxy). This parameter is required for all
     *            custom key stores with a <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The <code>XksProxyAuthenticationCredential</code> has two
     *            required elements: <code>RawSecretAccessKey</code>, a secret
     *            key, and <code>AccessKeyId</code>, a unique identifier for the
     *            <code>RawSecretAccessKey</code>. For character requirements,
     *            see <a href=
     *            "kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     *            >XksProxyAuthenticationCredentialType</a>.
     *            </p>
     *            <p>
     *            KMS uses this authentication credential to sign requests to
     *            the external key store proxy on your behalf. This credential
     *            is unrelated to Identity and Access Management (IAM) and
     *            Amazon Web Services credentials.
     *            </p>
     *            <p>
     *            This parameter doesn't set or change the authentication
     *            credentials on the XKS proxy. It just tells KMS the credential
     *            that you established on your external key store proxy. If you
     *            rotate your proxy authentication credential, use the
     *            <a>UpdateCustomKeyStore</a> operation to provide the new
     *            credential to KMS.
     *            </p>
     */
    public void setXksProxyAuthenticationCredential(
            XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        this.xksProxyAuthenticationCredential = xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy
     * (XKS proxy). This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required
     * elements: <code>RawSecretAccessKey</code>, a secret key, and
     * <code>AccessKeyId</code>, a unique identifier for the
     * <code>RawSecretAccessKey</code>. For character requirements, see <a href=
     * "kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     * >XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external
     * key store proxy on your behalf. This credential is unrelated to Identity
     * and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on
     * the XKS proxy. It just tells KMS the credential that you established on
     * your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the
     * new credential to KMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xksProxyAuthenticationCredential <p>
     *            Specifies an authentication credential for the external key
     *            store proxy (XKS proxy). This parameter is required for all
     *            custom key stores with a <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            The <code>XksProxyAuthenticationCredential</code> has two
     *            required elements: <code>RawSecretAccessKey</code>, a secret
     *            key, and <code>AccessKeyId</code>, a unique identifier for the
     *            <code>RawSecretAccessKey</code>. For character requirements,
     *            see <a href=
     *            "kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     *            >XksProxyAuthenticationCredentialType</a>.
     *            </p>
     *            <p>
     *            KMS uses this authentication credential to sign requests to
     *            the external key store proxy on your behalf. This credential
     *            is unrelated to Identity and Access Management (IAM) and
     *            Amazon Web Services credentials.
     *            </p>
     *            <p>
     *            This parameter doesn't set or change the authentication
     *            credentials on the XKS proxy. It just tells KMS the credential
     *            that you established on your external key store proxy. If you
     *            rotate your proxy authentication credential, use the
     *            <a>UpdateCustomKeyStore</a> operation to provide the new
     *            credential to KMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withXksProxyAuthenticationCredential(
            XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        this.xksProxyAuthenticationCredential = xksProxyAuthenticationCredential;
        return this;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This
     * parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify
     * <code>PUBLIC_ENDPOINT</code>. If the external key store proxy uses a
     * Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a
     * private address space entirely within Amazon Web Services, but it
     * requires more configuration, including establishing a Amazon VPC with
     * multiple subnets, a VPC endpoint service, a network load balancer, and a
     * verified private DNS name. A public endpoint is simpler to set up, but it
     * might be slower and might not fulfill your security requirements. You
     * might consider testing with a public endpoint, and then establishing a
     * VPC endpoint service for production tasks. Note that this choice does not
     * determine the location of the external key store proxy. Even if you
     * choose a VPC endpoint service, the proxy can be hosted within the VPC or
     * outside of Amazon Web Services such as in your corporate data center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @return <p>
     *         Indicates how KMS communicates with the external key store proxy.
     *         This parameter is required for custom key stores with a
     *         <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     *         <p>
     *         If the external key store proxy uses a public endpoint, specify
     *         <code>PUBLIC_ENDPOINT</code>. If the external key store proxy
     *         uses a Amazon VPC endpoint service for communication with KMS,
     *         specify <code>VPC_ENDPOINT_SERVICE</code>. For help making this
     *         choice, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *         >Choosing a connectivity option</a> in the <i>Key Management
     *         Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         An Amazon VPC endpoint service keeps your communication with KMS
     *         in a private address space entirely within Amazon Web Services,
     *         but it requires more configuration, including establishing a
     *         Amazon VPC with multiple subnets, a VPC endpoint service, a
     *         network load balancer, and a verified private DNS name. A public
     *         endpoint is simpler to set up, but it might be slower and might
     *         not fulfill your security requirements. You might consider
     *         testing with a public endpoint, and then establishing a VPC
     *         endpoint service for production tasks. Note that this choice does
     *         not determine the location of the external key store proxy. Even
     *         if you choose a VPC endpoint service, the proxy can be hosted
     *         within the VPC or outside of Amazon Web Services such as in your
     *         corporate data center.
     *         </p>
     * @see XksProxyConnectivityType
     */
    public String getXksProxyConnectivity() {
        return xksProxyConnectivity;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This
     * parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify
     * <code>PUBLIC_ENDPOINT</code>. If the external key store proxy uses a
     * Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a
     * private address space entirely within Amazon Web Services, but it
     * requires more configuration, including establishing a Amazon VPC with
     * multiple subnets, a VPC endpoint service, a network load balancer, and a
     * verified private DNS name. A public endpoint is simpler to set up, but it
     * might be slower and might not fulfill your security requirements. You
     * might consider testing with a public endpoint, and then establishing a
     * VPC endpoint service for production tasks. Note that this choice does not
     * determine the location of the external key store proxy. Even if you
     * choose a VPC endpoint service, the proxy can be hosted within the VPC or
     * outside of Amazon Web Services such as in your corporate data center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Indicates how KMS communicates with the external key store
     *            proxy. This parameter is required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            If the external key store proxy uses a public endpoint,
     *            specify <code>PUBLIC_ENDPOINT</code>. If the external key
     *            store proxy uses a Amazon VPC endpoint service for
     *            communication with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. For help making this
     *            choice, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *            >Choosing a connectivity option</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            An Amazon VPC endpoint service keeps your communication with
     *            KMS in a private address space entirely within Amazon Web
     *            Services, but it requires more configuration, including
     *            establishing a Amazon VPC with multiple subnets, a VPC
     *            endpoint service, a network load balancer, and a verified
     *            private DNS name. A public endpoint is simpler to set up, but
     *            it might be slower and might not fulfill your security
     *            requirements. You might consider testing with a public
     *            endpoint, and then establishing a VPC endpoint service for
     *            production tasks. Note that this choice does not determine the
     *            location of the external key store proxy. Even if you choose a
     *            VPC endpoint service, the proxy can be hosted within the VPC
     *            or outside of Amazon Web Services such as in your corporate
     *            data center.
     *            </p>
     * @see XksProxyConnectivityType
     */
    public void setXksProxyConnectivity(String xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This
     * parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify
     * <code>PUBLIC_ENDPOINT</code>. If the external key store proxy uses a
     * Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a
     * private address space entirely within Amazon Web Services, but it
     * requires more configuration, including establishing a Amazon VPC with
     * multiple subnets, a VPC endpoint service, a network load balancer, and a
     * verified private DNS name. A public endpoint is simpler to set up, but it
     * might be slower and might not fulfill your security requirements. You
     * might consider testing with a public endpoint, and then establishing a
     * VPC endpoint service for production tasks. Note that this choice does not
     * determine the location of the external key store proxy. Even if you
     * choose a VPC endpoint service, the proxy can be hosted within the VPC or
     * outside of Amazon Web Services such as in your corporate data center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Indicates how KMS communicates with the external key store
     *            proxy. This parameter is required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            If the external key store proxy uses a public endpoint,
     *            specify <code>PUBLIC_ENDPOINT</code>. If the external key
     *            store proxy uses a Amazon VPC endpoint service for
     *            communication with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. For help making this
     *            choice, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *            >Choosing a connectivity option</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            An Amazon VPC endpoint service keeps your communication with
     *            KMS in a private address space entirely within Amazon Web
     *            Services, but it requires more configuration, including
     *            establishing a Amazon VPC with multiple subnets, a VPC
     *            endpoint service, a network load balancer, and a verified
     *            private DNS name. A public endpoint is simpler to set up, but
     *            it might be slower and might not fulfill your security
     *            requirements. You might consider testing with a public
     *            endpoint, and then establishing a VPC endpoint service for
     *            production tasks. Note that this choice does not determine the
     *            location of the external key store proxy. Even if you choose a
     *            VPC endpoint service, the proxy can be hosted within the VPC
     *            or outside of Amazon Web Services such as in your corporate
     *            data center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see XksProxyConnectivityType
     */
    public CreateCustomKeyStoreRequest withXksProxyConnectivity(String xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity;
        return this;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This
     * parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify
     * <code>PUBLIC_ENDPOINT</code>. If the external key store proxy uses a
     * Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a
     * private address space entirely within Amazon Web Services, but it
     * requires more configuration, including establishing a Amazon VPC with
     * multiple subnets, a VPC endpoint service, a network load balancer, and a
     * verified private DNS name. A public endpoint is simpler to set up, but it
     * might be slower and might not fulfill your security requirements. You
     * might consider testing with a public endpoint, and then establishing a
     * VPC endpoint service for production tasks. Note that this choice does not
     * determine the location of the external key store proxy. Even if you
     * choose a VPC endpoint service, the proxy can be hosted within the VPC or
     * outside of Amazon Web Services such as in your corporate data center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Indicates how KMS communicates with the external key store
     *            proxy. This parameter is required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            If the external key store proxy uses a public endpoint,
     *            specify <code>PUBLIC_ENDPOINT</code>. If the external key
     *            store proxy uses a Amazon VPC endpoint service for
     *            communication with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. For help making this
     *            choice, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *            >Choosing a connectivity option</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            An Amazon VPC endpoint service keeps your communication with
     *            KMS in a private address space entirely within Amazon Web
     *            Services, but it requires more configuration, including
     *            establishing a Amazon VPC with multiple subnets, a VPC
     *            endpoint service, a network load balancer, and a verified
     *            private DNS name. A public endpoint is simpler to set up, but
     *            it might be slower and might not fulfill your security
     *            requirements. You might consider testing with a public
     *            endpoint, and then establishing a VPC endpoint service for
     *            production tasks. Note that this choice does not determine the
     *            location of the external key store proxy. Even if you choose a
     *            VPC endpoint service, the proxy can be hosted within the VPC
     *            or outside of Amazon Web Services such as in your corporate
     *            data center.
     *            </p>
     * @see XksProxyConnectivityType
     */
    public void setXksProxyConnectivity(XksProxyConnectivityType xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity.toString();
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This
     * parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify
     * <code>PUBLIC_ENDPOINT</code>. If the external key store proxy uses a
     * Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a
     * private address space entirely within Amazon Web Services, but it
     * requires more configuration, including establishing a Amazon VPC with
     * multiple subnets, a VPC endpoint service, a network load balancer, and a
     * verified private DNS name. A public endpoint is simpler to set up, but it
     * might be slower and might not fulfill your security requirements. You
     * might consider testing with a public endpoint, and then establishing a
     * VPC endpoint service for production tasks. Note that this choice does not
     * determine the location of the external key store proxy. Even if you
     * choose a VPC endpoint service, the proxy can be hosted within the VPC or
     * outside of Amazon Web Services such as in your corporate data center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE
     *
     * @param xksProxyConnectivity <p>
     *            Indicates how KMS communicates with the external key store
     *            proxy. This parameter is required for custom key stores with a
     *            <code>CustomKeyStoreType</code> of
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     *            <p>
     *            If the external key store proxy uses a public endpoint,
     *            specify <code>PUBLIC_ENDPOINT</code>. If the external key
     *            store proxy uses a Amazon VPC endpoint service for
     *            communication with KMS, specify
     *            <code>VPC_ENDPOINT_SERVICE</code>. For help making this
     *            choice, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *            >Choosing a connectivity option</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            An Amazon VPC endpoint service keeps your communication with
     *            KMS in a private address space entirely within Amazon Web
     *            Services, but it requires more configuration, including
     *            establishing a Amazon VPC with multiple subnets, a VPC
     *            endpoint service, a network load balancer, and a verified
     *            private DNS name. A public endpoint is simpler to set up, but
     *            it might be slower and might not fulfill your security
     *            requirements. You might consider testing with a public
     *            endpoint, and then establishing a VPC endpoint service for
     *            production tasks. Note that this choice does not determine the
     *            location of the external key store proxy. Even if you choose a
     *            VPC endpoint service, the proxy can be hosted within the VPC
     *            or outside of Amazon Web Services such as in your corporate
     *            data center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see XksProxyConnectivityType
     */
    public CreateCustomKeyStoreRequest withXksProxyConnectivity(
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
        if (getCustomKeyStoreName() != null)
            sb.append("CustomKeyStoreName: " + getCustomKeyStoreName() + ",");
        if (getCloudHsmClusterId() != null)
            sb.append("CloudHsmClusterId: " + getCloudHsmClusterId() + ",");
        if (getTrustAnchorCertificate() != null)
            sb.append("TrustAnchorCertificate: " + getTrustAnchorCertificate() + ",");
        if (getKeyStorePassword() != null)
            sb.append("KeyStorePassword: " + getKeyStorePassword() + ",");
        if (getCustomKeyStoreType() != null)
            sb.append("CustomKeyStoreType: " + getCustomKeyStoreType() + ",");
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
                + ((getCustomKeyStoreName() == null) ? 0 : getCustomKeyStoreName().hashCode());
        hashCode = prime * hashCode
                + ((getCloudHsmClusterId() == null) ? 0 : getCloudHsmClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrustAnchorCertificate() == null) ? 0 : getTrustAnchorCertificate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKeyStorePassword() == null) ? 0 : getKeyStorePassword().hashCode());
        hashCode = prime * hashCode
                + ((getCustomKeyStoreType() == null) ? 0 : getCustomKeyStoreType().hashCode());
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

        if (obj instanceof CreateCustomKeyStoreRequest == false)
            return false;
        CreateCustomKeyStoreRequest other = (CreateCustomKeyStoreRequest) obj;

        if (other.getCustomKeyStoreName() == null ^ this.getCustomKeyStoreName() == null)
            return false;
        if (other.getCustomKeyStoreName() != null
                && other.getCustomKeyStoreName().equals(this.getCustomKeyStoreName()) == false)
            return false;
        if (other.getCloudHsmClusterId() == null ^ this.getCloudHsmClusterId() == null)
            return false;
        if (other.getCloudHsmClusterId() != null
                && other.getCloudHsmClusterId().equals(this.getCloudHsmClusterId()) == false)
            return false;
        if (other.getTrustAnchorCertificate() == null ^ this.getTrustAnchorCertificate() == null)
            return false;
        if (other.getTrustAnchorCertificate() != null
                && other.getTrustAnchorCertificate().equals(this.getTrustAnchorCertificate()) == false)
            return false;
        if (other.getKeyStorePassword() == null ^ this.getKeyStorePassword() == null)
            return false;
        if (other.getKeyStorePassword() != null
                && other.getKeyStorePassword().equals(this.getKeyStorePassword()) == false)
            return false;
        if (other.getCustomKeyStoreType() == null ^ this.getCustomKeyStoreType() == null)
            return false;
        if (other.getCustomKeyStoreType() != null
                && other.getCustomKeyStoreType().equals(this.getCustomKeyStoreType()) == false)
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
