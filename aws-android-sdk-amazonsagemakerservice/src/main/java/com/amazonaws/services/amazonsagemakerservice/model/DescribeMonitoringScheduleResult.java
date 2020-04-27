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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class DescribeMonitoringScheduleResult implements Serializable {
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
     * Name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String monitoringScheduleName;

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     */
    private String monitoringScheduleStatus;

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     */
    private MonitoringScheduleConfig monitoringScheduleConfig;

    /**
     * <p>
     * The name of the endpoint for the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     */
    private MonitoringExecutionSummary lastMonitoringExecutionSummary;

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
    public DescribeMonitoringScheduleResult withMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
        return this;
    }

    /**
     * <p>
     * Name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         Name of the monitoring schedule.
     *         </p>
     */
    public String getMonitoringScheduleName() {
        return monitoringScheduleName;
    }

    /**
     * <p>
     * Name of the monitoring schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param monitoringScheduleName <p>
     *            Name of the monitoring schedule.
     *            </p>
     */
    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * Name of the monitoring schedule.
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
     *            Name of the monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMonitoringScheduleResult withMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
        return this;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @return <p>
     *         The status of an monitoring job.
     *         </p>
     * @see ScheduleStatus
     */
    public String getMonitoringScheduleStatus() {
        return monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of an monitoring job.
     *            </p>
     * @see ScheduleStatus
     */
    public void setMonitoringScheduleStatus(String monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of an monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleStatus
     */
    public DescribeMonitoringScheduleResult withMonitoringScheduleStatus(
            String monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus;
        return this;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of an monitoring job.
     *            </p>
     * @see ScheduleStatus
     */
    public void setMonitoringScheduleStatus(ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Failed, Scheduled, Stopped
     *
     * @param monitoringScheduleStatus <p>
     *            The status of an monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleStatus
     */
    public DescribeMonitoringScheduleResult withMonitoringScheduleStatus(
            ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A string, up to one KB in size, that contains the reason a
     *         monitoring job failed, if it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            A string, up to one KB in size, that contains the reason a
     *            monitoring job failed, if it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job
     * failed, if it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            A string, up to one KB in size, that contains the reason a
     *            monitoring job failed, if it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMonitoringScheduleResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     *
     * @return <p>
     *         The time at which the monitoring job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time at which the monitoring job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time at which the monitoring job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMonitoringScheduleResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     *
     * @return <p>
     *         The time at which the monitoring job was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The time at which the monitoring job was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The time at which the monitoring job was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMonitoringScheduleResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     *
     * @return <p>
     *         The configuration object that specifies the monitoring schedule
     *         and defines the monitoring job.
     *         </p>
     */
    public MonitoringScheduleConfig getMonitoringScheduleConfig() {
        return monitoringScheduleConfig;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     *
     * @param monitoringScheduleConfig <p>
     *            The configuration object that specifies the monitoring
     *            schedule and defines the monitoring job.
     *            </p>
     */
    public void setMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        this.monitoringScheduleConfig = monitoringScheduleConfig;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringScheduleConfig <p>
     *            The configuration object that specifies the monitoring
     *            schedule and defines the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMonitoringScheduleResult withMonitoringScheduleConfig(
            MonitoringScheduleConfig monitoringScheduleConfig) {
        this.monitoringScheduleConfig = monitoringScheduleConfig;
        return this;
    }

    /**
     * <p>
     * The name of the endpoint for the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint for the monitoring job.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of the endpoint for the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint for the monitoring job.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint for the monitoring job.
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
     *            The name of the endpoint for the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMonitoringScheduleResult withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     *
     * @return <p>
     *         Describes metadata on the last execution to run, if there was
     *         one.
     *         </p>
     */
    public MonitoringExecutionSummary getLastMonitoringExecutionSummary() {
        return lastMonitoringExecutionSummary;
    }

    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     *
     * @param lastMonitoringExecutionSummary <p>
     *            Describes metadata on the last execution to run, if there was
     *            one.
     *            </p>
     */
    public void setLastMonitoringExecutionSummary(
            MonitoringExecutionSummary lastMonitoringExecutionSummary) {
        this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
    }

    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastMonitoringExecutionSummary <p>
     *            Describes metadata on the last execution to run, if there was
     *            one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMonitoringScheduleResult withLastMonitoringExecutionSummary(
            MonitoringExecutionSummary lastMonitoringExecutionSummary) {
        this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
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
        if (getMonitoringScheduleArn() != null)
            sb.append("MonitoringScheduleArn: " + getMonitoringScheduleArn() + ",");
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: " + getMonitoringScheduleName() + ",");
        if (getMonitoringScheduleStatus() != null)
            sb.append("MonitoringScheduleStatus: " + getMonitoringScheduleStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getMonitoringScheduleConfig() != null)
            sb.append("MonitoringScheduleConfig: " + getMonitoringScheduleConfig() + ",");
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
        if (getLastMonitoringExecutionSummary() != null)
            sb.append("LastMonitoringExecutionSummary: " + getLastMonitoringExecutionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleArn() == null) ? 0 : getMonitoringScheduleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleStatus() == null) ? 0 : getMonitoringScheduleStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleConfig() == null) ? 0 : getMonitoringScheduleConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastMonitoringExecutionSummary() == null) ? 0
                        : getLastMonitoringExecutionSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMonitoringScheduleResult == false)
            return false;
        DescribeMonitoringScheduleResult other = (DescribeMonitoringScheduleResult) obj;

        if (other.getMonitoringScheduleArn() == null ^ this.getMonitoringScheduleArn() == null)
            return false;
        if (other.getMonitoringScheduleArn() != null
                && other.getMonitoringScheduleArn().equals(this.getMonitoringScheduleArn()) == false)
            return false;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null
                && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringScheduleStatus() == null
                ^ this.getMonitoringScheduleStatus() == null)
            return false;
        if (other.getMonitoringScheduleStatus() != null
                && other.getMonitoringScheduleStatus().equals(this.getMonitoringScheduleStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
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
        if (other.getMonitoringScheduleConfig() == null
                ^ this.getMonitoringScheduleConfig() == null)
            return false;
        if (other.getMonitoringScheduleConfig() != null
                && other.getMonitoringScheduleConfig().equals(this.getMonitoringScheduleConfig()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getLastMonitoringExecutionSummary() == null
                ^ this.getLastMonitoringExecutionSummary() == null)
            return false;
        if (other.getLastMonitoringExecutionSummary() != null
                && other.getLastMonitoringExecutionSummary().equals(
                        this.getLastMonitoringExecutionSummary()) == false)
            return false;
        return true;
    }
}
