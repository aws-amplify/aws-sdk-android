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
 * Changes the properties of a custom key store. Use the
 * <code>CustomKeyStoreId</code> parameter to identify the custom key store you
 * want to edit. Use the remaining parameters to change the properties of the
 * custom key store.
 * </p>
 * <p>
 * You can only update a custom key store that is disconnected. To disconnect
 * the custom key store, use <a>DisconnectCustomKeyStore</a>. To reconnect the
 * custom key store after the update completes, use
 * <a>ConnectCustomKeyStore</a>. To find the connection state of a custom key
 * store, use the <a>DescribeCustomKeyStores</a> operation.
 * </p>
 * <p>
 * Use the <code>NewCustomKeyStoreName</code> parameter to change the friendly
 * name of the custom key store to the value that you specify.
 * </p>
 * <p>
 * Use the <code>KeyStorePassword</code> parameter tell AWS KMS the current
 * password of the <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser"
 * > <code>kmsuser</code> crypto user (CU)</a> in the associated AWS CloudHSM
 * cluster. You can use this parameter to fix connection failures that occur
 * when AWS KMS cannot log into the associated cluster because the
 * <code>kmsuser</code> password has changed. This value does not change the
 * password in the AWS CloudHSM cluster.
 * </p>
 * <p>
 * Use the <code>CloudHsmClusterId</code> parameter to associate the custom key
 * store with a related AWS CloudHSM cluster, that is, a cluster that shares a
 * backup history with the original cluster. You can use this parameter to
 * repair a custom key store if its AWS CloudHSM cluster becomes corrupted or is
 * deleted, or when you need to create or restore a cluster from a backup.
 * </p>
 * <p>
 * The cluster ID must identify a AWS CloudHSM cluster with the following
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
 * The cluster must have the same cluster certificate as the original cluster.
 * You cannot use this parameter to associate the custom key store with an
 * unrelated cluster. To view the cluster certificate, use the AWS CloudHSM <a
 * href=
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
 * If the operation succeeds, it returns a JSON object with no properties.
 * </p>
 * <p>
 * This operation is part of the <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >Custom Key Store feature</a> feature in AWS KMS, which combines the
 * convenience and extensive integration of AWS KMS with the isolation and
 * control of a single-tenant key store.
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
     * specify. The custom key store name must be unique in the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String newCustomKeyStoreName;

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU)
     * in the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the
     * <code>kmsuser</code> crypto user (CU). It does not set or change the
     * password of any users in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String keyStorePassword;

    /**
     * <p>
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history with the original
     * cluster. You cannot use this parameter to associate a custom key store
     * with a different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate.
     * To view the cluster certificate of a cluster, use the <a href=
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
     * specify. The custom key store name must be unique in the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Changes the friendly name of the custom key store to the value
     *         that you specify. The custom key store name must be unique in the
     *         AWS account.
     *         </p>
     */
    public String getNewCustomKeyStoreName() {
        return newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you
     * specify. The custom key store name must be unique in the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param newCustomKeyStoreName <p>
     *            Changes the friendly name of the custom key store to the value
     *            that you specify. The custom key store name must be unique in
     *            the AWS account.
     *            </p>
     */
    public void setNewCustomKeyStoreName(String newCustomKeyStoreName) {
        this.newCustomKeyStoreName = newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you
     * specify. The custom key store name must be unique in the AWS account.
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
     *            the AWS account.
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
     * in the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the
     * <code>kmsuser</code> crypto user (CU). It does not set or change the
     * password of any users in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Enter the current password of the <code>kmsuser</code> crypto
     *         user (CU) in the AWS CloudHSM cluster that is associated with the
     *         custom key store.
     *         </p>
     *         <p>
     *         This parameter tells AWS KMS the current password of the
     *         <code>kmsuser</code> crypto user (CU). It does not set or change
     *         the password of any users in the AWS CloudHSM cluster.
     *         </p>
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU)
     * in the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the
     * <code>kmsuser</code> crypto user (CU). It does not set or change the
     * password of any users in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param keyStorePassword <p>
     *            Enter the current password of the <code>kmsuser</code> crypto
     *            user (CU) in the AWS CloudHSM cluster that is associated with
     *            the custom key store.
     *            </p>
     *            <p>
     *            This parameter tells AWS KMS the current password of the
     *            <code>kmsuser</code> crypto user (CU). It does not set or
     *            change the password of any users in the AWS CloudHSM cluster.
     *            </p>
     */
    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU)
     * in the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the
     * <code>kmsuser</code> crypto user (CU). It does not set or change the
     * password of any users in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param keyStorePassword <p>
     *            Enter the current password of the <code>kmsuser</code> crypto
     *            user (CU) in the AWS CloudHSM cluster that is associated with
     *            the custom key store.
     *            </p>
     *            <p>
     *            This parameter tells AWS KMS the current password of the
     *            <code>kmsuser</code> crypto user (CU). It does not set or
     *            change the password of any users in the AWS CloudHSM cluster.
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
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history with the original
     * cluster. You cannot use this parameter to associate a custom key store
     * with a different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate.
     * To view the cluster certificate of a cluster, use the <a href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @return <p>
     *         Associates the custom key store with a related AWS CloudHSM
     *         cluster.
     *         </p>
     *         <p>
     *         Enter the cluster ID of the cluster that you used to create the
     *         custom key store or a cluster that shares a backup history with
     *         the original cluster. You cannot use this parameter to associate
     *         a custom key store with a different cluster.
     *         </p>
     *         <p>
     *         Clusters that share a backup history have the same cluster
     *         certificate. To view the cluster certificate of a cluster, use
     *         the <a href=
     *         "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     *         </p>
     */
    public String getCloudHsmClusterId() {
        return cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history with the original
     * cluster. You cannot use this parameter to associate a custom key store
     * with a different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate.
     * To view the cluster certificate of a cluster, use the <a href=
     * "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     * >DescribeClusters</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @param cloudHsmClusterId <p>
     *            Associates the custom key store with a related AWS CloudHSM
     *            cluster.
     *            </p>
     *            <p>
     *            Enter the cluster ID of the cluster that you used to create
     *            the custom key store or a cluster that shares a backup history
     *            with the original cluster. You cannot use this parameter to
     *            associate a custom key store with a different cluster.
     *            </p>
     *            <p>
     *            Clusters that share a backup history have the same cluster
     *            certificate. To view the cluster certificate of a cluster, use
     *            the <a href=
     *            "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *            >DescribeClusters</a> operation.
     *            </p>
     */
    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom
     * key store or a cluster that shares a backup history with the original
     * cluster. You cannot use this parameter to associate a custom key store
     * with a different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate.
     * To view the cluster certificate of a cluster, use the <a href=
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
     *            Associates the custom key store with a related AWS CloudHSM
     *            cluster.
     *            </p>
     *            <p>
     *            Enter the cluster ID of the cluster that you used to create
     *            the custom key store or a cluster that shares a backup history
     *            with the original cluster. You cannot use this parameter to
     *            associate a custom key store with a different cluster.
     *            </p>
     *            <p>
     *            Clusters that share a backup history have the same cluster
     *            certificate. To view the cluster certificate of a cluster, use
     *            the <a href=
     *            "http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *            >DescribeClusters</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomKeyStoreRequest withCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
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
            sb.append("CloudHsmClusterId: " + getCloudHsmClusterId());
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
        return true;
    }
}
