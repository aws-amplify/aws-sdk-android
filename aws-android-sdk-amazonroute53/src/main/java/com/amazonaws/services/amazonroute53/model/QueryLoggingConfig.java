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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about a configuration for DNS query
 * logging.
 * </p>
 */
public class QueryLoggingConfig implements Serializable {
    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String id;

    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that
     * Amazon Route 53 is publishing logs to.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;

    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID for a configuration for DNS query logging.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID for a configuration for DNS query logging.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for a configuration for DNS query logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID for a configuration for DNS query logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryLoggingConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone that CloudWatch Logs is logging queries
     *         for.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that CloudWatch Logs is logging
     *            queries for.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that CloudWatch Logs is logging queries for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that CloudWatch Logs is logging
     *            queries for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryLoggingConfig withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that
     * Amazon Route 53 is publishing logs to.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the CloudWatch Logs log group
     *         that Amazon Route 53 is publishing logs to.
     *         </p>
     */
    public String getCloudWatchLogsLogGroupArn() {
        return cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that
     * Amazon Route 53 is publishing logs to.
     * </p>
     *
     * @param cloudWatchLogsLogGroupArn <p>
     *            The Amazon Resource Name (ARN) of the CloudWatch Logs log
     *            group that Amazon Route 53 is publishing logs to.
     *            </p>
     */
    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that
     * Amazon Route 53 is publishing logs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchLogsLogGroupArn <p>
     *            The Amazon Resource Name (ARN) of the CloudWatch Logs log
     *            group that Amazon Route 53 is publishing logs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryLoggingConfig withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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

        if (obj instanceof QueryLoggingConfig == false)
            return false;
        QueryLoggingConfig other = (QueryLoggingConfig) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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
