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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the <a>GetMetricStatistics</a> action.
 * </p>
 */
public class GetMetricStatisticsResult implements Serializable {
    /**
     * <p>
     * A label describing the specified metric.
     * </p>
     */
    private String label;

    /**
     * <p>
     * The datapoints for the specified metric.
     * </p>
     */
    private java.util.List<Datapoint> datapoints = new java.util.ArrayList<Datapoint>();

    /**
     * <p>
     * A label describing the specified metric.
     * </p>
     *
     * @return <p>
     *         A label describing the specified metric.
     *         </p>
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * A label describing the specified metric.
     * </p>
     *
     * @param label <p>
     *            A label describing the specified metric.
     *            </p>
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A label describing the specified metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param label <p>
     *            A label describing the specified metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsResult withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * <p>
     * The datapoints for the specified metric.
     * </p>
     *
     * @return <p>
     *         The datapoints for the specified metric.
     *         </p>
     */
    public java.util.List<Datapoint> getDatapoints() {
        return datapoints;
    }

    /**
     * <p>
     * The datapoints for the specified metric.
     * </p>
     *
     * @param datapoints <p>
     *            The datapoints for the specified metric.
     *            </p>
     */
    public void setDatapoints(java.util.Collection<Datapoint> datapoints) {
        if (datapoints == null) {
            this.datapoints = null;
            return;
        }

        this.datapoints = new java.util.ArrayList<Datapoint>(datapoints);
    }

    /**
     * <p>
     * The datapoints for the specified metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datapoints <p>
     *            The datapoints for the specified metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsResult withDatapoints(Datapoint... datapoints) {
        if (getDatapoints() == null) {
            this.datapoints = new java.util.ArrayList<Datapoint>(datapoints.length);
        }
        for (Datapoint value : datapoints) {
            this.datapoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The datapoints for the specified metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datapoints <p>
     *            The datapoints for the specified metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsResult withDatapoints(java.util.Collection<Datapoint> datapoints) {
        setDatapoints(datapoints);
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
        if (getLabel() != null)
            sb.append("Label: " + getLabel() + ",");
        if (getDatapoints() != null)
            sb.append("Datapoints: " + getDatapoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getDatapoints() == null) ? 0 : getDatapoints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricStatisticsResult == false)
            return false;
        GetMetricStatisticsResult other = (GetMetricStatisticsResult) obj;

        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getDatapoints() == null ^ this.getDatapoints() == null)
            return false;
        if (other.getDatapoints() != null
                && other.getDatapoints().equals(this.getDatapoints()) == false)
            return false;
        return true;
    }
}
