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
 * Contains information about a real-time metric. For a description of each
 * metric, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
 * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 */
public class CurrentMetric implements Serializable {
    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     */
    private String name;

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
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     * @see CurrentMetricName
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
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @see CurrentMetricName
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
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrentMetricName
     */
    public CurrentMetric withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @see CurrentMetricName
     */
    public void setName(CurrentMetricName name) {
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
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrentMetricName
     */
    public CurrentMetric withName(CurrentMetricName name) {
        this.name = name.toString();
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
    public CurrentMetric withUnit(String unit) {
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
    public CurrentMetric withUnit(Unit unit) {
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
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CurrentMetric == false)
            return false;
        CurrentMetric other = (CurrentMetric) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
