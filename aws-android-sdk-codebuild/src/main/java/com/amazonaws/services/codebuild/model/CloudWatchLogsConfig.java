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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about Amazon CloudWatch Logs for a build project.
 * </p>
 */
public class CloudWatchLogsConfig implements Serializable {
    /**
     * <p>
     * The current status of the logs in Amazon CloudWatch Logs for a build
     * project. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for this build
     * project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled for this
     * build project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String status;

    /**
     * <p>
     * The group name of the logs in Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The prefix of the stream name of the Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * The current status of the logs in Amazon CloudWatch Logs for a build
     * project. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for this build
     * project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled for this
     * build project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The current status of the logs in Amazon CloudWatch Logs for a
     *         build project. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for this
     *         build project.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled for
     *         this build project.
     *         </p>
     *         </li>
     *         </ul>
     * @see LogsConfigStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the logs in Amazon CloudWatch Logs for a build
     * project. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for this build
     * project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled for this
     * build project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the logs in Amazon CloudWatch Logs for a
     *            build project. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for
     *            this build project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled
     *            for this build project.
     *            </p>
     *            </li>
     *            </ul>
     * @see LogsConfigStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the logs in Amazon CloudWatch Logs for a build
     * project. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for this build
     * project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled for this
     * build project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the logs in Amazon CloudWatch Logs for a
     *            build project. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for
     *            this build project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled
     *            for this build project.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogsConfigStatusType
     */
    public CloudWatchLogsConfig withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the logs in Amazon CloudWatch Logs for a build
     * project. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for this build
     * project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled for this
     * build project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the logs in Amazon CloudWatch Logs for a
     *            build project. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for
     *            this build project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled
     *            for this build project.
     *            </p>
     *            </li>
     *            </ul>
     * @see LogsConfigStatusType
     */
    public void setStatus(LogsConfigStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the logs in Amazon CloudWatch Logs for a build
     * project. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for this build
     * project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled for this
     * build project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the logs in Amazon CloudWatch Logs for a
     *            build project. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: Amazon CloudWatch Logs are enabled for
     *            this build project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: Amazon CloudWatch Logs are not enabled
     *            for this build project.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogsConfigStatusType
     */
    public CloudWatchLogsConfig withStatus(LogsConfigStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The group name of the logs in Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     *
     * @return <p>
     *         The group name of the logs in Amazon CloudWatch Logs. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *         >Working with Log Groups and Log Streams</a>.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The group name of the logs in Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     *
     * @param groupName <p>
     *            The group name of the logs in Amazon CloudWatch Logs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *            >Working with Log Groups and Log Streams</a>.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The group name of the logs in Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The group name of the logs in Amazon CloudWatch Logs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *            >Working with Log Groups and Log Streams</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchLogsConfig withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The prefix of the stream name of the Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     *
     * @return <p>
     *         The prefix of the stream name of the Amazon CloudWatch Logs. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *         >Working with Log Groups and Log Streams</a>.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The prefix of the stream name of the Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     *
     * @param streamName <p>
     *            The prefix of the stream name of the Amazon CloudWatch Logs.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *            >Working with Log Groups and Log Streams</a>.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The prefix of the stream name of the Amazon CloudWatch Logs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     * >Working with Log Groups and Log Streams</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamName <p>
     *            The prefix of the stream name of the Amazon CloudWatch Logs.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *            >Working with Log Groups and Log Streams</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchLogsConfig withStreamName(String streamName) {
        this.streamName = streamName;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getGroupName() != null)
            sb.append("groupName: " + getGroupName() + ",");
        if (getStreamName() != null)
            sb.append("streamName: " + getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsConfig == false)
            return false;
        CloudWatchLogsConfig other = (CloudWatchLogsConfig) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }
}
