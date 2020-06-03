/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * StorageTypes represents the list of storage related types and their
 * attributes that are available for given InstanceType.
 * </p>
 */
public class StorageType implements Serializable {
    /**
     * <p>
     * Type of the storage. List of available storage options:
     * <ol>
     * <li>instance</li> Inbuilt storage available for the given Instance
     * <li>ebs</li> Elastic block storage that would be attached to the given
     * Instance
     * </ol>
     * </p>
     */
    private String storageTypeName;

    /**
     * <p>
     * SubType of the given storage type. List of available sub-storage options:
     * For "instance" storageType we wont have any storageSubType, in case of
     * "ebs" storageType we will have following valid storageSubTypes
     * <ol>
     * <li>standard</li>
     * <li>gp2</li>
     * <li>io1</li>
     * </ol>
     * Refer <code><a>VolumeType</a></code> for more information regarding above
     * EBS storage options.
     * </p>
     */
    private String storageSubTypeName;

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     */
    private java.util.List<StorageTypeLimit> storageTypeLimits;

    /**
     * <p>
     * Type of the storage. List of available storage options:
     * <ol>
     * <li>instance</li> Inbuilt storage available for the given Instance
     * <li>ebs</li> Elastic block storage that would be attached to the given
     * Instance
     * </ol>
     * </p>
     *
     * @return <p>
     *         Type of the storage. List of available storage options:
     *         <ol>
     *         <li>instance</li> Inbuilt storage available for the given
     *         Instance
     *         <li>ebs</li> Elastic block storage that would be attached to the
     *         given Instance
     *         </ol>
     *         </p>
     */
    public String getStorageTypeName() {
        return storageTypeName;
    }

    /**
     * <p>
     * Type of the storage. List of available storage options:
     * <ol>
     * <li>instance</li> Inbuilt storage available for the given Instance
     * <li>ebs</li> Elastic block storage that would be attached to the given
     * Instance
     * </ol>
     * </p>
     *
     * @param storageTypeName <p>
     *            Type of the storage. List of available storage options:
     *            <ol>
     *            <li>instance</li> Inbuilt storage available for the given
     *            Instance
     *            <li>ebs</li> Elastic block storage that would be attached to
     *            the given Instance
     *            </ol>
     *            </p>
     */
    public void setStorageTypeName(String storageTypeName) {
        this.storageTypeName = storageTypeName;
    }

    /**
     * <p>
     * Type of the storage. List of available storage options:
     * <ol>
     * <li>instance</li> Inbuilt storage available for the given Instance
     * <li>ebs</li> Elastic block storage that would be attached to the given
     * Instance
     * </ol>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageTypeName <p>
     *            Type of the storage. List of available storage options:
     *            <ol>
     *            <li>instance</li> Inbuilt storage available for the given
     *            Instance
     *            <li>ebs</li> Elastic block storage that would be attached to
     *            the given Instance
     *            </ol>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageType withStorageTypeName(String storageTypeName) {
        this.storageTypeName = storageTypeName;
        return this;
    }

    /**
     * <p>
     * SubType of the given storage type. List of available sub-storage options:
     * For "instance" storageType we wont have any storageSubType, in case of
     * "ebs" storageType we will have following valid storageSubTypes
     * <ol>
     * <li>standard</li>
     * <li>gp2</li>
     * <li>io1</li>
     * </ol>
     * Refer <code><a>VolumeType</a></code> for more information regarding above
     * EBS storage options.
     * </p>
     *
     * @return <p>
     *         SubType of the given storage type. List of available sub-storage
     *         options: For "instance" storageType we wont have any
     *         storageSubType, in case of "ebs" storageType we will have
     *         following valid storageSubTypes
     *         <ol>
     *         <li>standard</li>
     *         <li>gp2</li>
     *         <li>io1</li>
     *         </ol>
     *         Refer <code><a>VolumeType</a></code> for more information
     *         regarding above EBS storage options.
     *         </p>
     */
    public String getStorageSubTypeName() {
        return storageSubTypeName;
    }

    /**
     * <p>
     * SubType of the given storage type. List of available sub-storage options:
     * For "instance" storageType we wont have any storageSubType, in case of
     * "ebs" storageType we will have following valid storageSubTypes
     * <ol>
     * <li>standard</li>
     * <li>gp2</li>
     * <li>io1</li>
     * </ol>
     * Refer <code><a>VolumeType</a></code> for more information regarding above
     * EBS storage options.
     * </p>
     *
     * @param storageSubTypeName <p>
     *            SubType of the given storage type. List of available
     *            sub-storage options: For "instance" storageType we wont have
     *            any storageSubType, in case of "ebs" storageType we will have
     *            following valid storageSubTypes
     *            <ol>
     *            <li>standard</li>
     *            <li>gp2</li>
     *            <li>io1</li>
     *            </ol>
     *            Refer <code><a>VolumeType</a></code> for more information
     *            regarding above EBS storage options.
     *            </p>
     */
    public void setStorageSubTypeName(String storageSubTypeName) {
        this.storageSubTypeName = storageSubTypeName;
    }

    /**
     * <p>
     * SubType of the given storage type. List of available sub-storage options:
     * For "instance" storageType we wont have any storageSubType, in case of
     * "ebs" storageType we will have following valid storageSubTypes
     * <ol>
     * <li>standard</li>
     * <li>gp2</li>
     * <li>io1</li>
     * </ol>
     * Refer <code><a>VolumeType</a></code> for more information regarding above
     * EBS storage options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageSubTypeName <p>
     *            SubType of the given storage type. List of available
     *            sub-storage options: For "instance" storageType we wont have
     *            any storageSubType, in case of "ebs" storageType we will have
     *            following valid storageSubTypes
     *            <ol>
     *            <li>standard</li>
     *            <li>gp2</li>
     *            <li>io1</li>
     *            </ol>
     *            Refer <code><a>VolumeType</a></code> for more information
     *            regarding above EBS storage options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageType withStorageSubTypeName(String storageSubTypeName) {
        this.storageSubTypeName = storageSubTypeName;
        return this;
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     *
     * @return <p>
     *         List of limits that are applicable for given storage type.
     *         </p>
     */
    public java.util.List<StorageTypeLimit> getStorageTypeLimits() {
        return storageTypeLimits;
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     *
     * @param storageTypeLimits <p>
     *            List of limits that are applicable for given storage type.
     *            </p>
     */
    public void setStorageTypeLimits(java.util.Collection<StorageTypeLimit> storageTypeLimits) {
        if (storageTypeLimits == null) {
            this.storageTypeLimits = null;
            return;
        }

        this.storageTypeLimits = new java.util.ArrayList<StorageTypeLimit>(storageTypeLimits);
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageTypeLimits <p>
     *            List of limits that are applicable for given storage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageType withStorageTypeLimits(StorageTypeLimit... storageTypeLimits) {
        if (getStorageTypeLimits() == null) {
            this.storageTypeLimits = new java.util.ArrayList<StorageTypeLimit>(
                    storageTypeLimits.length);
        }
        for (StorageTypeLimit value : storageTypeLimits) {
            this.storageTypeLimits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageTypeLimits <p>
     *            List of limits that are applicable for given storage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageType withStorageTypeLimits(
            java.util.Collection<StorageTypeLimit> storageTypeLimits) {
        setStorageTypeLimits(storageTypeLimits);
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
        if (getStorageTypeName() != null)
            sb.append("StorageTypeName: " + getStorageTypeName() + ",");
        if (getStorageSubTypeName() != null)
            sb.append("StorageSubTypeName: " + getStorageSubTypeName() + ",");
        if (getStorageTypeLimits() != null)
            sb.append("StorageTypeLimits: " + getStorageTypeLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStorageTypeName() == null) ? 0 : getStorageTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getStorageSubTypeName() == null) ? 0 : getStorageSubTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getStorageTypeLimits() == null) ? 0 : getStorageTypeLimits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageType == false)
            return false;
        StorageType other = (StorageType) obj;

        if (other.getStorageTypeName() == null ^ this.getStorageTypeName() == null)
            return false;
        if (other.getStorageTypeName() != null
                && other.getStorageTypeName().equals(this.getStorageTypeName()) == false)
            return false;
        if (other.getStorageSubTypeName() == null ^ this.getStorageSubTypeName() == null)
            return false;
        if (other.getStorageSubTypeName() != null
                && other.getStorageSubTypeName().equals(this.getStorageSubTypeName()) == false)
            return false;
        if (other.getStorageTypeLimits() == null ^ this.getStorageTypeLimits() == null)
            return false;
        if (other.getStorageTypeLimits() != null
                && other.getStorageTypeLimits().equals(this.getStorageTypeLimits()) == false)
            return false;
        return true;
    }
}
