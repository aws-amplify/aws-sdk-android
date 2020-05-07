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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetRelationalDatabaseMetricDataResult implements Serializable {
    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, DatabaseConnections,
     * DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput,
     * NetworkTransmitThroughput
     */
    private String metricName;

    /**
     * <p>
     * An object describing the result of your get relational database metric
     * data request.
     * </p>
     */
    private java.util.List<MetricDatapoint> metricData;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, DatabaseConnections,
     * DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput,
     * NetworkTransmitThroughput
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     * @see RelationalDatabaseMetricName
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, DatabaseConnections,
     * DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput,
     * NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @see RelationalDatabaseMetricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, DatabaseConnections,
     * DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput,
     * NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationalDatabaseMetricName
     */
    public GetRelationalDatabaseMetricDataResult withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, DatabaseConnections,
     * DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput,
     * NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @see RelationalDatabaseMetricName
     */
    public void setMetricName(RelationalDatabaseMetricName metricName) {
        this.metricName = metricName.toString();
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, DatabaseConnections,
     * DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput,
     * NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationalDatabaseMetricName
     */
    public GetRelationalDatabaseMetricDataResult withMetricName(
            RelationalDatabaseMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database metric
     * data request.
     * </p>
     *
     * @return <p>
     *         An object describing the result of your get relational database
     *         metric data request.
     *         </p>
     */
    public java.util.List<MetricDatapoint> getMetricData() {
        return metricData;
    }

    /**
     * <p>
     * An object describing the result of your get relational database metric
     * data request.
     * </p>
     *
     * @param metricData <p>
     *            An object describing the result of your get relational
     *            database metric data request.
     *            </p>
     */
    public void setMetricData(java.util.Collection<MetricDatapoint> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new java.util.ArrayList<MetricDatapoint>(metricData);
    }

    /**
     * <p>
     * An object describing the result of your get relational database metric
     * data request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricData <p>
     *            An object describing the result of your get relational
     *            database metric data request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseMetricDataResult withMetricData(MetricDatapoint... metricData) {
        if (getMetricData() == null) {
            this.metricData = new java.util.ArrayList<MetricDatapoint>(metricData.length);
        }
        for (MetricDatapoint value : metricData) {
            this.metricData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database metric
     * data request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricData <p>
     *            An object describing the result of your get relational
     *            database metric data request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseMetricDataResult withMetricData(
            java.util.Collection<MetricDatapoint> metricData) {
        setMetricData(metricData);
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
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getMetricData() != null)
            sb.append("metricData: " + getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseMetricDataResult == false)
            return false;
        GetRelationalDatabaseMetricDataResult other = (GetRelationalDatabaseMetricDataResult) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null
                && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }
}
