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

/**
 * <p>
 * Describes the properties of an application version.
 * </p>
 */
public class ApplicationVersionDescription implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     */
    private String applicationVersionArn;

    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The description of the application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the
     * location of the source code for the application version.
     * </p>
     */
    private SourceBuildInformation sourceBuildInformation;

    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     */
    private String buildArn;

    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon
     * S3.
     * </p>
     */
    private S3Location sourceBundle;

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     */
    private java.util.Date dateCreated;

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     */
    private java.util.Date dateUpdated;

    /**
     * <p>
     * The processing status of the application version. Reflects the state of
     * the application version during its creation. Many of the values are only
     * applicable if you specified <code>True</code> for the
     * <code>Process</code> parameter of the
     * <code>CreateApplicationVersion</code> action. The following list
     * describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or
     * validated. Elastic Beanstalk will validate configuration files during
     * deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the
     * application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an
     * AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed
     * and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or
     * configuration files didn't pass validation. This application version
     * isn't usable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processed, Unprocessed, Failed, Processing,
     * Building
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the application version.
     *         </p>
     */
    public String getApplicationVersionArn() {
        return applicationVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     *
     * @param applicationVersionArn <p>
     *            The Amazon Resource Name (ARN) of the application version.
     *            </p>
     */
    public void setApplicationVersionArn(String applicationVersionArn) {
        this.applicationVersionArn = applicationVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationVersionArn <p>
     *            The Amazon Resource Name (ARN) of the application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withApplicationVersionArn(String applicationVersionArn) {
        this.applicationVersionArn = applicationVersionArn;
        return this;
    }

    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application to which the application version
     *         belongs.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to which the application version
     *            belongs.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to which the application version
     *            belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The description of the application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         The description of the application version.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            The description of the application version.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            The description of the application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         A unique identifier for the application version.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            A unique identifier for the application version.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            A unique identifier for the application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the
     * location of the source code for the application version.
     * </p>
     *
     * @return <p>
     *         If the version's source code was retrieved from AWS CodeCommit,
     *         the location of the source code for the application version.
     *         </p>
     */
    public SourceBuildInformation getSourceBuildInformation() {
        return sourceBuildInformation;
    }

    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the
     * location of the source code for the application version.
     * </p>
     *
     * @param sourceBuildInformation <p>
     *            If the version's source code was retrieved from AWS
     *            CodeCommit, the location of the source code for the
     *            application version.
     *            </p>
     */
    public void setSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
    }

    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the
     * location of the source code for the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceBuildInformation <p>
     *            If the version's source code was retrieved from AWS
     *            CodeCommit, the location of the source code for the
     *            application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withSourceBuildInformation(
            SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
        return this;
    }

    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     *
     * @return <p>
     *         Reference to the artifact from the AWS CodeBuild build.
     *         </p>
     */
    public String getBuildArn() {
        return buildArn;
    }

    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     *
     * @param buildArn <p>
     *            Reference to the artifact from the AWS CodeBuild build.
     *            </p>
     */
    public void setBuildArn(String buildArn) {
        this.buildArn = buildArn;
    }

    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildArn <p>
     *            Reference to the artifact from the AWS CodeBuild build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withBuildArn(String buildArn) {
        this.buildArn = buildArn;
        return this;
    }

    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon
     * S3.
     * </p>
     *
     * @return <p>
     *         The storage location of the application version's source bundle
     *         in Amazon S3.
     *         </p>
     */
    public S3Location getSourceBundle() {
        return sourceBundle;
    }

    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon
     * S3.
     * </p>
     *
     * @param sourceBundle <p>
     *            The storage location of the application version's source
     *            bundle in Amazon S3.
     *            </p>
     */
    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }

    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon
     * S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceBundle <p>
     *            The storage location of the application version's source
     *            bundle in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
        return this;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     *
     * @return <p>
     *         The creation date of the application version.
     *         </p>
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     *
     * @param dateCreated <p>
     *            The creation date of the application version.
     *            </p>
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The creation date of the application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     *
     * @return <p>
     *         The last modified date of the application version.
     *         </p>
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     *
     * @param dateUpdated <p>
     *            The last modified date of the application version.
     *            </p>
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateUpdated <p>
     *            The last modified date of the application version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionDescription withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of
     * the application version during its creation. Many of the values are only
     * applicable if you specified <code>True</code> for the
     * <code>Process</code> parameter of the
     * <code>CreateApplicationVersion</code> action. The following list
     * describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or
     * validated. Elastic Beanstalk will validate configuration files during
     * deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the
     * application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an
     * AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed
     * and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or
     * configuration files didn't pass validation. This application version
     * isn't usable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processed, Unprocessed, Failed, Processing,
     * Building
     *
     * @return <p>
     *         The processing status of the application version. Reflects the
     *         state of the application version during its creation. Many of the
     *         values are only applicable if you specified <code>True</code> for
     *         the <code>Process</code> parameter of the
     *         <code>CreateApplicationVersion</code> action. The following list
     *         describes the possible values.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unprocessed</code> – Application version wasn't
     *         pre-processed or validated. Elastic Beanstalk will validate
     *         configuration files during deployment of the application version
     *         to an environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Processing</code> – Elastic Beanstalk is currently
     *         processing the application version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Building</code> – Application version is currently
     *         undergoing an AWS CodeBuild build.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Processed</code> – Elastic Beanstalk was successfully
     *         pre-processed and validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> – Either the AWS CodeBuild build failed or
     *         configuration files didn't pass validation. This application
     *         version isn't usable.
     *         </p>
     *         </li>
     *         </ul>
     * @see ApplicationVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of
     * the application version during its creation. Many of the values are only
     * applicable if you specified <code>True</code> for the
     * <code>Process</code> parameter of the
     * <code>CreateApplicationVersion</code> action. The following list
     * describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or
     * validated. Elastic Beanstalk will validate configuration files during
     * deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the
     * application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an
     * AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed
     * and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or
     * configuration files didn't pass validation. This application version
     * isn't usable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processed, Unprocessed, Failed, Processing,
     * Building
     *
     * @param status <p>
     *            The processing status of the application version. Reflects the
     *            state of the application version during its creation. Many of
     *            the values are only applicable if you specified
     *            <code>True</code> for the <code>Process</code> parameter of
     *            the <code>CreateApplicationVersion</code> action. The
     *            following list describes the possible values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unprocessed</code> – Application version wasn't
     *            pre-processed or validated. Elastic Beanstalk will validate
     *            configuration files during deployment of the application
     *            version to an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processing</code> – Elastic Beanstalk is currently
     *            processing the application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Building</code> – Application version is currently
     *            undergoing an AWS CodeBuild build.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processed</code> – Elastic Beanstalk was successfully
     *            pre-processed and validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Either the AWS CodeBuild build failed or
     *            configuration files didn't pass validation. This application
     *            version isn't usable.
     *            </p>
     *            </li>
     *            </ul>
     * @see ApplicationVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of
     * the application version during its creation. Many of the values are only
     * applicable if you specified <code>True</code> for the
     * <code>Process</code> parameter of the
     * <code>CreateApplicationVersion</code> action. The following list
     * describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or
     * validated. Elastic Beanstalk will validate configuration files during
     * deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the
     * application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an
     * AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed
     * and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or
     * configuration files didn't pass validation. This application version
     * isn't usable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processed, Unprocessed, Failed, Processing,
     * Building
     *
     * @param status <p>
     *            The processing status of the application version. Reflects the
     *            state of the application version during its creation. Many of
     *            the values are only applicable if you specified
     *            <code>True</code> for the <code>Process</code> parameter of
     *            the <code>CreateApplicationVersion</code> action. The
     *            following list describes the possible values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unprocessed</code> – Application version wasn't
     *            pre-processed or validated. Elastic Beanstalk will validate
     *            configuration files during deployment of the application
     *            version to an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processing</code> – Elastic Beanstalk is currently
     *            processing the application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Building</code> – Application version is currently
     *            undergoing an AWS CodeBuild build.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processed</code> – Elastic Beanstalk was successfully
     *            pre-processed and validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Either the AWS CodeBuild build failed or
     *            configuration files didn't pass validation. This application
     *            version isn't usable.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationVersionStatus
     */
    public ApplicationVersionDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of
     * the application version during its creation. Many of the values are only
     * applicable if you specified <code>True</code> for the
     * <code>Process</code> parameter of the
     * <code>CreateApplicationVersion</code> action. The following list
     * describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or
     * validated. Elastic Beanstalk will validate configuration files during
     * deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the
     * application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an
     * AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed
     * and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or
     * configuration files didn't pass validation. This application version
     * isn't usable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processed, Unprocessed, Failed, Processing,
     * Building
     *
     * @param status <p>
     *            The processing status of the application version. Reflects the
     *            state of the application version during its creation. Many of
     *            the values are only applicable if you specified
     *            <code>True</code> for the <code>Process</code> parameter of
     *            the <code>CreateApplicationVersion</code> action. The
     *            following list describes the possible values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unprocessed</code> – Application version wasn't
     *            pre-processed or validated. Elastic Beanstalk will validate
     *            configuration files during deployment of the application
     *            version to an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processing</code> – Elastic Beanstalk is currently
     *            processing the application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Building</code> – Application version is currently
     *            undergoing an AWS CodeBuild build.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processed</code> – Elastic Beanstalk was successfully
     *            pre-processed and validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Either the AWS CodeBuild build failed or
     *            configuration files didn't pass validation. This application
     *            version isn't usable.
     *            </p>
     *            </li>
     *            </ul>
     * @see ApplicationVersionStatus
     */
    public void setStatus(ApplicationVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of
     * the application version during its creation. Many of the values are only
     * applicable if you specified <code>True</code> for the
     * <code>Process</code> parameter of the
     * <code>CreateApplicationVersion</code> action. The following list
     * describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or
     * validated. Elastic Beanstalk will validate configuration files during
     * deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the
     * application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an
     * AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed
     * and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or
     * configuration files didn't pass validation. This application version
     * isn't usable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processed, Unprocessed, Failed, Processing,
     * Building
     *
     * @param status <p>
     *            The processing status of the application version. Reflects the
     *            state of the application version during its creation. Many of
     *            the values are only applicable if you specified
     *            <code>True</code> for the <code>Process</code> parameter of
     *            the <code>CreateApplicationVersion</code> action. The
     *            following list describes the possible values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unprocessed</code> – Application version wasn't
     *            pre-processed or validated. Elastic Beanstalk will validate
     *            configuration files during deployment of the application
     *            version to an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processing</code> – Elastic Beanstalk is currently
     *            processing the application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Building</code> – Application version is currently
     *            undergoing an AWS CodeBuild build.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Processed</code> – Elastic Beanstalk was successfully
     *            pre-processed and validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Either the AWS CodeBuild build failed or
     *            configuration files didn't pass validation. This application
     *            version isn't usable.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationVersionStatus
     */
    public ApplicationVersionDescription withStatus(ApplicationVersionStatus status) {
        this.status = status.toString();
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
        if (getApplicationVersionArn() != null)
            sb.append("ApplicationVersionArn: " + getApplicationVersionArn() + ",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getSourceBuildInformation() != null)
            sb.append("SourceBuildInformation: " + getSourceBuildInformation() + ",");
        if (getBuildArn() != null)
            sb.append("BuildArn: " + getBuildArn() + ",");
        if (getSourceBundle() != null)
            sb.append("SourceBundle: " + getSourceBundle() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationVersionArn() == null) ? 0 : getApplicationVersionArn().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceBuildInformation() == null) ? 0 : getSourceBuildInformation()
                        .hashCode());
        hashCode = prime * hashCode + ((getBuildArn() == null) ? 0 : getBuildArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceBundle() == null) ? 0 : getSourceBundle().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationVersionDescription == false)
            return false;
        ApplicationVersionDescription other = (ApplicationVersionDescription) obj;

        if (other.getApplicationVersionArn() == null ^ this.getApplicationVersionArn() == null)
            return false;
        if (other.getApplicationVersionArn() != null
                && other.getApplicationVersionArn().equals(this.getApplicationVersionArn()) == false)
            return false;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getSourceBuildInformation() == null ^ this.getSourceBuildInformation() == null)
            return false;
        if (other.getSourceBuildInformation() != null
                && other.getSourceBuildInformation().equals(this.getSourceBuildInformation()) == false)
            return false;
        if (other.getBuildArn() == null ^ this.getBuildArn() == null)
            return false;
        if (other.getBuildArn() != null && other.getBuildArn().equals(this.getBuildArn()) == false)
            return false;
        if (other.getSourceBundle() == null ^ this.getSourceBundle() == null)
            return false;
        if (other.getSourceBundle() != null
                && other.getSourceBundle().equals(this.getSourceBundle()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null
                && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
