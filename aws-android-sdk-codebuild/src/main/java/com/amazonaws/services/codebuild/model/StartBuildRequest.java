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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts running a build.
 * </p>
 */
public class StartBuildRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String projectName;

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     */
    private java.util.List<ProjectSource> secondarySourcesOverride;

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or
     * more versions of the project's secondary sources to be used for this
     * build only.
     * </p>
     */
    private java.util.List<ProjectSourceVersion> secondarySourcesVersionOverride;

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not
     * specified, the latest version is used. If specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a
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
     * If <code>sourceVersion</code> is specified at the project level, then
     * this <code>sourceVersion</code> (at the build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     */
    private String sourceVersion;

    /**
     * <p>
     * Build output artifact settings that override, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     */
    private ProjectArtifacts artifactsOverride;

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     */
    private java.util.List<ProjectArtifacts> secondaryArtifactsOverride;

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariablesOverride;

    /**
     * <p>
     * A source input type, for this build, that overrides the source input
     * defined in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET,
     * GITHUB_ENTERPRISE, NO_SOURCE
     */
    private String sourceTypeOverride;

    /**
     * <p>
     * A location that overrides, for this build, the source location for the
     * one defined in the build project.
     * </p>
     */
    private String sourceLocationOverride;

    /**
     * <p>
     * An authorization type for this build that overrides the one defined in
     * the build project. This override applies only if the build project's
     * source is BitBucket or GitHub.
     * </p>
     */
    private SourceAuth sourceAuthOverride;

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that
     * overrides, for this build only, any previous depth of history defined in
     * the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer gitCloneDepthOverride;

    /**
     * <p>
     * Information about the Git submodules configuration for this build of an
     * AWS CodeBuild build project.
     * </p>
     */
    private GitSubmodulesConfig gitSubmodulesConfigOverride;

    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the
     * latest one already defined in the build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition,
     * the path to an alternate buildspec file relative to the value of the
     * built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path
     * to an S3 bucket. The bucket must be in the same AWS Region as the build
     * project. Specify the buildspec file using its ARN (for example,
     * <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this
     * value is not provided or is set to an empty string, the source code must
     * contain a buildspec file in its root directory. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     */
    private String buildspecOverride;

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified
     * in the build project. The insecure SSL setting determines whether to
     * ignore SSL warnings while connecting to the project source code. This
     * override applies only if the build's source is GitHub Enterprise.
     * </p>
     */
    private Boolean insecureSslOverride;

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's
     * start and completion. If you use this option with a source provider other
     * than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your
     * source provider.
     * </p>
     * </note>
     */
    private Boolean reportBuildStatusOverride;

    /**
     * <p>
     * A container type for this build that overrides the one specified in the
     * build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     */
    private String environmentTypeOverride;

    /**
     * <p>
     * The name of an image for this build that overrides the one specified in
     * the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String imageOverride;

    /**
     * <p>
     * The name of a compute type for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     */
    private String computeTypeOverride;

    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified
     * in the build project.
     * </p>
     */
    private String certificateOverride;

    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one
     * defined in the build project.
     * </p>
     */
    private ProjectCache cacheOverride;

    /**
     * <p>
     * The name of a service role for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String serviceRoleOverride;

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     */
    private Boolean privilegedModeOverride;

    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that
     * overrides, for this build only, the latest setting already defined in the
     * build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     */
    private Integer timeoutInMinutesOverride;

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     */
    private Integer queuedTimeoutInMinutesOverride;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that
     * overrides the one specified in the build project. The CMK key encrypts
     * the build output artifacts.
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
    private String encryptionKeyOverride;

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency
     * of the StartBuild request. The token is included in the StartBuild
     * request and is valid for 12 hours. If you repeat the StartBuild request
     * with the same token, but change a parameter, AWS CodeBuild returns a
     * parameter mismatch error.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * Log settings for this build that override the log settings defined in the
     * build project.
     * </p>
     */
    private LogsConfig logsConfigOverride;

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     */
    private RegistryCredential registryCredentialOverride;

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you
     * must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     */
    private String imagePullCredentialsTypeOverride;

    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the AWS CodeBuild build project to start running a
     *         build.
     *         </p>
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild build project to start running a
     *            build.
     *            </p>
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild build project to start running a
     *            build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withProjectName(String projectName) {
        this.projectName = projectName;
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
    public java.util.List<ProjectSource> getSecondarySourcesOverride() {
        return secondarySourcesOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     *
     * @param secondarySourcesOverride <p>
     *            An array of <code>ProjectSource</code> objects.
     *            </p>
     */
    public void setSecondarySourcesOverride(
            java.util.Collection<ProjectSource> secondarySourcesOverride) {
        if (secondarySourcesOverride == null) {
            this.secondarySourcesOverride = null;
            return;
        }

        this.secondarySourcesOverride = new java.util.ArrayList<ProjectSource>(
                secondarySourcesOverride);
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySourcesOverride <p>
     *            An array of <code>ProjectSource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSecondarySourcesOverride(ProjectSource... secondarySourcesOverride) {
        if (getSecondarySourcesOverride() == null) {
            this.secondarySourcesOverride = new java.util.ArrayList<ProjectSource>(
                    secondarySourcesOverride.length);
        }
        for (ProjectSource value : secondarySourcesOverride) {
            this.secondarySourcesOverride.add(value);
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
     * @param secondarySourcesOverride <p>
     *            An array of <code>ProjectSource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSecondarySourcesOverride(
            java.util.Collection<ProjectSource> secondarySourcesOverride) {
        setSecondarySourcesOverride(secondarySourcesOverride);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or
     * more versions of the project's secondary sources to be used for this
     * build only.
     * </p>
     *
     * @return <p>
     *         An array of <code>ProjectSourceVersion</code> objects that
     *         specify one or more versions of the project's secondary sources
     *         to be used for this build only.
     *         </p>
     */
    public java.util.List<ProjectSourceVersion> getSecondarySourcesVersionOverride() {
        return secondarySourcesVersionOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or
     * more versions of the project's secondary sources to be used for this
     * build only.
     * </p>
     *
     * @param secondarySourcesVersionOverride <p>
     *            An array of <code>ProjectSourceVersion</code> objects that
     *            specify one or more versions of the project's secondary
     *            sources to be used for this build only.
     *            </p>
     */
    public void setSecondarySourcesVersionOverride(
            java.util.Collection<ProjectSourceVersion> secondarySourcesVersionOverride) {
        if (secondarySourcesVersionOverride == null) {
            this.secondarySourcesVersionOverride = null;
            return;
        }

        this.secondarySourcesVersionOverride = new java.util.ArrayList<ProjectSourceVersion>(
                secondarySourcesVersionOverride);
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or
     * more versions of the project's secondary sources to be used for this
     * build only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySourcesVersionOverride <p>
     *            An array of <code>ProjectSourceVersion</code> objects that
     *            specify one or more versions of the project's secondary
     *            sources to be used for this build only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSecondarySourcesVersionOverride(
            ProjectSourceVersion... secondarySourcesVersionOverride) {
        if (getSecondarySourcesVersionOverride() == null) {
            this.secondarySourcesVersionOverride = new java.util.ArrayList<ProjectSourceVersion>(
                    secondarySourcesVersionOverride.length);
        }
        for (ProjectSourceVersion value : secondarySourcesVersionOverride) {
            this.secondarySourcesVersionOverride.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or
     * more versions of the project's secondary sources to be used for this
     * build only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySourcesVersionOverride <p>
     *            An array of <code>ProjectSourceVersion</code> objects that
     *            specify one or more versions of the project's secondary
     *            sources to be used for this build only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSecondarySourcesVersionOverride(
            java.util.Collection<ProjectSourceVersion> secondarySourcesVersionOverride) {
        setSecondarySourcesVersionOverride(secondarySourcesVersionOverride);
        return this;
    }

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not
     * specified, the latest version is used. If specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a
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
     * If <code>sourceVersion</code> is specified at the project level, then
     * this <code>sourceVersion</code> (at the build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A version of the build input to be built, for this build only. If
     *         not specified, the latest version is used. If specified, must be
     *         one of:
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
     *         format <code>pr/pull-request-ID</code> (for example
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
     *         <p>
     *         If <code>sourceVersion</code> is specified at the project level,
     *         then this <code>sourceVersion</code> (at the build level) takes
     *         precedence.
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
     * A version of the build input to be built, for this build only. If not
     * specified, the latest version is used. If specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a
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
     * If <code>sourceVersion</code> is specified at the project level, then
     * this <code>sourceVersion</code> (at the build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     *
     * @param sourceVersion <p>
     *            A version of the build input to be built, for this build only.
     *            If not specified, the latest version is used. If specified,
     *            must be one of:
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
     *            use the format <code>pr/pull-request-ID</code> (for example
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
     *            <p>
     *            If <code>sourceVersion</code> is specified at the project
     *            level, then this <code>sourceVersion</code> (at the build
     *            level) takes precedence.
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
     * A version of the build input to be built, for this build only. If not
     * specified, the latest version is used. If specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a
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
     * If <code>sourceVersion</code> is specified at the project level, then
     * this <code>sourceVersion</code> (at the build level) takes precedence.
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
     *
     * @param sourceVersion <p>
     *            A version of the build input to be built, for this build only.
     *            If not specified, the latest version is used. If specified,
     *            must be one of:
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
     *            use the format <code>pr/pull-request-ID</code> (for example
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
     *            <p>
     *            If <code>sourceVersion</code> is specified at the project
     *            level, then this <code>sourceVersion</code> (at the build
     *            level) takes precedence.
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
    public StartBuildRequest withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    /**
     * <p>
     * Build output artifact settings that override, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     *
     * @return <p>
     *         Build output artifact settings that override, for this build
     *         only, the latest ones already defined in the build project.
     *         </p>
     */
    public ProjectArtifacts getArtifactsOverride() {
        return artifactsOverride;
    }

    /**
     * <p>
     * Build output artifact settings that override, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     *
     * @param artifactsOverride <p>
     *            Build output artifact settings that override, for this build
     *            only, the latest ones already defined in the build project.
     *            </p>
     */
    public void setArtifactsOverride(ProjectArtifacts artifactsOverride) {
        this.artifactsOverride = artifactsOverride;
    }

    /**
     * <p>
     * Build output artifact settings that override, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param artifactsOverride <p>
     *            Build output artifact settings that override, for this build
     *            only, the latest ones already defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withArtifactsOverride(ProjectArtifacts artifactsOverride) {
        this.artifactsOverride = artifactsOverride;
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
    public java.util.List<ProjectArtifacts> getSecondaryArtifactsOverride() {
        return secondaryArtifactsOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     *
     * @param secondaryArtifactsOverride <p>
     *            An array of <code>ProjectArtifacts</code> objects.
     *            </p>
     */
    public void setSecondaryArtifactsOverride(
            java.util.Collection<ProjectArtifacts> secondaryArtifactsOverride) {
        if (secondaryArtifactsOverride == null) {
            this.secondaryArtifactsOverride = null;
            return;
        }

        this.secondaryArtifactsOverride = new java.util.ArrayList<ProjectArtifacts>(
                secondaryArtifactsOverride);
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryArtifactsOverride <p>
     *            An array of <code>ProjectArtifacts</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSecondaryArtifactsOverride(
            ProjectArtifacts... secondaryArtifactsOverride) {
        if (getSecondaryArtifactsOverride() == null) {
            this.secondaryArtifactsOverride = new java.util.ArrayList<ProjectArtifacts>(
                    secondaryArtifactsOverride.length);
        }
        for (ProjectArtifacts value : secondaryArtifactsOverride) {
            this.secondaryArtifactsOverride.add(value);
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
     * @param secondaryArtifactsOverride <p>
     *            An array of <code>ProjectArtifacts</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSecondaryArtifactsOverride(
            java.util.Collection<ProjectArtifacts> secondaryArtifactsOverride) {
        setSecondaryArtifactsOverride(secondaryArtifactsOverride);
        return this;
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     *
     * @return <p>
     *         A set of environment variables that overrides, for this build
     *         only, the latest ones already defined in the build project.
     *         </p>
     */
    public java.util.List<EnvironmentVariable> getEnvironmentVariablesOverride() {
        return environmentVariablesOverride;
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     *
     * @param environmentVariablesOverride <p>
     *            A set of environment variables that overrides, for this build
     *            only, the latest ones already defined in the build project.
     *            </p>
     */
    public void setEnvironmentVariablesOverride(
            java.util.Collection<EnvironmentVariable> environmentVariablesOverride) {
        if (environmentVariablesOverride == null) {
            this.environmentVariablesOverride = null;
            return;
        }

        this.environmentVariablesOverride = new java.util.ArrayList<EnvironmentVariable>(
                environmentVariablesOverride);
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariablesOverride <p>
     *            A set of environment variables that overrides, for this build
     *            only, the latest ones already defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withEnvironmentVariablesOverride(
            EnvironmentVariable... environmentVariablesOverride) {
        if (getEnvironmentVariablesOverride() == null) {
            this.environmentVariablesOverride = new java.util.ArrayList<EnvironmentVariable>(
                    environmentVariablesOverride.length);
        }
        for (EnvironmentVariable value : environmentVariablesOverride) {
            this.environmentVariablesOverride.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the
     * latest ones already defined in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariablesOverride <p>
     *            A set of environment variables that overrides, for this build
     *            only, the latest ones already defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withEnvironmentVariablesOverride(
            java.util.Collection<EnvironmentVariable> environmentVariablesOverride) {
        setEnvironmentVariablesOverride(environmentVariablesOverride);
        return this;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input
     * defined in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET,
     * GITHUB_ENTERPRISE, NO_SOURCE
     *
     * @return <p>
     *         A source input type, for this build, that overrides the source
     *         input defined in the build project.
     *         </p>
     * @see SourceType
     */
    public String getSourceTypeOverride() {
        return sourceTypeOverride;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input
     * defined in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET,
     * GITHUB_ENTERPRISE, NO_SOURCE
     *
     * @param sourceTypeOverride <p>
     *            A source input type, for this build, that overrides the source
     *            input defined in the build project.
     *            </p>
     * @see SourceType
     */
    public void setSourceTypeOverride(String sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input
     * defined in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET,
     * GITHUB_ENTERPRISE, NO_SOURCE
     *
     * @param sourceTypeOverride <p>
     *            A source input type, for this build, that overrides the source
     *            input defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public StartBuildRequest withSourceTypeOverride(String sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride;
        return this;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input
     * defined in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET,
     * GITHUB_ENTERPRISE, NO_SOURCE
     *
     * @param sourceTypeOverride <p>
     *            A source input type, for this build, that overrides the source
     *            input defined in the build project.
     *            </p>
     * @see SourceType
     */
    public void setSourceTypeOverride(SourceType sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride.toString();
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input
     * defined in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET,
     * GITHUB_ENTERPRISE, NO_SOURCE
     *
     * @param sourceTypeOverride <p>
     *            A source input type, for this build, that overrides the source
     *            input defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public StartBuildRequest withSourceTypeOverride(SourceType sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * A location that overrides, for this build, the source location for the
     * one defined in the build project.
     * </p>
     *
     * @return <p>
     *         A location that overrides, for this build, the source location
     *         for the one defined in the build project.
     *         </p>
     */
    public String getSourceLocationOverride() {
        return sourceLocationOverride;
    }

    /**
     * <p>
     * A location that overrides, for this build, the source location for the
     * one defined in the build project.
     * </p>
     *
     * @param sourceLocationOverride <p>
     *            A location that overrides, for this build, the source location
     *            for the one defined in the build project.
     *            </p>
     */
    public void setSourceLocationOverride(String sourceLocationOverride) {
        this.sourceLocationOverride = sourceLocationOverride;
    }

    /**
     * <p>
     * A location that overrides, for this build, the source location for the
     * one defined in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceLocationOverride <p>
     *            A location that overrides, for this build, the source location
     *            for the one defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSourceLocationOverride(String sourceLocationOverride) {
        this.sourceLocationOverride = sourceLocationOverride;
        return this;
    }

    /**
     * <p>
     * An authorization type for this build that overrides the one defined in
     * the build project. This override applies only if the build project's
     * source is BitBucket or GitHub.
     * </p>
     *
     * @return <p>
     *         An authorization type for this build that overrides the one
     *         defined in the build project. This override applies only if the
     *         build project's source is BitBucket or GitHub.
     *         </p>
     */
    public SourceAuth getSourceAuthOverride() {
        return sourceAuthOverride;
    }

    /**
     * <p>
     * An authorization type for this build that overrides the one defined in
     * the build project. This override applies only if the build project's
     * source is BitBucket or GitHub.
     * </p>
     *
     * @param sourceAuthOverride <p>
     *            An authorization type for this build that overrides the one
     *            defined in the build project. This override applies only if
     *            the build project's source is BitBucket or GitHub.
     *            </p>
     */
    public void setSourceAuthOverride(SourceAuth sourceAuthOverride) {
        this.sourceAuthOverride = sourceAuthOverride;
    }

    /**
     * <p>
     * An authorization type for this build that overrides the one defined in
     * the build project. This override applies only if the build project's
     * source is BitBucket or GitHub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceAuthOverride <p>
     *            An authorization type for this build that overrides the one
     *            defined in the build project. This override applies only if
     *            the build project's source is BitBucket or GitHub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withSourceAuthOverride(SourceAuth sourceAuthOverride) {
        this.sourceAuthOverride = sourceAuthOverride;
        return this;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that
     * overrides, for this build only, any previous depth of history defined in
     * the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The user-defined depth of history, with a minimum value of 0,
     *         that overrides, for this build only, any previous depth of
     *         history defined in the build project.
     *         </p>
     */
    public Integer getGitCloneDepthOverride() {
        return gitCloneDepthOverride;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that
     * overrides, for this build only, any previous depth of history defined in
     * the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param gitCloneDepthOverride <p>
     *            The user-defined depth of history, with a minimum value of 0,
     *            that overrides, for this build only, any previous depth of
     *            history defined in the build project.
     *            </p>
     */
    public void setGitCloneDepthOverride(Integer gitCloneDepthOverride) {
        this.gitCloneDepthOverride = gitCloneDepthOverride;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that
     * overrides, for this build only, any previous depth of history defined in
     * the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param gitCloneDepthOverride <p>
     *            The user-defined depth of history, with a minimum value of 0,
     *            that overrides, for this build only, any previous depth of
     *            history defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withGitCloneDepthOverride(Integer gitCloneDepthOverride) {
        this.gitCloneDepthOverride = gitCloneDepthOverride;
        return this;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for this build of an
     * AWS CodeBuild build project.
     * </p>
     *
     * @return <p>
     *         Information about the Git submodules configuration for this build
     *         of an AWS CodeBuild build project.
     *         </p>
     */
    public GitSubmodulesConfig getGitSubmodulesConfigOverride() {
        return gitSubmodulesConfigOverride;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for this build of an
     * AWS CodeBuild build project.
     * </p>
     *
     * @param gitSubmodulesConfigOverride <p>
     *            Information about the Git submodules configuration for this
     *            build of an AWS CodeBuild build project.
     *            </p>
     */
    public void setGitSubmodulesConfigOverride(GitSubmodulesConfig gitSubmodulesConfigOverride) {
        this.gitSubmodulesConfigOverride = gitSubmodulesConfigOverride;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for this build of an
     * AWS CodeBuild build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gitSubmodulesConfigOverride <p>
     *            Information about the Git submodules configuration for this
     *            build of an AWS CodeBuild build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withGitSubmodulesConfigOverride(
            GitSubmodulesConfig gitSubmodulesConfigOverride) {
        this.gitSubmodulesConfigOverride = gitSubmodulesConfigOverride;
        return this;
    }

    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the
     * latest one already defined in the build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition,
     * the path to an alternate buildspec file relative to the value of the
     * built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path
     * to an S3 bucket. The bucket must be in the same AWS Region as the build
     * project. Specify the buildspec file using its ARN (for example,
     * <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this
     * value is not provided or is set to an empty string, the source code must
     * contain a buildspec file in its root directory. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     *
     * @return <p>
     *         A buildspec file declaration that overrides, for this build only,
     *         the latest one already defined in the build project.
     *         </p>
     *         <p>
     *         If this value is set, it can be either an inline buildspec
     *         definition, the path to an alternate buildspec file relative to
     *         the value of the built-in <code>CODEBUILD_SRC_DIR</code>
     *         environment variable, or the path to an S3 bucket. The bucket
     *         must be in the same AWS Region as the build project. Specify the
     *         buildspec file using its ARN (for example,
     *         <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If
     *         this value is not provided or is set to an empty string, the
     *         source code must contain a buildspec file in its root directory.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *         >Buildspec File Name and Storage Location</a>.
     *         </p>
     */
    public String getBuildspecOverride() {
        return buildspecOverride;
    }

    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the
     * latest one already defined in the build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition,
     * the path to an alternate buildspec file relative to the value of the
     * built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path
     * to an S3 bucket. The bucket must be in the same AWS Region as the build
     * project. Specify the buildspec file using its ARN (for example,
     * <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this
     * value is not provided or is set to an empty string, the source code must
     * contain a buildspec file in its root directory. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     *
     * @param buildspecOverride <p>
     *            A buildspec file declaration that overrides, for this build
     *            only, the latest one already defined in the build project.
     *            </p>
     *            <p>
     *            If this value is set, it can be either an inline buildspec
     *            definition, the path to an alternate buildspec file relative
     *            to the value of the built-in <code>CODEBUILD_SRC_DIR</code>
     *            environment variable, or the path to an S3 bucket. The bucket
     *            must be in the same AWS Region as the build project. Specify
     *            the buildspec file using its ARN (for example,
     *            <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *            If this value is not provided or is set to an empty string,
     *            the source code must contain a buildspec file in its root
     *            directory. For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *            >Buildspec File Name and Storage Location</a>.
     *            </p>
     */
    public void setBuildspecOverride(String buildspecOverride) {
        this.buildspecOverride = buildspecOverride;
    }

    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the
     * latest one already defined in the build project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition,
     * the path to an alternate buildspec file relative to the value of the
     * built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path
     * to an S3 bucket. The bucket must be in the same AWS Region as the build
     * project. Specify the buildspec file using its ARN (for example,
     * <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this
     * value is not provided or is set to an empty string, the source code must
     * contain a buildspec file in its root directory. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildspecOverride <p>
     *            A buildspec file declaration that overrides, for this build
     *            only, the latest one already defined in the build project.
     *            </p>
     *            <p>
     *            If this value is set, it can be either an inline buildspec
     *            definition, the path to an alternate buildspec file relative
     *            to the value of the built-in <code>CODEBUILD_SRC_DIR</code>
     *            environment variable, or the path to an S3 bucket. The bucket
     *            must be in the same AWS Region as the build project. Specify
     *            the buildspec file using its ARN (for example,
     *            <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *            If this value is not provided or is set to an empty string,
     *            the source code must contain a buildspec file in its root
     *            directory. For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *            >Buildspec File Name and Storage Location</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withBuildspecOverride(String buildspecOverride) {
        this.buildspecOverride = buildspecOverride;
        return this;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified
     * in the build project. The insecure SSL setting determines whether to
     * ignore SSL warnings while connecting to the project source code. This
     * override applies only if the build's source is GitHub Enterprise.
     * </p>
     *
     * @return <p>
     *         Enable this flag to override the insecure SSL setting that is
     *         specified in the build project. The insecure SSL setting
     *         determines whether to ignore SSL warnings while connecting to the
     *         project source code. This override applies only if the build's
     *         source is GitHub Enterprise.
     *         </p>
     */
    public Boolean isInsecureSslOverride() {
        return insecureSslOverride;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified
     * in the build project. The insecure SSL setting determines whether to
     * ignore SSL warnings while connecting to the project source code. This
     * override applies only if the build's source is GitHub Enterprise.
     * </p>
     *
     * @return <p>
     *         Enable this flag to override the insecure SSL setting that is
     *         specified in the build project. The insecure SSL setting
     *         determines whether to ignore SSL warnings while connecting to the
     *         project source code. This override applies only if the build's
     *         source is GitHub Enterprise.
     *         </p>
     */
    public Boolean getInsecureSslOverride() {
        return insecureSslOverride;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified
     * in the build project. The insecure SSL setting determines whether to
     * ignore SSL warnings while connecting to the project source code. This
     * override applies only if the build's source is GitHub Enterprise.
     * </p>
     *
     * @param insecureSslOverride <p>
     *            Enable this flag to override the insecure SSL setting that is
     *            specified in the build project. The insecure SSL setting
     *            determines whether to ignore SSL warnings while connecting to
     *            the project source code. This override applies only if the
     *            build's source is GitHub Enterprise.
     *            </p>
     */
    public void setInsecureSslOverride(Boolean insecureSslOverride) {
        this.insecureSslOverride = insecureSslOverride;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified
     * in the build project. The insecure SSL setting determines whether to
     * ignore SSL warnings while connecting to the project source code. This
     * override applies only if the build's source is GitHub Enterprise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insecureSslOverride <p>
     *            Enable this flag to override the insecure SSL setting that is
     *            specified in the build project. The insecure SSL setting
     *            determines whether to ignore SSL warnings while connecting to
     *            the project source code. This override applies only if the
     *            build's source is GitHub Enterprise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withInsecureSslOverride(Boolean insecureSslOverride) {
        this.insecureSslOverride = insecureSslOverride;
        return this;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's
     * start and completion. If you use this option with a source provider other
     * than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your
     * source provider.
     * </p>
     * </note>
     *
     * @return <p>
     *         Set to true to report to your source provider the status of a
     *         build's start and completion. If you use this option with a
     *         source provider other than GitHub, GitHub Enterprise, or
     *         Bitbucket, an invalidInputException is thrown.
     *         </p>
     *         <note>
     *         <p>
     *         The status of a build triggered by a webhook is always reported
     *         to your source provider.
     *         </p>
     *         </note>
     */
    public Boolean isReportBuildStatusOverride() {
        return reportBuildStatusOverride;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's
     * start and completion. If you use this option with a source provider other
     * than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your
     * source provider.
     * </p>
     * </note>
     *
     * @return <p>
     *         Set to true to report to your source provider the status of a
     *         build's start and completion. If you use this option with a
     *         source provider other than GitHub, GitHub Enterprise, or
     *         Bitbucket, an invalidInputException is thrown.
     *         </p>
     *         <note>
     *         <p>
     *         The status of a build triggered by a webhook is always reported
     *         to your source provider.
     *         </p>
     *         </note>
     */
    public Boolean getReportBuildStatusOverride() {
        return reportBuildStatusOverride;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's
     * start and completion. If you use this option with a source provider other
     * than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your
     * source provider.
     * </p>
     * </note>
     *
     * @param reportBuildStatusOverride <p>
     *            Set to true to report to your source provider the status of a
     *            build's start and completion. If you use this option with a
     *            source provider other than GitHub, GitHub Enterprise, or
     *            Bitbucket, an invalidInputException is thrown.
     *            </p>
     *            <note>
     *            <p>
     *            The status of a build triggered by a webhook is always
     *            reported to your source provider.
     *            </p>
     *            </note>
     */
    public void setReportBuildStatusOverride(Boolean reportBuildStatusOverride) {
        this.reportBuildStatusOverride = reportBuildStatusOverride;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's
     * start and completion. If you use this option with a source provider other
     * than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your
     * source provider.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportBuildStatusOverride <p>
     *            Set to true to report to your source provider the status of a
     *            build's start and completion. If you use this option with a
     *            source provider other than GitHub, GitHub Enterprise, or
     *            Bitbucket, an invalidInputException is thrown.
     *            </p>
     *            <note>
     *            <p>
     *            The status of a build triggered by a webhook is always
     *            reported to your source provider.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withReportBuildStatusOverride(Boolean reportBuildStatusOverride) {
        this.reportBuildStatusOverride = reportBuildStatusOverride;
        return this;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the
     * build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @return <p>
     *         A container type for this build that overrides the one specified
     *         in the build project.
     *         </p>
     * @see EnvironmentType
     */
    public String getEnvironmentTypeOverride() {
        return environmentTypeOverride;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the
     * build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param environmentTypeOverride <p>
     *            A container type for this build that overrides the one
     *            specified in the build project.
     *            </p>
     * @see EnvironmentType
     */
    public void setEnvironmentTypeOverride(String environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the
     * build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param environmentTypeOverride <p>
     *            A container type for this build that overrides the one
     *            specified in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentType
     */
    public StartBuildRequest withEnvironmentTypeOverride(String environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride;
        return this;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the
     * build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param environmentTypeOverride <p>
     *            A container type for this build that overrides the one
     *            specified in the build project.
     *            </p>
     * @see EnvironmentType
     */
    public void setEnvironmentTypeOverride(EnvironmentType environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride.toString();
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the
     * build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param environmentTypeOverride <p>
     *            A container type for this build that overrides the one
     *            specified in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentType
     */
    public StartBuildRequest withEnvironmentTypeOverride(EnvironmentType environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * The name of an image for this build that overrides the one specified in
     * the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of an image for this build that overrides the one
     *         specified in the build project.
     *         </p>
     */
    public String getImageOverride() {
        return imageOverride;
    }

    /**
     * <p>
     * The name of an image for this build that overrides the one specified in
     * the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param imageOverride <p>
     *            The name of an image for this build that overrides the one
     *            specified in the build project.
     *            </p>
     */
    public void setImageOverride(String imageOverride) {
        this.imageOverride = imageOverride;
    }

    /**
     * <p>
     * The name of an image for this build that overrides the one specified in
     * the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param imageOverride <p>
     *            The name of an image for this build that overrides the one
     *            specified in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withImageOverride(String imageOverride) {
        this.imageOverride = imageOverride;
        return this;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @return <p>
     *         The name of a compute type for this build that overrides the one
     *         specified in the build project.
     *         </p>
     * @see ComputeType
     */
    public String getComputeTypeOverride() {
        return computeTypeOverride;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeTypeOverride <p>
     *            The name of a compute type for this build that overrides the
     *            one specified in the build project.
     *            </p>
     * @see ComputeType
     */
    public void setComputeTypeOverride(String computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeTypeOverride <p>
     *            The name of a compute type for this build that overrides the
     *            one specified in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputeType
     */
    public StartBuildRequest withComputeTypeOverride(String computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride;
        return this;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeTypeOverride <p>
     *            The name of a compute type for this build that overrides the
     *            one specified in the build project.
     *            </p>
     * @see ComputeType
     */
    public void setComputeTypeOverride(ComputeType computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride.toString();
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeTypeOverride <p>
     *            The name of a compute type for this build that overrides the
     *            one specified in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputeType
     */
    public StartBuildRequest withComputeTypeOverride(ComputeType computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified
     * in the build project.
     * </p>
     *
     * @return <p>
     *         The name of a certificate for this build that overrides the one
     *         specified in the build project.
     *         </p>
     */
    public String getCertificateOverride() {
        return certificateOverride;
    }

    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified
     * in the build project.
     * </p>
     *
     * @param certificateOverride <p>
     *            The name of a certificate for this build that overrides the
     *            one specified in the build project.
     *            </p>
     */
    public void setCertificateOverride(String certificateOverride) {
        this.certificateOverride = certificateOverride;
    }

    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified
     * in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateOverride <p>
     *            The name of a certificate for this build that overrides the
     *            one specified in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withCertificateOverride(String certificateOverride) {
        this.certificateOverride = certificateOverride;
        return this;
    }

    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one
     * defined in the build project.
     * </p>
     *
     * @return <p>
     *         A ProjectCache object specified for this build that overrides the
     *         one defined in the build project.
     *         </p>
     */
    public ProjectCache getCacheOverride() {
        return cacheOverride;
    }

    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one
     * defined in the build project.
     * </p>
     *
     * @param cacheOverride <p>
     *            A ProjectCache object specified for this build that overrides
     *            the one defined in the build project.
     *            </p>
     */
    public void setCacheOverride(ProjectCache cacheOverride) {
        this.cacheOverride = cacheOverride;
    }

    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one
     * defined in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheOverride <p>
     *            A ProjectCache object specified for this build that overrides
     *            the one defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withCacheOverride(ProjectCache cacheOverride) {
        this.cacheOverride = cacheOverride;
        return this;
    }

    /**
     * <p>
     * The name of a service role for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of a service role for this build that overrides the one
     *         specified in the build project.
     *         </p>
     */
    public String getServiceRoleOverride() {
        return serviceRoleOverride;
    }

    /**
     * <p>
     * The name of a service role for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param serviceRoleOverride <p>
     *            The name of a service role for this build that overrides the
     *            one specified in the build project.
     *            </p>
     */
    public void setServiceRoleOverride(String serviceRoleOverride) {
        this.serviceRoleOverride = serviceRoleOverride;
    }

    /**
     * <p>
     * The name of a service role for this build that overrides the one
     * specified in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param serviceRoleOverride <p>
     *            The name of a service role for this build that overrides the
     *            one specified in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withServiceRoleOverride(String serviceRoleOverride) {
        this.serviceRoleOverride = serviceRoleOverride;
        return this;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     *
     * @return <p>
     *         Enable this flag to override privileged mode in the build
     *         project.
     *         </p>
     */
    public Boolean isPrivilegedModeOverride() {
        return privilegedModeOverride;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     *
     * @return <p>
     *         Enable this flag to override privileged mode in the build
     *         project.
     *         </p>
     */
    public Boolean getPrivilegedModeOverride() {
        return privilegedModeOverride;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     *
     * @param privilegedModeOverride <p>
     *            Enable this flag to override privileged mode in the build
     *            project.
     *            </p>
     */
    public void setPrivilegedModeOverride(Boolean privilegedModeOverride) {
        this.privilegedModeOverride = privilegedModeOverride;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privilegedModeOverride <p>
     *            Enable this flag to override privileged mode in the build
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withPrivilegedModeOverride(Boolean privilegedModeOverride) {
        this.privilegedModeOverride = privilegedModeOverride;
        return this;
    }

    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that
     * overrides, for this build only, the latest setting already defined in the
     * build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @return <p>
     *         The number of build timeout minutes, from 5 to 480 (8 hours),
     *         that overrides, for this build only, the latest setting already
     *         defined in the build project.
     *         </p>
     */
    public Integer getTimeoutInMinutesOverride() {
        return timeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that
     * overrides, for this build only, the latest setting already defined in the
     * build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @param timeoutInMinutesOverride <p>
     *            The number of build timeout minutes, from 5 to 480 (8 hours),
     *            that overrides, for this build only, the latest setting
     *            already defined in the build project.
     *            </p>
     */
    public void setTimeoutInMinutesOverride(Integer timeoutInMinutesOverride) {
        this.timeoutInMinutesOverride = timeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that
     * overrides, for this build only, the latest setting already defined in the
     * build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @param timeoutInMinutesOverride <p>
     *            The number of build timeout minutes, from 5 to 480 (8 hours),
     *            that overrides, for this build only, the latest setting
     *            already defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withTimeoutInMinutesOverride(Integer timeoutInMinutesOverride) {
        this.timeoutInMinutesOverride = timeoutInMinutesOverride;
        return this;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @return <p>
     *         The number of minutes a build is allowed to be queued before it
     *         times out.
     *         </p>
     */
    public Integer getQueuedTimeoutInMinutesOverride() {
        return queuedTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @param queuedTimeoutInMinutesOverride <p>
     *            The number of minutes a build is allowed to be queued before
     *            it times out.
     *            </p>
     */
    public void setQueuedTimeoutInMinutesOverride(Integer queuedTimeoutInMinutesOverride) {
        this.queuedTimeoutInMinutesOverride = queuedTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @param queuedTimeoutInMinutesOverride <p>
     *            The number of minutes a build is allowed to be queued before
     *            it times out.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withQueuedTimeoutInMinutesOverride(
            Integer queuedTimeoutInMinutesOverride) {
        this.queuedTimeoutInMinutesOverride = queuedTimeoutInMinutesOverride;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that
     * overrides the one specified in the build project. The CMK key encrypts
     * the build output artifacts.
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
     *         (CMK) that overrides the one specified in the build project. The
     *         CMK key encrypts the build output artifacts.
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
    public String getEncryptionKeyOverride() {
        return encryptionKeyOverride;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that
     * overrides the one specified in the build project. The CMK key encrypts
     * the build output artifacts.
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
     * @param encryptionKeyOverride <p>
     *            The AWS Key Management Service (AWS KMS) customer master key
     *            (CMK) that overrides the one specified in the build project.
     *            The CMK key encrypts the build output artifacts.
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
    public void setEncryptionKeyOverride(String encryptionKeyOverride) {
        this.encryptionKeyOverride = encryptionKeyOverride;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that
     * overrides the one specified in the build project. The CMK key encrypts
     * the build output artifacts.
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
     * @param encryptionKeyOverride <p>
     *            The AWS Key Management Service (AWS KMS) customer master key
     *            (CMK) that overrides the one specified in the build project.
     *            The CMK key encrypts the build output artifacts.
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
    public StartBuildRequest withEncryptionKeyOverride(String encryptionKeyOverride) {
        this.encryptionKeyOverride = encryptionKeyOverride;
        return this;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency
     * of the StartBuild request. The token is included in the StartBuild
     * request and is valid for 12 hours. If you repeat the StartBuild request
     * with the same token, but change a parameter, AWS CodeBuild returns a
     * parameter mismatch error.
     * </p>
     *
     * @return <p>
     *         A unique, case sensitive identifier you provide to ensure the
     *         idempotency of the StartBuild request. The token is included in
     *         the StartBuild request and is valid for 12 hours. If you repeat
     *         the StartBuild request with the same token, but change a
     *         parameter, AWS CodeBuild returns a parameter mismatch error.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency
     * of the StartBuild request. The token is included in the StartBuild
     * request and is valid for 12 hours. If you repeat the StartBuild request
     * with the same token, but change a parameter, AWS CodeBuild returns a
     * parameter mismatch error.
     * </p>
     *
     * @param idempotencyToken <p>
     *            A unique, case sensitive identifier you provide to ensure the
     *            idempotency of the StartBuild request. The token is included
     *            in the StartBuild request and is valid for 12 hours. If you
     *            repeat the StartBuild request with the same token, but change
     *            a parameter, AWS CodeBuild returns a parameter mismatch error.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency
     * of the StartBuild request. The token is included in the StartBuild
     * request and is valid for 12 hours. If you repeat the StartBuild request
     * with the same token, but change a parameter, AWS CodeBuild returns a
     * parameter mismatch error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idempotencyToken <p>
     *            A unique, case sensitive identifier you provide to ensure the
     *            idempotency of the StartBuild request. The token is included
     *            in the StartBuild request and is valid for 12 hours. If you
     *            repeat the StartBuild request with the same token, but change
     *            a parameter, AWS CodeBuild returns a parameter mismatch error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
        return this;
    }

    /**
     * <p>
     * Log settings for this build that override the log settings defined in the
     * build project.
     * </p>
     *
     * @return <p>
     *         Log settings for this build that override the log settings
     *         defined in the build project.
     *         </p>
     */
    public LogsConfig getLogsConfigOverride() {
        return logsConfigOverride;
    }

    /**
     * <p>
     * Log settings for this build that override the log settings defined in the
     * build project.
     * </p>
     *
     * @param logsConfigOverride <p>
     *            Log settings for this build that override the log settings
     *            defined in the build project.
     *            </p>
     */
    public void setLogsConfigOverride(LogsConfig logsConfigOverride) {
        this.logsConfigOverride = logsConfigOverride;
    }

    /**
     * <p>
     * Log settings for this build that override the log settings defined in the
     * build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logsConfigOverride <p>
     *            Log settings for this build that override the log settings
     *            defined in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withLogsConfigOverride(LogsConfig logsConfigOverride) {
        this.logsConfigOverride = logsConfigOverride;
        return this;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     *
     * @return <p>
     *         The credentials for access to a private registry.
     *         </p>
     */
    public RegistryCredential getRegistryCredentialOverride() {
        return registryCredentialOverride;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     *
     * @param registryCredentialOverride <p>
     *            The credentials for access to a private registry.
     *            </p>
     */
    public void setRegistryCredentialOverride(RegistryCredential registryCredentialOverride) {
        this.registryCredentialOverride = registryCredentialOverride;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryCredentialOverride <p>
     *            The credentials for access to a private registry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBuildRequest withRegistryCredentialOverride(
            RegistryCredential registryCredentialOverride) {
        this.registryCredentialOverride = registryCredentialOverride;
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you
     * must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @return <p>
     *         The type of credentials AWS CodeBuild uses to pull images in your
     *         build. There are two valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     *         credentials. This requires that you modify your ECR repository
     *         policy to trust AWS CodeBuild's service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your
     *         build project's service role.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When using a cross-account or private registry image, you must
     *         use SERVICE_ROLE credentials. When using an AWS CodeBuild curated
     *         image, you must use CODEBUILD credentials.
     *         </p>
     * @see ImagePullCredentialsType
     */
    public String getImagePullCredentialsTypeOverride() {
        return imagePullCredentialsTypeOverride;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you
     * must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsTypeOverride <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When using a cross-account or private registry image, you must
     *            use SERVICE_ROLE credentials. When using an AWS CodeBuild
     *            curated image, you must use CODEBUILD credentials.
     *            </p>
     * @see ImagePullCredentialsType
     */
    public void setImagePullCredentialsTypeOverride(String imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you
     * must use CODEBUILD credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsTypeOverride <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When using a cross-account or private registry image, you must
     *            use SERVICE_ROLE credentials. When using an AWS CodeBuild
     *            curated image, you must use CODEBUILD credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImagePullCredentialsType
     */
    public StartBuildRequest withImagePullCredentialsTypeOverride(
            String imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride;
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you
     * must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsTypeOverride <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When using a cross-account or private registry image, you must
     *            use SERVICE_ROLE credentials. When using an AWS CodeBuild
     *            curated image, you must use CODEBUILD credentials.
     *            </p>
     * @see ImagePullCredentialsType
     */
    public void setImagePullCredentialsTypeOverride(
            ImagePullCredentialsType imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride.toString();
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you
     * must use CODEBUILD credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsTypeOverride <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When using a cross-account or private registry image, you must
     *            use SERVICE_ROLE credentials. When using an AWS CodeBuild
     *            curated image, you must use CODEBUILD credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImagePullCredentialsType
     */
    public StartBuildRequest withImagePullCredentialsTypeOverride(
            ImagePullCredentialsType imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride.toString();
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
        if (getProjectName() != null)
            sb.append("projectName: " + getProjectName() + ",");
        if (getSecondarySourcesOverride() != null)
            sb.append("secondarySourcesOverride: " + getSecondarySourcesOverride() + ",");
        if (getSecondarySourcesVersionOverride() != null)
            sb.append("secondarySourcesVersionOverride: " + getSecondarySourcesVersionOverride()
                    + ",");
        if (getSourceVersion() != null)
            sb.append("sourceVersion: " + getSourceVersion() + ",");
        if (getArtifactsOverride() != null)
            sb.append("artifactsOverride: " + getArtifactsOverride() + ",");
        if (getSecondaryArtifactsOverride() != null)
            sb.append("secondaryArtifactsOverride: " + getSecondaryArtifactsOverride() + ",");
        if (getEnvironmentVariablesOverride() != null)
            sb.append("environmentVariablesOverride: " + getEnvironmentVariablesOverride() + ",");
        if (getSourceTypeOverride() != null)
            sb.append("sourceTypeOverride: " + getSourceTypeOverride() + ",");
        if (getSourceLocationOverride() != null)
            sb.append("sourceLocationOverride: " + getSourceLocationOverride() + ",");
        if (getSourceAuthOverride() != null)
            sb.append("sourceAuthOverride: " + getSourceAuthOverride() + ",");
        if (getGitCloneDepthOverride() != null)
            sb.append("gitCloneDepthOverride: " + getGitCloneDepthOverride() + ",");
        if (getGitSubmodulesConfigOverride() != null)
            sb.append("gitSubmodulesConfigOverride: " + getGitSubmodulesConfigOverride() + ",");
        if (getBuildspecOverride() != null)
            sb.append("buildspecOverride: " + getBuildspecOverride() + ",");
        if (getInsecureSslOverride() != null)
            sb.append("insecureSslOverride: " + getInsecureSslOverride() + ",");
        if (getReportBuildStatusOverride() != null)
            sb.append("reportBuildStatusOverride: " + getReportBuildStatusOverride() + ",");
        if (getEnvironmentTypeOverride() != null)
            sb.append("environmentTypeOverride: " + getEnvironmentTypeOverride() + ",");
        if (getImageOverride() != null)
            sb.append("imageOverride: " + getImageOverride() + ",");
        if (getComputeTypeOverride() != null)
            sb.append("computeTypeOverride: " + getComputeTypeOverride() + ",");
        if (getCertificateOverride() != null)
            sb.append("certificateOverride: " + getCertificateOverride() + ",");
        if (getCacheOverride() != null)
            sb.append("cacheOverride: " + getCacheOverride() + ",");
        if (getServiceRoleOverride() != null)
            sb.append("serviceRoleOverride: " + getServiceRoleOverride() + ",");
        if (getPrivilegedModeOverride() != null)
            sb.append("privilegedModeOverride: " + getPrivilegedModeOverride() + ",");
        if (getTimeoutInMinutesOverride() != null)
            sb.append("timeoutInMinutesOverride: " + getTimeoutInMinutesOverride() + ",");
        if (getQueuedTimeoutInMinutesOverride() != null)
            sb.append("queuedTimeoutInMinutesOverride: " + getQueuedTimeoutInMinutesOverride()
                    + ",");
        if (getEncryptionKeyOverride() != null)
            sb.append("encryptionKeyOverride: " + getEncryptionKeyOverride() + ",");
        if (getIdempotencyToken() != null)
            sb.append("idempotencyToken: " + getIdempotencyToken() + ",");
        if (getLogsConfigOverride() != null)
            sb.append("logsConfigOverride: " + getLogsConfigOverride() + ",");
        if (getRegistryCredentialOverride() != null)
            sb.append("registryCredentialOverride: " + getRegistryCredentialOverride() + ",");
        if (getImagePullCredentialsTypeOverride() != null)
            sb.append("imagePullCredentialsTypeOverride: " + getImagePullCredentialsTypeOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondarySourcesOverride() == null) ? 0 : getSecondarySourcesOverride()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondarySourcesVersionOverride() == null) ? 0
                        : getSecondarySourcesVersionOverride().hashCode());
        hashCode = prime * hashCode
                + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode
                + ((getArtifactsOverride() == null) ? 0 : getArtifactsOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryArtifactsOverride() == null) ? 0 : getSecondaryArtifactsOverride()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEnvironmentVariablesOverride() == null) ? 0
                        : getEnvironmentVariablesOverride().hashCode());
        hashCode = prime * hashCode
                + ((getSourceTypeOverride() == null) ? 0 : getSourceTypeOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceLocationOverride() == null) ? 0 : getSourceLocationOverride()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSourceAuthOverride() == null) ? 0 : getSourceAuthOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getGitCloneDepthOverride() == null) ? 0 : getGitCloneDepthOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getGitSubmodulesConfigOverride() == null) ? 0
                        : getGitSubmodulesConfigOverride().hashCode());
        hashCode = prime * hashCode
                + ((getBuildspecOverride() == null) ? 0 : getBuildspecOverride().hashCode());
        hashCode = prime * hashCode
                + ((getInsecureSslOverride() == null) ? 0 : getInsecureSslOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getReportBuildStatusOverride() == null) ? 0 : getReportBuildStatusOverride()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEnvironmentTypeOverride() == null) ? 0 : getEnvironmentTypeOverride()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getImageOverride() == null) ? 0 : getImageOverride().hashCode());
        hashCode = prime * hashCode
                + ((getComputeTypeOverride() == null) ? 0 : getComputeTypeOverride().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateOverride() == null) ? 0 : getCertificateOverride().hashCode());
        hashCode = prime * hashCode
                + ((getCacheOverride() == null) ? 0 : getCacheOverride().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleOverride() == null) ? 0 : getServiceRoleOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivilegedModeOverride() == null) ? 0 : getPrivilegedModeOverride()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTimeoutInMinutesOverride() == null) ? 0 : getTimeoutInMinutesOverride()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getQueuedTimeoutInMinutesOverride() == null) ? 0
                        : getQueuedTimeoutInMinutesOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionKeyOverride() == null) ? 0 : getEncryptionKeyOverride().hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode
                + ((getLogsConfigOverride() == null) ? 0 : getLogsConfigOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegistryCredentialOverride() == null) ? 0 : getRegistryCredentialOverride()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getImagePullCredentialsTypeOverride() == null) ? 0
                        : getImagePullCredentialsTypeOverride().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBuildRequest == false)
            return false;
        StartBuildRequest other = (StartBuildRequest) obj;

        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null
                && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getSecondarySourcesOverride() == null
                ^ this.getSecondarySourcesOverride() == null)
            return false;
        if (other.getSecondarySourcesOverride() != null
                && other.getSecondarySourcesOverride().equals(this.getSecondarySourcesOverride()) == false)
            return false;
        if (other.getSecondarySourcesVersionOverride() == null
                ^ this.getSecondarySourcesVersionOverride() == null)
            return false;
        if (other.getSecondarySourcesVersionOverride() != null
                && other.getSecondarySourcesVersionOverride().equals(
                        this.getSecondarySourcesVersionOverride()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null
                && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getArtifactsOverride() == null ^ this.getArtifactsOverride() == null)
            return false;
        if (other.getArtifactsOverride() != null
                && other.getArtifactsOverride().equals(this.getArtifactsOverride()) == false)
            return false;
        if (other.getSecondaryArtifactsOverride() == null
                ^ this.getSecondaryArtifactsOverride() == null)
            return false;
        if (other.getSecondaryArtifactsOverride() != null
                && other.getSecondaryArtifactsOverride().equals(
                        this.getSecondaryArtifactsOverride()) == false)
            return false;
        if (other.getEnvironmentVariablesOverride() == null
                ^ this.getEnvironmentVariablesOverride() == null)
            return false;
        if (other.getEnvironmentVariablesOverride() != null
                && other.getEnvironmentVariablesOverride().equals(
                        this.getEnvironmentVariablesOverride()) == false)
            return false;
        if (other.getSourceTypeOverride() == null ^ this.getSourceTypeOverride() == null)
            return false;
        if (other.getSourceTypeOverride() != null
                && other.getSourceTypeOverride().equals(this.getSourceTypeOverride()) == false)
            return false;
        if (other.getSourceLocationOverride() == null ^ this.getSourceLocationOverride() == null)
            return false;
        if (other.getSourceLocationOverride() != null
                && other.getSourceLocationOverride().equals(this.getSourceLocationOverride()) == false)
            return false;
        if (other.getSourceAuthOverride() == null ^ this.getSourceAuthOverride() == null)
            return false;
        if (other.getSourceAuthOverride() != null
                && other.getSourceAuthOverride().equals(this.getSourceAuthOverride()) == false)
            return false;
        if (other.getGitCloneDepthOverride() == null ^ this.getGitCloneDepthOverride() == null)
            return false;
        if (other.getGitCloneDepthOverride() != null
                && other.getGitCloneDepthOverride().equals(this.getGitCloneDepthOverride()) == false)
            return false;
        if (other.getGitSubmodulesConfigOverride() == null
                ^ this.getGitSubmodulesConfigOverride() == null)
            return false;
        if (other.getGitSubmodulesConfigOverride() != null
                && other.getGitSubmodulesConfigOverride().equals(
                        this.getGitSubmodulesConfigOverride()) == false)
            return false;
        if (other.getBuildspecOverride() == null ^ this.getBuildspecOverride() == null)
            return false;
        if (other.getBuildspecOverride() != null
                && other.getBuildspecOverride().equals(this.getBuildspecOverride()) == false)
            return false;
        if (other.getInsecureSslOverride() == null ^ this.getInsecureSslOverride() == null)
            return false;
        if (other.getInsecureSslOverride() != null
                && other.getInsecureSslOverride().equals(this.getInsecureSslOverride()) == false)
            return false;
        if (other.getReportBuildStatusOverride() == null
                ^ this.getReportBuildStatusOverride() == null)
            return false;
        if (other.getReportBuildStatusOverride() != null
                && other.getReportBuildStatusOverride().equals(this.getReportBuildStatusOverride()) == false)
            return false;
        if (other.getEnvironmentTypeOverride() == null ^ this.getEnvironmentTypeOverride() == null)
            return false;
        if (other.getEnvironmentTypeOverride() != null
                && other.getEnvironmentTypeOverride().equals(this.getEnvironmentTypeOverride()) == false)
            return false;
        if (other.getImageOverride() == null ^ this.getImageOverride() == null)
            return false;
        if (other.getImageOverride() != null
                && other.getImageOverride().equals(this.getImageOverride()) == false)
            return false;
        if (other.getComputeTypeOverride() == null ^ this.getComputeTypeOverride() == null)
            return false;
        if (other.getComputeTypeOverride() != null
                && other.getComputeTypeOverride().equals(this.getComputeTypeOverride()) == false)
            return false;
        if (other.getCertificateOverride() == null ^ this.getCertificateOverride() == null)
            return false;
        if (other.getCertificateOverride() != null
                && other.getCertificateOverride().equals(this.getCertificateOverride()) == false)
            return false;
        if (other.getCacheOverride() == null ^ this.getCacheOverride() == null)
            return false;
        if (other.getCacheOverride() != null
                && other.getCacheOverride().equals(this.getCacheOverride()) == false)
            return false;
        if (other.getServiceRoleOverride() == null ^ this.getServiceRoleOverride() == null)
            return false;
        if (other.getServiceRoleOverride() != null
                && other.getServiceRoleOverride().equals(this.getServiceRoleOverride()) == false)
            return false;
        if (other.getPrivilegedModeOverride() == null ^ this.getPrivilegedModeOverride() == null)
            return false;
        if (other.getPrivilegedModeOverride() != null
                && other.getPrivilegedModeOverride().equals(this.getPrivilegedModeOverride()) == false)
            return false;
        if (other.getTimeoutInMinutesOverride() == null
                ^ this.getTimeoutInMinutesOverride() == null)
            return false;
        if (other.getTimeoutInMinutesOverride() != null
                && other.getTimeoutInMinutesOverride().equals(this.getTimeoutInMinutesOverride()) == false)
            return false;
        if (other.getQueuedTimeoutInMinutesOverride() == null
                ^ this.getQueuedTimeoutInMinutesOverride() == null)
            return false;
        if (other.getQueuedTimeoutInMinutesOverride() != null
                && other.getQueuedTimeoutInMinutesOverride().equals(
                        this.getQueuedTimeoutInMinutesOverride()) == false)
            return false;
        if (other.getEncryptionKeyOverride() == null ^ this.getEncryptionKeyOverride() == null)
            return false;
        if (other.getEncryptionKeyOverride() != null
                && other.getEncryptionKeyOverride().equals(this.getEncryptionKeyOverride()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getLogsConfigOverride() == null ^ this.getLogsConfigOverride() == null)
            return false;
        if (other.getLogsConfigOverride() != null
                && other.getLogsConfigOverride().equals(this.getLogsConfigOverride()) == false)
            return false;
        if (other.getRegistryCredentialOverride() == null
                ^ this.getRegistryCredentialOverride() == null)
            return false;
        if (other.getRegistryCredentialOverride() != null
                && other.getRegistryCredentialOverride().equals(
                        this.getRegistryCredentialOverride()) == false)
            return false;
        if (other.getImagePullCredentialsTypeOverride() == null
                ^ this.getImagePullCredentialsTypeOverride() == null)
            return false;
        if (other.getImagePullCredentialsTypeOverride() != null
                && other.getImagePullCredentialsTypeOverride().equals(
                        this.getImagePullCredentialsTypeOverride()) == false)
            return false;
        return true;
    }
}
