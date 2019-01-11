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
 * Creates or updates a subscription filter and associates it with the specified
 * log group. Subscription filters allow you to subscribe to a real-time stream
 * of log events ingested through <a>PutLogEvents</a> and have them delivered to
 * a specific destination. Currently, the supported destinations are:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An Amazon Kinesis stream belonging to the same account as the subscription
 * filter, for same-account delivery.
 * </p>
 * </li>
 * <li>
 * <p>
 * A logical destination that belongs to a different account, for cross-account
 * delivery.
 * </p>
 * </li>
 * <li>
 * <p>
 * An Amazon Kinesis Firehose delivery stream that belongs to the same account
 * as the subscription filter, for same-account delivery.
 * </p>
 * </li>
 * <li>
 * <p>
 * An AWS Lambda function that belongs to the same account as the subscription
 * filter, for same-account delivery.
 * </p>
 * </li>
 * </ul>
 * <p>
 * There can only be one subscription filter associated with a log group. If you
 * are updating an existing filter, you must specify the correct name in
 * <code>filterName</code>. Otherwise, the call fails because you cannot
 * associate a second filter with a log group.
 * </p>
 */
public class PutSubscriptionFilterRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A name for the subscription filter. If you are updating an existing
     * filter, you must specify the correct name in <code>filterName</code>.
     * Otherwise, the call fails because you cannot associate a second filter
     * with a log group. To find the name of the filter currently associated
     * with a log group, use <a>DescribeSubscriptionFilters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterName;

    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String filterPattern;

    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently,
     * the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different
     * account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account
     * as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription
     * filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String destinationArn;

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. You don't need to provide
     * the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String roleArn;

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log
     * data is grouped by log stream, but the grouping can be set to random for
     * a more even distribution. This property is only applicable when the
     * destination is an Amazon Kinesis stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     */
    private String distribution;

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
    public PutSubscriptionFilterRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * A name for the subscription filter. If you are updating an existing
     * filter, you must specify the correct name in <code>filterName</code>.
     * Otherwise, the call fails because you cannot associate a second filter
     * with a log group. To find the name of the filter currently associated
     * with a log group, use <a>DescribeSubscriptionFilters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         A name for the subscription filter. If you are updating an
     *         existing filter, you must specify the correct name in
     *         <code>filterName</code>. Otherwise, the call fails because you
     *         cannot associate a second filter with a log group. To find the
     *         name of the filter currently associated with a log group, use
     *         <a>DescribeSubscriptionFilters</a>.
     *         </p>
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * <p>
     * A name for the subscription filter. If you are updating an existing
     * filter, you must specify the correct name in <code>filterName</code>.
     * Otherwise, the call fails because you cannot associate a second filter
     * with a log group. To find the name of the filter currently associated
     * with a log group, use <a>DescribeSubscriptionFilters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName <p>
     *            A name for the subscription filter. If you are updating an
     *            existing filter, you must specify the correct name in
     *            <code>filterName</code>. Otherwise, the call fails because you
     *            cannot associate a second filter with a log group. To find the
     *            name of the filter currently associated with a log group, use
     *            <a>DescribeSubscriptionFilters</a>.
     *            </p>
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * A name for the subscription filter. If you are updating an existing
     * filter, you must specify the correct name in <code>filterName</code>.
     * Otherwise, the call fails because you cannot associate a second filter
     * with a log group. To find the name of the filter currently associated
     * with a log group, use <a>DescribeSubscriptionFilters</a>.
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
     *            A name for the subscription filter. If you are updating an
     *            existing filter, you must specify the correct name in
     *            <code>filterName</code>. Otherwise, the call fails because you
     *            cannot associate a second filter with a log group. To find the
     *            name of the filter currently associated with a log group, use
     *            <a>DescribeSubscriptionFilters</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSubscriptionFilterRequest withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A filter pattern for subscribing to a filtered stream of log
     *         events.
     *         </p>
     */
    public String getFilterPattern() {
        return filterPattern;
    }

    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            A filter pattern for subscribing to a filtered stream of log
     *            events.
     *            </p>
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * A filter pattern for subscribing to a filtered stream of log events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            A filter pattern for subscribing to a filtered stream of log
     *            events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSubscriptionFilterRequest withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently,
     * the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different
     * account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account
     * as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription
     * filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the destination to deliver matching log events to.
     *         Currently, the supported destinations are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An Amazon Kinesis stream belonging to the same account as the
     *         subscription filter, for same-account delivery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A logical destination (specified using an ARN) belonging to a
     *         different account, for cross-account delivery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An Amazon Kinesis Firehose delivery stream belonging to the same
     *         account as the subscription filter, for same-account delivery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An AWS Lambda function belonging to the same account as the
     *         subscription filter, for same-account delivery.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDestinationArn() {
        return destinationArn;
    }

    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently,
     * the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different
     * account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account
     * as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription
     * filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn <p>
     *            The ARN of the destination to deliver matching log events to.
     *            Currently, the supported destinations are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An Amazon Kinesis stream belonging to the same account as the
     *            subscription filter, for same-account delivery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A logical destination (specified using an ARN) belonging to a
     *            different account, for cross-account delivery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An Amazon Kinesis Firehose delivery stream belonging to the
     *            same account as the subscription filter, for same-account
     *            delivery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An AWS Lambda function belonging to the same account as the
     *            subscription filter, for same-account delivery.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the destination to deliver matching log events to. Currently,
     * the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (specified using an ARN) belonging to a different
     * account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream belonging to the same account
     * as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription
     * filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param destinationArn <p>
     *            The ARN of the destination to deliver matching log events to.
     *            Currently, the supported destinations are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An Amazon Kinesis stream belonging to the same account as the
     *            subscription filter, for same-account delivery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A logical destination (specified using an ARN) belonging to a
     *            different account, for cross-account delivery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An Amazon Kinesis Firehose delivery stream belonging to the
     *            same account as the subscription filter, for same-account
     *            delivery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An AWS Lambda function belonging to the same account as the
     *            subscription filter, for same-account delivery.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSubscriptionFilterRequest withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. You don't need to provide
     * the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of an IAM role that grants CloudWatch Logs permissions to
     *         deliver ingested log events to the destination stream. You don't
     *         need to provide the ARN when you are working with a logical
     *         destination for cross-account delivery.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. You don't need to provide
     * the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that grants CloudWatch Logs permissions
     *            to deliver ingested log events to the destination stream. You
     *            don't need to provide the ARN when you are working with a
     *            logical destination for cross-account delivery.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. You don't need to provide
     * the ARN when you are working with a logical destination for cross-account
     * delivery.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that grants CloudWatch Logs permissions
     *            to deliver ingested log events to the destination stream. You
     *            don't need to provide the ARN when you are working with a
     *            logical destination for cross-account delivery.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSubscriptionFilterRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log
     * data is grouped by log stream, but the grouping can be set to random for
     * a more even distribution. This property is only applicable when the
     * destination is an Amazon Kinesis stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @return <p>
     *         The method used to distribute log data to the destination. By
     *         default log data is grouped by log stream, but the grouping can
     *         be set to random for a more even distribution. This property is
     *         only applicable when the destination is an Amazon Kinesis stream.
     *         </p>
     * @see Distribution
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log
     * data is grouped by log stream, but the grouping can be set to random for
     * a more even distribution. This property is only applicable when the
     * destination is an Amazon Kinesis stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination. By
     *            default log data is grouped by log stream, but the grouping
     *            can be set to random for a more even distribution. This
     *            property is only applicable when the destination is an Amazon
     *            Kinesis stream.
     *            </p>
     * @see Distribution
     */
    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log
     * data is grouped by log stream, but the grouping can be set to random for
     * a more even distribution. This property is only applicable when the
     * destination is an Amazon Kinesis stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination. By
     *            default log data is grouped by log stream, but the grouping
     *            can be set to random for a more even distribution. This
     *            property is only applicable when the destination is an Amazon
     *            Kinesis stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Distribution
     */
    public PutSubscriptionFilterRequest withDistribution(String distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log
     * data is grouped by log stream, but the grouping can be set to random for
     * a more even distribution. This property is only applicable when the
     * destination is an Amazon Kinesis stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination. By
     *            default log data is grouped by log stream, but the grouping
     *            can be set to random for a more even distribution. This
     *            property is only applicable when the destination is an Amazon
     *            Kinesis stream.
     *            </p>
     * @see Distribution
     */
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
    }

    /**
     * <p>
     * The method used to distribute log data to the destination. By default log
     * data is grouped by log stream, but the grouping can be set to random for
     * a more even distribution. This property is only applicable when the
     * destination is an Amazon Kinesis stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Random, ByLogStream
     *
     * @param distribution <p>
     *            The method used to distribute log data to the destination. By
     *            default log data is grouped by log stream, but the grouping
     *            can be set to random for a more even distribution. This
     *            property is only applicable when the destination is an Amazon
     *            Kinesis stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Distribution
     */
    public PutSubscriptionFilterRequest withDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
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
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getFilterName() != null)
            sb.append("filterName: " + getFilterName() + ",");
        if (getFilterPattern() != null)
            sb.append("filterPattern: " + getFilterPattern() + ",");
        if (getDestinationArn() != null)
            sb.append("destinationArn: " + getDestinationArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getDistribution() != null)
            sb.append("distribution: " + getDistribution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDistribution() == null) ? 0 : getDistribution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSubscriptionFilterRequest == false)
            return false;
        PutSubscriptionFilterRequest other = (PutSubscriptionFilterRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null
                && other.getFilterName().equals(this.getFilterName()) == false)
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
        return true;
    }
}
