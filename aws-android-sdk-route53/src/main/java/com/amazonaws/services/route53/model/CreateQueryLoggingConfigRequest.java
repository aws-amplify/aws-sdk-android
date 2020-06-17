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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a configuration for DNS query logging. After you create a query
 * logging configuration, Amazon Route 53 begins to publish log data to an
 * Amazon CloudWatch Logs log group.
 * </p>
 * <p>
 * DNS query logs contain information about the queries that Route 53 receives
 * for a specified public hosted zone, such as the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Route 53 edge location that responded to the DNS query
 * </p>
 * </li>
 * <li>
 * <p>
 * Domain or subdomain that was requested
 * </p>
 * </li>
 * <li>
 * <p>
 * DNS record type, such as A or AAAA
 * </p>
 * </li>
 * <li>
 * <p>
 * DNS response code, such as <code>NoError</code> or <code>ServFail</code>
 * </p>
 * </li>
 * </ul>
 * <dl>
 * <dt>Log Group and Resource Policy</dt>
 * <dd>
 * <p>
 * Before you create a query logging configuration, perform the following
 * operations.
 * </p>
 * <note>
 * <p>
 * If you create a query logging configuration using the Route 53 console, Route
 * 53 performs these operations automatically.
 * </p>
 * </note>
 * <ol>
 * <li>
 * <p>
 * Create a CloudWatch Logs log group, and make note of the ARN, which you
 * specify when you create a query logging configuration. Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You must create the log group in the us-east-1 region.
 * </p>
 * </li>
 * <li>
 * <p>
 * You must use the same AWS account to create the log group and the hosted zone
 * that you want to configure query logging for.
 * </p>
 * </li>
 * <li>
 * <p>
 * When you create log groups for query logging, we recommend that you use a
 * consistent prefix, for example:
 * </p>
 * <p>
 * <code>/aws/route53/<i>hosted zone name</i> </code>
 * </p>
 * <p>
 * In the next step, you'll create a resource policy, which controls access to
 * one or more log groups and the associated AWS resources, such as Route 53
 * hosted zones. There's a limit on the number of resource policies that you can
 * create, so we recommend that you use a consistent prefix so you can use the
 * same resource policy for all the log groups that you create for query
 * logging.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Create a CloudWatch Logs resource policy, and give it the permissions that
 * Route 53 needs to create log streams and to send query logs to log streams.
 * For the value of <code>Resource</code>, specify the ARN for the log group
 * that you created in the previous step. To use the same resource policy for
 * all the CloudWatch Logs log groups that you created for query logging
 * configurations, replace the hosted zone name with <code>*</code>, for
 * example:
 * </p>
 * <p>
 * <code>arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/*</code>
 * </p>
 * <note>
 * <p>
 * You can't use the CloudWatch console to create or edit a resource policy. You
 * must use the CloudWatch API, one of the AWS SDKs, or the AWS CLI.
 * </p>
 * </note></li>
 * </ol>
 * </dd>
 * <dt>Log Streams and Edge Locations</dt>
 * <dd>
 * <p>
 * When Route 53 finishes creating the configuration for DNS query logging, it
 * does the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creates a log stream for an edge location the first time that the edge
 * location responds to DNS queries for the specified hosted zone. That log
 * stream is used to log all queries that Route 53 responds to for that edge
 * location.
 * </p>
 * </li>
 * <li>
 * <p>
 * Begins to send query logs to the applicable log stream.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The name of each log stream is in the following format:
 * </p>
 * <p>
 * <code> <i>hosted zone ID</i>/<i>edge location code</i> </code>
 * </p>
 * <p>
 * The edge location code is a three-letter code and an arbitrarily assigned
 * number, for example, DFW3. The three-letter code typically corresponds with
 * the International Air Transport Association airport code for an airport near
 * the edge location. (These abbreviations might change in the future.) For a
 * list of edge locations, see "The Route 53 Global Network" on the <a
 * href="http://aws.amazon.com/route53/details/">Route 53 Product Details</a>
 * page.
 * </p>
 * </dd>
 * <dt>Queries That Are Logged</dt>
 * <dd>
 * <p>
 * Query logs contain only the queries that DNS resolvers forward to Route 53.
 * If a DNS resolver has already cached the response to a query (such as the IP
 * address for a load balancer for example.com), the resolver will continue to
 * return the cached response. It doesn't forward another query to Route 53
 * until the TTL for the corresponding resource record set expires. Depending on
 * how many DNS queries are submitted for a resource record set, and depending
 * on the TTL for that resource record set, query logs might contain information
 * about only one query out of every several thousand queries that are submitted
 * to DNS. For more information about how DNS works, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html"
 * >Routing Internet Traffic to Your Website or Web Application</a> in the
 * <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * </dd>
 * <dt>Log File Format</dt>
 * <dd>
 * <p>
 * For a list of the values in each query log and the format of each value, see
 * <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html"
 * >Logging DNS Queries</a> in the <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * </dd>
 * <dt>Pricing</dt>
 * <dd>
 * <p>
 * For information about charges for query logs, see <a
 * href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch
 * Pricing</a>.
 * </p>
 * </dd>
 * <dt>How to Stop Logging</dt>
 * <dd>
 * <p>
 * If you want Route 53 to stop sending query logs to CloudWatch Logs, delete
 * the query logging configuration. For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html"
 * >DeleteQueryLoggingConfig</a>.
 * </p>
 * </dd>
 * </dl>
 */
public class CreateQueryLoggingConfigRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log
     * queries only for public hosted zones.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon
     * Route 53 to send query logs to. This is the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name<
     * /i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     * >describe-log-groups</a> command, or the applicable command in one of the
     * AWS SDKs.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;

    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log
     * queries only for public hosted zones.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone that you want to log queries for. You
     *         can log queries only for public hosted zones.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log
     * queries only for public hosted zones.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you want to log queries for.
     *            You can log queries only for public hosted zones.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to log queries for. You can log
     * queries only for public hosted zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you want to log queries for.
     *            You can log queries only for public hosted zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueryLoggingConfigRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon
     * Route 53 to send query logs to. This is the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name<
     * /i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     * >describe-log-groups</a> command, or the applicable command in one of the
     * AWS SDKs.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the log group that you want to
     *         Amazon Route 53 to send query logs to. This is the format of the
     *         ARN:
     *         </p>
     *         <p>
     *         arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>
     *         log_group_name</i>
     *         </p>
     *         <p>
     *         To get the ARN for a log group, you can use the CloudWatch
     *         console, the <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     *         >DescribeLogGroups</a> API action, the <a href=
     *         "https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     *         >describe-log-groups</a> command, or the applicable command in
     *         one of the AWS SDKs.
     *         </p>
     */
    public String getCloudWatchLogsLogGroupArn() {
        return cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon
     * Route 53 to send query logs to. This is the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name<
     * /i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     * >describe-log-groups</a> command, or the applicable command in one of the
     * AWS SDKs.
     * </p>
     *
     * @param cloudWatchLogsLogGroupArn <p>
     *            The Amazon Resource Name (ARN) for the log group that you want
     *            to Amazon Route 53 to send query logs to. This is the format
     *            of the ARN:
     *            </p>
     *            <p>
     *            arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>
     *            log_group_name</i>
     *            </p>
     *            <p>
     *            To get the ARN for a log group, you can use the CloudWatch
     *            console, the <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     *            >DescribeLogGroups</a> API action, the <a href=
     *            "https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     *            >describe-log-groups</a> command, or the applicable command in
     *            one of the AWS SDKs.
     *            </p>
     */
    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the log group that you want to Amazon
     * Route 53 to send query logs to. This is the format of the ARN:
     * </p>
     * <p>
     * arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>log_group_name<
     * /i>
     * </p>
     * <p>
     * To get the ARN for a log group, you can use the CloudWatch console, the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     * >DescribeLogGroups</a> API action, the <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     * >describe-log-groups</a> command, or the applicable command in one of the
     * AWS SDKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchLogsLogGroupArn <p>
     *            The Amazon Resource Name (ARN) for the log group that you want
     *            to Amazon Route 53 to send query logs to. This is the format
     *            of the ARN:
     *            </p>
     *            <p>
     *            arn:aws:logs:<i>region</i>:<i>account-id</i>:log-group:<i>
     *            log_group_name</i>
     *            </p>
     *            <p>
     *            To get the ARN for a log group, you can use the CloudWatch
     *            console, the <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html"
     *            >DescribeLogGroups</a> API action, the <a href=
     *            "https://docs.aws.amazon.com/cli/latest/reference/logs/describe-log-groups.html"
     *            >describe-log-groups</a> command, or the applicable command in
     *            one of the AWS SDKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueryLoggingConfigRequest withCloudWatchLogsLogGroupArn(
            String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: " + getCloudWatchLogsLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueryLoggingConfigRequest == false)
            return false;
        CreateQueryLoggingConfigRequest other = (CreateQueryLoggingConfigRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() == null
                ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null
                && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        return true;
    }
}
