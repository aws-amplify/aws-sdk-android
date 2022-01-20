/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class DescribeInstanceStorageConfigResult implements Serializable {
    /**
     * <p>
     * A valid storage type.
     * </p>
     */
    private InstanceStorageConfig storageConfig;

    /**
     * <p>
     * A valid storage type.
     * </p>
     *
     * @return <p>
     *         A valid storage type.
     *         </p>
     */
    public InstanceStorageConfig getStorageConfig() {
        return storageConfig;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     *
     * @param storageConfig <p>
     *            A valid storage type.
     *            </p>
     */
    public void setStorageConfig(InstanceStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageConfig <p>
     *            A valid storage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStorageConfigResult withStorageConfig(InstanceStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
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
        if (getStorageConfig() != null)
            sb.append("StorageConfig: " + getStorageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStorageConfig() == null) ? 0 : getStorageConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceStorageConfigResult == false)
            return false;
        DescribeInstanceStorageConfigResult other = (DescribeInstanceStorageConfigResult) obj;

        if (other.getStorageConfig() == null ^ this.getStorageConfig() == null)
            return false;
        if (other.getStorageConfig() != null
                && other.getStorageConfig().equals(this.getStorageConfig()) == false)
            return false;
        return true;
    }
}
