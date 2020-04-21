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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * One level of grouped data in the results.
 * </p>
 */
public class Group implements Serializable {
    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     */
    private java.util.List<String> keys;

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     */
    private java.util.Map<String, MetricValue> metrics;

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     *
     * @return <p>
     *         The keys that are included in this group.
     *         </p>
     */
    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     *
     * @param keys <p>
     *            The keys that are included in this group.
     *            </p>
     */
    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<String>(keys);
    }

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keys <p>
     *            The keys that are included in this group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withKeys(String... keys) {
        if (getKeys() == null) {
            this.keys = new java.util.ArrayList<String>(keys.length);
        }
        for (String value : keys) {
            this.keys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keys <p>
     *            The keys that are included in this group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     *
     * @return <p>
     *         The metrics that are included in this group.
     *         </p>
     */
    public java.util.Map<String, MetricValue> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     *
     * @param metrics <p>
     *            The metrics that are included in this group.
     *            </p>
     */
    public void setMetrics(java.util.Map<String, MetricValue> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            The metrics that are included in this group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withMetrics(java.util.Map<String, MetricValue> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group addMetricsEntry(String key, MetricValue value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, MetricValue>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Group clearMetricsEntries() {
        this.metrics = null;
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
        if (getKeys() != null)
            sb.append("Keys: " + getKeys() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;

        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
