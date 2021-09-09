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

/**
 * <p>
 * Describes the configuration of this multi-Region key. This field appears only
 * when the KMS key is a primary or replica of a multi-Region key.
 * </p>
 * <p>
 * For more information about any listed KMS key, use the <a>DescribeKey</a>
 * operation.
 * </p>
 */
public class MultiRegionConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether the KMS key is a <code>PRIMARY</code> or
     * <code>REPLICA</code> key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, REPLICA
     */
    private String multiRegionKeyType;

    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes
     * the current KMS key if it is the primary key.
     * </p>
     */
    private MultiRegionKey primaryKey;

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field
     * includes the current KMS key if it is a replica key.
     * </p>
     */
    private java.util.List<MultiRegionKey> replicaKeys = new java.util.ArrayList<MultiRegionKey>();

    /**
     * <p>
     * Indicates whether the KMS key is a <code>PRIMARY</code> or
     * <code>REPLICA</code> key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, REPLICA
     *
     * @return <p>
     *         Indicates whether the KMS key is a <code>PRIMARY</code> or
     *         <code>REPLICA</code> key.
     *         </p>
     * @see MultiRegionKeyType
     */
    public String getMultiRegionKeyType() {
        return multiRegionKeyType;
    }

    /**
     * <p>
     * Indicates whether the KMS key is a <code>PRIMARY</code> or
     * <code>REPLICA</code> key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, REPLICA
     *
     * @param multiRegionKeyType <p>
     *            Indicates whether the KMS key is a <code>PRIMARY</code> or
     *            <code>REPLICA</code> key.
     *            </p>
     * @see MultiRegionKeyType
     */
    public void setMultiRegionKeyType(String multiRegionKeyType) {
        this.multiRegionKeyType = multiRegionKeyType;
    }

    /**
     * <p>
     * Indicates whether the KMS key is a <code>PRIMARY</code> or
     * <code>REPLICA</code> key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, REPLICA
     *
     * @param multiRegionKeyType <p>
     *            Indicates whether the KMS key is a <code>PRIMARY</code> or
     *            <code>REPLICA</code> key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MultiRegionKeyType
     */
    public MultiRegionConfiguration withMultiRegionKeyType(String multiRegionKeyType) {
        this.multiRegionKeyType = multiRegionKeyType;
        return this;
    }

    /**
     * <p>
     * Indicates whether the KMS key is a <code>PRIMARY</code> or
     * <code>REPLICA</code> key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, REPLICA
     *
     * @param multiRegionKeyType <p>
     *            Indicates whether the KMS key is a <code>PRIMARY</code> or
     *            <code>REPLICA</code> key.
     *            </p>
     * @see MultiRegionKeyType
     */
    public void setMultiRegionKeyType(MultiRegionKeyType multiRegionKeyType) {
        this.multiRegionKeyType = multiRegionKeyType.toString();
    }

    /**
     * <p>
     * Indicates whether the KMS key is a <code>PRIMARY</code> or
     * <code>REPLICA</code> key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, REPLICA
     *
     * @param multiRegionKeyType <p>
     *            Indicates whether the KMS key is a <code>PRIMARY</code> or
     *            <code>REPLICA</code> key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MultiRegionKeyType
     */
    public MultiRegionConfiguration withMultiRegionKeyType(MultiRegionKeyType multiRegionKeyType) {
        this.multiRegionKeyType = multiRegionKeyType.toString();
        return this;
    }

    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes
     * the current KMS key if it is the primary key.
     * </p>
     *
     * @return <p>
     *         Displays the key ARN and Region of the primary key. This field
     *         includes the current KMS key if it is the primary key.
     *         </p>
     */
    public MultiRegionKey getPrimaryKey() {
        return primaryKey;
    }

    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes
     * the current KMS key if it is the primary key.
     * </p>
     *
     * @param primaryKey <p>
     *            Displays the key ARN and Region of the primary key. This field
     *            includes the current KMS key if it is the primary key.
     *            </p>
     */
    public void setPrimaryKey(MultiRegionKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * <p>
     * Displays the key ARN and Region of the primary key. This field includes
     * the current KMS key if it is the primary key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryKey <p>
     *            Displays the key ARN and Region of the primary key. This field
     *            includes the current KMS key if it is the primary key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiRegionConfiguration withPrimaryKey(MultiRegionKey primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field
     * includes the current KMS key if it is a replica key.
     * </p>
     *
     * @return <p>
     *         displays the key ARNs and Regions of all replica keys. This field
     *         includes the current KMS key if it is a replica key.
     *         </p>
     */
    public java.util.List<MultiRegionKey> getReplicaKeys() {
        return replicaKeys;
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field
     * includes the current KMS key if it is a replica key.
     * </p>
     *
     * @param replicaKeys <p>
     *            displays the key ARNs and Regions of all replica keys. This
     *            field includes the current KMS key if it is a replica key.
     *            </p>
     */
    public void setReplicaKeys(java.util.Collection<MultiRegionKey> replicaKeys) {
        if (replicaKeys == null) {
            this.replicaKeys = null;
            return;
        }

        this.replicaKeys = new java.util.ArrayList<MultiRegionKey>(replicaKeys);
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field
     * includes the current KMS key if it is a replica key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaKeys <p>
     *            displays the key ARNs and Regions of all replica keys. This
     *            field includes the current KMS key if it is a replica key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiRegionConfiguration withReplicaKeys(MultiRegionKey... replicaKeys) {
        if (getReplicaKeys() == null) {
            this.replicaKeys = new java.util.ArrayList<MultiRegionKey>(replicaKeys.length);
        }
        for (MultiRegionKey value : replicaKeys) {
            this.replicaKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * displays the key ARNs and Regions of all replica keys. This field
     * includes the current KMS key if it is a replica key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaKeys <p>
     *            displays the key ARNs and Regions of all replica keys. This
     *            field includes the current KMS key if it is a replica key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiRegionConfiguration withReplicaKeys(java.util.Collection<MultiRegionKey> replicaKeys) {
        setReplicaKeys(replicaKeys);
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
        if (getMultiRegionKeyType() != null)
            sb.append("MultiRegionKeyType: " + getMultiRegionKeyType() + ",");
        if (getPrimaryKey() != null)
            sb.append("PrimaryKey: " + getPrimaryKey() + ",");
        if (getReplicaKeys() != null)
            sb.append("ReplicaKeys: " + getReplicaKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMultiRegionKeyType() == null) ? 0 : getMultiRegionKeyType().hashCode());
        hashCode = prime * hashCode + ((getPrimaryKey() == null) ? 0 : getPrimaryKey().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaKeys() == null) ? 0 : getReplicaKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionConfiguration == false)
            return false;
        MultiRegionConfiguration other = (MultiRegionConfiguration) obj;

        if (other.getMultiRegionKeyType() == null ^ this.getMultiRegionKeyType() == null)
            return false;
        if (other.getMultiRegionKeyType() != null
                && other.getMultiRegionKeyType().equals(this.getMultiRegionKeyType()) == false)
            return false;
        if (other.getPrimaryKey() == null ^ this.getPrimaryKey() == null)
            return false;
        if (other.getPrimaryKey() != null
                && other.getPrimaryKey().equals(this.getPrimaryKey()) == false)
            return false;
        if (other.getReplicaKeys() == null ^ this.getReplicaKeys() == null)
            return false;
        if (other.getReplicaKeys() != null
                && other.getReplicaKeys().equals(this.getReplicaKeys()) == false)
            return false;
        return true;
    }
}
