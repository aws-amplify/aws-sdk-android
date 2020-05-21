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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * This structure contains all information about one canary in your account.
 * </p>
 */
public class Canary implements Serializable {
    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * This structure contains information about the canary's Lambda handler and
     * where its code is stored by CloudWatch Synthetics.
     * </p>
     */
    private CanaryCodeOutput code;

    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     */
    private String executionRoleArn;

    /**
     * <p>
     * A structure that contains information about how often the canary is to
     * run, and when these runs are to stop.
     * </p>
     */
    private CanaryScheduleOutput schedule;

    /**
     * <p>
     * A structure that contains information for a canary run.
     * </p>
     */
    private CanaryRunConfigOutput runConfig;

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer successRetentionPeriodInDays;

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer failureRetentionPeriodInDays;

    /**
     * <p>
     * A structure that contains information about the canary's status.
     * </p>
     */
    private CanaryStatus status;

    /**
     * <p>
     * A structure that contains information about when the canary was created,
     * modified, and most recently run.
     * </p>
     */
    private CanaryTimeline timeline;

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs
     * of this canary. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String artifactS3Location;

    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For
     * more information about Lambda ARN format, see <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html"
     * >Resources and Conditions for Lambda Actions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     */
    private String engineArn;

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>. For more information about runtime
     * versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     * > Canary Runtime Versions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String runtimeVersion;

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnets and security groups of the VPC endpoint.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     */
    private VpcConfigOutput vpcConfig;

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The unique ID of this canary.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The unique ID of this canary.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of this canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The unique ID of this canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @return <p>
     *         The name of the canary.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param name <p>
     *            The name of the canary.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param name <p>
     *            The name of the canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * This structure contains information about the canary's Lambda handler and
     * where its code is stored by CloudWatch Synthetics.
     * </p>
     *
     * @return <p>
     *         This structure contains information about the canary's Lambda
     *         handler and where its code is stored by CloudWatch Synthetics.
     *         </p>
     */
    public CanaryCodeOutput getCode() {
        return code;
    }

    /**
     * <p>
     * This structure contains information about the canary's Lambda handler and
     * where its code is stored by CloudWatch Synthetics.
     * </p>
     *
     * @param code <p>
     *            This structure contains information about the canary's Lambda
     *            handler and where its code is stored by CloudWatch Synthetics.
     *            </p>
     */
    public void setCode(CanaryCodeOutput code) {
        this.code = code;
    }

    /**
     * <p>
     * This structure contains information about the canary's Lambda handler and
     * where its code is stored by CloudWatch Synthetics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            This structure contains information about the canary's Lambda
     *            handler and where its code is stored by CloudWatch Synthetics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withCode(CanaryCodeOutput code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @return <p>
     *         The ARN of the IAM role used to run the canary. This role must
     *         include <code>lambda.amazonaws.com</code> as a principal in the
     *         trust policy.
     *         </p>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @param executionRoleArn <p>
     *            The ARN of the IAM role used to run the canary. This role must
     *            include <code>lambda.amazonaws.com</code> as a principal in
     *            the trust policy.
     *            </p>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to run the canary. This role must include
     * <code>lambda.amazonaws.com</code> as a principal in the trust policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @param executionRoleArn <p>
     *            The ARN of the IAM role used to run the canary. This role must
     *            include <code>lambda.amazonaws.com</code> as a principal in
     *            the trust policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to
     * run, and when these runs are to stop.
     * </p>
     *
     * @return <p>
     *         A structure that contains information about how often the canary
     *         is to run, and when these runs are to stop.
     *         </p>
     */
    public CanaryScheduleOutput getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to
     * run, and when these runs are to stop.
     * </p>
     *
     * @param schedule <p>
     *            A structure that contains information about how often the
     *            canary is to run, and when these runs are to stop.
     *            </p>
     */
    public void setSchedule(CanaryScheduleOutput schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to
     * run, and when these runs are to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            A structure that contains information about how often the
     *            canary is to run, and when these runs are to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withSchedule(CanaryScheduleOutput schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * A structure that contains information for a canary run.
     * </p>
     *
     * @return <p>
     *         A structure that contains information for a canary run.
     *         </p>
     */
    public CanaryRunConfigOutput getRunConfig() {
        return runConfig;
    }

    /**
     * <p>
     * A structure that contains information for a canary run.
     * </p>
     *
     * @param runConfig <p>
     *            A structure that contains information for a canary run.
     *            </p>
     */
    public void setRunConfig(CanaryRunConfigOutput runConfig) {
        this.runConfig = runConfig;
    }

    /**
     * <p>
     * A structure that contains information for a canary run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runConfig <p>
     *            A structure that contains information for a canary run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withRunConfig(CanaryRunConfigOutput runConfig) {
        this.runConfig = runConfig;
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The number of days to retain data about successful runs of this
     *         canary.
     *         </p>
     */
    public Integer getSuccessRetentionPeriodInDays() {
        return successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param successRetentionPeriodInDays <p>
     *            The number of days to retain data about successful runs of
     *            this canary.
     *            </p>
     */
    public void setSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        this.successRetentionPeriodInDays = successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param successRetentionPeriodInDays <p>
     *            The number of days to retain data about successful runs of
     *            this canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        this.successRetentionPeriodInDays = successRetentionPeriodInDays;
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The number of days to retain data about failed runs of this
     *         canary.
     *         </p>
     */
    public Integer getFailureRetentionPeriodInDays() {
        return failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param failureRetentionPeriodInDays <p>
     *            The number of days to retain data about failed runs of this
     *            canary.
     *            </p>
     */
    public void setFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        this.failureRetentionPeriodInDays = failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param failureRetentionPeriodInDays <p>
     *            The number of days to retain data about failed runs of this
     *            canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        this.failureRetentionPeriodInDays = failureRetentionPeriodInDays;
        return this;
    }

    /**
     * <p>
     * A structure that contains information about the canary's status.
     * </p>
     *
     * @return <p>
     *         A structure that contains information about the canary's status.
     *         </p>
     */
    public CanaryStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * A structure that contains information about the canary's status.
     * </p>
     *
     * @param status <p>
     *            A structure that contains information about the canary's
     *            status.
     *            </p>
     */
    public void setStatus(CanaryStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * A structure that contains information about the canary's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            A structure that contains information about the canary's
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withStatus(CanaryStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A structure that contains information about when the canary was created,
     * modified, and most recently run.
     * </p>
     *
     * @return <p>
     *         A structure that contains information about when the canary was
     *         created, modified, and most recently run.
     *         </p>
     */
    public CanaryTimeline getTimeline() {
        return timeline;
    }

    /**
     * <p>
     * A structure that contains information about when the canary was created,
     * modified, and most recently run.
     * </p>
     *
     * @param timeline <p>
     *            A structure that contains information about when the canary
     *            was created, modified, and most recently run.
     *            </p>
     */
    public void setTimeline(CanaryTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * A structure that contains information about when the canary was created,
     * modified, and most recently run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeline <p>
     *            A structure that contains information about when the canary
     *            was created, modified, and most recently run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withTimeline(CanaryTimeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs
     * of this canary. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The location in Amazon S3 where Synthetics stores artifacts from
     *         the runs of this canary. Artifacts include the log file,
     *         screenshots, and HAR files.
     *         </p>
     */
    public String getArtifactS3Location() {
        return artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs
     * of this canary. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param artifactS3Location <p>
     *            The location in Amazon S3 where Synthetics stores artifacts
     *            from the runs of this canary. Artifacts include the log file,
     *            screenshots, and HAR files.
     *            </p>
     */
    public void setArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the runs
     * of this canary. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param artifactS3Location <p>
     *            The location in Amazon S3 where Synthetics stores artifacts
     *            from the runs of this canary. Artifacts include the log file,
     *            screenshots, and HAR files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
        return this;
    }

    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For
     * more information about Lambda ARN format, see <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html"
     * >Resources and Conditions for Lambda Actions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @return <p>
     *         The ARN of the Lambda function that is used as your canary's
     *         engine. For more information about Lambda ARN format, see <a
     *         href=
     *         "https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html"
     *         >Resources and Conditions for Lambda Actions</a>.
     *         </p>
     */
    public String getEngineArn() {
        return engineArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For
     * more information about Lambda ARN format, see <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html"
     * >Resources and Conditions for Lambda Actions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @param engineArn <p>
     *            The ARN of the Lambda function that is used as your canary's
     *            engine. For more information about Lambda ARN format, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html"
     *            >Resources and Conditions for Lambda Actions</a>.
     *            </p>
     */
    public void setEngineArn(String engineArn) {
        this.engineArn = engineArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function that is used as your canary's engine. For
     * more information about Lambda ARN format, see <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html"
     * >Resources and Conditions for Lambda Actions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @param engineArn <p>
     *            The ARN of the Lambda function that is used as your canary's
     *            engine. For more information about Lambda ARN format, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/lambda-api-permissions-ref.html"
     *            >Resources and Conditions for Lambda Actions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withEngineArn(String engineArn) {
        this.engineArn = engineArn;
        return this;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>. For more information about runtime
     * versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     * > Canary Runtime Versions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Specifies the runtime version to use for the canary. Currently,
     *         the only valid value is <code>syn-1.0</code>. For more
     *         information about runtime versions, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *         > Canary Runtime Versions</a>.
     *         </p>
     */
    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>. For more information about runtime
     * versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     * > Canary Runtime Versions</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param runtimeVersion <p>
     *            Specifies the runtime version to use for the canary.
     *            Currently, the only valid value is <code>syn-1.0</code>. For
     *            more information about runtime versions, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *            > Canary Runtime Versions</a>.
     *            </p>
     */
    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>. For more information about runtime
     * versions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     * > Canary Runtime Versions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param runtimeVersion <p>
     *            Specifies the runtime version to use for the canary.
     *            Currently, the only valid value is <code>syn-1.0</code>. For
     *            more information about runtime versions, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     *            > Canary Runtime Versions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnets and security groups of the VPC endpoint.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     *
     * @return <p>
     *         If this canary is to test an endpoint in a VPC, this structure
     *         contains information about the subnets and security groups of the
     *         VPC endpoint. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     *         > Running a Canary in a VPC</a>.
     *         </p>
     */
    public VpcConfigOutput getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnets and security groups of the VPC endpoint.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            If this canary is to test an endpoint in a VPC, this structure
     *            contains information about the subnets and security groups of
     *            the VPC endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     *            > Running a Canary in a VPC</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfigOutput vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnets and security groups of the VPC endpoint.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            If this canary is to test an endpoint in a VPC, this structure
     *            contains information about the subnets and security groups of
     *            the VPC endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     *            > Running a Canary in a VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withVpcConfig(VpcConfigOutput vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     *
     * @return <p>
     *         The list of key-value pairs that are associated with the canary.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     *
     * @param tags <p>
     *            The list of key-value pairs that are associated with the
     *            canary.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of key-value pairs that are associated with the
     *            canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs that are associated with the canary.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Canary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Canary clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: " + getExecutionRoleArn() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getRunConfig() != null)
            sb.append("RunConfig: " + getRunConfig() + ",");
        if (getSuccessRetentionPeriodInDays() != null)
            sb.append("SuccessRetentionPeriodInDays: " + getSuccessRetentionPeriodInDays() + ",");
        if (getFailureRetentionPeriodInDays() != null)
            sb.append("FailureRetentionPeriodInDays: " + getFailureRetentionPeriodInDays() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTimeline() != null)
            sb.append("Timeline: " + getTimeline() + ",");
        if (getArtifactS3Location() != null)
            sb.append("ArtifactS3Location: " + getArtifactS3Location() + ",");
        if (getEngineArn() != null)
            sb.append("EngineArn: " + getEngineArn() + ",");
        if (getRuntimeVersion() != null)
            sb.append("RuntimeVersion: " + getRuntimeVersion() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRunConfig() == null) ? 0 : getRunConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getSuccessRetentionPeriodInDays() == null) ? 0
                        : getSuccessRetentionPeriodInDays().hashCode());
        hashCode = prime
                * hashCode
                + ((getFailureRetentionPeriodInDays() == null) ? 0
                        : getFailureRetentionPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        hashCode = prime * hashCode
                + ((getArtifactS3Location() == null) ? 0 : getArtifactS3Location().hashCode());
        hashCode = prime * hashCode + ((getEngineArn() == null) ? 0 : getEngineArn().hashCode());
        hashCode = prime * hashCode
                + ((getRuntimeVersion() == null) ? 0 : getRuntimeVersion().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Canary == false)
            return false;
        Canary other = (Canary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getRunConfig() == null ^ this.getRunConfig() == null)
            return false;
        if (other.getRunConfig() != null
                && other.getRunConfig().equals(this.getRunConfig()) == false)
            return false;
        if (other.getSuccessRetentionPeriodInDays() == null
                ^ this.getSuccessRetentionPeriodInDays() == null)
            return false;
        if (other.getSuccessRetentionPeriodInDays() != null
                && other.getSuccessRetentionPeriodInDays().equals(
                        this.getSuccessRetentionPeriodInDays()) == false)
            return false;
        if (other.getFailureRetentionPeriodInDays() == null
                ^ this.getFailureRetentionPeriodInDays() == null)
            return false;
        if (other.getFailureRetentionPeriodInDays() != null
                && other.getFailureRetentionPeriodInDays().equals(
                        this.getFailureRetentionPeriodInDays()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        if (other.getArtifactS3Location() == null ^ this.getArtifactS3Location() == null)
            return false;
        if (other.getArtifactS3Location() != null
                && other.getArtifactS3Location().equals(this.getArtifactS3Location()) == false)
            return false;
        if (other.getEngineArn() == null ^ this.getEngineArn() == null)
            return false;
        if (other.getEngineArn() != null
                && other.getEngineArn().equals(this.getEngineArn()) == false)
            return false;
        if (other.getRuntimeVersion() == null ^ this.getRuntimeVersion() == null)
            return false;
        if (other.getRuntimeVersion() != null
                && other.getRuntimeVersion().equals(this.getRuntimeVersion()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
