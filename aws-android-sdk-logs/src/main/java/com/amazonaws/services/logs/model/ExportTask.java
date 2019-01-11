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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an export task.
 * </p>
 */
public class ExportTask implements Serializable {
    /**
     * <p>
     * The ID of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String taskId;

    /**
     * <p>
     * The name of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String taskName;

    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp before this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long from;

    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp later than this time are not
     * exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long to;

    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String destination;

    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object
     * exported.
     * </p>
     */
    private String destinationPrefix;

    /**
     * <p>
     * The status of the export task.
     * </p>
     */
    private ExportTaskStatus status;

    /**
     * <p>
     * Execution info about the export task.
     * </p>
     */
    private ExportTaskExecutionInfo executionInfo;

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The ID of the export task.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param taskId <p>
     *            The ID of the export task.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param taskId <p>
     *            The ID of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The name of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The name of the export task.
     *         </p>
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * <p>
     * The name of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param taskName <p>
     *            The name of the export task.
     *            </p>
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * <p>
     * The name of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param taskName <p>
     *            The name of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group from which logs data was exported.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group from which logs data was exported.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group from which logs data was exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp before this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The start time, expressed as the number of milliseconds after Jan
     *         1, 1970 00:00:00 UTC. Events with a time stamp before this time
     *         are not exported.
     *         </p>
     */
    public Long getFrom() {
        return from;
    }

    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp before this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param from <p>
     *            The start time, expressed as the number of milliseconds after
     *            Jan 1, 1970 00:00:00 UTC. Events with a time stamp before this
     *            time are not exported.
     *            </p>
     */
    public void setFrom(Long from) {
        this.from = from;
    }

    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp before this time are not exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param from <p>
     *            The start time, expressed as the number of milliseconds after
     *            Jan 1, 1970 00:00:00 UTC. Events with a time stamp before this
     *            time are not exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp later than this time are not
     * exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The end time, expressed as the number of milliseconds after Jan
     *         1, 1970 00:00:00 UTC. Events with a time stamp later than this
     *         time are not exported.
     *         </p>
     */
    public Long getTo() {
        return to;
    }

    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp later than this time are not
     * exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param to <p>
     *            The end time, expressed as the number of milliseconds after
     *            Jan 1, 1970 00:00:00 UTC. Events with a time stamp later than
     *            this time are not exported.
     *            </p>
     */
    public void setTo(Long to) {
        this.to = to;
    }

    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC. Events with a time stamp later than this time are not
     * exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param to <p>
     *            The end time, expressed as the number of milliseconds after
     *            Jan 1, 1970 00:00:00 UTC. Events with a time stamp later than
     *            this time are not exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The name of Amazon S3 bucket to which the log data was exported.
     *         </p>
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param destination <p>
     *            The name of Amazon S3 bucket to which the log data was
     *            exported.
     *            </p>
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param destination <p>
     *            The name of Amazon S3 bucket to which the log data was
     *            exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object
     * exported.
     * </p>
     *
     * @return <p>
     *         The prefix that was used as the start of Amazon S3 key for every
     *         object exported.
     *         </p>
     */
    public String getDestinationPrefix() {
        return destinationPrefix;
    }

    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object
     * exported.
     * </p>
     *
     * @param destinationPrefix <p>
     *            The prefix that was used as the start of Amazon S3 key for
     *            every object exported.
     *            </p>
     */
    public void setDestinationPrefix(String destinationPrefix) {
        this.destinationPrefix = destinationPrefix;
    }

    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object
     * exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPrefix <p>
     *            The prefix that was used as the start of Amazon S3 key for
     *            every object exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withDestinationPrefix(String destinationPrefix) {
        this.destinationPrefix = destinationPrefix;
        return this;
    }

    /**
     * <p>
     * The status of the export task.
     * </p>
     *
     * @return <p>
     *         The status of the export task.
     *         </p>
     */
    public ExportTaskStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the export task.
     * </p>
     *
     * @param status <p>
     *            The status of the export task.
     *            </p>
     */
    public void setStatus(ExportTaskStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withStatus(ExportTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Execution info about the export task.
     * </p>
     *
     * @return <p>
     *         Execution info about the export task.
     *         </p>
     */
    public ExportTaskExecutionInfo getExecutionInfo() {
        return executionInfo;
    }

    /**
     * <p>
     * Execution info about the export task.
     * </p>
     *
     * @param executionInfo <p>
     *            Execution info about the export task.
     *            </p>
     */
    public void setExecutionInfo(ExportTaskExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
    }

    /**
     * <p>
     * Execution info about the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionInfo <p>
     *            Execution info about the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withExecutionInfo(ExportTaskExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
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
        if (getTaskId() != null)
            sb.append("taskId: " + getTaskId() + ",");
        if (getTaskName() != null)
            sb.append("taskName: " + getTaskName() + ",");
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getFrom() != null)
            sb.append("from: " + getFrom() + ",");
        if (getTo() != null)
            sb.append("to: " + getTo() + ",");
        if (getDestination() != null)
            sb.append("destination: " + getDestination() + ",");
        if (getDestinationPrefix() != null)
            sb.append("destinationPrefix: " + getDestinationPrefix() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getExecutionInfo() != null)
            sb.append("executionInfo: " + getExecutionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationPrefix() == null) ? 0 : getDestinationPrefix().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionInfo() == null) ? 0 : getExecutionInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTask == false)
            return false;
        ExportTask other = (ExportTask) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskName() == null ^ this.getTaskName() == null)
            return false;
        if (other.getTaskName() != null && other.getTaskName().equals(this.getTaskName()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationPrefix() == null ^ this.getDestinationPrefix() == null)
            return false;
        if (other.getDestinationPrefix() != null
                && other.getDestinationPrefix().equals(this.getDestinationPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExecutionInfo() == null ^ this.getExecutionInfo() == null)
            return false;
        if (other.getExecutionInfo() != null
                && other.getExecutionInfo().equals(this.getExecutionInfo()) == false)
            return false;
        return true;
    }
}
