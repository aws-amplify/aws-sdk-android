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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

public class StopDeploymentResult implements Serializable {
    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String applicationId;

    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String environmentId;

    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String deploymentStrategyId;

    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String configurationProfileId;

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     */
    private Integer deploymentNumber;

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String configurationName;

    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String configurationLocationUri;

    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String configurationVersion;

    /**
     * <p>
     * The description of the deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     */
    private Integer deploymentDurationInMinutes;

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     */
    private String growthType;

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private Float growthFactor;

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     */
    private Integer finalBakeTimeInMinutes;

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BAKING, VALIDATING, DEPLOYING, COMPLETE,
     * ROLLING_BACK, ROLLED_BACK
     */
    private String state;

    /**
     * <p>
     * A list containing all events related to a deployment. The most recent
     * events are displayed first.
     * </p>
     */
    private java.util.List<DeploymentEvent> eventLog;

    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private Float percentageComplete;

    /**
     * <p>
     * The time the deployment started.
     * </p>
     */
    private java.util.Date startedAt;

    /**
     * <p>
     * The time the deployment completed.
     * </p>
     */
    private java.util.Date completedAt;

    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The ID of the application that was deployed.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The ID of the application that was deployed.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The ID of the application that was deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The ID of the environment that was deployed.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param environmentId <p>
     *            The ID of the environment that was deployed.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param environmentId <p>
     *            The ID of the environment that was deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The ID of the deployment strategy that was deployed.
     *         </p>
     */
    public String getDeploymentStrategyId() {
        return deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param deploymentStrategyId <p>
     *            The ID of the deployment strategy that was deployed.
     *            </p>
     */
    public void setDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param deploymentStrategyId <p>
     *            The ID of the deployment strategy that was deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
        return this;
    }

    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The ID of the configuration profile that was deployed.
     *         </p>
     */
    public String getConfigurationProfileId() {
        return configurationProfileId;
    }

    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param configurationProfileId <p>
     *            The ID of the configuration profile that was deployed.
     *            </p>
     */
    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param configurationProfileId <p>
     *            The ID of the configuration profile that was deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
        return this;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     *
     * @return <p>
     *         The sequence number of the deployment.
     *         </p>
     */
    public Integer getDeploymentNumber() {
        return deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     *
     * @param deploymentNumber <p>
     *            The sequence number of the deployment.
     *            </p>
     */
    public void setDeploymentNumber(Integer deploymentNumber) {
        this.deploymentNumber = deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentNumber <p>
     *            The sequence number of the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withDeploymentNumber(Integer deploymentNumber) {
        this.deploymentNumber = deploymentNumber;
        return this;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the configuration.
     *         </p>
     */
    public String getConfigurationName() {
        return configurationName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configurationName <p>
     *            The name of the configuration.
     *            </p>
     */
    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configurationName <p>
     *            The name of the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }

    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Information about the source location of the configuration.
     *         </p>
     */
    public String getConfigurationLocationUri() {
        return configurationLocationUri;
    }

    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param configurationLocationUri <p>
     *            Information about the source location of the configuration.
     *            </p>
     */
    public void setConfigurationLocationUri(String configurationLocationUri) {
        this.configurationLocationUri = configurationLocationUri;
    }

    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param configurationLocationUri <p>
     *            Information about the source location of the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withConfigurationLocationUri(String configurationLocationUri) {
        this.configurationLocationUri = configurationLocationUri;
        return this;
    }

    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The configuration version that was deployed.
     *         </p>
     */
    public String getConfigurationVersion() {
        return configurationVersion;
    }

    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param configurationVersion <p>
     *            The configuration version that was deployed.
     *            </p>
     */
    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param configurationVersion <p>
     *            The configuration version that was deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }

    /**
     * <p>
     * The description of the deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The description of the deployment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the deployment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @return <p>
     *         Total amount of time the deployment lasted.
     *         </p>
     */
    public Integer getDeploymentDurationInMinutes() {
        return deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param deploymentDurationInMinutes <p>
     *            Total amount of time the deployment lasted.
     *            </p>
     */
    public void setDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param deploymentDurationInMinutes <p>
     *            Total amount of time the deployment lasted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @return <p>
     *         The algorithm used to define how percentage grew over time.
     *         </p>
     * @see GrowthType
     */
    public String getGrowthType() {
        return growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public StopDeploymentResult withGrowthType(String growthType) {
        this.growthType = growthType;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grew over time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public StopDeploymentResult withGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The percentage of targets to receive a deployed configuration
     *         during each interval.
     *         </p>
     */
    public Float getGrowthFactor() {
        return growthFactor;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param growthFactor <p>
     *            The percentage of targets to receive a deployed configuration
     *            during each interval.
     *            </p>
     */
    public void setGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each
     * interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param growthFactor <p>
     *            The percentage of targets to receive a deployed configuration
     *            during each interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
        return this;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @return <p>
     *         The amount of time AppConfig monitored for alarms before
     *         considering the deployment to be complete and no longer eligible
     *         for automatic roll back.
     *         </p>
     */
    public Integer getFinalBakeTimeInMinutes() {
        return finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param finalBakeTimeInMinutes <p>
     *            The amount of time AppConfig monitored for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     */
    public void setFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param finalBakeTimeInMinutes <p>
     *            The amount of time AppConfig monitored for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BAKING, VALIDATING, DEPLOYING, COMPLETE,
     * ROLLING_BACK, ROLLED_BACK
     *
     * @return <p>
     *         The state of the deployment.
     *         </p>
     * @see DeploymentState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BAKING, VALIDATING, DEPLOYING, COMPLETE,
     * ROLLING_BACK, ROLLED_BACK
     *
     * @param state <p>
     *            The state of the deployment.
     *            </p>
     * @see DeploymentState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BAKING, VALIDATING, DEPLOYING, COMPLETE,
     * ROLLING_BACK, ROLLED_BACK
     *
     * @param state <p>
     *            The state of the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentState
     */
    public StopDeploymentResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BAKING, VALIDATING, DEPLOYING, COMPLETE,
     * ROLLING_BACK, ROLLED_BACK
     *
     * @param state <p>
     *            The state of the deployment.
     *            </p>
     * @see DeploymentState
     */
    public void setState(DeploymentState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BAKING, VALIDATING, DEPLOYING, COMPLETE,
     * ROLLING_BACK, ROLLED_BACK
     *
     * @param state <p>
     *            The state of the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentState
     */
    public StopDeploymentResult withState(DeploymentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A list containing all events related to a deployment. The most recent
     * events are displayed first.
     * </p>
     *
     * @return <p>
     *         A list containing all events related to a deployment. The most
     *         recent events are displayed first.
     *         </p>
     */
    public java.util.List<DeploymentEvent> getEventLog() {
        return eventLog;
    }

    /**
     * <p>
     * A list containing all events related to a deployment. The most recent
     * events are displayed first.
     * </p>
     *
     * @param eventLog <p>
     *            A list containing all events related to a deployment. The most
     *            recent events are displayed first.
     *            </p>
     */
    public void setEventLog(java.util.Collection<DeploymentEvent> eventLog) {
        if (eventLog == null) {
            this.eventLog = null;
            return;
        }

        this.eventLog = new java.util.ArrayList<DeploymentEvent>(eventLog);
    }

    /**
     * <p>
     * A list containing all events related to a deployment. The most recent
     * events are displayed first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventLog <p>
     *            A list containing all events related to a deployment. The most
     *            recent events are displayed first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withEventLog(DeploymentEvent... eventLog) {
        if (getEventLog() == null) {
            this.eventLog = new java.util.ArrayList<DeploymentEvent>(eventLog.length);
        }
        for (DeploymentEvent value : eventLog) {
            this.eventLog.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing all events related to a deployment. The most recent
     * events are displayed first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventLog <p>
     *            A list containing all events related to a deployment. The most
     *            recent events are displayed first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withEventLog(java.util.Collection<DeploymentEvent> eventLog) {
        setEventLog(eventLog);
        return this;
    }

    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The percentage of targets for which the deployment is available.
     *         </p>
     */
    public Float getPercentageComplete() {
        return percentageComplete;
    }

    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param percentageComplete <p>
     *            The percentage of targets for which the deployment is
     *            available.
     *            </p>
     */
    public void setPercentageComplete(Float percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param percentageComplete <p>
     *            The percentage of targets for which the deployment is
     *            available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withPercentageComplete(Float percentageComplete) {
        this.percentageComplete = percentageComplete;
        return this;
    }

    /**
     * <p>
     * The time the deployment started.
     * </p>
     *
     * @return <p>
     *         The time the deployment started.
     *         </p>
     */
    public java.util.Date getStartedAt() {
        return startedAt;
    }

    /**
     * <p>
     * The time the deployment started.
     * </p>
     *
     * @param startedAt <p>
     *            The time the deployment started.
     *            </p>
     */
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time the deployment started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedAt <p>
     *            The time the deployment started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * <p>
     * The time the deployment completed.
     * </p>
     *
     * @return <p>
     *         The time the deployment completed.
     *         </p>
     */
    public java.util.Date getCompletedAt() {
        return completedAt;
    }

    /**
     * <p>
     * The time the deployment completed.
     * </p>
     *
     * @param completedAt <p>
     *            The time the deployment completed.
     *            </p>
     */
    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time the deployment completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedAt <p>
     *            The time the deployment completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDeploymentResult withCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getDeploymentStrategyId() != null)
            sb.append("DeploymentStrategyId: " + getDeploymentStrategyId() + ",");
        if (getConfigurationProfileId() != null)
            sb.append("ConfigurationProfileId: " + getConfigurationProfileId() + ",");
        if (getDeploymentNumber() != null)
            sb.append("DeploymentNumber: " + getDeploymentNumber() + ",");
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: " + getConfigurationName() + ",");
        if (getConfigurationLocationUri() != null)
            sb.append("ConfigurationLocationUri: " + getConfigurationLocationUri() + ",");
        if (getConfigurationVersion() != null)
            sb.append("ConfigurationVersion: " + getConfigurationVersion() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDeploymentDurationInMinutes() != null)
            sb.append("DeploymentDurationInMinutes: " + getDeploymentDurationInMinutes() + ",");
        if (getGrowthType() != null)
            sb.append("GrowthType: " + getGrowthType() + ",");
        if (getGrowthFactor() != null)
            sb.append("GrowthFactor: " + getGrowthFactor() + ",");
        if (getFinalBakeTimeInMinutes() != null)
            sb.append("FinalBakeTimeInMinutes: " + getFinalBakeTimeInMinutes() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getEventLog() != null)
            sb.append("EventLog: " + getEventLog() + ",");
        if (getPercentageComplete() != null)
            sb.append("PercentageComplete: " + getPercentageComplete() + ",");
        if (getStartedAt() != null)
            sb.append("StartedAt: " + getStartedAt() + ",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: " + getCompletedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentStrategyId() == null) ? 0 : getDeploymentStrategyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentNumber() == null) ? 0 : getDeploymentNumber().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationLocationUri() == null) ? 0 : getConfigurationLocationUri()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationVersion() == null) ? 0 : getConfigurationVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentDurationInMinutes() == null) ? 0
                        : getDeploymentDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getGrowthType() == null) ? 0 : getGrowthType().hashCode());
        hashCode = prime * hashCode
                + ((getGrowthFactor() == null) ? 0 : getGrowthFactor().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalBakeTimeInMinutes() == null) ? 0 : getFinalBakeTimeInMinutes()
                        .hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEventLog() == null) ? 0 : getEventLog().hashCode());
        hashCode = prime * hashCode
                + ((getPercentageComplete() == null) ? 0 : getPercentageComplete().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDeploymentResult == false)
            return false;
        StopDeploymentResult other = (StopDeploymentResult) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDeploymentStrategyId() == null ^ this.getDeploymentStrategyId() == null)
            return false;
        if (other.getDeploymentStrategyId() != null
                && other.getDeploymentStrategyId().equals(this.getDeploymentStrategyId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null
                && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        if (other.getDeploymentNumber() == null ^ this.getDeploymentNumber() == null)
            return false;
        if (other.getDeploymentNumber() != null
                && other.getDeploymentNumber().equals(this.getDeploymentNumber()) == false)
            return false;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null
                && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        if (other.getConfigurationLocationUri() == null
                ^ this.getConfigurationLocationUri() == null)
            return false;
        if (other.getConfigurationLocationUri() != null
                && other.getConfigurationLocationUri().equals(this.getConfigurationLocationUri()) == false)
            return false;
        if (other.getConfigurationVersion() == null ^ this.getConfigurationVersion() == null)
            return false;
        if (other.getConfigurationVersion() != null
                && other.getConfigurationVersion().equals(this.getConfigurationVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeploymentDurationInMinutes() == null
                ^ this.getDeploymentDurationInMinutes() == null)
            return false;
        if (other.getDeploymentDurationInMinutes() != null
                && other.getDeploymentDurationInMinutes().equals(
                        this.getDeploymentDurationInMinutes()) == false)
            return false;
        if (other.getGrowthType() == null ^ this.getGrowthType() == null)
            return false;
        if (other.getGrowthType() != null
                && other.getGrowthType().equals(this.getGrowthType()) == false)
            return false;
        if (other.getGrowthFactor() == null ^ this.getGrowthFactor() == null)
            return false;
        if (other.getGrowthFactor() != null
                && other.getGrowthFactor().equals(this.getGrowthFactor()) == false)
            return false;
        if (other.getFinalBakeTimeInMinutes() == null ^ this.getFinalBakeTimeInMinutes() == null)
            return false;
        if (other.getFinalBakeTimeInMinutes() != null
                && other.getFinalBakeTimeInMinutes().equals(this.getFinalBakeTimeInMinutes()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEventLog() == null ^ this.getEventLog() == null)
            return false;
        if (other.getEventLog() != null && other.getEventLog().equals(this.getEventLog()) == false)
            return false;
        if (other.getPercentageComplete() == null ^ this.getPercentageComplete() == null)
            return false;
        if (other.getPercentageComplete() != null
                && other.getPercentageComplete().equals(this.getPercentageComplete()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null
                && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null
                && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        return true;
    }
}
