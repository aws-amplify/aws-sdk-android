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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an application version for the specified application. You can create
 * an application version from a source bundle in Amazon S3, a commit in AWS
 * CodeCommit, or the output of an AWS CodeBuild build as follows:
 * </p>
 * <p>
 * Specify a commit in an AWS CodeCommit repository with
 * <code>SourceBuildInformation</code>.
 * </p>
 * <p>
 * Specify a build in an AWS CodeBuild with <code>SourceBuildInformation</code>
 * and <code>BuildConfiguration</code>.
 * </p>
 * <p>
 * Specify a source bundle in S3 with <code>SourceBundle</code>
 * </p>
 * <p>
 * Omit both <code>SourceBuildInformation</code> and <code>SourceBundle</code>
 * to use the default sample application.
 * </p>
 * <note>
 * <p>
 * After you create an application version with a specified Amazon S3 bucket and
 * key location, you can't change that Amazon S3 location. If you change the
 * Amazon S3 location, you receive an exception when you attempt to launch an
 * environment from the application version.
 * </p>
 * </note>
 */
public class CreateApplicationVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the application. If no application is found with this name,
     * and <code>AutoCreateApplication</code> is <code>false</code>, returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version
     * already exists with this label for the specified application, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * A description of this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source
     * code for the application version.
     * </p>
     */
    private SourceBuildInformation sourceBuildInformation;

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository
     * (with <code>SourceBuildInformation</code>), but not both. If neither
     * <code>SourceBundle</code> nor <code>SourceBuildInformation</code> are
     * provided, Elastic Beanstalk uses a sample application.
     * </p>
     */
    private S3Location sourceBundle;

    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     */
    private BuildConfiguration buildConfiguration;

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name
     * if it doesn't already exist.
     * </p>
     */
    private Boolean autoCreateApplication;

    /**
     * <p>
     * Pre-processes and validates the environment manifest (
     * <code>env.yaml</code>) and configuration files (<code>*.config</code>
     * files in the <code>.ebextensions</code> folder) in the source bundle.
     * Validating configuration files can identify issues prior to deploying the
     * application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create
     * using AWS CodeBuild or AWS CodeCommit. For application versions built
     * from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration
     * files. It doesn't validate your application's configuration files, like
     * proxy server or Docker configuration.
     * </p>
     * </note>
     */
    private Boolean process;

    /**
     * <p>
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version.
     * Environments that use the application version don't inherit the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the application. If no application is found with this name,
     * and <code>AutoCreateApplication</code> is <code>false</code>, returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application. If no application is found with this
     *         name, and <code>AutoCreateApplication</code> is
     *         <code>false</code>, returns an <code>InvalidParameterValue</code>
     *         error.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application. If no application is found with this name,
     * and <code>AutoCreateApplication</code> is <code>false</code>, returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application. If no application is found with
     *            this name, and <code>AutoCreateApplication</code> is
     *            <code>false</code>, returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application. If no application is found with this name,
     * and <code>AutoCreateApplication</code> is <code>false</code>, returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application. If no application is found with
     *            this name, and <code>AutoCreateApplication</code> is
     *            <code>false</code>, returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version
     * already exists with this label for the specified application, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         A label identifying this version.
     *         </p>
     *         <p>
     *         Constraint: Must be unique per application. If an application
     *         version already exists with this label for the specified
     *         application, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version
     * already exists with this label for the specified application, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            A label identifying this version.
     *            </p>
     *            <p>
     *            Constraint: Must be unique per application. If an application
     *            version already exists with this label for the specified
     *            application, AWS Elastic Beanstalk returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version
     * already exists with this label for the specified application, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            A label identifying this version.
     *            </p>
     *            <p>
     *            Constraint: Must be unique per application. If an application
     *            version already exists with this label for the specified
     *            application, AWS Elastic Beanstalk returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * A description of this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         A description of this application version.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of this application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            A description of this application version.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of this application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            A description of this application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source
     * code for the application version.
     * </p>
     *
     * @return <p>
     *         Specify a commit in an AWS CodeCommit Git repository to use as
     *         the source code for the application version.
     *         </p>
     */
    public SourceBuildInformation getSourceBuildInformation() {
        return sourceBuildInformation;
    }

    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source
     * code for the application version.
     * </p>
     *
     * @param sourceBuildInformation <p>
     *            Specify a commit in an AWS CodeCommit Git repository to use as
     *            the source code for the application version.
     *            </p>
     */
    public void setSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
    }

    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source
     * code for the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceBuildInformation <p>
     *            Specify a commit in an AWS CodeCommit Git repository to use as
     *            the source code for the application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withSourceBuildInformation(
            SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository
     * (with <code>SourceBuildInformation</code>), but not both. If neither
     * <code>SourceBundle</code> nor <code>SourceBuildInformation</code> are
     * provided, Elastic Beanstalk uses a sample application.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket and key that identify the location of the
     *         source bundle for this version.
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon S3 bucket must be in the same region as the
     *         environment.
     *         </p>
     *         </note>
     *         <p>
     *         Specify a source bundle in S3 or a commit in an AWS CodeCommit
     *         repository (with <code>SourceBuildInformation</code>), but not
     *         both. If neither <code>SourceBundle</code> nor
     *         <code>SourceBuildInformation</code> are provided, Elastic
     *         Beanstalk uses a sample application.
     *         </p>
     */
    public S3Location getSourceBundle() {
        return sourceBundle;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository
     * (with <code>SourceBuildInformation</code>), but not both. If neither
     * <code>SourceBundle</code> nor <code>SourceBuildInformation</code> are
     * provided, Elastic Beanstalk uses a sample application.
     * </p>
     *
     * @param sourceBundle <p>
     *            The Amazon S3 bucket and key that identify the location of the
     *            source bundle for this version.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon S3 bucket must be in the same region as the
     *            environment.
     *            </p>
     *            </note>
     *            <p>
     *            Specify a source bundle in S3 or a commit in an AWS CodeCommit
     *            repository (with <code>SourceBuildInformation</code>), but not
     *            both. If neither <code>SourceBundle</code> nor
     *            <code>SourceBuildInformation</code> are provided, Elastic
     *            Beanstalk uses a sample application.
     *            </p>
     */
    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository
     * (with <code>SourceBuildInformation</code>), but not both. If neither
     * <code>SourceBundle</code> nor <code>SourceBuildInformation</code> are
     * provided, Elastic Beanstalk uses a sample application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceBundle <p>
     *            The Amazon S3 bucket and key that identify the location of the
     *            source bundle for this version.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon S3 bucket must be in the same region as the
     *            environment.
     *            </p>
     *            </note>
     *            <p>
     *            Specify a source bundle in S3 or a commit in an AWS CodeCommit
     *            repository (with <code>SourceBuildInformation</code>), but not
     *            both. If neither <code>SourceBundle</code> nor
     *            <code>SourceBuildInformation</code> are provided, Elastic
     *            Beanstalk uses a sample application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
        return this;
    }

    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     *
     * @return <p>
     *         Settings for an AWS CodeBuild build.
     *         </p>
     */
    public BuildConfiguration getBuildConfiguration() {
        return buildConfiguration;
    }

    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     *
     * @param buildConfiguration <p>
     *            Settings for an AWS CodeBuild build.
     *            </p>
     */
    public void setBuildConfiguration(BuildConfiguration buildConfiguration) {
        this.buildConfiguration = buildConfiguration;
    }

    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildConfiguration <p>
     *            Settings for an AWS CodeBuild build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withBuildConfiguration(
            BuildConfiguration buildConfiguration) {
        this.buildConfiguration = buildConfiguration;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name
     * if it doesn't already exist.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to create an application with the
     *         specified name if it doesn't already exist.
     *         </p>
     */
    public Boolean isAutoCreateApplication() {
        return autoCreateApplication;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name
     * if it doesn't already exist.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to create an application with the
     *         specified name if it doesn't already exist.
     *         </p>
     */
    public Boolean getAutoCreateApplication() {
        return autoCreateApplication;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name
     * if it doesn't already exist.
     * </p>
     *
     * @param autoCreateApplication <p>
     *            Set to <code>true</code> to create an application with the
     *            specified name if it doesn't already exist.
     *            </p>
     */
    public void setAutoCreateApplication(Boolean autoCreateApplication) {
        this.autoCreateApplication = autoCreateApplication;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name
     * if it doesn't already exist.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoCreateApplication <p>
     *            Set to <code>true</code> to create an application with the
     *            specified name if it doesn't already exist.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withAutoCreateApplication(Boolean autoCreateApplication) {
        this.autoCreateApplication = autoCreateApplication;
        return this;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (
     * <code>env.yaml</code>) and configuration files (<code>*.config</code>
     * files in the <code>.ebextensions</code> folder) in the source bundle.
     * Validating configuration files can identify issues prior to deploying the
     * application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create
     * using AWS CodeBuild or AWS CodeCommit. For application versions built
     * from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration
     * files. It doesn't validate your application's configuration files, like
     * proxy server or Docker configuration.
     * </p>
     * </note>
     *
     * @return <p>
     *         Pre-processes and validates the environment manifest (
     *         <code>env.yaml</code>) and configuration files (
     *         <code>*.config</code> files in the <code>.ebextensions</code>
     *         folder) in the source bundle. Validating configuration files can
     *         identify issues prior to deploying the application version to an
     *         environment.
     *         </p>
     *         <p>
     *         You must turn processing on for application versions that you
     *         create using AWS CodeBuild or AWS CodeCommit. For application
     *         versions built from a source bundle in Amazon S3, processing is
     *         optional.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Process</code> option validates Elastic Beanstalk
     *         configuration files. It doesn't validate your application's
     *         configuration files, like proxy server or Docker configuration.
     *         </p>
     *         </note>
     */
    public Boolean isProcess() {
        return process;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (
     * <code>env.yaml</code>) and configuration files (<code>*.config</code>
     * files in the <code>.ebextensions</code> folder) in the source bundle.
     * Validating configuration files can identify issues prior to deploying the
     * application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create
     * using AWS CodeBuild or AWS CodeCommit. For application versions built
     * from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration
     * files. It doesn't validate your application's configuration files, like
     * proxy server or Docker configuration.
     * </p>
     * </note>
     *
     * @return <p>
     *         Pre-processes and validates the environment manifest (
     *         <code>env.yaml</code>) and configuration files (
     *         <code>*.config</code> files in the <code>.ebextensions</code>
     *         folder) in the source bundle. Validating configuration files can
     *         identify issues prior to deploying the application version to an
     *         environment.
     *         </p>
     *         <p>
     *         You must turn processing on for application versions that you
     *         create using AWS CodeBuild or AWS CodeCommit. For application
     *         versions built from a source bundle in Amazon S3, processing is
     *         optional.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Process</code> option validates Elastic Beanstalk
     *         configuration files. It doesn't validate your application's
     *         configuration files, like proxy server or Docker configuration.
     *         </p>
     *         </note>
     */
    public Boolean getProcess() {
        return process;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (
     * <code>env.yaml</code>) and configuration files (<code>*.config</code>
     * files in the <code>.ebextensions</code> folder) in the source bundle.
     * Validating configuration files can identify issues prior to deploying the
     * application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create
     * using AWS CodeBuild or AWS CodeCommit. For application versions built
     * from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration
     * files. It doesn't validate your application's configuration files, like
     * proxy server or Docker configuration.
     * </p>
     * </note>
     *
     * @param process <p>
     *            Pre-processes and validates the environment manifest (
     *            <code>env.yaml</code>) and configuration files (
     *            <code>*.config</code> files in the <code>.ebextensions</code>
     *            folder) in the source bundle. Validating configuration files
     *            can identify issues prior to deploying the application version
     *            to an environment.
     *            </p>
     *            <p>
     *            You must turn processing on for application versions that you
     *            create using AWS CodeBuild or AWS CodeCommit. For application
     *            versions built from a source bundle in Amazon S3, processing
     *            is optional.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Process</code> option validates Elastic Beanstalk
     *            configuration files. It doesn't validate your application's
     *            configuration files, like proxy server or Docker
     *            configuration.
     *            </p>
     *            </note>
     */
    public void setProcess(Boolean process) {
        this.process = process;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (
     * <code>env.yaml</code>) and configuration files (<code>*.config</code>
     * files in the <code>.ebextensions</code> folder) in the source bundle.
     * Validating configuration files can identify issues prior to deploying the
     * application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create
     * using AWS CodeBuild or AWS CodeCommit. For application versions built
     * from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration
     * files. It doesn't validate your application's configuration files, like
     * proxy server or Docker configuration.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param process <p>
     *            Pre-processes and validates the environment manifest (
     *            <code>env.yaml</code>) and configuration files (
     *            <code>*.config</code> files in the <code>.ebextensions</code>
     *            folder) in the source bundle. Validating configuration files
     *            can identify issues prior to deploying the application version
     *            to an environment.
     *            </p>
     *            <p>
     *            You must turn processing on for application versions that you
     *            create using AWS CodeBuild or AWS CodeCommit. For application
     *            versions built from a source bundle in Amazon S3, processing
     *            is optional.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Process</code> option validates Elastic Beanstalk
     *            configuration files. It doesn't validate your application's
     *            configuration files, like proxy server or Docker
     *            configuration.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withProcess(Boolean process) {
        this.process = process;
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version.
     * Environments that use the application version don't inherit the tags.
     * </p>
     *
     * @return <p>
     *         Specifies the tags applied to the application version.
     *         </p>
     *         <p>
     *         Elastic Beanstalk applies these tags only to the application
     *         version. Environments that use the application version don't
     *         inherit the tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version.
     * Environments that use the application version don't inherit the tags.
     * </p>
     *
     * @param tags <p>
     *            Specifies the tags applied to the application version.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the application
     *            version. Environments that use the application version don't
     *            inherit the tags.
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
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version.
     * Environments that use the application version don't inherit the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the application version.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the application
     *            version. Environments that use the application version don't
     *            inherit the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withTags(Tag... tags) {
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
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version.
     * Environments that use the application version don't inherit the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the application version.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the application
     *            version. Environments that use the application version don't
     *            inherit the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSourceBuildInformation() != null)
            sb.append("SourceBuildInformation: " + getSourceBuildInformation() + ",");
        if (getSourceBundle() != null)
            sb.append("SourceBundle: " + getSourceBundle() + ",");
        if (getBuildConfiguration() != null)
            sb.append("BuildConfiguration: " + getBuildConfiguration() + ",");
        if (getAutoCreateApplication() != null)
            sb.append("AutoCreateApplication: " + getAutoCreateApplication() + ",");
        if (getProcess() != null)
            sb.append("Process: " + getProcess() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceBuildInformation() == null) ? 0 : getSourceBuildInformation()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSourceBundle() == null) ? 0 : getSourceBundle().hashCode());
        hashCode = prime * hashCode
                + ((getBuildConfiguration() == null) ? 0 : getBuildConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoCreateApplication() == null) ? 0 : getAutoCreateApplication().hashCode());
        hashCode = prime * hashCode + ((getProcess() == null) ? 0 : getProcess().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationVersionRequest == false)
            return false;
        CreateApplicationVersionRequest other = (CreateApplicationVersionRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSourceBuildInformation() == null ^ this.getSourceBuildInformation() == null)
            return false;
        if (other.getSourceBuildInformation() != null
                && other.getSourceBuildInformation().equals(this.getSourceBuildInformation()) == false)
            return false;
        if (other.getSourceBundle() == null ^ this.getSourceBundle() == null)
            return false;
        if (other.getSourceBundle() != null
                && other.getSourceBundle().equals(this.getSourceBundle()) == false)
            return false;
        if (other.getBuildConfiguration() == null ^ this.getBuildConfiguration() == null)
            return false;
        if (other.getBuildConfiguration() != null
                && other.getBuildConfiguration().equals(this.getBuildConfiguration()) == false)
            return false;
        if (other.getAutoCreateApplication() == null ^ this.getAutoCreateApplication() == null)
            return false;
        if (other.getAutoCreateApplication() != null
                && other.getAutoCreateApplication().equals(this.getAutoCreateApplication()) == false)
            return false;
        if (other.getProcess() == null ^ this.getProcess() == null)
            return false;
        if (other.getProcess() != null && other.getProcess().equals(this.getProcess()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
