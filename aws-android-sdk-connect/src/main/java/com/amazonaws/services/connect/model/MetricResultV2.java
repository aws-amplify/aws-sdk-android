/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains information about the metric results.
 * </p>
 */
public class MetricResultV2 implements Serializable {
    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     */
    private java.util.Map<String, String> dimensions;

    /**
     * <p>
     * The set of metrics.
     * </p>
     */
    private java.util.List<MetricDataV2> collections;

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     *
     * @return <p>
     *         The dimension for the metrics.
     *         </p>
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     *
     * @param dimensions <p>
     *            The dimension for the metrics.
     *            </p>
     */
    public void setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimension for the metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricResultV2 withDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * The dimension for the metrics.
     * </p>
     * <p>
     * The method adds a new key-value pair into Dimensions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Dimensions.
     * @param value The corresponding value of the entry to be added into
     *            Dimensions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricResultV2 addDimensionsEntry(String key, String value) {
        if (null == this.dimensions) {
            this.dimensions = new java.util.HashMap<String, String>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MetricResultV2 clearDimensionsEntries() {
        this.dimensions = null;
        return this;
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     *
     * @return <p>
     *         The set of metrics.
     *         </p>
     */
    public java.util.List<MetricDataV2> getCollections() {
        return collections;
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     *
     * @param collections <p>
     *            The set of metrics.
     *            </p>
     */
    public void setCollections(java.util.Collection<MetricDataV2> collections) {
        if (collections == null) {
            this.collections = null;
            return;
        }

        this.collections = new java.util.ArrayList<MetricDataV2>(collections);
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collections <p>
     *            The set of metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricResultV2 withCollections(MetricDataV2... collections) {
        if (getCollections() == null) {
            this.collections = new java.util.ArrayList<MetricDataV2>(collections.length);
        }
        for (MetricDataV2 value : collections) {
            this.collections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The set of metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collections <p>
     *            The set of metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricResultV2 withCollections(java.util.Collection<MetricDataV2> collections) {
        setCollections(collections);
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
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getCollections() != null)
            sb.append("Collections: " + getCollections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode
                + ((getCollections() == null) ? 0 : getCollections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricResultV2 == false)
            return false;
        MetricResultV2 other = (MetricResultV2) obj;

        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getCollections() == null ^ this.getCollections() == null)
            return false;
        if (other.getCollections() != null
                && other.getCollections().equals(this.getCollections()) == false)
            return false;
        return true;
    }
}
