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
 * Describes the settings for a configuration set.
 * </p>
 */
public class UpdateConfigurationTemplateResult implements Serializable {
    /**
     * <p>
     * The name of the solution stack this configuration set uses.
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
     * The name of the application associated with this configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this
     * configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * Describes this configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment status
     * of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed
     * to the associated environment but is in the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently
     * deployed to the associated running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to
     * successfully deploy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     */
    private String deploymentStatus;

    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     */
    private java.util.Date dateCreated;

    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     */
    private java.util.Date dateUpdated;

    /**
     * <p>
     * A list of the configuration options and their values in this
     * configuration set.
     * </p>
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * The name of the solution stack this configuration set uses.
     * </p>
     *
     * @return <p>
     *         The name of the solution stack this configuration set uses.
     *         </p>
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack this configuration set uses.
     * </p>
     *
     * @param solutionStackName <p>
     *            The name of the solution stack this configuration set uses.
     *            </p>
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack this configuration set uses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackName <p>
     *            The name of the solution stack this configuration set uses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withSolutionStackName(String solutionStackName) {
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
    public UpdateConfigurationTemplateResult withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * <p>
     * The name of the application associated with this configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application associated with this configuration
     *         set.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with this configuration
     *            set.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with this configuration
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this
     * configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If not <code>null</code>, the name of the configuration template
     *         for this configuration set.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this
     * configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            If not <code>null</code>, the name of the configuration
     *            template for this configuration set.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this
     * configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            If not <code>null</code>, the name of the configuration
     *            template for this configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * Describes this configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         Describes this configuration set.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Describes this configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Describes this configuration set.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Describes this configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         If not <code>null</code>, the name of the environment for this
     *         configuration set.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            If not <code>null</code>, the name of the environment for this
     *            configuration set.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            If not <code>null</code>, the name of the environment for this
     *            configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment status
     * of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed
     * to the associated environment but is in the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently
     * deployed to the associated running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to
     * successfully deploy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @return <p>
     *         If this configuration set is associated with an environment, the
     *         <code>DeploymentStatus</code> parameter indicates the deployment
     *         status of this configuration set:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>null</code>: This configuration is not associated with a
     *         running environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: This is a draft configuration that is not
     *         deployed to the associated environment but is in the process of
     *         deploying.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deployed</code>: This is the configuration that is
     *         currently deployed to the associated running environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code>: This is a draft configuration that failed to
     *         successfully deploy.
     *         </p>
     *         </li>
     *         </ul>
     * @see ConfigurationDeploymentStatus
     */
    public String getDeploymentStatus() {
        return deploymentStatus;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment status
     * of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed
     * to the associated environment but is in the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently
     * deployed to the associated running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to
     * successfully deploy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus <p>
     *            If this configuration set is associated with an environment,
     *            the <code>DeploymentStatus</code> parameter indicates the
     *            deployment status of this configuration set:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>null</code>: This configuration is not associated with a
     *            running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: This is a draft configuration that is
     *            not deployed to the associated environment but is in the
     *            process of deploying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deployed</code>: This is the configuration that is
     *            currently deployed to the associated running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code>: This is a draft configuration that failed
     *            to successfully deploy.
     *            </p>
     *            </li>
     *            </ul>
     * @see ConfigurationDeploymentStatus
     */
    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment status
     * of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed
     * to the associated environment but is in the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently
     * deployed to the associated running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to
     * successfully deploy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus <p>
     *            If this configuration set is associated with an environment,
     *            the <code>DeploymentStatus</code> parameter indicates the
     *            deployment status of this configuration set:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>null</code>: This configuration is not associated with a
     *            running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: This is a draft configuration that is
     *            not deployed to the associated environment but is in the
     *            process of deploying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deployed</code>: This is the configuration that is
     *            currently deployed to the associated running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code>: This is a draft configuration that failed
     *            to successfully deploy.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfigurationDeploymentStatus
     */
    public UpdateConfigurationTemplateResult withDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment status
     * of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed
     * to the associated environment but is in the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently
     * deployed to the associated running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to
     * successfully deploy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus <p>
     *            If this configuration set is associated with an environment,
     *            the <code>DeploymentStatus</code> parameter indicates the
     *            deployment status of this configuration set:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>null</code>: This configuration is not associated with a
     *            running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: This is a draft configuration that is
     *            not deployed to the associated environment but is in the
     *            process of deploying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deployed</code>: This is the configuration that is
     *            currently deployed to the associated running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code>: This is a draft configuration that failed
     *            to successfully deploy.
     *            </p>
     *            </li>
     *            </ul>
     * @see ConfigurationDeploymentStatus
     */
    public void setDeploymentStatus(ConfigurationDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment status
     * of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed
     * to the associated environment but is in the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently
     * deployed to the associated running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to
     * successfully deploy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus <p>
     *            If this configuration set is associated with an environment,
     *            the <code>DeploymentStatus</code> parameter indicates the
     *            deployment status of this configuration set:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>null</code>: This configuration is not associated with a
     *            running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code>: This is a draft configuration that is
     *            not deployed to the associated environment but is in the
     *            process of deploying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deployed</code>: This is the configuration that is
     *            currently deployed to the associated running environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code>: This is a draft configuration that failed
     *            to successfully deploy.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfigurationDeploymentStatus
     */
    public UpdateConfigurationTemplateResult withDeploymentStatus(
            ConfigurationDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     *
     * @return <p>
     *         The date (in UTC time) when this configuration set was created.
     *         </p>
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date (in UTC time) when this configuration set was
     *            created.
     *            </p>
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date (in UTC time) when this configuration set was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     *
     * @return <p>
     *         The date (in UTC time) when this configuration set was last
     *         modified.
     *         </p>
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     *
     * @param dateUpdated <p>
     *            The date (in UTC time) when this configuration set was last
     *            modified.
     *            </p>
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateUpdated <p>
     *            The date (in UTC time) when this configuration set was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * <p>
     * A list of the configuration options and their values in this
     * configuration set.
     * </p>
     *
     * @return <p>
     *         A list of the configuration options and their values in this
     *         configuration set.
     *         </p>
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * A list of the configuration options and their values in this
     * configuration set.
     * </p>
     *
     * @param optionSettings <p>
     *            A list of the configuration options and their values in this
     *            configuration set.
     *            </p>
     */
    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>(optionSettings);
    }

    /**
     * <p>
     * A list of the configuration options and their values in this
     * configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            A list of the configuration options and their values in this
     *            configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withOptionSettings(
            ConfigurationOptionSetting... optionSettings) {
        if (getOptionSettings() == null) {
            this.optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>(
                    optionSettings.length);
        }
        for (ConfigurationOptionSetting value : optionSettings) {
            this.optionSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the configuration options and their values in this
     * configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            A list of the configuration options and their values in this
     *            configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateResult withOptionSettings(
            java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
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
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn() + ",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: " + getDeploymentStatus() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationTemplateResult == false)
            return false;
        UpdateConfigurationTemplateResult other = (UpdateConfigurationTemplateResult) obj;

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
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
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
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null
                && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
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
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null
                && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        return true;
    }
}
