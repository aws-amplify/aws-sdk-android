/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Tests the filter pattern of a metric filter against a sample of log event
 * messages. You can use this operation to validate the correctness of a metric
 * filter pattern.
 * </p>
 */
public class TestMetricFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A symbolic description of how CloudWatch Logs should interpret the data
     * in each log event. For example, a log event may contain timestamps, IP
     * addresses, strings, and so on. You use the filter pattern to specify what
     * to look for in the log event message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String filterPattern;

    /**
     * <p>
     * The log event messages to test.
     * </p>
     */
    private java.util.List<String> logEventMessages;

    /**
     * <p>
     * A symbolic description of how CloudWatch Logs should interpret the data
     * in each log event. For example, a log event may contain timestamps, IP
     * addresses, strings, and so on. You use the filter pattern to specify what
     * to look for in the log event message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A symbolic description of how CloudWatch Logs should interpret
     *         the data in each log event. For example, a log event may contain
     *         timestamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     *         </p>
     */
    public String getFilterPattern() {
        return filterPattern;
    }

    /**
     * <p>
     * A symbolic description of how CloudWatch Logs should interpret the data
     * in each log event. For example, a log event may contain timestamps, IP
     * addresses, strings, and so on. You use the filter pattern to specify what
     * to look for in the log event message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            A symbolic description of how CloudWatch Logs should interpret
     *            the data in each log event. For example, a log event may
     *            contain timestamps, IP addresses, strings, and so on. You use
     *            the filter pattern to specify what to look for in the log
     *            event message.
     *            </p>
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * A symbolic description of how CloudWatch Logs should interpret the data
     * in each log event. For example, a log event may contain timestamps, IP
     * addresses, strings, and so on. You use the filter pattern to specify what
     * to look for in the log event message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            A symbolic description of how CloudWatch Logs should interpret
     *            the data in each log event. For example, a log event may
     *            contain timestamps, IP addresses, strings, and so on. You use
     *            the filter pattern to specify what to look for in the log
     *            event message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestMetricFilterRequest withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     *
     * @return <p>
     *         The log event messages to test.
     *         </p>
     */
    public java.util.List<String> getLogEventMessages() {
        return logEventMessages;
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     *
     * @param logEventMessages <p>
     *            The log event messages to test.
     *            </p>
     */
    public void setLogEventMessages(java.util.Collection<String> logEventMessages) {
        if (logEventMessages == null) {
            this.logEventMessages = null;
            return;
        }

        this.logEventMessages = new java.util.ArrayList<String>(logEventMessages);
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logEventMessages <p>
     *            The log event messages to test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestMetricFilterRequest withLogEventMessages(String... logEventMessages) {
        if (getLogEventMessages() == null) {
            this.logEventMessages = new java.util.ArrayList<String>(logEventMessages.length);
        }
        for (String value : logEventMessages) {
            this.logEventMessages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logEventMessages <p>
     *            The log event messages to test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestMetricFilterRequest withLogEventMessages(
            java.util.Collection<String> logEventMessages) {
        setLogEventMessages(logEventMessages);
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
        if (getFilterPattern() != null)
            sb.append("filterPattern: " + getFilterPattern() + ",");
        if (getLogEventMessages() != null)
            sb.append("logEventMessages: " + getLogEventMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode
                + ((getLogEventMessages() == null) ? 0 : getLogEventMessages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestMetricFilterRequest == false)
            return false;
        TestMetricFilterRequest other = (TestMetricFilterRequest) obj;

        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null
                && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getLogEventMessages() == null ^ this.getLogEventMessages() == null)
            return false;
        if (other.getLogEventMessages() != null
                && other.getLogEventMessages().equals(this.getLogEventMessages()) == false)
            return false;
        return true;
    }
}
