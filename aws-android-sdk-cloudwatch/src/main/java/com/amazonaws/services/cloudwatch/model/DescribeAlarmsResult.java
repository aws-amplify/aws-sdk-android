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
 * The output for the <a>DescribeAlarms</a> action.
 * </p>
 */
public class DescribeAlarmsResult implements Serializable {
    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     */
    private java.util.List<MetricAlarm> metricAlarms = new java.util.ArrayList<MetricAlarm>();

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     *
     * @return <p>
     *         A list of information for the specified alarms.
     *         </p>
     */
    public java.util.List<MetricAlarm> getMetricAlarms() {
        return metricAlarms;
    }

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     *
     * @param metricAlarms <p>
     *            A list of information for the specified alarms.
     *            </p>
     */
    public void setMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        if (metricAlarms == null) {
            this.metricAlarms = null;
            return;
        }

        this.metricAlarms = new java.util.ArrayList<MetricAlarm>(metricAlarms);
    }

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricAlarms <p>
     *            A list of information for the specified alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsResult withMetricAlarms(MetricAlarm... metricAlarms) {
        if (getMetricAlarms() == null) {
            this.metricAlarms = new java.util.ArrayList<MetricAlarm>(metricAlarms.length);
        }
        for (MetricAlarm value : metricAlarms) {
            this.metricAlarms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricAlarms <p>
     *            A list of information for the specified alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsResult withMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        setMetricAlarms(metricAlarms);
        return this;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A string that marks the start of the next batch of returned
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that marks the start of the next batch of returned
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that marks the start of the next batch of returned
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getMetricAlarms() != null)
            sb.append("MetricAlarms: " + getMetricAlarms() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricAlarms() == null) ? 0 : getMetricAlarms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmsResult == false)
            return false;
        DescribeAlarmsResult other = (DescribeAlarmsResult) obj;

        if (other.getMetricAlarms() == null ^ this.getMetricAlarms() == null)
            return false;
        if (other.getMetricAlarms() != null
                && other.getMetricAlarms().equals(this.getMetricAlarms()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
