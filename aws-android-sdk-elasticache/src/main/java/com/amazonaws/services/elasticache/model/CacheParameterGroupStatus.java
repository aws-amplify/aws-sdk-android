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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Status of the cache parameter group.
 * </p>
 */
public class CacheParameterGroupStatus implements Serializable {
    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * </p>
     */
    private java.util.List<String> cacheNodeIdsToReboot;

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroupStatus withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     *
     * @return <p>
     *         The status of parameter updates.
     *         </p>
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates.
     *            </p>
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
        return this;
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * </p>
     *
     * @return <p>
     *         A list of the cache node IDs which need to be rebooted for
     *         parameter changes to be applied. A node ID is a numeric
     *         identifier (0001, 0002, etc.).
     *         </p>
     */
    public java.util.List<String> getCacheNodeIdsToReboot() {
        return cacheNodeIdsToReboot;
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * </p>
     *
     * @param cacheNodeIdsToReboot <p>
     *            A list of the cache node IDs which need to be rebooted for
     *            parameter changes to be applied. A node ID is a numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     */
    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
            return;
        }

        this.cacheNodeIdsToReboot = new java.util.ArrayList<String>(cacheNodeIdsToReboot);
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToReboot <p>
     *            A list of the cache node IDs which need to be rebooted for
     *            parameter changes to be applied. A node ID is a numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroupStatus withCacheNodeIdsToReboot(String... cacheNodeIdsToReboot) {
        if (getCacheNodeIdsToReboot() == null) {
            this.cacheNodeIdsToReboot = new java.util.ArrayList<String>(cacheNodeIdsToReboot.length);
        }
        for (String value : cacheNodeIdsToReboot) {
            this.cacheNodeIdsToReboot.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeIdsToReboot <p>
     *            A list of the cache node IDs which need to be rebooted for
     *            parameter changes to be applied. A node ID is a numeric
     *            identifier (0001, 0002, etc.).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroupStatus withCacheNodeIdsToReboot(
            java.util.Collection<String> cacheNodeIdsToReboot) {
        setCacheNodeIdsToReboot(cacheNodeIdsToReboot);
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: " + getParameterApplyStatus() + ",");
        if (getCacheNodeIdsToReboot() != null)
            sb.append("CacheNodeIdsToReboot: " + getCacheNodeIdsToReboot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeIdsToReboot() == null) ? 0 : getCacheNodeIdsToReboot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheParameterGroupStatus == false)
            return false;
        CacheParameterGroupStatus other = (CacheParameterGroupStatus) obj;

        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null
                && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getCacheNodeIdsToReboot() == null ^ this.getCacheNodeIdsToReboot() == null)
            return false;
        if (other.getCacheNodeIdsToReboot() != null
                && other.getCacheNodeIdsToReboot().equals(this.getCacheNodeIdsToReboot()) == false)
            return false;
        return true;
    }
}
