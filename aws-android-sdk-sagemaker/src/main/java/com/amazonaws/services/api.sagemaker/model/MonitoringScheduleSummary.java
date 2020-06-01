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
 * Summarizes the monitoring schedule.
 * </p>
 */
public class MonitoringScheduleSummary implements Serializable {
    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String monitoringScheduleName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String monitoringScheduleArn;

    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     */
    private String monitoringScheduleStatus;

    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the monitoring schedule.
     *         </p>
     */
    public String getMonitoringScheduleName() {
        return monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param monitoringScheduleName <p>
     *            The name of the monitoring schedule.
     *            </p>
     */
    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param monitoringScheduleName <p>
     *            The name of the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringScheduleSummary withMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the monitoring schedule.
     *         </p>
     */
    public String getMonitoringScheduleArn() {
        return monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param monitoringScheduleArn <p>
     *            The Amazon Resource Name (ARN) of the monitoring schedule.
     *            </p>
     */
    public void setMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param monitoringScheduleArn <p>
     *            The Amazon Resource Name (ARN) of the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringScheduleSummary withMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
        return this;
    }

    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     *
     * @return <p>
     *         The creation time of the monitoring schedule.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     *
     * @param creationTime <p>
     *            The creation time of the monitoring schedule.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation time of the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringScheduleSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     *
     * @return <p>
     *         The last time the monitoring schedule was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The last time the monitoring schedule was modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The last time the monitoring schedule was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringScheduleSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @return <p>
     *         The status of the monitoring schedule.
     *         </p>
     * @see ScheduleStatus
     */
    public String getMonitoringScheduleStatus() {
        return monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of the monitoring schedule.
     *            </p>
     * @see ScheduleStatus
     */
    public void setMonitoringScheduleStatus(String monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleStatus
     */
    public MonitoringScheduleSummary withMonitoringScheduleStatus(String monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus;
        return this;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of the monitoring schedule.
     *            </p>
     * @see ScheduleStatus
     */
    public void setMonitoringScheduleStatus(ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleStatus
     */
    public MonitoringScheduleSummary withMonitoringScheduleStatus(
            ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint using the monitoring schedule.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint using the monitoring schedule.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint using the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringScheduleSummary withEndpointName(String endpointName) {
        this.endpointName = endpointName;
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: " + getMonitoringScheduleName() + ",");
        if (getMonitoringScheduleArn() != null)
            sb.append("MonitoringScheduleArn: " + getMonitoringScheduleArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getMonitoringScheduleStatus() != null)
            sb.append("MonitoringScheduleStatus: " + getMonitoringScheduleStatus() + ",");
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleArn() == null) ? 0 : getMonitoringScheduleArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleStatus() == null) ? 0 : getMonitoringScheduleStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringScheduleSummary == false)
            return false;
        MonitoringScheduleSummary other = (MonitoringScheduleSummary) obj;

        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null
                && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringScheduleArn() == null ^ this.getMonitoringScheduleArn() == null)
            return false;
        if (other.getMonitoringScheduleArn() != null
                && other.getMonitoringScheduleArn().equals(this.getMonitoringScheduleArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMonitoringScheduleStatus() == null
                ^ this.getMonitoringScheduleStatus() == null)
            return false;
        if (other.getMonitoringScheduleStatus() != null
                && other.getMonitoringScheduleStatus().equals(this.getMonitoringScheduleStatus()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        return true;
    }
}
