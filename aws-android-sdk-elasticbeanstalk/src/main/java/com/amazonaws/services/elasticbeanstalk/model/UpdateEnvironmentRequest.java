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
 * Updates the environment description, deploys a new application version,
 * updates the configuration settings to an entirely new configuration template,
 * or updates select configuration option values in the running environment.
 * </p>
 * <p>
 * Attempting to update both the release and configuration is not allowed and
 * AWS Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
 * error.
 * </p>
 * <p>
 * When updating the configuration settings to a new template or individual
 * settings, a draft configuration is created and
 * <a>DescribeConfigurationSettings</a> for this environment returns two setting
 * descriptions with different <code>DeploymentStatus</code> values.
 * </p>
 */
public class UpdateEnvironmentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * The name of the environment to update. If no environment with this name
     * exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name or environment ID parameters.
     * See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     */
    private String groupName;

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type,
     * AWS Elastic Beanstalk returns <code>InvalidParameterValue</code> error.
     * </p>
     */
    private EnvironmentTier tier;

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named
     * application version to the environment. If no such application version is
     * found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * This specifies the platform version that the environment will run after
     * the environment is updated.
     * </p>
     */
    private String solutionStackName;

    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     */
    private String platformArn;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     * </p>
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     * </p>
     */
    private java.util.List<OptionSpecification> optionsToRemove;

    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application with which the environment is
     *         associated.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application with which the environment is
     *            associated.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application with which the environment is
     *            associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     *
     * @return <p>
     *         The ID of the environment to update.
     *         </p>
     *         <p>
     *         If no environment with this ID exists, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentName, or
     *         both. If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     *
     * @param environmentId <p>
     *            The ID of the environment to update.
     *            </p>
     *            <p>
     *            If no environment with this ID exists, AWS Elastic Beanstalk
     *            returns an <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentName,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentId <p>
     *            The ID of the environment to update.
     *            </p>
     *            <p>
     *            If no environment with this ID exists, AWS Elastic Beanstalk
     *            returns an <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentName,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * The name of the environment to update. If no environment with this name
     * exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the environment to update. If no environment with
     *         this name exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentId, or
     *         both. If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the environment to update. If no environment with this name
     * exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to update. If no environment with
     *            this name exists, AWS Elastic Beanstalk returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentId,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to update. If no environment with this name
     * exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If
     * you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to update. If no environment with
     *            this name exists, AWS Elastic Beanstalk returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or an EnvironmentId,
     *            or both. If you do not specify either, AWS Elastic Beanstalk
     *            returns <code>MissingRequiredParameter</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name or environment ID parameters.
     * See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @return <p>
     *         The name of the group to which the target environment belongs.
     *         Specify a group name only if the environment's name is specified
     *         in an environment manifest and not with the environment name or
     *         environment ID parameters. See <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *         >Environment Manifest (env.yaml)</a> for details.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name or environment ID parameters.
     * See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @param groupName <p>
     *            The name of the group to which the target environment belongs.
     *            Specify a group name only if the environment's name is
     *            specified in an environment manifest and not with the
     *            environment name or environment ID parameters. See <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *            >Environment Manifest (env.yaml)</a> for details.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name or environment ID parameters.
     * See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @param groupName <p>
     *            The name of the group to which the target environment belongs.
     *            Specify a group name only if the environment's name is
     *            specified in an environment manifest and not with the
     *            environment name or environment ID parameters. See <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *            >Environment Manifest (env.yaml)</a> for details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         If this parameter is specified, AWS Elastic Beanstalk updates the
     *         description of this environment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            If this parameter is specified, AWS Elastic Beanstalk updates
     *            the description of this environment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the
     * description of this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            If this parameter is specified, AWS Elastic Beanstalk updates
     *            the description of this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type,
     * AWS Elastic Beanstalk returns <code>InvalidParameterValue</code> error.
     * </p>
     *
     * @return <p>
     *         This specifies the tier to use to update the environment.
     *         </p>
     *         <p>
     *         Condition: At this time, if you change the tier version, name, or
     *         type, AWS Elastic Beanstalk returns
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public EnvironmentTier getTier() {
        return tier;
    }

    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type,
     * AWS Elastic Beanstalk returns <code>InvalidParameterValue</code> error.
     * </p>
     *
     * @param tier <p>
     *            This specifies the tier to use to update the environment.
     *            </p>
     *            <p>
     *            Condition: At this time, if you change the tier version, name,
     *            or type, AWS Elastic Beanstalk returns
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setTier(EnvironmentTier tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type,
     * AWS Elastic Beanstalk returns <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tier <p>
     *            This specifies the tier to use to update the environment.
     *            </p>
     *            <p>
     *            Condition: At this time, if you change the tier version, name,
     *            or type, AWS Elastic Beanstalk returns
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withTier(EnvironmentTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named
     * application version to the environment. If no such application version is
     * found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If this parameter is specified, AWS Elastic Beanstalk deploys the
     *         named application version to the environment. If no such
     *         application version is found, returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named
     * application version to the environment. If no such application version is
     * found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            If this parameter is specified, AWS Elastic Beanstalk deploys
     *            the named application version to the environment. If no such
     *            application version is found, returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named
     * application version to the environment. If no such application version is
     * found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            If this parameter is specified, AWS Elastic Beanstalk deploys
     *            the named application version to the environment. If no such
     *            application version is found, returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If this parameter is specified, AWS Elastic Beanstalk deploys
     *         this configuration template to the environment. If no such
     *         configuration template is found, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            If this parameter is specified, AWS Elastic Beanstalk deploys
     *            this configuration template to the environment. If no such
     *            configuration template is found, AWS Elastic Beanstalk returns
     *            an <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this
     * configuration template to the environment. If no such configuration
     * template is found, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            If this parameter is specified, AWS Elastic Beanstalk deploys
     *            this configuration template to the environment. If no such
     *            configuration template is found, AWS Elastic Beanstalk returns
     *            an <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * This specifies the platform version that the environment will run after
     * the environment is updated.
     * </p>
     *
     * @return <p>
     *         This specifies the platform version that the environment will run
     *         after the environment is updated.
     *         </p>
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * <p>
     * This specifies the platform version that the environment will run after
     * the environment is updated.
     * </p>
     *
     * @param solutionStackName <p>
     *            This specifies the platform version that the environment will
     *            run after the environment is updated.
     *            </p>
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * This specifies the platform version that the environment will run after
     * the environment is updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackName <p>
     *            This specifies the platform version that the environment will
     *            run after the environment is updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     *
     * @return <p>
     *         The ARN of the platform, if used.
     *         </p>
     */
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     *
     * @param platformArn <p>
     *            The ARN of the platform, if used.
     *            </p>
     */
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformArn <p>
     *            The ARN of the platform, if used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk updates the configuration set
     *         associated with the running environment and sets the specified
     *         configuration options to the requested value.
     *         </p>
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     * </p>
     *
     * @param optionSettings <p>
     *            If specified, AWS Elastic Beanstalk updates the configuration
     *            set associated with the running environment and sets the
     *            specified configuration options to the requested value.
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
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            If specified, AWS Elastic Beanstalk updates the configuration
     *            set associated with the running environment and sets the
     *            specified configuration options to the requested value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
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
     * If specified, AWS Elastic Beanstalk updates the configuration set
     * associated with the running environment and sets the specified
     * configuration options to the requested value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            If specified, AWS Elastic Beanstalk updates the configuration
     *            set associated with the running environment and sets the
     *            specified configuration options to the requested value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withOptionSettings(
            java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     * </p>
     *
     * @return <p>
     *         A list of custom user-defined configuration options to remove
     *         from the configuration set for this environment.
     *         </p>
     */
    public java.util.List<OptionSpecification> getOptionsToRemove() {
        return optionsToRemove;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     * </p>
     *
     * @param optionsToRemove <p>
     *            A list of custom user-defined configuration options to remove
     *            from the configuration set for this environment.
     *            </p>
     */
    public void setOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }

        this.optionsToRemove = new java.util.ArrayList<OptionSpecification>(optionsToRemove);
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            A list of custom user-defined configuration options to remove
     *            from the configuration set for this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
        if (getOptionsToRemove() == null) {
            this.optionsToRemove = new java.util.ArrayList<OptionSpecification>(
                    optionsToRemove.length);
        }
        for (OptionSpecification value : optionsToRemove) {
            this.optionsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            A list of custom user-defined configuration options to remove
     *            from the configuration set for this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentRequest withOptionsToRemove(
            java.util.Collection<OptionSpecification> optionsToRemove) {
        setOptionsToRemove(optionsToRemove);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getOptionsToRemove() != null)
            sb.append("OptionsToRemove: " + getOptionsToRemove());
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
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode
                + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
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
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null
                && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null)
            return false;
        if (other.getOptionsToRemove() != null
                && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false)
            return false;
        return true;
    }
}
