/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a historical metric. For a description of each
 * metric, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
 * >Historical Metrics Definitions</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 */
public class HistoricalMetric implements Serializable {
    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACTS_QUEUED, CONTACTS_HANDLED,
     * CONTACTS_ABANDONED, CONTACTS_CONSULTED, CONTACTS_AGENT_HUNG_UP_FIRST,
     * CONTACTS_HANDLED_INCOMING, CONTACTS_HANDLED_OUTBOUND,
     * CONTACTS_HOLD_ABANDONS, CONTACTS_TRANSFERRED_IN,
     * CONTACTS_TRANSFERRED_OUT, CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
     * CONTACTS_TRANSFERRED_OUT_FROM_QUEUE, CONTACTS_MISSED,
     * CALLBACK_CONTACTS_HANDLED, API_CONTACTS_HANDLED, OCCUPANCY, HANDLE_TIME,
     * AFTER_CONTACT_WORK_TIME, QUEUED_TIME, ABANDON_TIME, QUEUE_ANSWER_TIME,
     * HOLD_TIME, INTERACTION_TIME, INTERACTION_AND_HOLD_TIME, SERVICE_LEVEL
     */
    private String name;

    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     */
    private Threshold threshold;

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUM, MAX, AVG
     */
    private String statistic;

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS, COUNT, PERCENT
     */
    private String unit;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACTS_QUEUED, CONTACTS_HANDLED,
     * CONTACTS_ABANDONED, CONTACTS_CONSULTED, CONTACTS_AGENT_HUNG_UP_FIRST,
     * CONTACTS_HANDLED_INCOMING, CONTACTS_HANDLED_OUTBOUND,
     * CONTACTS_HOLD_ABANDONS, CONTACTS_TRANSFERRED_IN,
     * CONTACTS_TRANSFERRED_OUT, CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
     * CONTACTS_TRANSFERRED_OUT_FROM_QUEUE, CONTACTS_MISSED,
     * CALLBACK_CONTACTS_HANDLED, API_CONTACTS_HANDLED, OCCUPANCY, HANDLE_TIME,
     * AFTER_CONTACT_WORK_TIME, QUEUED_TIME, ABANDON_TIME, QUEUE_ANSWER_TIME,
     * HOLD_TIME, INTERACTION_TIME, INTERACTION_AND_HOLD_TIME, SERVICE_LEVEL
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     * @see HistoricalMetricName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACTS_QUEUED, CONTACTS_HANDLED,
     * CONTACTS_ABANDONED, CONTACTS_CONSULTED, CONTACTS_AGENT_HUNG_UP_FIRST,
     * CONTACTS_HANDLED_INCOMING, CONTACTS_HANDLED_OUTBOUND,
     * CONTACTS_HOLD_ABANDONS, CONTACTS_TRANSFERRED_IN,
     * CONTACTS_TRANSFERRED_OUT, CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
     * CONTACTS_TRANSFERRED_OUT_FROM_QUEUE, CONTACTS_MISSED,
     * CALLBACK_CONTACTS_HANDLED, API_CONTACTS_HANDLED, OCCUPANCY, HANDLE_TIME,
     * AFTER_CONTACT_WORK_TIME, QUEUED_TIME, ABANDON_TIME, QUEUE_ANSWER_TIME,
     * HOLD_TIME, INTERACTION_TIME, INTERACTION_AND_HOLD_TIME, SERVICE_LEVEL
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @see HistoricalMetricName
     */
    public void setName(String name) {
        this.name = name;
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
     * <b>Allowed Values: </b>CONTACTS_QUEUED, CONTACTS_HANDLED,
     * CONTACTS_ABANDONED, CONTACTS_CONSULTED, CONTACTS_AGENT_HUNG_UP_FIRST,
     * CONTACTS_HANDLED_INCOMING, CONTACTS_HANDLED_OUTBOUND,
     * CONTACTS_HOLD_ABANDONS, CONTACTS_TRANSFERRED_IN,
     * CONTACTS_TRANSFERRED_OUT, CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
     * CONTACTS_TRANSFERRED_OUT_FROM_QUEUE, CONTACTS_MISSED,
     * CALLBACK_CONTACTS_HANDLED, API_CONTACTS_HANDLED, OCCUPANCY, HANDLE_TIME,
     * AFTER_CONTACT_WORK_TIME, QUEUED_TIME, ABANDON_TIME, QUEUE_ANSWER_TIME,
     * HOLD_TIME, INTERACTION_TIME, INTERACTION_AND_HOLD_TIME, SERVICE_LEVEL
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HistoricalMetricName
     */
    public HistoricalMetric withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACTS_QUEUED, CONTACTS_HANDLED,
     * CONTACTS_ABANDONED, CONTACTS_CONSULTED, CONTACTS_AGENT_HUNG_UP_FIRST,
     * CONTACTS_HANDLED_INCOMING, CONTACTS_HANDLED_OUTBOUND,
     * CONTACTS_HOLD_ABANDONS, CONTACTS_TRANSFERRED_IN,
     * CONTACTS_TRANSFERRED_OUT, CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
     * CONTACTS_TRANSFERRED_OUT_FROM_QUEUE, CONTACTS_MISSED,
     * CALLBACK_CONTACTS_HANDLED, API_CONTACTS_HANDLED, OCCUPANCY, HANDLE_TIME,
     * AFTER_CONTACT_WORK_TIME, QUEUED_TIME, ABANDON_TIME, QUEUE_ANSWER_TIME,
     * HOLD_TIME, INTERACTION_TIME, INTERACTION_AND_HOLD_TIME, SERVICE_LEVEL
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @see HistoricalMetricName
     */
    public void setName(HistoricalMetricName name) {
        this.name = name.toString();
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
     * <b>Allowed Values: </b>CONTACTS_QUEUED, CONTACTS_HANDLED,
     * CONTACTS_ABANDONED, CONTACTS_CONSULTED, CONTACTS_AGENT_HUNG_UP_FIRST,
     * CONTACTS_HANDLED_INCOMING, CONTACTS_HANDLED_OUTBOUND,
     * CONTACTS_HOLD_ABANDONS, CONTACTS_TRANSFERRED_IN,
     * CONTACTS_TRANSFERRED_OUT, CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
     * CONTACTS_TRANSFERRED_OUT_FROM_QUEUE, CONTACTS_MISSED,
     * CALLBACK_CONTACTS_HANDLED, API_CONTACTS_HANDLED, OCCUPANCY, HANDLE_TIME,
     * AFTER_CONTACT_WORK_TIME, QUEUED_TIME, ABANDON_TIME, QUEUE_ANSWER_TIME,
     * HOLD_TIME, INTERACTION_TIME, INTERACTION_AND_HOLD_TIME, SERVICE_LEVEL
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HistoricalMetricName
     */
    public HistoricalMetric withName(HistoricalMetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     *
     * @return <p>
     *         The threshold for the metric, used with service level metrics.
     *         </p>
     */
    public Threshold getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     *
     * @param threshold <p>
     *            The threshold for the metric, used with service level metrics.
     *            </p>
     */
    public void setThreshold(Threshold threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The threshold for the metric, used with service level metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threshold <p>
     *            The threshold for the metric, used with service level metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoricalMetric withThreshold(Threshold threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUM, MAX, AVG
     *
     * @return <p>
     *         The statistic for the metric.
     *         </p>
     * @see Statistic
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUM, MAX, AVG
     *
     * @param statistic <p>
     *            The statistic for the metric.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUM, MAX, AVG
     *
     * @param statistic <p>
     *            The statistic for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public HistoricalMetric withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUM, MAX, AVG
     *
     * @param statistic <p>
     *            The statistic for the metric.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUM, MAX, AVG
     *
     * @param statistic <p>
     *            The statistic for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public HistoricalMetric withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS, COUNT, PERCENT
     *
     * @return <p>
     *         The unit for the metric.
     *         </p>
     * @see Unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS, COUNT, PERCENT
     *
     * @param unit <p>
     *            The unit for the metric.
     *            </p>
     * @see Unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS, COUNT, PERCENT
     *
     * @param unit <p>
     *            The unit for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public HistoricalMetric withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS, COUNT, PERCENT
     *
     * @param unit <p>
     *            The unit for the metric.
     *            </p>
     * @see Unit
     */
    public void setUnit(Unit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECONDS, COUNT, PERCENT
     *
     * @param unit <p>
     *            The unit for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public HistoricalMetric withUnit(Unit unit) {
        this.unit = unit.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoricalMetric == false)
            return false;
        HistoricalMetric other = (HistoricalMetric) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
