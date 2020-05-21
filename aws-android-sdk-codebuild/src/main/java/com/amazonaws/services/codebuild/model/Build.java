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
 * Information about a build.
 * </p>
 */
public class Build implements Serializable {
    /**
     * <p>
     * The unique ID for the build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String arn;

    /**
     * <p>
     * The number of the build. For each project, the <code>buildNumber</code>
     * of its first build is <code>1</code>. The <code>buildNumber</code> of
     * each subsequent build is incremented by <code>1</code>. If a build is
     * deleted, the <code>buildNumber</code> of other builds does not change.
     * </p>
     */
    private Long buildNumber;

    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The current build phase.
     * </p>
     */
    private String currentPhase;

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     */
    private String buildStatus;

    /**
     * <p>
     * Any version identifier for the version of the source code to be built. If
     * <code>sourceVersion</code> is specified at the project level, then this
     * <code>sourceVersion</code> (at the build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String sourceVersion;

    /**
     * <p>
     * An identifier for the version of this build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String resolvedSourceVersion;

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String projectName;

    /**
     * <p>
     * Information about all previous build phases that are complete and
     * information about any current build phase that is not yet complete.
     * </p>
     */
    private java.util.List<BuildPhase> phases;

    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     */
    private ProjectSource source;

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     */
    private java.util.List<ProjectSource> secondarySources;

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each
     * <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ProjectSourceVersion> secondarySourceVersions;

    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     */
    private BuildArtifacts artifacts;

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     */
    private java.util.List<BuildArtifacts> secondaryArtifacts;

    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     */
    private ProjectCache cache;

    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     */
    private ProjectEnvironment environment;

    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String serviceRole;

    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     */
    private LogsLocation logs;

    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this
     * build if it does not get marked as completed.
     * </p>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     */
    private Integer queuedTimeoutInMinutes;

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     */
    private Boolean buildComplete;

    /**
     * <p>
     * The entity that started the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build,
     * the user's name (for example, <code>MyUserName</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string
     * <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String initiator;

    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you
     * provide this parameter that identifies the VPC ID and the list of
     * security group IDs and subnet IDs. The security groups and subnets must
     * belong to the same VPC. You must provide at least one security group and
     * one subnet ID.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Describes a network interface.
     * </p>
     */
    private NetworkInterface networkInterface;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be
     * used for encrypting the build output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts
     * if your service role has permission to that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String encryptionKey;

    /**
     * <p>
     * A list of exported environment variables for this build.
     * </p>
     */
    private java.util.List<ExportedEnvironmentVariable> exportedEnvironmentVariables;

    /**
     * <p>
     * An array of the ARNs associated with this build's reports.
     * </p>
     */
    private java.util.List<String> reportArns;

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for a
     * CodeBuild build project. A <code>ProjectFileSystemLocation</code> object
     * specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code>
     * of a file system created using Amazon Elastic File System.
     * </p>
     */
    private java.util.List<ProjectFileSystemLocation> fileSystemLocations;

    /**
     * <p>
     * The unique ID for the build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The unique ID for the build.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique ID for the build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param id <p>
     *            The unique ID for the build.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param id <p>
     *            The unique ID for the build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the build.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the build.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The number of the build. For each project, the <code>buildNumber</code>
     * of its first build is <code>1</code>. The <code>buildNumber</code> of
     * each subsequent build is incremented by <code>1</code>. If a build is
     * deleted, the <code>buildNumber</code> of other builds does not change.
     * </p>
     *
     * @return <p>
     *         The number of the build. For each project, the
     *         <code>buildNumber</code> of its first build is <code>1</code>.
     *         The <code>buildNumber</code> of each subsequent build is
     *         incremented by <code>1</code>. If a build is deleted, the
     *         <code>buildNumber</code> of other builds does not change.
     *         </p>
     */
    public Long getBuildNumber() {
        return buildNumber;
    }

    /**
     * <p>
     * The number of the build. For each project, the <code>buildNumber</code>
     * of its first build is <code>1</code>. The <code>buildNumber</code> of
     * each subsequent build is incremented by <code>1</code>. If a build is
     * deleted, the <code>buildNumber</code> of other builds does not change.
     * </p>
     *
     * @param buildNumber <p>
     *            The number of the build. For each project, the
     *            <code>buildNumber</code> of its first build is <code>1</code>.
     *            The <code>buildNumber</code> of each subsequent build is
     *            incremented by <code>1</code>. If a build is deleted, the
     *            <code>buildNumber</code> of other builds does not change.
     *            </p>
     */
    public void setBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
     * <p>
     * The number of the build. For each project, the <code>buildNumber</code>
     * of its first build is <code>1</code>. The <code>buildNumber</code> of
     * each subsequent build is incremented by <code>1</code>. If a build is
     * deleted, the <code>buildNumber</code> of other builds does not change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildNumber <p>
     *            The number of the build. For each project, the
     *            <code>buildNumber</code> of its first build is <code>1</code>.
     *            The <code>buildNumber</code> of each subsequent build is
     *            incremented by <code>1</code>. If a build is deleted, the
     *            <code>buildNumber</code> of other builds does not change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }

    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     *
     * @return <p>
     *         When the build process started, expressed in Unix time format.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     *
     * @param startTime <p>
     *            When the build process started, expressed in Unix time format.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            When the build process started, expressed in Unix time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     *
     * @return <p>
     *         When the build process ended, expressed in Unix time format.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     *
     * @param endTime <p>
     *            When the build process ended, expressed in Unix time format.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            When the build process ended, expressed in Unix time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The current build phase.
     * </p>
     *
     * @return <p>
     *         The current build phase.
     *         </p>
     */
    public String getCurrentPhase() {
        return currentPhase;
    }

    /**
     * <p>
     * The current build phase.
     * </p>
     *
     * @param currentPhase <p>
     *            The current build phase.
     *            </p>
     */
    public void setCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
    }

    /**
     * <p>
     * The current build phase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentPhase <p>
     *            The current build phase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
        return this;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @return <p>
     *         The current status of the build. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The build failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAULT</code>: The build faulted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The build is still in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>: The build stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The build succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMED_OUT</code>: The build timed out.
     *         </p>
     *         </li>
     *         </ul>
     * @see StatusType
     */
    public String getBuildStatus() {
        return buildStatus;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param buildStatus <p>
     *            The current status of the build. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build is still in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @see StatusType
     */
    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param buildStatus <p>
     *            The current status of the build. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build is still in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public Build withBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param buildStatus <p>
     *            The current status of the build. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build is still in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @see StatusType
     */
    public void setBuildStatus(StatusType buildStatus) {
        this.buildStatus = buildStatus.toString();
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param buildStatus <p>
     *            The current status of the build. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build is still in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public Build withBuildStatus(StatusType buildStatus) {
        this.buildStatus = buildStatus.toString();
        return this;
    }

    /**
     * <p>
     * Any version identifier for the version of the source code to be built. If
     * <code>sourceVersion</code> is specified at the project level, then this
     * <code>sourceVersion</code> (at the build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Any version identifier for the version of the source code to be
     *         built. If <code>sourceVersion</code> is specified at the project
     *         level, then this <code>sourceVersion</code> (at the build level)
     *         takes precedence.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     *         >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild
     *         User Guide</i>.
     *         </p>
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     * <p>
     * Any version identifier for the version of the source code to be built. If
     * <code>sourceVersion</code> is specified at the project level, then this
     * <code>sourceVersion</code> (at the build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param sourceVersion <p>
     *            Any version identifier for the version of the source code to
     *            be built. If <code>sourceVersion</code> is specified at the
     *            project level, then this <code>sourceVersion</code> (at the
     *            build level) takes precedence.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     *            >Source Version Sample with CodeBuild</a> in the <i>AWS
     *            CodeBuild User Guide</i>.
     *            </p>
     */
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * Any version identifier for the version of the source code to be built. If
     * <code>sourceVersion</code> is specified at the project level, then this
     * <code>sourceVersion</code> (at the build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param sourceVersion <p>
     *            Any version identifier for the version of the source code to
     *            be built. If <code>sourceVersion</code> is specified at the
     *            project level, then this <code>sourceVersion</code> (at the
     *            build level) takes precedence.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     *            >Source Version Sample with CodeBuild</a> in the <i>AWS
     *            CodeBuild User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    /**
     * <p>
     * An identifier for the version of this build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         An identifier for the version of this build's source code.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the
     *         commit ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For AWS CodePipeline, the source revision provided by AWS
     *         CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon Simple Storage Service (Amazon S3), this does not
     *         apply.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResolvedSourceVersion() {
        return resolvedSourceVersion;
    }

    /**
     * <p>
     * An identifier for the version of this build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param resolvedSourceVersion <p>
     *            An identifier for the version of this build's source code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket,
     *            the commit ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For AWS CodePipeline, the source revision provided by AWS
     *            CodePipeline.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Simple Storage Service (Amazon S3), this does not
     *            apply.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResolvedSourceVersion(String resolvedSourceVersion) {
        this.resolvedSourceVersion = resolvedSourceVersion;
    }

    /**
     * <p>
     * An identifier for the version of this build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
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
     * @param resolvedSourceVersion <p>
     *            An identifier for the version of this build's source code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket,
     *            the commit ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For AWS CodePipeline, the source revision provided by AWS
     *            CodePipeline.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Simple Storage Service (Amazon S3), this does not
     *            apply.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withResolvedSourceVersion(String resolvedSourceVersion) {
        this.resolvedSourceVersion = resolvedSourceVersion;
        return this;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the AWS CodeBuild project.
     *         </p>
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild project.
     *            </p>
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and
     * information about any current build phase that is not yet complete.
     * </p>
     *
     * @return <p>
     *         Information about all previous build phases that are complete and
     *         information about any current build phase that is not yet
     *         complete.
     *         </p>
     */
    public java.util.List<BuildPhase> getPhases() {
        return phases;
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and
     * information about any current build phase that is not yet complete.
     * </p>
     *
     * @param phases <p>
     *            Information about all previous build phases that are complete
     *            and information about any current build phase that is not yet
     *            complete.
     *            </p>
     */
    public void setPhases(java.util.Collection<BuildPhase> phases) {
        if (phases == null) {
            this.phases = null;
            return;
        }

        this.phases = new java.util.ArrayList<BuildPhase>(phases);
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and
     * information about any current build phase that is not yet complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phases <p>
     *            Information about all previous build phases that are complete
     *            and information about any current build phase that is not yet
     *            complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withPhases(BuildPhase... phases) {
        if (getPhases() == null) {
            this.phases = new java.util.ArrayList<BuildPhase>(phases.length);
        }
        for (BuildPhase value : phases) {
            this.phases.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and
     * information about any current build phase that is not yet complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phases <p>
     *            Information about all previous build phases that are complete
     *            and information about any current build phase that is not yet
     *            complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withPhases(java.util.Collection<BuildPhase> phases) {
        setPhases(phases);
        return this;
    }

    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     *
     * @return <p>
     *         Information about the source code to be built.
     *         </p>
     */
    public ProjectSource getSource() {
        return source;
    }

    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     *
     * @param source <p>
     *            Information about the source code to be built.
     *            </p>
     */
    public void setSource(ProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            Information about the source code to be built.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSource(ProjectSource source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>ProjectSource</code> objects.
     *         </p>
     */
    public java.util.List<ProjectSource> getSecondarySources() {
        return secondarySources;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     *
     * @param secondarySources <p>
     *            An array of <code>ProjectSource</code> objects.
     *            </p>
     */
    public void setSecondarySources(java.util.Collection<ProjectSource> secondarySources) {
        if (secondarySources == null) {
            this.secondarySources = null;
            return;
        }

        this.secondarySources = new java.util.ArrayList<ProjectSource>(secondarySources);
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySources <p>
     *            An array of <code>ProjectSource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSecondarySources(ProjectSource... secondarySources) {
        if (getSecondarySources() == null) {
            this.secondarySources = new java.util.ArrayList<ProjectSource>(secondarySources.length);
        }
        for (ProjectSource value : secondarySources) {
            this.secondarySources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySources <p>
     *            An array of <code>ProjectSource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSecondarySources(java.util.Collection<ProjectSource> secondarySources) {
        setSecondarySources(secondarySources);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each
     * <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An array of <code>ProjectSourceVersion</code> objects. Each
     *         <code>ProjectSourceVersion</code> must be one of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For GitHub: the commit ID, pull request ID, branch name, or tag
     *         name that corresponds to the version of the source code you want
     *         to build. If a pull request ID is specified, it must use the
     *         format <code>pr/pull-request-ID</code> (for example,
     *         <code>pr/25</code>). If a branch name is specified, the branch's
     *         HEAD commit ID is used. If not specified, the default branch's
     *         HEAD commit ID is used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Bitbucket: the commit ID, branch name, or tag name that
     *         corresponds to the version of the source code you want to build.
     *         If a branch name is specified, the branch's HEAD commit ID is
     *         used. If not specified, the default branch's HEAD commit ID is
     *         used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon Simple Storage Service (Amazon S3): the version ID of
     *         the object that represents the build input ZIP file to use.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<ProjectSourceVersion> getSecondarySourceVersions() {
        return secondarySourceVersions;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each
     * <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     *
     * @param secondarySourceVersions <p>
     *            An array of <code>ProjectSourceVersion</code> objects. Each
     *            <code>ProjectSourceVersion</code> must be one of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For GitHub: the commit ID, pull request ID, branch name, or
     *            tag name that corresponds to the version of the source code
     *            you want to build. If a pull request ID is specified, it must
     *            use the format <code>pr/pull-request-ID</code> (for example,
     *            <code>pr/25</code>). If a branch name is specified, the
     *            branch's HEAD commit ID is used. If not specified, the default
     *            branch's HEAD commit ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Bitbucket: the commit ID, branch name, or tag name that
     *            corresponds to the version of the source code you want to
     *            build. If a branch name is specified, the branch's HEAD commit
     *            ID is used. If not specified, the default branch's HEAD commit
     *            ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Simple Storage Service (Amazon S3): the version ID
     *            of the object that represents the build input ZIP file to use.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSecondarySourceVersions(
            java.util.Collection<ProjectSourceVersion> secondarySourceVersions) {
        if (secondarySourceVersions == null) {
            this.secondarySourceVersions = null;
            return;
        }

        this.secondarySourceVersions = new java.util.ArrayList<ProjectSourceVersion>(
                secondarySourceVersions);
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each
     * <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySourceVersions <p>
     *            An array of <code>ProjectSourceVersion</code> objects. Each
     *            <code>ProjectSourceVersion</code> must be one of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For GitHub: the commit ID, pull request ID, branch name, or
     *            tag name that corresponds to the version of the source code
     *            you want to build. If a pull request ID is specified, it must
     *            use the format <code>pr/pull-request-ID</code> (for example,
     *            <code>pr/25</code>). If a branch name is specified, the
     *            branch's HEAD commit ID is used. If not specified, the default
     *            branch's HEAD commit ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Bitbucket: the commit ID, branch name, or tag name that
     *            corresponds to the version of the source code you want to
     *            build. If a branch name is specified, the branch's HEAD commit
     *            ID is used. If not specified, the default branch's HEAD commit
     *            ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Simple Storage Service (Amazon S3): the version ID
     *            of the object that represents the build input ZIP file to use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSecondarySourceVersions(ProjectSourceVersion... secondarySourceVersions) {
        if (getSecondarySourceVersions() == null) {
            this.secondarySourceVersions = new java.util.ArrayList<ProjectSourceVersion>(
                    secondarySourceVersions.length);
        }
        for (ProjectSourceVersion value : secondarySourceVersions) {
            this.secondarySourceVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each
     * <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySourceVersions <p>
     *            An array of <code>ProjectSourceVersion</code> objects. Each
     *            <code>ProjectSourceVersion</code> must be one of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For GitHub: the commit ID, pull request ID, branch name, or
     *            tag name that corresponds to the version of the source code
     *            you want to build. If a pull request ID is specified, it must
     *            use the format <code>pr/pull-request-ID</code> (for example,
     *            <code>pr/25</code>). If a branch name is specified, the
     *            branch's HEAD commit ID is used. If not specified, the default
     *            branch's HEAD commit ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Bitbucket: the commit ID, branch name, or tag name that
     *            corresponds to the version of the source code you want to
     *            build. If a branch name is specified, the branch's HEAD commit
     *            ID is used. If not specified, the default branch's HEAD commit
     *            ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Simple Storage Service (Amazon S3): the version ID
     *            of the object that represents the build input ZIP file to use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSecondarySourceVersions(
            java.util.Collection<ProjectSourceVersion> secondarySourceVersions) {
        setSecondarySourceVersions(secondarySourceVersions);
        return this;
    }

    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     *
     * @return <p>
     *         Information about the output artifacts for the build.
     *         </p>
     */
    public BuildArtifacts getArtifacts() {
        return artifacts;
    }

    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     *
     * @param artifacts <p>
     *            Information about the output artifacts for the build.
     *            </p>
     */
    public void setArtifacts(BuildArtifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param artifacts <p>
     *            Information about the output artifacts for the build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withArtifacts(BuildArtifacts artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>ProjectArtifacts</code> objects.
     *         </p>
     */
    public java.util.List<BuildArtifacts> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     *
     * @param secondaryArtifacts <p>
     *            An array of <code>ProjectArtifacts</code> objects.
     *            </p>
     */
    public void setSecondaryArtifacts(java.util.Collection<BuildArtifacts> secondaryArtifacts) {
        if (secondaryArtifacts == null) {
            this.secondaryArtifacts = null;
            return;
        }

        this.secondaryArtifacts = new java.util.ArrayList<BuildArtifacts>(secondaryArtifacts);
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryArtifacts <p>
     *            An array of <code>ProjectArtifacts</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSecondaryArtifacts(BuildArtifacts... secondaryArtifacts) {
        if (getSecondaryArtifacts() == null) {
            this.secondaryArtifacts = new java.util.ArrayList<BuildArtifacts>(
                    secondaryArtifacts.length);
        }
        for (BuildArtifacts value : secondaryArtifacts) {
            this.secondaryArtifacts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryArtifacts <p>
     *            An array of <code>ProjectArtifacts</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withSecondaryArtifacts(java.util.Collection<BuildArtifacts> secondaryArtifacts) {
        setSecondaryArtifacts(secondaryArtifacts);
        return this;
    }

    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     *
     * @return <p>
     *         Information about the cache for the build.
     *         </p>
     */
    public ProjectCache getCache() {
        return cache;
    }

    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     *
     * @param cache <p>
     *            Information about the cache for the build.
     *            </p>
     */
    public void setCache(ProjectCache cache) {
        this.cache = cache;
    }

    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cache <p>
     *            Information about the cache for the build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withCache(ProjectCache cache) {
        this.cache = cache;
        return this;
    }

    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     *
     * @return <p>
     *         Information about the build environment for this build.
     *         </p>
     */
    public ProjectEnvironment getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     *
     * @param environment <p>
     *            Information about the build environment for this build.
     *            </p>
     */
    public void setEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            Information about the build environment for this build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of a service role used for this build.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param serviceRole <p>
     *            The name of a service role used for this build.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param serviceRole <p>
     *            The name of a service role used for this build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         Information about the build's logs in Amazon CloudWatch Logs.
     *         </p>
     */
    public LogsLocation getLogs() {
        return logs;
    }

    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     *
     * @param logs <p>
     *            Information about the build's logs in Amazon CloudWatch Logs.
     *            </p>
     */
    public void setLogs(LogsLocation logs) {
        this.logs = logs;
    }

    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logs <p>
     *            Information about the build's logs in Amazon CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withLogs(LogsLocation logs) {
        this.logs = logs;
        return this;
    }

    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this
     * build if it does not get marked as completed.
     * </p>
     *
     * @return <p>
     *         How long, in minutes, for AWS CodeBuild to wait before timing out
     *         this build if it does not get marked as completed.
     *         </p>
     */
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this
     * build if it does not get marked as completed.
     * </p>
     *
     * @param timeoutInMinutes <p>
     *            How long, in minutes, for AWS CodeBuild to wait before timing
     *            out this build if it does not get marked as completed.
     *            </p>
     */
    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this
     * build if it does not get marked as completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutInMinutes <p>
     *            How long, in minutes, for AWS CodeBuild to wait before timing
     *            out this build if it does not get marked as completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     *
     * @return <p>
     *         The number of minutes a build is allowed to be queued before it
     *         times out.
     *         </p>
     */
    public Integer getQueuedTimeoutInMinutes() {
        return queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     *
     * @param queuedTimeoutInMinutes <p>
     *            The number of minutes a build is allowed to be queued before
     *            it times out.
     *            </p>
     */
    public void setQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queuedTimeoutInMinutes <p>
     *            The number of minutes a build is allowed to be queued before
     *            it times out.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
        return this;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     *
     * @return <p>
     *         Whether the build is complete. True if complete; otherwise,
     *         false.
     *         </p>
     */
    public Boolean isBuildComplete() {
        return buildComplete;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     *
     * @return <p>
     *         Whether the build is complete. True if complete; otherwise,
     *         false.
     *         </p>
     */
    public Boolean getBuildComplete() {
        return buildComplete;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     *
     * @param buildComplete <p>
     *            Whether the build is complete. True if complete; otherwise,
     *            false.
     *            </p>
     */
    public void setBuildComplete(Boolean buildComplete) {
        this.buildComplete = buildComplete;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildComplete <p>
     *            Whether the build is complete. True if complete; otherwise,
     *            false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withBuildComplete(Boolean buildComplete) {
        this.buildComplete = buildComplete;
        return this;
    }

    /**
     * <p>
     * The entity that started the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build,
     * the user's name (for example, <code>MyUserName</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string
     * <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The entity that started the build. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If AWS CodePipeline started the build, the pipeline's name (for
     *         example, <code>codepipeline/my-demo-pipeline</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If an AWS Identity and Access Management (IAM) user started the
     *         build, the user's name (for example, <code>MyUserName</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the Jenkins plugin for AWS CodeBuild started the build, the
     *         string <code>CodeBuild-Jenkins-Plugin</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getInitiator() {
        return initiator;
    }

    /**
     * <p>
     * The entity that started the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build,
     * the user's name (for example, <code>MyUserName</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string
     * <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param initiator <p>
     *            The entity that started the build. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If AWS CodePipeline started the build, the pipeline's name
     *            (for example, <code>codepipeline/my-demo-pipeline</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If an AWS Identity and Access Management (IAM) user started
     *            the build, the user's name (for example,
     *            <code>MyUserName</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the Jenkins plugin for AWS CodeBuild started the build, the
     *            string <code>CodeBuild-Jenkins-Plugin</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    /**
     * <p>
     * The entity that started the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build,
     * the user's name (for example, <code>MyUserName</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string
     * <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiator <p>
     *            The entity that started the build. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If AWS CodePipeline started the build, the pipeline's name
     *            (for example, <code>codepipeline/my-demo-pipeline</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If an AWS Identity and Access Management (IAM) user started
     *            the build, the user's name (for example,
     *            <code>MyUserName</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the Jenkins plugin for AWS CodeBuild started the build, the
     *            string <code>CodeBuild-Jenkins-Plugin</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }

    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you
     * provide this parameter that identifies the VPC ID and the list of
     * security group IDs and subnet IDs. The security groups and subnets must
     * belong to the same VPC. You must provide at least one security group and
     * one subnet ID.
     * </p>
     *
     * @return <p>
     *         If your AWS CodeBuild project accesses resources in an Amazon
     *         VPC, you provide this parameter that identifies the VPC ID and
     *         the list of security group IDs and subnet IDs. The security
     *         groups and subnets must belong to the same VPC. You must provide
     *         at least one security group and one subnet ID.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you
     * provide this parameter that identifies the VPC ID and the list of
     * security group IDs and subnet IDs. The security groups and subnets must
     * belong to the same VPC. You must provide at least one security group and
     * one subnet ID.
     * </p>
     *
     * @param vpcConfig <p>
     *            If your AWS CodeBuild project accesses resources in an Amazon
     *            VPC, you provide this parameter that identifies the VPC ID and
     *            the list of security group IDs and subnet IDs. The security
     *            groups and subnets must belong to the same VPC. You must
     *            provide at least one security group and one subnet ID.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you
     * provide this parameter that identifies the VPC ID and the list of
     * security group IDs and subnet IDs. The security groups and subnets must
     * belong to the same VPC. You must provide at least one security group and
     * one subnet ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            If your AWS CodeBuild project accesses resources in an Amazon
     *            VPC, you provide this parameter that identifies the VPC ID and
     *            the list of security group IDs and subnet IDs. The security
     *            groups and subnets must belong to the same VPC. You must
     *            provide at least one security group and one subnet ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * Describes a network interface.
     * </p>
     *
     * @return <p>
     *         Describes a network interface.
     *         </p>
     */
    public NetworkInterface getNetworkInterface() {
        return networkInterface;
    }

    /**
     * <p>
     * Describes a network interface.
     * </p>
     *
     * @param networkInterface <p>
     *            Describes a network interface.
     *            </p>
     */
    public void setNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
    }

    /**
     * <p>
     * Describes a network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterface <p>
     *            Describes a network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be
     * used for encrypting the build output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts
     * if your service role has permission to that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The AWS Key Management Service (AWS KMS) customer master key
     *         (CMK) to be used for encrypting the build output artifacts.
     *         </p>
     *         <note>
     *         <p>
     *         You can use a cross-account KMS key to encrypt the build output
     *         artifacts if your service role has permission to that key.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify either the Amazon Resource Name (ARN) of the CMK
     *         or, if available, the CMK's alias (using the format
     *         <code>alias/<i>alias-name</i> </code>).
     *         </p>
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be
     * used for encrypting the build output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts
     * if your service role has permission to that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param encryptionKey <p>
     *            The AWS Key Management Service (AWS KMS) customer master key
     *            (CMK) to be used for encrypting the build output artifacts.
     *            </p>
     *            <note>
     *            <p>
     *            You can use a cross-account KMS key to encrypt the build
     *            output artifacts if your service role has permission to that
     *            key.
     *            </p>
     *            </note>
     *            <p>
     *            You can specify either the Amazon Resource Name (ARN) of the
     *            CMK or, if available, the CMK's alias (using the format
     *            <code>alias/<i>alias-name</i> </code>).
     *            </p>
     */
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be
     * used for encrypting the build output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts
     * if your service role has permission to that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK's alias (using the format
     * <code>alias/<i>alias-name</i> </code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param encryptionKey <p>
     *            The AWS Key Management Service (AWS KMS) customer master key
     *            (CMK) to be used for encrypting the build output artifacts.
     *            </p>
     *            <note>
     *            <p>
     *            You can use a cross-account KMS key to encrypt the build
     *            output artifacts if your service role has permission to that
     *            key.
     *            </p>
     *            </note>
     *            <p>
     *            You can specify either the Amazon Resource Name (ARN) of the
     *            CMK or, if available, the CMK's alias (using the format
     *            <code>alias/<i>alias-name</i> </code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * A list of exported environment variables for this build.
     * </p>
     *
     * @return <p>
     *         A list of exported environment variables for this build.
     *         </p>
     */
    public java.util.List<ExportedEnvironmentVariable> getExportedEnvironmentVariables() {
        return exportedEnvironmentVariables;
    }

    /**
     * <p>
     * A list of exported environment variables for this build.
     * </p>
     *
     * @param exportedEnvironmentVariables <p>
     *            A list of exported environment variables for this build.
     *            </p>
     */
    public void setExportedEnvironmentVariables(
            java.util.Collection<ExportedEnvironmentVariable> exportedEnvironmentVariables) {
        if (exportedEnvironmentVariables == null) {
            this.exportedEnvironmentVariables = null;
            return;
        }

        this.exportedEnvironmentVariables = new java.util.ArrayList<ExportedEnvironmentVariable>(
                exportedEnvironmentVariables);
    }

    /**
     * <p>
     * A list of exported environment variables for this build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportedEnvironmentVariables <p>
     *            A list of exported environment variables for this build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withExportedEnvironmentVariables(
            ExportedEnvironmentVariable... exportedEnvironmentVariables) {
        if (getExportedEnvironmentVariables() == null) {
            this.exportedEnvironmentVariables = new java.util.ArrayList<ExportedEnvironmentVariable>(
                    exportedEnvironmentVariables.length);
        }
        for (ExportedEnvironmentVariable value : exportedEnvironmentVariables) {
            this.exportedEnvironmentVariables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of exported environment variables for this build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportedEnvironmentVariables <p>
     *            A list of exported environment variables for this build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withExportedEnvironmentVariables(
            java.util.Collection<ExportedEnvironmentVariable> exportedEnvironmentVariables) {
        setExportedEnvironmentVariables(exportedEnvironmentVariables);
        return this;
    }

    /**
     * <p>
     * An array of the ARNs associated with this build's reports.
     * </p>
     *
     * @return <p>
     *         An array of the ARNs associated with this build's reports.
     *         </p>
     */
    public java.util.List<String> getReportArns() {
        return reportArns;
    }

    /**
     * <p>
     * An array of the ARNs associated with this build's reports.
     * </p>
     *
     * @param reportArns <p>
     *            An array of the ARNs associated with this build's reports.
     *            </p>
     */
    public void setReportArns(java.util.Collection<String> reportArns) {
        if (reportArns == null) {
            this.reportArns = null;
            return;
        }

        this.reportArns = new java.util.ArrayList<String>(reportArns);
    }

    /**
     * <p>
     * An array of the ARNs associated with this build's reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportArns <p>
     *            An array of the ARNs associated with this build's reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withReportArns(String... reportArns) {
        if (getReportArns() == null) {
            this.reportArns = new java.util.ArrayList<String>(reportArns.length);
        }
        for (String value : reportArns) {
            this.reportArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of the ARNs associated with this build's reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportArns <p>
     *            An array of the ARNs associated with this build's reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withReportArns(java.util.Collection<String> reportArns) {
        setReportArns(reportArns);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for a
     * CodeBuild build project. A <code>ProjectFileSystemLocation</code> object
     * specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code>
     * of a file system created using Amazon Elastic File System.
     * </p>
     *
     * @return <p>
     *         An array of <code>ProjectFileSystemLocation</code> objects for a
     *         CodeBuild build project. A <code>ProjectFileSystemLocation</code>
     *         object specifies the <code>identifier</code>,
     *         <code>location</code>, <code>mountOptions</code>,
     *         <code>mountPoint</code>, and <code>type</code> of a file system
     *         created using Amazon Elastic File System.
     *         </p>
     */
    public java.util.List<ProjectFileSystemLocation> getFileSystemLocations() {
        return fileSystemLocations;
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for a
     * CodeBuild build project. A <code>ProjectFileSystemLocation</code> object
     * specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code>
     * of a file system created using Amazon Elastic File System.
     * </p>
     *
     * @param fileSystemLocations <p>
     *            An array of <code>ProjectFileSystemLocation</code> objects for
     *            a CodeBuild build project. A
     *            <code>ProjectFileSystemLocation</code> object specifies the
     *            <code>identifier</code>, <code>location</code>,
     *            <code>mountOptions</code>, <code>mountPoint</code>, and
     *            <code>type</code> of a file system created using Amazon
     *            Elastic File System.
     *            </p>
     */
    public void setFileSystemLocations(
            java.util.Collection<ProjectFileSystemLocation> fileSystemLocations) {
        if (fileSystemLocations == null) {
            this.fileSystemLocations = null;
            return;
        }

        this.fileSystemLocations = new java.util.ArrayList<ProjectFileSystemLocation>(
                fileSystemLocations);
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for a
     * CodeBuild build project. A <code>ProjectFileSystemLocation</code> object
     * specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code>
     * of a file system created using Amazon Elastic File System.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemLocations <p>
     *            An array of <code>ProjectFileSystemLocation</code> objects for
     *            a CodeBuild build project. A
     *            <code>ProjectFileSystemLocation</code> object specifies the
     *            <code>identifier</code>, <code>location</code>,
     *            <code>mountOptions</code>, <code>mountPoint</code>, and
     *            <code>type</code> of a file system created using Amazon
     *            Elastic File System.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withFileSystemLocations(ProjectFileSystemLocation... fileSystemLocations) {
        if (getFileSystemLocations() == null) {
            this.fileSystemLocations = new java.util.ArrayList<ProjectFileSystemLocation>(
                    fileSystemLocations.length);
        }
        for (ProjectFileSystemLocation value : fileSystemLocations) {
            this.fileSystemLocations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for a
     * CodeBuild build project. A <code>ProjectFileSystemLocation</code> object
     * specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code>
     * of a file system created using Amazon Elastic File System.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemLocations <p>
     *            An array of <code>ProjectFileSystemLocation</code> objects for
     *            a CodeBuild build project. A
     *            <code>ProjectFileSystemLocation</code> object specifies the
     *            <code>identifier</code>, <code>location</code>,
     *            <code>mountOptions</code>, <code>mountPoint</code>, and
     *            <code>type</code> of a file system created using Amazon
     *            Elastic File System.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Build withFileSystemLocations(
            java.util.Collection<ProjectFileSystemLocation> fileSystemLocations) {
        setFileSystemLocations(fileSystemLocations);
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
            sb.append("id: " + getId() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getBuildNumber() != null)
            sb.append("buildNumber: " + getBuildNumber() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getCurrentPhase() != null)
            sb.append("currentPhase: " + getCurrentPhase() + ",");
        if (getBuildStatus() != null)
            sb.append("buildStatus: " + getBuildStatus() + ",");
        if (getSourceVersion() != null)
            sb.append("sourceVersion: " + getSourceVersion() + ",");
        if (getResolvedSourceVersion() != null)
            sb.append("resolvedSourceVersion: " + getResolvedSourceVersion() + ",");
        if (getProjectName() != null)
            sb.append("projectName: " + getProjectName() + ",");
        if (getPhases() != null)
            sb.append("phases: " + getPhases() + ",");
        if (getSource() != null)
            sb.append("source: " + getSource() + ",");
        if (getSecondarySources() != null)
            sb.append("secondarySources: " + getSecondarySources() + ",");
        if (getSecondarySourceVersions() != null)
            sb.append("secondarySourceVersions: " + getSecondarySourceVersions() + ",");
        if (getArtifacts() != null)
            sb.append("artifacts: " + getArtifacts() + ",");
        if (getSecondaryArtifacts() != null)
            sb.append("secondaryArtifacts: " + getSecondaryArtifacts() + ",");
        if (getCache() != null)
            sb.append("cache: " + getCache() + ",");
        if (getEnvironment() != null)
            sb.append("environment: " + getEnvironment() + ",");
        if (getServiceRole() != null)
            sb.append("serviceRole: " + getServiceRole() + ",");
        if (getLogs() != null)
            sb.append("logs: " + getLogs() + ",");
        if (getTimeoutInMinutes() != null)
            sb.append("timeoutInMinutes: " + getTimeoutInMinutes() + ",");
        if (getQueuedTimeoutInMinutes() != null)
            sb.append("queuedTimeoutInMinutes: " + getQueuedTimeoutInMinutes() + ",");
        if (getBuildComplete() != null)
            sb.append("buildComplete: " + getBuildComplete() + ",");
        if (getInitiator() != null)
            sb.append("initiator: " + getInitiator() + ",");
        if (getVpcConfig() != null)
            sb.append("vpcConfig: " + getVpcConfig() + ",");
        if (getNetworkInterface() != null)
            sb.append("networkInterface: " + getNetworkInterface() + ",");
        if (getEncryptionKey() != null)
            sb.append("encryptionKey: " + getEncryptionKey() + ",");
        if (getExportedEnvironmentVariables() != null)
            sb.append("exportedEnvironmentVariables: " + getExportedEnvironmentVariables() + ",");
        if (getReportArns() != null)
            sb.append("reportArns: " + getReportArns() + ",");
        if (getFileSystemLocations() != null)
            sb.append("fileSystemLocations: " + getFileSystemLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getBuildNumber() == null) ? 0 : getBuildNumber().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentPhase() == null) ? 0 : getCurrentPhase().hashCode());
        hashCode = prime * hashCode
                + ((getBuildStatus() == null) ? 0 : getBuildStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getResolvedSourceVersion() == null) ? 0 : getResolvedSourceVersion().hashCode());
        hashCode = prime * hashCode
                + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getPhases() == null) ? 0 : getPhases().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getSecondarySources() == null) ? 0 : getSecondarySources().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondarySourceVersions() == null) ? 0 : getSecondarySourceVersions()
                        .hashCode());
        hashCode = prime * hashCode + ((getArtifacts() == null) ? 0 : getArtifacts().hashCode());
        hashCode = prime * hashCode
                + ((getSecondaryArtifacts() == null) ? 0 : getSecondaryArtifacts().hashCode());
        hashCode = prime * hashCode + ((getCache() == null) ? 0 : getCache().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueuedTimeoutInMinutes() == null) ? 0 : getQueuedTimeoutInMinutes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBuildComplete() == null) ? 0 : getBuildComplete().hashCode());
        hashCode = prime * hashCode + ((getInitiator() == null) ? 0 : getInitiator().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterface() == null) ? 0 : getNetworkInterface().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getExportedEnvironmentVariables() == null) ? 0
                        : getExportedEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getReportArns() == null) ? 0 : getReportArns().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemLocations() == null) ? 0 : getFileSystemLocations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Build == false)
            return false;
        Build other = (Build) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBuildNumber() == null ^ this.getBuildNumber() == null)
            return false;
        if (other.getBuildNumber() != null
                && other.getBuildNumber().equals(this.getBuildNumber()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCurrentPhase() == null ^ this.getCurrentPhase() == null)
            return false;
        if (other.getCurrentPhase() != null
                && other.getCurrentPhase().equals(this.getCurrentPhase()) == false)
            return false;
        if (other.getBuildStatus() == null ^ this.getBuildStatus() == null)
            return false;
        if (other.getBuildStatus() != null
                && other.getBuildStatus().equals(this.getBuildStatus()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null
                && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getResolvedSourceVersion() == null ^ this.getResolvedSourceVersion() == null)
            return false;
        if (other.getResolvedSourceVersion() != null
                && other.getResolvedSourceVersion().equals(this.getResolvedSourceVersion()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null
                && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getPhases() == null ^ this.getPhases() == null)
            return false;
        if (other.getPhases() != null && other.getPhases().equals(this.getPhases()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSecondarySources() == null ^ this.getSecondarySources() == null)
            return false;
        if (other.getSecondarySources() != null
                && other.getSecondarySources().equals(this.getSecondarySources()) == false)
            return false;
        if (other.getSecondarySourceVersions() == null ^ this.getSecondarySourceVersions() == null)
            return false;
        if (other.getSecondarySourceVersions() != null
                && other.getSecondarySourceVersions().equals(this.getSecondarySourceVersions()) == false)
            return false;
        if (other.getArtifacts() == null ^ this.getArtifacts() == null)
            return false;
        if (other.getArtifacts() != null
                && other.getArtifacts().equals(this.getArtifacts()) == false)
            return false;
        if (other.getSecondaryArtifacts() == null ^ this.getSecondaryArtifacts() == null)
            return false;
        if (other.getSecondaryArtifacts() != null
                && other.getSecondaryArtifacts().equals(this.getSecondaryArtifacts()) == false)
            return false;
        if (other.getCache() == null ^ this.getCache() == null)
            return false;
        if (other.getCache() != null && other.getCache().equals(this.getCache()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getLogs() == null ^ this.getLogs() == null)
            return false;
        if (other.getLogs() != null && other.getLogs().equals(this.getLogs()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null
                && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getQueuedTimeoutInMinutes() == null ^ this.getQueuedTimeoutInMinutes() == null)
            return false;
        if (other.getQueuedTimeoutInMinutes() != null
                && other.getQueuedTimeoutInMinutes().equals(this.getQueuedTimeoutInMinutes()) == false)
            return false;
        if (other.getBuildComplete() == null ^ this.getBuildComplete() == null)
            return false;
        if (other.getBuildComplete() != null
                && other.getBuildComplete().equals(this.getBuildComplete()) == false)
            return false;
        if (other.getInitiator() == null ^ this.getInitiator() == null)
            return false;
        if (other.getInitiator() != null
                && other.getInitiator().equals(this.getInitiator()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getNetworkInterface() == null ^ this.getNetworkInterface() == null)
            return false;
        if (other.getNetworkInterface() != null
                && other.getNetworkInterface().equals(this.getNetworkInterface()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getExportedEnvironmentVariables() == null
                ^ this.getExportedEnvironmentVariables() == null)
            return false;
        if (other.getExportedEnvironmentVariables() != null
                && other.getExportedEnvironmentVariables().equals(
                        this.getExportedEnvironmentVariables()) == false)
            return false;
        if (other.getReportArns() == null ^ this.getReportArns() == null)
            return false;
        if (other.getReportArns() != null
                && other.getReportArns().equals(this.getReportArns()) == false)
            return false;
        if (other.getFileSystemLocations() == null ^ this.getFileSystemLocations() == null)
            return false;
        if (other.getFileSystemLocations() != null
                && other.getFileSystemLocations().equals(this.getFileSystemLocations()) == false)
            return false;
        return true;
    }
}
