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
 * <p>Describes a utilization metric of a resource, such as an Amazon EC2 instance.</p>
 */
public class UtilizationMetric implements Serializable {
    /**
     * <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     */
    private String name;

    /**
     * <p>The statistic of the utilization metric.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     */
    private String statistic;

    /**
     * <p>The value of the utilization metric.</p>
     */
    private Double value;

    /**
     * <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @return <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @see MetricName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @see MetricName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricName
     */
    public UtilizationMetric withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @see MetricName
     */
    public void setName(MetricName name) {
        this.name = name.toString();
    }

    /**
     * <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cpu, Memory
     *
     * @param name <p>The name of the utilization metric.</p> <note> <p>Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html">Enabling Memory Utilization with the CloudWatch Agent</a>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricName
     */
    public UtilizationMetric withName(MetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>The statistic of the utilization metric.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @return <p>The statistic of the utilization metric.</p>
     *
     * @see MetricStatistic
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>The statistic of the utilization metric.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param statistic <p>The statistic of the utilization metric.</p>
     *
     * @see MetricStatistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>The statistic of the utilization metric.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param statistic <p>The statistic of the utilization metric.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricStatistic
     */
    public UtilizationMetric withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * <p>The statistic of the utilization metric.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param statistic <p>The statistic of the utilization metric.</p>
     *
     * @see MetricStatistic
     */
    public void setStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>The statistic of the utilization metric.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param statistic <p>The statistic of the utilization metric.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricStatistic
     */
    public UtilizationMetric withStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>The value of the utilization metric.</p>
     *
     * @return <p>The value of the utilization metric.</p>
     */
    public Double getValue() {
        return value;
    }

    /**
     * <p>The value of the utilization metric.</p>
     *
     * @param value <p>The value of the utilization metric.</p>
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>The value of the utilization metric.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value <p>The value of the utilization metric.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UtilizationMetric withValue(Double value) {
        this.value = value;
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
        if (getStatistic() != null) sb.append("statistic: " + getStatistic() + ",");
        if (getValue() != null) sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UtilizationMetric == false) return false;
        UtilizationMetric other = (UtilizationMetric)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null) return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        return true;
    }
}
