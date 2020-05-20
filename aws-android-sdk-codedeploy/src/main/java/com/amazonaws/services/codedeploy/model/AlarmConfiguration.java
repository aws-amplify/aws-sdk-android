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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about alarms associated with the deployment group.
 * </p>
 */
public class AlarmConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the
     * current state of alarms cannot be retrieved from Amazon CloudWatch. The
     * default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The deployment proceeds even if alarm status
     * information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The deployment stops if alarm status information
     * can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean ignorePollAlarmFailure;

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10
     * alarms can be added to a deployment group.
     * </p>
     */
    private java.util.List<Alarm> alarms;

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the alarm configuration is enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the alarm configuration is enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether the alarm configuration is enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the alarm configuration is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether the alarm configuration is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the
     * current state of alarms cannot be retrieved from Amazon CloudWatch. The
     * default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The deployment proceeds even if alarm status
     * information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The deployment stops if alarm status information
     * can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Indicates whether a deployment should continue if information
     *         about the current state of alarms cannot be retrieved from Amazon
     *         CloudWatch. The default value is false.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: The deployment proceeds even if alarm status
     *         information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: The deployment stops if alarm status
     *         information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isIgnorePollAlarmFailure() {
        return ignorePollAlarmFailure;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the
     * current state of alarms cannot be retrieved from Amazon CloudWatch. The
     * default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The deployment proceeds even if alarm status
     * information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The deployment stops if alarm status information
     * can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Indicates whether a deployment should continue if information
     *         about the current state of alarms cannot be retrieved from Amazon
     *         CloudWatch. The default value is false.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: The deployment proceeds even if alarm status
     *         information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: The deployment stops if alarm status
     *         information can't be retrieved from Amazon CloudWatch.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getIgnorePollAlarmFailure() {
        return ignorePollAlarmFailure;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the
     * current state of alarms cannot be retrieved from Amazon CloudWatch. The
     * default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The deployment proceeds even if alarm status
     * information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The deployment stops if alarm status information
     * can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     *
     * @param ignorePollAlarmFailure <p>
     *            Indicates whether a deployment should continue if information
     *            about the current state of alarms cannot be retrieved from
     *            Amazon CloudWatch. The default value is false.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>true</code>: The deployment proceeds even if alarm
     *            status information can't be retrieved from Amazon CloudWatch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>false</code>: The deployment stops if alarm status
     *            information can't be retrieved from Amazon CloudWatch.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIgnorePollAlarmFailure(Boolean ignorePollAlarmFailure) {
        this.ignorePollAlarmFailure = ignorePollAlarmFailure;
    }

    /**
     * <p>
     * Indicates whether a deployment should continue if information about the
     * current state of alarms cannot be retrieved from Amazon CloudWatch. The
     * default value is false.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: The deployment proceeds even if alarm status
     * information can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The deployment stops if alarm status information
     * can't be retrieved from Amazon CloudWatch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignorePollAlarmFailure <p>
     *            Indicates whether a deployment should continue if information
     *            about the current state of alarms cannot be retrieved from
     *            Amazon CloudWatch. The default value is false.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>true</code>: The deployment proceeds even if alarm
     *            status information can't be retrieved from Amazon CloudWatch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>false</code>: The deployment stops if alarm status
     *            information can't be retrieved from Amazon CloudWatch.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmConfiguration withIgnorePollAlarmFailure(Boolean ignorePollAlarmFailure) {
        this.ignorePollAlarmFailure = ignorePollAlarmFailure;
        return this;
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10
     * alarms can be added to a deployment group.
     * </p>
     *
     * @return <p>
     *         A list of alarms configured for the deployment group. A maximum
     *         of 10 alarms can be added to a deployment group.
     *         </p>
     */
    public java.util.List<Alarm> getAlarms() {
        return alarms;
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10
     * alarms can be added to a deployment group.
     * </p>
     *
     * @param alarms <p>
     *            A list of alarms configured for the deployment group. A
     *            maximum of 10 alarms can be added to a deployment group.
     *            </p>
     */
    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new java.util.ArrayList<Alarm>(alarms);
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10
     * alarms can be added to a deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            A list of alarms configured for the deployment group. A
     *            maximum of 10 alarms can be added to a deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmConfiguration withAlarms(Alarm... alarms) {
        if (getAlarms() == null) {
            this.alarms = new java.util.ArrayList<Alarm>(alarms.length);
        }
        for (Alarm value : alarms) {
            this.alarms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of alarms configured for the deployment group. A maximum of 10
     * alarms can be added to a deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            A list of alarms configured for the deployment group. A
     *            maximum of 10 alarms can be added to a deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmConfiguration withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
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
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getIgnorePollAlarmFailure() != null)
            sb.append("ignorePollAlarmFailure: " + getIgnorePollAlarmFailure() + ",");
        if (getAlarms() != null)
            sb.append("alarms: " + getAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getIgnorePollAlarmFailure() == null) ? 0 : getIgnorePollAlarmFailure()
                        .hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmConfiguration == false)
            return false;
        AlarmConfiguration other = (AlarmConfiguration) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIgnorePollAlarmFailure() == null ^ this.getIgnorePollAlarmFailure() == null)
            return false;
        if (other.getIgnorePollAlarmFailure() != null
                && other.getIgnorePollAlarmFailure().equals(this.getIgnorePollAlarmFailure()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        return true;
    }
}
