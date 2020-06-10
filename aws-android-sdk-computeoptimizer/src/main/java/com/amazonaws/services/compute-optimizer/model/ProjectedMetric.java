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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


/**
 * <p>Describes a projected utilization metric of a recommendation option, such as an Amazon EC2 instance.</p>
 */
public class ProjectedMetric implements Serializable {
    /**
     * <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     */
    private String name;

    /**
     * <p>The time stamps of the projected utilization metric.</p>
     */
    private java.util.List<java.util.Date> timestamps;

    /**
     * <p>The values of the projected utilization metrics.</p>
     */
    private java.util.List<Double> values;

    /**
     * <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @return <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @see MetricName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @see MetricName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricName
     */
    public ProjectedMetric withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @see MetricName
     */
    public void setName(MetricName name) {
        this.name = name.toString();
    }

    /**
     * <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the projected utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricName
     */
    public ProjectedMetric withName(MetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>The time stamps of the projected utilization metric.</p>
     *
     * @return <p>The time stamps of the projected utilization metric.</p>
     */
    public java.util.List<java.util.Date> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>The time stamps of the projected utilization metric.</p>
     *
     * @param timestamps <p>The time stamps of the projected utilization metric.</p>
     */
    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<java.util.Date>(timestamps);
    }

    /**
     * <p>The time stamps of the projected utilization metric.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamps <p>The time stamps of the projected utilization metric.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProjectedMetric withTimestamps(java.util.Date... timestamps) {
        if (getTimestamps() == null) {
            this.timestamps = new java.util.ArrayList<java.util.Date>(timestamps.length);
        }
        for (java.util.Date value : timestamps) {
            this.timestamps.add(value);
        }
        return this;
    }

    /**
     * <p>The time stamps of the projected utilization metric.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamps <p>The time stamps of the projected utilization metric.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProjectedMetric withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>The values of the projected utilization metrics.</p>
     *
     * @return <p>The values of the projected utilization metrics.</p>
     */
    public java.util.List<Double> getValues() {
        return values;
    }

    /**
     * <p>The values of the projected utilization metrics.</p>
     *
     * @param values <p>The values of the projected utilization metrics.</p>
     */
    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<Double>(values);
    }

    /**
     * <p>The values of the projected utilization metrics.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The values of the projected utilization metrics.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProjectedMetric withValues(Double... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<Double>(values.length);
        }
        for (Double value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>The values of the projected utilization metrics.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The values of the projected utilization metrics.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProjectedMetric withValues(java.util.Collection<Double> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("name: " + getName() + ",");
        if (getTimestamps() != null) sb.append("timestamps: " + getTimestamps() + ",");
        if (getValues() != null) sb.append("values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ProjectedMetric == false) return false;
        ProjectedMetric other = (ProjectedMetric)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null) return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false) return false;
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false;
        return true;
    }
}
