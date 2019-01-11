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
 * Represents a subscription filter.
 * </p>
 */
public class SubscriptionFilter implements Serializable {
    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterName;

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
     * A symbolic description of how CloudWatch Logs should interpret the data
     * in each log event. For example, a log event may contain time stamps, IP
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
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String destinationArn;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String roleArn;

    /**
     * <p>
     * The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     */
    private String distribution;

    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The name of the subscription filter.
     *         </p>
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName <p>
     *            The name of the subscription filter.
     *            </p>
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The name of the subscription filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName <p>
     *            The name of the subscription filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withFilterName(String filterName) {
        this.filterName = filterName;
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
    public SubscriptionFilter withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * A symbolic description of how CloudWatch Logs should interpret the data
     * in each log event. For example, a log event may contain time stamps, IP
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
     *         time stamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     *         </p>
     */
    public String getFilterPattern() {
        return filterPattern;
    }

    /**
     * <p>
     * A symbolic description of how CloudWatch Logs should interpret the data
     * in each log event. For example, a log event may contain time stamps, IP
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
     *            contain time stamps, IP addresses, strings, and so on. You use
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
     * in each log event. For example, a log event may contain time stamps, IP
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
     *            contain time stamps, IP addresses, strings, and so on. You use
     *            the filter pattern to specify what to look for in the log
     *            event message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the destination.
     *         </p>
     */
    public String getDestinationArn() {
        return destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn <p>
     *            The Amazon Resource Name (ARN) of the destination.
     *            </p>
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn <p>
     *            The Amazon Resource Name (ARN) of the destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p/>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p/>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @return <p>
     *         The method used to distribute log data to the destination, which
     *         can be either random or grouped by log stream.
     *         </p>
     * @see Distribution
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination,
     *            which can be either random or grouped by log stream.
     *            </p>
     * @see Distribution
     */
    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination,
     *            which can be either random or grouped by log stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Distribution
     */
    public SubscriptionFilter withDistribution(String distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination,
     *            which can be either random or grouped by log stream.
     *            </p>
     * @see Distribution
     */
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
    }

    /**
     * <p>
     * The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination,
     *            which can be either random or grouped by log stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Distribution
     */
    public SubscriptionFilter withDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The creation time of the subscription filter, expressed as the
     *         number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the subscription filter, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the subscription filter, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the subscription filter, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscriptionFilter withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
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
        if (getFilterName() != null)
            sb.append("filterName: " + getFilterName() + ",");
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getFilterPattern() != null)
            sb.append("filterPattern: " + getFilterPattern() + ",");
        if (getDestinationArn() != null)
            sb.append("destinationArn: " + getDestinationArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getDistribution() != null)
            sb.append("distribution: " + getDistribution() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDistribution() == null) ? 0 : getDistribution().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscriptionFilter == false)
            return false;
        SubscriptionFilter other = (SubscriptionFilter) obj;

        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null
                && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null
                && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null
                && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDistribution() == null ^ this.getDistribution() == null)
            return false;
        if (other.getDistribution() != null
                && other.getDistribution().equals(this.getDistribution()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
