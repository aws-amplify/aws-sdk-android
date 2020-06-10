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

/**
 * <p>
 * Information about the deployment.
 * </p>
 */
public class DeploymentSummary implements Serializable {
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
     * The version of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String configurationVersion;

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
     * The algorithm used to define how percentage grows over time.
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
     * The amount of time AppConfig monitors for alarms before considering the
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
     * The percentage of targets for which the deployment is available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private Float percentageComplete;

    /**
     * <p>
     * Time the deployment started.
     * </p>
     */
    private java.util.Date startedAt;

    /**
     * <p>
     * Time the deployment completed.
     * </p>
     */
    private java.util.Date completedAt;

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
    public DeploymentSummary withDeploymentNumber(Integer deploymentNumber) {
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
    public DeploymentSummary withConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }

    /**
     * <p>
     * The version of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The version of the configuration.
     *         </p>
     */
    public String getConfigurationVersion() {
        return configurationVersion;
    }

    /**
     * <p>
     * The version of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param configurationVersion <p>
     *            The version of the configuration.
     *            </p>
     */
    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    /**
     * <p>
     * The version of the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param configurationVersion <p>
     *            The version of the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentSummary withConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
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
    public DeploymentSummary withDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @return <p>
     *         The algorithm used to define how percentage grows over time.
     *         </p>
     * @see GrowthType
     */
    public String getGrowthType() {
        return growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public DeploymentSummary withGrowthType(String growthType) {
        this.growthType = growthType;
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            </p>
     * @see GrowthType
     */
    public void setGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINEAR, EXPONENTIAL
     *
     * @param growthType <p>
     *            The algorithm used to define how percentage grows over time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GrowthType
     */
    public DeploymentSummary withGrowthType(GrowthType growthType) {
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
    public DeploymentSummary withGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
        return this;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @return <p>
     *         The amount of time AppConfig monitors for alarms before
     *         considering the deployment to be complete and no longer eligible
     *         for automatic roll back.
     *         </p>
     */
    public Integer getFinalBakeTimeInMinutes() {
        return finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the
     * deployment to be complete and no longer eligible for automatic roll back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1440<br/>
     *
     * @param finalBakeTimeInMinutes <p>
     *            The amount of time AppConfig monitors for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     */
    public void setFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the
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
     *            The amount of time AppConfig monitors for alarms before
     *            considering the deployment to be complete and no longer
     *            eligible for automatic roll back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentSummary withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
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
    public DeploymentSummary withState(String state) {
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
    public DeploymentSummary withState(DeploymentState state) {
        this.state = state.toString();
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
    public DeploymentSummary withPercentageComplete(Float percentageComplete) {
        this.percentageComplete = percentageComplete;
        return this;
    }

    /**
     * <p>
     * Time the deployment started.
     * </p>
     *
     * @return <p>
     *         Time the deployment started.
     *         </p>
     */
    public java.util.Date getStartedAt() {
        return startedAt;
    }

    /**
     * <p>
     * Time the deployment started.
     * </p>
     *
     * @param startedAt <p>
     *            Time the deployment started.
     *            </p>
     */
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * Time the deployment started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedAt <p>
     *            Time the deployment started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentSummary withStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * <p>
     * Time the deployment completed.
     * </p>
     *
     * @return <p>
     *         Time the deployment completed.
     *         </p>
     */
    public java.util.Date getCompletedAt() {
        return completedAt;
    }

    /**
     * <p>
     * Time the deployment completed.
     * </p>
     *
     * @param completedAt <p>
     *            Time the deployment completed.
     *            </p>
     */
    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * Time the deployment completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedAt <p>
     *            Time the deployment completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentSummary withCompletedAt(java.util.Date completedAt) {
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
        if (getDeploymentNumber() != null)
            sb.append("DeploymentNumber: " + getDeploymentNumber() + ",");
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: " + getConfigurationName() + ",");
        if (getConfigurationVersion() != null)
            sb.append("ConfigurationVersion: " + getConfigurationVersion() + ",");
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
                + ((getDeploymentNumber() == null) ? 0 : getDeploymentNumber().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationVersion() == null) ? 0 : getConfigurationVersion().hashCode());
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

        if (obj instanceof DeploymentSummary == false)
            return false;
        DeploymentSummary other = (DeploymentSummary) obj;

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
        if (other.getConfigurationVersion() == null ^ this.getConfigurationVersion() == null)
            return false;
        if (other.getConfigurationVersion() != null
                && other.getConfigurationVersion().equals(this.getConfigurationVersion()) == false)
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
