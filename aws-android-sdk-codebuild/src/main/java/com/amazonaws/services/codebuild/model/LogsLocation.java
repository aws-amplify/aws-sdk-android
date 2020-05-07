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
 * Information about build logs in Amazon CloudWatch Logs.
 * </p>
 */
public class LogsLocation implements Serializable {
    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     */
    private String deepLink;

    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     */
    private String s3DeepLink;

    /**
     * <p>
     * The ARN of Amazon CloudWatch Logs for a build project. Its format is
     * <code>arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazoncloudwatchlogs.html#amazoncloudwatchlogs-resources-for-iam-policies"
     * >Resources Defined by Amazon CloudWatch Logs</a>.
     * </p>
     */
    private String cloudWatchLogsArn;

    /**
     * <p>
     * The ARN of S3 logs for a build project. Its format is
     * <code>arn:${Partition}:s3:::${BucketName}/${ObjectName}</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html#amazons3-resources-for-iam-policies"
     * >Resources Defined by Amazon S3</a>.
     * </p>
     */
    private String s3LogsArn;

    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     */
    private CloudWatchLogsConfig cloudWatchLogs;

    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     */
    private S3LogsConfig s3Logs;

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon CloudWatch Logs group for the build logs.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     *
     * @param groupName <p>
     *            The name of the Amazon CloudWatch Logs group for the build
     *            logs.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the Amazon CloudWatch Logs group for the build
     *            logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon CloudWatch Logs stream for the build logs.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     *
     * @param streamName <p>
     *            The name of the Amazon CloudWatch Logs stream for the build
     *            logs.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamName <p>
     *            The name of the Amazon CloudWatch Logs stream for the build
     *            logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         The URL to an individual build log in Amazon CloudWatch Logs.
     *         </p>
     */
    public String getDeepLink() {
        return deepLink;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     *
     * @param deepLink <p>
     *            The URL to an individual build log in Amazon CloudWatch Logs.
     *            </p>
     */
    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deepLink <p>
     *            The URL to an individual build log in Amazon CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withDeepLink(String deepLink) {
        this.deepLink = deepLink;
        return this;
    }

    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     *
     * @return <p>
     *         The URL to a build log in an S3 bucket.
     *         </p>
     */
    public String getS3DeepLink() {
        return s3DeepLink;
    }

    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     *
     * @param s3DeepLink <p>
     *            The URL to a build log in an S3 bucket.
     *            </p>
     */
    public void setS3DeepLink(String s3DeepLink) {
        this.s3DeepLink = s3DeepLink;
    }

    /**
     * <p>
     * The URL to a build log in an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3DeepLink <p>
     *            The URL to a build log in an S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withS3DeepLink(String s3DeepLink) {
        this.s3DeepLink = s3DeepLink;
        return this;
    }

    /**
     * <p>
     * The ARN of Amazon CloudWatch Logs for a build project. Its format is
     * <code>arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazoncloudwatchlogs.html#amazoncloudwatchlogs-resources-for-iam-policies"
     * >Resources Defined by Amazon CloudWatch Logs</a>.
     * </p>
     *
     * @return <p>
     *         The ARN of Amazon CloudWatch Logs for a build project. Its format
     *         is
     *         <code>arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}</code>
     *         . For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazoncloudwatchlogs.html#amazoncloudwatchlogs-resources-for-iam-policies"
     *         >Resources Defined by Amazon CloudWatch Logs</a>.
     *         </p>
     */
    public String getCloudWatchLogsArn() {
        return cloudWatchLogsArn;
    }

    /**
     * <p>
     * The ARN of Amazon CloudWatch Logs for a build project. Its format is
     * <code>arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazoncloudwatchlogs.html#amazoncloudwatchlogs-resources-for-iam-policies"
     * >Resources Defined by Amazon CloudWatch Logs</a>.
     * </p>
     *
     * @param cloudWatchLogsArn <p>
     *            The ARN of Amazon CloudWatch Logs for a build project. Its
     *            format is
     *            <code>arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}</code>
     *            . For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazoncloudwatchlogs.html#amazoncloudwatchlogs-resources-for-iam-policies"
     *            >Resources Defined by Amazon CloudWatch Logs</a>.
     *            </p>
     */
    public void setCloudWatchLogsArn(String cloudWatchLogsArn) {
        this.cloudWatchLogsArn = cloudWatchLogsArn;
    }

    /**
     * <p>
     * The ARN of Amazon CloudWatch Logs for a build project. Its format is
     * <code>arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazoncloudwatchlogs.html#amazoncloudwatchlogs-resources-for-iam-policies"
     * >Resources Defined by Amazon CloudWatch Logs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchLogsArn <p>
     *            The ARN of Amazon CloudWatch Logs for a build project. Its
     *            format is
     *            <code>arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}</code>
     *            . For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazoncloudwatchlogs.html#amazoncloudwatchlogs-resources-for-iam-policies"
     *            >Resources Defined by Amazon CloudWatch Logs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withCloudWatchLogsArn(String cloudWatchLogsArn) {
        this.cloudWatchLogsArn = cloudWatchLogsArn;
        return this;
    }

    /**
     * <p>
     * The ARN of S3 logs for a build project. Its format is
     * <code>arn:${Partition}:s3:::${BucketName}/${ObjectName}</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html#amazons3-resources-for-iam-policies"
     * >Resources Defined by Amazon S3</a>.
     * </p>
     *
     * @return <p>
     *         The ARN of S3 logs for a build project. Its format is
     *         <code>arn:${Partition}:s3:::${BucketName}/${ObjectName}</code>.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html#amazons3-resources-for-iam-policies"
     *         >Resources Defined by Amazon S3</a>.
     *         </p>
     */
    public String getS3LogsArn() {
        return s3LogsArn;
    }

    /**
     * <p>
     * The ARN of S3 logs for a build project. Its format is
     * <code>arn:${Partition}:s3:::${BucketName}/${ObjectName}</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html#amazons3-resources-for-iam-policies"
     * >Resources Defined by Amazon S3</a>.
     * </p>
     *
     * @param s3LogsArn <p>
     *            The ARN of S3 logs for a build project. Its format is
     *            <code>arn:${Partition}:s3:::${BucketName}/${ObjectName}</code>
     *            . For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html#amazons3-resources-for-iam-policies"
     *            >Resources Defined by Amazon S3</a>.
     *            </p>
     */
    public void setS3LogsArn(String s3LogsArn) {
        this.s3LogsArn = s3LogsArn;
    }

    /**
     * <p>
     * The ARN of S3 logs for a build project. Its format is
     * <code>arn:${Partition}:s3:::${BucketName}/${ObjectName}</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html#amazons3-resources-for-iam-policies"
     * >Resources Defined by Amazon S3</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3LogsArn <p>
     *            The ARN of S3 logs for a build project. Its format is
     *            <code>arn:${Partition}:s3:::${BucketName}/${ObjectName}</code>
     *            . For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html#amazons3-resources-for-iam-policies"
     *            >Resources Defined by Amazon S3</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withS3LogsArn(String s3LogsArn) {
        this.s3LogsArn = s3LogsArn;
        return this;
    }

    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     *
     * @return <p>
     *         Information about Amazon CloudWatch Logs for a build project.
     *         </p>
     */
    public CloudWatchLogsConfig getCloudWatchLogs() {
        return cloudWatchLogs;
    }

    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     *
     * @param cloudWatchLogs <p>
     *            Information about Amazon CloudWatch Logs for a build project.
     *            </p>
     */
    public void setCloudWatchLogs(CloudWatchLogsConfig cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * <p>
     * Information about Amazon CloudWatch Logs for a build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchLogs <p>
     *            Information about Amazon CloudWatch Logs for a build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withCloudWatchLogs(CloudWatchLogsConfig cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
        return this;
    }

    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     *
     * @return <p>
     *         Information about S3 logs for a build project.
     *         </p>
     */
    public S3LogsConfig getS3Logs() {
        return s3Logs;
    }

    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     *
     * @param s3Logs <p>
     *            Information about S3 logs for a build project.
     *            </p>
     */
    public void setS3Logs(S3LogsConfig s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * Information about S3 logs for a build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Logs <p>
     *            Information about S3 logs for a build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogsLocation withS3Logs(S3LogsConfig s3Logs) {
        this.s3Logs = s3Logs;
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
        if (getGroupName() != null)
            sb.append("groupName: " + getGroupName() + ",");
        if (getStreamName() != null)
            sb.append("streamName: " + getStreamName() + ",");
        if (getDeepLink() != null)
            sb.append("deepLink: " + getDeepLink() + ",");
        if (getS3DeepLink() != null)
            sb.append("s3DeepLink: " + getS3DeepLink() + ",");
        if (getCloudWatchLogsArn() != null)
            sb.append("cloudWatchLogsArn: " + getCloudWatchLogsArn() + ",");
        if (getS3LogsArn() != null)
            sb.append("s3LogsArn: " + getS3LogsArn() + ",");
        if (getCloudWatchLogs() != null)
            sb.append("cloudWatchLogs: " + getCloudWatchLogs() + ",");
        if (getS3Logs() != null)
            sb.append("s3Logs: " + getS3Logs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getDeepLink() == null) ? 0 : getDeepLink().hashCode());
        hashCode = prime * hashCode + ((getS3DeepLink() == null) ? 0 : getS3DeepLink().hashCode());
        hashCode = prime * hashCode
                + ((getCloudWatchLogsArn() == null) ? 0 : getCloudWatchLogsArn().hashCode());
        hashCode = prime * hashCode + ((getS3LogsArn() == null) ? 0 : getS3LogsArn().hashCode());
        hashCode = prime * hashCode
                + ((getCloudWatchLogs() == null) ? 0 : getCloudWatchLogs().hashCode());
        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogsLocation == false)
            return false;
        LogsLocation other = (LogsLocation) obj;

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
        if (other.getDeepLink() == null ^ this.getDeepLink() == null)
            return false;
        if (other.getDeepLink() != null && other.getDeepLink().equals(this.getDeepLink()) == false)
            return false;
        if (other.getS3DeepLink() == null ^ this.getS3DeepLink() == null)
            return false;
        if (other.getS3DeepLink() != null
                && other.getS3DeepLink().equals(this.getS3DeepLink()) == false)
            return false;
        if (other.getCloudWatchLogsArn() == null ^ this.getCloudWatchLogsArn() == null)
            return false;
        if (other.getCloudWatchLogsArn() != null
                && other.getCloudWatchLogsArn().equals(this.getCloudWatchLogsArn()) == false)
            return false;
        if (other.getS3LogsArn() == null ^ this.getS3LogsArn() == null)
            return false;
        if (other.getS3LogsArn() != null
                && other.getS3LogsArn().equals(this.getS3LogsArn()) == false)
            return false;
        if (other.getCloudWatchLogs() == null ^ this.getCloudWatchLogs() == null)
            return false;
        if (other.getCloudWatchLogs() != null
                && other.getCloudWatchLogs().equals(this.getCloudWatchLogs()) == false)
            return false;
        if (other.getS3Logs() == null ^ this.getS3Logs() == null)
            return false;
        if (other.getS3Logs() != null && other.getS3Logs().equals(this.getS3Logs()) == false)
            return false;
        return true;
    }
}
