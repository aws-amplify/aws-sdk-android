/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The logging parameters of a user pool.
 * </p>
 */
public class LogConfigurationType implements Serializable {
    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for
     * detailed activity logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR
     */
    private String logLevel;

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>userNotification
     */
    private String eventSource;

    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     */
    private CloudWatchLogsConfigurationType cloudWatchLogsConfiguration;

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for
     * detailed activity logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR
     *
     * @return <p>
     *         The <code>errorlevel</code> selection of logs that a user pool
     *         sends for detailed activity logging.
     *         </p>
     * @see LogLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for
     * detailed activity logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR
     *
     * @param logLevel <p>
     *            The <code>errorlevel</code> selection of logs that a user pool
     *            sends for detailed activity logging.
     *            </p>
     * @see LogLevel
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for
     * detailed activity logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR
     *
     * @param logLevel <p>
     *            The <code>errorlevel</code> selection of logs that a user pool
     *            sends for detailed activity logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public LogConfigurationType withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for
     * detailed activity logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR
     *
     * @param logLevel <p>
     *            The <code>errorlevel</code> selection of logs that a user pool
     *            sends for detailed activity logging.
     *            </p>
     * @see LogLevel
     */
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for
     * detailed activity logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR
     *
     * @param logLevel <p>
     *            The <code>errorlevel</code> selection of logs that a user pool
     *            sends for detailed activity logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public LogConfigurationType withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>userNotification
     *
     * @return <p>
     *         The source of events that your user pool sends for detailed
     *         activity logging.
     *         </p>
     * @see EventSourceName
     */
    public String getEventSource() {
        return eventSource;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>userNotification
     *
     * @param eventSource <p>
     *            The source of events that your user pool sends for detailed
     *            activity logging.
     *            </p>
     * @see EventSourceName
     */
    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity
     * logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>userNotification
     *
     * @param eventSource <p>
     *            The source of events that your user pool sends for detailed
     *            activity logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSourceName
     */
    public LogConfigurationType withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>userNotification
     *
     * @param eventSource <p>
     *            The source of events that your user pool sends for detailed
     *            activity logging.
     *            </p>
     * @see EventSourceName
     */
    public void setEventSource(EventSourceName eventSource) {
        this.eventSource = eventSource.toString();
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity
     * logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>userNotification
     *
     * @param eventSource <p>
     *            The source of events that your user pool sends for detailed
     *            activity logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSourceName
     */
    public LogConfigurationType withEventSource(EventSourceName eventSource) {
        this.eventSource = eventSource.toString();
        return this;
    }

    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     *
     * @return <p>
     *         The CloudWatch logging destination of a user pool.
     *         </p>
     */
    public CloudWatchLogsConfigurationType getCloudWatchLogsConfiguration() {
        return cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     *
     * @param cloudWatchLogsConfiguration <p>
     *            The CloudWatch logging destination of a user pool.
     *            </p>
     */
    public void setCloudWatchLogsConfiguration(
            CloudWatchLogsConfigurationType cloudWatchLogsConfiguration) {
        this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchLogsConfiguration <p>
     *            The CloudWatch logging destination of a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogConfigurationType withCloudWatchLogsConfiguration(
            CloudWatchLogsConfigurationType cloudWatchLogsConfiguration) {
        this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
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
        if (getLogLevel() != null)
            sb.append("LogLevel: " + getLogLevel() + ",");
        if (getEventSource() != null)
            sb.append("EventSource: " + getEventSource() + ",");
        if (getCloudWatchLogsConfiguration() != null)
            sb.append("CloudWatchLogsConfiguration: " + getCloudWatchLogsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode
                + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchLogsConfiguration() == null) ? 0
                        : getCloudWatchLogsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfigurationType == false)
            return false;
        LogConfigurationType other = (LogConfigurationType) obj;

        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null
                && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getCloudWatchLogsConfiguration() == null
                ^ this.getCloudWatchLogsConfiguration() == null)
            return false;
        if (other.getCloudWatchLogsConfiguration() != null
                && other.getCloudWatchLogsConfiguration().equals(
                        this.getCloudWatchLogsConfiguration()) == false)
            return false;
        return true;
    }
}
