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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an export task, which allows you to efficiently export data from a
 * log group to an Amazon S3 bucket.
 * </p>
 * <p>
 * This is an asynchronous call. If all the required information is provided,
 * this operation initiates an export task and responds with the ID of the task.
 * After the task has started, you can use <a>DescribeExportTasks</a> to get the
 * status of the export task. Each account can only have one active (
 * <code>RUNNING</code> or <code>PENDING</code>) export task at a time. To
 * cancel an export task, use <a>CancelExportTask</a>.
 * </p>
 * <p>
 * You can export logs from multiple log groups or multiple time ranges to the
 * same S3 bucket. To separate out log data for each export task, you can
 * specify a prefix to be used as the Amazon S3 key prefix for all exported
 * objects.
 * </p>
 */
public class CreateExportTaskRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't
     * specify a value, no prefix filter is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamNamePrefix;

    /**
     * <p>
     * The start time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * earlier than this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long from;

    /**
     * <p>
     * The end time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * later than this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long to;

    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in
     * the same AWS region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String destination;

    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you
     * don't specify a value, the default is <code>exportedlogs</code>.
     * </p>
     */
    private String destinationPrefix;

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
    public CreateExportTaskRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
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
     *            The name of the log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportTaskRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't
     * specify a value, no prefix filter is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         Export only log streams that match the provided prefix. If you
     *         don't specify a value, no prefix filter is applied.
     *         </p>
     */
    public String getLogStreamNamePrefix() {
        return logStreamNamePrefix;
    }

    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't
     * specify a value, no prefix filter is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamNamePrefix <p>
     *            Export only log streams that match the provided prefix. If you
     *            don't specify a value, no prefix filter is applied.
     *            </p>
     */
    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't
     * specify a value, no prefix filter is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamNamePrefix <p>
     *            Export only log streams that match the provided prefix. If you
     *            don't specify a value, no prefix filter is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportTaskRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
        return this;
    }

    /**
     * <p>
     * The start time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * earlier than this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The start time of the range for the request, expressed as the
     *         number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *         with a time stamp earlier than this time are not exported.
     *         </p>
     */
    public Long getFrom() {
        return from;
    }

    /**
     * <p>
     * The start time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * earlier than this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param from <p>
     *            The start time of the range for the request, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *            with a time stamp earlier than this time are not exported.
     *            </p>
     */
    public void setFrom(Long from) {
        this.from = from;
    }

    /**
     * <p>
     * The start time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * earlier than this time are not exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param from <p>
     *            The start time of the range for the request, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *            with a time stamp earlier than this time are not exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportTaskRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * <p>
     * The end time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * later than this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The end time of the range for the request, expressed as the
     *         number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *         with a time stamp later than this time are not exported.
     *         </p>
     */
    public Long getTo() {
        return to;
    }

    /**
     * <p>
     * The end time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * later than this time are not exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param to <p>
     *            The end time of the range for the request, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *            with a time stamp later than this time are not exported.
     *            </p>
     */
    public void setTo(Long to) {
        this.to = to;
    }

    /**
     * <p>
     * The end time of the range for the request, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time stamp
     * later than this time are not exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param to <p>
     *            The end time of the range for the request, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *            with a time stamp later than this time are not exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportTaskRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in
     * the same AWS region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The name of S3 bucket for the exported log data. The bucket must
     *         be in the same AWS region.
     *         </p>
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in
     * the same AWS region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param destination <p>
     *            The name of S3 bucket for the exported log data. The bucket
     *            must be in the same AWS region.
     *            </p>
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in
     * the same AWS region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param destination <p>
     *            The name of S3 bucket for the exported log data. The bucket
     *            must be in the same AWS region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportTaskRequest withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you
     * don't specify a value, the default is <code>exportedlogs</code>.
     * </p>
     *
     * @return <p>
     *         The prefix used as the start of the key for every object
     *         exported. If you don't specify a value, the default is
     *         <code>exportedlogs</code>.
     *         </p>
     */
    public String getDestinationPrefix() {
        return destinationPrefix;
    }

    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you
     * don't specify a value, the default is <code>exportedlogs</code>.
     * </p>
     *
     * @param destinationPrefix <p>
     *            The prefix used as the start of the key for every object
     *            exported. If you don't specify a value, the default is
     *            <code>exportedlogs</code>.
     *            </p>
     */
    public void setDestinationPrefix(String destinationPrefix) {
        this.destinationPrefix = destinationPrefix;
    }

    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you
     * don't specify a value, the default is <code>exportedlogs</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPrefix <p>
     *            The prefix used as the start of the key for every object
     *            exported. If you don't specify a value, the default is
     *            <code>exportedlogs</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportTaskRequest withDestinationPrefix(String destinationPrefix) {
        this.destinationPrefix = destinationPrefix;
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
        if (getTaskName() != null)
            sb.append("taskName: " + getTaskName() + ",");
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getLogStreamNamePrefix() != null)
            sb.append("logStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
        if (getFrom() != null)
            sb.append("from: " + getFrom() + ",");
        if (getTo() != null)
            sb.append("to: " + getTo() + ",");
        if (getDestination() != null)
            sb.append("destination: " + getDestination() + ",");
        if (getDestinationPrefix() != null)
            sb.append("destinationPrefix: " + getDestinationPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationPrefix() == null) ? 0 : getDestinationPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExportTaskRequest == false)
            return false;
        CreateExportTaskRequest other = (CreateExportTaskRequest) obj;

        if (other.getTaskName() == null ^ this.getTaskName() == null)
            return false;
        if (other.getTaskName() != null && other.getTaskName().equals(this.getTaskName()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null
                && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
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
        return true;
    }
}
