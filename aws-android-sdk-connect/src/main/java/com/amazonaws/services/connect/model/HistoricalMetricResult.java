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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The metrics data returned from a <code>GetMetricData</code> operation.
 * </p>
 */
public class HistoricalMetricResult implements Serializable {
    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     */
    private Dimensions dimensions;

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     */
    private java.util.List<HistoricalMetricData> collections;

    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     *
     * @return <p>
     *         The <code>Dimensions</code> for the metrics.
     *         </p>
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     *
     * @param dimensions <p>
     *            The <code>Dimensions</code> for the metrics.
     *            </p>
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The <code>Dimensions</code> for the metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The <code>Dimensions</code> for the metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoricalMetricResult withDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     *
     * @return <p>
     *         A list of <code>HistoricalMetricData</code> objects.
     *         </p>
     */
    public java.util.List<HistoricalMetricData> getCollections() {
        return collections;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     *
     * @param collections <p>
     *            A list of <code>HistoricalMetricData</code> objects.
     *            </p>
     */
    public void setCollections(java.util.Collection<HistoricalMetricData> collections) {
        if (collections == null) {
            this.collections = null;
            return;
        }

        this.collections = new java.util.ArrayList<HistoricalMetricData>(collections);
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collections <p>
     *            A list of <code>HistoricalMetricData</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoricalMetricResult withCollections(HistoricalMetricData... collections) {
        if (getCollections() == null) {
            this.collections = new java.util.ArrayList<HistoricalMetricData>(collections.length);
        }
        for (HistoricalMetricData value : collections) {
            this.collections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetricData</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collections <p>
     *            A list of <code>HistoricalMetricData</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoricalMetricResult withCollections(
            java.util.Collection<HistoricalMetricData> collections) {
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

        if (obj instanceof HistoricalMetricResult == false)
            return false;
        HistoricalMetricResult other = (HistoricalMetricResult) obj;

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
