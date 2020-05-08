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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Configures the monitoring schedule and defines the monitoring job.
 * </p>
 */
public class MonitoringScheduleConfig implements Serializable {
    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     */
    private ScheduleConfig scheduleConfig;

    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     */
    private MonitoringJobDefinition monitoringJobDefinition;

    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     *
     * @return <p>
     *         Configures the monitoring schedule.
     *         </p>
     */
    public ScheduleConfig getScheduleConfig() {
        return scheduleConfig;
    }

    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     *
     * @param scheduleConfig <p>
     *            Configures the monitoring schedule.
     *            </p>
     */
    public void setScheduleConfig(ScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
    }

    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleConfig <p>
     *            Configures the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringScheduleConfig withScheduleConfig(ScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }

    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     *
     * @return <p>
     *         Defines the monitoring job.
     *         </p>
     */
    public MonitoringJobDefinition getMonitoringJobDefinition() {
        return monitoringJobDefinition;
    }

    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     *
     * @param monitoringJobDefinition <p>
     *            Defines the monitoring job.
     *            </p>
     */
    public void setMonitoringJobDefinition(MonitoringJobDefinition monitoringJobDefinition) {
        this.monitoringJobDefinition = monitoringJobDefinition;
    }

    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringJobDefinition <p>
     *            Defines the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringScheduleConfig withMonitoringJobDefinition(
            MonitoringJobDefinition monitoringJobDefinition) {
        this.monitoringJobDefinition = monitoringJobDefinition;
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
        if (getScheduleConfig() != null)
            sb.append("ScheduleConfig: " + getScheduleConfig() + ",");
        if (getMonitoringJobDefinition() != null)
            sb.append("MonitoringJobDefinition: " + getMonitoringJobDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleConfig() == null) ? 0 : getScheduleConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringJobDefinition() == null) ? 0 : getMonitoringJobDefinition()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringScheduleConfig == false)
            return false;
        MonitoringScheduleConfig other = (MonitoringScheduleConfig) obj;

        if (other.getScheduleConfig() == null ^ this.getScheduleConfig() == null)
            return false;
        if (other.getScheduleConfig() != null
                && other.getScheduleConfig().equals(this.getScheduleConfig()) == false)
            return false;
        if (other.getMonitoringJobDefinition() == null ^ this.getMonitoringJobDefinition() == null)
            return false;
        if (other.getMonitoringJobDefinition() != null
                && other.getMonitoringJobDefinition().equals(this.getMonitoringJobDefinition()) == false)
            return false;
        return true;
    }
}
