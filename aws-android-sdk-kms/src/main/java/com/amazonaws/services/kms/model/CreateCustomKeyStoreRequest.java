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
 * Creates a <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
 * >custom key store</a> that is associated with an <a
 * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/clusters.html">AWS
 * CloudHSM cluster</a> that you own and manage.
 * </p>
 * <p>
 * This operation is part of the <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >Custom Key Store feature</a> feature in AWS KMS, which combines the
 * convenience and extensive integration of AWS KMS with the isolation and
 * control of a single-tenant key store.
 * </p>
 * <p>
 * When the operation completes successfully, it returns the ID of the new
 * custom key store. Before you can use your new custom key store, you need to
 * use the <a>ConnectCustomKeyStore</a> operation to connect the new key store
 * to its AWS CloudHSM cluster.
 * </p>
 * <p>
 * The <code>CreateCustomKeyStore</code> operation requires the following
 * elements.
 * </p>
 * <ul>
 * <li>
 * <p>
 * You must specify an active AWS CloudHSM cluster in the same account and AWS
 * Region as the custom key store. You can use an existing cluster or <a href=
 * "http://docs.aws.amazon.com/cloudhsm/latest/userguide/create-cluster.html"
 * >create and activate a new AWS CloudHSM cluster</a> for the key store. AWS
 * KMS does not require exclusive use of the cluster.
 * </p>
 * </li>
 * <li>
 * <p>
 * You must include the content of the <i>trust anchor certificate</i> for the
 * cluster. You created this certificate, and saved it in the
 * <code>customerCA.crt</code> file, when you <a href=
 * "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr"
 * >initialized the cluster</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You must provide the password of the dedicated <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
 * > <code>kmsuser</code> crypto user</a> (CU) account in the cluster.
 * </p>
 * <p>
 * Before you create the custom key store, use the <a href=
 * "http://docs.aws.amazon.com/cloudhsm/latest/userguide/cloudhsm_mgmt_util-createUser.html"
 * >createUser</a> command in <code>cloudhsm_mgmt_util</code> to create <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
 * >a crypto user (CU) named <code>kmsuser</code> </a>in specified AWS CloudHSM
 * cluster. AWS KMS uses the <code>kmsuser</code> CU account to create and
 * manage key material on your behalf. For instructions, see <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
 * >Create the kmsuser Crypto User</a> in the <i>AWS Key Management Service
 * Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The AWS CloudHSM cluster that you specify must meet the following
 * requirements.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The cluster must be active and be in the same AWS account and Region as the
 * custom key store.
 * </p>
 * </li>
 * <li>
 * <p>
 * Each custom key store must be associated with a different AWS CloudHSM
 * cluster. The cluster cannot be associated with another custom key store or
 * have the same cluster certificate as a cluster that is associated with
 * another custom key store. To view the cluster certificate, use the AWS
 * CloudHSM <a href=
 * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
 * >DescribeClusters</a> operation. Clusters that share a backup history have
 * the same cluster certificate.
 * </p>
 * </li>
 * <li>
 * <p>
 * The cluster must be configured with subnets in at least two different
 * Availability Zones in the Region. Because AWS CloudHSM is not supported in
 * all Availability Zones, we recommend that the cluster have subnets in all
 * Availability Zones in the Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * The cluster must contain at least two active HSMs, each in a different
 * Availability Zone.
 * </p>
 * </li>
 * </ul>
 * <p>
 * New custom key stores are not automatically connected. After you create your
 * custom key store, use the <a>ConnectCustomKeyStore</a> operation to connect
 * the custom key store to its associated AWS CloudHSM cluster. Even if you are
 * not going to use your custom key store immediately, you might want to connect
 * it to verify that all settings are correct and then disconnect it until you
 * are ready to use it.
 * </p>
 * <p>
 * If this operation succeeds, it returns the ID of the new custom key store.
 * For help with failures, see <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html"
 * >Troubleshoot a Custom Key Store</a> in the <i>AWS KMS Developer Guide</i>.
 * </p>
 */
public class CreateCustomKeyStoreRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String customKeyStoreName;

    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the
     * cluster ID of any active AWS CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     */
    private String cloudHsmClusterId;

    /**
     * <p>
     * Enter the content of the trust anchor certificate for the cluster. This
     * is the content of the <code>customerCA.crt</code> file that you created
     * when you <a href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     * >initialized the cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     */
    private String trustAnchorCertificate;

    /**
     * <p>
     * Enter the password of the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS
     * CloudHSM cluster. AWS KMS logs into the cluster as this user to manage
     * key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password;
     * it does not change the password in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String keyStorePassword;

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Specifies a friendly name for the custom key store. The name must
     *         be unique in your AWS account.
     *         </p>
     */
    public String getCustomKeyStoreName() {
        return customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param customKeyStoreName <p>
     *            Specifies a friendly name for the custom key store. The name
     *            must be unique in your AWS account.
     *            </p>
     */
    public void setCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be
     * unique in your AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param customKeyStoreName <p>
     *            Specifies a friendly name for the custom key store. The name
     *            must be unique in your AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomKeyStoreRequest withCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
        return this;
    }

    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the
     * cluster ID of any active AWS CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @return <p>
     *         Identifies the AWS CloudHSM cluster for the custom key store.
     *         Enter the cluster ID of any active AWS CloudHSM cluster that is
     *         not already associated with a custom key store. To find the
     *         cluster ID, use the <a href=
     *         "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     *         </p>
     */
    public String getCloudHsmClusterId() {
        return cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the
     * cluster ID of any active AWS CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @param cloudHsmClusterId <p>
     *            Identifies the AWS CloudHSM cluster for the custom key store.
     *            Enter the cluster ID of any active AWS CloudHSM cluster that
     *            is not already associated with a custom key store. To find the
     *            cluster ID, use the <a href=
     *            "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *            >DescribeClusters</a> operation.
     *            </p>
     */
    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the
     * cluster ID of any active AWS CloudHSM cluster that is not already
     * associated with a custom key store. To find the cluster ID, use the <a
     * href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @param cloudHsmClusterId <p>
     *            Identifies the AWS CloudHSM cluster for the custom key store.
     *            Enter the cluster ID of any active AWS CloudHSM cluster that
     *            is not already associated with a custom key store. To find the
     *            cluster ID, use the <a href=
     *            "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
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
     * Enter the content of the trust anchor certificate for the cluster. This
     * is the content of the <code>customerCA.crt</code> file that you created
     * when you <a href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     * >initialized the cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @return <p>
     *         Enter the content of the trust anchor certificate for the
     *         cluster. This is the content of the <code>customerCA.crt</code>
     *         file that you created when you <a href=
     *         "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     *         >initialized the cluster</a>.
     *         </p>
     */
    public String getTrustAnchorCertificate() {
        return trustAnchorCertificate;
    }

    /**
     * <p>
     * Enter the content of the trust anchor certificate for the cluster. This
     * is the content of the <code>customerCA.crt</code> file that you created
     * when you <a href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     * >initialized the cluster</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @param trustAnchorCertificate <p>
     *            Enter the content of the trust anchor certificate for the
     *            cluster. This is the content of the
     *            <code>customerCA.crt</code> file that you created when you <a
     *            href=
     *            "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
     *            >initialized the cluster</a>.
     *            </p>
     */
    public void setTrustAnchorCertificate(String trustAnchorCertificate) {
        this.trustAnchorCertificate = trustAnchorCertificate;
    }

    /**
     * <p>
     * Enter the content of the trust anchor certificate for the cluster. This
     * is the content of the <code>customerCA.crt</code> file that you created
     * when you <a href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
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
     *            Enter the content of the trust anchor certificate for the
     *            cluster. This is the content of the
     *            <code>customerCA.crt</code> file that you created when you <a
     *            href=
     *            "http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html"
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
     * Enter the password of the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS
     * CloudHSM cluster. AWS KMS logs into the cluster as this user to manage
     * key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password;
     * it does not change the password in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Enter the password of the <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     *         > <code>kmsuser</code> crypto user (CU) account</a> in the
     *         specified AWS CloudHSM cluster. AWS KMS logs into the cluster as
     *         this user to manage key material on your behalf.
     *         </p>
     *         <p>
     *         This parameter tells AWS KMS the <code>kmsuser</code> account
     *         password; it does not change the password in the AWS CloudHSM
     *         cluster.
     *         </p>
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * <p>
     * Enter the password of the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS
     * CloudHSM cluster. AWS KMS logs into the cluster as this user to manage
     * key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password;
     * it does not change the password in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param keyStorePassword <p>
     *            Enter the password of the <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     *            > <code>kmsuser</code> crypto user (CU) account</a> in the
     *            specified AWS CloudHSM cluster. AWS KMS logs into the cluster
     *            as this user to manage key material on your behalf.
     *            </p>
     *            <p>
     *            This parameter tells AWS KMS the <code>kmsuser</code> account
     *            password; it does not change the password in the AWS CloudHSM
     *            cluster.
     *            </p>
     */
    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Enter the password of the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     * > <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS
     * CloudHSM cluster. AWS KMS logs into the cluster as this user to manage
     * key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password;
     * it does not change the password in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param keyStorePassword <p>
     *            Enter the password of the <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
     *            > <code>kmsuser</code> crypto user (CU) account</a> in the
     *            specified AWS CloudHSM cluster. AWS KMS logs into the cluster
     *            as this user to manage key material on your behalf.
     *            </p>
     *            <p>
     *            This parameter tells AWS KMS the <code>kmsuser</code> account
     *            password; it does not change the password in the AWS CloudHSM
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
            sb.append("KeyStorePassword: " + getKeyStorePassword());
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
        return true;
    }
}
