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
 * Describes the properties of an environment.
 * </p>
 */
public class UpdateEnvironmentResult implements Serializable {
    /**
     * <p>
     * The name of this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The ID of this environment.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     */
    private String solutionStackName;

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     */
    private String platformArn;

    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * Describes this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     */
    private String endpointURL;

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String cNAME;

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     */
    private java.util.Date dateCreated;

    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     */
    private java.util.Date dateUpdated;

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Ready</code>: Environment is available to have an action performed
     * on it, such as update or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: Environment is not running.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating,
     * Terminated
     */
    private String status;

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     */
    private Boolean abortableOperationInProgress;

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code>: Indicates that something is wrong. Occurs when two
     * consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code>: Indicates the environment is healthy and fully
     * functional.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Grey</code>: Default health for a new environment. The environment
     * is not fully launched and health checks have not started or health checks
     * are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironment</code> request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     */
    private String health;

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoData, Unknown, Pending, Ok, Info, Warning,
     * Degraded, Severe, Suspended
     */
    private String healthStatus;

    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     */
    private EnvironmentResourcesDescription resources;

    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     */
    private EnvironmentTier tier;

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     */
    private java.util.List<EnvironmentLink> environmentLinks;

    /**
     * <p>
     * The environment's Amazon Resource Name (ARN), which can be used in other
     * API requests that require an ARN.
     * </p>
     */
    private String environmentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment's operations role. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String operationsRole;

    /**
     * <p>
     * The name of this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of this environment.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of this environment.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The ID of this environment.
     * </p>
     *
     * @return <p>
     *         The ID of this environment.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * The ID of this environment.
     * </p>
     *
     * @param environmentId <p>
     *            The ID of this environment.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentId <p>
     *            The ID of this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application associated with this environment.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with this environment.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The application version deployed in this environment.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The application version deployed in this environment.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The application version deployed in this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     *
     * @return <p>
     *         The name of the <code>SolutionStack</code> deployed with this
     *         environment.
     *         </p>
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     *
     * @param solutionStackName <p>
     *            The name of the <code>SolutionStack</code> deployed with this
     *            environment.
     *            </p>
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackName <p>
     *            The name of the <code>SolutionStack</code> deployed with this
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     *
     * @return <p>
     *         The ARN of the platform version.
     *         </p>
     */
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     *
     * @param platformArn <p>
     *            The ARN of the platform version.
     *            </p>
     */
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformArn <p>
     *            The ARN of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the configuration template used to originally launch
     *         this environment.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template used to originally
     *            launch this environment.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template used to originally
     *            launch this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         Describes this environment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Describes this environment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Describes this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     *
     * @return <p>
     *         For load-balanced, autoscaling environments, the URL to the
     *         LoadBalancer. For single-instance environments, the IP address of
     *         the instance.
     *         </p>
     */
    public String getEndpointURL() {
        return endpointURL;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     *
     * @param endpointURL <p>
     *            For load-balanced, autoscaling environments, the URL to the
     *            LoadBalancer. For single-instance environments, the IP address
     *            of the instance.
     *            </p>
     */
    public void setEndpointURL(String endpointURL) {
        this.endpointURL = endpointURL;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointURL <p>
     *            For load-balanced, autoscaling environments, the URL to the
     *            LoadBalancer. For single-instance environments, the IP address
     *            of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withEndpointURL(String endpointURL) {
        this.endpointURL = endpointURL;
        return this;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The URL to the CNAME for this environment.
     *         </p>
     */
    public String getCNAME() {
        return cNAME;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param cNAME <p>
     *            The URL to the CNAME for this environment.
     *            </p>
     */
    public void setCNAME(String cNAME) {
        this.cNAME = cNAME;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param cNAME <p>
     *            The URL to the CNAME for this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withCNAME(String cNAME) {
        this.cNAME = cNAME;
        return this;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     *
     * @return <p>
     *         The creation date for this environment.
     *         </p>
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     *
     * @param dateCreated <p>
     *            The creation date for this environment.
     *            </p>
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The creation date for this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     *
     * @return <p>
     *         The last modified date for this environment.
     *         </p>
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     *
     * @param dateUpdated <p>
     *            The last modified date for this environment.
     *            </p>
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateUpdated <p>
     *            The last modified date for this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Ready</code>: Environment is available to have an action performed
     * on it, such as update or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: Environment is not running.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating,
     * Terminated
     *
     * @return <p>
     *         The current operational status of the environment:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Launching</code>: Environment is in the process of initial
     *         deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Updating</code>: Environment is in the process of updating
     *         its configuration settings or application version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Ready</code>: Environment is available to have an action
     *         performed on it, such as update or terminate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Terminating</code>: Environment is in the shut-down
     *         process.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Terminated</code>: Environment is not running.
     *         </p>
     *         </li>
     *         </ul>
     * @see EnvironmentStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Ready</code>: Environment is available to have an action performed
     * on it, such as update or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: Environment is not running.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating,
     * Terminated
     *
     * @param status <p>
     *            The current operational status of the environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Launching</code>: Environment is in the process of
     *            initial deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: Environment is in the process of
     *            updating its configuration settings or application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Ready</code>: Environment is available to have an action
     *            performed on it, such as update or terminate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminating</code>: Environment is in the shut-down
     *            process.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminated</code>: Environment is not running.
     *            </p>
     *            </li>
     *            </ul>
     * @see EnvironmentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Ready</code>: Environment is available to have an action performed
     * on it, such as update or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: Environment is not running.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating,
     * Terminated
     *
     * @param status <p>
     *            The current operational status of the environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Launching</code>: Environment is in the process of
     *            initial deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: Environment is in the process of
     *            updating its configuration settings or application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Ready</code>: Environment is available to have an action
     *            performed on it, such as update or terminate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminating</code>: Environment is in the shut-down
     *            process.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminated</code>: Environment is not running.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentStatus
     */
    public UpdateEnvironmentResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Ready</code>: Environment is available to have an action performed
     * on it, such as update or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: Environment is not running.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating,
     * Terminated
     *
     * @param status <p>
     *            The current operational status of the environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Launching</code>: Environment is in the process of
     *            initial deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: Environment is in the process of
     *            updating its configuration settings or application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Ready</code>: Environment is available to have an action
     *            performed on it, such as update or terminate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminating</code>: Environment is in the shut-down
     *            process.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminated</code>: Environment is not running.
     *            </p>
     *            </li>
     *            </ul>
     * @see EnvironmentStatus
     */
    public void setStatus(EnvironmentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Ready</code>: Environment is available to have an action performed
     * on it, such as update or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: Environment is not running.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating,
     * Terminated
     *
     * @param status <p>
     *            The current operational status of the environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Launching</code>: Environment is in the process of
     *            initial deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: Environment is in the process of
     *            updating its configuration settings or application version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Ready</code>: Environment is available to have an action
     *            performed on it, such as update or terminate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminating</code>: Environment is in the shut-down
     *            process.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Terminated</code>: Environment is not running.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentStatus
     */
    public UpdateEnvironmentResult withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     *
     * @return <p>
     *         Indicates if there is an in-progress environment configuration
     *         update or application version deployment that you can cancel.
     *         </p>
     *         <p>
     *         <code>true:</code> There is an update in progress.
     *         </p>
     *         <p>
     *         <code>false:</code> There are no updates currently in progress.
     *         </p>
     */
    public Boolean isAbortableOperationInProgress() {
        return abortableOperationInProgress;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     *
     * @return <p>
     *         Indicates if there is an in-progress environment configuration
     *         update or application version deployment that you can cancel.
     *         </p>
     *         <p>
     *         <code>true:</code> There is an update in progress.
     *         </p>
     *         <p>
     *         <code>false:</code> There are no updates currently in progress.
     *         </p>
     */
    public Boolean getAbortableOperationInProgress() {
        return abortableOperationInProgress;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     *
     * @param abortableOperationInProgress <p>
     *            Indicates if there is an in-progress environment configuration
     *            update or application version deployment that you can cancel.
     *            </p>
     *            <p>
     *            <code>true:</code> There is an update in progress.
     *            </p>
     *            <p>
     *            <code>false:</code> There are no updates currently in
     *            progress.
     *            </p>
     */
    public void setAbortableOperationInProgress(Boolean abortableOperationInProgress) {
        this.abortableOperationInProgress = abortableOperationInProgress;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortableOperationInProgress <p>
     *            Indicates if there is an in-progress environment configuration
     *            update or application version deployment that you can cancel.
     *            </p>
     *            <p>
     *            <code>true:</code> There is an update in progress.
     *            </p>
     *            <p>
     *            <code>false:</code> There are no updates currently in
     *            progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withAbortableOperationInProgress(
            Boolean abortableOperationInProgress) {
        this.abortableOperationInProgress = abortableOperationInProgress;
        return this;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code>: Indicates that something is wrong. Occurs when two
     * consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code>: Indicates the environment is healthy and fully
     * functional.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Grey</code>: Default health for a new environment. The environment
     * is not fully launched and health checks have not started or health checks
     * are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironment</code> request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @return <p>
     *         Describes the health status of the environment. AWS Elastic
     *         Beanstalk indicates the failure levels for a running environment:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Red</code>: Indicates the environment is not responsive.
     *         Occurs when three or more consecutive failures occur for an
     *         environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Yellow</code>: Indicates that something is wrong. Occurs
     *         when two consecutive failures occur for an environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Green</code>: Indicates the environment is healthy and
     *         fully functional.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Grey</code>: Default health for a new environment. The
     *         environment is not fully launched and health checks have not
     *         started or health checks are suspended during an
     *         <code>UpdateEnvironment</code> or <code>RestartEnvironment</code>
     *         request.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>Grey</code>
     *         </p>
     * @see EnvironmentHealth
     */
    public String getHealth() {
        return health;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code>: Indicates that something is wrong. Occurs when two
     * consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code>: Indicates the environment is healthy and fully
     * functional.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Grey</code>: Default health for a new environment. The environment
     * is not fully launched and health checks have not started or health checks
     * are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironment</code> request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param health <p>
     *            Describes the health status of the environment. AWS Elastic
     *            Beanstalk indicates the failure levels for a running
     *            environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Red</code>: Indicates the environment is not responsive.
     *            Occurs when three or more consecutive failures occur for an
     *            environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Yellow</code>: Indicates that something is wrong. Occurs
     *            when two consecutive failures occur for an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Green</code>: Indicates the environment is healthy and
     *            fully functional.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Grey</code>: Default health for a new environment. The
     *            environment is not fully launched and health checks have not
     *            started or health checks are suspended during an
     *            <code>UpdateEnvironment</code> or
     *            <code>RestartEnvironment</code> request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default: <code>Grey</code>
     *            </p>
     * @see EnvironmentHealth
     */
    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code>: Indicates that something is wrong. Occurs when two
     * consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code>: Indicates the environment is healthy and fully
     * functional.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Grey</code>: Default health for a new environment. The environment
     * is not fully launched and health checks have not started or health checks
     * are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironment</code> request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param health <p>
     *            Describes the health status of the environment. AWS Elastic
     *            Beanstalk indicates the failure levels for a running
     *            environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Red</code>: Indicates the environment is not responsive.
     *            Occurs when three or more consecutive failures occur for an
     *            environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Yellow</code>: Indicates that something is wrong. Occurs
     *            when two consecutive failures occur for an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Green</code>: Indicates the environment is healthy and
     *            fully functional.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Grey</code>: Default health for a new environment. The
     *            environment is not fully launched and health checks have not
     *            started or health checks are suspended during an
     *            <code>UpdateEnvironment</code> or
     *            <code>RestartEnvironment</code> request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default: <code>Grey</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentHealth
     */
    public UpdateEnvironmentResult withHealth(String health) {
        this.health = health;
        return this;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code>: Indicates that something is wrong. Occurs when two
     * consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code>: Indicates the environment is healthy and fully
     * functional.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Grey</code>: Default health for a new environment. The environment
     * is not fully launched and health checks have not started or health checks
     * are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironment</code> request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param health <p>
     *            Describes the health status of the environment. AWS Elastic
     *            Beanstalk indicates the failure levels for a running
     *            environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Red</code>: Indicates the environment is not responsive.
     *            Occurs when three or more consecutive failures occur for an
     *            environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Yellow</code>: Indicates that something is wrong. Occurs
     *            when two consecutive failures occur for an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Green</code>: Indicates the environment is healthy and
     *            fully functional.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Grey</code>: Default health for a new environment. The
     *            environment is not fully launched and health checks have not
     *            started or health checks are suspended during an
     *            <code>UpdateEnvironment</code> or
     *            <code>RestartEnvironment</code> request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default: <code>Grey</code>
     *            </p>
     * @see EnvironmentHealth
     */
    public void setHealth(EnvironmentHealth health) {
        this.health = health.toString();
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code>: Indicates that something is wrong. Occurs when two
     * consecutive failures occur for an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code>: Indicates the environment is healthy and fully
     * functional.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Grey</code>: Default health for a new environment. The environment
     * is not fully launched and health checks have not started or health checks
     * are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironment</code> request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param health <p>
     *            Describes the health status of the environment. AWS Elastic
     *            Beanstalk indicates the failure levels for a running
     *            environment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Red</code>: Indicates the environment is not responsive.
     *            Occurs when three or more consecutive failures occur for an
     *            environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Yellow</code>: Indicates that something is wrong. Occurs
     *            when two consecutive failures occur for an environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Green</code>: Indicates the environment is healthy and
     *            fully functional.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Grey</code>: Default health for a new environment. The
     *            environment is not fully launched and health checks have not
     *            started or health checks are suspended during an
     *            <code>UpdateEnvironment</code> or
     *            <code>RestartEnvironment</code> request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default: <code>Grey</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentHealth
     */
    public UpdateEnvironmentResult withHealth(EnvironmentHealth health) {
        this.health = health.toString();
        return this;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoData, Unknown, Pending, Ok, Info, Warning,
     * Degraded, Severe, Suspended
     *
     * @return <p>
     *         Returns the health status of the application running in your
     *         environment. For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         >Health Colors and Statuses</a>.
     *         </p>
     * @see EnvironmentHealthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoData, Unknown, Pending, Ok, Info, Warning,
     * Degraded, Severe, Suspended
     *
     * @param healthStatus <p>
     *            Returns the health status of the application running in your
     *            environment. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     * @see EnvironmentHealthStatus
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoData, Unknown, Pending, Ok, Info, Warning,
     * Degraded, Severe, Suspended
     *
     * @param healthStatus <p>
     *            Returns the health status of the application running in your
     *            environment. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentHealthStatus
     */
    public UpdateEnvironmentResult withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoData, Unknown, Pending, Ok, Info, Warning,
     * Degraded, Severe, Suspended
     *
     * @param healthStatus <p>
     *            Returns the health status of the application running in your
     *            environment. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     * @see EnvironmentHealthStatus
     */
    public void setHealthStatus(EnvironmentHealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoData, Unknown, Pending, Ok, Info, Warning,
     * Degraded, Severe, Suspended
     *
     * @param healthStatus <p>
     *            Returns the health status of the application running in your
     *            environment. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *            >Health Colors and Statuses</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentHealthStatus
     */
    public UpdateEnvironmentResult withHealthStatus(EnvironmentHealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     *
     * @return <p>
     *         The description of the AWS resources used by this environment.
     *         </p>
     */
    public EnvironmentResourcesDescription getResources() {
        return resources;
    }

    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     *
     * @param resources <p>
     *            The description of the AWS resources used by this environment.
     *            </p>
     */
    public void setResources(EnvironmentResourcesDescription resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The description of the AWS resources used by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withResources(EnvironmentResourcesDescription resources) {
        this.resources = resources;
        return this;
    }

    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     *
     * @return <p>
     *         Describes the current tier of this environment.
     *         </p>
     */
    public EnvironmentTier getTier() {
        return tier;
    }

    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     *
     * @param tier <p>
     *            Describes the current tier of this environment.
     *            </p>
     */
    public void setTier(EnvironmentTier tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tier <p>
     *            Describes the current tier of this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withTier(EnvironmentTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     *
     * @return <p>
     *         A list of links to other environments in the same group.
     *         </p>
     */
    public java.util.List<EnvironmentLink> getEnvironmentLinks() {
        return environmentLinks;
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     *
     * @param environmentLinks <p>
     *            A list of links to other environments in the same group.
     *            </p>
     */
    public void setEnvironmentLinks(java.util.Collection<EnvironmentLink> environmentLinks) {
        if (environmentLinks == null) {
            this.environmentLinks = null;
            return;
        }

        this.environmentLinks = new java.util.ArrayList<EnvironmentLink>(environmentLinks);
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentLinks <p>
     *            A list of links to other environments in the same group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withEnvironmentLinks(EnvironmentLink... environmentLinks) {
        if (getEnvironmentLinks() == null) {
            this.environmentLinks = new java.util.ArrayList<EnvironmentLink>(
                    environmentLinks.length);
        }
        for (EnvironmentLink value : environmentLinks) {
            this.environmentLinks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentLinks <p>
     *            A list of links to other environments in the same group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withEnvironmentLinks(
            java.util.Collection<EnvironmentLink> environmentLinks) {
        setEnvironmentLinks(environmentLinks);
        return this;
    }

    /**
     * <p>
     * The environment's Amazon Resource Name (ARN), which can be used in other
     * API requests that require an ARN.
     * </p>
     *
     * @return <p>
     *         The environment's Amazon Resource Name (ARN), which can be used
     *         in other API requests that require an ARN.
     *         </p>
     */
    public String getEnvironmentArn() {
        return environmentArn;
    }

    /**
     * <p>
     * The environment's Amazon Resource Name (ARN), which can be used in other
     * API requests that require an ARN.
     * </p>
     *
     * @param environmentArn <p>
     *            The environment's Amazon Resource Name (ARN), which can be
     *            used in other API requests that require an ARN.
     *            </p>
     */
    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The environment's Amazon Resource Name (ARN), which can be used in other
     * API requests that require an ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentArn <p>
     *            The environment's Amazon Resource Name (ARN), which can be
     *            used in other API requests that require an ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment's operations role. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the environment's operations
     *         role. For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     *         >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     *         Guide</i>.
     *         </p>
     */
    public String getOperationsRole() {
        return operationsRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment's operations role. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operationsRole <p>
     *            The Amazon Resource Name (ARN) of the environment's operations
     *            role. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     *            >Operations roles</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     */
    public void setOperationsRole(String operationsRole) {
        this.operationsRole = operationsRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment's operations role. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operationsRole <p>
     *            The Amazon Resource Name (ARN) of the environment's operations
     *            role. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     *            >Operations roles</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withOperationsRole(String operationsRole) {
        this.operationsRole = operationsRole;
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEndpointURL() != null)
            sb.append("EndpointURL: " + getEndpointURL() + ",");
        if (getCNAME() != null)
            sb.append("CNAME: " + getCNAME() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getAbortableOperationInProgress() != null)
            sb.append("AbortableOperationInProgress: " + getAbortableOperationInProgress() + ",");
        if (getHealth() != null)
            sb.append("Health: " + getHealth() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
        if (getEnvironmentLinks() != null)
            sb.append("EnvironmentLinks: " + getEnvironmentLinks() + ",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: " + getEnvironmentArn() + ",");
        if (getOperationsRole() != null)
            sb.append("OperationsRole: " + getOperationsRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointURL() == null) ? 0 : getEndpointURL().hashCode());
        hashCode = prime * hashCode + ((getCNAME() == null) ? 0 : getCNAME().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAbortableOperationInProgress() == null) ? 0
                        : getAbortableOperationInProgress().hashCode());
        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentLinks() == null) ? 0 : getEnvironmentLinks().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode
                + ((getOperationsRole() == null) ? 0 : getOperationsRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentResult == false)
            return false;
        UpdateEnvironmentResult other = (UpdateEnvironmentResult) obj;

        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
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
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null
                && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null
                && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpointURL() == null ^ this.getEndpointURL() == null)
            return false;
        if (other.getEndpointURL() != null
                && other.getEndpointURL().equals(this.getEndpointURL()) == false)
            return false;
        if (other.getCNAME() == null ^ this.getCNAME() == null)
            return false;
        if (other.getCNAME() != null && other.getCNAME().equals(this.getCNAME()) == false)
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
        if (other.getAbortableOperationInProgress() == null
                ^ this.getAbortableOperationInProgress() == null)
            return false;
        if (other.getAbortableOperationInProgress() != null
                && other.getAbortableOperationInProgress().equals(
                        this.getAbortableOperationInProgress()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getEnvironmentLinks() == null ^ this.getEnvironmentLinks() == null)
            return false;
        if (other.getEnvironmentLinks() != null
                && other.getEnvironmentLinks().equals(this.getEnvironmentLinks()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null
                && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getOperationsRole() == null ^ this.getOperationsRole() == null)
            return false;
        if (other.getOperationsRole() != null
                && other.getOperationsRole().equals(this.getOperationsRole()) == false)
            return false;
        return true;
    }
}
