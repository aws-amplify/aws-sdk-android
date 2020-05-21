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
 * Creates a build project.
 * </p>
 */
public class CreateProjectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     */
    private String name;

    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String description;

    /**
     * <p>
     * Information about the build input source code for the build project.
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
     * A version of the build input to be built for this project. If not
     * specified, the latest version is used. If specified, it must be one of:
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
     * If <code>sourceVersion</code> is specified at the build level, then that
     * version takes precedence over this <code>sourceVersion</code> (at the
     * project level).
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
     * An array of <code>ProjectSourceVersion</code> objects. If
     * <code>secondarySourceVersions</code> is specified at the build level,
     * then they take precedence over these <code>secondarySourceVersions</code>
     * (at the project level).
     * </p>
     */
    private java.util.List<ProjectSourceVersion> secondarySourceVersions;

    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     */
    private ProjectArtifacts artifacts;

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     */
    private java.util.List<ProjectArtifacts> secondaryArtifacts;

    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a
     * later time.
     * </p>
     */
    private ProjectCache cache;

    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     */
    private ProjectEnvironment environment;

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables
     * AWS CodeBuild to interact with dependent AWS services on behalf of the
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String serviceRole;

    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait
     * before it times out any build that has not been marked as completed. The
     * default is 60 minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times
     * out.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     */
    private Integer queuedTimeoutInMinutes;

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
     * A list of tag key and value pairs associated with this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild build project tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     */
    private Boolean badgeEnabled;

    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon
     * CloudWatch Logs, logs uploaded to a specified S3 bucket, or both.
     * </p>
     */
    private LogsConfig logsConfig;

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
     * The name of the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     *
     * @return <p>
     *         The name of the build project.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     *
     * @param name <p>
     *            The name of the build project.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     *
     * @param name <p>
     *            The name of the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return <p>
     *         A description that makes the build project easy to identify.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param description <p>
     *            A description that makes the build project easy to identify.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description that makes the build project easy to identify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param description <p>
     *            A description that makes the build project easy to identify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the build input source code for the build project.
     * </p>
     *
     * @return <p>
     *         Information about the build input source code for the build
     *         project.
     *         </p>
     */
    public ProjectSource getSource() {
        return source;
    }

    /**
     * <p>
     * Information about the build input source code for the build project.
     * </p>
     *
     * @param source <p>
     *            Information about the build input source code for the build
     *            project.
     *            </p>
     */
    public void setSource(ProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the build input source code for the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            Information about the build input source code for the build
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withSource(ProjectSource source) {
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
    public CreateProjectRequest withSecondarySources(ProjectSource... secondarySources) {
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
    public CreateProjectRequest withSecondarySources(
            java.util.Collection<ProjectSource> secondarySources) {
        setSecondarySources(secondarySources);
        return this;
    }

    /**
     * <p>
     * A version of the build input to be built for this project. If not
     * specified, the latest version is used. If specified, it must be one of:
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
     * If <code>sourceVersion</code> is specified at the build level, then that
     * version takes precedence over this <code>sourceVersion</code> (at the
     * project level).
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A version of the build input to be built for this project. If not
     *         specified, the latest version is used. If specified, it must be
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
     *         If <code>sourceVersion</code> is specified at the build level,
     *         then that version takes precedence over this
     *         <code>sourceVersion</code> (at the project level).
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
     * A version of the build input to be built for this project. If not
     * specified, the latest version is used. If specified, it must be one of:
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
     * If <code>sourceVersion</code> is specified at the build level, then that
     * version takes precedence over this <code>sourceVersion</code> (at the
     * project level).
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     *
     * @param sourceVersion <p>
     *            A version of the build input to be built for this project. If
     *            not specified, the latest version is used. If specified, it
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
     *            If <code>sourceVersion</code> is specified at the build level,
     *            then that version takes precedence over this
     *            <code>sourceVersion</code> (at the project level).
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
     * A version of the build input to be built for this project. If not
     * specified, the latest version is used. If specified, it must be one of:
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
     * If <code>sourceVersion</code> is specified at the build level, then that
     * version takes precedence over this <code>sourceVersion</code> (at the
     * project level).
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
     *            A version of the build input to be built for this project. If
     *            not specified, the latest version is used. If specified, it
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
     *            If <code>sourceVersion</code> is specified at the build level,
     *            then that version takes precedence over this
     *            <code>sourceVersion</code> (at the project level).
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
    public CreateProjectRequest withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. If
     * <code>secondarySourceVersions</code> is specified at the build level,
     * then they take precedence over these <code>secondarySourceVersions</code>
     * (at the project level).
     * </p>
     *
     * @return <p>
     *         An array of <code>ProjectSourceVersion</code> objects. If
     *         <code>secondarySourceVersions</code> is specified at the build
     *         level, then they take precedence over these
     *         <code>secondarySourceVersions</code> (at the project level).
     *         </p>
     */
    public java.util.List<ProjectSourceVersion> getSecondarySourceVersions() {
        return secondarySourceVersions;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. If
     * <code>secondarySourceVersions</code> is specified at the build level,
     * then they take precedence over these <code>secondarySourceVersions</code>
     * (at the project level).
     * </p>
     *
     * @param secondarySourceVersions <p>
     *            An array of <code>ProjectSourceVersion</code> objects. If
     *            <code>secondarySourceVersions</code> is specified at the build
     *            level, then they take precedence over these
     *            <code>secondarySourceVersions</code> (at the project level).
     *            </p>
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
     * An array of <code>ProjectSourceVersion</code> objects. If
     * <code>secondarySourceVersions</code> is specified at the build level,
     * then they take precedence over these <code>secondarySourceVersions</code>
     * (at the project level).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySourceVersions <p>
     *            An array of <code>ProjectSourceVersion</code> objects. If
     *            <code>secondarySourceVersions</code> is specified at the build
     *            level, then they take precedence over these
     *            <code>secondarySourceVersions</code> (at the project level).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withSecondarySourceVersions(
            ProjectSourceVersion... secondarySourceVersions) {
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
     * An array of <code>ProjectSourceVersion</code> objects. If
     * <code>secondarySourceVersions</code> is specified at the build level,
     * then they take precedence over these <code>secondarySourceVersions</code>
     * (at the project level).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondarySourceVersions <p>
     *            An array of <code>ProjectSourceVersion</code> objects. If
     *            <code>secondarySourceVersions</code> is specified at the build
     *            level, then they take precedence over these
     *            <code>secondarySourceVersions</code> (at the project level).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withSecondarySourceVersions(
            java.util.Collection<ProjectSourceVersion> secondarySourceVersions) {
        setSecondarySourceVersions(secondarySourceVersions);
        return this;
    }

    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     *
     * @return <p>
     *         Information about the build output artifacts for the build
     *         project.
     *         </p>
     */
    public ProjectArtifacts getArtifacts() {
        return artifacts;
    }

    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     *
     * @param artifacts <p>
     *            Information about the build output artifacts for the build
     *            project.
     *            </p>
     */
    public void setArtifacts(ProjectArtifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * <p>
     * Information about the build output artifacts for the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param artifacts <p>
     *            Information about the build output artifacts for the build
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withArtifacts(ProjectArtifacts artifacts) {
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
    public java.util.List<ProjectArtifacts> getSecondaryArtifacts() {
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
    public void setSecondaryArtifacts(java.util.Collection<ProjectArtifacts> secondaryArtifacts) {
        if (secondaryArtifacts == null) {
            this.secondaryArtifacts = null;
            return;
        }

        this.secondaryArtifacts = new java.util.ArrayList<ProjectArtifacts>(secondaryArtifacts);
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
    public CreateProjectRequest withSecondaryArtifacts(ProjectArtifacts... secondaryArtifacts) {
        if (getSecondaryArtifacts() == null) {
            this.secondaryArtifacts = new java.util.ArrayList<ProjectArtifacts>(
                    secondaryArtifacts.length);
        }
        for (ProjectArtifacts value : secondaryArtifacts) {
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
    public CreateProjectRequest withSecondaryArtifacts(
            java.util.Collection<ProjectArtifacts> secondaryArtifacts) {
        setSecondaryArtifacts(secondaryArtifacts);
        return this;
    }

    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a
     * later time.
     * </p>
     *
     * @return <p>
     *         Stores recently used information so that it can be quickly
     *         accessed at a later time.
     *         </p>
     */
    public ProjectCache getCache() {
        return cache;
    }

    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a
     * later time.
     * </p>
     *
     * @param cache <p>
     *            Stores recently used information so that it can be quickly
     *            accessed at a later time.
     *            </p>
     */
    public void setCache(ProjectCache cache) {
        this.cache = cache;
    }

    /**
     * <p>
     * Stores recently used information so that it can be quickly accessed at a
     * later time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cache <p>
     *            Stores recently used information so that it can be quickly
     *            accessed at a later time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withCache(ProjectCache cache) {
        this.cache = cache;
        return this;
    }

    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     *
     * @return <p>
     *         Information about the build environment for the build project.
     *         </p>
     */
    public ProjectEnvironment getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     *
     * @param environment <p>
     *            Information about the build environment for the build project.
     *            </p>
     */
    public void setEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information about the build environment for the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            Information about the build environment for the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables
     * AWS CodeBuild to interact with dependent AWS services on behalf of the
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the AWS Identity and Access Management (IAM) role that
     *         enables AWS CodeBuild to interact with dependent AWS services on
     *         behalf of the AWS account.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables
     * AWS CodeBuild to interact with dependent AWS services on behalf of the
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param serviceRole <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that enables AWS CodeBuild to interact with dependent AWS
     *            services on behalf of the AWS account.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that enables
     * AWS CodeBuild to interact with dependent AWS services on behalf of the
     * AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param serviceRole <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that enables AWS CodeBuild to interact with dependent AWS
     *            services on behalf of the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait
     * before it times out any build that has not been marked as completed. The
     * default is 60 minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @return <p>
     *         How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild
     *         to wait before it times out any build that has not been marked as
     *         completed. The default is 60 minutes.
     *         </p>
     */
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait
     * before it times out any build that has not been marked as completed. The
     * default is 60 minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @param timeoutInMinutes <p>
     *            How long, in minutes, from 5 to 480 (8 hours), for AWS
     *            CodeBuild to wait before it times out any build that has not
     *            been marked as completed. The default is 60 minutes.
     *            </p>
     */
    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait
     * before it times out any build that has not been marked as completed. The
     * default is 60 minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @param timeoutInMinutes <p>
     *            How long, in minutes, from 5 to 480 (8 hours), for AWS
     *            CodeBuild to wait before it times out any build that has not
     *            been marked as completed. The default is 60 minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
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
    public Integer getQueuedTimeoutInMinutes() {
        return queuedTimeoutInMinutes;
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 480<br/>
     *
     * @param queuedTimeoutInMinutes <p>
     *            The number of minutes a build is allowed to be queued before
     *            it times out.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
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
    public CreateProjectRequest withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild build project tags.
     * </p>
     *
     * @return <p>
     *         A list of tag key and value pairs associated with this build
     *         project.
     *         </p>
     *         <p>
     *         These tags are available for use by AWS services that support AWS
     *         CodeBuild build project tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild build project tags.
     * </p>
     *
     * @param tags <p>
     *            A list of tag key and value pairs associated with this build
     *            project.
     *            </p>
     *            <p>
     *            These tags are available for use by AWS services that support
     *            AWS CodeBuild build project tags.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild build project tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag key and value pairs associated with this build
     *            project.
     *            </p>
     *            <p>
     *            These tags are available for use by AWS services that support
     *            AWS CodeBuild build project tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this build project.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild build project tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag key and value pairs associated with this build
     *            project.
     *            </p>
     *            <p>
     *            These tags are available for use by AWS services that support
     *            AWS CodeBuild build project tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     *
     * @return <p>
     *         VpcConfig enables AWS CodeBuild to access resources in an Amazon
     *         VPC.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     *
     * @param vpcConfig <p>
     *            VpcConfig enables AWS CodeBuild to access resources in an
     *            Amazon VPC.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            VpcConfig enables AWS CodeBuild to access resources in an
     *            Amazon VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     *
     * @return <p>
     *         Set this to true to generate a publicly accessible URL for your
     *         project's build badge.
     *         </p>
     */
    public Boolean isBadgeEnabled() {
        return badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     *
     * @return <p>
     *         Set this to true to generate a publicly accessible URL for your
     *         project's build badge.
     *         </p>
     */
    public Boolean getBadgeEnabled() {
        return badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     *
     * @param badgeEnabled <p>
     *            Set this to true to generate a publicly accessible URL for
     *            your project's build badge.
     *            </p>
     */
    public void setBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param badgeEnabled <p>
     *            Set this to true to generate a publicly accessible URL for
     *            your project's build badge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
        return this;
    }

    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon
     * CloudWatch Logs, logs uploaded to a specified S3 bucket, or both.
     * </p>
     *
     * @return <p>
     *         Information about logs for the build project. These can be logs
     *         in Amazon CloudWatch Logs, logs uploaded to a specified S3
     *         bucket, or both.
     *         </p>
     */
    public LogsConfig getLogsConfig() {
        return logsConfig;
    }

    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon
     * CloudWatch Logs, logs uploaded to a specified S3 bucket, or both.
     * </p>
     *
     * @param logsConfig <p>
     *            Information about logs for the build project. These can be
     *            logs in Amazon CloudWatch Logs, logs uploaded to a specified
     *            S3 bucket, or both.
     *            </p>
     */
    public void setLogsConfig(LogsConfig logsConfig) {
        this.logsConfig = logsConfig;
    }

    /**
     * <p>
     * Information about logs for the build project. These can be logs in Amazon
     * CloudWatch Logs, logs uploaded to a specified S3 bucket, or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logsConfig <p>
     *            Information about logs for the build project. These can be
     *            logs in Amazon CloudWatch Logs, logs uploaded to a specified
     *            S3 bucket, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectRequest withLogsConfig(LogsConfig logsConfig) {
        this.logsConfig = logsConfig;
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
    public CreateProjectRequest withFileSystemLocations(
            ProjectFileSystemLocation... fileSystemLocations) {
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
    public CreateProjectRequest withFileSystemLocations(
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getSource() != null)
            sb.append("source: " + getSource() + ",");
        if (getSecondarySources() != null)
            sb.append("secondarySources: " + getSecondarySources() + ",");
        if (getSourceVersion() != null)
            sb.append("sourceVersion: " + getSourceVersion() + ",");
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
        if (getTimeoutInMinutes() != null)
            sb.append("timeoutInMinutes: " + getTimeoutInMinutes() + ",");
        if (getQueuedTimeoutInMinutes() != null)
            sb.append("queuedTimeoutInMinutes: " + getQueuedTimeoutInMinutes() + ",");
        if (getEncryptionKey() != null)
            sb.append("encryptionKey: " + getEncryptionKey() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getVpcConfig() != null)
            sb.append("vpcConfig: " + getVpcConfig() + ",");
        if (getBadgeEnabled() != null)
            sb.append("badgeEnabled: " + getBadgeEnabled() + ",");
        if (getLogsConfig() != null)
            sb.append("logsConfig: " + getLogsConfig() + ",");
        if (getFileSystemLocations() != null)
            sb.append("fileSystemLocations: " + getFileSystemLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getSecondarySources() == null) ? 0 : getSecondarySources().hashCode());
        hashCode = prime * hashCode
                + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
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
        hashCode = prime * hashCode
                + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueuedTimeoutInMinutes() == null) ? 0 : getQueuedTimeoutInMinutes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode
                + ((getBadgeEnabled() == null) ? 0 : getBadgeEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogsConfig() == null) ? 0 : getLogsConfig().hashCode());
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

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null
                && other.getSourceVersion().equals(this.getSourceVersion()) == false)
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
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getBadgeEnabled() == null ^ this.getBadgeEnabled() == null)
            return false;
        if (other.getBadgeEnabled() != null
                && other.getBadgeEnabled().equals(this.getBadgeEnabled()) == false)
            return false;
        if (other.getLogsConfig() == null ^ this.getLogsConfig() == null)
            return false;
        if (other.getLogsConfig() != null
                && other.getLogsConfig().equals(this.getLogsConfig()) == false)
            return false;
        if (other.getFileSystemLocations() == null ^ this.getFileSystemLocations() == null)
            return false;
        if (other.getFileSystemLocations() != null
                && other.getFileSystemLocations().equals(this.getFileSystemLocations()) == false)
            return false;
        return true;
    }
}
