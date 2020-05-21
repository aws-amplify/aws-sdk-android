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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a canary. Canaries are scripts that monitor your endpoints and APIs
 * from the outside-in. Canaries help you check the availability and latency of
 * your web services and troubleshoot anomalies by investigating load time data,
 * screenshots of the UI, logs, and metrics. You can set up a canary to run
 * continuously or just once.
 * </p>
 * <p>
 * Do not use <code>CreateCanary</code> to modify an existing canary. Use <a
 * href=
 * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_UpdateCanary.html"
 * >UpdateCanary</a> instead.
 * </p>
 * <p>
 * To create canaries, you must have the
 * <code>CloudWatchSyntheticsFullAccess</code> policy. If you are creating a new
 * IAM role for the canary, you also need the the <code>iam:CreateRole</code>,
 * <code>iam:CreatePolicy</code> and <code>iam:AttachRolePolicy</code>
 * permissions. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles"
 * >Necessary Roles and Permissions</a>.
 * </p>
 * <p>
 * Do not include secrets or proprietary information in your canary names. The
 * canary name makes up part of the Amazon Resource Name (ARN) for the canary,
 * and the ARN is included in outbound calls over the internet. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
 * >Security Considerations for Synthetics Canaries</a>.
 * </p>
 */
public class CreateCanaryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that
     * distinguishes it from other canaries in your account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names.
     * The canary name makes up part of the canary ARN, and the ARN is included
     * in outbound calls over the internet. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     * >Security Considerations for Synthetics Canaries</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * A structure that includes the entry point from which the canary should
     * start running your script. If the script is stored in an S3 bucket, the
     * bucket name, key, and version are also included.
     * </p>
     */
    private CanaryCodeInput code;

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test
     * runs of this canary. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String artifactS3Location;

    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must
     * already exist, and must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * </ul>
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
     * run and when these test runs are to stop.
     * </p>
     */
    private CanaryScheduleInput schedule;

    /**
     * <p>
     * A structure that contains the configuration for individual canary runs,
     * such as timeout value.
     * </p>
     */
    private CanaryRunConfigInput runConfig;

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * If you omit this field, the default of 31 days is used. The valid range
     * is 1 to 455 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer successRetentionPeriodInDays;

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If
     * you omit this field, the default of 31 days is used. The valid range is 1
     * to 455 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer failureRetentionPeriodInDays;

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
     * information about the subnet and security groups of the VPC endpoint. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     */
    private VpcConfigInput vpcConfig;

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate
     * as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only the resources that have certain tag values.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that
     * distinguishes it from other canaries in your account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names.
     * The canary name makes up part of the canary ARN, and the ARN is included
     * in outbound calls over the internet. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     * >Security Considerations for Synthetics Canaries</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @return <p>
     *         The name for this canary. Be sure to give it a descriptive name
     *         that distinguishes it from other canaries in your account.
     *         </p>
     *         <p>
     *         Do not include secrets or proprietary information in your canary
     *         names. The canary name makes up part of the canary ARN, and the
     *         ARN is included in outbound calls over the internet. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     *         >Security Considerations for Synthetics Canaries</a>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that
     * distinguishes it from other canaries in your account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names.
     * The canary name makes up part of the canary ARN, and the ARN is included
     * in outbound calls over the internet. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     * >Security Considerations for Synthetics Canaries</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param name <p>
     *            The name for this canary. Be sure to give it a descriptive
     *            name that distinguishes it from other canaries in your
     *            account.
     *            </p>
     *            <p>
     *            Do not include secrets or proprietary information in your
     *            canary names. The canary name makes up part of the canary ARN,
     *            and the ARN is included in outbound calls over the internet.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     *            >Security Considerations for Synthetics Canaries</a>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for this canary. Be sure to give it a descriptive name that
     * distinguishes it from other canaries in your account.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names.
     * The canary name makes up part of the canary ARN, and the ARN is included
     * in outbound calls over the internet. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     * >Security Considerations for Synthetics Canaries</a>.
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
     *            The name for this canary. Be sure to give it a descriptive
     *            name that distinguishes it from other canaries in your
     *            account.
     *            </p>
     *            <p>
     *            Do not include secrets or proprietary information in your
     *            canary names. The canary name makes up part of the canary ARN,
     *            and the ARN is included in outbound calls over the internet.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     *            >Security Considerations for Synthetics Canaries</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A structure that includes the entry point from which the canary should
     * start running your script. If the script is stored in an S3 bucket, the
     * bucket name, key, and version are also included.
     * </p>
     *
     * @return <p>
     *         A structure that includes the entry point from which the canary
     *         should start running your script. If the script is stored in an
     *         S3 bucket, the bucket name, key, and version are also included.
     *         </p>
     */
    public CanaryCodeInput getCode() {
        return code;
    }

    /**
     * <p>
     * A structure that includes the entry point from which the canary should
     * start running your script. If the script is stored in an S3 bucket, the
     * bucket name, key, and version are also included.
     * </p>
     *
     * @param code <p>
     *            A structure that includes the entry point from which the
     *            canary should start running your script. If the script is
     *            stored in an S3 bucket, the bucket name, key, and version are
     *            also included.
     *            </p>
     */
    public void setCode(CanaryCodeInput code) {
        this.code = code;
    }

    /**
     * <p>
     * A structure that includes the entry point from which the canary should
     * start running your script. If the script is stored in an S3 bucket, the
     * bucket name, key, and version are also included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            A structure that includes the entry point from which the
     *            canary should start running your script. If the script is
     *            stored in an S3 bucket, the bucket name, key, and version are
     *            also included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withCode(CanaryCodeInput code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test
     * runs of this canary. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The location in Amazon S3 where Synthetics stores artifacts from
     *         the test runs of this canary. Artifacts include the log file,
     *         screenshots, and HAR files.
     *         </p>
     */
    public String getArtifactS3Location() {
        return artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test
     * runs of this canary. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param artifactS3Location <p>
     *            The location in Amazon S3 where Synthetics stores artifacts
     *            from the test runs of this canary. Artifacts include the log
     *            file, screenshots, and HAR files.
     *            </p>
     */
    public void setArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
    }

    /**
     * <p>
     * The location in Amazon S3 where Synthetics stores artifacts from the test
     * runs of this canary. Artifacts include the log file, screenshots, and HAR
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
     *            from the test runs of this canary. Artifacts include the log
     *            file, screenshots, and HAR files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must
     * already exist, and must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @return <p>
     *         The ARN of the IAM role to be used to run the canary. This role
     *         must already exist, and must include
     *         <code>lambda.amazonaws.com</code> as a principal in the trust
     *         policy. The role must also have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3:PutObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetBucketLocation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:ListAllMyBuckets</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cloudwatch:PutMetricData</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logs:CreateLogGroup</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logs:CreateLogStream</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logs:CreateLogStream</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must
     * already exist, and must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):[A-Za
     * -z0-9][A-Za-z0-
     * 9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}
     * $<br/>
     *
     * @param executionRoleArn <p>
     *            The ARN of the IAM role to be used to run the canary. This
     *            role must already exist, and must include
     *            <code>lambda.amazonaws.com</code> as a principal in the trust
     *            policy. The role must also have the following permissions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3:PutObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketLocation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:ListAllMyBuckets</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cloudwatch:PutMetricData</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>logs:CreateLogGroup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>logs:CreateLogStream</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>logs:CreateLogStream</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used to run the canary. This role must
     * already exist, and must include <code>lambda.amazonaws.com</code> as a
     * principal in the trust policy. The role must also have the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListAllMyBuckets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:PutMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:CreateLogStream</code>
     * </p>
     * </li>
     * </ul>
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
     *            The ARN of the IAM role to be used to run the canary. This
     *            role must already exist, and must include
     *            <code>lambda.amazonaws.com</code> as a principal in the trust
     *            policy. The role must also have the following permissions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3:PutObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketLocation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:ListAllMyBuckets</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cloudwatch:PutMetricData</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>logs:CreateLogGroup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>logs:CreateLogStream</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>logs:CreateLogStream</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to
     * run and when these test runs are to stop.
     * </p>
     *
     * @return <p>
     *         A structure that contains information about how often the canary
     *         is to run and when these test runs are to stop.
     *         </p>
     */
    public CanaryScheduleInput getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to
     * run and when these test runs are to stop.
     * </p>
     *
     * @param schedule <p>
     *            A structure that contains information about how often the
     *            canary is to run and when these test runs are to stop.
     *            </p>
     */
    public void setSchedule(CanaryScheduleInput schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A structure that contains information about how often the canary is to
     * run and when these test runs are to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            A structure that contains information about how often the
     *            canary is to run and when these test runs are to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withSchedule(CanaryScheduleInput schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration for individual canary runs,
     * such as timeout value.
     * </p>
     *
     * @return <p>
     *         A structure that contains the configuration for individual canary
     *         runs, such as timeout value.
     *         </p>
     */
    public CanaryRunConfigInput getRunConfig() {
        return runConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration for individual canary runs,
     * such as timeout value.
     * </p>
     *
     * @param runConfig <p>
     *            A structure that contains the configuration for individual
     *            canary runs, such as timeout value.
     *            </p>
     */
    public void setRunConfig(CanaryRunConfigInput runConfig) {
        this.runConfig = runConfig;
    }

    /**
     * <p>
     * A structure that contains the configuration for individual canary runs,
     * such as timeout value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runConfig <p>
     *            A structure that contains the configuration for individual
     *            canary runs, such as timeout value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withRunConfig(CanaryRunConfigInput runConfig) {
        this.runConfig = runConfig;
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * If you omit this field, the default of 31 days is used. The valid range
     * is 1 to 455 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The number of days to retain data about successful runs of this
     *         canary. If you omit this field, the default of 31 days is used.
     *         The valid range is 1 to 455 days.
     *         </p>
     */
    public Integer getSuccessRetentionPeriodInDays() {
        return successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * If you omit this field, the default of 31 days is used. The valid range
     * is 1 to 455 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param successRetentionPeriodInDays <p>
     *            The number of days to retain data about successful runs of
     *            this canary. If you omit this field, the default of 31 days is
     *            used. The valid range is 1 to 455 days.
     *            </p>
     */
    public void setSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        this.successRetentionPeriodInDays = successRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about successful runs of this canary.
     * If you omit this field, the default of 31 days is used. The valid range
     * is 1 to 455 days.
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
     *            this canary. If you omit this field, the default of 31 days is
     *            used. The valid range is 1 to 455 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withSuccessRetentionPeriodInDays(Integer successRetentionPeriodInDays) {
        this.successRetentionPeriodInDays = successRetentionPeriodInDays;
        return this;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If
     * you omit this field, the default of 31 days is used. The valid range is 1
     * to 455 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The number of days to retain data about failed runs of this
     *         canary. If you omit this field, the default of 31 days is used.
     *         The valid range is 1 to 455 days.
     *         </p>
     */
    public Integer getFailureRetentionPeriodInDays() {
        return failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If
     * you omit this field, the default of 31 days is used. The valid range is 1
     * to 455 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param failureRetentionPeriodInDays <p>
     *            The number of days to retain data about failed runs of this
     *            canary. If you omit this field, the default of 31 days is
     *            used. The valid range is 1 to 455 days.
     *            </p>
     */
    public void setFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        this.failureRetentionPeriodInDays = failureRetentionPeriodInDays;
    }

    /**
     * <p>
     * The number of days to retain data about failed runs of this canary. If
     * you omit this field, the default of 31 days is used. The valid range is 1
     * to 455 days.
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
     *            canary. If you omit this field, the default of 31 days is
     *            used. The valid range is 1 to 455 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withFailureRetentionPeriodInDays(Integer failureRetentionPeriodInDays) {
        this.failureRetentionPeriodInDays = failureRetentionPeriodInDays;
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
    public CreateCanaryRequest withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     *
     * @return <p>
     *         If this canary is to test an endpoint in a VPC, this structure
     *         contains information about the subnet and security groups of the
     *         VPC endpoint. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     *         > Running a Canary in a VPC</a>.
     *         </p>
     */
    public VpcConfigInput getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            If this canary is to test an endpoint in a VPC, this structure
     *            contains information about the subnet and security groups of
     *            the VPC endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     *            > Running a Canary in a VPC</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfigInput vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     * > Running a Canary in a VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            If this canary is to test an endpoint in a VPC, this structure
     *            contains information about the subnet and security groups of
     *            the VPC endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html"
     *            > Running a Canary in a VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withVpcConfig(VpcConfigInput vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate
     * as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only the resources that have certain tag values.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs to associate with the canary. You can
     *         associate as many as 50 tags with a canary.
     *         </p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can
     *         also use them to scope user permissions, by granting a user
     *         permission to access or change only the resources that have
     *         certain tag values.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate
     * as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only the resources that have certain tag values.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs to associate with the canary. You
     *            can associate as many as 50 tags with a canary.
     *            </p>
     *            <p>
     *            Tags can help you organize and categorize your resources. You
     *            can also use them to scope user permissions, by granting a
     *            user permission to access or change only the resources that
     *            have certain tag values.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate
     * as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only the resources that have certain tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs to associate with the canary. You
     *            can associate as many as 50 tags with a canary.
     *            </p>
     *            <p>
     *            Tags can help you organize and categorize your resources. You
     *            can also use them to scope user permissions, by granting a
     *            user permission to access or change only the resources that
     *            have certain tag values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCanaryRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the canary. You can associate
     * as many as 50 tags with a canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only the resources that have certain tag values.
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
    public CreateCanaryRequest addTagsEntry(String key, String value) {
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
    public CreateCanaryRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getArtifactS3Location() != null)
            sb.append("ArtifactS3Location: " + getArtifactS3Location() + ",");
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode
                + ((getArtifactS3Location() == null) ? 0 : getArtifactS3Location().hashCode());
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

        if (obj instanceof CreateCanaryRequest == false)
            return false;
        CreateCanaryRequest other = (CreateCanaryRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getArtifactS3Location() == null ^ this.getArtifactS3Location() == null)
            return false;
        if (other.getArtifactS3Location() != null
                && other.getArtifactS3Location().equals(this.getArtifactS3Location()) == false)
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
