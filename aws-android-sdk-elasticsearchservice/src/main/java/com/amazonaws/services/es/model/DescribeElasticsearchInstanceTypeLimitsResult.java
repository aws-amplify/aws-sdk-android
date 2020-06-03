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
 * Container for the parameters received from
 * <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
 * </p>
 */
public class DescribeElasticsearchInstanceTypeLimitsResult implements Serializable {
    /**
     * <p>
     * Map of Role of the Instance and Limits that are applicable. Role
     * performed by given Instance in Elasticsearch can be one of the following:
     * <ul>
     * <li>data: If the given InstanceType is used as data node</li>
     * <li>master: If the given InstanceType is used as master node</li>
     * <li>ultra_warm: If the given InstanceType is used as warm node</li>
     * </ul>
     * </p>
     */
    private java.util.Map<String, Limits> limitsByRole;

    /**
     * <p>
     * Map of Role of the Instance and Limits that are applicable. Role
     * performed by given Instance in Elasticsearch can be one of the following:
     * <ul>
     * <li>data: If the given InstanceType is used as data node</li>
     * <li>master: If the given InstanceType is used as master node</li>
     * <li>ultra_warm: If the given InstanceType is used as warm node</li>
     * </ul>
     * </p>
     *
     * @return <p>
     *         Map of Role of the Instance and Limits that are applicable. Role
     *         performed by given Instance in Elasticsearch can be one of the
     *         following:
     *         <ul>
     *         <li>data: If the given InstanceType is used as data node</li>
     *         <li>master: If the given InstanceType is used as master node</li>
     *         <li>ultra_warm: If the given InstanceType is used as warm node</li>
     *         </ul>
     *         </p>
     */
    public java.util.Map<String, Limits> getLimitsByRole() {
        return limitsByRole;
    }

    /**
     * <p>
     * Map of Role of the Instance and Limits that are applicable. Role
     * performed by given Instance in Elasticsearch can be one of the following:
     * <ul>
     * <li>data: If the given InstanceType is used as data node</li>
     * <li>master: If the given InstanceType is used as master node</li>
     * <li>ultra_warm: If the given InstanceType is used as warm node</li>
     * </ul>
     * </p>
     *
     * @param limitsByRole <p>
     *            Map of Role of the Instance and Limits that are applicable.
     *            Role performed by given Instance in Elasticsearch can be one
     *            of the following:
     *            <ul>
     *            <li>data: If the given InstanceType is used as data node</li>
     *            <li>master: If the given InstanceType is used as master node</li>
     *            <li>ultra_warm: If the given InstanceType is used as warm node
     *            </li>
     *            </ul>
     *            </p>
     */
    public void setLimitsByRole(java.util.Map<String, Limits> limitsByRole) {
        this.limitsByRole = limitsByRole;
    }

    /**
     * <p>
     * Map of Role of the Instance and Limits that are applicable. Role
     * performed by given Instance in Elasticsearch can be one of the following:
     * <ul>
     * <li>data: If the given InstanceType is used as data node</li>
     * <li>master: If the given InstanceType is used as master node</li>
     * <li>ultra_warm: If the given InstanceType is used as warm node</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitsByRole <p>
     *            Map of Role of the Instance and Limits that are applicable.
     *            Role performed by given Instance in Elasticsearch can be one
     *            of the following:
     *            <ul>
     *            <li>data: If the given InstanceType is used as data node</li>
     *            <li>master: If the given InstanceType is used as master node</li>
     *            <li>ultra_warm: If the given InstanceType is used as warm node
     *            </li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchInstanceTypeLimitsResult withLimitsByRole(
            java.util.Map<String, Limits> limitsByRole) {
        this.limitsByRole = limitsByRole;
        return this;
    }

    /**
     * <p>
     * Map of Role of the Instance and Limits that are applicable. Role
     * performed by given Instance in Elasticsearch can be one of the following:
     * <ul>
     * <li>data: If the given InstanceType is used as data node</li>
     * <li>master: If the given InstanceType is used as master node</li>
     * <li>ultra_warm: If the given InstanceType is used as warm node</li>
     * </ul>
     * </p>
     * <p>
     * The method adds a new key-value pair into LimitsByRole parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into LimitsByRole.
     * @param value The corresponding value of the entry to be added into
     *            LimitsByRole.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchInstanceTypeLimitsResult addLimitsByRoleEntry(String key,
            Limits value) {
        if (null == this.limitsByRole) {
            this.limitsByRole = new java.util.HashMap<String, Limits>();
        }
        if (this.limitsByRole.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.limitsByRole.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LimitsByRole.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeElasticsearchInstanceTypeLimitsResult clearLimitsByRoleEntries() {
        this.limitsByRole = null;
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
        if (getLimitsByRole() != null)
            sb.append("LimitsByRole: " + getLimitsByRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLimitsByRole() == null) ? 0 : getLimitsByRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchInstanceTypeLimitsResult == false)
            return false;
        DescribeElasticsearchInstanceTypeLimitsResult other = (DescribeElasticsearchInstanceTypeLimitsResult) obj;

        if (other.getLimitsByRole() == null ^ this.getLimitsByRole() == null)
            return false;
        if (other.getLimitsByRole() != null
                && other.getLimitsByRole().equals(this.getLimitsByRole()) == false)
            return false;
        return true;
    }
}
